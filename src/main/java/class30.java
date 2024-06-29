import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KJZMDELZ")
public class class30 {

    @OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "Z")
    private static boolean field935 = true;

    @OriginalMember(owner = "client!KJZMDELZ", name = "b", descriptor = "[C")
    public static char[] field936 = new char[100];

    @OriginalMember(owner = "client!KJZMDELZ", name = "c", descriptor = "LWNCFPLWV;")
    private static class63 field937 = new class63((byte) -58, new byte[100]);

    @OriginalMember(owner = "client!KJZMDELZ", name = "d", descriptor = "[C")
    private static char[] field938 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "(ILWNCFPLWV;I)Ljava/lang/String;")
    public static String method320(int arg0, class63 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg1.method502();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field936[var3++] = field938[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field936[var3++] = field938[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field936[var3++] = field938[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field936[var3++] = field938[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg2 != -21362) {
            field935 = !field935;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field936[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field936[var7] = (char) (field936[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field936, 0, var3);
    }

    @OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "(Ljava/lang/String;LWNCFPLWV;B)V")
    public static void method321(String arg0, class63 arg1, byte arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        if (arg2 != 109) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field938.length; var9++) {
                if (field938[var9] == var7) {
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
                    arg1.method492(var8);
                }
            } else if (var8 < 13) {
                arg1.method492((var4 << 4) + var8);
                var4 = -1;
            } else {
                arg1.method492((var4 << 4) + (var8 >> 4));
                var4 = var8 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method492(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!KJZMDELZ", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method322(String arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        field937.field1571 = 0;
        method321(arg0, field937, (byte) 109);
        int var2 = field937.field1571;
        field937.field1571 = 0;
        return method320(var2, field937, -21362);
    }
}
