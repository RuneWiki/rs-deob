import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ENTKOOQW")
public class class17 {

    @OriginalMember(owner = "ENTKOOQW", name = "a", descriptor = "Z")
    private static boolean field783 = true;

    @OriginalMember(owner = "ENTKOOQW", name = "b", descriptor = "[C")
    public static char[] field784 = new char[100];

    @OriginalMember(owner = "ENTKOOQW", name = "c", descriptor = "LINLHDAGO;")
    private static class29 field785 = new class29((byte) -28, new byte[100]);

    @OriginalMember(owner = "ENTKOOQW", name = "d", descriptor = "[C")
    private static char[] field786 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ENTKOOQW", name = "a", descriptor = "(ILINLHDAGO;I)Ljava/lang/String;")
    public static String method249(int arg0, class29 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method308();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field784[var3++] = field786[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field784[var3++] = field786[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field784[var3++] = field786[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field784[var3++] = field786[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg0 != 0) {
            field783 = !field783;
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field784[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field784[var7] = (char) (field784[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field784, 0, var3);
    }

    @OriginalMember(owner = "ENTKOOQW", name = "a", descriptor = "(ILINLHDAGO;Ljava/lang/String;)V")
    public static void method250(int arg0, class29 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        if (arg0 != 39843) {
            return;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field786.length; var8++) {
                if (field786[var8] == var6) {
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
                    arg1.method298(var7);
                }
            } else if (var7 < 13) {
                arg1.method298((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method298((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method298(var4 << 4);
        }
    }

    @OriginalMember(owner = "ENTKOOQW", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method251(String arg0, int arg1) {
        field785.field1107 = 0;
        method250(39843, field785, arg0);
        int var2 = field785.field1107;
        field785.field1107 = 0;
        String var3 = method249(0, field785, var2);
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3;
    }
}
