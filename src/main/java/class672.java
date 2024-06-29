import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class672 {

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field9462 = method4835(method4834("/d'T\u0001"));

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field9459 = 0;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field9460 = 0;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Lmv;")
    public static class125 field9461 = new class125(85, 8);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method4833(int arg0) {
        try {
            if (arg0 == 10) {
                field9461 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9462 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4834(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4835(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
