import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public abstract class class252 extends class381 {

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "Lpk;")
    public class108 field3608;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field3596 = 0;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    private static int field3601 = 0;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public static int field3595 = 0;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field3590 = 0;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public static int field3598 = 0;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    private static int field3603 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    private static int field3582;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
    private static int field3591;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    private static int field3600;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    private static int field3605;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
    private int[] field3584;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method763(int arg0, int arg1, int arg2, int arg3) {
        this.field3606 = arg0;
        this.field3580 = arg1;
        this.field3589 = arg2;
        this.field3602 = arg3;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFFFFLhb;II)V", line = 12)
    public final void method757(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class433 arg6, int arg7, int arg8) {
        if (this.field3608.method592()) {
            throw new IllegalStateException();
        }
        this.method1707(arg0, arg1, arg2, arg3, arg4, arg5);
        class154 var10 = (class154) arg6;
        this.method1486(var10.field1899, var10.field1902, field3591 - arg7, -arg8 - (field3588 - field3600));
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIIII)V", line = 22)
    public final void method760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3608.method592()) {
            throw new IllegalStateException();
        }
        if (this.field3584 == null) {
            this.field3584 = new int[4];
        }
        this.field3608.method659(this.field3584);
        this.field3608.method679(this.field3608.field1299, this.field3608.field1323, arg0 + arg2, arg1 + arg3);
        int var8 = this.method762();
        int var9 = this.method761();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method756(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3608.method660(this.field3584[0], this.field3584[1], this.field3584[2], this.field3584[3]);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "()I", line = 65)
    public final int method765() {
        return this.field3599;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()I", line = 68)
    public final int method762() {
        return this.field3606 + this.field3599 + this.field3589;
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "()I", line = 81)
    public final int method759() {
        return this.field3583;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFFFF)V", line = 100)
    private final void method1707(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3606 + this.field3599 + this.field3589;
        int var8 = this.field3583 + this.field3580 + this.field3602;
        if (this.field3599 != var7 || this.field3583 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3580 * var11;
            float var14 = (float) this.field3580 * var12;
            float var15 = (float) this.field3606 * var9;
            float var16 = (float) this.field3606 * var10;
            float var17 = (float) this.field3589 * -var9;
            float var18 = (float) this.field3589 * -var10;
            float var19 = (float) this.field3602 * -var11;
            float var20 = (float) this.field3602 * -var12;
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
        if (var23 < (float) this.field3608.field1299) {
            var23 = (float) this.field3608.field1299;
        }
        if (var24 > (float) this.field3608.field1294) {
            var24 = (float) this.field3608.field1294;
        }
        if (var25 < (float) this.field3608.field1323) {
            var25 = (float) this.field3608.field1323;
        }
        if (var26 > (float) this.field3608.field1314) {
            var26 = (float) this.field3608.field1314;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field3612 = this.field3608.field1328;
        field3594 = (int) ((float) ((int) var25 * field3612) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3604 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3599 / var29);
        field3597 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3583 / var30);
        field3585 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3599 / var30);
        field3587 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3583 / var29);
        field3605 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3582 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3592 = (this.field3599 >> 1 << 12) + (field3585 * field3582 >> 4);
        field3581 = (this.field3583 >> 1 << 12) + (field3587 * field3582 >> 4);
        field3611 = field3605 * field3604 >> 4;
        field3593 = field3605 * field3597 >> 4;
        field3591 = (int) var23;
        field3586 = (int) var27;
        field3600 = (int) var25;
        field3588 = (int) var28;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()I", line = 238)
    public final int method761() {
        return this.field3583 + this.field3580 + this.field3602;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(FFFFFFIII)V", line = 248)
    public final void method753(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3608.method592()) {
            throw new IllegalStateException();
        }
        this.method1707(arg0, arg1, arg2, arg3, arg4, arg5);
        field3610 = arg7;
        if (arg6 != 0) {
            field3609 = arg7 >>> 24;
            field3590 = 256 - field3609;
            if (arg6 == 1) {
                field3595 = (arg7 & 0xFF0000) >> 16;
                field3596 = (arg7 & 0xFF00) >> 8;
                field3607 = arg7 & 0xFF;
            } else {
                field3601 = arg7 >>> 24;
                field3603 = 256 - field3601;
                int var10 = (arg7 & 0xFF00FF) * field3603 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field3603 & 0xFF0000;
                field3598 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1485(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1485(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1485(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1485(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1485(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1485(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1485(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1485(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1485(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lpk;II)V", line = 338)
    public class252(class108 arg0, int arg1, int arg2) {
        this.field3608 = arg0;
        this.field3599 = arg1;
        this.field3583 = arg2;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILhb;II)V")
    public abstract void method755(int arg0, int arg1, class433 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
    public abstract void method1485(int arg0, int arg1);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([I[III)V")
    public abstract void method1486(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIII)V")
    public abstract void method756(int arg0, int arg1, int arg2, int arg3, int arg4);
}
