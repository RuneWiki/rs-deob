import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class185 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILfa;Ljava/awt/Canvas;ILvo;)Lr;", line = 5)
    public static final class98 method1324(int arg0, class615 arg1, Canvas arg2, int arg3, class345 arg4) {
        try {
            if (!class206.method1432(1253)) {
                throw new RuntimeException("");
            } else if (class331.method1968("jagdx", (byte) 43)) {
                Class var5 = Class.forName("oe");
                if (arg0 == -11663) {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("vo"), Class.forName("java.lang.Integer"));
                    return (class98) var6.invoke(null, arg2, arg1, arg4, Integer.valueOf(arg3));
                } else {
                    return (class98) null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
