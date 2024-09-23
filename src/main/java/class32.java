import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KUSEAONH")
public class class32 {

    @OriginalMember(owner = "KUSEAONH", name = "a", descriptor = "I")
    private static int field951 = 110;

    @OriginalMember(owner = "KUSEAONH", name = "b", descriptor = "[C")
    public static char[] field952 = new char[100];

    @OriginalMember(owner = "KUSEAONH", name = "c", descriptor = "LGLMIQHJI;")
    private static class21 field953 = new class21(new byte[100], -49015);

    @OriginalMember(owner = "KUSEAONH", name = "d", descriptor = "[C")
    private static char[] field954 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "KUSEAONH", name = "a", descriptor = "(LGLMIQHJI;II)Ljava/lang/String;")
    public static String method343(class21 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            int var10 = arg0.method244();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field952[var3++] = field954[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field952[var3++] = field954[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field952[var3++] = field954[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field952[var3++] = field954[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field952[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field952[var8] = (char) (field952[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field952, 0, var3);
    }

    @OriginalMember(owner = "KUSEAONH", name = "a", descriptor = "(Ljava/lang/String;ILGLMIQHJI;)V")
    public static void method344(String arg0, int arg1, class21 arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 24891) {
            return;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field954.length; var8++) {
                if (field954[var8] == var6) {
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
                    arg2.method234(var7);
                }
            } else if (var7 < 13) {
                arg2.method234((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method234((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method234(var4 << 4);
        }
    }

    @OriginalMember(owner = "KUSEAONH", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method345(String arg0, int arg1) {
        field953.field818 = 0;
        if (arg1 >= 0) {
            field951 = 125;
        }
        method344(arg0, 24891, field953);
        int var2 = field953.field818;
        field953.field818 = 0;
        return method343(field953, var2, 0);
    }
}
