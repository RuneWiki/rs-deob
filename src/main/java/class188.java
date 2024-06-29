import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class188 extends class530 {

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V", line = 4)
    public final void method70(int arg0, int arg1) {
        if (arg1 >= -38) {
            field2742 = 7;
        }
        super.field7419 = arg0;
        ++field2749;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I", line = 19)
    public final int method75(int arg0, int arg1) {
        ++field2743;
        if (super.field7418.method2246(1) == class75.field1037) {
            if (super.field7418.method2253(-63)) {
                return 3;
            } else {
                return ~arg0 != -1 && ~super.field7418.field5163.method989(0) != -2 ? 2 : 1;
            }
        } else {
            int var3 = -42 / ((arg1 - 63) / 60);
            return 3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Z", line = 44)
    public final boolean method1256(boolean arg0) {
        ++field2747;
        if (!arg0) {
            return true;
        } else if (super.field7418.method2246(1) == class75.field1037) {
            return !super.field7418.method2253(-70);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 65)
    public final void method73(boolean arg0) {
        if (super.field7418.method2246(1) == class75.field1037) {
            if (super.field7418.method2253(121)) {
                super.field7419 = 0;
            }
        } else {
            super.field7419 = 1;
        }
        ++field2750;
        if (~super.field7419 != -1 && super.field7419 != 1) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            field2742 = -111;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I", line = 85)
    public final int method1257(int arg0) {
        if (arg0 != 0) {
            return 96;
        } else {
            ++field2746;
            return super.field7419;
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lah;)V", line = 96)
    public class188(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILah;)V", line = 103)
    public class188(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)Z", line = 106)
    public static final boolean method1258(int arg0, int arg1) {
        ++field2745;
        if (arg0 != 1) {
            method1258(38, 63);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)I", line = 117)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            this.method70(44, 104);
        }
        ++field2744;
        return 1;
    }
}
