import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class375 {

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lgp;ZLn;Ljava/awt/Canvas;I)Lqa;")
    public static final class167 method2281(class561 arg0, boolean arg1, class472 arg2, Canvas arg3, int arg4) {
        try {
            if (!class408.method2476(-123)) {
                throw new RuntimeException("");
            } else if (class8.method31(false, "jagdx")) {
                if (!arg1) {
                    method2281(null, true, null, null, -60);
                }
                Class var5 = Class.forName("de");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("n"), Class.forName("gp"), Class.forName("java.lang.Integer"));
                return (class167) var6.invoke(null, arg3, arg2, arg0, Integer.valueOf(arg4));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
