import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FBVMIMMU")
public class class16 {

    @OriginalMember(owner = "FBVMIMMU", name = "a", descriptor = "[C")
    public static char[] field704 = new char[100];

    @OriginalMember(owner = "FBVMIMMU", name = "b", descriptor = "LMQZHAILV;")
    private static class33 field705 = new class33(true, new byte[100]);

    @OriginalMember(owner = "FBVMIMMU", name = "c", descriptor = "[C")
    private static char[] field706 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "FBVMIMMU", name = "a", descriptor = "(IILMQZHAILV;)Ljava/lang/String;")
    public static String method230(int arg0, int arg1, class33 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var10 = arg2.method325();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field704[var3++] = field706[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field704[var3++] = field706[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field704[var3++] = field706[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field704[var3++] = field706[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var9 = field704[var7];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field704[var7] = (char) (field704[var7] - 32);
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
        return new String(field704, 0, var3);
    }

    @OriginalMember(owner = "FBVMIMMU", name = "a", descriptor = "(ILjava/lang/String;LMQZHAILV;)V")
    public static void method231(int arg0, String arg1, class33 arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        int var5 = 86 / arg0;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field706.length; var9++) {
                if (field706[var9] == var7) {
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
                    arg2.method315(var8);
                }
            } else if (var8 < 13) {
                arg2.method315((var4 << 4) + var8);
                var4 = -1;
            } else {
                arg2.method315((var4 << 4) + (var8 >> 4));
                var4 = var8 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method315(var4 << 4);
        }
    }

    @OriginalMember(owner = "FBVMIMMU", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method232(String arg0, int arg1) {
        field705.field945 = 0;
        method231(564, arg0, field705);
        int var2 = field705.field945;
        field705.field945 = 0;
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        return method230(-838, var2, field705);
    }
}
