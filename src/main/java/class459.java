import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class459 {

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lfa;Ljava/awt/Canvas;IILsea;)Lr;", line = 7)
    public static final class166 method2611(class212 arg0, Canvas arg1, int arg2, int arg3, class648 arg4) {
        try {
            if (!class456.method2602(768)) {
                throw new RuntimeException("");
            } else if (arg2 <= 94) {
                return (class166) null;
            } else if (class28.method266(true, "jagdx")) {
                Class var5 = Class.forName("ega");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("sea"), Class.forName("java.lang.Integer"));
                return (class166) var6.invoke(null, arg1, arg0, arg4, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
