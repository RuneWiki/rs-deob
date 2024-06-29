import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class556 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/awt/Canvas;Ld;ILuq;)Lha;")
    public static final class66 method3189(int arg0, Canvas arg1, class161 arg2, int arg3, class172 arg4) {
        try {
            if (arg3 <= 25) {
                return (class66) null;
            } else if (!class512.method2990((byte) 118)) {
                throw new RuntimeException("");
            } else if (class289.method1854((byte) 75, "jagdx")) {
                Class var5 = Class.forName("uda");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("uq"), Class.forName("java.lang.Integer"));
                return (class66) var6.invoke(null, arg1, arg2, arg4, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
