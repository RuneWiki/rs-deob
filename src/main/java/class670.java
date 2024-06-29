import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class670 {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
    public static int[] field9545 = new int[14];

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "Llc;")
    public static class435 field9549 = new class435(39, -2);

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field9546;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIZI)V", line = 3)
    public static final void method3820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg5 == 0) {
            field9548++;
            if ((arg6 ? class243.field3580.field7969.method3577(false) : class243.field3580.field7989.method3577(false)) != 0 && arg3 != 0 && class279.field3914 < 50 && arg0 != -1) {
                class585.field8346[class279.field3914++] = new class105((byte) (arg6 ? 3 : 2), arg0, arg3, arg2, arg1, arg4, arg7, null);
            }
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V", line = 21)
    public static void method3821(boolean arg0) {
        field9546 = null;
        field9545 = null;
        field9549 = null;
        if (arg0) {
            field9545 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method3822(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field9545 = null;
        }
        field9547++;
        return (class150.method1089(0, arg1, arg2) | class163.method1149(arg1, (byte) -125, arg2) | class520.method3159(arg0 + 53, arg1, arg2)) & class277.method1785(-1, arg2, arg1);
    }
}
