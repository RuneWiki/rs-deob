import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class JString {

    @OriginalMember(owner = "zb", name = "b", descriptor = "Z")
    private static boolean field850 = true;

    @OriginalMember(owner = "zb", name = "c", descriptor = "[C")
    public static char[] field851 = new char[12];

    @OriginalMember(owner = "zb", name = "d", descriptor = "[C")
    public static char[] field852 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "Z")
    private static boolean field849;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method296(String arg0) {
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method297(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0 != 9) {
                for (int var4 = 1; var4 > 0; var4++) {
                }
            }
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                field851[11 - var3++] = field852[(int) (var5 - arg1 * 37L)];
            }
            return new String(field851, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static long method298(byte arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        if (arg0 != 42) {
            field850 = !field850;
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method299(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method300(String arg0, int arg1) {
        if (arg1 != 1) {
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method301(String arg0, byte arg1) {
        String var2 = arg0.toLowerCase();
        char[] var3 = var2.toCharArray();
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
        if (arg1 != 7) {
            throw new NullPointerException();
        }
        return new String(var3);
    }

    @OriginalMember(owner = "zb", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method302(String arg0, int arg1) {
        String var2 = "";
        while (arg1 >= 0) {
            field849 = !field849;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2 = var2 + "*";
        }
        return var2;
    }
}
