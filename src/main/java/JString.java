import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class JString {

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    private static int field877 = -971;

    @OriginalMember(owner = "yb", name = "b", descriptor = "B")
    private static byte field878 = -28;

    @OriginalMember(owner = "yb", name = "c", descriptor = "Z")
    private static boolean field879 = true;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    private static int field880 = -368;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[C")
    private static final char[] field881 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method300(String arg0) {
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

    @OriginalMember(owner = "yb", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static String method301(long arg0, int arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (arg1 != 0) {
                throw new NullPointerException();
            }
            while (arg0 != 0L) {
                long var5 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field881[(int) (var5 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static long method302(String arg0, byte arg1) {
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg1 != 83) {
            field879 = !field879;
        }
        return var3;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static String method303(boolean arg0, int arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method304(int arg0, String arg1) {
        if (arg0 >= 0) {
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

    @OriginalMember(owner = "yb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method305(int arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
