import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class205 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Lqk;")
    public static class148 field2939 = new class148(46, -1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 3)
    public static void method1370(int arg0) {
        if (arg0 >= -48) {
            method1370(116);
        }
        field2939 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method1371(int arg0, byte arg1) {
        class308.field3973 = arg0;
        class470.field6423 = 0;
        class108.field1548 = -1;
        class736.field10292 = 1;
        class539.field7539 = null;
        field2937++;
        int var2 = -5 / ((arg1 + 62) / 44);
        class355.field4565 = null;
        class703.field9783 = -1;
        class298.field3896 = false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZII)V", line = 37)
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            method1372(-113, -13, -5, 93, true, 108, -5);
        }
        field2938++;
        if (class674.field9500.field5142.method3216(0) != 0 && arg2 != 0 && class596.field8577 < 50 && arg0 != -1) {
            class293.field3830[class596.field8577++] = new class362((byte) 1, arg0, arg2, arg6, arg1, arg3, arg5, null);
        }
    }
}
