import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class136 {

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field1755 = method1193(method1192("*oB\u007fxw"));

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "[I")
    public static int[] field1753 = new int[8];

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "[I")
    public static int[] field1754;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V", line = 4)
    public static void method1191(byte arg0) {
        try {
            field1754 = null;
            field1753 = null;
            int var1 = 47 / ((arg0 + 48) / 48);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1755 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1192(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1193(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
