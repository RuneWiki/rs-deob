import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("vb")
public class JString {

    @OriginalMember(owner = "vb", name = "a", descriptor = "I")
    private static int field742 = 63;

    @OriginalMember(owner = "vb", name = "c", descriptor = "Z")
    private static boolean field744 = true;

    @OriginalMember(owner = "vb", name = "d", descriptor = "[C")
    public static char[] field745 = new char[12];

    @OriginalMember(owner = "vb", name = "e", descriptor = "[C")
    public static char[] field746 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "vb", name = "b", descriptor = "I")
    private static int field743;

    @OriginalMember(owner = "vb", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method258(String arg0) {
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

    @OriginalMember(owner = "vb", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static String method259(long arg0, boolean arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (!arg1) {
                field743 = -60;
            }
            while (arg0 != 0L) {
                long var4 = arg0;
                arg0 /= 37L;
                field745[11 - var3++] = field746[(int) (var4 - arg0 * 37L)];
            }
            return new String(field745, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static long method260(boolean arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        if (arg0) {
            throw new NullPointerException();
        }
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method261(int arg0, byte arg1) {
        if (arg1 == 5) {
            boolean var2 = false;
        } else {
            field743 = -142;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "vb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method262(int arg0, String arg1) {
        if (arg0 != 0) {
            field743 = -425;
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

    @OriginalMember(owner = "vb", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method263(boolean arg0, String arg1) {
        String var2 = arg1.toLowerCase();
        char[] var3 = var2.toCharArray();
        if (arg0) {
            field743 = 223;
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

    @OriginalMember(owner = "vb", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method264(int arg0, String arg1) {
        if (arg0 < 0 || arg0 > 0) {
            field744 = !field744;
        }
        String var2 = "";
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2 = var2 + "*";
        }
        return var2;
    }
}
