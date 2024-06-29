import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class241 extends class350 {

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "Z")
    private boolean field3053 = false;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "I")
    private int field3046 = 0;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
    private boolean field3056 = true;

    @OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
    private int field3088 = 0;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    private int field3034 = 0;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    private int field3047 = 0;

    @OriginalMember(owner = "client!rh", name = "Fb", descriptor = "I")
    private int field3107 = 0;

    @OriginalMember(owner = "client!rh", name = "nb", descriptor = "Lap;")
    private class435 field3089;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "Ljl;")
    private class245 field3081;

    @OriginalMember(owner = "client!rh", name = "lc", descriptor = "Ljl;")
    private class245 field3139;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "Ljl;")
    private class245 field3058;

    @OriginalMember(owner = "client!rh", name = "wb", descriptor = "Ljl;")
    private class245 field3098;

    @OriginalMember(owner = "client!rh", name = "vb", descriptor = "Ltp;")
    private class487 field3097;

    @OriginalMember(owner = "client!rh", name = "pb", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!rh", name = "ec", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "[I")
    private int[] field3083;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "[S")
    private short[] field3080;

    @OriginalMember(owner = "client!rh", name = "yb", descriptor = "[I")
    private int[] field3100;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
    private int[] field3062;

    @OriginalMember(owner = "client!rh", name = "rb", descriptor = "[I")
    private int[] field3093;

    @OriginalMember(owner = "client!rh", name = "Xb", descriptor = "[Ldg;")
    private class375[] field3125;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "[Lhaa;")
    private class73[] field3050;

    @OriginalMember(owner = "client!rh", name = "Sb", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!rh", name = "Gb", descriptor = "[Lvc;")
    private class286[] field3108;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "[Lds;")
    private class14[] field3071;

    @OriginalMember(owner = "client!rh", name = "Mb", descriptor = "[S")
    private short[] field3114;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "[S")
    private short[] field3070;

    @OriginalMember(owner = "client!rh", name = "ac", descriptor = "[S")
    private short[] field3128;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[S")
    private short[] field3049;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "S")
    private short field3078;

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "S")
    private short field3082;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "[S")
    private short[] field3054;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "[S")
    private short[] field3048;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "[B")
    private byte[] field3068;

    @OriginalMember(owner = "client!rh", name = "Lb", descriptor = "[S")
    private short[] field3113;

    @OriginalMember(owner = "client!rh", name = "Qb", descriptor = "[S")
    private short[] field3118;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "[F")
    private float[] field3065;

    @OriginalMember(owner = "client!rh", name = "Ib", descriptor = "[F")
    private float[] field3110;

    @OriginalMember(owner = "client!rh", name = "hc", descriptor = "[B")
    private byte[] field3135;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "[S")
    private short[] field3069;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "[S")
    private short[] field3075;

    @OriginalMember(owner = "client!rh", name = "Zb", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!rh", name = "sb", descriptor = "[[I")
    private int[][] field3094;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "[[I")
    private int[][] field3055;

    @OriginalMember(owner = "client!rh", name = "Ub", descriptor = "[[I")
    private int[][] field3122;

    @OriginalMember(owner = "client!rh", name = "fc", descriptor = "B")
    private byte field3133;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!rh", name = "kb", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!rh", name = "lb", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!rh", name = "ob", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!rh", name = "ub", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!rh", name = "xb", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!rh", name = "zb", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!rh", name = "Ab", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!rh", name = "Bb", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!rh", name = "Cb", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!rh", name = "Db", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!rh", name = "Eb", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!rh", name = "Nb", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!rh", name = "Ob", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!rh", name = "Pb", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!rh", name = "Rb", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rh", name = "Tb", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rh", name = "Wb", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rh", name = "Yb", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rh", name = "cc", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!rh", name = "dc", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!rh", name = "gc", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!rh", name = "ic", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!rh", name = "jc", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!rh", name = "kc", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!rh", name = "mc", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!rh", name = "nc", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!rh", name = "oc", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Lbk;")
    private class341 field3057;

    @OriginalMember(owner = "client!rh", name = "Kb", descriptor = "Lrl;")
    private class659 field3112;

    @OriginalMember(owner = "client!rh", name = "Hb", descriptor = "Lfm;")
    private class669 field3109;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "S")
    private short field3041;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "S")
    private short field3051;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "S")
    private short field3063;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "S")
    private short field3074;

    @OriginalMember(owner = "client!rh", name = "Jb", descriptor = "S")
    private short field3111;

    @OriginalMember(owner = "client!rh", name = "Vb", descriptor = "S")
    private short field3123;

    @OriginalMember(owner = "client!rh", name = "bc", descriptor = "S")
    private short field3129;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "()V")
    public final void method879() {
        for (int var1 = 0; var1 < this.field3088; var1++) {
            this.field3100[var1] = this.field3100[var1] + 7 >> 4;
            this.field3062[var1] = this.field3062[var1] + 7 >> 4;
            this.field3093[var1] = this.field3093[var1] + 7 >> 4;
        }
        field3099++;
        this.field3053 = false;
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lq;Lmr;I)V")
    public final void method904(class389 arg0, class130 arg1, int arg2) {
        field3085++;
        if (this.field3107 == 0) {
            return;
        }
        class598 var4 = this.field3089.field5963;
        if (!this.field3053) {
            this.method1398(75);
        }
        class598 var5 = (class598) arg0;
        class423.field5639 = var4.field8503 * var5.field8502 + var4.field8502 * var5.field8476 + var4.field8484 * var5.field8491;
        class292.field3740 = var4.field8503 * var5.field8481 + var4.field8502 * var5.field8488 + var4.field8484 * var5.field8493 + var4.field8481;
        float var6 = (float) this.field3041 * class423.field5639 + class292.field3740;
        float var7 = (float) this.field3074 * class423.field5639 + class292.field3740;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = var7 - (float) this.field3123;
            var8 = (float) this.field3123 + var6;
        } else {
            var8 = (float) this.field3123 + var7;
            var9 = var6 - (float) this.field3123;
        }
        if ((var9 >= this.field3089.field5983) || ((float) this.field3089.field5994 >= var8)) {
            return;
        }
        class455.field6312 = var4.field8494 * var5.field8502 + var4.field8497 * var5.field8491 + var4.field8491 * var5.field8476;
        class377.field4893 = var4.field8494 * var5.field8481 + var4.field8497 * var5.field8493 + var4.field8491 * var5.field8488 + var4.field8493;
        float var10 = (float) this.field3041 * class455.field6312 + class377.field4893;
        float var11 = (float) this.field3074 * class455.field6312 + class377.field4893;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = (var11 - (float) this.field3123) * (float) this.field3089.field6029;
            var13 = ((float) this.field3123 + var10) * (float) this.field3089.field6029;
        } else {
            var12 = ((float) (-this.field3123) + var10) * (float) this.field3089.field6029;
            var13 = ((float) this.field3123 + var11) * (float) this.field3089.field6029;
        }
        if ((var12 / var8 >= this.field3089.field5977) || (var13 / var8 <= this.field3089.field5960)) {
            return;
        }
        class626.field8893 = var4.field8501 * var5.field8481 + var4.field8476 * var5.field8488 + var4.field8475 * var5.field8493 + var4.field8488;
        class592.field8418 = var4.field8501 * var5.field8502 + var4.field8476 * var5.field8476 + var4.field8475 * var5.field8491;
        float var14 = (float) this.field3041 * class592.field8418 + class626.field8893;
        float var15 = (float) this.field3074 * class592.field8418 + class626.field8893;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) (-this.field3123) + var15) * (float) this.field3089.field6039;
            var17 = ((float) this.field3123 + var14) * (float) this.field3089.field6039;
        } else {
            var17 = ((float) this.field3123 + var15) * (float) this.field3089.field6039;
            var16 = ((float) (-this.field3123) + var14) * (float) this.field3089.field6039;
        }
        if ((this.field3089.field6000 <= var16 / var8) || (this.field3089.field6002 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field3071 != null) {
            class115.field1340 = var4.field8494 * var5.field8503 + var4.field8497 * var5.field8494 + var4.field8491 * var5.field8501;
            class414.field5502 = var4.field8503 * var5.field8503 + var4.field8502 * var5.field8501 + var4.field8484 * var5.field8494;
            class412.field5472 = var4.field8501 * var5.field8503 + var4.field8476 * var5.field8501 + var4.field8475 * var5.field8494;
            class10.field97 = var4.field8503 * var5.field8484 + var4.field8502 * var5.field8475 + var4.field8484 * var5.field8497;
            class553.field7887 = var4.field8501 * var5.field8484 + var4.field8476 * var5.field8475 + var4.field8475 * var5.field8497;
            class571.field8096 = var4.field8494 * var5.field8484 + var4.field8497 * var5.field8497 + var4.field8491 * var5.field8475;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field3129 + this.field3051 >> 1;
            int var21 = this.field3111 + this.field3063 >> 1;
            int var22 = (int) ((float) var21 * class115.field1340 + (float) this.field3041 * class455.field6312 + (float) var20 * class571.field8096 + class377.field4893);
            int var23 = (int) ((float) var21 * class412.field5472 + (float) this.field3041 * class592.field8418 + (float) var20 * class553.field7887 + class626.field8893);
            int var24 = (int) ((float) var21 * class414.field5502 + (float) this.field3041 * class423.field5639 + (float) var20 * class10.field97 + class292.field3740);
            if (this.field3089.field5994 > var24) {
                var18 = true;
            } else {
                arg1.field1457 = this.field3089.field6039 * var23 / var24 + this.field3089.field6062;
                arg1.field1460 = this.field3089.field6029 * var22 / var24 + this.field3089.field5999;
            }
            int var25 = (int) ((float) var21 * class115.field1340 + (float) this.field3074 * class455.field6312 + (float) var20 * class571.field8096 + class377.field4893);
            int var26 = (int) ((float) var21 * class412.field5472 + (float) this.field3074 * class592.field8418 + (float) var20 * class553.field7887 + class626.field8893);
            int var27 = (int) ((float) var21 * class414.field5502 + (float) this.field3074 * class423.field5639 + (float) var20 * class10.field97 + class292.field3740);
            if (var27 >= this.field3089.field5994) {
                arg1.field1458 = this.field3089.field6029 * var25 / var27 + this.field3089.field5999;
                arg1.field1459 = this.field3089.field6039 * var26 / var27 + this.field3089.field6062;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field3089.field5994 > var24 && this.field3089.field5994 > var27) {
                    var19 = false;
                } else if (this.field3089.field5994 > var24) {
                    int var28 = (var27 - this.field3089.field5994 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field1460 = this.field3089.field6029 * var29 / this.field3089.field5994 + this.field3089.field5999;
                    arg1.field1457 = this.field3089.field6039 * var30 / this.field3089.field5994 + this.field3089.field6062;
                } else if (this.field3089.field5994 > var27) {
                    int var31 = (var24 - this.field3089.field5994 << 16) / (var24 - var27);
                    int var32 = var22 + ((var22 - var25) * var31 >> 16);
                    arg1.field1460 = this.field3089.field6029 * var32 / this.field3089.field5994 + this.field3089.field5999;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field1457 = this.field3089.field6062 + (this.field3089.field6039 * var33 / this.field3089.field5994);
                }
            }
            if (var19) {
                if (var24 <= var27) {
                    arg1.field1461 = this.field3089.field5999 + ((this.field3123 + var25) * this.field3089.field6029 / var27) - arg1.field1458;
                } else {
                    arg1.field1461 = (this.field3123 + var22) * this.field3089.field6029 / var24 + this.field3089.field5999 - arg1.field1460;
                }
                arg1.field1462 = true;
            }
        }
        this.field3089.method2365(42);
        this.field3089.method2383(var5, 0);
        this.method1391(0);
        this.field3089.method2357(23);
        this.method1396((byte) -118);
    }

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "()Z")
    public final boolean method868() {
        field3045++;
        if (this.field3094 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field3088; var1++) {
            this.field3100[var1] <<= 0x4;
            this.field3062[var1] <<= 0x4;
            this.field3093[var1] <<= 0x4;
        }
        class342.field4437 = 0;
        class172.field2053 = 0;
        class306.field3995 = 0;
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method885(class350 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3119++;
        class241 var6 = (class241) arg0;
        if (this.field3034 == 0 || var6.field3034 == 0) {
            return;
        }
        int var7 = var6.field3046;
        int[] var8 = var6.field3100;
        int[] var9 = var6.field3062;
        int[] var10 = var6.field3093;
        short[] var11 = var6.field3049;
        short[] var12 = var6.field3114;
        short[] var13 = var6.field3069;
        byte[] var14 = var6.field3068;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field3057 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field3057.field4434;
            var15 = this.field3057.field4436;
            var17 = this.field3057.field4432;
            var18 = this.field3057.field4435;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field3057 == null) {
            var19 = null;
            var22 = null;
            var21 = null;
            var20 = null;
        } else {
            var19 = var6.field3057.field4436;
            var20 = var6.field3057.field4435;
            var21 = var6.field3057.field4432;
            var22 = var6.field3057.field4434;
        }
        int[] var23 = var6.field3083;
        short[] var24 = var6.field3075;
        if (!var6.field3053) {
            var6.method1398(69);
        }
        short var25 = var6.field3041;
        short var26 = var6.field3074;
        short var27 = var6.field3051;
        short var28 = var6.field3129;
        short var29 = var6.field3111;
        short var30 = var6.field3063;
        for (int var31 = 0; var31 < this.field3046; var31++) {
            int var32 = this.field3062[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field3100[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field3093[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field3083[var31];
                        int var37 = this.field3083[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field3075[var38] - 1;
                            if (var35 == -1 || this.field3068[var35] != 0) {
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
                                            this.field3057 = new class341();
                                            var17 = this.field3057.field4432 = class232.method1348(this.field3049, (byte) 21);
                                            var18 = this.field3057.field4435 = class232.method1348(this.field3114, (byte) 21);
                                            var16 = this.field3057.field4434 = class232.method1348(this.field3069, (byte) 21);
                                            var15 = this.field3057.field4436 = class448.method2489(9, this.field3068);
                                        }
                                        if (var21 == null) {
                                            class341 var44 = var6.field3057 = new class341();
                                            var21 = var44.field4432 = class232.method1348(var11, (byte) 21);
                                            var20 = var44.field4435 = class232.method1348(var12, (byte) 21);
                                            var22 = var44.field4434 = class232.method1348(var13, (byte) 21);
                                            var19 = var44.field4436 = class448.method2489(9, var14);
                                        }
                                        short var45 = this.field3049[var35];
                                        short var46 = this.field3114[var35];
                                        short var47 = this.field3069[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field3068[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var21[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var19[var52] += var50;
                                            }
                                        }
                                        short var53 = var13[var40];
                                        short var54 = var12[var40];
                                        int var55 = this.field3083[var31 + 1];
                                        int var56 = this.field3083[var31];
                                        byte var57 = var14[var40];
                                        short var58 = var11[var40];
                                        for (int var59 = var56; var59 < var55; var59++) {
                                            int var60 = this.field3075[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var58;
                                                var18[var60] += var54;
                                                var16[var60] += var53;
                                                var15[var60] += var57;
                                            }
                                        }
                                        if (this.field3058 == null && this.field3098 != null) {
                                            this.field3098.field3163 = null;
                                        }
                                        if (this.field3058 != null) {
                                            this.field3058.field3163 = null;
                                        }
                                        if (var6.field3058 == null && var6.field3098 != null) {
                                            var6.field3098.field3163 = null;
                                        }
                                        if (var6.field3058 != null) {
                                            var6.field3058.field3163 = null;
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

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILcaa;)V")
    private final void method1389(int arg0, class272 arg1) {
        if (this.field3107 > this.field3089.field6074.length) {
            this.field3089.field6074 = new int[this.field3107];
            this.field3089.field6069 = new int[this.field3107];
        }
        field3095++;
        int[] var3 = this.field3089.field6074;
        int[] var4 = this.field3089.field6069;
        for (int var5 = 0; var5 < this.field3046; var5++) {
            int var17 = (this.field3100[var5] - (this.field3062[var5] * this.field3089.field6058 >> 8) >> this.field3089.field5927) - arg1.field3448;
            int var18 = (this.field3093[var5] - (this.field3062[var5] * this.field3089.field6040 >> 8) >> this.field3089.field5927) - arg1.field3446;
            int var19 = this.field3083[var5];
            int var20 = this.field3083[var5 + 1];
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field3075[var21] - 1;
                if (var22 == -1) {
                    break;
                }
                var3[var22] = var17;
                var4[var22] = var18;
            }
        }
        for (int var6 = 0; var6 < this.field3047; var6++) {
            if (this.field3135 == null || this.field3135[var6] <= 128) {
                short var8 = this.field3118[var6];
                short var9 = this.field3128[var6];
                short var10 = this.field3048[var6];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var3[var10];
                int var14 = var4[var8];
                int var15 = var4[var9];
                int var16 = var4[var10];
                if (((var11 - var12) * (var15 - var16) - ((var13 - var12) * (var15 - var14))) > 0) {
                    arg1.method1551(-114, var15, var12, var11, var14, var13, var16);
                }
            }
        }
        int var7 = -59 % ((43 - arg0) / 41);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lq;Lmr;II)V")
    public final void method871(class389 arg0, class130 arg1, int arg2, int arg3) {
        field3103++;
        if (this.field3107 == 0) {
            return;
        }
        class598 var5 = this.field3089.field5963;
        if (!this.field3053) {
            this.method1398(56);
        }
        class598 var6 = (class598) arg0;
        class423.field5639 = var5.field8503 * var6.field8502 + var5.field8502 * var6.field8476 + var5.field8484 * var6.field8491;
        class292.field3740 = var5.field8503 * var6.field8481 + var5.field8502 * var6.field8488 + var5.field8484 * var6.field8493 + var5.field8481;
        float var7 = (float) this.field3041 * class423.field5639 + class292.field3740;
        float var8 = (float) this.field3074 * class423.field5639 + class292.field3740;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field3123 + var7;
            var10 = (float) (-this.field3123) + var8;
        } else {
            var9 = (float) this.field3123 + var8;
            var10 = (float) (-this.field3123) + var7;
        }
        if ((this.field3089.field6005 <= var10) || (var9 <= (float) this.field3089.field5994)) {
            return;
        }
        class377.field4893 = var5.field8494 * var6.field8481 + var5.field8497 * var6.field8493 + var5.field8491 * var6.field8488 + var5.field8493;
        class455.field6312 = var5.field8494 * var6.field8502 + var5.field8497 * var6.field8491 + var5.field8491 * var6.field8476;
        float var11 = (float) this.field3041 * class455.field6312 + class377.field4893;
        float var12 = (float) this.field3074 * class455.field6312 + class377.field4893;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field3123 + var11) * (float) this.field3089.field6029;
            var14 = (var12 - (float) this.field3123) * (float) this.field3089.field6029;
        } else {
            var13 = ((float) this.field3123 + var12) * (float) this.field3089.field6029;
            var14 = ((float) (-this.field3123) + var11) * (float) this.field3089.field6029;
        }
        if ((this.field3089.field5977 <= var14 / (float) arg2) || (this.field3089.field5960 >= var13 / (float) arg2)) {
            return;
        }
        class592.field8418 = var5.field8501 * var6.field8502 + var5.field8476 * var6.field8476 + var5.field8475 * var6.field8491;
        class626.field8893 = var5.field8501 * var6.field8481 + var5.field8476 * var6.field8488 + var5.field8475 * var6.field8493 + var5.field8488;
        float var15 = (float) this.field3041 * class592.field8418 + class626.field8893;
        float var16 = (float) this.field3074 * class592.field8418 + class626.field8893;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = (var16 - (float) this.field3123) * (float) this.field3089.field6039;
            var18 = ((float) this.field3123 + var15) * (float) this.field3089.field6039;
        } else {
            var17 = (var15 - (float) this.field3123) * (float) this.field3089.field6039;
            var18 = ((float) this.field3123 + var16) * (float) this.field3089.field6039;
        }
        if ((var17 / (float) arg2 >= this.field3089.field6000) || (this.field3089.field6002 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field3071 != null) {
            class414.field5502 = var5.field8503 * var6.field8503 + var5.field8502 * var6.field8501 + var5.field8484 * var6.field8494;
            class115.field1340 = var5.field8494 * var6.field8503 + var5.field8497 * var6.field8494 + var5.field8491 * var6.field8501;
            class412.field5472 = var5.field8501 * var6.field8503 + var5.field8476 * var6.field8501 + var5.field8475 * var6.field8494;
            class10.field97 = var5.field8503 * var6.field8484 + var5.field8502 * var6.field8475 + var5.field8484 * var6.field8497;
            class553.field7887 = var5.field8501 * var6.field8484 + var5.field8476 * var6.field8475 + var5.field8475 * var6.field8497;
            class571.field8096 = var5.field8494 * var6.field8484 + var5.field8497 * var6.field8497 + var5.field8491 * var6.field8475;
        }
        if (arg1 != null) {
            int var19 = this.field3129 + this.field3051 >> 1;
            int var20 = this.field3111 + this.field3063 >> 1;
            int var21 = (int) ((float) var20 * class115.field1340 + (float) this.field3041 * class455.field6312 + (float) var19 * class571.field8096 + class377.field4893);
            int var22 = (int) ((float) var20 * class412.field5472 + (float) this.field3041 * class592.field8418 + (float) var19 * class553.field7887 + class626.field8893);
            int var23 = (int) ((float) var20 * class414.field5502 + (float) this.field3041 * class423.field5639 + (float) var19 * class10.field97 + class292.field3740);
            int var24 = (int) ((float) var20 * class115.field1340 + (float) this.field3074 * class455.field6312 + (float) var19 * class571.field8096 + class377.field4893);
            int var25 = (int) ((float) var20 * class412.field5472 + (float) this.field3074 * class592.field8418 + (float) var19 * class553.field7887 + class626.field8893);
            arg1.field1458 = this.field3089.field6029 * var24 / arg2 + this.field3089.field5999;
            arg1.field1457 = this.field3089.field6039 * var22 / arg2 + this.field3089.field6062;
            int var26 = (int) ((float) var20 * class414.field5502 + (float) this.field3074 * class423.field5639 + (float) var19 * class10.field97 + class292.field3740);
            arg1.field1459 = this.field3089.field6039 * var25 / arg2 + this.field3089.field6062;
            arg1.field1460 = this.field3089.field6029 * var21 / arg2 + this.field3089.field5999;
            if (this.field3089.field5994 > var23 && this.field3089.field5994 > var26) {
                arg1.field1462 = true;
                arg1.field1461 = (this.field3123 + var21) * this.field3089.field6029 / arg2 + this.field3089.field5999 - arg1.field1460;
            }
        }
        this.field3089.method2350((byte) 26, (float) arg2);
        this.field3089.method2393((byte) 93);
        this.field3089.method2383(var6, 0);
        this.method1391(0);
        this.field3089.method2357(52);
        this.method1396((byte) -70);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    private final void method1390(int arg0) {
        field3077++;
        if (!this.field3056) {
            return;
        }
        this.field3056 = false;
        if (this.field3125 == null && this.field3050 == null && this.field3071 == null) {
            if (this.field3100 != null && !class98.method606(1077541505, this.field3132, this.field3091)) {
                if (this.field3081 != null && this.field3081.field3163 == null) {
                    this.field3056 = true;
                } else {
                    if (!this.field3053) {
                        this.method1398(-117);
                    }
                    this.field3100 = null;
                }
            }
            if (this.field3062 != null && !class57.method388(this.field3132, this.field3091, (byte) 90)) {
                if (this.field3081 != null && this.field3081.field3163 == null) {
                    this.field3056 = true;
                } else {
                    if (!this.field3053) {
                        this.method1398(94);
                    }
                    this.field3062 = null;
                }
            }
            if (this.field3093 != null && !class547.method3095(this.field3091, true, this.field3132)) {
                if (this.field3081 != null && this.field3081.field3163 == null) {
                    this.field3056 = true;
                } else {
                    if (!this.field3053) {
                        this.method1398(-100);
                    }
                    this.field3093 = null;
                }
            }
        }
        if (this.field3075 != null && this.field3100 == null && this.field3062 == null && this.field3093 == null) {
            this.field3075 = null;
            this.field3083 = null;
        }
        if (this.field3068 != null && !class92.method584(this.field3132, this.field3091, 55)) {
            if (this.field3058 == null) {
                if (this.field3098 != null && this.field3098.field3163 == null) {
                    this.field3056 = true;
                } else {
                    this.field3049 = this.field3114 = this.field3069 = null;
                    this.field3068 = null;
                }
            } else if (this.field3058.field3163 == null) {
                this.field3056 = true;
            } else {
                this.field3049 = this.field3114 = this.field3069 = null;
                this.field3068 = null;
            }
        }
        if (this.field3113 != null && !class7.method35(this.field3091, false, this.field3132)) {
            if (this.field3098 != null && this.field3098.field3163 == null) {
                this.field3056 = true;
            } else {
                this.field3113 = null;
            }
        }
        if (this.field3135 != null && !class425.method2294(arg0 ^ 0x4E3C, this.field3132, this.field3091)) {
            if (this.field3098 != null && this.field3098.field3163 == null) {
                this.field3056 = true;
            } else {
                this.field3135 = null;
            }
        }
        if (this.field3110 != null && !class291.method1643(this.field3132, 30000, this.field3091)) {
            if (this.field3139 != null && this.field3139.field3163 == null) {
                this.field3056 = true;
            } else {
                this.field3110 = this.field3065 = null;
            }
        }
        if (this.field3054 != null && !class109.method680(this.field3091, this.field3132, (byte) -105)) {
            if (this.field3098 != null && this.field3098.field3163 == null) {
                this.field3056 = true;
            } else {
                this.field3054 = null;
            }
        }
        if (this.field3118 != null && !class604.method3369(this.field3091, -10683, this.field3132)) {
            if ((this.field3097 == null || this.field3097.field7074 != null) && (this.field3098 == null || this.field3098.field3163 != null)) {
                this.field3118 = this.field3128 = this.field3048 = null;
            } else {
                this.field3056 = true;
            }
        }
        if (this.field3122 != null && !class590.method3312(this.field3132, this.field3091, (byte) -128)) {
            this.field3122 = null;
            this.field3070 = null;
        }
        if (arg0 != -20029) {
            this.method1396((byte) -18);
        }
        if (this.field3094 != null && !class674.method3777(this.field3091, 1, this.field3132)) {
            this.field3080 = null;
            this.field3094 = null;
        }
        if (this.field3055 != null && !class255.method1457((byte) 85, this.field3132, this.field3091)) {
            this.field3055 = null;
        }
        if (this.field3127 != null && (this.field3132 & 0x800) == 0 && (this.field3132 & 0x40000) == 0) {
            this.field3127 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "()I")
    public final int method876() {
        if (!this.field3053) {
            this.method1398(-123);
        }
        field3092++;
        return this.field3129;
    }

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "()I")
    public final int method861() {
        field3039++;
        return this.field3082;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
    public final void method899(int arg0, int arg1, int arg2, int arg3) {
        field3126++;
        for (int var5 = 0; var5 < this.field3034; var5++) {
            int var9 = this.field3113[var5] & 0xFFFF;
            int var10 = (var9 & 0xFDA4) >> 10;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field3113[var5] = (short) class139.method776(var12, class139.method776(var11 << 7, var10 << 10));
        }
        if (this.field3071 != null) {
            for (int var6 = 0; var6 < this.field3120; var6++) {
                class14 var7 = this.field3071[var6];
                class286 var8 = this.field3108[var6];
                var8.field3665 = class505.field7285[this.field3113[var7.field131] & 0xFFFF] & 0xFFFFFF | var8.field3665 & 0xFF000000;
            }
        }
        if (this.field3098 != null) {
            this.field3098.field3163 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    private final void method1391(int arg0) {
        field3073++;
        if (this.field3047 == 0) {
            return;
        }
        if (this.field3133 != arg0) {
            this.method1392(true, (byte) 126);
        }
        this.method1392(false, (byte) 104);
        if (this.field3097 != null) {
            if (this.field3097.field7074 == null) {
                this.method1393((this.field3133 & 0x10) != 0, 5123);
            }
            if (this.field3097.field7074 != null) {
                this.field3089.method2400((byte) 122, this.field3058 != null);
                this.field3089.method2379(this.field3081, 15132, this.field3139, this.field3098, this.field3058);
                int var2 = this.field3127.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field3127[var3];
                    int var5 = this.field3127[var3 + 1];
                    int var6 = this.field3054[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field3089.method2348(this.field3058 != null, 4, var6);
                    this.field3089.method2364((var5 - var4) * 3, var4 * 3, 4, (byte) 106, this.field3097.field7074);
                }
            }
        }
        this.method1390(-20029);
    }

    @OriginalMember(owner = "client!rh", name = "DA", descriptor = "()I")
    public final int method864() {
        field3040++;
        if (!this.field3053) {
            this.method1398(-105);
        }
        return this.field3041;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZB)V")
    private final void method1392(boolean arg0, byte arg1) {
        field3038++;
        boolean var3 = this.field3098 != null && this.field3098.field3163 == null;
        boolean var4 = this.field3058 != null && this.field3058.field3163 == null;
        boolean var5 = this.field3081 != null && this.field3081.field3163 == null;
        boolean var6 = this.field3139 != null && this.field3139.field3163 == null;
        if (arg0) {
            var5 &= (this.field3133 & 0x1) != 0;
            var6 &= (this.field3133 & 0x8) != 0;
            var4 &= (this.field3133 & 0x4) != 0;
            var3 &= (this.field3133 & 0x2) != 0;
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
        if (this.field3107 * var7 <= this.field3089.field6033.field6209.length) {
            this.field3089.field6033.field6215 = 0;
        } else {
            this.field3089.field6033 = new class146((this.field3107 + 100) * var7);
        }
        if (arg1 <= 94) {
            this.method1395(-67, 91, -46, (byte) -118, 88, -119, 105, 20, 33);
        }
        class146 var12 = this.field3089.field6033;
        if (var5) {
            if (this.field3089.field6030) {
                for (int var21 = 0; var21 < this.field3046; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field3100[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field3062[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field3093[var21]);
                    int var25 = this.field3083[var21];
                    int var26 = this.field3083[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field3075[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6215 = var7 * var28;
                        var12.method2554(var22, 255);
                        var12.method2554(var23, 255);
                        var12.method2554(var24, 255);
                    }
                }
            } else {
                for (int var13 = 0; var13 < this.field3046; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field3100[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field3062[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field3093[var13]);
                    int var17 = this.field3083[var13];
                    int var18 = this.field3083[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field3075[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6215 = var7 * var20;
                        var12.method2564(-206972024, var14);
                        var12.method2564(-206972024, var15);
                        var12.method2564(-206972024, var16);
                    }
                }
            }
        }
        if (var3) {
            if (this.field3058 == null) {
                short[] var31;
                byte[] var32;
                short[] var33;
                short[] var34;
                if (this.field3057 == null) {
                    var33 = this.field3049;
                    var32 = this.field3068;
                    var31 = this.field3114;
                    var34 = this.field3069;
                } else {
                    var31 = this.field3057.field4435;
                    var32 = this.field3057.field4436;
                    var33 = this.field3057.field4432;
                    var34 = this.field3057.field4434;
                }
                float var35 = this.field3089.field6020[0];
                float var36 = this.field3089.field6020[1];
                float var37 = this.field3089.field6020[2];
                float var38 = this.field3089.field6055;
                float var39 = this.field3089.field6066 * 768.0F / (float) this.field3082;
                float var40 = this.field3089.field5964 * 768.0F / (float) this.field3082;
                for (int var41 = 0; var41 < this.field3034; var41++) {
                    int var42 = this.method1399(this.field3078, (byte) -11, this.field3054[var41], this.field3135[var41], this.field3113[var41]);
                    float var43 = (float) (var42 >> 8 & 0xFF) * this.field3089.field5989;
                    float var44 = (float) (var42 >> 16 & 0xFF) * this.field3089.field6004;
                    short var45 = this.field3118[var41];
                    float var46 = (float) (var42 >>> 24) * this.field3089.field6031;
                    short var47 = (short) var32[var45];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var45] * var37 + (float) var31[var45] * var36 + (float) var33[var45] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var45] * var37 + (float) var31[var45] * var36 + (float) var33[var45] * var35) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var46 * var49);
                    int var51 = (int) (var44 * var49);
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
                    var12.field6215 = var7 * var45 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method2525(var50, -81849);
                    var12.method2525(var51, -81849);
                    var12.method2525(var52, -81849);
                    var12.method2525(255 - (this.field3135[var41] & 0xFF), -81849);
                    short var53 = this.field3128[var41];
                    short var54 = (short) var32[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var33[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var36 + (float) var33[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * (var55 < 0.0F ? var40 : var39);
                    int var57 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var44 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var43 * var56);
                    var12.field6215 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method2525(var57, -81849);
                    var12.method2525(var58, -81849);
                    var12.method2525(var59, -81849);
                    var12.method2525(255 - (this.field3135[var41] & 0xFF), -81849);
                    short var60 = this.field3048[var41];
                    short var61 = (short) var32[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var33[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var36 + (float) var33[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = var38 + var62 * (var62 < 0.0F ? var40 : var39);
                    int var64 = (int) (var46 * var63);
                    int var65 = (int) (var44 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var43 * var63);
                    var12.field6215 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method2525(var64, -81849);
                    var12.method2525(var65, -81849);
                    var12.method2525(var66, -81849);
                    var12.method2525(255 - (this.field3135[var41] & 0xFF), -81849);
                }
            } else {
                for (int var29 = 0; var29 < this.field3034; var29++) {
                    int var30 = this.method1399(this.field3078, (byte) -11, this.field3054[var29], this.field3135[var29], this.field3113[var29]);
                    var12.field6215 = var9 + (this.field3118[var29] * var7);
                    var12.method2554(var30, 255);
                    var12.field6215 = this.field3128[var29] * var7 + var9;
                    var12.method2554(var30, 255);
                    var12.field6215 = var9 + (this.field3048[var29] * var7);
                    var12.method2554(var30, 255);
                }
            }
        }
        if (var4) {
            short[] var67;
            byte[] var68;
            short[] var69;
            short[] var70;
            if (this.field3057 == null) {
                var69 = this.field3049;
                var67 = this.field3114;
                var70 = this.field3069;
                var68 = this.field3068;
            } else {
                var67 = this.field3057.field4435;
                var68 = this.field3057.field4436;
                var69 = this.field3057.field4432;
                var70 = this.field3057.field4434;
            }
            float var71 = 3.0F / (float) this.field3082;
            float var72 = 3.0F / (float) (this.field3082 / 2 + this.field3082);
            var12.field6215 = var10;
            if (this.field3089.field6030) {
                for (int var76 = 0; var76 < this.field3107; var76++) {
                    int var77 = var68[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method797((float) var69[var76] * var72, (byte) -86);
                        var12.method797((float) var67[var76] * var72, (byte) -8);
                        var12.method797((float) var70[var76] * var72, (byte) 108);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method797((float) var69[var76] * var78, (byte) -66);
                        var12.method797((float) var67[var76] * var78, (byte) -122);
                        var12.method797((float) var70[var76] * var78, (byte) -20);
                    }
                    var12.field6215 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field3107; var73++) {
                    int var74 = var68[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method796(6144, (float) var69[var73] * var72);
                        var12.method796(6144, (float) var67[var73] * var72);
                        var12.method796(6144, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method796(6144, (float) var69[var73] * var75);
                        var12.method796(6144, (float) var67[var73] * var75);
                        var12.method796(6144, (float) var70[var73] * var75);
                    }
                    var12.field6215 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6215 = var11;
            if (this.field3089.field6030) {
                for (int var80 = 0; var80 < this.field3107; var80++) {
                    var12.method797(this.field3110[var80], (byte) 106);
                    var12.method797(this.field3065[var80], (byte) -61);
                    var12.field6215 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field3107; var79++) {
                    var12.method796(6144, this.field3110[var79]);
                    var12.method796(6144, this.field3065[var79]);
                    var12.field6215 += var7 - 8;
                }
            }
        }
        var12.field6215 = this.field3107 * var7;
        class659 var81;
        if (arg0) {
            if (this.field3112 == null) {
                this.field3112 = this.field3089.method2397(var12.field6209, true, var7, var12.field6215, (byte) -77);
            } else {
                this.field3112.method782((byte) 117, var12.field6215, var12.field6209, var7);
            }
            var81 = this.field3112;
            this.field3133 = 0;
        } else {
            var81 = this.field3089.method2397(var12.field6209, false, var7, var12.field6215, (byte) -124);
            this.field3056 = true;
        }
        if (var5) {
            this.field3081.field3163 = var81;
            this.field3081.field3165 = var8;
        }
        if (var6) {
            this.field3139.field3163 = var81;
            this.field3139.field3165 = var11;
        }
        if (var3) {
            this.field3098.field3163 = var81;
            this.field3098.field3165 = var9;
        }
        if (var4) {
            this.field3058.field3165 = var10;
            this.field3058.field3163 = var81;
        }
    }

    @OriginalMember(owner = "client!rh", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final void method900(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field3102++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class306.field3995 = 0;
            int var13 = 0;
            class342.field4437 = 0;
            class172.field2053 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field3094.length > var15) {
                    int[] var16 = this.field3094[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field3080 == null || (this.field3080[var18] & arg6) != 0) {
                            class172.field2053 += this.field3100[var18];
                            class342.field4437 += this.field3062[var18];
                            var13++;
                            class306.field3995 += this.field3093[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class172.field2053 = class172.field2053 / var13 + var11;
                class18.field165 = true;
                class342.field4437 = class342.field4437 / var13 + var10;
                class306.field3995 = class306.field3995 / var13 + var12;
            } else {
                class342.field4437 = var10;
                class172.field2053 = var11;
                class306.field3995 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + 8192 - (-(arg7[1] * arg3) + -(arg7[2] * arg4)) >> 14;
                int var20 = arg7[3] * arg2 + (arg7[4] * arg3) + (arg7[5] * arg4) + 8192 >> 14;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + (arg7[8] * arg4) + 8192 >> 14;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg4 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field3094.length > var26) {
                    int[] var27 = this.field3094[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field3080 == null || (this.field3080[var29] & arg6) != 0) {
                            this.field3100[var29] += var24;
                            this.field3062[var29] += var22;
                            this.field3093[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field3094.length) {
                        int[] var50 = this.field3094[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field3080 == null || (this.field3080[var52] & arg6) != 0) {
                                this.field3100[var52] -= class172.field2053;
                                this.field3062[var52] -= class342.field4437;
                                this.field3093[var52] -= class306.field3995;
                                if (arg4 != 0) {
                                    int var53 = class285.field3655[arg4];
                                    int var54 = class285.field3656[arg4];
                                    int var55 = this.field3100[var52] * var54 + this.field3062[var52] * var53 + 16383 >> 14;
                                    this.field3062[var52] = this.field3062[var52] * var54 + (16383 - (this.field3100[var52] * var53)) >> 14;
                                    this.field3100[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class285.field3655[arg2];
                                    int var57 = class285.field3656[arg2];
                                    int var58 = this.field3062[var52] * var57 + 16383 - (this.field3093[var52] * var56) >> 14;
                                    this.field3093[var52] = this.field3062[var52] * var56 + (this.field3093[var52] * var57 + 16383) >> 14;
                                    this.field3062[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class285.field3655[arg3];
                                    int var60 = class285.field3656[arg3];
                                    int var61 = this.field3100[var52] * var60 + this.field3093[var52] * var59 + 16383 >> 14;
                                    this.field3093[var52] = this.field3093[var52] * var60 + 16383 - this.field3100[var52] * var59 >> 14;
                                    this.field3100[var52] = var61;
                                }
                                this.field3100[var52] += class172.field2053;
                                this.field3062[var52] += class342.field4437;
                                this.field3093[var52] += class306.field3995;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field3094.length > var32) {
                            int[] var33 = this.field3094[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field3080 == null || (this.field3080[var35] & arg6) != 0) {
                                    int var36 = this.field3083[var35];
                                    int var37 = this.field3083[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field3075[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class285.field3655[arg4];
                                            int var41 = class285.field3656[arg4];
                                            int var42 = this.field3114[var39] * var40 + this.field3049[var39] * var41 + 16383 >> 14;
                                            this.field3114[var39] = (short) (this.field3114[var39] * var41 + (16383 - (this.field3049[var39] * var40)) >> 14);
                                            this.field3049[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class285.field3655[arg2];
                                            int var44 = class285.field3656[arg2];
                                            int var45 = this.field3114[var39] * var44 + 16383 - (this.field3069[var39] * var43) >> 14;
                                            this.field3069[var39] = (short) (this.field3069[var39] * var44 + this.field3114[var39] * var43 + 16383 >> 14);
                                            this.field3114[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class285.field3655[arg3];
                                            int var47 = class285.field3656[arg3];
                                            int var48 = this.field3069[var39] * var46 + (this.field3049[var39] * var47 + 16383) >> 14;
                                            this.field3069[var39] = (short) (this.field3069[var39] * var47 + 16383 - (this.field3049[var39] * var46) >> 14);
                                            this.field3049[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field3058 == null && this.field3098 != null) {
                        this.field3098.field3163 = null;
                    }
                    if (this.field3058 != null) {
                        this.field3058.field3163 = null;
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
                if (class18.field165) {
                    int var68 = arg7[0] * class172.field2053 + arg7[3] * class342.field4437 + arg7[6] * class306.field3995 + 8192 >> 14;
                    int var69 = arg7[7] * class306.field3995 + arg7[4] * class342.field4437 + arg7[1] * class172.field2053 + 8192 >> 14;
                    int var70 = var65 + var68;
                    int var71 = var66 + var69;
                    int var72 = arg7[8] * class306.field3995 + (arg7[5] * class342.field4437 + arg7[2] * class172.field2053 + 8192) >> 14;
                    class172.field2053 = var70;
                    int var73 = var67 + var72;
                    class342.field4437 = var71;
                    class18.field165 = false;
                    class306.field3995 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class285.field3656[arg2];
                int var76 = class285.field3655[arg2];
                int var77 = class285.field3656[arg3];
                int var78 = class285.field3655[arg3];
                int var79 = class285.field3656[arg4];
                int var80 = class285.field3655[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[1] = var78 * var81 + (-var77 * var80 + 8192) >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = var77 * var82 + -var78 * var79 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[5] = -var76;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                int var83 = var74[2] * -class306.field3995 + var74[0] * -class172.field2053 - (-(var74[1] * -class342.field4437) - 8192) >> 14;
                int var84 = var74[5] * -class306.field3995 + var74[3] * -class172.field2053 + var74[4] * -class342.field4437 + 8192 >> 14;
                int var85 = var74[7] * -class342.field4437 + var74[6] * -class172.field2053 + (var74[8] * -class306.field3995) + 8192 >> 14;
                int var86 = var83 + class172.field2053;
                int var87 = class342.field4437 + var84;
                int var88 = class306.field3995 + var85;
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
                int var91 = var74[0] * var65 + (var74[1] * var66) + (var74[2] * var67 - -8192) >> 14;
                int var92 = var74[4] * var66 + var74[5] * var67 + var74[3] * var65 + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var74[7] * var66 + var74[6] * var65 + var74[8] * var67 + 8192 >> 14;
                int var95 = var87 + var92;
                int var96 = var88 + var94;
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
                int var99 = arg7[2] * var96 + arg7[1] * var95 + arg7[0] * var93 + 8192 >> 14;
                int var100 = arg7[4] * var95 + arg7[3] * var93 + arg7[5] * var96 + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = arg7[6] * var93 + arg7[7] * var95 - (-(arg7[8] * var96) + -8192) >> 14;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field3094.length > var106) {
                        int[] var107 = this.field3094[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field3080 == null || (this.field3080[var109] & arg6) != 0) {
                                int var110 = this.field3100[var109] * var97[0] + this.field3093[var109] * var97[2] + this.field3062[var109] * var97[1] + 8192 >> 14;
                                int var111 = this.field3093[var109] * var97[5] + this.field3100[var109] * var97[3] + this.field3062[var109] * var97[4] + 8192 >> 14;
                                int var112 = var101 + var110;
                                int var113 = var103 + var111;
                                int var114 = this.field3093[var109] * var97[8] + this.field3062[var109] * var97[7] + (this.field3100[var109] * var97[6] - -8192) >> 14;
                                int var115 = var104 + var114;
                                this.field3100[var109] = var112;
                                this.field3062[var109] = var113;
                                this.field3093[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field3094.length) {
                        int[] var124 = this.field3094[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field3080 == null || (arg6 & this.field3080[var126]) != 0) {
                                this.field3100[var126] -= class172.field2053;
                                this.field3062[var126] -= class342.field4437;
                                this.field3093[var126] -= class306.field3995;
                                this.field3100[var126] = this.field3100[var126] * arg2 >> 7;
                                this.field3062[var126] = this.field3062[var126] * arg3 >> 7;
                                this.field3093[var126] = this.field3093[var126] * arg4 >> 7;
                                this.field3100[var126] += class172.field2053;
                                this.field3062[var126] += class342.field4437;
                                this.field3093[var126] += class306.field3995;
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
                if (class18.field165) {
                    int var133 = arg7[3] * class342.field4437 + arg7[0] * class172.field2053 + arg7[6] * class306.field3995 + 8192 >> 14;
                    int var134 = arg7[1] * class172.field2053 - (-(arg7[4] * class342.field4437) - arg7[7] * class306.field3995 - 8192) >> 14;
                    int var135 = var131 + var134;
                    int var136 = arg7[8] * class306.field3995 + arg7[5] * class342.field4437 + arg7[2] * class172.field2053 + 8192 >> 14;
                    int var137 = var130 + var133;
                    class172.field2053 = var137;
                    class342.field4437 = var135;
                    int var138 = var132 + var136;
                    class18.field165 = false;
                    class306.field3995 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class172.field2053 * var139 + 8192 >> 14;
                int var143 = -class342.field4437 * var140 + 8192 >> 14;
                int var144 = -class306.field3995 * var141 + 8192 >> 14;
                int var145 = class172.field2053 + var142;
                int var146 = class342.field4437 + var143;
                int var147 = var144 + class306.field3995;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
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
                int var157 = arg7[0] * var153 + (arg7[1] * var152 - (-(arg7[2] * var154) - 8192)) >> 14;
                int var158 = arg7[5] * var154 + arg7[4] * var152 + arg7[3] * var153 + 8192 >> 14;
                int var159 = arg7[8] * var154 + (arg7[6] * var153 + (arg7[7] * var152)) + 8192 >> 14;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field3094.length > var164) {
                        int[] var165 = this.field3094[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field3080 == null || (arg6 & this.field3080[var167]) != 0) {
                                int var168 = this.field3100[var167] * var155[0] + 8192 - (-(this.field3062[var167] * var155[1]) - this.field3093[var167] * var155[2]) >> 14;
                                int var169 = this.field3100[var167] * var155[3] + 8192 - (-(this.field3062[var167] * var155[4]) - this.field3093[var167] * var155[5]) >> 14;
                                int var170 = var161 + var169;
                                int var171 = var160 + var168;
                                int var172 = this.field3100[var167] * var155[6] + this.field3062[var167] * var155[7] + this.field3093[var167] * var155[8] + 8192 >> 14;
                                int var173 = var162 + var172;
                                this.field3100[var167] = var171;
                                this.field3062[var167] = var170;
                                this.field3093[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3122 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field3122.length) {
                        int[] var182 = this.field3122[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field3070 == null || (arg6 & this.field3070[var184]) != 0) {
                                int var185 = (this.field3135[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field3135[var184] = (byte) var185;
                                if (this.field3098 != null) {
                                    this.field3098.field3163 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3071 != null) {
                    for (int var178 = 0; var178 < this.field3120; var178++) {
                        class14 var179 = this.field3071[var178];
                        class286 var180 = this.field3108[var178];
                        var180.field3665 = var180.field3665 & 0xFFFFFF | 255 - (this.field3135[var179.field131] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3122 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field3122.length > var190) {
                        int[] var191 = this.field3122[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field3070 == null || (arg6 & this.field3070[var193]) != 0) {
                                int var194 = this.field3113[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD07) >> 10;
                                int var196 = (var194 & 0x38F) >> 7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = var194 & 0x7F;
                                int var199 = arg2 + var195 & 0x3F;
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
                                this.field3113[var193] = (short) class139.method776(var200, class139.method776(var199 << 10, var197 << 7));
                                if (this.field3098 != null) {
                                    this.field3098.field3163 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field3071 != null) {
                    for (int var187 = 0; var187 < this.field3120; var187++) {
                        class14 var188 = this.field3071[var187];
                        class286 var189 = this.field3108[var187];
                        var189.field3665 = class505.field7285[this.field3113[var188.field131] & 0xFFFF] & 0xFFFFFF | var189.field3665 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3055 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field3055.length > var202) {
                        int[] var203 = this.field3055[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class286 var205 = this.field3108[var203[var204]];
                            var205.field3659 += arg3;
                            var205.field3668 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3055 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field3055.length > var207) {
                        int[] var208 = this.field3055[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class286 var210 = this.field3108[var208[var209]];
                            var210.field3664 = var210.field3664 * arg2 >> 7;
                            var210.field3669 = var210.field3669 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3055 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field3055.length) {
                    int[] var213 = this.field3055[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class286 var215 = this.field3108[var213[var214]];
                        var215.field3670 = var215.field3670 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "LA", descriptor = "()I")
    public final int method880() {
        if (!this.field3053) {
            this.method1398(7);
        }
        field3101++;
        return this.field3111;
    }

    @OriginalMember(owner = "client!rh", name = "ia", descriptor = "(I)V")
    public final void method874(int arg0) {
        field3044++;
        this.field3132 = arg0;
        if (this.field3057 != null && (this.field3132 & 0x10000) == 0) {
            this.field3114 = this.field3057.field4435;
            this.field3068 = this.field3057.field4436;
            this.field3069 = this.field3057.field4434;
            this.field3049 = this.field3057.field4432;
            this.field3057 = null;
        }
        this.field3056 = true;
        this.method1390(-20029);
    }

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "(Lw;)Lw;")
    public final class269 method883(class269 arg0) {
        field3043++;
        if (this.field3107 == 0) {
            return null;
        }
        if (!this.field3053) {
            this.method1398(-124);
        }
        int var2;
        int var3;
        if (this.field3089.field6058 <= 0) {
            var2 = this.field3051 - (this.field3089.field6058 * this.field3041 >> 8) >> this.field3089.field5927;
            var3 = this.field3129 - (this.field3089.field6058 * this.field3074 >> 8) >> this.field3089.field5927;
        } else {
            var2 = this.field3051 - (this.field3089.field6058 * this.field3074 >> 8) >> this.field3089.field5927;
            var3 = this.field3129 - (this.field3089.field6058 * this.field3041 >> 8) >> this.field3089.field5927;
        }
        int var4;
        int var5;
        if (this.field3089.field6040 <= 0) {
            var4 = this.field3111 - (this.field3089.field6040 * this.field3041 >> 8) >> this.field3089.field5927;
            var5 = this.field3063 - (this.field3089.field6040 * this.field3074 >> 8) >> this.field3089.field5927;
        } else {
            var4 = this.field3111 - (this.field3089.field6040 * this.field3074 >> 8) >> this.field3089.field5927;
            var5 = this.field3063 - (this.field3089.field6040 * this.field3041 >> 8) >> this.field3089.field5927;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class272 var8 = (class272) arg0;
        class272 var9;
        if (var8 != null && var8.method1553(false, var6, var7)) {
            var9 = var8;
            var8.method1556((byte) 78);
        } else {
            var9 = new class272(this.field3089, var6, var7);
        }
        var9.method1550(var4, var3, 643436272, var5, var2);
        this.method1389(-27, var9);
        return var9;
    }

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "(I[IIIIIZ)V")
    public final void method915(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3090++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = 0;
            class306.field3995 = 0;
            class342.field4437 = 0;
            class172.field2053 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field3094.length > var14) {
                    int[] var15 = this.field3094[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class172.field2053 += this.field3100[var17];
                        class342.field4437 += this.field3062[var17];
                        var12++;
                        class306.field3995 += this.field3093[var17];
                    }
                }
            }
            if (var12 > 0) {
                class306.field3995 = class306.field3995 / var12 + var9;
                class342.field4437 = class342.field4437 / var12 + var11;
                class172.field2053 = class172.field2053 / var12 + var10;
            } else {
                class306.field3995 = var9;
                class342.field4437 = var11;
                class172.field2053 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg3 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field3094.length) {
                    int[] var23 = this.field3094[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field3100[var25] += var20;
                        this.field3062[var25] += var19;
                        this.field3093[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field3094.length) {
                    int[] var46 = this.field3094[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field3100[var59] -= class172.field2053;
                            this.field3062[var59] -= class342.field4437;
                            this.field3093[var59] -= class306.field3995;
                            if (arg4 != 0) {
                                int var60 = class285.field3655[arg4];
                                int var61 = class285.field3656[arg4];
                                int var62 = this.field3100[var59] * var61 + this.field3062[var59] * var60 + 16383 >> 14;
                                this.field3062[var59] = this.field3062[var59] * var61 + 16383 - (this.field3100[var59] * var60) >> 14;
                                this.field3100[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class285.field3655[arg2];
                                int var64 = class285.field3656[arg2];
                                int var65 = this.field3062[var59] * var64 + 16383 - (this.field3093[var59] * var63) >> 14;
                                this.field3093[var59] = this.field3093[var59] * var64 + this.field3062[var59] * var63 + 16383 >> 14;
                                this.field3062[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class285.field3655[arg3];
                                int var67 = class285.field3656[arg3];
                                int var68 = this.field3100[var59] * var67 + this.field3093[var59] * var66 + 16383 >> 14;
                                this.field3093[var59] = this.field3093[var59] * var67 + 16383 - (this.field3100[var59] * var66) >> 14;
                                this.field3100[var59] = var68;
                            }
                            this.field3100[var59] += class172.field2053;
                            this.field3062[var59] += class342.field4437;
                            this.field3093[var59] += class306.field3995;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field3100[var48] -= class172.field2053;
                            this.field3062[var48] -= class342.field4437;
                            this.field3093[var48] -= class306.field3995;
                            if (arg2 != 0) {
                                int var49 = class285.field3655[arg2];
                                int var50 = class285.field3656[arg2];
                                int var51 = this.field3062[var48] * var50 + 16383 - (this.field3093[var48] * var49) >> 14;
                                this.field3093[var48] = this.field3093[var48] * var50 + (this.field3062[var48] * var49 + 16383) >> 14;
                                this.field3062[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class285.field3655[arg4];
                                int var53 = class285.field3656[arg4];
                                int var54 = this.field3062[var48] * var52 + (this.field3100[var48] * var53) + 16383 >> 14;
                                this.field3062[var48] = this.field3062[var48] * var53 + 16383 - (this.field3100[var48] * var52) >> 14;
                                this.field3100[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class285.field3655[arg3];
                                int var56 = class285.field3656[arg3];
                                int var57 = this.field3093[var48] * var55 + (this.field3100[var48] * var56) + 16383 >> 14;
                                this.field3093[var48] = this.field3093[var48] * var56 - (this.field3100[var48] * var55 - 16383) >> 14;
                                this.field3100[var48] = var57;
                            }
                            this.field3100[var48] += class172.field2053;
                            this.field3062[var48] += class342.field4437;
                            this.field3093[var48] += class306.field3995;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field3094.length) {
                        int[] var29 = this.field3094[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field3083[var31];
                            int var33 = this.field3083[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field3075[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class285.field3655[arg4];
                                    int var37 = class285.field3656[arg4];
                                    int var38 = this.field3049[var35] * var37 + (this.field3114[var35] * var36 + 16383) >> 14;
                                    this.field3114[var35] = (short) (this.field3114[var35] * var37 + 16383 - (this.field3049[var35] * var36) >> 14);
                                    this.field3049[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class285.field3655[arg2];
                                    int var40 = class285.field3656[arg2];
                                    int var41 = this.field3114[var35] * var40 + 16383 - (this.field3069[var35] * var39) >> 14;
                                    this.field3069[var35] = (short) (this.field3114[var35] * var39 + this.field3069[var35] * var40 + 16383 >> 14);
                                    this.field3114[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class285.field3655[arg3];
                                    int var43 = class285.field3656[arg3];
                                    int var44 = this.field3069[var35] * var42 - (-(this.field3049[var35] * var43) - 16383) >> 14;
                                    this.field3069[var35] = (short) (this.field3069[var35] * var43 + 16383 - (this.field3049[var35] * var42) >> 14);
                                    this.field3049[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field3058 == null && this.field3098 != null) {
                    this.field3098.field3163 = null;
                }
                if (this.field3058 != null) {
                    this.field3058.field3163 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field3094.length > var70) {
                    int[] var71 = this.field3094[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field3100[var73] -= class172.field2053;
                        this.field3062[var73] -= class342.field4437;
                        this.field3093[var73] -= class306.field3995;
                        this.field3100[var73] = this.field3100[var73] * arg2 >> 7;
                        this.field3062[var73] = this.field3062[var73] * arg3 >> 7;
                        this.field3093[var73] = this.field3093[var73] * arg4 >> 7;
                        this.field3100[var73] += class172.field2053;
                        this.field3062[var73] += class342.field4437;
                        this.field3093[var73] += class306.field3995;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field3122 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field3122.length > var78) {
                        int[] var79 = this.field3122[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field3135[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field3135[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field3098 != null) {
                            this.field3098.field3163 = null;
                        }
                    }
                }
                if (this.field3071 != null) {
                    for (int var75 = 0; var75 < this.field3120; var75++) {
                        class14 var76 = this.field3071[var75];
                        class286 var77 = this.field3108[var75];
                        var77.field3665 = 255 - (this.field3135[var76.field131] & 0xFF) << 24 | var77.field3665 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field3122 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field3122.length) {
                        int[] var88 = this.field3122[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field3113[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3AC) >> 7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field3113[var90] = (short) class139.method776(var97, class139.method776(var94 << 7, var95 << 10));
                        }
                        if (var88.length > 0 && this.field3098 != null) {
                            this.field3098.field3163 = null;
                        }
                    }
                }
                if (this.field3071 != null) {
                    for (int var84 = 0; var84 < this.field3120; var84++) {
                        class14 var85 = this.field3071[var84];
                        class286 var86 = this.field3108[var84];
                        var86.field3665 = var86.field3665 & 0xFF000000 | class505.field7285[this.field3113[var85.field131] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field3055 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field3055.length > var99) {
                        int[] var100 = this.field3055[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class286 var102 = this.field3108[var100[var101]];
                            var102.field3659 += arg3;
                            var102.field3668 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field3055 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field3055.length > var104) {
                        int[] var105 = this.field3055[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class286 var107 = this.field3108[var105[var106]];
                            var107.field3669 = var107.field3669 * arg3 >> 7;
                            var107.field3664 = var107.field3664 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field3055 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field3055.length > var109) {
                    int[] var110 = this.field3055[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class286 var112 = this.field3108[var110[var111]];
                        var112.field3670 = var112.field3670 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "ka", descriptor = "(SS)V")
    public final void method916(short arg0, short arg1) {
        field3087++;
        class486 var3 = this.field3089.field8990;
        for (int var4 = 0; var4 < this.field3034; var4++) {
            if (this.field3054[var4] == arg0) {
                this.field3054[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class414 var7 = var3.method846((byte) -120, arg0 & 0xFFFF);
            var5 = var7.field5484;
            var6 = var7.field5482;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class414 var10 = var3.method846((byte) -112, arg1 & 0xFFFF);
            var8 = var10.field5484;
            var9 = var10.field5482;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field3071 != null) {
            for (int var11 = 0; var11 < this.field3120; var11++) {
                class14 var12 = this.field3071[var11];
                class286 var13 = this.field3108[var11];
                var13.field3665 = class505.field7285[this.field3113[var12.field131] & 0xFFFF] & 0xFFFFFF | var13.field3665 & 0xFF000000;
            }
        }
        if (this.field3098 != null) {
            this.field3098.field3163 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
    private final void method1393(boolean arg0, int arg1) {
        if ((this.field3047 * 6) > this.field3089.field6033.field6209.length) {
            this.field3089.field6033 = new class146(this.field3047 * 6 + 600);
        } else {
            this.field3089.field6033.field6215 = 0;
        }
        field3124++;
        class146 var3 = this.field3089.field6033;
        if (this.field3089.field6030) {
            for (int var5 = 0; var5 < this.field3047; var5++) {
                var3.method2537(18244, this.field3118[var5]);
                var3.method2537(18244, this.field3128[var5]);
                var3.method2537(18244, this.field3048[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field3047; var4++) {
                var3.method2568((byte) -31, this.field3118[var4]);
                var3.method2568((byte) -31, this.field3128[var4]);
                var3.method2568((byte) -31, this.field3048[var4]);
            }
        }
        if (var3.field6215 == 0) {
            return;
        }
        if (arg0) {
            if (this.field3109 == null) {
                this.field3109 = this.field3089.method2381(true, (byte) -76, var3.field6209, var3.field6215, 5123);
            } else {
                this.field3109.method4(var3.field6215, (byte) 5, var3.field6209, 5123);
            }
            this.field3097.field7074 = this.field3109;
        } else {
            this.field3097.field7074 = this.field3089.method2381(false, (byte) -76, var3.field6209, var3.field6215, 5123);
        }
        if (!arg0) {
            this.field3056 = true;
        }
        if (arg1 != 5123) {
            this.field3089 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "(I)V")
    public final void method911(int arg0) {
        if (this.field3098 != null) {
            this.field3098.field3163 = null;
        }
        field3059++;
        this.field3078 = (short) arg0;
    }

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "(I)V")
    public final void method903(int arg0) {
        field3035++;
        int var2 = class285.field3655[arg0];
        int var3 = class285.field3656[arg0];
        for (int var4 = 0; var4 < this.field3046; var4++) {
            int var5 = this.field3093[var4] * var2 + (this.field3100[var4] * var3) >> 14;
            this.field3093[var4] = this.field3093[var4] * var3 - this.field3100[var4] * var2 >> 14;
            this.field3100[var4] = var5;
        }
        this.field3053 = false;
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()[Lhaa;")
    public final class73[] method882() {
        field3117++;
        return this.field3050;
    }

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "()I")
    public final int method902() {
        field3036++;
        return this.field3132;
    }

    @OriginalMember(owner = "client!rh", name = "ha", descriptor = "()I")
    public final int method912() {
        field3142++;
        if (!this.field3053) {
            this.method1398(-121);
        }
        return this.field3051;
    }

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "(I)V")
    public final void method870(int arg0) {
        field3106++;
        int var2 = class285.field3655[arg0];
        int var3 = class285.field3656[arg0];
        for (int var4 = 0; var4 < this.field3046; var4++) {
            int var5 = this.field3100[var4] * var3 + this.field3062[var4] * var2 >> 14;
            this.field3062[var4] = this.field3062[var4] * var3 - (this.field3100[var4] * var2) >> 14;
            this.field3100[var4] = var5;
        }
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
        this.field3053 = false;
    }

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "(III)V")
    public final void method862(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3046; var4++) {
            if (arg0 != 0) {
                this.field3100[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field3062[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field3093[var4] += arg2;
            }
        }
        field3104++;
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
        this.field3053 = false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIZ)Lba;")
    public final class350 method602(byte arg0, int arg1, boolean arg2) {
        field3037++;
        class241 var4;
        class241 var5;
        if (arg0 == 1) {
            var5 = this.field3089.field5959;
            var4 = this.field3089.field5950;
        } else if (arg0 == 2) {
            var4 = this.field3089.field5956;
            var5 = this.field3089.field5990;
        } else if (arg0 == 3) {
            var4 = this.field3089.field6065;
            var5 = this.field3089.field5973;
        } else if (arg0 == 4) {
            var5 = this.field3089.field6024;
            var4 = this.field3089.field5976;
        } else if (arg0 == 5) {
            var4 = this.field3089.field6035;
            var5 = this.field3089.field6054;
        } else {
            var4 = var5 = new class241(this.field3089);
        }
        return this.method1400((byte) -4, arg2, var5, var4, arg0 != 0, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "va", descriptor = "(I)V")
    public final void method905(int arg0) {
        field3072++;
        if (this.field3098 != null) {
            this.field3098.field3163 = null;
        }
        this.field3082 = (short) arg0;
        if (this.field3058 != null) {
            this.field3058.field3163 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method910(int arg0, int arg1, class389 arg2, boolean arg3) {
        field3134++;
        class598 var5 = (class598) arg2;
        class598 var6 = this.field3089.field5963;
        float var7 = var5.field8481 * var6.field8494 + var5.field8493 * var6.field8497 + var5.field8488 * var6.field8491 + var6.field8493;
        float var8 = var5.field8481 * var6.field8501 + var5.field8493 * var6.field8475 + var5.field8488 * var6.field8476 + var6.field8488;
        class455.field6312 = var5.field8502 * var6.field8494 + var5.field8491 * var6.field8497 + var5.field8476 * var6.field8491;
        float var9 = var5.field8481 * var6.field8503 + var5.field8493 * var6.field8484 + var5.field8488 * var6.field8502 + var6.field8481;
        class571.field8096 = var5.field8484 * var6.field8494 + var5.field8497 * var6.field8497 + var5.field8475 * var6.field8491;
        class414.field5502 = var5.field8503 * var6.field8503 + var5.field8501 * var6.field8502 + var5.field8494 * var6.field8484;
        class115.field1340 = var5.field8503 * var6.field8494 + var5.field8501 * var6.field8491 + var5.field8494 * var6.field8497;
        class412.field5472 = var5.field8503 * var6.field8501 + var5.field8501 * var6.field8476 + var5.field8494 * var6.field8475;
        class592.field8418 = var5.field8502 * var6.field8501 + var5.field8491 * var6.field8475 + var5.field8476 * var6.field8476;
        class423.field5639 = var5.field8502 * var6.field8503 + var5.field8491 * var6.field8484 + var5.field8476 * var6.field8502;
        class10.field97 = var5.field8484 * var6.field8503 + var5.field8497 * var6.field8484 + var5.field8475 * var6.field8502;
        class553.field7887 = var5.field8484 * var6.field8501 + var5.field8497 * var6.field8475 + var5.field8475 * var6.field8476;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field3089.field6029;
        int var16 = this.field3089.field6039;
        if (!this.field3053) {
            this.method1398(-117);
        }
        class420.field5589[0] = this.field3051;
        class156.field1756[0] = this.field3041;
        class101.field1100[0] = this.field3111;
        class420.field5589[1] = this.field3129;
        class156.field1756[1] = this.field3041;
        class420.field5589[2] = this.field3051;
        class101.field1100[1] = this.field3111;
        class156.field1756[2] = this.field3074;
        class420.field5589[3] = this.field3129;
        class101.field1100[2] = this.field3111;
        class156.field1756[3] = this.field3074;
        class101.field1100[3] = this.field3111;
        class420.field5589[4] = this.field3051;
        class156.field1756[4] = this.field3041;
        class420.field5589[5] = this.field3129;
        class101.field1100[4] = this.field3063;
        class156.field1756[5] = this.field3041;
        class101.field1100[5] = this.field3063;
        class420.field5589[6] = this.field3051;
        class156.field1756[6] = this.field3074;
        class420.field5589[7] = this.field3129;
        class101.field1100[6] = this.field3063;
        class156.field1756[7] = this.field3074;
        class101.field1100[7] = this.field3063;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class101.field1100[var17];
            float var39 = (float) class420.field5589[var17];
            float var40 = (float) class156.field1756[var17];
            float var41 = class414.field5502 * var38 + class423.field5639 * var40 + class10.field97 * var39 + var9;
            float var42 = class412.field5472 * var38 + class592.field8418 * var40 + class553.field7887 * var39 + var8;
            float var43 = class115.field1340 * var38 + class571.field8096 * var39 + class455.field6312 * var40 + var7;
            if (var41 >= (float) this.field3089.field5994) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field3089.field5999;
                float var45 = (float) var16 * var42 / var41 + (float) this.field3089.field6062;
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var44 > var12) {
                    var12 = var44;
                }
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && (float) arg1 > var13 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field3089.field6074.length < this.field3107) {
                this.field3089.field6074 = new int[this.field3107];
                this.field3089.field6069 = new int[this.field3107];
            }
            int[] var18 = this.field3089.field6074;
            int[] var19 = this.field3089.field6069;
            for (int var20 = 0; var20 < this.field3046; var20++) {
                float var22 = (float) this.field3062[var20];
                float var23 = (float) this.field3100[var20];
                float var24 = (float) this.field3093[var20];
                float var25 = class414.field5502 * var24 + class423.field5639 * var22 + class10.field97 * var23 + var9;
                float var26 = class115.field1340 * var24 + class571.field8096 * var23 + class455.field6312 * var22 + var7;
                float var27 = class412.field5472 * var24 + class592.field8418 * var22 + class553.field7887 * var23 + var8;
                if (var25 >= (float) this.field3089.field5994) {
                    int var28 = (int) ((float) var15 * var26 / var25 + (float) this.field3089.field5999);
                    int var29 = (int) ((float) var16 * var27 / var25 + (float) this.field3089.field6062);
                    int var30 = this.field3083[var20];
                    int var31 = this.field3083[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field3075[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field3083[var20];
                    int var35 = this.field3083[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field3075[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field3075[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field3034; var21++) {
                if (var18[this.field3118[var21]] != -999999 && var18[this.field3128[var21]] != -999999 && var18[this.field3048[var21]] != -999999 && this.method1395(arg0, var18[this.field3048[var21]], var19[this.field3118[var21]], (byte) 113, var19[this.field3048[var21]], var19[this.field3128[var21]], var18[this.field3128[var21]], arg1, var18[this.field3118[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final void method884(int arg0, int arg1, class137 arg2, class137 arg3, int arg4, int arg5, int arg6) {
        if (!this.field3053) {
            this.method1398(49);
        }
        field3105++;
        int var8 = this.field3051 + arg4;
        int var9 = this.field3129 + arg4;
        int var10 = this.field3111 + arg6;
        int var11 = this.field3063 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field1561 >> arg2.field1560 >= arg2.field1558 || var10 < 0 || arg2.field1562 <= arg2.field1561 + var11 >> arg2.field1560) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field1558 <= arg3.field1561 + var9 >> arg3.field1560 || var10 < 0 || arg3.field1562 <= (arg3.field1561 + var11 >> arg3.field1560)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1560;
            int var13 = var9 + arg2.field1561 - 1 >> arg2.field1560;
            int var14 = var10 >> arg2.field1560;
            int var15 = var11 + arg2.field1561 - 1 >> arg2.field1560;
            if (arg2.method253(var12, var14) == arg5 && arg5 == arg2.method253(var13, var14) && arg5 == arg2.method253(var12, var15) && arg2.method253(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field3046; var32++) {
                this.field3062[var32] = this.field3062[var32] + arg2.method242(this.field3100[var32] + arg4, this.field3093[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var29 = this.field3041;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field3046; var30++) {
                int var31 = (this.field3062[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field3062[var30] += (arg2.method242(this.field3100[var30] + arg4, this.field3093[var30] - -arg6) - arg5) * (arg1 - var31) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var25 = (arg1 & 0xFF) * 4;
            int var26 = ((arg1 & 0xFF41) >> 8) * 4;
            int var27 = (arg1 & 0xFFEC37) >> 16 << 6;
            int var28 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var25 >> 1)) < 0 || arg2.field1558 << arg2.field1560 <= (var25 >> 1) + arg2.field1561 + arg4 || (arg6 - (var26 >> 1)) < 0 || arg2.field1562 << arg2.field1560 <= (var26 >> 1) + arg6 + arg2.field1561) {
                return;
            }
            this.method1944(arg5, arg6, arg2, (byte) -128, var27, arg4, var25, var28, var26);
        } else if (arg0 == 4) {
            int var23 = this.field3074 - this.field3041;
            for (int var24 = 0; var24 < this.field3046; var24++) {
                this.field3062[var24] = this.field3062[var24] + var23 - (-arg3.method242(this.field3100[var24] + arg4, this.field3093[var24] - -arg6) + arg5);
            }
        } else if (arg0 == 5) {
            int var16 = this.field3074 - this.field3041;
            for (int var17 = 0; var17 < this.field3046; var17++) {
                int var18 = this.field3100[var17] + arg4;
                int var19 = this.field3093[var17] + arg6;
                int var20 = arg2.method242(var18, var19);
                int var21 = arg3.method242(var18, var19);
                int var22 = var20 - (arg1 + var21);
                this.field3062[var17] = ((this.field3062[var17] << 8) / var16 * var22 >> 8) - (arg5 - var20);
            }
        }
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
        this.field3053 = false;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILqda;BIJFIIIF)S")
    private final short method1394(int arg0, class90 arg1, byte arg2, int arg3, long arg4, float arg5, int arg6, int arg7, int arg8, float arg9) {
        field3138++;
        int var12 = this.field3083[arg3];
        int var13 = this.field3083[arg3 + 1];
        int var14 = 0;
        if (arg2 != 9) {
            return -104;
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field3075[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class374.field4861[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field3075[var14] = (short) (this.field3107 + 1);
        class374.field4861[var14] = arg4;
        this.field3049[this.field3107] = (short) arg8;
        this.field3114[this.field3107] = (short) arg6;
        this.field3069[this.field3107] = (short) arg7;
        this.field3068[this.field3107] = (byte) arg0;
        this.field3110[this.field3107] = arg5;
        this.field3065[this.field3107] = arg9;
        return (short) (this.field3107++);
    }

    @OriginalMember(owner = "client!rh", name = "EA", descriptor = "()I")
    public final int method913() {
        field3096++;
        if (!this.field3053) {
            this.method1398(-99);
        }
        return this.field3074;
    }

    @OriginalMember(owner = "client!rh", name = "ZA", descriptor = "()I")
    public final int method875() {
        field3137++;
        if (!this.field3053) {
            this.method1398(40);
        }
        return this.field3123;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBIIIII)Z")
    private final boolean method1395(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3086++;
        if (arg2 > arg7 && arg5 > arg7 && arg7 < arg4) {
            return false;
        } else if (arg2 < arg7 && arg7 > arg5 && arg7 > arg4) {
            return false;
        } else if (arg0 < arg8 && arg6 > arg0 && arg1 > arg0) {
            return false;
        } else if (arg0 > arg8 && arg0 > arg6 && arg0 > arg1) {
            return false;
        } else {
            int var10 = 15 / ((32 - arg3) / 59);
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lq;)V")
    public final void method866(class389 arg0) {
        field3121++;
        class598 var2 = (class598) arg0;
        if (this.field3125 != null) {
            for (int var3 = 0; var3 < this.field3125.length; var3++) {
                class375 var4 = this.field3125[var3];
                class375 var5 = var4;
                if (var4.field4866 != null) {
                    var5 = var4.field4866;
                }
                var5.field4870 = (int) ((float) this.field3093[var4.field4877] * var2.field8494 + (float) this.field3100[var4.field4877] * var2.field8497 + (float) this.field3062[var4.field4877] * var2.field8491 + var2.field8493);
                var5.field4868 = (int) ((float) this.field3093[var4.field4877] * var2.field8501 + (float) this.field3100[var4.field4877] * var2.field8475 + (float) this.field3062[var4.field4877] * var2.field8476 + var2.field8488);
                var5.field4864 = (int) ((float) this.field3093[var4.field4877] * var2.field8503 + (float) this.field3100[var4.field4877] * var2.field8484 + (float) this.field3062[var4.field4877] * var2.field8502 + var2.field8481);
                var5.field4869 = (int) ((float) this.field3093[var4.field4884] * var2.field8494 + (float) this.field3100[var4.field4884] * var2.field8497 + (float) this.field3062[var4.field4884] * var2.field8491 + var2.field8493);
                var5.field4875 = (int) ((float) this.field3093[var4.field4884] * var2.field8501 + (float) this.field3100[var4.field4884] * var2.field8475 + (float) this.field3062[var4.field4884] * var2.field8476 + var2.field8488);
                var5.field4885 = (int) ((float) this.field3093[var4.field4884] * var2.field8503 + (float) this.field3100[var4.field4884] * var2.field8484 + (float) this.field3062[var4.field4884] * var2.field8502 + var2.field8481);
                var5.field4879 = (int) ((float) this.field3093[var4.field4882] * var2.field8494 + (float) this.field3100[var4.field4882] * var2.field8497 + (float) this.field3062[var4.field4882] * var2.field8491 + var2.field8493);
                var5.field4881 = (int) ((float) this.field3093[var4.field4882] * var2.field8501 + (float) this.field3100[var4.field4882] * var2.field8475 + (float) this.field3062[var4.field4882] * var2.field8476 + var2.field8488);
                var5.field4867 = (int) ((float) this.field3093[var4.field4882] * var2.field8503 + (float) this.field3100[var4.field4882] * var2.field8484 + (float) this.field3062[var4.field4882] * var2.field8502 + var2.field8481);
            }
        }
        if (this.field3050 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3050.length; var6++) {
            class73 var7 = this.field3050[var6];
            class73 var8 = var7;
            if (var7.field777 != null) {
                var8 = var7.field777;
            }
            if (var7.field763 == null) {
                var7.field763 = var2.method224();
            } else {
                var7.field763.method233(var2);
            }
            var8.field769 = (int) ((float) this.field3093[var7.field773] * var2.field8494 + (float) this.field3100[var7.field773] * var2.field8497 + (float) this.field3062[var7.field773] * var2.field8491 + var2.field8493);
            var8.field764 = (int) ((float) this.field3093[var7.field773] * var2.field8501 + (float) this.field3100[var7.field773] * var2.field8475 + (float) this.field3062[var7.field773] * var2.field8476 + var2.field8488);
            var8.field767 = (int) ((float) this.field3093[var7.field773] * var2.field8503 + (float) this.field3100[var7.field773] * var2.field8484 + (float) this.field3062[var7.field773] * var2.field8502 + var2.field8481);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    private final void method1396(byte arg0) {
        if (this.field3071 != null) {
            class598 var2 = this.field3089.field5923;
            float var3 = this.field3089.method2343();
            float var4 = this.field3089.method2331();
            this.field3089.method2355(71);
            this.field3089.method329(false);
            this.field3089.method2400((byte) 108, false);
            this.field3089.method2379(this.field3089.field5996, 15132, this.field3089.field5957, null, null);
            for (int var5 = 0; var5 < this.field3120; var5++) {
                class14 var6 = this.field3071[var5];
                class286 var7 = this.field3108[var5];
                if (!var6.field133 || !this.field3089.method310()) {
                    float var8 = (float) (this.field3100[var6.field127] + this.field3100[var6.field125] + this.field3100[var6.field130]) * 0.3333333F;
                    float var9 = (float) (this.field3062[var6.field130] + this.field3062[var6.field125] + this.field3062[var6.field127]) * 0.3333333F;
                    float var10 = (float) (this.field3093[var6.field130] + this.field3093[var6.field127] + this.field3093[var6.field125]) * 0.3333333F;
                    float var11 = class115.field1340 * var10 + class571.field8096 * var8 + class455.field6312 * var9 + class377.field4893;
                    float var12 = class412.field5472 * var10 + class592.field8418 * var9 + class553.field7887 * var8 + class626.field8893;
                    float var13 = class414.field5502 * var10 + class423.field5639 * var9 + class10.field97 * var8 + class292.field3740;
                    var2.method3348(var7.field3670, var6.field134 * var7.field3669 >> 7, -var13, (float) var7.field3668 + var11, (float) var7.field3659 - var12, false, var6.field122 * var7.field3664 >> 7);
                    this.field3089.method2334(var2, -1);
                    this.field3089.method366(var4, var3 - (float) var6.field126 * 1.5F);
                    int var14 = var7.field3665;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field3089.method2321(var6.field123, (byte) 95);
                    this.field3089.method2378(true, var6.field129);
                    this.field3089.method2358((byte) -69, 0, 4, 7);
                }
            }
            this.field3089.method366(var4, var3);
            this.field3089.method329(true);
            this.field3089.method2357(63);
        }
        field3079++;
        int var15 = 25 / ((arg0 - 47) / 47);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(FFIIIIFIIIF[BFLwba;)V")
    public static final void method1397(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9, float arg10, byte[] arg11, float arg12, class46 arg13) {
        field3136++;
        int var14 = arg4 * arg8;
        float[] var15 = new float[var14];
        if (arg3 != 16383) {
            return;
        }
        for (int var16 = 0; var16 < arg7; var16++) {
            arg13.method223(arg4, arg6 / (float) arg8, arg9, (byte) 42, 0, arg0 * 127.0F, arg8, arg10 / (float) arg9, arg12 / (float) arg4, arg2, var15);
            int var19 = arg5;
            arg10 *= 2.0F;
            arg6 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                var19++;
            }
            arg0 *= arg1;
            arg12 *= 2.0F;
        }
        int var17 = arg5;
        for (int var18 = 0; var18 < var14; var18++) {
            arg11[var17] = (byte) (arg11[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "(III)V")
    public final void method860(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3046; var4++) {
            if (arg0 != 128) {
                this.field3100[var4] = this.field3100[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field3062[var4] = this.field3062[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field3093[var4] = this.field3093[var4] * arg2 >> 7;
            }
        }
        field3066++;
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
        this.field3053 = false;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
    private final void method1398(int arg0) {
        field3052++;
        int var2 = -69 % ((-arg0 - 46) / 46);
        int var3 = 32767;
        int var4 = 32767;
        int var5 = 32767;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = -32768;
        int var9 = 0;
        int var10 = 0;
        for (int var11 = 0; var11 < this.field3046; var11++) {
            int var12 = this.field3100[var11];
            int var13 = this.field3062[var11];
            if (var7 < var13) {
                var7 = var13;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = this.field3093[var11];
            if (var8 < var14) {
                var8 = var14;
            }
            if (var5 > var14) {
                var5 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var15 > var9) {
                var9 = var15;
            }
            int var16 = var14 * var14 + (var12 * var12 + (var13 * var13));
            if (var16 > var10) {
                var10 = var16;
            }
        }
        this.field3111 = (short) var5;
        this.field3041 = (short) var4;
        this.field3063 = (short) var8;
        this.field3129 = (short) var6;
        this.field3051 = (short) var3;
        this.field3074 = (short) var7;
        this.field3123 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        Math.sqrt((double) var10);
        this.field3053 = true;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V")
    public final void method888() {
        field3130++;
        if (this.field3107 <= 0 || this.field3047 <= 0) {
            return;
        }
        this.method1392(false, (byte) 103);
        if ((this.field3133 & 0x10) == 0 && this.field3097.field7074 == null) {
            this.method1393(false, 5123);
        }
        this.method1390(-20029);
    }

    @OriginalMember(owner = "client!rh", name = "UA", descriptor = "(SS)V")
    public final void method863(short arg0, short arg1) {
        field3131++;
        for (int var3 = 0; var3 < this.field3034; var3++) {
            if (this.field3113[var3] == arg0) {
                this.field3113[var3] = arg1;
            }
        }
        if (this.field3071 != null) {
            for (int var4 = 0; var4 < this.field3120; var4++) {
                class14 var5 = this.field3071[var4];
                class286 var6 = this.field3108[var4];
                var6.field3665 = var6.field3665 & 0xFF000000 | class505.field7285[this.field3113[var5.field131] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field3098 != null) {
            this.field3098.field3163 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "ua", descriptor = "(IIII)V")
    public final void method897(int arg0, int arg1, int arg2, int arg3) {
        field3141++;
        if (arg0 == 0) {
            class342.field4437 = 0;
            int var5 = 0;
            class172.field2053 = 0;
            class306.field3995 = 0;
            for (int var6 = 0; var6 < this.field3046; var6++) {
                class172.field2053 += this.field3100[var6];
                class342.field4437 += this.field3062[var6];
                var5++;
                class306.field3995 += this.field3093[var6];
            }
            if (var5 > 0) {
                class172.field2053 = class172.field2053 / var5 + arg1;
                class306.field3995 = class306.field3995 / var5 + arg3;
                class342.field4437 = class342.field4437 / var5 + arg2;
            } else {
                class306.field3995 = arg3;
                class342.field4437 = arg2;
                class172.field2053 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3046; var7++) {
                this.field3100[var7] += arg1;
                this.field3062[var7] += arg2;
                this.field3093[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3046; var8++) {
                this.field3100[var8] -= class172.field2053;
                this.field3062[var8] -= class342.field4437;
                this.field3093[var8] -= class306.field3995;
                if (arg3 != 0) {
                    int var9 = class285.field3655[arg3];
                    int var10 = class285.field3656[arg3];
                    int var11 = this.field3062[var8] * var9 + this.field3100[var8] * var10 + 16383 >> 14;
                    this.field3062[var8] = this.field3062[var8] * var10 + 16383 - (this.field3100[var8] * var9) >> 14;
                    this.field3100[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class285.field3655[arg1];
                    int var13 = class285.field3656[arg1];
                    int var14 = this.field3062[var8] * var13 + 16383 - (this.field3093[var8] * var12) >> 14;
                    this.field3093[var8] = this.field3062[var8] * var12 + this.field3093[var8] * var13 + 16383 >> 14;
                    this.field3062[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class285.field3655[arg2];
                    int var16 = class285.field3656[arg2];
                    int var17 = this.field3093[var8] * var15 + this.field3100[var8] * var16 + 16383 >> 14;
                    this.field3093[var8] = this.field3093[var8] * var16 + 16383 - this.field3100[var8] * var15 >> 14;
                    this.field3100[var8] = var17;
                }
                this.field3100[var8] += class172.field2053;
                this.field3062[var8] += class342.field4437;
                this.field3093[var8] += class306.field3995;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3046; var18++) {
                this.field3100[var18] -= class172.field2053;
                this.field3062[var18] -= class342.field4437;
                this.field3093[var18] -= class306.field3995;
                this.field3100[var18] = this.field3100[var18] * arg1 / 128;
                this.field3062[var18] = this.field3062[var18] * arg2 / 128;
                this.field3093[var18] = this.field3093[var18] * arg3 / 128;
                this.field3100[var18] += class172.field2053;
                this.field3062[var18] += class342.field4437;
                this.field3093[var18] += class306.field3995;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3034; var19++) {
                int var23 = (this.field3135[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field3135[var19] = (byte) var23;
            }
            if (this.field3098 != null) {
                this.field3098.field3163 = null;
            }
            if (this.field3071 != null) {
                for (int var20 = 0; var20 < this.field3120; var20++) {
                    class14 var21 = this.field3071[var20];
                    class286 var22 = this.field3108[var20];
                    var22.field3665 = var22.field3665 & 0xFFFFFF | 255 - (this.field3135[var21.field131] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field3034; var24++) {
                int var28 = this.field3113[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3B7) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
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
                this.field3113[var24] = (short) class139.method776(var34, class139.method776(var31 << 10, var32 << 7));
            }
            if (this.field3098 != null) {
                this.field3098.field3163 = null;
            }
            if (this.field3071 != null) {
                for (int var25 = 0; var25 < this.field3120; var25++) {
                    class14 var26 = this.field3071[var25];
                    class286 var27 = this.field3108[var25];
                    var27.field3665 = var27.field3665 & 0xFF000000 | class505.field7285[this.field3113[var26.field131] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field3120; var35++) {
                class286 var36 = this.field3108[var35];
                var36.field3668 += arg1;
                var36.field3659 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field3120; var37++) {
                class286 var38 = this.field3108[var37];
                var38.field3669 = var38.field3669 * arg2 >> 7;
                var38.field3664 = var38.field3664 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field3120; var39++) {
                class286 var40 = this.field3108[var39];
                var40.field3670 = var40.field3670 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBSBI)I")
    private final int method1399(int arg0, byte arg1, short arg2, byte arg3, int arg4) {
        field3115++;
        int var6 = class505.field7285[class181.method1056(-127, arg0, arg4)];
        if (arg1 != -11) {
            this.field3070 = null;
        }
        if (arg2 != -1) {
            class414 var7 = this.field3089.field8990.method846((byte) -126, arg2 & 0xFFFF);
            int var8 = var7.field5484 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg0 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field5482 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
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
                var6 = (var13 << 8 & 0xFF0074) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) - ((arg3 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!rh", name = "AA", descriptor = "(I)V")
    public final void method865(int arg0) {
        field3076++;
        int var2 = class285.field3655[arg0];
        int var3 = class285.field3656[arg0];
        for (int var4 = 0; var4 < this.field3046; var4++) {
            int var5 = this.field3062[var4] * var3 - (this.field3093[var4] * var2) >> 14;
            this.field3093[var4] = this.field3093[var4] * var3 + this.field3062[var4] * var2 >> 14;
            this.field3062[var4] = var5;
        }
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
        this.field3053 = false;
    }

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "()V")
    public final void method889() {
        field3084++;
        for (int var1 = 0; var1 < this.field3046; var1++) {
            this.field3093[var1] = -this.field3093[var1];
        }
        for (int var2 = 0; var2 < this.field3107; var2++) {
            this.field3069[var2] = (short) (-this.field3069[var2]);
        }
        for (int var3 = 0; var3 < this.field3034; var3++) {
            short var4 = this.field3118[var3];
            this.field3118[var3] = this.field3048[var3];
            this.field3048[var3] = var4;
        }
        if (this.field3058 == null && this.field3098 != null) {
            this.field3098.field3163 = null;
        }
        if (this.field3058 != null) {
            this.field3058.field3163 = null;
        }
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
        if (this.field3097 != null) {
            this.field3097.field7074 = null;
        }
        this.field3053 = false;
    }

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "()I")
    public final int method869() {
        field3140++;
        return this.field3078;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()[Ldg;")
    public final class375[] method886() {
        field3042++;
        return this.field3125;
    }

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "()I")
    public final int method872() {
        field3064++;
        if (!this.field3053) {
            this.method1398(79);
        }
        return this.field3063;
    }

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "(I)V")
    public final void method892(int arg0) {
        field3061++;
        int var2 = class285.field3655[arg0];
        int var3 = class285.field3656[arg0];
        for (int var4 = 0; var4 < this.field3046; var4++) {
            int var7 = this.field3100[var4] * var3 + this.field3093[var4] * var2 >> 14;
            this.field3093[var4] = this.field3093[var4] * var3 - (this.field3100[var4] * var2) >> 14;
            this.field3100[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field3107; var5++) {
            int var6 = this.field3069[var5] * var2 + (this.field3049[var5] * var3) >> 14;
            this.field3069[var5] = (short) (this.field3069[var5] * var3 - (this.field3049[var5] * var2) >> 14);
            this.field3049[var5] = (short) var6;
        }
        if (this.field3058 == null && this.field3098 != null) {
            this.field3098.field3163 = null;
        }
        if (this.field3058 != null) {
            this.field3058.field3163 = null;
        }
        this.field3053 = false;
        if (this.field3081 != null) {
            this.field3081.field3163 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()Z")
    public final boolean method898() {
        field3116++;
        if (this.field3054 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field3054.length; var1++) {
            if (this.field3054[var1] != -1 && !this.field3089.field8990.method843(this.field3054[var1], 31340)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZLrh;Lrh;ZI)Lba;")
    private final class350 method1400(byte arg0, boolean arg1, class241 arg2, class241 arg3, boolean arg4, int arg5) {
        arg3.field3132 = arg5;
        arg3.field3047 = this.field3047;
        field3067++;
        arg3.field3078 = this.field3078;
        if (arg0 != -4) {
            this.field3063 = -38;
        }
        arg3.field3120 = this.field3120;
        arg3.field3082 = this.field3082;
        arg3.field3107 = this.field3107;
        arg3.field3046 = this.field3046;
        arg3.field3091 = this.field3091;
        arg3.field3133 = 0;
        arg3.field3088 = this.field3088;
        arg3.field3034 = this.field3034;
        boolean var7 = class354.method1956(arg5, (byte) -104, this.field3091);
        boolean var8 = class607.method3387(arg0 + 38, arg5, this.field3091);
        boolean var9 = class601.method3359(arg0 ^ 0xFFFFFFFD, this.field3091, arg5);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg3.field3100 = this.field3100;
            } else if (arg2.field3100 == null || arg2.field3100.length < this.field3088) {
                arg3.field3100 = arg2.field3100 = new int[this.field3088];
            } else {
                arg3.field3100 = arg2.field3100;
            }
            if (!var8) {
                arg3.field3062 = this.field3062;
            } else if (arg2.field3062 == null || arg2.field3062.length < this.field3088) {
                arg3.field3062 = arg2.field3062 = new int[this.field3088];
            } else {
                arg3.field3062 = arg2.field3062;
            }
            if (!var9) {
                arg3.field3093 = this.field3093;
            } else if (arg2.field3093 == null || arg2.field3093.length < this.field3088) {
                arg3.field3093 = arg2.field3093 = new int[this.field3088];
            } else {
                arg3.field3093 = arg2.field3093;
            }
            for (int var11 = 0; var11 < this.field3088; var11++) {
                if (var7) {
                    arg3.field3100[var11] = this.field3100[var11];
                }
                if (var8) {
                    arg3.field3062[var11] = this.field3062[var11];
                }
                if (var9) {
                    arg3.field3093[var11] = this.field3093[var11];
                }
            }
        } else {
            arg3.field3062 = this.field3062;
            arg3.field3093 = this.field3093;
            arg3.field3100 = this.field3100;
        }
        if (class354.method1959(arg0 + 759600453, this.field3091, arg5)) {
            if (arg4) {
                arg3.field3133 = (byte) (arg3.field3133 | 0x1);
            }
            arg3.field3081 = arg2.field3081;
            arg3.field3081.field3163 = this.field3081.field3163;
            arg3.field3081.field3165 = this.field3081.field3165;
        } else if (class113.method699(arg5, arg0 ^ 0x55, this.field3091)) {
            arg3.field3081 = this.field3081;
        } else {
            arg3.field3081 = null;
        }
        if (class170.method1013((byte) -123, arg5, this.field3091)) {
            if (arg2.field3113 == null || arg2.field3113.length < this.field3034) {
                arg3.field3113 = arg2.field3113 = new short[this.field3034];
            } else {
                arg3.field3113 = arg2.field3113;
            }
            for (int var12 = 0; var12 < this.field3034; var12++) {
                arg3.field3113[var12] = this.field3113[var12];
            }
        } else {
            arg3.field3113 = this.field3113;
        }
        if (class577.method3262(false, this.field3091, arg5)) {
            if (arg2.field3135 == null || this.field3034 > arg2.field3135.length) {
                arg3.field3135 = arg2.field3135 = new byte[this.field3034];
            } else {
                arg3.field3135 = arg2.field3135;
            }
            for (int var13 = 0; var13 < this.field3034; var13++) {
                arg3.field3135[var13] = this.field3135[var13];
            }
        } else {
            arg3.field3135 = this.field3135;
        }
        if (class407.method2209(this.field3091, arg0 ^ 0xFFFF4FFC, arg5)) {
            arg3.field3098 = arg2.field3098;
            if (arg4) {
                arg3.field3133 = (byte) (arg3.field3133 | 0x2);
            }
            arg3.field3098.field3163 = this.field3098.field3163;
            arg3.field3098.field3165 = this.field3098.field3165;
        } else if (class513.method2941(this.field3091, arg5, arg0 - 106)) {
            arg3.field3098 = this.field3098;
        } else {
            arg3.field3098 = null;
        }
        if (class529.method3020(false, this.field3091, arg5)) {
            if (arg2.field3049 == null || arg2.field3049.length < this.field3107) {
                int var14 = this.field3107;
                arg3.field3069 = arg2.field3069 = new short[var14];
                arg3.field3114 = arg2.field3114 = new short[var14];
                arg3.field3049 = arg2.field3049 = new short[var14];
            } else {
                arg3.field3069 = arg2.field3069;
                arg3.field3049 = arg2.field3049;
                arg3.field3114 = arg2.field3114;
            }
            if (this.field3057 == null) {
                for (int var15 = 0; var15 < this.field3107; var15++) {
                    arg3.field3049[var15] = this.field3049[var15];
                    arg3.field3114[var15] = this.field3114[var15];
                    arg3.field3069[var15] = this.field3069[var15];
                }
            } else {
                if (arg2.field3057 == null) {
                    arg2.field3057 = new class341();
                }
                class341 var16 = arg3.field3057 = arg2.field3057;
                if (var16.field4432 == null || this.field3107 > var16.field4432.length) {
                    int var17 = this.field3107;
                    var16.field4436 = new byte[var17];
                    var16.field4434 = new short[var17];
                    var16.field4432 = new short[var17];
                    var16.field4435 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field3107; var18++) {
                    arg3.field3049[var18] = this.field3049[var18];
                    arg3.field3114[var18] = this.field3114[var18];
                    arg3.field3069[var18] = this.field3069[var18];
                    var16.field4432[var18] = this.field3057.field4432[var18];
                    var16.field4435[var18] = this.field3057.field4435[var18];
                    var16.field4434[var18] = this.field3057.field4434[var18];
                    var16.field4436[var18] = this.field3057.field4436[var18];
                }
            }
            arg3.field3068 = this.field3068;
        } else {
            arg3.field3069 = this.field3069;
            arg3.field3057 = this.field3057;
            arg3.field3049 = this.field3049;
            arg3.field3068 = this.field3068;
            arg3.field3114 = this.field3114;
        }
        if (class151.method828(this.field3091, arg5, (byte) -125)) {
            arg3.field3058 = arg2.field3058;
            if (arg4) {
                arg3.field3133 = (byte) (arg3.field3133 | 0x4);
            }
            arg3.field3058.field3165 = this.field3058.field3165;
            arg3.field3058.field3163 = this.field3058.field3163;
        } else if (class43.method216(arg5, this.field3091, 2048)) {
            arg3.field3058 = this.field3058;
        } else {
            arg3.field3058 = null;
        }
        if (class368.method2015(arg5, (byte) 124, this.field3091)) {
            if (arg2.field3110 == null || this.field3034 > arg2.field3110.length) {
                int var19 = this.field3107;
                arg3.field3110 = arg2.field3110 = new float[var19];
                arg3.field3065 = arg2.field3065 = new float[var19];
            } else {
                arg3.field3110 = arg2.field3110;
                arg3.field3065 = arg2.field3065;
            }
            for (int var20 = 0; var20 < this.field3107; var20++) {
                arg3.field3110[var20] = this.field3110[var20];
                arg3.field3065[var20] = this.field3065[var20];
            }
        } else {
            arg3.field3110 = this.field3110;
            arg3.field3065 = this.field3065;
        }
        if (class36.method196(arg0 ^ 0x7C, arg5, this.field3091)) {
            if (arg4) {
                arg3.field3133 = (byte) (arg3.field3133 | 0x8);
            }
            arg3.field3139 = arg2.field3139;
            arg3.field3139.field3165 = this.field3139.field3165;
            arg3.field3139.field3163 = this.field3139.field3163;
        } else if (class641.method3607(this.field3091, 0, arg5)) {
            arg3.field3139 = this.field3139;
        } else {
            arg3.field3139 = null;
        }
        if (class196.method1138(this.field3091, arg5, 21056)) {
            if (arg2.field3118 == null || this.field3034 > arg2.field3118.length) {
                int var21 = this.field3034;
                arg3.field3128 = arg2.field3128 = new short[var21];
                arg3.field3118 = arg2.field3118 = new short[var21];
                arg3.field3048 = arg2.field3048 = new short[var21];
            } else {
                arg3.field3048 = arg2.field3048;
                arg3.field3118 = arg2.field3118;
                arg3.field3128 = arg2.field3128;
            }
            for (int var22 = 0; var22 < this.field3034; var22++) {
                arg3.field3118[var22] = this.field3118[var22];
                arg3.field3128[var22] = this.field3128[var22];
                arg3.field3048[var22] = this.field3048[var22];
            }
        } else {
            arg3.field3048 = this.field3048;
            arg3.field3118 = this.field3118;
            arg3.field3128 = this.field3128;
        }
        if (class692.method3831(arg5, 2, this.field3091)) {
            arg3.field3097 = arg2.field3097;
            if (arg4) {
                arg3.field3133 = (byte) (arg3.field3133 | 0x10);
            }
            arg3.field3097.field7074 = this.field3097.field7074;
        } else if (class151.method829(arg5, -26559, this.field3091)) {
            arg3.field3097 = this.field3097;
        } else {
            arg3.field3097 = null;
        }
        if (class277.method1572(arg5, (byte) 36, this.field3091)) {
            if (arg2.field3054 == null || arg2.field3054.length < this.field3034) {
                int var23 = this.field3034;
                arg3.field3054 = arg2.field3054 = new short[var23];
            } else {
                arg3.field3054 = arg2.field3054;
            }
            for (int var24 = 0; var24 < this.field3034; var24++) {
                arg3.field3054[var24] = this.field3054[var24];
            }
        } else {
            arg3.field3054 = this.field3054;
        }
        if (!class191.method1104(arg0 + 17, this.field3091, arg5)) {
            arg3.field3108 = this.field3108;
        } else if (arg2.field3108 == null || this.field3120 > arg2.field3108.length) {
            int var26 = this.field3120;
            arg3.field3108 = arg2.field3108 = new class286[var26];
            for (int var27 = 0; var27 < this.field3120; var27++) {
                arg3.field3108[var27] = this.field3108[var27].method1624((byte) -5);
            }
        } else {
            arg3.field3108 = arg2.field3108;
            for (int var25 = 0; var25 < this.field3120; var25++) {
                arg3.field3108[var25].method1623((byte) 114, this.field3108[var25]);
            }
        }
        arg3.field3050 = this.field3050;
        arg3.field3080 = this.field3080;
        arg3.field3083 = this.field3083;
        arg3.field3125 = this.field3125;
        arg3.field3070 = this.field3070;
        arg3.field3075 = this.field3075;
        arg3.field3094 = this.field3094;
        arg3.field3055 = this.field3055;
        arg3.field3127 = this.field3127;
        arg3.field3122 = this.field3122;
        if (this.field3053) {
            arg3.field3129 = this.field3129;
            arg3.field3051 = this.field3051;
            arg3.field3041 = this.field3041;
            arg3.field3111 = this.field3111;
            arg3.field3074 = this.field3074;
            arg3.field3123 = this.field3123;
            arg3.field3053 = true;
            arg3.field3063 = this.field3063;
        } else {
            arg3.field3053 = false;
        }
        arg3.field3071 = this.field3071;
        return arg3;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lap;)V")
    public class241(class435 arg0) {
        this.field3089 = arg0;
        this.field3081 = new class245(null, 5126, 3, 0);
        this.field3139 = new class245(null, 5126, 2, 0);
        this.field3058 = new class245(null, 5126, 3, 0);
        this.field3098 = new class245(null, 5121, 4, 0);
        this.field3097 = new class487();
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lap;Lqda;IIII)V")
    public class241(class435 arg0, class90 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3091 = arg5;
        this.field3089 = arg0;
        this.field3132 = arg2;
        if (class113.method699(arg2, -89, arg5)) {
            this.field3081 = new class245(null, 5126, 3, 0);
        }
        if (class641.method3607(arg5, 0, arg2)) {
            this.field3139 = new class245(null, 5126, 2, 0);
        }
        if (class43.method216(arg2, arg5, 2048)) {
            this.field3058 = new class245(null, 5126, 3, 0);
        }
        if (class513.method2941(arg5, arg2, -93)) {
            this.field3098 = new class245(null, 5121, 4, 0);
        }
        if (class151.method829(arg2, -26559, arg5)) {
            this.field3097 = new class487();
        }
        class486 var7 = arg0.field8990;
        int[] var8 = new int[arg1.field1026];
        this.field3083 = new int[arg1.field1011 + 1];
        for (int var9 = 0; var9 < arg1.field1026; var9++) {
            if ((arg1.field1000 == null || arg1.field1000[var9] != 2) && (arg1.field1001 == null || arg1.field1001[var9] == -1 || !var7.method846((byte) -114, arg1.field1001[var9] & 0xFFFF).field5498)) {
                var8[this.field3034++] = var9;
                this.field3083[arg1.field1028[var9]]++;
                this.field3083[arg1.field1033[var9]]++;
                this.field3083[arg1.field1004[var9]]++;
            }
        }
        this.field3047 = this.field3034;
        long[] var10 = new long[this.field3034];
        boolean var11 = (this.field3132 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field3034; var12++) {
            int var180 = var8[var12];
            class414 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1030 != null) {
                for (int var186 = 0; var186 < arg1.field1030.length; var186++) {
                    class387 var187 = arg1.field1030[var186];
                    if (var187.field5171 == var180) {
                        class104 var188 = class289.method1634(var187.field5174, (byte) -27);
                        if (var188.field1126) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field3047--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1001 != null) {
                var189 = arg1.field1001[var180];
                if (var189 != -1) {
                    var181 = var7.method846((byte) -120, var189 & 0xFFFF);
                    var185 = var181.field5483;
                    var184 = var181.field5486;
                }
            }
            boolean var190 = arg1.field1035 != null && arg1.field1035[var180] != 0 || var181 != null && var181.field5496 | !var181.field5481;
            if ((var11 || var190) && arg1.field989 != null) {
                var182 += arg1.field989[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = ((var189 & 0xFFFF) << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + (long) var194;
        }
        class648.method3646(-6, var10, var8);
        this.field3080 = arg1.field1023;
        this.field3088 = arg1.field1034;
        this.field3046 = arg1.field1011;
        this.field3100 = arg1.field1025;
        this.field3062 = arg1.field1018;
        this.field3093 = arg1.field988;
        this.field3125 = arg1.field987;
        class646[] var13 = new class646[this.field3046];
        this.field3050 = arg1.field1019;
        if (arg1.field1030 != null) {
            this.field3120 = arg1.field1030.length;
            this.field3108 = new class286[this.field3120];
            this.field3071 = new class14[this.field3120];
            for (int var14 = 0; var14 < this.field3120; var14++) {
                class387 var15 = arg1.field1030[var14];
                class104 var16 = class289.method1634(var15.field5174, (byte) -39);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field3034; var18++) {
                    if (var8[var18] == var15.field5171) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class505.field7285[arg1.field1016[var15.field5171] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1035 == null ? 0 : arg1.field1035[var15.field5171]) << 24;
                this.field3071[var14] = new class14(var17, arg1.field1028[var15.field5171], arg1.field1033[var15.field5171], arg1.field1004[var15.field5171], var16.field1125, var16.field1132, var16.field1129, var16.field1127, var16.field1128, var16.field1126, var16.field1124, var15.field5179);
                this.field3108[var14] = new class286(var20);
            }
        }
        int var21 = this.field3034 * 3;
        this.field3114 = new short[var21];
        class374.field4861 = new long[var21];
        if (arg1.field991 != null) {
            this.field3070 = new short[this.field3034];
        }
        this.field3128 = new short[this.field3034];
        this.field3049 = new short[var21];
        this.field3078 = (short) arg3;
        this.field3082 = (short) arg4;
        this.field3054 = new short[this.field3034];
        this.field3048 = new short[this.field3034];
        this.field3068 = new byte[var21];
        this.field3113 = new short[this.field3034];
        this.field3118 = new short[this.field3034];
        this.field3065 = new float[var21];
        this.field3110 = new float[var21];
        this.field3135 = new byte[this.field3034];
        this.field3069 = new short[var21];
        this.field3075 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1011; var23++) {
            int var179 = this.field3083[var23];
            this.field3083[var23] = var22;
            var13[var23] = new class646();
            var22 += var179;
        }
        this.field3083[arg1.field1011] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1031 != null) {
            int var28 = arg1.field1002;
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
            var27 = new float[var28][];
            for (int var36 = 0; var36 < this.field3034; var36++) {
                int var43 = var8[var36];
                if (arg1.field1031[var43] != -1) {
                    int var44 = arg1.field1031[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1028[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1033[var43];
                        } else {
                            var46 = arg1.field1004[var43];
                        }
                        int var47 = arg1.field1025[var46];
                        int var48 = arg1.field1018[var46];
                        int var49 = arg1.field988[var46];
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
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1027[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field997[var37];
                        var39 = 64.0F / (float) arg1.field995[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var40 = 1.0F;
                        } else if (var42 <= 0) {
                            var41 = 1.0F;
                            var40 = (float) (-var42) / 1024.0F;
                        } else {
                            var40 = 1.0F;
                            var41 = (float) var42 / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field995[var37];
                        var41 = 64.0F / (float) arg1.field1029[var37];
                        var40 = 64.0F / (float) arg1.field997[var37];
                    } else {
                        var39 = (float) arg1.field995[var37] / 1024.0F;
                        var40 = (float) arg1.field997[var37] / 1024.0F;
                        var41 = (float) arg1.field1029[var37] / 1024.0F;
                    }
                    var27[var37] = class154.method839(var40, arg1.field1015[var37], arg1.field998[var37], var41, class203.method1246(255, arg1.field1021[var37]), (byte) 101, arg1.field1014[var37], var39);
                }
            }
        }
        class522[] var50 = new class522[arg1.field1026];
        for (int var51 = 0; var51 < arg1.field1026; var51++) {
            short var158 = arg1.field1028[var51];
            short var159 = arg1.field1033[var51];
            short var160 = arg1.field1004[var51];
            int var161 = this.field3100[var159] - this.field3100[var158];
            int var162 = this.field3062[var159] - this.field3062[var158];
            int var163 = this.field3093[var159] - this.field3093[var158];
            int var164 = this.field3100[var160] - this.field3100[var158];
            int var165 = this.field3062[var160] - this.field3062[var158];
            int var166 = this.field3093[var160] - this.field3093[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + (var167 * var167 + (var169 * var169))));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var168 * 256 / var170;
            int var173 = var169 * 256 / var170;
            byte var174 = arg1.field1000 == null ? 0 : arg1.field1000[var51];
            if (var174 == 0) {
                class646 var175 = var13[var158];
                var175.field9147 += var173;
                var175.field9143++;
                var175.field9144 += var171;
                var175.field9142 += var172;
                class646 var176 = var13[var159];
                var176.field9144 += var171;
                var176.field9142 += var172;
                var176.field9147 += var173;
                var176.field9143++;
                class646 var177 = var13[var160];
                var177.field9144 += var171;
                var177.field9147 += var173;
                var177.field9142 += var172;
                var177.field9143++;
            } else if (var174 == 1) {
                class522 var178 = var50[var51] = new class522();
                var178.field7472 = var172;
                var178.field7476 = var171;
                var178.field7474 = var173;
            }
        }
        for (int var52 = 0; var52 < this.field3034; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1016[var68] & 0xFFFF;
            short var70;
            if (arg1.field1001 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1001[var68];
            }
            int var71;
            if (arg1.field1031 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1031[var68];
            }
            int var72;
            if (arg1.field1035 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1035[var68] & 0xFF;
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
                    var75 = 1.0F;
                    var78 = 0.0F;
                    var77 = 0.0F;
                    var80 = 2;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var79 = 1;
                    var76 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1027[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field1028[var68];
                        short var84 = arg1.field1033[var68];
                        short var85 = arg1.field1004[var68];
                        short var86 = arg1.field1014[var71];
                        short var87 = arg1.field1015[var71];
                        short var88 = arg1.field998[var71];
                        float var89 = (float) arg1.field1025[var86];
                        float var90 = (float) arg1.field1018[var86];
                        float var91 = (float) arg1.field988[var86];
                        float var92 = (float) arg1.field1025[var87] - var89;
                        float var93 = (float) arg1.field1018[var87] - var90;
                        float var94 = (float) arg1.field988[var87] - var91;
                        float var95 = (float) arg1.field1025[var88] - var89;
                        float var96 = (float) arg1.field1018[var88] - var90;
                        float var97 = (float) arg1.field988[var88] - var91;
                        float var98 = (float) arg1.field1025[var83] - var89;
                        float var99 = (float) arg1.field1018[var83] - var90;
                        float var100 = (float) arg1.field988[var83] - var91;
                        float var101 = (float) arg1.field1025[var84] - var89;
                        float var102 = (float) arg1.field1018[var84] - var90;
                        float var103 = (float) arg1.field988[var84] - var91;
                        float var104 = (float) arg1.field1025[var85] - var89;
                        float var105 = (float) arg1.field1018[var85] - var90;
                        float var106 = (float) arg1.field988[var85] - var91;
                        float var107 = var93 * var97 - var94 * var96;
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - var97 * var108;
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var93 * var109 - (var94 * var108);
                        float var116 = var94 * var107 - (var92 * var109);
                        float var117 = 1.0F / (var97 * var114 + var95 * var115 + var96 * var116);
                        var78 = (var106 * var114 + var104 * var115 + var105 * var116) * var117;
                        var76 = (var103 * var114 + var101 * var115 + var102 * var116) * var117;
                        var74 = (var100 * var114 + var98 * var115 + var99 * var116) * var117;
                    } else {
                        short var118 = arg1.field1028[var68];
                        short var119 = arg1.field1033[var68];
                        short var120 = arg1.field1004[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field1012[var71];
                        float var126 = (float) arg1.field1017[var71] / 256.0F;
                        if (var82 == 1) {
                            float var144 = (float) arg1.field1029[var71] / 1024.0F;
                            class574.method3242(var122, var121, (byte) -69, var126, arg1.field988[var118], arg1.field1025[var118], arg1.field1018[var118], var123, var124, var144, var125);
                            var73 = class44.field496;
                            var74 = class583.field8287;
                            class574.method3242(var122, var121, (byte) -69, var126, arg1.field988[var119], arg1.field1025[var119], arg1.field1018[var119], var123, var124, var144, var125);
                            var76 = class583.field8287;
                            var75 = class44.field496;
                            class574.method3242(var122, var121, (byte) -69, var126, arg1.field988[var120], arg1.field1025[var120], arg1.field1018[var120], var123, var124, var144, var125);
                            var78 = class583.field8287;
                            var77 = class44.field496;
                            float var145 = var144 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var77 - var73 > var145) {
                                    var80 = 1;
                                    var77 -= var144;
                                } else if (var145 < var73 - var77) {
                                    var77 += var144;
                                    var80 = 2;
                                }
                                if ((var75 - var73 > var145)) {
                                    var79 = 1;
                                    var75 -= var144;
                                } else if (var73 - var75 > var145) {
                                    var75 += var144;
                                    var79 = 2;
                                }
                            } else {
                                if (var78 - var74 > var145) {
                                    var78 -= var144;
                                    var80 = 1;
                                } else if (var145 < var74 - var78) {
                                    var78 += var144;
                                    var80 = 2;
                                }
                                if ((var76 - var74 > var145)) {
                                    var76 -= var144;
                                    var79 = 1;
                                } else if (var74 - var76 > var145) {
                                    var79 = 2;
                                    var76 += var144;
                                }
                            }
                        } else if (var82 == 2) {
                            float var127 = (float) arg1.field1039[var71] / 256.0F;
                            float var128 = (float) arg1.field1022[var71] / 256.0F;
                            int var129 = arg1.field1025[var119] - arg1.field1025[var118];
                            int var130 = arg1.field1018[var119] - arg1.field1018[var118];
                            int var131 = arg1.field988[var119] - arg1.field988[var118];
                            int var132 = arg1.field1025[var120] - arg1.field1025[var118];
                            int var133 = arg1.field1018[var120] - arg1.field1018[var118];
                            int var134 = arg1.field988[var120] - arg1.field988[var118];
                            int var135 = var130 * var134 - (var131 * var133);
                            int var136 = var131 * var132 - (var129 * var134);
                            int var137 = var129 * var133 - (var130 * var132);
                            float var138 = 64.0F / (float) arg1.field997[var71];
                            float var139 = 64.0F / (float) arg1.field995[var71];
                            float var140 = 64.0F / (float) arg1.field1029[var71];
                            float var141 = (var124[2] * (float) var137 + var124[1] * (float) var136 + var124[0] * (float) var135) / var138;
                            float var142 = (var124[5] * (float) var137 + var124[4] * (float) var136 + var124[3] * (float) var135) / var139;
                            float var143 = (var124[8] * (float) var137 + var124[7] * (float) var136 + var124[6] * (float) var135) / var140;
                            var81 = class324.method1839(var142, var141, (byte) -99, var143);
                            class270.method1522(var128, arg1.field1025[var118], var125, arg1.field988[var118], arg1.field1018[var118], var127, var122, var81, 9830, var126, var124, var121, var123);
                            var74 = class389.field5196;
                            var73 = class622.field8830;
                            class270.method1522(var128, arg1.field1025[var119], var125, arg1.field988[var119], arg1.field1018[var119], var127, var122, var81, 9830, var126, var124, var121, var123);
                            var76 = class389.field5196;
                            var75 = class622.field8830;
                            class270.method1522(var128, arg1.field1025[var120], var125, arg1.field988[var120], arg1.field1018[var120], var127, var122, var81, 9830, var126, var124, var121, var123);
                            var78 = class389.field5196;
                            var77 = class622.field8830;
                        } else if (var82 == 3) {
                            class23.method112(-5728, var126, var123, var122, arg1.field1018[var118], var121, arg1.field1025[var118], var124, arg1.field988[var118], var125);
                            var74 = class79.field829;
                            var73 = class9.field87;
                            class23.method112(-5728, var126, var123, var122, arg1.field1018[var119], var121, arg1.field1025[var119], var124, arg1.field988[var119], var125);
                            var76 = class79.field829;
                            var75 = class9.field87;
                            class23.method112(-5728, var126, var123, var122, arg1.field1018[var120], var121, arg1.field1025[var120], var124, arg1.field988[var120], var125);
                            var77 = class9.field87;
                            var78 = class79.field829;
                            if ((var125 & 0x1) == 0) {
                                if ((var77 - var73 > 0.5F)) {
                                    var77--;
                                    var80 = 1;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
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
                                    var79 = 1;
                                    var76--;
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
            if (arg1.field1000 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1000[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var81 << 24) - (-((long) (var69 << 8)) - ((long) var72)) << 32);
                short var152 = arg1.field1028[var68];
                short var153 = arg1.field1033[var68];
                short var154 = arg1.field1004[var68];
                class646 var155 = var13[var152];
                this.field3118[var52] = this.method1394(var155.field9143, arg1, (byte) 9, var152, var150, var73, var155.field9142, var155.field9147, var155.field9144, var74);
                class646 var156 = var13[var153];
                this.field3128[var52] = this.method1394(var156.field9143, arg1, (byte) 9, var153, (long) var79 + var150, var75, var156.field9142, var156.field9147, var156.field9144, var76);
                class646 var157 = var13[var154];
                this.field3048[var52] = this.method1394(var157.field9143, arg1, (byte) 9, var154, (long) var80 + var150, var77, var157.field9142, var157.field9147, var157.field9144, var78);
            } else if (var146 == 1) {
                class522 var147 = var50[var68];
                long var148 = (long) ((var147.field7472 + 256 << 12) + ((var71 << 2) - (-(var147.field7476 <= 0 ? 2048 : 1024) - (var147.field7474 + 256 << 22)))) + ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32);
                this.field3118[var52] = this.method1394(0, arg1, (byte) 9, arg1.field1028[var68], var148, var73, var147.field7472, var147.field7474, var147.field7476, var74);
                this.field3128[var52] = this.method1394(0, arg1, (byte) 9, arg1.field1033[var68], (long) var79 + var148, var75, var147.field7472, var147.field7474, var147.field7476, var76);
                this.field3048[var52] = this.method1394(0, arg1, (byte) 9, arg1.field1004[var68], (long) var80 + var148, var77, var147.field7472, var147.field7474, var147.field7476, var78);
            }
            if (arg1.field1001 == null) {
                this.field3054[var52] = -1;
            } else {
                this.field3054[var52] = arg1.field1001[var68];
            }
            if (arg1.field1035 != null) {
                this.field3135[var52] = arg1.field1035[var68];
            }
            if (arg1.field991 != null) {
                this.field3070[var52] = arg1.field991[var68];
            }
            this.field3113[var52] = arg1.field1016[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field3047; var55++) {
            short var67 = this.field3054[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field3127 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field3047; var58++) {
            short var66 = this.field3054[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field3127[var56++] = var58;
            }
        }
        this.field3127[var56] = this.field3047;
        class374.field4861 = null;
        this.field3049 = class59.method402(this.field3049, this.field3107, (byte) -112);
        this.field3114 = class59.method402(this.field3114, this.field3107, (byte) -106);
        this.field3069 = class59.method402(this.field3069, this.field3107, (byte) -107);
        this.field3068 = class52.method265(this.field3068, this.field3107, 0);
        this.field3110 = class453.method2577((byte) 103, this.field3107, this.field3110);
        this.field3065 = class453.method2577((byte) 117, this.field3107, this.field3065);
        if (arg1.field1008 != null && class674.method3777(this.field3091, 1, arg2)) {
            this.field3094 = arg1.method575(false, 0);
        }
        if (arg1.field1030 != null && class255.method1457((byte) 85, arg2, this.field3091)) {
            this.field3055 = arg1.method576((byte) -127);
        }
        if (arg1.field1006 != null && class590.method3312(arg2, this.field3091, (byte) -128)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field3034; var61++) {
                int var65 = arg1.field1006[var8[var61]];
                if (var65 >= 0) {
                    if (var59 < var65) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field3122 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field3122[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field3034; var63++) {
                int var64 = arg1.field1006[var8[var63]];
                if (var64 >= 0) {
                    this.field3122[var64][var60[var64]++] = var63;
                }
            }
        }
    }
}
