import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class131 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;ILgj;I)Lha;")
    public static final class66 method1104(class162 arg0, Canvas arg1, int arg2, class662 arg3, int arg4) {
        try {
            if (!class125.method1074(103)) {
                throw new RuntimeException("");
            } else if (class35.method208((byte) 39, "jagdx")) {
                Class var5 = Class.forName("aia");
                if (arg2 == 26360) {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("gj"), Class.forName("java.lang.Integer"));
                    return (class66) var6.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg4));
                } else {
                    return (class66) null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
