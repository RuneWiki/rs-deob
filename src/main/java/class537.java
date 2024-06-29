import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public abstract class class537 extends class116 {

    @OriginalMember(owner = "client!tw", name = "y", descriptor = "Ljba;")
    public class647 field7509;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    public int field7498;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public int field7488;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field7486 = 0;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field7491 = 0;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    private static int field7494 = 0;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "I")
    private static int field7497 = 0;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
    public static int field7510 = 0;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field7499 = 0;

    @OriginalMember(owner = "client!tw", name = "E", descriptor = "I")
    public static int field7515 = 0;

    @OriginalMember(owner = "client!tw", name = "G", descriptor = "I")
    public static int field7517 = 0;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    private static int field7485;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public int field7489;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    private static int field7492;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public int field7493;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public int field7501;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    private static int field7503;

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
    private static int field7504;

    @OriginalMember(owner = "client!tw", name = "v", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!tw", name = "x", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!tw", name = "A", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!tw", name = "B", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!tw", name = "C", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!tw", name = "F", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "[I")
    private int[] field7505;

    @OriginalMember(owner = "client!tw", name = "la", descriptor = "()I")
    public final int method630() {
        return this.field7488;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method634(int arg0, int arg1, class594 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tw", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method636(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field7509.method3723()) {
            throw new IllegalStateException();
        } else if (this.method2988(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field7514 = arg7;
            if (arg6 != 1) {
                field7499 = arg7 >>> 24;
                field7515 = 256 - field7499;
                if (arg6 == 0) {
                    field7491 = (arg7 & 0xFF0000) >> 16;
                    field7486 = (arg7 & 0xFF00) >> 8;
                    field7510 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field7497 = arg7 >>> 24;
                    field7494 = 256 - field7497;
                    int var10 = (arg7 & 0xFF00FF) * field7494 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field7494 & 0xFF0000;
                    field7517 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method733(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method733(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method733(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method733(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method733(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method733(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method733(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method733(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method733(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method733(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method733(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method733(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([I[III)V")
    public abstract void method732(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method2988(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field7498 + this.field7489 + this.field7512;
        int var8 = this.field7493 + this.field7488 + this.field7501;
        if (this.field7498 != var7 || this.field7488 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field7493 * var11;
            float var14 = (float) this.field7493 * var12;
            float var15 = (float) this.field7489 * var9;
            float var16 = (float) this.field7489 * var10;
            float var17 = (float) this.field7512 * -var9;
            float var18 = (float) this.field7512 * -var10;
            float var19 = (float) this.field7501 * -var11;
            float var20 = (float) this.field7501 * -var12;
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
        if (var23 < (float) this.field7509.field9395) {
            var23 = this.field7509.field9395;
        }
        if (var24 > (float) this.field7509.field9380) {
            var24 = this.field7509.field9380;
        }
        if (var25 < (float) this.field7509.field9382) {
            var25 = this.field7509.field9382;
        }
        if (var26 > (float) this.field7509.field9385) {
            var26 = this.field7509.field9385;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field7500 = this.field7509.field9375;
        field7502 = (int) ((float) ((int) var25 * field7500) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field7495 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field7498 / var29);
        field7511 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field7488 / var30);
        field7506 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field7498 / var30);
        field7490 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field7488 / var29);
        field7504 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field7485 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field7513 = (this.field7498 >> 1 << 12) + (field7506 * field7485 >> 4);
        field7507 = (this.field7488 >> 1 << 12) + (field7490 * field7485 >> 4);
        field7516 = field7504 * field7495 >> 4;
        field7496 = field7511 * field7504 >> 4;
        field7492 = (int) var23;
        field7508 = (int) var27;
        field7503 = (int) var25;
        field7487 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!tw", name = "ma", descriptor = "()I")
    public final int method631() {
        return this.field7493 + this.field7488 + this.field7501;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class594 arg6, int arg7, int arg8) {
        if (this.field7509.method3723()) {
            throw new IllegalStateException();
        } else if (this.method2988(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class395 var10 = (class395) arg6;
            this.method732(var10.field5458, var10.field5456, field7492 - arg7, -arg8 - (field7487 - field7503));
        }
    }

    @OriginalMember(owner = "client!tw", name = "EA", descriptor = "()I")
    public final int method627() {
        return this.field7498 + this.field7489 + this.field7512;
    }

    @OriginalMember(owner = "client!tw", name = "KA", descriptor = "(IIII)V")
    public final void method623(int arg0, int arg1, int arg2, int arg3) {
        this.field7489 = arg0;
        this.field7493 = arg1;
        this.field7512 = arg2;
        this.field7501 = arg3;
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "()I")
    public final int method637() {
        return this.field7498;
    }

    @OriginalMember(owner = "client!tw", name = "DA", descriptor = "(IIIII)V")
    public abstract void method633(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V")
    public abstract void method733(int arg0, int arg1);

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "(IIIIIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field7509.method3723()) {
            throw new IllegalStateException();
        }
        if (this.field7505 == null) {
            this.field7505 = new int[4];
        }
        this.field7509.method980(this.field7505);
        this.field7509.method939(this.field7509.field9395, this.field7509.field9382, arg0 + arg2, arg1 + arg3);
        int var8 = this.method627();
        int var9 = this.method631();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method633(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field7509.method977(this.field7505[0], this.field7505[1], this.field7505[2], this.field7505[3]);
    }

    @OriginalMember(owner = "client!tw", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Ljba;II)V")
    public class537(class647 arg0, int arg1, int arg2) {
        this.field7509 = arg0;
        this.field7498 = arg1;
        this.field7488 = arg2;
    }
}
