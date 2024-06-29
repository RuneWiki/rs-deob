import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class281 extends class53 {

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Law;")
    public class67 field3933;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field3930 = 0;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    private static int field3942 = 0;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field3941 = 0;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
    public static int field3946 = 0;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    private static int field3940 = 0;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public int field3917;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    private static int field3923;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public int field3935;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    private static int field3938;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
    private static int field3947;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
    private static int field3949;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "[I")
    private int[] field3936;

    @OriginalMember(owner = "client!jo", name = "EA", descriptor = "()I")
    public final int method326() {
        return this.field3948 + this.field3943 + this.field3917;
    }

    @OriginalMember(owner = "client!jo", name = "KA", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        this.field3948 = arg0;
        this.field3935 = arg1;
        this.field3917 = arg2;
        this.field3937 = arg3;
    }

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "(IIIIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3933.method519()) {
            throw new IllegalStateException();
        }
        if (this.field3936 == null) {
            this.field3936 = new int[4];
        }
        this.field3933.method431(this.field3936);
        this.field3933.method512(this.field3933.field838, this.field3933.field824, arg0 + arg2, arg1 + arg3);
        int var8 = this.method326();
        int var9 = this.method322();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method333(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3933.method510(this.field3936[0], this.field3936[1], this.field3936[2], this.field3936[3]);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
    public abstract void method1698(int arg0, int arg1);

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "()I")
    public final int method325() {
        return this.field3943;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method323(int arg0, int arg1, class311 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFFFFLpa;II)V")
    public final void method315(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class311 arg6, int arg7, int arg8) {
        if (this.field3933.method519()) {
            throw new IllegalStateException();
        } else if (this.method1756(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class467 var10 = (class467) arg6;
            this.method1699(var10.field6577, var10.field6581, field3947 - arg7, -arg8 - (field3927 - field3949));
        }
    }

    @OriginalMember(owner = "client!jo", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jo", name = "CA", descriptor = "(FFFFFFIII)V")
    public final void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3933.method519()) {
            throw new IllegalStateException();
        } else if (this.method1756(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field3939 = arg7;
            if (arg6 != 1) {
                field3941 = arg7 >>> 24;
                field3944 = 256 - field3941;
                if (arg6 == 0) {
                    field3932 = (arg7 & 0xFF0000) >> 16;
                    field3931 = (arg7 & 0xFF00) >> 8;
                    field3946 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field3940 = arg7 >>> 24;
                    field3942 = 256 - field3940;
                    int var10 = (arg7 & 0xFF00FF) * field3942 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field3942 & 0xFF0000;
                    field3930 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method1698(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1698(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1698(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method1698(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1698(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1698(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method1698(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1698(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1698(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method1698(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method1698(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method1698(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "la", descriptor = "()I")
    public final int method318() {
        return this.field3934;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method1756(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3948 + this.field3943 + this.field3917;
        int var8 = this.field3935 + this.field3934 + this.field3937;
        if (this.field3943 != var7 || this.field3934 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3935 * var11;
            float var14 = (float) this.field3935 * var12;
            float var15 = (float) this.field3948 * var9;
            float var16 = (float) this.field3948 * var10;
            float var17 = (float) this.field3917 * -var9;
            float var18 = (float) this.field3917 * -var10;
            float var19 = (float) this.field3937 * -var11;
            float var20 = (float) this.field3937 * -var12;
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
        if (var23 < (float) this.field3933.field838) {
            var23 = this.field3933.field838;
        }
        if (var24 > (float) this.field3933.field831) {
            var24 = this.field3933.field831;
        }
        if (var25 < (float) this.field3933.field824) {
            var25 = this.field3933.field824;
        }
        if (var26 > (float) this.field3933.field835) {
            var26 = this.field3933.field835;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field3924 = this.field3933.field823;
        field3920 = (int) ((float) ((int) var25 * field3924) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3918 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3943 / var29);
        field3919 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3934 / var30);
        field3928 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3943 / var30);
        field3926 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3934 / var29);
        field3923 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3938 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3945 = (this.field3943 >> 1 << 12) + (field3938 * field3928 >> 4);
        field3925 = (this.field3934 >> 1 << 12) + (field3938 * field3926 >> 4);
        field3922 = field3923 * field3918 >> 4;
        field3929 = field3923 * field3919 >> 4;
        field3947 = (int) var23;
        field3921 = (int) var27;
        field3949 = (int) var25;
        field3927 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!jo", name = "DA", descriptor = "(IIIII)V")
    public abstract void method333(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!jo", name = "ma", descriptor = "()I")
    public final int method322() {
        return this.field3935 + this.field3934 + this.field3937;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([I[III)V")
    public abstract void method1699(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Law;II)V")
    public class281(class67 arg0, int arg1, int arg2) {
        this.field3933 = arg0;
        this.field3943 = arg1;
        this.field3934 = arg2;
    }
}
