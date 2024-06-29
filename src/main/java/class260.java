import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class260 extends class751 {

    @OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
    private int field3650 = 0;

    @OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
    private int field3652 = 1365;

    @OriginalMember(owner = "client!gca", name = "H", descriptor = "I")
    private int field3655 = 20;

    @OriginalMember(owner = "client!gca", name = "K", descriptor = "I")
    private int field3658 = 0;

    @OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!gca", name = "J", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!gca", name = "G", descriptor = "[I")
    public static int[] field3654;

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V", line = 13)
    public class260() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "(B)V", line = 16)
    public static void method1709(byte arg0) {
        if (arg0 != -84) {
            field3654 = null;
        }
        field3654 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIIIIIIB)V", line = 29)
    public static final void method1710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 > 2) {
            ++field3648;
            class679.field9654[class395.field5607++] = new class302(arg4, arg1, arg0, arg2, arg2, arg0, arg7, arg5, arg5, arg7, arg3, arg3, arg6, arg6);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILrv;I)V", line = 41)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field3657;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field3658 = arg1.method898((byte) -119);
                    }
                } else {
                    this.field3650 = arg1.method898((byte) -81);
                }
            } else {
                this.field3655 = arg1.method898((byte) -101);
            }
        } else {
            this.field3652 = arg1.method898((byte) -116);
        }
        int var5 = -22 % ((25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZZIILwq;)V", line = 98)
    public static final void method1711(boolean arg0, boolean arg1, int arg2, int arg3, class176 arg4) {
        ++field3653;
        int var5 = arg4.field2673;
        if (arg4.field2655 != 0) {
            if (~arg4.field2655 != -2) {
                if (~arg4.field2655 == -3) {
                    arg4.field2673 = arg4.field2530 * arg2 >> 14;
                }
            } else {
                arg4.field2673 = arg2 - arg4.field2530;
            }
        } else {
            arg4.field2673 = arg4.field2530;
        }
        if (arg0) {
            field3656 = 115;
        }
        int var6 = arg4.field2664;
        if (arg4.field2616 != 0) {
            if (~arg4.field2616 != -2) {
                if (~arg4.field2616 == -3) {
                    arg4.field2664 = arg4.field2498 * arg3 >> 14;
                }
            } else {
                arg4.field2664 = -arg4.field2498 + arg3;
            }
        } else {
            arg4.field2664 = arg4.field2498;
        }
        if (~arg4.field2655 == -5) {
            arg4.field2673 = arg4.field2664 * arg4.field2519 / arg4.field2546;
        }
        if (arg4.field2616 == 4) {
            arg4.field2664 = arg4.field2673 * arg4.field2546 / arg4.field2519;
        }
        if (class52.field744 && (~client.method2049(arg4).field9229 != -1 || ~arg4.field2560 == -1)) {
            if (~arg4.field2664 > -6 && ~arg4.field2673 > -6) {
                arg4.field2673 = 5;
                arg4.field2664 = 5;
            } else {
                if (arg4.field2673 <= 0) {
                    arg4.field2673 = 5;
                }
                if (~arg4.field2664 >= -1) {
                    arg4.field2664 = 5;
                }
            }
        }
        if (class11.field239 == arg4.field2551) {
            class586.field8296 = arg4;
        }
        if (arg1 && arg4.field2584 != null) {
            if (~arg4.field2673 != ~var5 || arg4.field2664 != var6) {
                class140 var7 = new class140();
                var7.field1802 = arg4;
                var7.field1808 = arg4.field2584;
                class526.field7486.method2510(var7, false);
            }
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)[I", line = 177)
    public final int[] method365(int arg0, int arg1) {
        ++field3649;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            this.field3652 = -124;
        }
        if (super.field10405.field8923) {
            for (int var4 = 0; class673.field9452 > var4; ++var4) {
                int var5 = (class179.field2708[var4] << 12) / this.field3652 + this.field3650;
                int var6 = (class619.field8728[arg0] << 12) / this.field3652 + this.field3658;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && var13 < this.field3655) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var11 + var7;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 <= ~(this.field3655 + -1) ? 0 : (var13 << 12) / this.field3655;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(IBI)V", line = 236)
    public static final void method1712(int arg0, byte arg1, int arg2) {
        ++field3651;
        class389.field5537 = arg2 - class436.field6239;
        class265.field3746 = -class436.field6233 + arg0;
        if (arg1 != 73) {
            field3656 = -28;
        }
    }
}
