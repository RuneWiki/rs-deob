import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class324 extends class398 {

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    private int field4978 = 0;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    private int field4966 = 0;

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "Z")
    private boolean field5001 = false;

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "I")
    private int field4999 = 0;

    @OriginalMember(owner = "client!sg", name = "Nb", descriptor = "I")
    private int field5032 = 0;

    @OriginalMember(owner = "client!sg", name = "kb", descriptor = "I")
    private int field5003 = 0;

    @OriginalMember(owner = "client!sg", name = "Ab", descriptor = "Z")
    private boolean field5019 = true;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "Lvd;")
    private class258 field4984;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "Lft;")
    private class426 field4979;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "Lft;")
    private class426 field4972;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "Lft;")
    private class426 field4985;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lft;")
    private class426 field4971;

    @OriginalMember(owner = "client!sg", name = "Pb", descriptor = "Lcp;")
    private class519 field5034;

    @OriginalMember(owner = "client!sg", name = "ac", descriptor = "I")
    private int field5045;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!sg", name = "Qb", descriptor = "[I")
    private int[] field5035;

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "[I")
    private int[] field4995;

    @OriginalMember(owner = "client!sg", name = "Lb", descriptor = "[S")
    private short[] field5030;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "[I")
    private int[] field4959;

    @OriginalMember(owner = "client!sg", name = "Tb", descriptor = "[I")
    private int[] field5038;

    @OriginalMember(owner = "client!sg", name = "lb", descriptor = "[Ldh;")
    private class254[] field5004;

    @OriginalMember(owner = "client!sg", name = "hc", descriptor = "[Lng;")
    private class165[] field5052;

    @OriginalMember(owner = "client!sg", name = "Hb", descriptor = "I")
    private int field5026;

    @OriginalMember(owner = "client!sg", name = "sb", descriptor = "[Lru;")
    private class377[] field5011;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "[Lr;")
    private class430[] field4988;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "[S")
    private short[] field4962;

    @OriginalMember(owner = "client!sg", name = "ob", descriptor = "S")
    private short field5007;

    @OriginalMember(owner = "client!sg", name = "qb", descriptor = "[B")
    private byte[] field5009;

    @OriginalMember(owner = "client!sg", name = "ic", descriptor = "S")
    private short field5053;

    @OriginalMember(owner = "client!sg", name = "Cb", descriptor = "[S")
    private short[] field5021;

    @OriginalMember(owner = "client!sg", name = "nb", descriptor = "[S")
    private short[] field5006;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "[S")
    private short[] field4975;

    @OriginalMember(owner = "client!sg", name = "sc", descriptor = "[B")
    private byte[] field5063;

    @OriginalMember(owner = "client!sg", name = "tb", descriptor = "[S")
    private short[] field5012;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "[S")
    private short[] field4969;

    @OriginalMember(owner = "client!sg", name = "ub", descriptor = "[F")
    private float[] field5013;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "[S")
    private short[] field4967;

    @OriginalMember(owner = "client!sg", name = "Kb", descriptor = "[S")
    private short[] field5029;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "[F")
    private float[] field4974;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[S")
    private short[] field4953;

    @OriginalMember(owner = "client!sg", name = "Bb", descriptor = "[S")
    private short[] field5020;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "[I")
    private int[] field4963;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "[[I")
    private int[][] field4976;

    @OriginalMember(owner = "client!sg", name = "jb", descriptor = "[[I")
    private int[][] field5002;

    @OriginalMember(owner = "client!sg", name = "wb", descriptor = "[[I")
    private int[][] field5015;

    @OriginalMember(owner = "client!sg", name = "Vb", descriptor = "Luv;")
    public static class2 field5040 = new class2(5, 20);

    @OriginalMember(owner = "client!sg", name = "oc", descriptor = "Ldp;")
    public static class347 field5059 = new class347("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!sg", name = "qc", descriptor = "Luv;")
    public static class2 field5061 = new class2(30, -2);

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "B")
    private byte field4991;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!sg", name = "mb", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!sg", name = "pb", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!sg", name = "rb", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!sg", name = "vb", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!sg", name = "xb", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!sg", name = "yb", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!sg", name = "zb", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!sg", name = "Db", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!sg", name = "Eb", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!sg", name = "Fb", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!sg", name = "Gb", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!sg", name = "Ib", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!sg", name = "Jb", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!sg", name = "Mb", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!sg", name = "Rb", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!sg", name = "Sb", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!sg", name = "Ub", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!sg", name = "Wb", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!sg", name = "Xb", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!sg", name = "Yb", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!sg", name = "bc", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!sg", name = "cc", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!sg", name = "dc", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!sg", name = "ec", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!sg", name = "fc", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!sg", name = "gc", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!sg", name = "kc", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!sg", name = "lc", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!sg", name = "pc", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!sg", name = "rc", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!sg", name = "Ob", descriptor = "Llm;")
    private class246 field5033;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "Lqt;")
    private class298 field4990;

    @OriginalMember(owner = "client!sg", name = "nc", descriptor = "Loj;")
    private class416 field5058;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "S")
    private short field4960;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "S")
    private short field4968;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "S")
    private short field4970;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "S")
    private short field4981;

    @OriginalMember(owner = "client!sg", name = "Zb", descriptor = "S")
    private short field5044;

    @OriginalMember(owner = "client!sg", name = "jc", descriptor = "S")
    private short field5054;

    @OriginalMember(owner = "client!sg", name = "mc", descriptor = "S")
    private short field5057;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "()I", line = 5)
    public final int method611() {
        if (!this.field5001) {
            this.method2017(-24950);
        }
        field4994++;
        return this.field4960;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 17)
    public final void method605(int arg0) {
        field5028++;
        int var2 = class445.field6545[arg0];
        int var3 = class445.field6544[arg0];
        for (int var4 = 0; var4 < this.field4978; var4++) {
            int var7 = this.field5038[var4] * var2 + this.field4995[var4] * var3 >> 15;
            this.field5038[var4] = this.field5038[var4] * var3 - (this.field4995[var4] * var2) >> 15;
            this.field4995[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4999; var5++) {
            int var6 = this.field5006[var5] * var2 + this.field4962[var5] * var3 >> 15;
            this.field5006[var5] = (short) (this.field5006[var5] * var3 - (this.field4962[var5] * var2) >> 15);
            this.field4962[var5] = (short) var6;
        }
        if (this.field4985 == null && this.field4971 != null) {
            this.field4971.field6343 = null;
        }
        if (this.field4985 != null) {
            this.field4985.field6343 = null;
        }
        this.field5001 = false;
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()Z", line = 72)
    public final boolean method644() {
        field4958++;
        if (this.field4967 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4967.length; var1++) {
            if (this.field4967[var1] != -1 && !this.field4984.field101.method1482((byte) 125, this.field4967[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lc;Lqb;I)V", line = 98)
    public final void method640(class511 arg0, class518 arg1, int arg2) {
        field4986++;
        if (this.field4999 == 0) {
            return;
        }
        class446 var4 = this.field4984.field3737;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        class446 var5 = (class446) arg0;
        this.method2016(var5, (byte) 117);
        class254.field3450 = var4.field6568 * var5.field6566 + var4.field6590 * var5.field6574 + var4.field6586 * var5.field6589 + var4.field6566;
        class515.field7561 = var4.field6568 * var5.field6586 + var4.field6590 * var5.field6577 + var4.field6586 * var5.field6565;
        float var6 = (float) this.field4968 * class515.field7561 + class254.field3450;
        float var7 = (float) this.field4981 * class515.field7561 + class254.field3450;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field4960 + var6;
            var9 = var7 - (float) this.field4960;
        } else {
            var8 = (float) this.field4960 + var7;
            var9 = var6 - (float) this.field4960;
        }
        if ((var9 >= this.field4984.field3738) || (var8 <= (float) this.field4984.field3747)) {
            return;
        }
        class498.field7387 = var4.field6597 * var5.field6566 + var4.field6598 * var5.field6574 + var4.field6577 * var5.field6589 + var4.field6574;
        class521.field7667 = var4.field6597 * var5.field6586 + var4.field6598 * var5.field6577 + var4.field6577 * var5.field6565;
        float var10 = (float) this.field4968 * class521.field7667 + class498.field7387;
        float var11 = (float) this.field4981 * class521.field7667 + class498.field7387;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var13 = (var11 - (float) this.field4960) * (float) this.field4984.field3835;
            var12 = ((float) this.field4960 + var10) * (float) this.field4984.field3835;
        } else {
            var12 = ((float) this.field4960 + var11) * (float) this.field4984.field3835;
            var13 = ((float) (-this.field4960) + var10) * (float) this.field4984.field3835;
        }
        if ((this.field4984.field3748 <= var13 / var8) || (this.field4984.field3836 >= var12 / var8)) {
            return;
        }
        class10.field94 = var4.field6581 * var5.field6586 + var4.field6567 * var5.field6577 + var4.field6565 * var5.field6565;
        class332.field5152 = var4.field6581 * var5.field6566 + var4.field6567 * var5.field6574 + var4.field6565 * var5.field6589 + var4.field6589;
        float var14 = (float) this.field4968 * class10.field94 + class332.field5152;
        float var15 = (float) this.field4981 * class10.field94 + class332.field5152;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field4960) * (float) this.field4984.field3784;
            var17 = ((float) this.field4960 + var14) * (float) this.field4984.field3784;
        } else {
            var16 = ((float) (-this.field4960) + var14) * (float) this.field4984.field3784;
            var17 = ((float) this.field4960 + var15) * (float) this.field4984.field3784;
        }
        if ((var16 / var8 >= this.field4984.field3754) || (this.field4984.field3800 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field5011 != null) {
            class424.field6328 = var4.field6581 * var5.field6568 + var4.field6567 * var5.field6597 + var4.field6565 * var5.field6581;
            class375.field5665 = var4.field6597 * var5.field6568 + var4.field6598 * var5.field6597 + var4.field6577 * var5.field6581;
            class340.field5241 = var4.field6581 * var5.field6590 + var4.field6567 * var5.field6598 + var4.field6565 * var5.field6567;
            class172.field2519 = var4.field6597 * var5.field6590 + var4.field6598 * var5.field6598 + var4.field6577 * var5.field6567;
            class11.field98 = var4.field6568 * var5.field6568 + var4.field6590 * var5.field6597 + var4.field6586 * var5.field6581;
            class224.field3172 = var4.field6568 * var5.field6590 + var4.field6590 * var5.field6598 + var4.field6586 * var5.field6567;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5057 + this.field5054 >> 1;
            int var21 = this.field5044 + this.field4970 >> 1;
            int var22 = (int) ((float) var21 * class375.field5665 + (float) this.field4968 * class521.field7667 + (float) var20 * class172.field2519 + class498.field7387);
            int var23 = (int) ((float) var21 * class424.field6328 + (float) this.field4968 * class10.field94 + (float) var20 * class340.field5241 + class332.field5152);
            int var24 = (int) ((float) var21 * class11.field98 + (float) this.field4968 * class515.field7561 + (float) var20 * class224.field3172 + class254.field3450);
            if (this.field4984.field3747 <= var24) {
                arg1.field7597 = this.field4984.field3779 + (this.field4984.field3835 * var22 / var24);
                arg1.field7601 = this.field4984.field3784 * var23 / var24 + this.field4984.field3828;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class375.field5665 + (float) this.field4981 * class521.field7667 + (float) var20 * class172.field2519 + class498.field7387);
            int var26 = (int) ((float) var21 * class424.field6328 + (float) this.field4981 * class10.field94 + (float) var20 * class340.field5241 + class332.field5152);
            int var27 = (int) ((float) var21 * class11.field98 + (float) this.field4981 * class515.field7561 + (float) var20 * class224.field3172 + class254.field3450);
            if (this.field4984.field3747 > var27) {
                var18 = true;
            } else {
                arg1.field7596 = this.field4984.field3835 * var25 / var27 + this.field4984.field3779;
                arg1.field7599 = this.field4984.field3828 + (this.field4984.field3784 * var26 / var27);
            }
            if (var18) {
                if (this.field4984.field3747 > var24 && var27 < this.field4984.field3747) {
                    var19 = false;
                } else if (var24 < this.field4984.field3747) {
                    int var31 = (var27 - this.field4984.field3747 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field7597 = this.field4984.field3835 * var32 / this.field4984.field3747 + this.field4984.field3779;
                    arg1.field7601 = this.field4984.field3784 * var33 / this.field4984.field3747 + this.field4984.field3828;
                } else if (this.field4984.field3747 > var27) {
                    int var28 = (var24 - this.field4984.field3747 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field7597 = this.field4984.field3835 * var29 / this.field4984.field3747 + this.field4984.field3779;
                    arg1.field7601 = this.field4984.field3784 * var30 / this.field4984.field3747 + this.field4984.field3828;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field7598 = (this.field4960 + var22) * this.field4984.field3835 / var24 + this.field4984.field3779 - arg1.field7597;
                } else {
                    arg1.field7598 = (this.field4960 + var25) * this.field4984.field3835 / var27 + this.field4984.field3779 - arg1.field7596;
                }
                arg1.field7600 = true;
            }
        }
        this.field4984.method1566((byte) 127);
        this.field4984.method1603((byte) 108, var5);
        this.method2012((byte) -112);
        this.field4984.method1570(7377);
        this.method2009((byte) -79);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lt;IIIZ)V", line = 300)
    public final void method604(class398 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5049++;
        class324 var6 = (class324) arg0;
        if (this.field5003 == 0 || var6.field5003 == 0) {
            return;
        }
        int var7 = var6.field4978;
        int[] var8 = var6.field4995;
        int[] var9 = var6.field4959;
        int[] var10 = var6.field5038;
        short[] var11 = var6.field4962;
        short[] var12 = var6.field5029;
        short[] var13 = var6.field5006;
        byte[] var14 = var6.field5063;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field4990 == null) {
            var16 = null;
            var18 = null;
            var17 = null;
            var15 = null;
        } else {
            var15 = this.field4990.field4433;
            var16 = this.field4990.field4432;
            var17 = this.field4990.field4436;
            var18 = this.field4990.field4437;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field4990 == null) {
            var20 = null;
            var21 = null;
            var19 = null;
            var22 = null;
        } else {
            var19 = var6.field4990.field4432;
            var20 = var6.field4990.field4433;
            var21 = var6.field4990.field4436;
            var22 = var6.field4990.field4437;
        }
        int[] var23 = var6.field5035;
        short[] var24 = var6.field5020;
        if (!var6.field5001) {
            var6.method2017(-24950);
        }
        short var25 = var6.field4968;
        short var26 = var6.field4981;
        short var27 = var6.field5054;
        short var28 = var6.field5057;
        short var29 = var6.field5044;
        short var30 = var6.field4970;
        for (int var31 = 0; var31 < this.field4978; var31++) {
            int var32 = this.field4959[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4995[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5038[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5035[var31];
                        int var37 = this.field5035[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5020[var38] - 1;
                            if (var35 == -1 || this.field5063[var35] != 0) {
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
                                            this.field4990 = new class298();
                                            var16 = this.field4990.field4432 = class204.method1338(0, this.field4962);
                                            var15 = this.field4990.field4433 = class204.method1338(0, this.field5029);
                                            var18 = this.field4990.field4437 = class204.method1338(0, this.field5006);
                                            var17 = this.field4990.field4436 = class286.method1774(this.field5063, -8090);
                                        }
                                        if (var19 == null) {
                                            class298 var44 = var6.field4990 = new class298();
                                            var19 = var44.field4432 = class204.method1338(0, var11);
                                            var20 = var44.field4433 = class204.method1338(0, var12);
                                            var22 = var44.field4437 = class204.method1338(0, var13);
                                            var21 = var44.field4436 = class286.method1774(var14, -8090);
                                        }
                                        short var45 = this.field4962[var35];
                                        short var46 = this.field5029[var35];
                                        short var47 = this.field5006[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field5063[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var50;
                                            }
                                        }
                                        short var53 = var11[var42];
                                        int var54 = this.field5035[var31 + 1];
                                        short var55 = var13[var42];
                                        short var56 = var12[var42];
                                        int var57 = this.field5035[var31];
                                        byte var58 = var14[var42];
                                        for (int var59 = var57; var59 < var54; var59++) {
                                            int var60 = this.field5020[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var53;
                                                var15[var60] += var56;
                                                var18[var60] += var55;
                                                var17[var60] += var58;
                                            }
                                        }
                                        if (this.field4985 == null && this.field4971 != null) {
                                            this.field4971.field6343 = null;
                                        }
                                        if (this.field4985 != null) {
                                            this.field4985.field6343 = null;
                                        }
                                        if (var6.field4985 == null && var6.field4971 != null) {
                                            var6.field4971.field6343 = null;
                                        }
                                        if (var6.field4985 != null) {
                                            var6.field4985.field6343 = null;
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

    @OriginalMember(owner = "client!sg", name = "BA", descriptor = "(SS)V", line = 569)
    public final void method654(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5003; var3++) {
            if (this.field4953[var3] == arg0) {
                this.field4953[var3] = arg1;
            }
        }
        field4989++;
        if (this.field5011 != null) {
            for (int var4 = 0; var4 < this.field5026; var4++) {
                class377 var5 = this.field5011[var4];
                class430 var6 = this.field4988[var4];
                var6.field6383 = class461.field6721[this.field4953[var5.field5678] & 0xFFFF] & 0xFFFFFF | var6.field6383 & 0xFF000000;
            }
        }
        if (this.field4971 != null) {
            this.field4971.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZB)V", line = 612)
    private final void method2008(boolean arg0, byte arg1) {
        if (this.field4984.field3733.field6868.length >= this.field5032 * 6) {
            this.field4984.field3733.field6830 = 0;
        } else {
            this.field4984.field3733 = new class299((this.field5032 + 100) * 6);
        }
        field4954++;
        class299 var3 = this.field4984.field3733;
        if (arg1 != 116) {
            this.field4962 = null;
        }
        if (this.field4984.field3821) {
            for (int var4 = 0; var4 < this.field5032; var4++) {
                var3.method2777((byte) 74, this.field5012[var4]);
                var3.method2777((byte) 74, this.field4975[var4]);
                var3.method2777((byte) 74, this.field5021[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field5032; var5++) {
                var3.method2760(true, this.field5012[var5]);
                var3.method2760(true, this.field4975[var5]);
                var3.method2760(true, this.field5021[var5]);
            }
        }
        if (var3.field6830 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5058 == null) {
                this.field5058 = this.field4984.method1565(5123, var3.field6868, true, var3.field6830, -6407);
            } else {
                this.field5058.method1201((byte) -23, 5123, var3.field6830, var3.field6868);
            }
            this.field5034.field7603 = this.field5058;
        } else {
            this.field5034.field7603 = this.field4984.method1565(5123, var3.field6868, false, var3.field6830, arg1 ^ 0xFFFFE68D);
        }
        if (!arg0) {
            this.field5019 = true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "(IIII)V", line = 677)
    public final void method638(int arg0, int arg1, int arg2, int arg3) {
        field5023++;
        if (arg0 == 0) {
            class62.field838 = 0;
            class271.field4041 = 0;
            int var5 = 0;
            class411.field6212 = 0;
            for (int var6 = 0; var6 < this.field4978; var6++) {
                class411.field6212 += this.field4995[var6];
                class271.field4041 += this.field4959[var6];
                class62.field838 += this.field5038[var6];
                var5++;
            }
            if (var5 <= 0) {
                class411.field6212 = arg1;
                class271.field4041 = arg2;
                class62.field838 = arg3;
            } else {
                class271.field4041 = class271.field4041 / var5 + arg2;
                class411.field6212 = class411.field6212 / var5 + arg1;
                class62.field838 = class62.field838 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4978; var7++) {
                this.field4995[var7] += arg1;
                this.field4959[var7] += arg2;
                this.field5038[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4978; var8++) {
                this.field4995[var8] -= class411.field6212;
                this.field4959[var8] -= class271.field4041;
                this.field5038[var8] -= class62.field838;
                if (arg3 != 0) {
                    int var9 = class445.field6545[arg3];
                    int var10 = class445.field6544[arg3];
                    int var11 = this.field4995[var8] * var10 + (this.field4959[var8] * var9 + 32767) >> 15;
                    this.field4959[var8] = this.field4959[var8] * var10 + 32767 - (this.field4995[var8] * var9) >> 15;
                    this.field4995[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class445.field6545[arg1];
                    int var13 = class445.field6544[arg1];
                    int var14 = this.field4959[var8] * var13 + 32767 - (this.field5038[var8] * var12) >> 15;
                    this.field5038[var8] = this.field4959[var8] * var12 + this.field5038[var8] * var13 + 32767 >> 15;
                    this.field4959[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class445.field6545[arg2];
                    int var16 = class445.field6544[arg2];
                    int var17 = this.field5038[var8] * var15 + this.field4995[var8] * var16 + 32767 >> 15;
                    this.field5038[var8] = this.field5038[var8] * var16 + 32767 - (this.field4995[var8] * var15) >> 15;
                    this.field4995[var8] = var17;
                }
                this.field4995[var8] += class411.field6212;
                this.field4959[var8] += class271.field4041;
                this.field5038[var8] += class62.field838;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4978; var18++) {
                this.field4995[var18] -= class411.field6212;
                this.field4959[var18] -= class271.field4041;
                this.field5038[var18] -= class62.field838;
                this.field4995[var18] = this.field4995[var18] * arg1 / 128;
                this.field4959[var18] = this.field4959[var18] * arg2 / 128;
                this.field5038[var18] = this.field5038[var18] * arg3 / 128;
                this.field4995[var18] += class411.field6212;
                this.field4959[var18] += class271.field4041;
                this.field5038[var18] += class62.field838;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5003; var19++) {
                int var23 = (this.field5009[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5009[var19] = (byte) var23;
            }
            if (this.field4971 != null) {
                this.field4971.field6343 = null;
            }
            if (this.field5011 != null) {
                for (int var20 = 0; var20 < this.field5026; var20++) {
                    class377 var21 = this.field5011[var20];
                    class430 var22 = this.field4988[var20];
                    var22.field6383 = 255 - (this.field5009[var21.field5678] & 0xFF) << 24 | var22.field6383 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5003; var24++) {
                int var28 = this.field4953[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = arg2 / 4 + var30;
                int var32 = arg1 + var29 & 0x3F;
                int var33 = var28 & 0x7F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var33;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field4953[var24] = (short) class390.method2340(class390.method2340(var32 << 10, var31 << 7), var34);
            }
            if (this.field4971 != null) {
                this.field4971.field6343 = null;
            }
            if (this.field5011 != null) {
                for (int var25 = 0; var25 < this.field5026; var25++) {
                    class377 var26 = this.field5011[var25];
                    class430 var27 = this.field4988[var25];
                    var27.field6383 = var27.field6383 & 0xFF000000 | class461.field6721[this.field4953[var26.field5678] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5026; var35++) {
                class430 var36 = this.field4988[var35];
                var36.field6388 += arg1;
                var36.field6384 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5026; var37++) {
                class430 var38 = this.field4988[var37];
                var38.field6385 = var38.field6385 * arg2 >> 7;
                var38.field6381 = var38.field6381 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5026; var39++) {
                class430 var40 = this.field4988[var39];
                var40.field6389 = var40.field6389 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lc;Lqb;II)V", line = 983)
    public final void method598(class511 arg0, class518 arg1, int arg2, int arg3) {
        field5018++;
        if (this.field4999 == 0) {
            return;
        }
        class446 var5 = this.field4984.field3737;
        class446 var6 = (class446) arg0;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        class515.field7561 = var5.field6568 * var6.field6586 + var5.field6590 * var6.field6577 + var5.field6586 * var6.field6565;
        class254.field3450 = var5.field6568 * var6.field6566 + var5.field6590 * var6.field6574 + var5.field6586 * var6.field6589 + var5.field6566;
        float var7 = (float) this.field4968 * class515.field7561 + class254.field3450;
        float var8 = (float) this.field4981 * class515.field7561 + class254.field3450;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field4960 + var7;
            var10 = var8 - (float) this.field4960;
        } else {
            var9 = (float) this.field4960 + var8;
            var10 = (float) (-this.field4960) + var7;
        }
        if ((this.field4984.field3843 <= var10) || (var9 <= (float) this.field4984.field3747)) {
            return;
        }
        class498.field7387 = var5.field6597 * var6.field6566 + var5.field6598 * var6.field6574 + var5.field6577 * var6.field6589 + var5.field6574;
        class521.field7667 = var5.field6597 * var6.field6586 + var5.field6598 * var6.field6577 + var5.field6577 * var6.field6565;
        float var11 = (float) this.field4968 * class521.field7667 + class498.field7387;
        float var12 = (float) this.field4981 * class521.field7667 + class498.field7387;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var14 = ((float) this.field4960 + var11) * (float) this.field4984.field3835;
            var13 = (var12 - (float) this.field4960) * (float) this.field4984.field3835;
        } else {
            var13 = ((float) (-this.field4960) + var11) * (float) this.field4984.field3835;
            var14 = ((float) this.field4960 + var12) * (float) this.field4984.field3835;
        }
        if ((var13 / (float) arg2 >= this.field4984.field3748) || (var14 / (float) arg2 <= this.field4984.field3836)) {
            return;
        }
        class10.field94 = var5.field6581 * var6.field6586 + var5.field6567 * var6.field6577 + var5.field6565 * var6.field6565;
        class332.field5152 = var5.field6581 * var6.field6566 + var5.field6567 * var6.field6574 + var5.field6565 * var6.field6589 + var5.field6589;
        float var15 = (float) this.field4968 * class10.field94 + class332.field5152;
        float var16 = (float) this.field4981 * class10.field94 + class332.field5152;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = (var16 - (float) this.field4960) * (float) this.field4984.field3784;
            var17 = ((float) this.field4960 + var15) * (float) this.field4984.field3784;
        } else {
            var17 = ((float) this.field4960 + var16) * (float) this.field4984.field3784;
            var18 = (var15 - (float) this.field4960) * (float) this.field4984.field3784;
        }
        if ((var18 / (float) arg2 >= this.field4984.field3754) || (this.field4984.field3800 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field5011 != null) {
            class424.field6328 = var5.field6581 * var6.field6568 + var5.field6567 * var6.field6597 + var5.field6565 * var6.field6581;
            class172.field2519 = var5.field6597 * var6.field6590 + var5.field6598 * var6.field6598 + var5.field6577 * var6.field6567;
            class375.field5665 = var5.field6597 * var6.field6568 + var5.field6598 * var6.field6597 + var5.field6577 * var6.field6581;
            class11.field98 = var5.field6568 * var6.field6568 + var5.field6590 * var6.field6597 + var5.field6586 * var6.field6581;
            class340.field5241 = var5.field6581 * var6.field6590 + var5.field6567 * var6.field6598 + var5.field6565 * var6.field6567;
            class224.field3172 = var5.field6568 * var6.field6590 + var5.field6590 * var6.field6598 + var5.field6586 * var6.field6567;
        }
        if (arg1 != null) {
            int var19 = this.field5054 + this.field5057 >> 1;
            int var20 = this.field5044 + this.field4970 >> 1;
            int var21 = (int) ((float) var20 * class375.field5665 + (float) this.field4968 * class521.field7667 + (float) var19 * class172.field2519 + class498.field7387);
            int var22 = (int) ((float) var20 * class424.field6328 + (float) this.field4968 * class10.field94 + (float) var19 * class340.field5241 + class332.field5152);
            int var23 = (int) ((float) var20 * class11.field98 + (float) this.field4968 * class515.field7561 + (float) var19 * class224.field3172 + class254.field3450);
            int var24 = (int) ((float) var20 * class375.field5665 + (float) this.field4981 * class521.field7667 + (float) var19 * class172.field2519 + class498.field7387);
            int var25 = (int) ((float) var20 * class424.field6328 + (float) this.field4981 * class10.field94 + (float) var19 * class340.field5241 + class332.field5152);
            arg1.field7599 = this.field4984.field3828 + (this.field4984.field3784 * var25 / arg2);
            arg1.field7601 = this.field4984.field3784 * var22 / arg2 + this.field4984.field3828;
            int var26 = (int) ((float) var20 * class11.field98 + (float) this.field4981 * class515.field7561 + (float) var19 * class224.field3172 + class254.field3450);
            arg1.field7597 = this.field4984.field3835 * var21 / arg2 + this.field4984.field3779;
            arg1.field7596 = this.field4984.field3835 * var24 / arg2 + this.field4984.field3779;
            if (var23 < this.field4984.field3747 && this.field4984.field3747 > var26) {
                arg1.field7598 = (this.field4960 + var21) * this.field4984.field3835 / arg2 + this.field4984.field3779 - arg1.field7597;
                arg1.field7600 = true;
            }
        }
        this.field4984.method1555(81, (float) arg2);
        this.field4984.method1572(12770);
        this.field4984.method1603((byte) 37, var6);
        this.method2012((byte) -92);
        this.field4984.method1570(7377);
        this.method2009((byte) -63);
    }

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "(I[IIIIZI[I)V", line = 1136)
    public final void method615(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5037++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            class271.field4041 = 0;
            int var13 = 0;
            class62.field838 = 0;
            class411.field6212 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4976.length) {
                    int[] var16 = this.field4976[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5030 == null || (this.field5030[var18] & arg6) != 0) {
                            class411.field6212 += this.field4995[var18];
                            class271.field4041 += this.field4959[var18];
                            var13++;
                            class62.field838 += this.field5038[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class411.field6212 = var12;
                class271.field4041 = var10;
                class62.field838 = var11;
            } else {
                class271.field4041 = class271.field4041 / var13 + var10;
                class454.field6663 = true;
                class62.field838 = class62.field838 / var13 + var11;
                class411.field6212 = class411.field6212 / var13 + var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[1] * arg3 + (arg7[0] * arg2 + (arg7[2] * arg4)) + 16384 >> 15;
                int var20 = arg7[5] * arg4 + (arg7[3] * arg2 + (arg7[4] * arg3)) + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg3 << 4;
            int var23 = arg2 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (this.field4976.length > var26) {
                    int[] var27 = this.field4976[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5030 == null || (this.field5030[var29] & arg6) != 0) {
                            this.field4995[var29] += var23;
                            this.field4959[var29] += var22;
                            this.field5038[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field4976.length) {
                        int[] var110 = this.field4976[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5030 == null || (this.field5030[var112] & arg6) != 0) {
                                this.field4995[var112] -= class411.field6212;
                                this.field4959[var112] -= class271.field4041;
                                this.field5038[var112] -= class62.field838;
                                if (arg4 != 0) {
                                    int var113 = class445.field6545[arg4];
                                    int var114 = class445.field6544[arg4];
                                    int var115 = this.field4959[var112] * var113 + this.field4995[var112] * var114 + 32767 >> 15;
                                    this.field4959[var112] = this.field4959[var112] * var114 - (this.field4995[var112] * var113 - 32767) >> 15;
                                    this.field4995[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class445.field6545[arg2];
                                    int var117 = class445.field6544[arg2];
                                    int var118 = this.field4959[var112] * var117 + 32767 - (this.field5038[var112] * var116) >> 15;
                                    this.field5038[var112] = this.field5038[var112] * var117 + this.field4959[var112] * var116 + 32767 >> 15;
                                    this.field4959[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class445.field6545[arg3];
                                    int var120 = class445.field6544[arg3];
                                    int var121 = this.field5038[var112] * var119 + this.field4995[var112] * var120 + 32767 >> 15;
                                    this.field5038[var112] = this.field5038[var112] * var120 + 32767 - (this.field4995[var112] * var119) >> 15;
                                    this.field4995[var112] = var121;
                                }
                                this.field4995[var112] += class411.field6212;
                                this.field4959[var112] += class271.field4041;
                                this.field5038[var112] += class62.field838;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field4976.length) {
                            int[] var93 = this.field4976[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5030 == null || (this.field5030[var95] & arg6) != 0) {
                                    int var96 = this.field5035[var95];
                                    int var97 = this.field5035[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field5020[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class445.field6545[arg4];
                                            int var101 = class445.field6544[arg4];
                                            int var102 = this.field5029[var99] * var100 + this.field4962[var99] * var101 + 32767 >> 15;
                                            this.field5029[var99] = (short) (this.field5029[var99] * var101 + 32767 - (this.field4962[var99] * var100) >> 15);
                                            this.field4962[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class445.field6545[arg2];
                                            int var104 = class445.field6544[arg2];
                                            int var105 = this.field5029[var99] * var104 + 32767 - (this.field5006[var99] * var103) >> 15;
                                            this.field5006[var99] = (short) (this.field5029[var99] * var103 + this.field5006[var99] * var104 + 32767 >> 15);
                                            this.field5029[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class445.field6545[arg3];
                                            int var107 = class445.field6544[arg3];
                                            int var108 = this.field5006[var99] * var106 + this.field4962[var99] * var107 + 32767 >> 15;
                                            this.field5006[var99] = (short) (this.field5006[var99] * var107 + 32767 - (this.field4962[var99] * var106) >> 15);
                                            this.field4962[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field4985 == null && this.field4971 != null) {
                        this.field4971.field6343 = null;
                    }
                    if (this.field4985 != null) {
                        this.field4985.field6343 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class454.field6663) {
                    int var36 = arg7[0] * class411.field6212 - (-(arg7[3] * class271.field4041) - arg7[6] * class62.field838 - 16384) >> 15;
                    int var37 = arg7[1] * class411.field6212 + arg7[4] * class271.field4041 + (arg7[7] * class62.field838 - -16384) >> 15;
                    int var38 = var33 + var36;
                    int var39 = arg7[5] * class271.field4041 + arg7[8] * class62.field838 + arg7[2] * class411.field6212 + 16384 >> 15;
                    int var40 = var34 + var37;
                    class271.field4041 = var40;
                    int var41 = var35 + var39;
                    class411.field6212 = var38;
                    class454.field6663 = false;
                    class62.field838 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class445.field6544[arg2];
                int var44 = class445.field6545[arg2];
                int var45 = class445.field6544[arg3];
                int var46 = class445.field6545[arg3];
                int var47 = class445.field6544[arg4];
                int var48 = class445.field6545[arg4];
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                var42[6] = var45 * var50 + (-var46 * var47 + 16384) >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[1] = -var45 * var48 + (var46 * var49) + 16384 >> 15;
                var42[0] = var45 * var47 + (var46 * var50 + 16384) >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[2] = var43 * var46 + 16384 >> 15;
                int var51 = var42[2] * -class62.field838 + var42[0] * -class411.field6212 + (var42[1] * -class271.field4041) + 16384 >> 15;
                int var52 = var42[4] * -class271.field4041 + var42[5] * -class62.field838 + var42[3] * -class411.field6212 + 16384 >> 15;
                int var53 = var42[8] * -class62.field838 + var42[7] * -class271.field4041 + var42[6] * -class411.field6212 + 16384 >> 15;
                int var54 = class411.field6212 + var51;
                int var55 = class271.field4041 + var52;
                int var56 = class62.field838 + var53;
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
                int var59 = var42[0] * var33 + (var42[1] * var34) - (-(var42[2] * var35) - 16384) >> 15;
                int var60 = var42[4] * var34 + var42[3] * var33 + (var42[5] * var35) + 16384 >> 15;
                int var61 = var42[6] * var33 + (var42[7] * var34) + var42[8] * var35 + 16384 >> 15;
                int var62 = var55 + var60;
                int var63 = var54 + var59;
                int var64 = var56 + var61;
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
                int var67 = arg7[2] * var64 + (arg7[0] * var63 + (arg7[1] * var62)) + 16384 >> 15;
                int var68 = arg7[3] * var63 + arg7[4] * var62 + arg7[5] * var64 + 16384 >> 15;
                int var69 = arg7[8] * var64 + arg7[6] * var63 + (arg7[7] * var62) + 16384 >> 15;
                int var70 = var31 + var68;
                int var71 = var30 + var67;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field4976.length) {
                        int[] var75 = this.field4976[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5030 == null || (arg6 & this.field5030[var77]) != 0) {
                                int var78 = this.field4995[var77] * var65[0] + this.field4959[var77] * var65[1] + (this.field5038[var77] * var65[2]) + 16384 >> 15;
                                int var79 = this.field4995[var77] * var65[3] + (this.field4959[var77] * var65[4]) + (this.field5038[var77] * var65[5]) + 16384 >> 15;
                                int var80 = var71 + var78;
                                int var81 = this.field5038[var77] * var65[8] + this.field4995[var77] * var65[6] + this.field4959[var77] * var65[7] + 16384 >> 15;
                                int var82 = var70 + var79;
                                this.field4995[var77] = var80;
                                int var83 = var72 + var81;
                                this.field4959[var77] = var82;
                                this.field5038[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field4976.length) {
                        int[] var174 = this.field4976[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5030 == null || (this.field5030[var176] & arg6) != 0) {
                                this.field4995[var176] -= class411.field6212;
                                this.field4959[var176] -= class271.field4041;
                                this.field5038[var176] -= class62.field838;
                                this.field4995[var176] = this.field4995[var176] * arg2 >> 7;
                                this.field4959[var176] = this.field4959[var176] * arg3 >> 7;
                                this.field5038[var176] = this.field5038[var176] * arg4 >> 7;
                                this.field4995[var176] += class411.field6212;
                                this.field4959[var176] += class271.field4041;
                                this.field5038[var176] += class62.field838;
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
                if (class454.field6663) {
                    int var128 = arg7[0] * class411.field6212 + (arg7[3] * class271.field4041) + arg7[6] * class62.field838 + 16384 >> 15;
                    int var129 = arg7[1] * class411.field6212 + arg7[4] * class271.field4041 + arg7[7] * class62.field838 + 16384 >> 15;
                    int var130 = arg7[5] * class271.field4041 + arg7[2] * class411.field6212 + arg7[8] * class62.field838 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    class411.field6212 = var131;
                    int var133 = var127 + var130;
                    class271.field4041 = var132;
                    class454.field6663 = false;
                    class62.field838 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class411.field6212 * var134 + 16384 >> 15;
                int var138 = -class271.field4041 * var135 + 16384 >> 15;
                int var139 = -class62.field838 * var136 + 16384 >> 15;
                int var140 = var137 + class411.field6212;
                int var141 = var138 + class271.field4041;
                int var142 = class62.field838 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var140 + var144;
                int var147 = var141 + var145;
                int var148 = var127 * var136 + 16384 >> 15;
                int var149 = var142 + var148;
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
                int var152 = arg7[0] * var146 + arg7[2] * var149 + arg7[1] * var147 + 16384 >> 15;
                int var153 = arg7[3] * var146 + (arg7[5] * var149) + arg7[4] * var147 + 16384 >> 15;
                int var154 = arg7[8] * var149 + arg7[7] * var147 + arg7[6] * var146 + 16384 >> 15;
                int var155 = var123 + var153;
                int var156 = var122 + var152;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field4976.length) {
                        int[] var160 = this.field4976[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5030 == null || (arg6 & this.field5030[var162]) != 0) {
                                int var163 = this.field5038[var162] * var150[2] + this.field4995[var162] * var150[0] + this.field4959[var162] * var150[1] + 16384 >> 15;
                                int var164 = this.field5038[var162] * var150[5] + this.field4995[var162] * var150[3] + this.field4959[var162] * var150[4] + 16384 >> 15;
                                int var165 = this.field4995[var162] * var150[6] + this.field4959[var162] * var150[7] + (this.field5038[var162] * var150[8]) + 16384 >> 15;
                                int var166 = var156 + var163;
                                int var167 = var155 + var164;
                                int var168 = var157 + var165;
                                this.field4995[var162] = var166;
                                this.field4959[var162] = var167;
                                this.field5038[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5015 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field5015.length > var181) {
                        int[] var182 = this.field5015[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field4969 == null || (arg6 & this.field4969[var184]) != 0) {
                                int var185 = (this.field5009[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5009[var184] = (byte) var185;
                                if (this.field4971 != null) {
                                    this.field4971.field6343 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5011 != null) {
                    for (int var178 = 0; var178 < this.field5026; var178++) {
                        class377 var179 = this.field5011[var178];
                        class430 var180 = this.field4988[var178];
                        var180.field6383 = var180.field6383 & 0xFFFFFF | 255 - (this.field5009[var179.field5678] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5015 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field5015.length > var190) {
                        int[] var191 = this.field5015[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field4969 == null || (this.field4969[var193] & arg6) != 0) {
                                int var194 = this.field4953[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFF07) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
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
                                this.field4953[var193] = (short) class390.method2340(class390.method2340(var198 << 10, var199 << 7), var200);
                                if (this.field4971 != null) {
                                    this.field4971.field6343 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5011 != null) {
                    for (int var187 = 0; var187 < this.field5026; var187++) {
                        class377 var188 = this.field5011[var187];
                        class430 var189 = this.field4988[var187];
                        var189.field6383 = class461.field6721[this.field4953[var188.field5678] & 0xFFFF] & 0xFFFFFF | var189.field6383 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5002 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5002.length > var202) {
                        int[] var203 = this.field5002[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class430 var205 = this.field4988[var203[var204]];
                            var205.field6384 += arg3;
                            var205.field6388 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5002 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field5002.length) {
                        int[] var208 = this.field5002[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class430 var210 = this.field4988[var208[var209]];
                            var210.field6385 = var210.field6385 * arg3 >> 7;
                            var210.field6381 = var210.field6381 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5002 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field5002.length > var212) {
                    int[] var213 = this.field5002[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class430 var215 = this.field4988[var213[var214]];
                        var215.field6389 = var215.field6389 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V", line = 2124)
    private final void method2009(byte arg0) {
        if (this.field5011 != null) {
            class446 var2 = this.field4984.field3699;
            float var3 = this.field4984.method82();
            float var4 = this.field4984.method157();
            this.field4984.method1541(-84);
            this.field4984.method134(false);
            this.field4984.method1574(false, -128);
            this.field4984.method1597(this.field4984.field3826, null, -1, null, this.field4984.field3762);
            for (int var5 = 0; var5 < this.field5026; var5++) {
                class377 var6 = this.field5011[var5];
                class430 var7 = this.field4988[var5];
                if (!var6.field5675 || !this.field4984.method124()) {
                    float var8 = (float) (this.field4995[var6.field5687] + this.field4995[var6.field5679] + this.field4995[var6.field5680]) * 0.3333333F;
                    float var9 = (float) (this.field4959[var6.field5679] + this.field4959[var6.field5687] + this.field4959[var6.field5680]) * 0.3333333F;
                    float var10 = (float) (this.field5038[var6.field5679] + this.field5038[var6.field5687] + this.field5038[var6.field5680]) * 0.3333333F;
                    float var11 = class375.field5665 * var10 + class521.field7667 * var9 + class172.field2519 * var8 + class498.field7387;
                    float var12 = class424.field6328 * var10 + class340.field5241 * var8 + class10.field94 * var9 + class332.field5152;
                    float var13 = class11.field98 * var10 + class515.field7561 * var9 + class224.field3172 * var8 + class254.field3450;
                    var2.method2614((float) var7.field6384 - var12, var6.field5677 * var7.field6381 >> 7, var6.field5686 * var7.field6385 >> 7, -1, (float) var7.field6388 + var11, -var13, var7.field6389);
                    this.field4984.method1616(var2, -26305);
                    this.field4984.method154(var4, var3 - ((float) var6.field5676 * 1.5F));
                    int var14 = var7.field6383;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field4984.method1613(var6.field5685, -1);
                    this.field4984.method1594(var6.field5682, 256);
                    this.field4984.method1582(var6.field5684, true);
                    this.field4984.method1605(0, 4, -98, 7);
                }
            }
            this.field4984.method154(var4, var3);
            this.field4984.method134(true);
            this.field4984.method1570(7377);
        }
        field5022++;
        if (arg0 > -38) {
            this.method650(87);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLsg;ZZLsg;I)Lt;", line = 2194)
    private final class398 method2010(byte arg0, class324 arg1, boolean arg2, boolean arg3, class324 arg4, int arg5) {
        arg1.field4991 = 0;
        arg1.field4999 = this.field4999;
        arg1.field5026 = this.field5026;
        arg1.field5032 = this.field5032;
        arg1.field4966 = this.field4966;
        arg1.field5045 = arg5;
        arg1.field4980 = this.field4980;
        arg1.field5003 = this.field5003;
        arg1.field4978 = this.field4978;
        arg1.field5007 = this.field5007;
        field4992++;
        arg1.field5053 = this.field5053;
        boolean var7 = class511.method3014(3652, this.field4980, arg5);
        boolean var8 = class316.method1976(true, arg5, this.field4980);
        boolean var9 = class268.method1670(arg5, (byte) 4, this.field4980);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg1.field4995 = this.field4995;
            } else if (arg4.field4995 == null || this.field4966 > arg4.field4995.length) {
                arg1.field4995 = arg4.field4995 = new int[this.field4966];
            } else {
                arg1.field4995 = arg4.field4995;
            }
            if (!var8) {
                arg1.field4959 = this.field4959;
            } else if (arg4.field4959 == null || arg4.field4959.length < this.field4966) {
                arg1.field4959 = arg4.field4959 = new int[this.field4966];
            } else {
                arg1.field4959 = arg4.field4959;
            }
            if (!var9) {
                arg1.field5038 = this.field5038;
            } else if (arg4.field5038 == null || this.field4966 > arg4.field5038.length) {
                arg1.field5038 = arg4.field5038 = new int[this.field4966];
            } else {
                arg1.field5038 = arg4.field5038;
            }
            for (int var11 = 0; var11 < this.field4966; var11++) {
                if (var7) {
                    arg1.field4995[var11] = this.field4995[var11];
                }
                if (var8) {
                    arg1.field4959[var11] = this.field4959[var11];
                }
                if (var9) {
                    arg1.field5038[var11] = this.field5038[var11];
                }
            }
        } else {
            arg1.field5038 = this.field5038;
            arg1.field4995 = this.field4995;
            arg1.field4959 = this.field4959;
        }
        if (class328.method2040(arg5, this.field4980, 13430)) {
            arg1.field4979 = arg4.field4979;
            if (arg3) {
                arg1.field4991 = (byte) (arg1.field4991 | 0x1);
            }
            arg1.field4979.field6348 = this.field4979.field6348;
            arg1.field4979.field6343 = this.field4979.field6343;
        } else if (class403.method2434(arg5, (byte) 111, this.field4980)) {
            arg1.field4979 = this.field4979;
        } else {
            arg1.field4979 = null;
        }
        if (class487.method2910(arg5, this.field4980, -102)) {
            if (arg4.field4953 == null || arg4.field4953.length < this.field5003) {
                arg1.field4953 = arg4.field4953 = new short[this.field5003];
            } else {
                arg1.field4953 = arg4.field4953;
            }
            for (int var12 = 0; var12 < this.field5003; var12++) {
                arg1.field4953[var12] = this.field4953[var12];
            }
        } else {
            arg1.field4953 = this.field4953;
        }
        if (class173.method1188(-65, this.field4980, arg5)) {
            if (arg4.field5009 == null || this.field5003 > arg4.field5009.length) {
                arg1.field5009 = arg4.field5009 = new byte[this.field5003];
            } else {
                arg1.field5009 = arg4.field5009;
            }
            for (int var13 = 0; var13 < this.field5003; var13++) {
                arg1.field5009[var13] = this.field5009[var13];
            }
        } else {
            arg1.field5009 = this.field5009;
        }
        if (class242.method1474(arg5, -47, this.field4980)) {
            if (arg3) {
                arg1.field4991 = (byte) (arg1.field4991 | 0x2);
            }
            arg1.field4971 = arg4.field4971;
            arg1.field4971.field6348 = this.field4971.field6348;
            arg1.field4971.field6343 = this.field4971.field6343;
        } else if (class326.method2027(arg5, this.field4980, 0)) {
            arg1.field4971 = this.field4971;
        } else {
            arg1.field4971 = null;
        }
        if (class191.method1275(arg5, -545, this.field4980)) {
            if (arg4.field4962 == null || this.field4999 > arg4.field4962.length) {
                int var14 = this.field4999;
                arg1.field4962 = arg4.field4962 = new short[var14];
                arg1.field5029 = arg4.field5029 = new short[var14];
                arg1.field5006 = arg4.field5006 = new short[var14];
            } else {
                arg1.field4962 = arg4.field4962;
                arg1.field5006 = arg4.field5006;
                arg1.field5029 = arg4.field5029;
            }
            if (this.field4990 == null) {
                for (int var18 = 0; var18 < this.field4999; var18++) {
                    arg1.field4962[var18] = this.field4962[var18];
                    arg1.field5029[var18] = this.field5029[var18];
                    arg1.field5006[var18] = this.field5006[var18];
                }
            } else {
                if (arg4.field4990 == null) {
                    arg4.field4990 = new class298();
                }
                class298 var15 = arg1.field4990 = arg4.field4990;
                if (var15.field4432 == null || var15.field4432.length < this.field4999) {
                    int var16 = this.field4999;
                    var15.field4433 = new short[var16];
                    var15.field4436 = new byte[var16];
                    var15.field4437 = new short[var16];
                    var15.field4432 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field4999; var17++) {
                    arg1.field4962[var17] = this.field4962[var17];
                    arg1.field5029[var17] = this.field5029[var17];
                    arg1.field5006[var17] = this.field5006[var17];
                    var15.field4432[var17] = this.field4990.field4432[var17];
                    var15.field4433[var17] = this.field4990.field4433[var17];
                    var15.field4437[var17] = this.field4990.field4437[var17];
                    var15.field4436[var17] = this.field4990.field4436[var17];
                }
            }
            arg1.field5063 = this.field5063;
        } else {
            arg1.field5063 = this.field5063;
            arg1.field4990 = this.field4990;
            arg1.field4962 = this.field4962;
            arg1.field5029 = this.field5029;
            arg1.field5006 = this.field5006;
        }
        if (class120.method903(this.field4980, -8382, arg5)) {
            if (arg3) {
                arg1.field4991 = (byte) (arg1.field4991 | 0x4);
            }
            arg1.field4985 = arg4.field4985;
            arg1.field4985.field6343 = this.field4985.field6343;
            arg1.field4985.field6348 = this.field4985.field6348;
        } else if (class532.method3158(arg5, false, this.field4980)) {
            arg1.field4985 = this.field4985;
        } else {
            arg1.field4985 = null;
        }
        if (class330.method2043(arg5, true, this.field4980)) {
            if (arg4.field4974 == null || this.field5003 > arg4.field4974.length) {
                int var19 = this.field4999;
                arg1.field4974 = arg4.field4974 = new float[var19];
                arg1.field5013 = arg4.field5013 = new float[var19];
            } else {
                arg1.field4974 = arg4.field4974;
                arg1.field5013 = arg4.field5013;
            }
            for (int var20 = 0; var20 < this.field4999; var20++) {
                arg1.field4974[var20] = this.field4974[var20];
                arg1.field5013[var20] = this.field5013[var20];
            }
        } else {
            arg1.field4974 = this.field4974;
            arg1.field5013 = this.field5013;
        }
        if (class465.method2699(arg5, this.field4980, -123)) {
            if (arg3) {
                arg1.field4991 = (byte) (arg1.field4991 | 0x8);
            }
            arg1.field4972 = arg4.field4972;
            arg1.field4972.field6348 = this.field4972.field6348;
            arg1.field4972.field6343 = this.field4972.field6343;
        } else if (class58.method418(101, arg5, this.field4980)) {
            arg1.field4972 = this.field4972;
        } else {
            arg1.field4972 = null;
        }
        if (arg0 >= -66) {
            this.field5053 = -21;
        }
        if (class506.method2989(this.field4980, 82, arg5)) {
            if (arg4.field5012 == null || this.field5003 > arg4.field5012.length) {
                int var21 = this.field5003;
                arg1.field5021 = arg4.field5021 = new short[var21];
                arg1.field4975 = arg4.field4975 = new short[var21];
                arg1.field5012 = arg4.field5012 = new short[var21];
            } else {
                arg1.field5021 = arg4.field5021;
                arg1.field4975 = arg4.field4975;
                arg1.field5012 = arg4.field5012;
            }
            for (int var22 = 0; var22 < this.field5003; var22++) {
                arg1.field5012[var22] = this.field5012[var22];
                arg1.field4975[var22] = this.field4975[var22];
                arg1.field5021[var22] = this.field5021[var22];
            }
        } else {
            arg1.field5012 = this.field5012;
            arg1.field5021 = this.field5021;
            arg1.field4975 = this.field4975;
        }
        if (class341.method2082(arg5, this.field4980, 118)) {
            arg1.field5034 = arg4.field5034;
            if (arg3) {
                arg1.field4991 = (byte) (arg1.field4991 | 0x10);
            }
            arg1.field5034.field7603 = this.field5034.field7603;
        } else if (class87.method687(this.field4980, 2048, arg5)) {
            arg1.field5034 = this.field5034;
        } else {
            arg1.field5034 = null;
        }
        if (class411.method2463(arg5, this.field4980, (byte) 50)) {
            if (arg4.field4967 == null || arg4.field4967.length < this.field5003) {
                int var23 = this.field5003;
                arg1.field4967 = arg4.field4967 = new short[var23];
            } else {
                arg1.field4967 = arg4.field4967;
            }
            for (int var24 = 0; var24 < this.field5003; var24++) {
                arg1.field4967[var24] = this.field4967[var24];
            }
        } else {
            arg1.field4967 = this.field4967;
        }
        if (!class483.method2884(arg5, this.field4980, (byte) -113)) {
            arg1.field4988 = this.field4988;
        } else if (arg4.field4988 == null || this.field5026 > arg4.field4988.length) {
            int var26 = this.field5026;
            arg1.field4988 = arg4.field4988 = new class430[var26];
            for (int var27 = 0; var27 < this.field5026; var27++) {
                arg1.field4988[var27] = this.field4988[var27].method2539((byte) 114);
            }
        } else {
            arg1.field4988 = arg4.field4988;
            for (int var25 = 0; var25 < this.field5026; var25++) {
                arg1.field4988[var25].method2542((byte) -48, this.field4988[var25]);
            }
        }
        arg1.field5004 = this.field5004;
        arg1.field5052 = this.field5052;
        arg1.field5011 = this.field5011;
        arg1.field4976 = this.field4976;
        arg1.field5002 = this.field5002;
        arg1.field4963 = this.field4963;
        arg1.field5015 = this.field5015;
        arg1.field5030 = this.field5030;
        if (this.field5001) {
            arg1.field4981 = this.field4981;
            arg1.field5044 = this.field5044;
            arg1.field5057 = this.field5057;
            arg1.field4970 = this.field4970;
            arg1.field5001 = true;
            arg1.field5054 = this.field5054;
            arg1.field4968 = this.field4968;
            arg1.field4960 = this.field4960;
        } else {
            arg1.field5001 = false;
        }
        arg1.field4969 = this.field4969;
        arg1.field5035 = this.field5035;
        arg1.field5020 = this.field5020;
        return arg1;
    }

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "()I", line = 2653)
    public final int method612() {
        field5047++;
        return this.field5007;
    }

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "()Z", line = 2665)
    public final boolean method641() {
        field4977++;
        if (this.field4976 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4966; var1++) {
            this.field4995[var1] <<= 0x4;
            this.field4959[var1] <<= 0x4;
            this.field5038[var1] <<= 0x4;
        }
        class411.field6212 = 0;
        class62.field838 = 0;
        class271.field4041 = 0;
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZ)V", line = 2693)
    private final void method2011(boolean arg0, boolean arg1) {
        field4957++;
        boolean var3 = this.field4971 != null && this.field4971.field6343 == null;
        boolean var4 = this.field4985 != null && this.field4985.field6343 == null;
        if (!arg1) {
            this.field5004 = null;
        }
        boolean var5 = this.field4979 != null && this.field4979.field6343 == null;
        boolean var6 = this.field4972 != null && this.field4972.field6343 == null;
        if (arg0) {
            var4 &= (this.field4991 & 0x4) != 0;
            var3 &= (this.field4991 & 0x2) != 0;
            var5 &= (this.field4991 & 0x1) != 0;
            var6 &= (this.field4991 & 0x8) != 0;
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
        if (this.field4984.field3733.field6868.length < (this.field4999 * var7)) {
            this.field4984.field3733 = new class299((this.field4999 + 100) * var7);
        } else {
            this.field4984.field3733.field6830 = 0;
        }
        class299 var12 = this.field4984.field3733;
        if (var5) {
            if (this.field4984.field3821) {
                for (int var13 = 0; var13 < this.field4978; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field4995[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field4959[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field5038[var13]);
                    int var17 = this.field5035[var13];
                    int var18 = this.field5035[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5020[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field6830 = var7 * var20;
                        var12.method2717(var14, 496598568);
                        var12.method2717(var15, 496598568);
                        var12.method2717(var16, 496598568);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field4978; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field4995[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field4959[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field5038[var21]);
                    int var25 = this.field5035[var21];
                    int var26 = this.field5035[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5020[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field6830 = var7 * var28;
                        var12.method2750(var22, true);
                        var12.method2750(var23, true);
                        var12.method2750(var24, true);
                    }
                }
            }
        }
        if (var3) {
            if (this.field4985 == null) {
                short[] var31;
                short[] var32;
                byte[] var33;
                short[] var34;
                if (this.field4990 == null) {
                    var33 = this.field5063;
                    var34 = this.field5029;
                    var32 = this.field4962;
                    var31 = this.field5006;
                } else {
                    var31 = this.field4990.field4437;
                    var32 = this.field4990.field4432;
                    var33 = this.field4990.field4436;
                    var34 = this.field4990.field4433;
                }
                float var35 = this.field4984.field3804[0];
                float var36 = this.field4984.field3804[1];
                float var37 = this.field4984.field3804[2];
                float var38 = this.field4984.field3771;
                float var39 = this.field4984.field3811 * 768.0F / (float) this.field5007;
                float var40 = this.field4984.field3827 * 768.0F / (float) this.field5007;
                for (int var41 = 0; var41 < this.field5003; var41++) {
                    int var42 = this.method2020(this.field5009[var41], (byte) -65, this.field4953[var41], this.field5053, this.field4967[var41]);
                    float var43 = (float) (var42 >>> 24) * this.field4984.field3778;
                    float var44 = (float) (var42 >> 16 & 0xFF) * this.field4984.field3739;
                    float var45 = (float) ((var42 & 0xFF48) >> 8) * this.field4984.field3775;
                    short var46 = this.field5012[var41];
                    short var47 = (short) var33[var46];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var46] * var37 + (float) var32[var46] * var35 + (float) var34[var46] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var46] * var37 + (float) var32[var46] * var35 + (float) var34[var46] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + (var48 < 0.0F ? var40 : var39) * var48;
                    int var50 = (int) (var43 * var49);
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
                    int var52 = (int) (var45 * var49);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field6830 = var7 * var46 + var9;
                    var12.method2754(var50, 5574);
                    var12.method2754(var51, 5574);
                    var12.method2754(var52, 5574);
                    var12.method2754(255 - (this.field5009[var41] & 0xFF), 5574);
                    short var53 = this.field4975[var41];
                    short var54 = (short) var33[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * (var55 < 0.0F ? var40 : var39);
                    int var57 = (int) (var43 * var56);
                    int var58 = (int) (var44 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var59 = (int) (var45 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    var12.field6830 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method2754(var57, 5574);
                    var12.method2754(var58, 5574);
                    var12.method2754(var59, 5574);
                    var12.method2754(255 - (this.field5009[var41] & 0xFF), 5574);
                    short var60 = this.field5021[var41];
                    short var61 = (short) var33[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = (var62 < 0.0F ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var43 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var44 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var45 * var63);
                    var12.field6830 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method2754(var64, 5574);
                    var12.method2754(var65, 5574);
                    var12.method2754(var66, 5574);
                    var12.method2754(255 - (this.field5009[var41] & 0xFF), 5574);
                }
            } else {
                for (int var29 = 0; var29 < this.field5003; var29++) {
                    int var30 = this.method2020(this.field5009[var29], (byte) -65, this.field4953[var29], this.field5053, this.field4967[var29]);
                    var12.field6830 = this.field5012[var29] * var7 + var9;
                    var12.method2717(var30, 496598568);
                    var12.field6830 = var9 + (this.field4975[var29] * var7);
                    var12.method2717(var30, 496598568);
                    var12.field6830 = this.field5021[var29] * var7 + var9;
                    var12.method2717(var30, 496598568);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field4990 == null) {
                var70 = this.field5063;
                var67 = this.field4962;
                var69 = this.field5029;
                var68 = this.field5006;
            } else {
                var67 = this.field4990.field4432;
                var68 = this.field4990.field4437;
                var69 = this.field4990.field4433;
                var70 = this.field4990.field4436;
            }
            float var71 = 3.0F / (float) this.field5007;
            float var72 = 3.0F / (float) (this.field5007 + (this.field5007 / 2));
            var12.field6830 = var10;
            if (this.field4984.field3821) {
                for (int var76 = 0; var76 < this.field4999; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1856((float) var67[var76] * var72, 191);
                        var12.method1856((float) var69[var76] * var72, 191);
                        var12.method1856((float) var68[var76] * var72, 191);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1856((float) var67[var76] * var78, 191);
                        var12.method1856((float) var69[var76] * var78, 191);
                        var12.method1856((float) var68[var76] * var78, 191);
                    }
                    var12.field6830 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field4999; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1854((byte) -80, (float) var67[var73] * var72);
                        var12.method1854((byte) -80, (float) var69[var73] * var72);
                        var12.method1854((byte) -80, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1854((byte) -80, (float) var67[var73] * var75);
                        var12.method1854((byte) -80, (float) var69[var73] * var75);
                        var12.method1854((byte) -80, (float) var68[var73] * var75);
                    }
                    var12.field6830 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field6830 = var11;
            if (this.field4984.field3821) {
                for (int var79 = 0; var79 < this.field4999; var79++) {
                    var12.method1856(this.field4974[var79], 191);
                    var12.method1856(this.field5013[var79], 191);
                    var12.field6830 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field4999; var80++) {
                    var12.method1854((byte) -80, this.field4974[var80]);
                    var12.method1854((byte) -80, this.field5013[var80]);
                    var12.field6830 += var7 - 8;
                }
            }
        }
        var12.field6830 = this.field4999 * var7;
        class246 var81;
        if (arg0) {
            if (this.field5033 == null) {
                this.field5033 = this.field4984.method1615(-128, var12.field6868, true, var7, var12.field6830);
            } else {
                this.field5033.method1193(true, var12.field6868, var12.field6830, var7);
            }
            this.field4991 = 0;
            var81 = this.field5033;
        } else {
            var81 = this.field4984.method1615(-98, var12.field6868, false, var7, var12.field6830);
            this.field5019 = true;
        }
        if (var5) {
            this.field4979.field6348 = var8;
            this.field4979.field6343 = var81;
        }
        if (var6) {
            this.field4972.field6343 = var81;
            this.field4972.field6348 = var11;
        }
        if (var3) {
            this.field4971.field6348 = var9;
            this.field4971.field6343 = var81;
        }
        if (var4) {
            this.field4985.field6348 = var10;
            this.field4985.field6343 = var81;
        }
    }

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "(I)V", line = 3213)
    public final void method650(int arg0) {
        field5025++;
        int var2 = class445.field6545[arg0];
        int var3 = class445.field6544[arg0];
        for (int var4 = 0; var4 < this.field4978; var4++) {
            int var5 = this.field5038[var4] * var2 + (this.field4995[var4] * var3) >> 15;
            this.field5038[var4] = this.field5038[var4] * var3 - this.field4995[var4] * var2 >> 15;
            this.field4995[var4] = var5;
        }
        this.field5001 = false;
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V", line = 3246)
    public final void method608(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5003; var5++) {
            int var9 = this.field4953[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE25) >> 10;
            int var11 = (var9 & 0x3B2) >> 7;
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field4953[var5] = (short) class390.method2340(var12, class390.method2340(var11 << 7, var10 << 10));
        }
        field4993++;
        if (this.field5011 != null) {
            for (int var6 = 0; var6 < this.field5026; var6++) {
                class377 var7 = this.field5011[var6];
                class430 var8 = this.field4988[var6];
                var8.field6383 = var8.field6383 & 0xFF000000 | class461.field6721[this.field4953[var7.field5678] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4971 != null) {
            this.field4971.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "(III)V", line = 3312)
    public final void method620(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4978; var4++) {
            if (arg0 != 128) {
                this.field4995[var4] = this.field4995[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4959[var4] = this.field4959[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5038[var4] = this.field5038[var4] * arg2 >> 7;
            }
        }
        field5016++;
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
        this.field5001 = false;
    }

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "(SS)V", line = 3346)
    public final void method649(short arg0, short arg1) {
        field5008++;
        class243 var3 = this.field4984.field101;
        for (int var4 = 0; var4 < this.field5003; var4++) {
            if (this.field4967[var4] == arg0) {
                this.field4967[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class161 var7 = var3.method1480(arg0 & 0xFFFF, 14270);
            var6 = var7.field2404;
            var5 = var7.field2419;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class161 var10 = var3.method1480(arg1 & 0xFFFF, 14270);
            var8 = var10.field2419;
            var9 = var10.field2404;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field5011 != null) {
            for (int var11 = 0; var11 < this.field5026; var11++) {
                class377 var12 = this.field5011[var11];
                class430 var13 = this.field4988[var11];
                var13.field6383 = var13.field6383 & 0xFF000000 | class461.field6721[this.field4953[var12.field5678] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field4971 != null) {
            this.field4971.field6343 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "(I)V", line = 3420)
    public final void method657(int arg0) {
        field4964++;
        int var2 = class445.field6545[arg0];
        int var3 = class445.field6544[arg0];
        for (int var4 = 0; var4 < this.field4978; var4++) {
            int var5 = this.field4959[var4] * var3 - (this.field5038[var4] * var2) >> 15;
            this.field5038[var4] = this.field4959[var4] * var2 + (this.field5038[var4] * var3) >> 15;
            this.field4959[var4] = var5;
        }
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
        this.field5001 = false;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lvd;)V", line = 5610)
    public class324(class258 arg0) {
        this.field4984 = arg0;
        this.field4979 = new class426(null, 5126, 3, 0);
        this.field4972 = new class426(null, 5126, 2, 0);
        this.field4985 = new class426(null, 5126, 3, 0);
        this.field4971 = new class426(null, 5121, 4, 0);
        this.field5034 = new class519();
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lvd;Lio;IIII)V", line = 5622)
    public class324(class258 arg0, class118 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5045 = arg2;
        this.field4980 = arg5;
        this.field4984 = arg0;
        if (class403.method2434(arg2, (byte) 82, arg5)) {
            this.field4979 = new class426(null, 5126, 3, 0);
        }
        if (class58.method418(55, arg2, arg5)) {
            this.field4972 = new class426(null, 5126, 2, 0);
        }
        if (class532.method3158(arg2, false, arg5)) {
            this.field4985 = new class426(null, 5126, 3, 0);
        }
        if (class326.method2027(arg2, arg5, 0)) {
            this.field4971 = new class426(null, 5121, 4, 0);
        }
        if (class87.method687(arg5, 2048, arg2)) {
            this.field5034 = new class519();
        }
        class243 var7 = arg0.field101;
        this.field5035 = new int[arg1.field1796 + 1];
        int[] var8 = new int[arg1.field1779];
        for (int var9 = 0; var9 < arg1.field1779; var9++) {
            if ((arg1.field1802 == null || arg1.field1802[var9] != 2) && (arg1.field1800 == null || arg1.field1800[var9] == -1 || !var7.method1480(arg1.field1800[var9] & 0xFFFF, 14270).field2422)) {
                var8[this.field5003++] = var9;
                this.field5035[arg1.field1789[var9]]++;
                this.field5035[arg1.field1765[var9]]++;
                this.field5035[arg1.field1794[var9]]++;
            }
        }
        this.field5032 = this.field5003;
        long[] var10 = new long[this.field5003];
        boolean var11 = (this.field5045 & 0x100) != 0;
        label492: for (int var12 = 0; var12 < this.field5003; var12++) {
            int var180 = var8[var12];
            class161 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field1785 != null) {
                for (int var186 = 0; var186 < arg1.field1785.length; var186++) {
                    class103 var187 = arg1.field1785[var186];
                    if (var187.field1548 == var180) {
                        class29 var188 = class486.method2903(0, var187.field1551);
                        if (var188.field410) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field5032--;
                            continue label492;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field1800 != null) {
                var189 = arg1.field1800[var180];
                if (var189 != -1) {
                    var181 = var7.method1480(var189 & 0xFFFF, 14270);
                    var185 = var181.field2417;
                    var184 = var181.field2412;
                }
            }
            boolean var190 = arg1.field1787 != null && arg1.field1787[var180] != 0 || var181 != null && !var181.field2407;
            if ((var11 || var190) && arg1.field1816 != null) {
                var182 += arg1.field1816[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var189 & 0xFFFF << 16) + var183;
            int var193 = (var185 & 0xFF) + var191;
            int var194 = (var12 & 0xFFFF) + var192;
            var10[var12] = ((long) var193 << 32) + ((long) var194);
        }
        class152.method1100(true, var8, var10);
        this.field4978 = arg1.field1796;
        this.field4995 = arg1.field1764;
        this.field4966 = arg1.field1807;
        this.field5030 = arg1.field1778;
        this.field4959 = arg1.field1805;
        this.field5038 = arg1.field1803;
        class85[] var13 = new class85[this.field4978];
        this.field5004 = arg1.field1782;
        this.field5052 = arg1.field1817;
        if (arg1.field1785 != null) {
            this.field5026 = arg1.field1785.length;
            this.field5011 = new class377[this.field5026];
            this.field4988 = new class430[this.field5026];
            for (int var14 = 0; var14 < this.field5026; var14++) {
                class103 var15 = arg1.field1785[var14];
                class29 var16 = class486.method2903(0, var15.field1551);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5003; var18++) {
                    if (var8[var18] == var15.field1548) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class461.field6721[arg1.field1806[var15.field1548] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field1787 == null ? 0 : arg1.field1787[var15.field1548]) << 24;
                this.field5011[var14] = new class377(var17, arg1.field1789[var15.field1548], arg1.field1765[var15.field1548], arg1.field1794[var15.field1548], var16.field416, var16.field418, var16.field423, var16.field415, var16.field413, var16.field410, var16.field414, var15.field1552);
                this.field4988[var14] = new class430(var20);
            }
        }
        int var21 = this.field5003 * 3;
        class180.field2661 = new long[var21];
        this.field4962 = new short[var21];
        this.field5007 = (short) arg4;
        this.field5009 = new byte[this.field5003];
        this.field5053 = (short) arg3;
        this.field5021 = new short[this.field5003];
        this.field5006 = new short[var21];
        this.field4975 = new short[this.field5003];
        this.field5063 = new byte[var21];
        this.field5012 = new short[this.field5003];
        if (arg1.field1792 != null) {
            this.field4969 = new short[this.field5003];
        }
        this.field5013 = new float[var21];
        this.field4967 = new short[this.field5003];
        this.field5029 = new short[var21];
        this.field4974 = new float[var21];
        this.field4953 = new short[this.field5003];
        this.field5020 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field1796; var23++) {
            int var179 = this.field5035[var23];
            this.field5035[var23] = var22;
            var22 += var179;
            var13[var23] = new class85();
        }
        this.field5035[arg1.field1796] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field1772 != null) {
            int var28 = arg1.field1810;
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
            for (int var36 = 0; var36 < this.field5003; var36++) {
                int var43 = var8[var36];
                if (arg1.field1772[var43] != -1) {
                    int var44 = arg1.field1772[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field1789[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field1765[var43];
                        } else {
                            var46 = arg1.field1794[var43];
                        }
                        int var47 = arg1.field1764[var46];
                        int var48 = arg1.field1805[var46];
                        int var49 = arg1.field1803[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
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
            var26 = new int[var28];
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field1815[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field1766[var37];
                        var40 = 64.0F / (float) arg1.field1795[var37];
                        if (var39 == 0) {
                            var42 = 1.0F;
                            var41 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = 1.0F;
                            var42 = (float) (-var39) / 1024.0F;
                        } else {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field1777[var37];
                        var40 = 64.0F / (float) arg1.field1795[var37];
                        var42 = 64.0F / (float) arg1.field1766[var37];
                    } else {
                        var41 = (float) arg1.field1777[var37] / 1024.0F;
                        var42 = (float) arg1.field1766[var37] / 1024.0F;
                        var40 = (float) arg1.field1795[var37] / 1024.0F;
                    }
                    var27[var37] = class20.method214(true, var40, class140.method1023(arg1.field1783[var37], 255), var41, var42, arg1.field1814[var37], arg1.field1812[var37], arg1.field1809[var37]);
                }
            }
        }
        class516[] var50 = new class516[arg1.field1779];
        for (int var51 = 0; var51 < arg1.field1779; var51++) {
            short var158 = arg1.field1789[var51];
            short var159 = arg1.field1765[var51];
            short var160 = arg1.field1794[var51];
            int var161 = this.field4995[var159] - this.field4995[var158];
            int var162 = this.field4959[var159] - this.field4959[var158];
            int var163 = this.field5038[var159] - this.field5038[var158];
            int var164 = this.field4995[var160] - this.field4995[var158];
            int var165 = this.field4959[var160] - this.field4959[var158];
            int var166 = this.field5038[var160] - this.field5038[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var167 >>= 0x1;
                var169 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var167 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var168 * 256 / var170;
            byte var174 = arg1.field1802 == null ? 0 : arg1.field1802[var51];
            if (var174 == 0) {
                class85 var176 = var13[var158];
                var176.field1342++;
                var176.field1346 += var172;
                var176.field1341 += var171;
                var176.field1344 += var173;
                class85 var177 = var13[var159];
                var177.field1342++;
                var177.field1341 += var171;
                var177.field1344 += var173;
                var177.field1346 += var172;
                class85 var178 = var13[var160];
                var178.field1342++;
                var178.field1344 += var173;
                var178.field1346 += var172;
                var178.field1341 += var171;
            } else if (var174 == 1) {
                class516 var175 = var50[var51] = new class516();
                var175.field7571 = var171;
                var175.field7569 = var173;
                var175.field7568 = var172;
            }
        }
        for (int var52 = 0; var52 < this.field5003; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field1806[var68] & 0xFFFF;
            short var70;
            if (arg1.field1800 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field1800[var68];
            }
            int var71;
            if (arg1.field1772 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field1772[var68];
            }
            int var72;
            if (arg1.field1787 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field1787[var68] & 0xFF;
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
                    var78 = 0.0F;
                    var77 = 0.0F;
                    var76 = 1.0F;
                    var79 = 1;
                    var73 = 0.0F;
                    var74 = 1.0F;
                    var75 = 1.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field1815[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field1789[var68];
                        short var84 = arg1.field1765[var68];
                        short var85 = arg1.field1794[var68];
                        short var86 = arg1.field1814[var71];
                        short var87 = arg1.field1812[var71];
                        short var88 = arg1.field1809[var71];
                        float var89 = (float) arg1.field1764[var86];
                        float var90 = (float) arg1.field1805[var86];
                        float var91 = (float) arg1.field1803[var86];
                        float var92 = (float) arg1.field1764[var87] - var89;
                        float var93 = (float) arg1.field1805[var87] - var90;
                        float var94 = (float) arg1.field1803[var87] - var91;
                        float var95 = (float) arg1.field1764[var88] - var89;
                        float var96 = (float) arg1.field1805[var88] - var90;
                        float var97 = (float) arg1.field1803[var88] - var91;
                        float var98 = (float) arg1.field1764[var83] - var89;
                        float var99 = (float) arg1.field1805[var83] - var90;
                        float var100 = (float) arg1.field1803[var83] - var91;
                        float var101 = (float) arg1.field1764[var84] - var89;
                        float var102 = (float) arg1.field1805[var84] - var90;
                        float var103 = (float) arg1.field1803[var84] - var91;
                        float var104 = (float) arg1.field1764[var85] - var89;
                        float var105 = (float) arg1.field1805[var85] - var90;
                        float var106 = (float) arg1.field1803[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - (var93 * var95);
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - (var95 * var109);
                        float var112 = var95 * var108 - (var96 * var107);
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        float var114 = var93 * var109 - var94 * var108;
                        float var115 = var92 * var108 - var93 * var107;
                        float var116 = var94 * var107 - var92 * var109;
                        float var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                        var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                        var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                        var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                    } else {
                        short var118 = arg1.field1789[var68];
                        short var119 = arg1.field1765[var68];
                        short var120 = arg1.field1794[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field1799[var71];
                        float var126 = (float) arg1.field1784[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field1777[var71] / 1024.0F;
                            class446.method2617(arg1.field1803[var118], var125, var126, var127, var124, var123, 0, var121, arg1.field1805[var118], var122, arg1.field1764[var118]);
                            var74 = class358.field5476;
                            var73 = class115.field1734;
                            class446.method2617(arg1.field1803[var119], var125, var126, var127, var124, var123, 0, var121, arg1.field1805[var119], var122, arg1.field1764[var119]);
                            var75 = class115.field1734;
                            var76 = class358.field5476;
                            class446.method2617(arg1.field1803[var120], var125, var126, var127, var124, var123, 0, var121, arg1.field1805[var120], var122, arg1.field1764[var120]);
                            var77 = class115.field1734;
                            var78 = class358.field5476;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > var128) {
                                    var75 -= var127;
                                    var79 = 1;
                                } else if (var128 < var73 - var75) {
                                    var75 += var127;
                                    var79 = 2;
                                }
                                if (var128 < var77 - var73) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var128 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var127;
                                }
                            } else {
                                if (var78 - var74 > var128) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                                if ((var76 - var74 > var128)) {
                                    var79 = 1;
                                    var76 -= var127;
                                } else if (var74 - var76 > var128) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field1813[var71] / 256.0F;
                            float var130 = (float) arg1.field1775[var71] / 256.0F;
                            int var131 = arg1.field1764[var119] - arg1.field1764[var118];
                            int var132 = arg1.field1805[var119] - arg1.field1805[var118];
                            int var133 = arg1.field1803[var119] - arg1.field1803[var118];
                            int var134 = arg1.field1764[var120] - arg1.field1764[var118];
                            int var135 = arg1.field1805[var120] - arg1.field1805[var118];
                            int var136 = arg1.field1803[var120] - arg1.field1803[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field1766[var71];
                            float var141 = 64.0F / (float) arg1.field1795[var71];
                            float var142 = 64.0F / (float) arg1.field1777[var71];
                            float var143 = (var124[2] * (float) var139 + var124[0] * (float) var137 + var124[1] * (float) var138) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[3] * (float) var137 + var124[4] * (float) var138) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[6] * (float) var137 + var124[7] * (float) var138) / var142;
                            var81 = class439.method2571(var144, (byte) 105, var145, var143);
                            class514.method3025(arg1.field1764[var118], var129, -4, arg1.field1803[var118], var123, var122, arg1.field1805[var118], var124, var125, var130, var121, var126, var81);
                            var74 = class454.field6660;
                            var73 = class110.field1660;
                            class514.method3025(arg1.field1764[var119], var129, -4, arg1.field1803[var119], var123, var122, arg1.field1805[var119], var124, var125, var130, var121, var126, var81);
                            var76 = class454.field6660;
                            var75 = class110.field1660;
                            class514.method3025(arg1.field1764[var120], var129, -4, arg1.field1803[var120], var123, var122, arg1.field1805[var120], var124, var125, var130, var121, var126, var81);
                            var77 = class110.field1660;
                            var78 = class454.field6660;
                        } else if (var82 == 3) {
                            class490.method2921(var126, var123, arg1.field1805[var118], var124, var121, arg1.field1803[var118], var122, 28266, var125, arg1.field1764[var118]);
                            var74 = class509.field7484;
                            var73 = class505.field7433;
                            class490.method2921(var126, var123, arg1.field1805[var119], var124, var121, arg1.field1803[var119], var122, 28266, var125, arg1.field1764[var119]);
                            var75 = class505.field7433;
                            var76 = class509.field7484;
                            class490.method2921(var126, var123, arg1.field1805[var120], var124, var121, arg1.field1803[var120], var122, 28266, var125, arg1.field1764[var120]);
                            var78 = class509.field7484;
                            var77 = class505.field7433;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if ((var78 - var74 > 0.5F)) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
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
            if (arg1.field1802 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field1802[var68];
            }
            if (var146 == 0) {
                long var150 = (long) (var71 << 2) + ((long) (var81 << 24) + ((long) (var69 << 8)) + (long) var72 << 32);
                short var152 = arg1.field1789[var68];
                short var153 = arg1.field1765[var68];
                short var154 = arg1.field1794[var68];
                class85 var155 = var13[var152];
                this.field5012[var52] = this.method2014(var155.field1341, var155.field1344, var155.field1346, var152, var150, var74, arg1, -10494, var155.field1342, var73);
                class85 var156 = var13[var153];
                this.field4975[var52] = this.method2014(var156.field1341, var156.field1344, var156.field1346, var153, (long) var79 + var150, var76, arg1, -10494, var156.field1342, var75);
                class85 var157 = var13[var154];
                this.field5021[var52] = this.method2014(var157.field1341, var157.field1344, var157.field1346, var154, (long) var80 + var150, var78, arg1, -10494, var157.field1342, var77);
            } else if (var146 == 1) {
                class516 var147 = var50[var68];
                long var148 = (long) ((var147.field7568 + 256 << 22) + (var147.field7569 + 256 << 12) + (var71 << 2) + (var147.field7571 <= 0 ? 2048 : 1024)) + ((long) (var69 << 8) + (long) (var81 << 24) + ((long) var72) << 32);
                this.field5012[var52] = this.method2014(var147.field7571, var147.field7569, var147.field7568, arg1.field1789[var68], var148, var74, arg1, -10494, 0, var73);
                this.field4975[var52] = this.method2014(var147.field7571, var147.field7569, var147.field7568, arg1.field1765[var68], (long) var79 + var148, var76, arg1, -10494, 0, var75);
                this.field5021[var52] = this.method2014(var147.field7571, var147.field7569, var147.field7568, arg1.field1794[var68], (long) var80 + var148, var78, arg1, -10494, 0, var77);
            }
            if (arg1.field1800 == null) {
                this.field4967[var52] = -1;
            } else {
                this.field4967[var52] = arg1.field1800[var68];
            }
            if (arg1.field1787 != null) {
                this.field5009[var52] = arg1.field1787[var68];
            }
            if (arg1.field1792 != null) {
                this.field4969[var52] = arg1.field1792[var68];
            }
            this.field4953[var52] = arg1.field1806[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5032; var55++) {
            short var67 = this.field4967[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field4963 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field5032; var58++) {
            short var66 = this.field4967[var58];
            if (var56 != var66) {
                this.field4963[var57++] = var58;
                var56 = var66;
            }
        }
        this.field4963[var57] = this.field5032;
        class180.field2661 = null;
        this.field4962 = class399.method2405(this.field4962, 1791, this.field4999);
        this.field5029 = class399.method2405(this.field5029, 1791, this.field4999);
        this.field5006 = class399.method2405(this.field5006, 1791, this.field4999);
        this.field5063 = class167.method1165(this.field5063, this.field4999, -1379618463);
        this.field4974 = class334.method2058(64, this.field4999, this.field4974);
        this.field5013 = class334.method2058(104, this.field4999, this.field5013);
        if (arg1.field1801 != null && class59.method420(-1, this.field4980, arg2)) {
            this.field4976 = arg1.method897((byte) 64);
        }
        if (arg1.field1785 != null && class159.method1129(arg2, this.field4980, 60)) {
            this.field5002 = arg1.method885(0);
        }
        if (arg1.field1771 != null && class520.method3076((byte) -56, arg2, this.field4980)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5003; var61++) {
                int var65 = arg1.field1771[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var65 > var59) {
                        var59 = var65;
                    }
                }
            }
            this.field5015 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field5015[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5003; var63++) {
                int var64 = arg1.field1771[var8[var63]];
                if (var64 >= 0) {
                    this.field5015[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()V", line = 3455)
    public final void method624() {
        field4998++;
        if (this.field4999 <= 0 || this.field5032 <= 0) {
            return;
        }
        this.method2011(false, true);
        if ((this.field4991 & 0x10) == 0 && this.field5034.field7603 == null) {
            this.method2008(false, (byte) 116);
        }
        this.method2015(1);
    }

    @OriginalMember(owner = "client!sg", name = "NA", descriptor = "()I", line = 3471)
    public final int method625() {
        field5010++;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        return this.field5057;
    }

    @OriginalMember(owner = "client!sg", name = "PA", descriptor = "()I", line = 3486)
    public final int method621() {
        if (!this.field5001) {
            this.method2017(-24950);
        }
        field4983++;
        return this.field5044;
    }

    @OriginalMember(owner = "client!sg", name = "XA", descriptor = "(I[IIIIIZ)V", line = 3505)
    public final void method600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4996++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class271.field4041 = 0;
            class62.field838 = 0;
            class411.field6212 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field4976.length > var14) {
                    int[] var15 = this.field4976[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class411.field6212 += this.field4995[var17];
                        class271.field4041 += this.field4959[var17];
                        class62.field838 += this.field5038[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class62.field838 = class62.field838 / var12 + var10;
                class411.field6212 = class411.field6212 / var12 + var9;
                class271.field4041 = class271.field4041 / var12 + var11;
            } else {
                class411.field6212 = var9;
                class271.field4041 = var11;
                class62.field838 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field4976.length) {
                    int[] var23 = this.field4976[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4995[var25] += var19;
                        this.field4959[var25] += var20;
                        this.field5038[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field4976.length) {
                    int[] var46 = this.field4976[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4995[var59] -= class411.field6212;
                            this.field4959[var59] -= class271.field4041;
                            this.field5038[var59] -= class62.field838;
                            if (arg4 != 0) {
                                int var60 = class445.field6545[arg4];
                                int var61 = class445.field6544[arg4];
                                int var62 = this.field4995[var59] * var61 + this.field4959[var59] * var60 + 32767 >> 15;
                                this.field4959[var59] = this.field4959[var59] * var61 + 32767 - this.field4995[var59] * var60 >> 15;
                                this.field4995[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class445.field6545[arg2];
                                int var64 = class445.field6544[arg2];
                                int var65 = this.field4959[var59] * var64 + 32767 - (this.field5038[var59] * var63) >> 15;
                                this.field5038[var59] = this.field4959[var59] * var63 + this.field5038[var59] * var64 + 32767 >> 15;
                                this.field4959[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class445.field6545[arg3];
                                int var67 = class445.field6544[arg3];
                                int var68 = this.field5038[var59] * var66 - (-(this.field4995[var59] * var67) - 32767) >> 15;
                                this.field5038[var59] = this.field5038[var59] * var67 + 32767 - this.field4995[var59] * var66 >> 15;
                                this.field4995[var59] = var68;
                            }
                            this.field4995[var59] += class411.field6212;
                            this.field4959[var59] += class271.field4041;
                            this.field5038[var59] += class62.field838;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4995[var48] -= class411.field6212;
                            this.field4959[var48] -= class271.field4041;
                            this.field5038[var48] -= class62.field838;
                            if (arg2 != 0) {
                                int var49 = class445.field6545[arg2];
                                int var50 = class445.field6544[arg2];
                                int var51 = this.field4959[var48] * var50 + 32767 - (this.field5038[var48] * var49) >> 15;
                                this.field5038[var48] = this.field4959[var48] * var49 + (this.field5038[var48] * var50) + 32767 >> 15;
                                this.field4959[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class445.field6545[arg4];
                                int var53 = class445.field6544[arg4];
                                int var54 = this.field4995[var48] * var53 + this.field4959[var48] * var52 + 32767 >> 15;
                                this.field4959[var48] = this.field4959[var48] * var53 + (32767 - (this.field4995[var48] * var52)) >> 15;
                                this.field4995[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class445.field6545[arg3];
                                int var56 = class445.field6544[arg3];
                                int var57 = this.field4995[var48] * var56 + this.field5038[var48] * var55 + 32767 >> 15;
                                this.field5038[var48] = this.field5038[var48] * var56 + 32767 - (this.field4995[var48] * var55) >> 15;
                                this.field4995[var48] = var57;
                            }
                            this.field4995[var48] += class411.field6212;
                            this.field4959[var48] += class271.field4041;
                            this.field5038[var48] += class62.field838;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field4976.length > var28) {
                        int[] var29 = this.field4976[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5035[var31];
                            int var33 = this.field5035[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5020[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class445.field6545[arg4];
                                    int var37 = class445.field6544[arg4];
                                    int var38 = this.field5029[var35] * var36 + (this.field4962[var35] * var37) + 32767 >> 15;
                                    this.field5029[var35] = (short) (this.field5029[var35] * var37 + 32767 - (this.field4962[var35] * var36) >> 15);
                                    this.field4962[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class445.field6545[arg2];
                                    int var40 = class445.field6544[arg2];
                                    int var41 = this.field5029[var35] * var40 + 32767 - this.field5006[var35] * var39 >> 15;
                                    this.field5006[var35] = (short) (this.field5006[var35] * var40 + this.field5029[var35] * var39 + 32767 >> 15);
                                    this.field5029[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class445.field6545[arg3];
                                    int var43 = class445.field6544[arg3];
                                    int var44 = this.field4962[var35] * var43 + (this.field5006[var35] * var42 + 32767) >> 15;
                                    this.field5006[var35] = (short) (this.field5006[var35] * var43 + 32767 - (this.field4962[var35] * var42) >> 15);
                                    this.field4962[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field4985 == null && this.field4971 != null) {
                    this.field4971.field6343 = null;
                }
                if (this.field4985 != null) {
                    this.field4985.field6343 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field4976.length) {
                    int[] var71 = this.field4976[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4995[var73] -= class411.field6212;
                        this.field4959[var73] -= class271.field4041;
                        this.field5038[var73] -= class62.field838;
                        this.field4995[var73] = this.field4995[var73] * arg2 >> 7;
                        this.field4959[var73] = this.field4959[var73] * arg3 >> 7;
                        this.field5038[var73] = this.field5038[var73] * arg4 >> 7;
                        this.field4995[var73] += class411.field6212;
                        this.field4959[var73] += class271.field4041;
                        this.field5038[var73] += class62.field838;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5015 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field5015.length > var78) {
                        int[] var79 = this.field5015[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5009[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5009[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field4971 != null) {
                            this.field4971.field6343 = null;
                        }
                    }
                }
                if (this.field5011 != null) {
                    for (int var75 = 0; var75 < this.field5026; var75++) {
                        class377 var76 = this.field5011[var75];
                        class430 var77 = this.field4988[var75];
                        var77.field6383 = 255 - (this.field5009[var76.field5678] & 0xFF) << 24 | var77.field6383 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5015 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field5015.length > var87) {
                        int[] var88 = this.field5015[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field4953[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = var91 & 0x7F;
                            int var96 = arg2 + var92 & 0x3F;
                            int var97 = arg4 + var95;
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
                            this.field4953[var90] = (short) class390.method2340(var97, class390.method2340(var96 << 10, var94 << 7));
                        }
                        if (var88.length > 0 && this.field4971 != null) {
                            this.field4971.field6343 = null;
                        }
                    }
                }
                if (this.field5011 != null) {
                    for (int var84 = 0; var84 < this.field5026; var84++) {
                        class377 var85 = this.field5011[var84];
                        class430 var86 = this.field4988[var84];
                        var86.field6383 = var86.field6383 & 0xFF000000 | class461.field6721[this.field4953[var85.field5678] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5002 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5002.length > var99) {
                        int[] var100 = this.field5002[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class430 var102 = this.field4988[var100[var101]];
                            var102.field6388 += arg2;
                            var102.field6384 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5002 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5002.length > var104) {
                        int[] var105 = this.field5002[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class430 var107 = this.field4988[var105[var106]];
                            var107.field6381 = var107.field6381 * arg2 >> 7;
                            var107.field6385 = var107.field6385 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5002 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field5002.length > var109) {
                    int[] var110 = this.field5002[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class430 var112 = this.field4988[var110[var111]];
                        var112.field6389 = var112.field6389 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "MA", descriptor = "()I", line = 4168)
    public final int method635() {
        if (!this.field5001) {
            this.method2017(-24950);
        }
        field5051++;
        return this.field4968;
    }

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "()I", line = 4180)
    public final int method613() {
        field5031++;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        return this.field4970;
    }

    @OriginalMember(owner = "client!sg", name = "HA", descriptor = "()I", line = 4193)
    public final int method651() {
        field5043++;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        return this.field5054;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()[Lng;", line = 4206)
    public final class165[] method606() {
        field4955++;
        return this.field5052;
    }

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "(I)V", line = 4214)
    public final void method632(int arg0) {
        field5048++;
        if (this.field4971 != null) {
            this.field4971.field6343 = null;
        }
        this.field5053 = (short) arg0;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V", line = 4231)
    private final void method2012(byte arg0) {
        int var2 = 29 / ((-arg0 - 40) / 52);
        field5005++;
        if (this.field5032 == 0) {
            return;
        }
        if (this.field4991 != 0) {
            this.method2011(true, true);
        }
        this.method2011(false, true);
        if (this.field5034 != null) {
            if (this.field5034.field7603 == null) {
                this.method2008((this.field4991 & 0x10) != 0, (byte) 116);
            }
            if (this.field5034.field7603 != null) {
                this.field4984.method1574(this.field4985 != null, -124);
                this.field4984.method1597(this.field4979, this.field4971, -1, this.field4985, this.field4972);
                int var3 = this.field4963.length - 1;
                for (int var4 = 0; var4 < var3; var4++) {
                    int var5 = this.field4963[var4];
                    int var6 = this.field4963[var4 + 1];
                    int var7 = this.field4967[var5] & 0xFFFF;
                    if (var7 == 65535) {
                        var7 = -1;
                    }
                    this.field4984.method1612(var7, (byte) 108, this.field4985 != null);
                    this.field4984.method1547(23988, 4, this.field5034.field7603, var5 * 3, (var6 - var5) * 3);
                }
            }
        }
        this.method2015(1);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lds;B)V", line = 4298)
    private final void method2013(class276 arg0, byte arg1) {
        field5000++;
        if (this.field4984.field3852.length < this.field4999) {
            this.field4984.field3852 = new int[this.field4999];
            this.field4984.field3847 = new int[this.field4999];
        }
        if (arg1 > -67) {
            this.field5054 = 73;
        }
        int[] var3 = this.field4984.field3852;
        int[] var4 = this.field4984.field3847;
        for (int var5 = 0; var5 < this.field4978; var5++) {
            int var16 = (this.field4995[var5] - (this.field4959[var5] * this.field4984.field3742 >> 8) >> this.field4984.field3701) - arg0.field4119;
            int var17 = (this.field5038[var5] - (this.field4959[var5] * this.field4984.field3803 >> 8) >> this.field4984.field3701) - arg0.field4122;
            int var18 = this.field5035[var5];
            int var19 = this.field5035[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5020[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5032; var6++) {
            if (this.field5009 == null || this.field5009[var6] <= 128) {
                short var7 = this.field5012[var6];
                short var8 = this.field4975[var6];
                short var9 = this.field5021[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg0.method1722(var15, var14, var11, var10, var13, var12, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIZ)Lt;", line = 4385)
    public final class398 method610(byte arg0, int arg1, boolean arg2) {
        field4997++;
        class324 var4;
        class324 var5;
        if (arg0 == 1) {
            var4 = this.field4984.field3743;
            var5 = this.field4984.field3844;
        } else if (arg0 == 2) {
            var4 = this.field4984.field3829;
            var5 = this.field4984.field3797;
        } else if (arg0 == 3) {
            var4 = this.field4984.field3793;
            var5 = this.field4984.field3782;
        } else if (arg0 == 4) {
            var4 = this.field4984.field3732;
            var5 = this.field4984.field3783;
        } else if (arg0 == 5) {
            var4 = this.field4984.field3774;
            var5 = this.field4984.field3785;
        } else {
            var4 = var5 = new class324(this.field4984);
        }
        return this.method2010((byte) -88, var4, arg2, arg0 != 0, var5, arg1);
    }

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "(I)V", line = 4437)
    public final void method595(int arg0) {
        field5039++;
        int var2 = class445.field6545[arg0];
        int var3 = class445.field6544[arg0];
        for (int var4 = 0; var4 < this.field4978; var4++) {
            int var5 = this.field4959[var4] * var2 + (this.field4995[var4] * var3) >> 15;
            this.field4959[var4] = this.field4959[var4] * var3 - (this.field4995[var4] * var2) >> 15;
            this.field4995[var4] = var5;
        }
        this.field5001 = false;
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "IA", descriptor = "()V", line = 4467)
    public final void method603() {
        field5062++;
        for (int var1 = 0; var1 < this.field4978; var1++) {
            this.field5038[var1] = -this.field5038[var1];
        }
        for (int var2 = 0; var2 < this.field4999; var2++) {
            this.field5006[var2] = (short) (-this.field5006[var2]);
        }
        for (int var3 = 0; var3 < this.field5003; var3++) {
            short var4 = this.field5012[var3];
            this.field5012[var3] = this.field5021[var3];
            this.field5021[var3] = var4;
        }
        if (this.field4985 == null && this.field4971 != null) {
            this.field4971.field6343 = null;
        }
        if (this.field4985 != null) {
            this.field4985.field6343 = null;
        }
        this.field5001 = false;
        if (this.field5034 != null) {
            this.field5034.field7603 = null;
        }
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIJFLio;IIF)S", line = 4518)
    private final short method2014(int arg0, int arg1, int arg2, int arg3, long arg4, float arg5, class118 arg6, int arg7, int arg8, float arg9) {
        field5042++;
        int var12 = this.field5035[arg3];
        int var13 = this.field5035[arg3 + 1];
        int var14 = 0;
        if (arg7 != -10494) {
            return -37;
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5020[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class180.field2661[var15] == arg4) {
                return (short) (var16 - 1);
            }
        }
        this.field5020[var14] = (short) (this.field4999 + 1);
        class180.field2661[var14] = arg4;
        this.field4962[this.field4999] = (short) arg0;
        this.field5029[this.field4999] = (short) arg1;
        this.field5006[this.field4999] = (short) arg2;
        this.field5063[this.field4999] = (byte) arg8;
        this.field4974[this.field4999] = arg9;
        this.field5013[this.field4999] = arg5;
        return (short) (this.field4999++);
    }

    @OriginalMember(owner = "client!sg", name = "aa", descriptor = "(I)V", line = 4562)
    public final void method636(int arg0) {
        if (this.field4971 != null) {
            this.field4971.field6343 = null;
        }
        field5041++;
        this.field5007 = (short) arg0;
        if (this.field4985 != null) {
            this.field4985.field6343 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "()V", line = 4578)
    public final void method607() {
        for (int var1 = 0; var1 < this.field4966; var1++) {
            this.field4995[var1] = this.field4995[var1] + 7 >> 4;
            this.field4959[var1] = this.field4959[var1] + 7 >> 4;
            this.field5038[var1] = this.field5038[var1] + 7 >> 4;
        }
        field4965++;
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
        this.field5001 = false;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 4602)
    private final void method2015(int arg0) {
        field5055++;
        if (arg0 != 1) {
            this.field5035 = null;
        }
        if (!this.field5019) {
            return;
        }
        this.field5019 = false;
        if (this.field5052 == null && this.field5004 == null && this.field5011 == null) {
            if (this.field4995 != null && !class38.method318(arg0 - 39, this.field4980, this.field5045)) {
                if (this.field4979 != null && this.field4979.field6343 == null) {
                    this.field5019 = true;
                } else {
                    if (!this.field5001) {
                        this.method2017(-24950);
                    }
                    this.field4995 = null;
                }
            }
            if (this.field4959 != null && !class265.method1656(arg0 - 2, this.field5045, this.field4980)) {
                if (this.field4979 != null && this.field4979.field6343 == null) {
                    this.field5019 = true;
                } else {
                    if (!this.field5001) {
                        this.method2017(-24950);
                    }
                    this.field4959 = null;
                }
            }
            if (this.field5038 != null && !class397.method2385(105, this.field4980, this.field5045)) {
                if (this.field4979 != null && this.field4979.field6343 == null) {
                    this.field5019 = true;
                } else {
                    if (!this.field5001) {
                        this.method2017(-24950);
                    }
                    this.field5038 = null;
                }
            }
        }
        if (this.field5020 != null && this.field4995 == null && this.field4959 == null && this.field5038 == null) {
            this.field5035 = null;
            this.field5020 = null;
        }
        if (this.field5063 != null && !class145.method1048(-127, this.field4980, this.field5045)) {
            if (this.field4985 == null) {
                if (this.field4971 != null && this.field4971.field6343 == null) {
                    this.field5019 = true;
                } else {
                    this.field4962 = this.field5029 = this.field5006 = null;
                    this.field5063 = null;
                }
            } else if (this.field4985.field6343 == null) {
                this.field5019 = true;
            } else {
                this.field5063 = null;
                this.field4962 = this.field5029 = this.field5006 = null;
            }
        }
        if (this.field4953 != null && !class367.method2186(this.field4980, 1, this.field5045)) {
            if (this.field4971 != null && this.field4971.field6343 == null) {
                this.field5019 = true;
            } else {
                this.field4953 = null;
            }
        }
        if (this.field5009 != null && !class24.method242(this.field5045, (byte) -113, this.field4980)) {
            if (this.field4971 != null && this.field4971.field6343 == null) {
                this.field5019 = true;
            } else {
                this.field5009 = null;
            }
        }
        if (this.field4974 != null && !class346.method2099((byte) 122, this.field4980, this.field5045)) {
            if (this.field4972 != null && this.field4972.field6343 == null) {
                this.field5019 = true;
            } else {
                this.field4974 = this.field5013 = null;
            }
        }
        if (this.field4967 != null && !class182.method1242(this.field4980, this.field5045, false)) {
            if (this.field4971 != null && this.field4971.field6343 == null) {
                this.field5019 = true;
            } else {
                this.field4967 = null;
            }
        }
        if (this.field5012 != null && !class368.method2198(-6943, this.field4980, this.field5045)) {
            if ((this.field5034 == null || this.field5034.field7603 != null) && (this.field4971 == null || this.field4971.field6343 != null)) {
                this.field5012 = this.field4975 = this.field5021 = null;
            } else {
                this.field5019 = true;
            }
        }
        if (this.field5015 != null && !class520.method3076((byte) -55, this.field5045, this.field4980)) {
            this.field5015 = null;
            this.field4969 = null;
        }
        if (this.field4976 != null && !class59.method420(-1, this.field4980, this.field5045)) {
            this.field5030 = null;
            this.field4976 = null;
        }
        if (this.field5002 != null && !class159.method1129(this.field5045, this.field4980, 100)) {
            this.field5002 = null;
        }
        if (this.field4963 != null && (this.field5045 & 0x800) == 0 && (this.field5045 & 0x40000) == 0) {
            this.field4963 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()[Ldh;", line = 4788)
    public final class254[] method616() {
        field5017++;
        return this.field5004;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lhs;B)V", line = 4799)
    private final void method2016(class446 arg0, byte arg1) {
        field5014++;
        if (arg1 != 117) {
            return;
        }
        if (this.field5052 != null) {
            for (int var3 = 0; var3 < this.field5052.length; var3++) {
                class165 var4 = this.field5052[var3];
                class165 var5 = var4;
                if (var4.field2453 != null) {
                    var5 = var4.field2453;
                }
                var5.field2461 = (int) ((float) this.field5038[var4.field2456] * arg0.field6597 + (float) this.field4995[var4.field2456] * arg0.field6598 + (float) this.field4959[var4.field2456] * arg0.field6577 + arg0.field6574);
                var5.field2458 = (int) ((float) this.field5038[var4.field2456] * arg0.field6581 + (float) this.field4995[var4.field2456] * arg0.field6567 + (float) this.field4959[var4.field2456] * arg0.field6565 + arg0.field6589);
                var5.field2464 = (int) ((float) this.field5038[var4.field2456] * arg0.field6568 + (float) this.field4995[var4.field2456] * arg0.field6590 + (float) this.field4959[var4.field2456] * arg0.field6586 + arg0.field6566);
                var5.field2460 = (int) ((float) this.field5038[var4.field2452] * arg0.field6597 + (float) this.field4995[var4.field2452] * arg0.field6598 + (float) this.field4959[var4.field2452] * arg0.field6577 + arg0.field6574);
                var5.field2455 = (int) ((float) this.field5038[var4.field2452] * arg0.field6581 + (float) this.field4995[var4.field2452] * arg0.field6567 + (float) this.field4959[var4.field2452] * arg0.field6565 + arg0.field6589);
                var5.field2449 = (int) ((float) this.field5038[var4.field2452] * arg0.field6568 + (float) this.field4995[var4.field2452] * arg0.field6590 + (float) this.field4959[var4.field2452] * arg0.field6586 + arg0.field6566);
                var5.field2447 = (int) ((float) this.field5038[var4.field2454] * arg0.field6597 + (float) this.field4995[var4.field2454] * arg0.field6598 + (float) this.field4959[var4.field2454] * arg0.field6577 + arg0.field6574);
                var5.field2462 = (int) ((float) this.field5038[var4.field2454] * arg0.field6581 + (float) this.field4995[var4.field2454] * arg0.field6567 + (float) this.field4959[var4.field2454] * arg0.field6565 + arg0.field6589);
                var5.field2463 = (int) ((float) this.field5038[var4.field2454] * arg0.field6568 + (float) this.field4995[var4.field2454] * arg0.field6590 + (float) this.field4959[var4.field2454] * arg0.field6586 + arg0.field6566);
            }
        }
        if (this.field5004 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5004.length; var6++) {
            class254 var7 = this.field5004[var6];
            class254 var8 = var7;
            if (var7.field3440 != null) {
                var8 = var7.field3440;
            }
            if (var7.field3445 == null) {
                var7.field3445 = arg0.method1301();
            } else {
                var7.field3445.method1304(arg0);
            }
            var8.field3442 = (int) ((float) this.field5038[var7.field3452] * arg0.field6597 + (float) this.field4995[var7.field3452] * arg0.field6598 + (float) this.field4959[var7.field3452] * arg0.field6577 + arg0.field6574);
            var8.field3447 = (int) ((float) this.field5038[var7.field3452] * arg0.field6581 + (float) this.field4995[var7.field3452] * arg0.field6567 + (float) this.field4959[var7.field3452] * arg0.field6565 + arg0.field6589);
            var8.field3449 = (int) ((float) this.field5038[var7.field3452] * arg0.field6568 + (float) this.field4995[var7.field3452] * arg0.field6590 + (float) this.field4959[var7.field3452] * arg0.field6586 + arg0.field6566);
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V", line = 4872)
    private final void method2017(int arg0) {
        field4973++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4978; var10++) {
            int var11 = this.field4995[var10];
            int var12 = this.field4959[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            int var13 = this.field5038[var10];
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field5044 = (short) var4;
        this.field4970 = (short) var7;
        this.field5057 = (short) var5;
        this.field4968 = (short) var3;
        this.field5054 = (short) var2;
        this.field4981 = (short) var6;
        this.field4960 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        if (arg0 != -24950) {
            this.field4971 = null;
        }
        Math.sqrt((double) var9);
        this.field5001 = true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIII)Z", line = 4954)
    private final boolean method2018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5050++;
        if (arg2 < arg3 && arg6 > arg2 && arg2 < arg5) {
            return false;
        } else if (arg1 != -129) {
            return true;
        } else if (arg3 < arg2 && arg2 > arg6 && arg2 > arg5) {
            return false;
        } else if (arg4 > arg0 && arg0 < arg8 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg4 || arg8 >= arg0 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "(IILta;Lta;III)V", line = 4979)
    public final void method630(int arg0, int arg1, class337 arg2, class337 arg3, int arg4, int arg5, int arg6) {
        field5056++;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        int var8 = arg4 + this.field5054;
        int var9 = this.field5057 + arg4;
        int var10 = arg6 + this.field5044;
        int var11 = this.field4970 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field5198 <= (var9 + arg2.field5193 >> arg2.field5197) || var10 < 0 || (arg2.field5193 + var11 >> arg2.field5197) >= arg2.field5200) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (var9 + arg3.field5193 >> arg3.field5197) >= arg3.field5198 || var10 < 0 || arg3.field5193 + var11 >> arg3.field5197 >= arg3.field5200) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field5197;
            int var13 = var9 + arg2.field5193 - 1 >> arg2.field5197;
            int var14 = var10 >> arg2.field5197;
            int var15 = arg2.field5193 + var11 - 1 >> arg2.field5197;
            if (arg5 == arg2.method707(var12, var14) && arg5 == arg2.method707(var13, var14) && arg2.method707(var12, var15) == arg5 && arg5 == arg2.method707(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field4978; var32++) {
                this.field4959[var32] -= arg5 - arg2.method718(this.field4995[var32] + arg4, this.field5038[var32] + arg6);
            }
        } else if (arg0 == 2) {
            short var16 = this.field4968;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field4978; var17++) {
                int var18 = (this.field4959[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field4959[var17] += (arg2.method718(this.field4995[var17] + arg4, this.field5038[var17] + arg6) - arg5) * (arg1 - var18) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = (arg1 >> 8 & 0xFF) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var28 >> 1)) < 0 || (var28 >> 1) + arg4 + arg2.field5193 >= arg2.field5198 << arg2.field5197 || (arg6 - (var29 >> 1)) < 0 || arg2.field5200 << arg2.field5197 <= (var29 >> 1) + arg6 + arg2.field5193) {
                return;
            }
            this.method2396(-8193, arg6, var30, var31, arg5, arg4, var29, arg2, var28);
        } else if (arg0 == 4) {
            int var26 = this.field4981 - this.field4968;
            for (int var27 = 0; var27 < this.field4978; var27++) {
                this.field4959[var27] = var26 + (this.field4959[var27] - (arg5 - arg3.method718(this.field4995[var27] + arg4, this.field5038[var27] + arg6)));
            }
        } else if (arg0 == 5) {
            int var19 = this.field4981 - this.field4968;
            for (int var20 = 0; var20 < this.field4978; var20++) {
                int var21 = this.field4995[var20] + arg4;
                int var22 = this.field5038[var20] + arg6;
                int var23 = arg2.method718(var21, var22);
                int var24 = arg3.method718(var21, var22);
                int var25 = var23 - var24;
                this.field4959[var20] = ((this.field4959[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
            }
        }
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
        this.field5001 = false;
    }

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "()I", line = 5143)
    public final int method626() {
        field5027++;
        return this.field5045;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 5151)
    public static void method2019(boolean arg0) {
        field5040 = null;
        if (arg0) {
            field5060 = 53;
        }
        field5061 = null;
        field5059 = null;
    }

    @OriginalMember(owner = "client!sg", name = "UA", descriptor = "(I)V", line = 5166)
    public final void method602(int arg0) {
        this.field5045 = arg0;
        field5024++;
        this.field5019 = true;
        if (this.field4990 != null && (this.field5045 & 0x10000) == 0) {
            this.field4962 = this.field4990.field4432;
            this.field5006 = this.field4990.field4437;
            this.field5063 = this.field4990.field4436;
            this.field5029 = this.field4990.field4433;
            this.field4990 = null;
        }
        this.method2015(1);
    }

    @OriginalMember(owner = "client!sg", name = "fa", descriptor = "(Lba;)Lba;", line = 5192)
    public final class502 method623(class502 arg0) {
        field4956++;
        if (this.field4999 == 0) {
            return null;
        }
        if (!this.field5001) {
            this.method2017(-24950);
        }
        int var2;
        int var3;
        if (this.field4984.field3742 > 0) {
            var2 = this.field5054 - (this.field4984.field3742 * this.field4981 >> 8) >> this.field4984.field3701;
            var3 = this.field5057 - (this.field4984.field3742 * this.field4968 >> 8) >> this.field4984.field3701;
        } else {
            var2 = this.field5054 - (this.field4984.field3742 * this.field4968 >> 8) >> this.field4984.field3701;
            var3 = this.field5057 - (this.field4984.field3742 * this.field4981 >> 8) >> this.field4984.field3701;
        }
        int var4;
        int var5;
        if (this.field4984.field3803 <= 0) {
            var4 = this.field5044 - (this.field4984.field3803 * this.field4968 >> 8) >> this.field4984.field3701;
            var5 = this.field4970 - (this.field4984.field3803 * this.field4981 >> 8) >> this.field4984.field3701;
        } else {
            var4 = this.field5044 - (this.field4984.field3803 * this.field4981 >> 8) >> this.field4984.field3701;
            var5 = this.field4970 - (this.field4984.field3803 * this.field4968 >> 8) >> this.field4984.field3701;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class276 var8 = (class276) arg0;
        class276 var9;
        if (var8 != null && var8.method1720(var6, var7, 83)) {
            var9 = var8;
            var8.method1719(-119);
        } else {
            var9 = new class276(this.field4984, var6, var7);
        }
        var9.method1723((byte) 88, var4, var5, var2, var3);
        this.method2013(var9, (byte) -96);
        return var9;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BBIIS)I", line = 5254)
    private final int method2020(byte arg0, byte arg1, int arg2, int arg3, short arg4) {
        field5036++;
        if (arg1 != -65) {
            return 88;
        }
        int var6 = class461.field6721[class482.method2876(arg3, arg2, false)];
        if (arg4 != -1) {
            class161 var7 = this.field4984.field101.method1480(arg4 & 0xFFFF, arg1 ^ 0xFFFFC801);
            int var8 = var7.field2419 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg3 < 0) {
                    var9 = 0;
                } else if (arg3 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg3 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field2404 & 0xFF;
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
                var6 = ((var13 & 0xC200FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) - ((arg0 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!sg", name = "JA", descriptor = "(III)V", line = 5326)
    public final void method601(int arg0, int arg1, int arg2) {
        field4987++;
        for (int var4 = 0; var4 < this.field4978; var4++) {
            if (arg0 != 0) {
                this.field4995[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4959[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5038[var4] += arg2;
            }
        }
        if (this.field4979 != null) {
            this.field4979.field6343 = null;
        }
        this.field5001 = false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILc;Z)Z", line = 5358)
    public final boolean method655(int arg0, int arg1, class511 arg2, boolean arg3) {
        field4961++;
        class446 var5 = (class446) arg2;
        class446 var6 = this.field4984.field3737;
        float var7 = var5.field6566 * var6.field6597 + var5.field6589 * var6.field6577 + var5.field6574 * var6.field6598 + var6.field6574;
        float var8 = var5.field6566 * var6.field6581 + var5.field6589 * var6.field6565 + var5.field6574 * var6.field6567 + var6.field6589;
        float var9 = var5.field6566 * var6.field6568 + var5.field6589 * var6.field6586 + var5.field6574 * var6.field6590 + var6.field6566;
        class172.field2519 = var5.field6590 * var6.field6597 + var5.field6598 * var6.field6598 + var5.field6567 * var6.field6577;
        class424.field6328 = var5.field6568 * var6.field6581 + var5.field6597 * var6.field6567 + var5.field6581 * var6.field6565;
        class375.field5665 = var5.field6568 * var6.field6597 + var5.field6597 * var6.field6598 + var5.field6581 * var6.field6577;
        class10.field94 = var5.field6586 * var6.field6581 + var5.field6577 * var6.field6567 + var5.field6565 * var6.field6565;
        class521.field7667 = var5.field6586 * var6.field6597 + var5.field6577 * var6.field6598 + var5.field6565 * var6.field6577;
        class224.field3172 = var5.field6590 * var6.field6568 + var5.field6598 * var6.field6590 + var5.field6567 * var6.field6586;
        class515.field7561 = var5.field6586 * var6.field6568 + var5.field6577 * var6.field6590 + var5.field6565 * var6.field6586;
        class11.field98 = var5.field6568 * var6.field6568 + var5.field6597 * var6.field6590 + var5.field6581 * var6.field6586;
        class340.field5241 = var5.field6590 * var6.field6581 + var5.field6598 * var6.field6567 + var5.field6567 * var6.field6565;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field4984.field3835;
        int var16 = this.field4984.field3784;
        if (!this.field5001) {
            this.method2017(-24950);
        }
        class424.field6321[0] = this.field5054;
        class288.field4309[0] = this.field4968;
        class473.field6975[0] = this.field5044;
        class424.field6321[1] = this.field5057;
        class288.field4309[1] = this.field4968;
        class473.field6975[1] = this.field5044;
        class424.field6321[2] = this.field5054;
        class288.field4309[2] = this.field4981;
        class473.field6975[2] = this.field5044;
        class424.field6321[3] = this.field5057;
        class288.field4309[3] = this.field4981;
        class424.field6321[4] = this.field5054;
        class473.field6975[3] = this.field5044;
        class288.field4309[4] = this.field4968;
        class424.field6321[5] = this.field5057;
        class473.field6975[4] = this.field4970;
        class288.field4309[5] = this.field4968;
        class473.field6975[5] = this.field4970;
        class424.field6321[6] = this.field5054;
        class288.field4309[6] = this.field4981;
        class473.field6975[6] = this.field4970;
        class424.field6321[7] = this.field5057;
        class288.field4309[7] = this.field4981;
        class473.field6975[7] = this.field4970;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class424.field6321[var17];
            float var39 = (float) class288.field4309[var17];
            float var40 = (float) class473.field6975[var17];
            float var41 = class424.field6328 * var40 + class340.field5241 * var38 + class10.field94 * var39 + var8;
            float var42 = class11.field98 * var40 + class515.field7561 * var39 + class224.field3172 * var38 + var9;
            float var43 = class375.field5665 * var40 + class521.field7667 * var39 + class172.field2519 * var38 + var7;
            if (var42 >= (float) this.field4984.field3747) {
                float var44 = (float) var15 * var43 / var42 + (float) this.field4984.field3779;
                float var45 = (float) var16 * var41 / var42 + (float) this.field4984.field3828;
                if (var11 > var44) {
                    var11 = var44;
                }
                if (var12 < var44) {
                    var12 = var44;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && var13 < (float) arg1 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field4984.field3852.length < this.field4999) {
                this.field4984.field3847 = new int[this.field4999];
                this.field4984.field3852 = new int[this.field4999];
            }
            int[] var18 = this.field4984.field3852;
            int[] var19 = this.field4984.field3847;
            for (int var20 = 0; var20 < this.field4978; var20++) {
                float var22 = (float) this.field4959[var20];
                float var23 = (float) this.field5038[var20];
                float var24 = (float) this.field4995[var20];
                float var25 = class11.field98 * var23 + class515.field7561 * var22 + class224.field3172 * var24 + var9;
                float var26 = class375.field5665 * var23 + class521.field7667 * var22 + class172.field2519 * var24 + var7;
                float var27 = class424.field6328 * var23 + class340.field5241 * var24 + class10.field94 * var22 + var8;
                if ((var25 >= (float) this.field4984.field3747)) {
                    int var32 = (int) ((float) var15 * var26 / var25 + (float) this.field4984.field3779);
                    int var33 = (int) ((float) var16 * var27 / var25 + (float) this.field4984.field3828);
                    int var34 = this.field5035[var20];
                    int var35 = this.field5035[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field5020[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field5035[var20];
                    int var29 = this.field5035[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field5020[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field5020[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field5003; var21++) {
                if (var18[this.field5012[var21]] != -999999 && var18[this.field4975[var21]] != -999999 && var18[this.field5021[var21]] != -999999 && this.method2018(arg0, -129, arg1, var19[this.field5012[var21]], var18[this.field5012[var21]], var19[this.field5021[var21]], var19[this.field4975[var21]], var18[this.field5021[var21]], var18[this.field4975[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "()I", line = 5568)
    public final int method647() {
        field5046++;
        return this.field5053;
    }

    @OriginalMember(owner = "client!sg", name = "WA", descriptor = "()I", line = 5579)
    public final int method639() {
        if (!this.field5001) {
            this.method2017(-24950);
        }
        field4982++;
        return this.field4981;
    }
}
