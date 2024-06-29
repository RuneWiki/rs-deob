import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HCBZAWVW")
public class class19 {

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "I")
    private static int field827 = -741;

    @OriginalMember(owner = "client!HCBZAWVW", name = "b", descriptor = "I")
    private static int field828 = 576;

    @OriginalMember(owner = "client!HCBZAWVW", name = "c", descriptor = "Z")
    private static boolean field829 = true;

    @OriginalMember(owner = "client!HCBZAWVW", name = "d", descriptor = "[C")
    private static final char[] field830 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method286(String arg0) {
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

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method287(boolean arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0) {
                throw new NullPointerException();
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field830[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method288(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return var3;
    }

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static String method289(int arg0, byte arg1) {
        if (arg1 != 7) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method290(boolean arg0, String arg1) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (arg1.length() <= 0) {
            return arg1;
        }
        char[] var3 = arg1.toCharArray();
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

    @OriginalMember(owner = "client!HCBZAWVW", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method291(String arg0, byte arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg1 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
