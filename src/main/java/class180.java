import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class180 {

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2499 = method1580(method1579("1[\b\u0001}"));

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2495 = 52;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field2497 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "[Ldt;")
    public static class253[] field2498;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method1578(int arg0) {
        try {
            if (arg0 != -4) {
                field2497 = -101;
            }
            field2498 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2499 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1579(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1580(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
