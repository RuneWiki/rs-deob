import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class412 extends class241 {

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Lpm;")
    public class609 field5593;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public int field5580;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field5588 = 0;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field5606 = 0;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    private static int field5600 = 0;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field5601 = 0;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field5603 = 0;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    private static int field5582 = 0;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field5605 = 0;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    public static int field5609 = 0;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    private static int field5577;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
    public int field5584;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public int field5587;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    private static int field5592;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    private static int field5598;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    private static int field5607;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "[I")
    private int[] field5596;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "()I", line = 5)
    public final int method1507() {
        return this.field5584 + this.field5580 + this.field5599;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IIIIIII)V", line = 18)
    public final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5593.method3531()) {
            throw new IllegalStateException();
        }
        if (this.field5596 == null) {
            this.field5596 = new int[4];
        }
        this.field5593.method449(this.field5596);
        this.field5593.method453(this.field5593.field8568, this.field5593.field8543, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1507();
        int var9 = this.method1505();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method364(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5593.method434(this.field5596[0], this.field5596[1], this.field5596[2], this.field5596[3]);
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "()I", line = 64)
    public final int method1508() {
        return this.field5580;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([I)V", line = 67)
    public final void method1499(int[] arg0) {
        arg0[0] = this.field5584;
        arg0[1] = this.field5602;
        arg0[2] = this.field5599;
        arg0[3] = this.field5587;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(IIII)V", line = 74)
    public final void method1506(int arg0, int arg1, int arg2, int arg3) {
        this.field5584 = arg0;
        this.field5602 = arg1;
        this.field5599 = arg2;
        this.field5587 = arg3;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(FFFFFF)Z", line = 110)
    private final boolean method2498(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5584 + this.field5580 + this.field5599;
        int var8 = this.field5602 + this.field5583 + this.field5587;
        if (this.field5580 != var7 || this.field5583 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5602 * var11;
            float var14 = (float) this.field5602 * var12;
            float var15 = (float) this.field5584 * var9;
            float var16 = (float) this.field5584 * var10;
            float var17 = (float) this.field5599 * -var9;
            float var18 = (float) this.field5599 * -var10;
            float var19 = (float) this.field5587 * -var11;
            float var20 = (float) this.field5587 * -var12;
            arg0 += var13 + var15;
            arg1 += var14 + var16;
            arg2 += var13 + var17;
            arg3 += var14 + var18;
            arg4 += var15 + var19;
            arg5 += var16 + var20;
        }
        float var21 = arg2 + arg4 - arg0;
        float var22 = arg5 + arg3 - arg1;
        float var23;
        float var24;
        if (arg0 < arg2) {
            var23 = arg0;
            var24 = arg2;
        } else {
            var23 = arg2;
            var24 = arg0;
        }
        if (arg4 < var23) {
            var23 = arg4;
        }
        if (var21 < var23) {
            var23 = var21;
        }
        if (arg4 > var24) {
            var24 = arg4;
        }
        if (var21 > var24) {
            var24 = var21;
        }
        float var25;
        float var26;
        if (arg1 < arg3) {
            var25 = arg1;
            var26 = arg3;
        } else {
            var25 = arg3;
            var26 = arg1;
        }
        if (arg5 < var25) {
            var25 = arg5;
        }
        if (var22 < var25) {
            var25 = var22;
        }
        if (arg5 > var26) {
            var26 = arg5;
        }
        if (var22 > var26) {
            var26 = var22;
        }
        if (var23 < (float) this.field5593.field8568) {
            var23 = this.field5593.field8568;
        }
        if (var24 > (float) this.field5593.field8567) {
            var24 = this.field5593.field8567;
        }
        if (var25 < (float) this.field5593.field8543) {
            var25 = this.field5593.field8543;
        }
        if (var26 > (float) this.field5593.field8539) {
            var26 = this.field5593.field8539;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field5586 = this.field5593.field8557;
        field5591 = (int) ((float) ((int) var25 * field5586) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5594 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5580 / var29);
        field5590 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5583 / var30);
        field5581 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5580 / var30);
        field5578 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5583 / var29);
        field5592 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5607 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5597 = (this.field5580 >> 1 << 12) + (field5607 * field5581 >> 4);
        field5585 = (this.field5583 >> 1 << 12) + (field5607 * field5578 >> 4);
        field5595 = field5594 * field5592 >> 4;
        field5604 = field5592 * field5590 >> 4;
        field5598 = (int) var23;
        field5608 = (int) var27;
        field5577 = (int) var25;
        field5589 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lpm;II)V", line = 246)
    public class412(class609 arg0, int arg1, int arg2) {
        this.field5593 = arg0;
        this.field5580 = arg1;
        this.field5583 = arg2;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(FFFFFFIIII)V", line = 256)
    public final void method1503(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field5593.method3531()) {
            throw new IllegalStateException();
        } else if (this.method2498(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field5579 = arg7;
            if (arg6 != 1) {
                field5606 = arg7 >>> 24;
                field5588 = 256 - field5606;
                if (arg6 == 0) {
                    field5609 = (arg7 & 0xFF0000) >> 16;
                    field5603 = (arg7 & 0xFF00) >> 8;
                    field5605 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field5582 = arg7 >>> 24;
                    field5600 = 256 - field5582;
                    int var11 = (arg7 & 0xFF00FF) * field5600 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field5600 & 0xFF0000;
                    field5601 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method358(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method358(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method358(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method358(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method358(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method358(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method358(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method358(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method358(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method358(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method358(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method358(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "()I", line = 356)
    public final int method1502() {
        return this.field5583;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "()I", line = 365)
    public final int method1505() {
        return this.field5602 + this.field5583 + this.field5587;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 368)
    public final void method1501(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class511 arg7, int arg8, int arg9) {
        if (this.field5593.method3531()) {
            throw new IllegalStateException();
        } else if (this.method2498(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class386 var11 = (class386) arg7;
            this.method362(var11.field5351, var11.field5350, field5598 - arg8, -arg9 - (field5589 - field5577));
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "([I[III)V")
    public abstract void method362(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIII)V")
    public abstract void method364(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)V")
    public abstract void method358(int arg0, int arg1);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method359(int arg0, int arg1, class511 arg2, int arg3, int arg4);
}
