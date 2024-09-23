import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QFWDHRAY")
public class class41 {

    @OriginalMember(owner = "QFWDHRAY", name = "a", descriptor = "I")
    private static int field1362 = 810;

    @OriginalMember(owner = "QFWDHRAY", name = "b", descriptor = "[C")
    public static char[] field1363 = new char[100];

    @OriginalMember(owner = "QFWDHRAY", name = "c", descriptor = "LGHHPHSRU;")
    private static class14 field1364 = new class14(-527, new byte[100]);

    @OriginalMember(owner = "QFWDHRAY", name = "d", descriptor = "[C")
    private static char[] field1365 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "QFWDHRAY", name = "a", descriptor = "(ILGHHPHSRU;I)Ljava/lang/String;")
    public static String method464(int arg0, class14 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method202();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1363[var3++] = field1365[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1363[var3++] = field1365[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1363[var3++] = field1365[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1363[var3++] = field1365[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1363[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1363[var7] = (char) (field1363[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1363, 0, var3);
    }

    @OriginalMember(owner = "QFWDHRAY", name = "a", descriptor = "(Ljava/lang/String;LGHHPHSRU;B)V")
    public static void method465(String arg0, class14 arg1, byte arg2) {
        if (arg2 != 9) {
            return;
        }
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1365.length; var8++) {
                if (field1365[var8] == var6) {
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
                    arg1.method192(var7);
                }
            } else if (var7 < 13) {
                arg1.method192((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method192((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method192(var4 << 4);
        }
    }

    @OriginalMember(owner = "QFWDHRAY", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method466(int arg0, String arg1) {
        field1364.field769 = 0;
        method465(arg1, field1364, (byte) 9);
        int var2 = field1364.field769;
        int var3 = 97 / arg0;
        field1364.field769 = 0;
        return method464(-375, field1364, var2);
    }
}
