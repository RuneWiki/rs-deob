import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class147 {

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field1896 = method1267(method1266("4Jrjf"));

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1895 = new String[200];

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "[Ltb;")
    public static class392[] field1892;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method1265(int arg0) {
        try {
            field1892 = null;
            if (arg0 == -27138) {
                field1895 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1896 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1266(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1267(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
