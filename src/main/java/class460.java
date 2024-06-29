import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class460 extends InputStream {

    @OriginalMember(owner = "client!st", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7087 = method3563(method3562("\u0006UADJ\u0014EG"));

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field7083 = 0;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field7084 = 0;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!st", name = "read", descriptor = "()I", line = 6)
    public final int read() {
        try {
            class524.method3918(-4, 30000L);
            field7086++;
            return -1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7087 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3562(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3563(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
