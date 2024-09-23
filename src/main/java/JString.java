import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class JString {

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    private static int field872 = 688;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private static boolean field873 = true;

    @OriginalMember(owner = "yb", name = "c", descriptor = "Z")
    private static boolean field874 = true;

    @OriginalMember(owner = "yb", name = "d", descriptor = "I")
    private static int field875 = -178;

    @OriginalMember(owner = "yb", name = "f", descriptor = "[C")
    private static final char[] field877 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "yb", name = "e", descriptor = "I")
    private static int field876;

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

    @OriginalMember(owner = "yb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static String method301(long arg0, boolean arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (arg1) {
                field876 = -131;
            }
            while (arg0 != 0L) {
                long var5 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field877[(int) (var5 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static long method302(String arg0, byte arg1) {
        if (arg1 != 97) {
            throw new NullPointerException();
        }
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static String method303(byte arg0, int arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method304(String arg0, int arg1) {
        int var2 = 31 / arg1;
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

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method305(String arg0, boolean arg1) {
        if (arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        StringBuffer var3 = new StringBuffer();
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3.append("*");
        }
        return var3.toString();
    }
}
