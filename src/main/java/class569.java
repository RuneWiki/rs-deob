import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class569 extends class335 {

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    private int field7751 = 0;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    private int field7753 = 0;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    private int field7757 = 0;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "[I")
    public static int[] field7752 = new int[13];

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "[I")
    public static int[] field7758 = new int[13];

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "[I")
    public static int[] field7756 = new int[2];

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "Leba;")
    public static class550 field7748 = new class550(82, 2);

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    private int field7747;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    private int field7754;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
    private int field7755;

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
    private int field7759;

    @OriginalMember(owner = "client!gr", name = "Q", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
    private int field7762;

    @OriginalMember(owner = "client!gr", name = "S", descriptor = "I")
    private int field7763;

    @OriginalMember(owner = "client!gr", name = "T", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!gr", name = "U", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "[[Lrca;")
    public static class34[][] field7760;

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V", line = 5)
    public class569() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)[[I", line = 10)
    public final int[][] method1(int arg0, boolean arg1) {
        ++field7750;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            method3153(-11, 98, (byte[]) null, -120, 55, 116);
        }
        if (super.field4527.field1468) {
            int[][] var4 = this.method1968(arg0, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class649.field8968; ++var11) {
                this.method3152(var7[var11], var6[var11], var5[var11], (byte) 124);
                this.field7755 += this.field7753;
                this.field7759 += this.field7757;
                this.field7747 += this.field7751;
                while (this.field7759 < 0) {
                    this.field7759 += 4096;
                }
                if (this.field7755 < 0) {
                    this.field7755 = 0;
                }
                while (this.field7759 > 4096) {
                    this.field7759 -= 4096;
                }
                if (~this.field7755 < -4097) {
                    this.field7755 = 4096;
                }
                if (~this.field7747 > -1) {
                    this.field7747 = 0;
                }
                if (~this.field7747 < -4097) {
                    this.field7747 = 4096;
                }
                this.method3149(this.field7759, this.field7755, this.field7747, 4544);
                var8[var11] = this.field7763;
                var9[var11] = this.field7762;
                var10[var11] = this.field7754;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILio;I)V", line = 88)
    public final void method2(int arg0, class157 arg1, int arg2) {
        ++field7749;
        if (arg2 == -66) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field7751 = (arg1.method969(3) << 12) / 100;
                    }
                } else {
                    this.field7753 = (arg1.method969(3) << 12) / 100;
                }
            } else {
                this.field7757 = arg1.method928(arg2 ^ -2016790162);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII)V", line = 137)
    private final void method3149(int arg0, int arg1, int arg2, int arg3) {
        ++field7761;
        if (arg3 != 4544) {
            this.field7759 = 48;
        }
        int var5 = arg2 <= 2048 ? (4096 - -arg1) * arg2 >> 12 : arg2 - -arg1 + -(arg1 * arg2 >> 12);
        if (~var5 >= -1) {
            this.field7763 = this.field7762 = this.field7754 = arg2;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg2 - -arg2 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field7763 = var5;
                                    this.field7754 = var15;
                                    this.field7762 = var7;
                                }
                            } else {
                                this.field7763 = var14;
                                this.field7762 = var7;
                                this.field7754 = var5;
                            }
                        } else {
                            this.field7754 = var5;
                            this.field7763 = var7;
                            this.field7762 = var15;
                        }
                    } else {
                        this.field7754 = var14;
                        this.field7762 = var5;
                        this.field7763 = var7;
                    }
                } else {
                    this.field7754 = var7;
                    this.field7762 = var5;
                    this.field7763 = var15;
                }
            } else {
                this.field7762 = var14;
                this.field7754 = var7;
                this.field7763 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V", line = 243)
    public static void method3150(int arg0) {
        int var1 = 1 / ((-35 - arg0) / 34);
        field7756 = null;
        field7760 = null;
        field7758 = null;
        field7752 = null;
        field7748 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBLwo;Lr;)V", line = 259)
    public static final void method3151(int arg0, int arg1, byte arg2, class445 arg3, class562 arg4) {
        class533.field7329.method2512(-11558);
        ++field7746;
        if (!class584.field8010) {
            for (class694 var5 = (class694) arg3.method2506(68); var5 != null; var5 = (class694) arg3.method2505(-119)) {
                class83 var6 = class672.field9554.method2158(var5.field9786, (byte) -125);
                if (class422.method2382(false, var6)) {
                    boolean var7 = class548.method3069(arg0, arg1, var5, arg4, 2, var6);
                    if (var7) {
                        class643.method3573(arg4, 38, var6, var5);
                    }
                }
            }
            if (arg2 < 65) {
                field7760 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIB)V", line = 298)
    private final void method3152(int arg0, int arg1, int arg2, byte arg3) {
        ++field7765;
        int var5 = ~arg1 <= ~arg2 ? arg1 : arg2;
        int var6 = ~arg2 <= ~arg1 ? arg1 : arg2;
        int var7 = var5 >= arg0 ? var5 : arg0;
        int var8 = arg0 >= var6 ? var6 : arg0;
        int var9 = -var8 + var7;
        this.field7747 = (var7 + var8) / 2;
        if (var9 <= 0) {
            this.field7759 = 0;
        } else {
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (-arg1 + var7 << 12) / var9;
            int var12 = (-arg0 + var7 << 12) / var9;
            if (~arg2 == ~var7) {
                this.field7759 = ~arg1 == ~var8 ? var12 + 20480 : 4096 - var11;
            } else if (~arg1 != ~var7) {
                this.field7759 = arg2 == var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field7759 = arg0 != var8 ? -var12 + 12288 : var10 + 4096;
            }
            this.field7759 /= 6;
        }
        if (this.field7747 > 0 && this.field7747 < 4096) {
            this.field7755 = (var9 << 12) / (this.field7747 <= 2048 ? this.field7747 * 2 : 8192 - this.field7747 * 2);
        } else {
            this.field7755 = 0;
        }
        if (arg3 <= 84) {
            this.field7763 = -32;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II[BIII)V", line = 367)
    public static final void method3153(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        ++field7764;
        if (~arg5 > ~arg3) {
            if (arg4 < 106) {
                method3153(80, 87, (byte[]) null, -14, -51, 47);
            }
            int var6 = arg1 + arg5;
            int var7 = -arg5 + arg3 >> 2;
            while (true) {
                --var7;
                if (~var7 > -1) {
                    int var8 = 3 & arg3 - arg5;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            return;
                        }
                        arg2[var6++] = 1;
                    }
                }
                arg2[var6++] = 1;
                arg2[var6++] = 1;
                arg2[var6++] = 1;
                arg2[var6++] = 1;
            }
        }
    }
}
