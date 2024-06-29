import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class348 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field5644 = method2909(method2908("\u0003uf\u0011p"));

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field5640 = 0;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lvn;")
    public static class330 field5639 = new class330(50, 7);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field5641 = 1;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[F")
    public static float[] field5643 = new float[4];

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "B")
    public static byte field5642;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 20)
    public static void method2907(int arg0) {
        try {
            if (arg0 == -31141) {
                field5639 = null;
                field5643 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5644 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2908(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2909(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
