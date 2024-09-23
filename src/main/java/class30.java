import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LSYVWAVF")
public class class30 {

    @OriginalMember(owner = "LSYVWAVF", name = "a", descriptor = "I")
    private static int field1051 = 897;

    @OriginalMember(owner = "LSYVWAVF", name = "b", descriptor = "Z")
    private static boolean field1052 = true;

    @OriginalMember(owner = "LSYVWAVF", name = "c", descriptor = "[C")
    public static char[] field1053 = new char[100];

    @OriginalMember(owner = "LSYVWAVF", name = "d", descriptor = "LNHEPCMLW;")
    private static class35 field1054 = new class35((byte) -103, new byte[100]);

    @OriginalMember(owner = "LSYVWAVF", name = "e", descriptor = "[C")
    private static char[] field1055 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "LSYVWAVF", name = "a", descriptor = "(IZLNHEPCMLW;)Ljava/lang/String;")
    public static String method331(int arg0, boolean arg1, class35 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.method349();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1053[var3++] = field1055[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1053[var3++] = field1055[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1053[var3++] = field1055[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1053[var3++] = field1055[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1053[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1053[var7] = (char) (field1053[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (!arg1) {
            field1052 = !field1052;
        }
        return new String(field1053, 0, var3);
    }

    @OriginalMember(owner = "LSYVWAVF", name = "a", descriptor = "(ILNHEPCMLW;Ljava/lang/String;)V")
    public static void method332(int arg0, class35 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg0 < 6 || arg0 > 6) {
            field1051 = -495;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1055.length; var8++) {
                if (field1055[var8] == var6) {
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
                    arg1.method339(var7);
                }
            } else if (var7 < 13) {
                arg1.method339((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method339((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method339(var4 << 4);
        }
    }

    @OriginalMember(owner = "LSYVWAVF", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method333(int arg0, String arg1) {
        field1054.field1107 = 0;
        method332(6, field1054, arg1);
        int var2 = field1054.field1107;
        field1054.field1107 = 0;
        if (arg0 != 0) {
            field1052 = !field1052;
        }
        return method331(var2, true, field1054);
    }
}
