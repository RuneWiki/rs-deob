import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class487 extends class207 {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field6778;
        return arg0 >= -14 ? 101 : 1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Z")
    public final boolean method2844(byte arg0) {
        ++field6784;
        if (super.field2668.method2254(arg0 + 54)) {
            return false;
        } else if (super.field2668.method2248(false) == class743.field10050) {
            return true;
        } else {
            return arg0 != 8;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lrd;)V")
    public class487(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(IB)Z")
    public static final boolean method2845(int arg0, byte arg1) {
        ++field6785;
        if (arg1 != 26) {
            return false;
        } else {
            return arg0 == 10 || ~arg0 == -12 || arg0 == 12;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field6781;
        if (super.field2668.method2254(114)) {
            return 3;
        } else if (super.field2668.method2248(false) == class743.field10050) {
            return 1;
        } else {
            if (arg1 != 69) {
                this.method39(-9, (byte) -55);
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lub;I)V")
    public static final void method2846(class22 arg0, int arg1) {
        ++field6783;
        if (arg1 != -12) {
            method2845(-69, (byte) 75);
        }
        for (class119 var2 = (class119) class205.field2641.method679((byte) -86); var2 != null; var2 = (class119) class205.field2641.method681(-63)) {
            if (var2.field1609 == arg0) {
                if (var2.field1599 != null) {
                    class701.field9285.method22(var2.field1599);
                    var2.field1599 = null;
                }
                var2.method1102((byte) 85);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(ILrd;)V")
    public class487(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([BIIIIII[BI)V")
    public static final void method2847(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        ++field6782;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & arg2);
        for (int var11 = -arg1; var11 < 0; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] + -arg0[arg6++]);
                int var14 = arg5++;
                arg7[var14] = (byte) (arg7[var14] + -arg0[arg6++]);
                int var15 = arg5++;
                arg7[var15] = (byte) (arg7[var15] + -arg0[arg6++]);
                int var16 = arg5++;
                arg7[var16] = (byte) (arg7[var16] + -arg0[arg6++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg5++;
                arg7[var10001] = (byte) (arg7[var10001] + -arg0[arg6++]);
            }
            arg5 += arg4;
            arg6 += arg3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        if (arg1 < -7) {
            ++field6786;
            super.field2669 = arg0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        ++field6779;
        if (super.field2668.method2248(false) == class743.field10050) {
            if (super.field2668.method2254(42)) {
                super.field2669 = 0;
            }
        } else {
            super.field2669 = 1;
        }
        int var2 = -5 / ((arg0 - -58) / 48);
        if (super.field2669 != 0 && super.field2669 != 1) {
            super.field2669 = this.method36(-86);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I")
    public final int method2848(int arg0) {
        if (arg0 != 43) {
            return -10;
        } else {
            ++field6780;
            return super.field2669;
        }
    }
}
