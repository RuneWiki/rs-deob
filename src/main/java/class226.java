import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class226 extends class334 {

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Z")
    private boolean field3126 = true;

    @OriginalMember(owner = "client!rd", name = "ib", descriptor = "I")
    private int field3170 = 0;

    @OriginalMember(owner = "client!rd", name = "Pb", descriptor = "I")
    private int field3203 = 0;

    @OriginalMember(owner = "client!rd", name = "Ib", descriptor = "I")
    private int field3196 = 0;

    @OriginalMember(owner = "client!rd", name = "bc", descriptor = "Z")
    private boolean field3215 = false;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    private int field3123 = 0;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    private int field3151 = 0;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Lnq;")
    private class325 field3144;

    @OriginalMember(owner = "client!rd", name = "nb", descriptor = "Lm;")
    private class129 field3175;

    @OriginalMember(owner = "client!rd", name = "pc", descriptor = "Lm;")
    private class129 field3229;

    @OriginalMember(owner = "client!rd", name = "jc", descriptor = "Lm;")
    private class129 field3223;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "Lm;")
    private class129 field3155;

    @OriginalMember(owner = "client!rd", name = "Ab", descriptor = "Lfj;")
    private class474 field3188;

    @OriginalMember(owner = "client!rd", name = "yb", descriptor = "I")
    private int field3186;

    @OriginalMember(owner = "client!rd", name = "nc", descriptor = "I")
    private int field3227;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "[I")
    private int[] field3148;

    @OriginalMember(owner = "client!rd", name = "vb", descriptor = "[I")
    private int[] field3183;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[S")
    private short[] field3125;

    @OriginalMember(owner = "client!rd", name = "lb", descriptor = "[I")
    private int[] field3173;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    private int[] field3133;

    @OriginalMember(owner = "client!rd", name = "ob", descriptor = "[Llq;")
    private class392[] field3176;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[Lhd;")
    private class531[] field3128;

    @OriginalMember(owner = "client!rd", name = "Hb", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "[Lbn;")
    private class312[] field3122;

    @OriginalMember(owner = "client!rd", name = "Ob", descriptor = "[Lsr;")
    private class168[] field3202;

    @OriginalMember(owner = "client!rd", name = "qb", descriptor = "[B")
    private byte[] field3178;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "[S")
    private short[] field3167;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "[S")
    private short[] field3159;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "S")
    private short field3150;

    @OriginalMember(owner = "client!rd", name = "Nb", descriptor = "[S")
    private short[] field3201;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "[F")
    private float[] field3131;

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "[S")
    private short[] field3163;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[S")
    private short[] field3140;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "[S")
    private short[] field3165;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "[S")
    private short[] field3157;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[S")
    private short[] field3141;

    @OriginalMember(owner = "client!rd", name = "Jb", descriptor = "[B")
    private byte[] field3197;

    @OriginalMember(owner = "client!rd", name = "Wb", descriptor = "[F")
    private float[] field3210;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "[S")
    private short[] field3162;

    @OriginalMember(owner = "client!rd", name = "oc", descriptor = "[S")
    private short[] field3228;

    @OriginalMember(owner = "client!rd", name = "kb", descriptor = "S")
    private short field3172;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
    private int[] field3135;

    @OriginalMember(owner = "client!rd", name = "Rb", descriptor = "[[I")
    private int[][] field3205;

    @OriginalMember(owner = "client!rd", name = "sb", descriptor = "[[I")
    private int[][] field3180;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[[I")
    private int[][] field3145;

    @OriginalMember(owner = "client!rd", name = "Vb", descriptor = "I")
    public static int field3209 = 1400;

    @OriginalMember(owner = "client!rd", name = "gc", descriptor = "I")
    public static int field3220 = 1405;

    @OriginalMember(owner = "client!rd", name = "Mb", descriptor = "Lwh;")
    public static class101 field3200 = new class101("RC", 1);

    @OriginalMember(owner = "client!rd", name = "rb", descriptor = "B")
    private byte field3179;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!rd", name = "gb", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rd", name = "jb", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!rd", name = "mb", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rd", name = "wb", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!rd", name = "xb", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!rd", name = "zb", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!rd", name = "Bb", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!rd", name = "Db", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!rd", name = "Eb", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rd", name = "Gb", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!rd", name = "Lb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!rd", name = "Qb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!rd", name = "Sb", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!rd", name = "Ub", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!rd", name = "Xb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!rd", name = "Yb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rd", name = "Zb", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rd", name = "ac", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!rd", name = "dc", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rd", name = "ec", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!rd", name = "fc", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rd", name = "hc", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!rd", name = "ic", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rd", name = "kc", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!rd", name = "lc", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!rd", name = "mc", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rd", name = "cc", descriptor = "Lvf;")
    private class105 field3216;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lrs;")
    private class470 field3134;

    @OriginalMember(owner = "client!rd", name = "Fb", descriptor = "Lms;")
    private class541 field3193;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "S")
    private short field3132;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "S")
    private short field3147;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "S")
    private short field3153;

    @OriginalMember(owner = "client!rd", name = "ub", descriptor = "S")
    private short field3182;

    @OriginalMember(owner = "client!rd", name = "Cb", descriptor = "S")
    private short field3190;

    @OriginalMember(owner = "client!rd", name = "Kb", descriptor = "S")
    private short field3198;

    @OriginalMember(owner = "client!rd", name = "Tb", descriptor = "S")
    private short field3207;

    @OriginalMember(owner = "client!rd", name = "YA", descriptor = "()V")
    public final void method84() {
        field3208++;
        for (int var1 = 0; var1 < this.field3196; var1++) {
            this.field3173[var1] = -this.field3173[var1];
        }
        for (int var2 = 0; var2 < this.field3151; var2++) {
            this.field3157[var2] = (short) (-this.field3157[var2]);
        }
        for (int var3 = 0; var3 < this.field3203; var3++) {
            short var4 = this.field3141[var3];
            this.field3141[var3] = this.field3228[var3];
            this.field3228[var3] = var4;
        }
        if (this.field3223 == null && this.field3155 != null) {
            this.field3155.field1742 = null;
        }
        if (this.field3223 != null) {
            this.field3223.field1742 = null;
        }
        this.field3215 = false;
        if (this.field3188 != null) {
            this.field3188.field7043 = null;
        }
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILn;Z)Z")
    public final boolean method68(int arg0, int arg1, class14 arg2, boolean arg3) {
        field3204++;
        class416 var5 = (class416) arg2;
        class416 var6 = this.field3144.field4935;
        float var7 = var5.field6329 * var6.field6348 + var5.field6353 * var6.field6340 + var5.field6322 * var6.field6324 + var6.field6353;
        float var8 = var5.field6329 * var6.field6330 + var5.field6353 * var6.field6334 + var5.field6322 * var6.field6347 + var6.field6322;
        class423.field6454 = var5.field6351 * var6.field6330 + var5.field6347 * var6.field6347 + var5.field6324 * var6.field6334;
        class289.field4231 = var5.field6332 * var6.field6348 + var5.field6348 * var6.field6340 + var5.field6330 * var6.field6324;
        class420.field6400 = var5.field6351 * var6.field6332 + var5.field6347 * var6.field6351 + var5.field6324 * var6.field6354;
        class374.field5686 = var5.field6354 * var6.field6348 + var5.field6340 * var6.field6340 + var5.field6334 * var6.field6324;
        class86.field1252 = var5.field6332 * var6.field6330 + var5.field6348 * var6.field6334 + var5.field6330 * var6.field6347;
        float var9 = var5.field6329 * var6.field6332 + var5.field6353 * var6.field6354 + var5.field6322 * var6.field6351 + var6.field6329;
        class520.field7657 = var5.field6332 * var6.field6332 + var5.field6348 * var6.field6354 + var5.field6330 * var6.field6351;
        class213.field3026 = var5.field6354 * var6.field6332 + var5.field6340 * var6.field6354 + var5.field6334 * var6.field6351;
        class177.field2360 = var5.field6351 * var6.field6348 + var5.field6347 * var6.field6324 + var5.field6324 * var6.field6340;
        class411.field6252 = var5.field6354 * var6.field6330 + var5.field6340 * var6.field6334 + var5.field6334 * var6.field6347;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field3144.field4918;
        int var16 = this.field3144.field4937;
        if (!this.field3215) {
            this.method1509(false);
        }
        class539.field7906[0] = this.field3147;
        class428.field6505[0] = this.field3198;
        class296.field4367[0] = this.field3132;
        class539.field7906[1] = this.field3207;
        class428.field6505[1] = this.field3198;
        class296.field4367[1] = this.field3132;
        class539.field7906[2] = this.field3147;
        class428.field6505[2] = this.field3190;
        class296.field4367[2] = this.field3132;
        class539.field7906[3] = this.field3207;
        class428.field6505[3] = this.field3190;
        class296.field4367[3] = this.field3132;
        class539.field7906[4] = this.field3147;
        class428.field6505[4] = this.field3198;
        class539.field7906[5] = this.field3207;
        class296.field4367[4] = this.field3153;
        class428.field6505[5] = this.field3198;
        class539.field7906[6] = this.field3147;
        class296.field4367[5] = this.field3153;
        class428.field6505[6] = this.field3190;
        class539.field7906[7] = this.field3207;
        class296.field4367[6] = this.field3153;
        class428.field6505[7] = this.field3190;
        class296.field4367[7] = this.field3153;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class296.field4367[var17];
            float var39 = (float) class539.field7906[var17];
            float var40 = (float) class428.field6505[var17];
            float var41 = class86.field1252 * var38 + class423.field6454 * var40 + class411.field6252 * var39 + var8;
            float var42 = class520.field7657 * var38 + class420.field6400 * var40 + class213.field3026 * var39 + var9;
            float var43 = class289.field4231 * var38 + class374.field5686 * var39 + class177.field2360 * var40 + var7;
            if (var42 >= (float) this.field3144.field4958) {
                float var44 = (float) var15 * var43 / var42 + (float) this.field3144.field5021;
                if (var44 < var11) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var41 / var42 + (float) this.field3144.field5014;
                if (var44 > var12) {
                    var12 = var44;
                }
                if (var13 > var45) {
                    var13 = var45;
                }
                var10 = true;
                if (var45 > var14) {
                    var14 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field3151 > this.field3144.field5039.length) {
                this.field3144.field5039 = new int[this.field3151];
                this.field3144.field5041 = new int[this.field3151];
            }
            int[] var18 = this.field3144.field5039;
            int[] var19 = this.field3144.field5041;
            for (int var20 = 0; var20 < this.field3196; var20++) {
                float var22 = (float) this.field3133[var20];
                float var23 = (float) this.field3173[var20];
                float var24 = (float) this.field3183[var20];
                float var25 = class520.field7657 * var23 + class420.field6400 * var22 + class213.field3026 * var24 + var9;
                float var26 = class289.field4231 * var23 + class374.field5686 * var24 + class177.field2360 * var22 + var7;
                float var27 = class86.field1252 * var23 + class423.field6454 * var22 + class411.field6252 * var24 + var8;
                if ((var25 >= (float) this.field3144.field4958)) {
                    int var32 = (int) ((float) var15 * var26 / var25 + (float) this.field3144.field5021);
                    int var33 = (int) ((float) var16 * var27 / var25 + (float) this.field3144.field5014);
                    int var34 = this.field3148[var20];
                    int var35 = this.field3148[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field3163[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field3148[var20];
                    int var29 = this.field3148[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field3163[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field3163[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field3203; var21++) {
                if (var18[this.field3141[var21]] != -999999 && var18[this.field3167[var21]] != -999999 && var18[this.field3228[var21]] != -999999 && this.method1520(-16384, var18[this.field3141[var21]], var19[this.field3167[var21]], arg0, var18[this.field3228[var21]], var19[this.field3228[var21]], var19[this.field3141[var21]], arg1, var18[this.field3167[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "(I[IIIIZI[I)V")
    public final void method27(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3212++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            class181.field2455 = 0;
            class160.field2085 = 0;
            int var13 = 0;
            class152.field1982 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field3205.length > var15) {
                    int[] var16 = this.field3205[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3125 == null || (arg6 & this.field3125[var18]) != 0) {
                            class160.field2085 += this.field3183[var18];
                            class152.field1982 += this.field3133[var18];
                            var13++;
                            class181.field2455 += this.field3173[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class152.field1982 = var11;
                class181.field2455 = var12;
                class160.field2085 = var10;
            } else {
                class152.field1982 = class152.field1982 / var13 + var11;
                class160.field2085 = class160.field2085 / var13 + var10;
                class390.field5960 = true;
                class181.field2455 = class181.field2455 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 16384 >> 15;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 + (arg7[5] * arg4) + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3205.length) {
                    int[] var27 = this.field3205[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3125 == null || (arg6 & this.field3125[var29]) != 0) {
                            this.field3183[var29] += var24;
                            this.field3133[var29] += var22;
                            this.field3173[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field3205.length > var49) {
                        int[] var50 = this.field3205[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field3125 == null || (arg6 & this.field3125[var52]) != 0) {
                                this.field3183[var52] -= class160.field2085;
                                this.field3133[var52] -= class152.field1982;
                                this.field3173[var52] -= class181.field2455;
                                if (arg4 != 0) {
                                    int var53 = class428.field6502[arg4];
                                    int var54 = class428.field6501[arg4];
                                    int var55 = this.field3183[var52] * var54 + (this.field3133[var52] * var53 + 32767) >> 15;
                                    this.field3133[var52] = this.field3133[var52] * var54 + 32767 - (this.field3183[var52] * var53) >> 15;
                                    this.field3183[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class428.field6502[arg2];
                                    int var57 = class428.field6501[arg2];
                                    int var58 = this.field3133[var52] * var57 + 32767 - (this.field3173[var52] * var56) >> 15;
                                    this.field3173[var52] = this.field3133[var52] * var56 + this.field3173[var52] * var57 + 32767 >> 15;
                                    this.field3133[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class428.field6502[arg3];
                                    int var60 = class428.field6501[arg3];
                                    int var61 = this.field3183[var52] * var60 + this.field3173[var52] * var59 + 32767 >> 15;
                                    this.field3173[var52] = this.field3173[var52] * var60 + 32767 - (this.field3183[var52] * var59) >> 15;
                                    this.field3183[var52] = var61;
                                }
                                this.field3183[var52] += class160.field2085;
                                this.field3133[var52] += class152.field1982;
                                this.field3173[var52] += class181.field2455;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field3205.length) {
                            int[] var33 = this.field3205[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field3125 == null || (arg6 & this.field3125[var35]) != 0) {
                                    int var36 = this.field3148[var35];
                                    int var37 = this.field3148[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field3163[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class428.field6502[arg4];
                                            int var41 = class428.field6501[arg4];
                                            int var42 = this.field3165[var39] * var40 + this.field3162[var39] * var41 + 32767 >> 15;
                                            this.field3165[var39] = (short) (this.field3165[var39] * var41 + 32767 - (this.field3162[var39] * var40) >> 15);
                                            this.field3162[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class428.field6502[arg2];
                                            int var44 = class428.field6501[arg2];
                                            int var45 = this.field3165[var39] * var44 - (this.field3157[var39] * var43 - 32767) >> 15;
                                            this.field3157[var39] = (short) (this.field3165[var39] * var43 + this.field3157[var39] * var44 + 32767 >> 15);
                                            this.field3165[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class428.field6502[arg3];
                                            int var47 = class428.field6501[arg3];
                                            int var48 = this.field3157[var39] * var46 + (this.field3162[var39] * var47) + 32767 >> 15;
                                            this.field3157[var39] = (short) (this.field3157[var39] * var47 + 32767 - (this.field3162[var39] * var46) >> 15);
                                            this.field3162[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3223 == null && this.field3155 != null) {
                        this.field3155.field1742 = null;
                    }
                    if (this.field3223 != null) {
                        this.field3223.field1742 = null;
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
                if (class390.field5960) {
                    int var68 = arg7[6] * class181.field2455 + arg7[3] * class152.field1982 + arg7[0] * class160.field2085 + 16384 >> 15;
                    int var69 = arg7[1] * class160.field2085 + (arg7[4] * class152.field1982) + (arg7[7] * class181.field2455) + 16384 >> 15;
                    int var70 = var65 + var68;
                    int var71 = arg7[5] * class152.field1982 + arg7[2] * class160.field2085 + (arg7[8] * class181.field2455) + 16384 >> 15;
                    int var72 = var66 + var69;
                    class152.field1982 = var72;
                    class160.field2085 = var70;
                    int var73 = var67 + var71;
                    class390.field5960 = false;
                    class181.field2455 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class428.field6501[arg2];
                int var76 = class428.field6502[arg2];
                int var77 = class428.field6501[arg3];
                int var78 = class428.field6502[arg3];
                int var79 = class428.field6501[arg4];
                int var80 = class428.field6502[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[5] = -var76;
                var74[0] = var78 * var82 + var77 * var79 + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[7] = var78 * var80 - (-(var77 * var81) - 16384) >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[6] = -var78 * var79 + (var77 * var82) + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                int var83 = var74[2] * -class181.field2455 + var74[1] * -class152.field1982 + var74[0] * -class160.field2085 + 16384 >> 15;
                int var84 = var74[5] * -class181.field2455 + (var74[3] * -class160.field2085 + (var74[4] * -class152.field1982)) + 16384 >> 15;
                int var85 = var74[6] * -class160.field2085 + (var74[7] * -class152.field1982) + var74[8] * -class181.field2455 + 16384 >> 15;
                int var86 = var83 + class160.field2085;
                int var87 = class152.field1982 + var84;
                int var88 = class181.field2455 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[2] * var67 + var74[0] * var65 + var74[1] * var66 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 16384 >> 15;
                int var93 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 16384 >> 15;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += var89[var116 + (var118 * 3)] * arg7[var98 * 3 + var118];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[1] * var94 + arg7[0] * var95 + 16384 >> 15;
                int var100 = arg7[3] * var95 + (arg7[4] * var94) + (arg7[5] * var96) + 16384 >> 15;
                int var101 = arg7[8] * var96 + arg7[6] * var95 - (-(arg7[7] * var94) - 16384) >> 15;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field3205.length) {
                        int[] var107 = this.field3205[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field3125 == null || (this.field3125[var109] & arg6) != 0) {
                                int var110 = this.field3133[var109] * var97[1] + (this.field3183[var109] * var97[0] + (this.field3173[var109] * var97[2])) + 16384 >> 15;
                                int var111 = this.field3173[var109] * var97[5] + this.field3133[var109] * var97[4] + this.field3183[var109] * var97[3] + 16384 >> 15;
                                int var112 = var102 + var111;
                                int var113 = var103 + var110;
                                int var114 = this.field3183[var109] * var97[6] + 16384 - (-(this.field3133[var109] * var97[7]) - this.field3173[var109] * var97[8]) >> 15;
                                this.field3183[var109] = var113;
                                int var115 = var104 + var114;
                                this.field3133[var109] = var112;
                                this.field3173[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field3205.length) {
                        int[] var174 = this.field3205[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field3125 == null || (this.field3125[var176] & arg6) != 0) {
                                this.field3183[var176] -= class160.field2085;
                                this.field3133[var176] -= class152.field1982;
                                this.field3173[var176] -= class181.field2455;
                                this.field3183[var176] = this.field3183[var176] * arg2 >> 7;
                                this.field3133[var176] = this.field3133[var176] * arg3 >> 7;
                                this.field3173[var176] = this.field3173[var176] * arg4 >> 7;
                                this.field3183[var176] += class160.field2085;
                                this.field3133[var176] += class152.field1982;
                                this.field3173[var176] += class181.field2455;
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
                if (class390.field5960) {
                    int var128 = arg7[6] * class181.field2455 + arg7[0] * class160.field2085 + arg7[3] * class152.field1982 + 16384 >> 15;
                    int var129 = arg7[1] * class160.field2085 + arg7[7] * class181.field2455 + arg7[4] * class152.field1982 + 16384 >> 15;
                    int var130 = arg7[2] * class160.field2085 + arg7[5] * class152.field1982 + (arg7[8] * class181.field2455) + 16384 >> 15;
                    int var131 = var126 + var129;
                    int var132 = var125 + var128;
                    int var133 = var127 + var130;
                    class160.field2085 = var132;
                    class152.field1982 = var131;
                    class390.field5960 = false;
                    class181.field2455 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class160.field2085 * var134 + 16384 >> 15;
                int var138 = -class152.field1982 * var135 + 16384 >> 15;
                int var139 = -class181.field2455 * var136 + 16384 >> 15;
                int var140 = var137 + class160.field2085;
                int var141 = class152.field1982 + var138;
                int var142 = var139 + class181.field2455;
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
                int var152 = arg7[0] * var146 + arg7[1] * var148 + arg7[2] * var149 + 16384 >> 15;
                int var153 = arg7[5] * var149 + arg7[3] * var146 + arg7[4] * var148 + 16384 >> 15;
                int var154 = var122 + var152;
                int var155 = arg7[8] * var149 + arg7[6] * var146 + arg7[7] * var148 + 16384 >> 15;
                int var156 = var123 + var153;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field3205.length) {
                        int[] var160 = this.field3205[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field3125 == null || (this.field3125[var162] & arg6) != 0) {
                                int var163 = this.field3133[var162] * var150[1] + this.field3183[var162] * var150[0] + this.field3173[var162] * var150[2] + 16384 >> 15;
                                int var164 = this.field3173[var162] * var150[5] + this.field3183[var162] * var150[3] + (this.field3133[var162] * var150[4]) + 16384 >> 15;
                                int var165 = var156 + var164;
                                int var166 = var154 + var163;
                                int var167 = this.field3183[var162] * var150[6] + 16384 - (-(this.field3173[var162] * var150[8]) - (this.field3133[var162] * var150[7])) >> 15;
                                this.field3183[var162] = var166;
                                int var168 = var157 + var167;
                                this.field3133[var162] = var165;
                                this.field3173[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3145 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field3145.length > var181) {
                        int[] var182 = this.field3145[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3201 == null || (arg6 & this.field3201[var184]) != 0) {
                                int var185 = (this.field3178[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3178[var184] = (byte) var185;
                                if (this.field3155 != null) {
                                    this.field3155.field1742 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3122 != null) {
                    for (int var178 = 0; var178 < this.field3195; var178++) {
                        class312 var179 = this.field3122[var178];
                        class168 var180 = this.field3202[var178];
                        var180.field2267 = 255 - (this.field3178[var179.field4567] & 0xFF) << 24 | var180.field2267 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3145 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field3145.length > var190) {
                        int[] var191 = this.field3145[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3201 == null || (this.field3201[var193] & arg6) != 0) {
                                int var194 = this.field3159[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = (var194 & 0x3B8) >> 7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field3159[var193] = (short) class311.method1956(var200, class311.method1956(var199 << 7, var197 << 10));
                                if (this.field3155 != null) {
                                    this.field3155.field1742 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3122 != null) {
                    for (int var187 = 0; var187 < this.field3195; var187++) {
                        class312 var188 = this.field3122[var187];
                        class168 var189 = this.field3202[var187];
                        var189.field2267 = class401.field6108[this.field3159[var188.field4567] & 0xFFFF] & 0xFFFFFF | var189.field2267 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3180 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field3180.length) {
                        int[] var203 = this.field3180[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class168 var205 = this.field3202[var203[var204]];
                            var205.field2268 += arg3;
                            var205.field2263 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3180 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field3180.length > var207) {
                        int[] var208 = this.field3180[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class168 var210 = this.field3202[var208[var209]];
                            var210.field2264 = var210.field2264 * arg3 >> 7;
                            var210.field2260 = var210.field2260 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3180 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field3180.length > var212) {
                    int[] var213 = this.field3180[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class168 var215 = this.field3202[var213[var214]];
                        var215.field2259 = var215.field2259 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "la", descriptor = "(IIII)V")
    public final void method28(int arg0, int arg1, int arg2, int arg3) {
        field3213++;
        if (arg0 == 0) {
            class152.field1982 = 0;
            class181.field2455 = 0;
            class160.field2085 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field3196; var6++) {
                class160.field2085 += this.field3183[var6];
                class152.field1982 += this.field3133[var6];
                class181.field2455 += this.field3173[var6];
                var5++;
            }
            if (var5 > 0) {
                class181.field2455 = class181.field2455 / var5 + arg3;
                class160.field2085 = class160.field2085 / var5 + arg1;
                class152.field1982 = class152.field1982 / var5 + arg2;
            } else {
                class152.field1982 = arg2;
                class181.field2455 = arg3;
                class160.field2085 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3196; var7++) {
                this.field3183[var7] += arg1;
                this.field3133[var7] += arg2;
                this.field3173[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3196; var8++) {
                this.field3183[var8] -= class160.field2085;
                this.field3133[var8] -= class152.field1982;
                this.field3173[var8] -= class181.field2455;
                if (arg3 != 0) {
                    int var9 = class428.field6502[arg3];
                    int var10 = class428.field6501[arg3];
                    int var11 = this.field3183[var8] * var10 + this.field3133[var8] * var9 + 32767 >> 15;
                    this.field3133[var8] = this.field3133[var8] * var10 + 32767 - (this.field3183[var8] * var9) >> 15;
                    this.field3183[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class428.field6502[arg1];
                    int var13 = class428.field6501[arg1];
                    int var14 = this.field3133[var8] * var13 + 32767 - (this.field3173[var8] * var12) >> 15;
                    this.field3173[var8] = this.field3133[var8] * var12 + this.field3173[var8] * var13 + 32767 >> 15;
                    this.field3133[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class428.field6502[arg2];
                    int var16 = class428.field6501[arg2];
                    int var17 = this.field3183[var8] * var16 + this.field3173[var8] * var15 + 32767 >> 15;
                    this.field3173[var8] = this.field3173[var8] * var16 - (this.field3183[var8] * var15 - 32767) >> 15;
                    this.field3183[var8] = var17;
                }
                this.field3183[var8] += class160.field2085;
                this.field3133[var8] += class152.field1982;
                this.field3173[var8] += class181.field2455;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3196; var18++) {
                this.field3183[var18] -= class160.field2085;
                this.field3133[var18] -= class152.field1982;
                this.field3173[var18] -= class181.field2455;
                this.field3183[var18] = this.field3183[var18] * arg1 / 128;
                this.field3133[var18] = this.field3133[var18] * arg2 / 128;
                this.field3173[var18] = this.field3173[var18] * arg3 / 128;
                this.field3183[var18] += class160.field2085;
                this.field3133[var18] += class152.field1982;
                this.field3173[var18] += class181.field2455;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3203; var19++) {
                int var23 = (this.field3178[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3178[var19] = (byte) var23;
            }
            if (this.field3155 != null) {
                this.field3155.field1742 = null;
            }
            if (this.field3122 != null) {
                for (int var20 = 0; var20 < this.field3195; var20++) {
                    class312 var21 = this.field3122[var20];
                    class168 var22 = this.field3202[var20];
                    var22.field2267 = var22.field2267 & 0xFFFFFF | 255 - (this.field3178[var21.field4567] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3203; var24++) {
                int var28 = this.field3159[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3A3) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3159[var24] = (short) class311.method1956(var34, class311.method1956(var32 << 7, var33 << 10));
            }
            if (this.field3155 != null) {
                this.field3155.field1742 = null;
            }
            if (this.field3122 != null) {
                for (int var25 = 0; var25 < this.field3195; var25++) {
                    class312 var26 = this.field3122[var25];
                    class168 var27 = this.field3202[var25];
                    var27.field2267 = class401.field6108[this.field3159[var26.field4567] & 0xFFFF] & 0xFFFFFF | var27.field2267 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3195; var35++) {
                class168 var36 = this.field3202[var35];
                var36.field2268 += arg2;
                var36.field2263 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3195; var37++) {
                class168 var38 = this.field3202[var37];
                var38.field2260 = var38.field2260 * arg1 >> 7;
                var38.field2264 = var38.field2264 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3195; var39++) {
                class168 var40 = this.field3202[var39];
                var40.field2259 = var40.field2259 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V")
    private final void method1508(boolean arg0, int arg1) {
        field3224++;
        if (this.field3144.field4943.field2219.length < (this.field3170 * 6)) {
            this.field3144.field4943 = new class283((this.field3170 + 100) * 6);
        } else {
            this.field3144.field4943.field2185 = 0;
        }
        if (arg1 != 5123) {
            this.method58();
        }
        class283 var3 = this.field3144.field4943;
        if (this.field3144.field4974) {
            for (int var4 = 0; var4 < this.field3170; var4++) {
                var3.method1114(this.field3141[var4], 102);
                var3.method1114(this.field3167[var4], arg1 - 5028);
                var3.method1114(this.field3228[var4], arg1 - 5034);
            }
        } else {
            for (int var5 = 0; var5 < this.field3170; var5++) {
                var3.method1111(this.field3141[var5], arg1 + 16128);
                var3.method1111(this.field3167[var5], arg1 ^ 0x4700);
                var3.method1111(this.field3228[var5], 21251);
            }
        }
        if (var3.field2185 == 0) {
            return;
        }
        if (arg0) {
            if (this.field3216 == null) {
                this.field3216 = this.field3144.method2094(true, var3.field2185, 5123, true, var3.field2219);
            } else {
                this.field3216.method675((byte) -127, var3.field2185, var3.field2219, 5123);
            }
            this.field3188.field7043 = this.field3216;
        } else {
            this.field3188.field7043 = this.field3144.method2094(false, var3.field2185, 5123, true, var3.field2219);
        }
        if (!arg0) {
            this.field3126 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "(I)V")
    public final void method63(int arg0) {
        field3214++;
        int var2 = class428.field6502[arg0];
        int var3 = class428.field6501[arg0];
        for (int var4 = 0; var4 < this.field3196; var4++) {
            int var5 = this.field3133[var4] * var3 - (this.field3173[var4] * var2) >> 15;
            this.field3173[var4] = this.field3173[var4] * var3 + this.field3133[var4] * var2 >> 15;
            this.field3133[var4] = var5;
        }
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
        this.field3215 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    private final void method1509(boolean arg0) {
        field3121++;
        if (arg0) {
            this.method1518(null, -13);
        }
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3196; var10++) {
            int var11 = this.field3183[var10];
            int var12 = this.field3133[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field3173[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var11 * var11 + var13 * var13 + (var12 * var12);
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field3153 = (short) var7;
        this.field3190 = (short) var6;
        this.field3198 = (short) var3;
        this.field3147 = (short) var2;
        this.field3132 = (short) var4;
        this.field3207 = (short) var5;
        this.field3182 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field3215 = true;
    }

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "()I")
    public final int method88() {
        field3169++;
        if (!this.field3215) {
            this.method1509(false);
        }
        return this.field3182;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLgu;)V")
    private final void method1510(byte arg0, class416 arg1) {
        field3136++;
        if (this.field3176 != null) {
            for (int var3 = 0; var3 < this.field3176.length; var3++) {
                class392 var4 = this.field3176[var3];
                class392 var5 = var4;
                if (var4.field5982 != null) {
                    var5 = var4.field5982;
                }
                var5.field5992 = (int) ((float) this.field3173[var4.field5994] * arg1.field6348 + (float) this.field3183[var4.field5994] * arg1.field6340 + (float) this.field3133[var4.field5994] * arg1.field6324 + arg1.field6353);
                var5.field5993 = (int) ((float) this.field3173[var4.field5994] * arg1.field6330 + (float) this.field3183[var4.field5994] * arg1.field6334 + (float) this.field3133[var4.field5994] * arg1.field6347 + arg1.field6322);
                var5.field5991 = (int) ((float) this.field3173[var4.field5994] * arg1.field6332 + (float) this.field3183[var4.field5994] * arg1.field6354 + (float) this.field3133[var4.field5994] * arg1.field6351 + arg1.field6329);
                var5.field6002 = (int) ((float) this.field3173[var4.field5989] * arg1.field6348 + (float) this.field3183[var4.field5989] * arg1.field6340 + (float) this.field3133[var4.field5989] * arg1.field6324 + arg1.field6353);
                var5.field5985 = (int) ((float) this.field3173[var4.field5989] * arg1.field6330 + (float) this.field3183[var4.field5989] * arg1.field6334 + (float) this.field3133[var4.field5989] * arg1.field6347 + arg1.field6322);
                var5.field6001 = (int) ((float) this.field3173[var4.field5989] * arg1.field6332 + (float) this.field3183[var4.field5989] * arg1.field6354 + (float) this.field3133[var4.field5989] * arg1.field6351 + arg1.field6329);
                var5.field5998 = (int) ((float) this.field3173[var4.field5997] * arg1.field6348 + (float) this.field3183[var4.field5997] * arg1.field6340 + (float) this.field3133[var4.field5997] * arg1.field6324 + arg1.field6353);
                var5.field5995 = (int) ((float) this.field3173[var4.field5997] * arg1.field6330 + (float) this.field3183[var4.field5997] * arg1.field6334 + (float) this.field3133[var4.field5997] * arg1.field6347 + arg1.field6322);
                var5.field5986 = (int) ((float) this.field3173[var4.field5997] * arg1.field6332 + (float) this.field3183[var4.field5997] * arg1.field6354 + (float) this.field3133[var4.field5997] * arg1.field6351 + arg1.field6329);
            }
        }
        if (arg0 >= -93 || this.field3128 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3128.length; var6++) {
            class531 var7 = this.field3128[var6];
            class531 var8 = var7;
            if (var7.field7806 != null) {
                var8 = var7.field7806;
            }
            if (var7.field7807 == null) {
                var7.field7807 = arg1.method155();
            } else {
                var7.field7807.method151(arg1);
            }
            var8.field7802 = (int) ((float) this.field3173[var7.field7809] * arg1.field6348 + (float) this.field3183[var7.field7809] * arg1.field6340 + (float) this.field3133[var7.field7809] * arg1.field6324 + arg1.field6353);
            var8.field7810 = (int) ((float) this.field3173[var7.field7809] * arg1.field6330 + (float) this.field3183[var7.field7809] * arg1.field6334 + (float) this.field3133[var7.field7809] * arg1.field6347 + arg1.field6322);
            var8.field7803 = (int) ((float) this.field3173[var7.field7809] * arg1.field6332 + (float) this.field3183[var7.field7809] * arg1.field6354 + (float) this.field3133[var7.field7809] * arg1.field6351 + arg1.field6329);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIZ)Lka;")
    public final class334 method47(byte arg0, int arg1, boolean arg2) {
        field3152++;
        class226 var4;
        class226 var5;
        if (arg0 == 1) {
            var4 = this.field3144.field4942;
            var5 = this.field3144.field4972;
        } else if (arg0 == 2) {
            var4 = this.field3144.field4963;
            var5 = this.field3144.field4956;
        } else if (arg0 == 3) {
            var4 = this.field3144.field5009;
            var5 = this.field3144.field4954;
        } else if (arg0 == 4) {
            var5 = this.field3144.field4985;
            var4 = this.field3144.field4957;
        } else if (arg0 == 5) {
            var5 = this.field3144.field4927;
            var4 = this.field3144.field5015;
        } else {
            var5 = var4 = new class226(this.field3144);
        }
        return this.method1511(var4, 1, var5, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        field3217++;
        for (int var5 = 0; var5 < this.field3203; var5++) {
            int var9 = this.field3159[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3A9) >> 7;
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
            this.field3159[var5] = (short) class311.method1956(class311.method1956(var10 << 10, var11 << 7), var12);
        }
        if (this.field3122 != null) {
            for (int var6 = 0; var6 < this.field3195; var6++) {
                class312 var7 = this.field3122[var6];
                class168 var8 = this.field3202[var6];
                var8.field2267 = var8.field2267 & 0xFF000000 | class401.field6108[this.field3159[var7.field4567] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3155 != null) {
            this.field3155.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "(I)V")
    public final void method79(int arg0) {
        field3211++;
        int var2 = class428.field6502[arg0];
        int var3 = class428.field6501[arg0];
        for (int var4 = 0; var4 < this.field3196; var4++) {
            int var7 = this.field3183[var4] * var3 + this.field3173[var4] * var2 >> 15;
            this.field3173[var4] = this.field3173[var4] * var3 - (this.field3183[var4] * var2) >> 15;
            this.field3183[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3151; var5++) {
            int var6 = this.field3157[var5] * var2 + (this.field3162[var5] * var3) >> 15;
            this.field3157[var5] = (short) (this.field3157[var5] * var3 - (this.field3162[var5] * var2) >> 15);
            this.field3162[var5] = (short) var6;
        }
        if (this.field3223 == null && this.field3155 != null) {
            this.field3155.field1742 = null;
        }
        if (this.field3223 != null) {
            this.field3223.field1742 = null;
        }
        this.field3215 = false;
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "(IILo;Lo;III)V")
    public final void method80(int arg0, int arg1, class23 arg2, class23 arg3, int arg4, int arg5, int arg6) {
        if (!this.field3215) {
            this.method1509(false);
        }
        field3187++;
        int var8 = this.field3147 + arg4;
        int var9 = arg4 + this.field3207;
        int var10 = this.field3132 + arg6;
        int var11 = arg6 + this.field3153;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field340 <= (arg2.field336 + var9 >> arg2.field341) || var10 < 0 || arg2.field337 <= (arg2.field336 + var11 >> arg2.field341)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field336 + var9 >> arg3.field341 >= arg3.field340 || var10 < 0 || (arg3.field336 + var11 >> arg3.field341) >= arg3.field337) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field341;
            int var13 = var9 + arg2.field336 - 1 >> arg2.field341;
            int var14 = var10 >> arg2.field341;
            int var15 = arg2.field336 + var11 - 1 >> arg2.field341;
            if (arg5 == arg2.method222(var12, var14) && arg5 == arg2.method222(var13, var14) && arg2.method222(var12, var15) == arg5 && arg2.method222(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field3196; var32++) {
                this.field3133[var32] = this.field3133[var32] + arg2.method218(this.field3183[var32] - -arg4, this.field3173[var32] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field3198;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field3196; var30++) {
                int var31 = (this.field3133[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field3133[var30] += (arg1 - var31) * (arg2.method218(this.field3183[var30] + arg4, this.field3173[var30] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = ((arg1 & 0xFF3E) >> 8) * 4;
            int var18 = (arg1 >> 16 & 0xFF) << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var16 >> 1) < 0 || (arg2.field340 << arg2.field341) <= (arg4 + (var16 >> 1) + arg2.field336) || (arg6 - (var17 >> 1)) < 0 || (var17 >> 1) + arg2.field336 + arg6 >= arg2.field337 << arg2.field341) {
                return;
            }
            this.method2159(var16, arg2, var17, true, var18, arg4, var19, arg6, arg5);
        } else if (arg0 == 4) {
            int var20 = this.field3190 - this.field3198;
            for (int var21 = 0; var21 < this.field3196; var21++) {
                this.field3133[var21] -= arg5 - arg3.method218(this.field3183[var21] + arg4, this.field3173[var21] - -arg6) - var20;
            }
        } else if (arg0 == 5) {
            int var22 = this.field3190 - this.field3198;
            for (int var23 = 0; var23 < this.field3196; var23++) {
                int var24 = this.field3183[var23] + arg4;
                int var25 = this.field3173[var23] + arg6;
                int var26 = arg2.method218(var24, var25);
                int var27 = arg3.method218(var24, var25);
                int var28 = var26 - var27;
                this.field3133[var23] = ((this.field3133[var23] << 8) / var22 * var28 >> 8) - (arg5 - var26);
            }
        }
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
        this.field3215 = false;
    }

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "()I")
    public final int method70() {
        field3156++;
        return this.field3172;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lrd;ILrd;IZZ)Lka;")
    private final class334 method1511(class226 arg0, int arg1, class226 arg2, int arg3, boolean arg4, boolean arg5) {
        arg2.field3151 = this.field3151;
        arg2.field3170 = this.field3170;
        arg2.field3179 = 0;
        arg2.field3195 = this.field3195;
        arg2.field3186 = this.field3186;
        arg2.field3123 = this.field3123;
        arg2.field3172 = this.field3172;
        arg2.field3196 = this.field3196;
        arg2.field3203 = this.field3203;
        arg2.field3150 = this.field3150;
        arg2.field3227 = arg3;
        if (arg1 != 1) {
            return null;
        }
        field3189++;
        boolean var7 = class307.method1928(this.field3186, arg3, 33);
        boolean var8 = class412.method2538(arg3, this.field3186, 34);
        boolean var9 = class37.method317(this.field3186, arg3, false);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg2.field3183 = this.field3183;
            } else if (arg0.field3183 == null || this.field3123 > arg0.field3183.length) {
                arg2.field3183 = arg0.field3183 = new int[this.field3123];
            } else {
                arg2.field3183 = arg0.field3183;
            }
            if (!var8) {
                arg2.field3133 = this.field3133;
            } else if (arg0.field3133 == null || this.field3123 > arg0.field3133.length) {
                arg2.field3133 = arg0.field3133 = new int[this.field3123];
            } else {
                arg2.field3133 = arg0.field3133;
            }
            if (!var9) {
                arg2.field3173 = this.field3173;
            } else if (arg0.field3173 == null || this.field3123 > arg0.field3173.length) {
                arg2.field3173 = arg0.field3173 = new int[this.field3123];
            } else {
                arg2.field3173 = arg0.field3173;
            }
            for (int var11 = 0; var11 < this.field3123; var11++) {
                if (var7) {
                    arg2.field3183[var11] = this.field3183[var11];
                }
                if (var8) {
                    arg2.field3133[var11] = this.field3133[var11];
                }
                if (var9) {
                    arg2.field3173[var11] = this.field3173[var11];
                }
            }
        } else {
            arg2.field3183 = this.field3183;
            arg2.field3173 = this.field3173;
            arg2.field3133 = this.field3133;
        }
        if (class418.method2556(-128, arg3, this.field3186)) {
            if (arg4) {
                arg2.field3179 = (byte) (arg2.field3179 | 0x1);
            }
            arg2.field3175 = arg0.field3175;
            arg2.field3175.field1740 = this.field3175.field1740;
            arg2.field3175.field1742 = this.field3175.field1742;
        } else if (class435.method2646(arg3, this.field3186, (byte) -30)) {
            arg2.field3175 = this.field3175;
        } else {
            arg2.field3175 = null;
        }
        if (class17.method165(arg3, 0, this.field3186)) {
            if (arg0.field3159 == null || this.field3203 > arg0.field3159.length) {
                arg2.field3159 = arg0.field3159 = new short[this.field3203];
            } else {
                arg2.field3159 = arg0.field3159;
            }
            for (int var12 = 0; var12 < this.field3203; var12++) {
                arg2.field3159[var12] = this.field3159[var12];
            }
        } else {
            arg2.field3159 = this.field3159;
        }
        if (class465.method2800(this.field3186, arg3, -113)) {
            if (arg0.field3178 == null || this.field3203 > arg0.field3178.length) {
                arg2.field3178 = arg0.field3178 = new byte[this.field3203];
            } else {
                arg2.field3178 = arg0.field3178;
            }
            for (int var13 = 0; var13 < this.field3203; var13++) {
                arg2.field3178[var13] = this.field3178[var13];
            }
        } else {
            arg2.field3178 = this.field3178;
        }
        if (class167.method1134(55, this.field3186, arg3)) {
            arg2.field3155 = arg0.field3155;
            if (arg4) {
                arg2.field3179 = (byte) (arg2.field3179 | 0x2);
            }
            arg2.field3155.field1740 = this.field3155.field1740;
            arg2.field3155.field1742 = this.field3155.field1742;
        } else if (class179.method1200(arg1 - 112, this.field3186, arg3)) {
            arg2.field3155 = this.field3155;
        } else {
            arg2.field3155 = null;
        }
        if (class24.method226(false, this.field3186, arg3)) {
            if (arg0.field3162 == null || this.field3151 > arg0.field3162.length) {
                int var14 = this.field3151;
                arg2.field3165 = arg0.field3165 = new short[var14];
                arg2.field3157 = arg0.field3157 = new short[var14];
                arg2.field3162 = arg0.field3162 = new short[var14];
            } else {
                arg2.field3162 = arg0.field3162;
                arg2.field3157 = arg0.field3157;
                arg2.field3165 = arg0.field3165;
            }
            if (this.field3134 == null) {
                for (int var15 = 0; var15 < this.field3151; var15++) {
                    arg2.field3162[var15] = this.field3162[var15];
                    arg2.field3165[var15] = this.field3165[var15];
                    arg2.field3157[var15] = this.field3157[var15];
                }
            } else {
                if (arg0.field3134 == null) {
                    arg0.field3134 = new class470();
                }
                class470 var16 = arg2.field3134 = arg0.field3134;
                if (var16.field7014 == null || this.field3151 > var16.field7014.length) {
                    int var17 = this.field3151;
                    var16.field7009 = new short[var17];
                    var16.field7008 = new short[var17];
                    var16.field7011 = new byte[var17];
                    var16.field7014 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field3151; var18++) {
                    arg2.field3162[var18] = this.field3162[var18];
                    arg2.field3165[var18] = this.field3165[var18];
                    arg2.field3157[var18] = this.field3157[var18];
                    var16.field7014[var18] = this.field3134.field7014[var18];
                    var16.field7008[var18] = this.field3134.field7008[var18];
                    var16.field7009[var18] = this.field3134.field7009[var18];
                    var16.field7011[var18] = this.field3134.field7011[var18];
                }
            }
            arg2.field3197 = this.field3197;
        } else {
            arg2.field3157 = this.field3157;
            arg2.field3162 = this.field3162;
            arg2.field3165 = this.field3165;
            arg2.field3134 = this.field3134;
            arg2.field3197 = this.field3197;
        }
        if (class527.method3123((byte) 125, this.field3186, arg3)) {
            if (arg4) {
                arg2.field3179 = (byte) (arg2.field3179 | 0x4);
            }
            arg2.field3223 = arg0.field3223;
            arg2.field3223.field1742 = this.field3223.field1742;
            arg2.field3223.field1740 = this.field3223.field1740;
        } else if (class143.method956(this.field3186, arg3, 19688)) {
            arg2.field3223 = this.field3223;
        } else {
            arg2.field3223 = null;
        }
        if (class539.method3181(arg3, this.field3186, true)) {
            if (arg0.field3131 == null || arg0.field3131.length < this.field3203) {
                int var19 = this.field3151;
                arg2.field3210 = arg0.field3210 = new float[var19];
                arg2.field3131 = arg0.field3131 = new float[var19];
            } else {
                arg2.field3131 = arg0.field3131;
                arg2.field3210 = arg0.field3210;
            }
            for (int var20 = 0; var20 < this.field3151; var20++) {
                arg2.field3131[var20] = this.field3131[var20];
                arg2.field3210[var20] = this.field3210[var20];
            }
        } else {
            arg2.field3131 = this.field3131;
            arg2.field3210 = this.field3210;
        }
        if (class222.method1495(arg3, (byte) 118, this.field3186)) {
            if (arg4) {
                arg2.field3179 = (byte) (arg2.field3179 | 0x8);
            }
            arg2.field3229 = arg0.field3229;
            arg2.field3229.field1740 = this.field3229.field1740;
            arg2.field3229.field1742 = this.field3229.field1742;
        } else if (class361.method2306(-23496, arg3, this.field3186)) {
            arg2.field3229 = this.field3229;
        } else {
            arg2.field3229 = null;
        }
        if (class221.method1491(this.field3186, arg3, (byte) 122)) {
            if (arg0.field3141 == null || arg0.field3141.length < this.field3203) {
                int var21 = this.field3203;
                arg2.field3141 = arg0.field3141 = new short[var21];
                arg2.field3228 = arg0.field3228 = new short[var21];
                arg2.field3167 = arg0.field3167 = new short[var21];
            } else {
                arg2.field3141 = arg0.field3141;
                arg2.field3228 = arg0.field3228;
                arg2.field3167 = arg0.field3167;
            }
            for (int var22 = 0; var22 < this.field3203; var22++) {
                arg2.field3141[var22] = this.field3141[var22];
                arg2.field3167[var22] = this.field3167[var22];
                arg2.field3228[var22] = this.field3228[var22];
            }
        } else {
            arg2.field3141 = this.field3141;
            arg2.field3167 = this.field3167;
            arg2.field3228 = this.field3228;
        }
        if (class424.method2589((byte) -23, arg3, this.field3186)) {
            if (arg4) {
                arg2.field3179 = (byte) (arg2.field3179 | 0x10);
            }
            arg2.field3188 = arg0.field3188;
            arg2.field3188.field7043 = this.field3188.field7043;
        } else if (class533.method3153(2048, this.field3186, arg3)) {
            arg2.field3188 = this.field3188;
        } else {
            arg2.field3188 = null;
        }
        if (class280.method1796(this.field3186, arg3, arg1 + 32767)) {
            if (arg0.field3140 == null || this.field3203 > arg0.field3140.length) {
                int var23 = this.field3203;
                arg2.field3140 = arg0.field3140 = new short[var23];
            } else {
                arg2.field3140 = arg0.field3140;
            }
            for (int var24 = 0; var24 < this.field3203; var24++) {
                arg2.field3140[var24] = this.field3140[var24];
            }
        } else {
            arg2.field3140 = this.field3140;
        }
        if (!class510.method3051(arg3, (byte) 32, this.field3186)) {
            arg2.field3202 = this.field3202;
        } else if (arg0.field3202 == null || this.field3195 > arg0.field3202.length) {
            int var26 = this.field3195;
            arg2.field3202 = arg0.field3202 = new class168[var26];
            for (int var27 = 0; var27 < this.field3195; var27++) {
                arg2.field3202[var27] = this.field3202[var27].method1137(79);
            }
        } else {
            arg2.field3202 = arg0.field3202;
            for (int var25 = 0; var25 < this.field3195; var25++) {
                arg2.field3202[var25].method1138(this.field3202[var25], arg1 + 31);
            }
        }
        arg2.field3122 = this.field3122;
        arg2.field3205 = this.field3205;
        arg2.field3125 = this.field3125;
        arg2.field3145 = this.field3145;
        arg2.field3148 = this.field3148;
        arg2.field3135 = this.field3135;
        arg2.field3128 = this.field3128;
        arg2.field3180 = this.field3180;
        if (this.field3215) {
            arg2.field3132 = this.field3132;
            arg2.field3182 = this.field3182;
            arg2.field3190 = this.field3190;
            arg2.field3147 = this.field3147;
            arg2.field3207 = this.field3207;
            arg2.field3215 = true;
            arg2.field3198 = this.field3198;
            arg2.field3153 = this.field3153;
        } else {
            arg2.field3215 = false;
        }
        arg2.field3201 = this.field3201;
        arg2.field3163 = this.field3163;
        arg2.field3176 = this.field3176;
        return arg2;
    }

    @OriginalMember(owner = "client!rd", name = "ja", descriptor = "()I")
    public final int method77() {
        field3222++;
        if (!this.field3215) {
            this.method1509(false);
        }
        return this.field3198;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()[Lhd;")
    public final class531[] method87() {
        field3177++;
        return this.field3128;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    private final void method1512(int arg0) {
        field3161++;
        if (this.field3170 == 0) {
            return;
        }
        if (this.field3179 != 0) {
            this.method1519(0, true);
        }
        this.method1519(arg0 ^ arg0, false);
        if (this.field3188 != null) {
            if (this.field3188.field7043 == null) {
                this.method1508((this.field3179 & 0x10) != 0, arg0 ^ 0xFFFFFDB7);
            }
            if (this.field3188.field7043 != null) {
                this.field3144.method2018(this.field3223 != null, (byte) 99);
                this.field3144.method2092(this.field3175, this.field3223, this.field3229, this.field3155, 18504);
                int var2 = this.field3135.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3135[var3];
                    int var5 = this.field3135[var3 + 1];
                    int var6 = this.field3140[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3144.method2085(var6, this.field3223 != null, 0);
                    this.field3144.method2065(4, var4 * 3, (var5 - var4) * 3, this.field3188.field7043, 124);
                }
            }
        }
        this.method1515(arg0 ^ 0x7D02);
    }

    @OriginalMember(owner = "client!rd", name = "ha", descriptor = "()V")
    public final void method43() {
        for (int var1 = 0; var1 < this.field3123; var1++) {
            this.field3183[var1] = this.field3183[var1] + 7 >> 4;
            this.field3133[var1] = this.field3133[var1] + 7 >> 4;
            this.field3173[var1] = this.field3173[var1] + 7 >> 4;
        }
        field3124++;
        this.field3215 = false;
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ln;Lst;II)V")
    public final void method55(class14 arg0, class302 arg1, int arg2, int arg3) {
        field3185++;
        if (this.field3151 == 0) {
            return;
        }
        class416 var5 = this.field3144.field4935;
        class416 var6 = (class416) arg0;
        if (!this.field3215) {
            this.method1509(false);
        }
        class449.field6754 = var5.field6332 * var6.field6329 + var5.field6354 * var6.field6353 + var5.field6351 * var6.field6322 + var5.field6329;
        class420.field6400 = var5.field6332 * var6.field6351 + var5.field6354 * var6.field6324 + var5.field6351 * var6.field6347;
        float var7 = (float) this.field3198 * class420.field6400 + class449.field6754;
        float var8 = (float) this.field3190 * class420.field6400 + class449.field6754;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) this.field3182 + var7;
            var9 = var8 - (float) this.field3182;
        } else {
            var9 = var7 - (float) this.field3182;
            var10 = (float) this.field3182 + var8;
        }
        if ((this.field3144.field4961 <= var9) || (var10 <= (float) this.field3144.field4958)) {
            return;
        }
        class118.field1617 = var5.field6348 * var6.field6329 + var5.field6340 * var6.field6353 + var5.field6324 * var6.field6322 + var5.field6353;
        class177.field2360 = var5.field6348 * var6.field6351 + var5.field6340 * var6.field6324 + var5.field6324 * var6.field6347;
        float var11 = (float) this.field3198 * class177.field2360 + class118.field1617;
        float var12 = (float) this.field3190 * class177.field2360 + class118.field1617;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field3182 + var11) * (float) this.field3144.field4918;
            var13 = ((float) (-this.field3182) + var12) * (float) this.field3144.field4918;
        } else {
            var13 = ((float) (-this.field3182) + var11) * (float) this.field3144.field4918;
            var14 = ((float) this.field3182 + var12) * (float) this.field3144.field4918;
        }
        if ((this.field3144.field4968 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field3144.field4998)) {
            return;
        }
        class264.field3699 = var5.field6330 * var6.field6329 + var5.field6347 * var6.field6322 + var5.field6334 * var6.field6353 + var5.field6322;
        class423.field6454 = var5.field6330 * var6.field6351 + var5.field6347 * var6.field6347 + var5.field6334 * var6.field6324;
        float var15 = (float) this.field3198 * class423.field6454 + class264.field3699;
        float var16 = (float) this.field3190 * class423.field6454 + class264.field3699;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = (var16 - (float) this.field3182) * (float) this.field3144.field4937;
            var18 = ((float) this.field3182 + var15) * (float) this.field3144.field4937;
        } else {
            var18 = ((float) this.field3182 + var16) * (float) this.field3144.field4937;
            var17 = ((float) (-this.field3182) + var15) * (float) this.field3144.field4937;
        }
        if ((var17 / (float) arg2 >= this.field3144.field5006) || (var18 / (float) arg2 <= this.field3144.field4922)) {
            return;
        }
        if (arg1 != null || this.field3122 != null) {
            class86.field1252 = var5.field6330 * var6.field6332 + var5.field6347 * var6.field6330 + var5.field6334 * var6.field6348;
            class213.field3026 = var5.field6332 * var6.field6354 + var5.field6354 * var6.field6340 + var5.field6351 * var6.field6334;
            class411.field6252 = var5.field6330 * var6.field6354 + var5.field6347 * var6.field6334 + var5.field6334 * var6.field6340;
            class520.field7657 = var5.field6332 * var6.field6332 + var5.field6354 * var6.field6348 + var5.field6351 * var6.field6330;
            class289.field4231 = var5.field6348 * var6.field6332 + var5.field6340 * var6.field6348 + var5.field6324 * var6.field6330;
            class374.field5686 = var5.field6348 * var6.field6354 + var5.field6340 * var6.field6340 + var5.field6324 * var6.field6334;
        }
        if (arg1 != null) {
            int var19 = this.field3207 + this.field3147 >> 1;
            int var20 = this.field3153 + this.field3132 >> 1;
            int var21 = (int) ((float) var20 * class289.field4231 + (float) this.field3198 * class177.field2360 + (float) var19 * class374.field5686 + class118.field1617);
            int var22 = (int) ((float) var20 * class86.field1252 + (float) this.field3198 * class423.field6454 + (float) var19 * class411.field6252 + class264.field3699);
            int var23 = (int) ((float) var20 * class520.field7657 + (float) this.field3198 * class420.field6400 + (float) var19 * class213.field3026 + class449.field6754);
            int var24 = (int) ((float) var20 * class289.field4231 + (float) this.field3190 * class177.field2360 + (float) var19 * class374.field5686 + class118.field1617);
            int var25 = (int) ((float) var20 * class86.field1252 + (float) this.field3190 * class423.field6454 + (float) var19 * class411.field6252 + class264.field3699);
            arg1.field4422 = this.field3144.field4937 * var25 / arg2 + this.field3144.field5014;
            arg1.field4423 = this.field3144.field4918 * var21 / arg2 + this.field3144.field5021;
            int var26 = (int) ((float) var20 * class520.field7657 + (float) this.field3190 * class420.field6400 + (float) var19 * class213.field3026 + class449.field6754);
            arg1.field4425 = this.field3144.field4937 * var22 / arg2 + this.field3144.field5014;
            arg1.field4427 = this.field3144.field4918 * var24 / arg2 + this.field3144.field5021;
            if (var23 < this.field3144.field4958 && this.field3144.field4958 > var26) {
                arg1.field4426 = (var21 + this.field3182) * this.field3144.field4918 / arg2 + this.field3144.field5021 - arg1.field4423;
                arg1.field4424 = true;
            }
        }
        this.field3144.method2091((byte) -31, (float) arg2);
        this.field3144.method2013(16);
        this.field3144.method2086(var6, 8915);
        this.method1512(-5708);
        this.field3144.method2022(false);
        this.method1514((byte) 47);
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static void method1513(int arg0) {
        if (arg0 == 2) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method50(class334 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3138++;
        class226 var6 = (class226) arg0;
        if (this.field3203 == 0 || var6.field3203 == 0) {
            return;
        }
        int var7 = var6.field3196;
        int[] var8 = var6.field3183;
        int[] var9 = var6.field3133;
        int[] var10 = var6.field3173;
        short[] var11 = var6.field3162;
        short[] var12 = var6.field3165;
        short[] var13 = var6.field3157;
        byte[] var14 = var6.field3197;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3134 == null) {
            var17 = null;
            var16 = null;
            var15 = null;
            var18 = null;
        } else {
            var15 = this.field3134.field7011;
            var16 = this.field3134.field7009;
            var17 = this.field3134.field7014;
            var18 = this.field3134.field7008;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field3134 == null) {
            var21 = null;
            var19 = null;
            var20 = null;
            var22 = null;
        } else {
            var19 = var6.field3134.field7009;
            var20 = var6.field3134.field7014;
            var21 = var6.field3134.field7008;
            var22 = var6.field3134.field7011;
        }
        int[] var23 = var6.field3148;
        short[] var24 = var6.field3163;
        if (!var6.field3215) {
            var6.method1509(false);
        }
        short var25 = var6.field3198;
        short var26 = var6.field3190;
        short var27 = var6.field3147;
        short var28 = var6.field3207;
        short var29 = var6.field3132;
        short var30 = var6.field3153;
        for (int var31 = 0; var31 < this.field3196; var31++) {
            int var32 = this.field3133[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field3183[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field3173[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3148[var31];
                        int var37 = this.field3148[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3163[var38] - 1;
                            if (var35 == -1 || this.field3197[var35] != 0) {
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
                                        if (var17 == null) {
                                            this.field3134 = new class470();
                                            var17 = this.field3134.field7014 = class467.method2811(0, this.field3162);
                                            var18 = this.field3134.field7008 = class467.method2811(0, this.field3165);
                                            var16 = this.field3134.field7009 = class467.method2811(0, this.field3157);
                                            var15 = this.field3134.field7011 = class489.method2924(this.field3197, 30);
                                        }
                                        if (var20 == null) {
                                            class470 var44 = var6.field3134 = new class470();
                                            var20 = var44.field7014 = class467.method2811(0, var11);
                                            var21 = var44.field7008 = class467.method2811(0, var12);
                                            var19 = var44.field7009 = class467.method2811(0, var13);
                                            var22 = var44.field7011 = class489.method2924(var14, 30);
                                        }
                                        short var45 = this.field3162[var35];
                                        short var46 = this.field3165[var35];
                                        short var47 = this.field3157[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field3197[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var20[var52] += var45;
                                                var21[var52] += var46;
                                                var19[var52] += var47;
                                                var22[var52] += var49;
                                            }
                                        }
                                        short var53 = var12[var40];
                                        int var54 = this.field3148[var31 + 1];
                                        short var55 = var11[var40];
                                        short var56 = var13[var40];
                                        int var57 = this.field3148[var31];
                                        byte var58 = var14[var40];
                                        for (int var59 = var57; var59 < var54; var59++) {
                                            int var60 = this.field3163[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var55;
                                                var18[var60] += var53;
                                                var16[var60] += var56;
                                                var15[var60] += var58;
                                            }
                                        }
                                        if (this.field3223 == null && this.field3155 != null) {
                                            this.field3155.field1742 = null;
                                        }
                                        if (this.field3223 != null) {
                                            this.field3223.field1742 = null;
                                        }
                                        if (var6.field3223 == null && var6.field3155 != null) {
                                            var6.field3155.field1742 = null;
                                        }
                                        if (var6.field3223 != null) {
                                            var6.field3223.field1742 = null;
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

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    private final void method1514(byte arg0) {
        if (arg0 != 47) {
            this.field3207 = -86;
        }
        field3166++;
        if (this.field3122 == null) {
            return;
        }
        class416 var2 = this.field3144.field4892;
        float var3 = this.field3144.method741();
        float var4 = this.field3144.method784();
        this.field3144.method2067((byte) 15);
        this.field3144.method814(false);
        this.field3144.method2018(false, (byte) 99);
        this.field3144.method2092(this.field3144.field5018, null, this.field3144.field4948, null, arg0 + 18457);
        for (int var5 = 0; var5 < this.field3195; var5++) {
            class312 var6 = this.field3122[var5];
            class168 var7 = this.field3202[var5];
            if (!var6.field4558 || !this.field3144.method823()) {
                float var8 = (float) (this.field3183[var6.field4566] + this.field3183[var6.field4562] + this.field3183[var6.field4557]) * 0.3333333F;
                float var9 = (float) (this.field3133[var6.field4566] + this.field3133[var6.field4562] + this.field3133[var6.field4557]) * 0.3333333F;
                float var10 = (float) (this.field3173[var6.field4566] + this.field3173[var6.field4562] + this.field3173[var6.field4557]) * 0.3333333F;
                float var11 = class289.field4231 * var10 + class374.field5686 * var8 + class177.field2360 * var9 + class118.field1617;
                float var12 = class86.field1252 * var10 + class423.field6454 * var9 + class411.field6252 * var8 + class264.field3699;
                float var13 = class520.field7657 * var10 + class420.field6400 * var9 + class213.field3026 * var8 + class449.field6754;
                var2.method2548(-102, var6.field4561 * var7.field2260 >> 7, var6.field4560 * var7.field2264 >> 7, (float) var7.field2263 + var11, var7.field2259, (float) var7.field2268 - var12, -var13);
                this.field3144.method2028(var2, -10709);
                this.field3144.method748(var4, var3 - ((float) var6.field4555 * 1.5F));
                int var14 = var7.field2267;
                OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                this.field3144.method2015(var6.field4563, (byte) -121);
                this.field3144.method2087(var6.field4559, 16711935);
                this.field3144.method2045(34023, var6.field4554);
                this.field3144.method2021(4, 7, (byte) 115, 0);
            }
        }
        this.field3144.method748(var4, var3);
        this.field3144.method814(true);
        this.field3144.method2022(false);
    }

    @OriginalMember(owner = "client!rd", name = "wa", descriptor = "()I")
    public final int method37() {
        field3221++;
        return this.field3150;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()[Llq;")
    public final class392[] method72() {
        field3194++;
        return this.field3176;
    }

    @OriginalMember(owner = "client!rd", name = "ia", descriptor = "()I")
    public final int method38() {
        if (!this.field3215) {
            this.method1509(false);
        }
        field3192++;
        return this.field3153;
    }

    @OriginalMember(owner = "client!rd", name = "AA", descriptor = "()Z")
    public final boolean method74() {
        field3218++;
        if (this.field3205 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3123; var1++) {
            this.field3183[var1] <<= 0x4;
            this.field3133[var1] <<= 0x4;
            this.field3173[var1] <<= 0x4;
        }
        class160.field2085 = 0;
        class152.field1982 = 0;
        class181.field2455 = 0;
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ln;Lst;I)V")
    public final void method53(class14 arg0, class302 arg1, int arg2) {
        field3199++;
        if (this.field3151 == 0) {
            return;
        }
        class416 var4 = this.field3144.field4935;
        if (!this.field3215) {
            this.method1509(false);
        }
        class416 var5 = (class416) arg0;
        this.method1510((byte) -111, var5);
        class449.field6754 = var4.field6332 * var5.field6329 + var4.field6354 * var5.field6353 + var4.field6351 * var5.field6322 + var4.field6329;
        class420.field6400 = var4.field6332 * var5.field6351 + var4.field6354 * var5.field6324 + var4.field6351 * var5.field6347;
        float var6 = (float) this.field3198 * class420.field6400 + class449.field6754;
        float var7 = (float) this.field3190 * class420.field6400 + class449.field6754;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field3182 + var6;
            var9 = var7 - (float) this.field3182;
        } else {
            var8 = (float) this.field3182 + var7;
            var9 = (float) (-this.field3182) + var6;
        }
        if ((this.field3144.field4938 <= var9) || ((float) this.field3144.field4958 >= var8)) {
            return;
        }
        class177.field2360 = var4.field6348 * var5.field6351 + var4.field6340 * var5.field6324 + var4.field6324 * var5.field6347;
        class118.field1617 = var4.field6348 * var5.field6329 + var4.field6340 * var5.field6353 + var4.field6324 * var5.field6322 + var4.field6353;
        float var10 = (float) this.field3198 * class177.field2360 + class118.field1617;
        float var11 = (float) this.field3190 * class177.field2360 + class118.field1617;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) (-this.field3182) + var11) * (float) this.field3144.field4918;
            var13 = ((float) this.field3182 + var10) * (float) this.field3144.field4918;
        } else {
            var12 = ((float) (-this.field3182) + var10) * (float) this.field3144.field4918;
            var13 = ((float) this.field3182 + var11) * (float) this.field3144.field4918;
        }
        if ((var12 / var8 >= this.field3144.field4968) || (this.field3144.field4998 >= var13 / var8)) {
            return;
        }
        class264.field3699 = var4.field6330 * var5.field6329 + var4.field6347 * var5.field6322 + var4.field6334 * var5.field6353 + var4.field6322;
        class423.field6454 = var4.field6330 * var5.field6351 + var4.field6347 * var5.field6347 + var4.field6334 * var5.field6324;
        float var14 = (float) this.field3198 * class423.field6454 + class264.field3699;
        float var15 = (float) this.field3190 * class423.field6454 + class264.field3699;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var17 = ((float) this.field3182 + var14) * (float) this.field3144.field4937;
            var16 = ((float) (-this.field3182) + var15) * (float) this.field3144.field4937;
        } else {
            var16 = ((float) (-this.field3182) + var14) * (float) this.field3144.field4937;
            var17 = ((float) this.field3182 + var15) * (float) this.field3144.field4937;
        }
        if ((this.field3144.field5006 <= var16 / var8) || (this.field3144.field4922 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field3122 != null) {
            class411.field6252 = var4.field6330 * var5.field6354 + var4.field6347 * var5.field6334 + var4.field6334 * var5.field6340;
            class289.field4231 = var4.field6348 * var5.field6332 + var4.field6340 * var5.field6348 + var4.field6324 * var5.field6330;
            class520.field7657 = var4.field6332 * var5.field6332 + var4.field6354 * var5.field6348 + var4.field6351 * var5.field6330;
            class86.field1252 = var4.field6330 * var5.field6332 + var4.field6347 * var5.field6330 + var4.field6334 * var5.field6348;
            class374.field5686 = var4.field6348 * var5.field6354 + var4.field6340 * var5.field6340 + var4.field6324 * var5.field6334;
            class213.field3026 = var4.field6332 * var5.field6354 + var4.field6354 * var5.field6340 + var4.field6351 * var5.field6334;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3207 + this.field3147 >> 1;
            int var21 = this.field3153 + this.field3132 >> 1;
            int var22 = (int) ((float) var21 * class289.field4231 + (float) this.field3198 * class177.field2360 + (float) var20 * class374.field5686 + class118.field1617);
            int var23 = (int) ((float) var21 * class86.field1252 + (float) this.field3198 * class423.field6454 + (float) var20 * class411.field6252 + class264.field3699);
            int var24 = (int) ((float) var21 * class520.field7657 + (float) this.field3198 * class420.field6400 + (float) var20 * class213.field3026 + class449.field6754);
            if (this.field3144.field4958 > var24) {
                var18 = true;
            } else {
                arg1.field4423 = this.field3144.field4918 * var22 / var24 + this.field3144.field5021;
                arg1.field4425 = this.field3144.field5014 + (this.field3144.field4937 * var23 / var24);
            }
            int var25 = (int) ((float) var21 * class289.field4231 + (float) this.field3190 * class177.field2360 + (float) var20 * class374.field5686 + class118.field1617);
            int var26 = (int) ((float) var21 * class86.field1252 + (float) this.field3190 * class423.field6454 + (float) var20 * class411.field6252 + class264.field3699);
            int var27 = (int) ((float) var21 * class520.field7657 + (float) this.field3190 * class420.field6400 + (float) var20 * class213.field3026 + class449.field6754);
            if (this.field3144.field4958 > var27) {
                var18 = true;
            } else {
                arg1.field4422 = this.field3144.field5014 + (this.field3144.field4937 * var26 / var27);
                arg1.field4427 = this.field3144.field5021 + (this.field3144.field4918 * var25 / var27);
            }
            if (var18) {
                if (this.field3144.field4958 > var24 && var27 < this.field3144.field4958) {
                    var19 = false;
                } else if (this.field3144.field4958 > var24) {
                    int var31 = (var27 - this.field3144.field4958 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field4423 = this.field3144.field4918 * var32 / this.field3144.field4958 + this.field3144.field5021;
                    arg1.field4425 = this.field3144.field4937 * var33 / this.field3144.field4958 + this.field3144.field5014;
                } else if (var27 < this.field3144.field4958) {
                    int var28 = (var24 - this.field3144.field4958 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field4423 = this.field3144.field4918 * var29 / this.field3144.field4958 + this.field3144.field5021;
                    arg1.field4425 = this.field3144.field4937 * var30 / this.field3144.field4958 + this.field3144.field5014;
                }
            }
            if (var19) {
                arg1.field4424 = true;
                if (var24 <= var27) {
                    arg1.field4426 = (this.field3182 + var25) * this.field3144.field4918 / var27 + (this.field3144.field5021 - arg1.field4427);
                } else {
                    arg1.field4426 = (var22 + this.field3182) * this.field3144.field4918 / var24 + this.field3144.field5021 - arg1.field4423;
                }
            }
        }
        this.field3144.method2078((byte) -60);
        this.field3144.method2086(var5, 8915);
        this.method1512(-5708);
        this.field3144.method2022(false);
        this.method1514((byte) 47);
    }

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "()I")
    public final int method45() {
        if (!this.field3215) {
            this.method1509(false);
        }
        field3129++;
        return this.field3207;
    }

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "()I")
    public final int method81() {
        if (!this.field3215) {
            this.method1509(false);
        }
        field3225++;
        return this.field3132;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()Z")
    public final boolean method76() {
        field3164++;
        if (this.field3140 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3140.length; var1++) {
            if (this.field3140[var1] != -1 && !this.field3144.field2235.method160((byte) 23, this.field3140[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
    public final void method83() {
        field3158++;
        if (this.field3151 <= 0 || this.field3170 <= 0) {
            return;
        }
        this.method1519(0, false);
        if ((this.field3179 & 0x10) == 0 && this.field3188.field7043 == null) {
            this.method1508(false, 5123);
        }
        this.method1515(-27466);
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(SS)V")
    public final void method29(short arg0, short arg1) {
        field3184++;
        for (int var3 = 0; var3 < this.field3203; var3++) {
            if (this.field3159[var3] == arg0) {
                this.field3159[var3] = arg1;
            }
        }
        if (this.field3122 != null) {
            for (int var4 = 0; var4 < this.field3195; var4++) {
                class312 var5 = this.field3122[var4];
                class168 var6 = this.field3202[var4];
                var6.field2267 = var6.field2267 & 0xFF000000 | class401.field6108[this.field3159[var5.field4567] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3155 != null) {
            this.field3155.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "ma", descriptor = "()I")
    public final int method46() {
        field3154++;
        return this.field3227;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    private final void method1515(int arg0) {
        if (arg0 != -27466) {
            this.method1517((short) 21, 21, 127, 6, (byte) 61);
        }
        field3171++;
        if (!this.field3126) {
            return;
        }
        this.field3126 = false;
        if (this.field3176 == null && this.field3128 == null && this.field3122 == null) {
            if (this.field3183 != null && !class359.method2294(this.field3186, this.field3227, 0)) {
                if (this.field3175 != null && this.field3175.field1742 == null) {
                    this.field3126 = true;
                } else {
                    if (!this.field3215) {
                        this.method1509(false);
                    }
                    this.field3183 = null;
                }
            }
            if (this.field3133 != null && !class176.method1180(this.field3186, 32322, this.field3227)) {
                if (this.field3175 != null && this.field3175.field1742 == null) {
                    this.field3126 = true;
                } else {
                    if (!this.field3215) {
                        this.method1509(false);
                    }
                    this.field3133 = null;
                }
            }
            if (this.field3173 != null && !class67.method478(458752, this.field3227, this.field3186)) {
                if (this.field3175 != null && this.field3175.field1742 == null) {
                    this.field3126 = true;
                } else {
                    if (!this.field3215) {
                        this.method1509(false);
                    }
                    this.field3173 = null;
                }
            }
        }
        if (this.field3163 != null && this.field3183 == null && this.field3133 == null && this.field3173 == null) {
            this.field3163 = null;
            this.field3148 = null;
        }
        if (this.field3197 != null && !class182.method1240(this.field3186, -1, this.field3227)) {
            if (this.field3223 == null) {
                if (this.field3155 != null && this.field3155.field1742 == null) {
                    this.field3126 = true;
                } else {
                    this.field3162 = this.field3165 = this.field3157 = null;
                    this.field3197 = null;
                }
            } else if (this.field3223.field1742 == null) {
                this.field3126 = true;
            } else {
                this.field3162 = this.field3165 = this.field3157 = null;
                this.field3197 = null;
            }
        }
        if (this.field3159 != null && !class347.method2242(this.field3227, this.field3186, (byte) 125)) {
            if (this.field3155 != null && this.field3155.field1742 == null) {
                this.field3126 = true;
            } else {
                this.field3159 = null;
            }
        }
        if (this.field3178 != null && !class244.method1596(-7159, this.field3227, this.field3186)) {
            if (this.field3155 != null && this.field3155.field1742 == null) {
                this.field3126 = true;
            } else {
                this.field3178 = null;
            }
        }
        if (this.field3131 != null && !class150.method982(this.field3186, 0, this.field3227)) {
            if (this.field3229 != null && this.field3229.field1742 == null) {
                this.field3126 = true;
            } else {
                this.field3131 = this.field3210 = null;
            }
        }
        if (this.field3140 != null && !class416.method2552(this.field3227, -86, this.field3186)) {
            if (this.field3155 != null && this.field3155.field1742 == null) {
                this.field3126 = true;
            } else {
                this.field3140 = null;
            }
        }
        if (this.field3141 != null && !class499.method2971(this.field3186, 0, this.field3227)) {
            if ((this.field3188 == null || this.field3188.field7043 != null) && (this.field3155 == null || this.field3155.field1742 != null)) {
                this.field3141 = this.field3167 = this.field3228 = null;
            } else {
                this.field3126 = true;
            }
        }
        if (this.field3145 != null && !class503.method3014(this.field3186, (byte) -79, this.field3227)) {
            this.field3145 = null;
            this.field3201 = null;
        }
        if (this.field3205 != null && !class387.method2417(127, this.field3186, this.field3227)) {
            this.field3205 = null;
            this.field3125 = null;
        }
        if (this.field3180 != null && !class316.method1983(this.field3186, arg0 + 39054, this.field3227)) {
            this.field3180 = null;
        }
        if (this.field3135 != null && (this.field3227 & 0x800) == 0 && (this.field3227 & 0x40000) == 0) {
            this.field3135 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "IA", descriptor = "(I)V")
    public final void method89(int arg0) {
        field3120++;
        if (this.field3155 != null) {
            this.field3155.field1742 = null;
        }
        this.field3172 = (short) arg0;
        if (this.field3223 != null) {
            this.field3223.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)V")
    public final void method44(int arg0) {
        field3127++;
        int var2 = class428.field6502[arg0];
        int var3 = class428.field6501[arg0];
        for (int var4 = 0; var4 < this.field3196; var4++) {
            int var5 = this.field3183[var4] * var3 + this.field3173[var4] * var2 >> 15;
            this.field3173[var4] = this.field3173[var4] * var3 - (this.field3183[var4] * var2) >> 15;
            this.field3183[var4] = var5;
        }
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
        this.field3215 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BJFFIIIIILnd;)S")
    private final short method1516(byte arg0, long arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class387 arg9) {
        field3137++;
        int var12 = this.field3148[arg8];
        int var13 = this.field3148[arg8 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3163[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class535.field7862[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        if (arg0 != 109) {
            this.method37();
        }
        this.field3163[var14] = (short) (this.field3151 + 1);
        class535.field7862[var14] = arg1;
        this.field3162[this.field3151] = (short) arg5;
        this.field3165[this.field3151] = (short) arg6;
        this.field3157[this.field3151] = (short) arg7;
        this.field3197[this.field3151] = (byte) arg4;
        this.field3131[this.field3151] = arg2;
        this.field3210[this.field3151] = arg3;
        return (short) (this.field3151++);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(SIIIB)I")
    private final int method1517(short arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3160++;
        if (arg2 != 0) {
            this.field3207 = -36;
        }
        int var6 = class401.field6108[class492.method2934(arg1, arg3, (byte) -95)];
        if (arg0 != -1) {
            class107 var7 = this.field3144.field2235.method157((byte) 104, arg0 & 0xFFFF);
            int var8 = var7.field1518 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 <= 127) {
                    var9 = arg3 * 131586;
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
            int var12 = var7.field1505 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
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
                var6 = (var15 >> 8) + ((var13 << 8 & 0xFF00AF) + (var14 & 0xFF00));
            }
        }
        return -(arg4 & 0xFF) - (-(var6 << 8) - 255);
    }

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "()I")
    public final int method65() {
        if (!this.field3215) {
            this.method1509(false);
        }
        field3181++;
        return this.field3190;
    }

    @OriginalMember(owner = "client!rd", name = "da", descriptor = "()I")
    public final int method58() {
        if (!this.field3215) {
            this.method1509(false);
        }
        field3206++;
        return this.field3147;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lgf;I)V")
    private final void method1518(class184 arg0, int arg1) {
        if (this.field3144.field5039.length < this.field3151) {
            this.field3144.field5041 = new int[this.field3151];
            this.field3144.field5039 = new int[this.field3151];
        }
        field3143++;
        int[] var3 = this.field3144.field5039;
        int[] var4 = this.field3144.field5041;
        if (arg1 != 30715) {
            return;
        }
        for (int var5 = 0; var5 < this.field3196; var5++) {
            int var16 = (this.field3183[var5] - (this.field3133[var5] * this.field3144.field4990 >> 8) >> this.field3144.field4895) - arg0.field2499;
            int var17 = (this.field3173[var5] - (this.field3133[var5] * this.field3144.field4941 >> 8) >> this.field3144.field4895) - arg0.field2498;
            int var18 = this.field3148[var5];
            int var19 = this.field3148[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field3163[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field3170; var6++) {
            if (this.field3178 == null || this.field3178[var6] <= 128) {
                short var7 = this.field3141[var6];
                short var8 = this.field3167[var6];
                short var9 = this.field3228[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg0.method1248(var11, var13, var15, (byte) -115, var10, var14, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
    private final void method1519(int arg0, boolean arg1) {
        field3142++;
        boolean var3 = this.field3155 != null && this.field3155.field1742 == null;
        boolean var4 = this.field3223 != null && this.field3223.field1742 == null;
        boolean var5 = this.field3175 != null && this.field3175.field1742 == null;
        boolean var6 = this.field3229 != null && this.field3229.field1742 == null;
        if (arg1) {
            var6 &= (this.field3179 & 0x8) != 0;
            var3 &= (this.field3179 & 0x2) != 0;
            var4 &= (this.field3179 & 0x4) != 0;
            var5 &= (this.field3179 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
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
        if (arg0 == var7) {
            return;
        }
        if (this.field3144.field4943.field2219.length >= (this.field3151 * var7)) {
            this.field3144.field4943.field2185 = 0;
        } else {
            this.field3144.field4943 = new class283((this.field3151 + 100) * var7);
        }
        class283 var12 = this.field3144.field4943;
        if (var5) {
            if (this.field3144.field4974) {
                for (int var13 = 0; var13 < this.field3196; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field3183[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field3133[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field3173[var13]);
                    int var17 = this.field3148[var13];
                    int var18 = this.field3148[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3163[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field2185 = var7 * var20;
                        var12.method1073(326170192, var14);
                        var12.method1073(arg0 + 326170192, var15);
                        var12.method1073(arg0 ^ 0x1370F650, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field3196; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field3183[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field3133[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field3173[var21]);
                    int var25 = this.field3148[var21];
                    int var26 = this.field3148[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3163[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field2185 = var7 * var28;
                        var12.method1113(arg0, var22);
                        var12.method1113(0, var23);
                        var12.method1113(0, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3223 == null) {
                short[] var29;
                short[] var30;
                byte[] var31;
                short[] var32;
                if (this.field3134 == null) {
                    var29 = this.field3165;
                    var30 = this.field3157;
                    var32 = this.field3162;
                    var31 = this.field3197;
                } else {
                    var29 = this.field3134.field7008;
                    var30 = this.field3134.field7009;
                    var31 = this.field3134.field7011;
                    var32 = this.field3134.field7014;
                }
                float var33 = this.field3144.field4959[0];
                float var34 = this.field3144.field4959[1];
                float var35 = this.field3144.field4959[2];
                float var36 = this.field3144.field4953;
                float var37 = this.field3144.field5000 * 768.0F / (float) this.field3172;
                float var38 = this.field3144.field4951 * 768.0F / (float) this.field3172;
                for (int var39 = 0; var39 < this.field3203; var39++) {
                    int var40 = this.method1517(this.field3140[var39], this.field3159[var39], 0, this.field3150, this.field3178[var39]);
                    float var41 = (float) ((var40 & 0xFF167B) >> 16) * this.field3144.field5012;
                    float var42 = (float) ((var40 & 0xFF93) >> 8) * this.field3144.field4978;
                    short var43 = this.field3141[var39];
                    float var44 = (float) (var40 >>> 24) * this.field3144.field4981;
                    short var45 = (short) var31[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var30[var43] * var35 + (float) var29[var43] * var34 + (float) var32[var43] * var33) * 0.0026041667F;
                    } else {
                        var46 = ((float) var30[var43] * var35 + (float) var29[var43] * var34 + (float) var32[var43] * var33) / (float) (var45 * 256);
                    }
                    float var47 = var36 + (var46 < 0.0F ? var38 : var37) * var46;
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var41 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var42 * var47);
                    var12.field2185 = var7 * var43 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1072((byte) 102, var48);
                    var12.method1072((byte) 102, var49);
                    var12.method1072((byte) 102, var50);
                    var12.method1072((byte) 102, 255 - (this.field3178[var39] & 0xFF));
                    short var51 = this.field3167[var39];
                    short var52 = (short) var31[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var34 + (float) var32[var51] * var33) * 0.0026041667F;
                    } else {
                        var53 = ((float) var30[var51] * var35 + (float) var29[var51] * var34 + (float) var32[var51] * var33) / (float) (var52 * 256);
                    }
                    float var54 = (var53 < 0.0F ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var44 * var54);
                    int var56 = (int) (var41 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var42 * var54);
                    var12.field2185 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1072((byte) 102, var55);
                    var12.method1072((byte) 102, var56);
                    var12.method1072((byte) 102, var57);
                    var12.method1072((byte) 102, 255 - (this.field3178[var39] & 0xFF));
                    short var58 = this.field3228[var39];
                    short var59 = (short) var31[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var34 + (float) var32[var58] * var33) * 0.0026041667F;
                    } else {
                        var60 = ((float) var30[var58] * var35 + (float) var29[var58] * var34 + (float) var32[var58] * var33) / (float) (var59 * 256);
                    }
                    float var61 = var36 + ((var60 < 0.0F) ? var38 : var37) * var60;
                    int var62 = (int) (var44 * var61);
                    int var63 = (int) (var41 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var42 * var61);
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
                    var12.field2185 = var7 * var58 + var9;
                    var12.method1072((byte) 102, var62);
                    var12.method1072((byte) 102, var63);
                    var12.method1072((byte) 102, var64);
                    var12.method1072((byte) 102, 255 - (this.field3178[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field3203; var65++) {
                    int var66 = this.method1517(this.field3140[var65], this.field3159[var65], 0, this.field3150, this.field3178[var65]);
                    var12.field2185 = this.field3141[var65] * var7 + var9;
                    var12.method1073(326170192, var66);
                    var12.field2185 = this.field3167[var65] * var7 + var9;
                    var12.method1073(326170192, var66);
                    var12.field2185 = var9 + (this.field3228[var65] * var7);
                    var12.method1073(326170192, var66);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field3134 == null) {
                var67 = this.field3197;
                var68 = this.field3165;
                var69 = this.field3157;
                var70 = this.field3162;
            } else {
                var70 = this.field3134.field7014;
                var69 = this.field3134.field7009;
                var67 = this.field3134.field7011;
                var68 = this.field3134.field7008;
            }
            float var71 = 3.0F / (float) this.field3172;
            float var72 = 3.0F / (float) (this.field3172 / 2 + this.field3172);
            var12.field2185 = var10;
            if (this.field3144.field4974) {
                for (int var73 = 0; var73 < this.field3151; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1821(-8443, (float) var70[var73] * var72);
                        var12.method1821(-8443, (float) var68[var73] * var72);
                        var12.method1821(arg0 - 8443, (float) var69[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1821(-8443, (float) var70[var73] * var75);
                        var12.method1821(-8443, (float) var68[var73] * var75);
                        var12.method1821(-8443, (float) var69[var73] * var75);
                    }
                    var12.field2185 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field3151; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1823(32, (float) var70[var76] * var72);
                        var12.method1823(32, (float) var68[var76] * var72);
                        var12.method1823(32, (float) var69[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1823(32, (float) var70[var76] * var78);
                        var12.method1823(arg0 ^ 0x20, (float) var68[var76] * var78);
                        var12.method1823(arg0 + 32, (float) var69[var76] * var78);
                    }
                    var12.field2185 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field2185 = var11;
            if (this.field3144.field4974) {
                for (int var80 = 0; var80 < this.field3151; var80++) {
                    var12.method1821(arg0 ^ 0xFFFFDF05, this.field3131[var80]);
                    var12.method1821(-8443, this.field3210[var80]);
                    var12.field2185 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field3151; var79++) {
                    var12.method1823(32, this.field3131[var79]);
                    var12.method1823(32, this.field3210[var79]);
                    var12.field2185 += var7 - 8;
                }
            }
        }
        var12.field2185 = this.field3151 * var7;
        class541 var81;
        if (arg1) {
            if (this.field3193 == null) {
                this.field3193 = this.field3144.method2048(var12.field2219, var12.field2185, -1, true, var7);
            } else {
                this.field3193.method475(var7, arg0 ^ 0xFFFF8CFC, var12.field2185, var12.field2219);
            }
            var81 = this.field3193;
            this.field3179 = 0;
        } else {
            var81 = this.field3144.method2048(var12.field2219, var12.field2185, arg0 - 1, false, var7);
            this.field3126 = true;
        }
        if (var5) {
            this.field3175.field1742 = var81;
            this.field3175.field1740 = var8;
        }
        if (var6) {
            this.field3229.field1742 = var81;
            this.field3229.field1740 = var11;
        }
        if (var3) {
            this.field3155.field1740 = var9;
            this.field3155.field1742 = var81;
        }
        if (var4) {
            this.field3223.field1742 = var81;
            this.field3223.field1740 = var10;
        }
    }

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "(I)V")
    public final void method36(int arg0) {
        field3226++;
        int var2 = class428.field6502[arg0];
        int var3 = class428.field6501[arg0];
        for (int var4 = 0; var4 < this.field3196; var4++) {
            int var5 = this.field3183[var4] * var3 + this.field3133[var4] * var2 >> 15;
            this.field3133[var4] = this.field3133[var4] * var3 - (this.field3183[var4] * var2) >> 15;
            this.field3183[var4] = var5;
        }
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
        this.field3215 = false;
    }

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "(I)V")
    public final void method61(int arg0) {
        this.field3150 = (short) arg0;
        field3146++;
        if (this.field3155 != null) {
            this.field3155.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3174++;
        if (arg7 < arg6 && arg2 > arg7 && arg7 < arg5) {
            return false;
        } else if (arg6 < arg7 && arg2 < arg7 && arg7 > arg5) {
            return false;
        } else if (arg1 > arg3 && arg3 < arg8 && arg4 > arg3) {
            return false;
        } else {
            if (arg0 != -16384) {
                this.field3210 = null;
            }
            return arg1 >= arg3 || arg3 <= arg8 || arg3 <= arg4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "LA", descriptor = "(Lia;)Lia;")
    public final class423 method73(class423 arg0) {
        field3168++;
        if (this.field3151 == 0) {
            return null;
        }
        if (!this.field3215) {
            this.method1509(false);
        }
        int var2;
        int var3;
        if (this.field3144.field4990 <= 0) {
            var2 = this.field3147 - (this.field3144.field4990 * this.field3198 >> 8) >> this.field3144.field4895;
            var3 = this.field3207 - (this.field3144.field4990 * this.field3190 >> 8) >> this.field3144.field4895;
        } else {
            var2 = this.field3147 - (this.field3144.field4990 * this.field3190 >> 8) >> this.field3144.field4895;
            var3 = this.field3207 - (this.field3144.field4990 * this.field3198 >> 8) >> this.field3144.field4895;
        }
        int var4;
        int var5;
        if (this.field3144.field4941 <= 0) {
            var4 = this.field3132 - (this.field3144.field4941 * this.field3198 >> 8) >> this.field3144.field4895;
            var5 = this.field3153 - (this.field3144.field4941 * this.field3190 >> 8) >> this.field3144.field4895;
        } else {
            var4 = this.field3132 - (this.field3144.field4941 * this.field3190 >> 8) >> this.field3144.field4895;
            var5 = this.field3153 - (this.field3144.field4941 * this.field3198 >> 8) >> this.field3144.field4895;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class184 var8 = (class184) arg0;
        class184 var9;
        if (var8 != null && var8.method1245(var7, var6, 119)) {
            var9 = var8;
            var8.method1247(-1);
        } else {
            var9 = new class184(this.field3144, var6, var7);
        }
        var9.method1244(var2, var4, var3, var5, (byte) 56);
        this.method1518(var9, 30715);
        return var9;
    }

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "(SS)V")
    public final void method57(short arg0, short arg1) {
        field3130++;
        class15 var3 = this.field3144.field2235;
        for (int var4 = 0; var4 < this.field3203; var4++) {
            if (this.field3140[var4] == arg0) {
                this.field3140[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class107 var7 = var3.method157((byte) 112, arg0 & 0xFFFF);
            var6 = var7.field1505;
            var5 = var7.field1518;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class107 var10 = var3.method157((byte) 117, arg1 & 0xFFFF);
            var8 = var10.field1518;
            var9 = var10.field1505;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field3122 != null) {
            for (int var11 = 0; var11 < this.field3195; var11++) {
                class312 var12 = this.field3122[var11];
                class168 var13 = this.field3202[var11];
                var13.field2267 = class401.field6108[this.field3159[var12.field4567] & 0xFFFF] & 0xFFFFFF | var13.field2267 & 0xFF000000;
            }
        }
        if (this.field3155 != null) {
            this.field3155.field1742 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "(I)V")
    public final void method62(int arg0) {
        field3219++;
        this.field3227 = arg0;
        if (this.field3134 != null && (this.field3227 & 0x10000) == 0) {
            this.field3162 = this.field3134.field7014;
            this.field3165 = this.field3134.field7008;
            this.field3157 = this.field3134.field7009;
            this.field3197 = this.field3134.field7011;
            this.field3134 = null;
        }
        this.field3126 = true;
        this.method1515(-27466);
    }

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "(III)V")
    public final void method66(int arg0, int arg1, int arg2) {
        field3191++;
        for (int var4 = 0; var4 < this.field3196; var4++) {
            if (arg0 != 0) {
                this.field3183[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3133[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3173[var4] += arg2;
            }
        }
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
        this.field3215 = false;
    }

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "(III)V")
    public final void method90(int arg0, int arg1, int arg2) {
        field3139++;
        for (int var4 = 0; var4 < this.field3196; var4++) {
            if (arg0 != 128) {
                this.field3183[var4] = this.field3183[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3133[var4] = this.field3133[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3173[var4] = this.field3173[var4] * arg2 >> 7;
            }
        }
        this.field3215 = false;
        if (this.field3175 != null) {
            this.field3175.field1742 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I[IIIIIZ)V")
    public final void method60(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3149++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class160.field2085 = 0;
            class181.field2455 = 0;
            class152.field1982 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3205.length) {
                    int[] var15 = this.field3205[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class160.field2085 += this.field3183[var17];
                        class152.field1982 += this.field3133[var17];
                        class181.field2455 += this.field3173[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class181.field2455 = var10;
                class160.field2085 = var11;
                class152.field1982 = var9;
            } else {
                class181.field2455 = class181.field2455 / var12 + var10;
                class160.field2085 = class160.field2085 / var12 + var11;
                class152.field1982 = class152.field1982 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field3205.length > var22) {
                    int[] var23 = this.field3205[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3183[var25] += var20;
                        this.field3133[var25] += var18;
                        this.field3173[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field3205.length > var45) {
                    int[] var46 = this.field3205[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3183[var59] -= class160.field2085;
                            this.field3133[var59] -= class152.field1982;
                            this.field3173[var59] -= class181.field2455;
                            if (arg4 != 0) {
                                int var60 = class428.field6502[arg4];
                                int var61 = class428.field6501[arg4];
                                int var62 = this.field3183[var59] * var61 + this.field3133[var59] * var60 + 32767 >> 15;
                                this.field3133[var59] = this.field3133[var59] * var61 + 32767 - (this.field3183[var59] * var60) >> 15;
                                this.field3183[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class428.field6502[arg2];
                                int var64 = class428.field6501[arg2];
                                int var65 = this.field3133[var59] * var64 + 32767 - (this.field3173[var59] * var63) >> 15;
                                this.field3173[var59] = this.field3133[var59] * var63 + (this.field3173[var59] * var64) + 32767 >> 15;
                                this.field3133[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class428.field6502[arg3];
                                int var67 = class428.field6501[arg3];
                                int var68 = this.field3173[var59] * var66 + (this.field3183[var59] * var67 + 32767) >> 15;
                                this.field3173[var59] = this.field3173[var59] * var67 + 32767 - (this.field3183[var59] * var66) >> 15;
                                this.field3183[var59] = var68;
                            }
                            this.field3183[var59] += class160.field2085;
                            this.field3133[var59] += class152.field1982;
                            this.field3173[var59] += class181.field2455;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3183[var48] -= class160.field2085;
                            this.field3133[var48] -= class152.field1982;
                            this.field3173[var48] -= class181.field2455;
                            if (arg2 != 0) {
                                int var49 = class428.field6502[arg2];
                                int var50 = class428.field6501[arg2];
                                int var51 = this.field3133[var48] * var50 + 32767 - (this.field3173[var48] * var49) >> 15;
                                this.field3173[var48] = this.field3133[var48] * var49 + this.field3173[var48] * var50 + 32767 >> 15;
                                this.field3133[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class428.field6502[arg4];
                                int var53 = class428.field6501[arg4];
                                int var54 = this.field3183[var48] * var53 + this.field3133[var48] * var52 + 32767 >> 15;
                                this.field3133[var48] = this.field3133[var48] * var53 + 32767 - this.field3183[var48] * var52 >> 15;
                                this.field3183[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class428.field6502[arg3];
                                int var56 = class428.field6501[arg3];
                                int var57 = this.field3183[var48] * var56 + this.field3173[var48] * var55 + 32767 >> 15;
                                this.field3173[var48] = this.field3173[var48] * var56 + 32767 - (this.field3183[var48] * var55) >> 15;
                                this.field3183[var48] = var57;
                            }
                            this.field3183[var48] += class160.field2085;
                            this.field3133[var48] += class152.field1982;
                            this.field3173[var48] += class181.field2455;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field3205.length > var28) {
                        int[] var29 = this.field3205[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3148[var31];
                            int var33 = this.field3148[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3163[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class428.field6502[arg4];
                                    int var37 = class428.field6501[arg4];
                                    int var38 = this.field3165[var35] * var36 + (this.field3162[var35] * var37 + 32767) >> 15;
                                    this.field3165[var35] = (short) (this.field3165[var35] * var37 + 32767 - (this.field3162[var35] * var36) >> 15);
                                    this.field3162[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class428.field6502[arg2];
                                    int var40 = class428.field6501[arg2];
                                    int var41 = this.field3165[var35] * var40 + 32767 - (this.field3157[var35] * var39) >> 15;
                                    this.field3157[var35] = (short) (this.field3165[var35] * var39 + this.field3157[var35] * var40 + 32767 >> 15);
                                    this.field3165[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class428.field6502[arg3];
                                    int var43 = class428.field6501[arg3];
                                    int var44 = this.field3162[var35] * var43 + this.field3157[var35] * var42 + 32767 >> 15;
                                    this.field3157[var35] = (short) (this.field3157[var35] * var43 + 32767 - (this.field3162[var35] * var42) >> 15);
                                    this.field3162[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3223 == null && this.field3155 != null) {
                    this.field3155.field1742 = null;
                }
                if (this.field3223 != null) {
                    this.field3223.field1742 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field3205.length > var70) {
                    int[] var71 = this.field3205[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3183[var73] -= class160.field2085;
                        this.field3133[var73] -= class152.field1982;
                        this.field3173[var73] -= class181.field2455;
                        this.field3183[var73] = this.field3183[var73] * arg2 >> 7;
                        this.field3133[var73] = this.field3133[var73] * arg3 >> 7;
                        this.field3173[var73] = this.field3173[var73] * arg4 >> 7;
                        this.field3183[var73] += class160.field2085;
                        this.field3133[var73] += class152.field1982;
                        this.field3173[var73] += class181.field2455;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3145 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field3145.length > var78) {
                        int[] var79 = this.field3145[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3178[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3178[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3155 != null) {
                            this.field3155.field1742 = null;
                        }
                    }
                }
                if (this.field3122 != null) {
                    for (int var75 = 0; var75 < this.field3195; var75++) {
                        class312 var76 = this.field3122[var75];
                        class168 var77 = this.field3202[var75];
                        var77.field2267 = var77.field2267 & 0xFFFFFF | 255 - (this.field3178[var76.field4567] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3145 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field3145.length) {
                        int[] var88 = this.field3145[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3159[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFD52) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var97 = arg4 + var94;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3159[var90] = (short) class311.method1956(var97, class311.method1956(var96 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field3155 != null) {
                            this.field3155.field1742 = null;
                        }
                    }
                }
                if (this.field3122 != null) {
                    for (int var84 = 0; var84 < this.field3195; var84++) {
                        class312 var85 = this.field3122[var84];
                        class168 var86 = this.field3202[var84];
                        var86.field2267 = var86.field2267 & 0xFF000000 | class401.field6108[this.field3159[var85.field4567] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3180 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field3180.length > var99) {
                        int[] var100 = this.field3180[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class168 var102 = this.field3202[var100[var101]];
                            var102.field2268 += arg3;
                            var102.field2263 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3180 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field3180.length > var104) {
                        int[] var105 = this.field3180[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class168 var107 = this.field3202[var105[var106]];
                            var107.field2264 = var107.field2264 * arg3 >> 7;
                            var107.field2260 = var107.field2260 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3180 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field3180.length) {
                    int[] var110 = this.field3180[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class168 var112 = this.field3202[var110[var111]];
                        var112.field2259 = var112.field2259 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lnq;)V")
    public class226(class325 arg0) {
        this.field3144 = arg0;
        this.field3175 = new class129(null, 5126, 3, 0);
        this.field3229 = new class129(null, 5126, 2, 0);
        this.field3223 = new class129(null, 5126, 3, 0);
        this.field3155 = new class129(null, 5121, 4, 0);
        this.field3188 = new class474();
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lnq;Lnd;IIII)V")
    public class226(class325 arg0, class387 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3144 = arg0;
        this.field3186 = arg5;
        this.field3227 = arg2;
        if (class435.method2646(arg2, arg5, (byte) -128)) {
            this.field3175 = new class129(null, 5126, 3, 0);
        }
        if (class361.method2306(-23496, arg2, arg5)) {
            this.field3229 = new class129(null, 5126, 2, 0);
        }
        if (class143.method956(arg5, arg2, 19688)) {
            this.field3223 = new class129(null, 5126, 3, 0);
        }
        if (class179.method1200(124, arg5, arg2)) {
            this.field3155 = new class129(null, 5121, 4, 0);
        }
        if (class533.method3153(2048, arg5, arg2)) {
            this.field3188 = new class474();
        }
        class15 var7 = arg0.field2235;
        this.field3148 = new int[arg1.field5900 + 1];
        int[] var8 = new int[arg1.field5897];
        for (int var9 = 0; var9 < arg1.field5897; var9++) {
            if ((arg1.field5894 == null || arg1.field5894[var9] != 2) && (arg1.field5913 == null || arg1.field5913[var9] == -1 || !var7.method157((byte) 103, arg1.field5913[var9] & 0xFFFF).field1517)) {
                var8[this.field3203++] = var9;
                this.field3148[arg1.field5871[var9]]++;
                this.field3148[arg1.field5895[var9]]++;
                this.field3148[arg1.field5875[var9]]++;
            }
        }
        this.field3170 = this.field3203;
        long[] var10 = new long[this.field3203];
        boolean var11 = (this.field3227 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field3203; var12++) {
            int var180 = var8[var12];
            class107 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field5877 != null) {
                for (int var186 = 0; var186 < arg1.field5877.length; var186++) {
                    class128 var187 = arg1.field5877[var186];
                    if (var187.field1735 == var180) {
                        class257 var188 = class26.method234(true, var187.field1734);
                        if (var188.field3561) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3170--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field5913 != null) {
                var189 = arg1.field5913[var180];
                if (var189 != -1) {
                    var181 = var7.method157((byte) 116, var189 & 0xFFFF);
                    var184 = var181.field1506;
                    var185 = var181.field1524;
                }
            }
            boolean var190 = arg1.field5905 != null && arg1.field5905[var180] != 0 || var181 != null && !var181.field1522 | var181.field1521;
            if ((var11 || var190) && arg1.field5902 != null) {
                var182 += arg1.field5902[var180] << 17;
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
        class72.method498(10304, var10, var8);
        this.field3183 = arg1.field5878;
        this.field3125 = arg1.field5910;
        this.field3173 = arg1.field5893;
        this.field3123 = arg1.field5888;
        this.field3196 = arg1.field5900;
        this.field3133 = arg1.field5901;
        class256[] var13 = new class256[this.field3196];
        this.field3176 = arg1.field5911;
        this.field3128 = arg1.field5880;
        if (arg1.field5877 != null) {
            this.field3195 = arg1.field5877.length;
            this.field3122 = new class312[this.field3195];
            this.field3202 = new class168[this.field3195];
            for (int var14 = 0; var14 < this.field3195; var14++) {
                class128 var15 = arg1.field5877[var14];
                class257 var16 = class26.method234(true, var15.field1734);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3203; var18++) {
                    if (var8[var18] == var15.field1735) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class401.field6108[arg1.field5874[var15.field1735] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5905 == null ? 0 : arg1.field5905[var15.field1735]) << 24;
                this.field3122[var14] = new class312(var17, arg1.field5871[var15.field1735], arg1.field5895[var15.field1735], arg1.field5875[var15.field1735], var16.field3558, var16.field3548, var16.field3550, var16.field3551, var16.field3555, var16.field3561, var16.field3547, var15.field1730);
                this.field3202[var14] = new class168(var20);
            }
        }
        int var21 = this.field3203 * 3;
        this.field3178 = new byte[this.field3203];
        this.field3167 = new short[this.field3203];
        this.field3159 = new short[this.field3203];
        this.field3150 = (short) arg3;
        if (arg1.field5886 != null) {
            this.field3201 = new short[this.field3203];
        }
        this.field3131 = new float[var21];
        this.field3163 = new short[var21];
        class535.field7862 = new long[var21];
        this.field3140 = new short[this.field3203];
        this.field3165 = new short[var21];
        this.field3157 = new short[var21];
        this.field3141 = new short[this.field3203];
        this.field3197 = new byte[var21];
        this.field3210 = new float[var21];
        this.field3162 = new short[var21];
        this.field3228 = new short[this.field3203];
        this.field3172 = (short) arg4;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5900; var23++) {
            int var179 = this.field3148[var23];
            this.field3148[var23] = var22;
            var22 += var179;
            var13[var23] = new class256();
        }
        this.field3148[arg1.field5900] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field5885 != null) {
            int var28 = arg1.field5924;
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
            var27 = new float[var28][];
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field3203; var36++) {
                int var43 = var8[var36];
                if (arg1.field5885[var43] != -1) {
                    int var44 = arg1.field5885[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field5871[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field5895[var43];
                        } else {
                            var46 = arg1.field5875[var43];
                        }
                        int var47 = arg1.field5878[var46];
                        int var48 = arg1.field5901[var46];
                        int var49 = arg1.field5893[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
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
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field5903[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field5904[var37];
                        var40 = 64.0F / (float) arg1.field5917[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = 1.0F;
                            var42 = (float) var39 / 1024.0F;
                        } else {
                            var42 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field5917[var37];
                        var41 = 64.0F / (float) arg1.field5904[var37];
                        var42 = 64.0F / (float) arg1.field5892[var37];
                    } else {
                        var41 = (float) arg1.field5904[var37] / 1024.0F;
                        var40 = (float) arg1.field5917[var37] / 1024.0F;
                        var42 = (float) arg1.field5892[var37] / 1024.0F;
                    }
                    var27[var37] = class89.method603(var40, class519.method3092(arg1.field5879[var37], 255), var42, var41, arg1.field5876[var37], true, arg1.field5896[var37], arg1.field5873[var37]);
                }
            }
        }
        class22[] var50 = new class22[arg1.field5897];
        for (int var51 = 0; var51 < arg1.field5897; var51++) {
            short var158 = arg1.field5871[var51];
            short var159 = arg1.field5895[var51];
            short var160 = arg1.field5875[var51];
            int var161 = this.field3183[var159] - this.field3183[var158];
            int var162 = this.field3133[var159] - this.field3133[var158];
            int var163 = this.field3173[var159] - this.field3173[var158];
            int var164 = this.field3183[var160] - this.field3183[var158];
            int var165 = this.field3133[var160] - this.field3133[var158];
            int var166 = this.field3173[var160] - this.field3173[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - var162 * var164;
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field5894 == null ? 0 : arg1.field5894[var51];
            if (var174 == 0) {
                class256 var175 = var13[var158];
                var175.field3543 += var172;
                var175.field3539 += var173;
                var175.field3542 += var171;
                var175.field3544++;
                class256 var176 = var13[var159];
                var176.field3543 += var172;
                var176.field3539 += var173;
                var176.field3542 += var171;
                var176.field3544++;
                class256 var177 = var13[var160];
                var177.field3539 += var173;
                var177.field3543 += var172;
                var177.field3544++;
                var177.field3542 += var171;
            } else if (var174 == 1) {
                class22 var178 = var50[var51] = new class22();
                var178.field332 = var173;
                var178.field331 = var171;
                var178.field328 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field3203; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field5874[var68] & 0xFFFF;
            short var70;
            if (arg1.field5913 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field5913[var68];
            }
            int var71;
            if (arg1.field5885 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field5885[var68];
            }
            int var72;
            if (arg1.field5905 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field5905[var68] & 0xFF;
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
                    var73 = 0.0F;
                    var77 = 0.0F;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var80 = 2;
                    var79 = 1;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field5903[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field5871[var68];
                        short var112 = arg1.field5895[var68];
                        short var113 = arg1.field5875[var68];
                        short var114 = arg1.field5896[var71];
                        short var115 = arg1.field5873[var71];
                        short var116 = arg1.field5876[var71];
                        float var117 = (float) arg1.field5878[var114];
                        float var118 = (float) arg1.field5901[var114];
                        float var119 = (float) arg1.field5893[var114];
                        float var120 = (float) arg1.field5878[var115] - var117;
                        float var121 = (float) arg1.field5901[var115] - var118;
                        float var122 = (float) arg1.field5893[var115] - var119;
                        float var123 = (float) arg1.field5878[var116] - var117;
                        float var124 = (float) arg1.field5901[var116] - var118;
                        float var125 = (float) arg1.field5893[var116] - var119;
                        float var126 = (float) arg1.field5878[var111] - var117;
                        float var127 = (float) arg1.field5901[var111] - var118;
                        float var128 = (float) arg1.field5893[var111] - var119;
                        float var129 = (float) arg1.field5878[var112] - var117;
                        float var130 = (float) arg1.field5901[var112] - var118;
                        float var131 = (float) arg1.field5893[var112] - var119;
                        float var132 = (float) arg1.field5878[var113] - var117;
                        float var133 = (float) arg1.field5901[var113] - var118;
                        float var134 = (float) arg1.field5893[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - var121 * var135;
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var122 * var135 - var120 * var137;
                        float var145 = 1.0F / (var125 * var142 + var123 * var143 + var124 * var144);
                        var76 = (var131 * var142 + var129 * var143 + var130 * var144) * var145;
                        var74 = (var128 * var142 + var126 * var143 + var127 * var144) * var145;
                        var78 = (var134 * var142 + var132 * var143 + var133 * var144) * var145;
                    } else {
                        short var83 = arg1.field5871[var68];
                        short var84 = arg1.field5895[var68];
                        short var85 = arg1.field5875[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field5909[var71];
                        float var91 = (float) arg1.field5919[var71] / 256.0F;
                        if (var82 == 1) {
                            float var109 = (float) arg1.field5892[var71] / 1024.0F;
                            class339.method2192(arg1.field5878[var83], 3, var91, var87, var89, arg1.field5901[var83], var88, var109, arg1.field5893[var83], var90, var86);
                            var74 = class32.field470;
                            var73 = class459.field6879;
                            class339.method2192(arg1.field5878[var84], 3, var91, var87, var89, arg1.field5901[var84], var88, var109, arg1.field5893[var84], var90, var86);
                            var76 = class32.field470;
                            var75 = class459.field6879;
                            class339.method2192(arg1.field5878[var85], 3, var91, var87, var89, arg1.field5901[var85], var88, var109, arg1.field5893[var85], var90, var86);
                            var77 = class459.field6879;
                            var78 = class32.field470;
                            float var110 = var109 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var110 < var77 - var73) {
                                    var77 -= var109;
                                    var80 = 1;
                                } else if (var110 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var109;
                                }
                                if (var75 - var73 > var110) {
                                    var75 -= var109;
                                    var79 = 1;
                                } else if (var110 < var73 - var75) {
                                    var75 += var109;
                                    var79 = 2;
                                }
                            } else {
                                if (var76 - var74 > var110) {
                                    var76 -= var109;
                                    var79 = 1;
                                } else if (var110 < var74 - var76) {
                                    var76 += var109;
                                    var79 = 2;
                                }
                                if (var110 < var78 - var74) {
                                    var80 = 1;
                                    var78 -= var109;
                                } else if (var74 - var78 > var110) {
                                    var78 += var109;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var92 = (float) arg1.field5891[var71] / 256.0F;
                            float var93 = (float) arg1.field5908[var71] / 256.0F;
                            int var94 = arg1.field5878[var84] - arg1.field5878[var83];
                            int var95 = arg1.field5901[var84] - arg1.field5901[var83];
                            int var96 = arg1.field5893[var84] - arg1.field5893[var83];
                            int var97 = arg1.field5878[var85] - arg1.field5878[var83];
                            int var98 = arg1.field5901[var85] - arg1.field5901[var83];
                            int var99 = arg1.field5893[var85] - arg1.field5893[var83];
                            int var100 = var95 * var99 - (var96 * var98);
                            int var101 = var96 * var97 - var94 * var99;
                            int var102 = var94 * var98 - (var95 * var97);
                            float var103 = 64.0F / (float) arg1.field5904[var71];
                            float var104 = 64.0F / (float) arg1.field5917[var71];
                            float var105 = 64.0F / (float) arg1.field5892[var71];
                            float var106 = (var89[2] * (float) var102 + var89[1] * (float) var101 + var89[0] * (float) var100) / var103;
                            float var107 = (var89[5] * (float) var102 + var89[4] * (float) var101 + var89[3] * (float) var100) / var104;
                            float var108 = (var89[8] * (float) var102 + var89[6] * (float) var100 + var89[7] * (float) var101) / var105;
                            var81 = class101.method662(var106, var107, (byte) 58, var108);
                            class429.method2626(var81, false, var86, var90, var87, var89, var92, arg1.field5878[var83], var88, arg1.field5893[var83], var93, var91, arg1.field5901[var83]);
                            var74 = class241.field3396;
                            var73 = class290.field4245;
                            class429.method2626(var81, false, var86, var90, var87, var89, var92, arg1.field5878[var84], var88, arg1.field5893[var84], var93, var91, arg1.field5901[var84]);
                            var75 = class290.field4245;
                            var76 = class241.field3396;
                            class429.method2626(var81, false, var86, var90, var87, var89, var92, arg1.field5878[var85], var88, arg1.field5893[var85], var93, var91, arg1.field5901[var85]);
                            var77 = class290.field4245;
                            var78 = class241.field3396;
                        } else if (var82 == 3) {
                            class85.method581((byte) -88, arg1.field5878[var83], var89, var88, arg1.field5901[var83], arg1.field5893[var83], var90, var86, var91, var87);
                            var73 = class417.field6363;
                            var74 = class369.field5626;
                            class85.method581((byte) -88, arg1.field5878[var84], var89, var88, arg1.field5901[var84], arg1.field5893[var84], var90, var86, var91, var87);
                            var75 = class417.field6363;
                            var76 = class369.field5626;
                            class85.method581((byte) -88, arg1.field5878[var85], var89, var88, arg1.field5901[var85], arg1.field5893[var85], var90, var86, var91, var87);
                            var77 = class417.field6363;
                            var78 = class369.field5626;
                            if ((var90 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if (var75 - var73 > 0.5F) {
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
                                    var80 = 2;
                                    var78++;
                                }
                                if (var76 - var74 > 0.5F) {
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
            if (arg1.field5894 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field5894[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var149 = arg1.field5871[var68];
                short var150 = arg1.field5895[var68];
                short var151 = arg1.field5875[var68];
                class256 var152 = var13[var149];
                this.field3141[var52] = this.method1516((byte) 109, var147, var73, var74, var152.field3544, var152.field3539, var152.field3542, var152.field3543, var149, arg1);
                class256 var153 = var13[var150];
                this.field3167[var52] = this.method1516((byte) 109, (long) var79 + var147, var75, var76, var153.field3544, var153.field3539, var153.field3542, var153.field3543, var150, arg1);
                class256 var154 = var13[var151];
                this.field3228[var52] = this.method1516((byte) 109, (long) var80 + var147, var77, var78, var154.field3544, var154.field3539, var154.field3542, var154.field3543, var151, arg1);
            } else if (var146 == 1) {
                class22 var155 = var50[var68];
                long var156 = (long) ((var155.field331 + 256 << 12) + ((var71 << 2) + (var155.field332 > 0 ? 1024 : 2048) + (var155.field328 - -256 << 22))) + ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32);
                this.field3141[var52] = this.method1516((byte) 109, var156, var73, var74, 0, var155.field332, var155.field331, var155.field328, arg1.field5871[var68], arg1);
                this.field3167[var52] = this.method1516((byte) 109, (long) var79 + var156, var75, var76, 0, var155.field332, var155.field331, var155.field328, arg1.field5895[var68], arg1);
                this.field3228[var52] = this.method1516((byte) 109, (long) var80 + var156, var77, var78, 0, var155.field332, var155.field331, var155.field328, arg1.field5875[var68], arg1);
            }
            if (arg1.field5913 == null) {
                this.field3140[var52] = -1;
            } else {
                this.field3140[var52] = arg1.field5913[var68];
            }
            if (arg1.field5905 != null) {
                this.field3178[var52] = arg1.field5905[var68];
            }
            if (arg1.field5886 != null) {
                this.field3201[var52] = arg1.field5886[var68];
            }
            this.field3159[var52] = arg1.field5874[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3170; var55++) {
            short var67 = this.field3140[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field3135 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field3170; var58++) {
            short var66 = this.field3140[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field3135[var57++] = var58;
            }
        }
        this.field3135[var57] = this.field3170;
        class535.field7862 = null;
        this.field3162 = class448.method2735(this.field3162, this.field3151, 69);
        this.field3165 = class448.method2735(this.field3165, this.field3151, 69);
        this.field3157 = class448.method2735(this.field3157, this.field3151, 69);
        this.field3197 = class462.method2794(this.field3197, this.field3151, (byte) 120);
        this.field3131 = class194.method1307(this.field3131, this.field3151, (byte) -112);
        this.field3210 = class194.method1307(this.field3210, this.field3151, (byte) -99);
        if (arg1.field5898 != null && class387.method2417(126, this.field3186, arg2)) {
            this.field3205 = arg1.method2421(true);
        }
        if (arg1.field5877 != null && class316.method1983(this.field3186, 11588, arg2)) {
            this.field3180 = arg1.method2422(25536);
        }
        if (arg1.field5899 != null && class503.method3014(this.field3186, (byte) 64, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3203; var61++) {
                int var65 = arg1.field5899[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field3145 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3145[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3203; var63++) {
                int var64 = arg1.field5899[var8[var63]];
                if (var64 >= 0) {
                    this.field3145[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
