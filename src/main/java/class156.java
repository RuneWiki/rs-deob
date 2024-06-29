import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class156 {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field2545 = 0;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lgj;ZILjava/awt/Canvas;Ld;)Lha;")
    public static final class66 method1212(class662 arg0, boolean arg1, int arg2, Canvas arg3, class162 arg4) {
        field2544++;
        if (!arg1) {
            method1212(null, true, 110, null, null);
        }
        if (!class125.method1074(127)) {
            throw new RuntimeException("");
        } else if (class35.method208((byte) -121, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class97 var8 = new class97(var5, arg3, var6, arg4, arg0, arg2);
            var8.method3103((byte) -17);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
