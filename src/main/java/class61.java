import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VTCTQQUO")
public class class61 {

    @OriginalMember(owner = "VTCTQQUO", name = "a", descriptor = "I")
    private static int field1525 = 8;

    @OriginalMember(owner = "VTCTQQUO", name = "b", descriptor = "B")
    private static byte field1526 = -45;

    @OriginalMember(owner = "VTCTQQUO", name = "c", descriptor = "I")
    private static int field1527 = 3;

    @OriginalMember(owner = "VTCTQQUO", name = "d", descriptor = "Z")
    private static boolean field1528 = true;

    @OriginalMember(owner = "VTCTQQUO", name = "e", descriptor = "I")
    private static int field1529 = 7;

    @OriginalMember(owner = "VTCTQQUO", name = "g", descriptor = "[C")
    private static final char[] field1531 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "VTCTQQUO", name = "f", descriptor = "Z")
    private static boolean field1530;

    @OriginalMember(owner = "VTCTQQUO", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method508(String arg0) {
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

    @OriginalMember(owner = "VTCTQQUO", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method509(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0 != 33820) {
                throw new NullPointerException();
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1531[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "VTCTQQUO", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method510(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        if (arg0 >= 0) {
            field1530 = !field1530;
        }
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "VTCTQQUO", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method511(int arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "VTCTQQUO", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method512(boolean arg0, String arg1) {
        if (arg0) {
            field1525 = 152;
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

    @OriginalMember(owner = "VTCTQQUO", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method513(int arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (field1527 != arg0) {
            field1527 = -281;
        }
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
