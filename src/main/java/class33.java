import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class33 {

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field412 = method348(method347("\u0013\u0016#L\""));

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Llga;")
    public static class47 field411;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 5)
    public static void method346(int arg0) {
        try {
            field411 = null;
            if (arg0 != 30735) {
                field411 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field412 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method347(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method348(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
