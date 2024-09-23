import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EDPSKMQR")
public class class18 {

    @OriginalMember(owner = "EDPSKMQR", name = "a", descriptor = "Z")
    private static boolean field662 = true;

    @OriginalMember(owner = "EDPSKMQR", name = "b", descriptor = "[C")
    public static char[] field663 = new char[100];

    @OriginalMember(owner = "EDPSKMQR", name = "c", descriptor = "LCFARFRSG;")
    private static class8 field664 = new class8(new byte[100], 792);

    @OriginalMember(owner = "EDPSKMQR", name = "d", descriptor = "[C")
    private static char[] field665 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "EDPSKMQR", name = "a", descriptor = "(IILCFARFRSG;)Ljava/lang/String;")
    public static String method267(int arg0, int arg1, class8 arg2) {
        label66: while (true) {
            if (arg0 >= 0) {
                int var12 = 1;
                while (true) {
                    if (var12 <= 0) {
                        continue label66;
                    }
                    var12++;
                }
            }
            int var3 = 0;
            int var4 = -1;
            for (int var5 = 0; var5 < arg1; var5++) {
                int var9 = arg2.method30();
                int var10 = var9 >> 4 & 0xF;
                if (var4 != -1) {
                    field663[var3++] = field665[(var4 << 4) + var10 - 195];
                    var4 = -1;
                } else if (var10 < 13) {
                    field663[var3++] = field665[var10];
                } else {
                    var4 = var10;
                }
                int var11 = var9 & 0xF;
                if (var4 != -1) {
                    field663[var3++] = field665[(var4 << 4) + var11 - 195];
                    var4 = -1;
                } else if (var11 < 13) {
                    field663[var3++] = field665[var11];
                } else {
                    var4 = var11;
                }
            }
            boolean var6 = true;
            for (int var7 = 0; var7 < var3; var7++) {
                char var8 = field663[var7];
                if (var6 && var8 >= 'a' && var8 <= 'z') {
                    field663[var7] = (char) (field663[var7] - 32);
                    var6 = false;
                }
                if (var8 == '.' || var8 == '!' || var8 == '?') {
                    var6 = true;
                }
            }
            return new String(field663, 0, var3);
        }
    }

    @OriginalMember(owner = "EDPSKMQR", name = "a", descriptor = "(Ljava/lang/String;BLCFARFRSG;)V")
    public static void method268(String arg0, byte arg1, class8 arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        if (arg1 == 6) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < var3.length(); var7++) {
            char var8 = var3.charAt(var7);
            int var9 = 0;
            for (int var10 = 0; var10 < field665.length; var10++) {
                if (field665[var10] == var8) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 > 12) {
                var9 += 195;
            }
            if (var4 == -1) {
                if (var9 < 13) {
                    var4 = var9;
                } else {
                    arg2.method20(var9);
                }
            } else if (var9 < 13) {
                arg2.method20((var4 << 4) + var9);
                var4 = -1;
            } else {
                arg2.method20((var4 << 4) + (var9 >> 4));
                var4 = var9 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method20(var4 << 4);
        }
    }

    @OriginalMember(owner = "EDPSKMQR", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method269(int arg0, String arg1) {
        if (arg0 >= 0) {
            field662 = !field662;
        }
        field664.field72 = 0;
        method268(arg1, (byte) 6, field664);
        int var2 = field664.field72;
        field664.field72 = 0;
        return method267(-916, var2, field664);
    }
}
