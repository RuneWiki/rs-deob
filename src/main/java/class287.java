import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class287 extends class77 {

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Lsq;")
    public class27 field3898;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field3884 = 0;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    private static int field3886 = 0;

    @OriginalMember(owner = "client!io", name = "q", descriptor = "I")
    private static int field3894 = 0;

    @OriginalMember(owner = "client!io", name = "o", descriptor = "I")
    public static int field3892 = 0;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field3887 = 0;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field3910 = 0;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field3904 = 0;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    private static int field3882;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!io", name = "m", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!io", name = "n", descriptor = "I")
    public int field3891;

    @OriginalMember(owner = "client!io", name = "p", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "I")
    private static int field3895;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    private static int field3897;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    private static int field3908;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
    private int[] field3881;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IIII)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3) {
        this.field3883 = arg0;
        this.field3891 = arg1;
        this.field3900 = arg2;
        this.field3896 = arg3;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()I")
    public final int method628() {
        return this.field3899;
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(IIIIIII)V")
    public final void method627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3898.method195()) {
            throw new IllegalStateException();
        }
        if (this.field3881 == null) {
            this.field3881 = new int[4];
        }
        this.field3898.method173(this.field3881);
        this.field3898.method206(this.field3898.field373, this.field3898.field376, arg0 + arg2, arg1 + arg3);
        int var8 = this.method632();
        int var9 = this.method619();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method617(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3898.method227(this.field3881[0], this.field3881[1], this.field3881[2], this.field3881[3]);
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "()I")
    public final int method632() {
        return this.field3899 + this.field3883 + this.field3900;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "()I")
    public final int method631() {
        return this.field3878;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method633(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3898.method195()) {
            throw new IllegalStateException();
        }
        this.method1777(arg0, arg1, arg2, arg3, arg4, arg5);
        field3879 = arg7;
        if (arg6 != 0) {
            field3904 = arg7 >>> 24;
            field3907 = 256 - field3904;
            if (arg6 == 1) {
                field3892 = (arg7 & 0xFF0000) >> 16;
                field3884 = (arg7 & 0xFF00) >> 8;
                field3910 = arg7 & 0xFF;
            } else {
                field3886 = arg7 >>> 24;
                field3894 = 256 - field3886;
                int var10 = (arg7 & 0xFF00FF) * field3894 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field3894 & 0xFF0000;
                field3887 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method957(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method957(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method957(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method957(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method957(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method957(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method957(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method957(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method957(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(FFFFFF)V")
    private final void method1777(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3899 + this.field3883 + this.field3900;
        int var8 = this.field3891 + this.field3878 + this.field3896;
        if (this.field3899 != var7 || this.field3878 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3891 * var11;
            float var14 = (float) this.field3891 * var12;
            float var15 = (float) this.field3883 * var9;
            float var16 = (float) this.field3883 * var10;
            float var17 = (float) this.field3900 * -var9;
            float var18 = (float) this.field3900 * -var10;
            float var19 = (float) this.field3896 * -var11;
            float var20 = (float) this.field3896 * -var12;
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
        if (var23 < (float) this.field3898.field373) {
            var23 = (float) this.field3898.field373;
        }
        if (var24 > (float) this.field3898.field348) {
            var24 = (float) this.field3898.field348;
        }
        if (var25 < (float) this.field3898.field376) {
            var25 = (float) this.field3898.field376;
        }
        if (var26 > (float) this.field3898.field355) {
            var26 = (float) this.field3898.field355;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field3890 = this.field3898.field360;
        field3889 = (int) ((float) ((int) var25 * field3890) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3903 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3899 / var29);
        field3880 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3878 / var30);
        field3893 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3899 / var30);
        field3906 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3878 / var29);
        field3895 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3882 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3901 = (this.field3899 >> 1 << 12) + (field3893 * field3882 >> 4);
        field3909 = (this.field3878 >> 1 << 12) + (field3906 * field3882 >> 4);
        field3888 = field3903 * field3895 >> 4;
        field3902 = field3895 * field3880 >> 4;
        field3897 = (int) var23;
        field3885 = (int) var27;
        field3908 = (int) var25;
        field3905 = (int) var28;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(FFFFFFLde;II)V")
    public final void method614(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class165 arg6, int arg7, int arg8) {
        if (this.field3898.method195()) {
            throw new IllegalStateException();
        }
        this.method1777(arg0, arg1, arg2, arg3, arg4, arg5);
        class231 var10 = (class231) arg6;
        this.method958(var10.field3255, var10.field3254, field3897 - arg7, -arg8 - (field3905 - field3908));
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    public abstract void method617(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "([I[III)V")
    public abstract void method958(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)V")
    public abstract void method957(int arg0, int arg1);

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lsq;II)V")
    public class287(class27 arg0, int arg1, int arg2) {
        this.field3898 = arg0;
        this.field3899 = arg1;
        this.field3878 = arg2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IILde;II)V")
    public abstract void method623(int arg0, int arg1, class165 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()I")
    public final int method619() {
        return this.field3891 + this.field3878 + this.field3896;
    }
}
