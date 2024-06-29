import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZLGGMMMS")
public class class71 {

    @OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "Z")
    private static boolean field1753 = true;

    @OriginalMember(owner = "client!ZLGGMMMS", name = "b", descriptor = "I")
    private static int field1754 = -400;

    @OriginalMember(owner = "client!ZLGGMMMS", name = "c", descriptor = "Z")
    private static boolean field1755 = true;

    @OriginalMember(owner = "client!ZLGGMMMS", name = "d", descriptor = "Z")
    private static boolean field1756 = true;

    @OriginalMember(owner = "client!ZLGGMMMS", name = "e", descriptor = "[C")
    private static final char[] field1757 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(Ljava/lang/String;)J")
    public static long method597(String arg0) {
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

    @OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static String method598(long arg0, int arg1) {
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return "invalid_name";
        } else if (arg0 % 37L == 0L) {
            return "invalid_name";
        } else {
            int var3 = 0;
            while (arg1 >= 0) {
                for (int var7 = 1; var7 > 0; var7++) {
                }
            }
            char[] var4 = new char[12];
            while (arg0 != 0L) {
                long var5 = arg0;
                arg0 /= 37L;
                var4[11 - var3++] = field1757[(int) (var5 - arg0 * 37L)];
            }
            return new String(var4, 12 - var3, var3);
        }
    }

    @OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static long method599(String arg0, byte arg1) {
        String var2 = arg0.toUpperCase();
        if (arg1 != 18) {
            throw new NullPointerException();
        }
        long var3 = 0L;
        for (int var5 = 0; var5 < var2.length(); var5++) {
            long var6 = var3 * 61L + (long) var2.charAt(var5) - 32L;
            var3 = var6 + (var6 >> 56) & 0xFFFFFFFFFFFFFFL;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static String method600(int arg0, int arg1) {
        if (arg0 != -38344) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ZLGGMMMS", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method601(String arg0, int arg1) {
        if (arg1 != 8384) {
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

    @OriginalMember(owner = "client!ZLGGMMMS", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method602(String arg0, int arg1) {
        if (arg1 != 7) {
            field1753 = !field1753;
        }
        StringBuffer var2 = new StringBuffer();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.append("*");
        }
        return var2.toString();
    }
}
