import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class362 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILpq;Ljava/awt/Canvas;ILe;)Loa;")
    public static final class689 method2227(int arg0, class159 arg1, Canvas arg2, int arg3, class479 arg4) {
        try {
            if (!class149.method1008(true)) {
                throw new RuntimeException("");
            } else if (class552.method3093("jagdx", 0)) {
                Class var5 = Class.forName("ui");
                if (arg0 != 20831) {
                    method2227(-7, null, null, -22, null);
                }
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("pq"), Class.forName("java.lang.Integer"));
                return (class689) var6.invoke(null, arg2, arg4, arg1, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
