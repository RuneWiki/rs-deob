import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class650 extends class498 {

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "[I")
    private int[] field8904;

    @OriginalMember(owner = "client!sk", name = "kc", descriptor = "I")
    private int field8963;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    private int field8894;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "I")
    private int field8901;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    private int field8881;

    @OriginalMember(owner = "client!sk", name = "ib", descriptor = "[I")
    private int[] field8909;

    @OriginalMember(owner = "client!sk", name = "rb", descriptor = "[I")
    private int[] field8918;

    @OriginalMember(owner = "client!sk", name = "Kb", descriptor = "[S")
    private short[] field8937;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    private int field8892;

    @OriginalMember(owner = "client!sk", name = "nc", descriptor = "[I")
    private int[] field8966;

    @OriginalMember(owner = "client!sk", name = "Zb", descriptor = "[Lmk;")
    private class62[] field8952;

    @OriginalMember(owner = "client!sk", name = "fc", descriptor = "[Lir;")
    private class28[] field8958;

    @OriginalMember(owner = "client!sk", name = "cc", descriptor = "I")
    private int field8955;

    @OriginalMember(owner = "client!sk", name = "Sb", descriptor = "[Lej;")
    private class134[] field8945;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[Lgs;")
    private class49[] field8870;

    @OriginalMember(owner = "client!sk", name = "xc", descriptor = "[F")
    private float[] field8976;

    @OriginalMember(owner = "client!sk", name = "yb", descriptor = "[F")
    private float[] field8925;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[S")
    private short[] field8877;

    @OriginalMember(owner = "client!sk", name = "Ic", descriptor = "S")
    private short field8987;

    @OriginalMember(owner = "client!sk", name = "Ib", descriptor = "[S")
    private short[] field8935;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "[S")
    private short[] field8871;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[S")
    private short[] field8872;

    @OriginalMember(owner = "client!sk", name = "jb", descriptor = "[S")
    private short[] field8910;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[S")
    private short[] field8875;

    @OriginalMember(owner = "client!sk", name = "xb", descriptor = "S")
    private short field8924;

    @OriginalMember(owner = "client!sk", name = "Lb", descriptor = "[S")
    private short[] field8938;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "[B")
    private byte[] field8863;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[S")
    private short[] field8867;

    @OriginalMember(owner = "client!sk", name = "yc", descriptor = "[S")
    private short[] field8977;

    @OriginalMember(owner = "client!sk", name = "Gc", descriptor = "[S")
    private short[] field8985;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[B")
    private byte[] field8862;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "[S")
    private short[] field8897;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "[S")
    private short[] field8889;

    @OriginalMember(owner = "client!sk", name = "Bc", descriptor = "[I")
    private int[] field8980;

    @OriginalMember(owner = "client!sk", name = "mc", descriptor = "[I")
    private int[] field8965;

    @OriginalMember(owner = "client!sk", name = "Ub", descriptor = "[I")
    private int[] field8947;

    @OriginalMember(owner = "client!sk", name = "qc", descriptor = "I")
    private int field8969;

    @OriginalMember(owner = "client!sk", name = "Xb", descriptor = "I")
    private int field8950;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "[[I")
    private int[][] field8893;

    @OriginalMember(owner = "client!sk", name = "lc", descriptor = "[[I")
    private int[][] field8964;

    @OriginalMember(owner = "client!sk", name = "Bb", descriptor = "[[I")
    private int[][] field8928;

    @OriginalMember(owner = "client!sk", name = "Ec", descriptor = "Z")
    private boolean field8983;

    @OriginalMember(owner = "client!sk", name = "Gb", descriptor = "Z")
    private boolean field8933;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Z")
    private boolean field8880;

    @OriginalMember(owner = "client!sk", name = "Vb", descriptor = "Z")
    private boolean field8948;

    @OriginalMember(owner = "client!sk", name = "Db", descriptor = "Z")
    private boolean field8930;

    @OriginalMember(owner = "client!sk", name = "Ab", descriptor = "Lwg;")
    private class449 field8927;

    @OriginalMember(owner = "client!sk", name = "dc", descriptor = "Lgv;")
    private class90 field8956;

    @OriginalMember(owner = "client!sk", name = "Cb", descriptor = "Lgv;")
    private class90 field8929;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "Lgv;")
    private class90 field8902;

    @OriginalMember(owner = "client!sk", name = "sb", descriptor = "Lgv;")
    private class90 field8919;

    @OriginalMember(owner = "client!sk", name = "zb", descriptor = "Ldm;")
    private class58 field8926;

    @OriginalMember(owner = "client!sk", name = "gc", descriptor = "Z")
    public static boolean field8959 = false;

    @OriginalMember(owner = "client!sk", name = "Dc", descriptor = "[I")
    public static int[] field8982 = new int[3];

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    private int field8884;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    private int field8885;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!sk", name = "eb", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!sk", name = "fb", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!sk", name = "gb", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!sk", name = "hb", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!sk", name = "kb", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!sk", name = "lb", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!sk", name = "mb", descriptor = "I")
    private int field8913;

    @OriginalMember(owner = "client!sk", name = "nb", descriptor = "I")
    private int field8914;

    @OriginalMember(owner = "client!sk", name = "ob", descriptor = "I")
    private int field8915;

    @OriginalMember(owner = "client!sk", name = "pb", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!sk", name = "qb", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!sk", name = "tb", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!sk", name = "ub", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!sk", name = "vb", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!sk", name = "wb", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!sk", name = "Eb", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!sk", name = "Fb", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!sk", name = "Hb", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!sk", name = "Jb", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!sk", name = "Mb", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!sk", name = "Nb", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!sk", name = "Ob", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!sk", name = "Pb", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!sk", name = "Qb", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!sk", name = "Rb", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!sk", name = "Tb", descriptor = "I")
    private int field8946;

    @OriginalMember(owner = "client!sk", name = "Wb", descriptor = "I")
    private int field8949;

    @OriginalMember(owner = "client!sk", name = "Yb", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!sk", name = "ac", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!sk", name = "bc", descriptor = "I")
    private int field8954;

    @OriginalMember(owner = "client!sk", name = "ec", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!sk", name = "hc", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!sk", name = "ic", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!sk", name = "jc", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!sk", name = "oc", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!sk", name = "pc", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!sk", name = "rc", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!sk", name = "sc", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!sk", name = "tc", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!sk", name = "uc", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!sk", name = "vc", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!sk", name = "wc", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!sk", name = "zc", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!sk", name = "Ac", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!sk", name = "Cc", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!sk", name = "Fc", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!sk", name = "Hc", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!sk", name = "Jc", descriptor = "Ljo;")
    private class354 field8988;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "[[[B")
    public static byte[][][] field8861;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lnh;Lgca;I)V", line = 5)
    public final void method355(class778 arg0, class265 arg1, int arg2) {
        field8916++;
        if (this.field8969 == 0) {
            return;
        }
        class256 var4 = this.field8927.field6222;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        class256 var5 = (class256) arg0;
        class114.field1442 = var4.field3009 * var5.field2994 + var4.field3021 * var5.field3031 + var4.field2994 * var5.field2991;
        class10.field185 = var4.field3009 * var5.field3006 + var4.field3021 * var5.field3028 + var4.field2994 * var5.field3002 + var4.field3006;
        float var6 = (float) this.field8885 * class114.field1442 + class10.field185;
        float var7 = (float) this.field8954 * class114.field1442 + class10.field185;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) (-this.field8915) + var7;
            var9 = (float) this.field8915 + var6;
        } else {
            var8 = (float) (-this.field8915) + var6;
            var9 = (float) this.field8915 + var7;
        }
        if ((this.field8927.field6315 <= var8) || (var9 <= (float) this.field8927.field6322)) {
            return;
        }
        class623.field8548 = var4.field3007 * var5.field3006 + var4.field3031 * var5.field3002 + var4.field3027 * var5.field3028 + var4.field3028;
        class182.field2217 = var4.field3007 * var5.field2994 + var4.field3031 * var5.field2991 + var4.field3027 * var5.field3031;
        float var10 = (float) this.field8885 * class182.field2217 + class623.field8548;
        float var11 = (float) this.field8954 * class182.field2217 + class623.field8548;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var13 = (var11 - (float) this.field8915) * (float) this.field8927.field6271;
            var12 = ((float) this.field8915 + var10) * (float) this.field8927.field6271;
        } else {
            var12 = ((float) this.field8915 + var11) * (float) this.field8927.field6271;
            var13 = ((float) (-this.field8915) + var10) * (float) this.field8927.field6271;
        }
        if ((var13 / var9 >= this.field8927.field6284) || (this.field8927.field6246 >= var12 / var9)) {
            return;
        }
        class656.field9042 = var4.field3004 * var5.field2994 + var4.field3018 * var5.field3031 + var4.field2991 * var5.field2991;
        class574.field7864 = var4.field3004 * var5.field3006 + var4.field3018 * var5.field3028 + var4.field2991 * var5.field3002 + var4.field3002;
        float var14 = (float) this.field8885 * class656.field9042 + class574.field7864;
        float var15 = (float) this.field8954 * class656.field9042 + class574.field7864;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field8915 + var14) * (float) this.field8927.field6275;
            var17 = (var15 - (float) this.field8915) * (float) this.field8927.field6275;
        } else {
            var17 = (var14 - (float) this.field8915) * (float) this.field8927.field6275;
            var16 = ((float) this.field8915 + var15) * (float) this.field8927.field6275;
        }
        if ((var17 / var9 >= this.field8927.field6301) || (var16 / var9 <= this.field8927.field6321)) {
            return;
        }
        if (arg1 != null || this.field8945 != null) {
            class522.field7402 = var4.field3007 * var5.field3021 + var4.field3031 * var5.field3018 + var4.field3027 * var5.field3027;
            class506.field7187 = var4.field3009 * var5.field3021 + var4.field3021 * var5.field3027 + var4.field2994 * var5.field3018;
            class498.field6966 = var4.field3007 * var5.field3009 + var4.field3031 * var5.field3004 + var4.field3027 * var5.field3007;
            class409.field5363 = var4.field3004 * var5.field3009 + var4.field3018 * var5.field3007 + var4.field2991 * var5.field3004;
            class271.field3192 = var4.field3009 * var5.field3009 + var4.field3021 * var5.field3007 + var4.field2994 * var5.field3004;
            class317.field3906 = var4.field3004 * var5.field3021 + var4.field3018 * var5.field3027 + var4.field2991 * var5.field3018;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field8913 + this.field8884 >> 1;
            int var21 = this.field8949 + this.field8946 >> 1;
            int var22 = (int) ((float) var21 * class498.field6966 + (float) this.field8885 * class182.field2217 + (float) var20 * class522.field7402 + class623.field8548);
            int var23 = (int) ((float) var21 * class409.field5363 + (float) this.field8885 * class656.field9042 + (float) var20 * class317.field3906 + class574.field7864);
            int var24 = (int) ((float) var21 * class271.field3192 + (float) this.field8885 * class114.field1442 + (float) var20 * class506.field7187 + class10.field185);
            if (var24 >= this.field8927.field6322) {
                arg1.field3133 = this.field8927.field6317 + (this.field8927.field6275 * var23 / var24);
                arg1.field3136 = this.field8927.field6271 * var22 / var24 + this.field8927.field6282;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class498.field6966 + (float) this.field8954 * class182.field2217 + (float) var20 * class522.field7402 + class623.field8548);
            int var26 = (int) ((float) var21 * class409.field5363 + (float) this.field8954 * class656.field9042 + (float) var20 * class317.field3906 + class574.field7864);
            int var27 = (int) ((float) var21 * class271.field3192 + (float) this.field8954 * class114.field1442 + (float) var20 * class506.field7187 + class10.field185);
            if (this.field8927.field6322 > var27) {
                var18 = true;
            } else {
                arg1.field3138 = this.field8927.field6275 * var26 / var27 + this.field8927.field6317;
                arg1.field3135 = this.field8927.field6282 + (this.field8927.field6271 * var25 / var27);
            }
            if (var18) {
                if (this.field8927.field6322 > var24 && var27 < this.field8927.field6322) {
                    var19 = false;
                } else if (this.field8927.field6322 > var24) {
                    int var31 = (var27 - this.field8927.field6322 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field3136 = this.field8927.field6271 * var32 / this.field8927.field6322 + this.field8927.field6282;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field3133 = this.field8927.field6275 * var33 / this.field8927.field6322 + this.field8927.field6317;
                } else if (this.field8927.field6322 > var27) {
                    int var28 = (var24 - this.field8927.field6322 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field3136 = this.field8927.field6271 * var29 / this.field8927.field6322 + this.field8927.field6282;
                    arg1.field3133 = this.field8927.field6275 * var30 / this.field8927.field6322 + this.field8927.field6317;
                }
            }
            if (var19) {
                arg1.field3137 = true;
                if (var27 >= var24) {
                    arg1.field3134 = (this.field8915 + var25) * this.field8927.field6271 / var27 + this.field8927.field6282 - arg1.field3135;
                } else {
                    arg1.field3134 = this.field8927.field6282 + ((var22 - -this.field8915) * this.field8927.field6271 / var24) - arg1.field3136;
                }
            }
        }
        this.field8927.method2696(false);
        this.field8927.method2721(var5, 14);
        this.method3674((byte) 117);
        this.method3664((byte) -76);
    }

    @OriginalMember(owner = "client!sk", name = "LA", descriptor = "(I)V", line = 200)
    public final void method373(int arg0) {
        this.field8987 = (short) arg0;
        field8900++;
        this.method3673(false);
        this.method3675(0);
    }

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "(I)V", line = 215)
    public final void method362(int arg0) {
        this.field8924 = (short) arg0;
        field8891++;
        this.method3661((byte) -68);
    }

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "()Z", line = 226)
    public final boolean method391() {
        field8865++;
        return this.field8933;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 234)
    public static void method3659(byte arg0) {
        if (arg0 == 58) {
            field8861 = null;
            field8982 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 248)
    private final void method3660(byte arg0) {
        field8890++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (arg0 != 126) {
            return;
        }
        while (this.field8881 > var10) {
            int var11 = this.field8909[var10];
            int var12 = this.field8918[var10];
            int var13 = this.field8966[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
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
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
            var10++;
        }
        this.field8885 = var3;
        this.field8949 = var7;
        this.field8913 = var2;
        this.field8954 = var6;
        this.field8884 = var5;
        this.field8946 = var4;
        this.field8915 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field8914 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field8930 = true;
    }

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "()Z", line = 330)
    public final boolean method380() {
        field8864++;
        return this.field8983;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "()V", line = 341)
    public final void method359() {
        field8936++;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V", line = 348)
    private final void method3661(byte arg0) {
        if (arg0 != -68) {
            this.method402((short) 28, (short) 7);
        }
        if (this.field8902 != null) {
            this.field8902.field1194 = false;
        }
        field8920++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lka;IIIZ)V", line = 363)
    public final void method384(class498 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8970++;
        class650 var6 = (class650) arg0;
        if (this.field8963 == 0 || var6.field8963 == 0) {
            return;
        }
        int var7 = var6.field8881;
        int[] var8 = var6.field8909;
        int[] var9 = var6.field8918;
        int[] var10 = var6.field8966;
        short[] var11 = var6.field8910;
        short[] var12 = var6.field8985;
        short[] var13 = var6.field8871;
        byte[] var14 = var6.field8863;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field8988 == null) {
            var15 = null;
            var16 = null;
            var18 = null;
            var17 = null;
        } else {
            var15 = this.field8988.field4402;
            var16 = this.field8988.field4400;
            var17 = this.field8988.field4399;
            var18 = this.field8988.field4401;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field8988 == null) {
            var21 = null;
            var22 = null;
            var19 = null;
            var20 = null;
        } else {
            var19 = var6.field8988.field4400;
            var20 = var6.field8988.field4401;
            var21 = var6.field8988.field4399;
            var22 = var6.field8988.field4402;
        }
        int[] var23 = var6.field8904;
        short[] var24 = var6.field8977;
        if (!var6.field8930) {
            var6.method3660((byte) 126);
        }
        int var25 = var6.field8885;
        int var26 = var6.field8954;
        int var27 = var6.field8913;
        int var28 = var6.field8884;
        int var29 = var6.field8946;
        int var30 = var6.field8949;
        for (int var31 = 0; var31 < this.field8881; var31++) {
            int var32 = this.field8918[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field8909[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field8966[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field8904[var31];
                        int var37 = this.field8904[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field8977[var38] - 1;
                            if (var35 == -1 || this.field8863[var35] != 0) {
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
                                            this.field8988 = new class354();
                                            var16 = this.field8988.field4400 = class89.method812(this.field8910, 0);
                                            var17 = this.field8988.field4399 = class89.method812(this.field8985, 0);
                                            var15 = this.field8988.field4402 = class89.method812(this.field8871, 0);
                                            var18 = this.field8988.field4401 = class85.method789((byte) -90, this.field8863);
                                        }
                                        if (var19 == null) {
                                            class354 var44 = var6.field8988 = new class354();
                                            var19 = var44.field4400 = class89.method812(var11, 0);
                                            var21 = var44.field4399 = class89.method812(var12, 0);
                                            var22 = var44.field4402 = class89.method812(var13, 0);
                                            var20 = var44.field4401 = class85.method789((byte) 97, var14);
                                        }
                                        short var45 = this.field8910[var35];
                                        short var46 = this.field8985[var35];
                                        short var47 = this.field8871[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field8863[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var19[var52] += var45;
                                                var21[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        short var54 = var11[var42];
                                        byte var55 = var14[var42];
                                        int var56 = this.field8904[var31];
                                        int var57 = this.field8904[var31 + 1];
                                        short var58 = var13[var42];
                                        for (int var59 = var56; var59 < var57; var59++) {
                                            int var60 = this.field8977[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var16[var60] += var54;
                                                var17[var60] += var53;
                                                var15[var60] += var58;
                                                var18[var60] += var55;
                                            }
                                        }
                                        var6.method3675(0);
                                        this.method3675(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "()I", line = 618)
    public final int method381() {
        field8921++;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        return this.field8913;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLhk;)V", line = 632)
    private final void method3662(byte arg0, class111 arg1) {
        if (class709.field9950.length < this.field8969) {
            class573.field7860 = new int[this.field8969];
            class709.field9950 = new int[this.field8969];
        }
        field8908++;
        for (int var3 = 0; var3 < this.field8881; var3++) {
            int var14 = (this.field8909[var3] - (this.field8918[var3] * this.field8927.field6248 >> 8) >> this.field8927.field6267) - arg1.field1391;
            int var15 = (this.field8966[var3] - (this.field8918[var3] * this.field8927.field6327 >> 8) >> this.field8927.field6267) - arg1.field1398;
            int var16 = this.field8904[var3];
            int var17 = this.field8904[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field8977[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class709.field9950[var19] = var14;
                class573.field7860[var19] = var15;
            }
        }
        int var4 = 0;
        if (arg0 <= 109) {
            return;
        }
        while (var4 < this.field8894) {
            if (this.field8862 == null || this.field8862[var4] <= 128) {
                short var5 = this.field8877[var4];
                short var6 = this.field8872[var4];
                short var7 = this.field8889[var4];
                int var8 = class709.field9950[var5];
                int var9 = class709.field9950[var6];
                int var10 = class709.field9950[var7];
                int var11 = class573.field7860[var5];
                int var12 = class573.field7860[var6];
                int var13 = class573.field7860[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg1.method887(var9, var10, var11, var8, var13, (byte) -9, var12);
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lnh;Lgca;II)V", line = 719)
    public final void method388(class778 arg0, class265 arg1, int arg2, int arg3) {
        field8911++;
        if (this.field8969 == 0) {
            return;
        }
        class256 var5 = this.field8927.field6222;
        class256 var6 = (class256) arg0;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        class10.field185 = var5.field3009 * var6.field3006 + var5.field3021 * var6.field3028 + var5.field2994 * var6.field3002 + var5.field3006;
        class114.field1442 = var5.field3009 * var6.field2994 + var5.field3021 * var6.field3031 + var5.field2994 * var6.field2991;
        float var7 = (float) this.field8885 * class114.field1442 + class10.field185;
        float var8 = (float) this.field8954 * class114.field1442 + class10.field185;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var10 = (float) (-this.field8915) + var8;
            var9 = (float) this.field8915 + var7;
        } else {
            var9 = (float) this.field8915 + var8;
            var10 = (float) (-this.field8915) + var7;
        }
        if ((var10 >= this.field8927.field6324) || (var9 <= (float) this.field8927.field6322)) {
            return;
        }
        class623.field8548 = var5.field3007 * var6.field3006 + var5.field3031 * var6.field3002 + var5.field3027 * var6.field3028 + var5.field3028;
        class182.field2217 = var5.field3007 * var6.field2994 + var5.field3031 * var6.field2991 + var5.field3027 * var6.field3031;
        float var11 = (float) this.field8885 * class182.field2217 + class623.field8548;
        float var12 = (float) this.field8954 * class182.field2217 + class623.field8548;
        float var13;
        float var14;
        if (var12 < var11) {
            var13 = (var12 - (float) this.field8915) * (float) this.field8927.field6271;
            var14 = ((float) this.field8915 + var11) * (float) this.field8927.field6271;
        } else {
            var13 = ((float) (-this.field8915) + var11) * (float) this.field8927.field6271;
            var14 = ((float) this.field8915 + var12) * (float) this.field8927.field6271;
        }
        if ((var13 / (float) arg2 >= this.field8927.field6284) || (this.field8927.field6246 >= var14 / (float) arg2)) {
            return;
        }
        class574.field7864 = var5.field3004 * var6.field3006 + var5.field3018 * var6.field3028 + var5.field2991 * var6.field3002 + var5.field3002;
        class656.field9042 = var5.field3004 * var6.field2994 + var5.field3018 * var6.field3031 + var5.field2991 * var6.field2991;
        float var15 = (float) this.field8885 * class656.field9042 + class574.field7864;
        float var16 = (float) this.field8954 * class656.field9042 + class574.field7864;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) this.field8915 + var15) * (float) this.field8927.field6275;
            var18 = (var16 - (float) this.field8915) * (float) this.field8927.field6275;
        } else {
            var18 = ((float) (-this.field8915) + var15) * (float) this.field8927.field6275;
            var17 = ((float) this.field8915 + var16) * (float) this.field8927.field6275;
        }
        if ((var18 / (float) arg2 >= this.field8927.field6301) || (this.field8927.field6321 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field8945 != null) {
            class409.field5363 = var5.field3004 * var6.field3009 + var5.field3018 * var6.field3007 + var5.field2991 * var6.field3004;
            class522.field7402 = var5.field3007 * var6.field3021 + var5.field3031 * var6.field3018 + var5.field3027 * var6.field3027;
            class498.field6966 = var5.field3007 * var6.field3009 + var5.field3031 * var6.field3004 + var5.field3027 * var6.field3007;
            class271.field3192 = var5.field3009 * var6.field3009 + var5.field3021 * var6.field3007 + var5.field2994 * var6.field3004;
            class317.field3906 = var5.field3004 * var6.field3021 + var5.field3018 * var6.field3027 + var5.field2991 * var6.field3018;
            class506.field7187 = var5.field3009 * var6.field3021 + var5.field3021 * var6.field3027 + var5.field2994 * var6.field3018;
        }
        if (arg1 != null) {
            int var19 = this.field8913 + this.field8884 >> 1;
            int var20 = this.field8949 + this.field8946 >> 1;
            int var21 = (int) ((float) var20 * class498.field6966 + (float) this.field8885 * class182.field2217 + (float) var19 * class522.field7402 + class623.field8548);
            int var22 = (int) ((float) var20 * class409.field5363 + (float) this.field8885 * class656.field9042 + (float) var19 * class317.field3906 + class574.field7864);
            int var23 = (int) ((float) var20 * class271.field3192 + (float) this.field8885 * class114.field1442 + (float) var19 * class506.field7187 + class10.field185);
            int var24 = (int) ((float) var20 * class498.field6966 + (float) this.field8954 * class182.field2217 + (float) var19 * class522.field7402 + class623.field8548);
            int var25 = (int) ((float) var20 * class409.field5363 + (float) this.field8954 * class656.field9042 + (float) var19 * class317.field3906 + class574.field7864);
            arg1.field3138 = this.field8927.field6317 + (this.field8927.field6275 * var25 / arg2);
            arg1.field3136 = this.field8927.field6271 * var21 / arg2 + this.field8927.field6282;
            arg1.field3135 = this.field8927.field6271 * var24 / arg2 + this.field8927.field6282;
            int var26 = (int) ((float) var20 * class271.field3192 + (float) this.field8954 * class114.field1442 + (float) var19 * class506.field7187 + class10.field185);
            arg1.field3133 = this.field8927.field6275 * var22 / arg2 + this.field8927.field6317;
            if (this.field8927.field6322 <= var23 || this.field8927.field6322 <= var26) {
                arg1.field3134 = (var21 + this.field8915) * this.field8927.field6271 / arg2 + this.field8927.field6282 - arg1.field3136;
                arg1.field3137 = true;
            }
        }
        this.field8927.method2647((float) arg2, -128);
        this.field8927.method2662((byte) 99);
        this.field8927.method2721(var6, 14);
        this.method3674((byte) -39);
        this.method3664((byte) -76);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lnh;IZ)V", line = 863)
    public final void method390(class778 arg0, int arg1, boolean arg2) {
        field8873++;
        if (this.field8937 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field8881; var5++) {
            if ((arg1 & this.field8937[var5]) != 0) {
                if (arg2) {
                    arg0.method134(this.field8909[var5], this.field8918[var5], this.field8966[var5], var4);
                } else {
                    arg0.method132(this.field8909[var5], this.field8918[var5], this.field8966[var5], var4);
                }
                this.field8909[var5] = var4[0];
                this.field8918[var5] = var4[1];
                this.field8966[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "ba", descriptor = "(Lr;)Lr;", line = 896)
    public final class196 method365(class196 arg0) {
        field8934++;
        if (this.field8969 == 0) {
            return null;
        }
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        int var2;
        int var3;
        if (this.field8927.field6248 <= 0) {
            var2 = this.field8913 - (this.field8927.field6248 * this.field8885 >> 8) >> this.field8927.field6267;
            var3 = this.field8884 - (this.field8927.field6248 * this.field8954 >> 8) >> this.field8927.field6267;
        } else {
            var2 = this.field8913 - (this.field8927.field6248 * this.field8954 >> 8) >> this.field8927.field6267;
            var3 = this.field8884 - (this.field8927.field6248 * this.field8885 >> 8) >> this.field8927.field6267;
        }
        int var4;
        int var5;
        if (this.field8927.field6327 <= 0) {
            var4 = this.field8946 - (this.field8927.field6327 * this.field8885 >> 8) >> this.field8927.field6267;
            var5 = this.field8949 - (this.field8927.field6327 * this.field8954 >> 8) >> this.field8927.field6267;
        } else {
            var4 = this.field8946 - (this.field8927.field6327 * this.field8954 >> 8) >> this.field8927.field6267;
            var5 = this.field8949 - (this.field8927.field6327 * this.field8885 >> 8) >> this.field8927.field6267;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class111 var8 = (class111) arg0;
        class111 var9;
        if (var8 != null && var8.method889(-22539, var7, var6)) {
            var9 = var8;
            var8.method890(-1);
        } else {
            var9 = new class111(this.field8927, var6, var7);
        }
        var9.method888(var2, var5, var3, (byte) -73, var4);
        this.method3662((byte) 112, var9);
        return var9;
    }

    @OriginalMember(owner = "client!sk", name = "wa", descriptor = "()V", line = 959)
    public final void method372() {
        for (int var1 = 0; var1 < this.field8892; var1++) {
            this.field8909[var1] = this.field8909[var1] + 7 >> 4;
            this.field8918[var1] = this.field8918[var1] + 7 >> 4;
            this.field8966[var1] = this.field8966[var1] + 7 >> 4;
        }
        field8895++;
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIB)Z", line = 979)
    private final boolean method3663(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field8975++;
        if (arg4 < arg7 && arg2 > arg4 && arg1 > arg4) {
            return false;
        } else if (arg7 < arg4 && arg4 > arg2 && arg1 < arg4) {
            return false;
        } else if (arg3 > arg6 && arg6 < arg5 && arg6 < arg0) {
            return false;
        } else if (arg6 > arg3 && arg5 < arg6 && arg6 > arg0) {
            return false;
        } else {
            if (arg8 <= 23) {
                this.method383();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)V", line = 1006)
    private final void method3664(byte arg0) {
        if (this.field8945 != null) {
            this.field8927.method635(!this.field8983);
            this.field8927.method2675(false, arg0 ^ 0x4C);
            this.field8927.method2694((byte) -49, 1, class555.field7718);
            this.field8927.method2703(class555.field7718, (byte) -97, 1);
            for (int var2 = 0; var2 < this.field8955; var2++) {
                class134 var3 = this.field8945[var2];
                class49 var4 = this.field8870[var2];
                if (!var3.field1688 || !this.field8927.method54()) {
                    float var5 = (float) (this.field8909[var3.field1683] + this.field8909[var3.field1682] + this.field8909[var3.field1687]) * 0.3333333F;
                    float var6 = (float) (this.field8918[var3.field1687] + this.field8918[var3.field1682] + this.field8918[var3.field1683]) * 0.3333333F;
                    float var7 = (float) (this.field8966[var3.field1687] + this.field8966[var3.field1683] + this.field8966[var3.field1682]) * 0.3333333F;
                    float var8 = class498.field6966 * var7 + class522.field7402 * var5 + class182.field2217 * var6 + class623.field8548;
                    float var9 = class409.field5363 * var7 + class656.field9042 * var6 + class317.field3906 * var5 + class574.field7864;
                    float var10 = class271.field3192 * var7 + class506.field7187 * var5 + class114.field1442 * var6 + class10.field185;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9))) * (float) var3.field1680;
                    class256 var12 = this.field8927.method2652(-17);
                    var12.method1537((byte) -87, var3.field1685 * var4.field694 >> 7, (float) var4.field692 + var8 - var8 * var11, var3.field1686 * var4.field689 >> 7, (float) var4.field688 + var9 - var9 * var11, -(var10 * var11) + var10, var4.field695);
                    var12.method1520(this.field8927.field6223, 0);
                    this.field8927.method2688(0);
                    int var13 = var4.field687;
                    this.field8927.method2711(-1, false, var3.field1679, false);
                    this.field8927.method2699((byte) 14, var3.field1684);
                    this.field8927.method2673(var13, arg0 - 22);
                    this.field8927.method2692(2);
                }
            }
            this.field8927.method2703(class616.field8291, (byte) -123, 1);
            this.field8927.method2694((byte) -49, 1, class616.field8291);
            this.field8927.method635(true);
        }
        if (arg0 != -76) {
            this.field8893 = null;
        }
        field8960++;
    }

    @OriginalMember(owner = "client!sk", name = "ma", descriptor = "()I", line = 1070)
    public final int method394() {
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        field8972++;
        return this.field8914;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lnh;)V", line = 1081)
    public final void method389(class778 arg0) {
        field8886++;
        class256 var2 = (class256) arg0;
        if (this.field8952 != null) {
            for (int var3 = 0; var3 < this.field8952.length; var3++) {
                class62 var4 = this.field8952[var3];
                class62 var5 = var4;
                if (var4.field846 != null) {
                    var5 = var4.field846;
                }
                var5.field834 = (int) ((float) this.field8966[var4.field844] * var2.field3007 + (float) this.field8918[var4.field844] * var2.field3031 + (float) this.field8909[var4.field844] * var2.field3027 + var2.field3028);
                var5.field849 = (int) ((float) this.field8966[var4.field844] * var2.field3004 + (float) this.field8918[var4.field844] * var2.field2991 + (float) this.field8909[var4.field844] * var2.field3018 + var2.field3002);
                var5.field840 = (int) ((float) this.field8966[var4.field844] * var2.field3009 + (float) this.field8918[var4.field844] * var2.field2994 + (float) this.field8909[var4.field844] * var2.field3021 + var2.field3006);
                var5.field833 = (int) ((float) this.field8966[var4.field843] * var2.field3007 + (float) this.field8918[var4.field843] * var2.field3031 + (float) this.field8909[var4.field843] * var2.field3027 + var2.field3028);
                var5.field835 = (int) ((float) this.field8966[var4.field843] * var2.field3004 + (float) this.field8918[var4.field843] * var2.field2991 + (float) this.field8909[var4.field843] * var2.field3018 + var2.field3002);
                var5.field827 = (int) ((float) this.field8966[var4.field843] * var2.field3009 + (float) this.field8918[var4.field843] * var2.field2994 + (float) this.field8909[var4.field843] * var2.field3021 + var2.field3006);
                var5.field828 = (int) ((float) this.field8966[var4.field839] * var2.field3007 + (float) this.field8918[var4.field839] * var2.field3031 + (float) this.field8909[var4.field839] * var2.field3027 + var2.field3028);
                var5.field832 = (int) ((float) this.field8966[var4.field839] * var2.field3004 + (float) this.field8918[var4.field839] * var2.field2991 + (float) this.field8909[var4.field839] * var2.field3018 + var2.field3002);
                var5.field848 = (int) ((float) this.field8966[var4.field839] * var2.field3009 + (float) this.field8918[var4.field839] * var2.field2994 + (float) this.field8909[var4.field839] * var2.field3021 + var2.field3006);
            }
        }
        if (this.field8958 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field8958.length; var6++) {
            class28 var7 = this.field8958[var6];
            class28 var8 = var7;
            if (var7.field431 != null) {
                var8 = var7.field431;
            }
            if (var7.field427 == null) {
                var7.field427 = var2.method136();
            } else {
                var7.field427.method141(var2);
            }
            var8.field432 = (int) ((float) this.field8966[var7.field424] * var2.field3007 + (float) this.field8918[var7.field424] * var2.field3031 + (float) this.field8909[var7.field424] * var2.field3027 + var2.field3028);
            var8.field435 = (int) ((float) this.field8966[var7.field424] * var2.field3004 + (float) this.field8918[var7.field424] * var2.field2991 + (float) this.field8909[var7.field424] * var2.field3018 + var2.field3002);
            var8.field425 = (int) ((float) this.field8966[var7.field424] * var2.field3009 + (float) this.field8918[var7.field424] * var2.field2994 + (float) this.field8909[var7.field424] * var2.field3021 + var2.field3006);
        }
    }

    @OriginalMember(owner = "client!sk", name = "EA", descriptor = "()I", line = 1149)
    public final int method400() {
        field8876++;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        return this.field8954;
    }

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "(I[IIIIZI[I)V", line = 1162)
    public final void method395(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field8978++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class203.field2428 = 0;
            class87.field1164 = 0;
            class538.field7579 = 0;
            int var13 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field8893.length) {
                    int[] var16 = this.field8893[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field8937 == null || (this.field8937[var18] & arg6) != 0) {
                            class203.field2428 += this.field8909[var18];
                            class538.field7579 += this.field8918[var18];
                            var13++;
                            class87.field1164 += this.field8966[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class523.field7420 = true;
                class87.field1164 = class87.field1164 / var13 + var10;
                class538.field7579 = class538.field7579 / var13 + var12;
                class203.field2428 = class203.field2428 / var13 + var11;
            } else {
                class203.field2428 = var11;
                class538.field7579 = var12;
                class87.field1164 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3 - (-(arg7[2] * arg4) - 8192)) >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + (arg7[7] * arg3) + (arg7[8] * arg4 - -8192) >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field8893.length > var26) {
                    int[] var27 = this.field8893[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field8937 == null || (this.field8937[var29] & arg6) != 0) {
                            this.field8909[var29] += var22;
                            this.field8918[var29] += var24;
                            this.field8966[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field8893.length > var109) {
                        int[] var110 = this.field8893[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field8937 == null || (this.field8937[var112] & arg6) != 0) {
                                this.field8909[var112] -= class203.field2428;
                                this.field8918[var112] -= class538.field7579;
                                this.field8966[var112] -= class87.field1164;
                                if (arg4 != 0) {
                                    int var113 = class789.field10868[arg4];
                                    int var114 = class789.field10864[arg4];
                                    int var115 = this.field8918[var112] * var113 + this.field8909[var112] * var114 + 16383 >> 14;
                                    this.field8918[var112] = this.field8918[var112] * var114 + 16383 - (this.field8909[var112] * var113) >> 14;
                                    this.field8909[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class789.field10868[arg2];
                                    int var117 = class789.field10864[arg2];
                                    int var118 = this.field8918[var112] * var117 + 16383 - this.field8966[var112] * var116 >> 14;
                                    this.field8966[var112] = this.field8966[var112] * var117 + this.field8918[var112] * var116 + 16383 >> 14;
                                    this.field8918[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class789.field10868[arg3];
                                    int var120 = class789.field10864[arg3];
                                    int var121 = this.field8966[var112] * var119 + (this.field8909[var112] * var120) + 16383 >> 14;
                                    this.field8966[var112] = this.field8966[var112] * var120 - (this.field8909[var112] * var119 - 16383) >> 14;
                                    this.field8909[var112] = var121;
                                }
                                this.field8909[var112] += class203.field2428;
                                this.field8918[var112] += class538.field7579;
                                this.field8966[var112] += class87.field1164;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field8893.length) {
                            int[] var93 = this.field8893[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field8937 == null || (this.field8937[var95] & arg6) != 0) {
                                    int var96 = this.field8904[var95];
                                    int var97 = this.field8904[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field8977[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class789.field10868[arg4];
                                            int var101 = class789.field10864[arg4];
                                            int var102 = this.field8985[var99] * var100 + this.field8910[var99] * var101 + 16383 >> 14;
                                            this.field8985[var99] = (short) (this.field8985[var99] * var101 + 16383 - (this.field8910[var99] * var100) >> 14);
                                            this.field8910[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class789.field10868[arg2];
                                            int var104 = class789.field10864[arg2];
                                            int var105 = this.field8985[var99] * var104 + 16383 - (this.field8871[var99] * var103) >> 14;
                                            this.field8871[var99] = (short) (this.field8985[var99] * var103 + this.field8871[var99] * var104 + 16383 >> 14);
                                            this.field8985[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class789.field10868[arg3];
                                            int var107 = class789.field10864[arg3];
                                            int var108 = this.field8871[var99] * var106 + this.field8910[var99] * var107 + 16383 >> 14;
                                            this.field8871[var99] = (short) (this.field8871[var99] * var107 + 16383 - (this.field8910[var99] * var106) >> 14);
                                            this.field8910[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method3675(0);
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class523.field7420) {
                    int var36 = arg7[6] * class87.field1164 + (arg7[0] * class203.field2428 + (arg7[3] * class538.field7579)) + 8192 >> 14;
                    int var37 = arg7[1] * class203.field2428 + arg7[4] * class538.field7579 - (-(arg7[7] * class87.field1164) + -8192) >> 14;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[2] * class203.field2428 + arg7[8] * class87.field1164 + arg7[5] * class538.field7579 + 8192 >> 14;
                    int var41 = var35 + var40;
                    class203.field2428 = var38;
                    class538.field7579 = var39;
                    class523.field7420 = false;
                    class87.field1164 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class789.field10864[arg2];
                int var44 = class789.field10868[arg2];
                int var45 = class789.field10864[arg3];
                int var46 = class789.field10868[arg3];
                int var47 = class789.field10864[arg4];
                int var48 = class789.field10868[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[7] = var46 * var48 + (var45 * var49) + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50) + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[1] = var46 * var49 + -var45 * var48 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[5] = -var44;
                var42[0] = var46 * var50 + var45 * var47 + 8192 >> 14;
                int var51 = var42[0] * -class203.field2428 + (var42[1] * -class538.field7579) + var42[2] * -class87.field1164 + 8192 >> 14;
                int var52 = var42[5] * -class87.field1164 + var42[4] * -class538.field7579 + var42[3] * -class203.field2428 + 8192 >> 14;
                int var53 = var42[8] * -class87.field1164 + (var42[6] * -class203.field2428 + (var42[7] * -class538.field7579)) + 8192 >> 14;
                int var54 = class203.field2428 + var51;
                int var55 = class538.field7579 + var52;
                int var56 = var53 + class87.field1164;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[1] * var34 + var42[0] * var33 + (var42[2] * var35) + 8192 >> 14;
                int var60 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 8192 >> 14;
                int var61 = var54 + var59;
                int var62 = var55 + var60;
                int var63 = var42[6] * var33 + var42[8] * var35 + (var42[7] * var34) + 8192 >> 14;
                int var64 = var56 + var63;
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
                int var67 = arg7[0] * var61 + (arg7[1] * var62) + (arg7[2] * var64) + 8192 >> 14;
                int var68 = arg7[3] * var61 + (arg7[5] * var64) + arg7[4] * var62 + 8192 >> 14;
                int var69 = var30 + var67;
                int var70 = var31 + var68;
                int var71 = arg7[7] * var62 + arg7[6] * var61 + (arg7[8] * var64) + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field8893.length) {
                        int[] var75 = this.field8893[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field8937 == null || (this.field8937[var77] & arg6) != 0) {
                                int var78 = this.field8918[var77] * var65[1] + (this.field8966[var77] * var65[2]) + this.field8909[var77] * var65[0] + 8192 >> 14;
                                int var79 = this.field8966[var77] * var65[5] + this.field8918[var77] * var65[4] + this.field8909[var77] * var65[3] + 8192 >> 14;
                                int var80 = this.field8918[var77] * var65[7] + this.field8966[var77] * var65[8] + this.field8909[var77] * var65[6] + 8192 >> 14;
                                int var81 = var70 + var79;
                                int var82 = var69 + var78;
                                this.field8909[var77] = var82;
                                int var83 = var72 + var80;
                                this.field8918[var77] = var81;
                                this.field8966[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field8893.length > var123) {
                        int[] var124 = this.field8893[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field8937 == null || (this.field8937[var126] & arg6) != 0) {
                                this.field8909[var126] -= class203.field2428;
                                this.field8918[var126] -= class538.field7579;
                                this.field8966[var126] -= class87.field1164;
                                this.field8909[var126] = this.field8909[var126] * arg2 >> 7;
                                this.field8918[var126] = this.field8918[var126] * arg3 >> 7;
                                this.field8966[var126] = this.field8966[var126] * arg4 >> 7;
                                this.field8909[var126] += class203.field2428;
                                this.field8918[var126] += class538.field7579;
                                this.field8966[var126] += class87.field1164;
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
                if (class523.field7420) {
                    int var133 = arg7[0] * class203.field2428 + arg7[3] * class538.field7579 + arg7[6] * class87.field1164 + 8192 >> 14;
                    int var134 = arg7[7] * class87.field1164 + arg7[4] * class538.field7579 + arg7[1] * class203.field2428 + 8192 >> 14;
                    int var135 = arg7[2] * class203.field2428 + arg7[5] * class538.field7579 + arg7[8] * class87.field1164 + 8192 >> 14;
                    int var136 = var130 + var133;
                    int var137 = var131 + var134;
                    int var138 = var132 + var135;
                    class203.field2428 = var136;
                    class538.field7579 = var137;
                    class87.field1164 = var138;
                    class523.field7420 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class203.field2428 * var139 + 8192 >> 14;
                int var143 = -class538.field7579 * var140 + 8192 >> 14;
                int var144 = -class87.field1164 * var141 + 8192 >> 14;
                int var145 = class203.field2428 + var142;
                int var146 = var143 + class538.field7579;
                int var147 = class87.field1164 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var132 * var141 + 8192 >> 14;
                int var153 = var146 + var150;
                int var154 = var147 + var152;
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
                int var157 = arg7[2] * var154 + arg7[0] * var151 - (-(arg7[1] * var153) - 8192) >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var151 + arg7[4] * var153 + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = arg7[8] * var154 + (arg7[6] * var151 - (-(arg7[7] * var153) - 8192)) >> 14;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field8893.length > var164) {
                        int[] var165 = this.field8893[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field8937 == null || (this.field8937[var167] & arg6) != 0) {
                                int var168 = this.field8918[var167] * var155[1] + this.field8909[var167] * var155[0] - (-(this.field8966[var167] * var155[2]) - 8192) >> 14;
                                int var169 = this.field8909[var167] * var155[3] + (this.field8966[var167] * var155[5]) + this.field8918[var167] * var155[4] + 8192 >> 14;
                                int var170 = var161 + var168;
                                int var171 = var159 + var169;
                                int var172 = this.field8909[var167] * var155[6] + this.field8966[var167] * var155[8] + this.field8918[var167] * var155[7] + 8192 >> 14;
                                this.field8909[var167] = var170;
                                int var173 = var162 + var172;
                                this.field8918[var167] = var171;
                                this.field8966[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8928 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field8928.length) {
                        int[] var183 = this.field8928[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field8938 == null || (this.field8938[var185] & arg6) != 0) {
                                int var186 = (this.field8862[var185] & 0xFF) + (arg2 * 8);
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field8862[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field8945 != null) {
                        for (int var179 = 0; var179 < this.field8955; var179++) {
                            class134 var180 = this.field8945[var179];
                            class49 var181 = this.field8870[var179];
                            var181.field687 = var181.field687 & 0xFFFFFF | 255 - (this.field8862[var180.field1681] & 0xFF) << 24;
                        }
                    }
                    this.method3661((byte) -68);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8928 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field8928.length > var192) {
                        int[] var193 = this.field8928[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field8938 == null || (arg6 & this.field8938[var195]) != 0) {
                                int var196 = this.field8935[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = arg2 + var197 & 0x3F;
                                int var200 = var196 & 0x7F;
                                int var201 = arg3 / 4 + var198;
                                if (var201 < 0) {
                                    var201 = 0;
                                } else if (var201 > 7) {
                                    var201 = 7;
                                }
                                int var202 = arg4 + var200;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field8935[var195] = (short) class5.method105(class5.method105(var199 << 10, var201 << 7), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field8945 != null) {
                        for (int var189 = 0; var189 < this.field8955; var189++) {
                            class134 var190 = this.field8945[var189];
                            class49 var191 = this.field8870[var189];
                            var191.field687 = var191.field687 & 0xFF000000 | class437.field5749[this.field8935[var190.field1681] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method3661((byte) -68);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8964 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field8964.length) {
                        int[] var205 = this.field8964[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class49 var207 = this.field8870[var205[var206]];
                            var207.field692 += arg2;
                            var207.field688 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8964 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field8964.length > var209) {
                        int[] var210 = this.field8964[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class49 var212 = this.field8870[var210[var211]];
                            var212.field694 = var212.field694 * arg3 >> 7;
                            var212.field689 = var212.field689 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8964 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field8964.length) {
                    int[] var215 = this.field8964[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class49 var217 = this.field8870[var215[var216]];
                        var217.field695 = var217.field695 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "(IIII)V", line = 2155)
    public final void method386(int arg0, int arg1, int arg2, int arg3) {
        field8973++;
        if (arg0 == 0) {
            class87.field1164 = 0;
            class538.field7579 = 0;
            class203.field2428 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field8881; var6++) {
                class203.field2428 += this.field8909[var6];
                class538.field7579 += this.field8918[var6];
                var5++;
                class87.field1164 += this.field8966[var6];
            }
            if (var5 <= 0) {
                class203.field2428 = arg1;
                class87.field1164 = arg3;
                class538.field7579 = arg2;
            } else {
                class87.field1164 = class87.field1164 / var5 + arg3;
                class203.field2428 = class203.field2428 / var5 + arg1;
                class538.field7579 = class538.field7579 / var5 + arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field8881; var7++) {
                this.field8909[var7] += arg1;
                this.field8918[var7] += arg2;
                this.field8966[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field8881; var8++) {
                this.field8909[var8] -= class203.field2428;
                this.field8918[var8] -= class538.field7579;
                this.field8966[var8] -= class87.field1164;
                if (arg3 != 0) {
                    int var9 = class789.field10868[arg3];
                    int var10 = class789.field10864[arg3];
                    int var11 = this.field8918[var8] * var9 + (this.field8909[var8] * var10) + 16383 >> 14;
                    this.field8918[var8] = this.field8918[var8] * var10 + 16383 - (this.field8909[var8] * var9) >> 14;
                    this.field8909[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class789.field10868[arg1];
                    int var13 = class789.field10864[arg1];
                    int var14 = this.field8918[var8] * var13 + 16383 - (this.field8966[var8] * var12) >> 14;
                    this.field8966[var8] = this.field8966[var8] * var13 + this.field8918[var8] * var12 + 16383 >> 14;
                    this.field8918[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class789.field10868[arg2];
                    int var16 = class789.field10864[arg2];
                    int var17 = this.field8966[var8] * var15 + this.field8909[var8] * var16 + 16383 >> 14;
                    this.field8966[var8] = this.field8966[var8] * var16 + 16383 - (this.field8909[var8] * var15) >> 14;
                    this.field8909[var8] = var17;
                }
                this.field8909[var8] += class203.field2428;
                this.field8918[var8] += class538.field7579;
                this.field8966[var8] += class87.field1164;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field8881; var18++) {
                this.field8909[var18] -= class203.field2428;
                this.field8918[var18] -= class538.field7579;
                this.field8966[var18] -= class87.field1164;
                this.field8909[var18] = this.field8909[var18] * arg1 / 128;
                this.field8918[var18] = this.field8918[var18] * arg2 / 128;
                this.field8966[var18] = this.field8966[var18] * arg3 / 128;
                this.field8909[var18] += class203.field2428;
                this.field8918[var18] += class538.field7579;
                this.field8966[var18] += class87.field1164;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field8963; var19++) {
                int var23 = (this.field8862[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field8862[var19] = (byte) var23;
            }
            if (this.field8945 != null) {
                for (int var20 = 0; var20 < this.field8955; var20++) {
                    class134 var21 = this.field8945[var20];
                    class49 var22 = this.field8870[var20];
                    var22.field687 = 255 - (this.field8862[var21.field1681] & 0xFF) << 24 | var22.field687 & 0xFFFFFF;
                }
            }
            this.method3661((byte) -68);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field8963; var24++) {
                int var28 = this.field8935[var24] & 0xFFFF;
                int var29 = (var28 & 0xFFD7) >> 10;
                int var30 = (var28 & 0x3D6) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field8935[var24] = (short) class5.method105(class5.method105(var32 << 10, var33 << 7), var34);
            }
            if (this.field8945 != null) {
                for (int var25 = 0; var25 < this.field8955; var25++) {
                    class134 var26 = this.field8945[var25];
                    class49 var27 = this.field8870[var25];
                    var27.field687 = class437.field5749[this.field8935[var26.field1681] & 0xFFFF] & 0xFFFFFF | var27.field687 & 0xFF000000;
                }
            }
            this.method3661((byte) -68);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field8955; var35++) {
                class49 var36 = this.field8870[var35];
                var36.field692 += arg1;
                var36.field688 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field8955; var37++) {
                class49 var38 = this.field8870[var37];
                var38.field694 = var38.field694 * arg2 >> 7;
                var38.field689 = var38.field689 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field8955; var39++) {
                class49 var40 = this.field8870[var39];
                var40.field695 = var40.field695 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lwg;IIZZ)V", line = 6399)
    public class650(class449 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field8881 = 0;
        this.field8894 = 0;
        this.field8892 = 0;
        this.field8880 = true;
        this.field8948 = false;
        this.field8963 = 0;
        this.field8983 = false;
        this.field8933 = false;
        this.field8969 = 0;
        this.field8930 = false;
        this.field8901 = arg1;
        this.field8927 = arg0;
        this.field8950 = arg2;
        this.field8948 = arg4;
        if (arg3 || class539.method3199(false, this.field8901, this.field8950)) {
            this.field8956 = new class90(class372.method2181(this.field8901, this.field8950, 10504));
        }
        if (arg3 || class132.method980(this.field8950, 86, this.field8901)) {
            this.field8929 = new class90(class414.method2466(this.field8950, (byte) 89, this.field8901));
        }
        if (arg3 || class494.method2913(this.field8950, 31613, this.field8901)) {
            this.field8902 = new class90(class217.method1352(this.field8950, this.field8901, -108));
        }
        if (arg3 || class74.method692(0, this.field8901, this.field8950)) {
            this.field8919 = new class90(class37.method325((byte) -122, this.field8950, this.field8901));
        }
        if (arg3 || class50.method464(this.field8901, -128, this.field8950)) {
            this.field8926 = new class58(class504.method3024(this.field8950, (byte) 93, this.field8901));
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V", line = 2469)
    private final void method3665(int arg0) {
        field8922++;
        if (!this.field8880) {
            return;
        }
        this.field8880 = false;
        if (this.field8952 == null && this.field8958 == null && this.field8945 == null && !class689.method3850(this.field8950, 55, this.field8901)) {
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            if (this.field8909 != null && !class101.method848(this.field8950, this.field8901, arg0 ^ 0xA181BB56)) {
                if (this.field8956 == null || this.field8956.method818((byte) 82)) {
                    if (!this.field8930) {
                        this.method3660((byte) 126);
                    }
                    var2 = true;
                } else {
                    this.field8880 = true;
                }
            }
            if (this.field8918 != null && !class245.method1475(this.field8950, 77, this.field8901)) {
                if (this.field8956 == null || this.field8956.method818((byte) 89)) {
                    var3 = true;
                    if (!this.field8930) {
                        this.method3660((byte) 126);
                    }
                } else {
                    this.field8880 = true;
                }
            }
            if (this.field8966 != null && !class645.method3604(this.field8901, (byte) -127, this.field8950)) {
                if (this.field8956 == null || this.field8956.method818((byte) 61)) {
                    if (!this.field8930) {
                        this.method3660((byte) 126);
                    }
                    var4 = true;
                } else {
                    this.field8880 = true;
                }
            }
            if (var3) {
                this.field8918 = null;
            }
            if (var4) {
                this.field8966 = null;
            }
            if (var2) {
                this.field8909 = null;
            }
        }
        if (arg0 != 30615) {
            this.method3662((byte) 125, null);
        }
        if (this.field8977 != null && this.field8909 == null && this.field8918 == null && this.field8966 == null) {
            this.field8904 = null;
            this.field8977 = null;
        }
        if (this.field8863 != null && !class39.method333(this.field8950, 789221, this.field8901)) {
            label214: {
                label213: {
                    boolean var10000;
                    if ((this.field8950 & 0x37) == 0) {
                        if (this.field8902 == null || this.field8902.method818((byte) 72)) {
                            break label213;
                        }
                        var10000 = false;
                    } else {
                        if (this.field8919 == null || this.field8919.method818((byte) 38)) {
                            break label213;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field8880 = true;
                        break label214;
                    }
                }
                this.field8910 = this.field8985 = this.field8871 = null;
                this.field8863 = null;
            }
        }
        if (this.field8935 != null && !class512.method3074(this.field8901, this.field8950, arg0 - 30614)) {
            if (this.field8902 == null || this.field8902.method818((byte) 94)) {
                this.field8935 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8862 != null && !class647.method3639(this.field8901, this.field8950, (byte) 109)) {
            if (this.field8902 == null || this.field8902.method818((byte) 55)) {
                this.field8862 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8925 != null && !class185.method1234(this.field8950, this.field8901, arg0 ^ 0x227A)) {
            if (this.field8929 == null || this.field8929.method818((byte) 100)) {
                this.field8925 = this.field8976 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8897 != null && !class65.method549(2048, this.field8950, this.field8901)) {
            if (this.field8902 == null || this.field8902.method818((byte) 90)) {
                this.field8897 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8877 != null && !class57.method506(this.field8901, 30202, this.field8950)) {
            if ((this.field8926 == null || this.field8926.method511((byte) -123)) && (this.field8902 == null || this.field8902.method818((byte) 58))) {
                this.field8877 = this.field8872 = this.field8889 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8875 != null) {
            if (this.field8956 == null || this.field8956.method818((byte) 98)) {
                this.field8875 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8867 != null) {
            if (this.field8902 == null || this.field8902.method818((byte) 125)) {
                this.field8867 = null;
            } else {
                this.field8880 = true;
            }
        }
        if (this.field8928 != null && !class314.method1852(this.field8950, this.field8901, arg0 ^ 0x7617)) {
            this.field8938 = null;
            this.field8928 = null;
        }
        if (this.field8893 != null && !class578.method3336((byte) -107, this.field8901, this.field8950)) {
            this.field8893 = null;
            this.field8937 = null;
        }
        if (this.field8964 != null && !class272.method1601(this.field8901, 1024, this.field8950)) {
            this.field8964 = null;
        }
        if (this.field8980 != null && (this.field8901 & 0x800) == 0 && (this.field8901 & 0x40000) == 0) {
            this.field8965 = null;
            this.field8947 = null;
            this.field8980 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "()Z", line = 2673)
    public final boolean method385() {
        field8912++;
        if (this.field8897 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field8897.length; var1++) {
            if (this.field8897[var1] != -1 && !this.field8927.field890.method1137(12429, this.field8897[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "(III)V", line = 2698)
    public final void method377(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8881; var4++) {
            if (arg0 != 0) {
                this.field8909[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field8918[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field8966[var4] += arg2;
            }
        }
        field8869++;
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lsk;ZZLsk;IZ)Lka;", line = 2730)
    private final class498 method3666(class650 arg0, boolean arg1, boolean arg2, class650 arg3, int arg4, boolean arg5) {
        field8943++;
        arg0.field8950 = this.field8950;
        if (arg1) {
            this.field8915 = 64;
        }
        arg0.field8933 = this.field8933;
        arg0.field8924 = this.field8924;
        arg0.field8987 = this.field8987;
        arg0.field8901 = arg4;
        if ((arg4 & 0x100) == 0) {
            arg0.field8983 = this.field8983;
        } else {
            arg0.field8983 = true;
        }
        arg0.field8894 = this.field8894;
        arg0.field8969 = this.field8969;
        arg0.field8881 = this.field8881;
        arg0.field8892 = this.field8892;
        arg0.field8963 = this.field8963;
        arg0.field8955 = this.field8955;
        boolean var7 = class17.method208(-6409, arg4, this.field8950);
        boolean var8 = class688.method3843(41, this.field8950, arg4);
        boolean var9 = class99.method843(this.field8950, -1, arg4);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg0.field8909 = this.field8909;
            } else if (arg3.field8909 == null || arg3.field8909.length < this.field8892) {
                arg0.field8909 = arg3.field8909 = new int[this.field8892];
            } else {
                arg0.field8909 = arg3.field8909;
            }
            if (!var8) {
                arg0.field8918 = this.field8918;
            } else if (arg3.field8918 == null || arg3.field8918.length < this.field8892) {
                arg0.field8918 = arg3.field8918 = new int[this.field8892];
            } else {
                arg0.field8918 = arg3.field8918;
            }
            if (!var9) {
                arg0.field8966 = this.field8966;
            } else if (arg3.field8966 == null || arg3.field8966.length < this.field8892) {
                arg0.field8966 = arg3.field8966 = new int[this.field8892];
            } else {
                arg0.field8966 = arg3.field8966;
            }
            for (int var11 = 0; var11 < this.field8892; var11++) {
                if (var7) {
                    arg0.field8909[var11] = this.field8909[var11];
                }
                if (var8) {
                    arg0.field8918[var11] = this.field8918[var11];
                }
                if (var9) {
                    arg0.field8966[var11] = this.field8966[var11];
                }
            }
        } else {
            arg0.field8918 = this.field8918;
            arg0.field8909 = this.field8909;
            arg0.field8966 = this.field8966;
        }
        if (class372.method2181(arg4, this.field8950, 10504)) {
            arg0.field8956 = arg3.field8956;
            arg0.field8956.field1198 = true;
            arg0.field8956.field1204 = this.field8956.field1204;
            arg0.field8956.field1194 = this.field8956.field1194;
        } else if (class539.method3199(arg1, arg4, this.field8950)) {
            arg0.field8956 = this.field8956;
        } else {
            arg0.field8956 = null;
        }
        if (class370.method2156(arg4, this.field8950, 540800)) {
            if (arg3.field8935 == null || this.field8963 > arg3.field8935.length) {
                arg0.field8935 = arg3.field8935 = new short[this.field8963];
            } else {
                arg0.field8935 = arg3.field8935;
            }
            for (int var12 = 0; var12 < this.field8963; var12++) {
                arg0.field8935[var12] = this.field8935[var12];
            }
        } else {
            arg0.field8935 = this.field8935;
        }
        if (class411.method2454(256, this.field8950, arg4)) {
            if (arg3.field8862 == null || arg3.field8862.length < this.field8963) {
                arg0.field8862 = arg3.field8862 = new byte[this.field8963];
            } else {
                arg0.field8862 = arg3.field8862;
            }
            for (int var13 = 0; var13 < this.field8963; var13++) {
                arg0.field8862[var13] = this.field8862[var13];
            }
        } else {
            arg0.field8862 = this.field8862;
        }
        if (class217.method1352(this.field8950, arg4, -67)) {
            arg0.field8902 = arg3.field8902;
            arg0.field8902.field1194 = this.field8902.field1194;
            arg0.field8902.field1198 = true;
            arg0.field8902.field1204 = this.field8902.field1204;
        } else if (class494.method2913(this.field8950, 31613, arg4)) {
            arg0.field8902 = this.field8902;
        } else {
            arg0.field8902 = null;
        }
        if (class226.method1386(arg4, this.field8950, true)) {
            if (arg3.field8910 == null || this.field8969 > arg3.field8910.length) {
                int var14 = this.field8969;
                arg0.field8871 = arg3.field8871 = new short[var14];
                arg0.field8910 = arg3.field8910 = new short[var14];
                arg0.field8985 = arg3.field8985 = new short[var14];
            } else {
                arg0.field8985 = arg3.field8985;
                arg0.field8871 = arg3.field8871;
                arg0.field8910 = arg3.field8910;
            }
            if (this.field8988 == null) {
                arg0.field8988 = null;
                for (int var15 = 0; var15 < this.field8969; var15++) {
                    arg0.field8910[var15] = this.field8910[var15];
                    arg0.field8985[var15] = this.field8985[var15];
                    arg0.field8871[var15] = this.field8871[var15];
                }
            } else {
                if (arg3.field8988 == null) {
                    arg3.field8988 = new class354();
                }
                class354 var16 = arg0.field8988 = arg3.field8988;
                if (var16.field4400 == null || this.field8969 > var16.field4400.length) {
                    int var17 = this.field8969;
                    var16.field4402 = new short[var17];
                    var16.field4401 = new byte[var17];
                    var16.field4399 = new short[var17];
                    var16.field4400 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field8969; var18++) {
                    arg0.field8910[var18] = this.field8910[var18];
                    arg0.field8985[var18] = this.field8985[var18];
                    arg0.field8871[var18] = this.field8871[var18];
                    var16.field4400[var18] = this.field8988.field4400[var18];
                    var16.field4399[var18] = this.field8988.field4399[var18];
                    var16.field4402[var18] = this.field8988.field4402[var18];
                    var16.field4401[var18] = this.field8988.field4401[var18];
                }
            }
            arg0.field8863 = this.field8863;
        } else {
            arg0.field8988 = this.field8988;
            arg0.field8863 = this.field8863;
            arg0.field8871 = this.field8871;
            arg0.field8910 = this.field8910;
            arg0.field8985 = this.field8985;
        }
        if (class37.method325((byte) -80, this.field8950, arg4)) {
            arg0.field8919 = arg3.field8919;
            arg0.field8919.field1198 = true;
            arg0.field8919.field1204 = this.field8919.field1204;
            arg0.field8919.field1194 = this.field8919.field1194;
        } else if (class74.method692(0, arg4, this.field8950)) {
            arg0.field8919 = this.field8919;
        } else {
            arg0.field8919 = null;
        }
        if (class86.method794(this.field8950, (byte) -37, arg4)) {
            if (arg3.field8925 == null || arg3.field8925.length < this.field8963) {
                int var19 = this.field8969;
                arg0.field8976 = arg3.field8976 = new float[var19];
                arg0.field8925 = arg3.field8925 = new float[var19];
            } else {
                arg0.field8925 = arg3.field8925;
                arg0.field8976 = arg3.field8976;
            }
            for (int var20 = 0; var20 < this.field8969; var20++) {
                arg0.field8925[var20] = this.field8925[var20];
                arg0.field8976[var20] = this.field8976[var20];
            }
        } else {
            arg0.field8976 = this.field8976;
            arg0.field8925 = this.field8925;
        }
        if (class414.method2466(this.field8950, (byte) 75, arg4)) {
            arg0.field8929 = arg3.field8929;
            arg0.field8929.field1204 = this.field8929.field1204;
            arg0.field8929.field1198 = true;
            arg0.field8929.field1194 = this.field8929.field1194;
        } else if (class132.method980(this.field8950, 74, arg4)) {
            arg0.field8929 = this.field8929;
        } else {
            arg0.field8929 = null;
        }
        if (class68.method674(arg4, this.field8950, 16)) {
            if (arg3.field8877 == null || arg3.field8877.length < this.field8963) {
                int var21 = this.field8963;
                arg0.field8872 = arg3.field8872 = new short[var21];
                arg0.field8877 = arg3.field8877 = new short[var21];
                arg0.field8889 = arg3.field8889 = new short[var21];
            } else {
                arg0.field8872 = arg3.field8872;
                arg0.field8877 = arg3.field8877;
                arg0.field8889 = arg3.field8889;
            }
            for (int var22 = 0; var22 < this.field8963; var22++) {
                arg0.field8877[var22] = this.field8877[var22];
                arg0.field8872[var22] = this.field8872[var22];
                arg0.field8889[var22] = this.field8889[var22];
            }
        } else {
            arg0.field8889 = this.field8889;
            arg0.field8877 = this.field8877;
            arg0.field8872 = this.field8872;
        }
        if (class504.method3024(this.field8950, (byte) 87, arg4)) {
            arg0.field8926 = arg3.field8926;
            arg0.field8926.field793 = this.field8926.field793;
            arg0.field8926.field791 = this.field8926.field791;
            arg0.field8926.field788 = true;
        } else if (class50.method464(arg4, -122, this.field8950)) {
            arg0.field8926 = this.field8926;
        } else {
            arg0.field8926 = null;
        }
        if (class563.method3264(this.field8950, arg4, -1)) {
            if (arg3.field8897 == null || this.field8963 > arg3.field8897.length) {
                int var23 = this.field8963;
                arg0.field8897 = arg3.field8897 = new short[var23];
            } else {
                arg0.field8897 = arg3.field8897;
            }
            for (int var24 = 0; var24 < this.field8963; var24++) {
                arg0.field8897[var24] = this.field8897[var24];
            }
        } else {
            arg0.field8897 = this.field8897;
        }
        if (!class66.method641((byte) 123, arg4, this.field8950)) {
            arg0.field8870 = this.field8870;
        } else if (arg3.field8870 == null || arg3.field8870.length < this.field8955) {
            int var26 = this.field8955;
            arg0.field8870 = arg3.field8870 = new class49[var26];
            for (int var27 = 0; var27 < this.field8955; var27++) {
                arg0.field8870[var27] = this.field8870[var27].method462(-57);
            }
        } else {
            arg0.field8870 = arg3.field8870;
            for (int var25 = 0; var25 < this.field8955; var25++) {
                arg0.field8870[var25].method460(this.field8870[var25], true);
            }
        }
        arg0.field8893 = this.field8893;
        arg0.field8945 = this.field8945;
        arg0.field8947 = this.field8947;
        arg0.field8965 = this.field8965;
        arg0.field8938 = this.field8938;
        arg0.field8958 = this.field8958;
        arg0.field8904 = this.field8904;
        arg0.field8875 = this.field8875;
        arg0.field8937 = this.field8937;
        if (this.field8930) {
            arg0.field8954 = this.field8954;
            arg0.field8913 = this.field8913;
            arg0.field8946 = this.field8946;
            arg0.field8915 = this.field8915;
            arg0.field8930 = true;
            arg0.field8914 = this.field8914;
            arg0.field8884 = this.field8884;
            arg0.field8885 = this.field8885;
            arg0.field8949 = this.field8949;
        } else {
            arg0.field8930 = false;
        }
        arg0.field8977 = this.field8977;
        arg0.field8980 = this.field8980;
        arg0.field8867 = this.field8867;
        arg0.field8964 = this.field8964;
        arg0.field8928 = this.field8928;
        arg0.field8952 = this.field8952;
        return arg0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lwg;Lso;IIII)V", line = 3192)
    public class650(class449 arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class162 var7 = arg0.field890;
        this.field8904 = new int[arg1.field6908 + 1];
        int[] var8 = new int[arg1.field6897];
        for (int var9 = 0; var9 < arg1.field6897; var9++) {
            if (arg1.field6939 == null || arg1.field6939[var9] != 2) {
                if (arg1.field6912 != null && arg1.field6912[var9] != -1) {
                    class359 var178 = var7.method1138(arg1.field6912[var9] & 0xFFFF, 117);
                    if (((this.field8950 & 0x40) == 0 || !var178.field4464) && var178.field4455) {
                        continue;
                    }
                }
                var8[this.field8963++] = var9;
                this.field8904[arg1.field6900[var9]]++;
                this.field8904[arg1.field6936[var9]]++;
                this.field8904[arg1.field6921[var9]]++;
            }
        }
        this.field8894 = this.field8963;
        long[] var10 = new long[this.field8963];
        boolean var11 = (this.field8901 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field8963; var12++) {
            int var161 = var8[var12];
            class359 var162 = null;
            int var163 = 0;
            byte var164 = 0;
            byte var165 = 0;
            byte var166 = 0;
            if (arg1.field6938 != null) {
                boolean var167 = false;
                for (int var168 = 0; var168 < arg1.field6938.length; var168++) {
                    class33 var169 = arg1.field6938[var168];
                    if (var169.field511 == var161) {
                        class73 var170 = class65.method547(false, var169.field521);
                        if (var170.field1000) {
                            var167 = true;
                        }
                        if (var170.field1004 != -1) {
                            class359 var171 = var7.method1138(var170.field1004, 24);
                            if (var171.field4457 == 2) {
                                this.field8983 = true;
                            }
                        }
                    }
                }
                if (var167) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field8894--;
                    continue;
                }
            }
            short var172 = -1;
            if (arg1.field6912 != null) {
                var172 = arg1.field6912[var161];
                if (var172 != -1) {
                    var162 = var7.method1138(var172 & 0xFFFF, 73);
                    if ((this.field8950 & 0x40) != 0 && var162.field4464) {
                        var172 = -1;
                        var162 = null;
                    } else {
                        var166 = var162.field4445;
                        var165 = var162.field4459;
                    }
                }
            }
            boolean var173 = arg1.field6903 != null && arg1.field6903[var161] != 0 || var162 != null && var162.field4457 != 0;
            if ((var11 || var173) && arg1.field6941 != null) {
                var163 += arg1.field6941[var161] << 17;
            }
            if (var173) {
                var163 += 65536;
            }
            int var174 = ((var165 & 0xFF) << 8) + var163;
            int var175 = (var166 & 0xFF) + var174;
            int var176 = ((var172 & 0xFFFF) << 16) + var164;
            int var177 = (var12 & 0xFFFF) + var176;
            var10[var12] = ((long) var175 << 32) + (long) var177;
            this.field8933 |= var162 != null && (var162.field4444 != 0 || var162.field4449 != 0);
            this.field8983 |= var173;
        }
        class96.method840(var10, var8, -43);
        this.field8881 = arg1.field6908;
        this.field8909 = arg1.field6926;
        this.field8918 = arg1.field6913;
        this.field8937 = arg1.field6905;
        this.field8892 = arg1.field6928;
        this.field8966 = arg1.field6894;
        this.field8952 = arg1.field6904;
        this.field8958 = arg1.field6910;
        class178[] var13 = new class178[this.field8881];
        if (arg1.field6938 != null) {
            this.field8955 = arg1.field6938.length;
            this.field8945 = new class134[this.field8955];
            this.field8870 = new class49[this.field8955];
            for (int var14 = 0; var14 < this.field8955; var14++) {
                class33 var15 = arg1.field6938[var14];
                class73 var16 = class65.method547(false, var15.field521);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field8963; var18++) {
                    if (var8[var18] == var15.field511) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class437.field5749[arg1.field6918[var15.field511] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6903 == null ? 0 : arg1.field6903[var15.field511]) << 24;
                this.field8945[var14] = new class134(var17, arg1.field6900[var15.field511], arg1.field6936[var15.field511], arg1.field6921[var15.field511], var16.field999, var16.field1007, var16.field1004, var16.field1002, var16.field1006, var16.field1000, var16.field1003, var15.field512);
                this.field8870[var14] = new class49(var20);
            }
        }
        int var21 = this.field8963 * 3;
        this.field8976 = new float[var21];
        this.field8925 = new float[var21];
        this.field8877 = new short[this.field8963];
        this.field8987 = (short) arg4;
        this.field8935 = new short[this.field8963];
        this.field8871 = new short[var21];
        this.field8872 = new short[this.field8963];
        this.field8910 = new short[var21];
        this.field8875 = new short[var21];
        this.field8924 = (short) arg3;
        if (arg1.field6907 != null) {
            this.field8938 = new short[this.field8963];
        }
        this.field8863 = new byte[var21];
        this.field8867 = new short[var21];
        this.field8977 = new short[var21];
        class707.field9927 = new long[var21];
        this.field8985 = new short[var21];
        this.field8862 = new byte[this.field8963];
        this.field8897 = new short[this.field8963];
        this.field8889 = new short[this.field8963];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6908; var23++) {
            int var160 = this.field8904[var23];
            this.field8904[var23] = var22;
            var22 += var160;
            var13[var23] = new class178();
        }
        this.field8904[arg1.field6908] = var22;
        class149 var24 = class585.method3361(arg1, var8, (byte) -51, this.field8963);
        class718[] var25 = new class718[arg1.field6897];
        for (int var26 = 0; var26 < arg1.field6897; var26++) {
            short var139 = arg1.field6900[var26];
            short var140 = arg1.field6936[var26];
            short var141 = arg1.field6921[var26];
            int var142 = this.field8909[var140] - this.field8909[var139];
            int var143 = this.field8918[var140] - this.field8918[var139];
            int var144 = this.field8966[var140] - this.field8966[var139];
            int var145 = this.field8909[var141] - this.field8909[var139];
            int var146 = this.field8918[var141] - this.field8918[var139];
            int var147 = this.field8966[var141] - this.field8966[var139];
            int var148 = var143 * var147 - var144 * var146;
            int var149 = var144 * var145 - var142 * var147;
            int var150 = var142 * var146 - (var143 * var145);
            while (var148 > 8192 || var149 > 8192 || var150 > 8192 || var148 < -8192 || var149 < -8192 || var150 < -8192) {
                var148 >>= 0x1;
                var150 >>= 0x1;
                var149 >>= 0x1;
            }
            int var151 = (int) Math.sqrt((double) (var148 * var148 + var150 * var150 + (var149 * var149)));
            if (var151 <= 0) {
                var151 = 1;
            }
            int var152 = var148 * 256 / var151;
            int var153 = var150 * 256 / var151;
            int var154 = var149 * 256 / var151;
            byte var155 = arg1.field6939 == null ? 0 : arg1.field6939[var26];
            if (var155 == 0) {
                class178 var156 = var13[var139];
                var156.field2192 += var152;
                var156.field2195 += var153;
                var156.field2193++;
                var156.field2194 += var154;
                class178 var157 = var13[var140];
                var157.field2194 += var154;
                var157.field2192 += var152;
                var157.field2193++;
                var157.field2195 += var153;
                class178 var158 = var13[var141];
                var158.field2193++;
                var158.field2195 += var153;
                var158.field2192 += var152;
                var158.field2194 += var154;
            } else if (var155 == 1) {
                class718 var159 = var25[var26] = new class718();
                var159.field10086 = var152;
                var159.field10087 = var154;
                var159.field10088 = var153;
            }
        }
        for (int var27 = 0; var27 < this.field8963; var27++) {
            int var48 = var8[var27];
            int var49 = arg1.field6918[var48] & 0xFFFF;
            int var50;
            if (arg1.field6915 == null) {
                var50 = -1;
            } else {
                var50 = arg1.field6915[var48];
            }
            int var51;
            if (arg1.field6903 == null) {
                var51 = 0;
            } else {
                var51 = arg1.field6903[var48] & 0xFF;
            }
            short var52 = arg1.field6912 == null ? -1 : arg1.field6912[var48];
            if (var52 != -1 && (this.field8950 & 0x40) != 0) {
                class359 var53 = var7.method1138(var52 & 0xFFFF, 110);
                if (var53.field4464) {
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
                    var57 = 1.0F;
                    var60 = 1;
                    var56 = 1.0F;
                    var54 = 0.0F;
                    var58 = 0.0F;
                    var59 = 0.0F;
                    var55 = 1.0F;
                    var61 = 2;
                } else {
                    var50 &= 0xFF;
                    byte var63 = arg1.field6898[var50];
                    if (var63 == 0) {
                        short var92 = arg1.field6900[var48];
                        short var93 = arg1.field6936[var48];
                        short var94 = arg1.field6921[var48];
                        short var95 = arg1.field6932[var50];
                        short var96 = arg1.field6937[var50];
                        short var97 = arg1.field6895[var50];
                        float var98 = (float) arg1.field6926[var95];
                        float var99 = (float) arg1.field6913[var95];
                        float var100 = (float) arg1.field6894[var95];
                        float var101 = (float) arg1.field6926[var96] - var98;
                        float var102 = (float) arg1.field6913[var96] - var99;
                        float var103 = (float) arg1.field6894[var96] - var100;
                        float var104 = (float) arg1.field6926[var97] - var98;
                        float var105 = (float) arg1.field6913[var97] - var99;
                        float var106 = (float) arg1.field6894[var97] - var100;
                        float var107 = (float) arg1.field6926[var92] - var98;
                        float var108 = (float) arg1.field6913[var92] - var99;
                        float var109 = (float) arg1.field6894[var92] - var100;
                        float var110 = (float) arg1.field6926[var93] - var98;
                        float var111 = (float) arg1.field6913[var93] - var99;
                        float var112 = (float) arg1.field6894[var93] - var100;
                        float var113 = (float) arg1.field6926[var94] - var98;
                        float var114 = (float) arg1.field6913[var94] - var99;
                        float var115 = (float) arg1.field6894[var94] - var100;
                        float var116 = var102 * var106 - var103 * var105;
                        float var117 = var103 * var104 - var101 * var106;
                        float var118 = var101 * var105 - (var102 * var104);
                        float var119 = var105 * var118 - var106 * var117;
                        float var120 = var106 * var116 - var104 * var118;
                        float var121 = var104 * var117 - (var105 * var116);
                        float var122 = 1.0F / (var103 * var121 + var101 * var119 + var102 * var120);
                        var56 = (var112 * var121 + var110 * var119 + var111 * var120) * var122;
                        var58 = (var115 * var121 + var113 * var119 + var114 * var120) * var122;
                        var54 = (var109 * var121 + var107 * var119 + var108 * var120) * var122;
                        float var123 = var102 * var118 - (var103 * var117);
                        float var124 = var101 * var117 - var102 * var116;
                        float var125 = var103 * var116 - var101 * var118;
                        float var126 = 1.0F / (var106 * var124 + var104 * var123 + var105 * var125);
                        var55 = (var109 * var124 + var107 * var123 + var108 * var125) * var126;
                        var57 = (var112 * var124 + var110 * var123 + var111 * var125) * var126;
                        var59 = (var115 * var124 + var113 * var123 + var114 * var125) * var126;
                    } else {
                        short var64 = arg1.field6900[var48];
                        short var65 = arg1.field6936[var48];
                        short var66 = arg1.field6921[var48];
                        int var67 = var24.field1861[var50];
                        int var68 = var24.field1860[var50];
                        int var69 = var24.field1865[var50];
                        float[] var70 = var24.field1863[var50];
                        byte var71 = arg1.field6943[var50];
                        float var72 = (float) arg1.field6899[var50] / 256.0F;
                        if (var63 == 1) {
                            float var73 = (float) arg1.field6925[var50] / 1024.0F;
                            class728.method4117(arg1.field6913[var64], var73, 0, var68, var70, var72, var69, var67, arg1.field6894[var64], class618.field8324, var71, arg1.field6926[var64]);
                            var55 = class618.field8324[1];
                            var54 = class618.field8324[0];
                            class728.method4117(arg1.field6913[var65], var73, 0, var68, var70, var72, var69, var67, arg1.field6894[var65], class618.field8324, var71, arg1.field6926[var65]);
                            var57 = class618.field8324[1];
                            var56 = class618.field8324[0];
                            class728.method4117(arg1.field6913[var66], var73, 0, var68, var70, var72, var69, var67, arg1.field6894[var66], class618.field8324, var71, arg1.field6926[var66]);
                            var59 = class618.field8324[1];
                            var58 = class618.field8324[0];
                            float var74 = var73 / 2.0F;
                            if ((var71 & 0x1) == 0) {
                                if (var58 - var54 > var74) {
                                    var61 = 1;
                                    var58 -= var73;
                                } else if (var54 - var58 > var74) {
                                    var61 = 2;
                                    var58 += var73;
                                }
                                if ((var74 < var56 - var54)) {
                                    var60 = 1;
                                    var56 -= var73;
                                } else if (var74 < var54 - var56) {
                                    var60 = 2;
                                    var56 += var73;
                                }
                            } else {
                                if ((var74 < var59 - var55)) {
                                    var59 -= var73;
                                    var61 = 1;
                                } else if (var74 < var55 - var59) {
                                    var59 += var73;
                                    var61 = 2;
                                }
                                if ((var57 - var55 > var74)) {
                                    var60 = 1;
                                    var57 -= var73;
                                } else if (var55 - var57 > var74) {
                                    var57 += var73;
                                    var60 = 2;
                                }
                            }
                        } else if (var63 == 2) {
                            float var75 = (float) arg1.field6935[var50] / 256.0F;
                            float var76 = (float) arg1.field6909[var50] / 256.0F;
                            int var77 = arg1.field6926[var65] - arg1.field6926[var64];
                            int var78 = arg1.field6913[var65] - arg1.field6913[var64];
                            int var79 = arg1.field6894[var65] - arg1.field6894[var64];
                            int var80 = arg1.field6926[var66] - arg1.field6926[var64];
                            int var81 = arg1.field6913[var66] - arg1.field6913[var64];
                            int var82 = arg1.field6894[var66] - arg1.field6894[var64];
                            int var83 = var78 * var82 - var79 * var81;
                            int var84 = var79 * var80 - (var77 * var82);
                            int var85 = var77 * var81 - (var78 * var80);
                            float var86 = 64.0F / (float) arg1.field6945[var50];
                            float var87 = 64.0F / (float) arg1.field6922[var50];
                            float var88 = 64.0F / (float) arg1.field6925[var50];
                            float var89 = (var70[2] * (float) var85 + var70[0] * (float) var83 + var70[1] * (float) var84) / var86;
                            float var90 = (var70[5] * (float) var85 + var70[4] * (float) var84 + var70[3] * (float) var83) / var87;
                            float var91 = (var70[8] * (float) var85 + var70[6] * (float) var83 + var70[7] * (float) var84) / var88;
                            var62 = class98.method842(var90, var89, -23996, var91);
                            class782.method4333(-21631, var75, arg1.field6926[var64], var70, var71, class618.field8324, var68, var76, var69, var62, var72, var67, arg1.field6913[var64], arg1.field6894[var64]);
                            var55 = class618.field8324[1];
                            var54 = class618.field8324[0];
                            class782.method4333(-21631, var75, arg1.field6926[var65], var70, var71, class618.field8324, var68, var76, var69, var62, var72, var67, arg1.field6913[var65], arg1.field6894[var65]);
                            var56 = class618.field8324[0];
                            var57 = class618.field8324[1];
                            class782.method4333(-21631, var75, arg1.field6926[var66], var70, var71, class618.field8324, var68, var76, var69, var62, var72, var67, arg1.field6913[var66], arg1.field6894[var66]);
                            var58 = class618.field8324[0];
                            var59 = class618.field8324[1];
                        } else if (var63 == 3) {
                            class442.method2602(arg1.field6913[var64], var71, var67, var70, class618.field8324, var72, var68, var69, arg1.field6894[var64], arg1.field6926[var64], 3);
                            var55 = class618.field8324[1];
                            var54 = class618.field8324[0];
                            class442.method2602(arg1.field6913[var65], var71, var67, var70, class618.field8324, var72, var68, var69, arg1.field6894[var65], arg1.field6926[var65], 3);
                            var57 = class618.field8324[1];
                            var56 = class618.field8324[0];
                            class442.method2602(arg1.field6913[var66], var71, var67, var70, class618.field8324, var72, var68, var69, arg1.field6894[var66], arg1.field6926[var66], 3);
                            var58 = class618.field8324[0];
                            var59 = class618.field8324[1];
                            if ((var71 & 0x1) == 0) {
                                if (var58 - var54 > 0.5F) {
                                    var61 = 1;
                                    var58--;
                                } else if (var54 - var58 > 0.5F) {
                                    var61 = 2;
                                    var58++;
                                }
                                if ((var56 - var54 > 0.5F)) {
                                    var56--;
                                    var60 = 1;
                                } else if (var54 - var56 > 0.5F) {
                                    var60 = 2;
                                    var56++;
                                }
                            } else {
                                if (var57 - var55 > 0.5F) {
                                    var60 = 1;
                                    var57--;
                                } else if (var55 - var57 > 0.5F) {
                                    var60 = 2;
                                    var57++;
                                }
                                if ((var59 - var55 > 0.5F)) {
                                    var61 = 1;
                                    var59--;
                                } else if (var55 - var59 > 0.5F) {
                                    var61 = 2;
                                    var59++;
                                }
                            }
                        }
                    }
                }
            }
            byte var127;
            if (arg1.field6939 == null) {
                var127 = 0;
            } else {
                var127 = arg1.field6939[var48];
            }
            if (var127 == 0) {
                long var131 = (long) (var50 << 2) + ((long) (var49 << 8) + (long) (var62 << 24) + ((long) var51) << 32);
                short var133 = arg1.field6900[var48];
                short var134 = arg1.field6936[var48];
                short var135 = arg1.field6921[var48];
                class178 var136 = var13[var133];
                this.field8877[var27] = this.method3669(var55, var136.field2193, var131, var54, var27, var136.field2192, var133, var136.field2194, 12464, arg1, var136.field2195);
                class178 var137 = var13[var134];
                this.field8872[var27] = this.method3669(var57, var137.field2193, (long) var60 + var131, var56, var27, var137.field2192, var134, var137.field2194, 12464, arg1, var137.field2195);
                class178 var138 = var13[var135];
                this.field8889[var27] = this.method3669(var59, var138.field2193, (long) var61 + var131, var58, var27, var138.field2192, var135, var138.field2194, 12464, arg1, var138.field2195);
            } else if (var127 == 1) {
                class718 var128 = var25[var48];
                long var129 = (long) ((var50 << 2) + (var128.field10088 + 256 << 22) + (var128.field10087 + 256 << 12) + (var128.field10086 <= 0 ? 2048 : 1024)) + ((long) (var62 << 24) + (long) var51 + ((long) (var49 << 8)) << 32);
                this.field8877[var27] = this.method3669(var55, 0, var129, var54, var27, var128.field10086, arg1.field6900[var48], var128.field10087, 12464, arg1, var128.field10088);
                this.field8872[var27] = this.method3669(var57, 0, (long) var60 + var129, var56, var27, var128.field10086, arg1.field6936[var48], var128.field10087, 12464, arg1, var128.field10088);
                this.field8889[var27] = this.method3669(var59, 0, (long) var61 + var129, var58, var27, var128.field10086, arg1.field6921[var48], var128.field10087, 12464, arg1, var128.field10088);
            }
            if (arg1.field6903 != null) {
                this.field8862[var27] = arg1.field6903[var48];
            }
            if (arg1.field6907 != null) {
                this.field8938[var27] = arg1.field6907[var48];
            }
            this.field8935[var27] = arg1.field6918[var48];
            this.field8897[var27] = var52;
        }
        if (this.field8894 > 0) {
            int var28 = 1;
            short var29 = this.field8897[0];
            for (int var30 = 0; var30 < this.field8894; var30++) {
                short var40 = this.field8897[var30];
                if (var29 != var40) {
                    var28++;
                    var29 = var40;
                }
            }
            this.field8980 = new int[var28 + 1];
            this.field8965 = new int[var28];
            this.field8947 = new int[var28];
            this.field8980[0] = 0;
            int var31 = this.field8969;
            short var32 = this.field8897[0];
            int var33 = 0;
            short var34 = 0;
            for (int var35 = 0; var35 < this.field8894; var35++) {
                short var36 = this.field8897[var35];
                if (var32 != var36) {
                    this.field8965[var33] = var31;
                    this.field8947[var33] = var34 + 1 - var31;
                    var33++;
                    this.field8980[var33] = var35;
                    var34 = 0;
                    var31 = this.field8969;
                    var32 = var36;
                }
                short var37 = this.field8877[var35];
                if (var37 < var31) {
                    var31 = var37;
                }
                if (var37 > var34) {
                    var34 = var37;
                }
                short var38 = this.field8872[var35];
                if (var38 < var31) {
                    var31 = var38;
                }
                if (var34 < var38) {
                    var34 = var38;
                }
                short var39 = this.field8889[var35];
                if (var31 > var39) {
                    var31 = var39;
                }
                if (var34 < var39) {
                    var34 = var39;
                }
            }
            this.field8965[var33] = var31;
            this.field8947[var33] = var34 + 1 - var31;
            var33++;
            this.field8980[var33] = this.field8894;
        }
        class707.field9927 = null;
        this.field8875 = class319.method1902(3, this.field8875, this.field8969);
        this.field8867 = class319.method1902(3, this.field8867, this.field8969);
        this.field8910 = class319.method1902(3, this.field8910, this.field8969);
        this.field8985 = class319.method1902(3, this.field8985, this.field8969);
        this.field8871 = class319.method1902(3, this.field8871, this.field8969);
        this.field8863 = class719.method4069(this.field8969, false, this.field8863);
        this.field8925 = class695.method3874(0, this.field8969, this.field8925);
        this.field8976 = class695.method3874(0, this.field8969, this.field8976);
        if (arg1.field6906 != null && class578.method3336((byte) -107, arg2, this.field8950)) {
            this.field8893 = arg1.method2931(true, false);
        }
        if (arg1.field6938 != null && class272.method1601(arg2, 1024, this.field8950)) {
            this.field8964 = arg1.method2919((byte) -20);
        }
        if (arg1.field6891 != null && class314.method1852(this.field8950, arg2, 384)) {
            int var41 = 0;
            int[] var42 = new int[256];
            for (int var43 = 0; var43 < this.field8963; var43++) {
                int var47 = arg1.field6891[var8[var43]];
                if (var47 >= 0) {
                    if (var47 > var41) {
                        var41 = var47;
                    }
                    int var10002 = var42[var47]++;
                }
            }
            this.field8928 = new int[var41 + 1][];
            for (int var44 = 0; var44 <= var41; var44++) {
                this.field8928[var44] = new int[var42[var44]];
                var42[var44] = 0;
            }
            for (int var45 = 0; var45 < this.field8963; var45++) {
                int var46 = arg1.field6891[var8[var45]];
                if (var46 >= 0) {
                    this.field8928[var46][var42[var46]++] = var45;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(B)Z", line = 4112)
    private final boolean method3667(byte arg0) {
        field8931++;
        boolean var2 = !this.field8902.field1194;
        boolean var3 = (this.field8950 & 0x37) != 0 && !this.field8919.field1194;
        boolean var4 = !this.field8956.field1194;
        boolean var5 = !this.field8929.field1194;
        if (arg0 <= 116) {
            this.field8915 = 25;
        }
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field8956.field1200 == null) {
                this.field8956.field1200 = this.field8927.method57(14, this.field8948);
            }
            class129 var7 = this.field8956.field1200;
            var7.method273(this.field8969 * 12, (byte) 125, 12);
            Buffer var8 = var7.method271(true, (byte) -125);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field8927.field6094.copyPositions(this.field8909, this.field8918, this.field8966, this.field8875, 0, 12, this.field8969, var8.getAddress());
                if (var7.method275(22022)) {
                    this.field8956.field1204 = var7;
                    this.field8956.field1194 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field8902.field1200 == null) {
                this.field8902.field1200 = this.field8927.method57(14, this.field8948);
            }
            class129 var9 = this.field8902.field1200;
            var9.method273(this.field8969 * 4, (byte) 125, 4);
            Buffer var10 = var9.method271(true, (byte) 96);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field8950 & 0x37) == 0) {
                    short[] var11;
                    byte[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field8988 == null) {
                        var11 = this.field8910;
                        var12 = this.field8863;
                        var13 = this.field8871;
                        var14 = this.field8985;
                    } else {
                        var12 = this.field8988.field4401;
                        var13 = this.field8988.field4402;
                        var14 = this.field8988.field4399;
                        var11 = this.field8988.field4400;
                    }
                    this.field8927.field6094.copyLighting(this.field8935, this.field8862, this.field8897, var11, var14, var13, var12, this.field8924, this.field8987, this.field8867, 0, 4, this.field8969, var10.getAddress());
                } else {
                    this.field8927.field6094.copyColours(this.field8935, this.field8862, this.field8897, this.field8924, this.field8867, 0, 4, this.field8969, var10.getAddress());
                }
                if (var9.method275(22022)) {
                    this.field8902.field1204 = var9;
                    this.field8902.field1194 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field8919.field1200 == null) {
                this.field8919.field1200 = this.field8927.method57(14, this.field8948);
            }
            class129 var15 = this.field8919.field1200;
            var15.method273(this.field8969 * 12, (byte) 125, 12);
            Buffer var16 = var15.method271(true, (byte) 44);
            if (var16 == null) {
                var6 = false;
            } else {
                byte[] var17;
                short[] var18;
                short[] var19;
                short[] var20;
                if (this.field8988 == null) {
                    var18 = this.field8910;
                    var20 = this.field8871;
                    var17 = this.field8863;
                    var19 = this.field8985;
                } else {
                    var17 = this.field8988.field4401;
                    var18 = this.field8988.field4400;
                    var19 = this.field8988.field4399;
                    var20 = this.field8988.field4402;
                }
                this.field8927.field6094.copyNormals(var18, var19, var20, var17, 3.0F / (float) this.field8987, 3.0F / (float) (this.field8987 / 2 + this.field8987), 0, 12, this.field8969, var16.getAddress());
                if (var15.method275(22022)) {
                    this.field8919.field1194 = true;
                    this.field8919.field1204 = var15;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field8929.field1200 == null) {
                this.field8929.field1200 = this.field8927.method57(14, this.field8948);
            }
            class129 var21 = this.field8929.field1200;
            var21.method273(this.field8969 * 8, (byte) 125, 8);
            Buffer var22 = var21.method271(true, (byte) -17);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field8927.field6094.copyTexCoords(this.field8925, this.field8976, 0, 8, this.field8969, var22.getAddress());
                if (var21.method275(22022)) {
                    this.field8929.field1204 = var21;
                    this.field8929.field1194 = true;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "(III)V", line = 4307)
    public final void method357(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field8881; var4++) {
            if (arg0 != 128) {
                this.field8909[var4] = this.field8909[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field8918[var4] = this.field8918[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field8966[var4] = this.field8966[var4] * arg2 >> 7;
            }
        }
        field8939++;
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()[Lmk;", line = 4341)
    public final class62[] method371() {
        field8874++;
        return this.field8952;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(B)V", line = 4349)
    private final void method3668(byte arg0) {
        field8974++;
        if (this.field8926 != null) {
            this.field8926.field791 = false;
        }
        int var2 = 114 / ((arg0 - 3) / 62);
    }

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "(IILs;Ls;III)V", line = 4365)
    public final void method354(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6) {
        field8932++;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        int var8 = this.field8913 + arg4;
        int var9 = arg4 + this.field8884;
        int var10 = this.field8946 + arg6;
        int var11 = arg6 + this.field8949;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3533 <= (arg2.field3525 + var9 >> arg2.field3530) || var10 < 0 || (arg2.field3525 + var11 >> arg2.field3530) >= arg2.field3524) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field3525 + var9 >> arg3.field3530) >= arg3.field3533 || var10 < 0 || arg3.field3524 <= arg3.field3525 + var11 >> arg3.field3530) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3530;
            int var13 = arg2.field3525 + var9 - 1 >> arg2.field3530;
            int var14 = var10 >> arg2.field3530;
            int var15 = var11 + arg2.field3525 - 1 >> arg2.field3530;
            if (arg2.method1728(var14, (byte) -67, var12) == arg5 && arg2.method1728(var14, (byte) -66, var13) == arg5 && arg2.method1728(var15, (byte) -75, var12) == arg5 && arg5 == arg2.method1728(var15, (byte) -108, var13)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field8881; var16++) {
                this.field8918[var16] = this.field8918[var16] + arg2.method1730(this.field8909[var16] - -arg4, this.field8966[var16] + arg6, -1) - arg5;
            }
        } else if (arg0 == 2) {
            int var30 = this.field8885;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field8881; var31++) {
                int var32 = (this.field8918[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field8918[var31] += (arg2.method1730(this.field8909[var31] + arg4, this.field8966[var31] + arg6, -1) - arg5) * (arg1 - var32) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFF3A) >> 8) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var17 >> 1)) < 0 || arg2.field3533 << arg2.field3530 <= (var17 >> 1) + arg4 + arg2.field3525 || (arg6 - (var18 >> 1)) < 0 || arg2.field3524 << arg2.field3530 <= (var18 >> 1) + arg2.field3525 + arg6) {
                return;
            }
            this.method2943(var20, var18, arg2, arg4, var17, var19, 0, arg5, arg6);
        } else if (arg0 == 4) {
            int var28 = this.field8954 - this.field8885;
            for (int var29 = 0; var29 < this.field8881; var29++) {
                this.field8918[var29] = this.field8918[var29] + arg3.method1730(this.field8909[var29] + arg4, this.field8966[var29] + arg6, -1) + var28 - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field8954 - this.field8885;
            for (int var22 = 0; var22 < this.field8881; var22++) {
                int var23 = this.field8909[var22] + arg4;
                int var24 = this.field8966[var22] + arg6;
                int var25 = arg2.method1730(var23, var24, -1);
                int var26 = arg3.method1730(var23, var24, -1);
                int var27 = var25 - arg1 - var26;
                this.field8918[var22] = var25 - (arg5 - ((this.field8918[var22] << 8) / var21 * var27 >> 8));
            }
        }
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 4516)
    public final void method360(int arg0) {
        field8898++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field8881; var4++) {
            int var5 = this.field8966[var4] * var2 + this.field8909[var4] * var3 >> 14;
            this.field8966[var4] = this.field8966[var4] * var3 - (this.field8909[var4] * var2) >> 14;
            this.field8909[var4] = var5;
        }
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "FA", descriptor = "(I)V", line = 4543)
    public final void method398(int arg0) {
        field8940++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field8881; var4++) {
            int var5 = this.field8918[var4] * var3 - (this.field8966[var4] * var2) >> 14;
            this.field8966[var4] = this.field8966[var4] * var3 + this.field8918[var4] * var2 >> 14;
            this.field8918[var4] = var5;
        }
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "ia", descriptor = "(SS)V", line = 4573)
    public final void method402(short arg0, short arg1) {
        field8986++;
        for (int var3 = 0; var3 < this.field8963; var3++) {
            if (this.field8935[var3] == arg0) {
                this.field8935[var3] = arg1;
            }
        }
        if (this.field8945 != null) {
            for (int var4 = 0; var4 < this.field8955; var4++) {
                class134 var5 = this.field8945[var4];
                class49 var6 = this.field8870[var4];
                var6.field687 = class437.field5749[this.field8935[var5.field1681] & 0xFFFF] & 0xFFFFFF | var6.field687 & 0xFF000000;
            }
        }
        this.method3661((byte) -68);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()[Lir;", line = 4612)
    public final class28[] method370() {
        field8882++;
        return this.field8958;
    }

    @OriginalMember(owner = "client!sk", name = "HA", descriptor = "()I", line = 4620)
    public final int method361() {
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        field8896++;
        return this.field8946;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILnh;ZII)Z", line = 4632)
    public final boolean method379(int arg0, int arg1, class778 arg2, boolean arg3, int arg4, int arg5) {
        field8944++;
        return this.method3671(arg2, arg4, arg1, 8, arg3, arg5, arg0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(FIJFIIIIILso;I)S", line = 4644)
    private final short method3669(float arg0, int arg1, long arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class496 arg9, int arg10) {
        field8917++;
        int var13 = this.field8904[arg6];
        int var14 = this.field8904[arg6 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field8977[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class707.field9927[var16] == arg2) {
                return (short) (var17 - 1);
            }
        }
        this.field8977[var15] = (short) (this.field8969 + 1);
        class707.field9927[var15] = arg2;
        this.field8867[this.field8969] = (short) arg4;
        this.field8875[this.field8969] = (short) arg6;
        this.field8910[this.field8969] = (short) arg5;
        this.field8985[this.field8969] = (short) arg7;
        this.field8871[this.field8969] = (short) arg10;
        this.field8863[this.field8969] = (byte) arg1;
        this.field8925[this.field8969] = arg3;
        if (arg8 != 12464) {
            this.method401(-39, null, 94, 18, 6, 115, true);
        }
        this.field8976[this.field8969] = arg0;
        return (short) (this.field8969++);
    }

    @OriginalMember(owner = "client!sk", name = "fa", descriptor = "()I", line = 4696)
    public final int method404() {
        field8981++;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        return this.field8885;
    }

    @OriginalMember(owner = "client!sk", name = "RA", descriptor = "()I", line = 4709)
    public final int method383() {
        field8888++;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        return this.field8884;
    }

    @OriginalMember(owner = "client!sk", name = "da", descriptor = "()I", line = 4721)
    public final int method352() {
        field8984++;
        return this.field8987;
    }

    @OriginalMember(owner = "client!sk", name = "na", descriptor = "()I", line = 4735)
    public final int method367() {
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        field8879++;
        return this.field8915;
    }

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "(I)V", line = 4748)
    public final void method378(int arg0) {
        field8951++;
        if (this.field8956 != null) {
            this.field8956.field1198 = class372.method2181(arg0, this.field8950, 10504);
        }
        if (this.field8929 != null) {
            this.field8929.field1198 = class414.method2466(this.field8950, (byte) 78, arg0);
        }
        if (this.field8902 != null) {
            this.field8902.field1198 = class217.method1352(this.field8950, arg0, -32);
        }
        if (this.field8919 != null) {
            this.field8919.field1198 = class37.method325((byte) -124, this.field8950, arg0);
        }
        this.field8901 = arg0;
        if (this.field8988 != null && (this.field8901 & 0x10000) == 0) {
            this.field8871 = this.field8988.field4402;
            this.field8985 = this.field8988.field4399;
            this.field8863 = this.field8988.field4401;
            this.field8910 = this.field8988.field4400;
            this.field8988 = null;
        }
        this.field8880 = true;
        this.method3665(30615);
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 4787)
    public final void method3670(int arg0) {
        if (this.field8956 != null) {
            this.field8956.method815(false);
        }
        field8968++;
        int var2 = -10 / ((40 - arg0) / 32);
        if (this.field8929 != null) {
            this.field8929.method815(false);
        }
        if (this.field8902 != null) {
            this.field8902.method815(false);
        }
        if (this.field8919 != null) {
            this.field8919.method815(false);
        }
        if (this.field8926 != null) {
            this.field8926.method512(4149);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lnh;IIIZII)Z", line = 4815)
    private final boolean method3671(class778 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field8961++;
        class256 var8 = (class256) arg0;
        class256 var9 = this.field8927.field6222;
        float var10 = var8.field3006 * var9.field3007 + var8.field3028 * var9.field3027 + var8.field3002 * var9.field3031 + var9.field3028;
        float var11 = var8.field3006 * var9.field3004 + var8.field3028 * var9.field3018 + var8.field3002 * var9.field2991 + var9.field3002;
        class498.field6966 = var8.field3009 * var9.field3007 + var8.field3007 * var9.field3027 + var8.field3004 * var9.field3031;
        class114.field1442 = var8.field2994 * var9.field3009 + var8.field3031 * var9.field3021 + var8.field2991 * var9.field2994;
        class317.field3906 = var8.field3021 * var9.field3004 + var8.field3027 * var9.field3018 + var8.field3018 * var9.field2991;
        class182.field2217 = var8.field2994 * var9.field3007 + var8.field3031 * var9.field3027 + var8.field2991 * var9.field3031;
        class656.field9042 = var8.field2994 * var9.field3004 + var8.field3031 * var9.field3018 + var8.field2991 * var9.field2991;
        class506.field7187 = var8.field3021 * var9.field3009 + var8.field3027 * var9.field3021 + var8.field3018 * var9.field2994;
        float var12 = var8.field3006 * var9.field3009 + var8.field3028 * var9.field3021 + var8.field3002 * var9.field2994 + var9.field3006;
        class409.field5363 = var8.field3009 * var9.field3004 + var8.field3007 * var9.field3018 + var8.field3004 * var9.field2991;
        class522.field7402 = var8.field3021 * var9.field3007 + var8.field3027 * var9.field3027 + var8.field3018 * var9.field3031;
        class271.field3192 = var8.field3009 * var9.field3009 + var8.field3007 * var9.field3021 + var8.field3004 * var9.field2994;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field8927.field6271;
        int var19 = this.field8927.field6275;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        int var20 = this.field8884 - this.field8913 >> 1;
        int var21 = this.field8954 - this.field8885 >> 1;
        int var22 = this.field8949 - this.field8946 >> 1;
        int var23 = this.field8913 + var20;
        int var24 = this.field8885 + var21;
        int var25 = this.field8946 + var22;
        int var26 = var23 - (var20 << arg1);
        int var27 = var24 - (var21 << arg1);
        int var28 = var25 - (var22 << arg1);
        int var29 = var23 + (var20 << arg1);
        int var30 = var24 + (var21 << arg1);
        if (arg3 != 8) {
            this.field8948 = true;
        }
        class710.field9964[0] = var26;
        int var31 = var25 + (var22 << arg1);
        class631.field8614[0] = var27;
        class710.field9964[1] = var29;
        class770.field10594[0] = var28;
        class631.field8614[1] = var27;
        class710.field9964[2] = var26;
        class770.field10594[1] = var28;
        class631.field8614[2] = var30;
        class710.field9964[3] = var29;
        class770.field10594[2] = var28;
        class631.field8614[3] = var30;
        class710.field9964[4] = var26;
        class770.field10594[3] = var28;
        class631.field8614[4] = var27;
        class770.field10594[4] = var31;
        class710.field9964[5] = var29;
        class631.field8614[5] = var27;
        class710.field9964[6] = var26;
        class770.field10594[5] = var31;
        class631.field8614[6] = var30;
        class710.field9964[7] = var29;
        class770.field10594[6] = var31;
        class631.field8614[7] = var30;
        class770.field10594[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var51 = (float) class770.field10594[var32];
            float var52 = (float) class710.field9964[var32];
            float var53 = (float) class631.field8614[var32];
            float var54 = class271.field3192 * var51 + class506.field7187 * var52 + class114.field1442 * var53 + var12;
            float var55 = class498.field6966 * var51 + class522.field7402 * var52 + class182.field2217 * var53 + var10;
            float var56 = class409.field5363 * var51 + class656.field9042 * var53 + class317.field3906 * var52 + var11;
            if (var54 >= (float) this.field8927.field6322) {
                if (arg5 > 0) {
                    var54 = arg5;
                }
                float var57 = (float) var18 * var55 / var54 + (float) this.field8927.field6282;
                float var58 = (float) var19 * var56 / var54 + (float) this.field8927.field6317;
                if (var15 < var57) {
                    var15 = var57;
                }
                if (var14 > var57) {
                    var14 = var57;
                }
                if (var58 < var16) {
                    var16 = var58;
                }
                if (var58 > var17) {
                    var17 = var58;
                }
                var13 = true;
            }
        }
        if (var13 && (float) arg6 > var14 && (float) arg6 < var15 && var16 < (float) arg2 && var17 > (float) arg2) {
            if (arg4) {
                return true;
            }
            if (this.field8969 > class709.field9950.length) {
                class709.field9950 = new int[this.field8969];
                class573.field7860 = new int[this.field8969];
            }
            for (int var33 = 0; var33 < this.field8881; var33++) {
                float var35 = (float) this.field8918[var33];
                float var36 = (float) this.field8909[var33];
                float var37 = (float) this.field8966[var33];
                float var38 = class409.field5363 * var37 + class656.field9042 * var35 + class317.field3906 * var36 + var11;
                float var39 = class498.field6966 * var37 + class522.field7402 * var36 + class182.field2217 * var35 + var10;
                float var40 = class271.field3192 * var37 + class506.field7187 * var36 + class114.field1442 * var35 + var12;
                if (var40 >= (float) this.field8927.field6322) {
                    if (arg5 > 0) {
                        var40 = arg5;
                    }
                    int var41 = (int) ((float) var18 * var39 / var40 + (float) this.field8927.field6282);
                    int var42 = (int) ((float) var19 * var38 / var40 + (float) this.field8927.field6317);
                    int var43 = this.field8904[var33];
                    int var44 = this.field8904[var33 + 1];
                    for (int var45 = var43; var45 < var44; var45++) {
                        int var46 = this.field8977[var45] - 1;
                        if (var46 == -1) {
                            break;
                        }
                        class709.field9950[var46] = var41;
                        class573.field7860[var46] = var42;
                    }
                } else {
                    int var47 = this.field8904[var33];
                    int var48 = this.field8904[var33 + 1];
                    for (int var49 = var47; var49 < var48; var49++) {
                        int var50 = this.field8977[var49] - 1;
                        if (var50 == -1) {
                            break;
                        }
                        class709.field9950[this.field8977[var49] - 1] = -999999;
                    }
                }
            }
            for (int var34 = 0; var34 < this.field8963; var34++) {
                if (class709.field9950[this.field8877[var34]] != -999999 && class709.field9950[this.field8872[var34]] != -999999 && class709.field9950[this.field8889[var34]] != -999999 && this.method3663(class709.field9950[this.field8889[var34]], class573.field7860[this.field8889[var34]], class573.field7860[this.field8872[var34]], class709.field9950[this.field8877[var34]], arg2, class709.field9950[this.field8872[var34]], arg6, class573.field7860[this.field8877[var34]], (byte) 45)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "NA", descriptor = "()Z", line = 5059)
    public final boolean method356() {
        field8903++;
        if (this.field8893 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field8892; var1++) {
            this.field8909[var1] <<= 0x4;
            this.field8918[var1] <<= 0x4;
            this.field8966[var1] <<= 0x4;
        }
        class87.field1164 = 0;
        class203.field2428 = 0;
        class538.field7579 = 0;
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIZ)Lka;", line = 5089)
    public final class498 method364(byte arg0, int arg1, boolean arg2) {
        field8941++;
        class650 var4;
        class650 var5;
        if (arg0 == 1) {
            var4 = this.field8927.field6338;
            var5 = this.field8927.field6335;
        } else if (arg0 == 2) {
            var5 = this.field8927.field6343;
            var4 = this.field8927.field6346;
        } else if (arg0 == 3) {
            var4 = this.field8927.field6334;
            var5 = this.field8927.field6330;
        } else if (arg0 == 4) {
            var4 = this.field8927.field6328;
            var5 = this.field8927.field6349;
        } else if (arg0 == 5) {
            var5 = this.field8927.field6348;
            var4 = this.field8927.field6342;
        } else {
            var4 = var5 = new class650(this.field8927, 0, 0, true, false);
        }
        return this.method3666(var4, false, arg2, var5, arg1, arg0 != 0);
    }

    @OriginalMember(owner = "client!sk", name = "ua", descriptor = "()I", line = 5137)
    public final int method396() {
        field8971++;
        return this.field8901;
    }

    @OriginalMember(owner = "client!sk", name = "WA", descriptor = "()I", line = 5151)
    public final int method369() {
        field8957++;
        return this.field8924;
    }

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "()V", line = 5161)
    public final void method374() {
        for (int var1 = 0; var1 < this.field8881; var1++) {
            this.field8966[var1] = -this.field8966[var1];
        }
        field8899++;
        for (int var2 = 0; var2 < this.field8969; var2++) {
            this.field8871[var2] = (short) (-this.field8871[var2]);
        }
        for (int var3 = 0; var3 < this.field8963; var3++) {
            short var4 = this.field8877[var3];
            this.field8877[var3] = this.field8889[var3];
            this.field8889[var3] = var4;
        }
        this.method3673(false);
        this.method3675(0);
        this.method3668((byte) 79);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)Z", line = 5205)
    private final boolean method3672(int arg0) {
        field8887++;
        if (this.field8926.field791) {
            return true;
        }
        if (this.field8926.field790 == null) {
            this.field8926.field790 = this.field8927.method15(false, this.field8948);
        }
        class422 var2 = this.field8926.field790;
        if (arg0 != 8) {
            this.field8913 = 3;
        }
        var2.method2529(arg0 + 109, this.field8894 * 6);
        Buffer var3 = var2.method2527((byte) -113, true);
        if (var3 != null) {
            Stream var4 = this.field8927.method2650((byte) 89, var3);
            if (Stream.method3985()) {
                for (int var5 = 0; var5 < this.field8894; var5++) {
                    var4.method3991(this.field8877[var5]);
                    var4.method3991(this.field8872[var5]);
                    var4.method3991(this.field8889[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field8894; var6++) {
                    var4.method3988(this.field8877[var6]);
                    var4.method3988(this.field8872[var6]);
                    var4.method3988(this.field8889[var6]);
                }
            }
            var4.method3992();
            if (var2.method2526(1234)) {
                this.field8926.field791 = true;
                this.field8880 = true;
                this.field8926.field793 = var2;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "VA", descriptor = "(I)V", line = 5278)
    public final void method353(int arg0) {
        field8878++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field8881; var4++) {
            int var5 = this.field8918[var4] * var2 + this.field8909[var4] * var3 >> 14;
            this.field8918[var4] = this.field8918[var4] * var3 - (this.field8909[var4] * var2) >> 14;
            this.field8909[var4] = var5;
        }
        this.method3673(false);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 5305)
    private final void method3673(boolean arg0) {
        if (!arg0) {
            field8883++;
            if (this.field8956 != null) {
                this.field8956.field1194 = false;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILnh;ZI)Z", line = 5319)
    public final boolean method363(int arg0, int arg1, class778 arg2, boolean arg3, int arg4) {
        field8967++;
        return this.method3671(arg2, arg4, arg1, 8, arg3, -1, arg0);
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(B)V", line = 5327)
    private final void method3674(byte arg0) {
        int var2 = 76 / ((arg0 - 25) / 56);
        field8979++;
        if (this.field8894 == 0) {
            return;
        }
        if (this.method3667((byte) 122) && this.method3672(8)) {
            this.field8927.method64(0, this.field8956.field1204, 0);
            this.field8927.method64(0, this.field8902.field1204, 1);
            this.field8927.method64(0, this.field8929.field1204, 2);
            boolean var3;
            if ((this.field8950 & 0x37) == 0) {
                this.field8927.method2675(false, -8);
                var3 = false;
                this.field8927.method85((byte) 96, this.field8927.field6339);
            } else {
                var3 = true;
                this.field8927.method2675(true, -8);
                this.field8927.method64(0, this.field8919.field1204, 3);
                this.field8927.method85((byte) 96, this.field8927.field6333);
            }
            for (int var4 = 0; var4 < this.field8965.length; var4++) {
                int var5 = this.field8980[var4];
                int var6 = this.field8980[var4 + 1];
                int var7 = this.field8897[var5] & 0xFFFF;
                if (var7 == 65535) {
                    var7 = -1;
                }
                this.field8927.method2711(-1, var3, var7, true);
                this.field8927.method1(this.field8926.field793, (byte) 10, this.field8947[var4], class67.field920, var5 * 3, var6 - var5, this.field8965[var4]);
            }
        }
        this.method3665(30615);
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V", line = 5387)
    private final void method3675(int arg0) {
        field8953++;
        if ((this.field8950 & 0x37) != arg0) {
            if (this.field8919 == null) {
                return;
            }
            this.field8919.field1194 = false;
        } else if (this.field8902 != null) {
            this.field8902.field1194 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "()V", line = 5411)
    public final void method397() {
        field8905++;
    }

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "(I)V", line = 5419)
    public final void method375(int arg0) {
        field8868++;
        int var2 = class789.field10868[arg0];
        int var3 = class789.field10864[arg0];
        for (int var4 = 0; var4 < this.field8881; var4++) {
            int var7 = this.field8966[var4] * var2 + this.field8909[var4] * var3 >> 14;
            this.field8966[var4] = this.field8966[var4] * var3 - (this.field8909[var4] * var2) >> 14;
            this.field8909[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field8969; var5++) {
            int var6 = this.field8871[var5] * var2 + (this.field8910[var5] * var3) >> 14;
            this.field8871[var5] = (short) (this.field8871[var5] * var3 - (this.field8910[var5] * var2) >> 14);
            this.field8910[var5] = (short) var6;
        }
        this.method3673(false);
        this.method3675(0);
        this.field8930 = false;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "()V", line = 5462)
    public final void method392() {
        field8906++;
        if (this.field8969 > 0 && this.field8894 > 0) {
            this.method3667((byte) 123);
            this.method3672(8);
            this.method3665(30615);
        }
    }

    @OriginalMember(owner = "client!sk", name = "aa", descriptor = "(SS)V", line = 5475)
    public final void method399(short arg0, short arg1) {
        field8962++;
        class162 var3 = this.field8927.field890;
        for (int var4 = 0; var4 < this.field8963; var4++) {
            if (this.field8897[var4] == arg0) {
                this.field8897[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class359 var7 = var3.method1138(arg0 & 0xFFFF, 112);
            var5 = var7.field4462;
            var6 = var7.field4458;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class359 var10 = var3.method1138(arg1 & 0xFFFF, 127);
            if (var10.field4444 != 0 || var10.field4449 != 0) {
                this.field8933 = true;
            }
            var8 = var10.field4462;
            var9 = var10.field4458;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field8945 != null) {
            for (int var11 = 0; var11 < this.field8955; var11++) {
                class134 var12 = this.field8945[var11];
                class49 var13 = this.field8870[var11];
                var13.field687 = class437.field5749[this.field8935[var12.field1681] & 0xFFFF] & 0xFFFFFF | var13.field687 & 0xFF000000;
            }
        }
        this.method3661((byte) -68);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIII)V", line = 5550)
    public final void method382(int arg0, int arg1, int arg2, int arg3) {
        field8923++;
        for (int var5 = 0; var5 < this.field8963; var5++) {
            int var9 = this.field8935[var5] & 0xFFFF;
            int var10 = (var9 & 0xFEDF) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field8935[var5] = (short) class5.method105(var12, class5.method105(var11 << 7, var10 << 10));
        }
        if (this.field8945 != null) {
            for (int var6 = 0; var6 < this.field8955; var6++) {
                class134 var7 = this.field8945[var6];
                class49 var8 = this.field8870[var6];
                var8.field687 = class437.field5749[this.field8935[var7.field1681] & 0xFFFF] & 0xFFFFFF | var8.field687 & 0xFF000000;
            }
        }
        this.method3661((byte) -68);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[IIIIIZ)V", line = 5604)
    public final void method401(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field8907++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            int var12 = 0;
            class87.field1164 = 0;
            class203.field2428 = 0;
            class538.field7579 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field8893.length) {
                    int[] var15 = this.field8893[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class203.field2428 += this.field8909[var17];
                        class538.field7579 += this.field8918[var17];
                        var12++;
                        class87.field1164 += this.field8966[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class538.field7579 = var11;
                class203.field2428 = var9;
                class87.field1164 = var10;
            } else {
                class203.field2428 = class203.field2428 / var12 + var9;
                class87.field1164 = class87.field1164 / var12 + var10;
                class538.field7579 = class538.field7579 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field8893.length > var22) {
                    int[] var23 = this.field8893[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field8909[var25] += var18;
                        this.field8918[var25] += var19;
                        this.field8966[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field8893.length > var45) {
                    int[] var46 = this.field8893[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field8909[var48] -= class203.field2428;
                            this.field8918[var48] -= class538.field7579;
                            this.field8966[var48] -= class87.field1164;
                            if (arg4 != 0) {
                                int var49 = class789.field10868[arg4];
                                int var50 = class789.field10864[arg4];
                                int var51 = this.field8918[var48] * var49 + this.field8909[var48] * var50 + 16383 >> 14;
                                this.field8918[var48] = this.field8918[var48] * var50 + 16383 - (this.field8909[var48] * var49) >> 14;
                                this.field8909[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class789.field10868[arg2];
                                int var53 = class789.field10864[arg2];
                                int var54 = this.field8918[var48] * var53 + 16383 - (this.field8966[var48] * var52) >> 14;
                                this.field8966[var48] = this.field8966[var48] * var53 + this.field8918[var48] * var52 + 16383 >> 14;
                                this.field8918[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class789.field10868[arg3];
                                int var56 = class789.field10864[arg3];
                                int var57 = this.field8966[var48] * var55 + this.field8909[var48] * var56 + 16383 >> 14;
                                this.field8966[var48] = this.field8966[var48] * var56 + 16383 - (this.field8909[var48] * var55) >> 14;
                                this.field8909[var48] = var57;
                            }
                            this.field8909[var48] += class203.field2428;
                            this.field8918[var48] += class538.field7579;
                            this.field8966[var48] += class87.field1164;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field8909[var59] -= class203.field2428;
                            this.field8918[var59] -= class538.field7579;
                            this.field8966[var59] -= class87.field1164;
                            if (arg2 != 0) {
                                int var60 = class789.field10868[arg2];
                                int var61 = class789.field10864[arg2];
                                int var62 = this.field8918[var59] * var61 + 16383 - (this.field8966[var59] * var60) >> 14;
                                this.field8966[var59] = this.field8918[var59] * var60 + this.field8966[var59] * var61 + 16383 >> 14;
                                this.field8918[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class789.field10868[arg4];
                                int var64 = class789.field10864[arg4];
                                int var65 = this.field8918[var59] * var63 + this.field8909[var59] * var64 + 16383 >> 14;
                                this.field8918[var59] = this.field8918[var59] * var64 + 16383 - (this.field8909[var59] * var63) >> 14;
                                this.field8909[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class789.field10868[arg3];
                                int var67 = class789.field10864[arg3];
                                int var68 = this.field8909[var59] * var67 + this.field8966[var59] * var66 + 16383 >> 14;
                                this.field8966[var59] = this.field8966[var59] * var67 + 16383 - (this.field8909[var59] * var66) >> 14;
                                this.field8909[var59] = var68;
                            }
                            this.field8909[var59] += class203.field2428;
                            this.field8918[var59] += class538.field7579;
                            this.field8966[var59] += class87.field1164;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field8893.length > var28) {
                        int[] var29 = this.field8893[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field8904[var31];
                            int var33 = this.field8904[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field8977[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class789.field10868[arg4];
                                    int var37 = class789.field10864[arg4];
                                    int var38 = this.field8910[var35] * var37 + this.field8985[var35] * var36 + 16383 >> 14;
                                    this.field8985[var35] = (short) (this.field8985[var35] * var37 + 16383 - (this.field8910[var35] * var36) >> 14);
                                    this.field8910[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class789.field10868[arg2];
                                    int var40 = class789.field10864[arg2];
                                    int var41 = this.field8985[var35] * var40 + 16383 - (this.field8871[var35] * var39) >> 14;
                                    this.field8871[var35] = (short) (this.field8985[var35] * var39 + this.field8871[var35] * var40 + 16383 >> 14);
                                    this.field8985[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class789.field10868[arg3];
                                    int var43 = class789.field10864[arg3];
                                    int var44 = this.field8910[var35] * var43 + this.field8871[var35] * var42 + 16383 >> 14;
                                    this.field8871[var35] = (short) (this.field8871[var35] * var43 + 16383 - (this.field8910[var35] * var42) >> 14);
                                    this.field8910[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method3675(0);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field8893.length > var70) {
                    int[] var71 = this.field8893[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field8909[var73] -= class203.field2428;
                        this.field8918[var73] -= class538.field7579;
                        this.field8966[var73] -= class87.field1164;
                        this.field8909[var73] = this.field8909[var73] * arg2 >> 7;
                        this.field8918[var73] = this.field8918[var73] * arg3 >> 7;
                        this.field8966[var73] = this.field8966[var73] * arg4 >> 7;
                        this.field8909[var73] += class203.field2428;
                        this.field8918[var73] += class538.field7579;
                        this.field8966[var73] += class87.field1164;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field8928 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field8928.length > var79) {
                        int[] var80 = this.field8928[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field8862[var82] & 0xFF) + (arg2 * 8);
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field8862[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field8945 != null) {
                        for (int var76 = 0; var76 < this.field8955; var76++) {
                            class134 var77 = this.field8945[var76];
                            class49 var78 = this.field8870[var76];
                            var78.field687 = var78.field687 & 0xFFFFFF | 255 - (this.field8862[var77.field1681] & 0xFF) << 24;
                        }
                    }
                    this.method3661((byte) -68);
                }
            }
        } else if (arg0 == 7) {
            if (this.field8928 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (this.field8928.length > var89) {
                        int[] var90 = this.field8928[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field8935[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = (var93 & 0x38C) >> 7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = arg2 + var94 & 0x3F;
                            int var98 = var93 & 0x7F;
                            int var99 = arg4 + var98;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field8935[var92] = (short) class5.method105(class5.method105(var96 << 7, var97 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field8945 != null) {
                        for (int var86 = 0; var86 < this.field8955; var86++) {
                            class134 var87 = this.field8945[var86];
                            class49 var88 = this.field8870[var86];
                            var88.field687 = class437.field5749[this.field8935[var87.field1681] & 0xFFFF] & 0xFFFFFF | var88.field687 & 0xFF000000;
                        }
                    }
                    this.method3661((byte) -68);
                }
            }
        } else if (arg0 == 8) {
            if (this.field8964 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field8964.length) {
                        int[] var102 = this.field8964[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class49 var104 = this.field8870[var102[var103]];
                            var104.field692 += arg2;
                            var104.field688 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field8964 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field8964.length) {
                        int[] var107 = this.field8964[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class49 var109 = this.field8870[var107[var108]];
                            var109.field689 = var109.field689 * arg2 >> 7;
                            var109.field694 = var109.field694 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field8964 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field8964.length > var111) {
                    int[] var112 = this.field8964[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class49 var114 = this.field8870[var112[var113]];
                        var114.field695 = var114.field695 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IIII)V", line = 6262)
    public static final void method3676(int arg0, int arg1, int arg2, int arg3) {
        field8942++;
        int var4 = class632.field8626 + arg0;
        int var5 = class620.field8435 + arg3;
        if (class107.field1351 == null || arg0 < 0 || arg3 < 0 || arg0 >= class596.field8090 || class107.field1350 <= arg3 || class118.field1503.field10632.method3881(0) == 0 && class300.field3596.field808 != arg2 || arg1 != -2058232919) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg2 << 28 | var4);
        class667 var8 = (class667) class673.field9230.method2121(arg1 ^ 0x8551DBE4, var6);
        if (var8 == null) {
            class491.method2901(arg2, arg0, arg3);
            return;
        }
        class659 var9 = (class659) var8.field9164.method2725(37);
        if (var9 == null) {
            class491.method2901(arg2, arg0, arg3);
            return;
        }
        class57 var10 = (class57) class491.method2901(arg2, arg0, arg3);
        if (var10 == null) {
            var10 = new class57(arg0 << 9, class621.field8523[arg2].method1728(arg3, (byte) -120, arg0), arg3 << 9, arg2, arg2);
        } else {
            var10.field773 = var10.field770 = -1;
        }
        var10.field785 = var9.field9062;
        var10.field778 = var9.field9064;
        label61: while (true) {
            class659 var11 = (class659) var8.field9164.method2726(arg1 + 2058232802);
            if (var11 == null) {
                break;
            }
            if (var10.field785 != var11.field9062) {
                var10.field773 = var11.field9062;
                var10.field787 = var11.field9064;
                while (true) {
                    class659 var12 = (class659) var8.field9164.method2726(arg1 ^ 0x7AAE2421);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field785 != var12.field9062 && var10.field773 != var12.field9062) {
                        var10.field771 = var12.field9064;
                        var10.field770 = var12.field9062;
                    }
                }
            }
        }
        int var13 = class483.method2867(arg2, (byte) -47, (arg3 << 9) + 256, (arg0 << 9) + 256);
        var10.field808 = (byte) arg2;
        var10.field768 = 0;
        var10.field809 = var13;
        var10.field823 = arg0 << 9;
        var10.field813 = arg3 << 9;
        var10.field811 = (byte) arg2;
        if (class77.method708(arg0, arg1 + 1873283395, arg3)) {
            var10.field811++;
        }
        class620.method3522(arg2, arg0, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "()I", line = 6369)
    public final int method393() {
        field8866++;
        if (!this.field8930) {
            this.method3660((byte) 126);
        }
        return this.field8949;
    }
}
