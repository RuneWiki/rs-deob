import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class312 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/awt/Canvas;Lmv;IILfa;)Lr;")
    public static final class98 method1947(Canvas arg0, class295 arg1, int arg2, int arg3, class615 arg4) {
        try {
            if (!class638.method3645((byte) -75)) {
                throw new RuntimeException("");
            } else if (!class436.method2588("jagdx", (byte) 38)) {
                throw new RuntimeException("");
            } else if (arg3 == -9533) {
                Class var5 = Class.forName("ik");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("mv"), Class.forName("java.lang.Integer"));
                return (class98) var6.invoke(null, arg0, arg4, arg1, Integer.valueOf(arg2));
            } else {
                return (class98) null;
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
