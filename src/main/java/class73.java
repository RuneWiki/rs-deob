import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class73 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lwia;IZLd;Ljava/awt/Canvas;)Lha;")
    public static final class65 method584(class791 arg0, int arg1, boolean arg2, class160 arg3, Canvas arg4) {
        try {
            if (!class214.method1472(0)) {
                throw new RuntimeException("");
            } else if (class581.method3402("jagdx", (byte) -18)) {
                Class var5 = Class.forName("ta");
                if (arg2) {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("wia"), Class.forName("java.lang.Integer"));
                    return (class65) var6.invoke(null, arg4, arg3, arg0, Integer.valueOf(arg1));
                } else {
                    return (class65) null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
