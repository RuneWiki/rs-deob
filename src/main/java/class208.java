import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class208 extends class234 {

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lme;")
    public class65 field3108;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field3115;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    private static int field3106 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3100 = 0;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field3112 = 0;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field3117 = 0;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field3110 = 0;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    private static int field3111 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private static int field3101;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    private static int field3107;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    private static int field3119;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
    private static int field3122;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "[I")
    private int[] field3099;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFFFFFLor;II)V")
    public final void method1216(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class153 arg6, int arg7, int arg8) {
        if (this.field3108.method370()) {
            throw new IllegalStateException();
        }
        this.method1223(arg0, arg1, arg2, arg3, arg4, arg5);
        class165 var10 = (class165) arg6;
        this.method1225(var10.field2301, var10.field2297, field3107 - arg7, -arg8 - (field3121 - field3101));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILor;II)V")
    public abstract void method1217(int arg0, int arg1, class153 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public abstract void method1218(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()I")
    public final int method1219() {
        return this.field3127 + this.field3104 + this.field3120;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
    public final void method1220(int arg0, int arg1, int arg2, int arg3) {
        this.field3114 = arg0;
        this.field3127 = arg1;
        this.field3125 = arg2;
        this.field3120 = arg3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method1221(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        if (this.field3108.method370()) {
            throw new IllegalStateException();
        }
        this.method1223(arg0, arg1, arg2, arg3, arg4, arg5);
        field3113 = arg7;
        if (arg6 != 0) {
            field3100 = arg7 >>> 24;
            field3117 = 256 - field3100;
            if (arg6 == 1) {
                field3110 = (arg7 & 0xFF0000) >> 16;
                field3105 = (arg7 & 0xFF00) >> 8;
                field3097 = arg7 & 0xFF;
            } else {
                field3106 = arg7 >>> 24;
                field3111 = 256 - field3106;
                int var10 = (arg7 & 0xFF00FF) * field3111 & 0xFF00FF00;
                int var11 = (arg7 & 0xFF00) * field3111 & 0xFF0000;
                field3112 = (var10 | var11) >>> 8;
            }
        }
        if (arg6 == 0) {
            if (arg8 == 0) {
                this.method1224(0, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1224(0, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1224(0, 2);
                return;
            }
        } else if (arg6 == 1) {
            if (arg8 == 0) {
                this.method1224(1, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1224(1, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1224(1, 2);
                return;
            }
        } else if (arg6 == 2) {
            if (arg8 == 0) {
                this.method1224(2, 0);
                return;
            }
            if (arg8 == 1) {
                this.method1224(2, 1);
                return;
            }
            if (arg8 == 2) {
                this.method1224(2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIIIIII)V")
    public abstract void method1222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(FFFFFF)V")
    private final void method1223(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        int var7 = this.field3115 + this.field3114 + this.field3125;
        int var8 = this.field3127 + this.field3104 + this.field3120;
        if (this.field3115 != var7 || this.field3104 != var8) {
            float var9 = (arg2 - arg0) / (float) var7;
            float var10 = (arg3 - arg1) / (float) var7;
            float var11 = (arg4 - arg0) / (float) var8;
            float var12 = (arg5 - arg1) / (float) var8;
            float var13 = (float) this.field3127 * var11;
            float var14 = (float) this.field3127 * var12;
            float var15 = (float) this.field3114 * var9;
            float var16 = (float) this.field3114 * var10;
            float var17 = (float) this.field3125 * -var9;
            float var18 = (float) this.field3125 * -var10;
            float var19 = (float) this.field3120 * -var11;
            float var20 = (float) this.field3120 * -var12;
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
        if (var23 < (float) this.field3108.field824) {
            var23 = (float) this.field3108.field824;
        }
        if (var24 > (float) this.field3108.field833) {
            var24 = (float) this.field3108.field833;
        }
        if (var25 < (float) this.field3108.field839) {
            var25 = (float) this.field3108.field839;
        }
        if (var26 > (float) this.field3108.field810) {
            var26 = (float) this.field3108.field810;
        }
        float var27 = var23 - var24;
        if ((var27 >= 0.0F)) {
            return;
        }
        float var28 = var25 - var26;
        if ((var28 >= 0.0F)) {
            return;
        }
        field3124 = this.field3108.field840;
        field3116 = (int) ((float) ((int) var25 * field3124) + var23);
        float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
        float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
        field3096 = (int) ((arg5 - arg1) * 4096.0F * (float) this.field3115 / var29);
        field3098 = (int) ((arg3 - arg1) * 4096.0F * (float) this.field3104 / var30);
        field3102 = (int) ((arg4 - arg0) * 4096.0F * (float) this.field3115 / var30);
        field3128 = (int) ((arg2 - arg0) * 4096.0F * (float) this.field3104 / var29);
        field3122 = (int) (var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
        field3119 = (int) (var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
        field3126 = (this.field3115 >> 1 << 12) + (field3119 * field3102 >> 4);
        field3109 = (this.field3104 >> 1 << 12) + (field3128 * field3119 >> 4);
        field3123 = field3122 * field3096 >> 4;
        field3103 = field3122 * field3098 >> 4;
        field3107 = (int) var23;
        field3118 = (int) var27;
        field3101 = (int) var25;
        field3121 = (int) var28;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
    public abstract void method1224(int arg0, int arg1);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([I[III)V")
    public abstract void method1225(int[] arg0, int[] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "()I")
    public final int method1226() {
        return this.field3115 + this.field3114 + this.field3125;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()I")
    public final int method1227() {
        return this.field3115;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lme;II)V")
    public class208(class65 arg0, int arg1, int arg2) {
        this.field3108 = arg0;
        this.field3115 = arg1;
        this.field3104 = arg2;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V")
    public final void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3108.method370()) {
            throw new IllegalStateException();
        }
        if (this.field3099 == null) {
            this.field3099 = new int[4];
        }
        this.field3108.method415(this.field3099);
        this.field3108.method354(this.field3108.field824, this.field3108.field839, arg0 + arg2, arg1 + arg3);
        int var8 = this.method1226();
        int var9 = this.method1219();
        int var10 = (arg2 + var8 - 1) / var8;
        int var11 = (arg3 + var9 - 1) / var9;
        for (int var12 = 0; var12 < var11; var12++) {
            int var13 = var9 * var12;
            for (int var14 = 0; var14 < var10; var14++) {
                this.method1218(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
        }
        this.field3108.method436(this.field3099[0], this.field3099[1], this.field3099[2], this.field3099[3]);
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
    public final int method1229() {
        return this.field3104;
    }
}
