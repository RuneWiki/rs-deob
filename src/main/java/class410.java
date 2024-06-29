import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class410 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;Lfp;II)Lha;", line = 5)
    public static final class58 method2533(class149 arg0, Canvas arg1, class323 arg2, int arg3, int arg4) {
        try {
            if (arg4 != -18090) {
                return (class58) null;
            } else if (!class221.method1351(arg4 + 18091)) {
                throw new RuntimeException("");
            } else if (class608.method3425("jagdx", true)) {
                Class var5 = Class.forName("tg");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("fp"), Class.forName("java.lang.Integer"));
                return (class58) var6.invoke(null, arg1, arg0, arg2, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
