import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class731 extends InputStream {

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field10620 = method5334(method5333("\u0014K~!\u0010\u0011Kx"));

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field10618 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field10619;

    @OriginalMember(owner = "client!dd", name = "read", descriptor = "()I")
    public final int read() {
        try {
            class151.method1269(false, 30000L);
            field10619++;
            return -1;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10620 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5333(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5334(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
