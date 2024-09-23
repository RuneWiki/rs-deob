import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class JString {

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field878 = -474;

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field879 = -668;

    @OriginalMember(owner = "zb", name = "c", descriptor = "I")
    private static int field880 = 1;

    @OriginalMember(owner = "zb", name = "e", descriptor = "[C")
    private static final char[] field882 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "zb", name = "d", descriptor = "Z")
    private static boolean field881;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method299(String arg0) {
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method300(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            int var4 = 46 / arg0;
            char[] var5 = new char[12];
            while (arg1 != 0L) {
                long var6 = arg1;
                arg1 /= 37L;
                var5[11 - var3++] = field882[(int) (var6 - arg1 * 37L)];
            }
            return new String(var5, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static long method301(String arg0, boolean arg1) {
        String var2 = arg0.toUpperCase();
        if (arg1) {
            throw new NullPointerException();
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method302(int arg0, int arg1) {
        if (arg1 != 44106) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method303(String arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg0.length() <= 0) {
            return arg0;
        }
        char[] var3 = arg0.toCharArray();
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method304(String arg0, byte arg1) {
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
        if (arg1 != 4) {
            field881 = !field881;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "zb", name = "b", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method305(String arg0, boolean arg1) {
        if (!arg1) {
            field881 = !field881;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
