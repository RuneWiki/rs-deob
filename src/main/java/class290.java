import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class290 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Canvas;IILe;Ljo;)Loa;", line = 5)
    public static final class635 method1638(Canvas arg0, int arg1, int arg2, class486 arg3, class303 arg4) {
        try {
            if (arg1 != -5696) {
                return (class635) null;
            } else if (!class176.method1025(-81)) {
                throw new RuntimeException("");
            } else if (class527.method2998("jagdx", (byte) 14)) {
                Class var5 = Class.forName("gb");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("jo"), Class.forName("java.lang.Integer"));
                return (class635) var6.invoke(null, arg0, arg3, arg4, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
