import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class612 extends class702 {

    @OriginalMember(owner = "client!sv", name = "x", descriptor = "Lkt;")
    public class142 field8503;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public int field8483;

    @OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
    public int field8505;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field8487 = 0;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field8482 = 0;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field8499 = 0;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    private static int field8481 = 0;

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public static int field8502 = 0;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    private static int field8498 = 0;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public static int field8494 = 0;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
    public static int field8510 = 0;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    private static int field8480;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    private static int field8488;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public int field8492;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public int field8493;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public int field8496;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!sv", name = "y", descriptor = "I")
    private static int field8504;

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "I")
    public int field8506;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    private static int field8508;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[I")
    private int[] field8490;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(II)V")
    public abstract void method934(int arg0, int arg1);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IILua;II)V")
    public abstract void method932(int arg0, int arg1, class618 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method3426(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field8492 + this.field8483 + this.field8496;
        int var8 = this.field8505 + this.field8493 + this.field8506;
        if (this.field8483 != var7 || this.field8505 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field8493 * var11;
            float var14 = (float) this.field8493 * var12;
            float var15 = (float) this.field8492 * var9;
            float var16 = (float) this.field8492 * var10;
            float var17 = (float) this.field8496 * -var9;
            float var18 = (float) this.field8496 * -var10;
            float var19 = (float) this.field8506 * -var11;
            float var20 = (float) this.field8506 * -var12;
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
        if (var23 < (float) this.field8503.field2034) {
            var23 = this.field8503.field2034;
        }
        if (var24 > (float) this.field8503.field2018) {
            var24 = this.field8503.field2018;
        }
        if (var25 < (float) this.field8503.field2021) {
            var25 = this.field8503.field2021;
        }
        if (var26 > (float) this.field8503.field2020) {
            var26 = this.field8503.field2020;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field8509 = this.field8503.field2033;
        field8491 = (int) ((float) ((int) var25 * field8509) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field8489 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field8483 / var29);
        field8497 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field8505 / var30);
        field8511 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field8483 / var30);
        field8485 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field8505 / var29);
        field8508 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field8480 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field8495 = (this.field8483 >> 1 << 12) + (field8511 * field8480 >> 4);
        field8486 = (this.field8505 >> 1 << 12) + (field8485 * field8480 >> 4);
        field8500 = field8508 * field8489 >> 4;
        field8512 = field8508 * field8497 >> 4;
        field8488 = (int) var23;
        field8507 = (int) var27;
        field8504 = (int) var25;
        field8501 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "(IIII)V")
    public final void method1663(int arg0, int arg1, int arg2, int arg3) {
        this.field8492 = arg0;
        this.field8493 = arg1;
        this.field8496 = arg2;
        this.field8506 = arg3;
    }

    @OriginalMember(owner = "client!sv", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "()I")
    public final int method1658() {
        return this.field8483;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "([I[III)V")
    public abstract void method937(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sv", name = "qa", descriptor = "(FFFFFFIIII)V")
    public final void method1657(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field8503.method1001()) {
            throw new IllegalStateException();
        } else if (this.method3426(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field8484 = arg7;
            if (arg6 != 1) {
                field8502 = arg7 >>> 24;
                field8482 = 256 - field8502;
                if (arg6 == 0) {
                    field8487 = (arg7 & 0xFF0000) >> 16;
                    field8510 = (arg7 & 0xFF00) >> 8;
                    field8494 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field8481 = arg7 >>> 24;
                    field8498 = 256 - field8481;
                    int var11 = (arg7 & 0xFF00FF) * field8498 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field8498 & 0xFF0000;
                    field8499 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method934(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method934(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method934(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method934(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method934(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method934(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method934(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method934(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method934(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method934(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method934(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method934(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "ca", descriptor = "()I")
    public final int method1661() {
        return this.field8505 + this.field8493 + this.field8506;
    }

    @OriginalMember(owner = "client!sv", name = "V", descriptor = "(IIIII)V")
    public abstract void method935(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!sv", name = "DA", descriptor = "(IIIIIII)V")
    public final void method1656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field8503.method1001()) {
            throw new IllegalStateException();
        }
        if (this.field8490 == null) {
            this.field8490 = new int[4];
        }
        this.field8503.method174(this.field8490);
        this.field8503.method123(this.field8503.field2034, this.field8503.field2021, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1660();
        int var9 = this.method1661();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method935(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field8503.method200(this.field8490[0], this.field8490[1], this.field8490[2], this.field8490[3]);
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lkt;II)V")
    public class612(class142 arg0, int arg1, int arg2) {
        this.field8503 = arg0;
        this.field8483 = arg1;
        this.field8505 = arg2;
    }

    @OriginalMember(owner = "client!sv", name = "A", descriptor = "()I")
    public final int method1660() {
        return this.field8492 + this.field8483 + this.field8496;
    }

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "()I")
    public final int method1653() {
        return this.field8505;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFFFFILua;II)V")
    public final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class618 arg7, int arg8, int arg9) {
        if (this.field8503.method1001()) {
            throw new IllegalStateException();
        } else if (this.method3426(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class521 var11 = (class521) arg7;
            this.method937(var11.field7091, var11.field7089, field8488 - arg8, -arg9 - (field8501 - field8504));
        }
    }
}
