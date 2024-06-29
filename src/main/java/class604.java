import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class604 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Le;ILjava/awt/Canvas;Lbi;I)Loa;", line = 5)
    public static final class651 method3326(class498 arg0, int arg1, Canvas arg2, class449 arg3, int arg4) {
        try {
            if (!class675.method3772(20743)) {
                throw new RuntimeException("");
            } else if (!class275.method1669(arg4 - 106, "jagdx")) {
                throw new RuntimeException("");
            } else if (arg4 == 106) {
                Class var5 = Class.forName("ss");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("bi"), Class.forName("java.lang.Integer"));
                return (class651) var6.invoke(null, arg2, arg0, arg3, Integer.valueOf(arg1));
            } else {
                return (class651) null;
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
