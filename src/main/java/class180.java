import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class180 {

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2883 = method1708(method1707("\u001cU|wSW"));

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "Z")
    public static boolean field2880 = false;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Lcca;")
    public static class258 field2881;

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "Ljava/lang/String;")
    public String field2882;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method1706(int arg0) {
        try {
            if (arg0 <= 48) {
                field2881 = null;
            }
            field2881 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2883 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1707(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1708(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 18;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
