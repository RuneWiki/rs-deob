import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OCQVXKDE")
public class class41 {

    @OriginalMember(owner = "OCQVXKDE", name = "a", descriptor = "I")
    private static int field1076 = -977;

    @OriginalMember(owner = "OCQVXKDE", name = "b", descriptor = "Z")
    private static boolean field1077 = true;

    @OriginalMember(owner = "OCQVXKDE", name = "c", descriptor = "[C")
    public static char[] field1078 = new char[100];

    @OriginalMember(owner = "OCQVXKDE", name = "d", descriptor = "LPKHWFJLM;")
    private static class43 field1079 = new class43(new byte[100], 0);

    @OriginalMember(owner = "OCQVXKDE", name = "e", descriptor = "[C")
    private static char[] field1080 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "OCQVXKDE", name = "a", descriptor = "(IBLPKHWFJLM;)Ljava/lang/String;")
    public static String method313(int arg0, byte arg1, class43 arg2) {
        int var3 = 0;
        int var4 = -1;
        if (arg1 != -7) {
            field1077 = !field1077;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.method330();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1078[var3++] = field1080[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1078[var3++] = field1080[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1078[var3++] = field1080[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1078[var3++] = field1080[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1078[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1078[var7] = (char) (field1078[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1078, 0, var3);
    }

    @OriginalMember(owner = "OCQVXKDE", name = "a", descriptor = "(Ljava/lang/String;LPKHWFJLM;I)V")
    public static void method314(String arg0, class43 arg1, int arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg2 != 0) {
            field1077 = !field1077;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1080.length; var8++) {
                if (field1080[var8] == var6) {
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
                    arg1.method320(var7);
                }
            } else if (var7 < 13) {
                arg1.method320((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method320((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method320(var4 << 4);
        }
    }

    @OriginalMember(owner = "OCQVXKDE", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method315(int arg0, String arg1) {
        field1079.field1105 = 0;
        method314(arg1, field1079, 0);
        int var2 = field1079.field1105;
        field1079.field1105 = 0;
        if (arg0 != 24865) {
            field1076 = -256;
        }
        return method313(var2, (byte) -7, field1079);
    }
}
