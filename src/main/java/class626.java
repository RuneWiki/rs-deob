import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class626 extends class511 {

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public int field8990;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field8989 = 0;

    @OriginalMember(owner = "client!go", name = "E", descriptor = "[J")
    public static long[] field8988 = new long[10];

    @OriginalMember(owner = "client!go", name = "L", descriptor = "Z")
    public static boolean field8994 = false;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V", line = 3)
    public static void method3589(int arg0) {
        int var1 = 34 / ((52 - arg0) / 51);
        field8988 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)Z", line = 14)
    public static final boolean method3590(int arg0, boolean arg1) {
        if (arg1) {
            field8989 = -63;
        }
        field8993++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lkda;Lcu;IIIIIIIIIIIIII)V", line = 27)
    public class626(class388 arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field8990 = arg15;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Lhs;", line = 35)
    public final class325 method777(int arg0) {
        field8987++;
        return arg0 > -8 ? null : class675.field9563;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V", line = 59)
    public static final void method3591(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        field8991++;
        class303.field3790 = 3;
        class699.field9857 = -1;
        class233.field2750 = 100;
        class22.field197 = arg1;
    }
}
