import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public abstract class class215 extends class147 {

    @OriginalMember(owner = "client!tw", name = "B", descriptor = "Luga;")
    public class221 field2860;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "I")
    public int field2858;

    @OriginalMember(owner = "client!tw", name = "x", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
    private static int field2843 = 0;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field2841 = 0;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "I")
    public static int field2842 = 0;

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    private static int field2834 = 0;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!tw", name = "v", descriptor = "I")
    public static int field2854 = 0;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    private static int field2839;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!tw", name = "l", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!tw", name = "n", descriptor = "I")
    private static int field2846;

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    private static int field2847;

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tw", name = "u", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
    public int field2855;

    @OriginalMember(owner = "client!tw", name = "y", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!tw", name = "A", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!tw", name = "C", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!tw", name = "D", descriptor = "I")
    private static int field2862;

    @OriginalMember(owner = "client!tw", name = "F", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!tw", name = "G", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!tw", name = "H", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!tw", name = "m", descriptor = "[I")
    private int[] field2845;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([I[III)V")
    public abstract void method1080(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([I)V")
    public final void method1105(int[] arg0) {
        arg0[0] = this.field2838;
        arg0[1] = this.field2859;
        arg0[2] = this.field2855;
        arg0[3] = this.field2848;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1100(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class514 arg7, int arg8, int arg9) {
        if (this.field2860.method1461()) {
            throw new IllegalStateException();
        } else if (this.method1420(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class287 var11 = (class287) arg7;
            this.method1080(var11.field4231, var11.field4229, field2846 - arg8, -arg9 - (field2840 - field2862));
        }
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "()I")
    public final int method1110() {
        return this.field2856;
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "(IIII)V")
    public final void method1112(int arg0, int arg1, int arg2, int arg3) {
        this.field2838 = arg0;
        this.field2859 = arg1;
        this.field2855 = arg2;
        this.field2848 = arg3;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V")
    public abstract void method1086(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(II)V")
    public abstract void method1083(int arg0, int arg1);

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "()I")
    public final int method1106() {
        return this.field2859 + this.field2856 + this.field2848;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1098(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field2860.method1461()) {
            throw new IllegalStateException();
        } else if (this.method1420(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field2833 = arg7;
            if (arg6 != 1) {
                field2835 = arg7 >>> 24;
                field2851 = 256 - field2835;
                if (arg6 == 0) {
                    field2842 = (arg7 & 0xFF0000) >> 16;
                    field2854 = (arg7 & 0xFF00) >> 8;
                    field2841 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field2843 = arg7 >>> 24;
                    field2834 = 256 - field2843;
                    int var11 = (arg7 & 0xFF00FF) * field2834 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field2834 & 0xFF0000;
                    field2837 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1083(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1083(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1083(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1083(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1083(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1083(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1083(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1083(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1083(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1083(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1083(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1083(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIII)V")
    public final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2860.method1461()) {
            throw new IllegalStateException();
        }
        if (this.field2845 == null) {
            this.field2845 = new int[4];
        }
        this.field2860.method494(this.field2845);
        this.field2860.method556(this.field2860.field3028, this.field2860.field3045, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1096();
        int var9 = this.method1106();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1086(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field2860.method456(this.field2845[0], this.field2845[1], this.field2845[2], this.field2845[3]);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method1084(int arg0, int arg1, class514 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "()I")
    public final int method1096() {
        return this.field2858 + this.field2838 + this.field2855;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "()I")
    public final int method1107() {
        return this.field2858;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method1420(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field2858 + this.field2838 + this.field2855;
        int var8 = this.field2859 + this.field2856 + this.field2848;
        if (this.field2858 != var7 || this.field2856 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field2859 * var11;
            float var14 = (float) this.field2859 * var12;
            float var15 = (float) this.field2838 * var9;
            float var16 = (float) this.field2838 * var10;
            float var17 = (float) this.field2855 * -var9;
            float var18 = (float) this.field2855 * -var10;
            float var19 = (float) this.field2848 * -var11;
            float var20 = (float) this.field2848 * -var12;
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
        if (var23 < (float) this.field2860.field3028) {
            var23 = this.field2860.field3028;
        }
        if (var24 > (float) this.field2860.field3016) {
            var24 = this.field2860.field3016;
        }
        if (var25 < (float) this.field2860.field3045) {
            var25 = this.field2860.field3045;
        }
        if (var26 > (float) this.field2860.field3026) {
            var26 = this.field2860.field3026;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field2836 = this.field2860.field3035;
        field2864 = (int) ((float) ((int) var25 * field2836) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field2857 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field2858 / var29);
        field2852 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field2856 / var30);
        field2849 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field2858 / var30);
        field2863 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field2856 / var29);
        field2847 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field2839 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field2850 = (this.field2858 >> 1 << 12) + (field2849 * field2839 >> 4);
        field2844 = (this.field2856 >> 1 << 12) + (field2863 * field2839 >> 4);
        field2861 = field2857 * field2847 >> 4;
        field2865 = field2852 * field2847 >> 4;
        field2846 = (int) var23;
        field2853 = (int) var27;
        field2862 = (int) var25;
        field2840 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Luga;II)V")
    public class215(class221 arg0, int arg1, int arg2) {
        this.field2860 = arg0;
        this.field2858 = arg1;
        this.field2856 = arg2;
    }
}
