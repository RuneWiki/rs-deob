import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class610 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILpu;Lfa;Ljava/awt/Canvas;I)Lr;")
    public static final class166 method3415(int arg0, class522 arg1, class209 arg2, Canvas arg3, int arg4) {
        try {
            if (!class247.method1662(47)) {
                throw new RuntimeException("");
            } else if (arg0 != 6908) {
                return (class166) null;
            } else if (class271.method1788("jagdx", -104)) {
                Class var5 = Class.forName("tb");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("pu"), Class.forName("java.lang.Integer"));
                return (class166) var6.invoke(null, arg3, arg2, arg1, Integer.valueOf(arg4));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
