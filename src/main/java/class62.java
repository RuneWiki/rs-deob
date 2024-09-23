import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VOWJQLLT")
public class class62 {

    @OriginalMember(owner = "VOWJQLLT", name = "a", descriptor = "Z")
    private static boolean field1346 = true;

    @OriginalMember(owner = "VOWJQLLT", name = "b", descriptor = "[C")
    public static char[] field1347 = new char[100];

    @OriginalMember(owner = "VOWJQLLT", name = "c", descriptor = "LXGRGMPUQ;")
    private static class69 field1348 = new class69(new byte[100], -82);

    @OriginalMember(owner = "VOWJQLLT", name = "d", descriptor = "[C")
    private static char[] field1349 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "VOWJQLLT", name = "a", descriptor = "(LXGRGMPUQ;II)Ljava/lang/String;")
    public static String method366(class69 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var10 = arg0.method465();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field1347[var3++] = field1349[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1347[var3++] = field1349[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field1347[var3++] = field1349[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field1347[var3++] = field1349[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        int var7 = 29 / arg1;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field1347[var8];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field1347[var8] = (char) (field1347[var8] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var6 = true;
            }
        }
        return new String(field1347, 0, var3);
    }

    @OriginalMember(owner = "VOWJQLLT", name = "a", descriptor = "(Ljava/lang/String;LXGRGMPUQ;Z)V")
    public static void method367(String arg0, class69 arg1, boolean arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1349.length; var8++) {
                if (field1349[var8] == var6) {
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
                    arg1.method455(var7);
                }
            } else if (var7 < 13) {
                arg1.method455((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method455((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (arg2 && var4 != -1) {
            arg1.method455(var4 << 4);
        }
    }

    @OriginalMember(owner = "VOWJQLLT", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method368(boolean arg0, String arg1) {
        field1348.field1652 = 0;
        method367(arg1, field1348, true);
        int var2 = field1348.field1652;
        field1348.field1652 = 0;
        if (!arg0) {
            throw new NullPointerException();
        }
        return method366(field1348, 7, var2);
    }
}
