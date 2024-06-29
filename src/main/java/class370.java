import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class370 extends class5 {

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    private int field4689 = 0;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    private int field4687 = 0;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field4694 = 1;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field4693 = -1;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Lwp;")
    public static class453 field4692 = new class453(21, 7);

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Lbea;")
    public static class702 field4686;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class370() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILkp;IZI)V")
    public static final void method2023(int arg0, class507 arg1, int arg2, boolean arg3, int arg4) {
        ++field4690;
        int var5 = arg1.field6793;
        if (arg1.field6704 != 0) {
            if (arg1.field6704 == 1) {
                arg1.field6793 = -arg1.field6823 + arg4;
            } else if (arg1.field6704 == 2) {
                arg1.field6793 = arg1.field6823 * arg4 >> 14;
            }
        } else {
            arg1.field6793 = arg1.field6823;
        }
        int var6 = arg1.field6700;
        if (~arg1.field6713 == -1) {
            arg1.field6700 = arg1.field6706;
        } else if (~arg1.field6713 == -2) {
            arg1.field6700 = -arg1.field6706 + arg0;
        } else if (~arg1.field6713 == -3) {
            arg1.field6700 = arg1.field6706 * arg0 >> 14;
        }
        if (~arg1.field6704 == -5) {
            arg1.field6793 = arg1.field6794 * arg1.field6700 / arg1.field6849;
        }
        if (~arg1.field6713 == -5) {
            arg1.field6700 = arg1.field6849 * arg1.field6793 / arg1.field6794;
        }
        if (class253.field3101 && (~client.method3819(arg1).field4678 != -1 || ~arg1.field6735 == -1)) {
            if (arg1.field6700 < 5 && arg1.field6793 < 5) {
                arg1.field6793 = 5;
                arg1.field6700 = 5;
            } else {
                if (arg1.field6700 <= 0) {
                    arg1.field6700 = 5;
                }
                if (~arg1.field6793 >= -1) {
                    arg1.field6793 = 5;
                }
            }
        }
        if (class205.field2605 == arg1.field6720) {
            class31.field443 = arg1;
        }
        if (arg2 != 23054) {
            field4693 = 71;
        }
        if (arg3 && arg1.field6872 != null) {
            if (~arg1.field6793 != ~var5 || ~arg1.field6700 != ~var6) {
                class71 var7 = new class71();
                var7.field963 = arg1.field6872;
                var7.field952 = arg1;
                class231.field2884.method239(var7, (byte) 93);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        int var2 = -67 % ((64 - arg0) / 60);
        ++field4688;
        class205.method1241(0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II[BI[BIIII)V")
    public static final void method2024(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4695;
        int var9 = -(arg0 >> 2);
        int var10 = 88 / ((-11 - arg8) / 59);
        int var11 = -(arg0 & 3);
        for (int var12 = -arg6; ~var12 > -1; ++var12) {
            int var10001;
            for (int var13 = var9; var13 < 0; ++var13) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg4[arg3++]);
                int var15 = arg7++;
                arg2[var15] = (byte) (arg2[var15] + -arg4[arg3++]);
                int var16 = arg7++;
                arg2[var16] = (byte) (arg2[var16] + -arg4[arg3++]);
                int var17 = arg7++;
                arg2[var17] = (byte) (arg2[var17] + -arg4[arg3++]);
            }
            for (int var14 = var11; ~var14 > -1; ++var14) {
                var10001 = arg7++;
                arg2[var10001] = (byte) (arg2[var10001] + -arg4[arg3++]);
            }
            arg7 += arg5;
            arg3 += arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
    public static void method2025(int arg0) {
        if (arg0 != 0) {
            field4693 = 104;
        }
        field4686 = null;
        field4692 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field4694 = arg1.method3501(arg0 ^ -9267);
                }
            } else {
                this.field4687 = arg1.method3501(-9268);
            }
        } else {
            this.field4689 = arg1.method3501(-9268);
        }
        ++field4696;
        if (arg0 != 1) {
            this.method47(17, (class630) null, 78);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field4691;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int var4 = class272.field3439[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class657.field9287 < ~var6; ++var6) {
                int var7 = class269.field3405[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field4689 == 0) {
                    var9 = (-var4 + var7) * this.field4694;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4694 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field4687 == -1) {
                    var12 = class267.field3384[(var12 & 4086) >> 4] + 4096 >> 1;
                } else if (~this.field4687 == -3) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        int var13 = 47 / ((arg0 - 81) / 36);
        return var3;
    }
}
