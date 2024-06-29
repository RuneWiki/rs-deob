import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class388 extends class359 {

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "Lms;")
    public class82 field5607;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public int field5591;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field5596 = 0;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    private static int field5598 = 0;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    private static int field5600 = 0;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field5580 = 0;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field5605 = 0;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field5601 = 0;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field5593 = 0;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field5608 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private static int field5588;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    private static int field5592;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    private static int field5602;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    private static int field5604;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
    private int[] field5579;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
    public abstract void method322(int arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "ZA", descriptor = "()I")
    public final int method200() {
        return this.field5591;
    }

    @OriginalMember(owner = "client!kl", name = "YA", descriptor = "()I")
    public final int method205() {
        return this.field5582;
    }

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "()I")
    public final int method207() {
        return this.field5591 + this.field5578 + this.field5599;
    }

    @OriginalMember(owner = "client!kl", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kl", name = "la", descriptor = "(IIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5607.method632()) {
            throw new IllegalStateException();
        }
        if (this.field5579 == null) {
            this.field5579 = new int[4];
        }
        this.field5607.method495(this.field5579);
        this.field5607.method515(this.field5607.field1193, this.field5607.field1198, arg0 + arg2, arg1 + arg3);
        int var8 = this.method204();
        int var9 = this.method207();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method215(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5607.method511(this.field5579[0], this.field5579[1], this.field5579[2], this.field5579[3]);
    }

    @OriginalMember(owner = "client!kl", name = "RA", descriptor = "()I")
    public final int method204() {
        return this.field5586 + this.field5582 + this.field5597;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([I[III)V")
    public abstract void method323(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kl", name = "ha", descriptor = "(IIII)V")
    public final void method210(int arg0, int arg1, int arg2, int arg3) {
        this.field5586 = arg0;
        this.field5578 = arg1;
        this.field5597 = arg2;
        this.field5599 = arg3;
    }

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method209(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5607.method632()) {
            throw new IllegalStateException();
        }
        this.method2303(arg0, arg1, arg2, arg3, arg4, arg5);
        field5609 = arg7;
        if (arg6 != 1) {
            field5580 = arg7 >>> 24;
            field5608 = 256 - field5580;
            if (arg6 == 0) {
                field5596 = (arg7 & 0xFF0000) >> 16;
                field5593 = (arg7 & 0xFF00) >> 8;
                field5601 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field5598 = arg7 >>> 24;
                field5600 = 256 - field5598;
                int var10 = (arg7 & 0xFF00FF) * field5600 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field5600 & 0xFF0000;
                field5605 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method322(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method322(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method322(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method322(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method322(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method322(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method322(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method322(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method322(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method322(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method322(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method322(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFF)V")
    private final void method2303(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5586 + this.field5582 + this.field5597;
        int var8 = this.field5591 + this.field5578 + this.field5599;
        if (this.field5582 != var7 || this.field5591 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5578 * var11;
            float var14 = (float) this.field5578 * var12;
            float var15 = (float) this.field5586 * var9;
            float var16 = (float) this.field5586 * var10;
            float var17 = (float) this.field5597 * -var9;
            float var18 = (float) this.field5597 * -var10;
            float var19 = (float) this.field5599 * -var11;
            float var20 = (float) this.field5599 * -var12;
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
        if (var23 < (float) this.field5607.field1193) {
            var23 = this.field5607.field1193;
        }
        if (var24 > (float) this.field5607.field1190) {
            var24 = this.field5607.field1190;
        }
        if (var25 < (float) this.field5607.field1198) {
            var25 = this.field5607.field1198;
        }
        if (var26 > (float) this.field5607.field1201) {
            var26 = this.field5607.field1201;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field5589 = this.field5607.field1205;
        field5587 = (int) ((float) ((int) var25 * field5589) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5606 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5582 / var29);
        field5610 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5591 / var30);
        field5581 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5582 / var30);
        field5594 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5591 / var29);
        field5588 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5592 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5585 = (this.field5582 >> 1 << 12) + (field5592 * field5581 >> 4);
        field5603 = (this.field5591 >> 1 << 12) + (field5594 * field5592 >> 4);
        field5590 = field5606 * field5588 >> 4;
        field5583 = field5610 * field5588 >> 4;
        field5602 = (int) var23;
        field5584 = (int) var27;
        field5604 = (int) var25;
        field5595 = (int) var28;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class336 arg6, int arg7, int arg8) {
        if (this.field5607.method632()) {
            throw new IllegalStateException();
        }
        this.method2303(arg0, arg1, arg2, arg3, arg4, arg5);
        class281 var10 = (class281) arg6;
        this.method323(var10.field3822, var10.field3819, field5602 - arg7, -arg8 - (field5595 - field5604));
    }

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "(IIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lms;II)V")
    public class388(class82 arg0, int arg1, int arg2) {
        this.field5607 = arg0;
        this.field5582 = arg1;
        this.field5591 = arg2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IILta;II)V")
    public abstract void method203(int arg0, int arg1, class336 arg2, int arg3, int arg4);
}
