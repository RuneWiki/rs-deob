import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public abstract class class283 extends class116 {

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "Lvda;")
    public class309 field4123;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field4108 = 0;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    public static int field4117 = 0;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field4109 = 0;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field4113 = 0;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    public static int field4114 = 0;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    private static int field4107 = 0;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    private static int field4137 = 0;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    private static int field4116;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    private static int field4122;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    private static int field4126;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!bca", name = "C", descriptor = "I")
    private static int field4133;

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!bca", name = "B", descriptor = "[I")
    private int[] field4132;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "(IIIIIII)V", line = 4)
    public final void method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field4123.method1926()) {
            throw new IllegalStateException();
        }
        if (this.field4132 == null) {
            this.field4132 = new int[4];
        }
        this.field4123.method640(this.field4132);
        this.field4123.method581(this.field4123.field4484, this.field4123.field4512, arg0 + arg2, arg1 + arg3);
        int var8 = this.method955();
        int var9 = this.method960();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method668(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field4123.method615(this.field4132[0], this.field4132[1], this.field4132[2], this.field4132[3]);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFF)Z", line = 44)
    private final boolean method1805(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field4136 + this.field4110 + this.field4119;
        int var8 = this.field4111 + this.field4105 + this.field4130;
        if (this.field4110 != var7 || this.field4111 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field4105 * var11;
            float var14 = (float) this.field4105 * var12;
            float var15 = (float) this.field4136 * var9;
            float var16 = (float) this.field4136 * var10;
            float var17 = (float) this.field4119 * -var9;
            float var18 = (float) this.field4119 * -var10;
            float var19 = (float) this.field4130 * -var11;
            float var20 = (float) this.field4130 * -var12;
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
        if (var23 < (float) this.field4123.field4484) {
            var23 = this.field4123.field4484;
        }
        if (var24 > (float) this.field4123.field4501) {
            var24 = this.field4123.field4501;
        }
        if (var25 < (float) this.field4123.field4512) {
            var25 = this.field4123.field4512;
        }
        if (var26 > (float) this.field4123.field4483) {
            var26 = this.field4123.field4483;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field4127 = this.field4123.field4481;
        field4124 = (int) ((float) ((int) var25 * field4127) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field4131 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field4110 / var29);
        field4129 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field4111 / var30);
        field4135 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field4110 / var30);
        field4115 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field4111 / var29);
        field4122 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field4116 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field4106 = (this.field4110 >> 1 << 12) + (field4135 * field4116 >> 4);
        field4128 = (this.field4111 >> 1 << 12) + (field4116 * field4115 >> 4);
        field4118 = field4131 * field4122 >> 4;
        field4125 = field4129 * field4122 >> 4;
        field4133 = (int) var23;
        field4120 = (int) var27;
        field4126 = (int) var25;
        field4112 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "()I", line = 178)
    public final int method962() {
        return this.field4110;
    }

    @OriginalMember(owner = "client!bca", name = "EA", descriptor = "()I", line = 183)
    public final int method955() {
        return this.field4136 + this.field4110 + this.field4119;
    }

    @OriginalMember(owner = "client!bca", name = "CA", descriptor = "(FFFFFFIII)V", line = 209)
    public final void method958(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field4123.method1926()) {
            throw new IllegalStateException();
        } else if (this.method1805(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field4134 = arg7;
            if (arg6 != 1) {
                field4108 = arg7 >>> 24;
                field4121 = 256 - field4108;
                if (arg6 == 0) {
                    field4109 = (arg7 & 0xFF0000) >> 16;
                    field4117 = (arg7 & 0xFF00) >> 8;
                    field4114 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field4107 = arg7 >>> 24;
                    field4137 = 256 - field4107;
                    int var10 = (arg7 & 0xFF00FF) * field4137 & 0xFF00FF00;
                    int var11 = (arg7 & 0xFF00) * field4137 & 0xFF0000;
                    field4113 = (var10 | var11) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method667(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method667(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method667(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method667(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method667(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method667(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method667(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method667(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method667(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method667(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method667(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method667(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 313)
    public final void method966(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class593 arg6, int arg7, int arg8) {
        if (this.field4123.method1926()) {
            throw new IllegalStateException();
        } else if (this.method1805(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class603 var10 = (class603) arg6;
            this.method665(var10.field8585, var10.field8582, field4133 - arg7, -arg8 - (field4112 - field4126));
        }
    }

    @OriginalMember(owner = "client!bca", name = "la", descriptor = "()I", line = 342)
    public final int method968() {
        return this.field4111;
    }

    @OriginalMember(owner = "client!bca", name = "KA", descriptor = "(IIII)V", line = 348)
    public final void method963(int arg0, int arg1, int arg2, int arg3) {
        this.field4136 = arg0;
        this.field4105 = arg1;
        this.field4119 = arg2;
        this.field4130 = arg3;
    }

    @OriginalMember(owner = "client!bca", name = "ma", descriptor = "()I", line = 355)
    public final int method960() {
        return this.field4111 + this.field4105 + this.field4130;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lvda;II)V", line = 369)
    public class283(class309 arg0, int arg1, int arg2) {
        this.field4123 = arg0;
        this.field4110 = arg1;
        this.field4111 = arg2;
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
    public abstract void method667(int arg0, int arg1);

    @OriginalMember(owner = "client!bca", name = "ra", descriptor = "(IIIIIII)V")
    public abstract void method664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bca", name = "DA", descriptor = "(IIIII)V")
    public abstract void method668(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILpa;II)V")
    public abstract void method663(int arg0, int arg1, class593 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([I[III)V")
    public abstract void method665(int[] arg0, int[] arg1, int arg2, int arg3);
}
