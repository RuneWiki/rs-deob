import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JFSYEOAW")
public class class30 {

    @OriginalMember(owner = "JFSYEOAW", name = "a", descriptor = "I")
    private static int field879 = -642;

    @OriginalMember(owner = "JFSYEOAW", name = "b", descriptor = "I")
    private static int field880 = -63;

    @OriginalMember(owner = "JFSYEOAW", name = "c", descriptor = "[C")
    public static char[] field881 = new char[100];

    @OriginalMember(owner = "JFSYEOAW", name = "d", descriptor = "LJHKSAGUC;")
    private static class31 field882 = new class31(new byte[100], 8);

    @OriginalMember(owner = "JFSYEOAW", name = "e", descriptor = "[C")
    private static char[] field883 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "JFSYEOAW", name = "a", descriptor = "(IZLJHKSAGUC;)Ljava/lang/String;")
    public static String method291(int arg0, boolean arg1, class31 arg2) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var10 = arg2.method306();
            int var11 = var10 >> 4 & 0xF;
            if (var5 != -1) {
                field881[var4++] = field883[(var5 << 4) + var11 - 195];
                var5 = -1;
            } else if (var11 < 13) {
                field881[var4++] = field883[var11];
            } else {
                var5 = var11;
            }
            int var12 = var10 & 0xF;
            if (var5 != -1) {
                field881[var4++] = field883[(var5 << 4) + var12 - 195];
                var5 = -1;
            } else if (var12 < 13) {
                field881[var4++] = field883[var12];
            } else {
                var5 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            char var9 = field881[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field881[var8] = (char) (field881[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field881, 0, var4);
    }

    @OriginalMember(owner = "JFSYEOAW", name = "a", descriptor = "(LJHKSAGUC;ILjava/lang/String;)V")
    public static void method292(class31 arg0, int arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg1 != 10246) {
            field879 = -429;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field883.length; var8++) {
                if (field883[var8] == var6) {
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
                    arg0.method296(var7);
                }
            } else if (var7 < 13) {
                arg0.method296((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method296((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method296(var4 << 4);
        }
    }

    @OriginalMember(owner = "JFSYEOAW", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method293(int arg0, String arg1) {
        field882.field901 = 0;
        method292(field882, 10246, arg1);
        int var2 = field882.field901;
        field882.field901 = 0;
        if (arg0 <= 0) {
            field880 = 85;
        }
        return method291(var2, true, field882);
    }
}
