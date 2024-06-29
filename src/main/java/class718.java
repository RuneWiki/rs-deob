import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class718 extends class502 {

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "[Lbq;")
    public static class307[] field9874 = new class307[8];

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lvl;")
    public static class15 field9879 = new class15(71, 2);

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "F")
    public static float field9878;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field9875;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field9880;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Leka;)V")
    public class718(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(B)I")
    public final int method3987(byte arg0) {
        if (arg0 <= 49) {
            return -58;
        } else {
            ++field9875;
            return super.field6865;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(ILeka;)V")
    public class718(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        ++field9882;
        if (!arg0) {
            field9874 = null;
        }
        if (super.field6863.field6741.method4321((byte) -115) && super.field6865 == 2) {
            super.field6865 = 1;
        }
        if (super.field6865 < 0 || ~super.field6865 < -3) {
            super.field6865 = this.method55(-2);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZLia;)Z")
    public static final boolean method3988(int arg0, boolean arg1, class616 arg2) {
        class228.field3326.method1878(arg2.field8581[arg0], arg2.field8583[arg0], arg2.field8588[arg0], class508.field6979);
        ++field9876;
        if (arg1) {
            method3989(-126);
        }
        int var3 = class508.field6979[2];
        if (~var3 > -51) {
            return false;
        } else {
            arg2.field8579[arg0] = (short) (class508.field6979[0] * class129.field2256 / var3 + class45.field705);
            arg2.field8585[arg0] = (short) (class508.field6979[1] * class159.field2570 / var3 + class715.field9838);
            arg2.field8577[arg0] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field9880;
        if (arg1 != 0) {
            method3989(-123);
        }
        return 1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field9881;
        if (arg0 != -2) {
            field9879 = null;
        }
        return 2;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
    public static void method3989(int arg0) {
        if (arg0 > 112) {
            field9874 = null;
            field9879 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        ++field9883;
        super.field6865 = arg0;
        if (arg1 != 0) {
            this.method58(true);
        }
    }
}
