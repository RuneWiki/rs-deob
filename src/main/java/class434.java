import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class434 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Z")
    public static boolean field5933 = false;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BJ)V", line = 6)
    public static final void method2464(byte arg0, long arg1) {
        field5932++;
        class402 var3 = class142.method1037(17916);
        var3.field5354.method1980(-345277664, class597.field7926.field9432);
        var3.field5354.method2027((byte) 123, arg1);
        var3.field5354.method1980(-345277664, class516.field6892);
        if (arg0 <= 114) {
            method2465(96, null, null, null, -91);
        }
        class36.method278(0, var3);
        class568.field7546 = 0;
        class623.field8247 = -3;
        class162.field2551 = 0;
        class639.field8597 = 1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILbi;Le;Ljava/awt/Canvas;I)Loa;", line = 28)
    public static final class651 method2465(int arg0, class449 arg1, class498 arg2, Canvas arg3, int arg4) {
        field5934++;
        if (!class675.method3772(20743)) {
            throw new RuntimeException("");
        } else if (class275.method1669(arg4 ^ arg4, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg3, 8, 8, 8, 24, 0, arg0);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class5 var8 = new class5(var5, arg3, var6, arg2, arg1, arg0);
            var8.method905(arg4 - 130);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
