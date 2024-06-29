import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class128 {

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1844 = new String[] { method1232(method1231("\u0001n\u0005\u001e\u001cE")), method1232(method1231("\u0001n\u0005\u001e\u001fE")) };

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Lhl;")
    public static class556 field1841 = new class556(12, -2);

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V", line = 3)
    public static void method1229(int arg0) {
        try {
            field1841 = null;
            if (arg0 != 16383) {
                method1230(false, -11, 27, 68, -72, -88, -64, 73);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1844[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIIIIIII)V", line = 15)
    public static final void method1230(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field1840++;
            int var8 = arg1 - 334;
            if (!arg0) {
                if (var8 < 0) {
                    var8 = 0;
                } else if (var8 > 100) {
                    var8 = 100;
                }
                int var9 = class274.field4400 + ((class112.field1572 - class274.field4400) * var8 / 100);
                class547.field8042 = class547.field8037 * var9 >> 8;
                int var17 = arg4 * var9 >> 8;
                int var10 = 16384 - arg2 & 0x3FFF;
                int var11 = 16384 - arg6 & 0x3FFF;
                int var12 = 0;
                int var13 = 0;
                int var14 = var17;
                if (var10 != 0) {
                    var13 = class763.field11199[var10] * -var17 >> 14;
                    var14 = class763.field11200[var10] * var17 >> 14;
                }
                if (var11 != 0) {
                    var12 = class763.field11199[var11] * var14 >> 14;
                    var14 = class763.field11200[var11] * var14 >> 14;
                }
                class554.field8109 = 0;
                class791.field11550 = arg7 - var12;
                class728.field10661 = arg6;
                class396.field6285 = arg3 - var13;
                class134.field1902 = arg2;
                class133.field1896 = arg5 - var14;
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field1844[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1231(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1232(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
