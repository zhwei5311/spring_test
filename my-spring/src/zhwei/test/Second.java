package zhwei.test;

/**
 * @author zhaowei33346
 * @description 整数反转
 * @date 2021/6/26 21:23
 */
public class Second {
    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    nums = new int[]{i, j};
                    break;
                }
            }
        }
        return nums;
    }

    public static int reverse(int x) {
        x = Math.abs(x) < 0 ? 0 : Math.abs(x);
        String xs = Integer.toString(x);
        StringBuffer xsb = new StringBuffer();
        if (xs.contains("-")) {
            xsb.append("-");
            xs = xs.replace("-", "");
        }
        char[] chars = xs.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            xsb.append(chars[i]);
        }
        String s = xsb.toString();
        long num = Long.parseLong(s);
        return (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE ? 0 : (int) num);
    }

    public static int reverse1(int x) {
        StringBuilder s = new StringBuilder(String.valueOf(Math.abs(x) < 0 ? 0 : Math.abs(x)));
        s.reverse();
        if (x < 0) s.insert(0, "-");
        long num = Long.parseLong(s.toString());
        return (num > Integer.MAX_VALUE) ||
                (num < Integer.MIN_VALUE) ? 0 : (int) num;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{3, 0, 3};
//        int target = 6;
//        int[] ints = twoSum(nums, target);
//        for (int i : ints) {
//            System.err.println(i);
//        }
        int i = reverse(-2147483648);
        System.err.println(i);
    }
}
