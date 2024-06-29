import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class516 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLjava/awt/Canvas;Lla;ILd;)Lha;")
    public static final class543 method3139(boolean arg0, Canvas arg1, class423 arg2, int arg3, class267 arg4) {
        try {
            if (!class367.method2307((byte) -78)) {
                throw new RuntimeException("");
            } else if (!class151.method1095("jagdx", 3)) {
                throw new RuntimeException("");
            } else if (arg0) {
                Class var5 = Class.forName("ad");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("la"), Class.forName("java.lang.Integer"));
                return (class543) var6.invoke(null, arg1, arg4, arg2, Integer.valueOf(arg3));
            } else {
                return (class543) null;
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
