import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class392 {

    @OriginalMember(owner = "client!gka", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field6249 = method3189(method3188("!H%Cwn"));

    @OriginalMember(owner = "client!gka", name = "d", descriptor = "Z")
    public static boolean field6247 = false;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "[I")
    public static int[] field6248 = new int[32];

    @OriginalMember(owner = "client!gka", name = "c", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!gka", name = "b", descriptor = "Lclient;")
    public static client field6245;

    @OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V")
    public static void method3187(int arg0) {
        try {
            if (arg0 == 32) {
                field6248 = null;
                field6245 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6249 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3188(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3189(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
