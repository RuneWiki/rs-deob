import jaclib.memory.Stream;
import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class242 extends class157 {

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    private int field3038 = 0;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Z")
    private boolean field3015 = false;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    private int field3020 = 0;

    @OriginalMember(owner = "client!sb", name = "Lb", descriptor = "I")
    private int field3084 = 0;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    private int field3013 = 0;

    @OriginalMember(owner = "client!sb", name = "sc", descriptor = "I")
    private int field3117 = 0;

    @OriginalMember(owner = "client!sb", name = "xc", descriptor = "Z")
    private boolean field3122 = true;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lmh;")
    private class537 field3053;

    @OriginalMember(owner = "client!sb", name = "Xb", descriptor = "Lro;")
    private class2 field3096;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lro;")
    private class2 field3018;

    @OriginalMember(owner = "client!sb", name = "Rb", descriptor = "Lro;")
    private class2 field3090;

    @OriginalMember(owner = "client!sb", name = "Kb", descriptor = "Lro;")
    private class2 field3083;

    @OriginalMember(owner = "client!sb", name = "fc", descriptor = "Lsr;")
    private class210 field3104;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!sb", name = "nc", descriptor = "I")
    private int field3112;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "[I")
    private int[] field3049;

    @OriginalMember(owner = "client!sb", name = "Sb", descriptor = "[S")
    private short[] field3091;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "[I")
    private int[] field3037;

    @OriginalMember(owner = "client!sb", name = "qc", descriptor = "[I")
    private int[] field3115;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "[I")
    private int[] field3052;

    @OriginalMember(owner = "client!sb", name = "vc", descriptor = "[Ldl;")
    private class55[] field3120;

    @OriginalMember(owner = "client!sb", name = "zc", descriptor = "[Lfr;")
    private class348[] field3124;

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    private int field3063;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "[Lst;")
    private class366[] field3051;

    @OriginalMember(owner = "client!sb", name = "wc", descriptor = "[Lmj;")
    private class559[] field3121;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "[B")
    private byte[] field3057;

    @OriginalMember(owner = "client!sb", name = "Ub", descriptor = "[S")
    private short[] field3093;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "[S")
    private short[] field3060;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "[S")
    private short[] field3045;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "[S")
    private short[] field3029;

    @OriginalMember(owner = "client!sb", name = "Tb", descriptor = "[F")
    private float[] field3092;

    @OriginalMember(owner = "client!sb", name = "yc", descriptor = "[S")
    private short[] field3123;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "[S")
    private short[] field3024;

    @OriginalMember(owner = "client!sb", name = "Wb", descriptor = "S")
    private short field3095;

    @OriginalMember(owner = "client!sb", name = "xb", descriptor = "[S")
    private short[] field3070;

    @OriginalMember(owner = "client!sb", name = "Vb", descriptor = "[B")
    private byte[] field3094;

    @OriginalMember(owner = "client!sb", name = "Eb", descriptor = "[S")
    private short[] field3077;

    @OriginalMember(owner = "client!sb", name = "pc", descriptor = "[S")
    private short[] field3114;

    @OriginalMember(owner = "client!sb", name = "ub", descriptor = "[S")
    private short[] field3067;

    @OriginalMember(owner = "client!sb", name = "gc", descriptor = "S")
    private short field3105;

    @OriginalMember(owner = "client!sb", name = "Fb", descriptor = "[F")
    private float[] field3078;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "[I")
    private int[] field3044;

    @OriginalMember(owner = "client!sb", name = "ic", descriptor = "[[I")
    private int[][] field3107;

    @OriginalMember(owner = "client!sb", name = "Pb", descriptor = "[[I")
    private int[][] field3088;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "[[I")
    private int[][] field3036;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "[J")
    public static long[] field3025 = new long[256];

    @OriginalMember(owner = "client!sb", name = "oc", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!sb", name = "hc", descriptor = "Lvj;")
    public static class373 field3106;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "B")
    private byte field3017;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!sb", name = "vb", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!sb", name = "wb", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!sb", name = "yb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!sb", name = "zb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!sb", name = "Ab", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!sb", name = "Cb", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!sb", name = "Gb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!sb", name = "Hb", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!sb", name = "Ib", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!sb", name = "Jb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!sb", name = "Ob", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!sb", name = "Qb", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!sb", name = "Yb", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!sb", name = "Zb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!sb", name = "ac", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!sb", name = "bc", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!sb", name = "ec", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!sb", name = "jc", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!sb", name = "kc", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!sb", name = "lc", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!sb", name = "tc", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!sb", name = "uc", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!sb", name = "Nb", descriptor = "Lqo;")
    private class21 field3086;

    @OriginalMember(owner = "client!sb", name = "mc", descriptor = "Lwj;")
    private class332 field3111;

    @OriginalMember(owner = "client!sb", name = "rc", descriptor = "Lks;")
    private class371 field3116;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "S")
    private short field3033;

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "S")
    private short field3065;

    @OriginalMember(owner = "client!sb", name = "Bb", descriptor = "S")
    private short field3074;

    @OriginalMember(owner = "client!sb", name = "Db", descriptor = "S")
    private short field3076;

    @OriginalMember(owner = "client!sb", name = "Mb", descriptor = "S")
    private short field3085;

    @OriginalMember(owner = "client!sb", name = "cc", descriptor = "S")
    private short field3101;

    @OriginalMember(owner = "client!sb", name = "dc", descriptor = "S")
    private short field3102;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3025[var0] = var1;
        }
        field3113 = -1;
        field3106 = new class373(75, 5);
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V", line = 5)
    public final void method58(int arg0) {
        field3032++;
        if (this.field3083 != null) {
            this.field3083.field2 = null;
        }
        this.field3105 = (short) arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILm;Z)Z", line = 21)
    public final boolean method91(int arg0, int arg1, class163 arg2, boolean arg3) {
        field3079++;
        class113 var5 = (class113) arg2;
        class113 var6 = this.field3053.field7762;
        float var7 = var5.field1396 * var6.field1394 + var5.field1392 * var6.field1404 + var5.field1389 * var6.field1412 + var6.field1389;
        float var8 = var5.field1396 * var6.field1399 + var5.field1392 * var6.field1379 + var5.field1389 * var6.field1377 + var6.field1392;
        class312.field3994 = var5.field1383 * var6.field1399 + var5.field1412 * var6.field1377 + var5.field1377 * var6.field1379;
        class277.field3655 = var5.field1381 * var6.field1399 + var5.field1404 * var6.field1377 + var5.field1379 * var6.field1379;
        class175.field2133 = var5.field1383 * var6.field1409 + var5.field1412 * var6.field1383 + var5.field1377 * var6.field1381;
        class633.field9118 = var5.field1409 * var6.field1409 + var5.field1399 * var6.field1381 + var5.field1394 * var6.field1383;
        class62.field603 = var5.field1381 * var6.field1394 + var5.field1404 * var6.field1412 + var5.field1379 * var6.field1404;
        class314.field4011 = var5.field1409 * var6.field1399 + var5.field1399 * var6.field1379 + var5.field1394 * var6.field1377;
        class325.field4146 = var5.field1381 * var6.field1409 + var5.field1404 * var6.field1383 + var5.field1379 * var6.field1381;
        class257.field3310 = var5.field1409 * var6.field1394 + var5.field1399 * var6.field1404 + var5.field1394 * var6.field1412;
        float var9 = var5.field1396 * var6.field1409 + var5.field1392 * var6.field1381 + var5.field1389 * var6.field1383 + var6.field1396;
        class266.field3454 = var5.field1383 * var6.field1394 + var5.field1412 * var6.field1412 + var5.field1377 * var6.field1404;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field3053.field7864;
        int var16 = this.field3053.field7773;
        if (!this.field3015) {
            this.method1365(32767);
        }
        class207.field2487[0] = this.field3033;
        class206.field2485[0] = this.field3101;
        class558.field8222[0] = this.field3074;
        class207.field2487[1] = this.field3076;
        class206.field2485[1] = this.field3101;
        class558.field8222[1] = this.field3074;
        class207.field2487[2] = this.field3033;
        class206.field2485[2] = this.field3085;
        class558.field8222[2] = this.field3074;
        class207.field2487[3] = this.field3076;
        class206.field2485[3] = this.field3085;
        class558.field8222[3] = this.field3074;
        class207.field2487[4] = this.field3033;
        class206.field2485[4] = this.field3101;
        class558.field8222[4] = this.field3102;
        class207.field2487[5] = this.field3076;
        class206.field2485[5] = this.field3101;
        class558.field8222[5] = this.field3102;
        class207.field2487[6] = this.field3033;
        class206.field2485[6] = this.field3085;
        class207.field2487[7] = this.field3076;
        class558.field8222[6] = this.field3102;
        class206.field2485[7] = this.field3085;
        class558.field8222[7] = this.field3102;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class207.field2487[var17];
            float var39 = (float) class558.field8222[var17];
            float var40 = (float) class206.field2485[var17];
            float var41 = class314.field4011 * var39 + class312.field3994 * var38 + class277.field3655 * var40 + var8;
            float var42 = class257.field3310 * var39 + class62.field603 * var40 + class266.field3454 * var38 + var7;
            float var43 = class633.field9118 * var39 + class325.field4146 * var40 + class175.field2133 * var38 + var9;
            if (var43 >= (float) this.field3053.field7833) {
                float var44 = (float) var15 * var42 / var43 + (float) this.field3053.field7832;
                if (var44 > var12) {
                    var12 = var44;
                }
                if (var44 < var11) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var41 / var43 + (float) this.field3053.field7792;
                if (var45 > var14) {
                    var14 = var45;
                }
                if (var45 < var13) {
                    var13 = var45;
                }
                var10 = true;
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field3053.field7879.length < this.field3013) {
                this.field3053.field7874 = new int[this.field3013];
                this.field3053.field7879 = new int[this.field3013];
            }
            int[] var18 = this.field3053.field7879;
            int[] var19 = this.field3053.field7874;
            for (int var20 = 0; var20 < this.field3038; var20++) {
                float var22 = (float) this.field3115[var20];
                float var23 = (float) this.field3037[var20];
                float var24 = (float) this.field3052[var20];
                float var25 = class633.field9118 * var22 + class325.field4146 * var23 + class175.field2133 * var24 + var9;
                float var26 = class314.field4011 * var22 + class312.field3994 * var24 + class277.field3655 * var23 + var8;
                float var27 = class257.field3310 * var22 + class62.field603 * var23 + class266.field3454 * var24 + var7;
                if ((float) this.field3053.field7833 <= var25) {
                    int var28 = (int) ((float) var15 * var27 / var25 + (float) this.field3053.field7832);
                    int var29 = (int) ((float) var16 * var26 / var25 + (float) this.field3053.field7792);
                    int var30 = this.field3049[var20];
                    int var31 = this.field3049[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field3123[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field3049[var20];
                    int var35 = this.field3049[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field3123[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field3123[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field3117; var21++) {
                if (var18[this.field3070[var21]] != -999999 && var18[this.field3077[var21]] != -999999 && var18[this.field3029[var21]] != -999999 && this.method1369(var19[this.field3070[var21]], arg1, var19[this.field3029[var21]], var18[this.field3029[var21]], var18[this.field3077[var21]], arg0, var18[this.field3070[var21]], (byte) 58, var19[this.field3077[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sb", name = "TA", descriptor = "()I", line = 232)
    public final int method74() {
        field3080++;
        if (!this.field3015) {
            this.method1365(32767);
        }
        return this.field3101;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 246)
    private final void method1364(byte arg0) {
        field3108++;
        if (!this.field3122) {
            return;
        }
        this.field3122 = false;
        if (this.field3120 == null && this.field3124 == null && this.field3121 == null) {
            if (this.field3052 != null && !class294.method1645(this.field3016, this.field3112, arg0 ^ 0xFFFFFFC7)) {
                if (this.field3096 != null && this.field3096.field2 == null) {
                    this.field3122 = true;
                } else {
                    if (!this.field3015) {
                        this.method1365(arg0 ^ 0xFFFF8039);
                    }
                    this.field3052 = null;
                }
            }
            if (this.field3037 != null && !class386.method2223(this.field3016, 86, this.field3112)) {
                if (this.field3096 != null && this.field3096.field2 == null) {
                    this.field3122 = true;
                } else {
                    if (!this.field3015) {
                        this.method1365(32767);
                    }
                    this.field3037 = null;
                }
            }
            if (this.field3115 != null && !class213.method1220(this.field3016, -109, this.field3112)) {
                if (this.field3096 != null && this.field3096.field2 == null) {
                    this.field3122 = true;
                } else {
                    if (!this.field3015) {
                        this.method1365(arg0 ^ 0xFFFF8039);
                    }
                    this.field3115 = null;
                }
            }
        }
        if (this.field3123 != null && this.field3052 == null && this.field3037 == null && this.field3115 == null) {
            this.field3123 = null;
            this.field3049 = null;
        }
        if (this.field3057 != null && !class58.method340(-112, this.field3016, this.field3112)) {
            if (this.field3090 == null) {
                if (this.field3083 != null && this.field3083.field2 == null) {
                    this.field3122 = true;
                } else {
                    this.field3067 = this.field3045 = this.field3060 = null;
                    this.field3057 = null;
                }
            } else if (this.field3090.field2 == null) {
                this.field3122 = true;
            } else {
                this.field3057 = null;
                this.field3067 = this.field3045 = this.field3060 = null;
            }
        }
        if (this.field3093 != null && !class431.method2494(this.field3112, this.field3016, 119)) {
            if (this.field3083 != null && this.field3083.field2 == null) {
                this.field3122 = true;
            } else {
                this.field3093 = null;
            }
        }
        if (this.field3094 != null && !class194.method1057(false, this.field3016, this.field3112)) {
            if (this.field3083 != null && this.field3083.field2 == null) {
                this.field3122 = true;
            } else {
                this.field3094 = null;
            }
        }
        if (this.field3092 != null && !class246.method1387(this.field3016, this.field3112, 106)) {
            if (this.field3018 != null && this.field3018.field2 == null) {
                this.field3122 = true;
            } else {
                this.field3092 = this.field3078 = null;
            }
        }
        if (arg0 != -58) {
            this.field3091 = null;
        }
        if (this.field3024 != null && !class640.method3670((byte) 98, this.field3112, this.field3016)) {
            if (this.field3083 != null && this.field3083.field2 == null) {
                this.field3122 = true;
            } else {
                this.field3024 = null;
            }
        }
        if (this.field3070 != null && !class351.method1955((byte) -45, this.field3112, this.field3016)) {
            if ((this.field3104 == null || this.field3104.field2559 != null) && (this.field3083 == null || this.field3083.field2 != null)) {
                this.field3070 = this.field3077 = this.field3029 = null;
            } else {
                this.field3122 = true;
            }
        }
        if (this.field3036 != null && !class325.method1783(this.field3016, (byte) 11, this.field3112)) {
            this.field3036 = null;
            this.field3114 = null;
        }
        if (this.field3107 != null && !class311.method1728(this.field3016, false, this.field3112)) {
            this.field3107 = null;
            this.field3091 = null;
        }
        if (this.field3088 != null && !class207.method1196(this.field3112, (byte) 62, this.field3016)) {
            this.field3088 = null;
        }
        if (this.field3044 != null && (this.field3016 & 0x800) == 0 && (this.field3016 & 0x40000) == 0) {
            this.field3044 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 426)
    private final void method1365(int arg0) {
        field3014++;
        int var2 = arg0;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3038; var10++) {
            int var11 = this.field3052[var10];
            int var12 = this.field3037[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            int var13 = this.field3115[var10];
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field3076 = (short) var5;
        this.field3101 = (short) var3;
        this.field3102 = (short) var7;
        this.field3033 = (short) var2;
        this.field3085 = (short) var6;
        this.field3074 = (short) var4;
        this.field3065 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field3015 = true;
    }

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "(I)V", line = 508)
    public final void method94(int arg0) {
        if (this.field3083 != null) {
            this.field3083.field2 = null;
        }
        this.field3095 = (short) arg0;
        field3109++;
        if (this.field3090 != null) {
            this.field3090.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V", line = 531)
    public final void method97() {
        field3028++;
        if (this.field3013 <= 0 || this.field3020 <= 0) {
            return;
        }
        this.method1377(4139, false);
        if ((this.field3017 & 0x10) == 0 && this.field3104.field2559 == null) {
            this.method1366((byte) 115, false);
        }
        this.method1364((byte) -58);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lr;IIIZ)V", line = 548)
    public final void method67(class157 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3022++;
        class242 var6 = (class242) arg0;
        if (this.field3117 == 0 || var6.field3117 == 0) {
            return;
        }
        int var7 = var6.field3038;
        int[] var8 = var6.field3052;
        int[] var9 = var6.field3037;
        int[] var10 = var6.field3115;
        short[] var11 = var6.field3067;
        short[] var12 = var6.field3045;
        short[] var13 = var6.field3060;
        byte[] var14 = var6.field3057;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3116 == null) {
            var16 = null;
            var17 = null;
            var18 = null;
            var15 = null;
        } else {
            var15 = this.field3116.field4887;
            var16 = this.field3116.field4885;
            var17 = this.field3116.field4890;
            var18 = this.field3116.field4889;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3116 == null) {
            var21 = null;
            var22 = null;
            var20 = null;
            var19 = null;
        } else {
            var19 = var6.field3116.field4887;
            var20 = var6.field3116.field4885;
            var21 = var6.field3116.field4890;
            var22 = var6.field3116.field4889;
        }
        int[] var23 = var6.field3049;
        short[] var24 = var6.field3123;
        if (!var6.field3015) {
            var6.method1365(32767);
        }
        short var25 = var6.field3101;
        short var26 = var6.field3085;
        short var27 = var6.field3033;
        short var28 = var6.field3076;
        short var29 = var6.field3074;
        short var30 = var6.field3102;
        for (int var31 = 0; var31 < this.field3038; var31++) {
            int var32 = this.field3037[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field3052[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field3115[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3049[var31];
                        int var37 = this.field3049[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3123[var38] - 1;
                            if (var35 == -1 || this.field3057[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39 + 1];
                                    int var42 = var23[var39];
                                    for (int var43 = var42; var43 < var41; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var16 == null) {
                                            this.field3116 = new class371();
                                            var16 = this.field3116.field4885 = class209.method1205((byte) -11, this.field3067);
                                            var17 = this.field3116.field4890 = class209.method1205((byte) -11, this.field3045);
                                            var18 = this.field3116.field4889 = class209.method1205((byte) -11, this.field3060);
                                            var15 = this.field3116.field4887 = class86.method504(0, this.field3057);
                                        }
                                        if (var20 == null) {
                                            class371 var44 = var6.field3116 = new class371();
                                            var20 = var44.field4885 = class209.method1205((byte) -11, var11);
                                            var21 = var44.field4890 = class209.method1205((byte) -11, var12);
                                            var22 = var44.field4889 = class209.method1205((byte) -11, var13);
                                            var19 = var44.field4887 = class86.method504(0, var14);
                                        }
                                        short var45 = this.field3067[var35];
                                        short var46 = this.field3045[var35];
                                        short var47 = this.field3060[var35];
                                        int var48 = var23[var39];
                                        byte var49 = this.field3057[var35];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var48; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field3049[var31];
                                        short var54 = var11[var40];
                                        byte var55 = var14[var40];
                                        short var56 = var13[var40];
                                        int var57 = this.field3049[var31 + 1];
                                        short var58 = var12[var40];
                                        for (int var59 = var53; var59 < var57; var59++) {
                                            int var60 = this.field3123[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var54;
                                                var17[var60] += var58;
                                                var18[var60] += var56;
                                                var15[var60] += var55;
                                            }
                                        }
                                        if (this.field3090 == null && this.field3083 != null) {
                                            this.field3083.field2 = null;
                                        }
                                        if (this.field3090 != null) {
                                            this.field3090.field2 = null;
                                        }
                                        if (var6.field3090 == null && var6.field3083 != null) {
                                            var6.field3083.field2 = null;
                                        }
                                        if (var6.field3090 != null) {
                                            var6.field3090.field2 = null;
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

    @OriginalMember(owner = "client!sb", name = "BA", descriptor = "(I[IIIIZI[I)V", line = 819)
    public final void method84(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3066++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class403.field5292 = 0;
            int var13 = 0;
            class129.field1587 = 0;
            class15.field115 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3107.length) {
                    int[] var16 = this.field3107[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3091 == null || (arg6 & this.field3091[var18]) != 0) {
                            class15.field115 += this.field3052[var18];
                            class129.field1587 += this.field3037[var18];
                            var13++;
                            class403.field5292 += this.field3115[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class15.field115 = var11;
                class403.field5292 = var12;
                class129.field1587 = var10;
            } else {
                class129.field1587 = class129.field1587 / var13 + var10;
                class15.field115 = class15.field115 / var13 + var11;
                class403.field5292 = class403.field5292 / var13 + var12;
                class33.field259 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 16384 >> 15;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + (arg7[8] * arg4) + 16384 >> 15;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3107.length) {
                    int[] var27 = this.field3107[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3091 == null || (arg6 & this.field3091[var29]) != 0) {
                            this.field3052[var29] += var24;
                            this.field3037[var29] += var23;
                            this.field3115[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field3107.length > var109) {
                        int[] var110 = this.field3107[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field3091 == null || (this.field3091[var112] & arg6) != 0) {
                                this.field3052[var112] -= class15.field115;
                                this.field3037[var112] -= class129.field1587;
                                this.field3115[var112] -= class403.field5292;
                                if (arg4 != 0) {
                                    int var113 = class442.field6100[arg4];
                                    int var114 = class442.field6101[arg4];
                                    int var115 = this.field3037[var112] * var113 + (this.field3052[var112] * var114) + 32767 >> 15;
                                    this.field3037[var112] = this.field3037[var112] * var114 + 32767 - (this.field3052[var112] * var113) >> 15;
                                    this.field3052[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class442.field6100[arg2];
                                    int var117 = class442.field6101[arg2];
                                    int var118 = this.field3037[var112] * var117 + 32767 - (this.field3115[var112] * var116) >> 15;
                                    this.field3115[var112] = this.field3115[var112] * var117 + (this.field3037[var112] * var116 + 32767) >> 15;
                                    this.field3037[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class442.field6100[arg3];
                                    int var120 = class442.field6101[arg3];
                                    int var121 = this.field3115[var112] * var119 + this.field3052[var112] * var120 + 32767 >> 15;
                                    this.field3115[var112] = this.field3115[var112] * var120 + 32767 - (this.field3052[var112] * var119) >> 15;
                                    this.field3052[var112] = var121;
                                }
                                this.field3052[var112] += class15.field115;
                                this.field3037[var112] += class129.field1587;
                                this.field3115[var112] += class403.field5292;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field3107.length > var92) {
                            int[] var93 = this.field3107[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field3091 == null || (this.field3091[var95] & arg6) != 0) {
                                    int var96 = this.field3049[var95];
                                    int var97 = this.field3049[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field3123[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class442.field6100[arg4];
                                            int var101 = class442.field6101[arg4];
                                            int var102 = this.field3067[var99] * var101 + this.field3045[var99] * var100 + 32767 >> 15;
                                            this.field3045[var99] = (short) (this.field3045[var99] * var101 + 32767 - (this.field3067[var99] * var100) >> 15);
                                            this.field3067[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class442.field6100[arg2];
                                            int var104 = class442.field6101[arg2];
                                            int var105 = this.field3045[var99] * var104 + 32767 - this.field3060[var99] * var103 >> 15;
                                            this.field3060[var99] = (short) (this.field3060[var99] * var104 + this.field3045[var99] * var103 + 32767 >> 15);
                                            this.field3045[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class442.field6100[arg3];
                                            int var107 = class442.field6101[arg3];
                                            int var108 = this.field3060[var99] * var106 + (this.field3067[var99] * var107) + 32767 >> 15;
                                            this.field3060[var99] = (short) (this.field3060[var99] * var107 + 32767 - (this.field3067[var99] * var106) >> 15);
                                            this.field3067[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3090 == null && this.field3083 != null) {
                        this.field3083.field2 = null;
                    }
                    if (this.field3090 != null) {
                        this.field3090.field2 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class33.field259) {
                    int var36 = arg7[3] * class129.field1587 + arg7[0] * class15.field115 + (arg7[6] * class403.field5292) + 16384 >> 15;
                    int var37 = arg7[7] * class403.field5292 + (arg7[1] * class15.field115 + arg7[4] * class129.field1587 + 16384) >> 15;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[2] * class15.field115 + 16384 - (-(arg7[5] * class129.field1587) - arg7[8] * class403.field5292) >> 15;
                    class15.field115 = var38;
                    int var41 = var35 + var40;
                    class129.field1587 = var39;
                    class33.field259 = false;
                    class403.field5292 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class442.field6101[arg2];
                int var44 = class442.field6100[arg2];
                int var45 = class442.field6101[arg3];
                int var46 = class442.field6100[arg3];
                int var47 = class442.field6101[arg4];
                int var48 = class442.field6100[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[6] = var45 * var50 + (-var46 * var47 + 16384) >> 15;
                var42[5] = -var44;
                var42[7] = var46 * var48 + (var45 * var49) + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                int var51 = var42[2] * -class403.field5292 + var42[0] * -class15.field115 + var42[1] * -class129.field1587 + 16384 >> 15;
                int var52 = var42[3] * -class15.field115 + (var42[5] * -class403.field5292) + var42[4] * -class129.field1587 + 16384 >> 15;
                int var53 = var42[8] * -class403.field5292 + var42[6] * -class15.field115 - (-(var42[7] * -class129.field1587) + -16384) >> 15;
                int var54 = class15.field115 + var51;
                int var55 = class129.field1587 + var52;
                int var56 = class403.field5292 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 16384 >> 15;
                    }
                }
                int var59 = var42[2] * var35 + var42[1] * var34 + var42[0] * var33 + 16384 >> 15;
                int var60 = var42[5] * var35 + var42[3] * var33 + (var42[4] * var34) + 16384 >> 15;
                int var61 = var55 + var60;
                int var62 = var54 + var59;
                int var63 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += var57[var84 + (var86 * 3)] * arg7[var66 * 3 + var86];
                        }
                        var65[var66 * 3 + var84] = var85 + 16384 >> 15;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[1] * var61 + arg7[0] * var62 + 16384 >> 15;
                int var68 = arg7[5] * var64 + (arg7[3] * var62 + (arg7[4] * var61)) + 16384 >> 15;
                int var69 = var31 + var68;
                int var70 = arg7[8] * var64 + arg7[7] * var61 + arg7[6] * var62 + 16384 >> 15;
                int var71 = var30 + var67;
                int var72 = var32 + var70;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field3107.length) {
                        int[] var75 = this.field3107[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field3091 == null || (arg6 & this.field3091[var77]) != 0) {
                                int var78 = this.field3115[var77] * var65[2] + this.field3037[var77] * var65[1] + this.field3052[var77] * var65[0] + 16384 >> 15;
                                int var79 = this.field3115[var77] * var65[5] + this.field3052[var77] * var65[3] + this.field3037[var77] * var65[4] + 16384 >> 15;
                                int var80 = var69 + var79;
                                int var81 = var71 + var78;
                                int var82 = this.field3037[var77] * var65[7] + this.field3115[var77] * var65[8] + this.field3052[var77] * var65[6] + 16384 >> 15;
                                this.field3052[var77] = var81;
                                int var83 = var72 + var82;
                                this.field3037[var77] = var80;
                                this.field3115[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3107.length) {
                        int[] var174 = this.field3107[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3091 == null || (arg6 & this.field3091[var176]) != 0) {
                                this.field3052[var176] -= class15.field115;
                                this.field3037[var176] -= class129.field1587;
                                this.field3115[var176] -= class403.field5292;
                                this.field3052[var176] = this.field3052[var176] * arg2 >> 7;
                                this.field3037[var176] = this.field3037[var176] * arg3 >> 7;
                                this.field3115[var176] = this.field3115[var176] * arg4 >> 7;
                                this.field3052[var176] += class15.field115;
                                this.field3037[var176] += class129.field1587;
                                this.field3115[var176] += class403.field5292;
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
                if (class33.field259) {
                    int var128 = arg7[6] * class403.field5292 + arg7[0] * class15.field115 + arg7[3] * class129.field1587 + 16384 >> 15;
                    int var129 = arg7[7] * class403.field5292 + arg7[4] * class129.field1587 + arg7[1] * class15.field115 + 16384 >> 15;
                    int var130 = arg7[2] * class15.field115 + arg7[5] * class129.field1587 + arg7[8] * class403.field5292 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    class15.field115 = var131;
                    class129.field1587 = var132;
                    class403.field5292 = var133;
                    class33.field259 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class15.field115 * var134 + 16384 >> 15;
                int var138 = -class129.field1587 * var135 + 16384 >> 15;
                int var139 = -class403.field5292 * var136 + 16384 >> 15;
                int var140 = class15.field115 + var137;
                int var141 = class129.field1587 + var138;
                int var142 = class403.field5292 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var140 + var144;
                int var147 = var127 * var136 + 16384 >> 15;
                int var148 = var141 + var145;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[0] * var146 - (-(arg7[1] * var148) - (arg7[2] * var149) - 16384) >> 15;
                int var153 = arg7[3] * var146 + arg7[4] * var148 - (-(arg7[5] * var149) - 16384) >> 15;
                int var154 = arg7[6] * var146 + arg7[7] * var148 + arg7[8] * var149 + 16384 >> 15;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field3107.length) {
                        int[] var160 = this.field3107[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field3091 == null || (arg6 & this.field3091[var162]) != 0) {
                                int var163 = this.field3037[var162] * var150[1] + this.field3052[var162] * var150[0] + (this.field3115[var162] * var150[2]) + 16384 >> 15;
                                int var164 = this.field3037[var162] * var150[4] + this.field3052[var162] * var150[3] + this.field3115[var162] * var150[5] + 16384 >> 15;
                                int var165 = var156 + var163;
                                int var166 = var155 + var164;
                                int var167 = this.field3115[var162] * var150[8] + this.field3052[var162] * var150[6] + (this.field3037[var162] * var150[7] - -16384) >> 15;
                                this.field3052[var162] = var165;
                                int var168 = var157 + var167;
                                this.field3037[var162] = var166;
                                this.field3115[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3036 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field3036.length) {
                        int[] var182 = this.field3036[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3114 == null || (this.field3114[var184] & arg6) != 0) {
                                int var185 = (this.field3094[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3094[var184] = (byte) var185;
                                if (this.field3083 != null) {
                                    this.field3083.field2 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3121 != null) {
                    for (int var178 = 0; var178 < this.field3063; var178++) {
                        class559 var179 = this.field3121[var178];
                        class366 var180 = this.field3051[var178];
                        var180.field4811 = 255 - (this.field3094[var179.field8225] & 0xFF) << 24 | var180.field4811 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3036 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field3036.length) {
                        int[] var191 = this.field3036[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3114 == null || (arg6 & this.field3114[var193]) != 0) {
                                int var194 = this.field3093[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF26) >> 10;
                                int var196 = (var194 & 0x384) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = var195 + arg2 & 0x3F;
                                int var200 = arg4 + var198;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field3093[var193] = (short) class42.method223(class42.method223(var197 << 7, var199 << 10), var200);
                                if (this.field3083 != null) {
                                    this.field3083.field2 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3121 != null) {
                    for (int var187 = 0; var187 < this.field3063; var187++) {
                        class559 var188 = this.field3121[var187];
                        class366 var189 = this.field3051[var187];
                        var189.field4811 = var189.field4811 & 0xFF000000 | class103.field1259[this.field3093[var188.field8225] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3088 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field3088.length > var202) {
                        int[] var203 = this.field3088[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class366 var205 = this.field3051[var203[var204]];
                            var205.field4807 += arg2;
                            var205.field4813 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3088 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field3088.length > var207) {
                        int[] var208 = this.field3088[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class366 var210 = this.field3051[var208[var209]];
                            var210.field4806 = var210.field4806 * arg3 >> 7;
                            var210.field4812 = var210.field4812 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3088 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field3088.length) {
                    int[] var213 = this.field3088[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class366 var215 = this.field3051[var213[var214]];
                        var215.field4808 = var215.field4808 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIZ)Lr;", line = 1807)
    public final class157 method64(byte arg0, int arg1, boolean arg2) {
        field3027++;
        class242 var4;
        class242 var5;
        if (arg0 == 1) {
            var4 = this.field3053.field7845;
            var5 = this.field3053.field7815;
        } else if (arg0 == 2) {
            var5 = this.field3053.field7849;
            var4 = this.field3053.field7791;
        } else if (arg0 == 3) {
            var5 = this.field3053.field7787;
            var4 = this.field3053.field7843;
        } else if (arg0 == 4) {
            var4 = this.field3053.field7793;
            var5 = this.field3053.field7782;
        } else if (arg0 == 5) {
            var4 = this.field3053.field7799;
            var5 = this.field3053.field7806;
        } else {
            var4 = var5 = new class242(this.field3053);
        }
        return this.method1374(-56, arg0 != 0, var4, var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V", line = 1858)
    private final void method1366(byte arg0, boolean arg1) {
        if (this.field3020 * 6 <= this.field3053.field7852.field4929.length) {
            this.field3053.field7852.field4966 = 0;
        } else {
            this.field3053.field7852 = new class385((this.field3020 + 100) * 6);
        }
        field3043++;
        class385 var3 = this.field3053.field7852;
        if (this.field3053.field7754) {
            for (int var5 = 0; var5 < this.field3020; var5++) {
                var3.method2115(this.field3070[var5], 3324);
                var3.method2115(this.field3077[var5], arg0 + 3209);
                var3.method2115(this.field3029[var5], 3324);
            }
        } else {
            for (int var4 = 0; var4 < this.field3020; var4++) {
                var3.method2097(-985, this.field3070[var4]);
                var3.method2097(-985, this.field3077[var4]);
                var3.method2097(arg0 ^ 0xFFFFFC54, this.field3029[var4]);
            }
        }
        if (var3.field4966 == 0) {
            return;
        }
        if (arg1) {
            if (this.field3111 == null) {
                this.field3111 = this.field3053.method3137(var3.field4929, 5123, arg0 - 228, true, var3.field4966);
            } else {
                this.field3111.method1862(-32036, var3.field4966, var3.field4929, 5123);
            }
            this.field3104.field2559 = this.field3111;
        } else {
            this.field3104.field2559 = this.field3053.method3137(var3.field4929, 5123, -46, false, var3.field4966);
        }
        if (arg0 == 115 && !arg1) {
            this.field3122 = true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(SIIZB)I", line = 1925)
    private final int method1367(short arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field3012++;
        int var6 = class103.field1259[class489.method2830(arg1, 92, arg2)];
        if (!arg3) {
            return 37;
        }
        if (arg0 != -1) {
            class217 var7 = this.field3053.field2481.method119(-120, arg0 & 0xFFFF);
            int var8 = var7.field2656 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 <= 127) {
                    var9 = arg2 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field2644 & 0xFF;
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
                var6 = (var15 >> 8) + ((var13 << 8 & 0xFF00A6) + (var14 & 0xFF00));
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lm;Lcf;II)V", line = 1997)
    public final void method63(class163 arg0, class517 arg1, int arg2, int arg3) {
        field3082++;
        if (this.field3013 == 0) {
            return;
        }
        class113 var5 = this.field3053.field7762;
        class113 var6 = (class113) arg0;
        if (!this.field3015) {
            this.method1365(32767);
        }
        class24.field162 = var5.field1409 * var6.field1396 + var5.field1383 * var6.field1389 + var5.field1381 * var6.field1392 + var5.field1396;
        class325.field4146 = var5.field1409 * var6.field1381 + var5.field1383 * var6.field1404 + var5.field1381 * var6.field1379;
        float var7 = (float) this.field3101 * class325.field4146 + class24.field162;
        float var8 = (float) this.field3085 * class325.field4146 + class24.field162;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field3065 + var7;
            var10 = var8 - (float) this.field3065;
        } else {
            var9 = (float) this.field3065 + var8;
            var10 = var7 - (float) this.field3065;
        }
        if ((this.field3053.field7809 <= var10) || ((float) this.field3053.field7833 >= var9)) {
            return;
        }
        class62.field603 = var5.field1394 * var6.field1381 + var5.field1412 * var6.field1404 + var5.field1404 * var6.field1379;
        class370.field4883 = var5.field1394 * var6.field1396 + var5.field1412 * var6.field1389 + var5.field1404 * var6.field1392 + var5.field1389;
        float var11 = (float) this.field3101 * class62.field603 + class370.field4883;
        float var12 = (float) this.field3085 * class62.field603 + class370.field4883;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field3065 + var11) * (float) this.field3053.field7864;
            var14 = ((float) (-this.field3065) + var12) * (float) this.field3053.field7864;
        } else {
            var13 = ((float) this.field3065 + var12) * (float) this.field3053.field7864;
            var14 = ((float) (-this.field3065) + var11) * (float) this.field3053.field7864;
        }
        if ((var14 / (float) arg2 >= this.field3053.field7803) || (this.field3053.field7818 >= var13 / (float) arg2)) {
            return;
        }
        class413.field5366 = var5.field1399 * var6.field1396 + var5.field1379 * var6.field1392 + var5.field1377 * var6.field1389 + var5.field1392;
        class277.field3655 = var5.field1399 * var6.field1381 + var5.field1379 * var6.field1379 + var5.field1377 * var6.field1404;
        float var15 = (float) this.field3101 * class277.field3655 + class413.field5366;
        float var16 = (float) this.field3085 * class277.field3655 + class413.field5366;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) (-this.field3065) + var16) * (float) this.field3053.field7773;
            var17 = ((float) this.field3065 + var15) * (float) this.field3053.field7773;
        } else {
            var17 = ((float) this.field3065 + var16) * (float) this.field3053.field7773;
            var18 = (var15 - (float) this.field3065) * (float) this.field3053.field7773;
        }
        if ((var18 / (float) arg2 >= this.field3053.field7755) || (var17 / (float) arg2 <= this.field3053.field7768)) {
            return;
        }
        if (arg1 != null || this.field3121 != null) {
            class314.field4011 = var5.field1399 * var6.field1409 + var5.field1379 * var6.field1399 + var5.field1377 * var6.field1394;
            class175.field2133 = var5.field1409 * var6.field1383 + var5.field1383 * var6.field1412 + var5.field1381 * var6.field1377;
            class257.field3310 = var5.field1394 * var6.field1409 + var5.field1412 * var6.field1394 + var5.field1404 * var6.field1399;
            class633.field9118 = var5.field1409 * var6.field1409 + var5.field1383 * var6.field1394 + var5.field1381 * var6.field1399;
            class312.field3994 = var5.field1399 * var6.field1383 + var5.field1379 * var6.field1377 + var5.field1377 * var6.field1412;
            class266.field3454 = var5.field1394 * var6.field1383 + var5.field1412 * var6.field1412 + var5.field1404 * var6.field1377;
        }
        if (arg1 != null) {
            int var19 = this.field3033 + this.field3076 >> 1;
            int var20 = this.field3102 + this.field3074 >> 1;
            int var21 = (int) ((float) var20 * class257.field3310 + (float) this.field3101 * class62.field603 + (float) var19 * class266.field3454 + class370.field4883);
            int var22 = (int) ((float) var20 * class314.field4011 + (float) this.field3101 * class277.field3655 + (float) var19 * class312.field3994 + class413.field5366);
            int var23 = (int) ((float) var20 * class633.field9118 + (float) this.field3101 * class325.field4146 + (float) var19 * class175.field2133 + class24.field162);
            int var24 = (int) ((float) var20 * class257.field3310 + (float) this.field3085 * class62.field603 + (float) var19 * class266.field3454 + class370.field4883);
            int var25 = (int) ((float) var20 * class314.field4011 + (float) this.field3085 * class277.field3655 + (float) var19 * class312.field3994 + class413.field5366);
            int var26 = (int) ((float) var20 * class633.field9118 + (float) this.field3085 * class325.field4146 + (float) var19 * class175.field2133 + class24.field162);
            arg1.field7294 = this.field3053.field7864 * var24 / arg2 + this.field3053.field7832;
            arg1.field7291 = this.field3053.field7773 * var25 / arg2 + this.field3053.field7792;
            arg1.field7292 = this.field3053.field7773 * var22 / arg2 + this.field3053.field7792;
            arg1.field7290 = this.field3053.field7864 * var21 / arg2 + this.field3053.field7832;
            if (var23 < this.field3053.field7833 && this.field3053.field7833 > var26) {
                arg1.field7289 = true;
                arg1.field7293 = (this.field3065 + var21) * this.field3053.field7864 / arg2 + this.field3053.field7832 - arg1.field7290;
            }
        }
        this.field3053.method3085(true, (float) arg2);
        this.field3053.method3084((byte) 121);
        this.field3053.method3090((byte) 123, var6);
        this.method1378(-1);
        this.field3053.method3080(34167);
        this.method1368(1423040239);
    }

    @OriginalMember(owner = "client!sb", name = "OA", descriptor = "(I)V", line = 2146)
    public final void method92(int arg0) {
        field3097++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field3038; var4++) {
            int var5 = this.field3115[var4] * var2 + this.field3052[var4] * var3 >> 15;
            this.field3115[var4] = this.field3115[var4] * var3 - this.field3052[var4] * var2 >> 15;
            this.field3052[var4] = var5;
        }
        this.field3015 = false;
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lmh;)V", line = 5719)
    public class242(class537 arg0) {
        this.field3053 = arg0;
        this.field3096 = new class2(null, 5126, 3, 0);
        this.field3018 = new class2(null, 5126, 2, 0);
        this.field3090 = new class2(null, 5126, 3, 0);
        this.field3083 = new class2(null, 5121, 4, 0);
        this.field3104 = new class210();
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lmh;Lei;IIII)V", line = 5731)
    public class242(class537 arg0, class152 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3053 = arg0;
        this.field3016 = arg2;
        this.field3112 = arg5;
        if (class204.method1091(0, arg5, arg2)) {
            this.field3096 = new class2(null, 5126, 3, 0);
        }
        if (class337.method1897((byte) 68, arg2, arg5)) {
            this.field3018 = new class2(null, 5126, 2, 0);
        }
        if (class638.method3657(arg5, arg2, -14191)) {
            this.field3090 = new class2(null, 5126, 3, 0);
        }
        if (class121.method706(arg5, 2048, arg2)) {
            this.field3083 = new class2(null, 5121, 4, 0);
        }
        if (class556.method3253(arg2, arg5, -125)) {
            this.field3104 = new class210();
        }
        class17 var7 = arg0.field2481;
        int[] var8 = new int[arg1.field1817];
        this.field3049 = new int[arg1.field1820 + 1];
        for (int var9 = 0; var9 < arg1.field1817; var9++) {
            if ((arg1.field1857 == null || arg1.field1857[var9] != 2) && (arg1.field1835 == null || arg1.field1835[var9] == -1 || !var7.method119(-106, arg1.field1835[var9] & 0xFFFF).field2652)) {
                var8[this.field3117++] = var9;
                this.field3049[arg1.field1821[var9]]++;
                this.field3049[arg1.field1847[var9]]++;
                this.field3049[arg1.field1831[var9]]++;
            }
        }
        this.field3020 = this.field3117;
        long[] var10 = new long[this.field3117];
        boolean var11 = (this.field3016 & 0x100) != 0;
        label497: for (int var12 = 0; var12 < this.field3117; var12++) {
            int var180 = var8[var12];
            class217 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1851 != null) {
                for (int var186 = 0; var186 < arg1.field1851.length; var186++) {
                    class347 var187 = arg1.field1851[var186];
                    if (var187.field4472 == var180) {
                        class620 var188 = class337.method1898(1370, var187.field4473);
                        if (var188.field8953) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3020--;
                            continue label497;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1835 != null) {
                var189 = arg1.field1835[var180];
                if (var189 != -1) {
                    var181 = var7.method119(-122, var189 & 0xFFFF);
                    var184 = var181.field2657;
                    var185 = var181.field2648;
                }
            }
            boolean var190 = arg1.field1816 != null && arg1.field1816[var180] != 0 || var181 != null && !var181.field2650 | var181.field2640;
            if ((var11 || var190) && arg1.field1856 != null) {
                var182 += arg1.field1856[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class315.method1746((byte) -75, var10, var8);
        this.field3091 = arg1.field1845;
        this.field3037 = arg1.field1810;
        this.field3115 = arg1.field1830;
        this.field3052 = arg1.field1853;
        this.field3084 = arg1.field1854;
        this.field3038 = arg1.field1820;
        this.field3120 = arg1.field1840;
        this.field3124 = arg1.field1819;
        class178[] var13 = new class178[this.field3038];
        if (arg1.field1851 != null) {
            this.field3063 = arg1.field1851.length;
            this.field3051 = new class366[this.field3063];
            this.field3121 = new class559[this.field3063];
            for (int var14 = 0; var14 < this.field3063; var14++) {
                class347 var15 = arg1.field1851[var14];
                class620 var16 = class337.method1898(1370, var15.field4473);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3117; var18++) {
                    if (var8[var18] == var15.field4472) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class103.field1259[arg1.field1833[var15.field4472] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1816 == null ? 0 : arg1.field1816[var15.field4472]) << 24;
                this.field3121[var14] = new class559(var17, arg1.field1821[var15.field4472], arg1.field1847[var15.field4472], arg1.field1831[var15.field4472], var16.field8949, var16.field8950, var16.field8954, var16.field8955, var16.field8958, var16.field8953, var16.field8951, var15.field4470);
                this.field3051[var14] = new class366(var20);
            }
        }
        int var21 = this.field3117 * 3;
        this.field3057 = new byte[var21];
        this.field3093 = new short[this.field3117];
        this.field3060 = new short[var21];
        this.field3045 = new short[var21];
        this.field3029 = new short[this.field3117];
        this.field3092 = new float[var21];
        this.field3123 = new short[var21];
        this.field3024 = new short[this.field3117];
        this.field3095 = (short) arg4;
        this.field3070 = new short[this.field3117];
        this.field3094 = new byte[this.field3117];
        this.field3077 = new short[this.field3117];
        if (arg1.field1848 != null) {
            this.field3114 = new short[this.field3117];
        }
        this.field3067 = new short[var21];
        class64.field633 = new long[var21];
        this.field3105 = (short) arg3;
        this.field3078 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1820; var23++) {
            int var179 = this.field3049[var23];
            this.field3049[var23] = var22;
            var22 += var179;
            var13[var23] = new class178();
        }
        this.field3049[arg1.field1820] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1849 != null) {
            int var28 = arg1.field1844;
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
            var27 = new float[var28][];
            var26 = new int[var28];
            for (int var36 = 0; var36 < this.field3117; var36++) {
                int var43 = var8[var36];
                if (arg1.field1849[var43] != -1) {
                    int var44 = arg1.field1849[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1821[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1847[var43];
                        } else {
                            var46 = arg1.field1831[var43];
                        }
                        int var47 = arg1.field1853[var46];
                        int var48 = arg1.field1810[var46];
                        int var49 = arg1.field1830[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
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
            var24 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1826[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field1818[var37];
                        var40 = 64.0F / (float) arg1.field1823[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        } else {
                            var42 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field1834[var37];
                        var40 = 64.0F / (float) arg1.field1823[var37];
                        var42 = 64.0F / (float) arg1.field1818[var37];
                    } else {
                        var40 = (float) arg1.field1823[var37] / 1024.0F;
                        var42 = (float) arg1.field1818[var37] / 1024.0F;
                        var41 = (float) arg1.field1834[var37] / 1024.0F;
                    }
                    var27[var37] = class513.method2946(class288.method1624(arg1.field1813[var37], 255), arg1.field1850[var37], arg1.field1864[var37], (byte) -98, arg1.field1829[var37], var41, var42, var40);
                }
            }
        }
        class54[] var50 = new class54[arg1.field1817];
        for (int var51 = 0; var51 < arg1.field1817; var51++) {
            short var158 = arg1.field1821[var51];
            short var159 = arg1.field1847[var51];
            short var160 = arg1.field1831[var51];
            int var161 = this.field3052[var159] - this.field3052[var158];
            int var162 = this.field3037[var159] - this.field3037[var158];
            int var163 = this.field3115[var159] - this.field3115[var158];
            int var164 = this.field3052[var160] - this.field3052[var158];
            int var165 = this.field3037[var160] - this.field3037[var158];
            int var166 = this.field3115[var160] - this.field3115[var158];
            int var167 = var162 * var166 - var163 * var165;
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var169 >>= 0x1;
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var169 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field1857 == null ? 0 : arg1.field1857[var51];
            if (var174 == 0) {
                class178 var176 = var13[var158];
                var176.field2155++;
                var176.field2153 += var172;
                var176.field2156 += var173;
                var176.field2154 += var171;
                class178 var177 = var13[var159];
                var177.field2154 += var171;
                var177.field2156 += var173;
                var177.field2155++;
                var177.field2153 += var172;
                class178 var178 = var13[var160];
                var178.field2154 += var171;
                var178.field2155++;
                var178.field2153 += var172;
                var178.field2156 += var173;
            } else if (var174 == 1) {
                class54 var175 = var50[var51] = new class54();
                var175.field454 = var172;
                var175.field457 = var171;
                var175.field460 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field3117; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1833[var68] & 0xFFFF;
            short var70;
            if (arg1.field1835 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1835[var68];
            }
            int var71;
            if (arg1.field1849 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1849[var68];
            }
            int var72;
            if (arg1.field1816 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1816[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var77 = 0.0F;
                    var79 = 1;
                    var76 = 1.0F;
                    var74 = 1.0F;
                    var78 = 0.0F;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1826[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field1821[var68];
                        short var112 = arg1.field1847[var68];
                        short var113 = arg1.field1831[var68];
                        short var114 = arg1.field1864[var71];
                        short var115 = arg1.field1829[var71];
                        short var116 = arg1.field1850[var71];
                        float var117 = (float) arg1.field1853[var114];
                        float var118 = (float) arg1.field1810[var114];
                        float var119 = (float) arg1.field1830[var114];
                        float var120 = (float) arg1.field1853[var115] - var117;
                        float var121 = (float) arg1.field1810[var115] - var118;
                        float var122 = (float) arg1.field1830[var115] - var119;
                        float var123 = (float) arg1.field1853[var116] - var117;
                        float var124 = (float) arg1.field1810[var116] - var118;
                        float var125 = (float) arg1.field1830[var116] - var119;
                        float var126 = (float) arg1.field1853[var111] - var117;
                        float var127 = (float) arg1.field1810[var111] - var118;
                        float var128 = (float) arg1.field1830[var111] - var119;
                        float var129 = (float) arg1.field1853[var112] - var117;
                        float var130 = (float) arg1.field1810[var112] - var118;
                        float var131 = (float) arg1.field1830[var112] - var119;
                        float var132 = (float) arg1.field1853[var113] - var117;
                        float var133 = (float) arg1.field1810[var113] - var118;
                        float var134 = (float) arg1.field1830[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - (var125 * var136);
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var122 * var135 - var120 * var137;
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                    } else {
                        short var83 = arg1.field1821[var68];
                        short var84 = arg1.field1847[var68];
                        short var85 = arg1.field1831[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field1863[var71];
                        float var91 = (float) arg1.field1825[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field1834[var71] / 1024.0F;
                            class486.method2822(var109, arg1.field1810[var83], var91, arg1.field1853[var83], var86, arg1.field1830[var83], false, var89, var90, var87, var88);
                            var73 = class613.field8885;
                            var74 = class403.field5289;
                            class486.method2822(var109, arg1.field1810[var84], var91, arg1.field1853[var84], var86, arg1.field1830[var84], false, var89, var90, var87, var88);
                            var75 = class613.field8885;
                            var76 = class403.field5289;
                            class486.method2822(var109, arg1.field1810[var85], var91, arg1.field1853[var85], var86, arg1.field1830[var85], false, var89, var90, var87, var88);
                            var77 = class613.field8885;
                            var78 = class403.field5289;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var110 < var77 - var73) {
                                    var77 -= var109;
                                    var80 = 1;
                                } else if (var73 - var77 > var110) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                                if (var110 < var75 - var73) {
                                    var75 -= var109;
                                    var79 = 1;
                                } else if (var110 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var109;
                                }
                            } else {
                                if (var78 - var74 > var110) {
                                    var80 = 1;
                                    var78 -= var109;
                                } else if (var110 < var74 - var78) {
                                    var78 += var109;
                                    var80 = 2;
                                }
                                if (var76 - var74 > var110) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var110 < var74 - var76) {
                                    var76 += var109;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field1860[var71] / 256.0F;
                            float var93 = (float) arg1.field1822[var71] / 256.0F;
                            int var94 = arg1.field1853[var84] - arg1.field1853[var83];
                            int var95 = arg1.field1810[var84] - arg1.field1810[var83];
                            int var96 = arg1.field1830[var84] - arg1.field1830[var83];
                            int var97 = arg1.field1853[var85] - arg1.field1853[var83];
                            int var98 = arg1.field1810[var85] - arg1.field1810[var83];
                            int var99 = arg1.field1830[var85] - arg1.field1830[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - var94 * var99;
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field1818[var71];
                            float var104 = 64.0F / (float) arg1.field1823[var71];
                            float var105 = 64.0F / (float) arg1.field1834[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class31.method182(var108, var106, var107, 2);
                            class263.method1469(arg1.field1810[var83], var92, var93, var89, (byte) 124, var86, arg1.field1853[var83], var90, var87, var81, arg1.field1830[var83], var91, var88);
                            var73 = class194.field2347;
                            var74 = class445.field6133;
                            class263.method1469(arg1.field1810[var84], var92, var93, var89, (byte) 125, var86, arg1.field1853[var84], var90, var87, var81, arg1.field1830[var84], var91, var88);
                            var75 = class194.field2347;
                            var76 = class445.field6133;
                            class263.method1469(arg1.field1810[var85], var92, var93, var89, (byte) 119, var86, arg1.field1853[var85], var90, var87, var81, arg1.field1830[var85], var91, var88);
                            var78 = class445.field6133;
                            var77 = class194.field2347;
                        } else if (var82 == 3) {
                            class358.method2015(var90, var88, var86, var91, arg1.field1830[var83], (byte) -115, arg1.field1853[var83], var89, var87, arg1.field1810[var83]);
                            var73 = class290.field3769;
                            var74 = class614.field8904;
                            class358.method2015(var90, var88, var86, var91, arg1.field1830[var84], (byte) 125, arg1.field1853[var84], var89, var87, arg1.field1810[var84]);
                            var76 = class614.field8904;
                            var75 = class290.field3769;
                            class358.method2015(var90, var88, var86, var91, arg1.field1830[var85], (byte) -111, arg1.field1853[var85], var89, var87, arg1.field1810[var85]);
                            var78 = class614.field8904;
                            var77 = class290.field3769;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var75--;
                                    var79 = 1;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if (var76 - var74 > 0.5F) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                                if (var78 - var74 > 0.5F) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field1857 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1857[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                short var152 = arg1.field1821[var68];
                short var153 = arg1.field1847[var68];
                short var154 = arg1.field1831[var68];
                class178 var155 = var13[var152];
                this.field3070[var52] = this.method1379(var155.field2155, var152, var155.field2153, var155.field2154, var74, (byte) -32, arg1, var73, var150, var155.field2156);
                class178 var156 = var13[var153];
                this.field3077[var52] = this.method1379(var156.field2155, var153, var156.field2153, var156.field2154, var76, (byte) -32, arg1, var75, (long) var79 + var150, var156.field2156);
                class178 var157 = var13[var154];
                this.field3029[var52] = this.method1379(var157.field2155, var154, var157.field2153, var157.field2154, var78, (byte) -32, arg1, var77, (long) var80 + var150, var157.field2156);
            } else if (var146 == 1) {
                class54 var147 = var50[var68];
                long var148 = ((long) (var69 << 8) + ((long) var72) + (long) (var81 << 24) << 32) + (long) ((var147.field457 + 256 << 22) + ((var71 << 2) + (var147.field460 <= 0 ? 2048 : 1024) + (var147.field454 + 256 << 12)));
                this.field3070[var52] = this.method1379(0, arg1.field1821[var68], var147.field454, var147.field457, var74, (byte) -32, arg1, var73, var148, var147.field460);
                this.field3077[var52] = this.method1379(0, arg1.field1847[var68], var147.field454, var147.field457, var76, (byte) -32, arg1, var75, (long) var79 + var148, var147.field460);
                this.field3029[var52] = this.method1379(0, arg1.field1831[var68], var147.field454, var147.field457, var78, (byte) -32, arg1, var77, (long) var80 + var148, var147.field460);
            }
            if (arg1.field1835 == null) {
                this.field3024[var52] = -1;
            } else {
                this.field3024[var52] = arg1.field1835[var68];
            }
            if (arg1.field1816 != null) {
                this.field3094[var52] = arg1.field1816[var68];
            }
            if (arg1.field1848 != null) {
                this.field3114[var52] = arg1.field1848[var68];
            }
            this.field3093[var52] = arg1.field1833[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3020; var55++) {
            short var67 = this.field3024[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field3044 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field3020; var58++) {
            short var66 = this.field3024[var58];
            if (var56 != var66) {
                this.field3044[var57++] = var58;
                var56 = var66;
            }
        }
        this.field3044[var57] = this.field3020;
        class64.field633 = null;
        this.field3067 = class5.method31(-104, this.field3067, this.field3013);
        this.field3045 = class5.method31(-88, this.field3045, this.field3013);
        this.field3060 = class5.method31(-111, this.field3060, this.field3013);
        this.field3057 = class272.method1522(this.field3057, (byte) -81, this.field3013);
        this.field3092 = class300.method1663((byte) -125, this.field3092, this.field3013);
        this.field3078 = class300.method1663((byte) -89, this.field3078, this.field3013);
        if (arg1.field1837 != null && class311.method1728(arg2, false, this.field3112)) {
            this.field3107 = arg1.method829((byte) -22, false);
        }
        if (arg1.field1851 != null && class207.method1196(this.field3112, (byte) 81, arg2)) {
            this.field3088 = arg1.method836(11);
        }
        if (arg1.field1852 != null && class325.method1783(arg2, (byte) 11, this.field3112)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3117; var61++) {
                int var65 = arg1.field1852[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field3036 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3036[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3117; var63++) {
                int var64 = arg1.field1852[var8[var63]];
                if (var64 >= 0) {
                    this.field3036[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "ga", descriptor = "()I", line = 2181)
    public final int method83() {
        field3103++;
        return this.field3095;
    }

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "(I)V", line = 2197)
    public final void method85(int arg0) {
        field3118++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field3038; var4++) {
            int var5 = this.field3037[var4] * var3 - (this.field3115[var4] * var2) >> 15;
            this.field3115[var4] = this.field3115[var4] * var3 + this.field3037[var4] * var2 >> 15;
            this.field3037[var4] = var5;
        }
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
        this.field3015 = false;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "()I", line = 2228)
    public final int method60() {
        field3046++;
        if (!this.field3015) {
            this.method1365(32767);
        }
        return this.field3065;
    }

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "(I)V", line = 2242)
    public final void method57(int arg0) {
        field3119++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field3038; var4++) {
            int var7 = this.field3115[var4] * var2 + this.field3052[var4] * var3 >> 15;
            this.field3115[var4] = this.field3115[var4] * var3 - (this.field3052[var4] * var2) >> 15;
            this.field3052[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3013; var5++) {
            int var6 = this.field3067[var5] * var3 + this.field3060[var5] * var2 >> 15;
            this.field3060[var5] = (short) (this.field3060[var5] * var3 - (this.field3067[var5] * var2) >> 15);
            this.field3067[var5] = (short) var6;
        }
        if (this.field3090 == null && this.field3083 != null) {
            this.field3083.field2 = null;
        }
        if (this.field3090 != null) {
            this.field3090.field2 = null;
        }
        this.field3015 = false;
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 2291)
    private final void method1368(int arg0) {
        if (arg0 != 1423040239) {
            this.field3123 = null;
        }
        if (this.field3121 != null) {
            class113 var2 = this.field3053.field7728;
            float var3 = this.field3053.method1186();
            float var4 = this.field3053.method1167();
            this.field3053.method3112(113);
            this.field3053.method1181(false);
            this.field3053.method3106(true, false);
            this.field3053.method3131(this.field3053.field7785, null, (byte) -114, this.field3053.field7810, null);
            for (int var5 = 0; var5 < this.field3063; var5++) {
                class559 var6 = this.field3121[var5];
                class366 var7 = this.field3051[var5];
                if (!var6.field8234 || !this.field3053.method1143()) {
                    float var8 = (float) (this.field3052[var6.field8231] + this.field3052[var6.field8229] + this.field3052[var6.field8228]) * 0.3333333F;
                    float var9 = (float) (this.field3037[var6.field8229] + this.field3037[var6.field8228] + this.field3037[var6.field8231]) * 0.3333333F;
                    float var10 = (float) (this.field3115[var6.field8231] + this.field3115[var6.field8229] + this.field3115[var6.field8228]) * 0.3333333F;
                    float var11 = class257.field3310 * var10 + class62.field603 * var9 + class266.field3454 * var8 + class370.field4883;
                    float var12 = class314.field4011 * var10 + class312.field3994 * var8 + class277.field3655 * var9 + class413.field5366;
                    float var13 = class633.field9118 * var10 + class325.field4146 * var9 + class175.field2133 * var8 + class24.field162;
                    var2.method663(arg0 - 1423040238, var6.field8233 * var7.field4812 >> 7, -var13, (float) var7.field4807 + var11, var6.field8226 * var7.field4806 >> 7, (float) var7.field4813 - var12, var7.field4808);
                    this.field3053.method3118(var2, arg0 ^ 0xAB2E45C1);
                    this.field3053.method1106(var4, var3 - ((float) var6.field8237 * 1.5F));
                    int var14 = var7.field4811;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field3053.method3071(62, var6.field8227);
                    this.field3053.method3058((byte) -119, var6.field8232);
                    this.field3053.method3063(var6.field8224, (byte) -107);
                    this.field3053.method3069(false, 0, 7, 4);
                }
            }
            this.field3053.method1106(var4, var3);
            this.field3053.method1181(true);
            this.field3053.method3080(34167);
        }
        field3030++;
    }

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "(SS)V", line = 2356)
    public final void method93(short arg0, short arg1) {
        field3072++;
        class17 var3 = this.field3053.field2481;
        for (int var4 = 0; var4 < this.field3117; var4++) {
            if (this.field3024[var4] == arg0) {
                this.field3024[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class217 var7 = var3.method119(-118, arg0 & 0xFFFF);
            var5 = var7.field2656;
            var6 = var7.field2644;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class217 var10 = var3.method119(-116, arg1 & 0xFFFF);
            var8 = var10.field2656;
            var9 = var10.field2644;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field3121 != null) {
            for (int var11 = 0; var11 < this.field3063; var11++) {
                class559 var12 = this.field3121[var11];
                class366 var13 = this.field3051[var11];
                var13.field4811 = class103.field1259[this.field3093[var12.field8225] & 0xFFFF] & 0xFFFFFF | var13.field4811 & 0xFF000000;
            }
        }
        if (this.field3083 != null) {
            this.field3083.field2 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "(III)V", line = 2430)
    public final void method100(int arg0, int arg1, int arg2) {
        field3023++;
        for (int var4 = 0; var4 < this.field3038; var4++) {
            if (arg0 != 128) {
                this.field3052[var4] = this.field3052[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3037[var4] = this.field3037[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3115[var4] = this.field3115[var4] * arg2 >> 7;
            }
        }
        this.field3015 = false;
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "MA", descriptor = "()V", line = 2463)
    public final void method66() {
        for (int var1 = 0; var1 < this.field3084; var1++) {
            this.field3052[var1] = this.field3052[var1] + 7 >> 4;
            this.field3037[var1] = this.field3037[var1] + 7 >> 4;
            this.field3115[var1] = this.field3115[var1] + 7 >> 4;
        }
        field3054++;
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
        this.field3015 = false;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIIBI)Z", line = 2489)
    private final boolean method1369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3110++;
        if (arg0 > arg1 && arg1 < arg8 && arg1 < arg2) {
            return false;
        } else if (arg1 > arg0 && arg1 > arg8 && arg2 < arg1) {
            return false;
        } else if (arg5 < arg6 && arg5 < arg4 && arg3 > arg5) {
            return false;
        } else if (arg7 == 58) {
            return arg6 >= arg5 || arg4 >= arg5 || arg5 <= arg3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lm;Lcf;I)V", line = 2520)
    public final void method69(class163 arg0, class517 arg1, int arg2) {
        field3071++;
        if (this.field3013 == 0) {
            return;
        }
        class113 var4 = this.field3053.field7762;
        if (!this.field3015) {
            this.method1365(32767);
        }
        class113 var5 = (class113) arg0;
        this.method1372(var5, (byte) 70);
        class24.field162 = var4.field1409 * var5.field1396 + var4.field1383 * var5.field1389 + var4.field1381 * var5.field1392 + var4.field1396;
        class325.field4146 = var4.field1409 * var5.field1381 + var4.field1383 * var5.field1404 + var4.field1381 * var5.field1379;
        float var6 = (float) this.field3101 * class325.field4146 + class24.field162;
        float var7 = (float) this.field3085 * class325.field4146 + class24.field162;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) this.field3065 + var6;
            var8 = (float) (-this.field3065) + var7;
        } else {
            var8 = (float) (-this.field3065) + var6;
            var9 = (float) this.field3065 + var7;
        }
        if ((var8 >= this.field3053.field7850) || ((float) this.field3053.field7833 >= var9)) {
            return;
        }
        class62.field603 = var4.field1394 * var5.field1381 + var4.field1412 * var5.field1404 + var4.field1404 * var5.field1379;
        class370.field4883 = var4.field1394 * var5.field1396 + var4.field1412 * var5.field1389 + var4.field1404 * var5.field1392 + var4.field1389;
        float var10 = (float) this.field3101 * class62.field603 + class370.field4883;
        float var11 = (float) this.field3085 * class62.field603 + class370.field4883;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = (var11 - (float) this.field3065) * (float) this.field3053.field7864;
            var13 = ((float) this.field3065 + var10) * (float) this.field3053.field7864;
        } else {
            var12 = ((float) (-this.field3065) + var10) * (float) this.field3053.field7864;
            var13 = ((float) this.field3065 + var11) * (float) this.field3053.field7864;
        }
        if ((var12 / var9 >= this.field3053.field7803) || (this.field3053.field7818 >= var13 / var9)) {
            return;
        }
        class413.field5366 = var4.field1399 * var5.field1396 + var4.field1379 * var5.field1392 + var4.field1377 * var5.field1389 + var4.field1392;
        class277.field3655 = var4.field1399 * var5.field1381 + var4.field1379 * var5.field1379 + var4.field1377 * var5.field1404;
        float var14 = (float) this.field3101 * class277.field3655 + class413.field5366;
        float var15 = (float) this.field3085 * class277.field3655 + class413.field5366;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = ((float) this.field3065 + var14) * (float) this.field3053.field7773;
            var17 = ((float) (-this.field3065) + var15) * (float) this.field3053.field7773;
        } else {
            var17 = (var14 - (float) this.field3065) * (float) this.field3053.field7773;
            var16 = ((float) this.field3065 + var15) * (float) this.field3053.field7773;
        }
        if ((this.field3053.field7755 <= var17 / var9) || (var16 / var9 <= this.field3053.field7768)) {
            return;
        }
        if (arg1 != null || this.field3121 != null) {
            class312.field3994 = var4.field1399 * var5.field1383 + var4.field1379 * var5.field1377 + var4.field1377 * var5.field1412;
            class257.field3310 = var4.field1394 * var5.field1409 + var4.field1412 * var5.field1394 + var4.field1404 * var5.field1399;
            class314.field4011 = var4.field1399 * var5.field1409 + var4.field1379 * var5.field1399 + var4.field1377 * var5.field1394;
            class175.field2133 = var4.field1409 * var5.field1383 + var4.field1383 * var5.field1412 + var4.field1381 * var5.field1377;
            class266.field3454 = var4.field1394 * var5.field1383 + var4.field1412 * var5.field1412 + var4.field1404 * var5.field1377;
            class633.field9118 = var4.field1409 * var5.field1409 + var4.field1383 * var5.field1394 + var4.field1381 * var5.field1399;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3076 + this.field3033 >> 1;
            int var21 = this.field3102 + this.field3074 >> 1;
            int var22 = (int) ((float) var21 * class257.field3310 + (float) this.field3101 * class62.field603 + (float) var20 * class266.field3454 + class370.field4883);
            int var23 = (int) ((float) var21 * class314.field4011 + (float) this.field3101 * class277.field3655 + (float) var20 * class312.field3994 + class413.field5366);
            int var24 = (int) ((float) var21 * class633.field9118 + (float) this.field3101 * class325.field4146 + (float) var20 * class175.field2133 + class24.field162);
            if (this.field3053.field7833 > var24) {
                var18 = true;
            } else {
                arg1.field7290 = this.field3053.field7864 * var22 / var24 + this.field3053.field7832;
                arg1.field7292 = this.field3053.field7773 * var23 / var24 + this.field3053.field7792;
            }
            int var25 = (int) ((float) var21 * class257.field3310 + (float) this.field3085 * class62.field603 + (float) var20 * class266.field3454 + class370.field4883);
            int var26 = (int) ((float) var21 * class314.field4011 + (float) this.field3085 * class277.field3655 + (float) var20 * class312.field3994 + class413.field5366);
            int var27 = (int) ((float) var21 * class633.field9118 + (float) this.field3085 * class325.field4146 + (float) var20 * class175.field2133 + class24.field162);
            if (this.field3053.field7833 > var27) {
                var18 = true;
            } else {
                arg1.field7294 = this.field3053.field7832 + (this.field3053.field7864 * var25 / var27);
                arg1.field7291 = this.field3053.field7773 * var26 / var27 + this.field3053.field7792;
            }
            if (var18) {
                if (var24 < this.field3053.field7833 && var27 < this.field3053.field7833) {
                    var19 = false;
                } else if (var24 < this.field3053.field7833) {
                    int var28 = (var27 - this.field3053.field7833 << 16) / (var27 - var24);
                    int var29 = var25 + ((var25 - var22) * var28 >> 16);
                    arg1.field7290 = this.field3053.field7864 * var29 / this.field3053.field7833 + this.field3053.field7832;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field7292 = this.field3053.field7773 * var30 / this.field3053.field7833 + this.field3053.field7792;
                } else if (var27 < this.field3053.field7833) {
                    int var31 = (var24 - this.field3053.field7833 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field7290 = this.field3053.field7832 + (this.field3053.field7864 * var32 / this.field3053.field7833);
                    arg1.field7292 = this.field3053.field7773 * var33 / this.field3053.field7833 + this.field3053.field7792;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field7293 = (this.field3065 + var22) * this.field3053.field7864 / var24 + this.field3053.field7832 - arg1.field7290;
                } else {
                    arg1.field7293 = this.field3053.field7832 + ((this.field3065 + var25) * this.field3053.field7864 / var27) - arg1.field7294;
                }
                arg1.field7289 = true;
            }
        }
        this.field3053.method3087(-70);
        this.field3053.method3090((byte) 116, var5);
        this.method1378(-1);
        this.field3053.method3080(34167);
        this.method1368(1423040239);
    }

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "()I", line = 2727)
    public final int method96() {
        if (!this.field3015) {
            this.method1365(32767);
        }
        field3081++;
        return this.field3074;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 2739)
    public final void method79(int arg0) {
        field3068++;
        int var2 = class442.field6100[arg0];
        int var3 = class442.field6101[arg0];
        for (int var4 = 0; var4 < this.field3038; var4++) {
            int var5 = this.field3052[var4] * var3 + this.field3037[var4] * var2 >> 15;
            this.field3037[var4] = this.field3037[var4] * var3 - (this.field3052[var4] * var2) >> 15;
            this.field3052[var4] = var5;
        }
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
        this.field3015 = false;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()[Lfr;", line = 2775)
    public final class348[] method78() {
        field3035++;
        return this.field3124;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lav;I)V", line = 2786)
    public static final void method1370(class545 arg0, int arg1) {
        field3089++;
        class416 var2 = (class416) class593.field8610.method2645((long) arg0.field6399, (byte) -99);
        if (arg1 != -8408) {
            return;
        }
        if (var2 == null) {
            class131.method736((byte) -74, arg0.field6483[0], null, arg0, null, arg0.field6491[0], 0, arg0.field8660);
        } else {
            var2.method2375(0);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 2805)
    public static final void method1371(int arg0, String arg1) {
        field3099++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != -2147483647) {
            method1376((byte) -99);
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class78.method453((byte) 97, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class426.field5481; var3++) {
            String var4 = class615.field8914[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class78.method453((byte) 97, var4);
            if (var5 != null && var5.equals(var2)) {
                class426.field5481--;
                for (int var6 = var3; var6 < class426.field5481; var6++) {
                    class615.field8914[var6] = class615.field8914[var6 + 1];
                    class442.field6105[var6] = class442.field6105[var6 + 1];
                    class586.field8506[var6] = class586.field8506[var6 + 1];
                    class434.field5884[var6] = class434.field5884[var6 + 1];
                    class461.field6368[var6] = class461.field6368[var6 + 1];
                }
                class22.field154++;
                class349.field4501 = class519.field7305;
                class418.method2378(17984, class246.field3153);
                class136.field1663.method2093(class88.method528((byte) -32, arg1), -115);
                class136.field1663.method2106(-113, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lkc;B)V", line = 2865)
    private final void method1372(class113 arg0, byte arg1) {
        if (arg1 != 70) {
            this.method72(16);
        }
        if (this.field3120 != null) {
            for (int var3 = 0; var3 < this.field3120.length; var3++) {
                class55 var4 = this.field3120[var3];
                class55 var5 = var4;
                if (var4.field468 != null) {
                    var5 = var4.field468;
                }
                var5.field478 = (int) ((float) this.field3115[var4.field462] * arg0.field1394 + (float) this.field3052[var4.field462] * arg0.field1412 + (float) this.field3037[var4.field462] * arg0.field1404 + arg0.field1389);
                var5.field471 = (int) ((float) this.field3115[var4.field462] * arg0.field1399 + (float) this.field3052[var4.field462] * arg0.field1377 + (float) this.field3037[var4.field462] * arg0.field1379 + arg0.field1392);
                var5.field464 = (int) ((float) this.field3115[var4.field462] * arg0.field1409 + (float) this.field3052[var4.field462] * arg0.field1383 + (float) this.field3037[var4.field462] * arg0.field1381 + arg0.field1396);
                var5.field470 = (int) ((float) this.field3115[var4.field476] * arg0.field1394 + (float) this.field3052[var4.field476] * arg0.field1412 + (float) this.field3037[var4.field476] * arg0.field1404 + arg0.field1389);
                var5.field463 = (int) ((float) this.field3115[var4.field476] * arg0.field1399 + (float) this.field3052[var4.field476] * arg0.field1377 + (float) this.field3037[var4.field476] * arg0.field1379 + arg0.field1392);
                var5.field475 = (int) ((float) this.field3115[var4.field476] * arg0.field1409 + (float) this.field3052[var4.field476] * arg0.field1383 + (float) this.field3037[var4.field476] * arg0.field1381 + arg0.field1396);
                var5.field472 = (int) ((float) this.field3115[var4.field469] * arg0.field1394 + (float) this.field3052[var4.field469] * arg0.field1412 + (float) this.field3037[var4.field469] * arg0.field1404 + arg0.field1389);
                var5.field480 = (int) ((float) this.field3115[var4.field469] * arg0.field1399 + (float) this.field3052[var4.field469] * arg0.field1377 + (float) this.field3037[var4.field469] * arg0.field1379 + arg0.field1392);
                var5.field466 = (int) ((float) this.field3115[var4.field469] * arg0.field1409 + (float) this.field3052[var4.field469] * arg0.field1383 + (float) this.field3037[var4.field469] * arg0.field1381 + arg0.field1396);
            }
        }
        field3061++;
        if (this.field3124 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3124.length; var6++) {
            class348 var7 = this.field3124[var6];
            class348 var8 = var7;
            if (var7.field4485 != null) {
                var8 = var7.field4485;
            }
            if (var7.field4483 == null) {
                var7.field4483 = arg0.method675();
            } else {
                var7.field4483.method676(arg0);
            }
            var8.field4475 = (int) ((float) this.field3115[var7.field4487] * arg0.field1394 + (float) this.field3052[var7.field4487] * arg0.field1412 + (float) this.field3037[var7.field4487] * arg0.field1404 + arg0.field1389);
            var8.field4476 = (int) ((float) this.field3115[var7.field4487] * arg0.field1399 + (float) this.field3052[var7.field4487] * arg0.field1377 + (float) this.field3037[var7.field4487] * arg0.field1379 + arg0.field1392);
            var8.field4486 = (int) ((float) this.field3115[var7.field4487] * arg0.field1409 + (float) this.field3052[var7.field4487] * arg0.field1383 + (float) this.field3037[var7.field4487] * arg0.field1381 + arg0.field1396);
        }
    }

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "()I", line = 2931)
    public final int method95() {
        field3041++;
        return this.field3105;
    }

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "()V", line = 2940)
    public final void method86() {
        for (int var1 = 0; var1 < this.field3038; var1++) {
            this.field3115[var1] = -this.field3115[var1];
        }
        field3055++;
        for (int var2 = 0; var2 < this.field3013; var2++) {
            this.field3060[var2] = (short) (-this.field3060[var2]);
        }
        for (int var3 = 0; var3 < this.field3117; var3++) {
            short var4 = this.field3070[var3];
            this.field3070[var3] = this.field3029[var3];
            this.field3029[var3] = var4;
        }
        if (this.field3090 == null && this.field3083 != null) {
            this.field3083.field2 = null;
        }
        if (this.field3090 != null) {
            this.field3090.field2 = null;
        }
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
        if (this.field3104 != null) {
            this.field3104.field2559 = null;
        }
        this.field3015 = false;
    }

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "(IIII)V", line = 2988)
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        field3062++;
        if (arg0 == 0) {
            class129.field1587 = 0;
            class403.field5292 = 0;
            class15.field115 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field3038; var6++) {
                class15.field115 += this.field3052[var6];
                class129.field1587 += this.field3037[var6];
                var5++;
                class403.field5292 += this.field3115[var6];
            }
            if (var5 > 0) {
                class15.field115 = class15.field115 / var5 + arg1;
                class129.field1587 = class129.field1587 / var5 + arg2;
                class403.field5292 = class403.field5292 / var5 + arg3;
            } else {
                class403.field5292 = arg3;
                class15.field115 = arg1;
                class129.field1587 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3038; var7++) {
                this.field3052[var7] += arg1;
                this.field3037[var7] += arg2;
                this.field3115[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3038; var8++) {
                this.field3052[var8] -= class15.field115;
                this.field3037[var8] -= class129.field1587;
                this.field3115[var8] -= class403.field5292;
                if (arg3 != 0) {
                    int var9 = class442.field6100[arg3];
                    int var10 = class442.field6101[arg3];
                    int var11 = this.field3037[var8] * var9 + this.field3052[var8] * var10 + 32767 >> 15;
                    this.field3037[var8] = this.field3037[var8] * var10 + 32767 - (this.field3052[var8] * var9) >> 15;
                    this.field3052[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class442.field6100[arg1];
                    int var13 = class442.field6101[arg1];
                    int var14 = this.field3037[var8] * var13 + 32767 - (this.field3115[var8] * var12) >> 15;
                    this.field3115[var8] = this.field3115[var8] * var13 + (this.field3037[var8] * var12 + 32767) >> 15;
                    this.field3037[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class442.field6100[arg2];
                    int var16 = class442.field6101[arg2];
                    int var17 = this.field3115[var8] * var15 + this.field3052[var8] * var16 + 32767 >> 15;
                    this.field3115[var8] = this.field3115[var8] * var16 + 32767 - this.field3052[var8] * var15 >> 15;
                    this.field3052[var8] = var17;
                }
                this.field3052[var8] += class15.field115;
                this.field3037[var8] += class129.field1587;
                this.field3115[var8] += class403.field5292;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3038; var18++) {
                this.field3052[var18] -= class15.field115;
                this.field3037[var18] -= class129.field1587;
                this.field3115[var18] -= class403.field5292;
                this.field3052[var18] = this.field3052[var18] * arg1 / 128;
                this.field3037[var18] = this.field3037[var18] * arg2 / 128;
                this.field3115[var18] = this.field3115[var18] * arg3 / 128;
                this.field3052[var18] += class15.field115;
                this.field3037[var18] += class129.field1587;
                this.field3115[var18] += class403.field5292;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3117; var19++) {
                int var23 = (this.field3094[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3094[var19] = (byte) var23;
            }
            if (this.field3083 != null) {
                this.field3083.field2 = null;
            }
            if (this.field3121 != null) {
                for (int var20 = 0; var20 < this.field3063; var20++) {
                    class559 var21 = this.field3121[var20];
                    class366 var22 = this.field3051[var20];
                    var22.field4811 = var22.field4811 & 0xFFFFFF | 255 - (this.field3094[var21.field8225] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3117; var24++) {
                int var28 = this.field3093[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3EF) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = var29 + arg1 & 0x3F;
                int var34 = arg3 + var31;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3093[var24] = (short) class42.method223(var34, class42.method223(var33 << 10, var32 << 7));
            }
            if (this.field3083 != null) {
                this.field3083.field2 = null;
            }
            if (this.field3121 != null) {
                for (int var25 = 0; var25 < this.field3063; var25++) {
                    class559 var26 = this.field3121[var25];
                    class366 var27 = this.field3051[var25];
                    var27.field4811 = var27.field4811 & 0xFF000000 | class103.field1259[this.field3093[var26.field8225] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3063; var35++) {
                class366 var36 = this.field3051[var35];
                var36.field4807 += arg1;
                var36.field4813 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3063; var37++) {
                class366 var38 = this.field3051[var37];
                var38.field4812 = var38.field4812 * arg1 >> 7;
                var38.field4806 = var38.field4806 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3063; var39++) {
                class366 var40 = this.field3051[var39];
                var40.field4808 = var40.field4808 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V", line = 3322)
    public final void method76(int arg0, int arg1, int arg2, int arg3) {
        field3031++;
        for (int var5 = 0; var5 < this.field3117; var5++) {
            int var9 = this.field3093[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field3093[var5] = (short) class42.method223(class42.method223(var11 << 7, var10 << 10), var12);
        }
        if (this.field3121 != null) {
            for (int var6 = 0; var6 < this.field3063; var6++) {
                class559 var7 = this.field3121[var6];
                class366 var8 = this.field3051[var6];
                var8.field4811 = var8.field4811 & 0xFF000000 | class103.field1259[this.field3093[var7.field8225] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3083 != null) {
            this.field3083.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "()I", line = 3379)
    public final int method73() {
        if (!this.field3015) {
            this.method1365(32767);
        }
        field3021++;
        return this.field3085;
    }

    @OriginalMember(owner = "client!sb", name = "wa", descriptor = "()I", line = 3392)
    public final int method90() {
        field3050++;
        if (!this.field3015) {
            this.method1365(32767);
        }
        return this.field3033;
    }

    @OriginalMember(owner = "client!sb", name = "ea", descriptor = "(I[IIIIIZ)V", line = 3405)
    public final void method65(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3047++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            class15.field115 = 0;
            class403.field5292 = 0;
            class129.field1587 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3107.length) {
                    int[] var15 = this.field3107[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class15.field115 += this.field3052[var17];
                        class129.field1587 += this.field3037[var17];
                        var12++;
                        class403.field5292 += this.field3115[var17];
                    }
                }
            }
            if (var12 > 0) {
                class15.field115 = class15.field115 / var12 + var11;
                class129.field1587 = class129.field1587 / var12 + var9;
                class403.field5292 = class403.field5292 / var12 + var10;
            } else {
                class129.field1587 = var9;
                class15.field115 = var11;
                class403.field5292 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field3107.length) {
                    int[] var23 = this.field3107[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3052[var25] += var20;
                        this.field3037[var25] += var18;
                        this.field3115[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field3107.length > var45) {
                    int[] var46 = this.field3107[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3052[var59] -= class15.field115;
                            this.field3037[var59] -= class129.field1587;
                            this.field3115[var59] -= class403.field5292;
                            if (arg4 != 0) {
                                int var60 = class442.field6100[arg4];
                                int var61 = class442.field6101[arg4];
                                int var62 = this.field3052[var59] * var61 + this.field3037[var59] * var60 + 32767 >> 15;
                                this.field3037[var59] = this.field3037[var59] * var61 + 32767 - (this.field3052[var59] * var60) >> 15;
                                this.field3052[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class442.field6100[arg2];
                                int var64 = class442.field6101[arg2];
                                int var65 = this.field3037[var59] * var64 + 32767 - (this.field3115[var59] * var63) >> 15;
                                this.field3115[var59] = this.field3037[var59] * var63 + (this.field3115[var59] * var64) + 32767 >> 15;
                                this.field3037[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class442.field6100[arg3];
                                int var67 = class442.field6101[arg3];
                                int var68 = this.field3115[var59] * var66 + this.field3052[var59] * var67 + 32767 >> 15;
                                this.field3115[var59] = this.field3115[var59] * var67 + 32767 - (this.field3052[var59] * var66) >> 15;
                                this.field3052[var59] = var68;
                            }
                            this.field3052[var59] += class15.field115;
                            this.field3037[var59] += class129.field1587;
                            this.field3115[var59] += class403.field5292;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3052[var48] -= class15.field115;
                            this.field3037[var48] -= class129.field1587;
                            this.field3115[var48] -= class403.field5292;
                            if (arg2 != 0) {
                                int var49 = class442.field6100[arg2];
                                int var50 = class442.field6101[arg2];
                                int var51 = this.field3037[var48] * var50 + 32767 - this.field3115[var48] * var49 >> 15;
                                this.field3115[var48] = this.field3037[var48] * var49 + (this.field3115[var48] * var50) + 32767 >> 15;
                                this.field3037[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class442.field6100[arg4];
                                int var53 = class442.field6101[arg4];
                                int var54 = this.field3052[var48] * var53 + this.field3037[var48] * var52 + 32767 >> 15;
                                this.field3037[var48] = this.field3037[var48] * var53 + 32767 - (this.field3052[var48] * var52) >> 15;
                                this.field3052[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class442.field6100[arg3];
                                int var56 = class442.field6101[arg3];
                                int var57 = this.field3052[var48] * var56 + this.field3115[var48] * var55 + 32767 >> 15;
                                this.field3115[var48] = this.field3115[var48] * var56 + 32767 - this.field3052[var48] * var55 >> 15;
                                this.field3052[var48] = var57;
                            }
                            this.field3052[var48] += class15.field115;
                            this.field3037[var48] += class129.field1587;
                            this.field3115[var48] += class403.field5292;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field3107.length) {
                        int[] var29 = this.field3107[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3049[var31];
                            int var33 = this.field3049[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3123[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class442.field6100[arg4];
                                    int var37 = class442.field6101[arg4];
                                    int var38 = this.field3045[var35] * var36 + (this.field3067[var35] * var37) + 32767 >> 15;
                                    this.field3045[var35] = (short) (this.field3045[var35] * var37 + 32767 - (this.field3067[var35] * var36) >> 15);
                                    this.field3067[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class442.field6100[arg2];
                                    int var40 = class442.field6101[arg2];
                                    int var41 = this.field3045[var35] * var40 + 32767 - (this.field3060[var35] * var39) >> 15;
                                    this.field3060[var35] = (short) (this.field3060[var35] * var40 + this.field3045[var35] * var39 + 32767 >> 15);
                                    this.field3045[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class442.field6100[arg3];
                                    int var43 = class442.field6101[arg3];
                                    int var44 = this.field3067[var35] * var43 + this.field3060[var35] * var42 + 32767 >> 15;
                                    this.field3060[var35] = (short) (this.field3060[var35] * var43 + 32767 - (this.field3067[var35] * var42) >> 15);
                                    this.field3067[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3090 == null && this.field3083 != null) {
                    this.field3083.field2 = null;
                }
                if (this.field3090 != null) {
                    this.field3090.field2 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field3107.length > var70) {
                    int[] var71 = this.field3107[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3052[var73] -= class15.field115;
                        this.field3037[var73] -= class129.field1587;
                        this.field3115[var73] -= class403.field5292;
                        this.field3052[var73] = this.field3052[var73] * arg2 >> 7;
                        this.field3037[var73] = this.field3037[var73] * arg3 >> 7;
                        this.field3115[var73] = this.field3115[var73] * arg4 >> 7;
                        this.field3052[var73] += class15.field115;
                        this.field3037[var73] += class129.field1587;
                        this.field3115[var73] += class403.field5292;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3036 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field3036.length > var78) {
                        int[] var79 = this.field3036[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3094[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3094[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3083 != null) {
                            this.field3083.field2 = null;
                        }
                    }
                }
                if (this.field3121 != null) {
                    for (int var75 = 0; var75 < this.field3063; var75++) {
                        class559 var76 = this.field3121[var75];
                        class366 var77 = this.field3051[var75];
                        var77.field4811 = var77.field4811 & 0xFFFFFF | 255 - (this.field3094[var76.field8225] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3036 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field3036.length > var87) {
                        int[] var88 = this.field3036[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3093[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = var91 & 0x7F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var95;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3093[var90] = (short) class42.method223(var97, class42.method223(var94 << 10, var96 << 7));
                        }
                        if (var88.length > 0 && this.field3083 != null) {
                            this.field3083.field2 = null;
                        }
                    }
                }
                if (this.field3121 != null) {
                    for (int var84 = 0; var84 < this.field3063; var84++) {
                        class559 var85 = this.field3121[var84];
                        class366 var86 = this.field3051[var84];
                        var86.field4811 = var86.field4811 & 0xFF000000 | class103.field1259[this.field3093[var85.field8225] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3088 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (var99 < this.field3088.length) {
                        int[] var100 = this.field3088[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class366 var102 = this.field3051[var100[var101]];
                            var102.field4813 += arg3;
                            var102.field4807 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3088 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field3088.length > var104) {
                        int[] var105 = this.field3088[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class366 var107 = this.field3051[var105[var106]];
                            var107.field4812 = var107.field4812 * arg2 >> 7;
                            var107.field4806 = var107.field4806 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3088 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field3088.length > var109) {
                    int[] var110 = this.field3088[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class366 var112 = this.field3051[var110[var111]];
                        var112.field4808 = var112.field4808 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "EA", descriptor = "(Lk;)Lk;", line = 4063)
    public final class483 method81(class483 arg0) {
        field3073++;
        if (this.field3013 == 0) {
            return null;
        }
        if (!this.field3015) {
            this.method1365(32767);
        }
        int var2;
        int var3;
        if (this.field3053.field7826 > 0) {
            var2 = this.field3033 - (this.field3053.field7826 * this.field3085 >> 8) >> this.field3053.field7732;
            var3 = this.field3076 - (this.field3053.field7826 * this.field3101 >> 8) >> this.field3053.field7732;
        } else {
            var2 = this.field3033 - (this.field3053.field7826 * this.field3101 >> 8) >> this.field3053.field7732;
            var3 = this.field3076 - (this.field3053.field7826 * this.field3085 >> 8) >> this.field3053.field7732;
        }
        int var4;
        int var5;
        if (this.field3053.field7800 > 0) {
            var4 = this.field3074 - (this.field3053.field7800 * this.field3085 >> 8) >> this.field3053.field7732;
            var5 = this.field3102 - (this.field3053.field7800 * this.field3101 >> 8) >> this.field3053.field7732;
        } else {
            var4 = this.field3074 - (this.field3053.field7800 * this.field3101 >> 8) >> this.field3053.field7732;
            var5 = this.field3102 - (this.field3053.field7800 * this.field3085 >> 8) >> this.field3053.field7732;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class343 var8 = (class343) arg0;
        class343 var9;
        if (var8 != null && var8.method1914(var7, 17703, var6)) {
            var9 = var8;
            var8.method1912(false);
        } else {
            var9 = new class343(this.field3053, var6, var7);
        }
        var9.method1917(var2, var4, 0, var5, var3);
        this.method1373(var9, 86);
        return var9;
    }

    @OriginalMember(owner = "client!sb", name = "sa", descriptor = "()Z", line = 4126)
    public final boolean method62() {
        field3040++;
        if (this.field3107 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3084; var1++) {
            this.field3052[var1] <<= 0x4;
            this.field3037[var1] <<= 0x4;
            this.field3115[var1] <<= 0x4;
        }
        class403.field5292 = 0;
        class15.field115 = 0;
        class129.field1587 = 0;
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lqba;I)V", line = 4157)
    private final void method1373(class343 arg0, int arg1) {
        field3034++;
        if (this.field3013 > this.field3053.field7879.length) {
            this.field3053.field7879 = new int[this.field3013];
            this.field3053.field7874 = new int[this.field3013];
        }
        int[] var3 = this.field3053.field7879;
        int[] var4 = this.field3053.field7874;
        if (arg1 < 82) {
            return;
        }
        for (int var5 = 0; var5 < this.field3038; var5++) {
            int var16 = (this.field3052[var5] - (this.field3037[var5] * this.field3053.field7826 >> 8) >> this.field3053.field7732) - arg0.field4420;
            int var17 = (this.field3115[var5] - (this.field3037[var5] * this.field3053.field7800 >> 8) >> this.field3053.field7732) - arg0.field4423;
            int var18 = this.field3049[var5];
            int var19 = this.field3049[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field3123[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field3020; var6++) {
            if (this.field3094 == null || this.field3094[var6] <= 128) {
                short var7 = this.field3070[var6];
                short var8 = this.field3077[var6];
                short var9 = this.field3029[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - (var14 - var13) * (var12 - var11) > 0) {
                    arg0.method1915(var14, var15, var10, var12, var13, var11, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "()Z", line = 4264)
    public final boolean method75() {
        field3087++;
        if (this.field3024 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3024.length; var1++) {
            if (this.field3024[var1] != -1 && !this.field3053.field2481.method118(this.field3024[var1], (byte) 98)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "()[Ldl;", line = 4293)
    public final class55[] method59() {
        field3064++;
        return this.field3120;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLsb;Lsb;IZ)Lr;", line = 4301)
    private final class157 method1374(int arg0, boolean arg1, class242 arg2, class242 arg3, int arg4, boolean arg5) {
        arg2.field3105 = this.field3105;
        arg2.field3084 = this.field3084;
        arg2.field3063 = this.field3063;
        arg2.field3038 = this.field3038;
        field3039++;
        arg2.field3095 = this.field3095;
        arg2.field3112 = this.field3112;
        if (arg0 >= -30) {
            return null;
        }
        arg2.field3017 = 0;
        arg2.field3016 = arg4;
        arg2.field3020 = this.field3020;
        arg2.field3117 = this.field3117;
        arg2.field3013 = this.field3013;
        boolean var7 = class558.method3269(86, arg4, this.field3112);
        boolean var8 = class13.method103(this.field3112, 2, arg4);
        boolean var9 = class220.method1269(-123, arg4, this.field3112);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg2.field3052 = this.field3052;
            } else if (arg3.field3052 == null || arg3.field3052.length < this.field3084) {
                arg2.field3052 = arg3.field3052 = new int[this.field3084];
            } else {
                arg2.field3052 = arg3.field3052;
            }
            if (!var8) {
                arg2.field3037 = this.field3037;
            } else if (arg3.field3037 == null || arg3.field3037.length < this.field3084) {
                arg2.field3037 = arg3.field3037 = new int[this.field3084];
            } else {
                arg2.field3037 = arg3.field3037;
            }
            if (!var9) {
                arg2.field3115 = this.field3115;
            } else if (arg3.field3115 == null || this.field3084 > arg3.field3115.length) {
                arg2.field3115 = arg3.field3115 = new int[this.field3084];
            } else {
                arg2.field3115 = arg3.field3115;
            }
            for (int var11 = 0; var11 < this.field3084; var11++) {
                if (var7) {
                    arg2.field3052[var11] = this.field3052[var11];
                }
                if (var8) {
                    arg2.field3037[var11] = this.field3037[var11];
                }
                if (var9) {
                    arg2.field3115[var11] = this.field3115[var11];
                }
            }
        } else {
            arg2.field3037 = this.field3037;
            arg2.field3052 = this.field3052;
            arg2.field3115 = this.field3115;
        }
        if (class264.method1476(10, arg4, this.field3112)) {
            if (arg1) {
                arg2.field3017 = (byte) (arg2.field3017 | 0x1);
            }
            arg2.field3096 = arg3.field3096;
            arg2.field3096.field3 = this.field3096.field3;
            arg2.field3096.field2 = this.field3096.field2;
        } else if (class204.method1091(0, this.field3112, arg4)) {
            arg2.field3096 = this.field3096;
        } else {
            arg2.field3096 = null;
        }
        if (class259.method1456(this.field3112, -17, arg4)) {
            if (arg3.field3093 == null || arg3.field3093.length < this.field3117) {
                arg2.field3093 = arg3.field3093 = new short[this.field3117];
            } else {
                arg2.field3093 = arg3.field3093;
            }
            for (int var12 = 0; var12 < this.field3117; var12++) {
                arg2.field3093[var12] = this.field3093[var12];
            }
        } else {
            arg2.field3093 = this.field3093;
        }
        if (class566.method3304(this.field3112, arg4, 102)) {
            if (arg3.field3094 == null || arg3.field3094.length < this.field3117) {
                arg2.field3094 = arg3.field3094 = new byte[this.field3117];
            } else {
                arg2.field3094 = arg3.field3094;
            }
            for (int var13 = 0; var13 < this.field3117; var13++) {
                arg2.field3094[var13] = this.field3094[var13];
            }
        } else {
            arg2.field3094 = this.field3094;
        }
        if (class548.method3214(this.field3112, arg4, 45056)) {
            if (arg1) {
                arg2.field3017 = (byte) (arg2.field3017 | 0x2);
            }
            arg2.field3083 = arg3.field3083;
            arg2.field3083.field3 = this.field3083.field3;
            arg2.field3083.field2 = this.field3083.field2;
        } else if (class121.method706(this.field3112, 2048, arg4)) {
            arg2.field3083 = this.field3083;
        } else {
            arg2.field3083 = null;
        }
        if (class478.method2790((byte) 13, arg4, this.field3112)) {
            if (arg3.field3067 == null || this.field3013 > arg3.field3067.length) {
                int var14 = this.field3013;
                arg2.field3045 = arg3.field3045 = new short[var14];
                arg2.field3060 = arg3.field3060 = new short[var14];
                arg2.field3067 = arg3.field3067 = new short[var14];
            } else {
                arg2.field3045 = arg3.field3045;
                arg2.field3060 = arg3.field3060;
                arg2.field3067 = arg3.field3067;
            }
            if (this.field3116 == null) {
                for (int var18 = 0; var18 < this.field3013; var18++) {
                    arg2.field3067[var18] = this.field3067[var18];
                    arg2.field3045[var18] = this.field3045[var18];
                    arg2.field3060[var18] = this.field3060[var18];
                }
            } else {
                if (arg3.field3116 == null) {
                    arg3.field3116 = new class371();
                }
                class371 var15 = arg2.field3116 = arg3.field3116;
                if (var15.field4885 == null || var15.field4885.length < this.field3013) {
                    int var16 = this.field3013;
                    var15.field4887 = new byte[var16];
                    var15.field4890 = new short[var16];
                    var15.field4889 = new short[var16];
                    var15.field4885 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field3013; var17++) {
                    arg2.field3067[var17] = this.field3067[var17];
                    arg2.field3045[var17] = this.field3045[var17];
                    arg2.field3060[var17] = this.field3060[var17];
                    var15.field4885[var17] = this.field3116.field4885[var17];
                    var15.field4890[var17] = this.field3116.field4890[var17];
                    var15.field4889[var17] = this.field3116.field4889[var17];
                    var15.field4887[var17] = this.field3116.field4887[var17];
                }
            }
            arg2.field3057 = this.field3057;
        } else {
            arg2.field3067 = this.field3067;
            arg2.field3060 = this.field3060;
            arg2.field3045 = this.field3045;
            arg2.field3116 = this.field3116;
            arg2.field3057 = this.field3057;
        }
        if (class426.method2398(-127, this.field3112, arg4)) {
            arg2.field3090 = arg3.field3090;
            if (arg1) {
                arg2.field3017 = (byte) (arg2.field3017 | 0x4);
            }
            arg2.field3090.field3 = this.field3090.field3;
            arg2.field3090.field2 = this.field3090.field2;
        } else if (class638.method3657(this.field3112, arg4, -14191)) {
            arg2.field3090 = this.field3090;
        } else {
            arg2.field3090 = null;
        }
        if (class422.method2391((byte) 62, arg4, this.field3112)) {
            if (arg3.field3092 == null || arg3.field3092.length < this.field3117) {
                int var19 = this.field3013;
                arg2.field3078 = arg3.field3078 = new float[var19];
                arg2.field3092 = arg3.field3092 = new float[var19];
            } else {
                arg2.field3078 = arg3.field3078;
                arg2.field3092 = arg3.field3092;
            }
            for (int var20 = 0; var20 < this.field3013; var20++) {
                arg2.field3092[var20] = this.field3092[var20];
                arg2.field3078[var20] = this.field3078[var20];
            }
        } else {
            arg2.field3092 = this.field3092;
            arg2.field3078 = this.field3078;
        }
        if (class416.method2374(this.field3112, arg4, (byte) -61)) {
            arg2.field3018 = arg3.field3018;
            if (arg1) {
                arg2.field3017 = (byte) (arg2.field3017 | 0x8);
            }
            arg2.field3018.field2 = this.field3018.field2;
            arg2.field3018.field3 = this.field3018.field3;
        } else if (class337.method1897((byte) -119, arg4, this.field3112)) {
            arg2.field3018 = this.field3018;
        } else {
            arg2.field3018 = null;
        }
        if (class583.method3394(arg4, this.field3112, (byte) 24)) {
            if (arg3.field3070 == null || arg3.field3070.length < this.field3117) {
                int var21 = this.field3117;
                arg2.field3029 = arg3.field3029 = new short[var21];
                arg2.field3070 = arg3.field3070 = new short[var21];
                arg2.field3077 = arg3.field3077 = new short[var21];
            } else {
                arg2.field3077 = arg3.field3077;
                arg2.field3029 = arg3.field3029;
                arg2.field3070 = arg3.field3070;
            }
            for (int var22 = 0; var22 < this.field3117; var22++) {
                arg2.field3070[var22] = this.field3070[var22];
                arg2.field3077[var22] = this.field3077[var22];
                arg2.field3029[var22] = this.field3029[var22];
            }
        } else {
            arg2.field3077 = this.field3077;
            arg2.field3029 = this.field3029;
            arg2.field3070 = this.field3070;
        }
        if (class617.method3546(112, arg4, this.field3112)) {
            if (arg1) {
                arg2.field3017 = (byte) (arg2.field3017 | 0x10);
            }
            arg2.field3104 = arg3.field3104;
            arg2.field3104.field2559 = this.field3104.field2559;
        } else if (class556.method3253(arg4, this.field3112, -105)) {
            arg2.field3104 = this.field3104;
        } else {
            arg2.field3104 = null;
        }
        if (class629.method3601((byte) -53, this.field3112, arg4)) {
            if (arg3.field3024 == null || this.field3117 > arg3.field3024.length) {
                int var23 = this.field3117;
                arg2.field3024 = arg3.field3024 = new short[var23];
            } else {
                arg2.field3024 = arg3.field3024;
            }
            for (int var24 = 0; var24 < this.field3117; var24++) {
                arg2.field3024[var24] = this.field3024[var24];
            }
        } else {
            arg2.field3024 = this.field3024;
        }
        if (!class251.method1424(this.field3112, arg4, 32)) {
            arg2.field3051 = this.field3051;
        } else if (arg3.field3051 == null || this.field3063 > arg3.field3051.length) {
            int var26 = this.field3063;
            arg2.field3051 = arg3.field3051 = new class366[var26];
            for (int var27 = 0; var27 < this.field3063; var27++) {
                arg2.field3051[var27] = this.field3051[var27].method2047((byte) -100);
            }
        } else {
            arg2.field3051 = arg3.field3051;
            for (int var25 = 0; var25 < this.field3063; var25++) {
                arg2.field3051[var25].method2048(this.field3051[var25], 105);
            }
        }
        arg2.field3091 = this.field3091;
        arg2.field3114 = this.field3114;
        arg2.field3120 = this.field3120;
        if (this.field3015) {
            arg2.field3065 = this.field3065;
            arg2.field3015 = true;
            arg2.field3074 = this.field3074;
            arg2.field3085 = this.field3085;
            arg2.field3102 = this.field3102;
            arg2.field3101 = this.field3101;
            arg2.field3033 = this.field3033;
            arg2.field3076 = this.field3076;
        } else {
            arg2.field3015 = false;
        }
        arg2.field3088 = this.field3088;
        arg2.field3044 = this.field3044;
        arg2.field3124 = this.field3124;
        arg2.field3107 = this.field3107;
        arg2.field3049 = this.field3049;
        arg2.field3036 = this.field3036;
        arg2.field3123 = this.field3123;
        arg2.field3121 = this.field3121;
        return arg2;
    }

    @OriginalMember(owner = "client!sb", name = "RA", descriptor = "(IILsa;Lsa;III)V", line = 4764)
    public final void method87(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6) {
        if (!this.field3015) {
            this.method1365(32767);
        }
        field3048++;
        int var8 = this.field3033 + arg4;
        int var9 = this.field3076 + arg4;
        int var10 = arg6 + this.field3074;
        int var11 = this.field3102 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (var9 + arg2.field2115 >> arg2.field2111) >= arg2.field2116 || var10 < 0 || arg2.field2114 <= (arg2.field2115 + var11 >> arg2.field2111)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field2116 <= (arg3.field2115 + var9 >> arg3.field2111) || var10 < 0 || var11 + arg3.field2115 >> arg3.field2111 >= arg3.field2114) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field2111;
            int var13 = -(-arg2.field2115 - var9) - 1 >> arg2.field2111;
            int var14 = var10 >> arg2.field2111;
            int var15 = arg2.field2115 + var11 - 1 >> arg2.field2111;
            if (arg5 == arg2.method855(var12, var14) && arg5 == arg2.method855(var13, var14) && arg2.method855(var12, var15) == arg5 && arg5 == arg2.method855(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field3038; var32++) {
                this.field3037[var32] = this.field3037[var32] + arg2.method847(this.field3052[var32] + arg4, this.field3115[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field3101;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field3038; var30++) {
                int var31 = (this.field3037[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field3037[var30] += (arg2.method847(this.field3052[var30] + arg4, this.field3115[var30] + arg6) - arg5) * (arg1 - var31) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var25 = (arg1 & 0xFF) * 4;
            int var26 = ((arg1 & 0xFF45) >> 8) * 4;
            int var27 = (arg1 >> 16 & 0xFF) << 6;
            int var28 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var25 >> 1) < 0 || arg2.field2116 << arg2.field2111 <= arg4 - (-(var25 >> 1) - arg2.field2115) || (arg6 - (var26 >> 1)) < 0 || (arg2.field2114 << arg2.field2111) <= (arg2.field2115 + arg6 + (var26 >> 1))) {
                return;
            }
            this.method864(var28, -15794, var27, arg6, var26, arg4, arg2, var25, arg5);
        } else if (arg0 == 4) {
            int var23 = this.field3085 - this.field3101;
            for (int var24 = 0; var24 < this.field3038; var24++) {
                this.field3037[var24] = var23 + (this.field3037[var24] + arg3.method847(this.field3052[var24] + arg4, this.field3115[var24] + arg6)) - arg5;
            }
        } else if (arg0 == 5) {
            int var16 = this.field3085 - this.field3101;
            for (int var17 = 0; var17 < this.field3038; var17++) {
                int var18 = this.field3052[var17] + arg4;
                int var19 = this.field3115[var17] + arg6;
                int var20 = arg2.method847(var18, var19);
                int var21 = arg3.method847(var18, var19);
                int var22 = var20 - var21 - arg1;
                this.field3037[var17] = ((this.field3037[var17] << 8) / var16 * var22 >> 8) + var20 - arg5;
            }
        }
        this.field3015 = false;
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "ba", descriptor = "()I", line = 4918)
    public final int method77() {
        field3069++;
        return this.field3016;
    }

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "()I", line = 4929)
    public final int method71() {
        field3098++;
        if (!this.field3015) {
            this.method1365(32767);
        }
        return this.field3102;
    }

    @OriginalMember(owner = "client!sb", name = "va", descriptor = "()I", line = 4940)
    public final int method82() {
        field3059++;
        if (!this.field3015) {
            this.method1365(32767);
        }
        return this.field3076;
    }

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "(I)V", line = 4951)
    public final void method72(int arg0) {
        field3056++;
        this.field3016 = arg0;
        if (this.field3116 != null && (this.field3016 & 0x10000) == 0) {
            this.field3045 = this.field3116.field4890;
            this.field3060 = this.field3116.field4889;
            this.field3067 = this.field3116.field4885;
            this.field3057 = this.field3116.field4887;
            this.field3116 = null;
        }
        this.field3122 = true;
        this.method1364((byte) -58);
    }

    @OriginalMember(owner = "client!sb", name = "ca", descriptor = "(III)V", line = 4972)
    public final void method98(int arg0, int arg1, int arg2) {
        field3075++;
        for (int var4 = 0; var4 < this.field3038; var4++) {
            if (arg0 != 0) {
                this.field3052[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3037[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3115[var4] += arg2;
            }
        }
        this.field3015 = false;
        if (this.field3096 != null) {
            this.field3096.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLjava/util/Random;)I", line = 5006)
    public static final int method1375(int arg0, boolean arg1, Random arg2) {
        field3058++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class415.method2366(-122, arg0)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (arg1) {
                return -1;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class351.method1954(arg0, var4, 423047135);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 5040)
    public static void method1376(byte arg0) {
        field3106 = null;
        field3025 = null;
        int var1 = -116 / ((arg0 + 24) / 63);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V", line = 5054)
    private final void method1377(int arg0, boolean arg1) {
        field3026++;
        boolean var3 = this.field3083 != null && this.field3083.field2 == null;
        boolean var4 = this.field3090 != null && this.field3090.field2 == null;
        boolean var5 = this.field3096 != null && this.field3096.field2 == null;
        boolean var6 = this.field3018 != null && this.field3018.field2 == null;
        if (arg1) {
            var3 &= (this.field3017 & 0x2) != 0;
            var6 &= (this.field3017 & 0x8) != 0;
            var4 &= (this.field3017 & 0x4) != 0;
            var5 &= (this.field3017 & 0x1) != 0;
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
        if (this.field3053.field7852.field4929.length < this.field3013 * var7) {
            this.field3053.field7852 = new class385((this.field3013 + 100) * var7);
        } else {
            this.field3053.field7852.field4966 = 0;
        }
        if (arg0 != 4139) {
            method1370(null, -58);
        }
        class385 var12 = this.field3053.field7852;
        if (var5) {
            if (this.field3053.field7754) {
                for (int var21 = 0; var21 < this.field3038; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field3052[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field3037[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field3115[var21]);
                    int var25 = this.field3049[var21];
                    int var26 = this.field3049[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3123[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field4966 = var7 * var28;
                        var12.method2131(var22, -1495157560);
                        var12.method2131(var23, arg0 - 1495161699);
                        var12.method2131(var24, -1495157560);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field3038; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field3052[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field3037[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field3115[var13]);
                    int var17 = this.field3049[var13];
                    int var18 = this.field3049[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3123[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field4966 = var7 * var20;
                        var12.method2092((byte) 99, var14);
                        var12.method2092((byte) 24, var15);
                        var12.method2092((byte) 52, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3090 == null) {
                short[] var29;
                short[] var30;
                short[] var31;
                byte[] var32;
                if (this.field3116 == null) {
                    var32 = this.field3057;
                    var30 = this.field3067;
                    var29 = this.field3045;
                    var31 = this.field3060;
                } else {
                    var29 = this.field3116.field4890;
                    var30 = this.field3116.field4885;
                    var31 = this.field3116.field4889;
                    var32 = this.field3116.field4887;
                }
                float var33 = this.field3053.field7859[0];
                float var34 = this.field3053.field7859[1];
                float var35 = this.field3053.field7859[2];
                float var36 = this.field3053.field7828;
                float var37 = this.field3053.field7788 * 768.0F / (float) this.field3095;
                float var38 = this.field3053.field7805 * 768.0F / (float) this.field3095;
                for (int var39 = 0; var39 < this.field3117; var39++) {
                    int var40 = this.method1367(this.field3024[var39], this.field3093[var39], this.field3105, true, this.field3094[var39]);
                    float var41 = (float) ((var40 & 0xFFD75D) >> 16) * this.field3053.field7774;
                    float var42 = (float) (var40 >>> 24) * this.field3053.field7860;
                    float var43 = (float) ((var40 & 0xFFC4) >> 8) * this.field3053.field7804;
                    short var44 = this.field3070[var39];
                    short var45 = (short) var32[var44];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var31[var44] * var35 + (float) var29[var44] * var34 + (float) var30[var44] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var31[var44] * var35 + (float) var29[var44] * var34 + (float) var30[var44] * var33) / (float) (var45 * 256);
                    }
                    float var47 = (var46 < 0.0F ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var42 * var47);
                    int var49 = (int) (var41 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var43 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.field4966 = var7 * var44 + var9;
                    var12.method2093(var48, -127);
                    var12.method2093(var49, arg0 ^ 0xFFFFEFBF);
                    var12.method2093(var50, -121);
                    var12.method2093(255 - (this.field3094[var39] & 0xFF), -126);
                    short var51 = this.field3077[var39];
                    short var52 = (short) var32[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var31[var51] * var35 + (float) var29[var51] * var34 + (float) var30[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = var36 + var53 * (var53 < 0.0F ? var38 : var37);
                    int var55 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var41 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var43 * var54);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.field4966 = var7 * var51 + var9;
                    var12.method2093(var55, -107);
                    var12.method2093(var56, arg0 - 4266);
                    var12.method2093(var57, -126);
                    var12.method2093(255 - (this.field3094[var39] & 0xFF), -118);
                    short var58 = this.field3029[var39];
                    short var59 = (short) var32[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var31[var58] * var35 + (float) var29[var58] * var34 + (float) var30[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + (var60 < 0.0F ? var38 : var37) * var60;
                    int var62 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var41 * var61);
                    int var64 = (int) (var43 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.field4966 = var7 * var58 + var9;
                    var12.method2093(var62, -104);
                    var12.method2093(var63, -106);
                    var12.method2093(var64, -106);
                    var12.method2093(255 - (this.field3094[var39] & 0xFF), -103);
                }
            } else {
                for (int var65 = 0; var65 < this.field3117; var65++) {
                    int var66 = this.method1367(this.field3024[var65], this.field3093[var65], this.field3105, true, this.field3094[var65]);
                    var12.field4966 = this.field3070[var65] * var7 + var9;
                    var12.method2131(var66, -1495157560);
                    var12.field4966 = this.field3077[var65] * var7 + var9;
                    var12.method2131(var66, arg0 ^ 0xA6E1A4E3);
                    var12.field4966 = var9 + (this.field3029[var65] * var7);
                    var12.method2131(var66, -1495157560);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field3116 == null) {
                var68 = this.field3057;
                var69 = this.field3045;
                var67 = this.field3060;
                var70 = this.field3067;
            } else {
                var67 = this.field3116.field4889;
                var68 = this.field3116.field4887;
                var69 = this.field3116.field4890;
                var70 = this.field3116.field4885;
            }
            float var71 = 3.0F / (float) this.field3095;
            var12.field4966 = var10;
            float var72 = 3.0F / (float) (this.field3095 / 2 + this.field3095);
            if (this.field3053.field7754) {
                for (int var76 = 0; var76 < this.field3013; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2221(-128, (float) var70[var76] * var72);
                        var12.method2221(-128, (float) var69[var76] * var72);
                        var12.method2221(-128, (float) var67[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2221(-128, (float) var70[var76] * var78);
                        var12.method2221(-128, (float) var69[var76] * var78);
                        var12.method2221(-128, (float) var67[var76] * var78);
                    }
                    var12.field4966 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field3013; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2220(-110, (float) var70[var73] * var72);
                        var12.method2220(-83, (float) var69[var73] * var72);
                        var12.method2220(-125, (float) var67[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2220(-128, (float) var70[var73] * var75);
                        var12.method2220(-71, (float) var69[var73] * var75);
                        var12.method2220(-66, (float) var67[var73] * var75);
                    }
                    var12.field4966 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field4966 = var11;
            if (this.field3053.field7754) {
                for (int var79 = 0; var79 < this.field3013; var79++) {
                    var12.method2221(-128, this.field3092[var79]);
                    var12.method2221(-128, this.field3078[var79]);
                    var12.field4966 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field3013; var80++) {
                    var12.method2220(arg0 ^ 0xFFFFEF83, this.field3092[var80]);
                    var12.method2220(-101, this.field3078[var80]);
                    var12.field4966 += var7 - 8;
                }
            }
        }
        var12.field4966 = this.field3013 * var7;
        class21 var81;
        if (arg1) {
            if (this.field3086 == null) {
                this.field3086 = this.field3053.method3132(var12.field4966, var7, 1365, var12.field4929, true);
            } else {
                this.field3086.method136(var12.field4966, var12.field4929, false, var7);
            }
            var81 = this.field3086;
            this.field3017 = 0;
        } else {
            var81 = this.field3053.method3132(var12.field4966, var7, 1365, var12.field4929, false);
            this.field3122 = true;
        }
        if (var5) {
            this.field3096.field2 = var81;
            this.field3096.field3 = var8;
        }
        if (var6) {
            this.field3018.field3 = var11;
            this.field3018.field2 = var81;
        }
        if (var3) {
            this.field3083.field2 = var81;
            this.field3083.field3 = var9;
        }
        if (var4) {
            this.field3090.field3 = var10;
            this.field3090.field2 = var81;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V", line = 5575)
    private final void method1378(int arg0) {
        field3019++;
        if (~this.field3020 == arg0) {
            return;
        }
        if (this.field3017 != 0) {
            this.method1377(arg0 ^ 0xFFFFEFD4, true);
        }
        this.method1377(arg0 ^ 0xFFFFEFD4, false);
        if (this.field3104 != null) {
            if (this.field3104.field2559 == null) {
                this.method1366((byte) 115, (this.field3017 & 0x10) != 0);
            }
            if (this.field3104.field2559 != null) {
                this.field3053.method3106(true, this.field3090 != null);
                this.field3053.method3131(this.field3018, this.field3083, (byte) -122, this.field3096, this.field3090);
                int var2 = this.field3044.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3044[var3];
                    int var5 = this.field3044[var3 + 1];
                    int var6 = this.field3024[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3053.method3061(this.field3090 != null, 6401, var6);
                    this.field3053.method3120(-5727, (var5 - var4) * 3, 4, this.field3104.field2559, var4 * 3);
                }
            }
        }
        this.method1364((byte) -58);
    }

    @OriginalMember(owner = "client!sb", name = "pa", descriptor = "(SS)V", line = 5630)
    public final void method70(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3117; var3++) {
            if (this.field3093[var3] == arg0) {
                this.field3093[var3] = arg1;
            }
        }
        field3042++;
        if (this.field3121 != null) {
            for (int var4 = 0; var4 < this.field3063; var4++) {
                class559 var5 = this.field3121[var4];
                class366 var6 = this.field3051[var4];
                var6.field4811 = class103.field1259[this.field3093[var5.field8225] & 0xFFFF] & 0xFFFFFF | var6.field4811 & 0xFF000000;
            }
        }
        if (this.field3083 != null) {
            this.field3083.field2 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIFBLei;FJI)S", line = 5672)
    private final short method1379(int arg0, int arg1, int arg2, int arg3, float arg4, byte arg5, class152 arg6, float arg7, long arg8, int arg9) {
        field3100++;
        int var12 = this.field3049[arg1];
        int var13 = this.field3049[arg1 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3123[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class64.field633[var15] == arg8) {
                return (short) (var16 - 1);
            }
        }
        this.field3123[var14] = (short) (this.field3013 + 1);
        class64.field633[var14] = arg8;
        this.field3067[this.field3013] = (short) arg9;
        this.field3045[this.field3013] = (short) arg2;
        this.field3060[this.field3013] = (short) arg3;
        this.field3057[this.field3013] = (byte) arg0;
        if (arg5 != -32) {
            this.field3017 = -97;
        }
        this.field3092[this.field3013] = arg7;
        this.field3078[this.field3013] = arg4;
        return (short) (this.field3013++);
    }
}
