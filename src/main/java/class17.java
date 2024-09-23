import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EEXPPJJP")
public class class17 {

    @OriginalMember(owner = "EEXPPJJP", name = "b", descriptor = "[C")
    public static char[] field722 = new char[100];

    @OriginalMember(owner = "EEXPPJJP", name = "c", descriptor = "LYOXDZEVD;")
    private static class68 field723 = new class68(new byte[100], -103);

    @OriginalMember(owner = "EEXPPJJP", name = "d", descriptor = "[C")
    private static char[] field724 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "EEXPPJJP", name = "a", descriptor = "Z")
    private static boolean field721;

    @OriginalMember(owner = "EEXPPJJP", name = "a", descriptor = "(LYOXDZEVD;II)Ljava/lang/String;")
    public static String method199(class68 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg0.method549();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field722[var3++] = field724[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field722[var3++] = field724[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field722[var3++] = field724[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field722[var3++] = field724[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field722[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field722[var7] = (char) (field722[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return new String(field722, 0, var3);
    }

    @OriginalMember(owner = "EEXPPJJP", name = "a", descriptor = "(LYOXDZEVD;BLjava/lang/String;)V")
    public static void method200(class68 arg0, byte arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg1 != 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field724.length; var9++) {
                if (field724[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var5 == -1) {
                if (var8 < 13) {
                    var5 = var8;
                } else {
                    arg0.method539(var8);
                }
            } else if (var8 < 13) {
                arg0.method539((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg0.method539((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg0.method539(var5 << 4);
        }
    }

    @OriginalMember(owner = "EEXPPJJP", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method201(int arg0, String arg1) {
        field723.field1612 = 0;
        method200(field723, (byte) 5, arg1);
        if (arg0 >= 0) {
            field721 = !field721;
        }
        int var2 = field723.field1612;
        field723.field1612 = 0;
        return method199(field723, -291, var2);
    }
}
