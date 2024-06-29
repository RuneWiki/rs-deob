import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SLOJMIHA")
public class class50 {

    @OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "[C")
    public static char[] field1403 = new char[100];

    @OriginalMember(owner = "client!SLOJMIHA", name = "b", descriptor = "LLBBVYYXO;")
    private static class32 field1404 = new class32((byte) 114, new byte[100]);

    @OriginalMember(owner = "client!SLOJMIHA", name = "c", descriptor = "[C")
    private static char[] field1405 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "(LLBBVYYXO;II)Ljava/lang/String;")
    public static String method523(class32 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var10 = arg0.method369();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field1403[var3++] = field1405[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1403[var3++] = field1405[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field1403[var3++] = field1405[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field1403[var3++] = field1405[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        int var7 = 56 / arg1;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field1403[var8];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field1403[var8] = (char) (field1403[var8] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var6 = true;
            }
        }
        return new String(field1403, 0, var3);
    }

    @OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "(Ljava/lang/String;LLBBVYYXO;Z)V")
    public static void method524(String arg0, class32 arg1, boolean arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg2) {
            return;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1405.length; var8++) {
                if (field1405[var8] == var6) {
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
                    arg1.method359(var7);
                }
            } else if (var7 < 13) {
                arg1.method359((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method359((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method359(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!SLOJMIHA", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method525(String arg0, int arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        field1404.field1032 = 0;
        method524(arg0, field1404, false);
        int var2 = field1404.field1032;
        field1404.field1032 = 0;
        return method523(field1404, 555, var2);
    }
}
