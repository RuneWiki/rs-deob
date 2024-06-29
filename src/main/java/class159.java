import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class159 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;ILgga;Z)Lha;")
    public static final class475 method1223(class103 arg0, Canvas arg1, int arg2, class513 arg3, boolean arg4) {
        if (arg4) {
            method1223(null, null, -91, null, true);
        }
        try {
            if (!class420.method2480(13753)) {
                throw new RuntimeException("");
            } else if (class27.method224(111, "jagdx")) {
                Class var5 = Class.forName("lj");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("gga"), Class.forName("java.lang.Integer"));
                return (class475) var6.invoke(null, arg1, arg0, arg3, Integer.valueOf(arg2));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
