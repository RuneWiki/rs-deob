import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class206 {

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field3022 = method1761(method1760("B\"y\u0015\u0012"));

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Lmv;")
    public static class125 field3021 = new class125(3, -1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 4)
    public static void method1759(int arg0) {
        try {
            if (arg0 == 3) {
                field3021 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3022 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1760(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!id", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1761(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
