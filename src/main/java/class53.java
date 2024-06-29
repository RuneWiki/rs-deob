import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UJXMBJLW")
public class class53 {

    @OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "I")
    private static int field1447 = 42220;

    @OriginalMember(owner = "client!UJXMBJLW", name = "b", descriptor = "I")
    private static int field1448 = 111;

    @OriginalMember(owner = "client!UJXMBJLW", name = "c", descriptor = "Z")
    private static boolean field1449 = true;

    @OriginalMember(owner = "client!UJXMBJLW", name = "d", descriptor = "I")
    private static int field1450 = -607;

    @OriginalMember(owner = "client!UJXMBJLW", name = "e", descriptor = "I")
    private static int field1451 = 431;

    @OriginalMember(owner = "client!UJXMBJLW", name = "f", descriptor = "I")
    private static int field1452 = 437;

    @OriginalMember(owner = "client!UJXMBJLW", name = "i", descriptor = "Z")
    private static boolean field1455 = true;

    @OriginalMember(owner = "client!UJXMBJLW", name = "j", descriptor = "[C")
    private static final char[] field1456 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!UJXMBJLW", name = "g", descriptor = "Z")
    private static boolean field1453;

    @OriginalMember(owner = "client!UJXMBJLW", name = "h", descriptor = "Z")
    private static boolean field1454;

    @OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method491(String arg0) {
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

    @OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static String method492(int arg0, long arg1) {
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            char[] var4 = new char[12];
            if (field1447 != arg0) {
                field1453 = !field1453;
            }
            while (arg1 != 0L) {
                long var5 = arg1;
                arg1 /= 37L;
                var4[11 - var3++] = field1456[(int) (var5 - arg1 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static long method493(int arg0, String arg1) {
        String var2 = arg1.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var7 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var7 + (var7 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        if (arg0 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static String method494(byte arg0, int arg1) {
        if (arg0 != -85) {
            field1448 = -439;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!UJXMBJLW", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method495(boolean arg0, String arg1) {
        if (!arg0) {
            field1453 = !field1453;
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

    @OriginalMember(owner = "client!UJXMBJLW", name = "b", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method496(boolean arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (!arg0) {
            field1454 = !field1454;
        }
        for (int var3 = 0; var3 < arg1.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
