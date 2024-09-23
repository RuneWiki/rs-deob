import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JBXCIWFE")
public class class26 {

    @OriginalMember(owner = "JBXCIWFE", name = "a", descriptor = "Z")
    private static boolean field853 = true;

    @OriginalMember(owner = "JBXCIWFE", name = "b", descriptor = "[C")
    public static char[] field854 = new char[100];

    @OriginalMember(owner = "JBXCIWFE", name = "c", descriptor = "LIMUIZRAF;")
    private static class24 field855 = new class24(0, new byte[100]);

    @OriginalMember(owner = "JBXCIWFE", name = "d", descriptor = "[C")
    private static char[] field856 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "JBXCIWFE", name = "a", descriptor = "(ZLIMUIZRAF;I)Ljava/lang/String;")
    public static String method276(boolean arg0, class24 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var10 = arg1.method238();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field854[var3++] = field856[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field854[var3++] = field856[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field854[var3++] = field856[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field854[var3++] = field856[var12];
            } else {
                var4 = var12;
            }
        }
        if (!arg0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field854[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field854[var8] = (char) (field854[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field854, 0, var3);
    }

    @OriginalMember(owner = "JBXCIWFE", name = "a", descriptor = "(Ljava/lang/String;LIMUIZRAF;I)V")
    public static void method277(String arg0, class24 arg1, int arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        int var5 = 98 / arg2;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field856.length; var9++) {
                if (field856[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var4 == -1) {
                if (var8 < 13) {
                    var4 = var8;
                } else {
                    arg1.method228(var8);
                }
            } else if (var8 < 13) {
                arg1.method228((var4 << 4) + var8);
                var4 = -1;
            } else {
                arg1.method228((var4 << 4) + (var8 >> 4));
                var4 = var8 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method228(var4 << 4);
        }
    }

    @OriginalMember(owner = "JBXCIWFE", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method278(String arg0, int arg1) {
        field855.field832 = 0;
        method277(arg0, field855, 974);
        int var2 = field855.field832;
        field855.field832 = 0;
        int var3 = 68 / arg1;
        return method276(field853, field855, var2);
    }
}
