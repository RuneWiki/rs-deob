import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class60 extends class363 {

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lqf;")
    public class146 field927;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field922 = 0;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    private static int field928 = 0;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    private static int field919 = 0;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field943 = 0;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    private static int field920;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private static int field935;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    private static int field937;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    private static int field940;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "[I")
    private int[] field945;

    @OriginalMember(owner = "client!eb", name = "la", descriptor = "(IIIIIII)V")
    public final void method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field927.method1036()) {
            throw new IllegalStateException();
        }
        if (this.field945 == null) {
            this.field945 = new int[4];
        }
        this.field927.method545(this.field945);
        this.field927.method599(this.field927.field2162, this.field927.field2147, arg0 + arg2, arg1 + arg3);
        int var8 = this.method394();
        int var9 = this.method396();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method392(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field927.method571(this.field945[0], this.field945[1], this.field945[2], this.field945[3]);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFFFFF)V")
    private final void method390(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field947 + this.field925 + this.field933;
        int var8 = this.field936 + this.field917 + this.field944;
        if (this.field925 != var7 || this.field917 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field936 * var11;
            float var14 = (float) this.field936 * var12;
            float var15 = (float) this.field947 * var9;
            float var16 = (float) this.field947 * var10;
            float var17 = (float) this.field933 * -var9;
            float var18 = (float) this.field933 * -var10;
            float var19 = (float) this.field944 * -var11;
            float var20 = (float) this.field944 * -var12;
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
        if (var23 < (float) this.field927.field2162) {
            var23 = this.field927.field2162;
        }
        if (var24 > (float) this.field927.field2156) {
            var24 = this.field927.field2156;
        }
        if (var25 < (float) this.field927.field2147) {
            var25 = this.field927.field2147;
        }
        if (var26 > (float) this.field927.field2143) {
            var26 = this.field927.field2143;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field924 = this.field927.field2177;
        field930 = (int) ((float) ((int) var25 * field924) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field921 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field925 / var29);
        field929 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field917 / var30);
        field923 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field925 / var30);
        field941 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field917 / var29);
        field940 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field937 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field946 = (this.field925 >> 1 << 12) + (field937 * field923 >> 4);
        field926 = (this.field917 >> 1 << 12) + (field941 * field937 >> 4);
        field938 = field940 * field921 >> 4;
        field916 = field940 * field929 >> 4;
        field920 = (int) var23;
        field915 = (int) var27;
        field935 = (int) var25;
        field939 = (int) var28;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([I[III)V")
    public abstract void method391(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "(IIIII)V")
    public abstract void method392(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
    public abstract void method393(int arg0, int arg1);

    @OriginalMember(owner = "client!eb", name = "RA", descriptor = "()I")
    public final int method394() {
        return this.field947 + this.field925 + this.field933;
    }

    @OriginalMember(owner = "client!eb", name = "ya", descriptor = "(IIIIIII)V")
    public abstract void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "()I")
    public final int method396() {
        return this.field936 + this.field917 + this.field944;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILta;II)V")
    public abstract void method397(int arg0, int arg1, class340 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!eb", name = "YA", descriptor = "()I")
    public final int method398() {
        return this.field925;
    }

    @OriginalMember(owner = "client!eb", name = "ZA", descriptor = "()I")
    public final int method399() {
        return this.field917;
    }

    @OriginalMember(owner = "client!eb", name = "ha", descriptor = "(IIII)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3) {
        this.field947 = arg0;
        this.field936 = arg1;
        this.field933 = arg2;
        this.field944 = arg3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(FFFFFFLta;II)V")
    public final void method401(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class340 arg6, int arg7, int arg8) {
        if (this.field927.method1036()) {
            throw new IllegalStateException();
        }
        this.method390(arg0, arg1, arg2, arg3, arg4, arg5);
        class176 var10 = (class176) arg6;
        this.method391(var10.field2706, var10.field2709, field920 - arg7, -arg8 - (field939 - field935));
    }

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "(FFFFFFIII)V")
    public final void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field927.method1036()) {
            throw new IllegalStateException();
        }
        this.method390(arg0, arg1, arg2, arg3, arg4, arg5);
        field918 = arg7;
        if (arg6 != 1) {
            field922 = arg7 >>> 24;
            field931 = 256 - field922;
            if (arg6 == 0) {
                field943 = (arg7 & 0xFF0000) >> 16;
                field932 = (arg7 & 0xFF00) >> 8;
                field934 = arg7 & 0xFF;
            } else if (arg6 == 2) {
                field928 = arg7 >>> 24;
                field919 = 256 - field928;
                int var10 = (arg7 & 0xFF00FF) * field919 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field919 & 0xFF0000;
                field942 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 1) {
            if (arg8 == 0) {
                this.method393(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method393(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method393(1, 2);
                return;
            }
        } else if (arg6 == 0) {
            if (arg8 == 0) {
                this.method393(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method393(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method393(0, 2);
                return;
            }
        } else if (arg6 == 3) {
            if (arg8 == 0) {
                this.method393(3, 0);
                return;
            }
            if (arg8 == 1) {
                this.method393(3, 1);
                return;
            }
            if (arg8 == 2) {
                this.method393(3, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method393(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method393(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method393(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lqf;II)V")
    public class60(class146 arg0, int arg1, int arg2) {
        this.field927 = arg0;
        this.field925 = arg1;
        this.field917 = arg2;
    }
}
