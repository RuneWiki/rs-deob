import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SJGLGRTK")
public class class55 {

    @OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "B")
    private static byte field1565 = 8;

    @OriginalMember(owner = "client!SJGLGRTK", name = "b", descriptor = "I")
    private static int field1566 = 3;

    @OriginalMember(owner = "client!SJGLGRTK", name = "c", descriptor = "I")
    private static int field1567 = 612;

    @OriginalMember(owner = "client!SJGLGRTK", name = "d", descriptor = "[C")
    private static final char[] field1568 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method497(String arg0) {
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

    @OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method498(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (arg0 >= 0) {
                for (int var5 = 1; var5 > 0; var5++) {
                }
            }
            while (arg1 != 0L) {
                long var6 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1568[(int) (var6 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method499(String arg0, int arg1) {
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return var3;
    }

    @OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method500(int arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var2 = false;
        } else {
            field1567 = 459;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!SJGLGRTK", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method501(String arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        } else if (arg0.length() > 0) {
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
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!SJGLGRTK", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method502(String arg0, int arg1) {
        label25: while (true) {
            if (arg1 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label25;
                    }
                    var4++;
                }
            }
            StringBuffer var2 = new StringBuffer();
            for (int var3 = 0; var3 < arg0.length(); var3++) {
                var2.append("*");
            }
            return var2.toString();
        }
    }
}
