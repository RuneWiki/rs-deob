import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class155 {

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field1911 = method1296(method1295("\u0012\u0015\u0006R\u0000"));

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "[[B")
    public static byte[][] field1909 = new byte[1000][];

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public static void method1294(byte arg0) {
        try {
            field1909 = null;
            if (arg0 != 37) {
                method1294((byte) 89);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1911 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1295(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1296(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
