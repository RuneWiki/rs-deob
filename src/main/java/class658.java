import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class658 {

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILwm;Ljava/awt/Canvas;ILd;)Lha;")
    public static final class570 method3585(int arg0, class30 arg1, Canvas arg2, int arg3, class284 arg4) {
        try {
            if (!class524.method2882(16106)) {
                throw new RuntimeException("");
            } else if (arg3 != -10357) {
                return (class570) null;
            } else if (class382.method2194("jagdx", 31749)) {
                Class var5 = Class.forName("cka");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("wm"), Class.forName("java.lang.Integer"));
                return (class570) var6.invoke(null, arg2, arg4, arg1, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
