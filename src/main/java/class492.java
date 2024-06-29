import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class492 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/awt/Canvas;Lbt;ZLd;I)Lha;", line = 5)
    public static final class66 method2902(Canvas arg0, class48 arg1, boolean arg2, class162 arg3, int arg4) {
        try {
            if (!class154.method1097((byte) 85)) {
                throw new RuntimeException("");
            } else if (class37.method326((byte) 121, "jagdx")) {
                Class var5 = Class.forName("us");
                if (arg2) {
                    return (class66) null;
                } else {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("bt"), Class.forName("java.lang.Integer"));
                    return (class66) var6.invoke(null, arg0, arg3, arg1, Integer.valueOf(arg4));
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
