import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class412 extends class687 {

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field5932 = method3226(method3225("\u0002Y@O"));

    @OriginalMember(owner = "client!r", name = "v", descriptor = "Z")
    public static boolean field5929 = false;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "Lsb;")
    public static class261 field5928 = new class261(84, -1);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "[Z")
    public static boolean[] field5930 = new boolean[100];

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[I")
    public static int[] field5931;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method3224(int arg0) {
        try {
            if (arg0 != 84) {
                field5929 = false;
            }
            field5930 = null;
            field5931 = null;
            field5928 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5932 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!r", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3225(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!r", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3226(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
