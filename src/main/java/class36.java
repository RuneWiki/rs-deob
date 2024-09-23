import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MYWERTTF")
public class class36 {

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "Z")
    private static boolean field1043 = true;

    @OriginalMember(owner = "MYWERTTF", name = "b", descriptor = "I")
    private static int field1044 = -493;

    @OriginalMember(owner = "MYWERTTF", name = "c", descriptor = "I")
    private static int field1045 = 7;

    @OriginalMember(owner = "MYWERTTF", name = "d", descriptor = "I")
    private static int field1046 = 42987;

    @OriginalMember(owner = "MYWERTTF", name = "e", descriptor = "[C")
    private static final char[] field1047 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method300(String arg0) {
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

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static String method301(byte arg0, long arg1) {
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg1 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var5 = 0;
            char[] var6 = new char[12];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6[11 - var5++] = field1047[(int) (var7 - arg1 * 37L)];
            }
            return new String(var6, 12 - var5, var5);
        }
    }

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static long method302(String arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            throw new NullPointerException();
        }
        String var2 = arg0.toUpperCase();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method303(int arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method304(int arg0, String arg1) {
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

    @OriginalMember(owner = "MYWERTTF", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method305(byte arg0, String arg1) {
        StringBuffer var2 = new StringBuffer();
        if (arg0 != 7) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < arg1.length(); var4++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
