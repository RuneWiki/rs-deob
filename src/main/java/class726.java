import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class726 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILd;ILjava/awt/Canvas;Lwu;)Lha;")
    public static final class545 method4061(int arg0, class268 arg1, int arg2, Canvas arg3, class557 arg4) {
        try {
            if (!class10.method48(-9457)) {
                throw new RuntimeException("");
            } else if (class389.method2365("jagdx", (byte) -99)) {
                Class var5 = Class.forName("rd");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("wu"), Class.forName("java.lang.Integer"));
                int var7 = 36 / ((-arg0 - 71) / 52);
                return (class545) var6.invoke(null, arg3, arg1, arg4, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var9) {
            throw new RuntimeException("");
        }
    }
}
