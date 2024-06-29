import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class369 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
    public static boolean field5663 = false;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Lpg;")
    public static class492 field5665 = new class492(13, -2);

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    public static int[] field5666 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field5668 = 0;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5664++;
        if (class109.method719((byte) -119, arg5)) {
            if (arg8 > -95) {
                method2302(-53, -71, -122, 18, 17, 24, -127, 38, 69);
            }
            if (class471.field6886[arg5] == null) {
                class169.method1192(arg0, arg6, arg3, -1, arg7, class59.field791[arg5], (byte) -72, arg4, arg2, arg1);
            } else {
                class169.method1192(arg0, arg6, arg3, -1, arg7, class471.field6886[arg5], (byte) -74, arg4, arg2, arg1);
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class326.field5002[var9] = true;
            }
        } else {
            class326.field5002[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method2303(byte arg0) {
        if (arg0 >= 106) {
            field5666 = null;
            field5665 = null;
        }
    }
}
