import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class441 extends class16 {

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Lcj;")
    public class492 field6475;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field6474;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    private static int field6460 = 0;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field6472 = 0;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private static int field6464 = 0;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field6469 = 0;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field6480 = 0;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field6484 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field6466 = 0;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field6486 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    private static int field6458;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    private static int field6465;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    private static int field6467;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public int field6471;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    private static int field6485;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public int field6489;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    private int[] field6477;

    @OriginalMember(owner = "client!of", name = "MA", descriptor = "(IIII)V")
    public final void method130(int arg0, int arg1, int arg2, int arg3) {
        this.field6489 = arg0;
        this.field6461 = arg1;
        this.field6471 = arg2;
        this.field6482 = arg3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IILma;II)V")
    public abstract void method127(int arg0, int arg1, class10 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFFF)V")
    private final void method2712(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field6489 + this.field6478 + this.field6471;
        int var8 = this.field6474 + this.field6461 + this.field6482;
        if (this.field6478 != var7 || this.field6474 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field6461 * var11;
            float var14 = (float) this.field6461 * var12;
            float var15 = (float) this.field6489 * var9;
            float var16 = (float) this.field6489 * var10;
            float var17 = (float) this.field6471 * -var9;
            float var18 = (float) this.field6471 * -var10;
            float var19 = (float) this.field6482 * -var11;
            float var20 = (float) this.field6482 * -var12;
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
        if (var23 < (float) this.field6475.field7102) {
            var23 = this.field6475.field7102;
        }
        if (var24 > (float) this.field6475.field7110) {
            var24 = this.field6475.field7110;
        }
        if (var25 < (float) this.field6475.field7094) {
            var25 = this.field6475.field7094;
        }
        if (var26 > (float) this.field6475.field7083) {
            var26 = this.field6475.field7083;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field6488 = this.field6475.field7112;
        field6470 = (int) ((float) ((int) var25 * field6488) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field6481 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field6478 / var29);
        field6459 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field6474 / var30);
        field6479 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field6478 / var30);
        field6463 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field6474 / var29);
        field6458 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field6465 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field6473 = (this.field6478 >> 1 << 12) + (field6479 * field6465 >> 4);
        field6462 = (this.field6474 >> 1 << 12) + (field6465 * field6463 >> 4);
        field6490 = field6481 * field6458 >> 4;
        field6476 = field6459 * field6458 >> 4;
        field6467 = (int) var23;
        field6468 = (int) var27;
        field6485 = (int) var25;
        field6487 = (int) var28;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method134(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field6475.method2932()) {
            throw new IllegalStateException();
        }
        this.method2712(arg0, arg1, arg2, arg3, arg4, arg5);
        field6483 = arg7;
        if (arg6 != 1) {
            field6466 = arg7 >>> 24;
            field6480 = 256 - field6466;
            if (arg6 == 0) {
                field6469 = (arg7 & 0xFF0000) >> 16;
                field6472 = (arg7 & 0xFF00) >> 8;
                field6486 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field6460 = arg7 >>> 24;
                field6464 = 256 - field6460;
                int var10 = (arg7 & 0xFF00FF) * field6464 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field6464 & 0xFF0000;
                field6484 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method475(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method475(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method475(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method475(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method475(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method475(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method475(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method475(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method475(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method475(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method475(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method475(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(II)V")
    public abstract void method475(int arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "la", descriptor = "()I")
    public final int method123() {
        return this.field6478;
    }

    @OriginalMember(owner = "client!of", name = "ma", descriptor = "()I")
    public final int method125() {
        return this.field6474;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I[III)V")
    public abstract void method476(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!of", name = "JA", descriptor = "(IIIIIII)V")
    public final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field6475.method2932()) {
            throw new IllegalStateException();
        }
        if (this.field6477 == null) {
            this.field6477 = new int[4];
        }
        this.field6475.method351(this.field6477);
        this.field6475.method344(this.field6475.field7102, this.field6475.field7094, arg0 + arg2, arg1 + arg3);
        int var8 = this.method129();
        int var9 = this.method139();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method141(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field6475.method313(this.field6477[0], this.field6477[1], this.field6477[2], this.field6477[3]);
    }

    @OriginalMember(owner = "client!of", name = "r", descriptor = "(IIIII)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method121(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        if (this.field6475.method2932()) {
            throw new IllegalStateException();
        }
        this.method2712(arg0, arg1, arg2, arg3, arg4, arg5);
        class181 var10 = (class181) arg6;
        this.method476(var10.field2719, var10.field2713, field6467 - arg7, -arg8 - (field6487 - field6485));
    }

    @OriginalMember(owner = "client!of", name = "T", descriptor = "()I")
    public final int method139() {
        return this.field6474 + this.field6461 + this.field6482;
    }

    @OriginalMember(owner = "client!of", name = "s", descriptor = "(IIIIIII)V")
    public abstract void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lcj;II)V")
    public class441(class492 arg0, int arg1, int arg2) {
        this.field6475 = arg0;
        this.field6478 = arg1;
        this.field6474 = arg2;
    }

    @OriginalMember(owner = "client!of", name = "j", descriptor = "()I")
    public final int method129() {
        return this.field6489 + this.field6478 + this.field6471;
    }
}
