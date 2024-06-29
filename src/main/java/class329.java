import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class329 {

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field5397 = method2796(method2795("8zVt\u0002x"));

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "Lhl;")
    public static class556 field5394 = new class556(89, 2);

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lhl;")
    public static class556 field5395 = new class556(109, -2);

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "[I")
    public static int[] field5396;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 8)
    public static void method2794(int arg0) {
        try {
            field5395 = null;
            field5394 = null;
            if (arg0 != -1) {
                field5396 = null;
            }
            field5396 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5397 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2795(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2796(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
