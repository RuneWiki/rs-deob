import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CIRLBWBX")
public class class11 {

    @OriginalMember(owner = "CIRLBWBX", name = "a", descriptor = "Z")
    private static boolean field154 = true;

    @OriginalMember(owner = "CIRLBWBX", name = "b", descriptor = "I")
    private static int field155 = 17551;

    @OriginalMember(owner = "CIRLBWBX", name = "c", descriptor = "Z")
    private static boolean field156 = true;

    @OriginalMember(owner = "CIRLBWBX", name = "d", descriptor = "I")
    private static int field157 = -774;

    @OriginalMember(owner = "CIRLBWBX", name = "e", descriptor = "I")
    private static int field158 = -207;

    @OriginalMember(owner = "CIRLBWBX", name = "f", descriptor = "[C")
    private static final char[] field159 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "CIRLBWBX", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method37(String arg0) {
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

    @OriginalMember(owner = "CIRLBWBX", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method38(int arg0, long arg1) {
        if (arg0 < 2 || arg0 > 2) {
            field157 = 3;
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
                var4[11 - var3++] = field159[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "CIRLBWBX", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method39(String arg0, int arg1) {
        if (arg1 != -32663) {
            field154 = !field154;
        }
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "CIRLBWBX", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static String method40(int arg0, boolean arg1) {
        if (arg1) {
            field156 = !field156;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "CIRLBWBX", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method41(String arg0, int arg1) {
        if (arg1 != 42484) {
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

    @OriginalMember(owner = "CIRLBWBX", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method42(byte arg0, String arg1) {
        if (arg0 != -118) {
            field157 = -384;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
