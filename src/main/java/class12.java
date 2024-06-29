import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/awt/Canvas;Ldda;Ln;I)Lqa;", line = 5)
    public static final class167 method59(int arg0, Canvas arg1, class597 arg2, class472 arg3, int arg4) {
        try {
            if (!class341.method2115(-1)) {
                throw new RuntimeException("");
            } else if (class53.method271((byte) -87, "jagdx")) {
                Class var5 = Class.forName("nca");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("n"), Class.forName("dda"), Class.forName("java.lang.Integer"));
                if (arg0 != -13650) {
                    method59(65, null, null, null, 79);
                }
                return (class167) var6.invoke(null, arg1, arg3, arg2, Integer.valueOf(arg4));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
