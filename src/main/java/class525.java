import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class525 {

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7657 = new String[] { method3978(method3977("K\b")), method3978(method3977("M\b~\u0004s")), method3978(method3977("T\r")), method3978(method3977("M\bo\u0001%F\u001emNHF\u0007o\u0001x")), method3978(method3977("M\bo\u0001%K\bw\u0007%n\u0007m\u0005lB\u001b")), method3978(method3977("D\u001b|\u0001\u007fB=v\u000fgL\u0000m")) };

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/Canvas;Lla;BLd;)Lha;", line = 7)
    public static final class66 method3976(int arg0, Canvas arg1, class476 arg2, byte arg3, class160 arg4) {
        try {
            if (!class448.method3446(-107)) {
                throw new RuntimeException("");
            } else if (class116.method1024(field7657[1], 1)) {
                if (arg3 <= 11) {
                    method3976(90, null, null, (byte) 27, null);
                }
                Class var5 = Class.forName(field7657[2]);
                Method var6 = var5.getDeclaredMethod(field7657[5], Class.forName(field7657[3]), Class.forName("d"), Class.forName(field7657[0]), Class.forName(field7657[4]));
                return (class66) var6.invoke(null, arg1, arg4, arg2, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3977(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3978(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
