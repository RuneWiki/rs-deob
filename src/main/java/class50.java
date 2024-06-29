import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RJOTKPCV")
public class class50 {

    @OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "[C")
    public static char[] field1394 = new char[100];

    @OriginalMember(owner = "client!RJOTKPCV", name = "b", descriptor = "LFTMSICIZ;")
    private static class13 field1395 = new class13(new byte[100], (byte) 3);

    @OriginalMember(owner = "client!RJOTKPCV", name = "c", descriptor = "[C")
    private static char[] field1396 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "(ILFTMSICIZ;I)Ljava/lang/String;")
    public static String method442(int arg0, class13 arg1, int arg2) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method213();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1394[var3++] = field1396[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1394[var3++] = field1396[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1394[var3++] = field1396[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1394[var3++] = field1396[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1394[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1394[var7] = (char) (field1394[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1394, 0, var3);
    }

    @OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "(Ljava/lang/String;ILFTMSICIZ;)V")
    public static void method443(String arg0, int arg1, class13 arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1396.length; var8++) {
                if (field1396[var8] == var6) {
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
                    arg2.method203(var7);
                }
            } else if (var7 < 13) {
                arg2.method203((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method203((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (arg1 == 0 && var4 != -1) {
            arg2.method203(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!RJOTKPCV", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method444(String arg0, boolean arg1) {
        field1395.field643 = 0;
        method443(arg0, 0, field1395);
        int var2 = field1395.field643;
        if (!arg1) {
            throw new NullPointerException();
        }
        field1395.field643 = 0;
        return method442(0, field1395, var2);
    }
}
