import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class343 extends class20 {

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lhm;")
    public class280 field4600;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4591 = 0;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    private static int field4596 = 0;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field4601 = 0;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field4608 = 0;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    private static int field4594 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    private static int field4588;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    private static int field4597;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    private static int field4605;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    private static int field4607;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public int field4613;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[I")
    private int[] field4590;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()I", line = 8)
    public final int method109() {
        return this.field4613 + this.field4583 + this.field4589;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFFFLgo;II)V", line = 12)
    public final void method96(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class175 arg6, int arg7, int arg8) {
        if (this.field4600.method1610()) {
            throw new IllegalStateException();
        }
        this.method2006(arg0, arg1, arg2, arg3, arg4, arg5);
        class410 var10 = (class410) arg6;
        this.method157(var10.field5931, var10.field5934, field4597 - arg7, -arg8 - (field4592 - field4588));
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I", line = 40)
    public final int method97() {
        return this.field4604;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFFFIII)V", line = 51)
    public final void method98(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4600.method1610()) {
            throw new IllegalStateException();
        }
        this.method2006(arg0, arg1, arg2, arg3, arg4, arg5);
        field4587 = arg7;
        if (arg6 != 0) {
            field4586 = arg7 >>> 24;
            field4601 = 256 - field4586;
            if (arg6 == 1) {
                field4610 = (arg7 & 0xFF0000) >> 16;
                field4584 = (arg7 & 0xFF00) >> 8;
                field4591 = arg7 & 0xFF;
            } else {
                field4596 = arg7 >>> 24;
                field4594 = 256 - field4596;
                int var10 = (arg7 & 0xFF00FF) * field4594 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field4594 & 0xFF0000;
                field4608 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method158(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method158(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method158(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method158(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method158(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method158(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method158(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method158(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method158(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I", line = 141)
    public final int method101() {
        return this.field4604 + this.field4595 + this.field4593;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)V", line = 144)
    public final void method107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4600.method1610()) {
            throw new IllegalStateException();
        }
        if (this.field4590 == null) {
            this.field4590 = new int[4];
        }
        this.field4600.method1629(this.field4590);
        this.field4600.method1580(this.field4600.field3843, this.field4600.field3846, arg0 + arg2, arg1 + arg3);
        int var8 = this.method101();
        int var9 = this.method109();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method100(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4600.method1648(this.field4590[0], this.field4590[1], this.field4590[2], this.field4590[3]);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIII)V", line = 197)
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
        this.field4595 = arg0;
        this.field4613 = arg1;
        this.field4593 = arg2;
        this.field4589 = arg3;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()I", line = 203)
    public final int method105() {
        return this.field4583;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lhm;II)V", line = 206)
    public class343(class280 arg0, int arg1, int arg2) {
        this.field4600 = arg0;
        this.field4604 = arg1;
        this.field4583 = arg2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(FFFFFF)V", line = 217)
    private final void method2006(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4604 + this.field4595 + this.field4593;
        int var8 = this.field4613 + this.field4583 + this.field4589;
        if (this.field4604 != var7 || this.field4583 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4613 * var11;
            float var14 = (float) this.field4613 * var12;
            float var15 = (float) this.field4595 * var9;
            float var16 = (float) this.field4595 * var10;
            float var17 = (float) this.field4593 * -var9;
            float var18 = (float) this.field4593 * -var10;
            float var19 = (float) this.field4589 * -var11;
            float var20 = (float) this.field4589 * -var12;
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
        if (var23 < (float) this.field4600.field3843) {
            var23 = (float) this.field4600.field3843;
        }
        if (var24 > (float) this.field4600.field3845) {
            var24 = (float) this.field4600.field3845;
        }
        if (var25 < (float) this.field4600.field3846) {
            var25 = (float) this.field4600.field3846;
        }
        if (var26 > (float) this.field4600.field3804) {
            var26 = (float) this.field4600.field3804;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field4598 = this.field4600.field3803;
        field4612 = (int) ((float) ((int) var25 * field4598) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4585 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4604 / var29);
        field4602 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4583 / var30);
        field4614 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4604 / var30);
        field4603 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4583 / var29);
        field4607 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4605 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4582 = (this.field4604 >> 1 << 12) + (field4614 * field4605 >> 4);
        field4609 = (this.field4583 >> 1 << 12) + (field4605 * field4603 >> 4);
        field4599 = field4607 * field4585 >> 4;
        field4611 = field4607 * field4602 >> 4;
        field4597 = (int) var23;
        field4606 = (int) var27;
        field4588 = (int) var25;
        field4592 = (int) var28;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
    public abstract void method158(int arg0, int arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
    public abstract void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILgo;II)V")
    public abstract void method104(int arg0, int arg1, class175 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([I[III)V")
    public abstract void method157(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
