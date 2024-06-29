import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VUKQGAWR")
public class class57 {

    @OriginalMember(owner = "client!VUKQGAWR", name = "b", descriptor = "I")
    private static int field1569 = 5;

    @OriginalMember(owner = "client!VUKQGAWR", name = "c", descriptor = "B")
    private static byte field1570 = 7;

    @OriginalMember(owner = "client!VUKQGAWR", name = "d", descriptor = "I")
    private static int field1571 = -22582;

    @OriginalMember(owner = "client!VUKQGAWR", name = "e", descriptor = "B")
    private static byte field1572 = 11;

    @OriginalMember(owner = "client!VUKQGAWR", name = "f", descriptor = "Z")
    private static boolean field1573 = true;

    @OriginalMember(owner = "client!VUKQGAWR", name = "g", descriptor = "I")
    private static int field1574 = -55;

    @OriginalMember(owner = "client!VUKQGAWR", name = "h", descriptor = "[C")
    private static final char[] field1575 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "Z")
    private static boolean field1568;

    @OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method537(String arg0) {
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

    @OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static String method538(long arg0, byte arg1) {
        if (field1570 == arg1) {
            boolean var3 = false;
        } else {
            field1568 = !field1568;
        }
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var4 = 0;
            char[] var5 = new char[12];
            while (arg0 != 0L) {
                long var6 = arg0;
                arg0 /= 37L;
                var5[11 - var4++] = field1575[(int) (var6 - arg0 * 37L)];
            }
            return new String(var5, 12 - var4, var4);
        }
    }

    @OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static long method539(String arg0, boolean arg1) {
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < var2.length(); var6++) {
            long var7 = var3 * 61L + (long) var2.charAt(var6) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method540(int arg0, byte arg1) {
        if (arg1 != 7) {
            field1573 = !field1573;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!VUKQGAWR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method541(int arg0, String arg1) {
        if (arg0 != 0) {
            field1569 = -319;
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

    @OriginalMember(owner = "client!VUKQGAWR", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method542(int arg0, String arg1) {
        if (arg0 != -40219) {
            field1568 = !field1568;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
