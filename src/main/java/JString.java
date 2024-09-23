import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class JString {

    @OriginalMember(owner = "zb", name = "a", descriptor = "B")
    private static byte field904 = 7;

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field905 = 433;

    @OriginalMember(owner = "zb", name = "c", descriptor = "I")
    private static int field906 = 8;

    @OriginalMember(owner = "zb", name = "d", descriptor = "I")
    private static int field907 = -938;

    @OriginalMember(owner = "zb", name = "e", descriptor = "Z")
    private static boolean field908 = true;

    @OriginalMember(owner = "zb", name = "f", descriptor = "[C")
    private static final char[] field909 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method310(String arg0) {
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
    public static String method311(int arg0, long arg1) {
        if (arg0 != -8191) {
            throw new NullPointerException();
        } else if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field909[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static long method312(String arg0, byte arg1) {
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        if (arg1 == 0) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < var2.length(); var7++) {
            long var8 = var3 * 61L + (long) var2.charAt(var7) - 32L;
            var3 = var8 + (var8 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method313(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method314(boolean arg0, String arg1) {
        if (arg0) {
            field905 = 119;
        }
        if (arg1.length() <= 0) {
            return arg1;
        }
        char[] var2 = arg1.toCharArray();
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3] == '_') {
                var2[var3] = ' ';
                if (var3 + 1 < var2.length && var2[var3 + 1] >= 'a' && var2[var3 + 1] <= 'z') {
                    var2[var3 + 1] = (char) (var2[var3 + 1] + 'A' - 97);
                }
            }
        }
        if (var2[0] >= 'a' && var2[0] <= 'z') {
            var2[0] = (char) (var2[0] + 'A' - 97);
        }
        return new String(var2);
    }

    @OriginalMember(owner = "zb", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method315(boolean arg0, String arg1) {
        String var2 = arg1.toLowerCase();
        char[] var3 = var2.toCharArray();
        int var4 = var3.length;
        boolean var5 = true;
        if (arg0) {
            throw new NullPointerException();
        }
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method316(String arg0, int arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
