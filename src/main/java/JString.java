import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class JString {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private static int field723 = -339;

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private static int field724 = 8;

    @OriginalMember(owner = "vb", name = "c", descriptor = "[C")
    public static char[] field725 = new char[12];

    @OriginalMember(owner = "vb", name = "d", descriptor = "[C")
    public static char[] field726 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method243(String arg0) {
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
    public static String method244(boolean arg0, long arg1) {
        if (arg1 < 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        }
        int var3 = 0;
        if (!arg0) {
            throw new NullPointerException();
        }
        while (arg1 != 0L) {
            long var4 = arg1;
            arg1 /= 37L;
            field725[11 - var3++] = field726[(int) (var4 - arg1 * 37L)];
        }
        return new String(field725, 12 - var3, var3);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static long method245(String arg0, byte arg1) {
        String var2 = arg0.toLowerCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            var3 = var3 * 61L + (long) var2.charAt(var5) - 32L;
        }
        if (arg1 != 6) {
            throw new NullPointerException();
        }
        return var3;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method246(int arg0, String arg1) {
        if (arg0 >= 0) {
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

    @OriginalMember(owner = "vb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method247(int arg0, String arg1) {
        String var2 = arg1.toLowerCase();
        char[] var3 = var2.toCharArray();
        if (arg0 != -4442) {
            throw new NullPointerException();
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method248(byte arg0, String arg1) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        String var4 = "";
        for (int var5 = 0; var5 < arg1.length(); var5++) {
            var4 = var4 + "*";
        }
        return var4;
    }
}
