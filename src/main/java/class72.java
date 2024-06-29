import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class72 {

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ldn;BILjava/awt/Canvas;Ln;)Lqa;")
    public static final class206 method393(class438 arg0, byte arg1, int arg2, Canvas arg3, class17 arg4) {
        try {
            if (!class301.method1664(63)) {
                throw new RuntimeException("");
            } else if (arg1 < 101) {
                return (class206) null;
            } else if (class136.method757(0, "jagdx")) {
                Class var5 = Class.forName("hg");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("n"), Class.forName("dn"), Class.forName("java.lang.Integer"));
                return (class206) var6.invoke(null, arg3, arg4, arg0, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
