import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IWFUJXTN")
public class class29 {

    @OriginalMember(owner = "client!IWFUJXTN", name = "b", descriptor = "I")
    private static int field1062 = -18411;

    @OriginalMember(owner = "client!IWFUJXTN", name = "c", descriptor = "I")
    private static int field1063 = 7;

    @OriginalMember(owner = "client!IWFUJXTN", name = "d", descriptor = "I")
    private static int field1064 = 48;

    @OriginalMember(owner = "client!IWFUJXTN", name = "e", descriptor = "[C")
    public static char[] field1065 = new char[100];

    @OriginalMember(owner = "client!IWFUJXTN", name = "f", descriptor = "LWBEWPIXO;")
    private static class58 field1066 = new class58((byte) -115, new byte[100]);

    @OriginalMember(owner = "client!IWFUJXTN", name = "g", descriptor = "[C")
    private static char[] field1067 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "Z")
    private static boolean field1061;

    @OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "(IZLWBEWPIXO;)Ljava/lang/String;")
    public static String method297(int arg0, boolean arg1, class58 arg2) {
        if (arg1) {
            throw new NullPointerException();
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.method515();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1065[var3++] = field1067[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1065[var3++] = field1067[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1065[var3++] = field1067[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1065[var3++] = field1067[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1065[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1065[var7] = (char) (field1065[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1065, 0, var3);
    }

    @OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "(ILWBEWPIXO;Ljava/lang/String;)V")
    public static void method298(int arg0, class58 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg0 != -18411) {
            field1064 = -59;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1067.length; var8++) {
                if (field1067[var8] == var6) {
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
                    arg1.method505(var7);
                }
            } else if (var7 < 13) {
                arg1.method505((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method505((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method505(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!IWFUJXTN", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method299(String arg0, int arg1) {
        field1066.field1615 = 0;
        method298(field1062, field1066, arg0);
        int var2 = field1066.field1615;
        field1066.field1615 = 0;
        String var3 = method297(var2, false, field1066);
        if (arg1 < field1063 || arg1 > field1063) {
            field1061 = !field1061;
        }
        return var3;
    }
}
