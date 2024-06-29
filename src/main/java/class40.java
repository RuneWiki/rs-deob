import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OSSLGBQQ")
public class class40 {

    @OriginalMember(owner = "client!OSSLGBQQ", name = "a", descriptor = "I")
    private static int field1119 = -124;

    @OriginalMember(owner = "client!OSSLGBQQ", name = "b", descriptor = "I")
    private static int field1120 = -620;

    @OriginalMember(owner = "client!OSSLGBQQ", name = "c", descriptor = "[C")
    public static char[] field1121 = new char[100];

    @OriginalMember(owner = "client!OSSLGBQQ", name = "d", descriptor = "LBFQIDHPO;")
    private static class3 field1122 = new class3(new byte[100], -990);

    @OriginalMember(owner = "client!OSSLGBQQ", name = "e", descriptor = "[C")
    private static char[] field1123 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!OSSLGBQQ", name = "a", descriptor = "(ILBFQIDHPO;I)Ljava/lang/String;")
    public static String method369(int arg0, class3 arg1, int arg2) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method54();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1121[var3++] = field1123[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1121[var3++] = field1123[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1121[var3++] = field1123[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1121[var3++] = field1123[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1121[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1121[var7] = (char) (field1121[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1121, 0, var3);
    }

    @OriginalMember(owner = "client!OSSLGBQQ", name = "a", descriptor = "(LBFQIDHPO;ILjava/lang/String;)V")
    public static void method370(class3 arg0, int arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1123.length; var8++) {
                if (field1123[var8] == var6) {
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
                    arg0.method44(var7);
                }
            } else if (var7 < 13) {
                arg0.method44((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method44((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (arg1 != 0) {
            field1120 = 55;
        }
        if (var4 != -1) {
            arg0.method44(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!OSSLGBQQ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method371(int arg0, String arg1) {
        field1122.field50 = 0;
        method370(field1122, 0, arg1);
        if (arg0 != -18263) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = field1122.field50;
        field1122.field50 = 0;
        return method369(field1119, field1122, var3);
    }
}
