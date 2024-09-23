import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class JString {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private static int field728 = 639;

    @OriginalMember(owner = "vb", name = "b", descriptor = "[C")
    public static char[] field729 = new char[12];

    @OriginalMember(owner = "vb", name = "c", descriptor = "[C")
    public static char[] field730 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method251(String arg0) {
        String var1 = arg0.trim();
        long var2 = 0L;
        for (int var4 = 0; var4 < var1.length() && var4 < 12; var4++) {
            char var5 = var1.charAt(var4);
            var2 *= 37L;
            if (var5 >= 'A' && var5 <= 'Z') {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 'a' && var5 <= 'z') {
                var2 += var5 + 1 - 97;
            } else if (var5 >= '0' && var5 <= '9') {
                var2 += var5 + 27 - 48;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method252(boolean arg0, long arg1) {
        if (arg1 < 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        }
        int var3 = 0;
        if (arg0) {
            field728 = -90;
        }
        while (arg1 != 0L) {
            long var4 = arg1;
            arg1 /= 37L;
            field729[11 - var3++] = field730[(int) (var4 - arg1 * 37L)];
        }
        return new String(field729, 12 - var3, var3);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method253(String arg0, int arg1) {
        String var2 = arg0.toUpperCase();
        if (arg1 >= 0) {
            field728 = 160;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method254(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method255(boolean arg0, String arg1) {
        if (arg0) {
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method256(byte arg0, String arg1) {
        String var2 = arg1.toLowerCase();
        char[] var3 = var2.toCharArray();
        int var4 = var3.length;
        boolean var5 = true;
        if (arg0 != 4) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        for (int var7 = 0; var7 < var4; var7++) {
            char var8 = var3[var7];
            if (var5 && var8 >= 'a' && var8 <= 'z') {
                var3[var7] = (char) (var3[var7] - 32);
                var5 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var5 = true;
            }
        }
        return new String(var3);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method257(String arg0, byte arg1) {
        if (arg1 != 3) {
            throw new NullPointerException();
        }
        String var2 = "";
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2 = var2 + "*";
        }
        return var2;
    }
}
