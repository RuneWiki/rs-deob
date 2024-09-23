import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class JString {

    @OriginalMember(owner = "vb", name = "a", descriptor = "Z")
    private static boolean field746 = true;

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private static int field747 = 38131;

    @OriginalMember(owner = "vb", name = "c", descriptor = "I")
    private static int field748 = -3154;

    @OriginalMember(owner = "vb", name = "d", descriptor = "[C")
    public static char[] field749 = new char[12];

    @OriginalMember(owner = "vb", name = "e", descriptor = "[C")
    public static char[] field750 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static String method252(long arg0, byte arg1) {
        if (arg1 != -74) {
            field748 = -220;
        }
        if (arg0 < 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        }
        int var3 = 0;
        while (arg0 != 0L) {
            long var4 = arg0;
            arg0 /= 37L;
            field749[11 - var3++] = field750[(int) (var4 - arg0 * 37L)];
        }
        return new String(field749, 12 - var3, var3);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static long method253(boolean arg0, String arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        String var2 = arg1.toUpperCase();
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method255(String arg0, boolean arg1) {
        if (!arg1) {
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method256(String arg0, byte arg1) {
        String var2 = arg0.toLowerCase();
        char[] var3 = var2.toCharArray();
        if (arg1 != 99) {
            field748 = -205;
        }
        int var4 = var3.length;
        boolean var5 = true;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = var3[var6];
            if (var5 && var7 >= 'a' && var7 <= 'z') {
                var3[var6] = (char) (var3[var6] - 32);
                var5 = false;
            }
            if (var7 == '.' || var7 == '!') {
                var5 = true;
            }
        }
        return new String(var3);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method257(String arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        String var2 = "";
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2 = var2 + "*";
        }
        return var2;
    }
}
