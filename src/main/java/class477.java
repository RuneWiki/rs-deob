import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class477 extends class545 {

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "[I")
    public static int[] field6777 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "F")
    public static float field6784;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lch;)V")
    public class477(class38 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        ++field6780;
        if (arg0 != 2) {
            this.method451(25, -9, -118);
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(Z)V")
    public static void method2852(boolean arg0) {
        field6777 = null;
        if (!arg0) {
            method2852(false);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        ++field6781;
        if (arg1) {
            this.method459(80);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        if (arg0 < 101) {
            field6777 = null;
        }
        ++field6779;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        super.field7920.method264(arg2, -2);
        ++field6778;
        if (arg0 != 2) {
            this.method457((byte) -90, true);
        }
        super.field7920.method411(17024, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        ++field6782;
        if (arg0 < 63) {
            this.method457((byte) -6, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        ++field6783;
        if (arg0 != 0) {
            this.method451(2, 27, -76);
        }
    }
}
