import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class456 {

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field6647 = method3485(method3484("\u0015oqZTO"));

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field6644 = 0;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Lwia;")
    public static class790 field6645 = new class790(29, 3);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Llp;")
    public static class411 field6646;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V", line = 5)
    public static void method3483(byte arg0) {
        try {
            field6646 = null;
            field6645 = null;
            if (arg0 != 11) {
                method3483((byte) -85);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6647 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3484(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3485(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
