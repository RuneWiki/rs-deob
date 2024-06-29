import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class111 {

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ltf;Ljava/awt/Canvas;ILfa;I)Lr;")
    public static final class564 method594(class701 arg0, Canvas arg1, int arg2, class524 arg3, int arg4) {
        try {
            if (!class194.method1181((byte) 57)) {
                throw new RuntimeException("");
            } else if (class166.method908("jagdx", (byte) 107)) {
                if (arg4 != 28147) {
                    method594(null, null, 42, null, -69);
                }
                Class var5 = Class.forName("eda");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("tf"), Class.forName("java.lang.Integer"));
                return (class564) var6.invoke(null, arg1, arg3, arg0, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
