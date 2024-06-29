import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class572 {

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Ljava/awt/Canvas;BLeq;Ld;I)Lha;")
    public static final class58 method3333(Canvas arg0, byte arg1, class209 arg2, class149 arg3, int arg4) {
        if (arg1 != 24) {
            return (class58) null;
        }
        try {
            if (!class591.method3393((byte) 7)) {
                throw new RuntimeException("");
            } else if (class96.method870(0, "jagdx")) {
                Class var5 = Class.forName("lt");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("eq"), Class.forName("java.lang.Integer"));
                return (class58) var6.invoke(null, arg0, arg3, arg2, Integer.valueOf(arg4));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
