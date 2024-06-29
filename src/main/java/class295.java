import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class295 {

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4145 = new String[] { method2383(method2382("6$W*7=2UeZ=+W*j")), method2383(method2382("6$F/a")), method2383(method2382("36")), method2383(method2382("6$W*70$O,7\u0015+U.~97")), method2383(method2382("?7D*m9\u0011N$u7,U")), method2383(method2382("0\"@")) };

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Llga;ZILd;Ljava/awt/Canvas;)Lha;")
    public static final class18 method2381(class47 arg0, boolean arg1, int arg2, class673 arg3, Canvas arg4) {
        try {
            if (!class640.method4682(124)) {
                throw new RuntimeException("");
            } else if (class743.method5382(field4145[1], arg1)) {
                Class var5 = Class.forName(field4145[2]);
                Method var6 = var5.getDeclaredMethod(field4145[4], Class.forName(field4145[0]), Class.forName("d"), Class.forName(field4145[5]), Class.forName(field4145[3]));
                return (class18) var6.invoke(null, arg4, arg3, arg0, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2382(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x19);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2383(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
