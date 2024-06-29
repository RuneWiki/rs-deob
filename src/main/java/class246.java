import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class246 {

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3759 = new String[] { method2090(method2089("]5;*")), method2090(method2089("Hnyh,")), method2090(method2089("U!y\u0007y")) };

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3756 = 0;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lraa;")
    public class633 field3755;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIILha;)V")
    public static final void method2088(byte arg0, int arg1, int arg2, class66 arg3) {
        try {
            class324.field5123 = new class338[arg2][arg1];
            class198.field3097 = arg3;
            int var4 = -111 % ((35 - arg0) / 35);
            field3758++;
            if (class572.field8459 != null) {
                class72.field795 = class592.method4413(class572.field8459[4], 63, class572.field8459[1], class572.field8459[5], class572.field8459[3], class572.field8459[0], class572.field8459[2]);
            }
            class719.field10409 = new class338();
            class238.method2041((byte) -43);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3759[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3759[0] : field3759[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2089(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2090(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
