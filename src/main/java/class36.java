import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ODNKXAVL")
public class class36 {

    @OriginalMember(owner = "ODNKXAVL", name = "a", descriptor = "I")
    private static int field1183 = -302;

    @OriginalMember(owner = "ODNKXAVL", name = "b", descriptor = "Z")
    private static boolean field1184 = true;

    @OriginalMember(owner = "ODNKXAVL", name = "c", descriptor = "[C")
    public static char[] field1185 = new char[100];

    @OriginalMember(owner = "ODNKXAVL", name = "d", descriptor = "LZOMNSJJM;")
    private static class69 field1186 = new class69(new byte[100], field1183);

    @OriginalMember(owner = "ODNKXAVL", name = "e", descriptor = "[C")
    private static char[] field1187 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ODNKXAVL", name = "a", descriptor = "(LZOMNSJJM;IZ)Ljava/lang/String;")
    public static String method366(class69 arg0, int arg1, boolean arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method547();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1185[var3++] = field1187[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1185[var3++] = field1187[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1185[var3++] = field1187[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1185[var3++] = field1187[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1185[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1185[var7] = (char) (field1185[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (!arg2) {
            field1183 = -298;
        }
        return new String(field1185, 0, var3);
    }

    @OriginalMember(owner = "ODNKXAVL", name = "a", descriptor = "(Ljava/lang/String;LZOMNSJJM;Z)V")
    public static void method367(String arg0, class69 arg1, boolean arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field1187.length; var9++) {
                if (field1187[var9] == var7) {
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
                    arg1.method537(var8);
                }
            } else if (var8 < 13) {
                arg1.method537((var4 << 4) + var8);
                var4 = -1;
            } else {
                arg1.method537((var4 << 4) + (var8 >> 4));
                var4 = var8 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method537(var4 << 4);
        }
    }

    @OriginalMember(owner = "ODNKXAVL", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method368(String arg0, byte arg1) {
        field1186.field1700 = 0;
        method367(arg0, field1186, false);
        int var2 = field1186.field1700;
        field1186.field1700 = 0;
        String var3 = method366(field1186, var2, field1184);
        if (arg1 != -88) {
            throw new NullPointerException();
        }
        return var3;
    }
}
