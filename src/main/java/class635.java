import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class635 {

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field8667 = 1;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Ljava/lang/Object;")
    public static volatile Object field8665 = null;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "D")
    public static double field8664;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Loaa;I)Z")
    public static final boolean method3579(class305 arg0, int arg1) {
        field8663++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field3643) {
            return false;
        } else if (!arg0.method1763((byte) -121, class9.field146)) {
            return false;
        } else if (class569.field7805.method2121(76, (long) arg0.field3646) == null) {
            if (arg1 != 1) {
                method3580(-29);
            }
            return class749.field10399.method2121(56, (long) arg0.field3657) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method3580(int arg0) {
        field8665 = null;
        if (arg0 != 1) {
            method3581(109);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)J")
    public static final long method3581(int arg0) {
        if (arg0 != -14513) {
            method3579(null, -80);
        }
        field8666++;
        return class253.field2957.method1831(-2);
    }
}
