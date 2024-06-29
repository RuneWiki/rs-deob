import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class50 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Llh;")
    public static class492 field645 = new class492("WTRC", 1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIIIII)Z")
    public static final boolean method293(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field643++;
        if (!arg0) {
            method294(50);
        }
        for (int var6 = arg5; var6 <= arg3; var6++) {
            for (int var7 = arg4; var7 <= arg2; var7++) {
                if (class701.field9813[var6][var7] == arg1 && class372.field4799[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static void method294(int arg0) {
        if (arg0 != 512) {
            method293(true, -30, 111, 46, -40, 90);
        }
        field645 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
    public static final void method295(int arg0, int arg1, int arg2) {
        field644++;
        class243 var3 = class546.method2926(arg0, 5, true);
        if (arg1 != 16568) {
            method293(true, -13, 33, 60, 67, 127);
        }
        var3.method1457(39);
        var3.field3132 = arg2;
    }
}
