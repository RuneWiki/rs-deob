import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PBQQFQEC")
public class class48 {

    @OriginalMember(owner = "PBQQFQEC", name = "a", descriptor = "I")
    private static int field1219 = 1;

    @OriginalMember(owner = "PBQQFQEC", name = "d", descriptor = "[C")
    public static char[] field1222 = new char[100];

    @OriginalMember(owner = "PBQQFQEC", name = "e", descriptor = "LXJCNBMKS;")
    private static class68 field1223 = new class68((byte) 9, new byte[100]);

    @OriginalMember(owner = "PBQQFQEC", name = "f", descriptor = "[C")
    private static char[] field1224 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "PBQQFQEC", name = "b", descriptor = "Z")
    private static boolean field1220;

    @OriginalMember(owner = "PBQQFQEC", name = "c", descriptor = "Z")
    private static boolean field1221;

    @OriginalMember(owner = "PBQQFQEC", name = "a", descriptor = "(ZILXJCNBMKS;)Ljava/lang/String;")
    public static String method397(boolean arg0, int arg1, class68 arg2) {
        int var3 = 0;
        int var4 = -1;
        if (arg0) {
            field1219 = 291;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method534();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1222[var3++] = field1224[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1222[var3++] = field1224[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1222[var3++] = field1224[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1222[var3++] = field1224[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1222[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1222[var7] = (char) (field1222[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1222, 0, var3);
    }

    @OriginalMember(owner = "PBQQFQEC", name = "a", descriptor = "(LXJCNBMKS;ZLjava/lang/String;)V")
    public static void method398(class68 arg0, boolean arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg1) {
            return;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1224.length; var8++) {
                if (field1224[var8] == var6) {
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
                    arg0.method524(var7);
                }
            } else if (var7 < 13) {
                arg0.method524((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method524((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method524(var4 << 4);
        }
    }

    @OriginalMember(owner = "PBQQFQEC", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method399(String arg0, int arg1) {
        field1223.field1643 = 0;
        method398(field1223, field1221, arg0);
        int var2 = field1223.field1643;
        field1223.field1643 = 0;
        if (arg1 != 0) {
            field1219 = -389;
        }
        return method397(field1220, var2, field1223);
    }
}
