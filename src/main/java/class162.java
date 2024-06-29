import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class162 {

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2107 = 0;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lv;")
    public static class455 field2104;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1077(int arg0, int arg1, int arg2) {
        field2106++;
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < arg0) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V", line = 21)
    public static void method1078(boolean arg0) {
        if (arg0) {
            field2107 = -98;
        }
        field2104 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lm;IBILjava/awt/Canvas;Lhs;)Lqa;", line = 37)
    public static final class129 method1079(class79 arg0, int arg1, byte arg2, int arg3, Canvas arg4, class441 arg5) {
        field2105++;
        if (arg2 < 50) {
            method1079(null, -35, (byte) -37, -13, null, null);
        }
        return new class463(arg1, arg4, arg0, arg3, arg5);
    }
}
