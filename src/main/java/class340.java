import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class340 extends class395 {

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "Z")
    private boolean field4932 = true;

    @OriginalMember(owner = "client!tda", name = "Fb", descriptor = "I")
    private int field4997 = 0;

    @OriginalMember(owner = "client!tda", name = "Wb", descriptor = "Z")
    private boolean field5014 = false;

    @OriginalMember(owner = "client!tda", name = "kc", descriptor = "I")
    private int field5028 = 0;

    @OriginalMember(owner = "client!tda", name = "fc", descriptor = "I")
    private int field5023 = 0;

    @OriginalMember(owner = "client!tda", name = "tc", descriptor = "Z")
    private boolean field5037 = false;

    @OriginalMember(owner = "client!tda", name = "vc", descriptor = "I")
    private int field5039 = 0;

    @OriginalMember(owner = "client!tda", name = "Rb", descriptor = "I")
    private int field5009 = 0;

    @OriginalMember(owner = "client!tda", name = "V", descriptor = "Luca;")
    private class287 field4961;

    @OriginalMember(owner = "client!tda", name = "Ob", descriptor = "Lgv;")
    private class39 field5006;

    @OriginalMember(owner = "client!tda", name = "oc", descriptor = "Lgv;")
    private class39 field5032;

    @OriginalMember(owner = "client!tda", name = "Tb", descriptor = "Lgv;")
    private class39 field5011;

    @OriginalMember(owner = "client!tda", name = "jb", descriptor = "Lgv;")
    private class39 field4975;

    @OriginalMember(owner = "client!tda", name = "ob", descriptor = "Lti;")
    private class485 field4980;

    @OriginalMember(owner = "client!tda", name = "cb", descriptor = "I")
    private int field4968;

    @OriginalMember(owner = "client!tda", name = "ac", descriptor = "I")
    private int field5018;

    @OriginalMember(owner = "client!tda", name = "nc", descriptor = "[I")
    private int[] field5031;

    @OriginalMember(owner = "client!tda", name = "wb", descriptor = "[I")
    private int[] field4988;

    @OriginalMember(owner = "client!tda", name = "Pb", descriptor = "[S")
    private short[] field5007;

    @OriginalMember(owner = "client!tda", name = "ic", descriptor = "[I")
    private int[] field5026;

    @OriginalMember(owner = "client!tda", name = "pb", descriptor = "[I")
    private int[] field4981;

    @OriginalMember(owner = "client!tda", name = "Kb", descriptor = "[Lrca;")
    private class30[] field5002;

    @OriginalMember(owner = "client!tda", name = "Eb", descriptor = "[Lil;")
    private class586[] field4996;

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!tda", name = "y", descriptor = "[Lkh;")
    private class330[] field4938;

    @OriginalMember(owner = "client!tda", name = "G", descriptor = "[Lcs;")
    private class563[] field4946;

    @OriginalMember(owner = "client!tda", name = "ab", descriptor = "[S")
    private short[] field4966;

    @OriginalMember(owner = "client!tda", name = "Cb", descriptor = "[S")
    private short[] field4994;

    @OriginalMember(owner = "client!tda", name = "ec", descriptor = "[S")
    private short[] field5022;

    @OriginalMember(owner = "client!tda", name = "T", descriptor = "[S")
    private short[] field4959;

    @OriginalMember(owner = "client!tda", name = "qb", descriptor = "[S")
    private short[] field4982;

    @OriginalMember(owner = "client!tda", name = "Nb", descriptor = "[F")
    private float[] field5005;

    @OriginalMember(owner = "client!tda", name = "sb", descriptor = "[B")
    private byte[] field4984;

    @OriginalMember(owner = "client!tda", name = "fb", descriptor = "S")
    private short field4971;

    @OriginalMember(owner = "client!tda", name = "sc", descriptor = "[S")
    private short[] field5036;

    @OriginalMember(owner = "client!tda", name = "mc", descriptor = "[S")
    private short[] field5030;

    @OriginalMember(owner = "client!tda", name = "bc", descriptor = "[F")
    private float[] field5019;

    @OriginalMember(owner = "client!tda", name = "x", descriptor = "[S")
    private short[] field4937;

    @OriginalMember(owner = "client!tda", name = "Mb", descriptor = "[B")
    private byte[] field5004;

    @OriginalMember(owner = "client!tda", name = "wc", descriptor = "S")
    private short field5040;

    @OriginalMember(owner = "client!tda", name = "Hb", descriptor = "[S")
    private short[] field4999;

    @OriginalMember(owner = "client!tda", name = "P", descriptor = "[S")
    private short[] field4955;

    @OriginalMember(owner = "client!tda", name = "cc", descriptor = "[I")
    private int[] field5020;

    @OriginalMember(owner = "client!tda", name = "tb", descriptor = "[[I")
    private int[][] field4985;

    @OriginalMember(owner = "client!tda", name = "Q", descriptor = "[[I")
    private int[][] field4956;

    @OriginalMember(owner = "client!tda", name = "gb", descriptor = "[[I")
    private int[][] field4972;

    @OriginalMember(owner = "client!tda", name = "Jb", descriptor = "I")
    public static int field5001 = -1;

    @OriginalMember(owner = "client!tda", name = "Sb", descriptor = "B")
    private byte field5010;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!tda", name = "w", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!tda", name = "z", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!tda", name = "A", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!tda", name = "C", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!tda", name = "D", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!tda", name = "E", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!tda", name = "I", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!tda", name = "L", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!tda", name = "M", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!tda", name = "N", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!tda", name = "O", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!tda", name = "R", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!tda", name = "U", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!tda", name = "W", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!tda", name = "X", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!tda", name = "Y", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!tda", name = "Z", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!tda", name = "bb", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!tda", name = "eb", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!tda", name = "ib", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!tda", name = "kb", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!tda", name = "lb", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!tda", name = "mb", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!tda", name = "nb", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!tda", name = "rb", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!tda", name = "vb", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!tda", name = "xb", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!tda", name = "yb", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!tda", name = "zb", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!tda", name = "Ab", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!tda", name = "Bb", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!tda", name = "Gb", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!tda", name = "Ib", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!tda", name = "Qb", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!tda", name = "Ub", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!tda", name = "Vb", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!tda", name = "Xb", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!tda", name = "Yb", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!tda", name = "Zb", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!tda", name = "gc", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!tda", name = "hc", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!tda", name = "jc", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!tda", name = "lc", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!tda", name = "rc", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!tda", name = "uc", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!tda", name = "xc", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!tda", name = "yc", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!tda", name = "zc", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!tda", name = "Ac", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!tda", name = "Bc", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!tda", name = "Cc", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!tda", name = "Dc", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!tda", name = "Ec", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!tda", name = "Fc", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!tda", name = "Gc", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!tda", name = "Hc", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!tda", name = "hb", descriptor = "Lre;")
    private class290 field4973;

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "Lvr;")
    private class408 field4947;

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "Ljw;")
    public static class426 field4933;

    @OriginalMember(owner = "client!tda", name = "Db", descriptor = "Lfba;")
    private class558 field4995;

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "S")
    private short field4935;

    @OriginalMember(owner = "client!tda", name = "S", descriptor = "S")
    private short field4958;

    @OriginalMember(owner = "client!tda", name = "db", descriptor = "S")
    private short field4969;

    @OriginalMember(owner = "client!tda", name = "ub", descriptor = "S")
    private short field4986;

    @OriginalMember(owner = "client!tda", name = "Lb", descriptor = "S")
    private short field5003;

    @OriginalMember(owner = "client!tda", name = "dc", descriptor = "S")
    private short field5021;

    @OriginalMember(owner = "client!tda", name = "pc", descriptor = "S")
    private short field5033;

    @OriginalMember(owner = "client!tda", name = "qc", descriptor = "S")
    private short field5034;

    @OriginalMember(owner = "client!tda", name = "R", descriptor = "(III)V", line = 3)
    public final void method1033(int arg0, int arg1, int arg2) {
        field4998++;
        for (int var4 = 0; var4 < this.field4997; var4++) {
            if (arg0 != 128) {
                this.field5026[var4] = this.field5026[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4988[var4] = this.field4988[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4981[var4] = this.field4981[var4] * arg2 >> 7;
            }
        }
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)V", line = 34)
    private final void method2098(int arg0) {
        if (this.field4938 != null) {
            class196 var2 = this.field4961.field4017;
            this.field4961.method1763((byte) -123);
            this.field4961.method636(!this.field5037);
            this.field4961.method1705(false, (byte) -114);
            this.field4961.method1714(this.field4961.field4124, -1, null, null, this.field4961.field4082);
            for (int var3 = 0; var3 < this.field4949; var3++) {
                class330 var4 = this.field4938[var3];
                class563 var5 = this.field4946[var3];
                if (!var4.field4806 || !this.field4961.method705()) {
                    float var6 = (float) (this.field5026[var4.field4802] + this.field5026[var4.field4797] + this.field5026[var4.field4804]) * 0.3333333F;
                    float var7 = (float) (this.field4988[var4.field4804] + this.field4988[var4.field4802] + this.field4988[var4.field4797]) * 0.3333333F;
                    float var8 = (float) (this.field4981[var4.field4804] + this.field4981[var4.field4797] + this.field4981[var4.field4802]) * 0.3333333F;
                    float var9 = class94.field1455 * var8 + class70.field1082 * var7 + class27.field476 * var6 + class250.field3285;
                    float var10 = class624.field9022 * var8 + class517.field7267 * var6 + class298.field4391 * var7 + class85.field1332;
                    float var11 = class697.field9815 * var8 + class652.field9334 * var7 + class433.field6284 * var6 + class550.field8103;
                    var2.method1278((byte) 103, var4.field4796 * var5.field8236 >> 7, var4.field4800 * var5.field8228 >> 7, (float) var5.field8232 + var9, (float) var4.field4805 + -var11, var5.field8230, (float) var5.field8227 - var10);
                    this.field4961.method1711(true, var2);
                    int var12 = var5.field8237;
                    OpenGL.glColor4ub((byte) (var12 >> 16), (byte) (var12 >> 8), (byte) var12, (byte) (var12 >> 24));
                    this.field4961.method1761(var4.field4798, 260);
                    this.field4961.method1721(-128, var4.field4801);
                    this.field4961.method1754(0, (byte) -112, 4, 7);
                }
            }
            this.field4961.method636(true);
            this.field4961.method1696(arg0 - 46);
        }
        field4993++;
        if (arg0 != 7) {
            this.field4947 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BIZ)Lda;", line = 93)
    public final class395 method1038(byte arg0, int arg1, boolean arg2) {
        field4977++;
        class340 var4;
        class340 var5;
        if (arg0 == 1) {
            var5 = this.field4961.field4104;
            var4 = this.field4961.field4096;
        } else if (arg0 == 2) {
            var4 = this.field4961.field4139;
            var5 = this.field4961.field4089;
        } else if (arg0 == 3) {
            var5 = this.field4961.field4078;
            var4 = this.field4961.field4107;
        } else if (arg0 == 4) {
            var5 = this.field4961.field4119;
            var4 = this.field4961.field4076;
        } else if (arg0 == 5) {
            var4 = this.field4961.field4116;
            var5 = this.field4961.field4084;
        } else {
            var4 = var5 = new class340(this.field4961);
        }
        return this.method2101(var5, arg1, arg2, arg0 != 0, var4, 128);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lq;Lqh;I)V", line = 145)
    public final void method1054(class151 arg0, class67 arg1, int arg2) {
        field4957++;
        if (this.field5028 == 0) {
            return;
        }
        class196 var4 = this.field4961.field4052;
        class196 var5 = (class196) arg0;
        if (!this.field5014) {
            this.method2104(0);
        }
        class550.field8103 = var4.field2671 * var5.field2679 + var4.field2668 * var5.field2661 + var4.field2649 * var5.field2642 + var4.field2679;
        class652.field9334 = var4.field2671 * var5.field2668 + var4.field2668 * var5.field2672 + var4.field2649 * var5.field2655;
        float var6 = (float) this.field5033 * class652.field9334 + class550.field8103;
        float var7 = (float) this.field4969 * class652.field9334 + class550.field8103;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = (float) (-this.field4958) + var7;
            var8 = (float) this.field4958 + var6;
        } else {
            var8 = (float) this.field4958 + var7;
            var9 = (float) (-this.field4958) + var6;
        }
        if ((var9 >= this.field4961.field4077) || ((float) this.field4961.field4080 >= var8)) {
            return;
        }
        class250.field3285 = var4.field2664 * var5.field2679 + var4.field2655 * var5.field2661 + var4.field2644 * var5.field2642 + var4.field2642;
        class70.field1082 = var4.field2664 * var5.field2668 + var4.field2655 * var5.field2672 + var4.field2644 * var5.field2655;
        float var10 = (float) this.field5033 * class70.field1082 + class250.field3285;
        float var11 = (float) this.field4969 * class70.field1082 + class250.field3285;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = (var11 - (float) this.field4958) * (float) this.field4961.field4161;
            var13 = ((float) this.field4958 + var10) * (float) this.field4961.field4161;
        } else {
            var12 = ((float) (-this.field4958) + var10) * (float) this.field4961.field4161;
            var13 = ((float) this.field4958 + var11) * (float) this.field4961.field4161;
        }
        if ((this.field4961.field4085 <= var12 / var8) || (this.field4961.field4092 >= var13 / var8)) {
            return;
        }
        class298.field4391 = var4.field2674 * var5.field2668 + var4.field2672 * var5.field2672 + var4.field2654 * var5.field2655;
        class85.field1332 = var4.field2674 * var5.field2679 + var4.field2672 * var5.field2661 + var4.field2654 * var5.field2642 + var4.field2661;
        float var14 = (float) this.field5033 * class298.field4391 + class85.field1332;
        float var15 = (float) this.field4969 * class298.field4391 + class85.field1332;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field4958 + var14) * (float) this.field4961.field4059;
            var16 = ((float) (-this.field4958) + var15) * (float) this.field4961.field4059;
        } else {
            var16 = ((float) (-this.field4958) + var14) * (float) this.field4961.field4059;
            var17 = ((float) this.field4958 + var15) * (float) this.field4961.field4059;
        }
        if ((var16 / var8 >= this.field4961.field4158) || (var17 / var8 <= this.field4961.field4146)) {
            return;
        }
        if (arg1 != null || this.field4938 != null) {
            class27.field476 = var4.field2664 * var5.field2649 + var4.field2655 * var5.field2654 + var4.field2644 * var5.field2644;
            class624.field9022 = var4.field2674 * var5.field2671 + var4.field2672 * var5.field2674 + var4.field2654 * var5.field2664;
            class517.field7267 = var4.field2674 * var5.field2649 + var4.field2672 * var5.field2654 + var4.field2654 * var5.field2644;
            class94.field1455 = var4.field2664 * var5.field2671 + var4.field2655 * var5.field2674 + var4.field2644 * var5.field2664;
            class433.field6284 = var4.field2671 * var5.field2649 + var4.field2668 * var5.field2654 + var4.field2649 * var5.field2644;
            class697.field9815 = var4.field2671 * var5.field2671 + var4.field2668 * var5.field2674 + var4.field2649 * var5.field2664;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5003 + this.field4935 >> 1;
            int var21 = this.field5021 + this.field4986 >> 1;
            int var22 = (int) ((float) var21 * class94.field1455 + (float) this.field5033 * class70.field1082 + (float) var20 * class27.field476 + class250.field3285);
            int var23 = (int) ((float) var21 * class624.field9022 + (float) this.field5033 * class298.field4391 + (float) var20 * class517.field7267 + class85.field1332);
            int var24 = (int) ((float) var21 * class697.field9815 + (float) this.field5033 * class652.field9334 + (float) var20 * class433.field6284 + class550.field8103);
            if (var24 >= this.field4961.field4080) {
                arg1.field1055 = this.field4961.field4059 * var23 / var24 + this.field4961.field4129;
                arg1.field1059 = this.field4961.field4161 * var22 / var24 + this.field4961.field4154;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class94.field1455 + (float) this.field4969 * class70.field1082 + (float) var20 * class27.field476 + class250.field3285);
            int var26 = (int) ((float) var21 * class624.field9022 + (float) this.field4969 * class298.field4391 + (float) var20 * class517.field7267 + class85.field1332);
            int var27 = (int) ((float) var21 * class697.field9815 + (float) this.field4969 * class652.field9334 + (float) var20 * class433.field6284 + class550.field8103);
            if (this.field4961.field4080 > var27) {
                var18 = true;
            } else {
                arg1.field1056 = this.field4961.field4154 + (this.field4961.field4161 * var25 / var27);
                arg1.field1058 = this.field4961.field4059 * var26 / var27 + this.field4961.field4129;
            }
            if (var18) {
                if (this.field4961.field4080 > var24 && this.field4961.field4080 > var27) {
                    var19 = false;
                } else if (this.field4961.field4080 > var24) {
                    int var31 = (var27 - this.field4961.field4080 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field1059 = this.field4961.field4161 * var32 / this.field4961.field4080 + this.field4961.field4154;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field1055 = this.field4961.field4059 * var33 / this.field4961.field4080 + this.field4961.field4129;
                } else if (var27 < this.field4961.field4080) {
                    int var28 = (var24 - this.field4961.field4080 << 16) / (var24 - var27);
                    int var29 = var22 + ((var22 - var25) * var28 >> 16);
                    arg1.field1059 = this.field4961.field4161 * var29 / this.field4961.field4080 + this.field4961.field4154;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field1055 = this.field4961.field4059 * var30 / this.field4961.field4080 + this.field4961.field4129;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field1060 = (this.field4958 + var22) * this.field4961.field4161 / var24 + this.field4961.field4154 - arg1.field1059;
                } else {
                    arg1.field1060 = (var25 + this.field4958) * this.field4961.field4161 / var27 + this.field4961.field4154 - arg1.field1056;
                }
                arg1.field1057 = true;
            }
        }
        this.field4961.method1730((byte) 90);
        this.field4961.method1767(var5, (byte) 18);
        this.method2099((byte) -102);
        this.field4961.method1696(-98);
        this.method2098(7);
    }

    @OriginalMember(owner = "client!tda", name = "za", descriptor = "()I", line = 346)
    public final int method1039() {
        if (!this.field5014) {
            this.method2104(0);
        }
        field4983++;
        return this.field4986;
    }

    @OriginalMember(owner = "client!tda", name = "MA", descriptor = "(I)V", line = 357)
    public final void method1048(int arg0) {
        field5048++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field4997; var4++) {
            int var5 = this.field4988[var4] * var3 - this.field4981[var4] * var2 >> 14;
            this.field4981[var4] = this.field4988[var4] * var2 + this.field4981[var4] * var3 >> 14;
            this.field4988[var4] = var5;
        }
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V", line = 387)
    private final void method2099(byte arg0) {
        field5047++;
        if (this.field5023 == 0) {
            return;
        }
        if (this.field5010 != 0) {
            this.method2109(true, 16848);
        }
        this.method2109(false, 16848);
        if (this.field4980 != null) {
            if (this.field4980.field6907 == null) {
                this.method2102(103, (this.field5010 & 0x10) != 0);
            }
            if (this.field4980.field6907 != null) {
                this.field4961.method1705(this.field5011 != null, (byte) 82);
                this.field4961.method1714(this.field5032, -1, this.field5011, this.field4975, this.field5006);
                int var2 = this.field5020.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5020[var3];
                    int var5 = this.field5020[var3 + 1];
                    int var6 = this.field4937[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field4961.method1717(this.field5011 != null, var6, (byte) 102);
                    this.field4961.method1702(4, var4 * 3, (var5 - var4) * 3, 28498, this.field4980.field6907);
                }
            }
        }
        int var7 = -73 / ((arg0 - 1) / 40);
        this.method2107((byte) -124);
    }

    @OriginalMember(owner = "client!tda", name = "SA", descriptor = "(I)V", line = 447)
    public final void method1017(int arg0) {
        field4934++;
        this.field4968 = arg0;
        if (this.field4947 != null && (this.field4968 & 0x10000) == 0) {
            this.field5004 = this.field4947.field6087;
            this.field5022 = this.field4947.field6083;
            this.field4966 = this.field4947.field6082;
            this.field4955 = this.field4947.field6080;
            this.field4947 = null;
        }
        this.field4932 = true;
        this.method2107((byte) -124);
    }

    @OriginalMember(owner = "client!tda", name = "FA", descriptor = "()V", line = 473)
    public final void method1025() {
        field4962++;
        for (int var1 = 0; var1 < this.field4997; var1++) {
            this.field4981[var1] = -this.field4981[var1];
        }
        for (int var2 = 0; var2 < this.field5028; var2++) {
            this.field4966[var2] = (short) (-this.field4966[var2]);
        }
        for (int var3 = 0; var3 < this.field5039; var3++) {
            short var4 = this.field4994[var3];
            this.field4994[var3] = this.field4999[var3];
            this.field4999[var3] = var4;
        }
        if (this.field5011 == null && this.field4975 != null) {
            this.field4975.field588 = null;
        }
        if (this.field5011 != null) {
            this.field5011.field588 = null;
        }
        if (this.field4980 != null) {
            this.field4980.field6907 = null;
        }
        this.field5014 = false;
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILq;Z)Z", line = 525)
    public final boolean method1026(int arg0, int arg1, class151 arg2, boolean arg3) {
        field4965++;
        return this.method2111(-1, arg0, arg2, false, arg3, arg1);
    }

    @OriginalMember(owner = "client!tda", name = "B", descriptor = "(I[IIIIZI[I)V", line = 534)
    public final void method1049(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4992++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class579.field8413 = 0;
            int var13 = 0;
            class497.field7031 = 0;
            class201.field2731 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4985.length) {
                    int[] var16 = this.field4985[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5007 == null || (this.field5007[var18] & arg6) != 0) {
                            class201.field2731 += this.field5026[var18];
                            class497.field7031 += this.field4988[var18];
                            class579.field8413 += this.field4981[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class579.field8413 = class579.field8413 / var13 + var12;
                class409.field6094 = true;
                class201.field2731 = class201.field2731 / var13 + var11;
                class497.field7031 = class497.field7031 / var13 + var10;
            } else {
                class201.field2731 = var11;
                class579.field8413 = var12;
                class497.field7031 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[2] * arg4 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + (arg7[4] * arg3) + 8192 >> 14;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field4985.length > var26) {
                    int[] var27 = this.field4985[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5007 == null || (arg6 & this.field5007[var29]) != 0) {
                            this.field5026[var29] += var23;
                            this.field4988[var29] += var22;
                            this.field4981[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field4985.length) {
                        int[] var110 = this.field4985[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5007 == null || (arg6 & this.field5007[var112]) != 0) {
                                this.field5026[var112] -= class201.field2731;
                                this.field4988[var112] -= class497.field7031;
                                this.field4981[var112] -= class579.field8413;
                                if (arg4 != 0) {
                                    int var113 = class271.field3549[arg4];
                                    int var114 = class271.field3544[arg4];
                                    int var115 = this.field5026[var112] * var114 + this.field4988[var112] * var113 + 16383 >> 14;
                                    this.field4988[var112] = this.field4988[var112] * var114 + 16383 - (this.field5026[var112] * var113) >> 14;
                                    this.field5026[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class271.field3549[arg2];
                                    int var117 = class271.field3544[arg2];
                                    int var118 = this.field4988[var112] * var117 + 16383 - (this.field4981[var112] * var116) >> 14;
                                    this.field4981[var112] = this.field4981[var112] * var117 + (this.field4988[var112] * var116 + 16383) >> 14;
                                    this.field4988[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class271.field3549[arg3];
                                    int var120 = class271.field3544[arg3];
                                    int var121 = this.field4981[var112] * var119 + this.field5026[var112] * var120 + 16383 >> 14;
                                    this.field4981[var112] = this.field4981[var112] * var120 + 16383 - this.field5026[var112] * var119 >> 14;
                                    this.field5026[var112] = var121;
                                }
                                this.field5026[var112] += class201.field2731;
                                this.field4988[var112] += class497.field7031;
                                this.field4981[var112] += class579.field8413;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field4985.length) {
                            int[] var93 = this.field4985[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5007 == null || (this.field5007[var95] & arg6) != 0) {
                                    int var96 = this.field5031[var95];
                                    int var97 = this.field5031[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field4959[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class271.field3549[arg4];
                                            int var101 = class271.field3544[arg4];
                                            int var102 = this.field5022[var99] * var101 + this.field4955[var99] * var100 + 16383 >> 14;
                                            this.field4955[var99] = (short) (this.field4955[var99] * var101 + 16383 - (this.field5022[var99] * var100) >> 14);
                                            this.field5022[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class271.field3549[arg2];
                                            int var104 = class271.field3544[arg2];
                                            int var105 = this.field4955[var99] * var104 + 16383 - (this.field4966[var99] * var103) >> 14;
                                            this.field4966[var99] = (short) (this.field4966[var99] * var104 + this.field4955[var99] * var103 + 16383 >> 14);
                                            this.field4955[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class271.field3549[arg3];
                                            int var107 = class271.field3544[arg3];
                                            int var108 = this.field4966[var99] * var106 + this.field5022[var99] * var107 + 16383 >> 14;
                                            this.field4966[var99] = (short) (this.field4966[var99] * var107 + 16383 - (this.field5022[var99] * var106) >> 14);
                                            this.field5022[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5011 == null && this.field4975 != null) {
                        this.field4975.field588 = null;
                    }
                    if (this.field5011 != null) {
                        this.field5011.field588 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class409.field6094) {
                    int var36 = arg7[0] * class201.field2731 + arg7[3] * class497.field7031 + (arg7[6] * class579.field8413) + 8192 >> 14;
                    int var37 = arg7[4] * class497.field7031 + arg7[1] * class201.field2731 + arg7[7] * class579.field8413 + 8192 >> 14;
                    int var38 = var34 + var37;
                    int var39 = var33 + var36;
                    int var40 = arg7[2] * class201.field2731 + (arg7[5] * class497.field7031) + arg7[8] * class579.field8413 + 8192 >> 14;
                    class201.field2731 = var39;
                    int var41 = var35 + var40;
                    class497.field7031 = var38;
                    class579.field8413 = var41;
                    class409.field6094 = false;
                }
                int[] var42 = new int[9];
                int var43 = class271.field3544[arg2];
                int var44 = class271.field3549[arg2];
                int var45 = class271.field3544[arg3];
                int var46 = class271.field3549[arg3];
                int var47 = class271.field3544[arg4];
                int var48 = class271.field3549[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[1] = var46 * var49 + -var45 * var48 + 8192 >> 14;
                var42[7] = var46 * var48 + (var45 * var49) + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + (var45 * var50 + 8192) >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[0] = var45 * var47 + (var46 * var50 + 8192) >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                int var51 = var42[2] * -class579.field8413 + var42[0] * -class201.field2731 + var42[1] * -class497.field7031 + 8192 >> 14;
                int var52 = var42[3] * -class201.field2731 + (var42[4] * -class497.field7031) + var42[5] * -class579.field8413 + 8192 >> 14;
                int var53 = var42[8] * -class579.field8413 + var42[7] * -class497.field7031 + var42[6] * -class201.field2731 + 8192 >> 14;
                int var54 = var51 + class201.field2731;
                int var55 = class497.field7031 + var52;
                int var56 = class579.field8413 + var53;
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
                int var63 = var42[8] * var35 + var42[7] * var34 + var42[6] * var33 + 8192 >> 14;
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
                int var67 = arg7[1] * var62 + arg7[2] * var64 + arg7[0] * var61 + 8192 >> 14;
                int var68 = arg7[3] * var61 + arg7[5] * var64 + arg7[4] * var62 + 8192 >> 14;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[6] * var61 + arg7[8] * var64 + arg7[7] * var62 + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field4985.length) {
                        int[] var75 = this.field4985[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5007 == null || (arg6 & this.field5007[var77]) != 0) {
                                int var78 = this.field5026[var77] * var65[0] + this.field4981[var77] * var65[2] + (this.field4988[var77] * var65[1]) + 8192 >> 14;
                                int var79 = this.field5026[var77] * var65[3] + this.field4988[var77] * var65[4] + this.field4981[var77] * var65[5] + 8192 >> 14;
                                int var80 = this.field5026[var77] * var65[6] - (-(this.field4988[var77] * var65[7]) - (this.field4981[var77] * var65[8]) - 8192) >> 14;
                                int var81 = var69 + var79;
                                int var82 = var70 + var78;
                                int var83 = var72 + var80;
                                this.field5026[var77] = var82;
                                this.field4988[var77] = var81;
                                this.field4981[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field4985.length) {
                        int[] var174 = this.field4985[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5007 == null || (this.field5007[var176] & arg6) != 0) {
                                this.field5026[var176] -= class201.field2731;
                                this.field4988[var176] -= class497.field7031;
                                this.field4981[var176] -= class579.field8413;
                                this.field5026[var176] = this.field5026[var176] * arg2 >> 7;
                                this.field4988[var176] = this.field4988[var176] * arg3 >> 7;
                                this.field4981[var176] = this.field4981[var176] * arg4 >> 7;
                                this.field5026[var176] += class201.field2731;
                                this.field4988[var176] += class497.field7031;
                                this.field4981[var176] += class579.field8413;
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
                if (class409.field6094) {
                    int var128 = arg7[6] * class579.field8413 + (arg7[0] * class201.field2731 + (arg7[3] * class497.field7031) + 8192) >> 14;
                    int var129 = arg7[1] * class201.field2731 + (arg7[4] * class497.field7031 - (-(arg7[7] * class579.field8413) - 8192)) >> 14;
                    int var130 = arg7[2] * class201.field2731 + arg7[5] * class497.field7031 + arg7[8] * class579.field8413 + 8192 >> 14;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    class201.field2731 = var131;
                    class497.field7031 = var132;
                    class409.field6094 = false;
                    class579.field8413 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class201.field2731 * var134 + 8192 >> 14;
                int var138 = -class497.field7031 * var135 + 8192 >> 14;
                int var139 = -class579.field8413 * var136 + 8192 >> 14;
                int var140 = var137 + class201.field2731;
                int var141 = class497.field7031 + var138;
                int var142 = class579.field8413 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var140 + var144;
                int var147 = var127 * var136 + 8192 >> 14;
                int var148 = var141 + var145;
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
                int var152 = arg7[2] * var149 + arg7[0] * var146 + (arg7[1] * var148) + 8192 >> 14;
                int var153 = arg7[3] * var146 + arg7[4] * var148 + arg7[5] * var149 + 8192 >> 14;
                int var154 = var123 + var153;
                int var155 = arg7[8] * var149 + arg7[6] * var146 + arg7[7] * var148 + 8192 >> 14;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field4985.length) {
                        int[] var160 = this.field4985[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5007 == null || (this.field5007[var162] & arg6) != 0) {
                                int var163 = this.field4981[var162] * var150[2] + this.field5026[var162] * var150[0] + this.field4988[var162] * var150[1] + 8192 >> 14;
                                int var164 = this.field4988[var162] * var150[4] + this.field5026[var162] * var150[3] + this.field4981[var162] * var150[5] + 8192 >> 14;
                                int var165 = var154 + var164;
                                int var166 = this.field4981[var162] * var150[8] + this.field5026[var162] * var150[6] + this.field4988[var162] * var150[7] + 8192 >> 14;
                                int var167 = var156 + var163;
                                this.field5026[var162] = var167;
                                int var168 = var157 + var166;
                                this.field4988[var162] = var165;
                                this.field4981[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4972 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field4972.length > var181) {
                        int[] var182 = this.field4972[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4982 == null || (arg6 & this.field4982[var184]) != 0) {
                                int var185 = (this.field4984[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field4984[var184] = (byte) var185;
                                if (this.field4975 != null) {
                                    this.field4975.field588 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4938 != null) {
                    for (int var178 = 0; var178 < this.field4949; var178++) {
                        class330 var179 = this.field4938[var178];
                        class563 var180 = this.field4946[var178];
                        var180.field8237 = var180.field8237 & 0xFFFFFF | 255 - (this.field4984[var179.field4803] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4972 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field4972.length) {
                        int[] var191 = this.field4972[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4982 == null || (arg6 & this.field4982[var193]) != 0) {
                                int var194 = this.field5030[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = var195 + arg2 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var197;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5030[var193] = (short) class151.method1076(class151.method1076(var198 << 10, var199 << 7), var200);
                                if (this.field4975 != null) {
                                    this.field4975.field588 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field4938 != null) {
                    for (int var187 = 0; var187 < this.field4949; var187++) {
                        class330 var188 = this.field4938[var187];
                        class563 var189 = this.field4946[var187];
                        var189.field8237 = class391.field5908[this.field5030[var188.field4803] & 0xFFFF] & 0xFFFFFF | var189.field8237 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4956 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field4956.length > var202) {
                        int[] var203 = this.field4956[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class563 var205 = this.field4946[var203[var204]];
                            var205.field8232 += arg2;
                            var205.field8227 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4956 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field4956.length) {
                        int[] var208 = this.field4956[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class563 var210 = this.field4946[var208[var209]];
                            var210.field8228 = var210.field8228 * arg3 >> 7;
                            var210.field8236 = var210.field8236 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4956 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field4956.length) {
                    int[] var213 = this.field4956[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class563 var215 = this.field4946[var213[var214]];
                        var215.field8230 = var215.field8230 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V", line = 1516)
    public static void method2100(boolean arg0) {
        if (!arg0) {
            field4933 = null;
        }
        field4933 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ltda;IZZLtda;I)Lda;", line = 1526)
    private final class395 method2101(class340 arg0, int arg1, boolean arg2, boolean arg3, class340 arg4, int arg5) {
        arg4.field5018 = this.field5018;
        arg4.field5039 = this.field5039;
        if ((arg1 & 0x100) == 0) {
            arg4.field5037 = this.field5037;
        } else {
            arg4.field5037 = true;
        }
        arg4.field4949 = this.field4949;
        arg4.field5010 = 0;
        arg4.field4968 = arg1;
        field4952++;
        arg4.field5009 = this.field5009;
        arg4.field4997 = this.field4997;
        arg4.field5040 = this.field5040;
        arg4.field5023 = this.field5023;
        arg4.field4971 = this.field4971;
        arg4.field5028 = this.field5028;
        boolean var7 = class144.method1000(true, arg1, this.field5018);
        boolean var8 = class442.method2614(true, this.field5018, arg1);
        boolean var9 = class252.method1521(this.field5018, arg1, arg5 - 43);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg4.field5026 = this.field5026;
            } else if (arg0.field5026 == null || this.field5009 > arg0.field5026.length) {
                arg4.field5026 = arg0.field5026 = new int[this.field5009];
            } else {
                arg4.field5026 = arg0.field5026;
            }
            if (!var8) {
                arg4.field4988 = this.field4988;
            } else if (arg0.field4988 == null || this.field5009 > arg0.field4988.length) {
                arg4.field4988 = arg0.field4988 = new int[this.field5009];
            } else {
                arg4.field4988 = arg0.field4988;
            }
            if (!var9) {
                arg4.field4981 = this.field4981;
            } else if (arg0.field4981 == null || arg0.field4981.length < this.field5009) {
                arg4.field4981 = arg0.field4981 = new int[this.field5009];
            } else {
                arg4.field4981 = arg0.field4981;
            }
            for (int var11 = 0; var11 < this.field5009; var11++) {
                if (var7) {
                    arg4.field5026[var11] = this.field5026[var11];
                }
                if (var8) {
                    arg4.field4988[var11] = this.field4988[var11];
                }
                if (var9) {
                    arg4.field4981[var11] = this.field4981[var11];
                }
            }
        } else {
            arg4.field5026 = this.field5026;
            arg4.field4981 = this.field4981;
            arg4.field4988 = this.field4988;
        }
        if (class566.method3263(this.field5018, arg1, 126)) {
            arg4.field5006 = arg0.field5006;
            if (arg3) {
                arg4.field5010 = (byte) (arg4.field5010 | 0x1);
            }
            arg4.field5006.field588 = this.field5006.field588;
            arg4.field5006.field587 = this.field5006.field587;
        } else if (class543.method3190((byte) 114, arg1, this.field5018)) {
            arg4.field5006 = this.field5006;
        } else {
            arg4.field5006 = null;
        }
        if (class174.method1197(arg1, this.field5018, arg5 + 18482)) {
            if (arg0.field5030 == null || arg0.field5030.length < this.field5039) {
                arg4.field5030 = arg0.field5030 = new short[this.field5039];
            } else {
                arg4.field5030 = arg0.field5030;
            }
            for (int var12 = 0; var12 < this.field5039; var12++) {
                arg4.field5030[var12] = this.field5030[var12];
            }
        } else {
            arg4.field5030 = this.field5030;
        }
        if (class97.method606(arg1, arg5 - 243, this.field5018)) {
            if (arg0.field4984 == null || arg0.field4984.length < this.field5039) {
                arg4.field4984 = arg0.field4984 = new byte[this.field5039];
            } else {
                arg4.field4984 = arg0.field4984;
            }
            for (int var13 = 0; var13 < this.field5039; var13++) {
                arg4.field4984[var13] = this.field4984[var13];
            }
        } else {
            arg4.field4984 = this.field4984;
        }
        if (class264.method1587((byte) 95, this.field5018, arg1)) {
            arg4.field4975 = arg0.field4975;
            if (arg3) {
                arg4.field5010 = (byte) (arg4.field5010 | 0x2);
            }
            arg4.field4975.field588 = this.field4975.field588;
            arg4.field4975.field587 = this.field4975.field587;
        } else if (class5.method20(-1, this.field5018, arg1)) {
            arg4.field4975 = this.field4975;
        } else {
            arg4.field4975 = null;
        }
        if (class53.method313(118, this.field5018, arg1)) {
            if (arg0.field5022 == null || this.field5028 > arg0.field5022.length) {
                int var14 = this.field5028;
                arg4.field5022 = arg0.field5022 = new short[var14];
                arg4.field4966 = arg0.field4966 = new short[var14];
                arg4.field4955 = arg0.field4955 = new short[var14];
            } else {
                arg4.field5022 = arg0.field5022;
                arg4.field4966 = arg0.field4966;
                arg4.field4955 = arg0.field4955;
            }
            if (this.field4947 == null) {
                for (int var18 = 0; var18 < this.field5028; var18++) {
                    arg4.field5022[var18] = this.field5022[var18];
                    arg4.field4955[var18] = this.field4955[var18];
                    arg4.field4966[var18] = this.field4966[var18];
                }
            } else {
                if (arg0.field4947 == null) {
                    arg0.field4947 = new class408();
                }
                class408 var15 = arg4.field4947 = arg0.field4947;
                if (var15.field6083 == null || this.field5028 > var15.field6083.length) {
                    int var16 = this.field5028;
                    var15.field6082 = new short[var16];
                    var15.field6087 = new byte[var16];
                    var15.field6083 = new short[var16];
                    var15.field6080 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field5028; var17++) {
                    arg4.field5022[var17] = this.field5022[var17];
                    arg4.field4955[var17] = this.field4955[var17];
                    arg4.field4966[var17] = this.field4966[var17];
                    var15.field6083[var17] = this.field4947.field6083[var17];
                    var15.field6080[var17] = this.field4947.field6080[var17];
                    var15.field6082[var17] = this.field4947.field6082[var17];
                    var15.field6087[var17] = this.field4947.field6087[var17];
                }
            }
            arg4.field5004 = this.field5004;
        } else {
            arg4.field5004 = this.field5004;
            arg4.field4955 = this.field4955;
            arg4.field4966 = this.field4966;
            arg4.field5022 = this.field5022;
            arg4.field4947 = this.field4947;
        }
        if (class206.method1324(arg1, (byte) 70, this.field5018)) {
            if (arg3) {
                arg4.field5010 = (byte) (arg4.field5010 | 0x4);
            }
            arg4.field5011 = arg0.field5011;
            arg4.field5011.field587 = this.field5011.field587;
            arg4.field5011.field588 = this.field5011.field588;
        } else if (class446.method2640(this.field5018, (byte) -123, arg1)) {
            arg4.field5011 = this.field5011;
        } else {
            arg4.field5011 = null;
        }
        if (class115.method856(this.field5018, arg1, (byte) 4)) {
            if (arg0.field5019 == null || arg0.field5019.length < this.field5039) {
                int var19 = this.field5028;
                arg4.field5005 = arg0.field5005 = new float[var19];
                arg4.field5019 = arg0.field5019 = new float[var19];
            } else {
                arg4.field5019 = arg0.field5019;
                arg4.field5005 = arg0.field5005;
            }
            for (int var20 = 0; var20 < this.field5028; var20++) {
                arg4.field5019[var20] = this.field5019[var20];
                arg4.field5005[var20] = this.field5005[var20];
            }
        } else {
            arg4.field5005 = this.field5005;
            arg4.field5019 = this.field5019;
        }
        if (class138.method978(this.field5018, arg5, arg1)) {
            if (arg3) {
                arg4.field5010 = (byte) (arg4.field5010 | 0x8);
            }
            arg4.field5032 = arg0.field5032;
            arg4.field5032.field587 = this.field5032.field587;
            arg4.field5032.field588 = this.field5032.field588;
        } else if (class678.method3811(arg1, arg5 ^ 0xFFFFFF30, this.field5018)) {
            arg4.field5032 = this.field5032;
        } else {
            arg4.field5032 = null;
        }
        if (class338.method2092(arg5 ^ 0xFB, this.field5018, arg1)) {
            if (arg0.field4994 == null || arg0.field4994.length < this.field5039) {
                int var21 = this.field5039;
                arg4.field4999 = arg0.field4999 = new short[var21];
                arg4.field5036 = arg0.field5036 = new short[var21];
                arg4.field4994 = arg0.field4994 = new short[var21];
            } else {
                arg4.field4994 = arg0.field4994;
                arg4.field5036 = arg0.field5036;
                arg4.field4999 = arg0.field4999;
            }
            for (int var22 = 0; var22 < this.field5039; var22++) {
                arg4.field4994[var22] = this.field4994[var22];
                arg4.field5036[var22] = this.field5036[var22];
                arg4.field4999[var22] = this.field4999[var22];
            }
        } else {
            arg4.field4999 = this.field4999;
            arg4.field4994 = this.field4994;
            arg4.field5036 = this.field5036;
        }
        if (class329.method2035(true, this.field5018, arg1)) {
            if (arg3) {
                arg4.field5010 = (byte) (arg4.field5010 | 0x10);
            }
            arg4.field4980 = arg0.field4980;
            arg4.field4980.field6907 = this.field4980.field6907;
        } else if (class675.method3789(arg1, -128, this.field5018)) {
            arg4.field4980 = this.field4980;
        } else {
            arg4.field4980 = null;
        }
        if (class364.method2234(this.field5018, arg1, (byte) 74)) {
            if (arg0.field4937 == null || this.field5039 > arg0.field4937.length) {
                int var23 = this.field5039;
                arg4.field4937 = arg0.field4937 = new short[var23];
            } else {
                arg4.field4937 = arg0.field4937;
            }
            for (int var24 = 0; var24 < this.field5039; var24++) {
                arg4.field4937[var24] = this.field4937[var24];
            }
        } else {
            arg4.field4937 = this.field4937;
        }
        if (!class183.method1223(arg1, this.field5018, -17282)) {
            arg4.field4946 = this.field4946;
        } else if (arg0.field4946 == null || this.field4949 > arg0.field4946.length) {
            int var26 = this.field4949;
            arg4.field4946 = arg0.field4946 = new class563[var26];
            for (int var27 = 0; var27 < this.field4949; var27++) {
                arg4.field4946[var27] = this.field4946[var27].method3253((byte) 122);
            }
        } else {
            arg4.field4946 = arg0.field4946;
            for (int var25 = 0; var25 < this.field4949; var25++) {
                arg4.field4946[var25].method3254(-89, this.field4946[var25]);
            }
        }
        arg4.field4938 = this.field4938;
        arg4.field5002 = this.field5002;
        arg4.field4972 = this.field4972;
        arg4.field4996 = this.field4996;
        arg4.field5031 = this.field5031;
        arg4.field5007 = this.field5007;
        if (this.field5014) {
            arg4.field5003 = this.field5003;
            arg4.field4986 = this.field4986;
            arg4.field5014 = true;
            arg4.field4969 = this.field4969;
            arg4.field4935 = this.field4935;
            arg4.field5033 = this.field5033;
            arg4.field5021 = this.field5021;
            arg4.field5034 = this.field5034;
            arg4.field4958 = this.field4958;
        } else {
            arg4.field5014 = false;
        }
        arg4.field4956 = this.field4956;
        arg4.field4985 = this.field4985;
        arg4.field5020 = this.field5020;
        arg4.field4959 = this.field4959;
        arg4.field4982 = this.field4982;
        return arg4;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lda;IIIZ)V", line = 1993)
    public final void method1055(class395 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5041++;
        class340 var6 = (class340) arg0;
        if (this.field5039 == 0 || var6.field5039 == 0) {
            return;
        }
        int var7 = var6.field4997;
        int[] var8 = var6.field5026;
        int[] var9 = var6.field4988;
        int[] var10 = var6.field4981;
        short[] var11 = var6.field5022;
        short[] var12 = var6.field4955;
        short[] var13 = var6.field4966;
        byte[] var14 = var6.field5004;
        short[] var15;
        short[] var16;
        short[] var17;
        byte[] var18;
        if (this.field4947 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field4947.field6082;
            var16 = this.field4947.field6080;
            var18 = this.field4947.field6087;
            var17 = this.field4947.field6083;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field4947 == null) {
            var20 = null;
            var21 = null;
            var22 = null;
            var19 = null;
        } else {
            var19 = var6.field4947.field6083;
            var20 = var6.field4947.field6082;
            var21 = var6.field4947.field6087;
            var22 = var6.field4947.field6080;
        }
        int[] var23 = var6.field5031;
        short[] var24 = var6.field4959;
        if (!var6.field5014) {
            var6.method2104(0);
        }
        short var25 = var6.field5033;
        short var26 = var6.field4969;
        short var27 = var6.field5003;
        short var28 = var6.field4935;
        short var29 = var6.field5021;
        short var30 = var6.field4986;
        for (int var31 = 0; var31 < this.field4997; var31++) {
            int var32 = this.field4988[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field5026[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field4981[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5031[var31];
                        int var37 = this.field5031[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4959[var38] - 1;
                            if (var35 == -1 || this.field5004[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var17 == null) {
                                            this.field4947 = new class408();
                                            var17 = this.field4947.field6083 = class476.method2736(-104, this.field5022);
                                            var16 = this.field4947.field6080 = class476.method2736(-117, this.field4955);
                                            var15 = this.field4947.field6082 = class476.method2736(-111, this.field4966);
                                            var18 = this.field4947.field6087 = class487.method2783(true, this.field5004);
                                        }
                                        if (var19 == null) {
                                            class408 var44 = var6.field4947 = new class408();
                                            var19 = var44.field6083 = class476.method2736(-50, var11);
                                            var22 = var44.field6080 = class476.method2736(-60, var12);
                                            var20 = var44.field6082 = class476.method2736(-113, var13);
                                            var21 = var44.field6087 = class487.method2783(true, var14);
                                        }
                                        short var45 = this.field5022[var35];
                                        short var46 = this.field4955[var35];
                                        short var47 = this.field4966[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field5004[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var22[var52] += var46;
                                                var20[var52] += var47;
                                                var21[var52] += var49;
                                            }
                                        }
                                        int var53 = this.field5031[var31 + 1];
                                        int var54 = this.field5031[var31];
                                        short var55 = var12[var42];
                                        short var56 = var11[var42];
                                        byte var57 = var14[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var54; var59 < var53; var59++) {
                                            int var60 = this.field4959[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var17[var60] += var56;
                                                var16[var60] += var55;
                                                var15[var60] += var58;
                                                var18[var60] += var57;
                                            }
                                        }
                                        if (this.field5011 == null && this.field4975 != null) {
                                            this.field4975.field588 = null;
                                        }
                                        if (this.field5011 != null) {
                                            this.field5011.field588 = null;
                                        }
                                        if (var6.field5011 == null && var6.field4975 != null) {
                                            var6.field4975.field588 = null;
                                        }
                                        if (var6.field5011 != null) {
                                            var6.field5011.field588 = null;
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

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)V", line = 2265)
    public final void method1047(int arg0, int arg1, int arg2, int arg3) {
        field4953++;
        for (int var5 = 0; var5 < this.field5039; var5++) {
            int var9 = this.field5030[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
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
            this.field5030[var5] = (short) class151.method1076(var12, class151.method1076(var11 << 7, var10 << 10));
        }
        if (this.field4938 != null) {
            for (int var6 = 0; var6 < this.field4949; var6++) {
                class330 var7 = this.field4938[var6];
                class563 var8 = this.field4946[var6];
                var8.field8237 = class391.field5908[this.field5030[var7.field4803] & 0xFFFF] & 0xFFFFFF | var8.field8237 & 0xFF000000;
            }
        }
        if (this.field4975 != null) {
            this.field4975.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "WA", descriptor = "(IIII)V", line = 2325)
    public final void method1034(int arg0, int arg1, int arg2, int arg3) {
        field5015++;
        if (arg0 == 0) {
            class201.field2731 = 0;
            class497.field7031 = 0;
            class579.field8413 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field4997; var6++) {
                class201.field2731 += this.field5026[var6];
                class497.field7031 += this.field4988[var6];
                var5++;
                class579.field8413 += this.field4981[var6];
            }
            if (var5 <= 0) {
                class579.field8413 = arg3;
                class497.field7031 = arg2;
                class201.field2731 = arg1;
            } else {
                class497.field7031 = class497.field7031 / var5 + arg2;
                class201.field2731 = class201.field2731 / var5 + arg1;
                class579.field8413 = class579.field8413 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4997; var7++) {
                this.field5026[var7] += arg1;
                this.field4988[var7] += arg2;
                this.field4981[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4997; var8++) {
                this.field5026[var8] -= class201.field2731;
                this.field4988[var8] -= class497.field7031;
                this.field4981[var8] -= class579.field8413;
                if (arg3 != 0) {
                    int var9 = class271.field3549[arg3];
                    int var10 = class271.field3544[arg3];
                    int var11 = this.field5026[var8] * var10 + this.field4988[var8] * var9 + 16383 >> 14;
                    this.field4988[var8] = this.field4988[var8] * var10 + 16383 - (this.field5026[var8] * var9) >> 14;
                    this.field5026[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class271.field3549[arg1];
                    int var13 = class271.field3544[arg1];
                    int var14 = this.field4988[var8] * var13 + 16383 - (this.field4981[var8] * var12) >> 14;
                    this.field4981[var8] = this.field4988[var8] * var12 + this.field4981[var8] * var13 + 16383 >> 14;
                    this.field4988[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class271.field3549[arg2];
                    int var16 = class271.field3544[arg2];
                    int var17 = this.field5026[var8] * var16 + this.field4981[var8] * var15 + 16383 >> 14;
                    this.field4981[var8] = this.field4981[var8] * var16 + 16383 - (this.field5026[var8] * var15) >> 14;
                    this.field5026[var8] = var17;
                }
                this.field5026[var8] += class201.field2731;
                this.field4988[var8] += class497.field7031;
                this.field4981[var8] += class579.field8413;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4997; var18++) {
                this.field5026[var18] -= class201.field2731;
                this.field4988[var18] -= class497.field7031;
                this.field4981[var18] -= class579.field8413;
                this.field5026[var18] = this.field5026[var18] * arg1 / 128;
                this.field4988[var18] = this.field4988[var18] * arg2 / 128;
                this.field4981[var18] = this.field4981[var18] * arg3 / 128;
                this.field5026[var18] += class201.field2731;
                this.field4988[var18] += class497.field7031;
                this.field4981[var18] += class579.field8413;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5039; var19++) {
                int var23 = (this.field4984[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4984[var19] = (byte) var23;
            }
            if (this.field4975 != null) {
                this.field4975.field588 = null;
            }
            if (this.field4938 != null) {
                for (int var20 = 0; var20 < this.field4949; var20++) {
                    class330 var21 = this.field4938[var20];
                    class563 var22 = this.field4946[var20];
                    var22.field8237 = 255 - (this.field4984[var21.field4803] & 0xFF) << 24 | var22.field8237 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5039; var24++) {
                int var28 = this.field5030[var24] & 0xFFFF;
                int var29 = (var28 & 0xFEB6) >> 10;
                int var30 = var28 >> 7 & 0x7;
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
                this.field5030[var24] = (short) class151.method1076(class151.method1076(var33 << 10, var32 << 7), var34);
            }
            if (this.field4975 != null) {
                this.field4975.field588 = null;
            }
            if (this.field4938 != null) {
                for (int var25 = 0; var25 < this.field4949; var25++) {
                    class330 var26 = this.field4938[var25];
                    class563 var27 = this.field4946[var25];
                    var27.field8237 = var27.field8237 & 0xFF000000 | class391.field5908[this.field5030[var26.field4803] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4949; var35++) {
                class563 var36 = this.field4946[var35];
                var36.field8227 += arg2;
                var36.field8232 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4949; var37++) {
                class563 var38 = this.field4946[var37];
                var38.field8236 = var38.field8236 * arg1 >> 7;
                var38.field8228 = var38.field8228 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4949; var39++) {
                class563 var40 = this.field4946[var39];
                var40.field8230 = var40.field8230 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lq;Lqh;II)V", line = 2633)
    public final void method1030(class151 arg0, class67 arg1, int arg2, int arg3) {
        field4979++;
        if (this.field5028 == 0) {
            return;
        }
        class196 var5 = this.field4961.field4052;
        if (!this.field5014) {
            this.method2104(0);
        }
        class196 var6 = (class196) arg0;
        class550.field8103 = var5.field2671 * var6.field2679 + var5.field2668 * var6.field2661 + var5.field2649 * var6.field2642 + var5.field2679;
        class652.field9334 = var5.field2671 * var6.field2668 + var5.field2668 * var6.field2672 + var5.field2649 * var6.field2655;
        float var7 = (float) this.field5033 * class652.field9334 + class550.field8103;
        float var8 = (float) this.field4969 * class652.field9334 + class550.field8103;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = (float) this.field4958 + var7;
            var10 = (float) (-this.field4958) + var8;
        } else {
            var9 = (float) this.field4958 + var8;
            var10 = (float) (-this.field4958) + var7;
        }
        if ((var10 >= this.field4961.field4103) || ((float) this.field4961.field4080 >= var9)) {
            return;
        }
        class70.field1082 = var5.field2664 * var6.field2668 + var5.field2655 * var6.field2672 + var5.field2644 * var6.field2655;
        class250.field3285 = var5.field2664 * var6.field2679 + var5.field2655 * var6.field2661 + var5.field2644 * var6.field2642 + var5.field2642;
        float var11 = (float) this.field5033 * class70.field1082 + class250.field3285;
        float var12 = (float) this.field4969 * class70.field1082 + class250.field3285;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = (var12 - (float) this.field4958) * (float) this.field4961.field4161;
            var14 = ((float) this.field4958 + var11) * (float) this.field4961.field4161;
        } else {
            var14 = ((float) this.field4958 + var12) * (float) this.field4961.field4161;
            var13 = (var11 - (float) this.field4958) * (float) this.field4961.field4161;
        }
        if ((var13 / (float) arg2 >= this.field4961.field4085) || (this.field4961.field4092 >= var14 / (float) arg2)) {
            return;
        }
        class85.field1332 = var5.field2674 * var6.field2679 + var5.field2672 * var6.field2661 + var5.field2654 * var6.field2642 + var5.field2661;
        class298.field4391 = var5.field2674 * var6.field2668 + var5.field2672 * var6.field2672 + var5.field2654 * var6.field2655;
        float var15 = (float) this.field5033 * class298.field4391 + class85.field1332;
        float var16 = (float) this.field4969 * class298.field4391 + class85.field1332;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) (-this.field4958) + var16) * (float) this.field4961.field4059;
            var18 = ((float) this.field4958 + var15) * (float) this.field4961.field4059;
        } else {
            var17 = (var15 - (float) this.field4958) * (float) this.field4961.field4059;
            var18 = ((float) this.field4958 + var16) * (float) this.field4961.field4059;
        }
        if ((this.field4961.field4158 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field4961.field4146)) {
            return;
        }
        if (arg1 != null || this.field4938 != null) {
            class624.field9022 = var5.field2674 * var6.field2671 + var5.field2672 * var6.field2674 + var5.field2654 * var6.field2664;
            class94.field1455 = var5.field2664 * var6.field2671 + var5.field2655 * var6.field2674 + var5.field2644 * var6.field2664;
            class433.field6284 = var5.field2671 * var6.field2649 + var5.field2668 * var6.field2654 + var5.field2649 * var6.field2644;
            class517.field7267 = var5.field2674 * var6.field2649 + var5.field2672 * var6.field2654 + var5.field2654 * var6.field2644;
            class697.field9815 = var5.field2671 * var6.field2671 + var5.field2668 * var6.field2674 + var5.field2649 * var6.field2664;
            class27.field476 = var5.field2664 * var6.field2649 + var5.field2655 * var6.field2654 + var5.field2644 * var6.field2644;
        }
        if (arg1 != null) {
            int var19 = this.field5003 + this.field4935 >> 1;
            int var20 = this.field5021 + this.field4986 >> 1;
            int var21 = (int) ((float) var20 * class94.field1455 + (float) this.field5033 * class70.field1082 + (float) var19 * class27.field476 + class250.field3285);
            int var22 = (int) ((float) var20 * class624.field9022 + (float) this.field5033 * class298.field4391 + (float) var19 * class517.field7267 + class85.field1332);
            int var23 = (int) ((float) var20 * class697.field9815 + (float) this.field5033 * class652.field9334 + (float) var19 * class433.field6284 + class550.field8103);
            int var24 = (int) ((float) var20 * class94.field1455 + (float) this.field4969 * class70.field1082 + (float) var19 * class27.field476 + class250.field3285);
            int var25 = (int) ((float) var20 * class624.field9022 + (float) this.field4969 * class298.field4391 + (float) var19 * class517.field7267 + class85.field1332);
            arg1.field1059 = this.field4961.field4161 * var21 / arg2 + this.field4961.field4154;
            arg1.field1056 = this.field4961.field4161 * var24 / arg2 + this.field4961.field4154;
            arg1.field1058 = this.field4961.field4059 * var25 / arg2 + this.field4961.field4129;
            arg1.field1055 = this.field4961.field4129 + (this.field4961.field4059 * var22 / arg2);
            int var26 = (int) ((float) var20 * class697.field9815 + (float) this.field4969 * class652.field9334 + (float) var19 * class433.field6284 + class550.field8103);
            if (var23 >= this.field4961.field4080 || this.field4961.field4080 <= var26) {
                arg1.field1060 = (this.field4958 + var21) * this.field4961.field4161 / arg2 + this.field4961.field4154 - arg1.field1059;
                arg1.field1057 = true;
            }
        }
        this.field4961.method1691((float) arg2, true);
        this.field4961.method1712(false);
        this.field4961.method1767(var6, (byte) 18);
        this.method2099((byte) 100);
        this.field4961.method1696(-66);
        this.method2098(7);
    }

    @OriginalMember(owner = "client!tda", name = "LA", descriptor = "()Z", line = 2778)
    public final boolean method1024() {
        field5049++;
        return this.field5037;
    }

    @OriginalMember(owner = "client!tda", name = "oa", descriptor = "(III)V", line = 2790)
    public final void method1019(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4997; var4++) {
            if (arg0 != 0) {
                this.field5026[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4988[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4981[var4] += arg2;
            }
        }
        field5035++;
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!tda", name = "DA", descriptor = "(SS)V", line = 2824)
    public final void method1045(short arg0, short arg1) {
        field4940++;
        class615 var3 = this.field4961.field1491;
        for (int var4 = 0; var4 < this.field5039; var4++) {
            if (this.field4937[var4] == arg0) {
                this.field4937[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class457 var7 = var3.method955(-1330, arg0 & 0xFFFF);
            var6 = var7.field6611;
            var5 = var7.field6603;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class457 var10 = var3.method955(-1330, arg1 & 0xFFFF);
            var9 = var10.field6611;
            var8 = var10.field6603;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field4938 != null) {
            for (int var11 = 0; var11 < this.field4949; var11++) {
                class330 var12 = this.field4938[var11];
                class563 var13 = this.field4946[var11];
                var13.field8237 = class391.field5908[this.field5030[var12.field4803] & 0xFFFF] & 0xFFFFFF | var13.field8237 & 0xFF000000;
            }
        }
        if (this.field4975 != null) {
            this.field4975.field588 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)V", line = 2898)
    private final void method2102(int arg0, boolean arg1) {
        field4936++;
        if (this.field4961.field4073.field7952.length >= (this.field5023 * 6)) {
            this.field4961.field4073.field7956 = 0;
        } else {
            this.field4961.field4073 = new class449((this.field5023 + 100) * 6);
        }
        if (arg0 <= 13) {
            this.field4988 = null;
        }
        class449 var3 = this.field4961.field4073;
        if (this.field4961.field4060) {
            for (int var5 = 0; var5 < this.field5023; var5++) {
                var3.method3162(-2003712696, this.field4994[var5]);
                var3.method3162(-2003712696, this.field5036[var5]);
                var3.method3162(-2003712696, this.field4999[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field5023; var4++) {
                var3.method3120(this.field4994[var4], -23026);
                var3.method3120(this.field5036[var4], -23026);
                var3.method3120(this.field4999[var4], -23026);
            }
        }
        if (var3.field7956 == 0) {
            return;
        }
        if (arg1) {
            if (this.field4973 == null) {
                this.field4973 = this.field4961.method1719(var3.field7956, true, var3.field7952, 5123, 0);
            } else {
                this.field4973.method1791(var3.field7956, var3.field7952, 5123, -14);
            }
            this.field4980.field6907 = this.field4973;
        } else {
            this.field4980.field6907 = this.field4961.method1719(var3.field7956, false, var3.field7952, 5123, 0);
        }
        if (!arg1) {
            this.field4932 = true;
        }
    }

    @OriginalMember(owner = "client!tda", name = "H", descriptor = "()I", line = 2967)
    public final int method1011() {
        field4987++;
        if (!this.field5014) {
            this.method2104(0);
        }
        return this.field4969;
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Luca;)V", line = 5738)
    public class340(class287 arg0) {
        this.field4961 = arg0;
        this.field5006 = new class39(null, 5126, 3, 0);
        this.field5032 = new class39(null, 5126, 2, 0);
        this.field5011 = new class39(null, 5126, 3, 0);
        this.field4975 = new class39(null, 5121, 4, 0);
        this.field4980 = new class485();
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Luca;Lak;IIII)V", line = 5750)
    public class340(class287 arg0, class677 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4968 = arg2;
        this.field4961 = arg0;
        this.field5018 = arg5;
        if (class543.method3190((byte) 93, arg2, arg5)) {
            this.field5006 = new class39(null, 5126, 3, 0);
        }
        if (class678.method3811(arg2, -122, arg5)) {
            this.field5032 = new class39(null, 5126, 2, 0);
        }
        if (class446.method2640(arg5, (byte) 90, arg2)) {
            this.field5011 = new class39(null, 5126, 3, 0);
        }
        if (class5.method20(-1, arg5, arg2)) {
            this.field4975 = new class39(null, 5121, 4, 0);
        }
        if (class675.method3789(arg2, -79, arg5)) {
            this.field4980 = new class485();
        }
        class615 var7 = arg0.field1491;
        int[] var8 = new int[arg1.field9548];
        this.field5031 = new int[arg1.field9578 + 1];
        for (int var9 = 0; var9 < arg1.field9548; var9++) {
            if ((arg1.field9562 == null || arg1.field9562[var9] != 2) && (arg1.field9566 == null || arg1.field9566[var9] == -1 || !var7.method955(-1330, arg1.field9566[var9] & 0xFFFF).field6590)) {
                var8[this.field5039++] = var9;
                this.field5031[arg1.field9583[var9]]++;
                this.field5031[arg1.field9549[var9]]++;
                this.field5031[arg1.field9538[var9]]++;
            }
        }
        this.field5023 = this.field5039;
        long[] var10 = new long[this.field5039];
        boolean var11 = (this.field4968 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5039; var12++) {
            int var180 = var8[var12];
            class457 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field9553 != null) {
                boolean var186 = false;
                for (int var187 = 0; var187 < arg1.field9553.length; var187++) {
                    class484 var188 = arg1.field9553[var187];
                    if (var188.field6900 == var180) {
                        class512 var189 = class342.method2119(var188.field6903, (byte) 47);
                        if (var189.field7218) {
                            var186 = true;
                        }
                        if (var189.field7211 != -1) {
                            class457 var190 = var7.method955(-1330, var189.field7211);
                            if (var190.field6594) {
                                this.field5037 = true;
                            }
                        }
                    }
                }
                if (var186) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5023--;
                    continue;
                }
            }
            short var191 = -1;
            if (arg1.field9566 != null) {
                var191 = arg1.field9566[var180];
                if (var191 != -1) {
                    var181 = var7.method955(-1330, var191 & 0xFFFF);
                    var184 = var181.field6600;
                    var185 = var181.field6599;
                }
            }
            boolean var192 = arg1.field9582 != null && arg1.field9582[var180] != 0 || var181 != null && var181.field6594 | !var181.field6602;
            if ((var11 || var192) && arg1.field9585 != null) {
                var182 += arg1.field9585[var180] << 17;
            }
            if (var192) {
                var182 += 65536;
            }
            int var193 = ((var184 & 0xFF) << 8) + var182;
            int var194 = ((var191 & 0xFFFF) << 16) + var183;
            int var195 = (var185 & 0xFF) + var193;
            int var196 = (var12 & 0xFFFF) + var194;
            var10[var12] = ((long) var195 << 32) + (long) var196;
            this.field5037 |= var192;
        }
        class700.method3929(var8, var10, 8845);
        this.field4988 = arg1.field9547;
        this.field4997 = arg1.field9578;
        this.field5009 = arg1.field9581;
        this.field5007 = arg1.field9574;
        this.field5026 = arg1.field9554;
        this.field4981 = arg1.field9558;
        this.field5002 = arg1.field9576;
        this.field4996 = arg1.field9552;
        class178[] var13 = new class178[this.field4997];
        if (arg1.field9553 != null) {
            this.field4949 = arg1.field9553.length;
            this.field4938 = new class330[this.field4949];
            this.field4946 = new class563[this.field4949];
            for (int var14 = 0; var14 < this.field4949; var14++) {
                class484 var15 = arg1.field9553[var14];
                class512 var16 = class342.method2119(var15.field6903, (byte) 110);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5039; var18++) {
                    if (var8[var18] == var15.field6900) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class391.field5908[arg1.field9564[var15.field6900] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9582 == null ? 0 : arg1.field9582[var15.field6900]) << 24;
                this.field4938[var14] = new class330(var17, arg1.field9583[var15.field6900], arg1.field9549[var15.field6900], arg1.field9538[var15.field6900], var16.field7215, var16.field7208, var16.field7211, var16.field7216, var16.field7219, var16.field7218, var16.field7220, var15.field6904);
                this.field4946[var14] = new class563(var20);
            }
        }
        int var21 = this.field5039 * 3;
        this.field4966 = new short[var21];
        this.field4994 = new short[this.field5039];
        this.field5022 = new short[var21];
        this.field4959 = new short[var21];
        if (arg1.field9567 != null) {
            this.field4982 = new short[this.field5039];
        }
        this.field5005 = new float[var21];
        this.field4984 = new byte[this.field5039];
        this.field4971 = (short) arg3;
        this.field5036 = new short[this.field5039];
        this.field5030 = new short[this.field5039];
        this.field5019 = new float[var21];
        this.field4937 = new short[this.field5039];
        this.field5004 = new byte[var21];
        this.field5040 = (short) arg4;
        this.field4999 = new short[this.field5039];
        this.field4955 = new short[var21];
        class690.field9736 = new long[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field9578; var23++) {
            int var179 = this.field5031[var23];
            this.field5031[var23] = var22;
            var22 += var179;
            var13[var23] = new class178();
        }
        this.field5031[arg1.field9578] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field9543 != null) {
            int var28 = arg1.field9551;
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
            for (int var36 = 0; var36 < this.field5039; var36++) {
                int var43 = var8[var36];
                if (arg1.field9543[var43] != -1) {
                    int var44 = arg1.field9543[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field9583[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field9549[var43];
                        } else {
                            var46 = arg1.field9538[var43];
                        }
                        int var47 = arg1.field9554[var46];
                        int var48 = arg1.field9547[var46];
                        int var49 = arg1.field9558[var46];
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
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field9555[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field9590[var37];
                        var40 = 64.0F / (float) arg1.field9573[var37];
                        if (var39 == 0) {
                            var42 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        } else {
                            var42 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field9568[var37];
                        var40 = 64.0F / (float) arg1.field9573[var37];
                        var42 = 64.0F / (float) arg1.field9590[var37];
                    } else {
                        var40 = (float) arg1.field9573[var37] / 1024.0F;
                        var41 = (float) arg1.field9568[var37] / 1024.0F;
                        var42 = (float) arg1.field9590[var37] / 1024.0F;
                    }
                    var27[var37] = client.method572(var40, arg1.field9571[var37], arg1.field9588[var37], class425.method2563(arg1.field9550[var37], 255), 1, arg1.field9540[var37], var42, var41);
                }
            }
        }
        class235[] var50 = new class235[arg1.field9548];
        for (int var51 = 0; var51 < arg1.field9548; var51++) {
            short var158 = arg1.field9583[var51];
            short var159 = arg1.field9549[var51];
            short var160 = arg1.field9538[var51];
            int var161 = this.field5026[var159] - this.field5026[var158];
            int var162 = this.field4988[var159] - this.field4988[var158];
            int var163 = this.field4981[var159] - this.field4981[var158];
            int var164 = this.field5026[var160] - this.field5026[var158];
            int var165 = this.field4988[var160] - this.field4988[var158];
            int var166 = this.field4981[var160] - this.field4981[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - var161 * var166;
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var168 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var168 * var168 + var167 * var167 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field9562 == null ? 0 : arg1.field9562[var51];
            if (var174 == 0) {
                class178 var176 = var13[var158];
                var176.field2479 += var173;
                var176.field2484 += var172;
                var176.field2483++;
                var176.field2482 += var171;
                class178 var177 = var13[var159];
                var177.field2482 += var171;
                var177.field2479 += var173;
                var177.field2484 += var172;
                var177.field2483++;
                class178 var178 = var13[var160];
                var178.field2483++;
                var178.field2484 += var172;
                var178.field2482 += var171;
                var178.field2479 += var173;
            } else if (var174 == 1) {
                class235 var175 = var50[var51] = new class235();
                var175.field3092 = var172;
                var175.field3090 = var173;
                var175.field3091 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field5039; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field9564[var68] & 0xFFFF;
            short var70;
            if (arg1.field9566 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field9566[var68];
            }
            int var71;
            if (arg1.field9543 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field9543[var68];
            }
            int var72;
            if (arg1.field9582 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field9582[var68] & 0xFF;
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
                    var78 = 0.0F;
                    var80 = 2;
                    var79 = 1;
                    var75 = 1.0F;
                    var77 = 0.0F;
                    var74 = 1.0F;
                    var76 = 1.0F;
                    var73 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field9555[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field9583[var68];
                        short var112 = arg1.field9549[var68];
                        short var113 = arg1.field9538[var68];
                        short var114 = arg1.field9540[var71];
                        short var115 = arg1.field9571[var71];
                        short var116 = arg1.field9588[var71];
                        float var117 = (float) arg1.field9554[var114];
                        float var118 = (float) arg1.field9547[var114];
                        float var119 = (float) arg1.field9558[var114];
                        float var120 = (float) arg1.field9554[var115] - var117;
                        float var121 = (float) arg1.field9547[var115] - var118;
                        float var122 = (float) arg1.field9558[var115] - var119;
                        float var123 = (float) arg1.field9554[var116] - var117;
                        float var124 = (float) arg1.field9547[var116] - var118;
                        float var125 = (float) arg1.field9558[var116] - var119;
                        float var126 = (float) arg1.field9554[var111] - var117;
                        float var127 = (float) arg1.field9547[var111] - var118;
                        float var128 = (float) arg1.field9558[var111] - var119;
                        float var129 = (float) arg1.field9554[var112] - var117;
                        float var130 = (float) arg1.field9547[var112] - var118;
                        float var131 = (float) arg1.field9558[var112] - var119;
                        float var132 = (float) arg1.field9554[var113] - var117;
                        float var133 = (float) arg1.field9547[var113] - var118;
                        float var134 = (float) arg1.field9558[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - var120 * var125;
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        float var142 = var122 * var135 - (var120 * var137);
                        float var143 = var121 * var137 - (var122 * var136);
                        float var144 = var120 * var136 - var121 * var135;
                        float var145 = 1.0F / (var125 * var144 + var123 * var143 + var124 * var142);
                        var74 = (var128 * var144 + var126 * var143 + var127 * var142) * var145;
                        var78 = (var134 * var144 + var132 * var143 + var133 * var142) * var145;
                        var76 = (var131 * var144 + var129 * var143 + var130 * var142) * var145;
                    } else {
                        short var83 = arg1.field9583[var68];
                        short var84 = arg1.field9549[var68];
                        short var85 = arg1.field9538[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field9536[var71];
                        float var91 = (float) arg1.field9575[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field9568[var71] / 1024.0F;
                            class373.method2300(var87, var91, var88, var89, true, arg1.field9558[var83], var86, arg1.field9554[var83], var92, var90, arg1.field9547[var83]);
                            var74 = class109.field1623;
                            var73 = class623.field9015;
                            class373.method2300(var87, var91, var88, var89, true, arg1.field9558[var84], var86, arg1.field9554[var84], var92, var90, arg1.field9547[var84]);
                            var75 = class623.field9015;
                            var76 = class109.field1623;
                            class373.method2300(var87, var91, var88, var89, true, arg1.field9558[var85], var86, arg1.field9554[var85], var92, var90, arg1.field9547[var85]);
                            var77 = class623.field9015;
                            var78 = class109.field1623;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var93 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var73 - var77 > var93) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                                if (var93 < var75 - var73) {
                                    var75 -= var92;
                                    var79 = 1;
                                } else if (var73 - var75 > var93) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                            } else {
                                if ((var93 < var76 - var74)) {
                                    var76 -= var92;
                                    var79 = 1;
                                } else if (var93 < var74 - var76) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if (var93 < var78 - var74) {
                                    var80 = 1;
                                    var78 -= var92;
                                } else if (var74 - var78 > var93) {
                                    var78 += var92;
                                    var80 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field9539[var71] / 256.0F;
                            float var95 = (float) arg1.field9559[var71] / 256.0F;
                            int var96 = arg1.field9554[var84] - arg1.field9554[var83];
                            int var97 = arg1.field9547[var84] - arg1.field9547[var83];
                            int var98 = arg1.field9558[var84] - arg1.field9558[var83];
                            int var99 = arg1.field9554[var85] - arg1.field9554[var83];
                            int var100 = arg1.field9547[var85] - arg1.field9547[var83];
                            int var101 = arg1.field9558[var85] - arg1.field9558[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - var96 * var101;
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field9590[var71];
                            float var106 = 64.0F / (float) arg1.field9573[var71];
                            float var107 = 64.0F / (float) arg1.field9568[var71];
                            float var108 = (var89[2] * (float) var104 + var89[0] * (float) var102 + var89[1] * (float) var103) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[7] * (float) var103 + var89[6] * (float) var102) / var107;
                            var81 = class588.method3355(var108, 117, var110, var109);
                            class582.method3341(var95, var94, var91, var81, var90, var87, var86, var88, (byte) -62, arg1.field9554[var83], arg1.field9547[var83], var89, arg1.field9558[var83]);
                            var74 = class334.field4850;
                            var73 = class258.field3350;
                            class582.method3341(var95, var94, var91, var81, var90, var87, var86, var88, (byte) -25, arg1.field9554[var84], arg1.field9547[var84], var89, arg1.field9558[var84]);
                            var76 = class334.field4850;
                            var75 = class258.field3350;
                            class582.method3341(var95, var94, var91, var81, var90, var87, var86, var88, (byte) -108, arg1.field9554[var85], arg1.field9547[var85], var89, arg1.field9558[var85]);
                            var78 = class334.field4850;
                            var77 = class258.field3350;
                        } else if (var82 == 3) {
                            class257.method1536(arg1.field9554[var83], var91, var89, (byte) 114, var86, var90, arg1.field9547[var83], arg1.field9558[var83], var87, var88);
                            var73 = class321.field4672;
                            var74 = class283.field3783;
                            class257.method1536(arg1.field9554[var84], var91, var89, (byte) 125, var86, var90, arg1.field9547[var84], arg1.field9558[var84], var87, var88);
                            var75 = class321.field4672;
                            var76 = class283.field3783;
                            class257.method1536(arg1.field9554[var85], var91, var89, (byte) 109, var86, var90, arg1.field9547[var85], arg1.field9558[var85], var87, var88);
                            var78 = class283.field3783;
                            var77 = class321.field4672;
                            if ((var90 & 0x1) == 0) {
                                if (var77 - var73 > 0.5F) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field9562 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field9562[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var149 = arg1.field9583[var68];
                short var150 = arg1.field9549[var68];
                short var151 = arg1.field9538[var68];
                class178 var152 = var13[var149];
                this.field4994[var52] = this.method2105(-1, var74, var147, arg1, var73, var152.field2483, var152.field2479, var152.field2482, var149, var152.field2484);
                class178 var153 = var13[var150];
                this.field5036[var52] = this.method2105(-1, var76, (long) var79 + var147, arg1, var75, var153.field2483, var153.field2479, var153.field2482, var150, var153.field2484);
                class178 var154 = var13[var151];
                this.field4999[var52] = this.method2105(-1, var78, (long) var80 + var147, arg1, var77, var154.field2483, var154.field2479, var154.field2482, var151, var154.field2484);
            } else if (var146 == 1) {
                class235 var155 = var50[var68];
                long var156 = (long) ((var155.field3092 + 256 << 22) + (var155.field3090 + 256 << 12) + (var155.field3091 > 0 ? 1024 : 2048) + (var71 << 2)) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                this.field4994[var52] = this.method2105(-1, var74, var156, arg1, var73, 0, var155.field3090, var155.field3091, arg1.field9583[var68], var155.field3092);
                this.field5036[var52] = this.method2105(-1, var76, (long) var79 + var156, arg1, var75, 0, var155.field3090, var155.field3091, arg1.field9549[var68], var155.field3092);
                this.field4999[var52] = this.method2105(-1, var78, (long) var80 + var156, arg1, var77, 0, var155.field3090, var155.field3091, arg1.field9538[var68], var155.field3092);
            }
            if (arg1.field9566 == null) {
                this.field4937[var52] = -1;
            } else {
                this.field4937[var52] = arg1.field9566[var68];
            }
            if (arg1.field9582 != null) {
                this.field4984[var52] = arg1.field9582[var68];
            }
            if (arg1.field9567 != null) {
                this.field4982[var52] = arg1.field9567[var68];
            }
            this.field5030[var52] = arg1.field9564[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5023; var55++) {
            short var67 = this.field4937[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field5020 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field5023; var58++) {
            short var66 = this.field4937[var58];
            if (var56 != var66) {
                this.field5020[var57++] = var58;
                var56 = var66;
            }
        }
        this.field5020[var57] = this.field5023;
        class690.field9736 = null;
        this.field5022 = class697.method3916(this.field5028, this.field5022, (byte) 93);
        this.field4955 = class697.method3916(this.field5028, this.field4955, (byte) 85);
        this.field4966 = class697.method3916(this.field5028, this.field4966, (byte) -116);
        this.field5004 = class25.method169((byte) 120, this.field5028, this.field5004);
        this.field5019 = class54.method324(this.field5019, -59, this.field5028);
        this.field5005 = class54.method324(this.field5005, -128, this.field5028);
        if (arg1.field9557 != null && class270.method1618(32, arg2, this.field5018)) {
            this.field4985 = arg1.method3805((byte) 31, false);
        }
        if (arg1.field9553 != null && class612.method3483(false, arg2, this.field5018)) {
            this.field4956 = arg1.method3798(256);
        }
        if (arg1.field9561 != null && class397.method2466(arg2, this.field5018, 125)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5039; var61++) {
                int var65 = arg1.field9561[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field4972 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field4972[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5039; var63++) {
                int var64 = arg1.field9561[var8[var63]];
                if (var64 >= 0) {
                    this.field4972[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "()Z", line = 2984)
    public final boolean method1023() {
        field5016++;
        if (this.field4985 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5009; var1++) {
            this.field5026[var1] <<= 0x4;
            this.field4988[var1] <<= 0x4;
            this.field4981[var1] <<= 0x4;
        }
        class579.field8413 = 0;
        class497.field7031 = 0;
        class201.field2731 = 0;
        return true;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(BLuu;)V", line = 3012)
    private final void method2103(byte arg0, class495 arg1) {
        field5050++;
        if (this.field5028 > this.field4961.field4169.length) {
            this.field4961.field4169 = new int[this.field5028];
            this.field4961.field4170 = new int[this.field5028];
        }
        int[] var3 = this.field4961.field4169;
        int[] var4 = this.field4961.field4170;
        for (int var5 = 0; var5 < this.field4997; var5++) {
            int var17 = (this.field5026[var5] - (this.field4988[var5] * this.field4961.field4143 >> 8) >> this.field4961.field4019) - arg1.field7013;
            int var18 = (this.field4981[var5] - (this.field4988[var5] * this.field4961.field4112 >> 8) >> this.field4961.field4019) - arg1.field7009;
            int var19 = this.field5031[var5];
            int var20 = this.field5031[var5 + 1];
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field4959[var21] - 1;
                if (var22 == -1) {
                    break;
                }
                var3[var22] = var17;
                var4[var22] = var18;
            }
        }
        int var6 = 16 / ((arg0 + 18) / 58);
        for (int var7 = 0; var7 < this.field5023; var7++) {
            if (this.field4984 == null || this.field4984[var7] <= 128) {
                short var8 = this.field4994[var7];
                short var9 = this.field5036[var7];
                short var10 = this.field4999[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var3[var10];
                int var14 = var4[var8];
                int var15 = var4[var9];
                int var16 = var4[var10];
                if ((var15 - var16) * (var11 - var12) - ((var13 - var12) * (var15 - var14)) > 0) {
                    arg1.method2830(false, var12, var14, var15, var16, var11, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "fa", descriptor = "(I)V", line = 3098)
    public final void method1037(int arg0) {
        field5027++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field4997; var4++) {
            int var7 = this.field5026[var4] * var3 + this.field4981[var4] * var2 >> 14;
            this.field4981[var4] = this.field4981[var4] * var3 - this.field5026[var4] * var2 >> 14;
            this.field5026[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5028; var5++) {
            int var6 = this.field5022[var5] * var3 + this.field4966[var5] * var2 >> 14;
            this.field4966[var5] = (short) (this.field4966[var5] * var3 - (this.field5022[var5] * var2) >> 14);
            this.field5022[var5] = (short) var6;
        }
        if (this.field5011 == null && this.field4975 != null) {
            this.field4975.field588 = null;
        }
        if (this.field5011 != null) {
            this.field5011.field588 = null;
        }
        this.field5014 = false;
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I[IIIIIZ)V", line = 3157)
    public final void method1046(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5024++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            class579.field8413 = 0;
            class201.field2731 = 0;
            class497.field7031 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field4985.length) {
                    int[] var15 = this.field4985[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class201.field2731 += this.field5026[var17];
                        class497.field7031 += this.field4988[var17];
                        class579.field8413 += this.field4981[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class497.field7031 = var10;
                class201.field2731 = var11;
                class579.field8413 = var9;
            } else {
                class201.field2731 = class201.field2731 / var12 + var11;
                class579.field8413 = class579.field8413 / var12 + var9;
                class497.field7031 = class497.field7031 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field4985.length) {
                    int[] var23 = this.field4985[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5026[var25] += var20;
                        this.field4988[var25] += var18;
                        this.field4981[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4985.length > var45) {
                    int[] var46 = this.field4985[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5026[var48] -= class201.field2731;
                            this.field4988[var48] -= class497.field7031;
                            this.field4981[var48] -= class579.field8413;
                            if (arg4 != 0) {
                                int var49 = class271.field3549[arg4];
                                int var50 = class271.field3544[arg4];
                                int var51 = this.field5026[var48] * var50 + (this.field4988[var48] * var49 + 16383) >> 14;
                                this.field4988[var48] = this.field4988[var48] * var50 + 16383 - (this.field5026[var48] * var49) >> 14;
                                this.field5026[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class271.field3549[arg2];
                                int var53 = class271.field3544[arg2];
                                int var54 = this.field4988[var48] * var53 + 16383 - (this.field4981[var48] * var52) >> 14;
                                this.field4981[var48] = this.field4988[var48] * var52 + this.field4981[var48] * var53 + 16383 >> 14;
                                this.field4988[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class271.field3549[arg3];
                                int var56 = class271.field3544[arg3];
                                int var57 = this.field4981[var48] * var55 + (this.field5026[var48] * var56) + 16383 >> 14;
                                this.field4981[var48] = this.field4981[var48] * var56 + 16383 - (this.field5026[var48] * var55) >> 14;
                                this.field5026[var48] = var57;
                            }
                            this.field5026[var48] += class201.field2731;
                            this.field4988[var48] += class497.field7031;
                            this.field4981[var48] += class579.field8413;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5026[var59] -= class201.field2731;
                            this.field4988[var59] -= class497.field7031;
                            this.field4981[var59] -= class579.field8413;
                            if (arg2 != 0) {
                                int var60 = class271.field3549[arg2];
                                int var61 = class271.field3544[arg2];
                                int var62 = this.field4988[var59] * var61 + (16383 - (this.field4981[var59] * var60)) >> 14;
                                this.field4981[var59] = this.field4988[var59] * var60 + (this.field4981[var59] * var61) + 16383 >> 14;
                                this.field4988[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class271.field3549[arg4];
                                int var64 = class271.field3544[arg4];
                                int var65 = this.field5026[var59] * var64 + this.field4988[var59] * var63 + 16383 >> 14;
                                this.field4988[var59] = this.field4988[var59] * var64 + 16383 - (this.field5026[var59] * var63) >> 14;
                                this.field5026[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class271.field3549[arg3];
                                int var67 = class271.field3544[arg3];
                                int var68 = this.field4981[var59] * var66 + this.field5026[var59] * var67 + 16383 >> 14;
                                this.field4981[var59] = this.field4981[var59] * var67 + 16383 - (this.field5026[var59] * var66) >> 14;
                                this.field5026[var59] = var68;
                            }
                            this.field5026[var59] += class201.field2731;
                            this.field4988[var59] += class497.field7031;
                            this.field4981[var59] += class579.field8413;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field4985.length) {
                        int[] var29 = this.field4985[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5031[var31];
                            int var33 = this.field5031[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4959[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class271.field3549[arg4];
                                    int var37 = class271.field3544[arg4];
                                    int var38 = this.field5022[var35] * var37 + this.field4955[var35] * var36 + 16383 >> 14;
                                    this.field4955[var35] = (short) (this.field4955[var35] * var37 + 16383 - (this.field5022[var35] * var36) >> 14);
                                    this.field5022[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class271.field3549[arg2];
                                    int var40 = class271.field3544[arg2];
                                    int var41 = this.field4955[var35] * var40 + 16383 - (this.field4966[var35] * var39) >> 14;
                                    this.field4966[var35] = (short) (this.field4966[var35] * var40 + this.field4955[var35] * var39 + 16383 >> 14);
                                    this.field4955[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class271.field3549[arg3];
                                    int var43 = class271.field3544[arg3];
                                    int var44 = this.field5022[var35] * var43 + this.field4966[var35] * var42 + 16383 >> 14;
                                    this.field4966[var35] = (short) (this.field4966[var35] * var43 + 16383 - (this.field5022[var35] * var42) >> 14);
                                    this.field5022[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5011 == null && this.field4975 != null) {
                    this.field4975.field588 = null;
                }
                if (this.field5011 != null) {
                    this.field5011.field588 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field4985.length > var70) {
                    int[] var71 = this.field4985[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5026[var73] -= class201.field2731;
                        this.field4988[var73] -= class497.field7031;
                        this.field4981[var73] -= class579.field8413;
                        this.field5026[var73] = this.field5026[var73] * arg2 >> 7;
                        this.field4988[var73] = this.field4988[var73] * arg3 >> 7;
                        this.field4981[var73] = this.field4981[var73] * arg4 >> 7;
                        this.field5026[var73] += class201.field2731;
                        this.field4988[var73] += class497.field7031;
                        this.field4981[var73] += class579.field8413;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4972 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field4972.length > var78) {
                        int[] var79 = this.field4972[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field4984[var81] & 0xFF) + (arg2 * 8);
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field4984[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4975 != null) {
                            this.field4975.field588 = null;
                        }
                    }
                }
                if (this.field4938 != null) {
                    for (int var75 = 0; var75 < this.field4949; var75++) {
                        class330 var76 = this.field4938[var75];
                        class563 var77 = this.field4946[var75];
                        var77.field8237 = var77.field8237 & 0xFFFFFF | 255 - (this.field4984[var76.field4803] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field4972 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field4972.length > var87) {
                        int[] var88 = this.field4972[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5030[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3EA) >> 7;
                            int var94 = var91 & 0x7F;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = arg3 / 4 + var93;
                            int var97 = arg4 + var94;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5030[var90] = (short) class151.method1076(var97, class151.method1076(var95 << 10, var96 << 7));
                        }
                        if (var88.length > 0 && this.field4975 != null) {
                            this.field4975.field588 = null;
                        }
                    }
                }
                if (this.field4938 != null) {
                    for (int var84 = 0; var84 < this.field4949; var84++) {
                        class330 var85 = this.field4938[var84];
                        class563 var86 = this.field4946[var84];
                        var86.field8237 = var86.field8237 & 0xFF000000 | class391.field5908[this.field5030[var85.field4803] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field4956 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field4956.length > var99) {
                        int[] var100 = this.field4956[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class563 var102 = this.field4946[var100[var101]];
                            var102.field8232 += arg2;
                            var102.field8227 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4956 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field4956.length > var104) {
                        int[] var105 = this.field4956[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class563 var107 = this.field4946[var105[var106]];
                            var107.field8236 = var107.field8236 * arg2 >> 7;
                            var107.field8228 = var107.field8228 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4956 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field4956.length > var109) {
                    int[] var110 = this.field4956[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class563 var112 = this.field4946[var110[var111]];
                        var112.field8230 = var112.field8230 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)V", line = 3815)
    private final void method2104(int arg0) {
        field4967++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = arg0; var10 < this.field4997; var10++) {
            int var11 = this.field5026[var10];
            int var12 = this.field4988[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field4981[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            if (var13 > var7) {
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
        }
        this.field4969 = (short) var6;
        this.field4935 = (short) var5;
        this.field5003 = (short) var2;
        this.field4986 = (short) var7;
        this.field5033 = (short) var3;
        this.field5021 = (short) var4;
        this.field4958 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field5034 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field5014 = true;
    }

    @OriginalMember(owner = "client!tda", name = "ba", descriptor = "(IILi;Li;III)V", line = 3891)
    public final void method1014(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6) {
        field4944++;
        if (!this.field5014) {
            this.method2104(0);
        }
        int var8 = this.field5003 + arg4;
        int var9 = this.field4935 + arg4;
        int var10 = this.field5021 + arg6;
        int var11 = this.field4986 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || var9 + arg2.field9629 >> arg2.field9623 >= arg2.field9628 || var10 < 0 || arg2.field9630 <= (arg2.field9629 + var11 >> arg2.field9623)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field9628 <= arg3.field9629 + var9 >> arg3.field9623 || var10 < 0 || arg3.field9630 <= (arg3.field9629 + var11 >> arg3.field9623)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field9623;
            int var13 = var9 - (1 - arg2.field9629) >> arg2.field9623;
            int var14 = var10 >> arg2.field9623;
            int var15 = arg2.field9629 + var11 - 1 >> arg2.field9623;
            if (arg5 == arg2.method3822(var14, var12, 0) && arg2.method3822(var14, var13, 0) == arg5 && arg2.method3822(var15, var12, 0) == arg5 && arg5 == arg2.method3822(var15, var13, 0)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4997; var16++) {
                this.field4988[var16] = this.field4988[var16] + arg2.method3824(this.field5026[var16] + arg4, 110, this.field4981[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field5033;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field4997; var31++) {
                int var32 = (this.field4988[var31] << 16) / var30;
                if (arg1 > var32) {
                    this.field4988[var31] += (arg1 - var32) * (arg2.method3824(this.field5026[var31] + arg4, 121, this.field4981[var31] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = (arg1 >> 8 & 0xFF) * 4;
            int var19 = (arg1 & 0xFF598E) >> 16 << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var17 >> 1) < 0 || (arg2.field9628 << arg2.field9623) <= ((var17 >> 1) + (arg4 + arg2.field9629)) || (arg6 - (var18 >> 1)) < 0 || (arg6 + (var18 >> 1) + arg2.field9629) >= (arg2.field9630 << arg2.field9623)) {
                return;
            }
            this.method2454(arg6, var17, var19, arg4, var20, (byte) -55, arg5, arg2, var18);
        } else if (arg0 == 4) {
            int var21 = this.field4969 - this.field5033;
            for (int var22 = 0; var22 < this.field4997; var22++) {
                this.field4988[var22] += arg3.method3824(this.field5026[var22] + arg4, 109, this.field4981[var22] + arg6) - (arg5 - var21);
            }
        } else if (arg0 == 5) {
            int var23 = this.field4969 - this.field5033;
            for (int var24 = 0; var24 < this.field4997; var24++) {
                int var25 = this.field5026[var24] + arg4;
                int var26 = this.field4981[var24] + arg6;
                int var27 = arg2.method3824(var25, 120, var26);
                int var28 = arg3.method3824(var25, 126, var26);
                int var29 = var27 - var28 - arg1;
                this.field4988[var24] = ((this.field4988[var24] << 8) / var23 * var29 >> 8) + var27 - arg5;
            }
        }
        this.field5014 = false;
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "OA", descriptor = "()I", line = 4055)
    public final int method1053() {
        if (!this.field5014) {
            this.method2104(0);
        }
        field4978++;
        return this.field5021;
    }

    @OriginalMember(owner = "client!tda", name = "T", descriptor = "(I)V", line = 4067)
    public final void method1050(int arg0) {
        if (this.field4975 != null) {
            this.field4975.field588 = null;
        }
        this.field4971 = (short) arg0;
        field4945++;
    }

    @OriginalMember(owner = "client!tda", name = "RA", descriptor = "()I", line = 4083)
    public final int method1018() {
        if (!this.field5014) {
            this.method2104(0);
        }
        field4948++;
        return this.field5034;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IFJLak;FIIIII)S", line = 4100)
    private final short method2105(int arg0, float arg1, long arg2, class677 arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4970++;
        int var12 = this.field5031[arg8];
        int var13 = this.field5031[arg8 - arg0];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field4959[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class690.field9736[var15] == arg2) {
                return (short) (var16 - 1);
            }
        }
        this.field4959[var14] = (short) (this.field5028 + 1);
        class690.field9736[var14] = arg2;
        this.field5022[this.field5028] = (short) arg7;
        this.field4955[this.field5028] = (short) arg6;
        this.field4966[this.field5028] = (short) arg9;
        this.field5004[this.field5028] = (byte) arg5;
        this.field5019[this.field5028] = arg4;
        this.field5005[this.field5028] = arg1;
        return (short) (this.field5028++);
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(Z)V", line = 4143)
    public static final void method2106(boolean arg0) {
        if (arg0) {
            return;
        }
        field4931++;
        if (class205.field2797 != null) {
            class199.field2714 = new class575();
            class199.field2714.method3307(class102.field1525, class205.field2797.field8415.method1654(97, class262.field3401), class205.field2797, -76, class205.field2797.field8422);
            class81.field1298 = new Thread(class199.field2714, "");
            class81.field1298.start();
        }
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "()[Lil;", line = 4165)
    public final class586[] method1058() {
        field4960++;
        return this.field4996;
    }

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "()[Lrca;", line = 4174)
    public final class30[] method1057() {
        field4991++;
        return this.field5002;
    }

    @OriginalMember(owner = "client!tda", name = "W", descriptor = "(I)V", line = 4193)
    public final void method1044(int arg0) {
        field4974++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field4997; var4++) {
            int var5 = this.field5026[var4] * var3 + this.field4988[var4] * var2 >> 14;
            this.field4988[var4] = this.field4988[var4] * var3 - (this.field5026[var4] * var2) >> 14;
            this.field5026[var4] = var5;
        }
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "()V", line = 4226)
    public final void method1016() {
        field5013++;
        if (this.field5028 <= 0 || this.field5023 <= 0) {
            return;
        }
        this.method2109(false, 16848);
        if ((this.field5010 & 0x10) == 0 && this.field4980.field6907 == null) {
            this.method2102(113, false);
        }
        this.method2107((byte) -120);
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)V", line = 4243)
    private final void method2107(byte arg0) {
        field5043++;
        if (!this.field4932) {
            return;
        }
        this.field4932 = false;
        if (this.field5002 == null && this.field4996 == null && this.field4938 == null) {
            if (this.field5026 != null && !class343.method2127(this.field4968, 93, this.field5018)) {
                if (this.field5006 != null && this.field5006.field588 == null) {
                    this.field4932 = true;
                } else {
                    if (!this.field5014) {
                        this.method2104(0);
                    }
                    this.field5026 = null;
                }
            }
            if (this.field4988 != null && !class314.method1952(this.field5018, true, this.field4968)) {
                if (this.field5006 != null && this.field5006.field588 == null) {
                    this.field4932 = true;
                } else {
                    if (!this.field5014) {
                        this.method2104(0);
                    }
                    this.field4988 = null;
                }
            }
            if (this.field4981 != null && !class236.method1454(0, this.field4968, this.field5018)) {
                if (this.field5006 != null && this.field5006.field588 == null) {
                    this.field4932 = true;
                } else {
                    if (!this.field5014) {
                        this.method2104(0);
                    }
                    this.field4981 = null;
                }
            }
        }
        if (this.field4959 != null && this.field5026 == null && this.field4988 == null && this.field4981 == null) {
            this.field5031 = null;
            this.field4959 = null;
        }
        if (this.field5004 != null && !class197.method1288(this.field5018, this.field4968, 115)) {
            if (this.field5011 == null) {
                if (this.field4975 != null && this.field4975.field588 == null) {
                    this.field4932 = true;
                } else {
                    this.field5022 = this.field4955 = this.field4966 = null;
                    this.field5004 = null;
                }
            } else if (this.field5011.field588 == null) {
                this.field4932 = true;
            } else {
                this.field5022 = this.field4955 = this.field4966 = null;
                this.field5004 = null;
            }
        }
        if (this.field5030 != null && !class425.method2562(this.field4968, -1, this.field5018)) {
            if (this.field4975 != null && this.field4975.field588 == null) {
                this.field4932 = true;
            } else {
                this.field5030 = null;
            }
        }
        if (this.field4984 != null && !class25.method167(this.field5018, this.field4968, 0)) {
            if (this.field4975 != null && this.field4975.field588 == null) {
                this.field4932 = true;
            } else {
                this.field4984 = null;
            }
        }
        if (this.field5019 != null && !class577.method3320(this.field4968, this.field5018, 0)) {
            if (this.field5032 != null && this.field5032.field588 == null) {
                this.field4932 = true;
            } else {
                this.field5019 = this.field5005 = null;
            }
        }
        if (this.field4937 != null && !class409.method2510(-4, this.field4968, this.field5018)) {
            if (this.field4975 != null && this.field4975.field588 == null) {
                this.field4932 = true;
            } else {
                this.field4937 = null;
            }
        }
        if (this.field4994 != null && !class477.method2739(0, this.field4968, this.field5018)) {
            if ((this.field4980 == null || this.field4980.field6907 != null) && (this.field4975 == null || this.field4975.field588 != null)) {
                this.field4994 = this.field5036 = this.field4999 = null;
            } else {
                this.field4932 = true;
            }
        }
        if (this.field4972 != null && !class397.method2466(this.field4968, this.field5018, 123)) {
            this.field4982 = null;
            this.field4972 = null;
        }
        if (this.field4985 != null && !class270.method1618(32, this.field4968, this.field5018)) {
            this.field5007 = null;
            this.field4985 = null;
        }
        int var2 = 108 % ((arg0 + 64) / 52);
        if (this.field4956 != null && !class612.method3483(false, this.field4968, this.field5018)) {
            this.field4956 = null;
        }
        if (this.field5020 != null && (this.field4968 & 0x800) == 0 && (this.field4968 & 0x40000) == 0) {
            this.field5020 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(SBBII)I", line = 4416)
    private final int method2108(short arg0, byte arg1, byte arg2, int arg3, int arg4) {
        field5051++;
        int var6 = class391.field5908[class282.method1674(true, arg3, arg4)];
        int var7 = -127 % ((arg2 - 39) / 40);
        if (arg0 != -1) {
            class457 var8 = this.field4961.field1491.method955(-1330, arg0 & 0xFFFF);
            int var9 = var8.field6603 & 0xFF;
            if (var9 != 0) {
                int var10;
                if (arg3 < 0) {
                    var10 = 0;
                } else if (arg3 <= 127) {
                    var10 = arg3 * 131586;
                } else {
                    var10 = 16777215;
                }
                if (var9 == 256) {
                    var6 = var10;
                } else {
                    int var12 = 256 - var9;
                    var6 = ((var10 & 0xFF00FF) * var9 + ((var6 & 0xFF00FF) * var12) & 0xFF00FF00) + ((var6 & 0xFF00) * var12 + (var10 & 0xFF00) * var9 & 0xFF0000) >> 8;
                }
            }
            int var13 = var8.field6611 & 0xFF;
            if (var13 != 0) {
                var13 += 256;
                int var14 = ((var6 & 0xFF0000) >> 16) * var13;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 >> 8 & 0xFF) * var13;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                int var16 = (var6 & 0xFF) * var13;
                if (var16 > 65535) {
                    var16 = 65535;
                }
                var6 = (var16 >> 8) + (var14 << 8 & 0xFF00E5) + (var15 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!tda", name = "ga", descriptor = "(I)V", line = 4488)
    public final void method1010(int arg0) {
        this.field5040 = (short) arg0;
        field4942++;
        if (this.field4975 != null) {
            this.field4975.field588 = null;
        }
        if (this.field5011 != null) {
            this.field5011.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "S", descriptor = "(Lha;)Lha;", line = 4507)
    public final class425 method1031(class425 arg0) {
        field4954++;
        if (this.field5028 == 0) {
            return null;
        }
        if (!this.field5014) {
            this.method2104(0);
        }
        int var2;
        int var3;
        if (this.field4961.field4143 <= 0) {
            var2 = this.field5003 - (this.field4961.field4143 * this.field5033 >> 8) >> this.field4961.field4019;
            var3 = this.field4935 - (this.field4961.field4143 * this.field4969 >> 8) >> this.field4961.field4019;
        } else {
            var2 = this.field5003 - (this.field4961.field4143 * this.field4969 >> 8) >> this.field4961.field4019;
            var3 = this.field4935 - (this.field4961.field4143 * this.field5033 >> 8) >> this.field4961.field4019;
        }
        int var4;
        int var5;
        if (this.field4961.field4112 > 0) {
            var4 = this.field5021 - (this.field4961.field4112 * this.field4969 >> 8) >> this.field4961.field4019;
            var5 = this.field4986 - (this.field4961.field4112 * this.field5033 >> 8) >> this.field4961.field4019;
        } else {
            var4 = this.field5021 - (this.field4961.field4112 * this.field5033 >> 8) >> this.field4961.field4019;
            var5 = this.field4986 - (this.field4961.field4112 * this.field4969 >> 8) >> this.field4961.field4019;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 - (var4 - 1);
        class495 var8 = (class495) arg0;
        class495 var9;
        if (var8 != null && var8.method2829(var7, 124, var6)) {
            var9 = var8;
            var8.method2828(-44);
        } else {
            var9 = new class495(this.field4961, var6, var7);
        }
        var9.method2826(var2, var3, var4, var5, false);
        this.method2103((byte) -111, var9);
        return var9;
    }

    @OriginalMember(owner = "client!tda", name = "TA", descriptor = "()I", line = 4569)
    public final int method1015() {
        field5029++;
        return this.field4971;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "()Z", line = 4577)
    public final boolean method1008() {
        field4939++;
        if (this.field4937 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4937.length; var1++) {
            if (this.field4937[var1] != -1 && !this.field4961.field1491.method956(this.field4937[var1], 15925)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "()V", line = 4601)
    public final void method1051() {
        field4943++;
    }

    @OriginalMember(owner = "client!tda", name = "na", descriptor = "()I", line = 4616)
    public final int method1029() {
        field4951++;
        return this.field5040;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)V", line = 4624)
    private final void method2109(boolean arg0, int arg1) {
        field5000++;
        boolean var3 = this.field4975 != null && this.field4975.field588 == null;
        boolean var4 = this.field5011 != null && this.field5011.field588 == null;
        boolean var5 = this.field5006 != null && this.field5006.field588 == null;
        if (arg1 != 16848) {
            this.method2111(-40, 4, null, true, false, 62);
        }
        boolean var6 = this.field5032 != null && this.field5032.field588 == null;
        if (arg0) {
            var6 &= (this.field5010 & 0x8) != 0;
            var3 &= (this.field5010 & 0x2) != 0;
            var5 &= (this.field5010 & 0x1) != 0;
            var4 &= (this.field5010 & 0x4) != 0;
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
        if (this.field5028 * var7 > this.field4961.field4073.field7952.length) {
            this.field4961.field4073 = new class449((this.field5028 + 100) * var7);
        } else {
            this.field4961.field4073.field7956 = 0;
        }
        class449 var12 = this.field4961.field4073;
        if (var5) {
            if (this.field4961.field4060) {
                for (int var13 = 0; var13 < this.field4997; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5026[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field4988[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field4981[var13]);
                    int var17 = this.field5031[var13];
                    int var18 = this.field5031[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field4959[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field7956 = var7 * var20;
                        var12.method3146(var14, arg1 ^ 0x41E9);
                        var12.method3146(var15, 68);
                        var12.method3146(var16, -64);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4997; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5026[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field4988[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field4981[var21]);
                    int var25 = this.field5031[var21];
                    int var26 = this.field5031[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field4959[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field7956 = var7 * var28;
                        var12.method3135(var22, arg1 ^ 0xFFFFBE2F);
                        var12.method3135(var23, arg1 - 16849);
                        var12.method3135(var24, -1);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5011 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field4947 == null) {
                    var29 = this.field5004;
                    var30 = this.field4966;
                    var31 = this.field5022;
                    var32 = this.field4955;
                } else {
                    var31 = this.field4947.field6083;
                    var30 = this.field4947.field6082;
                    var32 = this.field4947.field6080;
                    var29 = this.field4947.field6087;
                }
                float var33 = this.field4961.field4149[0];
                float var34 = this.field4961.field4149[1];
                float var35 = this.field4961.field4149[2];
                float var36 = this.field4961.field4121;
                float var37 = this.field4961.field4108 * 768.0F / (float) this.field5040;
                float var38 = this.field4961.field4125 * 768.0F / (float) this.field5040;
                for (int var39 = 0; var39 < this.field5039; var39++) {
                    int var40 = this.method2108(this.field4937[var39], this.field4984[var39], (byte) -28, this.field4971, this.field5030[var39]);
                    short var41 = this.field4994[var39];
                    float var42 = (float) (var40 >>> 24) * this.field4961.field4088;
                    float var43 = (float) ((var40 & 0xFF983B) >> 16) * this.field4961.field4072;
                    float var44 = (float) ((var40 & 0xFFF8) >> 8) * this.field4961.field4061;
                    short var45 = (short) var29[var41];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var30[var41] * var35 + (float) var31[var41] * var33 + (float) var32[var41] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var30[var41] * var35 + (float) var31[var41] * var33 + (float) var32[var41] * var34) / (float) (var45 * 256);
                    }
                    float var47 = (var46 < 0.0F ? var38 : var37) * var46 + var36;
                    int var48 = (int) (var42 * var47);
                    int var49 = (int) (var43 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var50 = (int) (var44 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    var12.field7956 = var9 + (var7 * var41);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method3110(var48, 47);
                    var12.method3110(var49, 64);
                    var12.method3110(var50, 37);
                    var12.method3110(255 - (this.field4984[var39] & 0xFF), 123);
                    short var51 = this.field5036[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var30[var51] * var35 + (float) var31[var51] * var33 + (float) var32[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var30[var51] * var35 + (float) var31[var51] * var33 + (float) var32[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = ((var53 < 0.0F) ? var38 : var37) * var53 + var36;
                    int var55 = (int) (var42 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var43 * var54);
                    int var57 = (int) (var44 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field7956 = var7 * var51 + var9;
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method3110(var55, 40);
                    var12.method3110(var56, 69);
                    var12.method3110(var57, arg1 ^ 0x41A0);
                    var12.method3110(255 - (this.field4984[var39] & 0xFF), arg1 + -16815);
                    short var58 = this.field4999[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var30[var58] * var35 + (float) var31[var58] * var33 + (float) var32[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var30[var58] * var35 + (float) var31[var58] * var33 + (float) var32[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = (var60 < 0.0F ? var38 : var37) * var60 + var36;
                    int var62 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var63 = (int) (var43 * var61);
                    int var64 = (int) (var44 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field7956 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method3110(var62, 77);
                    var12.method3110(var63, 33);
                    var12.method3110(var64, 52);
                    var12.method3110(255 - (this.field4984[var39] & 0xFF), 93);
                }
            } else {
                for (int var65 = 0; var65 < this.field5039; var65++) {
                    int var66 = this.method2108(this.field4937[var65], this.field4984[var65], (byte) -54, this.field4971, this.field5030[var65]);
                    var12.field7956 = this.field4994[var65] * var7 + var9;
                    var12.method3146(var66, -69);
                    var12.field7956 = this.field5036[var65] * var7 + var9;
                    var12.method3146(var66, 108);
                    var12.field7956 = this.field4999[var65] * var7 + var9;
                    var12.method3146(var66, -126);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field4947 == null) {
                var70 = this.field4966;
                var69 = this.field5004;
                var68 = this.field4955;
                var67 = this.field5022;
            } else {
                var67 = this.field4947.field6083;
                var68 = this.field4947.field6080;
                var69 = this.field4947.field6087;
                var70 = this.field4947.field6082;
            }
            float var71 = 3.0F / (float) this.field5040;
            float var72 = 3.0F / (float) (this.field5040 + (this.field5040 / 2));
            var12.field7956 = var10;
            if (this.field4961.field4060) {
                for (int var76 = 0; var76 < this.field5028; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2651(874114616, (float) var67[var76] * var72);
                        var12.method2651(874114616, (float) var68[var76] * var72);
                        var12.method2651(874114616, (float) var70[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2651(874114616, (float) var67[var76] * var78);
                        var12.method2651(arg1 ^ 0x3419AFE8, (float) var68[var76] * var78);
                        var12.method2651(arg1 + 874097768, (float) var70[var76] * var78);
                    }
                    var12.field7956 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field5028; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2650(929234520, (float) var67[var73] * var72);
                        var12.method2650(929234520, (float) var68[var73] * var72);
                        var12.method2650(929234520, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2650(929234520, (float) var67[var73] * var75);
                        var12.method2650(929234520, (float) var68[var73] * var75);
                        var12.method2650(929234520, (float) var70[var73] * var75);
                    }
                    var12.field7956 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field7956 = var11;
            if (this.field4961.field4060) {
                for (int var79 = 0; var79 < this.field5028; var79++) {
                    var12.method2651(874114616, this.field5019[var79]);
                    var12.method2651(874114616, this.field5005[var79]);
                    var12.field7956 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field5028; var80++) {
                    var12.method2650(arg1 + 929217672, this.field5019[var80]);
                    var12.method2650(arg1 + 929217672, this.field5005[var80]);
                    var12.field7956 += var7 - 8;
                }
            }
        }
        var12.field7956 = this.field5028 * var7;
        class558 var81;
        if (arg0) {
            if (this.field4995 == null) {
                this.field4995 = this.field4961.method1753(var7, var12.field7952, var12.field7956, true, arg1 ^ 0xFFFF9079);
            } else {
                this.field4995.method2988(var7, arg1 - 27732, var12.field7952, var12.field7956);
            }
            this.field5010 = 0;
            var81 = this.field4995;
        } else {
            var81 = this.field4961.method1753(var7, var12.field7952, var12.field7956, false, arg1 - 28711);
            this.field4932 = true;
        }
        if (var5) {
            this.field5006.field588 = var81;
            this.field5006.field587 = var8;
        }
        if (var6) {
            this.field5032.field588 = var81;
            this.field5032.field587 = var11;
        }
        if (var3) {
            this.field4975.field588 = var81;
            this.field4975.field587 = var9;
        }
        if (var4) {
            this.field5011.field587 = var10;
            this.field5011.field588 = var81;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILgk;B)V", line = 5150)
    public static final void method2110(int arg0, class540 arg1, byte arg2) {
        if (arg2 != -1) {
            method2112(true, null, -16, -121, -78, null);
        }
        field4964++;
        if (class259.field3354 == null) {
            return;
        }
        try {
            class259.field3354.method2139(0L, (byte) 22);
            class259.field3354.method2136(24, -108, arg0, arg1.field7952);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!tda", name = "M", descriptor = "(I)V", line = 5170)
    public final void method1042(int arg0) {
        field4930++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field4997; var4++) {
            int var5 = this.field5026[var4] * var3 + this.field4981[var4] * var2 >> 14;
            this.field4981[var4] = this.field4981[var4] * var3 - this.field5026[var4] * var2 >> 14;
            this.field5026[var4] = var5;
        }
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
        this.field5014 = false;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILq;ZZI)Z", line = 5199)
    private final boolean method2111(int arg0, int arg1, class151 arg2, boolean arg3, boolean arg4, int arg5) {
        field5038++;
        class196 var7 = (class196) arg2;
        class196 var8 = this.field4961.field4052;
        float var9 = var7.field2679 * var8.field2664 + var7.field2661 * var8.field2655 + var7.field2642 * var8.field2644 + var8.field2642;
        float var10 = var7.field2679 * var8.field2674 + var7.field2661 * var8.field2672 + var7.field2642 * var8.field2654 + var8.field2661;
        class652.field9334 = var7.field2668 * var8.field2671 + var7.field2672 * var8.field2668 + var7.field2655 * var8.field2649;
        class433.field6284 = var7.field2649 * var8.field2671 + var7.field2654 * var8.field2668 + var7.field2644 * var8.field2649;
        class624.field9022 = var7.field2671 * var8.field2674 + var7.field2674 * var8.field2672 + var7.field2664 * var8.field2654;
        class70.field1082 = var7.field2668 * var8.field2664 + var7.field2672 * var8.field2655 + var7.field2655 * var8.field2644;
        class697.field9815 = var7.field2671 * var8.field2671 + var7.field2674 * var8.field2668 + var7.field2664 * var8.field2649;
        class298.field4391 = var7.field2668 * var8.field2674 + var7.field2672 * var8.field2672 + var7.field2655 * var8.field2654;
        class517.field7267 = var7.field2649 * var8.field2674 + var7.field2654 * var8.field2672 + var7.field2644 * var8.field2654;
        float var11 = var7.field2679 * var8.field2671 + var7.field2661 * var8.field2668 + var7.field2642 * var8.field2649 + var8.field2679;
        class27.field476 = var7.field2649 * var8.field2664 + var7.field2654 * var8.field2655 + var7.field2644 * var8.field2644;
        class94.field1455 = var7.field2671 * var8.field2664 + var7.field2674 * var8.field2655 + var7.field2664 * var8.field2644;
        boolean var12 = arg3;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field4961.field4161;
        int var18 = this.field4961.field4059;
        if (!this.field5014) {
            this.method2104(0);
        }
        class645.field9287[0] = this.field5003;
        class81.field1313[0] = this.field5033;
        class27.field464[0] = this.field5021;
        class645.field9287[1] = this.field4935;
        class81.field1313[1] = this.field5033;
        class645.field9287[2] = this.field5003;
        class27.field464[1] = this.field5021;
        class81.field1313[2] = this.field4969;
        class27.field464[2] = this.field5021;
        class645.field9287[3] = this.field4935;
        class81.field1313[3] = this.field4969;
        class27.field464[3] = this.field5021;
        class645.field9287[4] = this.field5003;
        class81.field1313[4] = this.field5033;
        class27.field464[4] = this.field4986;
        class645.field9287[5] = this.field4935;
        class81.field1313[5] = this.field5033;
        class645.field9287[6] = this.field5003;
        class27.field464[5] = this.field4986;
        class81.field1313[6] = this.field4969;
        class645.field9287[7] = this.field4935;
        class27.field464[6] = this.field4986;
        class81.field1313[7] = this.field4969;
        class27.field464[7] = this.field4986;
        for (int var19 = 0; var19 < 8; var19++) {
            float var40 = (float) class645.field9287[var19];
            float var41 = (float) class81.field1313[var19];
            float var42 = (float) class27.field464[var19];
            float var43 = class624.field9022 * var42 + class517.field7267 * var40 + class298.field4391 * var41 + var10;
            float var44 = class94.field1455 * var42 + class70.field1082 * var41 + class27.field476 * var40 + var9;
            float var45 = class697.field9815 * var42 + class652.field9334 * var41 + class433.field6284 * var40 + var11;
            if (var45 >= (float) this.field4961.field4080) {
                if (arg0 > 0) {
                    var45 = arg0;
                }
                float var46 = (float) var17 * var44 / var45 + (float) this.field4961.field4154;
                if (var46 > var14) {
                    var14 = var46;
                }
                float var47 = (float) var18 * var43 / var45 + (float) this.field4961.field4129;
                if (var13 > var46) {
                    var13 = var46;
                }
                if (var15 > var47) {
                    var15 = var47;
                }
                var12 = true;
                if (var47 > var16) {
                    var16 = var47;
                }
            }
        }
        if (var12 && (float) arg1 > var13 && (float) arg1 < var14 && (float) arg5 > var15 && var16 > (float) arg5) {
            if (arg4) {
                return true;
            }
            if (this.field4961.field4169.length < this.field5028) {
                this.field4961.field4169 = new int[this.field5028];
                this.field4961.field4170 = new int[this.field5028];
            }
            int[] var20 = this.field4961.field4169;
            int[] var21 = this.field4961.field4170;
            for (int var22 = 0; var22 < this.field4997; var22++) {
                float var24 = (float) this.field5026[var22];
                float var25 = (float) this.field4981[var22];
                float var26 = (float) this.field4988[var22];
                float var27 = class94.field1455 * var25 + class70.field1082 * var26 + class27.field476 * var24 + var9;
                float var28 = class624.field9022 * var25 + class517.field7267 * var24 + class298.field4391 * var26 + var10;
                float var29 = class697.field9815 * var25 + class652.field9334 * var26 + class433.field6284 * var24 + var11;
                if ((var29 >= (float) this.field4961.field4080)) {
                    if (arg0 > 0) {
                        var29 = arg0;
                    }
                    int var34 = (int) ((float) var17 * var27 / var29 + (float) this.field4961.field4154);
                    int var35 = (int) ((float) var18 * var28 / var29 + (float) this.field4961.field4129);
                    int var36 = this.field5031[var22];
                    int var37 = this.field5031[var22 + 1];
                    for (int var38 = var36; var38 < var37; var38++) {
                        int var39 = this.field4959[var38] - 1;
                        if (var39 == -1) {
                            break;
                        }
                        var20[var39] = var34;
                        var21[var39] = var35;
                    }
                } else {
                    int var30 = this.field5031[var22];
                    int var31 = this.field5031[var22 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field4959[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var20[this.field4959[var32] - 1] = -999999;
                    }
                }
            }
            for (int var23 = 0; var23 < this.field5039; var23++) {
                if (var20[this.field4994[var23]] != -999999 && var20[this.field5036[var23]] != -999999 && var20[this.field4999[var23]] != -999999 && this.method2113(var20[this.field4999[var23]], var20[this.field4994[var23]], var20[this.field5036[var23]], var21[this.field5036[var23]], var21[this.field4994[var23]], arg5, arg1, 100, var21[this.field4999[var23]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZLifa;IIILda;)V", line = 5427)
    public static final void method2112(boolean arg0, class62 arg1, int arg2, int arg3, int arg4, class395 arg5) {
        field4963++;
        if (arg5 != null) {
            arg1.method387(arg5.method1009(), arg5.method1053(), arg2, arg3, arg5.method1041(), arg5.method1011(), arg5.method1007(), arg5.method1012(), 12230, arg5.method1039(), arg4);
            if (!arg0) {
                field4933 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lq;IZ)V", line = 5443)
    public final void method1043(class151 arg0, int arg1, boolean arg2) {
        field5044++;
        if (this.field5007 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field4997; var5++) {
            if ((this.field5007[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method885(this.field5026[var5], this.field4988[var5], this.field4981[var5], var4);
                } else {
                    arg0.method892(this.field5026[var5], this.field4988[var5], this.field4981[var5], var4);
                }
                this.field5026[var5] = var4[0];
                this.field4988[var5] = var4[1];
                this.field4981[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "()I", line = 5480)
    public final int method1009() {
        if (!this.field5014) {
            this.method2104(0);
        }
        field5042++;
        return this.field4935;
    }

    @OriginalMember(owner = "client!tda", name = "L", descriptor = "()V", line = 5499)
    public final void method1040() {
        for (int var1 = 0; var1 < this.field5009; var1++) {
            this.field5026[var1] = this.field5026[var1] + 7 >> 4;
            this.field4988[var1] = this.field4988[var1] + 7 >> 4;
            this.field4981[var1] = this.field4981[var1] + 7 >> 4;
        }
        field4989++;
        this.field5014 = false;
        if (this.field5006 != null) {
            this.field5006.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "K", descriptor = "()I", line = 5522)
    public final int method1041() {
        if (!this.field5014) {
            this.method2104(0);
        }
        field5017++;
        return this.field4958;
    }

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "()V", line = 5533)
    public final void method1028() {
        field5045++;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIIIII)Z", line = 5545)
    private final boolean method2113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5008++;
        if (arg5 < arg4 && arg5 < arg3 && arg8 > arg5) {
            return false;
        } else if (arg7 != 100) {
            return true;
        } else if (arg5 > arg4 && arg3 < arg5 && arg5 > arg8) {
            return false;
        } else if (arg6 < arg1 && arg6 < arg2 && arg6 < arg0) {
            return false;
        } else {
            return arg1 >= arg6 || arg6 <= arg2 || arg6 <= arg0;
        }
    }

    @OriginalMember(owner = "client!tda", name = "KA", descriptor = "()I", line = 5579)
    public final int method1012() {
        field5046++;
        if (!this.field5014) {
            this.method2104(0);
        }
        return this.field5003;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lq;)V", line = 5596)
    public final void method1032(class151 arg0) {
        field4990++;
        class196 var2 = (class196) arg0;
        if (this.field5002 != null) {
            for (int var3 = 0; var3 < this.field5002.length; var3++) {
                class30 var4 = this.field5002[var3];
                class30 var5 = var4;
                if (var4.field511 != null) {
                    var5 = var4.field511;
                }
                var5.field512 = (int) ((float) this.field4981[var4.field509] * var2.field2664 + (float) this.field5026[var4.field509] * var2.field2644 + (float) this.field4988[var4.field509] * var2.field2655 + var2.field2642);
                var5.field517 = (int) ((float) this.field4981[var4.field509] * var2.field2674 + (float) this.field5026[var4.field509] * var2.field2654 + (float) this.field4988[var4.field509] * var2.field2672 + var2.field2661);
                var5.field524 = (int) ((float) this.field4981[var4.field509] * var2.field2671 + (float) this.field5026[var4.field509] * var2.field2649 + (float) this.field4988[var4.field509] * var2.field2668 + var2.field2679);
                var5.field525 = (int) ((float) this.field4981[var4.field515] * var2.field2664 + (float) this.field5026[var4.field515] * var2.field2644 + (float) this.field4988[var4.field515] * var2.field2655 + var2.field2642);
                var5.field522 = (int) ((float) this.field4981[var4.field515] * var2.field2674 + (float) this.field5026[var4.field515] * var2.field2654 + (float) this.field4988[var4.field515] * var2.field2672 + var2.field2661);
                var5.field523 = (int) ((float) this.field4981[var4.field515] * var2.field2671 + (float) this.field5026[var4.field515] * var2.field2649 + (float) this.field4988[var4.field515] * var2.field2668 + var2.field2679);
                var5.field510 = (int) ((float) this.field4981[var4.field520] * var2.field2664 + (float) this.field5026[var4.field520] * var2.field2644 + (float) this.field4988[var4.field520] * var2.field2655 + var2.field2642);
                var5.field505 = (int) ((float) this.field4981[var4.field520] * var2.field2674 + (float) this.field5026[var4.field520] * var2.field2654 + (float) this.field4988[var4.field520] * var2.field2672 + var2.field2661);
                var5.field519 = (int) ((float) this.field4981[var4.field520] * var2.field2671 + (float) this.field5026[var4.field520] * var2.field2649 + (float) this.field4988[var4.field520] * var2.field2668 + var2.field2679);
            }
        }
        if (this.field4996 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4996.length; var6++) {
            class586 var7 = this.field4996[var6];
            class586 var8 = var7;
            if (var7.field8499 != null) {
                var8 = var7.field8499;
            }
            if (var7.field8502 == null) {
                var7.field8502 = var2.method888();
            } else {
                var7.field8502.method887(var2);
            }
            var8.field8505 = (int) ((float) this.field4981[var7.field8503] * var2.field2664 + (float) this.field5026[var7.field8503] * var2.field2644 + (float) this.field4988[var7.field8503] * var2.field2655 + var2.field2642);
            var8.field8508 = (int) ((float) this.field4981[var7.field8503] * var2.field2674 + (float) this.field5026[var7.field8503] * var2.field2654 + (float) this.field4988[var7.field8503] * var2.field2672 + var2.field2661);
            var8.field8506 = (int) ((float) this.field4981[var7.field8503] * var2.field2671 + (float) this.field5026[var7.field8503] * var2.field2649 + (float) this.field4988[var7.field8503] * var2.field2668 + var2.field2679);
        }
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(SS)V", line = 5662)
    public final void method1052(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5039; var3++) {
            if (this.field5030[var3] == arg0) {
                this.field5030[var3] = arg1;
            }
        }
        field5012++;
        if (this.field4938 != null) {
            for (int var4 = 0; var4 < this.field4949; var4++) {
                class330 var5 = this.field4938[var4];
                class563 var6 = this.field4946[var4];
                var6.field8237 = class391.field5908[this.field5030[var5.field4803] & 0xFFFF] & 0xFFFFFF | var6.field8237 & 0xFF000000;
            }
        }
        if (this.field4975 != null) {
            this.field4975.field588 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILq;ZI)Z", line = 5704)
    public final boolean method1022(int arg0, int arg1, class151 arg2, boolean arg3, int arg4) {
        field4941++;
        return this.method2111(arg4, arg0, arg2, false, arg3, arg1);
    }

    @OriginalMember(owner = "client!tda", name = "PA", descriptor = "()I", line = 5717)
    public final int method1027() {
        field4976++;
        return this.field4968;
    }

    @OriginalMember(owner = "client!tda", name = "J", descriptor = "()I", line = 5727)
    public final int method1007() {
        if (!this.field5014) {
            this.method2104(0);
        }
        field5025++;
        return this.field5033;
    }
}
