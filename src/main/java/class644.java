import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class644 extends class322 {

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!nia", name = "p", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!nia", name = "q", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!nia", name = "r", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!nia", name = "s", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lch;)V")
    public class644(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z")
    public final boolean method3558(byte arg0) {
        if (arg0 != -53) {
            return false;
        } else {
            ++field8819;
            if (super.field4450.method2751(arg0 ^ 18416)) {
                return false;
            } else {
                return super.field4450.method2749(-21) == class556.field7800;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(ILch;)V")
    public class644(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field8822;
        if (super.field4450.method2751(-18373)) {
            return 3;
        } else if (arg1 < 10) {
            return 114;
        } else {
            return super.field4450.method2749(-21) == class556.field7800 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        ++field8826;
        if (arg0 != 0) {
            this.method22(71, 122);
        }
        super.field4451 = arg1;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        if (super.field4450.method2749(-21) != class556.field7800) {
            super.field4451 = 1;
        } else if (super.field4450.method2751(-18373)) {
            super.field4451 = 0;
        }
        if (arg0) {
            field8821 = 66;
        }
        ++field8825;
        if (~super.field4451 != -1 && super.field4451 != 1) {
            super.field4451 = this.method17((byte) -26);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -111 / ((70 - arg0) / 51);
        ++field8820;
        return 1;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(Z)I")
    public final int method3559(boolean arg0) {
        ++field8824;
        if (arg0) {
            this.method19(108, 92);
        }
        return super.field4451;
    }
}
