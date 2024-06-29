import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class590 {

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Leq;")
    private class209 field8285;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public int field8282;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Lqe;")
    public static class465 field8287 = new class465(17, 0);

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "[I")
    public static int[] field8289 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field8290 = 0;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lcv;I)I")
    public static final int method3385(class565 arg0, int arg1) {
        if (arg1 >= -60) {
            method3386(12, 124);
        }
        field8284++;
        if (class523.field7404 == arg0) {
            return 9216;
        } else if (class521.field7381 == arg0) {
            return 34065;
        } else if (class288.field4067 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Z")
    public static final boolean method3386(int arg0, int arg1) {
        if (arg0 > -13) {
            field8281 = 45;
        }
        field8283++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method3387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field8286++;
        if (arg7 > 84) {
            class151.method1163(arg4, arg8, 0, arg5, arg3, arg1, arg6, arg0, arg2, false);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static void method3388(int arg0) {
        if (arg0 > -23) {
            method3387(-80, -8, 29, 18, -121, -98, 124, (byte) 122, -15);
        }
        field8287 = null;
        field8289 = null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class590(class179 arg0, int arg1, class209 arg2) {
        new class510(64);
        this.field8285 = arg2;
        this.field8282 = this.field8285.method1477(0, 15);
    }
}
