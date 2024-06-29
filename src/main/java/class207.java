import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class207 {

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3186 = new String[] { method1833(method1832("O\"(hG")), method1833(method1832("O\"(kG")) };

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lqha;")
    public static class112 field3184 = new class112(64);

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1830(byte arg0) {
        try {
            if (arg0 <= 120) {
                field3184 = null;
            }
            field3184 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3186[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    public static final int method1831(int arg0, int arg1, int arg2) {
        try {
            field3185++;
            int var3 = class326.method2764(arg1 + 91923, (byte) -122, arg2 + 45365, arg0) + (class326.method2764(arg1 + 37821, (byte) -31, arg2 + 10294, 2) - 128 >> 1) + (class326.method2764(arg1, (byte) -119, arg2, 1) + -128 >> 2) - 128;
            int var4 = (int) ((double) var3 * 0.3D) + 35;
            if (var4 < 10) {
                var4 = 10;
            } else if (var4 > 60) {
                var4 = 60;
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3186[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1832(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1833(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
