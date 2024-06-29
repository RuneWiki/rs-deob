import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DQKGVELR")
public class class12 {

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "I")
    private static int field697 = -41034;

    @OriginalMember(owner = "client!DQKGVELR", name = "b", descriptor = "Z")
    private static boolean field698 = true;

    @OriginalMember(owner = "client!DQKGVELR", name = "c", descriptor = "I")
    private static int field699 = 578;

    @OriginalMember(owner = "client!DQKGVELR", name = "d", descriptor = "B")
    private static byte field700 = 5;

    @OriginalMember(owner = "client!DQKGVELR", name = "e", descriptor = "Z")
    private static boolean field701 = true;

    @OriginalMember(owner = "client!DQKGVELR", name = "f", descriptor = "I")
    private static int field702 = -660;

    @OriginalMember(owner = "client!DQKGVELR", name = "g", descriptor = "I")
    private static int field703 = -377;

    @OriginalMember(owner = "client!DQKGVELR", name = "i", descriptor = "[C")
    private static final char[] field705 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!DQKGVELR", name = "h", descriptor = "Z")
    private static boolean field704;

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method182(String arg0) {
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

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method183(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0 != 39082) {
                field704 = !field704;
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field705[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method184(byte arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var7 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        return var3;
    }

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method185(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            field704 = !field704;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method186(String arg0, int arg1) {
        if (arg1 != 7139) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
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

    @OriginalMember(owner = "client!DQKGVELR", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method187(String arg0, byte arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != -26) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
