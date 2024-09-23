import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XXUUHLAE")
public class class67 {

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "I")
    private static int field1664 = 4;

    @OriginalMember(owner = "XXUUHLAE", name = "b", descriptor = "I")
    private static int field1665 = -19812;

    @OriginalMember(owner = "XXUUHLAE", name = "c", descriptor = "Z")
    private static boolean field1666 = true;

    @OriginalMember(owner = "XXUUHLAE", name = "d", descriptor = "I")
    private static int field1667 = 189;

    @OriginalMember(owner = "XXUUHLAE", name = "f", descriptor = "[C")
    private static final char[] field1669 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "XXUUHLAE", name = "e", descriptor = "Z")
    private static boolean field1668;

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method574(String arg0) {
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

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static String method575(boolean arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (arg0) {
                throw new NullPointerException();
            }
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1669[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method576(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        int var5 = 81 / arg0;
        for (int var6 = 0; var6 < var2.length(); var6++) {
            long var7 = var3 * 61L + (long) var2.charAt(var6) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method577(int arg0, int arg1) {
        if (arg1 != 7) {
            field1668 = !field1668;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method578(String arg0, byte arg1) {
        if (arg1 != -85) {
            field1667 = 411;
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

    @OriginalMember(owner = "XXUUHLAE", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method579(boolean arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (!arg0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
