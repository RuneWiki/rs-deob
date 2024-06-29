import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class214 extends class260 {

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 4)
    public final void method126(int arg0) {
        ++field3310;
        if (~super.field3828 != -2 && ~super.field3828 != -1) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            this.method129(-32, 122);
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I", line = 17)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return -90;
        } else {
            ++field3313;
            return 1;
        }
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(I)V", line = 28)
    public static final void method1471(int arg0) {
        if (arg0 <= 62) {
            method1471(100);
        }
        class530.field7675 = -1;
        ++field3309;
        class760.field10484 = 0;
        class779.field10695 = -1;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V", line = 42)
    public final void method128(int arg0, byte arg1) {
        if (arg1 != 122) {
            this.method128(-23, (byte) -11);
        }
        super.field3828 = arg0;
        ++field3311;
    }

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "(I)Z", line = 55)
    public static final boolean method1472(int arg0) {
        ++field3312;
        if (arg0 != 0) {
            method1473(-120, -121, -94);
        }
        return !class581.method3402("jaclib", (byte) -18) ? false : class581.method3402("hw3d", (byte) -18);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)Z", line = 71)
    public static final boolean method1473(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            return false;
        } else {
            ++field3308;
            return class611.method3550(arg1, -17362, arg0) | ~(arg0 & 458752) != -1 || class147.method1033((byte) -110, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILgn;)V", line = 83)
    public class214(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "(I)I", line = 88)
    public final int method1474(int arg0) {
        ++field3305;
        if (arg0 > -14) {
            method1471(-5);
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "(II)I", line = 102)
    public static final int method1475(int arg0, int arg1) {
        ++field3306;
        if (~arg0 > -97) {
            return 0;
        } else {
            if (arg1 >= -48) {
                method1475(-16, 42);
            }
            return ~arg0 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lgn;)V", line = 122)
    public class214(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(II)I", line = 125)
    public final int method129(int arg0, int arg1) {
        ++field3307;
        return arg0 != -1 ? -17 : 1;
    }
}
