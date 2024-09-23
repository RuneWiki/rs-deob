import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ub")
public class JString {

    @OriginalMember(owner = "ub", name = "a", descriptor = "Z")
    private static boolean field702 = true;

    @OriginalMember(owner = "ub", name = "b", descriptor = "I")
    private static int field703 = 86;

    @OriginalMember(owner = "ub", name = "c", descriptor = "I")
    private static int field704 = 604;

    @OriginalMember(owner = "ub", name = "e", descriptor = "[C")
    public static char[] field706 = new char[12];

    @OriginalMember(owner = "ub", name = "f", descriptor = "[C")
    public static char[] field707 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "ub", name = "d", descriptor = "Z")
    private static boolean field705;

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method226(String arg0) {
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

    @OriginalMember(owner = "ub", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static String method227(byte arg0, long arg1) {
        if (arg1 < 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        }
        int var3 = 0;
        if (arg0 != -89) {
            throw new NullPointerException();
        }
        while (arg1 != 0L) {
            long var4 = arg1;
            arg1 /= 37L;
            field706[11 - var3++] = field707[(int) (var4 - arg1 * 37L)];
        }
        return new String(field706, 12 - var3, var3);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method228(String arg0, int arg1) {
        String var2 = arg0.toLowerCase();
        int var3 = 27 / arg1;
        long var4 = 0L;
        for (int var6 = 0; var6 < var2.length(); var6++) {
            var4 = var4 * 61L + (long) var2.charAt(var6) - 32L;
        }
        return var4;
    }

    @OriginalMember(owner = "ub", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method229(String arg0, int arg1) {
        if (arg1 <= 0) {
            field705 = !field705;
        }
        String var2 = arg0.toLowerCase().trim();
        String var3 = "";
        for (int var4 = 0; var4 < var2.length() && var4 < 12; var4++) {
            char var5 = var2.charAt(var4);
            if (var5 >= 'a' && var5 <= 'z') {
                var3 = var3 + var5;
            } else if (var5 >= '0' && var5 <= '9') {
                var3 = var3 + var5;
            } else {
                var3 = var3 + '_';
            }
        }
        while (var3.endsWith("_")) {
            var3 = var3.substring(0, var3.length() - 1);
        }
        while (var3.startsWith("_")) {
            var3 = var3.substring(1);
        }
        return var3;
    }

    @OriginalMember(owner = "ub", name = "c", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method230(String arg0, int arg1) {
        if (arg1 >= 0) {
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

    @OriginalMember(owner = "ub", name = "d", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method231(String arg0, int arg1) {
        if (arg1 <= 0) {
            field702 = !field702;
        }
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
        return new String(var3);
    }

    @OriginalMember(owner = "ub", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method232(String arg0, byte arg1) {
        if (arg1 != -37) {
            field703 = -142;
        }
        String var2 = "";
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2 = var2 + "*";
        }
        return var2;
    }
}
