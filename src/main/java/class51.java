import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SQKAIUXX")
public class class51 {

    @OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "I")
    private static int field1322 = 536;

    @OriginalMember(owner = "client!SQKAIUXX", name = "b", descriptor = "Z")
    private static boolean field1323 = true;

    @OriginalMember(owner = "client!SQKAIUXX", name = "c", descriptor = "I")
    private static int field1324 = -648;

    @OriginalMember(owner = "client!SQKAIUXX", name = "d", descriptor = "I")
    private static int field1325 = 31203;

    @OriginalMember(owner = "client!SQKAIUXX", name = "e", descriptor = "[C")
    public static char[] field1326 = new char[100];

    @OriginalMember(owner = "client!SQKAIUXX", name = "f", descriptor = "LCMGGUSPR;")
    private static class10 field1327 = new class10(new byte[100], field1322);

    @OriginalMember(owner = "client!SQKAIUXX", name = "g", descriptor = "[C")
    private static char[] field1328 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "(ILCMGGUSPR;Z)Ljava/lang/String;")
    public static String method444(int arg0, class10 arg1, boolean arg2) {
        int var3 = 0;
        int var4 = -1;
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var10 = arg1.method194();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field1326[var3++] = field1328[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1326[var3++] = field1328[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field1326[var3++] = field1328[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field1326[var3++] = field1328[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field1326[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field1326[var8] = (char) (field1326[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field1326, 0, var3);
    }

    @OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "(LCMGGUSPR;Ljava/lang/String;I)V")
    public static void method445(class10 arg0, String arg1, int arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        if (arg2 != 0) {
            field1324 = 30;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1328.length; var8++) {
                if (field1328[var8] == var6) {
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
                    arg0.method184(var7);
                }
            } else if (var7 < 13) {
                arg0.method184((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method184((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method184(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!SQKAIUXX", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method446(String arg0, int arg1) {
        field1327.field646 = 0;
        method445(field1327, arg0, 0);
        int var2 = field1327.field646;
        field1327.field646 = 0;
        String var3 = method444(var2, field1327, field1323);
        if (arg1 >= 0) {
            field1325 = 82;
        }
        return var3;
    }
}
