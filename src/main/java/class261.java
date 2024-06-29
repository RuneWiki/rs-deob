import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class261 extends class521 {

    @OriginalMember(owner = "client!lr", name = "pb", descriptor = "Z")
    private boolean field3268 = true;

    @OriginalMember(owner = "client!lr", name = "tb", descriptor = "I")
    private int field3272 = 0;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    private int field3245 = 0;

    @OriginalMember(owner = "client!lr", name = "lc", descriptor = "I")
    private int field3316 = 0;

    @OriginalMember(owner = "client!lr", name = "wc", descriptor = "I")
    private int field3327 = 0;

    @OriginalMember(owner = "client!lr", name = "Ab", descriptor = "I")
    private int field3279 = 0;

    @OriginalMember(owner = "client!lr", name = "vc", descriptor = "Z")
    private boolean field3326 = false;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Luq;")
    private class313 field3221;

    @OriginalMember(owner = "client!lr", name = "xc", descriptor = "Lcd;")
    private class86 field3328;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Lcd;")
    private class86 field3222;

    @OriginalMember(owner = "client!lr", name = "Db", descriptor = "Lcd;")
    private class86 field3282;

    @OriginalMember(owner = "client!lr", name = "sb", descriptor = "Lcd;")
    private class86 field3271;

    @OriginalMember(owner = "client!lr", name = "db", descriptor = "Lhs;")
    private class540 field3256;

    @OriginalMember(owner = "client!lr", name = "vb", descriptor = "I")
    private int field3274;

    @OriginalMember(owner = "client!lr", name = "kb", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!lr", name = "Bb", descriptor = "[I")
    private int[] field3280;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "[I")
    private int[] field3229;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "[S")
    private short[] field3224;

    @OriginalMember(owner = "client!lr", name = "gc", descriptor = "[I")
    private int[] field3311;

    @OriginalMember(owner = "client!lr", name = "cb", descriptor = "[I")
    private int[] field3255;

    @OriginalMember(owner = "client!lr", name = "uc", descriptor = "[Lkca;")
    private class601[] field3325;

    @OriginalMember(owner = "client!lr", name = "Xb", descriptor = "[Lfi;")
    private class55[] field3302;

    @OriginalMember(owner = "client!lr", name = "hc", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!lr", name = "Cb", descriptor = "[Lqt;")
    private class365[] field3281;

    @OriginalMember(owner = "client!lr", name = "Kb", descriptor = "[Lsca;")
    private class222[] field3289;

    @OriginalMember(owner = "client!lr", name = "jb", descriptor = "[S")
    private short[] field3262;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "[S")
    private short[] field3244;

    @OriginalMember(owner = "client!lr", name = "Ub", descriptor = "[S")
    private short[] field3299;

    @OriginalMember(owner = "client!lr", name = "Wb", descriptor = "S")
    private short field3301;

    @OriginalMember(owner = "client!lr", name = "rb", descriptor = "[B")
    private byte[] field3270;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "[S")
    private short[] field3223;

    @OriginalMember(owner = "client!lr", name = "Qb", descriptor = "[S")
    private short[] field3295;

    @OriginalMember(owner = "client!lr", name = "gb", descriptor = "S")
    private short field3259;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "[S")
    private short[] field3226;

    @OriginalMember(owner = "client!lr", name = "kc", descriptor = "[S")
    private short[] field3315;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "[B")
    private byte[] field3220;

    @OriginalMember(owner = "client!lr", name = "fc", descriptor = "[F")
    private float[] field3310;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "[F")
    private float[] field3237;

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "[S")
    private short[] field3232;

    @OriginalMember(owner = "client!lr", name = "mc", descriptor = "[S")
    private short[] field3317;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "[S")
    private short[] field3236;

    @OriginalMember(owner = "client!lr", name = "fb", descriptor = "[I")
    private int[] field3258;

    @OriginalMember(owner = "client!lr", name = "Eb", descriptor = "[[I")
    private int[][] field3283;

    @OriginalMember(owner = "client!lr", name = "mb", descriptor = "[[I")
    private int[][] field3265;

    @OriginalMember(owner = "client!lr", name = "ac", descriptor = "[[I")
    private int[][] field3305;

    @OriginalMember(owner = "client!lr", name = "bb", descriptor = "[Z")
    public static boolean[] field3254 = new boolean[8];

    @OriginalMember(owner = "client!lr", name = "lb", descriptor = "I")
    public static int field3264 = -1;

    @OriginalMember(owner = "client!lr", name = "wb", descriptor = "I")
    public static int field3275 = 0;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "[I")
    public static int[] field3247 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!lr", name = "sc", descriptor = "B")
    private byte field3323;

    @OriginalMember(owner = "client!lr", name = "ib", descriptor = "F")
    public static float field3261;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!lr", name = "Z", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!lr", name = "ab", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!lr", name = "hb", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lr", name = "nb", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!lr", name = "ub", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!lr", name = "xb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!lr", name = "yb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!lr", name = "zb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!lr", name = "Fb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!lr", name = "Gb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!lr", name = "Hb", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!lr", name = "Jb", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!lr", name = "Lb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!lr", name = "Nb", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!lr", name = "Ob", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!lr", name = "Rb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!lr", name = "Tb", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!lr", name = "Vb", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!lr", name = "Yb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lr", name = "Zb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lr", name = "bc", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!lr", name = "cc", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!lr", name = "dc", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!lr", name = "ec", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!lr", name = "ic", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!lr", name = "jc", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!lr", name = "nc", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!lr", name = "oc", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!lr", name = "qc", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!lr", name = "tc", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!lr", name = "yc", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!lr", name = "pc", descriptor = "Lee;")
    private class159 field3320;

    @OriginalMember(owner = "client!lr", name = "Sb", descriptor = "Lro;")
    private class161 field3297;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "Lnu;")
    private class326 field3246;

    @OriginalMember(owner = "client!lr", name = "eb", descriptor = "S")
    private short field3257;

    @OriginalMember(owner = "client!lr", name = "ob", descriptor = "S")
    private short field3267;

    @OriginalMember(owner = "client!lr", name = "qb", descriptor = "S")
    private short field3269;

    @OriginalMember(owner = "client!lr", name = "Ib", descriptor = "S")
    private short field3287;

    @OriginalMember(owner = "client!lr", name = "Mb", descriptor = "S")
    private short field3291;

    @OriginalMember(owner = "client!lr", name = "Pb", descriptor = "S")
    private short field3294;

    @OriginalMember(owner = "client!lr", name = "rc", descriptor = "S")
    private short field3322;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "()V")
    public final void method1556() {
        field3296++;
        for (int var1 = 0; var1 < this.field3245; var1++) {
            this.field3311[var1] = -this.field3311[var1];
        }
        for (int var2 = 0; var2 < this.field3272; var2++) {
            this.field3317[var2] = (short) (-this.field3317[var2]);
        }
        for (int var3 = 0; var3 < this.field3316; var3++) {
            short var4 = this.field3299[var3];
            this.field3299[var3] = this.field3226[var3];
            this.field3226[var3] = var4;
        }
        if (this.field3282 == null && this.field3271 != null) {
            this.field3271.field1159 = null;
        }
        if (this.field3282 != null) {
            this.field3282.field1159 = null;
        }
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
        if (this.field3256 != null) {
            this.field3256.field7552 = null;
        }
        this.field3326 = false;
    }

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "()I")
    public final int method1557() {
        field3304++;
        return this.field3301;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    private final void method1558(int arg0) {
        field3249++;
        if (!this.field3268) {
            return;
        }
        this.field3268 = false;
        if (this.field3325 == null && this.field3302 == null && this.field3281 == null) {
            if (this.field3255 != null && !class165.method896(this.field3274, true, this.field3263)) {
                if (this.field3328 != null && this.field3328.field1159 == null) {
                    this.field3268 = true;
                } else {
                    if (!this.field3326) {
                        this.method1596((byte) 124);
                    }
                    this.field3255 = null;
                }
            }
            if (this.field3229 != null && !class249.method1527(false, this.field3274, this.field3263)) {
                if (this.field3328 != null && this.field3328.field1159 == null) {
                    this.field3268 = true;
                } else {
                    if (!this.field3326) {
                        this.method1596((byte) 125);
                    }
                    this.field3229 = null;
                }
            }
            if (this.field3311 != null && !class54.method300(this.field3263, this.field3274, (byte) 104)) {
                if (this.field3328 != null && this.field3328.field1159 == null) {
                    this.field3268 = true;
                } else {
                    if (!this.field3326) {
                        this.method1596((byte) -55);
                    }
                    this.field3311 = null;
                }
            }
        }
        if (this.field3223 != null && this.field3255 == null && this.field3229 == null && this.field3311 == null) {
            this.field3280 = null;
            this.field3223 = null;
        }
        if (this.field3270 != null && !class500.method2796(this.field3274, this.field3263, 55)) {
            if (this.field3282 == null) {
                if (this.field3271 != null && this.field3271.field1159 == null) {
                    this.field3268 = true;
                } else {
                    this.field3236 = this.field3315 = this.field3317 = null;
                    this.field3270 = null;
                }
            } else if (this.field3282.field1159 == null) {
                this.field3268 = true;
            } else {
                this.field3270 = null;
                this.field3236 = this.field3315 = this.field3317 = null;
            }
        }
        if (this.field3232 != null && !class535.method2978(this.field3274, this.field3263, false)) {
            if (this.field3271 != null && this.field3271.field1159 == null) {
                this.field3268 = true;
            } else {
                this.field3232 = null;
            }
        }
        if (this.field3220 != null && !class313.method1888(this.field3263, this.field3274, arg0 - 5347)) {
            if (this.field3271 != null && this.field3271.field1159 == null) {
                this.field3268 = true;
            } else {
                this.field3220 = null;
            }
        }
        if (this.field3310 != null && !class157.method855(0, this.field3274, this.field3263)) {
            if (this.field3222 != null && this.field3222.field1159 == null) {
                this.field3268 = true;
            } else {
                this.field3310 = this.field3237 = null;
            }
        }
        if (this.field3244 != null && !class139.method735(true, this.field3263, this.field3274)) {
            if (this.field3271 != null && this.field3271.field1159 == null) {
                this.field3268 = true;
            } else {
                this.field3244 = null;
            }
        }
        if (this.field3299 != null && !class521.method2904(this.field3274, arg0 - 108, this.field3263)) {
            if ((this.field3256 == null || this.field3256.field7552 != null) && (this.field3271 == null || this.field3271.field1159 != null)) {
                this.field3299 = this.field3262 = this.field3226 = null;
            } else {
                this.field3268 = true;
            }
        }
        if (this.field3305 != null && !class4.method12(this.field3274, false, this.field3263)) {
            this.field3305 = null;
            this.field3295 = null;
        }
        if (this.field3283 != null && !class310.method1866(this.field3263, this.field3274, 5170)) {
            this.field3283 = null;
            this.field3224 = null;
        }
        if (this.field3265 != null && !class52.method286(89, this.field3274, this.field3263)) {
            this.field3265 = null;
        }
        if (this.field3258 != null && (this.field3263 & 0x800) == 0 && (this.field3263 & 0x40000) == 0) {
            this.field3258 = null;
        }
        if (arg0 != 0) {
            this.method1587((short) 73, (short) 4);
        }
    }

    @OriginalMember(owner = "client!lr", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final void method1559(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3266++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class495.field6898 = 0;
            class580.field8083 = 0;
            class99.field1328 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3283.length) {
                    int[] var15 = this.field3283[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class99.field1328 += this.field3255[var17];
                        class495.field6898 += this.field3229[var17];
                        class580.field8083 += this.field3311[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class495.field6898 = class495.field6898 / var12 + var10;
                class580.field8083 = class580.field8083 / var12 + var9;
                class99.field1328 = class99.field1328 / var12 + var11;
            } else {
                class495.field6898 = var10;
                class580.field8083 = var9;
                class99.field1328 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field3283.length > var22) {
                    int[] var23 = this.field3283[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3255[var25] += var18;
                        this.field3229[var25] += var20;
                        this.field3311[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field3283.length) {
                    int[] var46 = this.field3283[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3255[var48] -= class99.field1328;
                            this.field3229[var48] -= class495.field6898;
                            this.field3311[var48] -= class580.field8083;
                            if (arg4 != 0) {
                                int var49 = class310.field3966[arg4];
                                int var50 = class310.field3965[arg4];
                                int var51 = this.field3255[var48] * var50 + this.field3229[var48] * var49 + 16383 >> 14;
                                this.field3229[var48] = this.field3229[var48] * var50 + 16383 - this.field3255[var48] * var49 >> 14;
                                this.field3255[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class310.field3966[arg2];
                                int var53 = class310.field3965[arg2];
                                int var54 = this.field3229[var48] * var53 + 16383 - (this.field3311[var48] * var52) >> 14;
                                this.field3311[var48] = this.field3311[var48] * var53 + this.field3229[var48] * var52 + 16383 >> 14;
                                this.field3229[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class310.field3966[arg3];
                                int var56 = class310.field3965[arg3];
                                int var57 = this.field3311[var48] * var55 + this.field3255[var48] * var56 + 16383 >> 14;
                                this.field3311[var48] = this.field3311[var48] * var56 + 16383 - this.field3255[var48] * var55 >> 14;
                                this.field3255[var48] = var57;
                            }
                            this.field3255[var48] += class99.field1328;
                            this.field3229[var48] += class495.field6898;
                            this.field3311[var48] += class580.field8083;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3255[var59] -= class99.field1328;
                            this.field3229[var59] -= class495.field6898;
                            this.field3311[var59] -= class580.field8083;
                            if (arg2 != 0) {
                                int var60 = class310.field3966[arg2];
                                int var61 = class310.field3965[arg2];
                                int var62 = this.field3229[var59] * var61 + 16383 - (this.field3311[var59] * var60) >> 14;
                                this.field3311[var59] = this.field3311[var59] * var61 + this.field3229[var59] * var60 + 16383 >> 14;
                                this.field3229[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class310.field3966[arg4];
                                int var64 = class310.field3965[arg4];
                                int var65 = this.field3255[var59] * var64 + this.field3229[var59] * var63 + 16383 >> 14;
                                this.field3229[var59] = this.field3229[var59] * var64 + 16383 - (this.field3255[var59] * var63) >> 14;
                                this.field3255[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class310.field3966[arg3];
                                int var67 = class310.field3965[arg3];
                                int var68 = this.field3311[var59] * var66 + this.field3255[var59] * var67 + 16383 >> 14;
                                this.field3311[var59] = this.field3311[var59] * var67 + 16383 - (this.field3255[var59] * var66) >> 14;
                                this.field3255[var59] = var68;
                            }
                            this.field3255[var59] += class99.field1328;
                            this.field3229[var59] += class495.field6898;
                            this.field3311[var59] += class580.field8083;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field3283.length > var28) {
                        int[] var29 = this.field3283[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3280[var31];
                            int var33 = this.field3280[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3223[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class310.field3966[arg4];
                                    int var37 = class310.field3965[arg4];
                                    int var38 = this.field3315[var35] * var36 + (this.field3236[var35] * var37) + 16383 >> 14;
                                    this.field3315[var35] = (short) (this.field3315[var35] * var37 + 16383 - (this.field3236[var35] * var36) >> 14);
                                    this.field3236[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class310.field3966[arg2];
                                    int var40 = class310.field3965[arg2];
                                    int var41 = this.field3315[var35] * var40 + 16383 - (this.field3317[var35] * var39) >> 14;
                                    this.field3317[var35] = (short) (this.field3317[var35] * var40 + (this.field3315[var35] * var39 + 16383) >> 14);
                                    this.field3315[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class310.field3966[arg3];
                                    int var43 = class310.field3965[arg3];
                                    int var44 = this.field3236[var35] * var43 + this.field3317[var35] * var42 + 16383 >> 14;
                                    this.field3317[var35] = (short) (this.field3317[var35] * var43 + 16383 - (this.field3236[var35] * var42) >> 14);
                                    this.field3236[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3282 == null && this.field3271 != null) {
                    this.field3271.field1159 = null;
                }
                if (this.field3282 != null) {
                    this.field3282.field1159 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field3283.length) {
                    int[] var71 = this.field3283[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3255[var73] -= class99.field1328;
                        this.field3229[var73] -= class495.field6898;
                        this.field3311[var73] -= class580.field8083;
                        this.field3255[var73] = this.field3255[var73] * arg2 >> 7;
                        this.field3229[var73] = this.field3229[var73] * arg3 >> 7;
                        this.field3311[var73] = this.field3311[var73] * arg4 >> 7;
                        this.field3255[var73] += class99.field1328;
                        this.field3229[var73] += class495.field6898;
                        this.field3311[var73] += class580.field8083;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3305 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field3305.length) {
                        int[] var79 = this.field3305[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3220[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3220[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3271 != null) {
                            this.field3271.field1159 = null;
                        }
                    }
                }
                if (this.field3281 != null) {
                    for (int var75 = 0; var75 < this.field3312; var75++) {
                        class365 var76 = this.field3281[var75];
                        class222 var77 = this.field3289[var75];
                        var77.field2847 = 255 - (this.field3220[var76.field5094] & 0xFF) << 24 | var77.field2847 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3305 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field3305.length) {
                        int[] var88 = this.field3305[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3232[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = arg2 + var92 & 0x3F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var95;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3232[var90] = (short) class292.method1790(var97, class292.method1790(var96 << 10, var94 << 7));
                        }
                        if (var88.length > 0 && this.field3271 != null) {
                            this.field3271.field1159 = null;
                        }
                    }
                }
                if (this.field3281 != null) {
                    for (int var84 = 0; var84 < this.field3312; var84++) {
                        class365 var85 = this.field3281[var84];
                        class222 var86 = this.field3289[var84];
                        var86.field2847 = class190.field2453[this.field3232[var85.field5094] & 0xFFFF] & 0xFFFFFF | var86.field2847 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3265 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field3265.length > var99) {
                        int[] var100 = this.field3265[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class222 var102 = this.field3289[var100[var101]];
                            var102.field2855 += arg2;
                            var102.field2851 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3265 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field3265.length) {
                        int[] var105 = this.field3265[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class222 var107 = this.field3289[var105[var106]];
                            var107.field2852 = var107.field2852 * arg3 >> 7;
                            var107.field2850 = var107.field2850 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3265 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field3265.length) {
                    int[] var110 = this.field3265[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class222 var112 = this.field3289[var110[var111]];
                        var112.field2853 = var112.field2853 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "MA", descriptor = "()V")
    public final void method1560() {
        field3285++;
        for (int var1 = 0; var1 < this.field3327; var1++) {
            this.field3255[var1] = this.field3255[var1] + 7 >> 4;
            this.field3229[var1] = this.field3229[var1] + 7 >> 4;
            this.field3311[var1] = this.field3311[var1] + 7 >> 4;
        }
        this.field3326 = false;
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "wa", descriptor = "()I")
    public final int method1561() {
        if (!this.field3326) {
            this.method1596((byte) 12);
        }
        field3314++;
        return this.field3322;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lm;Leca;II)V")
    public final void method1562(class105 arg0, class378 arg1, int arg2, int arg3) {
        field3241++;
        if (this.field3272 == 0) {
            return;
        }
        class404 var5 = this.field3221.field4323;
        class404 var6 = (class404) arg0;
        if (!this.field3326) {
            this.method1596((byte) 125);
        }
        class298.field3902 = var5.field5521 * var6.field5546 + var5.field5538 * var6.field5544 + var5.field5533 * var6.field5529 + var5.field5546;
        class546.field7620 = var5.field5521 * var6.field5538 + var5.field5538 * var6.field5536 + var5.field5533 * var6.field5526;
        float var7 = (float) this.field3294 * class546.field7620 + class298.field3902;
        float var8 = (float) this.field3257 * class546.field7620 + class298.field3902;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) this.field3287 + var7;
            var9 = var8 - (float) this.field3287;
        } else {
            var9 = var7 - (float) this.field3287;
            var10 = (float) this.field3287 + var8;
        }
        if ((var9 >= this.field3221.field4331) || (var10 <= (float) this.field3221.field4294)) {
            return;
        }
        class596.field8589 = var5.field5556 * var6.field5538 + var5.field5540 * var6.field5526 + var5.field5526 * var6.field5536;
        class500.field6943 = var5.field5556 * var6.field5546 + var5.field5540 * var6.field5529 + var5.field5526 * var6.field5544 + var5.field5529;
        float var11 = (float) this.field3294 * class596.field8589 + class500.field6943;
        float var12 = (float) this.field3257 * class596.field8589 + class500.field6943;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field3287 + var11) * (float) this.field3221.field4335;
            var14 = (var12 - (float) this.field3287) * (float) this.field3221.field4335;
        } else {
            var13 = ((float) this.field3287 + var12) * (float) this.field3221.field4335;
            var14 = (var11 - (float) this.field3287) * (float) this.field3221.field4335;
        }
        if ((this.field3221.field4310 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field3221.field4325)) {
            return;
        }
        class419.field5728 = var5.field5537 * var6.field5546 + var5.field5548 * var6.field5529 + var5.field5536 * var6.field5544 + var5.field5544;
        class612.field8798 = var5.field5537 * var6.field5538 + var5.field5548 * var6.field5526 + var5.field5536 * var6.field5536;
        float var15 = (float) this.field3294 * class612.field8798 + class419.field5728;
        float var16 = (float) this.field3257 * class612.field8798 + class419.field5728;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var17 = ((float) this.field3287 + var15) * (float) this.field3221.field4318;
            var18 = ((float) (-this.field3287) + var16) * (float) this.field3221.field4318;
        } else {
            var17 = ((float) this.field3287 + var16) * (float) this.field3221.field4318;
            var18 = ((float) (-this.field3287) + var15) * (float) this.field3221.field4318;
        }
        if ((var18 / (float) arg2 >= this.field3221.field4324) || (var17 / (float) arg2 <= this.field3221.field4233)) {
            return;
        }
        if (arg1 != null || this.field3281 != null) {
            class453.field6409 = var5.field5556 * var6.field5521 + var5.field5540 * var6.field5556 + var5.field5526 * var6.field5537;
            class365.field5106 = var5.field5537 * var6.field5521 + var5.field5548 * var6.field5556 + var5.field5536 * var6.field5537;
            class540.field7555 = var5.field5521 * var6.field5533 + var5.field5538 * var6.field5548 + var5.field5533 * var6.field5540;
            class244.field3088 = var5.field5556 * var6.field5533 + var5.field5540 * var6.field5540 + var5.field5526 * var6.field5548;
            class520.field7242 = var5.field5521 * var6.field5521 + var5.field5538 * var6.field5537 + var5.field5533 * var6.field5556;
            class170.field2164 = var5.field5537 * var6.field5533 + var5.field5548 * var6.field5540 + var5.field5536 * var6.field5548;
        }
        if (arg1 != null) {
            int var19 = this.field3322 + this.field3269 >> 1;
            int var20 = this.field3291 + this.field3267 >> 1;
            int var21 = (int) ((float) var20 * class453.field6409 + (float) this.field3294 * class596.field8589 + (float) var19 * class244.field3088 + class500.field6943);
            int var22 = (int) ((float) var20 * class365.field5106 + (float) this.field3294 * class612.field8798 + (float) var19 * class170.field2164 + class419.field5728);
            int var23 = (int) ((float) var20 * class520.field7242 + (float) this.field3294 * class546.field7620 + (float) var19 * class540.field7555 + class298.field3902);
            int var24 = (int) ((float) var20 * class453.field6409 + (float) this.field3257 * class596.field8589 + (float) var19 * class244.field3088 + class500.field6943);
            int var25 = (int) ((float) var20 * class365.field5106 + (float) this.field3257 * class612.field8798 + (float) var19 * class170.field2164 + class419.field5728);
            arg1.field5291 = this.field3221.field4318 * var22 / arg2 + this.field3221.field4225;
            int var26 = (int) ((float) var20 * class520.field7242 + (float) this.field3257 * class546.field7620 + (float) var19 * class540.field7555 + class298.field3902);
            arg1.field5293 = this.field3221.field4318 * var25 / arg2 + this.field3221.field4225;
            arg1.field5290 = this.field3221.field4256 + (this.field3221.field4335 * var21 / arg2);
            arg1.field5292 = this.field3221.field4335 * var24 / arg2 + this.field3221.field4256;
            if (var23 < this.field3221.field4294 && var26 < this.field3221.field4294) {
                arg1.field5294 = true;
                arg1.field5289 = (var21 + this.field3287) * this.field3221.field4335 / arg2 + this.field3221.field4256 - arg1.field5290;
            }
        }
        this.field3221.method1907(-4, (float) arg2);
        this.field3221.method1952((byte) -123);
        this.field3221.method1961(var6, 17791);
        this.method1571(false);
        this.field3221.method1942(82);
        this.method1572(65411);
    }

    @OriginalMember(owner = "client!lr", name = "va", descriptor = "()I")
    public final int method1563() {
        field3293++;
        if (!this.field3326) {
            this.method1596((byte) 125);
        }
        return this.field3269;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
    private final void method1564(boolean arg0, int arg1) {
        field3303++;
        if (this.field3221.field4285.field7693.length < this.field3279 * 6) {
            this.field3221.field4285 = new class616(this.field3279 * 6 + 600);
        } else {
            this.field3221.field4285.field7707 = 0;
        }
        class616 var3 = this.field3221.field4285;
        if (this.field3221.field4291) {
            for (int var5 = 0; var5 < this.field3279; var5++) {
                var3.method3042(this.field3299[var5], 120);
                var3.method3042(this.field3262[var5], arg1 - 1147);
                var3.method3042(this.field3226[var5], -90);
            }
        } else {
            for (int var4 = 0; var4 < this.field3279; var4++) {
                var3.method3094(true, this.field3299[var4]);
                var3.method3094(true, this.field3262[var4]);
                var3.method3094(true, this.field3226[var4]);
            }
        }
        if (arg1 != 1024) {
            this.field3302 = null;
        }
        if (var3.field7707 == 0) {
            return;
        }
        if (arg0) {
            if (this.field3246 == null) {
                this.field3246 = this.field3221.method1935(false, var3.field7693, var3.field7707, true, 5123);
            } else {
                this.field3246.method173((byte) -122, var3.field7693, 5123, var3.field7707);
            }
            this.field3256.field7552 = this.field3246;
        } else {
            this.field3256.field7552 = this.field3221.method1935(false, var3.field7693, var3.field7707, false, 5123);
        }
        if (!arg0) {
            this.field3268 = true;
        }
    }

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "()I")
    public final int method1565() {
        if (!this.field3326) {
            this.method1596((byte) -4);
        }
        field3230++;
        return this.field3291;
    }

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "(III)V")
    public final void method1566(int arg0, int arg1, int arg2) {
        field3306++;
        for (int var4 = 0; var4 < this.field3245; var4++) {
            if (arg0 != 128) {
                this.field3255[var4] = this.field3255[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3229[var4] = this.field3229[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3311[var4] = this.field3311[var4] * arg2 >> 7;
            }
        }
        this.field3326 = false;
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "OA", descriptor = "(I)V")
    public final void method1567(int arg0) {
        field3260++;
        int var2 = class310.field3966[arg0];
        int var3 = class310.field3965[arg0];
        for (int var4 = 0; var4 < this.field3245; var4++) {
            int var5 = this.field3311[var4] * var2 + this.field3255[var4] * var3 >> 14;
            this.field3311[var4] = this.field3311[var4] * var3 - (this.field3255[var4] * var2) >> 14;
            this.field3255[var4] = var5;
        }
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
        this.field3326 = false;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3319++;
        int var10 = 91 / ((-arg3 - 26) / 34);
        if (arg2 > arg5 && arg7 > arg5 && arg8 > arg5) {
            return false;
        } else if (arg2 < arg5 && arg7 < arg5 && arg5 > arg8) {
            return false;
        } else if (arg1 > arg0 && arg0 < arg4 && arg6 > arg0) {
            return false;
        } else {
            return arg1 >= arg0 || arg4 >= arg0 || arg0 <= arg6;
        }
    }

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "(I)V")
    public final void method1569(int arg0) {
        field3324++;
        int var2 = class310.field3966[arg0];
        int var3 = class310.field3965[arg0];
        for (int var4 = 0; var4 < this.field3245; var4++) {
            int var7 = this.field3311[var4] * var2 + this.field3255[var4] * var3 >> 14;
            this.field3311[var4] = this.field3311[var4] * var3 - (this.field3255[var4] * var2) >> 14;
            this.field3255[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3272; var5++) {
            int var6 = this.field3317[var5] * var2 + (this.field3236[var5] * var3) >> 14;
            this.field3317[var5] = (short) (this.field3317[var5] * var3 - (this.field3236[var5] * var2) >> 14);
            this.field3236[var5] = (short) var6;
        }
        if (this.field3282 == null && this.field3271 != null) {
            this.field3271.field1159 = null;
        }
        if (this.field3282 != null) {
            this.field3282.field1159 = null;
        }
        this.field3326 = false;
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final void method1570(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3242++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class495.field6898 = 0;
            class580.field8083 = 0;
            int var13 = 0;
            class99.field1328 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field3283.length > var15) {
                    int[] var16 = this.field3283[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3224 == null || (this.field3224[var18] & arg6) != 0) {
                            class99.field1328 += this.field3255[var18];
                            class495.field6898 += this.field3229[var18];
                            class580.field8083 += this.field3311[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class580.field8083 = class580.field8083 / var13 + var12;
                class99.field1328 = class99.field1328 / var13 + var10;
                class168.field2121 = true;
                class495.field6898 = class495.field6898 / var13 + var11;
            } else {
                class99.field1328 = var10;
                class580.field8083 = var12;
                class495.field6898 = var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + 8192 - (-(arg7[4] * arg3) - arg7[5] * arg4) >> 14;
                int var21 = arg7[8] * arg4 + (arg7[6] * arg2 - (-(arg7[7] * arg3) - 8192)) >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field3283.length > var26) {
                    int[] var27 = this.field3283[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3224 == null || (arg6 & this.field3224[var29]) != 0) {
                            this.field3255[var29] += var23;
                            this.field3229[var29] += var22;
                            this.field3311[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field3283.length) {
                        int[] var110 = this.field3283[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field3224 == null || (arg6 & this.field3224[var112]) != 0) {
                                this.field3255[var112] -= class99.field1328;
                                this.field3229[var112] -= class495.field6898;
                                this.field3311[var112] -= class580.field8083;
                                if (arg4 != 0) {
                                    int var113 = class310.field3966[arg4];
                                    int var114 = class310.field3965[arg4];
                                    int var115 = this.field3255[var112] * var114 + this.field3229[var112] * var113 + 16383 >> 14;
                                    this.field3229[var112] = this.field3229[var112] * var114 + 16383 - (this.field3255[var112] * var113) >> 14;
                                    this.field3255[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class310.field3966[arg2];
                                    int var117 = class310.field3965[arg2];
                                    int var118 = this.field3229[var112] * var117 + 16383 - (this.field3311[var112] * var116) >> 14;
                                    this.field3311[var112] = this.field3229[var112] * var116 + this.field3311[var112] * var117 + 16383 >> 14;
                                    this.field3229[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class310.field3966[arg3];
                                    int var120 = class310.field3965[arg3];
                                    int var121 = this.field3311[var112] * var119 + this.field3255[var112] * var120 + 16383 >> 14;
                                    this.field3311[var112] = this.field3311[var112] * var120 + 16383 - this.field3255[var112] * var119 >> 14;
                                    this.field3255[var112] = var121;
                                }
                                this.field3255[var112] += class99.field1328;
                                this.field3229[var112] += class495.field6898;
                                this.field3311[var112] += class580.field8083;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field3283.length > var92) {
                            int[] var93 = this.field3283[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field3224 == null || (this.field3224[var95] & arg6) != 0) {
                                    int var96 = this.field3280[var95];
                                    int var97 = this.field3280[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field3223[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class310.field3966[arg4];
                                            int var101 = class310.field3965[arg4];
                                            int var102 = this.field3315[var99] * var100 + this.field3236[var99] * var101 + 16383 >> 14;
                                            this.field3315[var99] = (short) (this.field3315[var99] * var101 + 16383 - (this.field3236[var99] * var100) >> 14);
                                            this.field3236[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class310.field3966[arg2];
                                            int var104 = class310.field3965[arg2];
                                            int var105 = this.field3315[var99] * var104 + 16383 - (this.field3317[var99] * var103) >> 14;
                                            this.field3317[var99] = (short) (this.field3317[var99] * var104 + this.field3315[var99] * var103 + 16383 >> 14);
                                            this.field3315[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class310.field3966[arg3];
                                            int var107 = class310.field3965[arg3];
                                            int var108 = this.field3317[var99] * var106 + (this.field3236[var99] * var107) + 16383 >> 14;
                                            this.field3317[var99] = (short) (this.field3317[var99] * var107 + (16383 - (this.field3236[var99] * var106)) >> 14);
                                            this.field3236[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3282 == null && this.field3271 != null) {
                        this.field3271.field1159 = null;
                    }
                    if (this.field3282 != null) {
                        this.field3282.field1159 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class168.field2121) {
                    int var36 = arg7[6] * class580.field8083 + arg7[0] * class99.field1328 + (arg7[3] * class495.field6898) + 8192 >> 14;
                    int var37 = arg7[4] * class495.field6898 + arg7[7] * class580.field8083 + arg7[1] * class99.field1328 + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[8] * class580.field8083 + arg7[2] * class99.field1328 + arg7[5] * class495.field6898 + 8192 >> 14;
                    int var41 = var35 + var40;
                    class99.field1328 = var38;
                    class495.field6898 = var39;
                    class580.field8083 = var41;
                    class168.field2121 = false;
                }
                int[] var42 = new int[9];
                int var43 = class310.field3965[arg2];
                int var44 = class310.field3966[arg2];
                int var45 = class310.field3965[arg3];
                int var46 = class310.field3966[arg3];
                int var47 = class310.field3965[arg4];
                int var48 = class310.field3966[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[7] = var46 * var48 + (var45 * var49) + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[0] = var46 * var50 + var45 * var47 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[5] = -var44;
                int var51 = var42[0] * -class99.field1328 + (var42[1] * -class495.field6898) + var42[2] * -class580.field8083 + 8192 >> 14;
                int var52 = var42[3] * -class99.field1328 + (var42[4] * -class495.field6898) - (-(var42[5] * -class580.field8083) - 8192) >> 14;
                int var53 = var42[8] * -class580.field8083 + (var42[6] * -class99.field1328 + (var42[7] * -class495.field6898)) + 8192 >> 14;
                int var54 = class99.field1328 + var51;
                int var55 = var52 + class495.field6898;
                int var56 = class580.field8083 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += arg7[var87 * 3 + var89] * var42[var58 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[1] * var34 + var42[0] * var33 + var42[2] * var35 + 8192 >> 14;
                int var60 = var42[5] * var35 + var42[4] * var34 + var42[3] * var33 + 8192 >> 14;
                int var61 = var42[6] * var33 + var42[7] * var34 + (var42[8] * var35) + 8192 >> 14;
                int var62 = var54 + var59;
                int var63 = var55 + var60;
                int var64 = var56 + var61;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var63 + (arg7[0] * var62 + (arg7[2] * var64) + 8192) >> 14;
                int var68 = arg7[5] * var64 + arg7[3] * var62 + arg7[4] * var63 + 8192 >> 14;
                int var69 = var31 + var68;
                int var70 = arg7[6] * var62 + arg7[7] * var63 + (arg7[8] * var64) + 8192 >> 14;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field3283.length) {
                        int[] var75 = this.field3283[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field3224 == null || (this.field3224[var77] & arg6) != 0) {
                                int var78 = this.field3311[var77] * var65[2] + this.field3229[var77] * var65[1] + this.field3255[var77] * var65[0] + 8192 >> 14;
                                int var79 = this.field3255[var77] * var65[3] + 8192 - (-(this.field3311[var77] * var65[5]) - (this.field3229[var77] * var65[4])) >> 14;
                                int var80 = var69 + var79;
                                int var81 = var71 + var78;
                                int var82 = this.field3311[var77] * var65[8] + this.field3255[var77] * var65[6] + (this.field3229[var77] * var65[7]) + 8192 >> 14;
                                int var83 = var72 + var82;
                                this.field3255[var77] = var81;
                                this.field3229[var77] = var80;
                                this.field3311[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field3283.length > var123) {
                        int[] var124 = this.field3283[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field3224 == null || (this.field3224[var126] & arg6) != 0) {
                                this.field3255[var126] -= class99.field1328;
                                this.field3229[var126] -= class495.field6898;
                                this.field3311[var126] -= class580.field8083;
                                this.field3255[var126] = this.field3255[var126] * arg2 >> 7;
                                this.field3229[var126] = this.field3229[var126] * arg3 >> 7;
                                this.field3311[var126] = this.field3311[var126] * arg4 >> 7;
                                this.field3255[var126] += class99.field1328;
                                this.field3229[var126] += class495.field6898;
                                this.field3311[var126] += class580.field8083;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class168.field2121) {
                    int var133 = arg7[3] * class495.field6898 + arg7[0] * class99.field1328 + arg7[6] * class580.field8083 + 8192 >> 14;
                    int var134 = arg7[7] * class580.field8083 + arg7[4] * class495.field6898 + arg7[1] * class99.field1328 + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[2] * class99.field1328 + arg7[8] * class580.field8083 + arg7[5] * class495.field6898 + 8192 >> 14;
                    int var137 = var131 + var134;
                    class495.field6898 = var137;
                    class99.field1328 = var135;
                    int var138 = var132 + var136;
                    class580.field8083 = var138;
                    class168.field2121 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class99.field1328 * var139 + 8192 >> 14;
                int var143 = -class495.field6898 * var140 + 8192 >> 14;
                int var144 = -class580.field8083 * var141 + 8192 >> 14;
                int var145 = var142 + class99.field1328;
                int var146 = var143 + class495.field6898;
                int var147 = class580.field8083 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[1] * var152 + arg7[0] * var151 + (arg7[2] * var154 - -8192) >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var151 + arg7[4] * var152 + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[6] * var151 - (-(arg7[7] * var152) - arg7[8] * var154 - 8192) >> 14;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field3283.length > var164) {
                        int[] var165 = this.field3283[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field3224 == null || (arg6 & this.field3224[var167]) != 0) {
                                int var168 = this.field3255[var167] * var155[0] + this.field3229[var167] * var155[1] + (this.field3311[var167] * var155[2]) + 8192 >> 14;
                                int var169 = this.field3311[var167] * var155[5] + this.field3255[var167] * var155[3] + this.field3229[var167] * var155[4] + 8192 >> 14;
                                int var170 = var160 + var169;
                                int var171 = this.field3255[var167] * var155[6] + this.field3311[var167] * var155[8] + this.field3229[var167] * var155[7] + 8192 >> 14;
                                int var172 = var159 + var168;
                                int var173 = var162 + var171;
                                this.field3255[var167] = var172;
                                this.field3229[var167] = var170;
                                this.field3311[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3305 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field3305.length) {
                        int[] var182 = this.field3305[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3295 == null || (this.field3295[var184] & arg6) != 0) {
                                int var185 = (this.field3220[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3220[var184] = (byte) var185;
                                if (this.field3271 != null) {
                                    this.field3271.field1159 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3281 != null) {
                    for (int var178 = 0; var178 < this.field3312; var178++) {
                        class365 var179 = this.field3281[var178];
                        class222 var180 = this.field3289[var178];
                        var180.field2847 = 255 - (this.field3220[var179.field5094] & 0xFF) << 24 | var180.field2847 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3305 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field3305.length > var190) {
                        int[] var191 = this.field3305[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3295 == null || (arg6 & this.field3295[var193]) != 0) {
                                int var194 = this.field3232[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = arg2 + var195 & 0x3F;
                                int var200 = arg4 + var197;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field3232[var193] = (short) class292.method1790(class292.method1790(var198 << 7, var199 << 10), var200);
                                if (this.field3271 != null) {
                                    this.field3271.field1159 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3281 != null) {
                    for (int var187 = 0; var187 < this.field3312; var187++) {
                        class365 var188 = this.field3281[var187];
                        class222 var189 = this.field3289[var187];
                        var189.field2847 = var189.field2847 & 0xFF000000 | class190.field2453[this.field3232[var188.field5094] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3265 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field3265.length) {
                        int[] var203 = this.field3265[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class222 var205 = this.field3289[var203[var204]];
                            var205.field2855 += arg2;
                            var205.field2851 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3265 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field3265.length) {
                        int[] var208 = this.field3265[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class222 var210 = this.field3289[var208[var209]];
                            var210.field2852 = var210.field2852 * arg3 >> 7;
                            var210.field2850 = var210.field2850 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3265 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field3265.length) {
                    int[] var213 = this.field3265[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class222 var215 = this.field3289[var213[var214]];
                        var215.field2853 = var215.field2853 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
    private final void method1571(boolean arg0) {
        field3308++;
        if (this.field3279 == 0) {
            return;
        }
        if (this.field3323 != 0) {
            this.method1591(true, true);
        }
        this.method1591(arg0, !arg0);
        if (this.field3256 != null) {
            if (this.field3256.field7552 == null) {
                this.method1564((this.field3323 & 0x10) != 0, 1024);
            }
            if (this.field3256.field7552 != null) {
                this.field3221.method1930((byte) -121, this.field3282 != null);
                this.field3221.method1924(this.field3222, 0, this.field3328, this.field3282, this.field3271);
                int var2 = this.field3258.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3258[var3];
                    int var5 = this.field3258[var3 + 1];
                    int var6 = this.field3244[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3221.method1913(var6, (byte) -65, this.field3282 != null);
                    this.field3221.method1923((var5 - var4) * 3, -66, 4, this.field3256.field7552, var4 * 3);
                }
            }
        }
        this.method1558(0);
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
    private final void method1572(int arg0) {
        if (arg0 != 65411) {
            field3275 = 108;
        }
        if (this.field3281 != null) {
            class404 var2 = this.field3221.field4197;
            float var3 = this.field3221.method1897();
            float var4 = this.field3221.method1946();
            this.field3221.method1914(false);
            this.field3221.method983(false);
            this.field3221.method1930((byte) -92, false);
            this.field3221.method1924(this.field3221.field4340, 0, this.field3221.field4257, null, null);
            for (int var5 = 0; var5 < this.field3312; var5++) {
                class365 var6 = this.field3281[var5];
                class222 var7 = this.field3289[var5];
                if (!var6.field5102 || !this.field3221.method912()) {
                    float var8 = (float) (this.field3255[var6.field5098] + this.field3255[var6.field5097] + this.field3255[var6.field5101]) * 0.3333333F;
                    float var9 = (float) (this.field3229[var6.field5101] + this.field3229[var6.field5097] + this.field3229[var6.field5098]) * 0.3333333F;
                    float var10 = (float) (this.field3311[var6.field5098] + this.field3311[var6.field5097] + this.field3311[var6.field5101]) * 0.3333333F;
                    float var11 = class453.field6409 * var10 + class596.field8589 * var9 + class244.field3088 * var8 + class500.field6943;
                    float var12 = class365.field5106 * var10 + class612.field8798 * var9 + class170.field2164 * var8 + class419.field5728;
                    float var13 = class520.field7242 * var10 + class546.field7620 * var9 + class540.field7555 * var8 + class298.field3902;
                    var2.method2414(var6.field5104 * var7.field2852 >> 7, (float) var7.field2855 + var11, var6.field5103 * var7.field2850 >> 7, var7.field2853, -var13, (byte) -108, (float) var7.field2851 - var12);
                    this.field3221.method1896(0, var2);
                    this.field3221.method926(var4, var3 - ((float) var6.field5095 * 1.5F));
                    int var14 = var7.field2847;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field3221.method1960(var6.field5105, 2);
                    this.field3221.method1905(arg0 - 62369, var6.field5099);
                    this.field3221.method1909(-117, var6.field5107);
                    this.field3221.method1964(4, 0, (byte) 101, 7);
                }
            }
            this.field3221.method926(var4, var3);
            this.field3221.method983(true);
            this.field3221.method1942(65);
        }
        field3233++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lr;IIIZ)V")
    public final void method1573(class521 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3307++;
        class261 var6 = (class261) arg0;
        if (this.field3316 == 0 || var6.field3316 == 0) {
            return;
        }
        int var7 = var6.field3245;
        int[] var8 = var6.field3255;
        int[] var9 = var6.field3229;
        int[] var10 = var6.field3311;
        short[] var11 = var6.field3236;
        short[] var12 = var6.field3315;
        short[] var13 = var6.field3317;
        byte[] var14 = var6.field3270;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field3297 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field3297.field2053;
            var16 = this.field3297.field2050;
            var17 = this.field3297.field2052;
            var15 = this.field3297.field2055;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3297 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field3297.field2053;
            var20 = var6.field3297.field2050;
            var21 = var6.field3297.field2052;
            var22 = var6.field3297.field2055;
        }
        int[] var23 = var6.field3280;
        short[] var24 = var6.field3223;
        if (!var6.field3326) {
            var6.method1596((byte) 114);
        }
        short var25 = var6.field3294;
        short var26 = var6.field3257;
        short var27 = var6.field3322;
        short var28 = var6.field3269;
        short var29 = var6.field3291;
        short var30 = var6.field3267;
        for (int var31 = 0; var31 < this.field3245; var31++) {
            int var32 = this.field3229[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3255[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field3311[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3280[var31];
                        int var37 = this.field3280[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3223[var38] - 1;
                            if (var35 == -1 || this.field3270[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var17 == null) {
                                            this.field3297 = new class161();
                                            var17 = this.field3297.field2052 = class28.method167(this.field3236, (byte) 112);
                                            var15 = this.field3297.field2055 = class28.method167(this.field3315, (byte) -106);
                                            var18 = this.field3297.field2053 = class28.method167(this.field3317, (byte) 81);
                                            var16 = this.field3297.field2050 = class536.method2984(this.field3270, 0);
                                        }
                                        if (var21 == null) {
                                            class161 var44 = var6.field3297 = new class161();
                                            var21 = var44.field2052 = class28.method167(var11, (byte) -110);
                                            var22 = var44.field2055 = class28.method167(var12, (byte) -124);
                                            var19 = var44.field2053 = class28.method167(var13, (byte) -124);
                                            var20 = var44.field2050 = class536.method2984(var14, 0);
                                        }
                                        short var45 = this.field3236[var35];
                                        short var46 = this.field3315[var35];
                                        short var47 = this.field3317[var35];
                                        byte var48 = this.field3270[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var19[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        byte var54 = var14[var40];
                                        int var55 = this.field3280[var31];
                                        short var56 = var12[var40];
                                        int var57 = this.field3280[var31 + 1];
                                        short var58 = var13[var40];
                                        for (int var59 = var55; var59 < var57; var59++) {
                                            int var60 = this.field3223[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var17[var60] += var53;
                                                var15[var60] += var56;
                                                var18[var60] += var58;
                                                var16[var60] += var54;
                                            }
                                        }
                                        if (this.field3282 == null && this.field3271 != null) {
                                            this.field3271.field1159 = null;
                                        }
                                        if (this.field3282 != null) {
                                            this.field3282.field1159 = null;
                                        }
                                        if (var6.field3282 == null && var6.field3271 != null) {
                                            var6.field3271.field1159 = null;
                                        }
                                        if (var6.field3282 != null) {
                                            var6.field3282.field1159 = null;
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

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public final void method1574(int arg0) {
        field3235++;
        int var2 = class310.field3966[arg0];
        int var3 = class310.field3965[arg0];
        for (int var4 = 0; var4 < this.field3245; var4++) {
            int var5 = this.field3255[var4] * var3 + this.field3229[var4] * var2 >> 14;
            this.field3229[var4] = this.field3229[var4] * var3 - (this.field3255[var4] * var2) >> 14;
            this.field3255[var4] = var5;
        }
        this.field3326 = false;
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZILlr;Llr;I)Lr;")
    private final class521 method1575(boolean arg0, boolean arg1, int arg2, class261 arg3, class261 arg4, int arg5) {
        arg4.field3279 = this.field3279;
        arg4.field3274 = this.field3274;
        arg4.field3312 = this.field3312;
        arg4.field3316 = this.field3316;
        arg4.field3327 = this.field3327;
        field3290++;
        arg4.field3259 = this.field3259;
        arg4.field3301 = this.field3301;
        arg4.field3263 = arg2;
        arg4.field3272 = this.field3272;
        arg4.field3323 = 0;
        arg4.field3245 = this.field3245;
        boolean var7 = class202.method1294(115, arg2, this.field3274);
        boolean var8 = class111.method599(true, this.field3274, arg2);
        boolean var9 = class53.method293(arg2, true, this.field3274);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg4.field3255 = this.field3255;
            } else if (arg3.field3255 == null || arg3.field3255.length < this.field3327) {
                arg4.field3255 = arg3.field3255 = new int[this.field3327];
            } else {
                arg4.field3255 = arg3.field3255;
            }
            if (!var8) {
                arg4.field3229 = this.field3229;
            } else if (arg3.field3229 == null || arg3.field3229.length < this.field3327) {
                arg4.field3229 = arg3.field3229 = new int[this.field3327];
            } else {
                arg4.field3229 = arg3.field3229;
            }
            if (!var9) {
                arg4.field3311 = this.field3311;
            } else if (arg3.field3311 == null || this.field3327 > arg3.field3311.length) {
                arg4.field3311 = arg3.field3311 = new int[this.field3327];
            } else {
                arg4.field3311 = arg3.field3311;
            }
            for (int var11 = 0; var11 < this.field3327; var11++) {
                if (var7) {
                    arg4.field3255[var11] = this.field3255[var11];
                }
                if (var8) {
                    arg4.field3229[var11] = this.field3229[var11];
                }
                if (var9) {
                    arg4.field3311[var11] = this.field3311[var11];
                }
            }
        } else {
            arg4.field3255 = this.field3255;
            arg4.field3311 = this.field3311;
            arg4.field3229 = this.field3229;
        }
        if (class313.method1969(this.field3274, (byte) 114, arg2)) {
            arg4.field3328 = arg3.field3328;
            if (arg0) {
                arg4.field3323 = (byte) (arg4.field3323 | 0x1);
            }
            arg4.field3328.field1159 = this.field3328.field1159;
            arg4.field3328.field1157 = this.field3328.field1157;
        } else if (class579.method3255((byte) -76, this.field3274, arg2)) {
            arg4.field3328 = this.field3328;
        } else {
            arg4.field3328 = null;
        }
        if (class265.method1634((byte) -128, arg2, this.field3274)) {
            if (arg3.field3232 == null || this.field3316 > arg3.field3232.length) {
                arg4.field3232 = arg3.field3232 = new short[this.field3316];
            } else {
                arg4.field3232 = arg3.field3232;
            }
            for (int var12 = 0; var12 < this.field3316; var12++) {
                arg4.field3232[var12] = this.field3232[var12];
            }
        } else {
            arg4.field3232 = this.field3232;
        }
        if (class430.method2513(arg2, -61, this.field3274)) {
            if (arg3.field3220 == null || arg3.field3220.length < this.field3316) {
                arg4.field3220 = arg3.field3220 = new byte[this.field3316];
            } else {
                arg4.field3220 = arg3.field3220;
            }
            for (int var13 = 0; var13 < this.field3316; var13++) {
                arg4.field3220[var13] = this.field3220[var13];
            }
        } else {
            arg4.field3220 = this.field3220;
        }
        if (class105.method578(this.field3274, true, arg2)) {
            arg4.field3271 = arg3.field3271;
            if (arg0) {
                arg4.field3323 = (byte) (arg4.field3323 | 0x2);
            }
            arg4.field3271.field1157 = this.field3271.field1157;
            arg4.field3271.field1159 = this.field3271.field1159;
        } else if (class179.method1104(this.field3274, arg2, -1)) {
            arg4.field3271 = this.field3271;
        } else {
            arg4.field3271 = null;
        }
        if (class359.method2229(this.field3274, (byte) -84, arg2)) {
            if (arg3.field3236 == null || this.field3272 > arg3.field3236.length) {
                int var14 = this.field3272;
                arg4.field3317 = arg3.field3317 = new short[var14];
                arg4.field3236 = arg3.field3236 = new short[var14];
                arg4.field3315 = arg3.field3315 = new short[var14];
            } else {
                arg4.field3315 = arg3.field3315;
                arg4.field3236 = arg3.field3236;
                arg4.field3317 = arg3.field3317;
            }
            if (this.field3297 == null) {
                for (int var18 = 0; var18 < this.field3272; var18++) {
                    arg4.field3236[var18] = this.field3236[var18];
                    arg4.field3315[var18] = this.field3315[var18];
                    arg4.field3317[var18] = this.field3317[var18];
                }
            } else {
                if (arg3.field3297 == null) {
                    arg3.field3297 = new class161();
                }
                class161 var15 = arg4.field3297 = arg3.field3297;
                if (var15.field2052 == null || var15.field2052.length < this.field3272) {
                    int var16 = this.field3272;
                    var15.field2050 = new byte[var16];
                    var15.field2053 = new short[var16];
                    var15.field2052 = new short[var16];
                    var15.field2055 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field3272; var17++) {
                    arg4.field3236[var17] = this.field3236[var17];
                    arg4.field3315[var17] = this.field3315[var17];
                    arg4.field3317[var17] = this.field3317[var17];
                    var15.field2052[var17] = this.field3297.field2052[var17];
                    var15.field2055[var17] = this.field3297.field2055[var17];
                    var15.field2053[var17] = this.field3297.field2053[var17];
                    var15.field2050[var17] = this.field3297.field2050[var17];
                }
            }
            arg4.field3270 = this.field3270;
        } else {
            arg4.field3315 = this.field3315;
            arg4.field3270 = this.field3270;
            arg4.field3317 = this.field3317;
            arg4.field3236 = this.field3236;
            arg4.field3297 = this.field3297;
        }
        if (class270.method1649(arg2, this.field3274, 90)) {
            if (arg0) {
                arg4.field3323 = (byte) (arg4.field3323 | 0x4);
            }
            arg4.field3282 = arg3.field3282;
            arg4.field3282.field1159 = this.field3282.field1159;
            arg4.field3282.field1157 = this.field3282.field1157;
        } else if (class389.method2347(this.field3274, 0, arg2)) {
            arg4.field3282 = this.field3282;
        } else {
            arg4.field3282 = null;
        }
        if (class195.method1248(65, arg2, this.field3274)) {
            if (arg3.field3310 == null || this.field3316 > arg3.field3310.length) {
                int var19 = this.field3272;
                arg4.field3237 = arg3.field3237 = new float[var19];
                arg4.field3310 = arg3.field3310 = new float[var19];
            } else {
                arg4.field3310 = arg3.field3310;
                arg4.field3237 = arg3.field3237;
            }
            for (int var20 = 0; var20 < this.field3272; var20++) {
                arg4.field3310[var20] = this.field3310[var20];
                arg4.field3237[var20] = this.field3237[var20];
            }
        } else {
            arg4.field3237 = this.field3237;
            arg4.field3310 = this.field3310;
        }
        if (class267.method1641(this.field3274, 34069, arg2)) {
            arg4.field3222 = arg3.field3222;
            if (arg0) {
                arg4.field3323 = (byte) (arg4.field3323 | 0x8);
            }
            arg4.field3222.field1159 = this.field3222.field1159;
            arg4.field3222.field1157 = this.field3222.field1157;
        } else if (class529.method2952(this.field3274, -1, arg2)) {
            arg4.field3222 = this.field3222;
        } else {
            arg4.field3222 = null;
        }
        if (arg5 != 0) {
            return null;
        }
        if (class411.method2457(this.field3274, arg2, true)) {
            if (arg3.field3299 == null || arg3.field3299.length < this.field3316) {
                int var21 = this.field3316;
                arg4.field3262 = arg3.field3262 = new short[var21];
                arg4.field3299 = arg3.field3299 = new short[var21];
                arg4.field3226 = arg3.field3226 = new short[var21];
            } else {
                arg4.field3299 = arg3.field3299;
                arg4.field3226 = arg3.field3226;
                arg4.field3262 = arg3.field3262;
            }
            for (int var22 = 0; var22 < this.field3316; var22++) {
                arg4.field3299[var22] = this.field3299[var22];
                arg4.field3262[var22] = this.field3262[var22];
                arg4.field3226[var22] = this.field3226[var22];
            }
        } else {
            arg4.field3226 = this.field3226;
            arg4.field3262 = this.field3262;
            arg4.field3299 = this.field3299;
        }
        if (class475.method2699(this.field3274, arg2, true)) {
            if (arg0) {
                arg4.field3323 = (byte) (arg4.field3323 | 0x10);
            }
            arg4.field3256 = arg3.field3256;
            arg4.field3256.field7552 = this.field3256.field7552;
        } else if (class605.method3466(-26619, arg2, this.field3274)) {
            arg4.field3256 = this.field3256;
        } else {
            arg4.field3256 = null;
        }
        if (class500.method2797(29908, arg2, this.field3274)) {
            if (arg3.field3244 == null || this.field3316 > arg3.field3244.length) {
                int var23 = this.field3316;
                arg4.field3244 = arg3.field3244 = new short[var23];
            } else {
                arg4.field3244 = arg3.field3244;
            }
            for (int var24 = 0; var24 < this.field3316; var24++) {
                arg4.field3244[var24] = this.field3244[var24];
            }
        } else {
            arg4.field3244 = this.field3244;
        }
        if (!class334.method2125(arg2, false, this.field3274)) {
            arg4.field3289 = this.field3289;
        } else if (arg3.field3289 == null || arg3.field3289.length < this.field3312) {
            int var26 = this.field3312;
            arg4.field3289 = arg3.field3289 = new class222[var26];
            for (int var27 = 0; var27 < this.field3312; var27++) {
                arg4.field3289[var27] = this.field3289[var27].method1422((byte) 41);
            }
        } else {
            arg4.field3289 = arg3.field3289;
            for (int var25 = 0; var25 < this.field3312; var25++) {
                arg4.field3289[var25].method1421(this.field3289[var25], 118);
            }
        }
        if (this.field3326) {
            arg4.field3287 = this.field3287;
            arg4.field3291 = this.field3291;
            arg4.field3326 = true;
            arg4.field3294 = this.field3294;
            arg4.field3257 = this.field3257;
            arg4.field3267 = this.field3267;
            arg4.field3269 = this.field3269;
            arg4.field3322 = this.field3322;
        } else {
            arg4.field3326 = false;
        }
        arg4.field3258 = this.field3258;
        arg4.field3223 = this.field3223;
        arg4.field3283 = this.field3283;
        arg4.field3325 = this.field3325;
        arg4.field3224 = this.field3224;
        arg4.field3280 = this.field3280;
        arg4.field3305 = this.field3305;
        arg4.field3302 = this.field3302;
        arg4.field3281 = this.field3281;
        arg4.field3265 = this.field3265;
        arg4.field3295 = this.field3295;
        return arg4;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
    public static void method1576(int arg0) {
        if (arg0 == 27898) {
            field3254 = null;
            field3247 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "(I)V")
    public final void method1577(int arg0) {
        field3318++;
        if (this.field3271 != null) {
            this.field3271.field1159 = null;
        }
        this.field3259 = (short) arg0;
        if (this.field3282 != null) {
            this.field3282.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V")
    public final void method1578(int arg0, int arg1, int arg2, int arg3) {
        field3219++;
        for (int var5 = 0; var5 < this.field3316; var5++) {
            int var9 = this.field3232[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field3232[var5] = (short) class292.method1790(class292.method1790(var11 << 7, var10 << 10), var12);
        }
        if (this.field3281 != null) {
            for (int var6 = 0; var6 < this.field3312; var6++) {
                class365 var7 = this.field3281[var6];
                class222 var8 = this.field3289[var6];
                var8.field2847 = class190.field2453[this.field3232[var7.field5094] & 0xFFFF] & 0xFFFFFF | var8.field2847 & 0xFF000000;
            }
        }
        if (this.field3271 != null) {
            this.field3271.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "TA", descriptor = "()I")
    public final int method1579() {
        field3276++;
        if (!this.field3326) {
            this.method1596((byte) -70);
        }
        return this.field3294;
    }

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "(I)V")
    public final void method1580(int arg0) {
        field3300++;
        int var2 = class310.field3966[arg0];
        int var3 = class310.field3965[arg0];
        for (int var4 = 0; var4 < this.field3245; var4++) {
            int var5 = this.field3229[var4] * var3 - (this.field3311[var4] * var2) >> 14;
            this.field3311[var4] = this.field3311[var4] * var3 + this.field3229[var4] * var2 >> 14;
            this.field3229[var4] = var5;
        }
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
        this.field3326 = false;
    }

    @OriginalMember(owner = "client!lr", name = "EA", descriptor = "(Lk;)Lk;")
    public final class88 method1581(class88 arg0) {
        field3278++;
        if (this.field3272 == 0) {
            return null;
        }
        if (!this.field3326) {
            this.method1596((byte) -91);
        }
        int var2;
        int var3;
        if (this.field3221.field4259 <= 0) {
            var2 = this.field3322 - (this.field3221.field4259 * this.field3294 >> 8) >> this.field3221.field4201;
            var3 = this.field3269 - (this.field3221.field4259 * this.field3257 >> 8) >> this.field3221.field4201;
        } else {
            var2 = this.field3322 - (this.field3221.field4259 * this.field3257 >> 8) >> this.field3221.field4201;
            var3 = this.field3269 - (this.field3221.field4259 * this.field3294 >> 8) >> this.field3221.field4201;
        }
        int var4;
        int var5;
        if (this.field3221.field4321 > 0) {
            var4 = this.field3291 - (this.field3221.field4321 * this.field3257 >> 8) >> this.field3221.field4201;
            var5 = this.field3267 - (this.field3221.field4321 * this.field3294 >> 8) >> this.field3221.field4201;
        } else {
            var4 = this.field3291 - (this.field3221.field4321 * this.field3294 >> 8) >> this.field3221.field4201;
            var5 = this.field3267 - (this.field3221.field4321 * this.field3257 >> 8) >> this.field3221.field4201;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class17 var8 = (class17) arg0;
        class17 var9;
        if (var8 != null && var8.method82((byte) -24, var6, var7)) {
            var9 = var8;
            var8.method79(-17895);
        } else {
            var9 = new class17(this.field3221, var6, var7);
        }
        var9.method76(var4, -21, var3, var5, var2);
        this.method1603(false, var9);
        return var9;
    }

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "(IIII)V")
    public final void method1582(int arg0, int arg1, int arg2, int arg3) {
        field3240++;
        if (arg0 == 0) {
            class495.field6898 = 0;
            class99.field1328 = 0;
            int var5 = 0;
            class580.field8083 = 0;
            for (int var6 = 0; var6 < this.field3245; var6++) {
                class99.field1328 += this.field3255[var6];
                class495.field6898 += this.field3229[var6];
                class580.field8083 += this.field3311[var6];
                var5++;
            }
            if (var5 > 0) {
                class99.field1328 = class99.field1328 / var5 + arg1;
                class580.field8083 = class580.field8083 / var5 + arg3;
                class495.field6898 = class495.field6898 / var5 + arg2;
            } else {
                class495.field6898 = arg2;
                class99.field1328 = arg1;
                class580.field8083 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3245; var7++) {
                this.field3255[var7] += arg1;
                this.field3229[var7] += arg2;
                this.field3311[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3245; var8++) {
                this.field3255[var8] -= class99.field1328;
                this.field3229[var8] -= class495.field6898;
                this.field3311[var8] -= class580.field8083;
                if (arg3 != 0) {
                    int var9 = class310.field3966[arg3];
                    int var10 = class310.field3965[arg3];
                    int var11 = this.field3255[var8] * var10 + this.field3229[var8] * var9 + 16383 >> 14;
                    this.field3229[var8] = this.field3229[var8] * var10 + 16383 - (this.field3255[var8] * var9) >> 14;
                    this.field3255[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class310.field3966[arg1];
                    int var13 = class310.field3965[arg1];
                    int var14 = this.field3229[var8] * var13 + 16383 - this.field3311[var8] * var12 >> 14;
                    this.field3311[var8] = this.field3311[var8] * var13 + this.field3229[var8] * var12 + 16383 >> 14;
                    this.field3229[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class310.field3966[arg2];
                    int var16 = class310.field3965[arg2];
                    int var17 = this.field3311[var8] * var15 + this.field3255[var8] * var16 + 16383 >> 14;
                    this.field3311[var8] = this.field3311[var8] * var16 + 16383 - (this.field3255[var8] * var15) >> 14;
                    this.field3255[var8] = var17;
                }
                this.field3255[var8] += class99.field1328;
                this.field3229[var8] += class495.field6898;
                this.field3311[var8] += class580.field8083;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3245; var18++) {
                this.field3255[var18] -= class99.field1328;
                this.field3229[var18] -= class495.field6898;
                this.field3311[var18] -= class580.field8083;
                this.field3255[var18] = this.field3255[var18] * arg1 / 128;
                this.field3229[var18] = this.field3229[var18] * arg2 / 128;
                this.field3311[var18] = this.field3311[var18] * arg3 / 128;
                this.field3255[var18] += class99.field1328;
                this.field3229[var18] += class495.field6898;
                this.field3311[var18] += class580.field8083;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3316; var19++) {
                int var23 = (this.field3220[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3220[var19] = (byte) var23;
            }
            if (this.field3271 != null) {
                this.field3271.field1159 = null;
            }
            if (this.field3281 != null) {
                for (int var20 = 0; var20 < this.field3312; var20++) {
                    class365 var21 = this.field3281[var20];
                    class222 var22 = this.field3289[var20];
                    var22.field2847 = var22.field2847 & 0xFFFFFF | 255 - (this.field3220[var21.field5094] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3316; var24++) {
                int var28 = this.field3232[var24] & 0xFFFF;
                int var29 = (var28 & 0xFF83) >> 10;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                int var34 = arg3 + var32;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3232[var24] = (short) class292.method1790(class292.method1790(var33 << 7, var31 << 10), var34);
            }
            if (this.field3271 != null) {
                this.field3271.field1159 = null;
            }
            if (this.field3281 != null) {
                for (int var25 = 0; var25 < this.field3312; var25++) {
                    class365 var26 = this.field3281[var25];
                    class222 var27 = this.field3289[var25];
                    var27.field2847 = var27.field2847 & 0xFF000000 | class190.field2453[this.field3232[var26.field5094] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3312; var35++) {
                class222 var36 = this.field3289[var35];
                var36.field2851 += arg2;
                var36.field2855 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3312; var37++) {
                class222 var38 = this.field3289[var37];
                var38.field2852 = var38.field2852 * arg2 >> 7;
                var38.field2850 = var38.field2850 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3312; var39++) {
                class222 var40 = this.field3289[var39];
                var40.field2853 = var40.field2853 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "(I)V")
    public final void method1583(int arg0) {
        this.field3263 = arg0;
        field3329++;
        if (this.field3297 != null && (this.field3263 & 0x10000) == 0) {
            this.field3317 = this.field3297.field2053;
            this.field3315 = this.field3297.field2055;
            this.field3270 = this.field3297.field2050;
            this.field3236 = this.field3297.field2052;
            this.field3297 = null;
        }
        this.field3268 = true;
        this.method1558(0);
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "()[Lfi;")
    public final class55[] method1584() {
        field3277++;
        return this.field3302;
    }

    @OriginalMember(owner = "client!lr", name = "ga", descriptor = "()I")
    public final int method1585() {
        field3284++;
        return this.field3259;
    }

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "(SS)V")
    public final void method1586(short arg0, short arg1) {
        field3298++;
        class473 var3 = this.field3221.field2114;
        for (int var4 = 0; var4 < this.field3316; var4++) {
            if (this.field3244[var4] == arg0) {
                this.field3244[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class41 var7 = var3.method2151(true, arg0 & 0xFFFF);
            var5 = var7.field600;
            var6 = var7.field614;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class41 var10 = var3.method2151(true, arg1 & 0xFFFF);
            var9 = var10.field614;
            var8 = var10.field600;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field3281 != null) {
            for (int var11 = 0; var11 < this.field3312; var11++) {
                class365 var12 = this.field3281[var11];
                class222 var13 = this.field3289[var11];
                var13.field2847 = var13.field2847 & 0xFF000000 | class190.field2453[this.field3232[var12.field5094] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3271 != null) {
            this.field3271.field1159 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!lr", name = "pa", descriptor = "(SS)V")
    public final void method1587(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3316; var3++) {
            if (this.field3232[var3] == arg0) {
                this.field3232[var3] = arg1;
            }
        }
        field3309++;
        if (this.field3281 != null) {
            for (int var4 = 0; var4 < this.field3312; var4++) {
                class365 var5 = this.field3281[var4];
                class222 var6 = this.field3289[var4];
                var6.field2847 = var6.field2847 & 0xFF000000 | class190.field2453[this.field3232[var5.field5094] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3271 != null) {
            this.field3271.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
    public final void method1588() {
        field3228++;
        if (this.field3272 <= 0 || this.field3279 <= 0) {
            return;
        }
        this.method1591(false, true);
        if ((this.field3323 & 0x10) == 0 && this.field3256.field7552 == null) {
            this.method1564(false, 1024);
        }
        this.method1558(0);
    }

    @OriginalMember(owner = "client!lr", name = "sa", descriptor = "()Z")
    public final boolean method1589() {
        field3225++;
        if (this.field3283 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3327; var1++) {
            this.field3255[var1] <<= 0x4;
            this.field3229[var1] <<= 0x4;
            this.field3311[var1] <<= 0x4;
        }
        class580.field8083 = 0;
        class495.field6898 = 0;
        class99.field1328 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "()I")
    public final int method1590() {
        field3313++;
        if (!this.field3326) {
            this.method1596((byte) 114);
        }
        return this.field3287;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZ)V")
    private final void method1591(boolean arg0, boolean arg1) {
        field3251++;
        boolean var3 = this.field3271 != null && this.field3271.field1159 == null;
        boolean var4 = this.field3282 != null && this.field3282.field1159 == null;
        boolean var5 = this.field3328 != null && this.field3328.field1159 == null;
        boolean var6 = this.field3222 != null && this.field3222.field1159 == null;
        if (arg0) {
            var5 &= (this.field3323 & 0x1) != 0;
            var6 &= (this.field3323 & 0x8) != 0;
            var4 &= (this.field3323 & 0x4) != 0;
            var3 &= (this.field3323 & 0x2) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        if (!arg1) {
            return;
        }
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
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
        if ((this.field3272 * var7) <= this.field3221.field4285.field7693.length) {
            this.field3221.field4285.field7707 = 0;
        } else {
            this.field3221.field4285 = new class616((this.field3272 + 100) * var7);
        }
        class616 var12 = this.field3221.field4285;
        if (var5) {
            if (this.field3221.field4291) {
                for (int var13 = 0; var13 < this.field3245; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field3255[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field3229[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field3311[var13]);
                    int var17 = this.field3280[var13];
                    int var18 = this.field3280[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3223[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field7707 = var7 * var20;
                        var12.method3071(-98, var14);
                        var12.method3071(-43, var15);
                        var12.method3071(-94, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3245; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field3255[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field3229[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field3311[var21]);
                    int var25 = this.field3280[var21];
                    int var26 = this.field3280[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3223[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field7707 = var7 * var28;
                        var12.method3093(-7984, var22);
                        var12.method3093(-7984, var23);
                        var12.method3093(-7984, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3282 == null) {
                short[] var31;
                short[] var32;
                byte[] var33;
                short[] var34;
                if (this.field3297 == null) {
                    var31 = this.field3315;
                    var32 = this.field3236;
                    var33 = this.field3270;
                    var34 = this.field3317;
                } else {
                    var31 = this.field3297.field2055;
                    var32 = this.field3297.field2052;
                    var34 = this.field3297.field2053;
                    var33 = this.field3297.field2050;
                }
                float var35 = this.field3221.field4284[0];
                float var36 = this.field3221.field4284[1];
                float var37 = this.field3221.field4284[2];
                float var38 = this.field3221.field4264;
                float var39 = this.field3221.field4337 * 768.0F / (float) this.field3259;
                float var40 = this.field3221.field4326 * 768.0F / (float) this.field3259;
                for (int var41 = 0; var41 < this.field3316; var41++) {
                    int var42 = this.method1604(this.field3244[var41], this.field3220[var41], this.field3301, 0, this.field3232[var41]);
                    float var43 = (float) (var42 >> 16 & 0xFF) * this.field3221.field4235;
                    short var44 = this.field3299[var41];
                    float var45 = (float) ((var42 & 0xFF5C) >> 8) * this.field3221.field4252;
                    float var46 = (float) (var42 >>> 24) * this.field3221.field4312;
                    short var47 = (short) var33[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var44] * var37 + (float) var31[var44] * var36 + (float) var32[var44] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var44] * var37 + (float) var31[var44] * var36 + (float) var32[var44] * var35) / (float) (var47 * 256);
                    }
                    float var49 = ((var48 < 0.0F) ? var40 : var39) * var48 + var38;
                    int var50 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var43 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    int var52 = (int) (var45 * var49);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field7707 = var9 + (var7 * var44);
                    var12.method3060(var50, -25098);
                    var12.method3060(var51, -25098);
                    var12.method3060(var52, -25098);
                    var12.method3060(255 - (this.field3220[var41] & 0xFF), -25098);
                    short var53 = this.field3262[var41];
                    short var54 = (short) var33[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var32[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var32[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = (var55 < 0.0F ? var40 : var39) * var55 + var38;
                    int var57 = (int) (var46 * var56);
                    int var58 = (int) (var43 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var45 * var56);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.field7707 = var7 * var53 + var9;
                    var12.method3060(var57, -25098);
                    var12.method3060(var58, -25098);
                    var12.method3060(var59, -25098);
                    var12.method3060(255 - (this.field3220[var41] & 0xFF), -25098);
                    short var60 = this.field3226[var41];
                    short var61 = (short) var33[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var32[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var32[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = ((var62 < 0.0F) ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var46 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var43 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var45 * var63);
                    var12.field7707 = var9 + (var7 * var60);
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method3060(var64, -25098);
                    var12.method3060(var65, -25098);
                    var12.method3060(var66, -25098);
                    var12.method3060(255 - (this.field3220[var41] & 0xFF), -25098);
                }
            } else {
                for (int var29 = 0; var29 < this.field3316; var29++) {
                    int var30 = this.method1604(this.field3244[var29], this.field3220[var29], this.field3301, 0, this.field3232[var29]);
                    var12.field7707 = this.field3299[var29] * var7 + var9;
                    var12.method3071(-71, var30);
                    var12.field7707 = this.field3262[var29] * var7 + var9;
                    var12.method3071(-84, var30);
                    var12.field7707 = this.field3226[var29] * var7 + var9;
                    var12.method3071(-36, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field3297 == null) {
                var67 = this.field3236;
                var68 = this.field3317;
                var69 = this.field3270;
                var70 = this.field3315;
            } else {
                var67 = this.field3297.field2052;
                var69 = this.field3297.field2050;
                var70 = this.field3297.field2055;
                var68 = this.field3297.field2053;
            }
            float var71 = 3.0F / (float) this.field3259;
            float var72 = 3.0F / (float) (this.field3259 / 2 + this.field3259);
            var12.field7707 = var10;
            if (this.field3221.field4291) {
                for (int var76 = 0; var76 < this.field3272; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method3531(1448476952, (float) var67[var76] * var72);
                        var12.method3531(1448476952, (float) var70[var76] * var72);
                        var12.method3531(1448476952, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method3531(1448476952, (float) var67[var76] * var78);
                        var12.method3531(1448476952, (float) var70[var76] * var78);
                        var12.method3531(1448476952, (float) var68[var76] * var78);
                    }
                    var12.field7707 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field3272; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method3529((float) var67[var73] * var72, -71);
                        var12.method3529((float) var70[var73] * var72, -82);
                        var12.method3529((float) var68[var73] * var72, -81);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method3529((float) var67[var73] * var75, -55);
                        var12.method3529((float) var70[var73] * var75, -94);
                        var12.method3529((float) var68[var73] * var75, -78);
                    }
                    var12.field7707 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field7707 = var11;
            if (this.field3221.field4291) {
                for (int var79 = 0; var79 < this.field3272; var79++) {
                    var12.method3531(1448476952, this.field3310[var79]);
                    var12.method3531(1448476952, this.field3237[var79]);
                    var12.field7707 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field3272; var80++) {
                    var12.method3529(this.field3310[var80], -112);
                    var12.method3529(this.field3237[var80], -75);
                    var12.field7707 += var7 - 8;
                }
            }
        }
        var12.field7707 = this.field3272 * var7;
        class159 var81;
        if (arg0) {
            if (this.field3320 == null) {
                this.field3320 = this.field3221.method1926(8771, var12.field7693, var7, true, var12.field7707);
            } else {
                this.field3320.method866(-3211, var12.field7693, var7, var12.field7707);
            }
            var81 = this.field3320;
            this.field3323 = 0;
        } else {
            var81 = this.field3221.method1926(8771, var12.field7693, var7, false, var12.field7707);
            this.field3268 = true;
        }
        if (var5) {
            this.field3328.field1157 = var8;
            this.field3328.field1159 = var81;
        }
        if (var6) {
            this.field3222.field1157 = var11;
            this.field3222.field1159 = var81;
        }
        if (var3) {
            this.field3271.field1157 = var9;
            this.field3271.field1159 = var81;
        }
        if (var4) {
            this.field3282.field1159 = var81;
            this.field3282.field1157 = var10;
        }
    }

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "()I")
    public final int method1592() {
        field3227++;
        if (!this.field3326) {
            this.method1596((byte) 114);
        }
        return this.field3257;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()Z")
    public final boolean method1593() {
        field3243++;
        if (this.field3244 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3244.length; var1++) {
            if (this.field3244[var1] != -1 && !this.field3221.field2114.method2144(-31, this.field3244[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)V")
    public final void method1594(int arg0) {
        this.field3301 = (short) arg0;
        if (this.field3271 != null) {
            this.field3271.field1159 = null;
        }
        field3273++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lm;Leca;I)V")
    public final void method1595(class105 arg0, class378 arg1, int arg2) {
        field3231++;
        if (this.field3272 == 0) {
            return;
        }
        class404 var4 = this.field3221.field4323;
        class404 var5 = (class404) arg0;
        if (!this.field3326) {
            this.method1596((byte) 126);
        }
        this.method1599((byte) 116, var5);
        class546.field7620 = var4.field5521 * var5.field5538 + var4.field5538 * var5.field5536 + var4.field5533 * var5.field5526;
        class298.field3902 = var4.field5521 * var5.field5546 + var4.field5538 * var5.field5544 + var4.field5533 * var5.field5529 + var4.field5546;
        float var6 = (float) this.field3294 * class546.field7620 + class298.field3902;
        float var7 = (float) this.field3257 * class546.field7620 + class298.field3902;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = var7 - (float) this.field3287;
            var8 = (float) this.field3287 + var6;
        } else {
            var8 = (float) this.field3287 + var7;
            var9 = var6 - (float) this.field3287;
        }
        if ((var9 >= this.field3221.field4330) || (var8 <= (float) this.field3221.field4294)) {
            return;
        }
        class500.field6943 = var4.field5556 * var5.field5546 + var4.field5540 * var5.field5529 + var4.field5526 * var5.field5544 + var4.field5529;
        class596.field8589 = var4.field5556 * var5.field5538 + var4.field5540 * var5.field5526 + var4.field5526 * var5.field5536;
        float var10 = (float) this.field3294 * class596.field8589 + class500.field6943;
        float var11 = (float) this.field3257 * class596.field8589 + class500.field6943;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = ((float) this.field3287 + var10) * (float) this.field3221.field4335;
            var12 = ((float) (-this.field3287) + var11) * (float) this.field3221.field4335;
        } else {
            var12 = (var10 - (float) this.field3287) * (float) this.field3221.field4335;
            var13 = ((float) this.field3287 + var11) * (float) this.field3221.field4335;
        }
        if ((this.field3221.field4310 <= var12 / var8) || (this.field3221.field4325 >= var13 / var8)) {
            return;
        }
        class419.field5728 = var4.field5537 * var5.field5546 + var4.field5548 * var5.field5529 + var4.field5536 * var5.field5544 + var4.field5544;
        class612.field8798 = var4.field5537 * var5.field5538 + var4.field5548 * var5.field5526 + var4.field5536 * var5.field5536;
        float var14 = (float) this.field3294 * class612.field8798 + class419.field5728;
        float var15 = (float) this.field3257 * class612.field8798 + class419.field5728;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field3287 + var14) * (float) this.field3221.field4318;
            var17 = (var15 - (float) this.field3287) * (float) this.field3221.field4318;
        } else {
            var16 = ((float) this.field3287 + var15) * (float) this.field3221.field4318;
            var17 = (var14 - (float) this.field3287) * (float) this.field3221.field4318;
        }
        if ((var17 / var8 >= this.field3221.field4324) || (var16 / var8 <= this.field3221.field4233)) {
            return;
        }
        if (arg1 != null || this.field3281 != null) {
            class244.field3088 = var4.field5556 * var5.field5533 + var4.field5540 * var5.field5540 + var4.field5526 * var5.field5548;
            class170.field2164 = var4.field5537 * var5.field5533 + var4.field5548 * var5.field5540 + var4.field5536 * var5.field5548;
            class453.field6409 = var4.field5556 * var5.field5521 + var4.field5540 * var5.field5556 + var4.field5526 * var5.field5537;
            class520.field7242 = var4.field5521 * var5.field5521 + var4.field5538 * var5.field5537 + var4.field5533 * var5.field5556;
            class540.field7555 = var4.field5521 * var5.field5533 + var4.field5538 * var5.field5548 + var4.field5533 * var5.field5540;
            class365.field5106 = var4.field5537 * var5.field5521 + var4.field5548 * var5.field5556 + var4.field5536 * var5.field5537;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3322 + this.field3269 >> 1;
            int var21 = this.field3291 + this.field3267 >> 1;
            int var22 = (int) ((float) var21 * class453.field6409 + (float) this.field3294 * class596.field8589 + (float) var20 * class244.field3088 + class500.field6943);
            int var23 = (int) ((float) var21 * class365.field5106 + (float) this.field3294 * class612.field8798 + (float) var20 * class170.field2164 + class419.field5728);
            int var24 = (int) ((float) var21 * class520.field7242 + (float) this.field3294 * class546.field7620 + (float) var20 * class540.field7555 + class298.field3902);
            if (this.field3221.field4294 > var24) {
                var18 = true;
            } else {
                arg1.field5290 = this.field3221.field4335 * var22 / var24 + this.field3221.field4256;
                arg1.field5291 = this.field3221.field4318 * var23 / var24 + this.field3221.field4225;
            }
            int var25 = (int) ((float) var21 * class453.field6409 + (float) this.field3257 * class596.field8589 + (float) var20 * class244.field3088 + class500.field6943);
            int var26 = (int) ((float) var21 * class365.field5106 + (float) this.field3257 * class612.field8798 + (float) var20 * class170.field2164 + class419.field5728);
            int var27 = (int) ((float) var21 * class520.field7242 + (float) this.field3257 * class546.field7620 + (float) var20 * class540.field7555 + class298.field3902);
            if (this.field3221.field4294 > var27) {
                var18 = true;
            } else {
                arg1.field5293 = this.field3221.field4225 + (this.field3221.field4318 * var26 / var27);
                arg1.field5292 = this.field3221.field4335 * var25 / var27 + this.field3221.field4256;
            }
            if (var18) {
                if (var24 < this.field3221.field4294 && this.field3221.field4294 > var27) {
                    var19 = false;
                } else if (var24 < this.field3221.field4294) {
                    int var28 = (var27 - this.field3221.field4294 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field5290 = this.field3221.field4335 * var29 / this.field3221.field4294 + this.field3221.field4256;
                    arg1.field5291 = this.field3221.field4318 * var30 / this.field3221.field4294 + this.field3221.field4225;
                } else if (this.field3221.field4294 > var27) {
                    int var31 = (var24 - this.field3221.field4294 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field5290 = this.field3221.field4335 * var32 / this.field3221.field4294 + this.field3221.field4256;
                    arg1.field5291 = this.field3221.field4318 * var33 / this.field3221.field4294 + this.field3221.field4225;
                }
            }
            if (var19) {
                arg1.field5294 = true;
                if (var24 <= var27) {
                    arg1.field5289 = (this.field3287 + var25) * this.field3221.field4335 / var27 + this.field3221.field4256 - arg1.field5292;
                } else {
                    arg1.field5289 = (this.field3287 + var22) * this.field3221.field4335 / var24 + this.field3221.field4256 - arg1.field5290;
                }
            }
        }
        this.field3221.method1925(false);
        this.field3221.method1961(var5, 17791);
        this.method1571(false);
        this.field3221.method1942(102);
        this.method1572(65411);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    private final void method1596(byte arg0) {
        field3239++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3245; var10++) {
            int var12 = this.field3255[var10];
            int var13 = this.field3229[var10];
            int var14 = this.field3311[var10];
            if (var6 < var13) {
                var6 = var13;
            }
            if (var5 < var12) {
                var5 = var12;
            }
            if (var3 > var13) {
                var3 = var13;
            }
            if (var12 < var2) {
                var2 = var12;
            }
            if (var4 > var14) {
                var4 = var14;
            }
            if (var7 < var14) {
                var7 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var8 < var15) {
                var8 = var15;
            }
            int var16 = var13 * var13 + var12 * var12 + var14 * var14;
            if (var9 < var16) {
                var9 = var16;
            }
        }
        this.field3322 = (short) var2;
        this.field3257 = (short) var6;
        this.field3267 = (short) var7;
        this.field3291 = (short) var4;
        this.field3294 = (short) var3;
        this.field3269 = (short) var5;
        this.field3287 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        int var11 = 40 / ((arg0 - 67) / 47);
        Math.sqrt((double) var9);
        this.field3326 = true;
    }

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "()I")
    public final int method1597() {
        field3234++;
        if (!this.field3326) {
            this.method1596((byte) 116);
        }
        return this.field3267;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILm;Z)Z")
    public final boolean method1598(int arg0, int arg1, class105 arg2, boolean arg3) {
        field3253++;
        class404 var5 = (class404) arg2;
        class404 var6 = this.field3221.field4323;
        float var7 = var5.field5546 * var6.field5556 + var5.field5544 * var6.field5526 + var5.field5529 * var6.field5540 + var6.field5529;
        float var8 = var5.field5546 * var6.field5537 + var5.field5544 * var6.field5536 + var5.field5529 * var6.field5548 + var6.field5544;
        class244.field3088 = var5.field5533 * var6.field5556 + var5.field5548 * var6.field5526 + var5.field5540 * var6.field5540;
        class546.field7620 = var5.field5538 * var6.field5521 + var5.field5536 * var6.field5538 + var5.field5526 * var6.field5533;
        class365.field5106 = var5.field5521 * var6.field5537 + var5.field5556 * var6.field5548 + var5.field5537 * var6.field5536;
        class612.field8798 = var5.field5538 * var6.field5537 + var5.field5536 * var6.field5536 + var5.field5526 * var6.field5548;
        class520.field7242 = var5.field5521 * var6.field5521 + var5.field5556 * var6.field5533 + var5.field5537 * var6.field5538;
        class540.field7555 = var5.field5533 * var6.field5521 + var5.field5548 * var6.field5538 + var5.field5540 * var6.field5533;
        class170.field2164 = var5.field5533 * var6.field5537 + var5.field5548 * var6.field5536 + var5.field5540 * var6.field5548;
        float var9 = var5.field5546 * var6.field5521 + var5.field5544 * var6.field5538 + var5.field5529 * var6.field5533 + var6.field5546;
        class596.field8589 = var5.field5538 * var6.field5556 + var5.field5536 * var6.field5526 + var5.field5526 * var6.field5540;
        class453.field6409 = var5.field5521 * var6.field5556 + var5.field5556 * var6.field5540 + var5.field5537 * var6.field5526;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field3221.field4335;
        int var16 = this.field3221.field4318;
        if (!this.field3326) {
            this.method1596((byte) 122);
        }
        class155.field2017[0] = this.field3322;
        class139.field1759[0] = this.field3294;
        class155.field2017[1] = this.field3269;
        class405.field5570[0] = this.field3291;
        class139.field1759[1] = this.field3294;
        class155.field2017[2] = this.field3322;
        class405.field5570[1] = this.field3291;
        class139.field1759[2] = this.field3257;
        class405.field5570[2] = this.field3291;
        class155.field2017[3] = this.field3269;
        class139.field1759[3] = this.field3257;
        class155.field2017[4] = this.field3322;
        class405.field5570[3] = this.field3291;
        class139.field1759[4] = this.field3294;
        class405.field5570[4] = this.field3267;
        class155.field2017[5] = this.field3269;
        class139.field1759[5] = this.field3294;
        class405.field5570[5] = this.field3267;
        class155.field2017[6] = this.field3322;
        class139.field1759[6] = this.field3257;
        class155.field2017[7] = this.field3269;
        class405.field5570[6] = this.field3267;
        class139.field1759[7] = this.field3257;
        class405.field5570[7] = this.field3267;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class405.field5570[var17];
            float var39 = (float) class139.field1759[var17];
            float var40 = (float) class155.field2017[var17];
            float var41 = class453.field6409 * var38 + class596.field8589 * var39 + class244.field3088 * var40 + var7;
            float var42 = class520.field7242 * var38 + class546.field7620 * var39 + class540.field7555 * var40 + var9;
            float var43 = class365.field5106 * var38 + class612.field8798 * var39 + class170.field2164 * var40 + var8;
            if ((float) this.field3221.field4294 <= var42) {
                float var44 = (float) var15 * var41 / var42 + (float) this.field3221.field4256;
                if (var11 > var44) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var43 / var42 + (float) this.field3221.field4225;
                if (var44 > var12) {
                    var12 = var44;
                }
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field3272 > this.field3221.field4343.length) {
                this.field3221.field4343 = new int[this.field3272];
                this.field3221.field4346 = new int[this.field3272];
            }
            int[] var18 = this.field3221.field4343;
            int[] var19 = this.field3221.field4346;
            for (int var20 = 0; var20 < this.field3245; var20++) {
                float var22 = (float) this.field3311[var20];
                float var23 = (float) this.field3255[var20];
                float var24 = (float) this.field3229[var20];
                float var25 = class453.field6409 * var22 + class596.field8589 * var24 + class244.field3088 * var23 + var7;
                float var26 = class520.field7242 * var22 + class546.field7620 * var24 + class540.field7555 * var23 + var9;
                float var27 = class365.field5106 * var22 + class612.field8798 * var24 + class170.field2164 * var23 + var8;
                if (((float) this.field3221.field4294 <= var26)) {
                    int var32 = (int) ((float) var15 * var25 / var26 + (float) this.field3221.field4256);
                    int var33 = (int) ((float) var16 * var27 / var26 + (float) this.field3221.field4225);
                    int var34 = this.field3280[var20];
                    int var35 = this.field3280[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field3223[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field3280[var20];
                    int var29 = this.field3280[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field3223[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field3223[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field3316; var21++) {
                if (var18[this.field3299[var21]] != -999999 && var18[this.field3262[var21]] != -999999 && var18[this.field3226[var21]] != -999999 && this.method1568(arg0, var18[this.field3299[var21]], var19[this.field3299[var21]], 125, var18[this.field3262[var21]], arg1, var18[this.field3226[var21]], var19[this.field3262[var21]], var19[this.field3226[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLhba;)V")
    private final void method1599(byte arg0, class404 arg1) {
        if (arg0 < 38) {
            return;
        }
        if (this.field3325 != null) {
            for (int var3 = 0; var3 < this.field3325.length; var3++) {
                class601 var4 = this.field3325[var3];
                class601 var5 = var4;
                if (var4.field8692 != null) {
                    var5 = var4.field8692;
                }
                var5.field8683 = (int) ((float) this.field3311[var4.field8688] * arg1.field5556 + (float) this.field3255[var4.field8688] * arg1.field5540 + (float) this.field3229[var4.field8688] * arg1.field5526 + arg1.field5529);
                var5.field8696 = (int) ((float) this.field3311[var4.field8688] * arg1.field5537 + (float) this.field3255[var4.field8688] * arg1.field5548 + (float) this.field3229[var4.field8688] * arg1.field5536 + arg1.field5544);
                var5.field8689 = (int) ((float) this.field3311[var4.field8688] * arg1.field5521 + (float) this.field3255[var4.field8688] * arg1.field5533 + (float) this.field3229[var4.field8688] * arg1.field5538 + arg1.field5546);
                var5.field8698 = (int) ((float) this.field3311[var4.field8687] * arg1.field5556 + (float) this.field3255[var4.field8687] * arg1.field5540 + (float) this.field3229[var4.field8687] * arg1.field5526 + arg1.field5529);
                var5.field8694 = (int) ((float) this.field3311[var4.field8687] * arg1.field5537 + (float) this.field3255[var4.field8687] * arg1.field5548 + (float) this.field3229[var4.field8687] * arg1.field5536 + arg1.field5544);
                var5.field8699 = (int) ((float) this.field3311[var4.field8687] * arg1.field5521 + (float) this.field3255[var4.field8687] * arg1.field5533 + (float) this.field3229[var4.field8687] * arg1.field5538 + arg1.field5546);
                var5.field8685 = (int) ((float) this.field3311[var4.field8695] * arg1.field5556 + (float) this.field3255[var4.field8695] * arg1.field5540 + (float) this.field3229[var4.field8695] * arg1.field5526 + arg1.field5529);
                var5.field8691 = (int) ((float) this.field3311[var4.field8695] * arg1.field5537 + (float) this.field3255[var4.field8695] * arg1.field5548 + (float) this.field3229[var4.field8695] * arg1.field5536 + arg1.field5544);
                var5.field8686 = (int) ((float) this.field3311[var4.field8695] * arg1.field5521 + (float) this.field3255[var4.field8695] * arg1.field5533 + (float) this.field3229[var4.field8695] * arg1.field5538 + arg1.field5546);
            }
        }
        field3286++;
        if (this.field3302 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3302.length; var6++) {
            class55 var7 = this.field3302[var6];
            class55 var8 = var7;
            if (var7.field734 != null) {
                var8 = var7.field734;
            }
            if (var7.field741 == null) {
                var7.field741 = arg1.method357();
            } else {
                var7.field741.method362(arg1);
            }
            var8.field730 = (int) ((float) this.field3311[var7.field733] * arg1.field5556 + (float) this.field3255[var7.field733] * arg1.field5540 + (float) this.field3229[var7.field733] * arg1.field5526 + arg1.field5529);
            var8.field735 = (int) ((float) this.field3311[var7.field733] * arg1.field5537 + (float) this.field3255[var7.field733] * arg1.field5548 + (float) this.field3229[var7.field733] * arg1.field5536 + arg1.field5544);
            var8.field729 = (int) ((float) this.field3311[var7.field733] * arg1.field5521 + (float) this.field3255[var7.field733] * arg1.field5533 + (float) this.field3229[var7.field733] * arg1.field5538 + arg1.field5546);
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "()[Lkca;")
    public final class601[] method1600() {
        field3321++;
        return this.field3325;
    }

    @OriginalMember(owner = "client!lr", name = "ba", descriptor = "()I")
    public final int method1601() {
        field3288++;
        return this.field3263;
    }

    @OriginalMember(owner = "client!lr", name = "ca", descriptor = "(III)V")
    public final void method1602(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3245; var4++) {
            if (arg0 != 0) {
                this.field3255[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3229[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3311[var4] += arg2;
            }
        }
        field3252++;
        this.field3326 = false;
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZLmda;)V")
    private final void method1603(boolean arg0, class17 arg1) {
        if (this.field3272 > this.field3221.field4343.length) {
            this.field3221.field4346 = new int[this.field3272];
            this.field3221.field4343 = new int[this.field3272];
        }
        field3250++;
        int[] var3 = this.field3221.field4343;
        int[] var4 = this.field3221.field4346;
        int var5 = 0;
        if (arg0) {
            return;
        }
        while (var5 < this.field3245) {
            int var16 = (this.field3255[var5] - (this.field3229[var5] * this.field3221.field4259 >> 8) >> this.field3221.field4201) - arg1.field178;
            int var17 = (this.field3311[var5] - (this.field3229[var5] * this.field3221.field4321 >> 8) >> this.field3221.field4201) - arg1.field180;
            int var18 = this.field3280[var5];
            int var19 = this.field3280[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field3223[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
            var5++;
        }
        for (int var6 = 0; var6 < this.field3279; var6++) {
            if (this.field3220 == null || this.field3220[var6] <= 128) {
                short var7 = this.field3299[var6];
                short var8 = this.field3262[var6];
                short var9 = this.field3226[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var14 - var13) * (var12 - var11)) > 0) {
                    arg1.method80(var12, var14, var15, var10, var11, 27089, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(SBIII)I")
    private final int method1604(short arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3238++;
        int var6 = class190.field2453[class548.method3025(arg2, -103, arg4)];
        if (~arg0 != arg3) {
            class41 var7 = this.field3221.field2114.method2151(true, arg0 & 0xFFFF);
            int var8 = var7.field600 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field614 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var14 & 0xFF00) + ((var13 & 0x5A00FF00) << 8) + (var15 >> 8);
            }
        }
        return 255 - ((arg1 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIILfp;FJFII)S")
    private final short method1605(int arg0, int arg1, int arg2, int arg3, class528 arg4, float arg5, long arg6, float arg7, int arg8, int arg9) {
        field3292++;
        if (arg1 < 66) {
            this.method1599((byte) 106, null);
        }
        int var12 = this.field3280[arg9];
        int var13 = this.field3280[arg9 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3223[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class505.field7021[var15] == arg6) {
                return (short) (var16 - 1);
            }
        }
        this.field3223[var14] = (short) (this.field3272 + 1);
        class505.field7021[var14] = arg6;
        this.field3236[this.field3272] = (short) arg2;
        this.field3315[this.field3272] = (short) arg3;
        this.field3317[this.field3272] = (short) arg8;
        this.field3270[this.field3272] = (byte) arg0;
        this.field3310[this.field3272] = arg7;
        this.field3237[this.field3272] = arg5;
        return (short) (this.field3272++);
    }

    @OriginalMember(owner = "client!lr", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final void method1606(int arg0, int arg1, class544 arg2, class544 arg3, int arg4, int arg5, int arg6) {
        field3218++;
        if (!this.field3326) {
            this.method1596((byte) 122);
        }
        int var8 = this.field3322 + arg4;
        int var9 = arg4 + this.field3269;
        int var10 = arg6 + this.field3291;
        int var11 = arg6 + this.field3267;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field7581 <= (arg2.field7582 + var9 >> arg2.field7583) || var10 < 0 || arg2.field7585 <= arg2.field7582 + var11 >> arg2.field7583) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field7582 + var9 >> arg3.field7583) >= arg3.field7581 || var10 < 0 || arg3.field7582 + var11 >> arg3.field7583 >= arg3.field7585) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field7583;
            int var13 = arg2.field7582 + var9 - 1 >> arg2.field7583;
            int var14 = var10 >> arg2.field7583;
            int var15 = var11 + arg2.field7582 - 1 >> arg2.field7583;
            if (arg2.method1031(var12, var14) == arg5 && arg2.method1031(var13, var14) == arg5 && arg2.method1031(var12, var15) == arg5 && arg2.method1031(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field3245; var16++) {
                this.field3229[var16] -= arg5 - arg2.method1040(this.field3255[var16] + arg4, this.field3311[var16] - -arg6);
            }
        } else if (arg0 == 2) {
            short var17 = this.field3294;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field3245; var18++) {
                int var19 = (this.field3229[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field3229[var18] += (arg1 - var19) * (arg2.method1040(this.field3255[var18] + arg4, this.field3311[var18] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF33) >> 8) * 4;
            int var22 = (arg1 & 0xFF143A) >> 16 << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var20 >> 1)) < 0 || (arg4 - (-(var20 >> 1) - arg2.field7582)) >= (arg2.field7581 << arg2.field7583) || (arg6 - (var21 >> 1)) < 0 || (arg2.field7585 << arg2.field7583) <= ((var21 >> 1) + arg6 + arg2.field7582)) {
                return;
            }
            this.method2902(var22, var20, var21, false, arg2, arg5, var23, arg4, arg6);
        } else if (arg0 == 4) {
            int var24 = this.field3257 - this.field3294;
            for (int var25 = 0; var25 < this.field3245; var25++) {
                this.field3229[var25] = this.field3229[var25] + var24 - (arg5 + -arg3.method1040(this.field3255[var25] - -arg4, this.field3311[var25] + arg6));
            }
        } else if (arg0 == 5) {
            int var26 = this.field3257 - this.field3294;
            for (int var27 = 0; var27 < this.field3245; var27++) {
                int var28 = this.field3255[var27] + arg4;
                int var29 = this.field3311[var27] + arg6;
                int var30 = arg2.method1040(var28, var29);
                int var31 = arg3.method1040(var28, var29);
                int var32 = var30 - var31 - arg1;
                this.field3229[var27] = ((this.field3229[var27] << 8) / var26 * var32 >> 8) + var30 - arg5;
            }
        }
        if (this.field3328 != null) {
            this.field3328.field1159 = null;
        }
        this.field3326 = false;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BIZ)Lr;")
    public final class521 method1607(byte arg0, int arg1, boolean arg2) {
        field3248++;
        class261 var4;
        class261 var5;
        if (arg0 == 1) {
            var4 = this.field3221.field4247;
            var5 = this.field3221.field4239;
        } else if (arg0 == 2) {
            var4 = this.field3221.field4223;
            var5 = this.field3221.field4269;
        } else if (arg0 == 3) {
            var4 = this.field3221.field4319;
            var5 = this.field3221.field4309;
        } else if (arg0 == 4) {
            var5 = this.field3221.field4304;
            var4 = this.field3221.field4276;
        } else if (arg0 == 5) {
            var4 = this.field3221.field4249;
            var5 = this.field3221.field4290;
        } else {
            var4 = var5 = new class261(this.field3221);
        }
        return this.method1575(arg0 != 0, arg2, arg1, var5, var4, 0);
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Luq;)V")
    public class261(class313 arg0) {
        this.field3221 = arg0;
        this.field3328 = new class86(null, 5126, 3, 0);
        this.field3222 = new class86(null, 5126, 2, 0);
        this.field3282 = new class86(null, 5126, 3, 0);
        this.field3271 = new class86(null, 5121, 4, 0);
        this.field3256 = new class540();
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Luq;Lfp;IIII)V")
    public class261(class313 arg0, class528 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3274 = arg5;
        this.field3263 = arg2;
        this.field3221 = arg0;
        if (class579.method3255((byte) -76, arg5, arg2)) {
            this.field3328 = new class86(null, 5126, 3, 0);
        }
        if (class529.method2952(arg5, -1, arg2)) {
            this.field3222 = new class86(null, 5126, 2, 0);
        }
        if (class389.method2347(arg5, 0, arg2)) {
            this.field3282 = new class86(null, 5126, 3, 0);
        }
        if (class179.method1104(arg5, arg2, -1)) {
            this.field3271 = new class86(null, 5121, 4, 0);
        }
        if (class605.method3466(-26619, arg2, arg5)) {
            this.field3256 = new class540();
        }
        class473 var7 = arg0.field2114;
        int[] var8 = new int[arg1.field7386];
        this.field3280 = new int[arg1.field7355 + 1];
        for (int var9 = 0; var9 < arg1.field7386; var9++) {
            if ((arg1.field7379 == null || arg1.field7379[var9] != 2) && (arg1.field7375 == null || arg1.field7375[var9] == -1 || !var7.method2151(true, arg1.field7375[var9] & 0xFFFF).field608)) {
                var8[this.field3316++] = var9;
                this.field3280[arg1.field7372[var9]]++;
                this.field3280[arg1.field7364[var9]]++;
                this.field3280[arg1.field7357[var9]]++;
            }
        }
        this.field3279 = this.field3316;
        long[] var10 = new long[this.field3316];
        boolean var11 = (this.field3263 & 0x100) != 0;
        label501: for (int var12 = 0; var12 < this.field3316; var12++) {
            int var180 = var8[var12];
            class41 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7359 != null) {
                for (int var186 = 0; var186 < arg1.field7359.length; var186++) {
                    class111 var187 = arg1.field7359[var186];
                    if (var187.field1439 == var180) {
                        class85 var188 = class179.method1101(52, var187.field1442);
                        if (var188.field1146) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3279--;
                            continue label501;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7375 != null) {
                var189 = arg1.field7375[var180];
                if (var189 != -1) {
                    var181 = var7.method2151(true, var189 & 0xFFFF);
                    var184 = var181.field620;
                    var185 = var181.field618;
                }
            }
            boolean var190 = arg1.field7341 != null && arg1.field7341[var180] != 0 || var181 != null && !var181.field610 | var181.field603;
            if ((var11 || var190) && arg1.field7369 != null) {
                var182 += arg1.field7369[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class127.method683(var10, (byte) 48, var8);
        this.field3229 = arg1.field7368;
        this.field3224 = arg1.field7365;
        this.field3311 = arg1.field7376;
        this.field3327 = arg1.field7389;
        this.field3255 = arg1.field7352;
        this.field3245 = arg1.field7355;
        this.field3325 = arg1.field7338;
        this.field3302 = arg1.field7337;
        class136[] var13 = new class136[this.field3245];
        if (arg1.field7359 != null) {
            this.field3312 = arg1.field7359.length;
            this.field3281 = new class365[this.field3312];
            this.field3289 = new class222[this.field3312];
            for (int var14 = 0; var14 < this.field3312; var14++) {
                class111 var15 = arg1.field7359[var14];
                class85 var16 = class179.method1101(30, var15.field1442);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3316; var18++) {
                    if (var8[var18] == var15.field1439) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class190.field2453[arg1.field7349[var15.field1439] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7341 == null ? 0 : arg1.field7341[var15.field1439]) << 24;
                this.field3281[var14] = new class365(var17, arg1.field7372[var15.field1439], arg1.field7364[var15.field1439], arg1.field7357[var15.field1439], var16.field1144, var16.field1150, var16.field1149, var16.field1145, var16.field1153, var16.field1146, var16.field1142, var15.field1440);
                this.field3289[var14] = new class222(var20);
            }
        }
        int var21 = this.field3316 * 3;
        this.field3262 = new short[this.field3316];
        this.field3244 = new short[this.field3316];
        class505.field7021 = new long[var21];
        this.field3299 = new short[this.field3316];
        this.field3301 = (short) arg3;
        this.field3270 = new byte[var21];
        this.field3223 = new short[var21];
        if (arg1.field7363 != null) {
            this.field3295 = new short[this.field3316];
        }
        this.field3259 = (short) arg4;
        this.field3226 = new short[this.field3316];
        this.field3315 = new short[var21];
        this.field3220 = new byte[this.field3316];
        this.field3310 = new float[var21];
        this.field3237 = new float[var21];
        this.field3232 = new short[this.field3316];
        this.field3317 = new short[var21];
        this.field3236 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7355; var23++) {
            int var179 = this.field3280[var23];
            this.field3280[var23] = var22;
            var13[var23] = new class136();
            var22 += var179;
        }
        this.field3280[arg1.field7355] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7344 != null) {
            int var28 = arg1.field7339;
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
            var26 = new int[var28];
            var24 = new int[var28];
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field3316; var36++) {
                int var43 = var8[var36];
                if (arg1.field7344[var43] != -1) {
                    int var44 = arg1.field7344[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7372[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7364[var43];
                        } else {
                            var46 = arg1.field7357[var43];
                        }
                        int var47 = arg1.field7352[var46];
                        int var48 = arg1.field7368[var46];
                        int var49 = arg1.field7376[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
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
            var27 = new float[var28][];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7350[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field7377[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = (float) var42 / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var41 = (float) (-var42) / 1024.0F;
                            var39 = 1.0F;
                        }
                        var40 = 64.0F / (float) arg1.field7384[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field7347[var37];
                        var40 = 64.0F / (float) arg1.field7384[var37];
                        var41 = 64.0F / (float) arg1.field7377[var37];
                    } else {
                        var39 = (float) arg1.field7347[var37] / 1024.0F;
                        var41 = (float) arg1.field7377[var37] / 1024.0F;
                        var40 = (float) arg1.field7384[var37] / 1024.0F;
                    }
                    var27[var37] = class521.method2907(var41, class143.method783(arg1.field7342[var37], 255), arg1.field7374[var37], var39, arg1.field7370[var37], var40, 6, arg1.field7348[var37]);
                }
            }
        }
        class620[] var50 = new class620[arg1.field7386];
        for (int var51 = 0; var51 < arg1.field7386; var51++) {
            short var158 = arg1.field7372[var51];
            short var159 = arg1.field7364[var51];
            short var160 = arg1.field7357[var51];
            int var161 = this.field3255[var159] - this.field3255[var158];
            int var162 = this.field3229[var159] - this.field3229[var158];
            int var163 = this.field3311[var159] - this.field3311[var158];
            int var164 = this.field3255[var160] - this.field3255[var158];
            int var165 = this.field3229[var160] - this.field3229[var158];
            int var166 = this.field3311[var160] - this.field3311[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + (var167 * var167 + (var168 * var168))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var167 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field7379 == null ? 0 : arg1.field7379[var51];
            if (var174 == 0) {
                class136 var175 = var13[var158];
                var175.field1661 += var172;
                var175.field1657 += var171;
                var175.field1658++;
                var175.field1660 += var173;
                class136 var176 = var13[var159];
                var176.field1658++;
                var176.field1661 += var172;
                var176.field1660 += var173;
                var176.field1657 += var171;
                class136 var177 = var13[var160];
                var177.field1658++;
                var177.field1661 += var172;
                var177.field1660 += var173;
                var177.field1657 += var171;
            } else if (var174 == 1) {
                class620 var178 = var50[var51] = new class620();
                var178.field8921 = var172;
                var178.field8926 = var173;
                var178.field8922 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field3316; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7349[var68] & 0xFFFF;
            short var70;
            if (arg1.field7375 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7375[var68];
            }
            int var71;
            if (arg1.field7344 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7344[var68];
            }
            int var72;
            if (arg1.field7341 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7341[var68] & 0xFF;
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
                    var74 = 1.0F;
                    var78 = 0.0F;
                    var79 = 1;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7350[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field7372[var68];
                        short var84 = arg1.field7364[var68];
                        short var85 = arg1.field7357[var68];
                        short var86 = arg1.field7348[var71];
                        short var87 = arg1.field7374[var71];
                        short var88 = arg1.field7370[var71];
                        float var89 = (float) arg1.field7352[var86];
                        float var90 = (float) arg1.field7368[var86];
                        float var91 = (float) arg1.field7376[var86];
                        float var92 = (float) arg1.field7352[var87] - var89;
                        float var93 = (float) arg1.field7368[var87] - var90;
                        float var94 = (float) arg1.field7376[var87] - var91;
                        float var95 = (float) arg1.field7352[var88] - var89;
                        float var96 = (float) arg1.field7368[var88] - var90;
                        float var97 = (float) arg1.field7376[var88] - var91;
                        float var98 = (float) arg1.field7352[var83] - var89;
                        float var99 = (float) arg1.field7368[var83] - var90;
                        float var100 = (float) arg1.field7376[var83] - var91;
                        float var101 = (float) arg1.field7352[var84] - var89;
                        float var102 = (float) arg1.field7368[var84] - var90;
                        float var103 = (float) arg1.field7376[var84] - var91;
                        float var104 = (float) arg1.field7352[var85] - var89;
                        float var105 = (float) arg1.field7368[var85] - var90;
                        float var106 = (float) arg1.field7376[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var94 * var107 - var92 * var109;
                        float var115 = var93 * var109 - var94 * var108;
                        float var116 = var92 * var108 - var93 * var107;
                        float var117 = 1.0F / (var97 * var116 + var95 * var115 + var96 * var114);
                        var76 = (var103 * var116 + var101 * var115 + var102 * var114) * var117;
                        var74 = (var100 * var116 + var98 * var115 + var99 * var114) * var117;
                        var78 = (var106 * var116 + var104 * var115 + var105 * var114) * var117;
                    } else {
                        short var118 = arg1.field7372[var68];
                        short var119 = arg1.field7364[var68];
                        short var120 = arg1.field7357[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field7343[var71];
                        float var126 = (float) arg1.field7362[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field7347[var71] / 1024.0F;
                            class321.method2000(var126, var121, var127, var125, arg1.field7368[var118], var122, var123, var124, (byte) 90, arg1.field7352[var118], arg1.field7376[var118]);
                            var74 = class125.field1557;
                            var73 = class331.field4580;
                            class321.method2000(var126, var121, var127, var125, arg1.field7368[var119], var122, var123, var124, (byte) -127, arg1.field7352[var119], arg1.field7376[var119]);
                            var75 = class331.field4580;
                            var76 = class125.field1557;
                            class321.method2000(var126, var121, var127, var125, arg1.field7368[var120], var122, var123, var124, (byte) -124, arg1.field7352[var120], arg1.field7376[var120]);
                            var77 = class331.field4580;
                            var78 = class125.field1557;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > var128) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var128 < var73 - var75) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                                if ((var128 < var77 - var73)) {
                                    var77 -= var127;
                                    var80 = 1;
                                } else if (var73 - var77 > var128) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                            } else {
                                if (var128 < var76 - var74) {
                                    var79 = 1;
                                    var76 -= var127;
                                } else if (var74 - var76 > var128) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > var128)) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var74 - var78 > var128) {
                                    var78 += var127;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field7387[var71] / 256.0F;
                            float var130 = (float) arg1.field7366[var71] / 256.0F;
                            int var131 = arg1.field7352[var119] - arg1.field7352[var118];
                            int var132 = arg1.field7368[var119] - arg1.field7368[var118];
                            int var133 = arg1.field7376[var119] - arg1.field7376[var118];
                            int var134 = arg1.field7352[var120] - arg1.field7352[var118];
                            int var135 = arg1.field7368[var120] - arg1.field7368[var118];
                            int var136 = arg1.field7376[var120] - arg1.field7376[var118];
                            int var137 = var132 * var136 - (var133 * var135);
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field7377[var71];
                            float var141 = 64.0F / (float) arg1.field7384[var71];
                            float var142 = 64.0F / (float) arg1.field7347[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class225.method1432(true, var145, var143, var144);
                            class496.method2783(var81, arg1.field7352[var118], (byte) 112, var126, var130, var129, var121, var122, var124, var125, var123, arg1.field7376[var118], arg1.field7368[var118]);
                            var73 = class248.field3121;
                            var74 = field3261;
                            class496.method2783(var81, arg1.field7352[var119], (byte) -111, var126, var130, var129, var121, var122, var124, var125, var123, arg1.field7376[var119], arg1.field7368[var119]);
                            var76 = field3261;
                            var75 = class248.field3121;
                            class496.method2783(var81, arg1.field7352[var120], (byte) -86, var126, var130, var129, var121, var122, var124, var125, var123, arg1.field7376[var120], arg1.field7368[var120]);
                            var77 = class248.field3121;
                            var78 = field3261;
                        } else if (var82 == 3) {
                            class405.method2419(var123, arg1.field7352[var118], var122, -12638, var125, var126, var121, arg1.field7368[var118], arg1.field7376[var118], var124);
                            var73 = class199.field2602;
                            var74 = class308.field3938;
                            class405.method2419(var123, arg1.field7352[var119], var122, -12638, var125, var126, var121, arg1.field7368[var119], arg1.field7376[var119], var124);
                            var75 = class199.field2602;
                            var76 = class308.field3938;
                            class405.method2419(var123, arg1.field7352[var120], var122, -12638, var125, var126, var121, arg1.field7368[var120], arg1.field7376[var120], var124);
                            var78 = class308.field3938;
                            var77 = class199.field2602;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7379 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7379[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var81 << 24) + (long) var72 + ((long) (var69 << 8)) << 32) + (long) (var71 << 2);
                short var152 = arg1.field7372[var68];
                short var153 = arg1.field7364[var68];
                short var154 = arg1.field7357[var68];
                class136 var155 = var13[var152];
                this.field3299[var52] = this.method1605(var155.field1658, 125, var155.field1661, var155.field1660, arg1, var74, var150, var73, var155.field1657, var152);
                class136 var156 = var13[var153];
                this.field3262[var52] = this.method1605(var156.field1658, 76, var156.field1661, var156.field1660, arg1, var76, (long) var79 + var150, var75, var156.field1657, var153);
                class136 var157 = var13[var154];
                this.field3226[var52] = this.method1605(var157.field1658, 102, var157.field1661, var157.field1660, arg1, var78, (long) var80 + var150, var77, var157.field1657, var154);
            } else if (var146 == 1) {
                class620 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) ((var147.field8922 + 256 << 22) + (var71 << 2) + (var147.field8921 <= 0 ? 2048 : 1024) + (var147.field8926 + 256 << 12));
                this.field3299[var52] = this.method1605(0, 94, var147.field8921, var147.field8926, arg1, var74, var148, var73, var147.field8922, arg1.field7372[var68]);
                this.field3262[var52] = this.method1605(0, 108, var147.field8921, var147.field8926, arg1, var76, (long) var79 + var148, var75, var147.field8922, arg1.field7364[var68]);
                this.field3226[var52] = this.method1605(0, 115, var147.field8921, var147.field8926, arg1, var78, (long) var80 + var148, var77, var147.field8922, arg1.field7357[var68]);
            }
            if (arg1.field7375 == null) {
                this.field3244[var52] = -1;
            } else {
                this.field3244[var52] = arg1.field7375[var68];
            }
            if (arg1.field7341 != null) {
                this.field3220[var52] = arg1.field7341[var68];
            }
            if (arg1.field7363 != null) {
                this.field3295[var52] = arg1.field7363[var68];
            }
            this.field3232[var52] = arg1.field7349[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3279; var55++) {
            short var67 = this.field3244[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field3258 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field3279; var58++) {
            short var66 = this.field3244[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field3258[var56++] = var58;
            }
        }
        this.field3258[var56] = this.field3279;
        class505.field7021 = null;
        this.field3236 = class257.method1546(this.field3272, this.field3236, (byte) 121);
        this.field3315 = class257.method1546(this.field3272, this.field3315, (byte) 125);
        this.field3317 = class257.method1546(this.field3272, this.field3317, (byte) 103);
        this.field3270 = class293.method1799(this.field3270, this.field3272, -16960);
        this.field3310 = class181.method1109(this.field3310, (byte) -58, this.field3272);
        this.field3237 = class181.method1109(this.field3237, (byte) -105, this.field3272);
        if (arg1.field7346 != null && class310.method1866(arg2, this.field3274, 5170)) {
            this.field3283 = arg1.method2938(-28998, false);
        }
        if (arg1.field7359 != null && class52.method286(26, this.field3274, arg2)) {
            this.field3265 = arg1.method2945((byte) -115);
        }
        if (arg1.field7340 != null && class4.method12(this.field3274, false, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3316; var61++) {
                int var65 = arg1.field7340[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field3305 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3305[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3316; var63++) {
                int var64 = arg1.field7340[var8[var63]];
                if (var64 >= 0) {
                    this.field3305[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
