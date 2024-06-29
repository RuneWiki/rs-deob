import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ASZHZJYZ")
public class class3 {

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "Z")
    private static boolean field30 = true;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "b", descriptor = "I")
    private static int field31 = 357;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "c", descriptor = "B")
    private static byte field32 = 5;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "d", descriptor = "I")
    private static int field33 = 2;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "e", descriptor = "I")
    private static int field34 = 148;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "f", descriptor = "Z")
    private static boolean field35 = true;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "g", descriptor = "I")
    private static int field36 = 726;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "h", descriptor = "Z")
    private static boolean field37 = true;

    @OriginalMember(owner = "client!ASZHZJYZ", name = "i", descriptor = "[C")
    private static final char[] field38 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method5(String arg0) {
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

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method6(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            int var4 = 69 / arg0;
            char[] var5 = new char[12];
            while (arg1 != 0L) {
                long var6 = arg1;
                arg1 /= 37L;
                var5[11 - var3++] = field38[(int) (var6 - arg1 * 37L)];
            }
            return new String(var5, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method7(byte arg0, String arg1) {
        if (arg0 != -16) {
            field36 = 283;
        }
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method8(int arg0, int arg1) {
        if (arg0 != -29151) {
            field36 = 463;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method9(int arg0, String arg1) {
        if (arg0 != 27250) {
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

    @OriginalMember(owner = "client!ASZHZJYZ", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method10(String arg0, int arg1) {
        if (arg1 != 0) {
            field36 = 347;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
