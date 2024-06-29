import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class class751 extends class133 {

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lgf;")
    public class279 field10460;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field10452;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public int field10473;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field10455 = 0;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field10463 = 0;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field10464 = 0;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field10457 = 0;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public static int field10477 = 0;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "I")
    private static int field10478 = 0;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field10471 = 0;

    @OriginalMember(owner = "client!mo", name = "G", descriptor = "I")
    private static int field10483 = 0;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    private static int field10451;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field10454;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field10456;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field10459;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field10461;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field10462;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public int field10467;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public int field10470;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public int field10472;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    private static int field10474;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
    public int field10475;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "I")
    private static int field10476;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    private static int field10479;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "[I")
    private int[] field10482;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
    public abstract void method1117(int arg0, int arg1);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
    public final void method1032(int arg0, int arg1, int arg2, int arg3) {
        this.field10470 = arg0;
        this.field10475 = arg1;
        this.field10472 = arg2;
        this.field10467 = arg3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1034(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field10460.method1684()) {
            throw new IllegalStateException();
        } else if (this.method4211(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field10469 = arg7;
            if (arg6 != 1) {
                field10471 = arg7 >>> 24;
                field10477 = 256 - field10471;
                if (arg6 == 0) {
                    field10455 = (arg7 & 0xFF0000) >> 16;
                    field10464 = (arg7 & 0xFF00) >> 8;
                    field10463 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field10478 = arg7 >>> 24;
                    field10483 = 256 - field10478;
                    int var11 = (arg7 & 0xFF00FF) * field10483 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field10483 & 0xFF0000;
                    field10457 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1117(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1117(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1117(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1117(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1117(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1117(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1117(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1117(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1117(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1117(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1117(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1117(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1041(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class490 arg7, int arg8, int arg9) {
        if (this.field10460.method1684()) {
            throw new IllegalStateException();
        } else if (this.method4211(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class532 var11 = (class532) arg7;
            this.method1116(var11.field7031, var11.field7032, field10479 - arg8, -arg9 - (field10481 - field10451));
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIII)V")
    public abstract void method1045(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIIIIII)V")
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field10460.method1684()) {
            throw new IllegalStateException();
        }
        if (this.field10482 == null) {
            this.field10482 = new int[4];
        }
        this.field10460.method393(this.field10482);
        this.field10460.method433(this.field10460.field3960, this.field10460.field3963, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1036();
        int var9 = this.method1048();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1045(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field10460.method419(this.field10482[0], this.field10482[1], this.field10482[2], this.field10482[3]);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([I[III)V")
    public abstract void method1116(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "()I")
    public final int method1048() {
        return this.field10475 + this.field10473 + this.field10467;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1031(int arg0, int arg1, class490 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method4211(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field10470 + this.field10452 + this.field10472;
        int var8 = this.field10475 + this.field10473 + this.field10467;
        if (this.field10452 != var7 || this.field10473 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field10475 * var11;
            float var14 = (float) this.field10475 * var12;
            float var15 = (float) this.field10470 * var9;
            float var16 = (float) this.field10470 * var10;
            float var17 = (float) this.field10472 * -var9;
            float var18 = (float) this.field10472 * -var10;
            float var19 = (float) this.field10467 * -var11;
            float var20 = (float) this.field10467 * -var12;
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
        if (var23 < (float) this.field10460.field3960) {
            var23 = this.field10460.field3960;
        }
        if (var24 > (float) this.field10460.field3946) {
            var24 = this.field10460.field3946;
        }
        if (var25 < (float) this.field10460.field3963) {
            var25 = this.field10460.field3963;
        }
        if (var26 > (float) this.field10460.field3967) {
            var26 = this.field10460.field3967;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field10456 = this.field10460.field3952;
        field10454 = (int) ((float) ((int) var25 * field10456) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field10461 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field10452 / var29);
        field10468 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field10473 / var30);
        field10480 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field10452 / var30);
        field10459 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field10473 / var29);
        field10476 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field10474 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field10462 = (this.field10452 >> 1 << 12) + (field10480 * field10474 >> 4);
        field10465 = (this.field10473 >> 1 << 12) + (field10474 * field10459 >> 4);
        field10458 = field10476 * field10461 >> 4;
        field10466 = field10476 * field10468 >> 4;
        field10479 = (int) var23;
        field10453 = (int) var27;
        field10451 = (int) var25;
        field10481 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([I)V")
    public final void method1046(int[] arg0) {
        arg0[0] = this.field10470;
        arg0[1] = this.field10475;
        arg0[2] = this.field10472;
        arg0[3] = this.field10467;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "()I")
    public final int method1042() {
        return this.field10452;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()I")
    public final int method1036() {
        return this.field10470 + this.field10452 + this.field10472;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "()I")
    public final int method1043() {
        return this.field10473;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lgf;II)V")
    public class751(class279 arg0, int arg1, int arg2) {
        this.field10460 = arg0;
        this.field10452 = arg1;
        this.field10473 = arg2;
    }
}
