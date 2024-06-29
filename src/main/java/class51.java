import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SFBUQEXP")
public class class51 {

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "Z")
    private static boolean field1487 = true;

    @OriginalMember(owner = "client!SFBUQEXP", name = "b", descriptor = "B")
    private static byte field1488 = 7;

    @OriginalMember(owner = "client!SFBUQEXP", name = "c", descriptor = "Z")
    private static boolean field1489 = true;

    @OriginalMember(owner = "client!SFBUQEXP", name = "d", descriptor = "I")
    private static int field1490 = -422;

    @OriginalMember(owner = "client!SFBUQEXP", name = "e", descriptor = "I")
    private static int field1491 = 340;

    @OriginalMember(owner = "client!SFBUQEXP", name = "f", descriptor = "Z")
    private static boolean field1492 = true;

    @OriginalMember(owner = "client!SFBUQEXP", name = "g", descriptor = "I")
    private static int field1493 = -198;

    @OriginalMember(owner = "client!SFBUQEXP", name = "h", descriptor = "[C")
    private static final char[] field1494 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method505(String arg0) {
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

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method506(boolean arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0) {
                throw new NullPointerException();
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1494[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method507(byte arg0, String arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        String var3 = arg1.toUpperCase();
        long var4 = 0L;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            long var7 = var4 * 61L + (long) var3.charAt(var6) - 32L;
            var4 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var4;
    }

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static String method508(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method509(String arg0, boolean arg1) {
        if (!arg1) {
            field1493 = 422;
        }
        if (arg0.length() <= 0) {
            return arg0;
        }
        char[] var2 = arg0.toCharArray();
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

    @OriginalMember(owner = "client!SFBUQEXP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method510(int arg0, String arg1) {
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
