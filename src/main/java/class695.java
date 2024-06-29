import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class695 extends class712 {

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lcg;")
    public class12 field9831;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public int field9835;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public int field9847;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field9832 = 0;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field9836 = 0;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field9840 = 0;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    private static int field9828 = 0;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field9842 = 0;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field9827 = 0;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    private static int field9850 = 0;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field9854 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public int field9824;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public int field9826;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private static int field9833;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    private static int field9837;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field9838;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    private static int field9845;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public int field9851;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    private static int field9852;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public int field9853;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[I")
    private int[] field9839;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
    public abstract void method690(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILaa;II)V")
    public abstract void method691(int arg0, int arg1, class81 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFFFFFIIII)V")
    public final void method1883(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        if (this.field9831.method58()) {
            throw new IllegalStateException();
        } else if (this.method3868(arg0, arg1, arg2, arg3, arg4, arg5)) {
            field9838 = arg7;
            if (arg6 != 1) {
                field9840 = arg7 >>> 24;
                field9832 = 256 - field9840;
                if (arg6 == 0) {
                    field9836 = (arg7 & 0xFF0000) >> 16;
                    field9842 = (arg7 & 0xFF00) >> 8;
                    field9854 = arg7 & 0xFF;
                } else if (arg6 == 2) {
                    field9850 = arg7 >>> 24;
                    field9828 = 256 - field9850;
                    int var11 = (arg7 & 0xFF00FF) * field9828 & 0xFF00FF00;
                    int var12 = (arg7 & 0xFF00) * field9828 & 0xFF0000;
                    field9827 = (var11 | var12) >>> 8;
                }
            }
            if (arg6 == 1) {
                if (arg8 == 0) {
                    this.method694(1, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method694(1, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method694(1, 2);
                    return;
                }
            } else if (arg6 == 0) {
                if (arg8 == 0) {
                    this.method694(0, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method694(0, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method694(0, 2);
                    return;
                }
            } else if (arg6 == 3) {
                if (arg8 == 0) {
                    this.method694(3, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method694(3, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method694(3, 2);
                    return;
                }
            } else if (arg6 == 2) {
                if (arg8 == 0) {
                    this.method694(2, 0);
                    return;
                }
                if (arg8 == 1) {
                    this.method694(2, 1);
                    return;
                }
                if (arg8 == 2) {
                    this.method694(2, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
    public final int method1882() {
        return this.field9847 + this.field9824 + this.field9853;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[III)V")
    public abstract void method693(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([I)V")
    public final void method1873(int[] arg0) {
        arg0[0] = this.field9826;
        arg0[1] = this.field9824;
        arg0[2] = this.field9851;
        arg0[3] = this.field9853;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
    public final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field9831.method58()) {
            throw new IllegalStateException();
        }
        if (this.field9839 == null) {
            this.field9839 = new int[4];
        }
        this.field9831.method76(this.field9839);
        this.field9831.method81(this.field9831.field172, this.field9831.field173, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1892();
        int var9 = this.method1882();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method690(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field9831.method131(this.field9839[0], this.field9839[1], this.field9839[2], this.field9839[3]);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
    public final int method1893() {
        return this.field9847;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()I")
    public final int method1892() {
        return this.field9835 + this.field9826 + this.field9851;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V")
    public abstract void method694(int arg0, int arg1);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I")
    public final int method1895() {
        return this.field9835;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public final void method1874(int arg0, int arg1, int arg2, int arg3) {
        this.field9826 = arg0;
        this.field9824 = arg1;
        this.field9851 = arg2;
        this.field9853 = arg3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFFFFF)Z")
    private final boolean method3868(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field9835 + this.field9826 + this.field9851;
        int var8 = this.field9847 + this.field9824 + this.field9853;
        if (this.field9835 != var7 || this.field9847 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field9824 * var11;
            float var14 = (float) this.field9824 * var12;
            float var15 = (float) this.field9826 * var9;
            float var16 = (float) this.field9826 * var10;
            float var17 = (float) this.field9851 * -var9;
            float var18 = (float) this.field9851 * -var10;
            float var19 = (float) this.field9853 * -var11;
            float var20 = (float) this.field9853 * -var12;
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
        if (var23 < (float) this.field9831.field172) {
            var23 = this.field9831.field172;
        }
        if (var24 > (float) this.field9831.field140) {
            var24 = this.field9831.field140;
        }
        if (var25 < (float) this.field9831.field173) {
            var25 = this.field9831.field173;
        }
        if (var26 > (float) this.field9831.field162) {
            var26 = this.field9831.field162;
        }
        float var27 = var23 - var24;
        if (var27 >= 0.0F) {
            return false;
        }
        float var28 = var25 - var26;
        if (var28 >= 0.0F) {
            return false;
        }
        field9830 = this.field9831.field153;
        field9829 = (int) ((float) ((int) var25 * field9830) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field9834 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field9835 / var29);
        field9844 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field9847 / var30);
        field9846 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field9835 / var30);
        field9848 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field9847 / var29);
        field9837 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field9845 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field9841 = (this.field9835 >> 1 << 12) + (field9846 * field9845 >> 4);
        field9843 = (this.field9847 >> 1 << 12) + (field9848 * field9845 >> 4);
        field9823 = field9837 * field9834 >> 4;
        field9825 = field9844 * field9837 >> 4;
        field9833 = (int) var23;
        field9822 = (int) var27;
        field9852 = (int) var25;
        field9849 = (int) var28;
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFFFFFILaa;II)V")
    public final void method1887(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class81 arg7, int arg8, int arg9) {
        if (this.field9831.method58()) {
            throw new IllegalStateException();
        } else if (this.method3868(arg0, arg1, arg2, arg3, arg4, arg5)) {
            class210 var11 = (class210) arg7;
            this.method693(var11.field2688, var11.field2689, field9833 - arg8, -arg9 - (field9849 - field9852));
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lcg;II)V")
    public class695(class12 arg0, int arg1, int arg2) {
        this.field9831 = arg0;
        this.field9835 = arg1;
        this.field9847 = arg2;
    }
}
