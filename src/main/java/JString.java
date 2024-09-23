import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class JString {

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    private static int field864 = -206;

    @OriginalMember(owner = "yb", name = "b", descriptor = "B")
    private static byte field865 = 17;

    @OriginalMember(owner = "yb", name = "c", descriptor = "I")
    private static int field866 = 584;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    private static int field867 = 37801;

    @OriginalMember(owner = "yb", name = "e", descriptor = "I")
    private static int field868 = 968;

    @OriginalMember(owner = "yb", name = "f", descriptor = "Z")
    private static boolean field869 = true;

    @OriginalMember(owner = "yb", name = "g", descriptor = "Z")
    private static boolean field870 = true;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[C")
    private static final char[] field871 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method295(String arg0) {
        long var1 = 0L;
        for (int var3 = 0; var3 < arg0.length() && var3 < 12; var3++) {
            char var4 = arg0.charAt(var3);
            var1 *= 37L;
            if (var4 >= 'A' && var4 <= 'Z') {
                var1 += var4 + 1 - 65;
            } else if (var4 >= 'a' && var4 <= 'z') {
                var1 += var4 + 1 - 97;
            } else if (var4 >= '0' && var4 <= '9') {
                var1 += var4 + 27 - 48;
            }
        }
        while (var1 % 37L == 0L && var1 != 0L) {
            var1 /= 37L;
        }
        return var1;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method296(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            while (arg0 >= 0) {
                field869 = !field869;
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field871[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method297(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return var3;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method298(int arg0, int arg1) {
        int var2 = 88 / arg0;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method299(int arg0, String arg1) {
        int var2 = 81 / arg0;
        if (arg1.length() <= 0) {
            return arg1;
        }
        char[] var3 = arg1.toCharArray();
        for (int var4 = 0; var4 < var3.length; var4++) {
            if (var3[var4] == '_') {
                var3[var4] = ' ';
                if (var4 + 1 < var3.length && var3[var4 + 1] >= 'a' && var3[var4 + 1] <= 'z') {
                    var3[var4 + 1] = (char) (var3[var4 + 1] + 'A' - 97);
                }
            }
        }
        if (var3[0] >= 'a' && var3[0] <= 'z') {
            var3[0] = (char) (var3[0] + 'A' - 97);
        }
        return new String(var3);
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method300(String arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        String var2 = arg0.toLowerCase();
        char[] var3 = var2.toCharArray();
        int var4 = var3.length;
        boolean var5 = true;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = var3[var6];
            if (var5 && var7 >= 'a' && var7 <= 'z') {
                var3[var6] = (char) (var3[var6] - 32);
                var5 = false;
            }
            if (var7 == '.' || var7 == '!') {
                var5 = true;
            }
        }
        return new String(var3);
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method301(String arg0, int arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
