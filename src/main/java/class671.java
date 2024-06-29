import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class671 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/awt/Canvas;ILfa;Lom;)Lr;")
    public static final class167 method3789(int arg0, Canvas arg1, int arg2, class214 arg3, class344 arg4) {
        try {
            if (!class479.method2909((byte) 109)) {
                throw new RuntimeException("");
            } else if (class251.method1681("jagdx", 334)) {
                Class var5 = Class.forName("hg");
                if (arg0 != -19759) {
                    method3789(-88, null, -71, null, null);
                }
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("fa"), Class.forName("om"), Class.forName("java.lang.Integer"));
                return (class167) var6.invoke(null, arg1, arg3, arg4, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
