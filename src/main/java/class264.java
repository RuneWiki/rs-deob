import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class264 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILd;ILjava/awt/Canvas;Lae;)Lha;")
    public static final class473 method1733(int arg0, class101 arg1, int arg2, Canvas arg3, class283 arg4) {
        try {
            if (!class68.method523(-457)) {
                throw new RuntimeException("");
            } else if (class161.method1027(arg2 ^ 0xFFFFEF9A, "jagdx")) {
                Class var5 = Class.forName("sga");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("ae"), Class.forName("java.lang.Integer"));
                if (arg2 != -4219) {
                    method1733(-12, null, 93, null, null);
                }
                return (class473) var6.invoke(null, arg3, arg1, arg4, Integer.valueOf(arg0));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
