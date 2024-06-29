import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WAQVJSXE")
public class class56 {

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "B")
    private static byte field1461 = 8;

    @OriginalMember(owner = "client!WAQVJSXE", name = "b", descriptor = "I")
    private static int field1462 = 44101;

    @OriginalMember(owner = "client!WAQVJSXE", name = "c", descriptor = "Z")
    private static boolean field1463 = true;

    @OriginalMember(owner = "client!WAQVJSXE", name = "d", descriptor = "I")
    private static int field1464 = -580;

    @OriginalMember(owner = "client!WAQVJSXE", name = "e", descriptor = "[C")
    private static final char[] field1465 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method461(String arg0) {
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

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method462(boolean arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0) {
                field1464 = 276;
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1465[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static long method463(boolean arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        long var4 = 0L;
        for (int var6 = 0; var6 < var2.length(); var6++) {
            long var7 = var4 * 61L + (long) var2.charAt(var6) - 32L;
            var4 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var4;
    }

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static String method464(byte arg0, int arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method465(int arg0, String arg1) {
        if (arg0 >= 0) {
            field1463 = !field1463;
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

    @OriginalMember(owner = "client!WAQVJSXE", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method466(String arg0, byte arg1) {
        if (field1461 != arg1) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        StringBuffer var3 = new StringBuffer();
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3.append("*");
        }
        return var3.toString();
    }
}
