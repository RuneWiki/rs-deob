import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class619 {

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "I")
    public static int field8966 = 503;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lcea;")
    public static class94 field8968;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "[Leh;")
    public static class203[] field8969;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3563(int arg0) {
        class568.field8272.method1995((byte) -123);
        field8971++;
        if (arg0 != 503) {
            field8966 = -2;
        }
        class59.field956.method1995((byte) -123);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V", line = 24)
    public static void method3564(int arg0) {
        field8968 = null;
        if (arg0 < -115) {
            field8969 = null;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIIIIIII)V", line = 39)
    public static final void method3565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 >= -17) {
            field8968 = null;
        }
        class262.field3405[class218.field2907++] = new class203(arg3, arg0, arg4, arg7, arg7, arg4, arg6, arg8, arg8, arg6, arg2, arg2, arg5, arg5);
        field8970++;
    }
}
