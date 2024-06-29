import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class55 {

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field602 = method416(method415("&|\\>)y"));

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "Lwia;")
    public static class790 field601 = new class790(1, 15);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V", line = 6)
    public static void method414(byte arg0) {
        try {
            field601 = null;
            if (arg0 <= 123) {
                method414((byte) -68);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field602 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method415(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method416(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
