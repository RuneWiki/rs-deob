import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OAEWGOIP")
public class class39 {

    @OriginalMember(owner = "OAEWGOIP", name = "a", descriptor = "Z")
    private static boolean field1165 = true;

    @OriginalMember(owner = "OAEWGOIP", name = "b", descriptor = "I")
    private static int field1166 = -118;

    @OriginalMember(owner = "OAEWGOIP", name = "c", descriptor = "[C")
    public static char[] field1167 = new char[100];

    @OriginalMember(owner = "OAEWGOIP", name = "d", descriptor = "LEILHLJCE;")
    private static class17 field1168 = new class17(new byte[100], -26583);

    @OriginalMember(owner = "OAEWGOIP", name = "e", descriptor = "[C")
    private static char[] field1169 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "OAEWGOIP", name = "a", descriptor = "(LEILHLJCE;II)Ljava/lang/String;")
    public static String method396(class17 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method224();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1167[var3++] = field1169[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1167[var3++] = field1169[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1167[var3++] = field1169[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1167[var3++] = field1169[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg2 >= 0) {
            field1166 = -471;
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1167[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1167[var7] = (char) (field1167[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1167, 0, var3);
    }

    @OriginalMember(owner = "OAEWGOIP", name = "a", descriptor = "(LEILHLJCE;Ljava/lang/String;Z)V")
    public static void method397(class17 arg0, String arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1169.length; var8++) {
                if (field1169[var8] == var6) {
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
                    arg0.method214(var7);
                }
            } else if (var7 < 13) {
                arg0.method214((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method214((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method214(var4 << 4);
        }
    }

    @OriginalMember(owner = "OAEWGOIP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method398(int arg0, String arg1) {
        field1168.field779 = 0;
        method397(field1168, arg1, true);
        int var2 = field1168.field779;
        field1168.field779 = 0;
        String var3 = method396(field1168, var2, -260);
        if (arg0 != -23379) {
            field1165 = !field1165;
        }
        return var3;
    }
}
