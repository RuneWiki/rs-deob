import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EEYZEKLH")
public class class15 {

    @OriginalMember(owner = "EEYZEKLH", name = "a", descriptor = "Z")
    private static boolean field656 = true;

    @OriginalMember(owner = "EEYZEKLH", name = "b", descriptor = "Z")
    private static boolean field657 = true;

    @OriginalMember(owner = "EEYZEKLH", name = "c", descriptor = "[C")
    public static char[] field658 = new char[100];

    @OriginalMember(owner = "EEYZEKLH", name = "d", descriptor = "LXOUQUKZW;")
    private static class62 field659 = new class62(-417, new byte[100]);

    @OriginalMember(owner = "EEYZEKLH", name = "e", descriptor = "[C")
    private static char[] field660 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "EEYZEKLH", name = "a", descriptor = "(LXOUQUKZW;IB)Ljava/lang/String;")
    public static String method216(class62 arg0, int arg1, byte arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method521();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field658[var3++] = field660[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field658[var3++] = field660[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field658[var3++] = field660[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field658[var3++] = field660[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg2 != 106) {
            field656 = !field656;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field658[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field658[var7] = (char) (field658[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field658, 0, var3);
    }

    @OriginalMember(owner = "EEYZEKLH", name = "a", descriptor = "(ZLjava/lang/String;LXOUQUKZW;)V")
    public static void method217(boolean arg0, String arg1, class62 arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field660.length; var8++) {
                if (field660[var8] == var6) {
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
                    arg2.method511(var7);
                }
            } else if (var7 < 13) {
                arg2.method511((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method511((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method511(var4 << 4);
        }
    }

    @OriginalMember(owner = "EEYZEKLH", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method218(boolean arg0, String arg1) {
        field659.field1579 = 0;
        if (!arg0) {
            field657 = !field657;
        }
        method217(false, arg1, field659);
        int var2 = field659.field1579;
        field659.field1579 = 0;
        return method216(field659, var2, (byte) 106);
    }
}
