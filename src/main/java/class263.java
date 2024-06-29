import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class263 extends class474 {

    @OriginalMember(owner = "client!vaa", name = "J", descriptor = "Z")
    private boolean field3254 = true;

    @OriginalMember(owner = "client!vaa", name = "W", descriptor = "I")
    private int field3267 = 0;

    @OriginalMember(owner = "client!vaa", name = "ac", descriptor = "Z")
    private boolean field3323 = false;

    @OriginalMember(owner = "client!vaa", name = "bc", descriptor = "I")
    private int field3324 = 0;

    @OriginalMember(owner = "client!vaa", name = "mc", descriptor = "I")
    private int field3335 = 0;

    @OriginalMember(owner = "client!vaa", name = "qc", descriptor = "I")
    private int field3339 = 0;

    @OriginalMember(owner = "client!vaa", name = "vc", descriptor = "I")
    private int field3344 = 0;

    @OriginalMember(owner = "client!vaa", name = "yc", descriptor = "Z")
    private boolean field3347 = false;

    @OriginalMember(owner = "client!vaa", name = "ib", descriptor = "Lqj;")
    private class548 field3279;

    @OriginalMember(owner = "client!vaa", name = "K", descriptor = "Lgv;")
    private class325 field3255;

    @OriginalMember(owner = "client!vaa", name = "vb", descriptor = "Lgv;")
    private class325 field3292;

    @OriginalMember(owner = "client!vaa", name = "Fb", descriptor = "Lgv;")
    private class325 field3302;

    @OriginalMember(owner = "client!vaa", name = "db", descriptor = "Lgv;")
    private class325 field3274;

    @OriginalMember(owner = "client!vaa", name = "tc", descriptor = "Leh;")
    private class244 field3342;

    @OriginalMember(owner = "client!vaa", name = "ob", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!vaa", name = "rc", descriptor = "[I")
    private int[] field3340;

    @OriginalMember(owner = "client!vaa", name = "Xb", descriptor = "[I")
    private int[] field3320;

    @OriginalMember(owner = "client!vaa", name = "R", descriptor = "[S")
    private short[] field3262;

    @OriginalMember(owner = "client!vaa", name = "nc", descriptor = "[I")
    private int[] field3336;

    @OriginalMember(owner = "client!vaa", name = "Ab", descriptor = "[I")
    private int[] field3297;

    @OriginalMember(owner = "client!vaa", name = "pb", descriptor = "[Lhi;")
    private class64[] field3286;

    @OriginalMember(owner = "client!vaa", name = "Cb", descriptor = "[Lqg;")
    private class214[] field3299;

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!vaa", name = "B", descriptor = "[Lrda;")
    private class95[] field3246;

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "[Lik;")
    private class700[] field3250;

    @OriginalMember(owner = "client!vaa", name = "Hb", descriptor = "[S")
    private short[] field3304;

    @OriginalMember(owner = "client!vaa", name = "zb", descriptor = "[F")
    private float[] field3296;

    @OriginalMember(owner = "client!vaa", name = "uc", descriptor = "[F")
    private float[] field3343;

    @OriginalMember(owner = "client!vaa", name = "kb", descriptor = "[B")
    private byte[] field3281;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "[S")
    private short[] field3240;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "S")
    private short field3239;

    @OriginalMember(owner = "client!vaa", name = "Ib", descriptor = "[S")
    private short[] field3305;

    @OriginalMember(owner = "client!vaa", name = "P", descriptor = "[S")
    private short[] field3260;

    @OriginalMember(owner = "client!vaa", name = "ub", descriptor = "S")
    private short field3291;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "[B")
    private byte[] field3251;

    @OriginalMember(owner = "client!vaa", name = "cb", descriptor = "[S")
    private short[] field3273;

    @OriginalMember(owner = "client!vaa", name = "N", descriptor = "[S")
    private short[] field3258;

    @OriginalMember(owner = "client!vaa", name = "Wb", descriptor = "[S")
    private short[] field3319;

    @OriginalMember(owner = "client!vaa", name = "lb", descriptor = "[S")
    private short[] field3282;

    @OriginalMember(owner = "client!vaa", name = "wb", descriptor = "[S")
    private short[] field3293;

    @OriginalMember(owner = "client!vaa", name = "Z", descriptor = "[S")
    private short[] field3270;

    @OriginalMember(owner = "client!vaa", name = "X", descriptor = "[I")
    private int[] field3268;

    @OriginalMember(owner = "client!vaa", name = "sb", descriptor = "[[I")
    private int[][] field3289;

    @OriginalMember(owner = "client!vaa", name = "Gb", descriptor = "[[I")
    private int[][] field3303;

    @OriginalMember(owner = "client!vaa", name = "yb", descriptor = "[[I")
    private int[][] field3295;

    @OriginalMember(owner = "client!vaa", name = "xb", descriptor = "I")
    public static int field3294 = 0;

    @OriginalMember(owner = "client!vaa", name = "rb", descriptor = "[[F")
    public static float[][] field3288 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!vaa", name = "eb", descriptor = "B")
    private byte field3275;

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vaa", name = "A", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!vaa", name = "C", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!vaa", name = "D", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!vaa", name = "I", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!vaa", name = "L", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!vaa", name = "M", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!vaa", name = "Q", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vaa", name = "S", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!vaa", name = "T", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!vaa", name = "U", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vaa", name = "ab", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!vaa", name = "bb", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!vaa", name = "fb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!vaa", name = "gb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!vaa", name = "hb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!vaa", name = "jb", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!vaa", name = "mb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!vaa", name = "nb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!vaa", name = "qb", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!vaa", name = "tb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!vaa", name = "Bb", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!vaa", name = "Db", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!vaa", name = "Eb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!vaa", name = "Jb", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!vaa", name = "Kb", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!vaa", name = "Lb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!vaa", name = "Mb", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!vaa", name = "Nb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!vaa", name = "Ob", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!vaa", name = "Qb", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!vaa", name = "Rb", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!vaa", name = "Sb", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!vaa", name = "Tb", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!vaa", name = "Ub", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!vaa", name = "Vb", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!vaa", name = "Yb", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!vaa", name = "cc", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!vaa", name = "dc", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!vaa", name = "ec", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!vaa", name = "fc", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!vaa", name = "hc", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!vaa", name = "ic", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!vaa", name = "jc", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!vaa", name = "kc", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!vaa", name = "pc", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!vaa", name = "wc", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!vaa", name = "zc", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!vaa", name = "Ac", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!vaa", name = "Bc", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!vaa", name = "Cc", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!vaa", name = "Dc", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!vaa", name = "sc", descriptor = "Ldw;")
    private class125 field3341;

    @OriginalMember(owner = "client!vaa", name = "Pb", descriptor = "Liq;")
    private class201 field3312;

    @OriginalMember(owner = "client!vaa", name = "O", descriptor = "Lnl;")
    private class585 field3259;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "S")
    private short field3241;

    @OriginalMember(owner = "client!vaa", name = "V", descriptor = "S")
    private short field3266;

    @OriginalMember(owner = "client!vaa", name = "Y", descriptor = "S")
    private short field3269;

    @OriginalMember(owner = "client!vaa", name = "Zb", descriptor = "S")
    private short field3322;

    @OriginalMember(owner = "client!vaa", name = "gc", descriptor = "S")
    private short field3329;

    @OriginalMember(owner = "client!vaa", name = "lc", descriptor = "S")
    private short field3334;

    @OriginalMember(owner = "client!vaa", name = "oc", descriptor = "S")
    private short field3337;

    @OriginalMember(owner = "client!vaa", name = "xc", descriptor = "S")
    private short field3346;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "()Z", line = 7)
    public final boolean method736() {
        field3307++;
        if (this.field3293 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3293.length; var1++) {
            if (this.field3293[var1] != -1 && !this.field3279.field7898.method2480(false, this.field3293[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lq;)V", line = 31)
    public final void method720(class491 arg0) {
        field3314++;
        class159 var2 = (class159) arg0;
        if (this.field3286 != null) {
            for (int var3 = 0; var3 < this.field3286.length; var3++) {
                class64 var4 = this.field3286[var3];
                class64 var5 = var4;
                if (var4.field864 != null) {
                    var5 = var4.field864;
                }
                var5.field868 = (int) ((float) this.field3297[var4.field862] * var2.field2072 + (float) this.field3336[var4.field862] * var2.field2075 + (float) this.field3320[var4.field862] * var2.field2080 + var2.field2084);
                var5.field859 = (int) ((float) this.field3297[var4.field862] * var2.field2062 + (float) this.field3336[var4.field862] * var2.field2066 + (float) this.field3320[var4.field862] * var2.field2065 + var2.field2071);
                var5.field870 = (int) ((float) this.field3297[var4.field862] * var2.field2086 + (float) this.field3336[var4.field862] * var2.field2070 + (float) this.field3320[var4.field862] * var2.field2058 + var2.field2064);
                var5.field860 = (int) ((float) this.field3297[var4.field865] * var2.field2072 + (float) this.field3336[var4.field865] * var2.field2075 + (float) this.field3320[var4.field865] * var2.field2080 + var2.field2084);
                var5.field861 = (int) ((float) this.field3297[var4.field865] * var2.field2062 + (float) this.field3336[var4.field865] * var2.field2066 + (float) this.field3320[var4.field865] * var2.field2065 + var2.field2071);
                var5.field871 = (int) ((float) this.field3297[var4.field865] * var2.field2086 + (float) this.field3336[var4.field865] * var2.field2070 + (float) this.field3320[var4.field865] * var2.field2058 + var2.field2064);
                var5.field878 = (int) ((float) this.field3297[var4.field863] * var2.field2072 + (float) this.field3336[var4.field863] * var2.field2075 + (float) this.field3320[var4.field863] * var2.field2080 + var2.field2084);
                var5.field873 = (int) ((float) this.field3297[var4.field863] * var2.field2062 + (float) this.field3336[var4.field863] * var2.field2066 + (float) this.field3320[var4.field863] * var2.field2065 + var2.field2071);
                var5.field872 = (int) ((float) this.field3297[var4.field863] * var2.field2086 + (float) this.field3336[var4.field863] * var2.field2070 + (float) this.field3320[var4.field863] * var2.field2058 + var2.field2064);
            }
        }
        if (this.field3299 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3299.length; var6++) {
            class214 var7 = this.field3299[var6];
            class214 var8 = var7;
            if (var7.field2665 != null) {
                var8 = var7.field2665;
            }
            if (var7.field2667 == null) {
                var7.field2667 = var2.method907();
            } else {
                var7.field2667.method919(var2);
            }
            var8.field2664 = (int) ((float) this.field3297[var7.field2653] * var2.field2072 + (float) this.field3336[var7.field2653] * var2.field2075 + (float) this.field3320[var7.field2653] * var2.field2080 + var2.field2084);
            var8.field2657 = (int) ((float) this.field3297[var7.field2653] * var2.field2062 + (float) this.field3336[var7.field2653] * var2.field2066 + (float) this.field3320[var7.field2653] * var2.field2065 + var2.field2071);
            var8.field2663 = (int) ((float) this.field3297[var7.field2653] * var2.field2086 + (float) this.field3336[var7.field2653] * var2.field2070 + (float) this.field3320[var7.field2653] * var2.field2058 + var2.field2064);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "SA", descriptor = "(I)V", line = 99)
    public final void method761(int arg0) {
        this.field3285 = arg0;
        field3248++;
        if (this.field3312 != null && (this.field3285 & 0x10000) == 0) {
            this.field3273 = this.field3312.field2535;
            this.field3304 = this.field3312.field2538;
            this.field3281 = this.field3312.field2534;
            this.field3319 = this.field3312.field2544;
            this.field3312 = null;
        }
        this.field3254 = true;
        this.method1526(-93);
    }

    @OriginalMember(owner = "client!vaa", name = "M", descriptor = "(I)V", line = 130)
    public final void method722(int arg0) {
        field3301++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3339; var4++) {
            int var5 = this.field3336[var4] * var3 + this.field3297[var4] * var2 >> 14;
            this.field3297[var4] = this.field3297[var4] * var3 - (this.field3336[var4] * var2) >> 14;
            this.field3336[var4] = var5;
        }
        this.field3323 = false;
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lda;IIIZ)V", line = 160)
    public final void method725(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3327++;
        class263 var6 = (class263) arg0;
        if (this.field3324 == 0 || var6.field3324 == 0) {
            return;
        }
        int var7 = var6.field3339;
        int[] var8 = var6.field3336;
        int[] var9 = var6.field3320;
        int[] var10 = var6.field3297;
        short[] var11 = var6.field3319;
        short[] var12 = var6.field3304;
        short[] var13 = var6.field3273;
        byte[] var14 = var6.field3281;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field3312 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field3312.field2535;
            var17 = this.field3312.field2534;
            var18 = this.field3312.field2544;
            var15 = this.field3312.field2538;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3312 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field3312.field2538;
            var21 = var6.field3312.field2535;
            var19 = var6.field3312.field2534;
            var20 = var6.field3312.field2544;
        }
        int[] var23 = var6.field3340;
        short[] var24 = var6.field3240;
        if (!var6.field3323) {
            var6.method1530((byte) -100);
        }
        short var25 = var6.field3266;
        short var26 = var6.field3269;
        short var27 = var6.field3329;
        short var28 = var6.field3337;
        short var29 = var6.field3241;
        short var30 = var6.field3334;
        for (int var31 = 0; var31 < this.field3339; var31++) {
            int var32 = this.field3320[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field3336[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3297[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3340[var31];
                        int var37 = this.field3340[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3240[var38] - 1;
                            if (var35 == -1 || this.field3281[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var18 == null) {
                                            this.field3312 = new class201();
                                            var18 = this.field3312.field2544 = class5.method40(0, this.field3319);
                                            var15 = this.field3312.field2538 = class5.method40(0, this.field3304);
                                            var16 = this.field3312.field2535 = class5.method40(0, this.field3273);
                                            var17 = this.field3312.field2534 = class252.method1478(true, this.field3281);
                                        }
                                        if (var20 == null) {
                                            class201 var44 = var6.field3312 = new class201();
                                            var20 = var44.field2544 = class5.method40(0, var11);
                                            var22 = var44.field2538 = class5.method40(0, var12);
                                            var21 = var44.field2535 = class5.method40(0, var13);
                                            var19 = var44.field2534 = class252.method1478(true, var14);
                                        }
                                        short var45 = this.field3319[var35];
                                        short var46 = this.field3304[var35];
                                        short var47 = this.field3273[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field3281[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var22[var52] += var46;
                                                var21[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        short var53 = var11[var41];
                                        int var54 = this.field3340[var31 + 1];
                                        int var55 = this.field3340[var31];
                                        short var56 = var12[var41];
                                        byte var57 = var14[var41];
                                        short var58 = var13[var41];
                                        for (int var59 = var55; var59 < var54; var59++) {
                                            int var60 = this.field3240[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var53;
                                                var15[var60] += var56;
                                                var16[var60] += var58;
                                                var17[var60] += var57;
                                            }
                                        }
                                        if (this.field3302 == null && this.field3274 != null) {
                                            this.field3274.field4174 = null;
                                        }
                                        if (this.field3302 != null) {
                                            this.field3302.field4174 = null;
                                        }
                                        if (var6.field3302 == null && var6.field3274 != null) {
                                            var6.field3274.field4174 = null;
                                        }
                                        if (var6.field3302 != null) {
                                            var6.field3302.field4174 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZILq;IIZ)Z", line = 430)
    private final boolean method1520(boolean arg0, int arg1, class491 arg2, int arg3, int arg4, boolean arg5) {
        field3257++;
        class159 var7 = (class159) arg2;
        class159 var8 = this.field3279.field7507;
        if (!arg5) {
            this.method699();
        }
        float var9 = var7.field2064 * var8.field2072 + var7.field2084 * var8.field2075 + var7.field2071 * var8.field2080 + var8.field2084;
        float var10 = var7.field2064 * var8.field2062 + var7.field2084 * var8.field2066 + var7.field2071 * var8.field2065 + var8.field2071;
        float var11 = var7.field2064 * var8.field2086 + var7.field2084 * var8.field2070 + var7.field2071 * var8.field2058 + var8.field2064;
        class133.field1736 = var7.field2058 * var8.field2062 + var7.field2080 * var8.field2066 + var7.field2065 * var8.field2065;
        class576.field8049 = var7.field2058 * var8.field2072 + var7.field2080 * var8.field2075 + var7.field2065 * var8.field2080;
        class163.field2142 = var7.field2070 * var8.field2086 + var7.field2075 * var8.field2070 + var7.field2066 * var8.field2058;
        class60.field825 = var7.field2086 * var8.field2086 + var7.field2072 * var8.field2070 + var7.field2062 * var8.field2058;
        class89.field1263 = var7.field2070 * var8.field2062 + var7.field2075 * var8.field2066 + var7.field2066 * var8.field2065;
        class279.field3502 = var7.field2086 * var8.field2072 + var7.field2072 * var8.field2075 + var7.field2062 * var8.field2080;
        class145.field1874 = var7.field2070 * var8.field2072 + var7.field2075 * var8.field2075 + var7.field2066 * var8.field2080;
        class81.field1088 = var7.field2086 * var8.field2062 + var7.field2072 * var8.field2066 + var7.field2062 * var8.field2065;
        class300.field3681 = var7.field2058 * var8.field2086 + var7.field2080 * var8.field2070 + var7.field2065 * var8.field2058;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field3279.field7572;
        int var18 = this.field3279.field7575;
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        class567.field7932[0] = this.field3329;
        class595.field8375[0] = this.field3266;
        class308.field3922[0] = this.field3241;
        class567.field7932[1] = this.field3337;
        class595.field8375[1] = this.field3266;
        class308.field3922[1] = this.field3241;
        class567.field7932[2] = this.field3329;
        class595.field8375[2] = this.field3269;
        class567.field7932[3] = this.field3337;
        class308.field3922[2] = this.field3241;
        class595.field8375[3] = this.field3269;
        class308.field3922[3] = this.field3241;
        class567.field7932[4] = this.field3329;
        class595.field8375[4] = this.field3266;
        class567.field7932[5] = this.field3337;
        class308.field3922[4] = this.field3334;
        class595.field8375[5] = this.field3266;
        class308.field3922[5] = this.field3334;
        class567.field7932[6] = this.field3329;
        class595.field8375[6] = this.field3269;
        class308.field3922[6] = this.field3334;
        class567.field7932[7] = this.field3337;
        class595.field8375[7] = this.field3269;
        class308.field3922[7] = this.field3334;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class308.field3922[var19];
            float var41 = (float) class595.field8375[var19];
            float var42 = (float) class567.field7932[var19];
            float var43 = class279.field3502 * var40 + class576.field8049 * var41 + class145.field1874 * var42 + var9;
            float var44 = class60.field825 * var40 + class300.field3681 * var41 + class163.field2142 * var42 + var11;
            float var45 = class81.field1088 * var40 + class89.field1263 * var42 + class133.field1736 * var41 + var10;
            if ((float) this.field3279.field7554 <= var44) {
                if (arg1 > 0) {
                    var44 = arg1;
                }
                float var46 = (float) var17 * var43 / var44 + (float) this.field3279.field7581;
                float var47 = (float) var18 * var45 / var44 + (float) this.field3279.field7571;
                if (var14 < var46) {
                    var14 = var46;
                }
                if (var13 > var46) {
                    var13 = var46;
                }
                if (var15 > var47) {
                    var15 = var47;
                }
                if (var47 > var16) {
                    var16 = var47;
                }
                var12 = true;
            }
        }
        if (var12 && var13 < (float) arg4 && (float) arg4 < var14 && var15 < (float) arg3 && var16 > (float) arg3) {
            if (arg0) {
                return true;
            }
            if (this.field3335 > this.field3279.field7632.length) {
                this.field3279.field7632 = new int[this.field3335];
                this.field3279.field7630 = new int[this.field3335];
            }
            int[] var20 = this.field3279.field7632;
            int[] var21 = this.field3279.field7630;
            for (int var22 = 0; var22 < this.field3339; var22++) {
                float var24 = (float) this.field3320[var22];
                float var25 = (float) this.field3297[var22];
                float var26 = (float) this.field3336[var22];
                float var27 = class81.field1088 * var25 + class89.field1263 * var26 + class133.field1736 * var24 + var10;
                float var28 = class60.field825 * var25 + class300.field3681 * var24 + class163.field2142 * var26 + var11;
                float var29 = class279.field3502 * var25 + class576.field8049 * var24 + class145.field1874 * var26 + var9;
                if (var28 >= (float) this.field3279.field7554) {
                    if (arg1 > 0) {
                        var28 = arg1;
                    }
                    int var30 = (int) ((float) var17 * var29 / var28 + (float) this.field3279.field7581);
                    int var31 = (int) ((float) var18 * var27 / var28 + (float) this.field3279.field7571);
                    int var32 = this.field3340[var22];
                    int var33 = this.field3340[var22 + 1];
                    for (int var34 = var32; var34 < var33; var34++) {
                        int var35 = this.field3240[var34] - 1;
                        if (var35 == -1) {
                            break;
                        }
                        var20[var35] = var30;
                        var21[var35] = var31;
                    }
                } else {
                    int var36 = this.field3340[var22];
                    int var37 = this.field3340[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field3240[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[this.field3240[var38] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field3324; var23++) {
                if (var20[this.field3258[var23]] != -999999 && var20[this.field3305[var23]] != -999999 && var20[this.field3282[var23]] != -999999 && this.method1532(arg3, arg4, var21[this.field3305[var23]], var21[this.field3258[var23]], var20[this.field3305[var23]], -117, var20[this.field3282[var23]], var21[this.field3282[var23]], var20[this.field3258[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIISB)I", line = 652)
    private final int method1521(int arg0, int arg1, int arg2, short arg3, byte arg4) {
        if (arg2 <= 49) {
            return -105;
        }
        field3278++;
        int var6 = class344.field4422[class525.method2862(arg1, arg0, -3)];
        if (arg3 != -1) {
            class13 var7 = this.field3279.field7898.method2486(arg3 & 0xFFFF, (byte) 86);
            int var8 = var7.field242 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 <= 127) {
                    var9 = arg0 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field231 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF00C4) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "()[Lhi;", line = 722)
    public final class64[] method728() {
        field3315++;
        return this.field3286;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V", line = 730)
    private final void method1522(byte arg0) {
        if (arg0 != -82) {
            return;
        }
        if (this.field3250 != null) {
            class159 var2 = this.field3279.field7475;
            this.field3279.method2989((byte) 101);
            this.field3279.method1034(false);
            this.field3279.method3010((byte) 116, false);
            this.field3279.method2985(this.field3279.field7576, (byte) 39, null, this.field3279.field7531, null);
            for (int var3 = 0; var3 < this.field3249; var3++) {
                class700 var4 = this.field3250[var3];
                class95 var5 = this.field3246[var3];
                if (!var4.field9898 || !this.field3279.method1006()) {
                    float var6 = (float) (this.field3336[var4.field9899] + this.field3336[var4.field9895] + this.field3336[var4.field9904]) * 0.3333333F;
                    float var7 = (float) (this.field3320[var4.field9899] + this.field3320[var4.field9895] + this.field3320[var4.field9904]) * 0.3333333F;
                    float var8 = (float) (this.field3297[var4.field9899] + this.field3297[var4.field9895] + this.field3297[var4.field9904]) * 0.3333333F;
                    float var9 = class279.field3502 * var8 + class576.field8049 * var7 + class145.field1874 * var6 + class148.field1911;
                    float var10 = class81.field1088 * var8 + class89.field1263 * var6 + class133.field1736 * var7 + class133.field1744;
                    float var11 = class60.field825 * var8 + class300.field3681 * var7 + class163.field2142 * var6 + class403.field5061;
                    var2.method917(var4.field9901 * var5.field1315 >> 7, (byte) -56, (float) var5.field1308 + var9, var5.field1314, (float) var5.field1305 - var10, (float) var4.field9896 + -var11, var4.field9894 * var5.field1310 >> 7);
                    this.field3279.method2997(var2, 0);
                    int var12 = var5.field1309;
                    OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                    this.field3279.method2961(var4.field9893, (byte) -41);
                    this.field3279.method3017((byte) 25, var4.field9891);
                    this.field3279.method3004((byte) -31, 4, 7, 0);
                }
            }
            this.field3279.method1034(true);
            this.field3279.method2974(0);
        }
        field3284++;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V", line = 788)
    public static final void method1523(int arg0, int arg1, int arg2) {
        field3283++;
        class592 var3 = class61.method371(arg2, arg0, (byte) 111);
        var3.method3256((byte) 11);
        var3.field8314 = arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "DA", descriptor = "(SS)V", line = 802)
    public final void method705(short arg0, short arg1) {
        field3264++;
        class526 var3 = this.field3279.field7898;
        for (int var4 = 0; var4 < this.field3324; var4++) {
            if (this.field3293[var4] == arg0) {
                this.field3293[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class13 var7 = var3.method2486(arg0 & 0xFFFF, (byte) 86);
            var6 = var7.field231;
            var5 = var7.field242;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class13 var10 = var3.method2486(arg1 & 0xFFFF, (byte) 86);
            var9 = var10.field231;
            var8 = var10.field242;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field3250 != null) {
            for (int var11 = 0; var11 < this.field3249; var11++) {
                class700 var12 = this.field3250[var11];
                class95 var13 = this.field3246[var11];
                var13.field1309 = class344.field4422[this.field3270[var12.field9890] & 0xFFFF] & 0xFFFFFF | var13.field1309 & 0xFF000000;
            }
        }
        if (this.field3274 != null) {
            this.field3274.field4174 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[IIIIIZ)V", line = 876)
    public final void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3308++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class428.field5353 = 0;
            class272.field3431 = 0;
            class642.field9036 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3289.length) {
                    int[] var15 = this.field3289[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class642.field9036 += this.field3336[var17];
                        class428.field5353 += this.field3320[var17];
                        class272.field3431 += this.field3297[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class642.field9036 = var10;
                class428.field5353 = var9;
                class272.field3431 = var11;
            } else {
                class428.field5353 = class428.field5353 / var12 + var9;
                class272.field3431 = class272.field3431 / var12 + var11;
                class642.field9036 = class642.field9036 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field3289.length) {
                    int[] var23 = this.field3289[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3336[var25] += var20;
                        this.field3320[var25] += var19;
                        this.field3297[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field3289.length) {
                    int[] var46 = this.field3289[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3336[var59] -= class642.field9036;
                            this.field3320[var59] -= class428.field5353;
                            this.field3297[var59] -= class272.field3431;
                            if (arg4 != 0) {
                                int var60 = class453.field5810[arg4];
                                int var61 = class453.field5811[arg4];
                                int var62 = this.field3336[var59] * var61 + (this.field3320[var59] * var60 + 16383) >> 14;
                                this.field3320[var59] = this.field3320[var59] * var61 + 16383 - (this.field3336[var59] * var60) >> 14;
                                this.field3336[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class453.field5810[arg2];
                                int var64 = class453.field5811[arg2];
                                int var65 = this.field3320[var59] * var64 + 16383 - (this.field3297[var59] * var63) >> 14;
                                this.field3297[var59] = this.field3297[var59] * var64 + (this.field3320[var59] * var63 + 16383) >> 14;
                                this.field3320[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class453.field5810[arg3];
                                int var67 = class453.field5811[arg3];
                                int var68 = this.field3297[var59] * var66 + (this.field3336[var59] * var67) + 16383 >> 14;
                                this.field3297[var59] = this.field3297[var59] * var67 + 16383 - (this.field3336[var59] * var66) >> 14;
                                this.field3336[var59] = var68;
                            }
                            this.field3336[var59] += class642.field9036;
                            this.field3320[var59] += class428.field5353;
                            this.field3297[var59] += class272.field3431;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3336[var48] -= class642.field9036;
                            this.field3320[var48] -= class428.field5353;
                            this.field3297[var48] -= class272.field3431;
                            if (arg2 != 0) {
                                int var49 = class453.field5810[arg2];
                                int var50 = class453.field5811[arg2];
                                int var51 = this.field3320[var48] * var50 + 16383 - (this.field3297[var48] * var49) >> 14;
                                this.field3297[var48] = this.field3297[var48] * var50 + this.field3320[var48] * var49 + 16383 >> 14;
                                this.field3320[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class453.field5810[arg4];
                                int var53 = class453.field5811[arg4];
                                int var54 = this.field3336[var48] * var53 + this.field3320[var48] * var52 + 16383 >> 14;
                                this.field3320[var48] = this.field3320[var48] * var53 + (16383 - (this.field3336[var48] * var52)) >> 14;
                                this.field3336[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class453.field5810[arg3];
                                int var56 = class453.field5811[arg3];
                                int var57 = this.field3336[var48] * var56 + this.field3297[var48] * var55 + 16383 >> 14;
                                this.field3297[var48] = this.field3297[var48] * var56 + 16383 - (this.field3336[var48] * var55) >> 14;
                                this.field3336[var48] = var57;
                            }
                            this.field3336[var48] += class642.field9036;
                            this.field3320[var48] += class428.field5353;
                            this.field3297[var48] += class272.field3431;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field3289.length > var28) {
                        int[] var29 = this.field3289[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3340[var31];
                            int var33 = this.field3340[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3240[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class453.field5810[arg4];
                                    int var37 = class453.field5811[arg4];
                                    int var38 = this.field3304[var35] * var36 - (-(this.field3319[var35] * var37) - 16383) >> 14;
                                    this.field3304[var35] = (short) (this.field3304[var35] * var37 + (16383 - (this.field3319[var35] * var36)) >> 14);
                                    this.field3319[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class453.field5810[arg2];
                                    int var40 = class453.field5811[arg2];
                                    int var41 = this.field3304[var35] * var40 - (this.field3273[var35] * var39 - 16383) >> 14;
                                    this.field3273[var35] = (short) (this.field3304[var35] * var39 + this.field3273[var35] * var40 + 16383 >> 14);
                                    this.field3304[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class453.field5810[arg3];
                                    int var43 = class453.field5811[arg3];
                                    int var44 = this.field3273[var35] * var42 + (this.field3319[var35] * var43) + 16383 >> 14;
                                    this.field3273[var35] = (short) (this.field3273[var35] * var43 + 16383 - (this.field3319[var35] * var42) >> 14);
                                    this.field3319[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3302 == null && this.field3274 != null) {
                    this.field3274.field4174 = null;
                }
                if (this.field3302 != null) {
                    this.field3302.field4174 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field3289.length) {
                    int[] var71 = this.field3289[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3336[var73] -= class642.field9036;
                        this.field3320[var73] -= class428.field5353;
                        this.field3297[var73] -= class272.field3431;
                        this.field3336[var73] = this.field3336[var73] * arg2 >> 7;
                        this.field3320[var73] = this.field3320[var73] * arg3 >> 7;
                        this.field3297[var73] = this.field3297[var73] * arg4 >> 7;
                        this.field3336[var73] += class642.field9036;
                        this.field3320[var73] += class428.field5353;
                        this.field3297[var73] += class272.field3431;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3295 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field3295.length) {
                        int[] var79 = this.field3295[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3251[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3251[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3274 != null) {
                            this.field3274.field4174 = null;
                        }
                    }
                }
                if (this.field3250 != null) {
                    for (int var75 = 0; var75 < this.field3249; var75++) {
                        class700 var76 = this.field3250[var75];
                        class95 var77 = this.field3246[var75];
                        var77.field1309 = var77.field1309 & 0xFFFFFF | 255 - (this.field3251[var76.field9890] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3295 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field3295.length) {
                        int[] var88 = this.field3295[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3270[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD55) >> 10;
                            int var93 = (var91 & 0x3B0) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3270[var90] = (short) class444.method2376(var97, class444.method2376(var95 << 10, var94 << 7));
                        }
                        if (var88.length > 0 && this.field3274 != null) {
                            this.field3274.field4174 = null;
                        }
                    }
                }
                if (this.field3250 != null) {
                    for (int var84 = 0; var84 < this.field3249; var84++) {
                        class700 var85 = this.field3250[var84];
                        class95 var86 = this.field3246[var84];
                        var86.field1309 = var86.field1309 & 0xFF000000 | class344.field4422[this.field3270[var85.field9890] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3303 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field3303.length) {
                        int[] var100 = this.field3303[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class95 var102 = this.field3246[var100[var101]];
                            var102.field1308 += arg2;
                            var102.field1305 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3303 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field3303.length) {
                        int[] var105 = this.field3303[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class95 var107 = this.field3246[var105[var106]];
                            var107.field1310 = var107.field1310 * arg3 >> 7;
                            var107.field1315 = var107.field1315 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3303 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field3303.length > var109) {
                    int[] var110 = this.field3303[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class95 var112 = this.field3246[var110[var111]];
                        var112.field1314 = var112.field1314 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 1523)
    private final void method1524(int arg0) {
        field3325++;
        if (this.field3344 == 0) {
            return;
        }
        if (this.field3275 != arg0) {
            this.method1525(-117, true);
        }
        this.method1525(arg0 - 92, false);
        if (this.field3342 != null) {
            if (this.field3342.field3025 == null) {
                this.method1531(true, (this.field3275 & 0x10) != 0);
            }
            if (this.field3342.field3025 != null) {
                this.field3279.method3010((byte) 100, this.field3302 != null);
                this.field3279.method2985(this.field3255, (byte) 21, this.field3274, this.field3292, this.field3302);
                int var2 = this.field3268.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3268[var3];
                    int var5 = this.field3268[var3 + 1];
                    int var6 = this.field3293[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3279.method2949(var6, true, this.field3302 != null);
                    this.field3279.method2978((var5 - var4) * 3, var4 * 3, 4, this.field3342.field3025, 255);
                }
            }
        }
        this.method1526(arg0 + 117);
    }

    @OriginalMember(owner = "client!vaa", name = "R", descriptor = "(III)V", line = 1581)
    public final void method746(int arg0, int arg1, int arg2) {
        field3352++;
        for (int var4 = 0; var4 < this.field3339; var4++) {
            if (arg0 != 128) {
                this.field3336[var4] = this.field3336[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3320[var4] = this.field3320[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3297[var4] = this.field3297[var4] * arg2 >> 7;
            }
        }
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
        this.field3323 = false;
    }

    @OriginalMember(owner = "client!vaa", name = "oa", descriptor = "(III)V", line = 1616)
    public final void method710(int arg0, int arg1, int arg2) {
        field3276++;
        for (int var4 = 0; var4 < this.field3339; var4++) {
            if (arg0 != 0) {
                this.field3336[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3320[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3297[var4] += arg2;
            }
        }
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
        this.field3323 = false;
    }

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "()Z", line = 1648)
    public final boolean method742() {
        field3318++;
        if (this.field3289 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3267; var1++) {
            this.field3336[var1] <<= 0x4;
            this.field3320[var1] <<= 0x4;
            this.field3297[var1] <<= 0x4;
        }
        class272.field3431 = 0;
        class428.field5353 = 0;
        class642.field9036 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vaa", name = "J", descriptor = "()I", line = 1675)
    public final int method757() {
        field3300++;
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        return this.field3266;
    }

    @OriginalMember(owner = "client!vaa", name = "za", descriptor = "()I", line = 1691)
    public final int method692() {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3271++;
        return this.field3334;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILq;Z)Z", line = 1707)
    public final boolean method744(int arg0, int arg1, class491 arg2, boolean arg3) {
        field3310++;
        return this.method1520(arg3, -1, arg2, arg1, arg0, true);
    }

    @OriginalMember(owner = "client!vaa", name = "TA", descriptor = "()I", line = 1716)
    public final int method756() {
        field3237++;
        return this.field3239;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZ)V", line = 1727)
    private final void method1525(int arg0, boolean arg1) {
        field3290++;
        boolean var3 = this.field3274 != null && this.field3274.field4174 == null;
        boolean var4 = this.field3302 != null && this.field3302.field4174 == null;
        boolean var5 = this.field3255 != null && this.field3255.field4174 == null;
        if (arg0 > -85) {
            this.field3340 = null;
        }
        boolean var6 = this.field3292 != null && this.field3292.field4174 == null;
        if (arg1) {
            var6 &= (this.field3275 & 0x8) != 0;
            var5 &= (this.field3275 & 0x1) != 0;
            var3 &= (this.field3275 & 0x2) != 0;
            var4 &= (this.field3275 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if ((this.field3335 * var7) <= this.field3279.field7570.field8804.length) {
            this.field3279.field7570.field8812 = 0;
        } else {
            this.field3279.field7570 = new class458((this.field3335 + 100) * var7);
        }
        class458 var12 = this.field3279.field7570;
        if (var5) {
            if (this.field3279.field7579) {
                for (int var13 = 0; var13 < this.field3339; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field3336[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field3320[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field3297[var13]);
                    int var17 = this.field3340[var13];
                    int var18 = this.field3340[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3240[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field8812 = var7 * var20;
                        var12.method3464(var14, -109);
                        var12.method3464(var15, -106);
                        var12.method3464(var16, -104);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3339; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field3336[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field3320[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field3297[var21]);
                    int var25 = this.field3340[var21];
                    int var26 = this.field3340[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3240[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field8812 = var7 * var28;
                        var12.method3523(var22, (byte) 60);
                        var12.method3523(var23, (byte) 48);
                        var12.method3523(var24, (byte) 66);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3302 == null) {
                short[] var31;
                short[] var32;
                short[] var33;
                byte[] var34;
                if (this.field3312 == null) {
                    var31 = this.field3273;
                    var32 = this.field3319;
                    var33 = this.field3304;
                    var34 = this.field3281;
                } else {
                    var33 = this.field3312.field2538;
                    var32 = this.field3312.field2544;
                    var34 = this.field3312.field2534;
                    var31 = this.field3312.field2535;
                }
                float var35 = this.field3279.field7610[0];
                float var36 = this.field3279.field7610[1];
                float var37 = this.field3279.field7610[2];
                float var38 = this.field3279.field7568;
                float var39 = this.field3279.field7530 * 768.0F / (float) this.field3291;
                float var40 = this.field3279.field7553 * 768.0F / (float) this.field3291;
                for (int var41 = 0; var41 < this.field3324; var41++) {
                    int var42 = this.method1521(this.field3239, this.field3270[var41], 85, this.field3293[var41], this.field3251[var41]);
                    float var43 = (float) ((var42 & 0xFF62) >> 8) * this.field3279.field7534;
                    short var44 = this.field3258[var41];
                    float var45 = (float) (var42 >>> 24) * this.field3279.field7541;
                    float var46 = (float) ((var42 & 0xFF81CC) >> 16) * this.field3279.field7620;
                    short var47 = (short) var34[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var44] * var37 + (float) var32[var44] * var35 + (float) var33[var44] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var44] * var37 + (float) var32[var44] * var35 + (float) var33[var44] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var45 * var49);
                    int var51 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    int var52 = (int) (var43 * var49);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field8812 = var7 * var44 + var9;
                    var12.method3509(var50, (byte) -108);
                    var12.method3509(var51, (byte) -114);
                    var12.method3509(var52, (byte) -112);
                    var12.method3509(255 - (this.field3251[var41] & 0xFF), (byte) -114);
                    short var53 = this.field3305[var41];
                    short var54 = (short) var34[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var33[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * ((var55 < 0.0F) ? var40 : var39);
                    int var57 = (int) (var45 * var56);
                    int var58 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var59 = (int) (var43 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    var12.field8812 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method3509(var57, (byte) -109);
                    var12.method3509(var58, (byte) -114);
                    var12.method3509(var59, (byte) -113);
                    var12.method3509(255 - (this.field3251[var41] & 0xFF), (byte) -121);
                    short var60 = this.field3282[var41];
                    short var61 = (short) var34[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var33[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var38 + (var62 < 0.0F ? var40 : var39) * var62;
                    int var64 = (int) (var45 * var63);
                    int var65 = (int) (var46 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var66 = (int) (var43 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field8812 = var7 * var60 + var9;
                    var12.method3509(var64, (byte) -120);
                    var12.method3509(var65, (byte) -125);
                    var12.method3509(var66, (byte) -127);
                    var12.method3509(255 - (this.field3251[var41] & 0xFF), (byte) -123);
                }
            } else {
                for (int var29 = 0; var29 < this.field3324; var29++) {
                    int var30 = this.method1521(this.field3239, this.field3270[var29], 94, this.field3293[var29], this.field3251[var29]);
                    var12.field8812 = this.field3258[var29] * var7 + var9;
                    var12.method3464(var30, -110);
                    var12.field8812 = this.field3305[var29] * var7 + var9;
                    var12.method3464(var30, -116);
                    var12.field8812 = this.field3282[var29] * var7 + var9;
                    var12.method3464(var30, -100);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field3312 == null) {
                var67 = this.field3304;
                var68 = this.field3281;
                var69 = this.field3319;
                var70 = this.field3273;
            } else {
                var70 = this.field3312.field2535;
                var68 = this.field3312.field2534;
                var67 = this.field3312.field2538;
                var69 = this.field3312.field2544;
            }
            float var71 = 3.0F / (float) this.field3291;
            var12.field8812 = var10;
            float var72 = 3.0F / (float) (this.field3291 / 2 + this.field3291);
            if (this.field3279.field7579) {
                for (int var76 = 0; var76 < this.field3335; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2449((float) var69[var76] * var72, 38);
                        var12.method2449((float) var67[var76] * var72, -115);
                        var12.method2449((float) var70[var76] * var72, 98);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2449((float) var69[var76] * var78, -58);
                        var12.method2449((float) var67[var76] * var78, 72);
                        var12.method2449((float) var70[var76] * var78, 110);
                    }
                    var12.field8812 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field3335; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2447((byte) -71, (float) var69[var73] * var72);
                        var12.method2447((byte) -71, (float) var67[var73] * var72);
                        var12.method2447((byte) -71, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2447((byte) -71, (float) var69[var73] * var75);
                        var12.method2447((byte) -71, (float) var67[var73] * var75);
                        var12.method2447((byte) -71, (float) var70[var73] * var75);
                    }
                    var12.field8812 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field8812 = var11;
            if (this.field3279.field7579) {
                for (int var80 = 0; var80 < this.field3335; var80++) {
                    var12.method2449(this.field3296[var80], 28);
                    var12.method2449(this.field3343[var80], -119);
                    var12.field8812 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field3335; var79++) {
                    var12.method2447((byte) -71, this.field3296[var79]);
                    var12.method2447((byte) -71, this.field3343[var79]);
                    var12.field8812 += var7 - 8;
                }
            }
        }
        var12.field8812 = this.field3335 * var7;
        class585 var81;
        if (arg1) {
            if (this.field3259 == null) {
                this.field3259 = this.field3279.method3024(var12.field8804, var12.field8812, true, var7, -99);
            } else {
                this.field3259.method829(var12.field8804, var12.field8812, var7, (byte) -80);
            }
            this.field3275 = 0;
            var81 = this.field3259;
        } else {
            var81 = this.field3279.method3024(var12.field8804, var12.field8812, false, var7, 70);
            this.field3254 = true;
        }
        if (var5) {
            this.field3255.field4178 = var8;
            this.field3255.field4174 = var81;
        }
        if (var6) {
            this.field3292.field4174 = var81;
            this.field3292.field4178 = var11;
        }
        if (var3) {
            this.field3274.field4178 = var9;
            this.field3274.field4174 = var81;
        }
        if (var4) {
            this.field3302.field4174 = var81;
            this.field3302.field4178 = var10;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lqj;)V", line = 5643)
    public class263(class548 arg0) {
        this.field3279 = arg0;
        this.field3255 = new class325(null, 5126, 3, 0);
        this.field3292 = new class325(null, 5126, 2, 0);
        this.field3302 = new class325(null, 5126, 3, 0);
        this.field3274 = new class325(null, 5121, 4, 0);
        this.field3342 = new class244();
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lqj;Leg;IIII)V", line = 5655)
    public class263(class548 arg0, class47 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3279 = arg0;
        this.field3285 = arg2;
        this.field3234 = arg5;
        if (class288.method1619(-44, arg2, arg5)) {
            this.field3255 = new class325(null, 5126, 3, 0);
        }
        if (class381.method2063(arg5, (byte) -127, arg2)) {
            this.field3292 = new class325(null, 5126, 2, 0);
        }
        if (class31.method209(arg5, 55, arg2)) {
            this.field3302 = new class325(null, 5126, 3, 0);
        }
        if (class695.method3920(2048, arg5, arg2)) {
            this.field3274 = new class325(null, 5121, 4, 0);
        }
        if (class65.method390(35044, arg2, arg5)) {
            this.field3342 = new class244();
        }
        class526 var7 = arg0.field7898;
        this.field3340 = new int[arg1.field625 + 1];
        int[] var8 = new int[arg1.field646];
        for (int var9 = 0; var9 < arg1.field646; var9++) {
            if ((arg1.field660 == null || arg1.field660[var9] != 2) && (arg1.field641 == null || arg1.field641[var9] == -1 || !var7.method2486(arg1.field641[var9] & 0xFFFF, (byte) 86).field249)) {
                var8[this.field3324++] = var9;
                this.field3340[arg1.field654[var9]]++;
                this.field3340[arg1.field635[var9]]++;
                this.field3340[arg1.field614[var9]]++;
            }
        }
        this.field3344 = this.field3324;
        long[] var10 = new long[this.field3324];
        boolean var11 = (this.field3285 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field3324; var12++) {
            int var180 = var8[var12];
            class13 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field653 != null) {
                for (int var186 = 0; var186 < arg1.field653.length; var186++) {
                    class674 var187 = arg1.field653[var186];
                    if (var187.field9480 == var180) {
                        class177 var188 = class57.method361(var187.field9484, -119);
                        if (var188.field2287) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3344--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field641 != null) {
                var189 = arg1.field641[var180];
                if (var189 != -1) {
                    var181 = var7.method2486(var189 & 0xFFFF, (byte) 86);
                    var184 = var181.field234;
                    var185 = var181.field248;
                }
            }
            boolean var190 = arg1.field626 != null && arg1.field626[var180] != 0 || var181 != null && var181.field244 | !var181.field230;
            if ((var11 || var190) && arg1.field636 != null) {
                var182 += arg1.field636[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
            this.field3347 |= var190;
        }
        class12.method88((byte) -72, var10, var8);
        this.field3320 = arg1.field662;
        this.field3267 = arg1.field639;
        this.field3339 = arg1.field625;
        this.field3262 = arg1.field619;
        this.field3336 = arg1.field628;
        this.field3297 = arg1.field657;
        class524[] var13 = new class524[this.field3339];
        this.field3286 = arg1.field630;
        this.field3299 = arg1.field622;
        if (arg1.field653 != null) {
            this.field3249 = arg1.field653.length;
            this.field3246 = new class95[this.field3249];
            this.field3250 = new class700[this.field3249];
            for (int var14 = 0; var14 < this.field3249; var14++) {
                class674 var15 = arg1.field653[var14];
                class177 var16 = class57.method361(var15.field9484, -124);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3324; var18++) {
                    if (var8[var18] == var15.field9480) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class344.field4422[arg1.field665[var15.field9480] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field626 == null ? 0 : arg1.field626[var15.field9480]) << 24;
                this.field3250[var14] = new class700(var17, arg1.field654[var15.field9480], arg1.field635[var15.field9480], arg1.field614[var15.field9480], var16.field2290, var16.field2297, var16.field2292, var16.field2289, var16.field2296, var16.field2287, var16.field2285, var15.field9478);
                this.field3246[var14] = new class95(var20);
            }
        }
        int var21 = this.field3324 * 3;
        this.field3304 = new short[var21];
        this.field3296 = new float[var21];
        this.field3343 = new float[var21];
        this.field3281 = new byte[var21];
        class224.field2801 = new long[var21];
        this.field3240 = new short[var21];
        this.field3239 = (short) arg3;
        this.field3305 = new short[this.field3324];
        if (arg1.field642 != null) {
            this.field3260 = new short[this.field3324];
        }
        this.field3291 = (short) arg4;
        this.field3251 = new byte[this.field3324];
        this.field3273 = new short[var21];
        this.field3258 = new short[this.field3324];
        this.field3319 = new short[var21];
        this.field3282 = new short[this.field3324];
        this.field3293 = new short[this.field3324];
        this.field3270 = new short[this.field3324];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field625; var23++) {
            int var179 = this.field3340[var23];
            this.field3340[var23] = var22;
            var22 += var179;
            var13[var23] = new class524();
        }
        this.field3340[arg1.field625] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field618 != null) {
            int var28 = arg1.field651;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var24 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field3324; var36++) {
                int var43 = var8[var36];
                if (arg1.field618[var43] != -1) {
                    int var44 = arg1.field618[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field654[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field635[var43];
                        } else {
                            var46 = arg1.field614[var43];
                        }
                        int var47 = arg1.field628[var46];
                        int var48 = arg1.field662[var46];
                        int var49 = arg1.field657[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field645[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field658[var37];
                        if (var39 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var40 = 1.0F;
                        } else {
                            var40 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        }
                        var42 = 64.0F / (float) arg1.field623[var37];
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field623[var37];
                        var40 = 64.0F / (float) arg1.field658[var37];
                        var41 = 64.0F / (float) arg1.field643[var37];
                    } else {
                        var41 = (float) arg1.field643[var37] / 1024.0F;
                        var40 = (float) arg1.field658[var37] / 1024.0F;
                        var42 = (float) arg1.field623[var37] / 1024.0F;
                    }
                    var27[var37] = class1.method6(var41, arg1.field621[var37], arg1.field637[var37], var40, (byte) -72, arg1.field629[var37], var42, class695.method3921(arg1.field664[var37], 255));
                }
            }
        }
        class701[] var50 = new class701[arg1.field646];
        for (int var51 = 0; var51 < arg1.field646; var51++) {
            short var158 = arg1.field654[var51];
            short var159 = arg1.field635[var51];
            short var160 = arg1.field614[var51];
            int var161 = this.field3336[var159] - this.field3336[var158];
            int var162 = this.field3320[var159] - this.field3320[var158];
            int var163 = this.field3297[var159] - this.field3297[var158];
            int var164 = this.field3336[var160] - this.field3336[var158];
            int var165 = this.field3320[var160] - this.field3320[var158];
            int var166 = this.field3297[var160] - this.field3297[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field660 == null ? 0 : arg1.field660[var51];
            if (var174 == 0) {
                class524 var175 = var13[var158];
                var175.field7121 += var171;
                var175.field7120 += var172;
                var175.field7122 += var173;
                var175.field7123++;
                class524 var176 = var13[var159];
                var176.field7122 += var173;
                var176.field7123++;
                var176.field7120 += var172;
                var176.field7121 += var171;
                class524 var177 = var13[var160];
                var177.field7120 += var172;
                var177.field7123++;
                var177.field7122 += var173;
                var177.field7121 += var171;
            } else if (var174 == 1) {
                class701 var178 = var50[var51] = new class701();
                var178.field9912 = var173;
                var178.field9911 = var171;
                var178.field9909 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field3324; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field665[var68] & 0xFFFF;
            short var70;
            if (arg1.field641 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field641[var68];
            }
            int var71;
            if (arg1.field618 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field618[var68];
            }
            int var72;
            if (arg1.field626 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field626[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var80 = 2;
                    var76 = 1.0F;
                    var77 = 0.0F;
                    var73 = 0.0F;
                    var79 = 1;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field645[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field654[var68];
                        short var112 = arg1.field635[var68];
                        short var113 = arg1.field614[var68];
                        short var114 = arg1.field629[var71];
                        short var115 = arg1.field621[var71];
                        short var116 = arg1.field637[var71];
                        float var117 = (float) arg1.field628[var114];
                        float var118 = (float) arg1.field662[var114];
                        float var119 = (float) arg1.field657[var114];
                        float var120 = (float) arg1.field628[var115] - var117;
                        float var121 = (float) arg1.field662[var115] - var118;
                        float var122 = (float) arg1.field657[var115] - var119;
                        float var123 = (float) arg1.field628[var116] - var117;
                        float var124 = (float) arg1.field662[var116] - var118;
                        float var125 = (float) arg1.field657[var116] - var119;
                        float var126 = (float) arg1.field628[var111] - var117;
                        float var127 = (float) arg1.field662[var111] - var118;
                        float var128 = (float) arg1.field657[var111] - var119;
                        float var129 = (float) arg1.field628[var112] - var117;
                        float var130 = (float) arg1.field662[var112] - var118;
                        float var131 = (float) arg1.field657[var112] - var119;
                        float var132 = (float) arg1.field628[var113] - var117;
                        float var133 = (float) arg1.field662[var113] - var118;
                        float var134 = (float) arg1.field657[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        float var142 = var120 * var136 - var121 * var135;
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var122 * var135 - var120 * var137;
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                    } else {
                        short var83 = arg1.field654[var68];
                        short var84 = arg1.field635[var68];
                        short var85 = arg1.field614[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field638[var71];
                        float var91 = (float) arg1.field661[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field643[var71] / 1024.0F;
                            class270.method1556(var91, var87, var90, arg1.field657[var83], var86, var88, var92, 8, var89, arg1.field628[var83], arg1.field662[var83]);
                            var74 = class488.field6469;
                            var73 = class5.field132;
                            class270.method1556(var91, var87, var90, arg1.field657[var84], var86, var88, var92, 8, var89, arg1.field628[var84], arg1.field662[var84]);
                            var76 = class488.field6469;
                            var75 = class5.field132;
                            class270.method1556(var91, var87, var90, arg1.field657[var85], var86, var88, var92, 8, var89, arg1.field628[var85], arg1.field662[var85]);
                            var78 = class488.field6469;
                            var77 = class5.field132;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > var93)) {
                                    var77 -= var92;
                                    var80 = 1;
                                } else if (var73 - var77 > var93) {
                                    var77 += var92;
                                    var80 = 2;
                                }
                                if (var75 - var73 > var93) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var93 < var73 - var75) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                            } else {
                                if (var93 < var78 - var74) {
                                    var78 -= var92;
                                    var80 = 1;
                                } else if (var93 < var74 - var78) {
                                    var78 += var92;
                                    var80 = 2;
                                }
                                if ((var93 < var76 - var74)) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var93 < var74 - var76) {
                                    var79 = 2;
                                    var76 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field624[var71] / 256.0F;
                            float var95 = (float) arg1.field617[var71] / 256.0F;
                            int var96 = arg1.field628[var84] - arg1.field628[var83];
                            int var97 = arg1.field662[var84] - arg1.field662[var83];
                            int var98 = arg1.field657[var84] - arg1.field657[var83];
                            int var99 = arg1.field628[var85] - arg1.field628[var83];
                            int var100 = arg1.field662[var85] - arg1.field662[var83];
                            int var101 = arg1.field657[var85] - arg1.field657[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field658[var71];
                            float var106 = 64.0F / (float) arg1.field623[var71];
                            float var107 = 64.0F / (float) arg1.field643[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[6] * (float) var102 + var89[7] * (float) var103) / var107;
                            var81 = class173.method1095(var108, var109, (byte) 126, var110);
                            class107.method606(var81, var88, arg1.field657[var83], var90, var95, arg1.field628[var83], -127, arg1.field662[var83], var94, var86, var91, var87, var89);
                            var73 = class652.field9207;
                            var74 = class348.field4458;
                            class107.method606(var81, var88, arg1.field657[var84], var90, var95, arg1.field628[var84], -59, arg1.field662[var84], var94, var86, var91, var87, var89);
                            var76 = class348.field4458;
                            var75 = class652.field9207;
                            class107.method606(var81, var88, arg1.field657[var85], var90, var95, arg1.field628[var85], 97, arg1.field662[var85], var94, var86, var91, var87, var89);
                            var77 = class652.field9207;
                            var78 = class348.field4458;
                        } else if (var82 == 3) {
                            class619.method3400(var89, var86, arg1.field657[var83], arg1.field628[var83], var90, var91, var88, -113, arg1.field662[var83], var87);
                            var73 = class699.field9881;
                            var74 = class52.field777;
                            class619.method3400(var89, var86, arg1.field657[var84], arg1.field628[var84], var90, var91, var88, -118, arg1.field662[var84], var87);
                            var75 = class699.field9881;
                            var76 = class52.field777;
                            class619.method3400(var89, var86, arg1.field657[var85], arg1.field628[var85], var90, var91, var88, -34, arg1.field662[var85], var87);
                            var77 = class699.field9881;
                            var78 = class52.field777;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > 0.5F)) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                            } else {
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                                if ((var76 - var74 > 0.5F)) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field660 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field660[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32) + (long) (var71 << 2);
                short var152 = arg1.field654[var68];
                short var153 = arg1.field635[var68];
                short var154 = arg1.field614[var68];
                class524 var155 = var13[var152];
                this.field3258[var52] = this.method1527(var155.field7122, var155.field7123, var155.field7120, var73, 26375, var150, var74, var155.field7121, arg1, var152);
                class524 var156 = var13[var153];
                this.field3305[var52] = this.method1527(var156.field7122, var156.field7123, var156.field7120, var75, 26375, (long) var79 + var150, var76, var156.field7121, arg1, var153);
                class524 var157 = var13[var154];
                this.field3282[var52] = this.method1527(var157.field7122, var157.field7123, var157.field7120, var77, 26375, (long) var80 + var150, var78, var157.field7121, arg1, var154);
            } else if (var146 == 1) {
                class701 var147 = var50[var68];
                long var148 = (long) ((var147.field9911 <= 0 ? 2048 : 1024) + (var71 << 2) + ((var147.field9912 + 256 << 12) - -(var147.field9909 + 256 << 22))) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                this.field3258[var52] = this.method1527(var147.field9912, 0, var147.field9909, var73, 26375, var148, var74, var147.field9911, arg1, arg1.field654[var68]);
                this.field3305[var52] = this.method1527(var147.field9912, 0, var147.field9909, var75, 26375, (long) var79 + var148, var76, var147.field9911, arg1, arg1.field635[var68]);
                this.field3282[var52] = this.method1527(var147.field9912, 0, var147.field9909, var77, 26375, (long) var80 + var148, var78, var147.field9911, arg1, arg1.field614[var68]);
            }
            if (arg1.field641 == null) {
                this.field3293[var52] = -1;
            } else {
                this.field3293[var52] = arg1.field641[var68];
            }
            if (arg1.field626 != null) {
                this.field3251[var52] = arg1.field626[var68];
            }
            if (arg1.field642 != null) {
                this.field3260[var52] = arg1.field642[var68];
            }
            this.field3270[var52] = arg1.field665[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3344; var55++) {
            short var67 = this.field3293[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field3268 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field3344; var58++) {
            short var66 = this.field3293[var58];
            if (var56 != var66) {
                this.field3268[var57++] = var58;
                var56 = var66;
            }
        }
        this.field3268[var57] = this.field3344;
        class224.field2801 = null;
        this.field3319 = class424.method2248(-28, this.field3335, this.field3319);
        this.field3304 = class424.method2248(-121, this.field3335, this.field3304);
        this.field3273 = class424.method2248(98, this.field3335, this.field3273);
        this.field3281 = class635.method3551(this.field3281, this.field3335, 27995);
        this.field3296 = class153.method869(0, this.field3296, this.field3335);
        this.field3343 = class153.method869(0, this.field3343, this.field3335);
        if (arg1.field656 != null && class686.method3856(arg2, 32, this.field3234)) {
            this.field3289 = arg1.method290(false, -75);
        }
        if (arg1.field653 != null && class55.method349(512, this.field3234, arg2)) {
            this.field3303 = arg1.method301(85);
        }
        if (arg1.field632 != null && class383.method2068(this.field3234, (byte) 83, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3324; var61++) {
                int var65 = arg1.field632[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field3295 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3295[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3324; var63++) {
                int var64 = arg1.field632[var8[var63]];
                if (var64 >= 0) {
                    this.field3295[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V", line = 2248)
    private final void method1526(int arg0) {
        field3326++;
        if (!this.field3254) {
            return;
        }
        this.field3254 = false;
        if (this.field3286 == null && this.field3299 == null && this.field3250 == null) {
            if (this.field3336 != null && !class650.method3650((byte) 107, this.field3285, this.field3234)) {
                if (this.field3255 != null && this.field3255.field4174 == null) {
                    this.field3254 = true;
                } else {
                    if (!this.field3323) {
                        this.method1530((byte) -100);
                    }
                    this.field3336 = null;
                }
            }
            if (this.field3320 != null && !class268.method1551(this.field3234, (byte) 114, this.field3285)) {
                if (this.field3255 != null && this.field3255.field4174 == null) {
                    this.field3254 = true;
                } else {
                    if (!this.field3323) {
                        this.method1530((byte) -100);
                    }
                    this.field3320 = null;
                }
            }
            if (this.field3297 != null && !class238.method1428(this.field3285, -53, this.field3234)) {
                if (this.field3255 != null && this.field3255.field4174 == null) {
                    this.field3254 = true;
                } else {
                    if (!this.field3323) {
                        this.method1530((byte) -100);
                    }
                    this.field3297 = null;
                }
            }
        }
        if (this.field3240 != null && this.field3336 == null && this.field3320 == null && this.field3297 == null) {
            this.field3340 = null;
            this.field3240 = null;
        }
        if (this.field3281 != null && !class146.method845(0, this.field3285, this.field3234)) {
            if (this.field3302 == null) {
                if (this.field3274 != null && this.field3274.field4174 == null) {
                    this.field3254 = true;
                } else {
                    this.field3319 = this.field3304 = this.field3273 = null;
                    this.field3281 = null;
                }
            } else if (this.field3302.field4174 == null) {
                this.field3254 = true;
            } else {
                this.field3281 = null;
                this.field3319 = this.field3304 = this.field3273 = null;
            }
        }
        if (this.field3270 != null && !class568.method3139(1, this.field3285, this.field3234)) {
            if (this.field3274 != null && this.field3274.field4174 == null) {
                this.field3254 = true;
            } else {
                this.field3270 = null;
            }
        }
        if (this.field3251 != null && !class560.method3073(262144, this.field3285, this.field3234)) {
            if (this.field3274 != null && this.field3274.field4174 == null) {
                this.field3254 = true;
            } else {
                this.field3251 = null;
            }
        }
        if (this.field3296 != null && !class324.method1855(this.field3234, this.field3285, 1)) {
            if (this.field3292 != null && this.field3292.field4174 == null) {
                this.field3254 = true;
            } else {
                this.field3296 = this.field3343 = null;
            }
        }
        if (this.field3293 != null && !class538.method2918(this.field3285, (byte) 116, this.field3234)) {
            if (this.field3274 != null && this.field3274.field4174 == null) {
                this.field3254 = true;
            } else {
                this.field3293 = null;
            }
        }
        int var2 = 113 % ((arg0 + 22) / 44);
        if (this.field3258 != null && !class440.method2339(this.field3285, false, this.field3234)) {
            if ((this.field3342 == null || this.field3342.field3025 != null) && (this.field3274 == null || this.field3274.field4174 != null)) {
                this.field3258 = this.field3305 = this.field3282 = null;
            } else {
                this.field3254 = true;
            }
        }
        if (this.field3295 != null && !class383.method2068(this.field3234, (byte) 119, this.field3285)) {
            this.field3260 = null;
            this.field3295 = null;
        }
        if (this.field3289 != null && !class686.method3856(this.field3285, 32, this.field3234)) {
            this.field3289 = null;
            this.field3262 = null;
        }
        if (this.field3303 != null && !class55.method349(512, this.field3234, this.field3285)) {
            this.field3303 = null;
        }
        if (this.field3268 != null && (this.field3285 & 0x800) == 0 && (this.field3285 & 0x40000) == 0) {
            this.field3268 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIFIJFILeg;I)S", line = 2422)
    private final short method1527(int arg0, int arg1, int arg2, float arg3, int arg4, long arg5, float arg6, int arg7, class47 arg8, int arg9) {
        field3280++;
        int var12 = this.field3340[arg9];
        int var13 = this.field3340[arg9 + 1];
        int var14 = 0;
        if (arg4 != 26375) {
            this.method694((short) 25, (short) 48);
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3240[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class224.field2801[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field3240[var14] = (short) (this.field3335 + 1);
        class224.field2801[var14] = arg5;
        this.field3319[this.field3335] = (short) arg7;
        this.field3304[this.field3335] = (short) arg0;
        this.field3273[this.field3335] = (short) arg2;
        this.field3281[this.field3335] = (byte) arg1;
        this.field3296[this.field3335] = arg3;
        this.field3343[this.field3335] = arg6;
        return (short) (this.field3335++);
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(I)V", line = 2468)
    public static void method1528(int arg0) {
        field3288 = null;
        if (arg0 != 15426) {
            field3288 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "()V", line = 2479)
    public final void method739() {
        field3253++;
    }

    @OriginalMember(owner = "client!vaa", name = "LA", descriptor = "()Z", line = 2489)
    public final boolean method740() {
        field3242++;
        return this.field3347;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BIZ)Lda;", line = 2502)
    public final class474 method711(byte arg0, int arg1, boolean arg2) {
        field3306++;
        class263 var4;
        class263 var5;
        if (arg0 == 1) {
            var4 = this.field3279.field7539;
            var5 = this.field3279.field7600;
        } else if (arg0 == 2) {
            var4 = this.field3279.field7606;
            var5 = this.field3279.field7562;
        } else if (arg0 == 3) {
            var4 = this.field3279.field7616;
            var5 = this.field3279.field7559;
        } else if (arg0 == 4) {
            var4 = this.field3279.field7551;
            var5 = this.field3279.field7585;
        } else if (arg0 == 5) {
            var4 = this.field3279.field7567;
            var5 = this.field3279.field7523;
        } else {
            var5 = var4 = new class263(this.field3279);
        }
        return this.method1533(var4, (byte) 40, arg2, var5, arg1, arg0 != 0);
    }

    @OriginalMember(owner = "client!vaa", name = "ba", descriptor = "(IILi;Li;III)V", line = 2554)
    public final void method747(int arg0, int arg1, class272 arg2, class272 arg3, int arg4, int arg5, int arg6) {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3333++;
        int var8 = this.field3329 + arg4;
        int var9 = this.field3337 + arg4;
        int var10 = arg6 + this.field3241;
        int var11 = this.field3334 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3441 <= (arg2.field3432 + var9 >> arg2.field3437) || var10 < 0 || arg2.field3432 + var11 >> arg2.field3437 >= arg2.field3440) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3432 + var9 >> arg3.field3437 >= arg3.field3441 || var10 < 0 || (arg3.field3432 + var11 >> arg3.field3437) >= arg3.field3440) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3437;
            int var13 = arg2.field3432 + var9 - 1 >> arg2.field3437;
            int var14 = var10 >> arg2.field3437;
            int var15 = var11 + arg2.field3432 - 1 >> arg2.field3437;
            if (arg2.method1562(var14, (byte) 51, var12) == arg5 && arg5 == arg2.method1562(var14, (byte) 51, var13) && arg5 == arg2.method1562(var15, (byte) 51, var12) && arg2.method1562(var15, (byte) 51, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field3339; var32++) {
                this.field3320[var32] = (this.field3320[var32] + arg2.method1565(this.field3297[var32] + arg6, this.field3336[var32] - -arg4, true)) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field3266;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field3339; var17++) {
                int var18 = (this.field3320[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field3320[var17] += (arg1 - var18) * (arg2.method1565(this.field3297[var17] + arg6, this.field3336[var17] + arg4, true) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFFA0) >> 8) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var28 >> 1)) < 0 || (var28 >> 1) + arg2.field3432 + arg4 >= arg2.field3441 << arg2.field3437 || (arg6 - (var29 >> 1)) < 0 || ((var29 >> 1) + arg2.field3432 + arg6) >= (arg2.field3440 << arg2.field3437)) {
                return;
            }
            this.method2501(var29, arg2, arg4, var30, 0, var28, arg5, var31, arg6);
        } else if (arg0 == 4) {
            int var26 = this.field3269 - this.field3266;
            for (int var27 = 0; var27 < this.field3339; var27++) {
                this.field3320[var27] = var26 + (this.field3320[var27] + arg3.method1565(this.field3297[var27] + arg6, this.field3336[var27] + arg4, true) - arg5);
            }
        } else if (arg0 == 5) {
            int var19 = this.field3269 - this.field3266;
            for (int var20 = 0; var20 < this.field3339; var20++) {
                int var21 = this.field3336[var20] + arg4;
                int var22 = this.field3297[var20] + arg6;
                int var23 = arg2.method1565(var22, var21, true);
                int var24 = arg3.method1565(var22, var21, true);
                int var25 = var23 - arg1 - var24;
                this.field3320[var20] = ((this.field3320[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
            }
        }
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
        this.field3323 = false;
    }

    @OriginalMember(owner = "client!vaa", name = "MA", descriptor = "(I)V", line = 2709)
    public final void method762(int arg0) {
        field3261++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3339; var4++) {
            int var5 = this.field3320[var4] * var3 - (this.field3297[var4] * var2) >> 14;
            this.field3297[var4] = this.field3320[var4] * var2 + (this.field3297[var4] * var3) >> 14;
            this.field3320[var4] = var5;
        }
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
        this.field3323 = false;
    }

    @OriginalMember(owner = "client!vaa", name = "FA", descriptor = "()V", line = 2739)
    public final void method765() {
        for (int var1 = 0; var1 < this.field3339; var1++) {
            this.field3297[var1] = -this.field3297[var1];
        }
        field3272++;
        for (int var2 = 0; var2 < this.field3335; var2++) {
            this.field3273[var2] = (short) (-this.field3273[var2]);
        }
        for (int var3 = 0; var3 < this.field3324; var3++) {
            short var4 = this.field3258[var3];
            this.field3258[var3] = this.field3282[var3];
            this.field3282[var3] = var4;
        }
        if (this.field3302 == null && this.field3274 != null) {
            this.field3274.field4174 = null;
        }
        if (this.field3302 != null) {
            this.field3302.field4174 = null;
        }
        if (this.field3342 != null) {
            this.field3342.field3025 = null;
        }
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
        this.field3323 = false;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IILq;ZI)Z", line = 2793)
    public final boolean method738(int arg0, int arg1, class491 arg2, boolean arg3, int arg4) {
        field3309++;
        return this.method1520(arg3, arg4, arg2, arg1, arg0, true);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lvg;Z)V", line = 2805)
    private final void method1529(class77 arg0, boolean arg1) {
        if (this.field3279.field7632.length < this.field3335) {
            this.field3279.field7630 = new int[this.field3335];
            this.field3279.field7632 = new int[this.field3335];
        }
        field3316++;
        int[] var3 = this.field3279.field7632;
        int[] var4 = this.field3279.field7630;
        for (int var5 = 0; var5 < this.field3339; var5++) {
            int var16 = (this.field3336[var5] - (this.field3320[var5] * this.field3279.field7601 >> 8) >> this.field3279.field7479) - arg0.field1057;
            int var17 = (this.field3297[var5] - (this.field3320[var5] * this.field3279.field7602 >> 8) >> this.field3279.field7479) - arg0.field1067;
            int var18 = this.field3340[var5];
            int var19 = this.field3340[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field3240[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg1) {
            return;
        }
        for (int var6 = 0; var6 < this.field3344; var6++) {
            if (this.field3251 == null || this.field3251[var6] <= 128) {
                short var7 = this.field3258[var6];
                short var8 = this.field3305[var6];
                short var9 = this.field3282[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11)) > 0) {
                    arg0.method460(var15, var10, var12, var11, var13, 117, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "na", descriptor = "()I", line = 2892)
    public final int method754() {
        field3244++;
        return this.field3291;
    }

    @OriginalMember(owner = "client!vaa", name = "PA", descriptor = "()I", line = 2902)
    public final int method764() {
        field3236++;
        return this.field3285;
    }

    @OriginalMember(owner = "client!vaa", name = "WA", descriptor = "(IIII)V", line = 2910)
    public final void method709(int arg0, int arg1, int arg2, int arg3) {
        field3321++;
        if (arg0 == 0) {
            class272.field3431 = 0;
            class642.field9036 = 0;
            class428.field5353 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field3339; var6++) {
                class642.field9036 += this.field3336[var6];
                class428.field5353 += this.field3320[var6];
                class272.field3431 += this.field3297[var6];
                var5++;
            }
            if (var5 > 0) {
                class272.field3431 = class272.field3431 / var5 + arg3;
                class428.field5353 = class428.field5353 / var5 + arg2;
                class642.field9036 = class642.field9036 / var5 + arg1;
            } else {
                class642.field9036 = arg1;
                class272.field3431 = arg3;
                class428.field5353 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3339; var7++) {
                this.field3336[var7] += arg1;
                this.field3320[var7] += arg2;
                this.field3297[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3339; var8++) {
                this.field3336[var8] -= class642.field9036;
                this.field3320[var8] -= class428.field5353;
                this.field3297[var8] -= class272.field3431;
                if (arg3 != 0) {
                    int var9 = class453.field5810[arg3];
                    int var10 = class453.field5811[arg3];
                    int var11 = this.field3336[var8] * var10 + this.field3320[var8] * var9 + 16383 >> 14;
                    this.field3320[var8] = this.field3320[var8] * var10 + 16383 - this.field3336[var8] * var9 >> 14;
                    this.field3336[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class453.field5810[arg1];
                    int var13 = class453.field5811[arg1];
                    int var14 = this.field3320[var8] * var13 + 16383 - (this.field3297[var8] * var12) >> 14;
                    this.field3297[var8] = this.field3297[var8] * var13 + this.field3320[var8] * var12 + 16383 >> 14;
                    this.field3320[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class453.field5810[arg2];
                    int var16 = class453.field5811[arg2];
                    int var17 = this.field3297[var8] * var15 + (this.field3336[var8] * var16) + 16383 >> 14;
                    this.field3297[var8] = this.field3297[var8] * var16 + 16383 - (this.field3336[var8] * var15) >> 14;
                    this.field3336[var8] = var17;
                }
                this.field3336[var8] += class642.field9036;
                this.field3320[var8] += class428.field5353;
                this.field3297[var8] += class272.field3431;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3339; var18++) {
                this.field3336[var18] -= class642.field9036;
                this.field3320[var18] -= class428.field5353;
                this.field3297[var18] -= class272.field3431;
                this.field3336[var18] = this.field3336[var18] * arg1 / 128;
                this.field3320[var18] = this.field3320[var18] * arg2 / 128;
                this.field3297[var18] = this.field3297[var18] * arg3 / 128;
                this.field3336[var18] += class642.field9036;
                this.field3320[var18] += class428.field5353;
                this.field3297[var18] += class272.field3431;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3324; var19++) {
                int var23 = (this.field3251[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3251[var19] = (byte) var23;
            }
            if (this.field3274 != null) {
                this.field3274.field4174 = null;
            }
            if (this.field3250 != null) {
                for (int var20 = 0; var20 < this.field3249; var20++) {
                    class700 var21 = this.field3250[var20];
                    class95 var22 = this.field3246[var20];
                    var22.field1309 = var22.field1309 & 0xFFFFFF | 255 - (this.field3251[var21.field9890] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3324; var24++) {
                int var28 = this.field3270[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3270[var24] = (short) class444.method2376(var34, class444.method2376(var33 << 7, var31 << 10));
            }
            if (this.field3274 != null) {
                this.field3274.field4174 = null;
            }
            if (this.field3250 != null) {
                for (int var25 = 0; var25 < this.field3249; var25++) {
                    class700 var26 = this.field3250[var25];
                    class95 var27 = this.field3246[var25];
                    var27.field1309 = class344.field4422[this.field3270[var26.field9890] & 0xFFFF] & 0xFFFFFF | var27.field1309 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3249; var35++) {
                class95 var36 = this.field3246[var35];
                var36.field1305 += arg2;
                var36.field1308 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3249; var37++) {
                class95 var38 = this.field3246[var37];
                var38.field1315 = var38.field1315 * arg1 >> 7;
                var38.field1310 = var38.field1310 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3249; var39++) {
                class95 var40 = this.field3246[var39];
                var40.field1314 = var40.field1314 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V", line = 3220)
    private final void method1530(byte arg0) {
        field3348++;
        int var2 = 32767;
        if (arg0 != -100) {
            this.field3305 = null;
        }
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3339; var10++) {
            int var11 = this.field3336[var10];
            int var12 = this.field3320[var10];
            int var13 = this.field3297[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field3334 = (short) var7;
        this.field3241 = (short) var4;
        this.field3329 = (short) var2;
        this.field3269 = (short) var6;
        this.field3337 = (short) var5;
        this.field3266 = (short) var3;
        this.field3322 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field3346 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field3323 = true;
    }

    @OriginalMember(owner = "client!vaa", name = "KA", descriptor = "()I", line = 3302)
    public final int method758() {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3247++;
        return this.field3329;
    }

    @OriginalMember(owner = "client!vaa", name = "W", descriptor = "(I)V", line = 3317)
    public final void method715(int arg0) {
        field3287++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3339; var4++) {
            int var5 = this.field3336[var4] * var3 + this.field3320[var4] * var2 >> 14;
            this.field3320[var4] = this.field3320[var4] * var3 - this.field3336[var4] * var2 >> 14;
            this.field3336[var4] = var5;
        }
        this.field3323 = false;
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZZ)V", line = 3347)
    private final void method1531(boolean arg0, boolean arg1) {
        field3298++;
        if ((this.field3344 * 6) <= this.field3279.field7570.field8804.length) {
            this.field3279.field7570.field8812 = 0;
        } else {
            this.field3279.field7570 = new class458((this.field3344 + 100) * 6);
        }
        if (!arg0) {
            return;
        }
        class458 var3 = this.field3279.field7570;
        if (this.field3279.field7579) {
            for (int var5 = 0; var5 < this.field3344; var5++) {
                var3.method3526(this.field3258[var5], 13469);
                var3.method3526(this.field3305[var5], 13469);
                var3.method3526(this.field3282[var5], 13469);
            }
        } else {
            for (int var4 = 0; var4 < this.field3344; var4++) {
                var3.method3484(this.field3258[var4], (byte) 0);
                var3.method3484(this.field3305[var4], (byte) 0);
                var3.method3484(this.field3282[var4], (byte) 0);
            }
        }
        if (var3.field8812 == 0) {
            return;
        }
        if (arg1) {
            if (this.field3341 == null) {
                this.field3341 = this.field3279.method2984((byte) -97, var3.field8812, var3.field8804, true, 5123);
            } else {
                this.field3341.method665(5123, 17816, var3.field8812, var3.field8804);
            }
            this.field3342.field3025 = this.field3341;
        } else {
            this.field3342.field3025 = this.field3279.method2984((byte) -126, var3.field8812, var3.field8804, false, 5123);
        }
        if (!arg1) {
            this.field3254 = true;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "l", descriptor = "()I", line = 3414)
    public final int method699() {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3332++;
        return this.field3337;
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(SS)V", line = 3426)
    public final void method694(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3324; var3++) {
            if (this.field3270[var3] == arg0) {
                this.field3270[var3] = arg1;
            }
        }
        field3238++;
        if (this.field3250 != null) {
            for (int var4 = 0; var4 < this.field3249; var4++) {
                class700 var5 = this.field3250[var4];
                class95 var6 = this.field3246[var4];
                var6.field1309 = var6.field1309 & 0xFF000000 | class344.field4422[this.field3270[var5.field9890] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3274 != null) {
            this.field3274.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "OA", descriptor = "()I", line = 3469)
    public final int method734() {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3338++;
        return this.field3241;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIIIII)Z", line = 3482)
    private final boolean method1532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = 40 % ((-arg5 - 56) / 59);
        field3349++;
        if (arg0 < arg3 && arg0 < arg2 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg3 && arg2 < arg0 && arg0 > arg7) {
            return false;
        } else if (arg8 > arg1 && arg1 < arg4 && arg6 > arg1) {
            return false;
        } else {
            return arg8 >= arg1 || arg4 >= arg1 || arg6 >= arg1;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "K", descriptor = "()I", line = 3509)
    public final int method727() {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3311++;
        return this.field3322;
    }

    @OriginalMember(owner = "client!vaa", name = "RA", descriptor = "()I", line = 3521)
    public final int method704() {
        field3330++;
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        return this.field3346;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lq;Lpba;I)V", line = 3532)
    public final void method717(class491 arg0, class151 arg1, int arg2) {
        field3313++;
        if (this.field3335 == 0) {
            return;
        }
        class159 var4 = this.field3279.field7507;
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        class159 var5 = (class159) arg0;
        class403.field5061 = var4.field2086 * var5.field2064 + var4.field2070 * var5.field2084 + var4.field2058 * var5.field2071 + var4.field2064;
        class300.field3681 = var4.field2086 * var5.field2058 + var4.field2070 * var5.field2080 + var4.field2058 * var5.field2065;
        float var6 = (float) this.field3266 * class300.field3681 + class403.field5061;
        float var7 = (float) this.field3269 * class300.field3681 + class403.field5061;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field3322 + var6;
            var8 = var7 - (float) this.field3322;
        } else {
            var8 = (float) (-this.field3322) + var6;
            var9 = (float) this.field3322 + var7;
        }
        if ((this.field3279.field7520 <= var8) || ((float) this.field3279.field7554 >= var9)) {
            return;
        }
        class148.field1911 = var4.field2072 * var5.field2064 + var4.field2080 * var5.field2071 + var4.field2075 * var5.field2084 + var4.field2084;
        class576.field8049 = var4.field2072 * var5.field2058 + var4.field2080 * var5.field2065 + var4.field2075 * var5.field2080;
        float var10 = (float) this.field3266 * class576.field8049 + class148.field1911;
        float var11 = (float) this.field3269 * class576.field8049 + class148.field1911;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) (-this.field3322) + var11) * (float) this.field3279.field7572;
            var13 = ((float) this.field3322 + var10) * (float) this.field3279.field7572;
        } else {
            var12 = (var10 - (float) this.field3322) * (float) this.field3279.field7572;
            var13 = ((float) this.field3322 + var11) * (float) this.field3279.field7572;
        }
        if ((var12 / var9 >= this.field3279.field7584) || (this.field3279.field7626 >= var13 / var9)) {
            return;
        }
        class133.field1736 = var4.field2062 * var5.field2058 + var4.field2066 * var5.field2080 + var4.field2065 * var5.field2065;
        class133.field1744 = var4.field2062 * var5.field2064 + var4.field2066 * var5.field2084 + var4.field2065 * var5.field2071 + var4.field2071;
        float var14 = (float) this.field3266 * class133.field1736 + class133.field1744;
        float var15 = (float) this.field3269 * class133.field1736 + class133.field1744;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) (-this.field3322) + var15) * (float) this.field3279.field7575;
            var17 = ((float) this.field3322 + var14) * (float) this.field3279.field7575;
        } else {
            var17 = ((float) this.field3322 + var15) * (float) this.field3279.field7575;
            var16 = (var14 - (float) this.field3322) * (float) this.field3279.field7575;
        }
        if ((var16 / var9 >= this.field3279.field7560) || (var17 / var9 <= this.field3279.field7582)) {
            return;
        }
        if (arg1 != null || this.field3250 != null) {
            class145.field1874 = var4.field2072 * var5.field2070 + var4.field2080 * var5.field2066 + var4.field2075 * var5.field2075;
            class81.field1088 = var4.field2062 * var5.field2086 + var4.field2066 * var5.field2072 + var4.field2065 * var5.field2062;
            class279.field3502 = var4.field2072 * var5.field2086 + var4.field2080 * var5.field2062 + var4.field2075 * var5.field2072;
            class60.field825 = var4.field2086 * var5.field2086 + var4.field2070 * var5.field2072 + var4.field2058 * var5.field2062;
            class163.field2142 = var4.field2086 * var5.field2070 + var4.field2070 * var5.field2075 + var4.field2058 * var5.field2066;
            class89.field1263 = var4.field2062 * var5.field2070 + var4.field2066 * var5.field2075 + var4.field2065 * var5.field2066;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3337 + this.field3329 >> 1;
            int var21 = this.field3241 + this.field3334 >> 1;
            int var22 = (int) ((float) var21 * class279.field3502 + (float) this.field3266 * class576.field8049 + (float) var20 * class145.field1874 + class148.field1911);
            int var23 = (int) ((float) var21 * class81.field1088 + (float) this.field3266 * class133.field1736 + (float) var20 * class89.field1263 + class133.field1744);
            int var24 = (int) ((float) var21 * class60.field825 + (float) this.field3266 * class300.field3681 + (float) var20 * class163.field2142 + class403.field5061);
            if (this.field3279.field7554 <= var24) {
                arg1.field1933 = this.field3279.field7572 * var22 / var24 + this.field3279.field7581;
                arg1.field1929 = this.field3279.field7575 * var23 / var24 + this.field3279.field7571;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class279.field3502 + (float) this.field3269 * class576.field8049 + (float) var20 * class145.field1874 + class148.field1911);
            int var26 = (int) ((float) var21 * class81.field1088 + (float) this.field3269 * class133.field1736 + (float) var20 * class89.field1263 + class133.field1744);
            int var27 = (int) ((float) var21 * class60.field825 + (float) this.field3269 * class300.field3681 + (float) var20 * class163.field2142 + class403.field5061);
            if (this.field3279.field7554 <= var27) {
                arg1.field1934 = this.field3279.field7572 * var25 / var27 + this.field3279.field7581;
                arg1.field1931 = this.field3279.field7571 + (this.field3279.field7575 * var26 / var27);
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field3279.field7554 && this.field3279.field7554 > var27) {
                    var19 = false;
                } else if (var24 < this.field3279.field7554) {
                    int var28 = (var27 - this.field3279.field7554 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field1933 = this.field3279.field7572 * var29 / this.field3279.field7554 + this.field3279.field7581;
                    arg1.field1929 = this.field3279.field7575 * var30 / this.field3279.field7554 + this.field3279.field7571;
                } else if (var27 < this.field3279.field7554) {
                    int var31 = (var24 - this.field3279.field7554 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field1933 = this.field3279.field7572 * var32 / this.field3279.field7554 + this.field3279.field7581;
                    arg1.field1929 = this.field3279.field7575 * var33 / this.field3279.field7554 + this.field3279.field7571;
                }
            }
            if (var19) {
                arg1.field1930 = true;
                if (var27 < var24) {
                    arg1.field1932 = (this.field3322 + var22) * this.field3279.field7572 / var24 + this.field3279.field7581 - arg1.field1933;
                } else {
                    arg1.field1932 = (this.field3322 + var25) * this.field3279.field7572 / var27 + this.field3279.field7581 - arg1.field1934;
                }
            }
        }
        this.field3279.method2988(-123);
        this.field3279.method3012(var5, 99);
        this.method1524(0);
        this.field3279.method2974(0);
        this.method1522((byte) -82);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "()V", line = 3733)
    public final void method726() {
        field3350++;
        if (this.field3335 <= 0 || this.field3344 <= 0) {
            return;
        }
        this.method1525(-89, false);
        if ((this.field3275 & 0x10) == 0 && this.field3342.field3025 == null) {
            this.method1531(true, false);
        }
        this.method1526(-106);
    }

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "()V", line = 3757)
    public final void method702() {
        field3263++;
    }

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "()[Lqg;", line = 3769)
    public final class214[] method706() {
        field3235++;
        return this.field3299;
    }

    @OriginalMember(owner = "client!vaa", name = "B", descriptor = "(I[IIIIZI[I)V", line = 3778)
    public final void method721(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3265++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class642.field9036 = 0;
            class272.field3431 = 0;
            int var13 = 0;
            class428.field5353 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field3289.length > var15) {
                    int[] var16 = this.field3289[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3262 == null || (arg6 & this.field3262[var18]) != 0) {
                            class642.field9036 += this.field3336[var18];
                            class428.field5353 += this.field3320[var18];
                            var13++;
                            class272.field3431 += this.field3297[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class272.field3431 = class272.field3431 / var13 + var12;
                class428.field5353 = class428.field5353 / var13 + var10;
                class642.field9036 = class642.field9036 / var13 + var11;
                class428.field5361 = true;
            } else {
                class428.field5353 = var10;
                class642.field9036 = var11;
                class272.field3431 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3) + arg7[2] * arg4 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + (arg7[7] * arg3) + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field3289.length > var26) {
                    int[] var27 = this.field3289[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3262 == null || (this.field3262[var29] & arg6) != 0) {
                            this.field3336[var29] += var22;
                            this.field3320[var29] += var23;
                            this.field3297[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field3289.length > var49) {
                        int[] var50 = this.field3289[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field3262 == null || (arg6 & this.field3262[var52]) != 0) {
                                this.field3336[var52] -= class642.field9036;
                                this.field3320[var52] -= class428.field5353;
                                this.field3297[var52] -= class272.field3431;
                                if (arg4 != 0) {
                                    int var53 = class453.field5810[arg4];
                                    int var54 = class453.field5811[arg4];
                                    int var55 = this.field3336[var52] * var54 + this.field3320[var52] * var53 + 16383 >> 14;
                                    this.field3320[var52] = this.field3320[var52] * var54 + 16383 - (this.field3336[var52] * var53) >> 14;
                                    this.field3336[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class453.field5810[arg2];
                                    int var57 = class453.field5811[arg2];
                                    int var58 = this.field3320[var52] * var57 + 16383 - (this.field3297[var52] * var56) >> 14;
                                    this.field3297[var52] = this.field3320[var52] * var56 + this.field3297[var52] * var57 + 16383 >> 14;
                                    this.field3320[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class453.field5810[arg3];
                                    int var60 = class453.field5811[arg3];
                                    int var61 = this.field3297[var52] * var59 - (-(this.field3336[var52] * var60) - 16383) >> 14;
                                    this.field3297[var52] = this.field3297[var52] * var60 + 16383 - (this.field3336[var52] * var59) >> 14;
                                    this.field3336[var52] = var61;
                                }
                                this.field3336[var52] += class642.field9036;
                                this.field3320[var52] += class428.field5353;
                                this.field3297[var52] += class272.field3431;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field3289.length) {
                            int[] var33 = this.field3289[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field3262 == null || (arg6 & this.field3262[var35]) != 0) {
                                    int var36 = this.field3340[var35];
                                    int var37 = this.field3340[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field3240[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class453.field5810[arg4];
                                            int var41 = class453.field5811[arg4];
                                            int var42 = this.field3319[var39] * var41 + this.field3304[var39] * var40 + 16383 >> 14;
                                            this.field3304[var39] = (short) (this.field3304[var39] * var41 + 16383 - (this.field3319[var39] * var40) >> 14);
                                            this.field3319[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class453.field5810[arg2];
                                            int var44 = class453.field5811[arg2];
                                            int var45 = this.field3304[var39] * var44 + (16383 - (this.field3273[var39] * var43)) >> 14;
                                            this.field3273[var39] = (short) (this.field3273[var39] * var44 + this.field3304[var39] * var43 + 16383 >> 14);
                                            this.field3304[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class453.field5810[arg3];
                                            int var47 = class453.field5811[arg3];
                                            int var48 = this.field3319[var39] * var47 + this.field3273[var39] * var46 + 16383 >> 14;
                                            this.field3273[var39] = (short) (this.field3273[var39] * var47 + 16383 - (this.field3319[var39] * var46) >> 14);
                                            this.field3319[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3302 == null && this.field3274 != null) {
                        this.field3274.field4174 = null;
                    }
                    if (this.field3302 != null) {
                        this.field3302.field4174 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class428.field5361) {
                    int var68 = arg7[3] * class428.field5353 + arg7[0] * class642.field9036 + arg7[6] * class272.field3431 + 8192 >> 14;
                    int var69 = arg7[1] * class642.field9036 + (arg7[4] * class428.field5353) + (arg7[7] * class272.field3431 - -8192) >> 14;
                    int var70 = var66 + var69;
                    int var71 = arg7[5] * class428.field5353 + arg7[8] * class272.field3431 + arg7[2] * class642.field9036 + 8192 >> 14;
                    int var72 = var65 + var68;
                    class642.field9036 = var72;
                    class428.field5353 = var70;
                    int var73 = var67 + var71;
                    class272.field3431 = var73;
                    class428.field5361 = false;
                }
                int[] var74 = new int[9];
                int var75 = class453.field5811[arg2];
                int var76 = class453.field5810[arg2];
                int var77 = class453.field5811[arg3];
                int var78 = class453.field5810[arg3];
                int var79 = class453.field5811[arg4];
                int var80 = class453.field5810[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[7] = var78 * var80 + var77 * var81 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[1] = var78 * var81 + -var77 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                int var83 = var74[2] * -class272.field3431 + var74[1] * -class428.field5353 + var74[0] * -class642.field9036 + 8192 >> 14;
                int var84 = var74[5] * -class272.field3431 + var74[3] * -class642.field9036 + var74[4] * -class428.field5353 + 8192 >> 14;
                int var85 = var74[8] * -class272.field3431 + var74[7] * -class428.field5353 + var74[6] * -class642.field9036 + 8192 >> 14;
                int var86 = var83 + class642.field9036;
                int var87 = var84 + class428.field5353;
                int var88 = var85 + class272.field3431;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[1] * var66 + var74[0] * var65 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[4] * var66 + var74[3] * var65 + (var74[5] * var67) + 8192 >> 14;
                int var93 = var74[6] * var65 + 8192 - (-(var74[7] * var66) - var74[8] * var67) >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var94 + arg7[0] * var95 + 8192 >> 14;
                int var100 = arg7[3] * var95 + arg7[5] * var96 + arg7[4] * var94 + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = arg7[6] * var95 + arg7[8] * var96 + arg7[7] * var94 + 8192 >> 14;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field3289.length) {
                        int[] var107 = this.field3289[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field3262 == null || (arg6 & this.field3262[var109]) != 0) {
                                int var110 = this.field3336[var109] * var97[0] + this.field3320[var109] * var97[1] + this.field3297[var109] * var97[2] + 8192 >> 14;
                                int var111 = this.field3336[var109] * var97[3] + this.field3320[var109] * var97[4] + this.field3297[var109] * var97[5] + 8192 >> 14;
                                int var112 = var103 + var111;
                                int var113 = this.field3320[var109] * var97[7] + this.field3336[var109] * var97[6] + this.field3297[var109] * var97[8] + 8192 >> 14;
                                int var114 = var101 + var110;
                                int var115 = var104 + var113;
                                this.field3336[var109] = var114;
                                this.field3320[var109] = var112;
                                this.field3297[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field3289.length > var173) {
                        int[] var174 = this.field3289[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3262 == null || (arg6 & this.field3262[var176]) != 0) {
                                this.field3336[var176] -= class642.field9036;
                                this.field3320[var176] -= class428.field5353;
                                this.field3297[var176] -= class272.field3431;
                                this.field3336[var176] = this.field3336[var176] * arg2 >> 7;
                                this.field3320[var176] = this.field3320[var176] * arg3 >> 7;
                                this.field3297[var176] = this.field3297[var176] * arg4 >> 7;
                                this.field3336[var176] += class642.field9036;
                                this.field3320[var176] += class428.field5353;
                                this.field3297[var176] += class272.field3431;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class428.field5361) {
                    int var128 = arg7[3] * class428.field5353 + arg7[0] * class642.field9036 + (arg7[6] * class272.field3431) + 8192 >> 14;
                    int var129 = arg7[7] * class272.field3431 + arg7[1] * class642.field9036 + arg7[4] * class428.field5353 + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = var125 + var128;
                    int var132 = arg7[8] * class272.field3431 + arg7[5] * class428.field5353 + arg7[2] * class642.field9036 + 8192 >> 14;
                    int var133 = var127 + var132;
                    class642.field9036 = var131;
                    class428.field5353 = var130;
                    class428.field5361 = false;
                    class272.field3431 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class642.field9036 * var134 + 8192 >> 14;
                int var138 = -class428.field5353 * var135 + 8192 >> 14;
                int var139 = -class272.field3431 * var136 + 8192 >> 14;
                int var140 = class642.field9036 + var137;
                int var141 = class428.field5353 + var138;
                int var142 = class272.field3431 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 8192 >> 14;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[0] * var148 + (arg7[1] * var146) + 8192 >> 14;
                int var153 = arg7[3] * var148 + 8192 - (-(arg7[4] * var146) + -(arg7[5] * var149)) >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[8] * var149 + arg7[6] * var148 + arg7[7] * var146 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field3289.length > var159) {
                        int[] var160 = this.field3289[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field3262 == null || (this.field3262[var162] & arg6) != 0) {
                                int var163 = this.field3320[var162] * var150[1] + this.field3336[var162] * var150[0] + this.field3297[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field3336[var162] * var150[3] + this.field3297[var162] * var150[5] + (this.field3320[var162] * var150[4]) + 8192 >> 14;
                                int var165 = var154 + var163;
                                int var166 = this.field3336[var162] * var150[6] + this.field3320[var162] * var150[7] - (-(this.field3297[var162] * var150[8]) - 8192) >> 14;
                                int var167 = var155 + var164;
                                int var168 = var157 + var166;
                                this.field3336[var162] = var165;
                                this.field3320[var162] = var167;
                                this.field3297[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3295 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field3295.length) {
                        int[] var182 = this.field3295[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3260 == null || (arg6 & this.field3260[var184]) != 0) {
                                int var185 = (this.field3251[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3251[var184] = (byte) var185;
                                if (this.field3274 != null) {
                                    this.field3274.field4174 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3250 != null) {
                    for (int var178 = 0; var178 < this.field3249; var178++) {
                        class700 var179 = this.field3250[var178];
                        class95 var180 = this.field3246[var178];
                        var180.field1309 = 255 - (this.field3251[var179.field9890] & 0xFF) << 24 | var180.field1309 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3295 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field3295.length) {
                        int[] var191 = this.field3295[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3260 == null || (this.field3260[var193] & arg6) != 0) {
                                int var194 = this.field3270[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3C1) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field3270[var193] = (short) class444.method2376(class444.method2376(var197 << 10, var198 << 7), var200);
                                if (this.field3274 != null) {
                                    this.field3274.field4174 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3250 != null) {
                    for (int var187 = 0; var187 < this.field3249; var187++) {
                        class700 var188 = this.field3250[var187];
                        class95 var189 = this.field3246[var187];
                        var189.field1309 = var189.field1309 & 0xFF000000 | class344.field4422[this.field3270[var188.field9890] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3303 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field3303.length > var202) {
                        int[] var203 = this.field3303[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class95 var205 = this.field3246[var203[var204]];
                            var205.field1308 += arg2;
                            var205.field1305 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3303 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field3303.length > var207) {
                        int[] var208 = this.field3303[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class95 var210 = this.field3246[var208[var209]];
                            var210.field1310 = var210.field1310 * arg3 >> 7;
                            var210.field1315 = var210.field1315 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3303 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field3303.length) {
                    int[] var213 = this.field3303[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class95 var215 = this.field3246[var213[var214]];
                        var215.field1314 = var215.field1314 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "L", descriptor = "()V", line = 4764)
    public final void method749() {
        field3351++;
        for (int var1 = 0; var1 < this.field3267; var1++) {
            this.field3336[var1] = this.field3336[var1] + 7 >> 4;
            this.field3320[var1] = this.field3320[var1] + 7 >> 4;
            this.field3297[var1] = this.field3297[var1] + 7 >> 4;
        }
        this.field3323 = false;
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "ga", descriptor = "(I)V", line = 4788)
    public final void method696(int arg0) {
        this.field3291 = (short) arg0;
        if (this.field3274 != null) {
            this.field3274.field4174 = null;
        }
        field3277++;
        if (this.field3302 != null) {
            this.field3302.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "fa", descriptor = "(I)V", line = 4810)
    public final void method723(int arg0) {
        field3331++;
        int var2 = class453.field5810[arg0];
        int var3 = class453.field5811[arg0];
        for (int var4 = 0; var4 < this.field3339; var4++) {
            int var7 = this.field3297[var4] * var2 + (this.field3336[var4] * var3) >> 14;
            this.field3297[var4] = this.field3297[var4] * var3 - (this.field3336[var4] * var2) >> 14;
            this.field3336[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3335; var5++) {
            int var6 = this.field3319[var5] * var3 + this.field3273[var5] * var2 >> 14;
            this.field3273[var5] = (short) (this.field3273[var5] * var3 - (this.field3319[var5] * var2) >> 14);
            this.field3319[var5] = (short) var6;
        }
        if (this.field3302 == null && this.field3274 != null) {
            this.field3274.field4174 = null;
        }
        if (this.field3302 != null) {
            this.field3302.field4174 = null;
        }
        this.field3323 = false;
        if (this.field3255 != null) {
            this.field3255.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII)V", line = 4861)
    public final void method755(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field3324; var5++) {
            int var9 = this.field3270[var5] & 0xFFFF;
            int var10 = (var9 & 0xFF2C) >> 10;
            int var11 = (var9 & 0x393) >> 7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field3270[var5] = (short) class444.method2376(var12, class444.method2376(var10 << 10, var11 << 7));
        }
        field3317++;
        if (this.field3250 != null) {
            for (int var6 = 0; var6 < this.field3249; var6++) {
                class700 var7 = this.field3250[var6];
                class95 var8 = this.field3246[var6];
                var8.field1309 = var8.field1309 & 0xFF000000 | class344.field4422[this.field3270[var7.field9890] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3274 != null) {
            this.field3274.field4174 = null;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lvaa;BZLvaa;IZ)Lda;", line = 4920)
    private final class474 method1533(class263 arg0, byte arg1, boolean arg2, class263 arg3, int arg4, boolean arg5) {
        arg3.field3275 = 0;
        arg3.field3249 = this.field3249;
        arg3.field3344 = this.field3344;
        arg3.field3267 = this.field3267;
        field3243++;
        arg3.field3239 = this.field3239;
        arg3.field3339 = this.field3339;
        arg3.field3324 = this.field3324;
        arg3.field3234 = this.field3234;
        arg3.field3335 = this.field3335;
        arg3.field3291 = this.field3291;
        arg3.field3285 = arg4;
        if ((arg4 & 0x100) == 0) {
            arg3.field3347 = this.field3347;
        } else {
            arg3.field3347 = true;
        }
        boolean var7 = class551.method3051(33, arg4, this.field3234);
        boolean var8 = class159.method912(this.field3234, arg4, false);
        boolean var9 = class445.method2378(119, arg4, this.field3234);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg3.field3336 = this.field3336;
            } else if (arg0.field3336 == null || arg0.field3336.length < this.field3267) {
                arg3.field3336 = arg0.field3336 = new int[this.field3267];
            } else {
                arg3.field3336 = arg0.field3336;
            }
            if (!var8) {
                arg3.field3320 = this.field3320;
            } else if (arg0.field3320 == null || arg0.field3320.length < this.field3267) {
                arg3.field3320 = arg0.field3320 = new int[this.field3267];
            } else {
                arg3.field3320 = arg0.field3320;
            }
            if (!var9) {
                arg3.field3297 = this.field3297;
            } else if (arg0.field3297 == null || this.field3267 > arg0.field3297.length) {
                arg3.field3297 = arg0.field3297 = new int[this.field3267];
            } else {
                arg3.field3297 = arg0.field3297;
            }
            for (int var11 = 0; var11 < this.field3267; var11++) {
                if (var7) {
                    arg3.field3336[var11] = this.field3336[var11];
                }
                if (var8) {
                    arg3.field3320[var11] = this.field3320[var11];
                }
                if (var9) {
                    arg3.field3297[var11] = this.field3297[var11];
                }
            }
        } else {
            arg3.field3320 = this.field3320;
            arg3.field3297 = this.field3297;
            arg3.field3336 = this.field3336;
        }
        if (class167.method955(arg4, arg1 - 41, this.field3234)) {
            if (arg5) {
                arg3.field3275 = (byte) (arg3.field3275 | 0x1);
            }
            arg3.field3255 = arg0.field3255;
            arg3.field3255.field4178 = this.field3255.field4178;
            arg3.field3255.field4174 = this.field3255.field4174;
        } else if (class288.method1619(-44, arg4, this.field3234)) {
            arg3.field3255 = this.field3255;
        } else {
            arg3.field3255 = null;
        }
        if (class570.method3149(arg4, this.field3234, 14031)) {
            if (arg0.field3270 == null || this.field3324 > arg0.field3270.length) {
                arg3.field3270 = arg0.field3270 = new short[this.field3324];
            } else {
                arg3.field3270 = arg0.field3270;
            }
            for (int var12 = 0; var12 < this.field3324; var12++) {
                arg3.field3270[var12] = this.field3270[var12];
            }
        } else {
            arg3.field3270 = this.field3270;
        }
        if (class627.method3446(this.field3234, arg4, 0)) {
            if (arg0.field3251 == null || arg0.field3251.length < this.field3324) {
                arg3.field3251 = arg0.field3251 = new byte[this.field3324];
            } else {
                arg3.field3251 = arg0.field3251;
            }
            for (int var13 = 0; var13 < this.field3324; var13++) {
                arg3.field3251[var13] = this.field3251[var13];
            }
        } else {
            arg3.field3251 = this.field3251;
        }
        if (class512.method2762(arg4, 55, this.field3234)) {
            arg3.field3274 = arg0.field3274;
            if (arg5) {
                arg3.field3275 = (byte) (arg3.field3275 | 0x2);
            }
            arg3.field3274.field4178 = this.field3274.field4178;
            arg3.field3274.field4174 = this.field3274.field4174;
        } else if (class695.method3920(2048, this.field3234, arg4)) {
            arg3.field3274 = this.field3274;
        } else {
            arg3.field3274 = null;
        }
        if (class491.method2644(this.field3234, 116, arg4)) {
            if (arg0.field3319 == null || this.field3335 > arg0.field3319.length) {
                int var14 = this.field3335;
                arg3.field3319 = arg0.field3319 = new short[var14];
                arg3.field3304 = arg0.field3304 = new short[var14];
                arg3.field3273 = arg0.field3273 = new short[var14];
            } else {
                arg3.field3319 = arg0.field3319;
                arg3.field3304 = arg0.field3304;
                arg3.field3273 = arg0.field3273;
            }
            if (this.field3312 == null) {
                for (int var18 = 0; var18 < this.field3335; var18++) {
                    arg3.field3319[var18] = this.field3319[var18];
                    arg3.field3304[var18] = this.field3304[var18];
                    arg3.field3273[var18] = this.field3273[var18];
                }
            } else {
                if (arg0.field3312 == null) {
                    arg0.field3312 = new class201();
                }
                class201 var15 = arg3.field3312 = arg0.field3312;
                if (var15.field2544 == null || this.field3335 > var15.field2544.length) {
                    int var16 = this.field3335;
                    var15.field2535 = new short[var16];
                    var15.field2534 = new byte[var16];
                    var15.field2538 = new short[var16];
                    var15.field2544 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field3335; var17++) {
                    arg3.field3319[var17] = this.field3319[var17];
                    arg3.field3304[var17] = this.field3304[var17];
                    arg3.field3273[var17] = this.field3273[var17];
                    var15.field2544[var17] = this.field3312.field2544[var17];
                    var15.field2538[var17] = this.field3312.field2538[var17];
                    var15.field2535[var17] = this.field3312.field2535[var17];
                    var15.field2534[var17] = this.field3312.field2534[var17];
                }
            }
            arg3.field3281 = this.field3281;
        } else {
            arg3.field3304 = this.field3304;
            arg3.field3319 = this.field3319;
            arg3.field3312 = this.field3312;
            arg3.field3273 = this.field3273;
            arg3.field3281 = this.field3281;
        }
        if (class670.method3761(arg4, this.field3234, -36)) {
            arg3.field3302 = arg0.field3302;
            if (arg5) {
                arg3.field3275 = (byte) (arg3.field3275 | 0x4);
            }
            arg3.field3302.field4178 = this.field3302.field4178;
            arg3.field3302.field4174 = this.field3302.field4174;
        } else if (class31.method209(this.field3234, arg1 ^ 0x1F, arg4)) {
            arg3.field3302 = this.field3302;
        } else {
            arg3.field3302 = null;
        }
        if (class554.method3054((byte) 54, arg4, this.field3234)) {
            if (arg0.field3296 == null || this.field3324 > arg0.field3296.length) {
                int var19 = this.field3335;
                arg3.field3296 = arg0.field3296 = new float[var19];
                arg3.field3343 = arg0.field3343 = new float[var19];
            } else {
                arg3.field3296 = arg0.field3296;
                arg3.field3343 = arg0.field3343;
            }
            for (int var20 = 0; var20 < this.field3335; var20++) {
                arg3.field3296[var20] = this.field3296[var20];
                arg3.field3343[var20] = this.field3343[var20];
            }
        } else {
            arg3.field3296 = this.field3296;
            arg3.field3343 = this.field3343;
        }
        if (class37.method231(arg1 ^ 0x29, this.field3234, arg4)) {
            if (arg5) {
                arg3.field3275 = (byte) (arg3.field3275 | 0x8);
            }
            arg3.field3292 = arg0.field3292;
            arg3.field3292.field4178 = this.field3292.field4178;
            arg3.field3292.field4174 = this.field3292.field4174;
        } else if (class381.method2063(this.field3234, (byte) -123, arg4)) {
            arg3.field3292 = this.field3292;
        } else {
            arg3.field3292 = null;
        }
        if (class167.method956((byte) 69, arg4, this.field3234)) {
            if (arg0.field3258 == null || this.field3324 > arg0.field3258.length) {
                int var21 = this.field3324;
                arg3.field3282 = arg0.field3282 = new short[var21];
                arg3.field3305 = arg0.field3305 = new short[var21];
                arg3.field3258 = arg0.field3258 = new short[var21];
            } else {
                arg3.field3258 = arg0.field3258;
                arg3.field3282 = arg0.field3282;
                arg3.field3305 = arg0.field3305;
            }
            for (int var22 = 0; var22 < this.field3324; var22++) {
                arg3.field3258[var22] = this.field3258[var22];
                arg3.field3305[var22] = this.field3305[var22];
                arg3.field3282[var22] = this.field3282[var22];
            }
        } else {
            arg3.field3282 = this.field3282;
            arg3.field3305 = this.field3305;
            arg3.field3258 = this.field3258;
        }
        if (arg1 != 40) {
            return null;
        }
        if (class214.method1269(0, this.field3234, arg4)) {
            arg3.field3342 = arg0.field3342;
            if (arg5) {
                arg3.field3275 = (byte) (arg3.field3275 | 0x10);
            }
            arg3.field3342.field3025 = this.field3342.field3025;
        } else if (class65.method390(35044, arg4, this.field3234)) {
            arg3.field3342 = this.field3342;
        } else {
            arg3.field3342 = null;
        }
        if (class395.method2123(arg4, this.field3234, (byte) 126)) {
            if (arg0.field3293 == null || this.field3324 > arg0.field3293.length) {
                int var23 = this.field3324;
                arg3.field3293 = arg0.field3293 = new short[var23];
            } else {
                arg3.field3293 = arg0.field3293;
            }
            for (int var24 = 0; var24 < this.field3324; var24++) {
                arg3.field3293[var24] = this.field3293[var24];
            }
        } else {
            arg3.field3293 = this.field3293;
        }
        if (!class269.method1553(0, arg4, this.field3234)) {
            arg3.field3246 = this.field3246;
        } else if (arg0.field3246 == null || this.field3249 > arg0.field3246.length) {
            int var26 = this.field3249;
            arg3.field3246 = arg0.field3246 = new class95[var26];
            for (int var27 = 0; var27 < this.field3249; var27++) {
                arg3.field3246[var27] = this.field3246[var27].method552(class688.method3877(arg1, -22));
            }
        } else {
            arg3.field3246 = arg0.field3246;
            for (int var25 = 0; var25 < this.field3249; var25++) {
                arg3.field3246[var25].method554((byte) 110, this.field3246[var25]);
            }
        }
        arg3.field3303 = this.field3303;
        if (this.field3323) {
            arg3.field3334 = this.field3334;
            arg3.field3329 = this.field3329;
            arg3.field3269 = this.field3269;
            arg3.field3322 = this.field3322;
            arg3.field3266 = this.field3266;
            arg3.field3337 = this.field3337;
            arg3.field3346 = this.field3346;
            arg3.field3323 = true;
            arg3.field3241 = this.field3241;
        } else {
            arg3.field3323 = false;
        }
        arg3.field3340 = this.field3340;
        arg3.field3286 = this.field3286;
        arg3.field3240 = this.field3240;
        arg3.field3262 = this.field3262;
        arg3.field3289 = this.field3289;
        arg3.field3299 = this.field3299;
        arg3.field3268 = this.field3268;
        arg3.field3260 = this.field3260;
        arg3.field3250 = this.field3250;
        arg3.field3295 = this.field3295;
        return arg3;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Lq;Lpba;II)V", line = 5389)
    public final void method751(class491 arg0, class151 arg1, int arg2, int arg3) {
        field3252++;
        if (this.field3335 == 0) {
            return;
        }
        class159 var5 = this.field3279.field7507;
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        class159 var6 = (class159) arg0;
        class300.field3681 = var5.field2086 * var6.field2058 + var5.field2070 * var6.field2080 + var5.field2058 * var6.field2065;
        class403.field5061 = var5.field2086 * var6.field2064 + var5.field2070 * var6.field2084 + var5.field2058 * var6.field2071 + var5.field2064;
        float var7 = (float) this.field3266 * class300.field3681 + class403.field5061;
        float var8 = (float) this.field3269 * class300.field3681 + class403.field5061;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) (-this.field3322) + var8;
            var9 = (float) this.field3322 + var7;
        } else {
            var9 = (float) this.field3322 + var8;
            var10 = var7 - (float) this.field3322;
        }
        if ((var10 >= this.field3279.field7603) || (var9 <= (float) this.field3279.field7554)) {
            return;
        }
        class576.field8049 = var5.field2072 * var6.field2058 + var5.field2080 * var6.field2065 + var5.field2075 * var6.field2080;
        class148.field1911 = var5.field2072 * var6.field2064 + var5.field2080 * var6.field2071 + var5.field2075 * var6.field2084 + var5.field2084;
        float var11 = (float) this.field3266 * class576.field8049 + class148.field1911;
        float var12 = (float) this.field3269 * class576.field8049 + class148.field1911;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field3322 + var11) * (float) this.field3279.field7572;
            var14 = (var12 - (float) this.field3322) * (float) this.field3279.field7572;
        } else {
            var14 = ((float) (-this.field3322) + var11) * (float) this.field3279.field7572;
            var13 = ((float) this.field3322 + var12) * (float) this.field3279.field7572;
        }
        if ((var14 / (float) arg2 >= this.field3279.field7584) || (this.field3279.field7626 >= var13 / (float) arg2)) {
            return;
        }
        class133.field1736 = var5.field2062 * var6.field2058 + var5.field2066 * var6.field2080 + var5.field2065 * var6.field2065;
        class133.field1744 = var5.field2062 * var6.field2064 + var5.field2066 * var6.field2084 + var5.field2065 * var6.field2071 + var5.field2071;
        float var15 = (float) this.field3266 * class133.field1736 + class133.field1744;
        float var16 = (float) this.field3269 * class133.field1736 + class133.field1744;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = (var16 - (float) this.field3322) * (float) this.field3279.field7575;
            var17 = ((float) this.field3322 + var15) * (float) this.field3279.field7575;
        } else {
            var17 = ((float) this.field3322 + var16) * (float) this.field3279.field7575;
            var18 = ((float) (-this.field3322) + var15) * (float) this.field3279.field7575;
        }
        if ((this.field3279.field7560 <= var18 / (float) arg2) || (var17 / (float) arg2 <= this.field3279.field7582)) {
            return;
        }
        if (arg1 != null || this.field3250 != null) {
            class279.field3502 = var5.field2072 * var6.field2086 + var5.field2080 * var6.field2062 + var5.field2075 * var6.field2072;
            class81.field1088 = var5.field2062 * var6.field2086 + var5.field2066 * var6.field2072 + var5.field2065 * var6.field2062;
            class89.field1263 = var5.field2062 * var6.field2070 + var5.field2066 * var6.field2075 + var5.field2065 * var6.field2066;
            class163.field2142 = var5.field2086 * var6.field2070 + var5.field2070 * var6.field2075 + var5.field2058 * var6.field2066;
            class60.field825 = var5.field2086 * var6.field2086 + var5.field2070 * var6.field2072 + var5.field2058 * var6.field2062;
            class145.field1874 = var5.field2072 * var6.field2070 + var5.field2080 * var6.field2066 + var5.field2075 * var6.field2075;
        }
        if (arg1 != null) {
            int var19 = this.field3337 + this.field3329 >> 1;
            int var20 = this.field3334 + this.field3241 >> 1;
            int var21 = (int) ((float) var20 * class279.field3502 + (float) this.field3266 * class576.field8049 + (float) var19 * class145.field1874 + class148.field1911);
            int var22 = (int) ((float) var20 * class81.field1088 + (float) this.field3266 * class133.field1736 + (float) var19 * class89.field1263 + class133.field1744);
            int var23 = (int) ((float) var20 * class60.field825 + (float) this.field3266 * class300.field3681 + (float) var19 * class163.field2142 + class403.field5061);
            int var24 = (int) ((float) var20 * class279.field3502 + (float) this.field3269 * class576.field8049 + (float) var19 * class145.field1874 + class148.field1911);
            int var25 = (int) ((float) var20 * class81.field1088 + (float) this.field3269 * class133.field1736 + (float) var19 * class89.field1263 + class133.field1744);
            arg1.field1931 = this.field3279.field7575 * var25 / arg2 + this.field3279.field7571;
            arg1.field1929 = this.field3279.field7575 * var22 / arg2 + this.field3279.field7571;
            arg1.field1933 = this.field3279.field7572 * var21 / arg2 + this.field3279.field7581;
            int var26 = (int) ((float) var20 * class60.field825 + (float) this.field3269 * class300.field3681 + (float) var19 * class163.field2142 + class403.field5061);
            arg1.field1934 = this.field3279.field7572 * var24 / arg2 + this.field3279.field7581;
            if (this.field3279.field7554 <= var23 || var26 >= this.field3279.field7554) {
                arg1.field1930 = true;
                arg1.field1932 = (this.field3322 + var21) * this.field3279.field7572 / arg2 + this.field3279.field7581 - arg1.field1933;
            }
        }
        this.field3279.method2977((byte) 95, (float) arg2);
        this.field3279.method2950(379);
        this.field3279.method3012(var6, -123);
        this.method1524(0);
        this.field3279.method2974(0);
        this.method1522((byte) -82);
    }

    @OriginalMember(owner = "client!vaa", name = "H", descriptor = "()I", line = 5539)
    public final int method703() {
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        field3245++;
        return this.field3269;
    }

    @OriginalMember(owner = "client!vaa", name = "T", descriptor = "(I)V", line = 5561)
    public final void method731(int arg0) {
        this.field3239 = (short) arg0;
        if (this.field3274 != null) {
            this.field3274.field4174 = null;
        }
        field3345++;
    }

    @OriginalMember(owner = "client!vaa", name = "S", descriptor = "(Lha;)Lha;", line = 5574)
    public final class119 method752(class119 arg0) {
        field3328++;
        if (this.field3335 == 0) {
            return null;
        }
        if (!this.field3323) {
            this.method1530((byte) -100);
        }
        int var2;
        int var3;
        if (this.field3279.field7601 > 0) {
            var2 = this.field3329 - (this.field3279.field7601 * this.field3269 >> 8) >> this.field3279.field7479;
            var3 = this.field3337 - (this.field3279.field7601 * this.field3266 >> 8) >> this.field3279.field7479;
        } else {
            var2 = this.field3329 - (this.field3279.field7601 * this.field3266 >> 8) >> this.field3279.field7479;
            var3 = this.field3337 - (this.field3279.field7601 * this.field3269 >> 8) >> this.field3279.field7479;
        }
        int var4;
        int var5;
        if (this.field3279.field7602 > 0) {
            var4 = this.field3241 - (this.field3279.field7602 * this.field3269 >> 8) >> this.field3279.field7479;
            var5 = this.field3334 - (this.field3279.field7602 * this.field3266 >> 8) >> this.field3279.field7479;
        } else {
            var4 = this.field3241 - (this.field3279.field7602 * this.field3266 >> 8) >> this.field3279.field7479;
            var5 = this.field3334 - (this.field3279.field7602 * this.field3269 >> 8) >> this.field3279.field7479;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class77 var8 = (class77) arg0;
        class77 var9;
        if (var8 != null && var8.method461(var7, 87, var6)) {
            var9 = var8;
            var8.method458(-24051);
        } else {
            var9 = new class77(this.field3279, var6, var7);
        }
        var9.method457(var2, var4, var5, true, var3);
        this.method1529(var9, false);
        return var9;
    }
}
