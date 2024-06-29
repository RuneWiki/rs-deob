import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class433 {

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjava/awt/Canvas;Loh;ILd;)Lha;", line = 5)
    public static final class58 method2713(int arg0, Canvas arg1, class404 arg2, int arg3, class150 arg4) {
        try {
            if (!class675.method3841((byte) 106)) {
                throw new RuntimeException("");
            } else if (!class79.method555(33, "jagdx")) {
                throw new RuntimeException("");
            } else if (arg3 == 25454) {
                Class var5 = Class.forName("hl");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("oh"), Class.forName("java.lang.Integer"));
                return (class58) var6.invoke(null, arg1, arg4, arg2, Integer.valueOf(arg0));
            } else {
                return (class58) null;
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
