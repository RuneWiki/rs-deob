import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IQRKADXA")
public class class18 {

    @OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "I")
    private static int field792 = 9;

    @OriginalMember(owner = "client!IQRKADXA", name = "b", descriptor = "[C")
    public static char[] field793 = new char[100];

    @OriginalMember(owner = "client!IQRKADXA", name = "c", descriptor = "LSVWJKJVI;")
    private static class52 field794 = new class52(new byte[100], true);

    @OriginalMember(owner = "client!IQRKADXA", name = "d", descriptor = "[C")
    private static char[] field795 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "(LSVWJKJVI;II)Ljava/lang/String;")
    public static String method266(class52 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        while (arg2 >= 0) {
            field792 = -471;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method461();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field793[var3++] = field795[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field793[var3++] = field795[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field793[var3++] = field795[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field793[var3++] = field795[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field793[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field793[var7] = (char) (field793[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field793, 0, var3);
    }

    @OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "(LSVWJKJVI;ILjava/lang/String;)V")
    public static void method267(class52 arg0, int arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        if (arg1 <= 0) {
            field792 = 53;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field795.length; var8++) {
                if (field795[var8] == var6) {
                    var7 = var8;
                    break;
                }
            }
            if (var7 > 12) {
                var7 += 195;
            }
            if (var4 == -1) {
                if (var7 < 13) {
                    var4 = var7;
                } else {
                    arg0.method451(var7);
                }
            } else if (var7 < 13) {
                arg0.method451((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method451((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method451(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!IQRKADXA", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method268(boolean arg0, String arg1) {
        field794.field1434 = 0;
        method267(field794, 815, arg1);
        if (arg0) {
            throw new NullPointerException();
        }
        int var2 = field794.field1434;
        field794.field1434 = 0;
        return method266(field794, var2, -562);
    }
}
