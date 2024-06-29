import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class264 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILd;Lin;Ljava/awt/Canvas;)Lha;", line = 4)
    public static final class59 method1764(int arg0, int arg1, class152 arg2, class91 arg3, Canvas arg4) {
        if (arg1 != 18993) {
            return (class59) null;
        }
        try {
            if (!class44.method543(27165)) {
                throw new RuntimeException("");
            } else if (class98.method915(-30282, "jagdx")) {
                Class var5 = Class.forName("bfa");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("in"), Class.forName("java.lang.Integer"));
                return (class59) var6.invoke(null, arg4, arg2, arg3, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
