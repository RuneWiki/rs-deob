import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class243 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lfa;Ljava/awt/Canvas;ZLga;I)Lr;", line = 7)
    public static final class562 method1492(class522 arg0, Canvas arg1, boolean arg2, class332 arg3, int arg4) {
        try {
            if (!class488.method2801((byte) 114)) {
                throw new RuntimeException("");
            } else if (!arg2) {
                return (class562) null;
            } else if (class324.method1882("jagdx", 119)) {
                Class var5 = Class.forName("hb");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("ga"), Class.forName("java.lang.Integer"));
                return (class562) var6.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg4));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
