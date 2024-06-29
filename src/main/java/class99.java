import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class99 {

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1459 = new String[] { method946(method945("H\u0018\u00050F")), method946(method945("H\u0018\u00053F")) };

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "F")
    public static float field1458;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[Ljava/lang/Object;")
    public static Object[] field1456;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIB)Ljava/lang/String;", line = 3)
    public static final String method943(boolean arg0, int arg1, byte arg2) {
        try {
            if (arg2 <= 56) {
                return null;
            } else {
                field1457++;
                return arg0 && arg1 >= 0 ? class441.method3458(arg1, arg0, 10, 87) : Integer.toString(arg1);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1459[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 25)
    public static void method944(int arg0) {
        try {
            field1456 = null;
            if (arg0 <= 75) {
                field1456 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1459[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method945(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method946(char[] arg0) {
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
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
