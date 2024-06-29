import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class59 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILjava/awt/Canvas;Ld;Lni;)Lha;")
    public static final class60 method337(int arg0, int arg1, Canvas arg2, class152 arg3, class522 arg4) {
        try {
            if (!class619.method3510(true)) {
                throw new RuntimeException("");
            }
            int var5 = -84 / ((-arg0) / 52);
            if (!class492.method2758("jagdx", (byte) -36)) {
                throw new RuntimeException("");
            }
            Class var6 = Class.forName("bea");
            Method var7 = var6.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("ni"), Class.forName("java.lang.Integer"));
            return (class60) var7.invoke(null, arg2, arg3, arg4, Integer.valueOf(arg1));
        } catch (Throwable var9) {
            throw new RuntimeException("");
        }
    }
}
