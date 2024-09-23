import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PQGPOSRV")
public class class44 {

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "B")
    private static byte field1379 = 8;

    @OriginalMember(owner = "PQGPOSRV", name = "b", descriptor = "I")
    private static int field1380 = 8;

    @OriginalMember(owner = "PQGPOSRV", name = "c", descriptor = "I")
    private static int field1381 = -550;

    @OriginalMember(owner = "PQGPOSRV", name = "e", descriptor = "I")
    private static int field1383 = -41990;

    @OriginalMember(owner = "PQGPOSRV", name = "f", descriptor = "[C")
    private static final char[] field1384 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "PQGPOSRV", name = "d", descriptor = "Z")
    private static boolean field1382;

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method459(String arg0) {
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

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static String method460(long arg0, int arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (arg1 >= 0) {
                throw new NullPointerException();
            }
            while (arg0 != 0L) {
                long var5 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field1384[(int) (var5 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static long method461(String arg0, boolean arg1) {
        String var2 = arg0.toUpperCase();
        if (arg1) {
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

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static String method462(int arg0, boolean arg1) {
        if (arg1) {
            field1382 = !field1382;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method463(byte arg0, String arg1) {
        if (arg0 != -2) {
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

    @OriginalMember(owner = "PQGPOSRV", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method464(int arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
