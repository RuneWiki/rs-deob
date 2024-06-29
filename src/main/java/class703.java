import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class703 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILpl;Ljava/awt/Canvas;Lfa;I)Lr;", line = 7)
    public static final class566 method3945(int arg0, class612 arg1, Canvas arg2, class526 arg3, int arg4) {
        try {
            if (!class236.method1420(false)) {
                throw new RuntimeException("");
            } else if (class496.method2671("jagdx", -82)) {
                Class var5 = Class.forName("gaa");
                if (arg0 > -68) {
                    return (class566) null;
                } else {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("pl"), Class.forName("java.lang.Integer"));
                    return (class566) var6.invoke(null, arg2, arg3, arg1, Integer.valueOf(arg4));
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
