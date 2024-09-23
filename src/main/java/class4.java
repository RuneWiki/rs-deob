import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AXMCEEOC")
public class class4 {

    @OriginalMember(owner = "AXMCEEOC", name = "a", descriptor = "I")
    private static int field37 = 8;

    @OriginalMember(owner = "AXMCEEOC", name = "b", descriptor = "I")
    private static int field38 = -27732;

    @OriginalMember(owner = "AXMCEEOC", name = "d", descriptor = "[C")
    public static char[] field40 = new char[100];

    @OriginalMember(owner = "AXMCEEOC", name = "e", descriptor = "LMUKVLYLC;")
    private static class33 field41 = new class33(field37, new byte[100]);

    @OriginalMember(owner = "AXMCEEOC", name = "f", descriptor = "[C")
    private static char[] field42 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "AXMCEEOC", name = "c", descriptor = "Z")
    private static boolean field39;

    @OriginalMember(owner = "AXMCEEOC", name = "a", descriptor = "(LMUKVLYLC;II)Ljava/lang/String;")
    public static String method21(class33 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = -1;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var10 = arg0.method292();
            int var11 = var10 >> 4 & 0xF;
            if (var5 != -1) {
                field40[var4++] = field42[(var5 << 4) + var11 - 195];
                var5 = -1;
            } else if (var11 < 13) {
                field40[var4++] = field42[var11];
            } else {
                var5 = var11;
            }
            int var12 = var10 & 0xF;
            if (var5 != -1) {
                field40[var4++] = field42[(var5 << 4) + var12 - 195];
                var5 = -1;
            } else if (var12 < 13) {
                field40[var4++] = field42[var12];
            } else {
                var5 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            char var9 = field40[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field40[var8] = (char) (field40[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field40, 0, var4);
    }

    @OriginalMember(owner = "AXMCEEOC", name = "a", descriptor = "(LMUKVLYLC;ILjava/lang/String;)V")
    public static void method22(class33 arg0, int arg1, String arg2) {
        if (field38 != arg1) {
            field39 = !field39;
        }
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field42.length; var8++) {
                if (field42[var8] == var6) {
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
                    arg0.method282(var7);
                }
            } else if (var7 < 13) {
                arg0.method282((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method282((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method282(var4 << 4);
        }
    }

    @OriginalMember(owner = "AXMCEEOC", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method23(String arg0, boolean arg1) {
        field41.field954 = 0;
        if (arg1) {
            throw new NullPointerException();
        }
        method22(field41, -27732, arg0);
        int var2 = field41.field954;
        field41.field954 = 0;
        return method21(field41, 534, var2);
    }
}
