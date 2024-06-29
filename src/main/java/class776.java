import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class776 extends OutputStream {

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11279 = new String[] { method5620(method5619("d\u001f\u0011sMf\u0019Z,")), method5620(method5619("d\u001f\u0011E\u0017")) };

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field11276 = 0;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field11275;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field11277;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[Ldf;")
    public static class420[] field11278;

    @OriginalMember(owner = "client!kr", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        try {
            field11277++;
            throw new IOException();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11279[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 18)
    public static void method5618(int arg0) {
        try {
            if (arg0 != 0) {
                method5618(-36);
            }
            field11278 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11279[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5619(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5620(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
