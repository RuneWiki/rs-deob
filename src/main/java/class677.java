import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class677 {

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "[I")
    public static int[] field9524 = new int[2];

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    public static int field9526 = 0;

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "Lqe;")
    public static class433 field9525 = new class433();

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "Leu;")
    public static class444 field9527 = new class444(5, 1);

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
    public static int field9528 = 0;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field9529 = 0;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 8)
    public static void method3868(byte arg0) {
        field9524 = null;
        if (arg0 == 103) {
            field9527 = null;
            field9525 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(III)Liq;", line = 29)
    public static final class563 method3869(int arg0, int arg1, int arg2) {
        class252 var3 = class454.field6818[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4019;
    }
}
