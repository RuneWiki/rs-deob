import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class726 extends class260 {

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "Lfba;")
    public static class27 field10035 = new class27(82, 3);

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lde;")
    public static class556 field10039 = new class556();

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Lbu;")
    public static class21 field10040 = new class21(71, 6);

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "[I")
    public static int[] field10041 = new int[2];

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field10032;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lgn;)V")
    public class726(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public final void method126(int arg0) {
        ++field10034;
        if (this.method4066(false)) {
            if (super.field3829.field10098.method1591(109) && !class668.method3800(super.field3829.field10098.method1588(-97), false)) {
                super.field3828 = 1;
            }
            if (super.field3829.field10079.method3352(-73) == 1) {
                super.field3828 = 1;
            }
        }
        if (super.field3828 == 3) {
            super.field3828 = 2;
        }
        if (super.field3828 < 0 || ~super.field3828 < -4) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            field10035 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
    public static void method4065(int arg0) {
        field10040 = null;
        if (arg0 < 48) {
            method4065(-32);
        }
        field10041 = null;
        field10039 = null;
        field10035 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)V")
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field10033;
        if (arg1 != 122) {
            method4065(-83);
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            return 54;
        } else {
            ++field10038;
            if (class456.method2721(false, arg1)) {
                if (super.field3829.field10098.method1591(arg0 + 93) && !class668.method3800(super.field3829.field10098.method1588(-43), false)) {
                    return 3;
                }
                if (super.field3829.field10079.method3352(arg0 + -72) == 1) {
                    return 3;
                }
            }
            if (~arg1 == -4) {
                return 3;
            } else {
                return class456.method2721(false, arg1) ? 2 : 1;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(ILgn;)V")
    public class726(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)I")
    public final int method123(int arg0) {
        ++field10032;
        return arg0 != 4377 ? -82 : 0;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)Z")
    public final boolean method4066(boolean arg0) {
        ++field10031;
        if (arg0) {
            this.method4066(true);
        }
        return class456.method2721(false, super.field3828);
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)I")
    public final int method4067(int arg0) {
        if (arg0 > -14) {
            return -106;
        } else {
            ++field10037;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)Z")
    public final boolean method4068(int arg0) {
        if (arg0 <= 73) {
            field10039 = null;
        }
        ++field10036;
        return true;
    }
}
