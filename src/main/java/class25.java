import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JDMIWTSP")
public class class25 {

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "Z")
    private static boolean field832 = true;

    @OriginalMember(owner = "JDMIWTSP", name = "b", descriptor = "Z")
    private static boolean field833 = true;

    @OriginalMember(owner = "JDMIWTSP", name = "c", descriptor = "I")
    private static int field834 = 598;

    @OriginalMember(owner = "JDMIWTSP", name = "d", descriptor = "I")
    private static int field835 = 49845;

    @OriginalMember(owner = "JDMIWTSP", name = "e", descriptor = "I")
    private static int field836 = -306;

    @OriginalMember(owner = "JDMIWTSP", name = "f", descriptor = "I")
    private static int field837 = -250;

    @OriginalMember(owner = "JDMIWTSP", name = "g", descriptor = "Z")
    private static boolean field838 = true;

    @OriginalMember(owner = "JDMIWTSP", name = "h", descriptor = "[C")
    private static final char[] field839 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method278(String arg0) {
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

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method279(boolean arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (!arg0) {
                field837 = -7;
            }
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field839[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static long method280(boolean arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        if (!arg0) {
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

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method281(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method282(int arg0, String arg1) {
        if (field835 != arg0) {
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

    @OriginalMember(owner = "JDMIWTSP", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method283(String arg0, boolean arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
