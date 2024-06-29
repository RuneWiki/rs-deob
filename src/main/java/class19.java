import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lri;ILjava/awt/Canvas;ILfa;)Lr;", line = 5)
    public static final class167 method357(class97 arg0, int arg1, Canvas arg2, int arg3, class214 arg4) {
        try {
            if (!class31.method438(16776960)) {
                throw new RuntimeException("");
            } else if (arg1 != 10080) {
                return (class167) null;
            } else if (class106.method1005("jagdx", (byte) -56)) {
                Class var5 = Class.forName("to");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("ri"), Class.forName("java.lang.Integer"));
                return (class167) var6.invoke(null, arg2, arg4, arg0, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
