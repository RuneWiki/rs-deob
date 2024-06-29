import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class342 {

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(BILjava/awt/Canvas;Ld;Lwu;)Lha;")
    public static final class59 method2049(byte arg0, int arg1, Canvas arg2, class152 arg3, class376 arg4) {
        try {
            if (!class594.method3227(-51)) {
                throw new RuntimeException("");
            } else if (class702.method3952(arg0 ^ 0x18, "jagdx")) {
                if (arg0 != 95) {
                    method2049((byte) 13, 20, null, null, null);
                }
                Class var5 = Class.forName("mh");
                Method var6 = var5.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("wu"), Class.forName("java.lang.Integer"));
                return (class59) var6.invoke(null, arg2, arg3, arg4, Integer.valueOf(arg1));
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var8) {
            throw new RuntimeException("");
        }
    }
}
