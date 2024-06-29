import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SISNGPYM")
public class class52 {

    @OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "B")
    private static byte field1228 = 2;

    @OriginalMember(owner = "client!SISNGPYM", name = "b", descriptor = "I")
    private static int field1229 = 4;

    @OriginalMember(owner = "client!SISNGPYM", name = "c", descriptor = "Z")
    private static boolean field1230 = true;

    @OriginalMember(owner = "client!SISNGPYM", name = "d", descriptor = "I")
    private static int field1231 = 446;

    @OriginalMember(owner = "client!SISNGPYM", name = "e", descriptor = "I")
    private static int field1232 = 446;

    @OriginalMember(owner = "client!SISNGPYM", name = "f", descriptor = "I")
    private static int field1233 = -286;

    @OriginalMember(owner = "client!SISNGPYM", name = "g", descriptor = "I")
    private static int field1234 = 135;

    @OriginalMember(owner = "client!SISNGPYM", name = "h", descriptor = "[C")
    private static final char[] field1235 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method428(String arg0) {
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

    @OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static String method429(byte arg0, long arg1) {
        if (arg0 != -53) {
            throw new NullPointerException();
        } else if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1235[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static long method430(boolean arg0, String arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        String var3 = arg1.toUpperCase();
        long var4 = 0L;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            long var7 = var4 * 61L + (long) var3.charAt(var6) - 32L;
            var4 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var4;
    }

    @OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method431(int arg0, byte arg1) {
        if (arg1 != 73) {
            field1234 = 105;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!SISNGPYM", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method432(int arg0, String arg1) {
        if (arg0 < field1229 || arg0 > field1229) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
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

    @OriginalMember(owner = "client!SISNGPYM", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method433(int arg0, String arg1) {
        if (arg0 != 0) {
            field1234 = 106;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
