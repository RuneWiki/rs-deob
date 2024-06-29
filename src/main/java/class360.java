import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class360 {

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILe;ILjava/awt/Canvas;Lpj;)Loa;", line = 5)
    public static final class638 method2119(int arg0, class489 arg1, int arg2, Canvas arg3, class132 arg4) {
        try {
            if (!class26.method121((byte) -114)) {
                throw new RuntimeException("");
            } else if (class307.method1881("jagdx", false)) {
                Class var5 = Class.forName("vg");
                if (arg2 != 30345) {
                    method2119(-64, null, -19, null, null);
                }
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("pj"), Class.forName("java.lang.Integer"));
                return (class638) var6.invoke(null, arg3, arg1, arg4, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
