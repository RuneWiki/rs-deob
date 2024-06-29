import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class765 {

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field11215 = method5520(method5519(")\u0004S\t_"));

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field11213 = 0;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "Lsia;")
    public static class769 field11214;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
    public static void method5518(byte arg0) {
        try {
            if (arg0 >= 45) {
                field11214 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11215 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5519(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5520(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
