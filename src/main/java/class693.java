import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class class693 extends class312 {

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "Lbs;")
    public class717 field9453;

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
    public int field9467;

    @OriginalMember(owner = "client!ica", name = "y", descriptor = "I")
    public int field9459;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public static int field9437 = 0;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    private static int field9451 = 0;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field9440 = 0;

    @OriginalMember(owner = "client!ica", name = "u", descriptor = "I")
    public static int field9455 = 0;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field9450 = 0;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field9448 = 0;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "I")
    public static int field9466 = 0;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    private static int field9442 = 0;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    private static int field9435;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public int field9436;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field9439;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field9441;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    private static int field9443;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "I")
    private static int field9452;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
    public int field9454;

    @OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!ica", name = "w", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
    public int field9458;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    private static int field9461;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
    public int field9465;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "[I")
    private int[] field9464;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([I)V")
    public final void method1633(int[] arg0) {
        arg0[0] = this.field9465;
        arg0[1] = this.field9458;
        arg0[2] = this.field9454;
        arg0[3] = this.field9436;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "()I")
    public final int method1637() {
        return this.field9459;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1641(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class513 arg7, int arg8, int arg9) {
        if (this.field9453.method4055()) {
            throw new IllegalStateException();
        } else if (this.method3870(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class708 var11 = (class708) arg7;
            this.method236(var11.field9943, var11.field9942, field9435 - arg8, -arg9 - (field9456 - field9443));
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method3870(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field9467 + this.field9465 + this.field9454;
        int var8 = this.field9459 + this.field9458 + this.field9436;
        if (this.field9467 != var7 || this.field9459 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field9458 * var11;
            float var14 = (float) this.field9458 * var12;
            float var15 = (float) this.field9465 * var9;
            float var16 = (float) this.field9465 * var10;
            float var17 = (float) this.field9454 * -var9;
            float var18 = (float) this.field9454 * -var10;
            float var19 = (float) this.field9436 * -var11;
            float var20 = (float) this.field9436 * -var12;
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
        if (var23 < (float) this.field9453.field10082) {
            var23 = this.field9453.field10082;
        }
        if (var24 > (float) this.field9453.field10081) {
            var24 = this.field9453.field10081;
        }
        if (var25 < (float) this.field9453.field10067) {
            var25 = this.field9453.field10067;
        }
        if (var26 > (float) this.field9453.field10069) {
            var26 = this.field9453.field10069;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field9457 = this.field9453.field10053;
        field9447 = (int) ((float) ((int) var25 * field9457) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field9463 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field9467 / var29);
        field9462 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field9459 / var30);
        field9460 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field9467 / var30);
        field9439 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field9459 / var29);
        field9461 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field9452 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field9441 = (this.field9467 >> 1 << 12) + (field9460 * field9452 >> 4);
        field9445 = (this.field9459 >> 1 << 12) + (field9452 * field9439 >> 4);
        field9446 = field9463 * field9461 >> 4;
        field9444 = field9462 * field9461 >> 4;
        field9435 = (int) var23;
        field9438 = (int) var27;
        field9443 = (int) var25;
        field9456 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "()I")
    public final int method1640() {
        return this.field9467;
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(IIII)V")
    public final void method1632(int arg0, int arg1, int arg2, int arg3) {
        this.field9465 = arg0;
        this.field9458 = arg1;
        this.field9454 = arg2;
        this.field9436 = arg3;
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "()I")
    public final int method1634() {
        return this.field9467 + this.field9465 + this.field9454;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "()I")
    public final int method1636() {
        return this.field9459 + this.field9458 + this.field9436;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIII)V")
    public abstract void method240(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method238(int arg0, int arg1, class513 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1638(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field9453.method4055()) {
            throw new IllegalStateException();
        } else if (this.method3870(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field9449 = arg7;
            if (arg6 != 1) {
                field9437 = arg7 >>> 24;
                field9440 = 256 - field9437;
                if (arg6 == 0) {
                    field9450 = (arg7 & 0xFF0000) >> 16;
                    field9448 = (arg7 & 0xFF00) >> 8;
                    field9455 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field9451 = arg7 >>> 24;
                    field9442 = 256 - field9451;
                    int var11 = (arg7 & 0xFF00FF) * field9442 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field9442 & 0xFF0000;
                    field9466 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method237(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method237(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method237(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method237(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method237(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method237(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method237(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method237(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method237(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method237(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method237(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method237(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
    public final void method1635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9453.method4055()) {
            throw new IllegalStateException();
        }
        if (this.field9464 == null) {
            this.field9464 = new int[4];
        }
        this.field9453.method566(this.field9464);
        this.field9453.method607(this.field9453.field10082, this.field9453.field10067, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1634();
        int var9 = this.method1636();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method240(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field9453.method556(this.field9464[0], this.field9464[1], this.field9464[2], this.field9464[3]);
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(II)V")
    public abstract void method237(int arg0, int arg1);

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "([I[III)V")
    public abstract void method236(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lbs;II)V")
    public class693(class717 arg0, int arg1, int arg2) {
        this.field9453 = arg0;
        this.field9467 = arg1;
        this.field9459 = arg2;
    }
}
