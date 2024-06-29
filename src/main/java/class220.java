import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class220 {

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field3198 = method1856(method1855("w!\u0005k$0"));

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static final void method1854(int arg0) {
        try {
            if (arg0 > 31) {
                field3197++;
                class470[] var1 = class236.field3400;
                synchronized (class236.field3400) {
                    for (int var2 = 0; var2 < class236.field3400.length; var2++) {
                        class236.field3400[var2] = new class470();
                        class124.field1565[var2] = 0;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3198 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1855(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1856(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 101;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
