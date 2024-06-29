import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class232 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ld;ILjava/awt/Canvas;Lkha;I)Lha;", line = 7)
    public static final class454 method1467(class96 arg0, int arg1, Canvas arg2, class687 arg3, int arg4) {
        try {
            if (!class162.method1002(false)) {
                throw new RuntimeException("");
            } else if (class10.method50("jagdx", (byte) -72)) {
                Class var5 = Class.forName("cu");
                if (arg4 == -2212) {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("kha"), Class.forName("java.lang.Integer"));
                    return (class454) var6.invoke(null, arg2, arg0, arg3, Integer.valueOf(arg1));
                } else {
                    return (class454) null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
