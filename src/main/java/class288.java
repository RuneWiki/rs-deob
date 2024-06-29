import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class288 {

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field4633 = method2435(method2434("?\u001e=\u0001la"));

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "Luga;")
    public static class218 field4632;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)V", line = 5)
    public static void method2433(byte arg0) {
        try {
            field4632 = null;
            int var1 = 54 % ((arg0 - 53) / 61);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4633 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2434(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2435(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
