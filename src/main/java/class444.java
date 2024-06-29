import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class444 {

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6918 = new String[] { method3478(method3477("\u001fRAy$Z")), method3478(method3477("\u001cEL;")), method3478(method3477("\t\u001e\u000ey\u001b")), method3478(method3477("\u001fRAy'Z")) };

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "Lat;")
    public static class398 field6914 = new class398();

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "Z")
    public static boolean field6917 = false;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Lvn;")
    public static class330 field6916 = new class330(61, -1);

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
    public static void method3475(int arg0) {
        try {
            field6916 = null;
            if (arg0 != 10) {
                field6914 = null;
            }
            field6914 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6918[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method3476(char arg0, int arg1, String arg2) {
        try {
            field6915++;
            int var3 = class513.method3853(arg0, 0, arg2);
            String[] var4 = new String[var3 + 1];
            int var5 = 0;
            int var6 = 0;
            if (arg1 != 11206) {
                method3476('V', 22, null);
            }
            for (int var7 = 0; var7 < var3; var7++) {
                int var8;
                for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
                }
                var4[var5++] = arg2.substring(var6, var8);
                var6 = var8 + 1;
            }
            var4[var3] = arg2.substring(var6);
            return var4;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field6918[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6918[1] : field6918[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3477(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3478(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
