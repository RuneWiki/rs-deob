import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RTZFXINE")
public class class55 {

    @OriginalMember(owner = "RTZFXINE", name = "a", descriptor = "Z")
    private static boolean field1405 = true;

    @OriginalMember(owner = "RTZFXINE", name = "b", descriptor = "I")
    private static int field1406 = -210;

    @OriginalMember(owner = "RTZFXINE", name = "c", descriptor = "I")
    private static int field1407 = -455;

    @OriginalMember(owner = "RTZFXINE", name = "d", descriptor = "B")
    private static byte field1408 = 8;

    @OriginalMember(owner = "RTZFXINE", name = "e", descriptor = "Z")
    private static boolean field1409 = true;

    @OriginalMember(owner = "RTZFXINE", name = "f", descriptor = "[C")
    private static final char[] field1410 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "RTZFXINE", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method469(String arg0) {
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

    @OriginalMember(owner = "RTZFXINE", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static String method470(long arg0, byte arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (field1408 != arg1) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            char[] var5 = new char[12];
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                var5[11 - var3++] = field1410[(int) (var6 - arg0 * 37L)];
            }
            return new String(var5, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "RTZFXINE", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method471(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg0 != -19946) {
            throw new NullPointerException();
        }
        return var3;
    }

    @OriginalMember(owner = "RTZFXINE", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method472(int arg0, byte arg1) {
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "RTZFXINE", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method473(boolean arg0, String arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else if (arg1.length() > 0) {
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
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "RTZFXINE", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method474(int arg0, String arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
