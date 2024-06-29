import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class660 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BILd;Luu;Ljava/awt/Canvas;)Lha;")
    public static final class548 method3667(byte arg0, int arg1, class270 arg2, class237 arg3, Canvas arg4) {
        try {
            if (!class171.method1096((byte) -121)) {
                throw new RuntimeException("");
            } else if (class715.method4015("jagdx", -1)) {
                Class var5 = Class.forName("kfa");
                if (arg0 <= 1) {
                    return (class548) null;
                } else {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("uu"), Class.forName("java.lang.Integer"));
                    return (class548) var6.invoke(null, arg4, arg2, arg3, Integer.valueOf(arg1));
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
