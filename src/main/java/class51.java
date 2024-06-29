import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RPCTGZHI")
public class class51 {

    @OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "I")
    private static int field1397 = -39;

    @OriginalMember(owner = "client!RPCTGZHI", name = "b", descriptor = "I")
    private static int field1398 = -33427;

    @OriginalMember(owner = "client!RPCTGZHI", name = "c", descriptor = "B")
    private static byte field1399 = 6;

    @OriginalMember(owner = "client!RPCTGZHI", name = "e", descriptor = "I")
    private static int field1401 = 11573;

    @OriginalMember(owner = "client!RPCTGZHI", name = "f", descriptor = "[C")
    private static final char[] field1402 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!RPCTGZHI", name = "d", descriptor = "Z")
    private static boolean field1400;

    @OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method445(String arg0) {
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

    @OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static String method446(long arg0, byte arg1) {
        if (arg1 != 5) {
            field1400 = !field1400;
        }
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            while (arg0 != 0L) {
                long var5 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field1402[(int) (var5 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method447(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        int var5 = 92 / arg0;
        for (int var6 = 0; var6 < var2.length(); var6++) {
            long var7 = var3 * 61L + (long) var2.charAt(var6) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method448(int arg0, byte arg1) {
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!RPCTGZHI", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method449(String arg0, int arg1) {
        int var2 = 26 / arg1;
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

    @OriginalMember(owner = "client!RPCTGZHI", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method450(String arg0, int arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
