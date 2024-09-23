import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UMKVTRLP")
public class class61 {

    @OriginalMember(owner = "UMKVTRLP", name = "a", descriptor = "I")
    private static int field1594 = 4;

    @OriginalMember(owner = "UMKVTRLP", name = "b", descriptor = "B")
    private static byte field1595 = 5;

    @OriginalMember(owner = "UMKVTRLP", name = "c", descriptor = "Z")
    private static boolean field1596 = true;

    @OriginalMember(owner = "UMKVTRLP", name = "d", descriptor = "Z")
    private static boolean field1597 = true;

    @OriginalMember(owner = "UMKVTRLP", name = "e", descriptor = "[C")
    private static final char[] field1598 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "UMKVTRLP", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method580(String arg0) {
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

    @OriginalMember(owner = "UMKVTRLP", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static String method581(long arg0, int arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            int var5 = 24 / arg1;
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field1598[(int) (var6 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "UMKVTRLP", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method582(String arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        String var3 = arg0.toUpperCase();
        long var4 = 0L;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            long var7 = var4 * 61L + (long) var3.charAt(var6) - 32L;
            var4 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var4;
    }

    @OriginalMember(owner = "UMKVTRLP", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method583(int arg0, int arg1) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "UMKVTRLP", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method584(boolean arg0, String arg1) {
        if (!arg0) {
            field1594 = -399;
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

    @OriginalMember(owner = "UMKVTRLP", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method585(String arg0, int arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != -4885) {
            field1597 = !field1597;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
