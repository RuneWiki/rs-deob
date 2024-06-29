import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class483 extends class530 {

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Lju;")
    public static class102 field6536 = new class102(60, 4);

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "Lfha;")
    public static class522 field6544 = new class522();

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I", line = 5)
    public final int method2840(int arg0) {
        ++field6540;
        return arg0 != 0 ? 99 : super.field7419;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILah;)V", line = 18)
    public class483(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)Z", line = 21)
    public final boolean method2841(boolean arg0) {
        if (!arg0) {
            field6544 = null;
        }
        ++field6537;
        if (super.field7418.method2253(116)) {
            return false;
        } else {
            return super.field7418.method2246(1) == class75.field1037;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I", line = 40)
    public final int method75(int arg0, int arg1) {
        ++field6539;
        int var3 = -101 % ((63 - arg1) / 60);
        if (super.field7418.method2253(126)) {
            return 3;
        } else {
            return super.field7418.method2246(1) == class75.field1037 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)I", line = 58)
    public final int method74(int arg0) {
        if (arg0 != 0) {
            field6544 = null;
        }
        ++field6541;
        return 1;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lah;)V", line = 82)
    public class483(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V", line = 85)
    public final void method70(int arg0, int arg1) {
        ++field6538;
        if (arg1 < -38) {
            super.field7419 = arg0;
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 96)
    public static void method2842(int arg0) {
        if (arg0 <= -103) {
            field6536 = null;
            field6544 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V", line = 108)
    public static final void method2843(byte arg0, int arg1, int arg2) {
        ++field6542;
        class118 var3 = class126.method814(true, arg1, 7);
        var3.method771(-30559);
        var3.field1636 = arg2;
        if (arg0 != 75) {
            field6545 = 104;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 122)
    public final void method73(boolean arg0) {
        if (super.field7418.method2246(1) == class75.field1037) {
            if (super.field7418.method2253(-29)) {
                super.field7419 = 0;
            }
        } else {
            super.field7419 = 1;
        }
        ++field6543;
        if (~super.field7419 != -1 && super.field7419 != 1) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            field6536 = null;
        }
    }
}
