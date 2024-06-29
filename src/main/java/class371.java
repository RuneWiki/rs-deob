import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class371 extends class529 {

    @OriginalMember(owner = "client!ts", name = "G", descriptor = "Lo;")
    public class24 field5644;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public int field5615;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public int field5626;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field5613 = 0;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field5627 = 0;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    private static int field5630 = 0;

    @OriginalMember(owner = "client!ts", name = "C", descriptor = "I")
    public static int field5640 = 0;

    @OriginalMember(owner = "client!ts", name = "A", descriptor = "I")
    public static int field5638 = 0;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field5624 = 0;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field5637 = 0;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    private static int field5622 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    private static int field5614;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    private static int field5617;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public int field5619;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    private static int field5623;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    private static int field5636;

    @OriginalMember(owner = "client!ts", name = "B", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ts", name = "E", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!ts", name = "F", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "[I")
    private int[] field5629;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFF)V", line = 4)
    private final void method2320(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field5619 + this.field5615 + this.field5620;
        int var8 = this.field5642 + this.field5626 + this.field5632;
        if (this.field5615 != var7 || this.field5626 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field5642 * var11;
            float var14 = (float) this.field5642 * var12;
            float var15 = (float) this.field5619 * var9;
            float var16 = (float) this.field5619 * var10;
            float var17 = (float) this.field5620 * -var9;
            float var18 = (float) this.field5620 * -var10;
            float var19 = (float) this.field5632 * -var11;
            float var20 = (float) this.field5632 * -var12;
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
        if (var23 < (float) this.field5644.field513) {
            var23 = this.field5644.field513;
        }
        if (var24 > (float) this.field5644.field506) {
            var24 = this.field5644.field506;
        }
        if (var25 < (float) this.field5644.field529) {
            var25 = this.field5644.field529;
        }
        if (var26 > (float) this.field5644.field502) {
            var26 = this.field5644.field502;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field5643 = this.field5644.field528;
        field5625 = (int) ((float) ((int) var25 * field5643) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field5612 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field5615 / var29);
        field5616 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field5626 / var30);
        field5621 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field5615 / var30);
        field5641 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field5626 / var29);
        field5623 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field5617 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field5634 = (this.field5615 >> 1 << 12) + (field5621 * field5617 >> 4);
        field5633 = (this.field5626 >> 1 << 12) + (field5641 * field5617 >> 4);
        field5618 = field5623 * field5612 >> 4;
        field5639 = field5623 * field5616 >> 4;
        field5614 = (int) var23;
        field5628 = (int) var27;
        field5636 = (int) var25;
        field5635 = (int) var28;
    }

    @OriginalMember(owner = "client!ts", name = "ka", descriptor = "(IIII)V", line = 141)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        this.field5619 = arg0;
        this.field5642 = arg1;
        this.field5620 = arg2;
        this.field5632 = arg3;
    }

    @OriginalMember(owner = "client!ts", name = "JA", descriptor = "()I", line = 147)
    public final int method104() {
        return this.field5642 + this.field5626 + this.field5632;
    }

    @OriginalMember(owner = "client!ts", name = "D", descriptor = "(IIIIIII)V", line = 153)
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field5644.method205()) {
            throw new IllegalStateException();
        }
        if (this.field5629 == null) {
            this.field5629 = new int[4];
        }
        this.field5644.method251(this.field5629);
        this.field5644.method198(this.field5644.field513, this.field5644.field529, arg0 + arg2, arg1 + arg3);
        int var8 = this.method100();
        int var9 = this.method104();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method102(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field5644.method298(this.field5629[0], this.field5629[1], this.field5629[2], this.field5629[3]);
    }

    @OriginalMember(owner = "client!ts", name = "ja", descriptor = "()I", line = 191)
    public final int method100() {
        return this.field5619 + this.field5615 + this.field5620;
    }

    @OriginalMember(owner = "client!ts", name = "qa", descriptor = "()I", line = 195)
    public final int method109() {
        return this.field5626;
    }

    @OriginalMember(owner = "client!ts", name = "aa", descriptor = "(FFFFFFIII)V", line = 203)
    public final void method106(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field5644.method205()) {
            throw new IllegalStateException();
        }
        this.method2320(arg0, arg1, arg2, arg3, arg4, arg5);
        field5631 = arg7;
        if (arg6 != 1) {
            field5637 = arg7 >>> 24;
            field5640 = 256 - field5637;
            if (arg6 == 0) {
                field5627 = (arg7 & 0xFF0000) >> 16;
                field5638 = (arg7 & 0xFF00) >> 8;
                field5624 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field5622 = arg7 >>> 24;
                field5630 = 256 - field5622;
                int var10 = (arg7 & 0xFF00FF) * field5630 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field5630 & 0xFF0000;
                field5613 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method341(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method341(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method341(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method341(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method341(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method341(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method341(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method341(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method341(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method341(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method341(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method341(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FFFFFFLea;II)V", line = 316)
    public final void method107(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        if (this.field5644.method205()) {
            throw new IllegalStateException();
        }
        this.method2320(arg0, arg1, arg2, arg3, arg4, arg5);
        class4 var10 = (class4) arg6;
        this.method340(var10.field105, var10.field107, field5614 - arg7, -arg8 - (field5635 - field5636));
    }

    @OriginalMember(owner = "client!ts", name = "UA", descriptor = "()I", line = 328)
    public final int method96() {
        return this.field5615;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lo;II)V", line = 364)
    public class371(class24 arg0, int arg1, int arg2) {
        this.field5644 = arg0;
        this.field5615 = arg1;
        this.field5626 = arg2;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILea;II)V")
    public abstract void method103(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([I[III)V")
    public abstract void method340(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)V")
    public abstract void method341(int arg0, int arg1);

    @OriginalMember(owner = "client!ts", name = "M", descriptor = "(IIIIIII)V")
    public abstract void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ts", name = "YA", descriptor = "(IIIII)V")
    public abstract void method102(int arg0, int arg1, int arg2, int arg3, int arg4);
}
