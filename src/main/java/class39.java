import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PMUEFTAP")
public class class39 {

    @OriginalMember(owner = "PMUEFTAP", name = "a", descriptor = "B")
    private static byte field987 = 2;

    @OriginalMember(owner = "PMUEFTAP", name = "b", descriptor = "B")
    private static byte field988 = 2;

    @OriginalMember(owner = "PMUEFTAP", name = "d", descriptor = "I")
    private static int field990 = 7;

    @OriginalMember(owner = "PMUEFTAP", name = "e", descriptor = "I")
    private static int field991 = 799;

    @OriginalMember(owner = "PMUEFTAP", name = "f", descriptor = "Z")
    private static boolean field992 = true;

    @OriginalMember(owner = "PMUEFTAP", name = "g", descriptor = "[C")
    private static final char[] field993 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "PMUEFTAP", name = "c", descriptor = "Z")
    private static boolean field989;

    @OriginalMember(owner = "PMUEFTAP", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method367(String arg0) {
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

    @OriginalMember(owner = "PMUEFTAP", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static String method368(byte arg0, long arg1) {
        if (arg0 != 3) {
            field990 = 189;
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field993[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "PMUEFTAP", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method369(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        while (arg0 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "PMUEFTAP", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method370(int arg0, int arg1) {
        if (arg0 != 0) {
            field989 = !field989;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "PMUEFTAP", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method371(String arg0, byte arg1) {
        if (arg1 != -7) {
            field991 = -439;
        }
        if (arg0.length() <= 0) {
            return arg0;
        }
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
    }

    @OriginalMember(owner = "PMUEFTAP", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method372(int arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        int var3 = 14 / arg0;
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
