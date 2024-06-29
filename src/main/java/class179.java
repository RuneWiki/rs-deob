import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class179 {

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "[I")
    public static int[] field2797 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "J")
    public long field2798;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lol;")
    public class179 field2795;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Lol;")
    public class179 field2799;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lqq;")
    public static class318 field2801;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method1120(int arg0) {
        field2800++;
        if (class150.field2424) {
            return;
        }
        class249.method1504(0, class20.field253);
        if (arg0 == 1) {
            if (class471.field7206 != null) {
                class249.method1504(0, class471.field7206);
            }
            class150.field2424 = true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public final void method1121(boolean arg0) {
        field2793++;
        if (arg0) {
            method1122(-82, 117, -117, 105, 54, -18, null);
        }
        if (this.field2795 != null) {
            this.field2795.field2799 = this.field2799;
            this.field2799.field2795 = this.field2795;
            this.field2795 = null;
            this.field2799 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIILta;)V")
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class135 arg6) {
        field2796++;
        class149.method973(arg4, arg3, arg0, arg1, arg6.field3222, 0, arg6.field3218, arg2, arg5, arg6.field3217);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public static void method1123(int arg0) {
        field2797 = null;
        field2801 = null;
        if (arg0 > -90) {
            method1123(-114);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Z")
    public final boolean method1124(int arg0) {
        field2794++;
        if (this.field2795 == null) {
            return false;
        } else {
            if (arg0 > -117) {
                field2801 = null;
            }
            return true;
        }
    }
}
