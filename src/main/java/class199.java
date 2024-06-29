import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class199 {

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILjava/awt/Canvas;Lpfa;Le;)Loa;")
    public static final class650 method1159(int arg0, int arg1, Canvas arg2, class275 arg3, class498 arg4) {
        try {
            if (arg1 != 20363) {
                method1159(81, 62, null, null, null);
            }
            if (!class525.method2832(110)) {
                throw new RuntimeException("");
            } else if (class362.method2099(34167, "jagdx")) {
                Class var5 = Class.forName("tga");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("pfa"), Class.forName("java.lang.Integer"));
                return (class650) var6.invoke(null, arg2, arg4, arg3, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
