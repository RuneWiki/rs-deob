import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("REROLFNU")
public class class50 {

    @OriginalMember(owner = "REROLFNU", name = "a", descriptor = "Z")
    private static boolean field1288 = true;

    @OriginalMember(owner = "REROLFNU", name = "b", descriptor = "B")
    private static byte field1289 = 1;

    @OriginalMember(owner = "REROLFNU", name = "c", descriptor = "Z")
    private static boolean field1290 = true;

    @OriginalMember(owner = "REROLFNU", name = "d", descriptor = "[C")
    public static char[] field1291 = new char[100];

    @OriginalMember(owner = "REROLFNU", name = "e", descriptor = "LDNRIFKTO;")
    private static class11 field1292 = new class11(new byte[100], field1288);

    @OriginalMember(owner = "REROLFNU", name = "f", descriptor = "[C")
    private static char[] field1293 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "REROLFNU", name = "a", descriptor = "(BILDNRIFKTO;)Ljava/lang/String;")
    public static String method398(byte arg0, int arg1, class11 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method189();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1291[var3++] = field1293[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1291[var3++] = field1293[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1291[var3++] = field1293[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1291[var3++] = field1293[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (field1289 != arg0) {
            field1290 = !field1290;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1291[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1291[var7] = (char) (field1291[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1291, 0, var3);
    }

    @OriginalMember(owner = "REROLFNU", name = "a", descriptor = "(Ljava/lang/String;ZLDNRIFKTO;)V")
    public static void method399(String arg0, boolean arg1, class11 arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (!arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field1293.length; var9++) {
                if (field1293[var9] == var7) {
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
                    arg2.method179(var8);
                }
            } else if (var8 < 13) {
                arg2.method179((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg2.method179((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg2.method179(var5 << 4);
        }
    }

    @OriginalMember(owner = "REROLFNU", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method400(boolean arg0, String arg1) {
        field1292.field643 = 0;
        method399(arg1, true, field1292);
        if (arg0) {
            throw new NullPointerException();
        }
        int var2 = field1292.field643;
        field1292.field643 = 0;
        return method398((byte) 1, var2, field1292);
    }
}
