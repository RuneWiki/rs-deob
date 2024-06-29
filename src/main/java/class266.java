import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class266 extends class392 {

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Led;")
    public class59 field3781;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field3775;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    private static int field3756 = 0;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field3767 = 0;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field3778 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    private static int field3774 = 0;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field3782 = 0;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field3784 = 0;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    private static int field3753;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    private static int field3758;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    private static int field3763;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "I")
    private static int field3772;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
    private int[] field3768;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFF)Z", line = 4)
    private final boolean method2192(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3777 + this.field3760 + this.field3761;
        int var8 = this.field3775 + this.field3755 + this.field3771;
        if (this.field3777 != var7 || this.field3775 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3755 * var11;
            float var14 = (float) this.field3755 * var12;
            float var15 = (float) this.field3760 * var9;
            float var16 = (float) this.field3760 * var10;
            float var17 = (float) this.field3761 * -var9;
            float var18 = (float) this.field3761 * -var10;
            float var19 = (float) this.field3771 * -var11;
            float var20 = (float) this.field3771 * -var12;
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
        if (var23 < (float) this.field3781.field850) {
            var23 = this.field3781.field850;
        }
        if (var24 > (float) this.field3781.field861) {
            var24 = this.field3781.field861;
        }
        if (var25 < (float) this.field3781.field849) {
            var25 = this.field3781.field849;
        }
        if (var26 > (float) this.field3781.field841) {
            var26 = this.field3781.field841;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field3770 = this.field3781.field846;
        field3752 = (int) ((float) ((int) var25 * field3770) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3773 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3777 / var29);
        field3757 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3775 / var30);
        field3779 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3777 / var30);
        field3765 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3775 / var29);
        field3772 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3753 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3780 = (this.field3777 >> 1 << 12) + (field3779 * field3753 >> 4);
        field3754 = (this.field3775 >> 1 << 12) + (field3765 * field3753 >> 4);
        field3769 = field3773 * field3772 >> 4;
        field3776 = field3772 * field3757 >> 4;
        field3763 = (int) var23;
        field3766 = (int) var27;
        field3758 = (int) var25;
        field3759 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V", line = 144)
    public final void method1379(int arg0, int arg1, int arg2, int arg3) {
        this.field3760 = arg0;
        this.field3755 = arg1;
        this.field3761 = arg2;
        this.field3771 = arg3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()I", line = 153)
    public final int method1376() {
        return this.field3777;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFFIIII)V", line = 157)
    public final void method1371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3781.method630()) {
            throw new IllegalStateException();
        } else if (this.method2192(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field3762 = arg7;
            if (arg6 != 1) {
                field3778 = arg7 >>> 24;
                field3767 = 256 - field3778;
                if (arg6 == 0) {
                    field3784 = (arg7 & 0xFF0000) >> 16;
                    field3783 = (arg7 & 0xFF00) >> 8;
                    field3764 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field3756 = arg7 >>> 24;
                    field3774 = 256 - field3756;
                    int var11 = (arg7 & 0xFF00FF) * field3774 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field3774 & 0xFF0000;
                    field3782 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method875(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method875(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method875(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method875(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method875(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method875(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method875(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method875(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method875(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method875(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method875(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method875(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I)V", line = 261)
    public final void method1373(int[] arg0) {
        arg0[0] = this.field3760;
        arg0[1] = this.field3755;
        arg0[2] = this.field3761;
        arg0[3] = this.field3771;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()I", line = 289)
    public final int method1378() {
        return this.field3777 + this.field3760 + this.field3761;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()I", line = 301)
    public final int method1377() {
        return this.field3775;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Led;II)V", line = 312)
    public class266(class59 arg0, int arg1, int arg2) {
        this.field3781 = arg0;
        this.field3777 = arg1;
        this.field3775 = arg2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 318)
    public final void method1375(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class685 arg7, int arg8, int arg9) {
        if (this.field3781.method630()) {
            throw new IllegalStateException();
        } else if (this.method2192(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class303 var11 = (class303) arg7;
            this.method872(var11.field4226, var11.field4223, field3763 - arg8, -arg9 - (field3759 - field3758));
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 335)
    public final void method1382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3781.method630()) {
            throw new IllegalStateException();
        }
        if (this.field3768 == null) {
            this.field3768 = new int[4];
        }
        this.field3781.method229(this.field3768);
        this.field3781.method230(this.field3781.field850, this.field3781.field849, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1378();
        int var9 = this.method1380();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method874(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3781.method208(this.field3768[0], this.field3768[1], this.field3768[2], this.field3768[3]);
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I", line = 377)
    public final int method1380() {
        return this.field3775 + this.field3755 + this.field3771;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([I[III)V")
    public abstract void method872(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method870(int arg0, int arg1, class685 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
    public abstract void method875(int arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIIIII)V")
    public abstract void method871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
    public abstract void method874(int arg0, int arg1, int arg2, int arg3, int arg4);
}
