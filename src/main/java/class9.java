import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!DCKSLYWK")
public class class9 {

    @OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "Z")
    private static boolean field604 = true;

    @OriginalMember(owner = "client!DCKSLYWK", name = "b", descriptor = "Z")
    private static boolean field605 = true;

    @OriginalMember(owner = "client!DCKSLYWK", name = "c", descriptor = "B")
    private static byte field606 = -68;

    @OriginalMember(owner = "client!DCKSLYWK", name = "d", descriptor = "B")
    private static byte field607 = 8;

    @OriginalMember(owner = "client!DCKSLYWK", name = "e", descriptor = "I")
    private static int field608 = -77;

    @OriginalMember(owner = "client!DCKSLYWK", name = "f", descriptor = "I")
    private static int field609 = 192;

    @OriginalMember(owner = "client!DCKSLYWK", name = "g", descriptor = "B")
    private static byte field610 = 79;

    @OriginalMember(owner = "client!DCKSLYWK", name = "h", descriptor = "I")
    private static int field611 = -178;

    @OriginalMember(owner = "client!DCKSLYWK", name = "i", descriptor = "I")
    private static int field612 = 6;

    @OriginalMember(owner = "client!DCKSLYWK", name = "j", descriptor = "Z")
    private static boolean field613 = true;

    @OriginalMember(owner = "client!DCKSLYWK", name = "k", descriptor = "[C")
    private static final char[] field614 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method168(String arg0) {
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

    @OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method169(boolean arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0) {
                field611 = -174;
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field614[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method170(byte arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var7 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg0 == 3) {
            boolean var6 = false;
        } else {
            field613 = !field613;
        }
        return var3;
    }

    @OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method171(int arg0, byte arg1) {
        if (field607 != arg1) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!DCKSLYWK", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method172(byte arg0, String arg1) {
        if (arg0 != -32) {
            field613 = !field613;
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

    @OriginalMember(owner = "client!DCKSLYWK", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method173(boolean arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (!arg0) {
            field611 = -463;
        }
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
