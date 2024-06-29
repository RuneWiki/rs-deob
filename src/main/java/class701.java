import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class701 {

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10075 = new String[] { method5085(method5084("\n`oh\u0001\f`wn\u0001)omlH\u0005s")), method5085(method5084("\u0007ex")), method5085(method5084("\n`oh\u0001\u0001vm'l\u0001ooh\\")), method5085(method5084("\u0005s")), method5085(method5084("\u0003s|h[\u0005UvfC\u000bhm")), method5085(method5084("\n`~mW")) };

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;Lgda;II)Lha;")
    public static final class63 method5083(Canvas arg0, class158 arg1, class58 arg2, int arg3, int arg4) {
        try {
            if (arg3 != -15414) {
                method5083(null, null, null, 122, 60);
            }
            if (!class424.method3367((byte) 117)) {
                throw new RuntimeException("");
            } else if (class259.method2177((byte) -72, field10075[5])) {
                Class var5 = Class.forName(field10075[3]);
                Method var6 = var5.getDeclaredMethod(field10075[4], Class.forName(field10075[2]), Class.forName("d"), Class.forName(field10075[1]), Class.forName(field10075[0]));
                return (class63) var6.invoke(null, arg0, arg1, arg2, Integer.valueOf(arg4));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5084(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5085(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
