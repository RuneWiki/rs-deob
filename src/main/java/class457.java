import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class457 {

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6674 = new String[] { method3524(method3523("\u0006~9VD!neKE\u00152")), method3524(method3523("\u0006~9c\u0003")) };

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[Lrfa;")
    public static class202[] field6672;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 4)
    public static void method3522(int arg0) {
        try {
            if (arg0 == 11160) {
                field6672 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6674[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        try {
            field6673++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6674[0] + ')');
        }
    }

    @OriginalMember(owner = "client!td", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3523(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!td", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3524(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
