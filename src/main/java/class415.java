import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class415 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/awt/Canvas;ILan;ILn;)Lqa;")
    public static final class207 method2494(Canvas arg0, int arg1, class21 arg2, int arg3, class17 arg4) {
        try {
            if (!class113.method786(false)) {
                throw new RuntimeException("");
            } else if (class336.method2038(false, "jagdx")) {
                Class var5 = Class.forName("bv");
                if (arg3 == 26256) {
                    Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("n"), Class.forName("an"), Class.forName("java.lang.Integer"));
                    return (class207) var6.invoke(null, arg0, arg4, arg2, Integer.valueOf(arg1));
                } else {
                    return (class207) null;
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
