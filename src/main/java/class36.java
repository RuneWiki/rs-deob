import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public abstract class class36 extends class604 {

    @OriginalMember(owner = "client!tfa", name = "y", descriptor = "Lut;")
    public class136 field618;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!tfa", name = "u", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    private static int field607 = 0;

    @OriginalMember(owner = "client!tfa", name = "t", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!tfa", name = "x", descriptor = "I")
    private static int field617 = 0;

    @OriginalMember(owner = "client!tfa", name = "v", descriptor = "I")
    public static int field615 = 0;

    @OriginalMember(owner = "client!tfa", name = "E", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    private static int field608;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
    private static int field612;

    @OriginalMember(owner = "client!tfa", name = "w", descriptor = "I")
    private static int field616;

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!tfa", name = "A", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!tfa", name = "B", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!tfa", name = "C", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!tfa", name = "D", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!tfa", name = "F", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!tfa", name = "G", descriptor = "I")
    private static int field626;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "[I")
    private int[] field599;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method211(int arg0, int arg1, class514 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([I)V")
    public final void method212(int[] arg0) {
        arg0[0] = this.field611;
        arg0[1] = this.field622;
        arg0[2] = this.field609;
        arg0[3] = this.field597;
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(IIII)V")
    public final void method213(int arg0, int arg1, int arg2, int arg3) {
        this.field611 = arg0;
        this.field622 = arg1;
        this.field609 = arg2;
        this.field597 = arg3;
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "()I")
    public final int method214() {
        return this.field600;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([I[III)V")
    public abstract void method216(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method217(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field611 + this.field606 + this.field609;
        int var8 = this.field622 + this.field600 + this.field597;
        if (this.field606 != var7 || this.field600 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field622 * var11;
            float var14 = (float) this.field622 * var12;
            float var15 = (float) this.field611 * var9;
            float var16 = (float) this.field611 * var10;
            float var17 = (float) this.field609 * -var9;
            float var18 = (float) this.field609 * -var10;
            float var19 = (float) this.field597 * -var11;
            float var20 = (float) this.field597 * -var12;
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
        if (var23 < (float) this.field618.field2329) {
            var23 = this.field618.field2329;
        }
        if (var24 > (float) this.field618.field2314) {
            var24 = this.field618.field2314;
        }
        if (var25 < (float) this.field618.field2327) {
            var25 = this.field618.field2327;
        }
        if (var26 > (float) this.field618.field2334) {
            var26 = this.field618.field2334;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field601 = this.field618.field2333;
        field625 = (int) ((float) ((int) var25 * field601) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field623 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field606 / var29);
        field594 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field600 / var30);
        field596 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field606 / var30);
        field619 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field600 / var29);
        field608 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field616 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field620 = (this.field606 >> 1 << 12) + (field616 * field596 >> 4);
        field605 = (this.field600 >> 1 << 12) + (field619 * field616 >> 4);
        field595 = field623 * field608 >> 4;
        field621 = field608 * field594 >> 4;
        field612 = (int) var23;
        field610 = (int) var27;
        field626 = (int) var25;
        field598 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "()I")
    public final int method218() {
        return this.field622 + this.field600 + this.field597;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method219(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field618.method1120()) {
            throw new IllegalStateException();
        } else if (this.method217(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field603 = arg7;
            if (arg6 != 1) {
                field624 = arg7 >>> 24;
                field614 = 256 - field624;
                if (arg6 == 0) {
                    field615 = (arg7 & 0xFF0000) >> 16;
                    field602 = (arg7 & 0xFF00) >> 8;
                    field613 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field617 = arg7 >>> 24;
                    field607 = 256 - field617;
                    int var11 = (arg7 & 0xFF00FF) * field607 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field607 & 0xFF0000;
                    field604 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method222(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method222(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method222(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method222(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method222(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method222(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method222(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method222(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method222(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method222(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method222(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method222(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "()I")
    public final int method220() {
        return this.field606;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V")
    public abstract void method222(int arg0, int arg1);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method223(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        if (this.field618.method1120()) {
            throw new IllegalStateException();
        } else if (this.method217(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class559 var11 = (class559) arg7;
            this.method216(var11.field7945, var11.field7947, field612 - arg8, -arg9 - (field598 - field626));
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "()I")
    public final int method224() {
        return this.field611 + this.field606 + this.field609;
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field618.method1120()) {
            throw new IllegalStateException();
        }
        if (this.field599 == null) {
            this.field599 = new int[4];
        }
        this.field618.method580(this.field599);
        this.field618.method550(this.field618.field2329, this.field618.field2327, arg0 + arg2, arg1 + arg3);
        int var8 = this.method224();
        int var9 = this.method218();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method215(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field618.method512(this.field599[0], this.field599[1], this.field599[2], this.field599[3]);
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lut;II)V")
    public class36(class136 arg0, int arg1, int arg2) {
        this.field618 = arg0;
        this.field606 = arg1;
        this.field600 = arg2;
    }
}
