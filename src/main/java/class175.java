import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class175 {

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Laj;Ljava/awt/Canvas;IILd;)Lha;", line = 5)
    public static final class65 method1240(class333 arg0, Canvas arg1, int arg2, int arg3, class161 arg4) {
        try {
            if (!class164.method1190(-2500)) {
                throw new RuntimeException("");
            } else if (class295.method1877(49, "jagdx")) {
                if (arg2 != -8992) {
                    method1240(null, null, -125, -78, null);
                }
                Class var5 = Class.forName("rja");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("aj"), Class.forName("java.lang.Integer"));
                return (class65) var6.invoke(null, arg1, arg4, arg0, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
