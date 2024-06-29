import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BOHPYYUF")
public class class7 {

    @OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "Z")
    private static boolean field106 = true;

    @OriginalMember(owner = "client!BOHPYYUF", name = "b", descriptor = "[C")
    public static char[] field107 = new char[100];

    @OriginalMember(owner = "client!BOHPYYUF", name = "c", descriptor = "LRSWRPCHR;")
    private static class50 field108 = new class50(new byte[100], -46859);

    @OriginalMember(owner = "client!BOHPYYUF", name = "d", descriptor = "[C")
    private static char[] field109 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "(LRSWRPCHR;IB)Ljava/lang/String;")
    public static String method17(class50 arg0, int arg1, byte arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method388();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field107[var3++] = field109[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field107[var3++] = field109[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field107[var3++] = field109[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field107[var3++] = field109[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg2 != 14) {
            throw new NullPointerException();
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field107[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field107[var7] = (char) (field107[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field107, 0, var3);
    }

    @OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "(ILRSWRPCHR;Ljava/lang/String;)V")
    public static void method18(int arg0, class50 arg1, String arg2) {
        while (arg0 >= 0) {
            field106 = !field106;
        }
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field109.length; var8++) {
                if (field109[var8] == var6) {
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
                    arg1.method378(var7);
                }
            } else if (var7 < 13) {
                arg1.method378((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method378((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method378(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!BOHPYYUF", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method19(boolean arg0, String arg1) {
        field108.field1225 = 0;
        if (arg0) {
            throw new NullPointerException();
        }
        method18(-438, field108, arg1);
        int var2 = field108.field1225;
        field108.field1225 = 0;
        return method17(field108, var2, (byte) 14);
    }
}
