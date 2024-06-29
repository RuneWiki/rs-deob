import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class567 extends class260 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "F")
    public static float field8025;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I", line = 4)
    public final int method123(int arg0) {
        if (arg0 != 4377) {
            return -45;
        } else {
            ++field8022;
            return !super.field3829.method4083(arg0 ^ 4385).method2813(false) ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)I", line = 15)
    public final int method129(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method123(95);
        }
        ++field8026;
        return 1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V", line = 26)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field8024;
        if (arg1 != 122) {
            this.method129(-86, -116);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 39)
    public final void method126(int arg0) {
        if (super.field3828 < 1 || super.field3828 > 3) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 > 102) {
            ++field8021;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)I", line = 58)
    public final int method3352(int arg0) {
        ++field8023;
        if (arg0 > -14) {
            field8025 = 0.41366032F;
        }
        return super.field3828;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILgn;)V", line = 69)
    public class567(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lgn;)V", line = 72)
    public class567(class729 arg0) {
        super(arg0);
    }
}
