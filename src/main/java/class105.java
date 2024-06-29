import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class105 {

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;ILcb;B)Lha;", line = 5)
    public static final class66 method715(class159 arg0, Canvas arg1, int arg2, class544 arg3, byte arg4) {
        try {
            if (!class630.method3598((byte) 116)) {
                throw new RuntimeException("");
            }
            if (arg4 > -114) {
                method715(null, null, -55, null, (byte) -68);
            }
            if (!class291.method1971("jagdx", 0)) {
                throw new RuntimeException("");
            }
            Class var5 = Class.forName("ki");
            Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("cb"), Class.forName("java.lang.Integer"));
            return (class66) var6.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg2));
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
