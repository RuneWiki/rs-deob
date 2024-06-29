import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class417 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZLn;Lkr;ILjava/awt/Canvas;)Lqa;")
    public static final class167 method2477(boolean arg0, class473 arg1, class329 arg2, int arg3, Canvas arg4) {
        if (arg0) {
            return (class167) null;
        }
        try {
            if (!class395.method2370(true)) {
                throw new RuntimeException("");
            } else if (class558.method3140("jagdx", (byte) -46)) {
                Class var5 = Class.forName("hv");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("n"), Class.forName("kr"), Class.forName("java.lang.Integer"));
                return (class167) var6.invoke(null, arg4, arg1, arg2, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
