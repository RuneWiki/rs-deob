import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class JString {

    @OriginalMember(owner = "zb", name = "a", descriptor = "B")
    private static byte field871 = 2;

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field872 = 650;

    @OriginalMember(owner = "zb", name = "e", descriptor = "[C")
    private static final char[] field875 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "zb", name = "c", descriptor = "Z")
    private static boolean field873;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Z")
    private static boolean field874;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method310(String arg0) {
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static String method311(byte arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0 != 4) {
                throw new NullPointerException();
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field875[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method312(byte arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        if (arg0 != -97) {
            field874 = !field874;
        }
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method313(int arg0, int arg1) {
        if (arg0 < 9 || arg0 > 9) {
            field873 = !field873;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method314(String arg0, byte arg1) {
        if (arg1 != 9) {
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

    @OriginalMember(owner = "zb", name = "b", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method315(byte arg0, String arg1) {
        String var2 = arg1.toLowerCase();
        char[] var3 = var2.toCharArray();
        int var4 = var3.length;
        if (arg0 != -4) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var4; var7++) {
            char var8 = var3[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                var3[var7] = (char) (var3[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(var3);
    }

    @OriginalMember(owner = "zb", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method316(String arg0, byte arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != -76) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
