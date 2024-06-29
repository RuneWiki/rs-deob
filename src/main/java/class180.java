import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class180 extends class362 {

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    private int field2821 = 4096;

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "I")
    private int field2824 = 4096;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "I")
    private int field2825 = 4096;

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "[I")
    private int[] field2831 = new int[3];

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    private int field2829 = 409;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "Z")
    public static boolean field2828 = true;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "Z")
    public static boolean field2827 = false;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "I")
    public static int field2826 = -1;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!wq", name = "B", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!wq", name = "M", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "()V", line = 236)
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)[[I", line = 7)
    public final int[][] method153(int arg0, byte arg1) {
        ++field2822;
        if (arg1 <= 57) {
            this.method153(63, (byte) 94);
        }
        int[][] var3 = super.field4938.method3199(arg0, (byte) 103);
        if (super.field4938.field7848) {
            int[][] var4 = this.method2222(0, arg0, 28008);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class769.field10597 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2831[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (this.field2829 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field2831[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field2829) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field2831[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field2829 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field2824 * var12 >> 12;
                            var9[var11] = this.field2821 * var14 >> 12;
                            var10[var11] = this.field2825 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBI)I", line = 101)
    public static final int method1354(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 3;
        ++field2830;
        if (var4 == 0) {
            return arg1;
        } else if (arg2 != 113) {
            return -90;
        } else if (~var4 == -2) {
            return arg3;
        } else {
            return ~var4 == -3 ? 7 - arg1 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILbi;Lha;Lgka;IILpo;I)V", line = 125)
    public static final void method1355(int arg0, int arg1, class508 arg2, class66 arg3, class393 arg4, int arg5, int arg6, class585 arg7, int arg8) {
        ++field2832;
        int var9 = -(arg5 / 2) + arg0 + -5;
        int var10 = arg1 + 2;
        if (arg4.field5424 != 0) {
            arg3.method472(arg8 ^ 12782, 1 + (arg1 - (-(arg6 * arg7.method3364()) + var10)), var9, arg5 + 10, arg4.field5424, var10);
        }
        if (~arg4.field5406 != -1) {
            arg3.method568(arg4.field5406, var9, arg5 + 10, -93, -var10 + arg7.method3364() * arg6 + arg1 + 1, var10);
        }
        if (arg8 != 21938) {
            field2828 = false;
        }
        int var11 = arg4.field5396;
        if (arg2.field6975 && ~arg4.field5410 != 0) {
            var11 = arg4.field5410;
        }
        for (int var12 = 0; arg6 > var12; ++var12) {
            String var13 = class207.field3114[var12];
            if (~(arg6 + -1) < ~var12) {
                var13 = var13.substring(0, -4 + var13.length());
            }
            arg7.method3365(arg3, var13, arg0, arg1, var11, true);
            arg1 += arg7.method3364();
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lfca;II)V", line = 169)
    public final void method154(class93 arg0, int arg1, int arg2) {
        ++field2823;
        if (arg2 != -1) {
            field2826 = 61;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method767((byte) -119);
                            this.field2831[0] = class204.method1456(var5, 16711680) << 4;
                            this.field2831[2] = class204.method1456(var5, 255) >> 12;
                            this.field2831[1] = class204.method1456(var5, 65280) >> 4;
                        }
                    } else {
                        this.field2824 = arg0.method763(-64);
                    }
                } else {
                    this.field2821 = arg0.method763(75);
                }
            } else {
                this.field2825 = arg0.method763(arg2 + -95);
            }
        } else {
            this.field2829 = arg0.method763(-115);
        }
    }
}
