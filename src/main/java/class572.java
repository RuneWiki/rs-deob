import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class572 {

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field8280 = method4214(method4213("U}\u0015%A"));

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field8278 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[Z")
    public static boolean[] field8277;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method4212(byte arg0) {
        try {
            if (arg0 > -57) {
                field8277 = null;
            }
            field8277 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8280 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4213(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4214(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
