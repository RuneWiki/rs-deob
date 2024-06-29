import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class745 extends class299 {

    @OriginalMember(owner = "client!to", name = "eb", descriptor = "Z")
    private boolean field10106 = false;

    @OriginalMember(owner = "client!to", name = "lb", descriptor = "I")
    private int field10113 = 0;

    @OriginalMember(owner = "client!to", name = "qb", descriptor = "Z")
    private boolean field10118 = false;

    @OriginalMember(owner = "client!to", name = "Rb", descriptor = "Z")
    private boolean field10145 = true;

    @OriginalMember(owner = "client!to", name = "Hb", descriptor = "I")
    private int field10135 = 0;

    @OriginalMember(owner = "client!to", name = "bc", descriptor = "I")
    private int field10155 = 0;

    @OriginalMember(owner = "client!to", name = "Vb", descriptor = "Z")
    private boolean field10149 = false;

    @OriginalMember(owner = "client!to", name = "Zb", descriptor = "I")
    private int field10153 = 0;

    @OriginalMember(owner = "client!to", name = "xc", descriptor = "I")
    private int field10177 = 0;

    @OriginalMember(owner = "client!to", name = "uc", descriptor = "Lck;")
    private class733 field10174;

    @OriginalMember(owner = "client!to", name = "zb", descriptor = "Ldea;")
    private class375 field10127;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "Ldea;")
    private class375 field10078;

    @OriginalMember(owner = "client!to", name = "Db", descriptor = "Ldea;")
    private class375 field10131;

    @OriginalMember(owner = "client!to", name = "tb", descriptor = "Ldea;")
    private class375 field10121;

    @OriginalMember(owner = "client!to", name = "Bb", descriptor = "Lbja;")
    private class257 field10129;

    @OriginalMember(owner = "client!to", name = "ac", descriptor = "I")
    private int field10154;

    @OriginalMember(owner = "client!to", name = "Kb", descriptor = "I")
    private int field10138;

    @OriginalMember(owner = "client!to", name = "dc", descriptor = "[I")
    private int[] field10157;

    @OriginalMember(owner = "client!to", name = "Hc", descriptor = "[S")
    private short[] field10187;

    @OriginalMember(owner = "client!to", name = "Wb", descriptor = "[I")
    private int[] field10150;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "[I")
    private int[] field10085;

    @OriginalMember(owner = "client!to", name = "oc", descriptor = "[I")
    private int[] field10168;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "[Lld;")
    private class49[] field10088;

    @OriginalMember(owner = "client!to", name = "ub", descriptor = "[Lsba;")
    private class581[] field10122;

    @OriginalMember(owner = "client!to", name = "kb", descriptor = "I")
    private int field10112;

    @OriginalMember(owner = "client!to", name = "jb", descriptor = "[Lmb;")
    private class87[] field10111;

    @OriginalMember(owner = "client!to", name = "qc", descriptor = "[Ldc;")
    private class67[] field10170;

    @OriginalMember(owner = "client!to", name = "O", descriptor = "S")
    private short field10090;

    @OriginalMember(owner = "client!to", name = "R", descriptor = "[S")
    private short[] field10093;

    @OriginalMember(owner = "client!to", name = "ic", descriptor = "[B")
    private byte[] field10162;

    @OriginalMember(owner = "client!to", name = "Pb", descriptor = "[S")
    private short[] field10143;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "[S")
    private short[] field10083;

    @OriginalMember(owner = "client!to", name = "yc", descriptor = "[S")
    private short[] field10178;

    @OriginalMember(owner = "client!to", name = "nc", descriptor = "[F")
    private float[] field10167;

    @OriginalMember(owner = "client!to", name = "Yb", descriptor = "[B")
    private byte[] field10152;

    @OriginalMember(owner = "client!to", name = "wb", descriptor = "[S")
    private short[] field10124;

    @OriginalMember(owner = "client!to", name = "wc", descriptor = "[S")
    private short[] field10176;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "[S")
    private short[] field10068;

    @OriginalMember(owner = "client!to", name = "rc", descriptor = "S")
    private short field10171;

    @OriginalMember(owner = "client!to", name = "fc", descriptor = "[F")
    private float[] field10159;

    @OriginalMember(owner = "client!to", name = "Ac", descriptor = "[S")
    private short[] field10180;

    @OriginalMember(owner = "client!to", name = "hc", descriptor = "[S")
    private short[] field10161;

    @OriginalMember(owner = "client!to", name = "tc", descriptor = "[S")
    private short[] field10173;

    @OriginalMember(owner = "client!to", name = "Q", descriptor = "[I")
    private int[] field10092;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "[[I")
    private int[][] field10084;

    @OriginalMember(owner = "client!to", name = "Bc", descriptor = "[[I")
    private int[][] field10181;

    @OriginalMember(owner = "client!to", name = "pc", descriptor = "[[I")
    private int[][] field10169;

    @OriginalMember(owner = "client!to", name = "Cc", descriptor = "Luw;")
    public static class208 field10182 = new class208(78, 6);

    @OriginalMember(owner = "client!to", name = "mb", descriptor = "B")
    private byte field10114;

    @OriginalMember(owner = "client!to", name = "Fc", descriptor = "F")
    public static float field10185;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!to", name = "G", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!to", name = "N", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!to", name = "P", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!to", name = "S", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!to", name = "T", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!to", name = "U", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!to", name = "V", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!to", name = "W", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!to", name = "X", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!to", name = "Y", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!to", name = "Z", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!to", name = "ab", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!to", name = "bb", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!to", name = "db", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!to", name = "fb", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!to", name = "gb", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!to", name = "hb", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!to", name = "ib", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!to", name = "nb", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!to", name = "pb", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!to", name = "rb", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!to", name = "yb", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!to", name = "Ab", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!to", name = "Cb", descriptor = "I")
    public static int field10130;

    @OriginalMember(owner = "client!to", name = "Eb", descriptor = "I")
    public static int field10132;

    @OriginalMember(owner = "client!to", name = "Fb", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!to", name = "Gb", descriptor = "I")
    public static int field10134;

    @OriginalMember(owner = "client!to", name = "Ib", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!to", name = "Jb", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!to", name = "Lb", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!to", name = "Nb", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!to", name = "Ob", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!to", name = "Qb", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!to", name = "Sb", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!to", name = "Tb", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!to", name = "Ub", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!to", name = "Xb", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!to", name = "cc", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!to", name = "ec", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!to", name = "gc", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!to", name = "jc", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!to", name = "kc", descriptor = "I")
    public static int field10164;

    @OriginalMember(owner = "client!to", name = "mc", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!to", name = "sc", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!to", name = "zc", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!to", name = "Dc", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!to", name = "Ec", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!to", name = "Gc", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!to", name = "Ic", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!to", name = "Jc", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!to", name = "Kc", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!to", name = "Lc", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!to", name = "sb", descriptor = "Lpm;")
    private class250 field10120;

    @OriginalMember(owner = "client!to", name = "vc", descriptor = "Lnk;")
    private class447 field10175;

    @OriginalMember(owner = "client!to", name = "lc", descriptor = "Lqm;")
    private class450 field10165;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "S")
    private short field10075;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "S")
    private short field10077;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "S")
    private short field10081;

    @OriginalMember(owner = "client!to", name = "cb", descriptor = "S")
    private short field10104;

    @OriginalMember(owner = "client!to", name = "ob", descriptor = "S")
    private short field10116;

    @OriginalMember(owner = "client!to", name = "vb", descriptor = "S")
    private short field10123;

    @OriginalMember(owner = "client!to", name = "xb", descriptor = "S")
    private short field10125;

    @OriginalMember(owner = "client!to", name = "Mb", descriptor = "S")
    private short field10140;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Loha;Lvu;I)V")
    public final void method1297(class465 arg0, class706 arg1, int arg2) {
        field10086++;
        if (this.field10135 == 0) {
            return;
        }
        class75 var4 = this.field10174.field9831;
        class75 var5 = (class75) arg0;
        if (!this.field10118) {
            this.method4047((byte) -94);
        }
        class324.field4003 = var4.field1031 * var5.field1063 + var4.field1063 * var5.field1062 + var4.field1060 * var5.field1047;
        class499.field6407 = var4.field1031 * var5.field1035 + var4.field1063 * var5.field1033 + var4.field1060 * var5.field1051 + var4.field1035;
        float var6 = (float) this.field10104 * class324.field4003 + class499.field6407;
        float var7 = (float) this.field10123 * class324.field4003 + class499.field6407;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field10075 + var6;
            var9 = (float) (-this.field10075) + var7;
        } else {
            var9 = var6 - (float) this.field10075;
            var8 = (float) this.field10075 + var7;
        }
        if ((this.field10174.field9882 <= var9) || ((float) this.field10174.field9860 >= var8)) {
            return;
        }
        class552.field6958 = var4.field1055 * var5.field1063 + var4.field1047 * var5.field1062 + var4.field1043 * var5.field1047;
        class615.field7770 = var4.field1055 * var5.field1035 + var4.field1047 * var5.field1033 + var4.field1043 * var5.field1051 + var4.field1051;
        float var10 = (float) this.field10104 * class552.field6958 + class615.field7770;
        float var11 = (float) this.field10123 * class552.field6958 + class615.field7770;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = (var11 - (float) this.field10075) * (float) this.field10174.field9847;
            var13 = ((float) this.field10075 + var10) * (float) this.field10174.field9847;
        } else {
            var12 = ((float) (-this.field10075) + var10) * (float) this.field10174.field9847;
            var13 = ((float) this.field10075 + var11) * (float) this.field10174.field9847;
        }
        if ((this.field10174.field9886 <= var12 / var8) || (var13 / var8 <= this.field10174.field9937)) {
            return;
        }
        class482.field6220 = var4.field1037 * var5.field1063 + var4.field1062 * var5.field1062 + var4.field1046 * var5.field1047;
        class407.field5417 = var4.field1037 * var5.field1035 + var4.field1062 * var5.field1033 + var4.field1046 * var5.field1051 + var4.field1033;
        float var14 = (float) this.field10104 * class482.field6220 + class407.field5417;
        float var15 = (float) this.field10123 * class482.field6220 + class407.field5417;
        float var16;
        float var17;
        if (var14 > var15) {
            var16 = (var15 - (float) this.field10075) * (float) this.field10174.field9844;
            var17 = ((float) this.field10075 + var14) * (float) this.field10174.field9844;
        } else {
            var17 = ((float) this.field10075 + var15) * (float) this.field10174.field9844;
            var16 = (var14 - (float) this.field10075) * (float) this.field10174.field9844;
        }
        if ((var16 / var8 >= this.field10174.field9940) || (var17 / var8 <= this.field10174.field9845)) {
            return;
        }
        if (arg1 != null || this.field10111 != null) {
            class303.field3825 = var4.field1055 * var5.field1031 + var4.field1047 * var5.field1037 + var4.field1043 * var5.field1055;
            class532.field6738 = var4.field1031 * var5.field1031 + var4.field1063 * var5.field1037 + var4.field1060 * var5.field1055;
            class228.field3077 = var4.field1037 * var5.field1031 + var4.field1062 * var5.field1037 + var4.field1046 * var5.field1055;
            class385.field4910 = var4.field1037 * var5.field1060 + var4.field1062 * var5.field1046 + var4.field1046 * var5.field1043;
            class349.field4273 = var4.field1031 * var5.field1060 + var4.field1063 * var5.field1046 + var4.field1060 * var5.field1043;
            class511.field6520 = var4.field1055 * var5.field1060 + var4.field1047 * var5.field1046 + var4.field1043 * var5.field1043;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field10125 + this.field10081 >> 1;
            int var21 = this.field10116 + this.field10077 >> 1;
            int var22 = (int) ((float) var21 * class303.field3825 + (float) this.field10104 * class552.field6958 + (float) var20 * class511.field6520 + class615.field7770);
            int var23 = (int) ((float) var21 * class228.field3077 + (float) this.field10104 * class482.field6220 + (float) var20 * class385.field4910 + class407.field5417);
            int var24 = (int) ((float) var21 * class532.field6738 + (float) this.field10104 * class324.field4003 + (float) var20 * class349.field4273 + class499.field6407);
            if (this.field10174.field9860 > var24) {
                var18 = true;
            } else {
                arg1.field9321 = this.field10174.field9847 * var22 / var24 + this.field10174.field9867;
                arg1.field9323 = this.field10174.field9844 * var23 / var24 + this.field10174.field9943;
            }
            int var25 = (int) ((float) var21 * class303.field3825 + (float) this.field10123 * class552.field6958 + (float) var20 * class511.field6520 + class615.field7770);
            int var26 = (int) ((float) var21 * class228.field3077 + (float) this.field10123 * class482.field6220 + (float) var20 * class385.field4910 + class407.field5417);
            int var27 = (int) ((float) var21 * class532.field6738 + (float) this.field10123 * class324.field4003 + (float) var20 * class349.field4273 + class499.field6407);
            if (var27 < this.field10174.field9860) {
                var18 = true;
            } else {
                arg1.field9320 = this.field10174.field9844 * var26 / var27 + this.field10174.field9943;
                arg1.field9322 = this.field10174.field9847 * var25 / var27 + this.field10174.field9867;
            }
            if (var18) {
                if (this.field10174.field9860 > var24 && var27 < this.field10174.field9860) {
                    var19 = false;
                } else if (var24 < this.field10174.field9860) {
                    int var31 = (var27 - this.field10174.field9860 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field9321 = this.field10174.field9847 * var32 / this.field10174.field9860 + this.field10174.field9867;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field9323 = this.field10174.field9844 * var33 / this.field10174.field9860 + this.field10174.field9943;
                } else if (this.field10174.field9860 > var27) {
                    int var28 = (var24 - this.field10174.field9860 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field9321 = this.field10174.field9867 + (this.field10174.field9847 * var29 / this.field10174.field9860);
                    arg1.field9323 = this.field10174.field9943 + (this.field10174.field9844 * var30 / this.field10174.field9860);
                }
            }
            if (var19) {
                arg1.field9324 = true;
                if (var24 <= var27) {
                    arg1.field9325 = (var25 + this.field10075) * this.field10174.field9847 / var27 + this.field10174.field9867 - arg1.field9322;
                } else {
                    arg1.field9325 = (this.field10075 + var22) * this.field10174.field9847 / var24 + this.field10174.field9867 - arg1.field9321;
                }
            }
        }
        this.field10174.method3950(-93);
        this.field10174.method3932(var5, false);
        this.method4049(-79);
        this.field10174.method3972(0);
        this.method4044((byte) -45);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Loha;IZ)V")
    public final void method1258(class465 arg0, int arg1, boolean arg2) {
        field10133++;
        if (this.field10187 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field10155; var5++) {
            if ((this.field10187[var5] & arg1) != 0) {
                if (arg2) {
                    arg0.method457(this.field10150[var5], this.field10085[var5], this.field10168[var5], var4);
                } else {
                    arg0.method446(this.field10150[var5], this.field10085[var5], this.field10168[var5], var4);
                }
                this.field10150[var5] = var4[0];
                this.field10085[var5] = var4[1];
                this.field10168[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "na", descriptor = "()I")
    public final int method1245() {
        if (!this.field10118) {
            this.method4047((byte) -59);
        }
        field10179++;
        return this.field10075;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZIIILoha;)Z")
    private final boolean method4039(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class465 arg6) {
        field10080++;
        class75 var8 = (class75) arg6;
        class75 var9 = this.field10174.field9831;
        float var10 = var8.field1035 * var9.field1055 + var8.field1051 * var9.field1043 + var8.field1033 * var9.field1047 + var9.field1051;
        float var11 = var8.field1035 * var9.field1037 + var8.field1051 * var9.field1046 + var8.field1033 * var9.field1062 + var9.field1033;
        class303.field3825 = var8.field1031 * var9.field1055 + var8.field1055 * var9.field1043 + var8.field1037 * var9.field1047;
        class552.field6958 = var8.field1063 * var9.field1055 + var8.field1062 * var9.field1047 + var8.field1047 * var9.field1043;
        class228.field3077 = var8.field1031 * var9.field1037 + var8.field1055 * var9.field1046 + var8.field1037 * var9.field1062;
        class349.field4273 = var8.field1060 * var9.field1031 + var8.field1046 * var9.field1063 + var8.field1043 * var9.field1060;
        float var12 = var8.field1035 * var9.field1031 + var8.field1051 * var9.field1060 + var8.field1033 * var9.field1063 + var9.field1035;
        class324.field4003 = var8.field1063 * var9.field1031 + var8.field1062 * var9.field1063 + var8.field1047 * var9.field1060;
        class385.field4910 = var8.field1060 * var9.field1037 + var8.field1046 * var9.field1062 + var8.field1043 * var9.field1046;
        class532.field6738 = var8.field1031 * var9.field1031 + var8.field1055 * var9.field1060 + var8.field1037 * var9.field1063;
        class482.field6220 = var8.field1063 * var9.field1037 + var8.field1062 * var9.field1062 + var8.field1047 * var9.field1046;
        class511.field6520 = var8.field1060 * var9.field1055 + var8.field1046 * var9.field1047 + var8.field1043 * var9.field1043;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field10174.field9847;
        int var19 = this.field10174.field9844;
        if (!this.field10118) {
            this.method4047((byte) -122);
        }
        int var20 = this.field10081 - this.field10125 >> 1;
        int var21 = this.field10123 - this.field10104 >> 1;
        int var22 = this.field10077 - this.field10116 >> 1;
        int var23 = this.field10125 + var20;
        int var24 = this.field10104 + var21;
        int var25 = this.field10116 + var22;
        int var26 = var23 - (var20 << arg1);
        int var27 = var24 - (var21 << arg1);
        int var28 = var25 - (var22 << arg1);
        if (arg0 != 999998) {
            this.field10088 = null;
        }
        int var29 = (var20 << arg1) + var23;
        int var30 = (var21 << arg1) + var24;
        class283.field3664[0] = var26;
        int var31 = (var22 << arg1) + var25;
        class340.field4175[0] = var27;
        class283.field3664[1] = var29;
        class198.field2758[0] = var28;
        class340.field4175[1] = var27;
        class283.field3664[2] = var26;
        class198.field2758[1] = var28;
        class340.field4175[2] = var30;
        class198.field2758[2] = var28;
        class283.field3664[3] = var29;
        class340.field4175[3] = var30;
        class283.field3664[4] = var26;
        class198.field2758[3] = var28;
        class340.field4175[4] = var27;
        class198.field2758[4] = var31;
        class283.field3664[5] = var29;
        class340.field4175[5] = var27;
        class198.field2758[5] = var31;
        class283.field3664[6] = var26;
        class340.field4175[6] = var30;
        class283.field3664[7] = var29;
        class198.field2758[6] = var31;
        class340.field4175[7] = var30;
        class198.field2758[7] = var31;
        for (int var32 = 0; var32 < 8; var32++) {
            float var53 = (float) class283.field3664[var32];
            float var54 = (float) class340.field4175[var32];
            float var55 = (float) class198.field2758[var32];
            float var56 = class303.field3825 * var55 + class552.field6958 * var54 + class511.field6520 * var53 + var10;
            float var57 = class228.field3077 * var55 + class482.field6220 * var54 + class385.field4910 * var53 + var11;
            float var58 = class532.field6738 * var55 + class349.field4273 * var53 + class324.field4003 * var54 + var12;
            if ((float) this.field10174.field9860 <= var58) {
                if (arg4 > 0) {
                    var58 = arg4;
                }
                float var59 = (float) var18 * var56 / var58 + (float) this.field10174.field9867;
                float var60 = (float) var19 * var57 / var58 + (float) this.field10174.field9943;
                if (var14 > var59) {
                    var14 = var59;
                }
                if (var15 < var59) {
                    var15 = var59;
                }
                if (var60 > var17) {
                    var17 = var60;
                }
                var13 = true;
                if (var16 > var60) {
                    var16 = var60;
                }
            }
        }
        if (var13 && var14 < (float) arg5 && var15 > (float) arg5 && var16 < (float) arg3 && (float) arg3 < var17) {
            if (arg2) {
                return true;
            }
            if (this.field10174.field9955.length < this.field10135) {
                this.field10174.field9955 = new int[this.field10135];
                this.field10174.field9954 = new int[this.field10135];
            }
            int[] var33 = this.field10174.field9955;
            int[] var34 = this.field10174.field9954;
            for (int var35 = 0; var35 < this.field10155; var35++) {
                float var37 = (float) this.field10150[var35];
                float var38 = (float) this.field10168[var35];
                float var39 = (float) this.field10085[var35];
                float var40 = class228.field3077 * var38 + class482.field6220 * var39 + class385.field4910 * var37 + var11;
                float var41 = class532.field6738 * var38 + class349.field4273 * var37 + class324.field4003 * var39 + var12;
                float var42 = class303.field3825 * var38 + class552.field6958 * var39 + class511.field6520 * var37 + var10;
                if ((float) this.field10174.field9860 <= var41) {
                    if (arg4 > 0) {
                        var41 = arg4;
                    }
                    int var43 = (int) ((float) var18 * var42 / var41 + (float) this.field10174.field9867);
                    int var44 = (int) ((float) var19 * var40 / var41 + (float) this.field10174.field9943);
                    int var45 = this.field10157[var35];
                    int var46 = this.field10157[var35 + 1];
                    for (int var47 = var45; var47 < var46; var47++) {
                        int var48 = this.field10083[var47] - 1;
                        if (var48 == -1) {
                            break;
                        }
                        var33[var48] = var43;
                        var34[var48] = var44;
                    }
                } else {
                    int var49 = this.field10157[var35];
                    int var50 = this.field10157[var35 + 1];
                    for (int var51 = var49; var51 < var50; var51++) {
                        int var52 = this.field10083[var51] - 1;
                        if (var52 == -1) {
                            break;
                        }
                        var33[this.field10083[var51] - 1] = -999999;
                    }
                }
            }
            for (int var36 = 0; var36 < this.field10177; var36++) {
                if (var33[this.field10180[var36]] != -999999 && var33[this.field10173[var36]] != -999999 && var33[this.field10176[var36]] != -999999 && this.method4045(var34[this.field10173[var36]], arg5, var34[this.field10180[var36]], var34[this.field10176[var36]], var33[this.field10176[var36]], var33[this.field10173[var36]], var33[this.field10180[var36]], false, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "G", descriptor = "()I")
    public final int method1261() {
        if (!this.field10118) {
            this.method4047((byte) -36);
        }
        field10069++;
        return this.field10077;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BIZ)Lka;")
    public final class299 method1284(byte arg0, int arg1, boolean arg2) {
        field10099++;
        class745 var4;
        class745 var5;
        if (arg0 == 1) {
            var4 = this.field10174.field9855;
            var5 = this.field10174.field9868;
        } else if (arg0 == 2) {
            var4 = this.field10174.field9932;
            var5 = this.field10174.field9918;
        } else if (arg0 == 3) {
            var5 = this.field10174.field9866;
            var4 = this.field10174.field9858;
        } else if (arg0 == 4) {
            var4 = this.field10174.field9863;
            var5 = this.field10174.field9902;
        } else if (arg0 == 5) {
            var5 = this.field10174.field9853;
            var4 = this.field10174.field9920;
        } else {
            var5 = var4 = new class745(this.field10174);
        }
        return this.method4040(arg1, -4, arg2, var4, arg0 != 0, var5);
    }

    @OriginalMember(owner = "client!to", name = "ba", descriptor = "(Lr;)Lr;")
    public final class736 method1286(class736 arg0) {
        field10110++;
        if (this.field10135 == 0) {
            return null;
        }
        if (!this.field10118) {
            this.method4047((byte) -125);
        }
        int var2;
        int var3;
        if (this.field10174.field9859 > 0) {
            var2 = this.field10125 - (this.field10174.field9859 * this.field10123 >> 8) >> this.field10174.field9804;
            var3 = this.field10081 - (this.field10174.field9859 * this.field10104 >> 8) >> this.field10174.field9804;
        } else {
            var2 = this.field10125 - (this.field10174.field9859 * this.field10104 >> 8) >> this.field10174.field9804;
            var3 = this.field10081 - (this.field10174.field9859 * this.field10123 >> 8) >> this.field10174.field9804;
        }
        int var4;
        int var5;
        if (this.field10174.field9935 > 0) {
            var4 = this.field10116 - (this.field10174.field9935 * this.field10123 >> 8) >> this.field10174.field9804;
            var5 = this.field10077 - (this.field10174.field9935 * this.field10104 >> 8) >> this.field10174.field9804;
        } else {
            var4 = this.field10116 - (this.field10174.field9935 * this.field10104 >> 8) >> this.field10174.field9804;
            var5 = this.field10077 - (this.field10174.field9935 * this.field10123 >> 8) >> this.field10174.field9804;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class474 var8 = (class474) arg0;
        class474 var9;
        if (var8 != null && var8.method2674(var7, false, var6)) {
            var9 = var8;
            var8.method2670((byte) 31);
        } else {
            var9 = new class474(this.field10174, var6, var7);
        }
        var9.method2671(var2, var4, var5, 113, var3);
        this.method4052(var9, -27790);
        return var9;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "()[Lld;")
    public final class49[] method1246() {
        field10186++;
        return this.field10088;
    }

    @OriginalMember(owner = "client!to", name = "WA", descriptor = "()I")
    public final int method1295() {
        field10188++;
        return this.field10090;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIZLto;ZLto;)Lka;")
    private final class299 method4040(int arg0, int arg1, boolean arg2, class745 arg3, boolean arg4, class745 arg5) {
        arg5.field10135 = this.field10135;
        arg5.field10113 = this.field10113;
        arg5.field10112 = this.field10112;
        if (arg1 != -4) {
            this.method1282(-58, -127, -89);
        }
        arg5.field10177 = this.field10177;
        arg5.field10090 = this.field10090;
        arg5.field10171 = this.field10171;
        arg5.field10149 = this.field10149;
        arg5.field10155 = this.field10155;
        if ((arg0 & 0x100) == 0) {
            arg5.field10106 = this.field10106;
        } else {
            arg5.field10106 = true;
        }
        field10089++;
        arg5.field10154 = this.field10154;
        arg5.field10153 = this.field10153;
        arg5.field10138 = arg0;
        arg5.field10114 = 0;
        boolean var7 = class578.method3102(this.field10154, arg0, (byte) 105);
        boolean var8 = class307.method1811(this.field10154, arg0, 81);
        boolean var9 = class298.method1776(79, this.field10154, arg0);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg5.field10150 = this.field10150;
            } else if (arg3.field10150 == null || arg3.field10150.length < this.field10153) {
                arg5.field10150 = arg3.field10150 = new int[this.field10153];
            } else {
                arg5.field10150 = arg3.field10150;
            }
            if (!var8) {
                arg5.field10085 = this.field10085;
            } else if (arg3.field10085 == null || this.field10153 > arg3.field10085.length) {
                arg5.field10085 = arg3.field10085 = new int[this.field10153];
            } else {
                arg5.field10085 = arg3.field10085;
            }
            if (!var9) {
                arg5.field10168 = this.field10168;
            } else if (arg3.field10168 == null || this.field10153 > arg3.field10168.length) {
                arg5.field10168 = arg3.field10168 = new int[this.field10153];
            } else {
                arg5.field10168 = arg3.field10168;
            }
            for (int var11 = 0; var11 < this.field10153; var11++) {
                if (var7) {
                    arg5.field10150[var11] = this.field10150[var11];
                }
                if (var8) {
                    arg5.field10085[var11] = this.field10085[var11];
                }
                if (var9) {
                    arg5.field10168[var11] = this.field10168[var11];
                }
            }
        } else {
            arg5.field10150 = this.field10150;
            arg5.field10168 = this.field10168;
            arg5.field10085 = this.field10085;
        }
        if (class19.method85(arg0, (byte) 112, this.field10154)) {
            arg5.field10127 = arg3.field10127;
            if (arg4) {
                arg5.field10114 = (byte) (arg5.field10114 | 0x1);
            }
            arg5.field10127.field4585 = this.field10127.field4585;
            arg5.field10127.field4583 = this.field10127.field4583;
        } else if (class650.method3506(2048, arg0, this.field10154)) {
            arg5.field10127 = this.field10127;
        } else {
            arg5.field10127 = null;
        }
        if (class472.method2664(this.field10154, arg0, -8056)) {
            if (arg3.field10161 == null || this.field10177 > arg3.field10161.length) {
                arg5.field10161 = arg3.field10161 = new short[this.field10177];
            } else {
                arg5.field10161 = arg3.field10161;
            }
            for (int var12 = 0; var12 < this.field10177; var12++) {
                arg5.field10161[var12] = this.field10161[var12];
            }
        } else {
            arg5.field10161 = this.field10161;
        }
        if (class325.method1880(arg0, this.field10154, -2)) {
            if (arg3.field10162 == null || arg3.field10162.length < this.field10177) {
                arg5.field10162 = arg3.field10162 = new byte[this.field10177];
            } else {
                arg5.field10162 = arg3.field10162;
            }
            for (int var13 = 0; var13 < this.field10177; var13++) {
                arg5.field10162[var13] = this.field10162[var13];
            }
        } else {
            arg5.field10162 = this.field10162;
        }
        if (class92.method554(arg0, (byte) 61, this.field10154)) {
            arg5.field10121 = arg3.field10121;
            if (arg4) {
                arg5.field10114 = (byte) (arg5.field10114 | 0x2);
            }
            arg5.field10121.field4583 = this.field10121.field4583;
            arg5.field10121.field4585 = this.field10121.field4585;
        } else if (class729.method3896(arg1 + 121, this.field10154, arg0)) {
            arg5.field10121 = this.field10121;
        } else {
            arg5.field10121 = null;
        }
        if (class120.method715(this.field10154, arg0, -115)) {
            if (arg3.field10124 == null || this.field10135 > arg3.field10124.length) {
                int var14 = this.field10135;
                arg5.field10124 = arg3.field10124 = new short[var14];
                arg5.field10143 = arg3.field10143 = new short[var14];
                arg5.field10093 = arg3.field10093 = new short[var14];
            } else {
                arg5.field10143 = arg3.field10143;
                arg5.field10093 = arg3.field10093;
                arg5.field10124 = arg3.field10124;
            }
            if (this.field10165 == null) {
                for (int var18 = 0; var18 < this.field10135; var18++) {
                    arg5.field10124[var18] = this.field10124[var18];
                    arg5.field10093[var18] = this.field10093[var18];
                    arg5.field10143[var18] = this.field10143[var18];
                }
            } else {
                if (arg3.field10165 == null) {
                    arg3.field10165 = new class450();
                }
                class450 var15 = arg5.field10165 = arg3.field10165;
                if (var15.field5870 == null || var15.field5870.length < this.field10135) {
                    int var16 = this.field10135;
                    var15.field5870 = new short[var16];
                    var15.field5871 = new short[var16];
                    var15.field5880 = new byte[var16];
                    var15.field5874 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field10135; var17++) {
                    arg5.field10124[var17] = this.field10124[var17];
                    arg5.field10093[var17] = this.field10093[var17];
                    arg5.field10143[var17] = this.field10143[var17];
                    var15.field5870[var17] = this.field10165.field5870[var17];
                    var15.field5874[var17] = this.field10165.field5874[var17];
                    var15.field5871[var17] = this.field10165.field5871[var17];
                    var15.field5880[var17] = this.field10165.field5880[var17];
                }
            }
            arg5.field10152 = this.field10152;
        } else {
            arg5.field10093 = this.field10093;
            arg5.field10152 = this.field10152;
            arg5.field10143 = this.field10143;
            arg5.field10124 = this.field10124;
            arg5.field10165 = this.field10165;
        }
        if (class151.method862((byte) 122, arg0, this.field10154)) {
            if (arg4) {
                arg5.field10114 = (byte) (arg5.field10114 | 0x4);
            }
            arg5.field10131 = arg3.field10131;
            arg5.field10131.field4585 = this.field10131.field4585;
            arg5.field10131.field4583 = this.field10131.field4583;
        } else if (class185.method1305(this.field10154, arg0, (byte) -38)) {
            arg5.field10131 = this.field10131;
        } else {
            arg5.field10131 = null;
        }
        if (class76.method470(this.field10154, 117, arg0)) {
            if (arg3.field10159 == null || arg3.field10159.length < this.field10177) {
                int var19 = this.field10135;
                arg5.field10159 = arg3.field10159 = new float[var19];
                arg5.field10167 = arg3.field10167 = new float[var19];
            } else {
                arg5.field10167 = arg3.field10167;
                arg5.field10159 = arg3.field10159;
            }
            for (int var20 = 0; var20 < this.field10135; var20++) {
                arg5.field10159[var20] = this.field10159[var20];
                arg5.field10167[var20] = this.field10167[var20];
            }
        } else {
            arg5.field10167 = this.field10167;
            arg5.field10159 = this.field10159;
        }
        if (class759.method4131(this.field10154, arg0, arg1 ^ 0x3)) {
            arg5.field10078 = arg3.field10078;
            if (arg4) {
                arg5.field10114 = (byte) (arg5.field10114 | 0x8);
            }
            arg5.field10078.field4583 = this.field10078.field4583;
            arg5.field10078.field4585 = this.field10078.field4585;
        } else if (class593.method3190(6151, this.field10154, arg0)) {
            arg5.field10078 = this.field10078;
        } else {
            arg5.field10078 = null;
        }
        if (class168.method1067(arg0, this.field10154, (byte) -118)) {
            if (arg3.field10180 == null || this.field10177 > arg3.field10180.length) {
                int var21 = this.field10177;
                arg5.field10173 = arg3.field10173 = new short[var21];
                arg5.field10180 = arg3.field10180 = new short[var21];
                arg5.field10176 = arg3.field10176 = new short[var21];
            } else {
                arg5.field10180 = arg3.field10180;
                arg5.field10176 = arg3.field10176;
                arg5.field10173 = arg3.field10173;
            }
            for (int var22 = 0; var22 < this.field10177; var22++) {
                arg5.field10180[var22] = this.field10180[var22];
                arg5.field10173[var22] = this.field10173[var22];
                arg5.field10176[var22] = this.field10176[var22];
            }
        } else {
            arg5.field10180 = this.field10180;
            arg5.field10173 = this.field10173;
            arg5.field10176 = this.field10176;
        }
        if (class551.method2988(arg0, arg1 + 15958, this.field10154)) {
            arg5.field10129 = arg3.field10129;
            if (arg4) {
                arg5.field10114 = (byte) (arg5.field10114 | 0x10);
            }
            arg5.field10129.field3478 = this.field10129.field3478;
        } else if (class31.method162(arg1 + 7730, arg0, this.field10154)) {
            arg5.field10129 = this.field10129;
        } else {
            arg5.field10129 = null;
        }
        if (class469.method2653(this.field10154, -124, arg0)) {
            if (arg3.field10178 == null || this.field10177 > arg3.field10178.length) {
                int var23 = this.field10177;
                arg5.field10178 = arg3.field10178 = new short[var23];
            } else {
                arg5.field10178 = arg3.field10178;
            }
            for (int var24 = 0; var24 < this.field10177; var24++) {
                arg5.field10178[var24] = this.field10178[var24];
            }
        } else {
            arg5.field10178 = this.field10178;
        }
        if (!class385.method2210(this.field10154, arg1 + 22574, arg0)) {
            arg5.field10170 = this.field10170;
        } else if (arg3.field10170 == null || this.field10112 > arg3.field10170.length) {
            int var26 = this.field10112;
            arg5.field10170 = arg3.field10170 = new class67[var26];
            for (int var27 = 0; var27 < this.field10112; var27++) {
                arg5.field10170[var27] = this.field10170[var27].method391(-300);
            }
        } else {
            arg5.field10170 = arg3.field10170;
            for (int var25 = 0; var25 < this.field10112; var25++) {
                arg5.field10170[var25].method392(this.field10170[var25], 520);
            }
        }
        arg5.field10169 = this.field10169;
        arg5.field10083 = this.field10083;
        arg5.field10088 = this.field10088;
        if (this.field10118) {
            arg5.field10077 = this.field10077;
            arg5.field10075 = this.field10075;
            arg5.field10140 = this.field10140;
            arg5.field10081 = this.field10081;
            arg5.field10123 = this.field10123;
            arg5.field10125 = this.field10125;
            arg5.field10118 = true;
            arg5.field10104 = this.field10104;
            arg5.field10116 = this.field10116;
        } else {
            arg5.field10118 = false;
        }
        arg5.field10122 = this.field10122;
        arg5.field10157 = this.field10157;
        arg5.field10111 = this.field10111;
        arg5.field10084 = this.field10084;
        arg5.field10092 = this.field10092;
        arg5.field10068 = this.field10068;
        arg5.field10187 = this.field10187;
        arg5.field10181 = this.field10181;
        return arg5;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILoha;ZII)Z")
    public final boolean method1233(int arg0, int arg1, class465 arg2, boolean arg3, int arg4, int arg5) {
        field10107++;
        return this.method4039(999998, arg4, arg3, arg1, arg5, arg0, arg2);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBLck;Ljava/lang/String;)Ll;")
    public static final class668 method4041(int arg0, byte arg1, class733 arg2, String arg3) {
        field10148++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        if (arg1 < 41) {
            field10185 = 0.30747443F;
        }
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class597.field7588, 0);
        if (class597.field7588[0] == 0) {
            if (class597.field7588[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class597.field7588, 1);
            if (class597.field7588[1] > 1) {
                byte[] var6 = new byte[class597.field7588[1]];
                OpenGL.glGetInfoLogARB(var4, class597.field7588[1], class597.field7588, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class597.field7588[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class668(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public static void method4042(byte arg0) {
        if (arg0 == 77) {
            field10182 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1285(class299 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field10151++;
        class745 var6 = (class745) arg0;
        if (this.field10177 == 0 || var6.field10177 == 0) {
            return;
        }
        int var7 = var6.field10155;
        int[] var8 = var6.field10150;
        int[] var9 = var6.field10085;
        int[] var10 = var6.field10168;
        short[] var11 = var6.field10124;
        short[] var12 = var6.field10093;
        short[] var13 = var6.field10143;
        byte[] var14 = var6.field10152;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field10165 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field10165.field5871;
            var17 = this.field10165.field5880;
            var16 = this.field10165.field5874;
            var18 = this.field10165.field5870;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field10165 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field10165.field5880;
            var19 = var6.field10165.field5871;
            var20 = var6.field10165.field5870;
            var22 = var6.field10165.field5874;
        }
        int[] var23 = var6.field10157;
        short[] var24 = var6.field10083;
        if (!var6.field10118) {
            var6.method4047((byte) -119);
        }
        short var25 = var6.field10104;
        short var26 = var6.field10123;
        short var27 = var6.field10125;
        short var28 = var6.field10081;
        short var29 = var6.field10116;
        short var30 = var6.field10077;
        for (int var31 = 0; var31 < this.field10155; var31++) {
            int var32 = this.field10085[var31] - arg2;
            if (var25 <= var32 && var32 <= var26) {
                int var33 = this.field10150[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field10168[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field10157[var31];
                        int var37 = this.field10157[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field10083[var38] - 1;
                            if (var35 == -1 || this.field10152[var35] != 0) {
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
                                        if (var18 == null) {
                                            this.field10165 = new class450();
                                            var18 = this.field10165.field5870 = class433.method2485(this.field10124, 24);
                                            var16 = this.field10165.field5874 = class433.method2485(this.field10093, 102);
                                            var15 = this.field10165.field5871 = class433.method2485(this.field10143, 90);
                                            var17 = this.field10165.field5880 = class424.method2446((byte) 67, this.field10152);
                                        }
                                        if (var20 == null) {
                                            class450 var44 = var6.field10165 = new class450();
                                            var20 = var44.field5870 = class433.method2485(var11, 96);
                                            var22 = var44.field5874 = class433.method2485(var12, 105);
                                            var19 = var44.field5871 = class433.method2485(var13, 50);
                                            var21 = var44.field5880 = class424.method2446((byte) -66, var14);
                                        }
                                        short var45 = this.field10124[var35];
                                        short var46 = this.field10093[var35];
                                        short var47 = this.field10143[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field10152[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var22[var52] += var46;
                                                var19[var52] += var47;
                                                var21[var52] += var50;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        byte var54 = var14[var42];
                                        int var55 = this.field10157[var31];
                                        int var56 = this.field10157[var31 + 1];
                                        short var57 = var11[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var55; var59 < var56; var59++) {
                                            int var60 = this.field10083[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var57;
                                                var16[var60] += var53;
                                                var15[var60] += var58;
                                                var17[var60] += var54;
                                            }
                                        }
                                        if (this.field10131 == null && this.field10121 != null) {
                                            this.field10121.field4583 = null;
                                        }
                                        if (this.field10131 != null) {
                                            this.field10131.field4583 = null;
                                        }
                                        if (var6.field10131 == null && var6.field10121 != null) {
                                            var6.field10121.field4583 = null;
                                        }
                                        if (var6.field10131 != null) {
                                            var6.field10131.field4583 = null;
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

    @OriginalMember(owner = "client!to", name = "b", descriptor = "()Z")
    public final boolean method1230() {
        field10119++;
        if (this.field10178 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field10178.length; var1++) {
            if (this.field10178[var1] != -1 && !this.field10174.field7199.method1733(-1852, this.field10178[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IFIIIBLsu;FIJ)S")
    private final short method4043(int arg0, float arg1, int arg2, int arg3, int arg4, byte arg5, class615 arg6, float arg7, int arg8, long arg9) {
        field10190++;
        int var12 = this.field10157[arg4];
        int var13 = this.field10157[arg4 + 1];
        int var14 = 0;
        int var15 = 10 / ((-arg5 - 63) / 47);
        for (int var16 = var12; var16 < var13; var16++) {
            short var17 = this.field10083[var16];
            if (var17 == 0) {
                var14 = var16;
                break;
            }
            if (class757.field10322[var16] == arg9) {
                return (short) (var17 - 1);
            }
        }
        this.field10083[var14] = (short) (this.field10135 + 1);
        class757.field10322[var14] = arg9;
        this.field10124[this.field10135] = (short) arg3;
        this.field10093[this.field10135] = (short) arg2;
        this.field10143[this.field10135] = (short) arg0;
        this.field10152[this.field10135] = (byte) arg8;
        this.field10159[this.field10135] = arg1;
        this.field10167[this.field10135] = arg7;
        return (short) (this.field10135++);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIII)V")
    public final void method1251(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field10177; var5++) {
            int var9 = this.field10161[var5] & 0xFFFF;
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
            this.field10161[var5] = (short) class77.method473(var12, class77.method473(var11 << 7, var10 << 10));
        }
        field10132++;
        if (this.field10111 != null) {
            for (int var6 = 0; var6 < this.field10112; var6++) {
                class87 var7 = this.field10111[var6];
                class67 var8 = this.field10170[var6];
                var8.field881 = var8.field881 & 0xFF000000 | class594.field7542[this.field10161[var7.field1207] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field10121 != null) {
            this.field10121.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V")
    private final void method4044(byte arg0) {
        field10070++;
        if (arg0 != -45) {
            this.method4047((byte) 59);
        }
        if (this.field10111 == null) {
            return;
        }
        class75 var2 = this.field10174.field9802;
        this.field10174.method3939((byte) -114);
        this.field10174.method883(!this.field10106);
        this.field10174.method3974(false, 5);
        this.field10174.method3947(this.field10174.field9890, this.field10174.field9877, null, null, arg0 ^ 0xFFFF7FA5);
        for (int var3 = 0; var3 < this.field10112; var3++) {
            class87 var4 = this.field10111[var3];
            class67 var5 = this.field10170[var3];
            if (!var4.field1212 || !this.field10174.method899()) {
                float var6 = (float) (this.field10150[var4.field1211] + this.field10150[var4.field1205] + this.field10150[var4.field1208]) * 0.3333333F;
                float var7 = (float) (this.field10085[var4.field1211] + this.field10085[var4.field1208] + this.field10085[var4.field1205]) * 0.3333333F;
                float var8 = (float) (this.field10168[var4.field1211] + this.field10168[var4.field1205] + this.field10168[var4.field1208]) * 0.3333333F;
                float var9 = class303.field3825 * var8 + class552.field6958 * var7 + class511.field6520 * var6 + class615.field7770;
                float var10 = class228.field3077 * var8 + class482.field6220 * var7 + class385.field4910 * var6 + class407.field5417;
                float var11 = class532.field6738 * var8 + class349.field4273 * var6 + class324.field4003 * var7 + class499.field6407;
                float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field1215;
                var2.method452(var4.field1216 * var5.field880 >> 7, -11255, (float) var5.field878 + var9 - var9 * var12, var11 * var12 + -var11, var4.field1214 * var5.field885 >> 7, var10 * var12 + ((float) var5.field883 - var10), var5.field879);
                this.field10174.method3977(var2, 0);
                int var13 = var5.field881;
                OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                this.field10174.method3935(var4.field1213, (byte) -42);
                this.field10174.method3920(var4.field1217, 9770);
                this.field10174.method3987(false, 4, 0, 7);
            }
        }
        this.field10174.method883(true);
        this.field10174.method3972(0);
    }

    @OriginalMember(owner = "client!to", name = "FA", descriptor = "(I)V")
    public final void method1271(int arg0) {
        field10163++;
        int var2 = class541.field6805[arg0];
        int var3 = class541.field6806[arg0];
        for (int var4 = 0; var4 < this.field10155; var4++) {
            int var5 = this.field10085[var4] * var3 - this.field10168[var4] * var2 >> 14;
            this.field10168[var4] = this.field10168[var4] * var3 + this.field10085[var4] * var2 >> 14;
            this.field10085[var4] = var5;
        }
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
        this.field10118 = false;
    }

    @OriginalMember(owner = "client!to", name = "HA", descriptor = "()I")
    public final int method1279() {
        if (!this.field10118) {
            this.method4047((byte) -86);
        }
        field10189++;
        return this.field10116;
    }

    @OriginalMember(owner = "client!to", name = "r", descriptor = "()Z")
    public final boolean method1235() {
        field10097++;
        return this.field10149;
    }

    @OriginalMember(owner = "client!to", name = "aa", descriptor = "(SS)V")
    public final void method1270(short arg0, short arg1) {
        field10082++;
        class284 var3 = this.field10174.field7199;
        for (int var4 = 0; var4 < this.field10177; var4++) {
            if (this.field10178[var4] == arg0) {
                this.field10178[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class191 var7 = var3.method1732((byte) -28, arg0 & 0xFFFF);
            var5 = var7.field2672;
            var6 = var7.field2661;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class191 var10 = var3.method1732((byte) 116, arg1 & 0xFFFF);
            var8 = var10.field2672;
            var9 = var10.field2661;
            if (var10.field2662 != 0 || var10.field2665 != 0) {
                this.field10149 = true;
            }
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field10111 != null) {
            for (int var11 = 0; var11 < this.field10112; var11++) {
                class87 var12 = this.field10111[var11];
                class67 var13 = this.field10170[var11];
                var13.field881 = class594.field7542[this.field10161[var12.field1207] & 0xFFFF] & 0xFFFFFF | var13.field881 & 0xFF000000;
            }
        }
        if (this.field10121 != null) {
            this.field10121.field4583 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIIZI)Z")
    private final boolean method4045(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field10136++;
        if (arg2 > arg8 && arg8 < arg0 && arg8 < arg3) {
            return false;
        } else if (arg2 < arg8 && arg8 > arg0 && arg8 > arg3) {
            return false;
        } else if (arg1 < arg6 && arg1 < arg5 && arg4 > arg1) {
            return false;
        } else if (arg6 < arg1 && arg1 > arg5 && arg1 > arg4) {
            return false;
        } else {
            if (arg7) {
                this.method1289(111);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!to", name = "C", descriptor = "(I)V")
    public final void method1293(int arg0) {
        if (this.field10121 != null) {
            this.field10121.field4583 = null;
        }
        this.field10090 = (short) arg0;
        field10172++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1302(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field10073++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class72.field981 = 0;
            class450.field5879 = 0;
            class347.field4257 = 0;
            int var12 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field10084.length > var14) {
                    int[] var15 = this.field10084[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class72.field981 += this.field10150[var17];
                        class347.field4257 += this.field10085[var17];
                        class450.field5879 += this.field10168[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class450.field5879 = var11;
                class72.field981 = var10;
                class347.field4257 = var9;
            } else {
                class450.field5879 = class450.field5879 / var12 + var11;
                class72.field981 = class72.field981 / var12 + var10;
                class347.field4257 = class347.field4257 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field10084.length > var22) {
                    int[] var23 = this.field10084[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field10150[var25] += var20;
                        this.field10085[var25] += var18;
                        this.field10168[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field10084.length) {
                    int[] var46 = this.field10084[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field10150[var59] -= class72.field981;
                            this.field10085[var59] -= class347.field4257;
                            this.field10168[var59] -= class450.field5879;
                            if (arg4 != 0) {
                                int var60 = class541.field6805[arg4];
                                int var61 = class541.field6806[arg4];
                                int var62 = this.field10085[var59] * var60 + (this.field10150[var59] * var61) + 16383 >> 14;
                                this.field10085[var59] = this.field10085[var59] * var61 + 16383 - (this.field10150[var59] * var60) >> 14;
                                this.field10150[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class541.field6805[arg2];
                                int var64 = class541.field6806[arg2];
                                int var65 = this.field10085[var59] * var64 + 16383 - (this.field10168[var59] * var63) >> 14;
                                this.field10168[var59] = this.field10085[var59] * var63 - (-(this.field10168[var59] * var64) - 16383) >> 14;
                                this.field10085[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class541.field6805[arg3];
                                int var67 = class541.field6806[arg3];
                                int var68 = this.field10168[var59] * var66 - (-(this.field10150[var59] * var67) - 16383) >> 14;
                                this.field10168[var59] = this.field10168[var59] * var67 + 16383 - (this.field10150[var59] * var66) >> 14;
                                this.field10150[var59] = var68;
                            }
                            this.field10150[var59] += class72.field981;
                            this.field10085[var59] += class347.field4257;
                            this.field10168[var59] += class450.field5879;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field10150[var48] -= class72.field981;
                            this.field10085[var48] -= class347.field4257;
                            this.field10168[var48] -= class450.field5879;
                            if (arg2 != 0) {
                                int var49 = class541.field6805[arg2];
                                int var50 = class541.field6806[arg2];
                                int var51 = this.field10085[var48] * var50 + 16383 - this.field10168[var48] * var49 >> 14;
                                this.field10168[var48] = this.field10168[var48] * var50 + this.field10085[var48] * var49 + 16383 >> 14;
                                this.field10085[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class541.field6805[arg4];
                                int var53 = class541.field6806[arg4];
                                int var54 = this.field10085[var48] * var52 + (this.field10150[var48] * var53 + 16383) >> 14;
                                this.field10085[var48] = this.field10085[var48] * var53 + 16383 - (this.field10150[var48] * var52) >> 14;
                                this.field10150[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class541.field6805[arg3];
                                int var56 = class541.field6806[arg3];
                                int var57 = this.field10168[var48] * var55 + (this.field10150[var48] * var56) + 16383 >> 14;
                                this.field10168[var48] = this.field10168[var48] * var56 + 16383 - this.field10150[var48] * var55 >> 14;
                                this.field10150[var48] = var57;
                            }
                            this.field10150[var48] += class72.field981;
                            this.field10085[var48] += class347.field4257;
                            this.field10168[var48] += class450.field5879;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field10084.length) {
                        int[] var29 = this.field10084[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field10157[var31];
                            int var33 = this.field10157[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field10083[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class541.field6805[arg4];
                                    int var37 = class541.field6806[arg4];
                                    int var38 = this.field10093[var35] * var36 + this.field10124[var35] * var37 + 16383 >> 14;
                                    this.field10093[var35] = (short) (this.field10093[var35] * var37 + 16383 - (this.field10124[var35] * var36) >> 14);
                                    this.field10124[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class541.field6805[arg2];
                                    int var40 = class541.field6806[arg2];
                                    int var41 = this.field10093[var35] * var40 + 16383 - this.field10143[var35] * var39 >> 14;
                                    this.field10143[var35] = (short) (this.field10143[var35] * var40 + this.field10093[var35] * var39 + 16383 >> 14);
                                    this.field10093[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class541.field6805[arg3];
                                    int var43 = class541.field6806[arg3];
                                    int var44 = this.field10143[var35] * var42 + this.field10124[var35] * var43 + 16383 >> 14;
                                    this.field10143[var35] = (short) (this.field10143[var35] * var43 + 16383 - (this.field10124[var35] * var42) >> 14);
                                    this.field10124[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field10131 == null && this.field10121 != null) {
                    this.field10121.field4583 = null;
                }
                if (this.field10131 != null) {
                    this.field10131.field4583 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field10084.length) {
                    int[] var71 = this.field10084[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field10150[var73] -= class72.field981;
                        this.field10085[var73] -= class347.field4257;
                        this.field10168[var73] -= class450.field5879;
                        this.field10150[var73] = this.field10150[var73] * arg2 >> 7;
                        this.field10085[var73] = this.field10085[var73] * arg3 >> 7;
                        this.field10168[var73] = this.field10168[var73] * arg4 >> 7;
                        this.field10150[var73] += class72.field981;
                        this.field10085[var73] += class347.field4257;
                        this.field10168[var73] += class450.field5879;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field10169 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field10169.length) {
                        int[] var79 = this.field10169[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field10162[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field10162[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field10121 != null) {
                            this.field10121.field4583 = null;
                        }
                    }
                }
                if (this.field10111 != null) {
                    for (int var75 = 0; var75 < this.field10112; var75++) {
                        class87 var76 = this.field10111[var75];
                        class67 var77 = this.field10170[var75];
                        var77.field881 = var77.field881 & 0xFFFFFF | 255 - (this.field10162[var76.field1207] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field10169 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field10169.length) {
                        int[] var88 = this.field10169[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field10161[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFC64) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field10161[var90] = (short) class77.method473(var97, class77.method473(var94 << 10, var95 << 7));
                        }
                        if (var88.length > 0 && this.field10121 != null) {
                            this.field10121.field4583 = null;
                        }
                    }
                }
                if (this.field10111 != null) {
                    for (int var84 = 0; var84 < this.field10112; var84++) {
                        class87 var85 = this.field10111[var84];
                        class67 var86 = this.field10170[var84];
                        var86.field881 = var86.field881 & 0xFF000000 | class594.field7542[this.field10161[var85.field1207] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field10181 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field10181.length > var99) {
                        int[] var100 = this.field10181[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class67 var102 = this.field10170[var100[var101]];
                            var102.field878 += arg2;
                            var102.field883 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field10181 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field10181.length > var104) {
                        int[] var105 = this.field10181[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class67 var107 = this.field10170[var105[var106]];
                            var107.field880 = var107.field880 * arg2 >> 7;
                            var107.field885 = var107.field885 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field10181 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field10181.length) {
                    int[] var110 = this.field10181[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class67 var112 = this.field10170[var110[var111]];
                        var112.field879 = var112.field879 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZB)V")
    private final void method4046(boolean arg0, byte arg1) {
        if (this.field10113 * 6 <= this.field10174.field9928.field3193.length) {
            this.field10174.field9928.field3133 = 0;
        } else {
            this.field10174.field9928 = new class333((this.field10113 + 100) * 6);
        }
        field10072++;
        class333 var3 = this.field10174.field9928;
        if (this.field10174.field9865) {
            for (int var5 = 0; var5 < this.field10113; var5++) {
                var3.method1541(374, this.field10180[var5]);
                var3.method1541(374, this.field10173[var5]);
                var3.method1541(arg1 ^ 0x144, this.field10176[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field10113; var4++) {
                var3.method1514(this.field10180[var4], (byte) -59);
                var3.method1514(this.field10173[var4], (byte) -59);
                var3.method1514(this.field10176[var4], (byte) -59);
            }
        }
        if (var3.field3133 == 0) {
            return;
        }
        if (arg0) {
            if (this.field10120 == null) {
                this.field10120 = this.field10174.method3981(5123, var3.field3133, true, var3.field3193, 13);
            } else {
                this.field10120.method1630(5123, var3.field3133, true, var3.field3193);
            }
            this.field10129.field3478 = this.field10120;
        } else {
            this.field10129.field3478 = this.field10174.method3981(5123, var3.field3133, false, var3.field3193, 13);
        }
        if (arg1 == 50 && !arg0) {
            this.field10145 = true;
        }
    }

    @OriginalMember(owner = "client!to", name = "P", descriptor = "(IIII)V")
    public final void method1238(int arg0, int arg1, int arg2, int arg3) {
        field10096++;
        if (arg0 == 0) {
            int var5 = 0;
            class72.field981 = 0;
            class347.field4257 = 0;
            class450.field5879 = 0;
            for (int var6 = 0; var6 < this.field10155; var6++) {
                class72.field981 += this.field10150[var6];
                class347.field4257 += this.field10085[var6];
                var5++;
                class450.field5879 += this.field10168[var6];
            }
            if (var5 > 0) {
                class347.field4257 = class347.field4257 / var5 + arg2;
                class450.field5879 = class450.field5879 / var5 + arg3;
                class72.field981 = class72.field981 / var5 + arg1;
            } else {
                class72.field981 = arg1;
                class450.field5879 = arg3;
                class347.field4257 = arg2;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field10155; var7++) {
                this.field10150[var7] += arg1;
                this.field10085[var7] += arg2;
                this.field10168[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field10155; var8++) {
                this.field10150[var8] -= class72.field981;
                this.field10085[var8] -= class347.field4257;
                this.field10168[var8] -= class450.field5879;
                if (arg3 != 0) {
                    int var9 = class541.field6805[arg3];
                    int var10 = class541.field6806[arg3];
                    int var11 = this.field10150[var8] * var10 + this.field10085[var8] * var9 + 16383 >> 14;
                    this.field10085[var8] = this.field10085[var8] * var10 + 16383 - (this.field10150[var8] * var9) >> 14;
                    this.field10150[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class541.field6805[arg1];
                    int var13 = class541.field6806[arg1];
                    int var14 = this.field10085[var8] * var13 + 16383 - (this.field10168[var8] * var12) >> 14;
                    this.field10168[var8] = this.field10085[var8] * var12 + (this.field10168[var8] * var13) + 16383 >> 14;
                    this.field10085[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class541.field6805[arg2];
                    int var16 = class541.field6806[arg2];
                    int var17 = this.field10168[var8] * var15 + this.field10150[var8] * var16 + 16383 >> 14;
                    this.field10168[var8] = this.field10168[var8] * var16 + 16383 - (this.field10150[var8] * var15) >> 14;
                    this.field10150[var8] = var17;
                }
                this.field10150[var8] += class72.field981;
                this.field10085[var8] += class347.field4257;
                this.field10168[var8] += class450.field5879;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field10155; var18++) {
                this.field10150[var18] -= class72.field981;
                this.field10085[var18] -= class347.field4257;
                this.field10168[var18] -= class450.field5879;
                this.field10150[var18] = this.field10150[var18] * arg1 / 128;
                this.field10085[var18] = this.field10085[var18] * arg2 / 128;
                this.field10168[var18] = this.field10168[var18] * arg3 / 128;
                this.field10150[var18] += class72.field981;
                this.field10085[var18] += class347.field4257;
                this.field10168[var18] += class450.field5879;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field10177; var19++) {
                int var23 = (this.field10162[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field10162[var19] = (byte) var23;
            }
            if (this.field10121 != null) {
                this.field10121.field4583 = null;
            }
            if (this.field10111 != null) {
                for (int var20 = 0; var20 < this.field10112; var20++) {
                    class87 var21 = this.field10111[var20];
                    class67 var22 = this.field10170[var20];
                    var22.field881 = var22.field881 & 0xFFFFFF | 255 - (this.field10162[var21.field1207] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field10177; var24++) {
                int var28 = this.field10161[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3F4) >> 7;
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
                this.field10161[var24] = (short) class77.method473(class77.method473(var32 << 7, var31 << 10), var34);
            }
            if (this.field10121 != null) {
                this.field10121.field4583 = null;
            }
            if (this.field10111 != null) {
                for (int var25 = 0; var25 < this.field10112; var25++) {
                    class87 var26 = this.field10111[var25];
                    class67 var27 = this.field10170[var25];
                    var27.field881 = class594.field7542[this.field10161[var26.field1207] & 0xFFFF] & 0xFFFFFF | var27.field881 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field10112; var35++) {
                class67 var36 = this.field10170[var35];
                var36.field883 += arg2;
                var36.field878 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field10112; var37++) {
                class67 var38 = this.field10170[var37];
                var38.field885 = var38.field885 * arg2 >> 7;
                var38.field880 = var38.field880 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field10112; var39++) {
                class67 var40 = this.field10170[var39];
                var40.field879 = var40.field879 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILoha;ZI)Z")
    public final boolean method1264(int arg0, int arg1, class465 arg2, boolean arg3, int arg4) {
        field10191++;
        return this.method4039(999998, arg4, arg3, arg1, -1, arg0, arg2);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
    private final void method4047(byte arg0) {
        field10141++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field10155; var10++) {
            int var11 = this.field10150[var10];
            int var12 = this.field10085[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            int var13 = this.field10168[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + (var11 * var11 + (var12 * var12));
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field10125 = (short) var2;
        this.field10116 = (short) var4;
        this.field10123 = (short) var6;
        this.field10077 = (short) var7;
        this.field10081 = (short) var5;
        this.field10104 = (short) var3;
        if (arg0 >= -21) {
            this.field10169 = null;
        }
        this.field10075 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field10140 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field10118 = true;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZ)V")
    private final void method4048(int arg0, boolean arg1) {
        field10108++;
        boolean var3 = this.field10121 != null && this.field10121.field4583 == null;
        boolean var4 = this.field10131 != null && this.field10131.field4583 == null;
        boolean var5 = this.field10127 != null && this.field10127.field4583 == null;
        boolean var6 = this.field10078 != null && this.field10078.field4583 == null;
        if (arg1) {
            var3 &= (this.field10114 & 0x2) != 0;
            var6 &= (this.field10114 & 0x8) != 0;
            var5 &= (this.field10114 & 0x1) != 0;
            var4 &= (this.field10114 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        int var9 = 102 % ((2 - arg0) / 50);
        byte var10 = 0;
        byte var11 = 0;
        byte var12 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var3) {
            var10 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var11 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var12 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field10174.field9928.field3193.length < (this.field10135 * var7)) {
            this.field10174.field9928 = new class333((this.field10135 + 100) * var7);
        } else {
            this.field10174.field9928.field3133 = 0;
        }
        class333 var13 = this.field10174.field9928;
        if (var5) {
            if (this.field10174.field9865) {
                for (int var22 = 0; var22 < this.field10155; var22++) {
                    int var23 = Stream.floatToRawIntBits((float) this.field10150[var22]);
                    int var24 = Stream.floatToRawIntBits((float) this.field10085[var22]);
                    int var25 = Stream.floatToRawIntBits((float) this.field10168[var22]);
                    int var26 = this.field10157[var22];
                    int var27 = this.field10157[var22 + 1];
                    for (int var28 = var26; var28 < var27; var28++) {
                        int var29 = this.field10083[var28] - 1;
                        if (var29 == -1) {
                            break;
                        }
                        var13.field3133 = var7 * var29;
                        var13.method1496(var23, (byte) 104);
                        var13.method1496(var24, (byte) 24);
                        var13.method1496(var25, (byte) 111);
                    }
                }
            } else {
                for (int var14 = 0; var14 < this.field10155; var14++) {
                    int var15 = Stream.floatToRawIntBits((float) this.field10150[var14]);
                    int var16 = Stream.floatToRawIntBits((float) this.field10085[var14]);
                    int var17 = Stream.floatToRawIntBits((float) this.field10168[var14]);
                    int var18 = this.field10157[var14];
                    int var19 = this.field10157[var14 + 1];
                    for (int var20 = var18; var20 < var19; var20++) {
                        int var21 = this.field10083[var20] - 1;
                        if (var21 == -1) {
                            break;
                        }
                        var13.field3133 = var7 * var21;
                        var13.method1549(var15, 1286108848);
                        var13.method1549(var16, 1286108848);
                        var13.method1549(var17, 1286108848);
                    }
                }
            }
        }
        if (var3) {
            if (this.field10131 == null) {
                byte[] var30;
                short[] var31;
                short[] var32;
                short[] var33;
                if (this.field10165 == null) {
                    var30 = this.field10152;
                    var32 = this.field10124;
                    var31 = this.field10093;
                    var33 = this.field10143;
                } else {
                    var30 = this.field10165.field5880;
                    var31 = this.field10165.field5874;
                    var32 = this.field10165.field5870;
                    var33 = this.field10165.field5871;
                }
                float var34 = this.field10174.field9903[0];
                float var35 = this.field10174.field9903[1];
                float var36 = this.field10174.field9903[2];
                float var37 = this.field10174.field9870;
                float var38 = this.field10174.field9925 * 768.0F / (float) this.field10171;
                float var39 = this.field10174.field9929 * 768.0F / (float) this.field10171;
                for (int var40 = 0; var40 < this.field10177; var40++) {
                    int var41 = this.method4051(this.field10090, this.field10178[var40], this.field10161[var40], 0, this.field10162[var40]);
                    float var42 = (float) (var41 >>> 24) * this.field10174.field9901;
                    float var43 = (float) (var41 >> 8 & 0xFF) * this.field10174.field9921;
                    short var44 = this.field10180[var40];
                    float var45 = (float) ((var41 & 0xFF692B) >> 16) * this.field10174.field9899;
                    short var46 = (short) var30[var44];
                    float var47;
                    if (var46 == 0) {
                        var47 = ((float) var33[var44] * var36 + (float) var31[var44] * var35 + (float) var32[var44] * var34) * 0.0026041667F;
                    } else {
                        var47 = ((float) var33[var44] * var36 + (float) var31[var44] * var35 + (float) var32[var44] * var34) / (float) (var46 * 256);
                    }
                    float var48 = (var47 < 0.0F ? var39 : var38) * var47 + var37;
                    int var49 = (int) (var42 * var48);
                    int var50 = (int) (var45 * var48);
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
                    int var51 = (int) (var43 * var48);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var13.field3133 = var10 + (var7 * var44);
                    var13.method1491(-129, var49);
                    var13.method1491(-129, var50);
                    var13.method1491(-129, var51);
                    var13.method1491(-129, 255 - (this.field10162[var40] & 0xFF));
                    short var52 = this.field10173[var40];
                    short var53 = (short) var30[var52];
                    float var54;
                    if (var53 == 0) {
                        var54 = ((float) var33[var52] * var36 + (float) var31[var52] * var35 + (float) var32[var52] * var34) * 0.0026041667F;
                    } else {
                        var54 = ((float) var33[var52] * var36 + (float) var31[var52] * var35 + (float) var32[var52] * var34) / (float) (var53 * 256);
                    }
                    float var55 = var37 + var54 * (var54 < 0.0F ? var39 : var38);
                    int var56 = (int) (var42 * var55);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    int var57 = (int) (var45 * var55);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var43 * var55);
                    var13.field3133 = var7 * var52 + var10;
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    var13.method1491(-129, var56);
                    var13.method1491(-129, var57);
                    var13.method1491(-129, var58);
                    var13.method1491(-129, 255 - (this.field10162[var40] & 0xFF));
                    short var59 = this.field10176[var40];
                    short var60 = (short) var30[var59];
                    float var61;
                    if (var60 == 0) {
                        var61 = ((float) var33[var59] * var36 + (float) var31[var59] * var35 + (float) var32[var59] * var34) * 0.0026041667F;
                    } else {
                        var61 = ((float) var33[var59] * var36 + (float) var31[var59] * var35 + (float) var32[var59] * var34) / (float) (var60 * 256);
                    }
                    float var62 = var61 * (var61 < 0.0F ? var39 : var38) + var37;
                    int var63 = (int) (var42 * var62);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    int var64 = (int) (var45 * var62);
                    int var65 = (int) (var43 * var62);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var13.field3133 = var7 * var59 + var10;
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    var13.method1491(-129, var63);
                    var13.method1491(-129, var64);
                    var13.method1491(-129, var65);
                    var13.method1491(-129, 255 - (this.field10162[var40] & 0xFF));
                }
            } else {
                for (int var66 = 0; var66 < this.field10177; var66++) {
                    int var67 = this.method4051(this.field10090, this.field10178[var66], this.field10161[var66], 0, this.field10162[var66]);
                    var13.field3133 = this.field10180[var66] * var7 + var10;
                    var13.method1496(var67, (byte) 38);
                    var13.field3133 = this.field10173[var66] * var7 + var10;
                    var13.method1496(var67, (byte) -120);
                    var13.field3133 = this.field10176[var66] * var7 + var10;
                    var13.method1496(var67, (byte) -126);
                }
            }
        }
        if (var4) {
            short[] var68;
            short[] var69;
            short[] var70;
            byte[] var71;
            if (this.field10165 == null) {
                var71 = this.field10152;
                var69 = this.field10093;
                var68 = this.field10143;
                var70 = this.field10124;
            } else {
                var68 = this.field10165.field5871;
                var69 = this.field10165.field5874;
                var70 = this.field10165.field5870;
                var71 = this.field10165.field5880;
            }
            float var72 = 3.0F / (float) this.field10171;
            var13.field3133 = var11;
            float var73 = 3.0F / (float) (this.field10171 / 2 + this.field10171);
            if (this.field10174.field9865) {
                for (int var74 = 0; var74 < this.field10135; var74++) {
                    int var75 = var71[var74] & 0xFF;
                    if (var75 == 0) {
                        var13.method1926((byte) -126, (float) var70[var74] * var73);
                        var13.method1926((byte) -126, (float) var69[var74] * var73);
                        var13.method1926((byte) 38, (float) var68[var74] * var73);
                    } else {
                        float var76 = var72 / (float) var75;
                        var13.method1926((byte) 81, (float) var70[var74] * var76);
                        var13.method1926((byte) -125, (float) var69[var74] * var76);
                        var13.method1926((byte) 60, (float) var68[var74] * var76);
                    }
                    var13.field3133 += var7 - 12;
                }
            } else {
                for (int var77 = 0; var77 < this.field10135; var77++) {
                    int var78 = var71[var77] & 0xFF;
                    if (var78 == 0) {
                        var13.method1923((float) var70[var77] * var73, -2061505808);
                        var13.method1923((float) var69[var77] * var73, -2061505808);
                        var13.method1923((float) var68[var77] * var73, -2061505808);
                    } else {
                        float var79 = var72 / (float) var78;
                        var13.method1923((float) var70[var77] * var79, -2061505808);
                        var13.method1923((float) var69[var77] * var79, -2061505808);
                        var13.method1923((float) var68[var77] * var79, -2061505808);
                    }
                    var13.field3133 += var7 - 12;
                }
            }
        }
        if (var6) {
            var13.field3133 = var12;
            if (this.field10174.field9865) {
                for (int var81 = 0; var81 < this.field10135; var81++) {
                    var13.method1926((byte) -122, this.field10159[var81]);
                    var13.method1926((byte) -128, this.field10167[var81]);
                    var13.field3133 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field10135; var80++) {
                    var13.method1923(this.field10159[var80], -2061505808);
                    var13.method1923(this.field10167[var80], -2061505808);
                    var13.field3133 += var7 - 8;
                }
            }
        }
        var13.field3133 = this.field10135 * var7;
        class447 var82;
        if (arg1) {
            if (this.field10175 == null) {
                this.field10175 = this.field10174.method3912(var13.field3193, true, var13.field3133, var7, 1365);
            } else {
                this.field10175.method2561(var13.field3193, -61, var13.field3133, var7);
            }
            this.field10114 = 0;
            var82 = this.field10175;
        } else {
            var82 = this.field10174.method3912(var13.field3193, false, var13.field3133, var7, 1365);
            this.field10145 = true;
        }
        if (var5) {
            this.field10127.field4583 = var82;
            this.field10127.field4585 = var8;
        }
        if (var6) {
            this.field10078.field4585 = var12;
            this.field10078.field4583 = var82;
        }
        if (var3) {
            this.field10121.field4585 = var10;
            this.field10121.field4583 = var82;
        }
        if (var4) {
            this.field10131.field4583 = var82;
            this.field10131.field4585 = var11;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public final void method1253(int arg0) {
        field10144++;
        int var2 = class541.field6805[arg0];
        int var3 = class541.field6806[arg0];
        for (int var4 = 0; var4 < this.field10155; var4++) {
            int var5 = this.field10168[var4] * var2 + (this.field10150[var4] * var3) >> 14;
            this.field10168[var4] = this.field10168[var4] * var3 - this.field10150[var4] * var2 >> 14;
            this.field10150[var4] = var5;
        }
        this.field10118 = false;
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "()V")
    public final void method1267() {
        field10156++;
    }

    @OriginalMember(owner = "client!to", name = "k", descriptor = "(I)V")
    public final void method1229(int arg0) {
        field10184++;
        int var2 = class541.field6805[arg0];
        int var3 = class541.field6806[arg0];
        for (int var4 = 0; var4 < this.field10155; var4++) {
            int var7 = this.field10168[var4] * var2 + this.field10150[var4] * var3 >> 14;
            this.field10168[var4] = this.field10168[var4] * var3 - (this.field10150[var4] * var2) >> 14;
            this.field10150[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field10135; var5++) {
            int var6 = this.field10143[var5] * var2 + this.field10124[var5] * var3 >> 14;
            this.field10143[var5] = (short) (this.field10143[var5] * var3 - (this.field10124[var5] * var2) >> 14);
            this.field10124[var5] = (short) var6;
        }
        if (this.field10131 == null && this.field10121 != null) {
            this.field10121.field4583 = null;
        }
        if (this.field10131 != null) {
            this.field10131.field4583 = null;
        }
        this.field10118 = false;
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "EA", descriptor = "()I")
    public final int method1290() {
        if (!this.field10118) {
            this.method4047((byte) -32);
        }
        field10146++;
        return this.field10123;
    }

    @OriginalMember(owner = "client!to", name = "wa", descriptor = "()V")
    public final void method1268() {
        for (int var1 = 0; var1 < this.field10153; var1++) {
            this.field10150[var1] = this.field10150[var1] + 7 >> 4;
            this.field10085[var1] = this.field10085[var1] + 7 >> 4;
            this.field10168[var1] = this.field10168[var1] + 7 >> 4;
        }
        field10117++;
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
        this.field10118 = false;
    }

    @OriginalMember(owner = "client!to", name = "RA", descriptor = "()I")
    public final int method1231() {
        if (!this.field10118) {
            this.method4047((byte) -88);
        }
        field10095++;
        return this.field10081;
    }

    @OriginalMember(owner = "client!to", name = "fa", descriptor = "()I")
    public final int method1260() {
        if (!this.field10118) {
            this.method4047((byte) -48);
        }
        field10101++;
        return this.field10104;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "()[Lsba;")
    public final class581[] method1247() {
        field10166++;
        return this.field10122;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Loha;)V")
    public final void method1273(class465 arg0) {
        field10100++;
        class75 var2 = (class75) arg0;
        if (this.field10122 != null) {
            for (int var3 = 0; var3 < this.field10122.length; var3++) {
                class581 var4 = this.field10122[var3];
                class581 var5 = var4;
                if (var4.field7348 != null) {
                    var5 = var4.field7348;
                }
                var5.field7343 = (int) ((float) this.field10168[var4.field7346] * var2.field1055 + (float) this.field10150[var4.field7346] * var2.field1043 + (float) this.field10085[var4.field7346] * var2.field1047 + var2.field1051);
                var5.field7358 = (int) ((float) this.field10168[var4.field7346] * var2.field1037 + (float) this.field10150[var4.field7346] * var2.field1046 + (float) this.field10085[var4.field7346] * var2.field1062 + var2.field1033);
                var5.field7344 = (int) ((float) this.field10168[var4.field7346] * var2.field1031 + (float) this.field10150[var4.field7346] * var2.field1060 + (float) this.field10085[var4.field7346] * var2.field1063 + var2.field1035);
                var5.field7356 = (int) ((float) this.field10168[var4.field7361] * var2.field1055 + (float) this.field10150[var4.field7361] * var2.field1043 + (float) this.field10085[var4.field7361] * var2.field1047 + var2.field1051);
                var5.field7342 = (int) ((float) this.field10168[var4.field7361] * var2.field1037 + (float) this.field10150[var4.field7361] * var2.field1046 + (float) this.field10085[var4.field7361] * var2.field1062 + var2.field1033);
                var5.field7349 = (int) ((float) this.field10168[var4.field7361] * var2.field1031 + (float) this.field10150[var4.field7361] * var2.field1060 + (float) this.field10085[var4.field7361] * var2.field1063 + var2.field1035);
                var5.field7350 = (int) ((float) this.field10168[var4.field7353] * var2.field1055 + (float) this.field10150[var4.field7353] * var2.field1043 + (float) this.field10085[var4.field7353] * var2.field1047 + var2.field1051);
                var5.field7357 = (int) ((float) this.field10168[var4.field7353] * var2.field1037 + (float) this.field10150[var4.field7353] * var2.field1046 + (float) this.field10085[var4.field7353] * var2.field1062 + var2.field1033);
                var5.field7345 = (int) ((float) this.field10168[var4.field7353] * var2.field1031 + (float) this.field10150[var4.field7353] * var2.field1060 + (float) this.field10085[var4.field7353] * var2.field1063 + var2.field1035);
            }
        }
        if (this.field10088 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field10088.length; var6++) {
            class49 var7 = this.field10088[var6];
            class49 var8 = var7;
            if (var7.field641 != null) {
                var8 = var7.field641;
            }
            if (var7.field646 == null) {
                var7.field646 = var2.method458();
            } else {
                var7.field646.method468(var2);
            }
            var8.field643 = (int) ((float) this.field10168[var7.field645] * var2.field1055 + (float) this.field10150[var7.field645] * var2.field1043 + (float) this.field10085[var7.field645] * var2.field1047 + var2.field1051);
            var8.field640 = (int) ((float) this.field10168[var7.field645] * var2.field1037 + (float) this.field10150[var7.field645] * var2.field1046 + (float) this.field10085[var7.field645] * var2.field1062 + var2.field1033);
            var8.field650 = (int) ((float) this.field10168[var7.field645] * var2.field1031 + (float) this.field10150[var7.field645] * var2.field1060 + (float) this.field10085[var7.field645] * var2.field1063 + var2.field1035);
        }
    }

    @OriginalMember(owner = "client!to", name = "LA", descriptor = "(I)V")
    public final void method1281(int arg0) {
        this.field10171 = (short) arg0;
        field10105++;
        if (this.field10121 != null) {
            this.field10121.field4583 = null;
        }
        if (this.field10131 != null) {
            this.field10131.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Loha;Lvu;II)V")
    public final void method1292(class465 arg0, class706 arg1, int arg2, int arg3) {
        field10094++;
        if (this.field10135 == 0) {
            return;
        }
        class75 var5 = this.field10174.field9831;
        if (!this.field10118) {
            this.method4047((byte) -46);
        }
        class75 var6 = (class75) arg0;
        class499.field6407 = var5.field1031 * var6.field1035 + var5.field1063 * var6.field1033 + var5.field1060 * var6.field1051 + var5.field1035;
        class324.field4003 = var5.field1031 * var6.field1063 + var5.field1063 * var6.field1062 + var5.field1060 * var6.field1047;
        float var7 = (float) this.field10104 * class324.field4003 + class499.field6407;
        float var8 = (float) this.field10123 * class324.field4003 + class499.field6407;
        float var9;
        float var10;
        if (var7 > var8) {
            var9 = var8 - (float) this.field10075;
            var10 = (float) this.field10075 + var7;
        } else {
            var10 = (float) this.field10075 + var8;
            var9 = (float) (-this.field10075) + var7;
        }
        if ((var9 >= this.field10174.field9924) || (var10 <= (float) this.field10174.field9860)) {
            return;
        }
        class552.field6958 = var5.field1055 * var6.field1063 + var5.field1047 * var6.field1062 + var5.field1043 * var6.field1047;
        class615.field7770 = var5.field1055 * var6.field1035 + var5.field1047 * var6.field1033 + var5.field1043 * var6.field1051 + var5.field1051;
        float var11 = (float) this.field10104 * class552.field6958 + class615.field7770;
        float var12 = (float) this.field10123 * class552.field6958 + class615.field7770;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var14 = (var12 - (float) this.field10075) * (float) this.field10174.field9847;
            var13 = ((float) this.field10075 + var11) * (float) this.field10174.field9847;
        } else {
            var13 = ((float) this.field10075 + var12) * (float) this.field10174.field9847;
            var14 = (var11 - (float) this.field10075) * (float) this.field10174.field9847;
        }
        if ((this.field10174.field9886 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field10174.field9937)) {
            return;
        }
        class482.field6220 = var5.field1037 * var6.field1063 + var5.field1062 * var6.field1062 + var5.field1046 * var6.field1047;
        class407.field5417 = var5.field1037 * var6.field1035 + var5.field1062 * var6.field1033 + var5.field1046 * var6.field1051 + var5.field1033;
        float var15 = (float) this.field10104 * class482.field6220 + class407.field5417;
        float var16 = (float) this.field10123 * class482.field6220 + class407.field5417;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field10075 + var15) * (float) this.field10174.field9844;
            var17 = ((float) (-this.field10075) + var16) * (float) this.field10174.field9844;
        } else {
            var17 = ((float) (-this.field10075) + var15) * (float) this.field10174.field9844;
            var18 = ((float) this.field10075 + var16) * (float) this.field10174.field9844;
        }
        if ((var17 / (float) arg2 >= this.field10174.field9940) || (this.field10174.field9845 >= var18 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field10111 != null) {
            class385.field4910 = var5.field1037 * var6.field1060 + var5.field1062 * var6.field1046 + var5.field1046 * var6.field1043;
            class349.field4273 = var5.field1031 * var6.field1060 + var5.field1063 * var6.field1046 + var5.field1060 * var6.field1043;
            class228.field3077 = var5.field1037 * var6.field1031 + var5.field1062 * var6.field1037 + var5.field1046 * var6.field1055;
            class511.field6520 = var5.field1055 * var6.field1060 + var5.field1047 * var6.field1046 + var5.field1043 * var6.field1043;
            class532.field6738 = var5.field1031 * var6.field1031 + var5.field1063 * var6.field1037 + var5.field1060 * var6.field1055;
            class303.field3825 = var5.field1055 * var6.field1031 + var5.field1047 * var6.field1037 + var5.field1043 * var6.field1055;
        }
        if (arg1 != null) {
            int var19 = this.field10125 + this.field10081 >> 1;
            int var20 = this.field10116 + this.field10077 >> 1;
            int var21 = (int) ((float) var20 * class303.field3825 + (float) this.field10104 * class552.field6958 + (float) var19 * class511.field6520 + class615.field7770);
            int var22 = (int) ((float) var20 * class228.field3077 + (float) this.field10104 * class482.field6220 + (float) var19 * class385.field4910 + class407.field5417);
            int var23 = (int) ((float) var20 * class532.field6738 + (float) this.field10104 * class324.field4003 + (float) var19 * class349.field4273 + class499.field6407);
            int var24 = (int) ((float) var20 * class303.field3825 + (float) this.field10123 * class552.field6958 + (float) var19 * class511.field6520 + class615.field7770);
            int var25 = (int) ((float) var20 * class228.field3077 + (float) this.field10123 * class482.field6220 + (float) var19 * class385.field4910 + class407.field5417);
            arg1.field9321 = this.field10174.field9847 * var21 / arg2 + this.field10174.field9867;
            arg1.field9322 = this.field10174.field9847 * var24 / arg2 + this.field10174.field9867;
            arg1.field9320 = this.field10174.field9844 * var25 / arg2 + this.field10174.field9943;
            int var26 = (int) ((float) var20 * class532.field6738 + (float) this.field10123 * class324.field4003 + (float) var19 * class349.field4273 + class499.field6407);
            arg1.field9323 = this.field10174.field9844 * var22 / arg2 + this.field10174.field9943;
            if (var23 >= this.field10174.field9860 || this.field10174.field9860 <= var26) {
                arg1.field9324 = true;
                arg1.field9325 = this.field10174.field9867 + ((this.field10075 + var21) * this.field10174.field9847 / arg2) - arg1.field9321;
            }
        }
        this.field10174.method3968((byte) 84, (float) arg2);
        this.field10174.method3909(110);
        this.field10174.method3932(var6, false);
        this.method4049(-126);
        this.field10174.method3972(0);
        this.method4044((byte) -45);
    }

    @OriginalMember(owner = "client!to", name = "ia", descriptor = "(SS)V")
    public final void method1265(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field10177; var3++) {
            if (this.field10161[var3] == arg0) {
                this.field10161[var3] = arg1;
            }
        }
        field10137++;
        if (this.field10111 != null) {
            for (int var4 = 0; var4 < this.field10112; var4++) {
                class87 var5 = this.field10111[var4];
                class67 var6 = this.field10170[var4];
                var6.field881 = class594.field7542[this.field10161[var5.field1207] & 0xFFFF] & 0xFFFFFF | var6.field881 & 0xFF000000;
            }
        }
        if (this.field10121 != null) {
            this.field10121.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V")
    private final void method4049(int arg0) {
        field10183++;
        if (this.field10113 == 0) {
            return;
        }
        if (this.field10114 != 0) {
            this.method4048(114, true);
        }
        this.method4048(-102, false);
        if (arg0 > -42) {
            return;
        }
        if (this.field10129 != null) {
            if (this.field10129.field3478 == null) {
                this.method4046((this.field10114 & 0x10) != 0, (byte) 50);
            }
            if (this.field10129.field3478 != null) {
                this.field10174.method3974(this.field10131 != null, 5);
                this.field10174.method3947(this.field10127, this.field10078, this.field10121, this.field10131, 32886);
                int var2 = this.field10092.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field10092[var3];
                    int var5 = this.field10092[var3 + 1];
                    int var6 = this.field10178[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field10174.method3960(this.field10131 != null, -112, var6);
                    this.field10174.method3980(this.field10129.field3478, (var5 - var4) * 3, true, 4, var4 * 3);
                }
            }
        }
        this.method4053(0);
    }

    @OriginalMember(owner = "client!to", name = "v", descriptor = "()V")
    public final void method1228() {
        for (int var1 = 0; var1 < this.field10155; var1++) {
            this.field10168[var1] = -this.field10168[var1];
        }
        field10128++;
        for (int var2 = 0; var2 < this.field10135; var2++) {
            this.field10143[var2] = (short) (-this.field10143[var2]);
        }
        for (int var3 = 0; var3 < this.field10177; var3++) {
            short var4 = this.field10180[var3];
            this.field10180[var3] = this.field10176[var3];
            this.field10176[var3] = var4;
        }
        if (this.field10131 == null && this.field10121 != null) {
            this.field10121.field4583 = null;
        }
        if (this.field10131 != null) {
            this.field10131.field4583 = null;
        }
        if (this.field10129 != null) {
            this.field10129.field3478 = null;
        }
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
        this.field10118 = false;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(B)V")
    public static final void method4050(byte arg0) {
        class1.field6 = 1;
        class530.field6723 = -1;
        field10076++;
        long var1 = 0L;
        if (class528.field6708 == null) {
            class620.method3316(false, 35);
            return;
        }
        class234 var3 = new class234(class777.method4259((byte) -21, class210.method1407(class528.field6708, (byte) -107)));
        long var4 = var3.method1516(-11290);
        class196.field2730 = var3.method1516(-11290);
        class181.method1210("", class624.method3337(var4, 1), true, (byte) 37);
        if (arg0 != -37) {
            field10115 = -37;
        }
    }

    @OriginalMember(owner = "client!to", name = "O", descriptor = "(III)V")
    public final void method1282(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field10155; var4++) {
            if (arg0 != 128) {
                this.field10150[var4] = this.field10150[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field10085[var4] = this.field10085[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field10168[var4] = this.field10168[var4] * arg2 >> 7;
            }
        }
        field10142++;
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
        this.field10118 = false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ISIIB)I")
    private final int method4051(int arg0, short arg1, int arg2, int arg3, byte arg4) {
        field10164++;
        int var6 = class594.field7542[class235.method1559(arg2, arg0, arg3 ^ 0x60)];
        if (~arg1 != arg3) {
            class191 var7 = this.field10174.field7199.method1732((byte) 124, arg1 & 0xFFFF);
            int var8 = var7.field2672 & 0xFF;
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
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field2661 & 0xFF;
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
                var6 = ((var13 & 0xAB00FF00) << 8) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg4 & 0xFF);
    }

    @OriginalMember(owner = "client!to", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final void method1256(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field10130++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class347.field4257 = 0;
            int var13 = 0;
            class72.field981 = 0;
            class450.field5879 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field10084.length > var15) {
                    int[] var16 = this.field10084[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field10187 == null || (this.field10187[var18] & arg6) != 0) {
                            class72.field981 += this.field10150[var18];
                            class347.field4257 += this.field10085[var18];
                            var13++;
                            class450.field5879 += this.field10168[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class450.field5879 = var10;
                class72.field981 = var11;
                class347.field4257 = var12;
            } else {
                class347.field4257 = class347.field4257 / var13 + var12;
                class450.field5879 = class450.field5879 / var13 + var10;
                class72.field981 = class72.field981 / var13 + var11;
                class451.field5882 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[4] * arg3 + (arg7[3] * arg2 + (arg7[5] * arg4)) + 8192 >> 14;
                int var21 = arg7[7] * arg3 + (arg7[8] * arg4) + arg7[6] * arg2 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field10084.length) {
                    int[] var27 = this.field10084[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field10187 == null || (arg6 & this.field10187[var29]) != 0) {
                            this.field10150[var29] += var23;
                            this.field10085[var29] += var24;
                            this.field10168[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field10084.length) {
                        int[] var50 = this.field10084[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field10187 == null || (this.field10187[var52] & arg6) != 0) {
                                this.field10150[var52] -= class72.field981;
                                this.field10085[var52] -= class347.field4257;
                                this.field10168[var52] -= class450.field5879;
                                if (arg4 != 0) {
                                    int var53 = class541.field6805[arg4];
                                    int var54 = class541.field6806[arg4];
                                    int var55 = this.field10085[var52] * var53 - (-(this.field10150[var52] * var54) - 16383) >> 14;
                                    this.field10085[var52] = this.field10085[var52] * var54 + 16383 - (this.field10150[var52] * var53) >> 14;
                                    this.field10150[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class541.field6805[arg2];
                                    int var57 = class541.field6806[arg2];
                                    int var58 = this.field10085[var52] * var57 + 16383 - (this.field10168[var52] * var56) >> 14;
                                    this.field10168[var52] = this.field10085[var52] * var56 + this.field10168[var52] * var57 + 16383 >> 14;
                                    this.field10085[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class541.field6805[arg3];
                                    int var60 = class541.field6806[arg3];
                                    int var61 = this.field10168[var52] * var59 + this.field10150[var52] * var60 + 16383 >> 14;
                                    this.field10168[var52] = this.field10168[var52] * var60 + 16383 - (this.field10150[var52] * var59) >> 14;
                                    this.field10150[var52] = var61;
                                }
                                this.field10150[var52] += class72.field981;
                                this.field10085[var52] += class347.field4257;
                                this.field10168[var52] += class450.field5879;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field10084.length > var32) {
                            int[] var33 = this.field10084[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field10187 == null || (arg6 & this.field10187[var35]) != 0) {
                                    int var36 = this.field10157[var35];
                                    int var37 = this.field10157[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field10083[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class541.field6805[arg4];
                                            int var41 = class541.field6806[arg4];
                                            int var42 = this.field10124[var39] * var41 + (this.field10093[var39] * var40 + 16383) >> 14;
                                            this.field10093[var39] = (short) (this.field10093[var39] * var41 + 16383 - (this.field10124[var39] * var40) >> 14);
                                            this.field10124[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class541.field6805[arg2];
                                            int var44 = class541.field6806[arg2];
                                            int var45 = this.field10093[var39] * var44 + 16383 - this.field10143[var39] * var43 >> 14;
                                            this.field10143[var39] = (short) (this.field10143[var39] * var44 + this.field10093[var39] * var43 + 16383 >> 14);
                                            this.field10093[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class541.field6805[arg3];
                                            int var47 = class541.field6806[arg3];
                                            int var48 = this.field10124[var39] * var47 + (this.field10143[var39] * var46 + 16383) >> 14;
                                            this.field10143[var39] = (short) (this.field10143[var39] * var47 + 16383 - (this.field10124[var39] * var46) >> 14);
                                            this.field10124[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field10131 == null && this.field10121 != null) {
                        this.field10121.field4583 = null;
                    }
                    if (this.field10131 != null) {
                        this.field10131.field4583 = null;
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
                if (class451.field5882) {
                    int var68 = arg7[6] * class450.field5879 + arg7[0] * class72.field981 + (arg7[3] * class347.field4257) + 8192 >> 14;
                    int var69 = arg7[7] * class450.field5879 + arg7[4] * class347.field4257 + arg7[1] * class72.field981 + 8192 >> 14;
                    int var70 = var65 + var68;
                    int var71 = arg7[8] * class450.field5879 + arg7[2] * class72.field981 + arg7[5] * class347.field4257 + 8192 >> 14;
                    int var72 = var66 + var69;
                    int var73 = var67 + var71;
                    class347.field4257 = var72;
                    class72.field981 = var70;
                    class450.field5879 = var73;
                    class451.field5882 = false;
                }
                int[] var74 = new int[9];
                int var75 = class541.field6806[arg2];
                int var76 = class541.field6805[arg2];
                int var77 = class541.field6806[arg3];
                int var78 = class541.field6805[arg3];
                int var79 = class541.field6806[arg4];
                int var80 = class541.field6805[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[5] = -var76;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[7] = var78 * var80 + (var77 * var81) + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                int var83 = var74[2] * -class450.field5879 + var74[0] * -class72.field981 + var74[1] * -class347.field4257 + 8192 >> 14;
                int var84 = var74[5] * -class450.field5879 + var74[3] * -class72.field981 + var74[4] * -class347.field4257 + 8192 >> 14;
                int var85 = var74[7] * -class347.field4257 + (var74[6] * -class72.field981 + (var74[8] * -class450.field5879)) + 8192 >> 14;
                int var86 = var83 + class72.field981;
                int var87 = class347.field4257 + var84;
                int var88 = class450.field5879 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += arg7[var119 * 3 + var121] * var74[var90 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[1] * var66 + var74[0] * var65 + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[4] * var66 + var74[3] * var65 + var74[5] * var67 + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[6] * var65 + 8192 - (-(var74[7] * var66) + -(var74[8] * var67)) >> 14;
                int var96 = var88 + var95;
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
                int var99 = arg7[1] * var94 + arg7[2] * var96 + arg7[0] * var93 + 8192 >> 14;
                int var100 = arg7[4] * var94 + arg7[5] * var96 + arg7[3] * var93 + 8192 >> 14;
                int var101 = arg7[6] * var93 + arg7[7] * var94 + arg7[8] * var96 + 8192 >> 14;
                int var102 = var63 + var100;
                int var103 = var62 + var99;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field10084.length) {
                        int[] var107 = this.field10084[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field10187 == null || (this.field10187[var109] & arg6) != 0) {
                                int var110 = this.field10150[var109] * var97[0] + this.field10085[var109] * var97[1] - (-(this.field10168[var109] * var97[2]) - 8192) >> 14;
                                int var111 = this.field10085[var109] * var97[4] + (this.field10150[var109] * var97[3] + (this.field10168[var109] * var97[5])) + 8192 >> 14;
                                int var112 = this.field10150[var109] * var97[6] + (this.field10085[var109] * var97[7]) + (this.field10168[var109] * var97[8]) + 8192 >> 14;
                                int var113 = var103 + var110;
                                int var114 = var102 + var111;
                                int var115 = var104 + var112;
                                this.field10150[var109] = var113;
                                this.field10085[var109] = var114;
                                this.field10168[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field10084.length) {
                        int[] var174 = this.field10084[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field10187 == null || (arg6 & this.field10187[var176]) != 0) {
                                this.field10150[var176] -= class72.field981;
                                this.field10085[var176] -= class347.field4257;
                                this.field10168[var176] -= class450.field5879;
                                this.field10150[var176] = this.field10150[var176] * arg2 >> 7;
                                this.field10085[var176] = this.field10085[var176] * arg3 >> 7;
                                this.field10168[var176] = this.field10168[var176] * arg4 >> 7;
                                this.field10150[var176] += class72.field981;
                                this.field10085[var176] += class347.field4257;
                                this.field10168[var176] += class450.field5879;
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
                if (class451.field5882) {
                    int var128 = arg7[0] * class72.field981 + 8192 - (-(arg7[3] * class347.field4257) + -(arg7[6] * class450.field5879)) >> 14;
                    int var129 = arg7[1] * class72.field981 + (arg7[4] * class347.field4257 - (-(arg7[7] * class450.field5879) - 8192)) >> 14;
                    int var130 = arg7[8] * class450.field5879 + arg7[2] * class72.field981 + (arg7[5] * class347.field4257) + 8192 >> 14;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    class72.field981 = var131;
                    int var133 = var127 + var130;
                    class347.field4257 = var132;
                    class451.field5882 = false;
                    class450.field5879 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class72.field981 * var134 + 8192 >> 14;
                int var138 = -class347.field4257 * var135 + 8192 >> 14;
                int var139 = -class450.field5879 * var136 + 8192 >> 14;
                int var140 = var137 + class72.field981;
                int var141 = class347.field4257 + var138;
                int var142 = class450.field5879 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var127 * var136 + 8192 >> 14;
                int var147 = var141 + var145;
                int var148 = var140 + var144;
                int var149 = var142 + var146;
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
                int var152 = arg7[0] * var148 + (arg7[2] * var149) + arg7[1] * var147 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[3] * var148 + arg7[4] * var147 + 8192 >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[6] * var148 + arg7[8] * var149 + arg7[7] * var147 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field10084.length) {
                        int[] var160 = this.field10084[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field10187 == null || (arg6 & this.field10187[var162]) != 0) {
                                int var163 = this.field10150[var162] * var150[0] + this.field10085[var162] * var150[1] + (this.field10168[var162] * var150[2]) + 8192 >> 14;
                                int var164 = this.field10168[var162] * var150[5] + this.field10150[var162] * var150[3] + this.field10085[var162] * var150[4] + 8192 >> 14;
                                int var165 = var154 + var163;
                                int var166 = var155 + var164;
                                int var167 = this.field10168[var162] * var150[8] + this.field10150[var162] * var150[6] + this.field10085[var162] * var150[7] + 8192 >> 14;
                                int var168 = var157 + var167;
                                this.field10150[var162] = var165;
                                this.field10085[var162] = var166;
                                this.field10168[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field10169 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field10169.length) {
                        int[] var182 = this.field10169[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field10068 == null || (arg6 & this.field10068[var184]) != 0) {
                                int var185 = (this.field10162[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field10162[var184] = (byte) var185;
                                if (this.field10121 != null) {
                                    this.field10121.field4583 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field10111 != null) {
                    for (int var178 = 0; var178 < this.field10112; var178++) {
                        class87 var179 = this.field10111[var178];
                        class67 var180 = this.field10170[var178];
                        var180.field881 = 255 - (this.field10162[var179.field1207] & 0xFF) << 24 | var180.field881 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field10169 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field10169.length > var190) {
                        int[] var191 = this.field10169[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field10068 == null || (arg6 & this.field10068[var193]) != 0) {
                                int var194 = this.field10161[var193] & 0xFFFF;
                                int var195 = var194 >> 10 & 0x3F;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg3 / 4 + var196;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = var194 & 0x7F;
                                if (var197 < 0) {
                                    var197 = 0;
                                } else if (var197 > 7) {
                                    var197 = 7;
                                }
                                int var200 = arg4 + var199;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field10161[var193] = (short) class77.method473(var200, class77.method473(var197 << 7, var198 << 10));
                                if (this.field10121 != null) {
                                    this.field10121.field4583 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field10111 != null) {
                    for (int var187 = 0; var187 < this.field10112; var187++) {
                        class87 var188 = this.field10111[var187];
                        class67 var189 = this.field10170[var187];
                        var189.field881 = class594.field7542[this.field10161[var188.field1207] & 0xFFFF] & 0xFFFFFF | var189.field881 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field10181 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field10181.length > var202) {
                        int[] var203 = this.field10181[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class67 var205 = this.field10170[var203[var204]];
                            var205.field878 += arg2;
                            var205.field883 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field10181 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field10181.length > var207) {
                        int[] var208 = this.field10181[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class67 var210 = this.field10170[var208[var209]];
                            var210.field885 = var210.field885 * arg3 >> 7;
                            var210.field880 = var210.field880 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field10181 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field10181.length > var212) {
                    int[] var213 = this.field10181[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class67 var215 = this.field10170[var213[var214]];
                        var215.field879 = var215.field879 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "()V")
    public final void method1259() {
        field10091++;
        if (this.field10135 <= 0 || this.field10113 <= 0) {
            return;
        }
        this.method4048(71, false);
        if ((this.field10114 & 0x10) == 0 && this.field10129.field3478 == null) {
            this.method4046(false, (byte) 50);
        }
        this.method4053(0);
    }

    @OriginalMember(owner = "client!to", name = "VA", descriptor = "(I)V")
    public final void method1289(int arg0) {
        field10071++;
        int var2 = class541.field6805[arg0];
        int var3 = class541.field6806[arg0];
        for (int var4 = 0; var4 < this.field10155; var4++) {
            int var5 = this.field10150[var4] * var3 + this.field10085[var4] * var2 >> 14;
            this.field10085[var4] = this.field10085[var4] * var3 - this.field10150[var4] * var2 >> 14;
            this.field10150[var4] = var5;
        }
        this.field10118 = false;
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "F", descriptor = "()Z")
    public final boolean method1272() {
        field10102++;
        return this.field10106;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Loaa;I)V")
    private final void method4052(class474 arg0, int arg1) {
        field10079++;
        if (this.field10174.field9955.length < this.field10135) {
            this.field10174.field9954 = new int[this.field10135];
            this.field10174.field9955 = new int[this.field10135];
        }
        int[] var3 = this.field10174.field9955;
        int[] var4 = this.field10174.field9954;
        if (arg1 != -27790) {
            return;
        }
        for (int var5 = 0; var5 < this.field10155; var5++) {
            int var16 = (this.field10150[var5] - (this.field10085[var5] * this.field10174.field9859 >> 8) >> this.field10174.field9804) - arg0.field6171;
            int var17 = (this.field10168[var5] - (this.field10085[var5] * this.field10174.field9935 >> 8) >> this.field10174.field9804) - arg0.field6164;
            int var18 = this.field10157[var5];
            int var19 = this.field10157[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field10083[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field10113; var6++) {
            if (this.field10162 == null || this.field10162[var6] <= 128) {
                short var7 = this.field10180[var6];
                short var8 = this.field10173[var6];
                short var9 = this.field10176[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - (var12 - var11) * (var14 - var13) > 0) {
                    arg0.method2675(var13, var10, var15, -27312, var14, var12, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "NA", descriptor = "()Z")
    public final boolean method1257() {
        field10103++;
        if (this.field10084 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field10153; var1++) {
            this.field10150[var1] <<= 0x4;
            this.field10085[var1] <<= 0x4;
            this.field10168[var1] <<= 0x4;
        }
        class450.field5879 = 0;
        class347.field4257 = 0;
        class72.field981 = 0;
        return true;
    }

    @OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
    private final void method4053(int arg0) {
        field10147++;
        if (!this.field10145) {
            return;
        }
        this.field10145 = false;
        if (this.field10122 == null && this.field10088 == null && this.field10111 == null && !class453.method2576(this.field10154, -126, this.field10138)) {
            boolean var2 = false;
            boolean var3 = false;
            if (this.field10150 != null && !class145.method832((byte) 125, this.field10154, this.field10138)) {
                if (this.field10127 != null && this.field10127.field4583 == null) {
                    this.field10145 = true;
                } else {
                    var2 = true;
                    if (!this.field10118) {
                        this.method4047((byte) -48);
                    }
                }
            }
            boolean var4 = false;
            if (this.field10085 != null && !class751.method4071(this.field10154, this.field10138, arg0 + 2)) {
                if (this.field10127 != null && this.field10127.field4583 == null) {
                    this.field10145 = true;
                } else {
                    var3 = true;
                    if (!this.field10118) {
                        this.method4047((byte) -34);
                    }
                }
            }
            if (this.field10168 != null && !class380.method2167(this.field10154, this.field10138, 0)) {
                if (this.field10127 != null && this.field10127.field4583 == null) {
                    this.field10145 = true;
                } else {
                    if (!this.field10118) {
                        this.method4047((byte) -73);
                    }
                    var4 = true;
                }
            }
            if (var3) {
                this.field10085 = null;
            }
            if (var2) {
                this.field10150 = null;
            }
            if (var4) {
                this.field10168 = null;
            }
        }
        if (this.field10083 != null && this.field10150 == null && this.field10085 == null && this.field10168 == null) {
            this.field10083 = null;
            this.field10157 = null;
        }
        if (this.field10152 != null && !class662.method3605(this.field10138, true, this.field10154)) {
            if (this.field10131 == null) {
                if (this.field10121 != null && this.field10121.field4583 == null) {
                    this.field10145 = true;
                } else {
                    this.field10124 = this.field10093 = this.field10143 = null;
                    this.field10152 = null;
                }
            } else if (this.field10131.field4583 == null) {
                this.field10145 = true;
            } else {
                this.field10124 = this.field10093 = this.field10143 = null;
                this.field10152 = null;
            }
        }
        if (this.field10161 != null && !class285.method1739(100, this.field10154, this.field10138)) {
            if (this.field10121 != null && this.field10121.field4583 == null) {
                this.field10145 = true;
            } else {
                this.field10161 = null;
            }
        }
        if (this.field10162 != null && !class131.method771(this.field10138, true, this.field10154)) {
            if (this.field10121 != null && this.field10121.field4583 == null) {
                this.field10145 = true;
            } else {
                this.field10162 = null;
            }
        }
        if (this.field10159 != null && !class174.method1088(this.field10154, (byte) 126, this.field10138)) {
            if (this.field10078 != null && this.field10078.field4583 == null) {
                this.field10145 = true;
            } else {
                this.field10159 = this.field10167 = null;
            }
        }
        if (this.field10178 != null && !class482.method2708(-23648, this.field10138, this.field10154)) {
            if (this.field10121 != null && this.field10121.field4583 == null) {
                this.field10145 = true;
            } else {
                this.field10178 = null;
            }
        }
        if (this.field10180 != null && !class42.method257(arg0 + 93, this.field10138, this.field10154)) {
            if ((this.field10129 == null || this.field10129.field3478 != null) && (this.field10121 == null || this.field10121.field4583 != null)) {
                this.field10180 = this.field10173 = this.field10176 = null;
            } else {
                this.field10145 = true;
            }
        }
        if (this.field10169 != null && !class227.method1460(this.field10154, 0, this.field10138)) {
            this.field10068 = null;
            this.field10169 = null;
        }
        if (this.field10084 != null && !class618.method3307(this.field10154, this.field10138, 32)) {
            this.field10084 = null;
            this.field10187 = null;
        }
        if (this.field10181 != null && !class363.method2088((byte) -83, this.field10154, this.field10138)) {
            this.field10181 = null;
        }
        if (arg0 == 0 && this.field10092 != null && (this.field10138 & 0x800) == 0 && (this.field10138 & 0x40000) == 0) {
            this.field10092 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "da", descriptor = "()I")
    public final int method1274() {
        field10139++;
        return this.field10171;
    }

    @OriginalMember(owner = "client!to", name = "H", descriptor = "(III)V")
    public final void method1263(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field10155; var4++) {
            if (arg0 != 0) {
                this.field10150[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field10085[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field10168[var4] += arg2;
            }
        }
        field10074++;
        this.field10118 = false;
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "s", descriptor = "(I)V")
    public final void method1252(int arg0) {
        field10098++;
        this.field10138 = arg0;
        if (this.field10165 != null && (this.field10138 & 0x10000) == 0) {
            this.field10093 = this.field10165.field5874;
            this.field10124 = this.field10165.field5870;
            this.field10143 = this.field10165.field5871;
            this.field10152 = this.field10165.field5880;
            this.field10165 = null;
        }
        this.field10145 = true;
        this.method4053(0);
    }

    @OriginalMember(owner = "client!to", name = "V", descriptor = "()I")
    public final int method1300() {
        field10160++;
        if (!this.field10118) {
            this.method4047((byte) -125);
        }
        return this.field10125;
    }

    @OriginalMember(owner = "client!to", name = "p", descriptor = "(IILs;Ls;III)V")
    public final void method1234(int arg0, int arg1, class358 arg2, class358 arg3, int arg4, int arg5, int arg6) {
        field10126++;
        if (!this.field10118) {
            this.method4047((byte) -48);
        }
        int var8 = this.field10125 + arg4;
        int var9 = this.field10081 + arg4;
        int var10 = this.field10116 + arg6;
        int var11 = this.field10077 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field4369 + var9 >> arg2.field4372) >= arg2.field4366 || var10 < 0 || arg2.field4369 + var11 >> arg2.field4372 >= arg2.field4371) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4366 <= var9 + arg3.field4369 >> arg3.field4372 || var10 < 0 || arg3.field4371 <= (arg3.field4369 + var11 >> arg3.field4372)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4372;
            int var13 = var9 + arg2.field4369 - 1 >> arg2.field4372;
            int var14 = var10 >> arg2.field4372;
            int var15 = -(-arg2.field4369 - var11) - 1 >> arg2.field4372;
            if (arg2.method2060(var14, -114, var12) == arg5 && arg2.method2060(var14, -115, var13) == arg5 && arg2.method2060(var15, -122, var12) == arg5 && arg2.method2060(var15, -106, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field10155; var32++) {
                this.field10085[var32] = this.field10085[var32] + arg2.method2072((byte) 79, this.field10150[var32] + arg4, this.field10168[var32] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field10104;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field10155; var17++) {
                int var18 = (this.field10085[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field10085[var17] -= -((arg1 - var18) * (arg2.method2072((byte) -36, this.field10150[var17] + arg4, this.field10168[var17] + arg6) - arg5) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFFC3) >> 8) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var28 >> 1) < 0 || arg2.field4366 << arg2.field4372 <= (var28 >> 1) + arg4 + arg2.field4369 || arg6 - (var29 >> 1) < 0 || arg6 + (var29 >> 1) + arg2.field4369 >= arg2.field4371 << arg2.field4372) {
                return;
            }
            this.method1785(var30, arg5, arg2, var31, var29, arg4, var28, arg6, -89);
        } else if (arg0 == 4) {
            int var26 = this.field10123 - this.field10104;
            for (int var27 = 0; var27 < this.field10155; var27++) {
                this.field10085[var27] = this.field10085[var27] + arg3.method2072((byte) 101, this.field10150[var27] + arg4, this.field10168[var27] + arg6) + var26 - arg5;
            }
        } else if (arg0 == 5) {
            int var19 = this.field10123 - this.field10104;
            for (int var20 = 0; var20 < this.field10155; var20++) {
                int var21 = this.field10150[var20] + arg4;
                int var22 = this.field10168[var20] + arg6;
                int var23 = arg2.method2072((byte) 59, var21, var22);
                int var24 = arg3.method2072((byte) -37, var21, var22);
                int var25 = var23 - var24 - arg1;
                this.field10085[var20] = ((this.field10085[var20] << 8) / var19 * var25 >> 8) + var23 - arg5;
            }
        }
        if (this.field10127 != null) {
            this.field10127.field4583 = null;
        }
        this.field10118 = false;
    }

    @OriginalMember(owner = "client!to", name = "ua", descriptor = "()I")
    public final int method1239() {
        field10158++;
        return this.field10138;
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "()V")
    public final void method1299() {
        field10134++;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lck;)V")
    public class745(class733 arg0) {
        this.field10174 = arg0;
        this.field10127 = new class375(null, 5126, 3, 0);
        this.field10078 = new class375(null, 5126, 2, 0);
        this.field10131 = new class375(null, 5126, 3, 0);
        this.field10121 = new class375(null, 5121, 4, 0);
        this.field10129 = new class257();
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lck;Lsu;IIII)V")
    public class745(class733 arg0, class615 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10154 = arg5;
        this.field10174 = arg0;
        this.field10138 = arg2;
        if (class650.method3506(2048, arg2, arg5)) {
            this.field10127 = new class375(null, 5126, 3, 0);
        }
        if (class593.method3190(6151, arg5, arg2)) {
            this.field10078 = new class375(null, 5126, 2, 0);
        }
        if (class185.method1305(arg5, arg2, (byte) -49)) {
            this.field10131 = new class375(null, 5126, 3, 0);
        }
        if (class729.method3896(109, arg5, arg2)) {
            this.field10121 = new class375(null, 5121, 4, 0);
        }
        if (class31.method162(7726, arg2, arg5)) {
            this.field10129 = new class257();
        }
        class284 var7 = arg0.field7199;
        this.field10157 = new int[arg1.field7752 + 1];
        int[] var8 = new int[arg1.field7762];
        for (int var9 = 0; var9 < arg1.field7762; var9++) {
            if (arg1.field7795 == null || arg1.field7795[var9] != 2) {
                if (arg1.field7791 != null && arg1.field7791[var9] != -1) {
                    class191 var173 = var7.method1732((byte) -63, arg1.field7791[var9] & 0xFFFF);
                    if (((this.field10154 & 0x40) == 0 || !var173.field2679) && var173.field2670) {
                        continue;
                    }
                }
                var8[this.field10177++] = var9;
                this.field10157[arg1.field7784[var9]]++;
                this.field10157[arg1.field7787[var9]]++;
                this.field10157[arg1.field7771[var9]]++;
            }
        }
        this.field10113 = this.field10177;
        long[] var10 = new long[this.field10177];
        boolean var11 = (this.field10138 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field10177; var12++) {
            int var156 = var8[var12];
            class191 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field7764 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field7764.length; var163++) {
                    class335 var164 = arg1.field7764[var163];
                    if (var164.field4081 == var156) {
                        class225 var165 = class231.method1484(var164.field4087, 8);
                        if (var165.field3051) {
                            var162 = true;
                        }
                        if (var165.field3045 != -1) {
                            class191 var166 = var7.method1732((byte) -33, var165.field3045);
                            if (var166.field2682 == 2) {
                                this.field10106 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field10113--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field7791 != null) {
                var167 = arg1.field7791[var156];
                if (var167 != -1) {
                    var157 = var7.method1732((byte) -114, var167 & 0xFFFF);
                    if ((this.field10154 & 0x40) != 0 && var157.field2679) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        if (var157.field2662 != 0 || var157.field2665 != 0) {
                            this.field10149 = true;
                        }
                        var161 = var157.field2680;
                        var160 = var157.field2678;
                    }
                }
            }
            boolean var168 = arg1.field7772 != null && arg1.field7772[var156] != 0 || var157 != null && var157.field2682 != 0;
            if ((var11 || var168) && arg1.field7803 != null) {
                var158 += arg1.field7803[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = (var160 & 0xFF << 8) + var158;
            int var170 = ((var167 & 0xFFFF) << 16) + var159;
            int var171 = (var161 & 0xFF) + var169;
            int var172 = (var12 & 0xFFFF) + var170;
            var10[var12] = ((long) var171 << 32) + (long) var172;
            this.field10149 |= var157 != null && (var157.field2662 != 0 || var157.field2665 != 0);
            this.field10106 |= var168;
        }
        class527.method2898(60, var8, var10);
        this.field10187 = arg1.field7754;
        this.field10150 = arg1.field7798;
        this.field10085 = arg1.field7768;
        this.field10155 = arg1.field7752;
        this.field10168 = arg1.field7786;
        this.field10153 = arg1.field7779;
        this.field10088 = arg1.field7781;
        this.field10122 = arg1.field7773;
        class699[] var13 = new class699[this.field10155];
        if (arg1.field7764 != null) {
            this.field10112 = arg1.field7764.length;
            this.field10111 = new class87[this.field10112];
            this.field10170 = new class67[this.field10112];
            for (int var14 = 0; var14 < this.field10112; var14++) {
                class335 var15 = arg1.field7764[var14];
                class225 var16 = class231.method1484(var15.field4087, 8);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field10177; var18++) {
                    if (var8[var18] == var15.field4081) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class594.field7542[arg1.field7760[var15.field4081] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7772 == null ? 0 : arg1.field7772[var15.field4081]) << 24;
                this.field10111[var14] = new class87(var17, arg1.field7784[var15.field4081], arg1.field7787[var15.field4081], arg1.field7771[var15.field4081], var16.field3049, var16.field3055, var16.field3045, var16.field3052, var16.field3053, var16.field3051, var16.field3057, var15.field4080);
                this.field10170[var14] = new class67(var20);
            }
        }
        int var21 = this.field10177 * 3;
        this.field10090 = (short) arg3;
        this.field10093 = new short[var21];
        this.field10162 = new byte[this.field10177];
        this.field10143 = new short[var21];
        this.field10083 = new short[var21];
        this.field10178 = new short[this.field10177];
        this.field10167 = new float[var21];
        this.field10152 = new byte[var21];
        this.field10124 = new short[var21];
        class757.field10322 = new long[var21];
        this.field10176 = new short[this.field10177];
        if (arg1.field7776 != null) {
            this.field10068 = new short[this.field10177];
        }
        this.field10171 = (short) arg4;
        this.field10159 = new float[var21];
        this.field10180 = new short[this.field10177];
        this.field10161 = new short[this.field10177];
        this.field10173 = new short[this.field10177];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7752; var23++) {
            int var155 = this.field10157[var23];
            this.field10157[var23] = var22;
            var22 += var155;
            var13[var23] = new class699();
        }
        this.field10157[arg1.field7752] = var22;
        class313 var24 = class70.method419(var8, -118, this.field10177, arg1);
        class272[] var25 = new class272[arg1.field7762];
        for (int var26 = 0; var26 < arg1.field7762; var26++) {
            short var134 = arg1.field7784[var26];
            short var135 = arg1.field7787[var26];
            short var136 = arg1.field7771[var26];
            int var137 = this.field10150[var135] - this.field10150[var134];
            int var138 = this.field10085[var135] - this.field10085[var134];
            int var139 = this.field10168[var135] - this.field10168[var134];
            int var140 = this.field10150[var136] - this.field10150[var134];
            int var141 = this.field10085[var136] - this.field10085[var134];
            int var142 = this.field10168[var136] - this.field10168[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + (var144 * var144) + (var145 * var145)));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var144 * 256 / var146;
            int var148 = var143 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field7795 == null ? 0 : arg1.field7795[var26];
            if (var150 == 0) {
                class699 var152 = var13[var134];
                var152.field9269 += var149;
                var152.field9270 += var148;
                var152.field9268 += var147;
                var152.field9265++;
                class699 var153 = var13[var135];
                var153.field9265++;
                var153.field9270 += var148;
                var153.field9268 += var147;
                var153.field9269 += var149;
                class699 var154 = var13[var136];
                var154.field9268 += var147;
                var154.field9265++;
                var154.field9269 += var149;
                var154.field9270 += var148;
            } else if (var150 == 1) {
                class272 var151 = var25[var26] = new class272();
                var151.field3572 = var147;
                var151.field3576 = var148;
                var151.field3574 = var149;
            }
        }
        for (int var27 = 0; var27 < this.field10177; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field7760[var43] & 0xFFFF;
            int var45;
            if (arg1.field7758 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field7758[var43];
            }
            int var46;
            if (arg1.field7772 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field7772[var43] & 0xFF;
            }
            short var47 = arg1.field7791 == null ? -1 : arg1.field7791[var43];
            if (var47 != -1 && (this.field10154 & 0x40) != 0) {
                class191 var48 = var7.method1732((byte) 13, var47 & 0xFFFF);
                if (var48.field2679) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var53 = 0.0F;
                    var52 = 1.0F;
                    var54 = 0.0F;
                    var55 = 1;
                    var49 = 0.0F;
                    var50 = 1.0F;
                    var56 = 2;
                    var51 = 1.0F;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field7808[var45];
                    if (var58 == 0) {
                        short var87 = arg1.field7784[var43];
                        short var88 = arg1.field7787[var43];
                        short var89 = arg1.field7771[var43];
                        short var90 = arg1.field7790[var45];
                        short var91 = arg1.field7755[var45];
                        short var92 = arg1.field7792[var45];
                        float var93 = (float) arg1.field7798[var90];
                        float var94 = (float) arg1.field7768[var90];
                        float var95 = (float) arg1.field7786[var90];
                        float var96 = (float) arg1.field7798[var91] - var93;
                        float var97 = (float) arg1.field7768[var91] - var94;
                        float var98 = (float) arg1.field7786[var91] - var95;
                        float var99 = (float) arg1.field7798[var92] - var93;
                        float var100 = (float) arg1.field7768[var92] - var94;
                        float var101 = (float) arg1.field7786[var92] - var95;
                        float var102 = (float) arg1.field7798[var87] - var93;
                        float var103 = (float) arg1.field7768[var87] - var94;
                        float var104 = (float) arg1.field7786[var87] - var95;
                        float var105 = (float) arg1.field7798[var88] - var93;
                        float var106 = (float) arg1.field7768[var88] - var94;
                        float var107 = (float) arg1.field7786[var88] - var95;
                        float var108 = (float) arg1.field7798[var89] - var93;
                        float var109 = (float) arg1.field7768[var89] - var94;
                        float var110 = (float) arg1.field7786[var89] - var95;
                        float var111 = var97 * var101 - var98 * var100;
                        float var112 = var98 * var99 - (var96 * var101);
                        float var113 = var96 * var100 - var97 * var99;
                        float var114 = var100 * var113 - (var101 * var112);
                        float var115 = var101 * var111 - var99 * var113;
                        float var116 = var99 * var112 - var100 * var111;
                        float var117 = 1.0F / (var98 * var116 + var96 * var114 + var97 * var115);
                        var53 = (var110 * var116 + var108 * var114 + var109 * var115) * var117;
                        var49 = (var104 * var116 + var102 * var114 + var103 * var115) * var117;
                        var51 = (var107 * var116 + var105 * var114 + var106 * var115) * var117;
                        float var118 = var97 * var113 - var98 * var112;
                        float var119 = var98 * var111 - var96 * var113;
                        float var120 = var96 * var112 - (var97 * var111);
                        float var121 = 1.0F / (var101 * var120 + var99 * var118 + var100 * var119);
                        var54 = (var110 * var120 + var108 * var118 + var109 * var119) * var121;
                        var50 = (var104 * var120 + var102 * var118 + var103 * var119) * var121;
                        var52 = (var107 * var120 + var105 * var118 + var106 * var119) * var121;
                    } else {
                        short var59 = arg1.field7784[var43];
                        short var60 = arg1.field7787[var43];
                        short var61 = arg1.field7771[var43];
                        int var62 = var24.field3899[var45];
                        int var63 = var24.field3902[var45];
                        int var64 = var24.field3897[var45];
                        float[] var65 = var24.field3903[var45];
                        byte var66 = arg1.field7780[var45];
                        float var67 = (float) arg1.field7761[var45] / 256.0F;
                        if (var58 == 1) {
                            float var85 = (float) arg1.field7782[var45] / 1024.0F;
                            class108.method641(var66, var65, class37.field405, arg1.field7786[var59], var85, var62, var63, arg1.field7798[var59], var67, var64, false, arg1.field7768[var59]);
                            var50 = class37.field405[1];
                            var49 = class37.field405[0];
                            class108.method641(var66, var65, class37.field405, arg1.field7786[var60], var85, var62, var63, arg1.field7798[var60], var67, var64, false, arg1.field7768[var60]);
                            var51 = class37.field405[0];
                            var52 = class37.field405[1];
                            class108.method641(var66, var65, class37.field405, arg1.field7786[var61], var85, var62, var63, arg1.field7798[var61], var67, var64, false, arg1.field7768[var61]);
                            var54 = class37.field405[1];
                            var53 = class37.field405[0];
                            float var86 = var85 / 2.0F;
                            if ((var66 & 0x1) == 0) {
                                if (var86 < var51 - var49) {
                                    var51 -= var85;
                                    var55 = 1;
                                } else if (var86 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var85;
                                }
                                if ((var86 < var53 - var49)) {
                                    var53 -= var85;
                                    var56 = 1;
                                } else if (var49 - var53 > var86) {
                                    var53 += var85;
                                    var56 = 2;
                                }
                            } else {
                                if (var86 < var54 - var50) {
                                    var54 -= var85;
                                    var56 = 1;
                                } else if (var86 < var50 - var54) {
                                    var54 += var85;
                                    var56 = 2;
                                }
                                if ((var52 - var50 > var86)) {
                                    var52 -= var85;
                                    var55 = 1;
                                } else if (var50 - var52 > var86) {
                                    var55 = 2;
                                    var52 += var85;
                                }
                            }
                        } else if (var58 == 2) {
                            float var68 = (float) arg1.field7753[var45] / 256.0F;
                            float var69 = (float) arg1.field7800[var45] / 256.0F;
                            int var70 = arg1.field7798[var60] - arg1.field7798[var59];
                            int var71 = arg1.field7768[var60] - arg1.field7768[var59];
                            int var72 = arg1.field7786[var60] - arg1.field7786[var59];
                            int var73 = arg1.field7798[var61] - arg1.field7798[var59];
                            int var74 = arg1.field7768[var61] - arg1.field7768[var59];
                            int var75 = arg1.field7786[var61] - arg1.field7786[var59];
                            int var76 = var71 * var75 - (var72 * var74);
                            int var77 = var72 * var73 - (var70 * var75);
                            int var78 = var70 * var74 - (var71 * var73);
                            float var79 = 64.0F / (float) arg1.field7778[var45];
                            float var80 = 64.0F / (float) arg1.field7763[var45];
                            float var81 = 64.0F / (float) arg1.field7782[var45];
                            float var82 = (var65[2] * (float) var78 + var65[1] * (float) var77 + var65[0] * (float) var76) / var79;
                            float var83 = (var65[5] * (float) var78 + var65[3] * (float) var76 + var65[4] * (float) var77) / var80;
                            float var84 = (var65[8] * (float) var78 + var65[6] * (float) var76 + var65[7] * (float) var77) / var81;
                            var57 = class670.method3625(var82, var83, var84, (byte) 117);
                            class595.method3208(var64, 117, var67, var63, arg1.field7798[var59], var65, var57, arg1.field7768[var59], var66, var69, class37.field405, var62, var68, arg1.field7786[var59]);
                            var50 = class37.field405[1];
                            var49 = class37.field405[0];
                            class595.method3208(var64, 126, var67, var63, arg1.field7798[var60], var65, var57, arg1.field7768[var60], var66, var69, class37.field405, var62, var68, arg1.field7786[var60]);
                            var51 = class37.field405[0];
                            var52 = class37.field405[1];
                            class595.method3208(var64, 127, var67, var63, arg1.field7798[var61], var65, var57, arg1.field7768[var61], var66, var69, class37.field405, var62, var68, arg1.field7786[var61]);
                            var53 = class37.field405[0];
                            var54 = class37.field405[1];
                        } else if (var58 == 3) {
                            class570.method3070(var66, var67, -13411, var63, var64, arg1.field7786[var59], class37.field405, arg1.field7798[var59], var62, arg1.field7768[var59], var65);
                            var49 = class37.field405[0];
                            var50 = class37.field405[1];
                            class570.method3070(var66, var67, -13411, var63, var64, arg1.field7786[var60], class37.field405, arg1.field7798[var60], var62, arg1.field7768[var60], var65);
                            var52 = class37.field405[1];
                            var51 = class37.field405[0];
                            class570.method3070(var66, var67, -13411, var63, var64, arg1.field7786[var61], class37.field405, arg1.field7798[var61], var62, arg1.field7768[var61], var65);
                            var54 = class37.field405[1];
                            var53 = class37.field405[0];
                            if ((var66 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var53--;
                                    var56 = 1;
                                } else if (var49 - var53 > 0.5F) {
                                    var56 = 2;
                                    var53++;
                                }
                                if (var51 - var49 > 0.5F) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var55 = 2;
                                    var51++;
                                }
                            } else {
                                if (var52 - var50 > 0.5F) {
                                    var55 = 1;
                                    var52--;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                                if (var54 - var50 > 0.5F) {
                                    var56 = 1;
                                    var54--;
                                } else if (var50 - var54 > 0.5F) {
                                    var56 = 2;
                                    var54++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field7795 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field7795[var43];
            }
            if (var122 == 0) {
                long var126 = ((long) (var44 << 8) + (long) (var57 << 24) + ((long) var46) << 32) + (long) (var45 << 2);
                short var128 = arg1.field7784[var43];
                short var129 = arg1.field7787[var43];
                short var130 = arg1.field7771[var43];
                class699 var131 = var13[var128];
                this.field10180[var27] = this.method4043(var131.field9269, var49, var131.field9268, var131.field9270, var128, (byte) 117, arg1, var50, var131.field9265, var126);
                class699 var132 = var13[var129];
                this.field10173[var27] = this.method4043(var132.field9269, var51, var132.field9268, var132.field9270, var129, (byte) -124, arg1, var52, var132.field9265, (long) var55 + var126);
                class699 var133 = var13[var130];
                this.field10176[var27] = this.method4043(var133.field9269, var53, var133.field9268, var133.field9270, var130, (byte) 42, arg1, var54, var133.field9265, (long) var56 + var126);
            } else if (var122 == 1) {
                class272 var123 = var25[var43];
                long var124 = (long) ((var123.field3572 + 256 << 12) + ((var45 << 2) + (var123.field3576 <= 0 ? 2048 : 1024) + (var123.field3574 - -256 << 22))) + ((long) (var57 << 24) + ((long) (var44 << 8)) + (long) var46 << 32);
                this.field10180[var27] = this.method4043(var123.field3574, var49, var123.field3572, var123.field3576, arg1.field7784[var43], (byte) 90, arg1, var50, 0, var124);
                this.field10173[var27] = this.method4043(var123.field3574, var51, var123.field3572, var123.field3576, arg1.field7787[var43], (byte) 19, arg1, var52, 0, (long) var55 + var124);
                this.field10176[var27] = this.method4043(var123.field3574, var53, var123.field3572, var123.field3576, arg1.field7771[var43], (byte) 33, arg1, var54, 0, (long) var56 + var124);
            }
            if (arg1.field7772 != null) {
                this.field10162[var27] = arg1.field7772[var43];
            }
            if (arg1.field7776 != null) {
                this.field10068[var27] = arg1.field7776[var43];
            }
            this.field10161[var27] = arg1.field7760[var43];
            this.field10178[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field10113; var30++) {
            short var42 = this.field10178[var30];
            if (var29 != var42) {
                var29 = var42;
                var28++;
            }
        }
        this.field10092 = new int[var28 + 1];
        int var31 = 0;
        short var32 = -10000;
        for (int var33 = 0; var33 < this.field10113; var33++) {
            short var41 = this.field10178[var33];
            if (var32 != var41) {
                this.field10092[var31++] = var33;
                var32 = var41;
            }
        }
        this.field10092[var31] = this.field10113;
        class757.field10322 = null;
        this.field10124 = class179.method1193(this.field10124, this.field10135, 127);
        this.field10093 = class179.method1193(this.field10093, this.field10135, 56);
        this.field10143 = class179.method1193(this.field10143, this.field10135, 109);
        this.field10152 = class212.method1414(this.field10135, this.field10152, (byte) 39);
        this.field10159 = class150.method853(this.field10159, (byte) 76, this.field10135);
        this.field10167 = class150.method853(this.field10167, (byte) 76, this.field10135);
        if (arg1.field7766 != null && class618.method3307(this.field10154, arg2, 32)) {
            this.field10084 = arg1.method3297(false, 97);
        }
        if (arg1.field7764 != null && class363.method2088((byte) -125, this.field10154, arg2)) {
            this.field10181 = arg1.method3294((byte) 111);
        }
        if (arg1.field7796 != null && class227.method1460(this.field10154, 0, arg2)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field10177; var36++) {
                int var40 = arg1.field7796[var8[var36]];
                if (var40 >= 0) {
                    if (var40 > var34) {
                        var34 = var40;
                    }
                    int var10002 = var35[var40]++;
                }
            }
            this.field10169 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field10169[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field10177; var38++) {
                int var39 = arg1.field7796[var8[var38]];
                if (var39 >= 0) {
                    this.field10169[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "ma", descriptor = "()I")
    public final int method1296() {
        field10109++;
        if (!this.field10118) {
            this.method4047((byte) -26);
        }
        return this.field10140;
    }
}
