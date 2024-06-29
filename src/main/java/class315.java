import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class315 {

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field5130 = method2691(method2690("c|}I"));

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field5127 = 0;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "F")
    public static float field5128;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method2689(int arg0, int arg1, int arg2) {
        try {
            field5129++;
            int var3 = 74 % ((arg1 - 58) / 57);
            if (arg2 >= 1000 && arg0 < 1000) {
                return true;
            } else if (arg2 >= 1000 || arg0 >= 1000) {
                return arg2 >= 1000 && arg0 >= 1000;
            } else if (class2.method22(arg0, -79)) {
                return true;
            } else {
                return !class2.method22(arg2, -17);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5130 + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2690(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!w", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2691(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
