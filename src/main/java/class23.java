import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GYTJTJWK")
public class class23 {

    @OriginalMember(owner = "GYTJTJWK", name = "b", descriptor = "[C")
    public static char[] field808 = new char[100];

    @OriginalMember(owner = "GYTJTJWK", name = "c", descriptor = "LXQPFGONL;")
    private static class62 field809 = new class62(new byte[100], 49938);

    @OriginalMember(owner = "GYTJTJWK", name = "d", descriptor = "[C")
    private static char[] field810 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "GYTJTJWK", name = "a", descriptor = "Z")
    private static boolean field807;

    @OriginalMember(owner = "GYTJTJWK", name = "a", descriptor = "(IILXQPFGONL;)Ljava/lang/String;")
    public static String method223(int arg0, int arg1, class62 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var10 = arg2.method478();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field808[var3++] = field810[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field808[var3++] = field810[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field808[var3++] = field810[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field808[var3++] = field810[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var9 = field808[var7];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field808[var7] = (char) (field808[var7] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var6 = true;
            }
        }
        while (arg0 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        return new String(field808, 0, var3);
    }

    @OriginalMember(owner = "GYTJTJWK", name = "a", descriptor = "(ZLXQPFGONL;Ljava/lang/String;)V")
    public static void method224(boolean arg0, class62 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field810.length; var8++) {
                if (field810[var8] == var6) {
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
                    arg1.method468(var7);
                }
            } else if (var7 < 13) {
                arg1.method468((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method468((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method468(var4 << 4);
        }
    }

    @OriginalMember(owner = "GYTJTJWK", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method225(String arg0, int arg1) {
        field809.field1542 = 0;
        method224(false, field809, arg0);
        if (arg1 != 0) {
            field807 = !field807;
        }
        int var2 = field809.field1542;
        field809.field1542 = 0;
        return method223(-555, var2, field809);
    }
}
