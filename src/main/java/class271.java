import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class271 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Le;Ljava/awt/Canvas;Lpe;II)Loa;")
    public static final class43 method1656(class702 arg0, Canvas arg1, class615 arg2, int arg3, int arg4) {
        try {
            if (!class181.method1205((byte) -28)) {
                throw new RuntimeException("");
            } else if (!client.method709("jagdx", (byte) -92)) {
                throw new RuntimeException("");
            } else if (arg3 == 13169) {
                Class var5 = Class.forName("mba");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("e"), Class.forName("pe"), Class.forName("java.lang.Integer"));
                return (class43) var6.invoke(null, arg1, arg0, arg2, Integer.valueOf(arg4));
            } else {
                return (class43) null;
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
