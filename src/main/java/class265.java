import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class265 extends class530 {

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "Lqk;")
    public static class148 field3616 = new class148(102, 2);

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Lqk;")
    public static class148 field3617 = new class148(103, -2);

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public static int field3619 = 0;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "[Llq;")
    public static class199[] field3618;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field3609;
        if (class564.method3366(arg0, (byte) 94)) {
            if (super.field7418.field5158.method1005(-96) && !class155.method985(super.field7418.field5158.method1006(0), -53)) {
                return 3;
            }
            if (super.field7418.field5150.method1962(0) == 1) {
                return 3;
            }
        }
        int var3 = 101 % ((63 - arg1) / 60);
        if (~arg0 == -4) {
            return 3;
        } else {
            return class564.method3366(arg0, (byte) -75) ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Z")
    public final boolean method1633(byte arg0) {
        if (arg0 != 107) {
            this.method70(-15, 98);
        }
        ++field3612;
        return class564.method3366(super.field7419, (byte) -92);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        ++field3614;
        if (arg1 < -38) {
            super.field7419 = arg0;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (arg0) {
            if (this.method1633((byte) 107)) {
                if (super.field7418.field5158.method1005(-92) && !class155.method985(super.field7418.field5158.method1006(0), -100)) {
                    super.field7419 = 1;
                }
                if (~super.field7418.field5150.method1962(0) == -2) {
                    super.field7419 = 1;
                }
            }
            ++field3610;
            if (super.field7419 == 3) {
                super.field7419 = 2;
            }
            if (~super.field7419 > -1 || ~super.field7419 < -4) {
                super.field7419 = this.method74(0);
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            this.method1636(-96);
        }
        ++field3611;
        return 0;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lah;)V")
    public class265(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static void method1634(int arg0) {
        field3616 = null;
        field3618 = null;
        field3617 = null;
        if (arg0 != -1733) {
            method1634(-20);
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(Z)Z")
    public final boolean method1635(boolean arg0) {
        ++field3613;
        if (!arg0) {
            field3618 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(ILah;)V")
    public class265(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)I")
    public final int method1636(int arg0) {
        if (arg0 != 0) {
            return 19;
        } else {
            ++field3615;
            return super.field7419;
        }
    }
}
