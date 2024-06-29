import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class605 {

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field8722 = method4424(method4423("V\rg\u0013\u0014"));

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "[I")
    public static int[] field8720 = null;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field8721 = 2;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static void method4421(byte arg0) {
        try {
            field8720 = null;
            if (arg0 != -49) {
                field8721 = 109;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8722 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)Llda;")
    public static final class513 method4422(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        return var3 == null || var3.field4677 == null ? null : var3.field4677;
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4423(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4424(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
