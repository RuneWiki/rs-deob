import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IDJBPKZF")
public class class28 {

    @OriginalMember(owner = "IDJBPKZF", name = "a", descriptor = "Z")
    private static boolean field1045 = true;

    @OriginalMember(owner = "IDJBPKZF", name = "b", descriptor = "[C")
    public static char[] field1046 = new char[100];

    @OriginalMember(owner = "IDJBPKZF", name = "c", descriptor = "LCKBTFRZM;")
    private static class5 field1047 = new class5(2, new byte[100]);

    @OriginalMember(owner = "IDJBPKZF", name = "d", descriptor = "[C")
    private static char[] field1048 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "IDJBPKZF", name = "a", descriptor = "(ILCKBTFRZM;I)Ljava/lang/String;")
    public static String method379(int arg0, class5 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var10 = arg1.method44();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field1046[var3++] = field1048[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1046[var3++] = field1048[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field1046[var3++] = field1048[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field1046[var3++] = field1048[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        if (arg2 != -21407) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field1046[var8];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field1046[var8] = (char) (field1046[var8] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var6 = true;
            }
        }
        return new String(field1046, 0, var3);
    }

    @OriginalMember(owner = "IDJBPKZF", name = "a", descriptor = "(Ljava/lang/String;LCKBTFRZM;I)V")
    public static void method380(String arg0, class5 arg1, int arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg2 != 42660) {
            field1045 = !field1045;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1048.length; var8++) {
                if (field1048[var8] == var6) {
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
                    arg1.method34(var7);
                }
            } else if (var7 < 13) {
                arg1.method34((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method34((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method34(var4 << 4);
        }
    }

    @OriginalMember(owner = "IDJBPKZF", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method381(int arg0, String arg1) {
        field1047.field123 = 0;
        method380(arg1, field1047, 42660);
        int var2 = field1047.field123;
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1047.field123 = 0;
        return method379(var2, field1047, -21407);
    }
}
