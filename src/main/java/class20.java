import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FYSVECDN")
public class class20 {

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "I")
    private static int field788 = 1;

    @OriginalMember(owner = "FYSVECDN", name = "b", descriptor = "I")
    private static int field789 = -493;

    @OriginalMember(owner = "FYSVECDN", name = "c", descriptor = "I")
    private static int field790 = -29215;

    @OriginalMember(owner = "FYSVECDN", name = "d", descriptor = "Z")
    private static boolean field791 = true;

    @OriginalMember(owner = "FYSVECDN", name = "e", descriptor = "[C")
    private static final char[] field792 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method214(String arg0) {
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

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method215(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            if (arg0 != 7) {
                field791 = !field791;
            }
            char[] var4 = new char[12];
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field792[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method216(String arg0, int arg1) {
        if (arg1 <= 0) {
            field788 = 68;
        }
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method217(int arg0, int arg1) {
        if (arg1 != -13404) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method218(int arg0, String arg1) {
        while (arg0 >= 0) {
            field791 = !field791;
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

    @OriginalMember(owner = "FYSVECDN", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method219(String arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var2 = false;
        } else {
            field789 = 342;
        }
        StringBuffer var3 = new StringBuffer();
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            var3.append("*");
        }
        return var3.toString();
    }
}
