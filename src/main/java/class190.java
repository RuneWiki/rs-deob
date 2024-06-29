import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class190 {

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2586 = method1646(method1645("\u0011]uP0"));

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2583 = -1;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public static final void method1644(int arg0, int arg1) {
        try {
            field2584++;
            if (arg1 != 0) {
                method1644(-114, -106);
            }
            class313 var2 = class196.method1670((long) arg0, 5, 95);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2586 + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1645(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1646(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
