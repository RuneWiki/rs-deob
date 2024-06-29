import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class595 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljn;ILfa;BLjava/awt/Canvas;)Lr;", line = 7)
    public static final class165 method3446(class668 arg0, int arg1, class212 arg2, byte arg3, Canvas arg4) {
        try {
            if (!class19.method334(-31431)) {
                throw new RuntimeException("");
            }
            int var5 = -107 / ((arg3 - 82) / 35);
            if (!class602.method3469(6298, "jagdx")) {
                throw new RuntimeException("");
            }
            Class var6 = Class.forName("kaa");
            Method var7 = var6.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("jn"), Class.forName("java.lang.Integer"));
            return (class165) var7.invoke(null, arg4, arg2, arg0, Integer.valueOf(arg1));
        } catch (Throwable var9) {
            throw new RuntimeException("");
        }
    }
}
