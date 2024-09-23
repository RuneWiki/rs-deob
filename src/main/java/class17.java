import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GVESONCD")
public class class17 {

    @OriginalMember(owner = "GVESONCD", name = "a", descriptor = "Z")
    private static boolean field844 = true;

    @OriginalMember(owner = "GVESONCD", name = "b", descriptor = "I")
    private static int field845 = 4;

    @OriginalMember(owner = "GVESONCD", name = "c", descriptor = "[C")
    public static char[] field846 = new char[100];

    @OriginalMember(owner = "GVESONCD", name = "d", descriptor = "LMLYYHULT;")
    private static class30 field847 = new class30(true, new byte[100]);

    @OriginalMember(owner = "GVESONCD", name = "e", descriptor = "[C")
    private static char[] field848 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "GVESONCD", name = "a", descriptor = "(ILMLYYHULT;I)Ljava/lang/String;")
    public static String method245(int arg0, class30 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method296();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field846[var3++] = field848[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field846[var3++] = field848[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field846[var3++] = field848[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field846[var3++] = field848[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field846[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field846[var7] = (char) (field846[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field846, 0, var3);
    }

    @OriginalMember(owner = "GVESONCD", name = "a", descriptor = "(ILjava/lang/String;LMLYYHULT;)V")
    public static void method246(int arg0, String arg1, class30 arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        if (arg0 <= 0) {
            field844 = !field844;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field848.length; var8++) {
                if (field848[var8] == var6) {
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
                    arg2.method286(var7);
                }
            } else if (var7 < 13) {
                arg2.method286((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method286((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method286(var4 << 4);
        }
    }

    @OriginalMember(owner = "GVESONCD", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method247(int arg0, String arg1) {
        field847.field1092 = 0;
        method246(652, arg1, field847);
        int var2 = field847.field1092;
        if (arg0 != 0) {
            field845 = -304;
        }
        field847.field1092 = 0;
        return method245(0, field847, var2);
    }
}
