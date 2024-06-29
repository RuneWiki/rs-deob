import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class241 extends class525 {

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lvm;")
    public class492 field3612;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Z")
    public static boolean field3614 = false;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Lqv;")
    public static class316 field3616;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lgw;")
    public static class118 field3617;

    static {
        new class44("From", "Von:", "De", "De");
        field3616 = new class316(36, -2);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lvm;)V", line = 9)
    public class241(class492 arg0) {
        this.field3612 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([J[IB)V", line = 21)
    public static final void method1591(long[] arg0, int[] arg1, byte arg2) {
        int var3 = -71 / ((26 - arg2) / 54);
        class57.method483(arg1, arg0, 85, arg0.length - 1, 0);
        field3615++;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 41)
    public static void method1592(int arg0) {
        field3616 = null;
        field3617 = null;
        if (arg0 != 36) {
            field3613 = -18;
        }
    }
}
