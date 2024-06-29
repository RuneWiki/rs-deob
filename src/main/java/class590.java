import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class590 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/awt/Canvas;ILkda;Ln;)Lqa;")
    public static final class208 method3507(int arg0, Canvas arg1, int arg2, class328 arg3, class17 arg4) {
        try {
            if (!class136.method953((byte) 71)) {
                throw new RuntimeException("");
            } else if (class230.method1488(arg0 + 16110, "jagdx")) {
                Class var5 = Class.forName("wda");
                if (arg0 == -16223) {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("n"), Class.forName("kda"), Class.forName("java.lang.Integer"));
                    return (class208) var6.invoke(null, arg1, arg4, arg3, Integer.valueOf(arg2));
                } else {
                    return (class208) null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
