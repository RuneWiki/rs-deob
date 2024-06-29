import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RSIGORUG")
public class class50 {

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "Z")
    private static boolean field1430 = true;

    @OriginalMember(owner = "client!RSIGORUG", name = "c", descriptor = "I")
    private static int field1432 = -324;

    @OriginalMember(owner = "client!RSIGORUG", name = "d", descriptor = "I")
    private static int field1433 = 9;

    @OriginalMember(owner = "client!RSIGORUG", name = "e", descriptor = "I")
    private static int field1434 = 8;

    @OriginalMember(owner = "client!RSIGORUG", name = "f", descriptor = "[C")
    private static final char[] field1435 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!RSIGORUG", name = "b", descriptor = "I")
    private static int field1431;

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method452(String arg0) {
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

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static String method453(byte arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0 == 3) {
                boolean var4 = false;
            } else {
                field1430 = !field1430;
            }
            char[] var5 = new char[12];
            while (arg1 != 0L) {
                long var6 = arg1;
                arg1 /= 37L;
                var5[11 - var3++] = field1435[(int) (var6 - arg1 * 37L)];
            }
            return new String(var5, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static long method454(String arg0, byte arg1) {
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        if (arg1 != 9) {
            throw new NullPointerException();
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < var2.length(); var6++) {
            long var7 = var3 * 61L + (long) var2.charAt(var6) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static String method455(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method456(int arg0, String arg1) {
        int var2 = 26 / arg0;
        if (arg1.length() <= 0) {
            return arg1;
        }
        char[] var3 = arg1.toCharArray();
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

    @OriginalMember(owner = "client!RSIGORUG", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method457(String arg0, int arg1) {
        while (arg1 >= 0) {
            field1431 = 298;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
