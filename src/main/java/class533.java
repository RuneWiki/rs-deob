import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class533 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lla;Ljava/awt/Canvas;IILd;)Lha;", line = 5)
    public static final class544 method3152(class422 arg0, Canvas arg1, int arg2, int arg3, class267 arg4) {
        try {
            if (arg2 != 28110) {
                return (class544) null;
            } else if (!class241.method1678(true)) {
                throw new RuntimeException("");
            } else if (class541.method3169("jagdx", arg2 - 28150)) {
                Class var5 = Class.forName("hb");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("la"), Class.forName("java.lang.Integer"));
                return (class544) var6.invoke(null, arg1, arg4, arg0, Integer.valueOf(arg3));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
