import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class191 extends class282 {

    @OriginalMember(owner = "client!lu", name = "bc", descriptor = "[I")
    private int[] field3293;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!lu", name = "zb", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!lu", name = "sc", descriptor = "I")
    private int field3310;

    @OriginalMember(owner = "client!lu", name = "dc", descriptor = "[S")
    private short[] field3295;

    @OriginalMember(owner = "client!lu", name = "tc", descriptor = "[I")
    private int[] field3311;

    @OriginalMember(owner = "client!lu", name = "Ec", descriptor = "I")
    private int field3322;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "[I")
    private int[] field3216;

    @OriginalMember(owner = "client!lu", name = "Bc", descriptor = "[I")
    private int[] field3319;

    @OriginalMember(owner = "client!lu", name = "lb", descriptor = "[Lsn;")
    private class158[] field3251;

    @OriginalMember(owner = "client!lu", name = "qb", descriptor = "[Lou;")
    private class157[] field3256;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!lu", name = "Sb", descriptor = "[Ljk;")
    private class182[] field3284;

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "[Ldga;")
    private class475[] field3240;

    @OriginalMember(owner = "client!lu", name = "Wb", descriptor = "[S")
    private short[] field3288;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "[S")
    private short[] field3230;

    @OriginalMember(owner = "client!lu", name = "Ub", descriptor = "[S")
    private short[] field3286;

    @OriginalMember(owner = "client!lu", name = "Gb", descriptor = "[S")
    private short[] field3272;

    @OriginalMember(owner = "client!lu", name = "wc", descriptor = "[S")
    private short[] field3314;

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "[S")
    private short[] field3243;

    @OriginalMember(owner = "client!lu", name = "gc", descriptor = "[B")
    private byte[] field3298;

    @OriginalMember(owner = "client!lu", name = "hc", descriptor = "S")
    private short field3299;

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "[F")
    private float[] field3239;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "[S")
    private short[] field3201;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "S")
    private short field3213;

    @OriginalMember(owner = "client!lu", name = "Yb", descriptor = "[S")
    private short[] field3290;

    @OriginalMember(owner = "client!lu", name = "Ib", descriptor = "[S")
    private short[] field3274;

    @OriginalMember(owner = "client!lu", name = "oc", descriptor = "[F")
    private float[] field3306;

    @OriginalMember(owner = "client!lu", name = "Cc", descriptor = "[S")
    private short[] field3320;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "[S")
    private short[] field3212;

    @OriginalMember(owner = "client!lu", name = "vc", descriptor = "[S")
    private short[] field3313;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "[B")
    private byte[] field3235;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "[I")
    private int[] field3219;

    @OriginalMember(owner = "client!lu", name = "yb", descriptor = "[I")
    private int[] field3264;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "[I")
    private int[] field3241;

    @OriginalMember(owner = "client!lu", name = "cc", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!lu", name = "jc", descriptor = "[[I")
    private int[][] field3301;

    @OriginalMember(owner = "client!lu", name = "Kb", descriptor = "[[I")
    private int[][] field3276;

    @OriginalMember(owner = "client!lu", name = "Rb", descriptor = "[[I")
    private int[][] field3283;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "Z")
    private boolean field3227;

    @OriginalMember(owner = "client!lu", name = "pb", descriptor = "Z")
    private boolean field3255;

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "Z")
    private boolean field3242;

    @OriginalMember(owner = "client!lu", name = "kb", descriptor = "Z")
    private boolean field3250;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "Z")
    private boolean field3226;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Lpj;")
    private class38 field3206;

    @OriginalMember(owner = "client!lu", name = "sb", descriptor = "Lvk;")
    private class236 field3258;

    @OriginalMember(owner = "client!lu", name = "qc", descriptor = "Lvk;")
    private class236 field3308;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "Lvk;")
    private class236 field3200;

    @OriginalMember(owner = "client!lu", name = "tb", descriptor = "Lvk;")
    private class236 field3259;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "Lef;")
    private class260 field3209;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    public static int field3229 = 104;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    private int field3210;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!lu", name = "T", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!lu", name = "eb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!lu", name = "fb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!lu", name = "hb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!lu", name = "ib", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!lu", name = "mb", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!lu", name = "nb", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!lu", name = "ob", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!lu", name = "rb", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!lu", name = "ub", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!lu", name = "vb", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!lu", name = "wb", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!lu", name = "xb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!lu", name = "Ab", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!lu", name = "Bb", descriptor = "I")
    private int field3267;

    @OriginalMember(owner = "client!lu", name = "Cb", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!lu", name = "Db", descriptor = "I")
    private int field3269;

    @OriginalMember(owner = "client!lu", name = "Eb", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!lu", name = "Fb", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!lu", name = "Hb", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!lu", name = "Jb", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!lu", name = "Lb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!lu", name = "Mb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!lu", name = "Nb", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!lu", name = "Ob", descriptor = "I")
    private int field3280;

    @OriginalMember(owner = "client!lu", name = "Pb", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!lu", name = "Qb", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!lu", name = "Tb", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!lu", name = "Vb", descriptor = "I")
    private int field3287;

    @OriginalMember(owner = "client!lu", name = "Xb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!lu", name = "Zb", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!lu", name = "ac", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!lu", name = "ec", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!lu", name = "ic", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!lu", name = "kc", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!lu", name = "lc", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!lu", name = "mc", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lu", name = "nc", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!lu", name = "pc", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!lu", name = "rc", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!lu", name = "uc", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!lu", name = "xc", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!lu", name = "yc", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!lu", name = "zc", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!lu", name = "Ac", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!lu", name = "Dc", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!lu", name = "Fc", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!lu", name = "fc", descriptor = "Lhq;")
    private class364 field3297;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)Z", line = 4)
    private final boolean method1438(boolean arg0) {
        field3316++;
        if (this.field3209.field4055) {
            return true;
        }
        if (this.field3209.field4056 == null) {
            this.field3209.field4056 = this.field3206.method428(-128, this.field3250);
        }
        class743 var2 = this.field3209.field4056;
        var2.method924((byte) -58, this.field3237 * 6);
        Buffer var3 = var2.method926(arg0, -29944);
        if (var3 != null) {
            Stream var4 = this.field3206.method368((byte) -121, var3);
            if (Stream.method2572()) {
                for (int var6 = 0; var6 < this.field3237; var6++) {
                    var4.method2585(this.field3313[var6]);
                    var4.method2585(this.field3201[var6]);
                    var4.method2585(this.field3290[var6]);
                }
            } else {
                for (int var5 = 0; var5 < this.field3237; var5++) {
                    var4.method2584(this.field3313[var5]);
                    var4.method2584(this.field3201[var5]);
                    var4.method2584(this.field3290[var5]);
                }
            }
            var4.method2573();
            if (var2.method925((byte) 96)) {
                this.field3209.field4055 = true;
                this.field3242 = true;
                this.field3209.field4060 = var2;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 68)
    private final void method1439(int arg0) {
        field3228++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = arg0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3322; var10++) {
            int var11 = this.field3319[var10];
            int var12 = this.field3216[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field3311[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var11 * var11 + (var13 * var13) + (var12 * var12);
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field3287 = var3;
        this.field3210 = var2;
        this.field3267 = var7;
        this.field3199 = var4;
        this.field3249 = var5;
        this.field3231 = var6;
        this.field3269 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field3280 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field3226 = true;
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "()V", line = 147)
    public final void method1022() {
        field3198++;
    }

    @OriginalMember(owner = "client!lu", name = "ba", descriptor = "(Lr;)Lr;", line = 155)
    public final class706 method1052(class706 arg0) {
        field3268++;
        if (this.field3294 == 0) {
            return null;
        }
        if (!this.field3226) {
            this.method1439(0);
        }
        int var2;
        int var3;
        if (this.field3206.field576 > 0) {
            var2 = this.field3210 - (this.field3206.field576 * this.field3231 >> 8) >> this.field3206.field658;
            var3 = this.field3249 - (this.field3206.field576 * this.field3287 >> 8) >> this.field3206.field658;
        } else {
            var2 = this.field3210 - (this.field3206.field576 * this.field3287 >> 8) >> this.field3206.field658;
            var3 = this.field3249 - (this.field3206.field576 * this.field3231 >> 8) >> this.field3206.field658;
        }
        int var4;
        int var5;
        if (this.field3206.field670 <= 0) {
            var4 = this.field3199 - (this.field3206.field670 * this.field3287 >> 8) >> this.field3206.field658;
            var5 = this.field3267 - (this.field3206.field670 * this.field3231 >> 8) >> this.field3206.field658;
        } else {
            var4 = this.field3199 - (this.field3206.field670 * this.field3231 >> 8) >> this.field3206.field658;
            var5 = this.field3267 - (this.field3206.field670 * this.field3287 >> 8) >> this.field3206.field658;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class684 var8 = (class684) arg0;
        class684 var9;
        if (var8 != null && var8.method3819(var6, 0, var7)) {
            var9 = var8;
            var8.method3814(68);
        } else {
            var9 = new class684(this.field3206, var6, var7);
        }
        var9.method3816(var3, var2, var5, var4, 1598);
        this.method1441(var9, (byte) -98);
        return var9;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(BIZ)Lka;", line = 218)
    public final class282 method1025(byte arg0, int arg1, boolean arg2) {
        field3278++;
        class191 var4;
        class191 var5;
        if (arg0 == 1) {
            var4 = this.field3206.field689;
            var5 = this.field3206.field691;
        } else if (arg0 == 2) {
            var5 = this.field3206.field675;
            var4 = this.field3206.field683;
        } else if (arg0 == 3) {
            var4 = this.field3206.field688;
            var5 = this.field3206.field679;
        } else if (arg0 == 4) {
            var5 = this.field3206.field686;
            var4 = this.field3206.field695;
        } else if (arg0 == 5) {
            var5 = this.field3206.field684;
            var4 = this.field3206.field685;
        } else {
            var4 = var5 = new class191(this.field3206, 0, 0, true, false);
        }
        return this.method1445(var4, arg1, arg0 != 0, var5, arg2, (byte) 69);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 266)
    public final void method1440(byte arg0) {
        if (this.field3258 != null) {
            this.field3258.method1623(false);
        }
        field3204++;
        if (this.field3308 != null) {
            this.field3308.method1623(false);
        }
        int var2 = 33 / ((-arg0 - 29) / 51);
        if (this.field3200 != null) {
            this.field3200.method1623(false);
        }
        if (this.field3259 != null) {
            this.field3259.method1623(false);
        }
        if (this.field3209 != null) {
            this.field3209.method1740(true);
        }
    }

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "(III)V", line = 295)
    public final void method1047(int arg0, int arg1, int arg2) {
        field3271++;
        for (int var4 = 0; var4 < this.field3322; var4++) {
            if (arg0 != 0) {
                this.field3319[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3216[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3311[var4] += arg2;
            }
        }
        this.method1446((byte) 104);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "LA", descriptor = "(I)V", line = 325)
    public final void method1046(int arg0) {
        field3233++;
        this.field3299 = (short) arg0;
        this.method1446((byte) 76);
        this.method1444((byte) -122);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[IIIIIZ)V", line = 337)
    public final void method1011(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3223++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class366.field5580 = 0;
            class100.field1480 = 0;
            class741.field10394 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field3301.length) {
                    int[] var15 = this.field3301[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class741.field10394 += this.field3319[var17];
                        class366.field5580 += this.field3216[var17];
                        var12++;
                        class100.field1480 += this.field3311[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class741.field10394 = var10;
                class366.field5580 = var9;
                class100.field1480 = var11;
            } else {
                class366.field5580 = class366.field5580 / var12 + var9;
                class741.field10394 = class741.field10394 / var12 + var10;
                class100.field1480 = class100.field1480 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field3301.length) {
                    int[] var23 = this.field3301[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3319[var25] += var18;
                        this.field3216[var25] += var20;
                        this.field3311[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field3301.length > var45) {
                    int[] var46 = this.field3301[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3319[var59] -= class741.field10394;
                            this.field3216[var59] -= class366.field5580;
                            this.field3311[var59] -= class100.field1480;
                            if (arg4 != 0) {
                                int var60 = class582.field8226[arg4];
                                int var61 = class582.field8230[arg4];
                                int var62 = this.field3319[var59] * var61 + this.field3216[var59] * var60 + 16383 >> 14;
                                this.field3216[var59] = this.field3216[var59] * var61 + 16383 - (this.field3319[var59] * var60) >> 14;
                                this.field3319[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class582.field8226[arg2];
                                int var64 = class582.field8230[arg2];
                                int var65 = this.field3216[var59] * var64 + 16383 - (this.field3311[var59] * var63) >> 14;
                                this.field3311[var59] = this.field3311[var59] * var64 + this.field3216[var59] * var63 + 16383 >> 14;
                                this.field3216[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class582.field8226[arg3];
                                int var67 = class582.field8230[arg3];
                                int var68 = this.field3319[var59] * var67 + (this.field3311[var59] * var66 + 16383) >> 14;
                                this.field3311[var59] = this.field3311[var59] * var67 + 16383 - this.field3319[var59] * var66 >> 14;
                                this.field3319[var59] = var68;
                            }
                            this.field3319[var59] += class741.field10394;
                            this.field3216[var59] += class366.field5580;
                            this.field3311[var59] += class100.field1480;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3319[var48] -= class741.field10394;
                            this.field3216[var48] -= class366.field5580;
                            this.field3311[var48] -= class100.field1480;
                            if (arg2 != 0) {
                                int var49 = class582.field8226[arg2];
                                int var50 = class582.field8230[arg2];
                                int var51 = this.field3216[var48] * var50 + 16383 - this.field3311[var48] * var49 >> 14;
                                this.field3311[var48] = this.field3311[var48] * var50 + this.field3216[var48] * var49 + 16383 >> 14;
                                this.field3216[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class582.field8226[arg4];
                                int var53 = class582.field8230[arg4];
                                int var54 = this.field3319[var48] * var53 + this.field3216[var48] * var52 + 16383 >> 14;
                                this.field3216[var48] = this.field3216[var48] * var53 + 16383 - (this.field3319[var48] * var52) >> 14;
                                this.field3319[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class582.field8226[arg3];
                                int var56 = class582.field8230[arg3];
                                int var57 = this.field3319[var48] * var56 + (this.field3311[var48] * var55 + 16383) >> 14;
                                this.field3311[var48] = this.field3311[var48] * var56 + 16383 - (this.field3319[var48] * var55) >> 14;
                                this.field3319[var48] = var57;
                            }
                            this.field3319[var48] += class741.field10394;
                            this.field3216[var48] += class366.field5580;
                            this.field3311[var48] += class100.field1480;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field3301.length) {
                        int[] var29 = this.field3301[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3293[var31];
                            int var33 = this.field3293[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3272[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class582.field8226[arg4];
                                    int var37 = class582.field8230[arg4];
                                    int var38 = this.field3230[var35] * var37 + this.field3288[var35] * var36 + 16383 >> 14;
                                    this.field3288[var35] = (short) (this.field3288[var35] * var37 + 16383 - (this.field3230[var35] * var36) >> 14);
                                    this.field3230[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class582.field8226[arg2];
                                    int var40 = class582.field8230[arg2];
                                    int var41 = this.field3288[var35] * var40 + 16383 - (this.field3212[var35] * var39) >> 14;
                                    this.field3212[var35] = (short) (this.field3288[var35] * var39 + (this.field3212[var35] * var40 + 16383) >> 14);
                                    this.field3288[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class582.field8226[arg3];
                                    int var43 = class582.field8230[arg3];
                                    int var44 = this.field3212[var35] * var42 + (this.field3230[var35] * var43) + 16383 >> 14;
                                    this.field3212[var35] = (short) (this.field3212[var35] * var43 + 16383 - (this.field3230[var35] * var42) >> 14);
                                    this.field3230[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method1444((byte) -109);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field3301.length) {
                    int[] var71 = this.field3301[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3319[var73] -= class741.field10394;
                        this.field3216[var73] -= class366.field5580;
                        this.field3311[var73] -= class100.field1480;
                        this.field3319[var73] = this.field3319[var73] * arg2 >> 7;
                        this.field3216[var73] = this.field3216[var73] * arg3 >> 7;
                        this.field3311[var73] = this.field3311[var73] * arg4 >> 7;
                        this.field3319[var73] += class741.field10394;
                        this.field3216[var73] += class366.field5580;
                        this.field3311[var73] += class100.field1480;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3283 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field3283.length) {
                        int[] var80 = this.field3283[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field3235[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field3235[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field3240 != null) {
                        for (int var76 = 0; var76 < this.field3232; var76++) {
                            class475 var77 = this.field3240[var76];
                            class182 var78 = this.field3284[var76];
                            var78.field3078 = 255 - (this.field3235[var77.field6890] & 0xFF) << 24 | var78.field3078 & 0xFFFFFF;
                        }
                    }
                    this.method1452(-15191);
                }
            }
        } else if (arg0 == 7) {
            if (this.field3283 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (this.field3283.length > var89) {
                        int[] var90 = this.field3283[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field3274[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = (var93 & 0x3D5) >> 7;
                            int var96 = arg2 + var94 & 0x3F;
                            int var97 = arg3 / 4 + var95;
                            int var98 = var93 & 0x7F;
                            int var99 = arg4 + var98;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 7) {
                                var97 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field3274[var92] = (short) class112.method903(class112.method903(var97 << 7, var96 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field3240 != null) {
                        for (int var86 = 0; var86 < this.field3232; var86++) {
                            class475 var87 = this.field3240[var86];
                            class182 var88 = this.field3284[var86];
                            var88.field3078 = class510.field7397[this.field3274[var87.field6890] & 0xFFFF] & 0xFFFFFF | var88.field3078 & 0xFF000000;
                        }
                    }
                    this.method1452(-15191);
                }
            }
        } else if (arg0 == 8) {
            if (this.field3276 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field3276.length) {
                        int[] var102 = this.field3276[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class182 var104 = this.field3284[var102[var103]];
                            var104.field3075 += arg2;
                            var104.field3074 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3276 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field3276.length) {
                        int[] var107 = this.field3276[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class182 var109 = this.field3284[var107[var108]];
                            var109.field3071 = var109.field3071 * arg3 >> 7;
                            var109.field3081 = var109.field3081 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3276 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field3276.length) {
                    int[] var112 = this.field3276[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class182 var114 = this.field3284[var112[var113]];
                        var114.field3073 = var114.field3073 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ltj;B)V", line = 1000)
    private final void method1441(class684 arg0, byte arg1) {
        if (class334.field4895.length < this.field3294) {
            class340.field4997 = new int[this.field3294];
            class334.field4895 = new int[this.field3294];
        }
        field3207++;
        if (arg1 >= -19) {
            this.field3308 = null;
        }
        for (int var3 = 0; var3 < this.field3322; var3++) {
            int var14 = (this.field3319[var3] - (this.field3216[var3] * this.field3206.field576 >> 8) >> this.field3206.field658) - arg0.field9673;
            int var15 = (this.field3311[var3] - (this.field3216[var3] * this.field3206.field670 >> 8) >> this.field3206.field658) - arg0.field9677;
            int var16 = this.field3293[var3];
            int var17 = this.field3293[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field3272[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class334.field4895[var19] = var14;
                class340.field4997[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field3237; var4++) {
            if (this.field3235 == null || this.field3235[var4] <= 128) {
                short var5 = this.field3313[var4];
                short var6 = this.field3201[var4];
                short var7 = this.field3290[var4];
                int var8 = class334.field4895[var5];
                int var9 = class334.field4895[var6];
                int var10 = class334.field4895[var7];
                int var11 = class340.field4997[var5];
                int var12 = class340.field4997[var6];
                int var13 = class340.field4997[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg0.method3818(var10, 73, var11, var13, var12, var9, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)V", line = 1086)
    private final void method1442(byte arg0) {
        if (this.field3240 != null) {
            this.field3206.method326(!this.field3227);
            this.field3206.method384(-117, false);
            this.field3206.method321(class327.field4819, 1, (byte) -95);
            this.field3206.method227(1, class327.field4819, 70);
            for (int var2 = 0; var2 < this.field3232; var2++) {
                class475 var3 = this.field3240[var2];
                class182 var4 = this.field3284[var2];
                if (!var3.field6893 || !this.field3206.method1237()) {
                    float var5 = (float) (this.field3319[var3.field6898] + this.field3319[var3.field6889] + this.field3319[var3.field6892]) * 0.3333333F;
                    float var6 = (float) (this.field3216[var3.field6892] + this.field3216[var3.field6889] + this.field3216[var3.field6898]) * 0.3333333F;
                    float var7 = (float) (this.field3311[var3.field6898] + this.field3311[var3.field6889] + this.field3311[var3.field6892]) * 0.3333333F;
                    float var8 = class391.field5839 * var7 + class497.field7209 * var5 + class378.field5685 * var6 + class140.field2190;
                    float var9 = class186.field3115 * var7 + class691.field9806 * var5 + class346.field5105 * var6 + class694.field9842;
                    float var10 = class149.field2322 * var7 + class272.field4177 * var6 + class140.field2177 * var5 + class501.field7273;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field6891;
                    class341 var12 = this.field3206.method431((byte) -114);
                    var12.method2189(var10 - (var10 * var11), var4.field3073, (float) var4.field3074 + var9 - (var9 * var11), var3.field6895 * var4.field3071 >> 7, (float) var4.field3075 + var8 - var8 * var11, arg0 + -196, var3.field6896 * var4.field3081 >> 7);
                    var12.method2193(this.field3206.field569, (byte) 112);
                    this.field3206.method309((byte) 125);
                    int var13 = var4.field3078;
                    this.field3206.method421(false, 15, var3.field6887, false);
                    this.field3206.method314(var3.field6897, (byte) 21);
                    this.field3206.method228(arg0 - 76, var13);
                    this.field3206.method233(false);
                }
            }
            this.field3206.method227(1, class493.field7145, 70);
            this.field3206.method321(class493.field7145, 1, (byte) -95);
            this.field3206.method326(true);
        }
        if (arg0 == 78) {
            field3221++;
        }
    }

    @OriginalMember(owner = "client!lu", name = "aa", descriptor = "(SS)V", line = 1151)
    public final void method1029(short arg0, short arg1) {
        field3211++;
        class267 var3 = this.field3206.field7764;
        for (int var4 = 0; var4 < this.field3234; var4++) {
            if (this.field3286[var4] == arg0) {
                this.field3286[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class569 var7 = var3.method1774(122, arg0 & 0xFFFF);
            var6 = var7.field8077;
            var5 = var7.field8069;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class569 var10 = var3.method1774(99, arg1 & 0xFFFF);
            if (var10.field8058 != 0 || var10.field8066 != 0) {
                this.field3255 = true;
            }
            var9 = var10.field8077;
            var8 = var10.field8069;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field3240 != null) {
            for (int var11 = 0; var11 < this.field3232; var11++) {
                class475 var12 = this.field3240[var11];
                class182 var13 = this.field3284[var11];
                var13.field3078 = var13.field3078 & 0xFF000000 | class510.field7397[this.field3274[var12.field6890] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method1452(-15191);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IFIIJLb;IFIBI)S", line = 1226)
    private final short method1443(int arg0, float arg1, int arg2, int arg3, long arg4, class352 arg5, int arg6, float arg7, int arg8, byte arg9, int arg10) {
        field3289++;
        int var13 = this.field3293[arg2];
        int var14 = this.field3293[arg2 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field3272[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class24.field241[var16] == arg4) {
                return (short) (var17 - 1);
            }
        }
        this.field3272[var15] = (short) (this.field3294 + 1);
        class24.field241[var15] = arg4;
        this.field3320[this.field3294] = (short) arg10;
        if (arg9 != 108) {
            this.field3308 = null;
        }
        this.field3314[this.field3294] = (short) arg2;
        this.field3230[this.field3294] = (short) arg8;
        this.field3288[this.field3294] = (short) arg0;
        this.field3212[this.field3294] = (short) arg3;
        this.field3298[this.field3294] = (byte) arg6;
        this.field3239[this.field3294] = arg7;
        this.field3306[this.field3294] = arg1;
        return (short) (this.field3294++);
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "()[Lou;", line = 1275)
    public final class157[] method1020() {
        field3296++;
        return this.field3256;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V", line = 1290)
    private final void method1444(byte arg0) {
        if ((this.field3236 & 0x37) == 0) {
            if (this.field3200 != null) {
                this.field3200.field3791 = false;
            }
        } else if (this.field3259 != null) {
            this.field3259.field3791 = false;
        }
        if (arg0 >= -84) {
            this.field3310 = 19;
        }
        field3214++;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILtc;ZII)Z", line = 1315)
    public final boolean method1023(int arg0, int arg1, class73 arg2, boolean arg3, int arg4, int arg5) {
        field3225++;
        return this.method1454(arg0, arg4, arg2, arg3, arg1, (byte) -119, arg5);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Llu;IZLlu;ZB)Lka;", line = 1323)
    private final class282 method1445(class191 arg0, int arg1, boolean arg2, class191 arg3, boolean arg4, byte arg5) {
        field3300++;
        arg0.field3236 = this.field3236;
        arg0.field3265 = arg1;
        arg0.field3299 = this.field3299;
        arg0.field3322 = this.field3322;
        arg0.field3294 = this.field3294;
        arg0.field3310 = this.field3310;
        arg0.field3234 = this.field3234;
        if ((arg1 & 0x100) == 0) {
            arg0.field3227 = this.field3227;
        } else {
            arg0.field3227 = true;
        }
        arg0.field3237 = this.field3237;
        arg0.field3232 = this.field3232;
        arg0.field3255 = this.field3255;
        arg0.field3213 = this.field3213;
        boolean var7 = class131.method1059(33, this.field3236, arg1);
        boolean var8 = class411.method2534(this.field3236, false, arg1);
        boolean var9 = class483.method2924(arg1, this.field3236, 1);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg0.field3319 = this.field3319;
            } else if (arg3.field3319 == null || arg3.field3319.length < this.field3310) {
                arg0.field3319 = arg3.field3319 = new int[this.field3310];
            } else {
                arg0.field3319 = arg3.field3319;
            }
            if (!var8) {
                arg0.field3216 = this.field3216;
            } else if (arg3.field3216 == null || arg3.field3216.length < this.field3310) {
                arg0.field3216 = arg3.field3216 = new int[this.field3310];
            } else {
                arg0.field3216 = arg3.field3216;
            }
            if (!var9) {
                arg0.field3311 = this.field3311;
            } else if (arg3.field3311 == null || arg3.field3311.length < this.field3310) {
                arg0.field3311 = arg3.field3311 = new int[this.field3310];
            } else {
                arg0.field3311 = arg3.field3311;
            }
            for (int var11 = 0; var11 < this.field3310; var11++) {
                if (var7) {
                    arg0.field3319[var11] = this.field3319[var11];
                }
                if (var8) {
                    arg0.field3216[var11] = this.field3216[var11];
                }
                if (var9) {
                    arg0.field3311[var11] = this.field3311[var11];
                }
            }
        } else {
            arg0.field3319 = this.field3319;
            arg0.field3216 = this.field3216;
            arg0.field3311 = this.field3311;
        }
        if (class312.method2057(arg1, this.field3236, -1)) {
            arg0.field3258 = arg3.field3258;
            arg0.field3258.field3791 = this.field3258.field3791;
            arg0.field3258.field3795 = this.field3258.field3795;
            arg0.field3258.field3797 = true;
        } else if (class527.method3131(false, arg1, this.field3236)) {
            arg0.field3258 = this.field3258;
        } else {
            arg0.field3258 = null;
        }
        if (class237.method1630((byte) -96, this.field3236, arg1)) {
            if (arg3.field3274 == null || arg3.field3274.length < this.field3234) {
                arg0.field3274 = arg3.field3274 = new short[this.field3234];
            } else {
                arg0.field3274 = arg3.field3274;
            }
            for (int var12 = 0; var12 < this.field3234; var12++) {
                arg0.field3274[var12] = this.field3274[var12];
            }
        } else {
            arg0.field3274 = this.field3274;
        }
        if (class721.method3976(arg1, (byte) 52, this.field3236)) {
            if (arg3.field3235 == null || arg3.field3235.length < this.field3234) {
                arg0.field3235 = arg3.field3235 = new byte[this.field3234];
            } else {
                arg0.field3235 = arg3.field3235;
            }
            for (int var13 = 0; var13 < this.field3234; var13++) {
                arg0.field3235[var13] = this.field3235[var13];
            }
        } else {
            arg0.field3235 = this.field3235;
        }
        if (class515.method3082(arg1, this.field3236, 78)) {
            arg0.field3200 = arg3.field3200;
            arg0.field3200.field3795 = this.field3200.field3795;
            arg0.field3200.field3791 = this.field3200.field3791;
            arg0.field3200.field3797 = true;
        } else if (class569.method3304(this.field3236, -1, arg1)) {
            arg0.field3200 = this.field3200;
        } else {
            arg0.field3200 = null;
        }
        if (class315.method2073(arg1, this.field3236, (byte) 120)) {
            if (arg3.field3230 == null || arg3.field3230.length < this.field3294) {
                int var14 = this.field3294;
                arg0.field3230 = arg3.field3230 = new short[var14];
                arg0.field3212 = arg3.field3212 = new short[var14];
                arg0.field3288 = arg3.field3288 = new short[var14];
            } else {
                arg0.field3288 = arg3.field3288;
                arg0.field3212 = arg3.field3212;
                arg0.field3230 = arg3.field3230;
            }
            if (this.field3297 == null) {
                arg0.field3297 = null;
                for (int var15 = 0; var15 < this.field3294; var15++) {
                    arg0.field3230[var15] = this.field3230[var15];
                    arg0.field3288[var15] = this.field3288[var15];
                    arg0.field3212[var15] = this.field3212[var15];
                }
            } else {
                if (arg3.field3297 == null) {
                    arg3.field3297 = new class364();
                }
                class364 var16 = arg0.field3297 = arg3.field3297;
                if (var16.field5567 == null || this.field3294 > var16.field5567.length) {
                    int var17 = this.field3294;
                    var16.field5564 = new short[var17];
                    var16.field5567 = new short[var17];
                    var16.field5569 = new byte[var17];
                    var16.field5563 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field3294; var18++) {
                    arg0.field3230[var18] = this.field3230[var18];
                    arg0.field3288[var18] = this.field3288[var18];
                    arg0.field3212[var18] = this.field3212[var18];
                    var16.field5567[var18] = this.field3297.field5567[var18];
                    var16.field5564[var18] = this.field3297.field5564[var18];
                    var16.field5563[var18] = this.field3297.field5563[var18];
                    var16.field5569[var18] = this.field3297.field5569[var18];
                }
            }
            arg0.field3298 = this.field3298;
        } else {
            arg0.field3288 = this.field3288;
            arg0.field3297 = this.field3297;
            arg0.field3230 = this.field3230;
            arg0.field3298 = this.field3298;
            arg0.field3212 = this.field3212;
        }
        if (class257.method1730(this.field3236, -126, arg1)) {
            arg0.field3259 = arg3.field3259;
            arg0.field3259.field3797 = true;
            arg0.field3259.field3791 = this.field3259.field3791;
            arg0.field3259.field3795 = this.field3259.field3795;
        } else if (class314.method2066(this.field3236, arg1, (byte) 40)) {
            arg0.field3259 = this.field3259;
        } else {
            arg0.field3259 = null;
        }
        if (class650.method3662(arg5 ^ 0x47, arg1, this.field3236)) {
            if (arg3.field3239 == null || arg3.field3239.length < this.field3234) {
                int var19 = this.field3294;
                arg0.field3306 = arg3.field3306 = new float[var19];
                arg0.field3239 = arg3.field3239 = new float[var19];
            } else {
                arg0.field3306 = arg3.field3306;
                arg0.field3239 = arg3.field3239;
            }
            for (int var20 = 0; var20 < this.field3294; var20++) {
                arg0.field3239[var20] = this.field3239[var20];
                arg0.field3306[var20] = this.field3306[var20];
            }
        } else {
            arg0.field3306 = this.field3306;
            arg0.field3239 = this.field3239;
        }
        if (class10.method43(arg1, 0, this.field3236)) {
            arg0.field3308 = arg3.field3308;
            arg0.field3308.field3795 = this.field3308.field3795;
            arg0.field3308.field3791 = this.field3308.field3791;
            arg0.field3308.field3797 = true;
        } else if (class390.method2433(this.field3236, arg5 + 1979, arg1)) {
            arg0.field3308 = this.field3308;
        } else {
            arg0.field3308 = null;
        }
        if (class505.method3055(arg1, this.field3236, (byte) -45)) {
            if (arg3.field3313 == null || this.field3234 > arg3.field3313.length) {
                int var21 = this.field3234;
                arg0.field3313 = arg3.field3313 = new short[var21];
                arg0.field3290 = arg3.field3290 = new short[var21];
                arg0.field3201 = arg3.field3201 = new short[var21];
            } else {
                arg0.field3313 = arg3.field3313;
                arg0.field3201 = arg3.field3201;
                arg0.field3290 = arg3.field3290;
            }
            for (int var22 = 0; var22 < this.field3234; var22++) {
                arg0.field3313[var22] = this.field3313[var22];
                arg0.field3201[var22] = this.field3201[var22];
                arg0.field3290[var22] = this.field3290[var22];
            }
        } else {
            arg0.field3313 = this.field3313;
            arg0.field3290 = this.field3290;
            arg0.field3201 = this.field3201;
        }
        if (class368.method2355(-11, arg1, this.field3236)) {
            arg0.field3209 = arg3.field3209;
            arg0.field3209.field4060 = this.field3209.field4060;
            arg0.field3209.field4055 = this.field3209.field4055;
            arg0.field3209.field4059 = true;
        } else if (class422.method2610(this.field3236, 0, arg1)) {
            arg0.field3209 = this.field3209;
        } else {
            arg0.field3209 = null;
        }
        if (class505.method3056(this.field3236, (byte) -127, arg1)) {
            if (arg3.field3286 == null || this.field3234 > arg3.field3286.length) {
                int var23 = this.field3234;
                arg0.field3286 = arg3.field3286 = new short[var23];
            } else {
                arg0.field3286 = arg3.field3286;
            }
            for (int var24 = 0; var24 < this.field3234; var24++) {
                arg0.field3286[var24] = this.field3286[var24];
            }
        } else {
            arg0.field3286 = this.field3286;
        }
        if (!class582.method3356(this.field3236, arg1, (byte) 126)) {
            arg0.field3284 = this.field3284;
        } else if (arg3.field3284 == null || arg3.field3284.length < this.field3232) {
            int var26 = this.field3232;
            arg0.field3284 = arg3.field3284 = new class182[var26];
            for (int var27 = 0; var27 < this.field3232; var27++) {
                arg0.field3284[var27] = this.field3284[var27].method1402(true);
            }
        } else {
            arg0.field3284 = arg3.field3284;
            for (int var25 = 0; var25 < this.field3232; var25++) {
                arg0.field3284[var25].method1403(arg5 ^ 0xFFFFC2E6, this.field3284[var25]);
            }
        }
        arg0.field3251 = this.field3251;
        if (this.field3226) {
            arg0.field3280 = this.field3280;
            arg0.field3267 = this.field3267;
            arg0.field3231 = this.field3231;
            arg0.field3226 = true;
            arg0.field3269 = this.field3269;
            arg0.field3199 = this.field3199;
            arg0.field3249 = this.field3249;
            arg0.field3210 = this.field3210;
            arg0.field3287 = this.field3287;
        } else {
            arg0.field3226 = false;
        }
        arg0.field3276 = this.field3276;
        arg0.field3283 = this.field3283;
        arg0.field3241 = this.field3241;
        arg0.field3320 = this.field3320;
        if (arg5 != 69) {
            this.field3210 = 7;
        }
        arg0.field3272 = this.field3272;
        arg0.field3243 = this.field3243;
        arg0.field3295 = this.field3295;
        arg0.field3314 = this.field3314;
        arg0.field3219 = this.field3219;
        arg0.field3293 = this.field3293;
        arg0.field3264 = this.field3264;
        arg0.field3240 = this.field3240;
        arg0.field3301 = this.field3301;
        arg0.field3256 = this.field3256;
        return arg0;
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(B)V", line = 1785)
    private final void method1446(byte arg0) {
        if (this.field3258 != null) {
            this.field3258.field3791 = false;
        }
        if (arg0 <= 72) {
            this.field3227 = true;
        }
        field3248++;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)V", line = 1799)
    public final void method997(int arg0, int arg1, int arg2, int arg3) {
        field3215++;
        for (int var5 = 0; var5 < this.field3234; var5++) {
            int var9 = this.field3274[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE82) >> 10;
            int var11 = (var9 & 0x3A6) >> 7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field3274[var5] = (short) class112.method903(class112.method903(var10 << 10, var11 << 7), var12);
        }
        if (this.field3240 != null) {
            for (int var6 = 0; var6 < this.field3232; var6++) {
                class475 var7 = this.field3240[var6];
                class182 var8 = this.field3284[var6];
                var8.field3078 = var8.field3078 & 0xFF000000 | class510.field7397[this.field3274[var7.field6890] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method1452(-15191);
    }

    @OriginalMember(owner = "client!lu", name = "VA", descriptor = "(I)V", line = 1859)
    public final void method1049(int arg0) {
        field3279++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field3322; var4++) {
            int var5 = this.field3216[var4] * var2 + (this.field3319[var4] * var3) >> 14;
            this.field3216[var4] = this.field3216[var4] * var3 - (this.field3319[var4] * var2) >> 14;
            this.field3319[var4] = var5;
        }
        this.method1446((byte) 121);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILtc;ZI)Z", line = 1886)
    public final boolean method1010(int arg0, int arg1, class73 arg2, boolean arg3, int arg4) {
        field3218++;
        return this.method1454(arg0, arg4, arg2, arg3, arg1, (byte) -121, -1);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lka;IIIZ)V", line = 1894)
    public final void method1031(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3305++;
        class191 var6 = (class191) arg0;
        if (this.field3234 == 0 || var6.field3234 == 0) {
            return;
        }
        int var7 = var6.field3322;
        int[] var8 = var6.field3319;
        int[] var9 = var6.field3216;
        int[] var10 = var6.field3311;
        short[] var11 = var6.field3230;
        short[] var12 = var6.field3288;
        short[] var13 = var6.field3212;
        byte[] var14 = var6.field3298;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3297 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var18 = this.field3297.field5564;
            var16 = this.field3297.field5567;
            var17 = this.field3297.field5563;
            var15 = this.field3297.field5569;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3297 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var22 = var6.field3297.field5567;
            var21 = var6.field3297.field5564;
            var19 = var6.field3297.field5569;
            var20 = var6.field3297.field5563;
        }
        int[] var23 = var6.field3293;
        short[] var24 = var6.field3272;
        if (!var6.field3226) {
            var6.method1439(0);
        }
        int var25 = var6.field3287;
        int var26 = var6.field3231;
        int var27 = var6.field3210;
        int var28 = var6.field3249;
        int var29 = var6.field3199;
        int var30 = var6.field3267;
        for (int var31 = 0; var31 < this.field3322; var31++) {
            int var32 = this.field3216[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field3319[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field3311[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field3293[var31];
                        int var37 = this.field3293[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3272[var38] - 1;
                            if (var35 == -1 || this.field3298[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var16 == null) {
                                            this.field3297 = new class364();
                                            var16 = this.field3297.field5567 = class314.method2067(true, this.field3230);
                                            var18 = this.field3297.field5564 = class314.method2067(true, this.field3288);
                                            var17 = this.field3297.field5563 = class314.method2067(true, this.field3212);
                                            var15 = this.field3297.field5569 = class290.method1895((byte) -120, this.field3298);
                                        }
                                        if (var22 == null) {
                                            class364 var44 = var6.field3297 = new class364();
                                            var22 = var44.field5567 = class314.method2067(true, var11);
                                            var21 = var44.field5564 = class314.method2067(true, var12);
                                            var20 = var44.field5563 = class314.method2067(true, var13);
                                            var19 = var44.field5569 = class290.method1895((byte) -120, var14);
                                        }
                                        short var45 = this.field3230[var35];
                                        short var46 = this.field3288[var35];
                                        short var47 = this.field3212[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field3298[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var22[var52] += var45;
                                                var21[var52] += var46;
                                                var20[var52] += var47;
                                                var19[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field3293[var31 + 1];
                                        byte var54 = var14[var42];
                                        short var55 = var12[var42];
                                        short var56 = var11[var42];
                                        int var57 = this.field3293[var31];
                                        short var58 = var13[var42];
                                        for (int var59 = var57; var59 < var53; var59++) {
                                            int var60 = this.field3272[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var16[var60] += var56;
                                                var18[var60] += var55;
                                                var17[var60] += var58;
                                                var15[var60] += var54;
                                            }
                                        }
                                        var6.method1444((byte) -113);
                                        this.method1444((byte) -107);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILsr;II)V", line = 2149)
    public static final void method1447(int arg0, int arg1, class540 arg2, int arg3, int arg4) {
        field3257++;
        if (arg0 != -1700668530) {
            field3229 = -22;
        }
        arg2.field7707.method1970((byte) 29, arg3);
        arg2.field7707.method1925(arg1, (byte) -16);
        arg2.field7707.method1939(arg4, 1134947720);
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lpj;IIZZ)V", line = 6087)
    public class191(class38 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field3227 = false;
        this.field3234 = 0;
        this.field3237 = 0;
        this.field3242 = true;
        this.field3250 = false;
        this.field3255 = false;
        this.field3294 = 0;
        this.field3226 = false;
        this.field3310 = 0;
        this.field3322 = 0;
        this.field3250 = arg4;
        this.field3236 = arg2;
        this.field3265 = arg1;
        this.field3206 = arg0;
        if (arg3 || class527.method3131(false, this.field3265, this.field3236)) {
            this.field3258 = new class236(class312.method2057(this.field3265, this.field3236, -1));
        }
        if (arg3 || class390.method2433(this.field3236, 2048, this.field3265)) {
            this.field3308 = new class236(class10.method43(this.field3265, 0, this.field3236));
        }
        if (arg3 || class569.method3304(this.field3236, -1, this.field3265)) {
            this.field3200 = new class236(class515.method3082(this.field3265, this.field3236, 79));
        }
        if (arg3 || class314.method2066(this.field3236, this.field3265, (byte) 52)) {
            this.field3259 = new class236(class257.method1730(this.field3236, -90, this.field3265));
        }
        if (arg3 || class422.method2610(this.field3236, 0, this.field3265)) {
            this.field3209 = new class260(class368.method2355(-11, this.field3265, this.field3236));
        }
    }

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "(I)V", line = 2181)
    public final void method1027(int arg0) {
        field3245++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field3322; var4++) {
            int var7 = this.field3311[var4] * var2 + (this.field3319[var4] * var3) >> 14;
            this.field3311[var4] = this.field3311[var4] * var3 - (this.field3319[var4] * var2) >> 14;
            this.field3319[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3294; var5++) {
            int var6 = this.field3212[var5] * var2 + (this.field3230[var5] * var3) >> 14;
            this.field3212[var5] = (short) (this.field3212[var5] * var3 - (this.field3230[var5] * var2) >> 14);
            this.field3230[var5] = (short) var6;
        }
        this.method1446((byte) 127);
        this.method1444((byte) -112);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "(I[IIIIZI[I)V", line = 2225)
    public final void method1009(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3244++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class741.field10394 = 0;
            class100.field1480 = 0;
            class366.field5580 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field3301.length) {
                    int[] var16 = this.field3301[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3295 == null || (arg6 & this.field3295[var18]) != 0) {
                            class741.field10394 += this.field3319[var18];
                            class366.field5580 += this.field3216[var18];
                            var13++;
                            class100.field1480 += this.field3311[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class741.field10394 = var12;
                class366.field5580 = var10;
                class100.field1480 = var11;
            } else {
                class741.field10394 = class741.field10394 / var13 + var12;
                class100.field1480 = class100.field1480 / var13 + var11;
                class366.field5580 = class366.field5580 / var13 + var10;
                class181.field3069 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field3301.length > var26) {
                    int[] var27 = this.field3301[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3295 == null || (this.field3295[var29] & arg6) != 0) {
                            this.field3319[var29] += var22;
                            this.field3216[var29] += var23;
                            this.field3311[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field3301.length) {
                        int[] var50 = this.field3301[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field3295 == null || (this.field3295[var52] & arg6) != 0) {
                                this.field3319[var52] -= class741.field10394;
                                this.field3216[var52] -= class366.field5580;
                                this.field3311[var52] -= class100.field1480;
                                if (arg4 != 0) {
                                    int var53 = class582.field8226[arg4];
                                    int var54 = class582.field8230[arg4];
                                    int var55 = this.field3216[var52] * var53 + this.field3319[var52] * var54 + 16383 >> 14;
                                    this.field3216[var52] = this.field3216[var52] * var54 + 16383 - (this.field3319[var52] * var53) >> 14;
                                    this.field3319[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class582.field8226[arg2];
                                    int var57 = class582.field8230[arg2];
                                    int var58 = this.field3216[var52] * var57 + 16383 - (this.field3311[var52] * var56) >> 14;
                                    this.field3311[var52] = this.field3311[var52] * var57 + this.field3216[var52] * var56 + 16383 >> 14;
                                    this.field3216[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class582.field8226[arg3];
                                    int var60 = class582.field8230[arg3];
                                    int var61 = this.field3311[var52] * var59 + (this.field3319[var52] * var60) + 16383 >> 14;
                                    this.field3311[var52] = this.field3311[var52] * var60 + 16383 - (this.field3319[var52] * var59) >> 14;
                                    this.field3319[var52] = var61;
                                }
                                this.field3319[var52] += class741.field10394;
                                this.field3216[var52] += class366.field5580;
                                this.field3311[var52] += class100.field1480;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field3301.length) {
                            int[] var33 = this.field3301[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field3295 == null || (arg6 & this.field3295[var35]) != 0) {
                                    int var36 = this.field3293[var35];
                                    int var37 = this.field3293[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field3272[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class582.field8226[arg4];
                                            int var41 = class582.field8230[arg4];
                                            int var42 = this.field3230[var39] * var41 + this.field3288[var39] * var40 + 16383 >> 14;
                                            this.field3288[var39] = (short) (this.field3288[var39] * var41 + 16383 - (this.field3230[var39] * var40) >> 14);
                                            this.field3230[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class582.field8226[arg2];
                                            int var44 = class582.field8230[arg2];
                                            int var45 = this.field3288[var39] * var44 + 16383 - (this.field3212[var39] * var43) >> 14;
                                            this.field3212[var39] = (short) (this.field3288[var39] * var43 + this.field3212[var39] * var44 + 16383 >> 14);
                                            this.field3288[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class582.field8226[arg3];
                                            int var47 = class582.field8230[arg3];
                                            int var48 = this.field3212[var39] * var46 - (-(this.field3230[var39] * var47) - 16383) >> 14;
                                            this.field3212[var39] = (short) (this.field3212[var39] * var47 + 16383 - (this.field3230[var39] * var46) >> 14);
                                            this.field3230[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method1444((byte) -108);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class181.field3069) {
                    int var68 = arg7[3] * class366.field5580 + arg7[0] * class741.field10394 + arg7[6] * class100.field1480 + 8192 >> 14;
                    int var69 = arg7[4] * class366.field5580 + (arg7[1] * class741.field10394 + arg7[7] * class100.field1480 + 8192) >> 14;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[8] * class100.field1480 + arg7[2] * class741.field10394 + arg7[5] * class366.field5580 + 8192 >> 14;
                    class741.field10394 = var71;
                    class366.field5580 = var70;
                    int var73 = var67 + var72;
                    class181.field3069 = false;
                    class100.field1480 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class582.field8230[arg2];
                int var76 = class582.field8226[arg2];
                int var77 = class582.field8230[arg3];
                int var78 = class582.field8226[arg3];
                int var79 = class582.field8230[arg4];
                int var80 = class582.field8226[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 - (-(var78 * var81) - 8192) >> 14;
                var74[5] = -var76;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[7] = var78 * var80 + (var77 * var81) + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                int var83 = var74[2] * -class100.field1480 + var74[0] * -class741.field10394 + var74[1] * -class366.field5580 + 8192 >> 14;
                int var84 = var74[4] * -class366.field5580 + var74[3] * -class741.field10394 + var74[5] * -class100.field1480 + 8192 >> 14;
                int var85 = var74[7] * -class366.field5580 + (var74[6] * -class741.field10394 + (var74[8] * -class100.field1480)) + 8192 >> 14;
                int var86 = var83 + class741.field10394;
                int var87 = class366.field5580 + var84;
                int var88 = class100.field1480 + var85;
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
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 8192 >> 14;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 8192 >> 14;
                int var93 = var74[6] * var65 + (var74[8] * var67) + var74[7] * var66 + 8192 >> 14;
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
                int var99 = arg7[0] * var95 + arg7[1] * var94 - (-(arg7[2] * var96) + -8192) >> 14;
                int var100 = arg7[3] * var95 + arg7[5] * var96 + arg7[4] * var94 + 8192 >> 14;
                int var101 = arg7[8] * var96 + (arg7[6] * var95 + (arg7[7] * var94)) + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field3301.length > var106) {
                        int[] var107 = this.field3301[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field3295 == null || (this.field3295[var109] & arg6) != 0) {
                                int var110 = this.field3216[var109] * var97[1] + this.field3319[var109] * var97[0] + this.field3311[var109] * var97[2] + 8192 >> 14;
                                int var111 = this.field3319[var109] * var97[3] + this.field3216[var109] * var97[4] + this.field3311[var109] * var97[5] + 8192 >> 14;
                                int var112 = var102 + var111;
                                int var113 = var103 + var110;
                                int var114 = this.field3319[var109] * var97[6] + 8192 - (-(this.field3311[var109] * var97[8]) - (this.field3216[var109] * var97[7])) >> 14;
                                this.field3319[var109] = var113;
                                int var115 = var104 + var114;
                                this.field3216[var109] = var112;
                                this.field3311[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field3301.length) {
                        int[] var124 = this.field3301[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field3295 == null || (arg6 & this.field3295[var126]) != 0) {
                                this.field3319[var126] -= class741.field10394;
                                this.field3216[var126] -= class366.field5580;
                                this.field3311[var126] -= class100.field1480;
                                this.field3319[var126] = this.field3319[var126] * arg2 >> 7;
                                this.field3216[var126] = this.field3216[var126] * arg3 >> 7;
                                this.field3311[var126] = this.field3311[var126] * arg4 >> 7;
                                this.field3319[var126] += class741.field10394;
                                this.field3216[var126] += class366.field5580;
                                this.field3311[var126] += class100.field1480;
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
                if (class181.field3069) {
                    int var133 = arg7[0] * class741.field10394 + (arg7[6] * class100.field1480) + arg7[3] * class366.field5580 + 8192 >> 14;
                    int var134 = arg7[7] * class100.field1480 + arg7[1] * class741.field10394 + (arg7[4] * class366.field5580) + 8192 >> 14;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class100.field1480 + arg7[5] * class366.field5580 + arg7[2] * class741.field10394 + 8192 >> 14;
                    int var137 = var130 + var133;
                    class741.field10394 = var137;
                    class366.field5580 = var135;
                    int var138 = var132 + var136;
                    class181.field3069 = false;
                    class100.field1480 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class741.field10394 * var139 + 8192 >> 14;
                int var143 = -class366.field5580 * var140 + 8192 >> 14;
                int var144 = -class100.field1480 * var141 + 8192 >> 14;
                int var145 = class741.field10394 + var142;
                int var146 = class366.field5580 + var143;
                int var147 = class100.field1480 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var146 + var150;
                int var152 = var145 + var149;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var174 + (var176 * 3)];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[1] * var151 + arg7[0] * var152 + (arg7[2] * var154) + 8192 >> 14;
                int var158 = arg7[3] * var152 + arg7[5] * var154 + arg7[4] * var151 + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = var127 + var157;
                int var161 = arg7[7] * var151 + arg7[6] * var152 + (arg7[8] * var154) + 8192 >> 14;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field3301.length > var164) {
                        int[] var165 = this.field3301[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field3295 == null || (this.field3295[var167] & arg6) != 0) {
                                int var168 = this.field3319[var167] * var155[0] + this.field3311[var167] * var155[2] + this.field3216[var167] * var155[1] + 8192 >> 14;
                                int var169 = this.field3216[var167] * var155[4] + (this.field3311[var167] * var155[5]) + this.field3319[var167] * var155[3] + 8192 >> 14;
                                int var170 = this.field3311[var167] * var155[8] + (this.field3319[var167] * var155[6] + (this.field3216[var167] * var155[7])) + 8192 >> 14;
                                int var171 = var160 + var168;
                                int var172 = var159 + var169;
                                this.field3319[var167] = var171;
                                int var173 = var162 + var170;
                                this.field3216[var167] = var172;
                                this.field3311[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3283 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field3283.length > var182) {
                        int[] var183 = this.field3283[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field3243 == null || (arg6 & this.field3243[var185]) != 0) {
                                int var186 = (this.field3235[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field3235[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field3240 != null) {
                        for (int var179 = 0; var179 < this.field3232; var179++) {
                            class475 var180 = this.field3240[var179];
                            class182 var181 = this.field3284[var179];
                            var181.field3078 = 255 - (this.field3235[var180.field6890] & 0xFF) << 24 | var181.field3078 & 0xFFFFFF;
                        }
                    }
                    this.method1452(-15191);
                }
            }
        } else if (arg0 == 7) {
            if (this.field3283 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (var192 < this.field3283.length) {
                        int[] var193 = this.field3283[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field3243 == null || (arg6 & this.field3243[var195]) != 0) {
                                int var196 = this.field3274[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFF20) >> 10;
                                int var198 = (var196 & 0x3BB) >> 7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = arg2 + var197 & 0x3F;
                                int var202 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field3274[var195] = (short) class112.method903(var202, class112.method903(var201 << 10, var200 << 7));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field3240 != null) {
                        for (int var189 = 0; var189 < this.field3232; var189++) {
                            class475 var190 = this.field3240[var189];
                            class182 var191 = this.field3284[var189];
                            var191.field3078 = class510.field7397[this.field3274[var190.field6890] & 0xFFFF] & 0xFFFFFF | var191.field3078 & 0xFF000000;
                        }
                    }
                    this.method1452(-15191);
                }
            }
        } else if (arg0 == 8) {
            if (this.field3276 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field3276.length) {
                        int[] var205 = this.field3276[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class182 var207 = this.field3284[var205[var206]];
                            var207.field3074 += arg3;
                            var207.field3075 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3276 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field3276.length > var209) {
                        int[] var210 = this.field3276[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class182 var212 = this.field3284[var210[var211]];
                            var212.field3071 = var212.field3071 * arg3 >> 7;
                            var212.field3081 = var212.field3081 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3276 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field3276.length > var214) {
                    int[] var215 = this.field3276[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class182 var217 = this.field3284[var215[var216]];
                        var217.field3073 = var217.field3073 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "FA", descriptor = "(I)V", line = 3218)
    public final void method1042(int arg0) {
        field3292++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field3322; var4++) {
            int var5 = this.field3216[var4] * var3 - this.field3311[var4] * var2 >> 14;
            this.field3311[var4] = this.field3311[var4] * var3 + this.field3216[var4] * var2 >> 14;
            this.field3216[var4] = var5;
        }
        this.method1446((byte) 97);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "()Z", line = 3249)
    public final boolean method1054() {
        field3273++;
        return this.field3255;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ltc;)V", line = 3257)
    public final void method1028(class73 arg0) {
        field3285++;
        class341 var2 = (class341) arg0;
        if (this.field3256 != null) {
            for (int var3 = 0; var3 < this.field3256.length; var3++) {
                class157 var4 = this.field3256[var3];
                class157 var5 = var4;
                if (var4.field2428 != null) {
                    var5 = var4.field2428;
                }
                var5.field2438 = (int) ((float) this.field3311[var4.field2444] * var2.field5015 + (float) this.field3319[var4.field2444] * var2.field5023 + (float) this.field3216[var4.field2444] * var2.field5045 + var2.field5009);
                var5.field2431 = (int) ((float) this.field3311[var4.field2444] * var2.field5027 + (float) this.field3319[var4.field2444] * var2.field5024 + (float) this.field3216[var4.field2444] * var2.field5036 + var2.field5001);
                var5.field2445 = (int) ((float) this.field3311[var4.field2444] * var2.field5037 + (float) this.field3319[var4.field2444] * var2.field5032 + (float) this.field3216[var4.field2444] * var2.field5029 + var2.field5048);
                var5.field2443 = (int) ((float) this.field3311[var4.field2432] * var2.field5015 + (float) this.field3319[var4.field2432] * var2.field5023 + (float) this.field3216[var4.field2432] * var2.field5045 + var2.field5009);
                var5.field2435 = (int) ((float) this.field3311[var4.field2432] * var2.field5027 + (float) this.field3319[var4.field2432] * var2.field5024 + (float) this.field3216[var4.field2432] * var2.field5036 + var2.field5001);
                var5.field2427 = (int) ((float) this.field3311[var4.field2432] * var2.field5037 + (float) this.field3319[var4.field2432] * var2.field5032 + (float) this.field3216[var4.field2432] * var2.field5029 + var2.field5048);
                var5.field2439 = (int) ((float) this.field3311[var4.field2429] * var2.field5015 + (float) this.field3319[var4.field2429] * var2.field5023 + (float) this.field3216[var4.field2429] * var2.field5045 + var2.field5009);
                var5.field2430 = (int) ((float) this.field3311[var4.field2429] * var2.field5027 + (float) this.field3319[var4.field2429] * var2.field5024 + (float) this.field3216[var4.field2429] * var2.field5036 + var2.field5001);
                var5.field2436 = (int) ((float) this.field3311[var4.field2429] * var2.field5037 + (float) this.field3319[var4.field2429] * var2.field5032 + (float) this.field3216[var4.field2429] * var2.field5029 + var2.field5048);
            }
        }
        if (this.field3251 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3251.length; var6++) {
            class158 var7 = this.field3251[var6];
            class158 var8 = var7;
            if (var7.field2450 != null) {
                var8 = var7.field2450;
            }
            if (var7.field2449 == null) {
                var7.field2449 = var2.method663();
            } else {
                var7.field2449.method673(var2);
            }
            var8.field2455 = (int) ((float) this.field3311[var7.field2451] * var2.field5015 + (float) this.field3319[var7.field2451] * var2.field5023 + (float) this.field3216[var7.field2451] * var2.field5045 + var2.field5009);
            var8.field2448 = (int) ((float) this.field3311[var7.field2451] * var2.field5027 + (float) this.field3319[var7.field2451] * var2.field5024 + (float) this.field3216[var7.field2451] * var2.field5036 + var2.field5001);
            var8.field2454 = (int) ((float) this.field3311[var7.field2451] * var2.field5037 + (float) this.field3319[var7.field2451] * var2.field5032 + (float) this.field3216[var7.field2451] * var2.field5029 + var2.field5048);
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Z", line = 3322)
    private final boolean method1448(int arg0) {
        field3304++;
        boolean var2 = !this.field3200.field3791;
        boolean var3 = (this.field3236 & 0x37) != 0 && !this.field3259.field3791;
        boolean var4 = !this.field3258.field3791;
        boolean var5 = !this.field3308.field3791;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field3258.field3792 == null) {
                this.field3258.field3792 = this.field3206.method293(this.field3250, 6);
            }
            class669 var7 = this.field3258.field3792;
            var7.method693(true, this.field3294 * 12, 12);
            Buffer var8 = var7.method692(true, -31414);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field3206.field472.copyPositions(this.field3319, this.field3216, this.field3311, this.field3314, 0, 12, this.field3294, var8.getAddress());
                if (var7.method696(-11404)) {
                    this.field3258.field3791 = true;
                    this.field3258.field3795 = var7;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field3200.field3792 == null) {
                this.field3200.field3792 = this.field3206.method293(this.field3250, 6);
            }
            class669 var9 = this.field3200.field3792;
            var9.method693(true, this.field3294 * 4, 4);
            Buffer var10 = var9.method692(true, -31414);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field3236 & 0x37) == 0) {
                    short[] var11;
                    byte[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field3297 == null) {
                        var11 = this.field3212;
                        var12 = this.field3298;
                        var13 = this.field3288;
                        var14 = this.field3230;
                    } else {
                        var13 = this.field3297.field5564;
                        var12 = this.field3297.field5569;
                        var14 = this.field3297.field5567;
                        var11 = this.field3297.field5563;
                    }
                    this.field3206.field472.copyLighting(this.field3274, this.field3235, this.field3286, var14, var13, var11, var12, this.field3213, this.field3299, this.field3320, 0, 4, this.field3294, var10.getAddress());
                } else {
                    this.field3206.field472.copyColours(this.field3274, this.field3235, this.field3286, this.field3213, this.field3320, 0, 4, this.field3294, var10.getAddress());
                }
                if (var9.method696(-11404)) {
                    this.field3200.field3791 = true;
                    this.field3200.field3795 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field3259.field3792 == null) {
                this.field3259.field3792 = this.field3206.method293(this.field3250, 6);
            }
            class669 var15 = this.field3259.field3792;
            var15.method693(true, this.field3294 * 12, 12);
            Buffer var16 = var15.method692(true, -31414);
            if (var16 == null) {
                var6 = false;
            } else {
                byte[] var17;
                short[] var18;
                short[] var19;
                short[] var20;
                if (this.field3297 == null) {
                    var19 = this.field3212;
                    var17 = this.field3298;
                    var18 = this.field3288;
                    var20 = this.field3230;
                } else {
                    var17 = this.field3297.field5569;
                    var18 = this.field3297.field5564;
                    var19 = this.field3297.field5563;
                    var20 = this.field3297.field5567;
                }
                this.field3206.field472.copyNormals(var20, var18, var19, var17, 3.0F / (float) this.field3299, 3.0F / (float) (this.field3299 / 2 + this.field3299), 0, 12, this.field3294, var16.getAddress());
                if (var15.method696(-11404)) {
                    this.field3259.field3795 = var15;
                    this.field3259.field3791 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field3308.field3792 == null) {
                this.field3308.field3792 = this.field3206.method293(this.field3250, 6);
            }
            class669 var21 = this.field3308.field3792;
            var21.method693(true, this.field3294 * 8, 8);
            Buffer var22 = var21.method692(true, -31414);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field3206.field472.copyTexCoords(this.field3239, this.field3306, 0, 8, this.field3294, var22.getAddress());
                if (var21.method696(-11404)) {
                    this.field3308.field3791 = true;
                    this.field3308.field3795 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        if (arg0 <= 45) {
            this.field3293 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "()Z", line = 3514)
    public final boolean method1051() {
        field3205++;
        if (this.field3286 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3286.length; var1++) {
            if (this.field3286[var1] != -1 && !this.field3206.field7764.method1772(-5919, this.field3286[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(B)V", line = 3538)
    private final void method1449(byte arg0) {
        if (this.field3209 != null) {
            this.field3209.field4055 = false;
        }
        if (arg0 == -104) {
            field3282++;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIZIII)Z", line = 3552)
    private final boolean method1450(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field3270++;
        if (!arg5) {
            return false;
        } else if (arg8 > arg0 && arg0 < arg2 && arg4 > arg0) {
            return false;
        } else if (arg0 > arg8 && arg0 > arg2 && arg4 < arg0) {
            return false;
        } else if (arg3 > arg7 && arg7 < arg6 && arg1 > arg7) {
            return false;
        } else {
            return arg3 >= arg7 || arg6 >= arg7 || arg1 >= arg7;
        }
    }

    @OriginalMember(owner = "client!lu", name = "na", descriptor = "()I", line = 3578)
    public final int method999() {
        field3303++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3269;
    }

    @OriginalMember(owner = "client!lu", name = "ua", descriptor = "()I", line = 3594)
    public final int method1044() {
        field3197++;
        return this.field3265;
    }

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "(B)V", line = 3606)
    private final void method1451(byte arg0) {
        field3253++;
        if (this.field3237 == 0) {
            return;
        }
        if (this.method1448(88) && this.method1438(true)) {
            this.field3206.method327(this.field3258.field3795, 0, 0);
            this.field3206.method327(this.field3200.field3795, 0, 1);
            this.field3206.method327(this.field3308.field3795, 0, 2);
            boolean var2;
            if ((this.field3236 & 0x37) == 0) {
                var2 = false;
                this.field3206.method384(-95, false);
                this.field3206.method330(19661, this.field3206.field682);
            } else {
                this.field3206.method384(-116, true);
                var2 = true;
                this.field3206.method327(this.field3259.field3795, 0, 3);
                this.field3206.method330(19661, this.field3206.field677);
            }
            for (int var3 = 0; var3 < this.field3219.length; var3++) {
                int var4 = this.field3264[var3];
                int var5 = this.field3264[var3 + 1];
                int var6 = this.field3286[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field3206.method421(true, 15, var6, var2);
                this.field3206.method289(var5 - var4, this.field3241[var3], this.field3219[var3], this.field3209.field4060, var4 * 3, class386.field5775, 0);
            }
        }
        int var7 = 29 % ((40 - arg0) / 35);
        this.method1455(-27767);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ltc;IZ)V", line = 3666)
    public final void method1032(class73 arg0, int arg1, boolean arg2) {
        field3315++;
        if (this.field3295 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field3322; var5++) {
            if ((this.field3295[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method662(this.field3319[var5], this.field3216[var5], this.field3311[var5], var4);
                } else {
                    arg0.method665(this.field3319[var5], this.field3216[var5], this.field3311[var5], var4);
                }
                this.field3319[var5] = var4[0];
                this.field3216[var5] = var4[1];
                this.field3311[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "da", descriptor = "()I", line = 3699)
    public final int method1056() {
        field3261++;
        return this.field3299;
    }

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "()I", line = 3708)
    public final int method1008() {
        field3217++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3210;
    }

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "()V", line = 3726)
    public final void method1016() {
        for (int var1 = 0; var1 < this.field3322; var1++) {
            this.field3311[var1] = -this.field3311[var1];
        }
        field3323++;
        for (int var2 = 0; var2 < this.field3294; var2++) {
            this.field3212[var2] = (short) (-this.field3212[var2]);
        }
        for (int var3 = 0; var3 < this.field3234; var3++) {
            short var4 = this.field3313[var3];
            this.field3313[var3] = this.field3290[var3];
            this.field3290[var3] = var4;
        }
        this.method1446((byte) 120);
        this.method1444((byte) -109);
        this.method1449((byte) -104);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ltc;Lqw;II)V", line = 3768)
    public final void method1026(class73 arg0, class385 arg1, int arg2, int arg3) {
        field3222++;
        if (this.field3294 == 0) {
            return;
        }
        class341 var5 = this.field3206.field568;
        class341 var6 = (class341) arg0;
        if (!this.field3226) {
            this.method1439(0);
        }
        class501.field7273 = var5.field5037 * var6.field5048 + var5.field5032 * var6.field5009 + var5.field5029 * var6.field5001 + var5.field5048;
        class272.field4177 = var5.field5037 * var6.field5029 + var5.field5032 * var6.field5045 + var5.field5029 * var6.field5036;
        float var7 = (float) this.field3287 * class272.field4177 + class501.field7273;
        float var8 = (float) this.field3231 * class272.field4177 + class501.field7273;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field3269 + var7;
            var10 = var8 - (float) this.field3269;
        } else {
            var10 = (float) (-this.field3269) + var7;
            var9 = (float) this.field3269 + var8;
        }
        if ((this.field3206.field612 <= var10) || ((float) this.field3206.field634 >= var9)) {
            return;
        }
        class140.field2190 = var5.field5015 * var6.field5048 + var5.field5045 * var6.field5001 + var5.field5023 * var6.field5009 + var5.field5009;
        class378.field5685 = var5.field5015 * var6.field5029 + var5.field5045 * var6.field5036 + var5.field5023 * var6.field5045;
        float var11 = (float) this.field3287 * class378.field5685 + class140.field2190;
        float var12 = (float) this.field3231 * class378.field5685 + class140.field2190;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = ((float) this.field3269 + var11) * (float) this.field3206.field648;
            var14 = ((float) (-this.field3269) + var12) * (float) this.field3206.field648;
        } else {
            var14 = (var11 - (float) this.field3269) * (float) this.field3206.field648;
            var13 = ((float) this.field3269 + var12) * (float) this.field3206.field648;
        }
        if ((var14 / (float) arg2 >= this.field3206.field666) || (var13 / (float) arg2 <= this.field3206.field603)) {
            return;
        }
        class694.field9842 = var5.field5027 * var6.field5048 + var5.field5036 * var6.field5001 + var5.field5024 * var6.field5009 + var5.field5001;
        class346.field5105 = var5.field5027 * var6.field5029 + var5.field5036 * var6.field5036 + var5.field5024 * var6.field5045;
        float var15 = (float) this.field3287 * class346.field5105 + class694.field9842;
        float var16 = (float) this.field3231 * class346.field5105 + class694.field9842;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = (var16 - (float) this.field3269) * (float) this.field3206.field659;
            var18 = ((float) this.field3269 + var15) * (float) this.field3206.field659;
        } else {
            var17 = (var15 - (float) this.field3269) * (float) this.field3206.field659;
            var18 = ((float) this.field3269 + var16) * (float) this.field3206.field659;
        }
        if ((var17 / (float) arg2 >= this.field3206.field589) || (var18 / (float) arg2 <= this.field3206.field587)) {
            return;
        }
        if (arg1 != null || this.field3240 != null) {
            class186.field3115 = var5.field5027 * var6.field5037 + var5.field5036 * var6.field5027 + var5.field5024 * var6.field5015;
            class497.field7209 = var5.field5015 * var6.field5032 + var5.field5045 * var6.field5024 + var5.field5023 * var6.field5023;
            class140.field2177 = var5.field5037 * var6.field5032 + var5.field5032 * var6.field5023 + var5.field5029 * var6.field5024;
            class391.field5839 = var5.field5015 * var6.field5037 + var5.field5045 * var6.field5027 + var5.field5023 * var6.field5015;
            class149.field2322 = var5.field5037 * var6.field5037 + var5.field5032 * var6.field5015 + var5.field5029 * var6.field5027;
            class691.field9806 = var5.field5027 * var6.field5032 + var5.field5036 * var6.field5024 + var5.field5024 * var6.field5023;
        }
        if (arg1 != null) {
            int var19 = this.field3249 + this.field3210 >> 1;
            int var20 = this.field3199 + this.field3267 >> 1;
            int var21 = (int) ((float) var20 * class391.field5839 + (float) this.field3287 * class378.field5685 + (float) var19 * class497.field7209 + class140.field2190);
            int var22 = (int) ((float) var20 * class186.field3115 + (float) this.field3287 * class346.field5105 + (float) var19 * class691.field9806 + class694.field9842);
            int var23 = (int) ((float) var20 * class149.field2322 + (float) this.field3287 * class272.field4177 + (float) var19 * class140.field2177 + class501.field7273);
            int var24 = (int) ((float) var20 * class391.field5839 + (float) this.field3231 * class378.field5685 + (float) var19 * class497.field7209 + class140.field2190);
            int var25 = (int) ((float) var20 * class186.field3115 + (float) this.field3231 * class346.field5105 + (float) var19 * class691.field9806 + class694.field9842);
            arg1.field5766 = this.field3206.field659 * var22 / arg2 + this.field3206.field647;
            arg1.field5764 = this.field3206.field575 + (this.field3206.field648 * var21 / arg2);
            int var26 = (int) ((float) var20 * class149.field2322 + (float) this.field3231 * class272.field4177 + (float) var19 * class140.field2177 + class501.field7273);
            arg1.field5765 = this.field3206.field647 + (this.field3206.field659 * var25 / arg2);
            arg1.field5767 = this.field3206.field575 + (this.field3206.field648 * var24 / arg2);
            if (this.field3206.field634 <= var23 || this.field3206.field634 <= var26) {
                arg1.field5768 = true;
                arg1.field5769 = (this.field3269 + var21) * this.field3206.field648 / arg2 + this.field3206.field575 - arg1.field5764;
            }
        }
        this.field3206.method386((float) arg2, (byte) 74);
        this.field3206.method302(Integer.MAX_VALUE);
        this.field3206.method303(var6, (byte) 117);
        this.method1451((byte) -28);
        this.method1442((byte) 78);
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "()V", line = 3915)
    public final void method1002() {
        field3312++;
        if (this.field3294 > 0 && this.field3237 > 0) {
            this.method1448(56);
            this.method1438(true);
            this.method1455(-27767);
        }
    }

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "(IILs;Ls;III)V", line = 3928)
    public final void method1030(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6) {
        field3260++;
        if (!this.field3226) {
            this.method1439(0);
        }
        int var8 = arg4 + this.field3210;
        int var9 = this.field3249 + arg4;
        int var10 = this.field3199 + arg6;
        int var11 = arg6 + this.field3267;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4958 + var9 >> arg2.field4962 >= arg2.field4956 || var10 < 0 || arg2.field4960 <= arg2.field4958 + var11 >> arg2.field4962) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4958 + var9 >> arg3.field4962 >= arg3.field4956 || var10 < 0 || (var11 + arg3.field4958 >> arg3.field4962) >= arg3.field4960) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4962;
            int var13 = -(-arg2.field4958 - var9) - 1 >> arg2.field4962;
            int var14 = var10 >> arg2.field4962;
            int var15 = var11 + arg2.field4958 - 1 >> arg2.field4962;
            if (arg5 == arg2.method2160(-124, var14, var12) && arg5 == arg2.method2160(-80, var14, var13) && arg5 == arg2.method2160(-122, var15, var12) && arg5 == arg2.method2160(-107, var15, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field3322; var32++) {
                this.field3216[var32] = this.field3216[var32] + arg2.method2162(this.field3311[var32] + arg6, 1, this.field3319[var32] + arg4) - arg5;
            }
        } else if (arg0 == 2) {
            int var29 = this.field3287;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field3322; var30++) {
                int var31 = (this.field3216[var30] << 16) / var29;
                if (var31 < arg1) {
                    this.field3216[var30] -= -((arg2.method2162(this.field3311[var30] + arg6, 1, this.field3319[var30] + arg4) - arg5) * (arg1 - var31) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var16 = (arg1 & 0xFF) * 4;
            int var17 = (arg1 >> 8 & 0xFF) * 4;
            int var18 = arg1 >> 16 & 0xFF << 6;
            int var19 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var16 >> 1)) < 0 || arg2.field4956 << arg2.field4962 <= (var16 >> 1) + arg2.field4958 + arg4 || (arg6 - (var17 >> 1)) < 0 || (arg2.field4960 << arg2.field4962) <= ((var17 >> 1) + (arg6 + arg2.field4958))) {
                return;
            }
            this.method1855(arg2, arg5, (byte) -116, var17, var18, arg4, var16, arg6, var19);
        } else if (arg0 == 4) {
            int var20 = this.field3231 - this.field3287;
            for (int var21 = 0; var21 < this.field3322; var21++) {
                this.field3216[var21] -= arg5 - arg3.method2162(this.field3311[var21] + arg6, 1, this.field3319[var21] + arg4) - var20;
            }
        } else if (arg0 == 5) {
            int var22 = this.field3231 - this.field3287;
            for (int var23 = 0; var23 < this.field3322; var23++) {
                int var24 = this.field3319[var23] + arg4;
                int var25 = this.field3311[var23] + arg6;
                int var26 = arg2.method2162(var25, 1, var24);
                int var27 = arg3.method2162(var25, 1, var24);
                int var28 = var26 - var27 - arg1;
                this.field3216[var23] = ((this.field3216[var23] << 8) / var22 * var28 >> 8) + var26 - arg5;
            }
        }
        this.method1446((byte) 84);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "()V", line = 4079)
    public final void method1000() {
        field3281++;
    }

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "()I", line = 4090)
    public final int method1003() {
        field3275++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3267;
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V", line = 4108)
    private final void method1452(int arg0) {
        field3302++;
        if (arg0 != -15191) {
            this.field3306 = null;
        }
        if (this.field3200 != null) {
            this.field3200.field3791 = false;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 4123)
    public final void method1019(int arg0) {
        field3220++;
        int var2 = class582.field8226[arg0];
        int var3 = class582.field8230[arg0];
        for (int var4 = 0; var4 < this.field3322; var4++) {
            int var5 = this.field3319[var4] * var3 + this.field3311[var4] * var2 >> 14;
            this.field3311[var4] = this.field3311[var4] * var3 - (this.field3319[var4] * var2) >> 14;
            this.field3319[var4] = var5;
        }
        this.method1446((byte) 93);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lpj;Lb;IIII)V", line = 4150)
    public class191(class38 arg0, class352 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class267 var7 = arg0.field7764;
        int[] var8 = new int[arg1.field5186];
        this.field3293 = new int[arg1.field5145 + 1];
        for (int var9 = 0; var9 < arg1.field5186; var9++) {
            if (arg1.field5167 == null || arg1.field5167[var9] != 2) {
                if (arg1.field5168 != null && arg1.field5168[var9] != -1) {
                    class569 var178 = var7.method1774(96, arg1.field5168[var9] & 0xFFFF);
                    if (((this.field3236 & 0x40) == 0 || !var178.field8062) && var178.field8068) {
                        continue;
                    }
                }
                var8[this.field3234++] = var9;
                this.field3293[arg1.field5150[var9]]++;
                this.field3293[arg1.field5177[var9]]++;
                this.field3293[arg1.field5183[var9]]++;
            }
        }
        this.field3237 = this.field3234;
        long[] var10 = new long[this.field3234];
        boolean var11 = (this.field3265 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field3234; var12++) {
            int var161 = var8[var12];
            class569 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field5189 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field5189.length; var168++) {
                    class562 var169 = arg1.field5189[var168];
                    if (var169.field7964 == var161) {
                        class355 var170 = class176.method1378(var169.field7954, (byte) 103);
                        if (var170.field5374) {
                            var167 = true;
                        }
                        if (var170.field5378 != -1) {
                            class569 var171 = var7.method1774(64, var170.field5378);
                            if (var171.field8072 == 2) {
                                this.field3227 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field3237--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field5168 != null) {
                var172 = arg1.field5168[var161];
                if (var172 != -1) {
                    var162 = var7.method1774(122, var172 & 0xFFFF);
                    if ((this.field3236 & 0x40) != 0 && var162.field8062) {
                        var172 = -1;
                        var162 = null;
                    } else {
                        var166 = var162.field8065;
                        var165 = var162.field8079;
                    }
                }
            }
            boolean var173 = arg1.field5196 != null && arg1.field5196[var161] != 0 || var162 != null && var162.field8072 != 0;
            if ((var11 || var173) && arg1.field5143 != null) {
                var163 += arg1.field5143[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = (var165 & 0xFF << 8) + var163;
            int var175 = ((var172 & 0xFFFF) << 16) + var164;
            int var176 = (var166 & 0xFF) + var174;
            int var177 = (var12 & 0xFFFF) + var175;
            var10[var12] = ((long) var176 << 32) + (long) var177;
            this.field3255 |= var162 != null && (var162.field8058 != 0 || var162.field8066 != 0);
            this.field3227 |= var173;
        }
        class180.method1395(var8, -1, var10);
        this.field3310 = arg1.field5180;
        this.field3295 = arg1.field5160;
        this.field3311 = arg1.field5164;
        this.field3322 = arg1.field5145;
        this.field3216 = arg1.field5175;
        this.field3319 = arg1.field5159;
        class270[] var13 = new class270[this.field3322];
        this.field3251 = arg1.field5191;
        this.field3256 = arg1.field5153;
        if (arg1.field5189 != null) {
            this.field3232 = arg1.field5189.length;
            this.field3284 = new class182[this.field3232];
            this.field3240 = new class475[this.field3232];
            for (int var14 = 0; var14 < this.field3232; var14++) {
                class562 var15 = arg1.field5189[var14];
                class355 var16 = class176.method1378(var15.field7954, (byte) 119);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3234; var18++) {
                    if (var8[var18] == var15.field7964) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class510.field7397[arg1.field5161[var15.field7964] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field5196 == null ? 0 : arg1.field5196[var15.field7964]) << 24;
                this.field3240[var14] = new class475(var17, arg1.field5150[var15.field7964], arg1.field5177[var15.field7964], arg1.field5183[var15.field7964], var16.field5381, var16.field5383, var16.field5378, var16.field5382, var16.field5379, var16.field5374, var16.field5376, var15.field7960);
                this.field3284[var14] = new class182(var20);
            }
        }
        int var21 = this.field3234 * 3;
        class24.field241 = new long[var21];
        this.field3288 = new short[var21];
        this.field3230 = new short[var21];
        this.field3286 = new short[this.field3234];
        this.field3272 = new short[var21];
        this.field3314 = new short[var21];
        if (arg1.field5154 != null) {
            this.field3243 = new short[this.field3234];
        }
        this.field3298 = new byte[var21];
        this.field3299 = (short) arg4;
        this.field3239 = new float[var21];
        this.field3201 = new short[this.field3234];
        this.field3213 = (short) arg3;
        this.field3290 = new short[this.field3234];
        this.field3274 = new short[this.field3234];
        this.field3306 = new float[var21];
        this.field3320 = new short[var21];
        this.field3212 = new short[var21];
        this.field3313 = new short[this.field3234];
        this.field3235 = new byte[this.field3234];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field5145; var23++) {
            int var160 = this.field3293[var23];
            this.field3293[var23] = var22;
            var22 += var160;
            var13[var23] = new class270();
        }
        this.field3293[arg1.field5145] = var22;
        class705 var24 = class397.method2458(var8, arg1, 18767, this.field3234);
        class131[] var25 = new class131[arg1.field5186];
        for (int var26 = 0; var26 < arg1.field5186; var26++) {
            short var139 = arg1.field5150[var26];
            short var140 = arg1.field5177[var26];
            short var141 = arg1.field5183[var26];
            int var142 = this.field3319[var140] - this.field3319[var139];
            int var143 = this.field3216[var140] - this.field3216[var139];
            int var144 = this.field3311[var140] - this.field3311[var139];
            int var145 = this.field3319[var141] - this.field3319[var139];
            int var146 = this.field3216[var141] - this.field3216[var139];
            int var147 = this.field3311[var141] - this.field3311[var139];
            int var148 = var143 * var147 - (var144 * var146);
            int var149 = var144 * var145 - var142 * var147;
            int var150 = var142 * var146 - (var143 * var145);
            while (var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192) {
                var149 >>= 0x1;
                var150 >>= 0x1;
                var148 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var150 * var150 + var148 * var148 + var149 * var149));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var149 * 256 / var151;
            int var153 = var148 * 256 / var151;
            int var154 = var150 * 256 / var151;
            byte var155 = arg1.field5167 == null ? 0 : arg1.field5167[var26];
            if (var155 == 0) {
                class270 var157 = var13[var139];
                var157.field4151 += var154;
                var157.field4153++;
                var157.field4156 += var153;
                var157.field4154 += var152;
                class270 var158 = var13[var140];
                var158.field4156 += var153;
                var158.field4151 += var154;
                var158.field4154 += var152;
                var158.field4153++;
                class270 var159 = var13[var141];
                var159.field4151 += var154;
                var159.field4156 += var153;
                var159.field4154 += var152;
                var159.field4153++;
            } else if (var155 == 1) {
                class131 var156 = var25[var26] = new class131();
                var156.field2133 = var154;
                var156.field2135 = var152;
                var156.field2131 = var153;
            }
        }
        for (int var27 = 0; var27 < this.field3234; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field5161[var48] & 0xFFFF;
            int var50;
            if (arg1.field5195 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field5195[var48];
            }
            int var51;
            if (arg1.field5196 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field5196[var48] & 0xFF;
            }
            short var52 = arg1.field5168 == null ? -1 : arg1.field5168[var48];
            if (var52 != -1 && (this.field3236 & 0x40) != 0) {
                class569 var53 = var7.method1774(99, var52 & 0xFFFF);
                if (var53.field8062) {
                    var52 = -1;
                }
            }
            float var54 = 0.0F;
            float var55 = 0.0F;
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            byte var60 = 0;
            byte var61 = 0;
            int var62 = 0;
            if (var52 != -1) {
                if (var50 == -1) {
                    var60 = 1;
                    var58 = 0.0F;
                    var55 = 1.0F;
                    var57 = 1.0F;
                    var54 = 0.0F;
                    var56 = 1.0F;
                    var61 = 2;
                    var59 = 0.0F;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field5162[var50];
                    if (var63 == 0) {
                        short var92 = arg1.field5150[var48];
                        short var93 = arg1.field5177[var48];
                        short var94 = arg1.field5183[var48];
                        short var95 = arg1.field5156[var50];
                        short var96 = arg1.field5155[var50];
                        short var97 = arg1.field5152[var50];
                        float var98 = (float) arg1.field5159[var95];
                        float var99 = (float) arg1.field5175[var95];
                        float var100 = (float) arg1.field5164[var95];
                        float var101 = (float) arg1.field5159[var96] - var98;
                        float var102 = (float) arg1.field5175[var96] - var99;
                        float var103 = (float) arg1.field5164[var96] - var100;
                        float var104 = (float) arg1.field5159[var97] - var98;
                        float var105 = (float) arg1.field5175[var97] - var99;
                        float var106 = (float) arg1.field5164[var97] - var100;
                        float var107 = (float) arg1.field5159[var92] - var98;
                        float var108 = (float) arg1.field5175[var92] - var99;
                        float var109 = (float) arg1.field5164[var92] - var100;
                        float var110 = (float) arg1.field5159[var93] - var98;
                        float var111 = (float) arg1.field5175[var93] - var99;
                        float var112 = (float) arg1.field5164[var93] - var100;
                        float var113 = (float) arg1.field5159[var94] - var98;
                        float var114 = (float) arg1.field5175[var94] - var99;
                        float var115 = (float) arg1.field5164[var94] - var100;
                        float var116 = var102 * var106 - (var103 * var105);
                        float var117 = var103 * var104 - (var101 * var106);
                        float var118 = var101 * var105 - (var102 * var104);
                        float var119 = var105 * var118 - var106 * var117;
                        float var120 = var106 * var116 - (var104 * var118);
                        float var121 = var104 * var117 - var105 * var116;
                        float var122 = 1.0F / (var103 * var121 + var101 * var119 + var102 * var120);
                        var54 = (var109 * var121 + var107 * var119 + var108 * var120) * var122;
                        var56 = (var112 * var121 + var110 * var119 + var111 * var120) * var122;
                        var58 = (var115 * var121 + var113 * var119 + var114 * var120) * var122;
                        float var123 = var103 * var116 - var101 * var118;
                        float var124 = var102 * var118 - (var103 * var117);
                        float var125 = var101 * var117 - var102 * var116;
                        float var126 = 1.0F / (var106 * var125 + var104 * var124 + var105 * var123);
                        var57 = (var112 * var125 + var110 * var124 + var111 * var123) * var126;
                        var55 = (var109 * var125 + var107 * var124 + var108 * var123) * var126;
                        var59 = (var115 * var125 + var113 * var124 + var114 * var123) * var126;
                    } else {
                        short var64 = arg1.field5150[var48];
                        short var65 = arg1.field5177[var48];
                        short var66 = arg1.field5183[var48];
                        int var67 = var24.field9957[var50];
                        int var68 = var24.field9952[var50];
                        int var69 = var24.field9958[var50];
                        float[] var70 = var24.field9953[var50];
                        byte var71 = arg1.field5188[var50];
                        float var72 = (float) arg1.field5174[var50] / 256.0F;
                        if (var63 == 1) {
                            float var73 = (float) arg1.field5172[var50] / 1024.0F;
                            class520.method3098(arg1.field5159[var64], var72, var71, var67, arg1.field5164[var64], var69, arg1.field5175[var64], var68, var73, var70, -117, class148.field2318);
                            var54 = class148.field2318[0];
                            var55 = class148.field2318[1];
                            class520.method3098(arg1.field5159[var65], var72, var71, var67, arg1.field5164[var65], var69, arg1.field5175[var65], var68, var73, var70, -43, class148.field2318);
                            var57 = class148.field2318[1];
                            var56 = class148.field2318[0];
                            class520.method3098(arg1.field5159[var66], var72, var71, var67, arg1.field5164[var66], var69, arg1.field5175[var66], var68, var73, var70, -92, class148.field2318);
                            var58 = class148.field2318[0];
                            var59 = class148.field2318[1];
                            float var74 = var73 / 2.0F;
                            if ((var71 & 0x1) == 0) {
                                if (var56 - var54 > var74) {
                                    var56 -= var73;
                                    var60 = 1;
                                } else if (var74 < var54 - var56) {
                                    var56 += var73;
                                    var60 = 2;
                                }
                                if (var74 < var58 - var54) {
                                    var61 = 1;
                                    var58 -= var73;
                                } else if (var74 < var54 - var58) {
                                    var61 = 2;
                                    var58 += var73;
                                }
                            } else {
                                if (var74 < var57 - var55) {
                                    var57 -= var73;
                                    var60 = 1;
                                } else if (var74 < var55 - var57) {
                                    var60 = 2;
                                    var57 += var73;
                                }
                                if ((var59 - var55 > var74)) {
                                    var59 -= var73;
                                    var61 = 1;
                                } else if (var55 - var59 > var74) {
                                    var61 = 2;
                                    var59 += var73;
                                }
                            }
                        } else if (var63 == 2) {
                            float var75 = (float) arg1.field5157[var50] / 256.0F;
                            float var76 = (float) arg1.field5169[var50] / 256.0F;
                            int var77 = arg1.field5159[var65] - arg1.field5159[var64];
                            int var78 = arg1.field5175[var65] - arg1.field5175[var64];
                            int var79 = arg1.field5164[var65] - arg1.field5164[var64];
                            int var80 = arg1.field5159[var66] - arg1.field5159[var64];
                            int var81 = arg1.field5175[var66] - arg1.field5175[var64];
                            int var82 = arg1.field5164[var66] - arg1.field5164[var64];
                            int var83 = var78 * var82 - (var79 * var81);
                            int var84 = var79 * var80 - var77 * var82;
                            int var85 = var77 * var81 - (var78 * var80);
                            float var86 = 64.0F / (float) arg1.field5185[var50];
                            float var87 = 64.0F / (float) arg1.field5190[var50];
                            float var88 = 64.0F / (float) arg1.field5172[var50];
                            float var89 = (var70[2] * (float) var85 + var70[0] * (float) var83 + var70[1] * (float) var84) / var86;
                            float var90 = (var70[5] * (float) var85 + var70[3] * (float) var83 + var70[4] * (float) var84) / var87;
                            float var91 = (var70[8] * (float) var85 + var70[6] * (float) var83 + var70[7] * (float) var84) / var88;
                            var62 = class668.method3744(0, var90, var89, var91);
                            class189.method1434(arg1.field5159[var64], var75, var71, 90, var70, arg1.field5164[var64], class148.field2318, var62, var69, var72, var68, var76, var67, arg1.field5175[var64]);
                            var55 = class148.field2318[1];
                            var54 = class148.field2318[0];
                            class189.method1434(arg1.field5159[var65], var75, var71, 112, var70, arg1.field5164[var65], class148.field2318, var62, var69, var72, var68, var76, var67, arg1.field5175[var65]);
                            var56 = class148.field2318[0];
                            var57 = class148.field2318[1];
                            class189.method1434(arg1.field5159[var66], var75, var71, 111, var70, arg1.field5164[var66], class148.field2318, var62, var69, var72, var68, var76, var67, arg1.field5175[var66]);
                            var58 = class148.field2318[0];
                            var59 = class148.field2318[1];
                        } else if (var63 == 3) {
                            class690.method3855(class148.field2318, var72, var69, arg1.field5175[var64], var68, var71, arg1.field5164[var64], arg1.field5159[var64], 2616, var70, var67);
                            var54 = class148.field2318[0];
                            var55 = class148.field2318[1];
                            class690.method3855(class148.field2318, var72, var69, arg1.field5175[var65], var68, var71, arg1.field5164[var65], arg1.field5159[var65], 2616, var70, var67);
                            var56 = class148.field2318[0];
                            var57 = class148.field2318[1];
                            class690.method3855(class148.field2318, var72, var69, arg1.field5175[var66], var68, var71, arg1.field5164[var66], arg1.field5159[var66], 2616, var70, var67);
                            var58 = class148.field2318[0];
                            var59 = class148.field2318[1];
                            if ((var71 & 0x1) == 0) {
                                if ((var56 - var54 > 0.5F)) {
                                    var60 = 1;
                                    var56--;
                                } else if (var54 - var56 > 0.5F) {
                                    var60 = 2;
                                    var56++;
                                }
                                if (var58 - var54 > 0.5F) {
                                    var61 = 1;
                                    var58--;
                                } else if (var54 - var58 > 0.5F) {
                                    var58++;
                                    var61 = 2;
                                }
                            } else {
                                if ((var57 - var55 > 0.5F)) {
                                    var60 = 1;
                                    var57--;
                                } else if (var55 - var57 > 0.5F) {
                                    var60 = 2;
                                    var57++;
                                }
                                if (var59 - var55 > 0.5F) {
                                    var59--;
                                    var61 = 1;
                                } else if (var55 - var59 > 0.5F) {
                                    var59++;
                                    var61 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field5167 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field5167[var48];
            }
            if (var127 == 0) {
                long var128 = (long) (var50 << 2) + ((long) (var49 << 8) + (long) (var62 << 24) + ((long) var51) << 32);
                short var130 = arg1.field5150[var48];
                short var131 = arg1.field5177[var48];
                short var132 = arg1.field5183[var48];
                class270 var133 = var13[var130];
                this.field3313[var27] = this.method1443(var133.field4154, var55, var130, var133.field4151, var128, arg1, var133.field4153, var54, var133.field4156, (byte) 108, var27);
                class270 var134 = var13[var131];
                this.field3201[var27] = this.method1443(var134.field4154, var57, var131, var134.field4151, (long) var60 + var128, arg1, var134.field4153, var56, var134.field4156, (byte) 108, var27);
                class270 var135 = var13[var132];
                this.field3290[var27] = this.method1443(var135.field4154, var59, var132, var135.field4151, (long) var61 + var128, arg1, var135.field4153, var58, var135.field4156, (byte) 108, var27);
            } else if (var127 == 1) {
                class131 var136 = var25[var48];
                long var137 = (long) ((var136.field2133 + 256 << 22) + (var136.field2135 + 256 << 12) + (var50 << 2) + (var136.field2131 <= 0 ? 2048 : 1024)) + ((long) (var62 << 24) + (long) var51 + (long) (var49 << 8) << 32);
                this.field3313[var27] = this.method1443(var136.field2135, var55, arg1.field5150[var48], var136.field2133, var137, arg1, 0, var54, var136.field2131, (byte) 108, var27);
                this.field3201[var27] = this.method1443(var136.field2135, var57, arg1.field5177[var48], var136.field2133, (long) var60 + var137, arg1, 0, var56, var136.field2131, (byte) 108, var27);
                this.field3290[var27] = this.method1443(var136.field2135, var59, arg1.field5183[var48], var136.field2133, (long) var61 + var137, arg1, 0, var58, var136.field2131, (byte) 108, var27);
            }
            if (arg1.field5196 != null) {
                this.field3235[var27] = arg1.field5196[var48];
            }
            if (arg1.field5154 != null) {
                this.field3243[var27] = arg1.field5154[var48];
            }
            this.field3274[var27] = arg1.field5161[var48];
            this.field3286[var27] = var52;
        }
        if (this.field3237 > 0) {
            int var28 = 1;
            short var29 = this.field3286[0];
            for (int var30 = 0; var30 < this.field3237; var30++) {
                short var40 = this.field3286[var30];
                if (var29 != var40) {
                    var28++;
                    var29 = var40;
                }
            }
            this.field3219 = new int[var28];
            this.field3264 = new int[var28 + 1];
            this.field3241 = new int[var28];
            this.field3264[0] = 0;
            int var31 = this.field3294;
            short var32 = 0;
            int var33 = 0;
            short var34 = this.field3286[0];
            for (int var35 = 0; var35 < this.field3237; var35++) {
                short var36 = this.field3286[var35];
                if (var34 != var36) {
                    this.field3219[var33] = var31;
                    this.field3241[var33] = var32 + 1 - var31;
                    var33++;
                    this.field3264[var33] = var35;
                    var34 = var36;
                    var31 = this.field3294;
                    var32 = 0;
                }
                short var37 = this.field3313[var35];
                if (var37 > var32) {
                    var32 = var37;
                }
                if (var31 > var37) {
                    var31 = var37;
                }
                short var38 = this.field3201[var35];
                if (var38 > var32) {
                    var32 = var38;
                }
                if (var31 > var38) {
                    var31 = var38;
                }
                short var39 = this.field3290[var35];
                if (var32 < var39) {
                    var32 = var39;
                }
                if (var31 > var39) {
                    var31 = var39;
                }
            }
            this.field3219[var33] = var31;
            this.field3241[var33] = var32 + 1 - var31;
            var33++;
            this.field3264[var33] = this.field3237;
        }
        class24.field241 = null;
        this.field3314 = class187.method1424(this.field3314, 62, this.field3294);
        this.field3320 = class187.method1424(this.field3320, -113, this.field3294);
        this.field3230 = class187.method1424(this.field3230, -108, this.field3294);
        this.field3288 = class187.method1424(this.field3288, -113, this.field3294);
        this.field3212 = class187.method1424(this.field3212, 108, this.field3294);
        this.field3298 = class82.method728(this.field3298, (byte) -118, this.field3294);
        this.field3239 = class544.method3191(this.field3294, -22824, this.field3239);
        this.field3306 = class544.method3191(this.field3294, -22824, this.field3306);
        if (arg1.field5194 != null && class346.method2211(arg2, 0, this.field3236)) {
            this.field3301 = arg1.method2240((byte) -3, false);
        }
        if (arg1.field5189 != null && class77.method701(arg2, -124, this.field3236)) {
            this.field3276 = arg1.method2245((byte) -115);
        }
        if (arg1.field5178 != null && class648.method3655(arg2, this.field3236, 90)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field3234; var43++) {
                int var47 = arg1.field5178[var8[var43]];
                if (var47 >= 0) {
                    int var10002 = var42[var47]++;
                    if (var47 > var41) {
                        var41 = var47;
                    }
                }
            }
            this.field3283 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field3283[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field3234; var45++) {
                int var46 = arg1.field5178[var8[var45]];
                if (var46 >= 0) {
                    this.field3283[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "fa", descriptor = "()I", line = 5062)
    public final int method1033() {
        field3318++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3287;
    }

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "(IIII)V", line = 5075)
    public final void method1040(int arg0, int arg1, int arg2, int arg3) {
        field3254++;
        if (arg0 == 0) {
            class366.field5580 = 0;
            class741.field10394 = 0;
            class100.field1480 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field3322; var6++) {
                class741.field10394 += this.field3319[var6];
                class366.field5580 += this.field3216[var6];
                var5++;
                class100.field1480 += this.field3311[var6];
            }
            if (var5 > 0) {
                class741.field10394 = class741.field10394 / var5 + arg1;
                class366.field5580 = class366.field5580 / var5 + arg2;
                class100.field1480 = class100.field1480 / var5 + arg3;
            } else {
                class100.field1480 = arg3;
                class366.field5580 = arg2;
                class741.field10394 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3322; var7++) {
                this.field3319[var7] += arg1;
                this.field3216[var7] += arg2;
                this.field3311[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3322; var8++) {
                this.field3319[var8] -= class741.field10394;
                this.field3216[var8] -= class366.field5580;
                this.field3311[var8] -= class100.field1480;
                if (arg3 != 0) {
                    int var9 = class582.field8226[arg3];
                    int var10 = class582.field8230[arg3];
                    int var11 = this.field3216[var8] * var9 + this.field3319[var8] * var10 + 16383 >> 14;
                    this.field3216[var8] = this.field3216[var8] * var10 + 16383 - (this.field3319[var8] * var9) >> 14;
                    this.field3319[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class582.field8226[arg1];
                    int var13 = class582.field8230[arg1];
                    int var14 = this.field3216[var8] * var13 + 16383 - (this.field3311[var8] * var12) >> 14;
                    this.field3311[var8] = this.field3216[var8] * var12 - (-(this.field3311[var8] * var13) - 16383) >> 14;
                    this.field3216[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class582.field8226[arg2];
                    int var16 = class582.field8230[arg2];
                    int var17 = this.field3311[var8] * var15 + this.field3319[var8] * var16 + 16383 >> 14;
                    this.field3311[var8] = this.field3311[var8] * var16 + 16383 - this.field3319[var8] * var15 >> 14;
                    this.field3319[var8] = var17;
                }
                this.field3319[var8] += class741.field10394;
                this.field3216[var8] += class366.field5580;
                this.field3311[var8] += class100.field1480;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3322; var18++) {
                this.field3319[var18] -= class741.field10394;
                this.field3216[var18] -= class366.field5580;
                this.field3311[var18] -= class100.field1480;
                this.field3319[var18] = this.field3319[var18] * arg1 / 128;
                this.field3216[var18] = this.field3216[var18] * arg2 / 128;
                this.field3311[var18] = this.field3311[var18] * arg3 / 128;
                this.field3319[var18] += class741.field10394;
                this.field3216[var18] += class366.field5580;
                this.field3311[var18] += class100.field1480;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3234; var19++) {
                int var23 = (this.field3235[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3235[var19] = (byte) var23;
            }
            if (this.field3240 != null) {
                for (int var20 = 0; var20 < this.field3232; var20++) {
                    class475 var21 = this.field3240[var20];
                    class182 var22 = this.field3284[var20];
                    var22.field3078 = var22.field3078 & 0xFFFFFF | 255 - (this.field3235[var21.field6890] & 0xFF) << 24;
                }
            }
            this.method1452(-15191);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3234; var24++) {
                int var28 = this.field3274[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3F8) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = var29 + arg1 & 0x3F;
                int var34 = arg3 + var32;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field3274[var24] = (short) class112.method903(class112.method903(var31 << 7, var33 << 10), var34);
            }
            if (this.field3240 != null) {
                for (int var25 = 0; var25 < this.field3232; var25++) {
                    class475 var26 = this.field3240[var25];
                    class182 var27 = this.field3284[var25];
                    var27.field3078 = class510.field7397[this.field3274[var26.field6890] & 0xFFFF] & 0xFFFFFF | var27.field3078 & 0xFF000000;
                }
            }
            this.method1452(-15191);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3232; var35++) {
                class182 var36 = this.field3284[var35];
                var36.field3074 += arg2;
                var36.field3075 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3232; var37++) {
                class182 var38 = this.field3284[var37];
                var38.field3071 = var38.field3071 * arg2 >> 7;
                var38.field3081 = var38.field3081 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3232; var39++) {
                class182 var40 = this.field3284[var39];
                var40.field3073 = var40.field3073 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "()Z", line = 5381)
    public final boolean method1048() {
        field3317++;
        return this.field3227;
    }

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "(I)V", line = 5394)
    public final void method1014(int arg0) {
        field3246++;
        if (this.field3258 != null) {
            this.field3258.field3797 = class312.method2057(arg0, this.field3236, -1);
        }
        if (this.field3308 != null) {
            this.field3308.field3797 = class10.method43(arg0, 0, this.field3236);
        }
        if (this.field3200 != null) {
            this.field3200.field3797 = class515.method3082(arg0, this.field3236, 119);
        }
        if (this.field3259 != null) {
            this.field3259.field3797 = class257.method1730(this.field3236, -82, arg0);
        }
        this.field3265 = arg0;
        if (this.field3297 != null && (this.field3265 & 0x10000) == 0) {
            this.field3288 = this.field3297.field5564;
            this.field3298 = this.field3297.field5569;
            this.field3212 = this.field3297.field5563;
            this.field3230 = this.field3297.field5567;
            this.field3297 = null;
        }
        this.field3242 = true;
        this.method1455(-27767);
    }

    @OriginalMember(owner = "client!lu", name = "NA", descriptor = "()Z", line = 5434)
    public final boolean method1050() {
        field3247++;
        if (this.field3301 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3310; var1++) {
            this.field3319[var1] <<= 0x4;
            this.field3216[var1] <<= 0x4;
            this.field3311[var1] <<= 0x4;
        }
        class741.field10394 = 0;
        class100.field1480 = 0;
        class366.field5580 = 0;
        return true;
    }

    @OriginalMember(owner = "client!lu", name = "WA", descriptor = "()I", line = 5462)
    public final int method1035() {
        field3277++;
        return this.field3213;
    }

    @OriginalMember(owner = "client!lu", name = "ma", descriptor = "()I", line = 5470)
    public final int method1013() {
        if (!this.field3226) {
            this.method1439(0);
        }
        field3291++;
        return this.field3280;
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V", line = 5481)
    public static final void method1453(boolean arg0) {
        field3263++;
        class268.field4143 = class621.method3529(8, 0.4F, arg0, 4, (byte) -46, 2048, 35, 8);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Lsn;", line = 5489)
    public final class158[] method1036() {
        field3202++;
        return this.field3251;
    }

    @OriginalMember(owner = "client!lu", name = "wa", descriptor = "()V", line = 5501)
    public final void method1037() {
        field3321++;
        for (int var1 = 0; var1 < this.field3310; var1++) {
            this.field3319[var1] = this.field3319[var1] + 7 >> 4;
            this.field3216[var1] = this.field3216[var1] + 7 >> 4;
            this.field3311[var1] = this.field3311[var1] + 7 >> 4;
        }
        this.method1446((byte) 114);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "HA", descriptor = "()I", line = 5530)
    public final int method996() {
        field3262++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3199;
    }

    @OriginalMember(owner = "client!lu", name = "RA", descriptor = "()I", line = 5542)
    public final int method1024() {
        field3309++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3249;
    }

    @OriginalMember(owner = "client!lu", name = "EA", descriptor = "()I", line = 5553)
    public final int method1005() {
        field3208++;
        if (!this.field3226) {
            this.method1439(0);
        }
        return this.field3231;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILtc;ZIBI)Z", line = 5564)
    private final boolean method1454(int arg0, int arg1, class73 arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        field3266++;
        class341 var8 = (class341) arg2;
        class341 var9 = this.field3206.field568;
        float var10 = var8.field5048 * var9.field5015 + var8.field5009 * var9.field5023 + var8.field5001 * var9.field5045 + var9.field5009;
        float var11 = var8.field5048 * var9.field5027 + var8.field5009 * var9.field5024 + var8.field5001 * var9.field5036 + var9.field5001;
        class346.field5105 = var8.field5029 * var9.field5027 + var8.field5045 * var9.field5024 + var8.field5036 * var9.field5036;
        class149.field2322 = var8.field5037 * var9.field5037 + var8.field5027 * var9.field5029 + var8.field5015 * var9.field5032;
        class272.field4177 = var8.field5029 * var9.field5037 + var8.field5045 * var9.field5032 + var8.field5036 * var9.field5029;
        float var12 = var8.field5048 * var9.field5037 + var8.field5009 * var9.field5032 + var8.field5001 * var9.field5029 + var9.field5048;
        class140.field2177 = var8.field5032 * var9.field5037 + var8.field5024 * var9.field5029 + var8.field5023 * var9.field5032;
        class186.field3115 = var8.field5037 * var9.field5027 + var8.field5027 * var9.field5036 + var8.field5015 * var9.field5024;
        class691.field9806 = var8.field5032 * var9.field5027 + var8.field5024 * var9.field5036 + var8.field5023 * var9.field5024;
        class497.field7209 = var8.field5032 * var9.field5015 + var8.field5024 * var9.field5045 + var8.field5023 * var9.field5023;
        class391.field5839 = var8.field5037 * var9.field5015 + var8.field5027 * var9.field5045 + var8.field5015 * var9.field5023;
        class378.field5685 = var8.field5029 * var9.field5015 + var8.field5045 * var9.field5023 + var8.field5036 * var9.field5045;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field3206.field648;
        int var19 = this.field3206.field659;
        if (!this.field3226) {
            this.method1439(0);
        }
        int var20 = this.field3249 - this.field3210 >> 1;
        int var21 = this.field3231 - this.field3287 >> 1;
        int var22 = this.field3267 - this.field3199 >> 1;
        int var23 = this.field3210 + var20;
        int var24 = this.field3287 + var21;
        int var25 = this.field3199 + var22;
        int var26 = var23 - (var20 << arg1);
        int var27 = var24 - (var21 << arg1);
        int var28 = var25 - (var22 << arg1);
        int var29 = (var20 << arg1) + var23;
        int var30 = (var21 << arg1) + var24;
        int var31 = (var22 << arg1) + var25;
        class140.field2195[0] = var26;
        class70.field1086[0] = var27;
        class230.field3709[0] = var28;
        class140.field2195[1] = var29;
        class70.field1086[1] = var27;
        class140.field2195[2] = var26;
        class230.field3709[1] = var28;
        class70.field1086[2] = var30;
        class140.field2195[3] = var29;
        class230.field3709[2] = var28;
        class70.field1086[3] = var30;
        class140.field2195[4] = var26;
        class230.field3709[3] = var28;
        class70.field1086[4] = var27;
        class230.field3709[4] = var31;
        class140.field2195[5] = var29;
        class70.field1086[5] = var27;
        class140.field2195[6] = var26;
        class230.field3709[5] = var31;
        class70.field1086[6] = var30;
        if (arg5 >= -76) {
            this.field3230 = null;
        }
        class230.field3709[6] = var31;
        class140.field2195[7] = var29;
        class70.field1086[7] = var30;
        class230.field3709[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class70.field1086[var32];
            float var52 = (float) class140.field2195[var32];
            float var53 = (float) class230.field3709[var32];
            float var54 = class391.field5839 * var53 + class497.field7209 * var52 + class378.field5685 * var51 + var10;
            float var55 = class149.field2322 * var53 + class272.field4177 * var51 + class140.field2177 * var52 + var12;
            float var56 = class186.field3115 * var53 + class691.field9806 * var52 + class346.field5105 * var51 + var11;
            if (var55 >= (float) this.field3206.field634) {
                if (arg6 > 0) {
                    var55 = arg6;
                }
                float var57 = (float) var18 * var54 / var55 + (float) this.field3206.field575;
                float var58 = (float) var19 * var56 / var55 + (float) this.field3206.field647;
                if (var14 > var57) {
                    var14 = var57;
                }
                if (var57 > var15) {
                    var15 = var57;
                }
                if (var16 > var58) {
                    var16 = var58;
                }
                var13 = true;
                if (var58 > var17) {
                    var17 = var58;
                }
            }
        }
        if (var13 && var14 < (float) arg0 && (float) arg0 < var15 && (float) arg4 > var16 && (float) arg4 < var17) {
            if (arg3) {
                return true;
            }
            if (class334.field4895.length < this.field3294) {
                class340.field4997 = new int[this.field3294];
                class334.field4895 = new int[this.field3294];
            }
            for (int var33 = 0; var33 < this.field3322; var33++) {
                float var35 = (float) this.field3216[var33];
                float var36 = (float) this.field3319[var33];
                float var37 = (float) this.field3311[var33];
                float var38 = class149.field2322 * var37 + class272.field4177 * var35 + class140.field2177 * var36 + var12;
                float var39 = class391.field5839 * var37 + class497.field7209 * var36 + class378.field5685 * var35 + var10;
                float var40 = class186.field3115 * var37 + class691.field9806 * var36 + class346.field5105 * var35 + var11;
                if (var38 >= (float) this.field3206.field634) {
                    if (arg6 > 0) {
                        var38 = arg6;
                    }
                    int var41 = (int) ((float) var18 * var39 / var38 + (float) this.field3206.field575);
                    int var42 = (int) ((float) var19 * var40 / var38 + (float) this.field3206.field647);
                    int var43 = this.field3293[var33];
                    int var44 = this.field3293[var33 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field3272[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        class334.field4895[var46] = var41;
                        class340.field4997[var46] = var42;
                    }
                } else {
                    int var47 = this.field3293[var33];
                    int var48 = this.field3293[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field3272[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class334.field4895[this.field3272[var49] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field3234; var34++) {
                if (class334.field4895[this.field3313[var34]] != -999999 && class334.field4895[this.field3201[var34]] != -999999 && class334.field4895[this.field3290[var34]] != -999999 && this.method1450(arg4, class334.field4895[this.field3290[var34]], class340.field4997[this.field3201[var34]], class334.field4895[this.field3313[var34]], class340.field4997[this.field3290[var34]], true, class334.field4895[this.field3201[var34]], arg0, class340.field4997[this.field3313[var34]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V", line = 5806)
    private final void method1455(int arg0) {
        field3203++;
        if (!this.field3242) {
            return;
        }
        this.field3242 = false;
        if (this.field3256 == null && this.field3251 == null && this.field3240 == null) {
            if (this.field3319 != null && !class699.method3888(this.field3236, this.field3265, false)) {
                if (this.field3258 == null || this.field3258.method1625(1)) {
                    if (!this.field3226) {
                        this.method1439(0);
                    }
                    this.field3319 = null;
                } else {
                    this.field3242 = true;
                }
            }
            if (this.field3216 != null && !class426.method2665(this.field3236, this.field3265, (byte) 101)) {
                if (this.field3258 == null || this.field3258.method1625(1)) {
                    if (!this.field3226) {
                        this.method1439(0);
                    }
                    this.field3216 = null;
                } else {
                    this.field3242 = true;
                }
            }
            if (this.field3311 != null && !class364.method2343(this.field3236, -122, this.field3265)) {
                if (this.field3258 == null || this.field3258.method1625(arg0 ^ 0xFFFF9388)) {
                    if (!this.field3226) {
                        this.method1439(arg0 ^ 0xFFFF9389);
                    }
                    this.field3311 = null;
                } else {
                    this.field3242 = true;
                }
            }
        }
        if (this.field3272 != null && this.field3319 == null && this.field3216 == null && this.field3311 == null) {
            this.field3293 = null;
            this.field3272 = null;
        }
        if (this.field3298 != null && !class206.method1510(this.field3236, this.field3265, (byte) 89)) {
            label207: {
                label206: {
                    boolean var10000;
                    if ((this.field3236 & 0x37) == 0) {
                        if (this.field3200 == null || this.field3200.method1625(1)) {
                            break label206;
                        }
                        var10000 = false;
                    } else {
                        if (this.field3259 == null || this.field3259.method1625(1)) {
                            break label206;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field3242 = true;
                        break label207;
                    }
                }
                this.field3298 = null;
                this.field3230 = this.field3288 = this.field3212 = null;
            }
        }
        if (this.field3274 != null && !class680.method3787(this.field3265, arg0 ^ 0xFFFFDA71, this.field3236)) {
            if (this.field3200 == null || this.field3200.method1625(1)) {
                this.field3274 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (this.field3235 != null && !class230.method1600(this.field3265, 8, this.field3236)) {
            if (this.field3200 == null || this.field3200.method1625(1)) {
                this.field3235 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (this.field3239 != null && !class373.method2370((byte) 66, this.field3236, this.field3265)) {
            if (this.field3308 == null || this.field3308.method1625(arg0 + 27768)) {
                this.field3239 = this.field3306 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (this.field3286 != null && !class305.method2005(this.field3236, (byte) -125, this.field3265)) {
            if (this.field3200 == null || this.field3200.method1625(arg0 ^ 0xFFFF9388)) {
                this.field3286 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (this.field3313 != null && !class405.method2496(this.field3236, arg0 + 27767, this.field3265)) {
            if ((this.field3209 == null || this.field3209.method1741(3)) && (this.field3200 == null || this.field3200.method1625(arg0 ^ 0xFFFF9388))) {
                this.field3313 = this.field3201 = this.field3290 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (arg0 != -27767) {
            this.method1003();
        }
        if (this.field3314 != null) {
            if (this.field3258 == null || this.field3258.method1625(1)) {
                this.field3314 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (this.field3320 != null) {
            if (this.field3200 == null || this.field3200.method1625(arg0 + 27768)) {
                this.field3320 = null;
            } else {
                this.field3242 = true;
            }
        }
        if (this.field3283 != null && !class648.method3655(this.field3265, this.field3236, 12)) {
            this.field3283 = null;
            this.field3243 = null;
        }
        if (this.field3301 != null && !class346.method2211(this.field3265, 0, this.field3236)) {
            this.field3295 = null;
            this.field3301 = null;
        }
        if (this.field3276 != null && !class77.method701(this.field3265, arg0 ^ 0x6C57, this.field3236)) {
            this.field3276 = null;
        }
        if (this.field3264 != null && (this.field3265 & 0x800) == 0 && (this.field3265 & 0x40000) == 0) {
            this.field3264 = null;
            this.field3241 = null;
            this.field3219 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "(I)V", line = 5995)
    public final void method1006(int arg0) {
        this.field3213 = (short) arg0;
        field3238++;
        this.method1452(-15191);
    }

    @OriginalMember(owner = "client!lu", name = "ia", descriptor = "(SS)V", line = 6008)
    public final void method1018(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3234; var3++) {
            if (this.field3274[var3] == arg0) {
                this.field3274[var3] = arg1;
            }
        }
        field3224++;
        if (this.field3240 != null) {
            for (int var4 = 0; var4 < this.field3232; var4++) {
                class475 var5 = this.field3240[var4];
                class182 var6 = this.field3284[var4];
                var6.field3078 = class510.field7397[this.field3274[var5.field6890] & 0xFFFF] & 0xFFFFFF | var6.field3078 & 0xFF000000;
            }
        }
        this.method1452(-15191);
    }

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "(III)V", line = 6047)
    public final void method998(int arg0, int arg1, int arg2) {
        field3252++;
        for (int var4 = 0; var4 < this.field3322; var4++) {
            if (arg0 != 128) {
                this.field3319[var4] = this.field3319[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3216[var4] = this.field3216[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3311[var4] = this.field3311[var4] * arg2 >> 7;
            }
        }
        this.method1446((byte) 105);
        this.field3226 = false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ltc;Lqw;I)V", line = 6115)
    public final void method1007(class73 arg0, class385 arg1, int arg2) {
        field3307++;
        if (this.field3294 == 0) {
            return;
        }
        class341 var4 = this.field3206.field568;
        class341 var5 = (class341) arg0;
        if (!this.field3226) {
            this.method1439(0);
        }
        class501.field7273 = var4.field5037 * var5.field5048 + var4.field5032 * var5.field5009 + var4.field5029 * var5.field5001 + var4.field5048;
        class272.field4177 = var4.field5037 * var5.field5029 + var4.field5032 * var5.field5045 + var4.field5029 * var5.field5036;
        float var6 = (float) this.field3287 * class272.field4177 + class501.field7273;
        float var7 = (float) this.field3231 * class272.field4177 + class501.field7273;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var8 = (float) (-this.field3269) + var7;
            var9 = (float) this.field3269 + var6;
        } else {
            var8 = (float) (-this.field3269) + var6;
            var9 = (float) this.field3269 + var7;
        }
        if ((this.field3206.field610 <= var8) || ((float) this.field3206.field634 >= var9)) {
            return;
        }
        class140.field2190 = var4.field5015 * var5.field5048 + var4.field5045 * var5.field5001 + var4.field5023 * var5.field5009 + var4.field5009;
        class378.field5685 = var4.field5015 * var5.field5029 + var4.field5045 * var5.field5036 + var4.field5023 * var5.field5045;
        float var10 = (float) this.field3287 * class378.field5685 + class140.field2190;
        float var11 = (float) this.field3231 * class378.field5685 + class140.field2190;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field3269 + var10) * (float) this.field3206.field648;
            var13 = (var11 - (float) this.field3269) * (float) this.field3206.field648;
        } else {
            var13 = ((float) (-this.field3269) + var10) * (float) this.field3206.field648;
            var12 = ((float) this.field3269 + var11) * (float) this.field3206.field648;
        }
        if ((var13 / var9 >= this.field3206.field666) || (var12 / var9 <= this.field3206.field603)) {
            return;
        }
        class694.field9842 = var4.field5027 * var5.field5048 + var4.field5036 * var5.field5001 + var4.field5024 * var5.field5009 + var4.field5001;
        class346.field5105 = var4.field5027 * var5.field5029 + var4.field5036 * var5.field5036 + var4.field5024 * var5.field5045;
        float var14 = (float) this.field3287 * class346.field5105 + class694.field9842;
        float var15 = (float) this.field3231 * class346.field5105 + class694.field9842;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field3269 + var14) * (float) this.field3206.field659;
            var17 = (var15 - (float) this.field3269) * (float) this.field3206.field659;
        } else {
            var16 = ((float) this.field3269 + var15) * (float) this.field3206.field659;
            var17 = (var14 - (float) this.field3269) * (float) this.field3206.field659;
        }
        if ((var17 / var9 >= this.field3206.field589) || (this.field3206.field587 >= var16 / var9)) {
            return;
        }
        if (arg1 != null || this.field3240 != null) {
            class391.field5839 = var4.field5015 * var5.field5037 + var4.field5045 * var5.field5027 + var4.field5023 * var5.field5015;
            class149.field2322 = var4.field5037 * var5.field5037 + var4.field5032 * var5.field5015 + var4.field5029 * var5.field5027;
            class497.field7209 = var4.field5015 * var5.field5032 + var4.field5045 * var5.field5024 + var4.field5023 * var5.field5023;
            class186.field3115 = var4.field5027 * var5.field5037 + var4.field5036 * var5.field5027 + var4.field5024 * var5.field5015;
            class140.field2177 = var4.field5037 * var5.field5032 + var4.field5032 * var5.field5023 + var4.field5029 * var5.field5024;
            class691.field9806 = var4.field5027 * var5.field5032 + var4.field5036 * var5.field5024 + var4.field5024 * var5.field5023;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3249 + this.field3210 >> 1;
            int var21 = this.field3267 + this.field3199 >> 1;
            int var22 = (int) ((float) var21 * class391.field5839 + (float) this.field3287 * class378.field5685 + (float) var20 * class497.field7209 + class140.field2190);
            int var23 = (int) ((float) var21 * class186.field3115 + (float) this.field3287 * class346.field5105 + (float) var20 * class691.field9806 + class694.field9842);
            int var24 = (int) ((float) var21 * class149.field2322 + (float) this.field3287 * class272.field4177 + (float) var20 * class140.field2177 + class501.field7273);
            if (var24 >= this.field3206.field634) {
                arg1.field5764 = this.field3206.field648 * var22 / var24 + this.field3206.field575;
                arg1.field5766 = this.field3206.field647 + (this.field3206.field659 * var23 / var24);
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class391.field5839 + (float) this.field3231 * class378.field5685 + (float) var20 * class497.field7209 + class140.field2190);
            int var26 = (int) ((float) var21 * class186.field3115 + (float) this.field3231 * class346.field5105 + (float) var20 * class691.field9806 + class694.field9842);
            int var27 = (int) ((float) var21 * class149.field2322 + (float) this.field3231 * class272.field4177 + (float) var20 * class140.field2177 + class501.field7273);
            if (this.field3206.field634 > var27) {
                var18 = true;
            } else {
                arg1.field5765 = this.field3206.field659 * var26 / var27 + this.field3206.field647;
                arg1.field5767 = this.field3206.field648 * var25 / var27 + this.field3206.field575;
            }
            if (var18) {
                if (var24 < this.field3206.field634 && var27 < this.field3206.field634) {
                    var19 = false;
                } else if (var24 < this.field3206.field634) {
                    int var31 = (var27 - this.field3206.field634 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field5764 = this.field3206.field648 * var32 / this.field3206.field634 + this.field3206.field575;
                    arg1.field5766 = this.field3206.field659 * var33 / this.field3206.field634 + this.field3206.field647;
                } else if (var27 < this.field3206.field634) {
                    int var28 = (var24 - this.field3206.field634 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field5764 = this.field3206.field575 + (this.field3206.field648 * var29 / this.field3206.field634);
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field5766 = this.field3206.field659 * var30 / this.field3206.field634 + this.field3206.field647;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field5769 = this.field3206.field575 - (arg1.field5764 - ((var22 + this.field3269) * this.field3206.field648 / var24));
                } else {
                    arg1.field5769 = (var25 + this.field3269) * this.field3206.field648 / var27 + (this.field3206.field575 - arg1.field5767);
                }
                arg1.field5768 = true;
            }
        }
        this.field3206.method336(false);
        this.field3206.method303(var5, (byte) 117);
        this.method1451((byte) 87);
        this.method1442((byte) 78);
    }
}
