import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class539 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZLe;Ljava/awt/Canvas;ILkea;)Loa;", line = 7)
    public static final class605 method3141(boolean arg0, class462 arg1, Canvas arg2, int arg3, class203 arg4) {
        try {
            if (!class81.method532(-102)) {
                throw new RuntimeException("");
            } else if (!class636.method3630(107, "jagdx")) {
                throw new RuntimeException("");
            } else if (arg0) {
                return (class605) null;
            } else {
                Class var5 = Class.forName("rca");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("kea"), Class.forName("java.lang.Integer"));
                return (class605) var6.invoke(null, arg2, arg1, arg4, Integer.valueOf(arg3));
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
