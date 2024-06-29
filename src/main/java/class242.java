import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public abstract class class242 extends class702 {

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "Lwk;")
    public class128 field3843;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3816 = 0;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field3817 = 0;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    private static int field3818 = 0;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field3845 = 0;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    private static int field3822 = 0;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    private static int field3824;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "I")
    public int field3834;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    private static int field3838;

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    private static int field3842;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
    private static int field3847;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "[I")
    private int[] field3832;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(FFFFFFILua;II)V", line = 4)
    public final void method1088(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        if (this.field3843.method1111()) {
            throw new IllegalStateException();
        } else if (this.method1734(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class123 var11 = (class123) arg7;
            this.method1733(var11.field2044, var11.field2042, field3838 - arg8, -arg9 - (field3840 - field3824));
        }
    }

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "()I", line = 23)
    public final int method1083() {
        return this.field3848;
    }

    @OriginalMember(owner = "client!oca", name = "Q", descriptor = "(IIII)V", line = 30)
    public final void method1085(int arg0, int arg1, int arg2, int arg3) {
        this.field3846 = arg0;
        this.field3830 = arg1;
        this.field3821 = arg2;
        this.field3834 = arg3;
    }

    @OriginalMember(owner = "client!oca", name = "qa", descriptor = "(FFFFFFIIII)V", line = 47)
    public final void method1084(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field3843.method1111()) {
            throw new IllegalStateException();
        } else if (this.method1734(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field3837 = arg7;
            if (arg6 != 1) {
                field3839 = arg7 >>> 24;
                field3816 = 256 - field3839;
                if (arg6 == 0) {
                    field3820 = (arg7 & 0xFF0000) >> 16;
                    field3845 = (arg7 & 0xFF00) >> 8;
                    field3817 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field3818 = arg7 >>> 24;
                    field3822 = 256 - field3818;
                    int var11 = (arg7 & 0xFF00FF) * field3822 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field3822 & 0xFF0000;
                    field3841 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1732(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1732(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1732(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1732(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1732(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1732(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1732(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1732(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1732(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1732(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1732(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1732(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "DA", descriptor = "(IIIIIII)V", line = 151)
    public final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3843.method1111()) {
            throw new IllegalStateException();
        }
        if (this.field3832 == null) {
            this.field3832 = new int[4];
        }
        this.field3843.method343(this.field3832);
        this.field3843.method271(this.field3843.field2112, this.field3843.field2079, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1076();
        int var9 = this.method1079();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1086(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3843.method352(this.field3832[0], this.field3832[1], this.field3832[2], this.field3832[3]);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(FFFFFF)Z", line = 191)
    private final boolean method1734(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3848 + this.field3846 + this.field3821;
        int var8 = this.field3831 + this.field3830 + this.field3834;
        if (this.field3848 != var7 || this.field3831 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3830 * var11;
            float var14 = (float) this.field3830 * var12;
            float var15 = (float) this.field3846 * var9;
            float var16 = (float) this.field3846 * var10;
            float var17 = (float) this.field3821 * -var9;
            float var18 = (float) this.field3821 * -var10;
            float var19 = (float) this.field3834 * -var11;
            float var20 = (float) this.field3834 * -var12;
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
        if (var23 < (float) this.field3843.field2112) {
            var23 = this.field3843.field2112;
        }
        if (var24 > (float) this.field3843.field2108) {
            var24 = this.field3843.field2108;
        }
        if (var25 < (float) this.field3843.field2079) {
            var25 = this.field3843.field2079;
        }
        if (var26 > (float) this.field3843.field2104) {
            var26 = this.field3843.field2104;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field3819 = this.field3843.field2092;
        field3826 = (int) ((float) ((int) var25 * field3819) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3833 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3848 / var29);
        field3827 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3831 / var30);
        field3835 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3848 / var30);
        field3825 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3831 / var29);
        field3842 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3847 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3829 = (this.field3848 >> 1 << 12) + (field3847 * field3835 >> 4);
        field3836 = (this.field3831 >> 1 << 12) + (field3847 * field3825 >> 4);
        field3844 = field3842 * field3833 >> 4;
        field3823 = field3842 * field3827 >> 4;
        field3838 = (int) var23;
        field3828 = (int) var27;
        field3824 = (int) var25;
        field3840 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!oca", name = "ca", descriptor = "()I", line = 328)
    public final int method1079() {
        return this.field3831 + this.field3830 + this.field3834;
    }

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "()I", line = 349)
    public final int method1076() {
        return this.field3848 + this.field3846 + this.field3821;
    }

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "()I", line = 369)
    public final int method1075() {
        return this.field3831;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lwk;II)V", line = 371)
    public class242(class128 arg0, int arg1, int arg2) {
        this.field3843 = arg0;
        this.field3848 = arg1;
        this.field3831 = arg2;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(II)V")
    public abstract void method1732(int arg0, int arg1);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "([I[III)V")
    public abstract void method1733(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oca", name = "YA", descriptor = "(IIIIIIII)V")
    public abstract void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILua;II)V")
    public abstract void method1080(int arg0, int arg1, class617 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oca", name = "V", descriptor = "(IIIII)V")
    public abstract void method1086(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method1735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
