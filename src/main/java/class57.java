import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class57 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILjava/awt/Canvas;ILd;Lnd;)Lha;", line = 5)
    public static final class60 method418(int arg0, Canvas arg1, int arg2, class153 arg3, class547 arg4) {
        try {
            if (!class208.method1344(-127)) {
                throw new RuntimeException("");
            } else if (!class633.method3549("jagdx", 99)) {
                throw new RuntimeException("");
            } else if (arg2 > -11) {
                return (class60) null;
            } else {
                Class var5 = Class.forName("ul");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("nd"), Class.forName("java.lang.Integer"));
                return (class60) var6.invoke(null, arg1, arg3, arg4, Integer.valueOf(arg0));
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
