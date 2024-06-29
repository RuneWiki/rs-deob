import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class285 {

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field4614 = method2424(method2423("Dm~\u000er\u0018"));

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "Ljj;")
    public static class126 field4610 = new class126();

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
    public static int field4611 = 0;

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "Lqr;")
    public static class69 field4613 = new class69(8);

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)V")
    public static void method2422(byte arg0) {
        try {
            int var1 = -53 / ((arg0 + 40) / 40);
            field4610 = null;
            field4613 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4614 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2423(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2424(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
