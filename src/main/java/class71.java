import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZDHYRWCV")
public class class71 {

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "B")
    private static byte field1723 = -66;

    @OriginalMember(owner = "ZDHYRWCV", name = "b", descriptor = "I")
    private static int field1724 = 7;

    @OriginalMember(owner = "ZDHYRWCV", name = "c", descriptor = "B")
    private static byte field1725 = 68;

    @OriginalMember(owner = "ZDHYRWCV", name = "d", descriptor = "I")
    private static int field1726 = -639;

    @OriginalMember(owner = "ZDHYRWCV", name = "e", descriptor = "I")
    private static int field1727 = -658;

    @OriginalMember(owner = "ZDHYRWCV", name = "f", descriptor = "B")
    private static byte field1728 = 48;

    @OriginalMember(owner = "ZDHYRWCV", name = "h", descriptor = "Z")
    private static boolean field1730 = true;

    @OriginalMember(owner = "ZDHYRWCV", name = "i", descriptor = "[C")
    private static final char[] field1731 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "ZDHYRWCV", name = "g", descriptor = "Z")
    private static boolean field1729;

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method587(String arg0) {
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

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static String method588(long arg0, byte arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (field1723 != arg1) {
                throw new NullPointerException();
            }
            char[] var4 = new char[12];
            while (arg0 != 0L) {
                long var5 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field1731[(int) (var5 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method589(byte arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        if (field1725 != arg0) {
            field1730 = !field1730;
        }
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static String method590(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method591(int arg0, String arg1) {
        if (arg0 <= 0) {
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

    @OriginalMember(owner = "ZDHYRWCV", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method592(String arg0, int arg1) {
        if (arg1 <= 0) {
            field1729 = !field1729;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
