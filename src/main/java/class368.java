import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class368 extends class529 {

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Ljs;")
    public class216 field5627;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public int field5640;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public int field5633;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field5615 = 0;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    private static int field5625 = 0;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field5630 = 0;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field5629 = 0;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field5623 = 0;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field5628 = 0;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field5626 = 0;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private static int field5637 = 0;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field5613;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    private static int field5616;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    private static int field5618;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field5634;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    private static int field5636;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    private static int field5641;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "[I")
    private int[] field5631;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method95(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        if (this.field5627.method1496()) {
            throw new IllegalStateException();
        }
        this.method2282(arg0, arg1, arg2, arg3, arg4, arg5);
        class437 var10 = (class437) arg6;
        this.method1625(var10.field6532, var10.field6529, field5641 - arg7, -arg8 - (field5643 - field5636));
    }

    @OriginalMember(owner = "client!de", name = "UA", descriptor = "()I")
    public final int method108() {
        return this.field5640;
    }

    @OriginalMember(owner = "client!de", name = "YA", descriptor = "(IIIII)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!de", name = "ka", descriptor = "(IIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        this.field5644 = arg0;
        this.field5613 = arg1;
        this.field5620 = arg2;
        this.field5634 = arg3;
    }

    @OriginalMember(owner = "client!de", name = "ja", descriptor = "()I")
    public final int method105() {
        return this.field5644 + this.field5640 + this.field5620;
    }

    @OriginalMember(owner = "client!de", name = "qa", descriptor = "()I")
    public final int method103() {
        return this.field5633;
    }

    @OriginalMember(owner = "client!de", name = "JA", descriptor = "()I")
    public final int method100() {
        return this.field5633 + this.field5613 + this.field5634;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([I[III)V")
    public abstract void method1625(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILea;II)V")
    public abstract void method98(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!de", name = "aa", descriptor = "(FFFFFFIII)V")
    public final void method111(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5627.method1496()) {
            throw new IllegalStateException();
        }
        this.method2282(arg0, arg1, arg2, arg3, arg4, arg5);
        field5635 = arg7;
        if (arg6 != 1) {
            field5630 = arg7 >>> 24;
            field5629 = 256 - field5630;
            if (arg6 == 0) {
                field5626 = (arg7 & 0xFF0000) >> 16;
                field5628 = (arg7 & 0xFF00) >> 8;
                field5623 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field5625 = arg7 >>> 24;
                field5637 = 256 - field5625;
                int var10 = (arg7 & 0xFF00FF) * field5637 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field5637 & 0xFF0000;
                field5615 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1624(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1624(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1624(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1624(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1624(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1624(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method1624(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1624(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1624(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1624(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1624(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1624(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FFFFFF)V")
    private final void method2282(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5644 + this.field5640 + this.field5620;
        int var8 = this.field5633 + this.field5613 + this.field5634;
        if (this.field5640 != var7 || this.field5633 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5613 * var11;
            float var14 = (float) this.field5613 * var12;
            float var15 = (float) this.field5644 * var9;
            float var16 = (float) this.field5644 * var10;
            float var17 = (float) this.field5620 * -var9;
            float var18 = (float) this.field5620 * -var10;
            float var19 = (float) this.field5634 * -var11;
            float var20 = (float) this.field5634 * -var12;
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
        if (var23 < (float) this.field5627.field3161) {
            var23 = this.field5627.field3161;
        }
        if (var24 > (float) this.field5627.field3144) {
            var24 = this.field5627.field3144;
        }
        if (var25 < (float) this.field5627.field3156) {
            var25 = this.field5627.field3156;
        }
        if (var26 > (float) this.field5627.field3139) {
            var26 = this.field5627.field3139;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field5624 = this.field5627.field3141;
        field5639 = (int) ((float) ((int) var25 * field5624) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5614 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5640 / var29);
        field5638 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5633 / var30);
        field5617 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5640 / var30);
        field5642 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5633 / var29);
        field5616 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5618 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5622 = (this.field5640 >> 1 << 12) + (field5618 * field5617 >> 4);
        field5645 = (this.field5633 >> 1 << 12) + (field5642 * field5618 >> 4);
        field5621 = field5616 * field5614 >> 4;
        field5619 = field5638 * field5616 >> 4;
        field5641 = (int) var23;
        field5632 = (int) var27;
        field5636 = (int) var25;
        field5643 = (int) var28;
    }

    @OriginalMember(owner = "client!de", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!de", name = "D", descriptor = "(IIIIIII)V")
    public final void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5627.method1496()) {
            throw new IllegalStateException();
        }
        if (this.field5631 == null) {
            this.field5631 = new int[4];
        }
        this.field5627.method1062(this.field5631);
        this.field5627.method1069(this.field5627.field3161, this.field5627.field3156, arg0 + arg2, arg1 + arg3);
        int var8 = this.method105();
        int var9 = this.method100();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method110(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5627.method1098(this.field5631[0], this.field5631[1], this.field5631[2], this.field5631[3]);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljs;II)V")
    public class368(class216 arg0, int arg1, int arg2) {
        this.field5627 = arg0;
        this.field5640 = arg1;
        this.field5633 = arg2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
    public abstract void method1624(int arg0, int arg1);
}
