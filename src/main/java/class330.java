import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class330 extends class473 {

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "[I")
    private int[] field4079;

    @OriginalMember(owner = "client!d", name = "Mb", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!d", name = "Gc", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!d", name = "jc", descriptor = "[I")
    private int[] field4139;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "I")
    private int field4075;

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "I")
    private int field4089;

    @OriginalMember(owner = "client!d", name = "tb", descriptor = "[I")
    private int[] field4097;

    @OriginalMember(owner = "client!d", name = "Kb", descriptor = "[S")
    private short[] field4114;

    @OriginalMember(owner = "client!d", name = "Wb", descriptor = "[I")
    private int[] field4126;

    @OriginalMember(owner = "client!d", name = "Cc", descriptor = "[Low;")
    private class93[] field4158;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "[Lqr;")
    private class667[] field4078;

    @OriginalMember(owner = "client!d", name = "pc", descriptor = "I")
    private int field4145;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[Lida;")
    private class139[] field4039;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "[Lkq;")
    private class106[] field4040;

    @OriginalMember(owner = "client!d", name = "qc", descriptor = "[B")
    private byte[] field4146;

    @OriginalMember(owner = "client!d", name = "Yb", descriptor = "[F")
    private float[] field4128;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "[S")
    private short[] field4064;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "[S")
    private short[] field4080;

    @OriginalMember(owner = "client!d", name = "Ib", descriptor = "[S")
    private short[] field4112;

    @OriginalMember(owner = "client!d", name = "wc", descriptor = "[S")
    private short[] field4152;

    @OriginalMember(owner = "client!d", name = "ac", descriptor = "[S")
    private short[] field4130;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "S")
    private short field4055;

    @OriginalMember(owner = "client!d", name = "Hb", descriptor = "[S")
    private short[] field4111;

    @OriginalMember(owner = "client!d", name = "Zb", descriptor = "[S")
    private short[] field4129;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "S")
    private short field4038;

    @OriginalMember(owner = "client!d", name = "Rb", descriptor = "[S")
    private short[] field4121;

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "[S")
    private short[] field4095;

    @OriginalMember(owner = "client!d", name = "Fc", descriptor = "[B")
    private byte[] field4161;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "[F")
    private float[] field4076;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "[S")
    private short[] field4082;

    @OriginalMember(owner = "client!d", name = "Qb", descriptor = "[S")
    private short[] field4120;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "[S")
    private short[] field4063;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "[I")
    private int[] field4056;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "[I")
    private int[] field4058;

    @OriginalMember(owner = "client!d", name = "bc", descriptor = "[I")
    private int[] field4131;

    @OriginalMember(owner = "client!d", name = "lc", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    private int field4051;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "[[I")
    private int[][] field4085;

    @OriginalMember(owner = "client!d", name = "vc", descriptor = "[[I")
    private int[][] field4151;

    @OriginalMember(owner = "client!d", name = "kc", descriptor = "[[I")
    private int[][] field4140;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Z")
    private boolean field4049;

    @OriginalMember(owner = "client!d", name = "Gb", descriptor = "Z")
    private boolean field4110;

    @OriginalMember(owner = "client!d", name = "Bb", descriptor = "Z")
    private boolean field4105;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Z")
    private boolean field4045;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lmj;")
    private class344 field4059;

    @OriginalMember(owner = "client!d", name = "wb", descriptor = "Ldw;")
    private class126 field4100;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Ldw;")
    private class126 field4083;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "Ldw;")
    private class126 field4086;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Ldw;")
    private class126 field4044;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "Lli;")
    private class509 field4077;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lsb;")
    public static class305 field4047 = new class305(55, 2);

    @OriginalMember(owner = "client!d", name = "Hc", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "I")
    private int field4054;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    private int field4073;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!d", name = "ub", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!d", name = "xb", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!d", name = "yb", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!d", name = "zb", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!d", name = "Ab", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!d", name = "Cb", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!d", name = "Db", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!d", name = "Eb", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!d", name = "Fb", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!d", name = "Jb", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!d", name = "Lb", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!d", name = "Nb", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!d", name = "Ob", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!d", name = "Pb", descriptor = "I")
    private int field4119;

    @OriginalMember(owner = "client!d", name = "Sb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!d", name = "Tb", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!d", name = "Ub", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!d", name = "Vb", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!d", name = "cc", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!d", name = "dc", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!d", name = "ec", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!d", name = "fc", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!d", name = "gc", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!d", name = "hc", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!d", name = "ic", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!d", name = "mc", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!d", name = "nc", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!d", name = "oc", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!d", name = "rc", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!d", name = "sc", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!d", name = "tc", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!d", name = "xc", descriptor = "I")
    private int field4153;

    @OriginalMember(owner = "client!d", name = "yc", descriptor = "I")
    private int field4154;

    @OriginalMember(owner = "client!d", name = "zc", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!d", name = "Ac", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!d", name = "Bc", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!d", name = "Dc", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!d", name = "Ec", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!d", name = "Xb", descriptor = "Lrw;")
    private class133 field4127;

    @OriginalMember(owner = "client!d", name = "uc", descriptor = "Lol;")
    public static class272 field4150;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "()I")
    public final int method1853() {
        field4124++;
        if (!this.field4105) {
            this.method1890(0);
        }
        return this.field4069;
    }

    @OriginalMember(owner = "client!d", name = "T", descriptor = "(I)V")
    public final void method1854(int arg0) {
        this.field4038 = (short) arg0;
        field4134++;
        this.method1905(true);
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "()V")
    public final void method1855() {
        field4142++;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()Z")
    public final boolean method1856() {
        field4113++;
        if (this.field4095 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field4095.length; var1++) {
            if (this.field4095[var1] != -1 && !this.field4059.field8050.method144(8649, this.field4095[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!d", name = "TA", descriptor = "()I")
    public final int method1857() {
        field4088++;
        return this.field4038;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public final void method1858(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field4116; var5++) {
            int var9 = this.field4080[var5] & 0xFFFF;
            int var10 = (var9 & 0xFE92) >> 10;
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
            this.field4080[var5] = (short) class422.method2436(class422.method2436(var11 << 7, var10 << 10), var12);
        }
        field4042++;
        if (this.field4039 != null) {
            for (int var6 = 0; var6 < this.field4145; var6++) {
                class139 var7 = this.field4039[var6];
                class106 var8 = this.field4040[var6];
                var8.field1148 = class194.field2239[this.field4080[var7.field1536] & 0xFFFF] & 0xFFFFFF | var8.field1148 & 0xFF000000;
            }
        }
        this.method1905(true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lre;I)V")
    private final void method1859(class634 arg0, int arg1) {
        if (this.field4141 > class104.field1127.length) {
            class104.field1127 = new int[this.field4141];
            class138.field1520 = new int[this.field4141];
        }
        field4108++;
        int var3 = 0;
        if (arg1 != -1) {
            this.method1865();
        }
        while (var3 < this.field4075) {
            int var14 = (this.field4126[var3] - (this.field4097[var3] * this.field4059.field4568 >> 8) >> this.field4059.field4594) - arg0.field8938;
            int var15 = (this.field4139[var3] - (this.field4097[var3] * this.field4059.field4609 >> 8) >> this.field4059.field4594) - arg0.field8928;
            int var16 = this.field4079[var3];
            int var17 = this.field4079[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field4121[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class104.field1127[var19] = var14;
                class138.field1520[var19] = var15;
            }
            var3++;
        }
        for (int var4 = 0; var4 < this.field4091; var4++) {
            if (this.field4161 == null || this.field4161[var4] <= 128) {
                short var5 = this.field4082[var4];
                short var6 = this.field4152[var4];
                short var7 = this.field4064[var4];
                int var8 = class104.field1127[var5];
                int var9 = class104.field1127[var6];
                int var10 = class104.field1127[var7];
                int var11 = class138.field1520[var5];
                int var12 = class138.field1520[var6];
                int var13 = class138.field1520[var7];
                if ((var8 - var9) * (var12 - var13) - (var10 - var9) * (var12 - var11) > 0) {
                    arg0.method3563(var11, var9, var13, var8, var12, 2, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILq;IIZI)Z")
    private final boolean method1860(int arg0, class490 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4101++;
        class537 var7 = (class537) arg1;
        class537 var8 = this.field4059.field4511;
        float var9 = var7.field7514 * var8.field7541 + var7.field7553 * var8.field7527 + var7.field7545 * var8.field7520 + var8.field7545;
        float var10 = var7.field7514 * var8.field7546 + var7.field7553 * var8.field7529 + var7.field7545 * var8.field7537 + var8.field7553;
        class250.field3134 = var7.field7532 * var8.field7541 + var7.field7537 * var8.field7527 + var7.field7520 * var8.field7520;
        class435.field6142 = var7.field7533 * var8.field7541 + var7.field7546 * var8.field7527 + var7.field7541 * var8.field7520;
        class669.field9326 = var7.field7557 * var8.field7541 + var7.field7529 * var8.field7527 + var7.field7527 * var8.field7520;
        class108.field1167 = var7.field7533 * var8.field7546 + var7.field7546 * var8.field7529 + var7.field7541 * var8.field7537;
        class170.field1899 = var7.field7557 * var8.field7533 + var7.field7529 * var8.field7557 + var7.field7527 * var8.field7532;
        class89.field888 = var7.field7532 * var8.field7546 + var7.field7537 * var8.field7529 + var7.field7520 * var8.field7537;
        class571.field8108 = var7.field7557 * var8.field7546 + var7.field7529 * var8.field7529 + var7.field7527 * var8.field7537;
        class260.field3259 = var7.field7532 * var8.field7533 + var7.field7537 * var8.field7557 + var7.field7520 * var8.field7532;
        class384.field5190 = var7.field7533 * var8.field7533 + var7.field7546 * var8.field7557 + var7.field7541 * var8.field7532;
        float var11 = var7.field7514 * var8.field7533 + var7.field7553 * var8.field7557 + var7.field7545 * var8.field7532 + var8.field7514;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        if (arg3 != -1) {
            this.field4127 = null;
        }
        int var17 = this.field4059.field4567;
        int var18 = this.field4059.field4614;
        if (!this.field4105) {
            this.method1890(0);
        }
        class285.field3557[0] = this.field4143;
        class96.field1003[0] = this.field4073;
        class285.field3557[1] = this.field4153;
        class667.field9312[0] = this.field4119;
        class96.field1003[1] = this.field4073;
        class667.field9312[1] = this.field4119;
        class285.field3557[2] = this.field4143;
        class96.field1003[2] = this.field4069;
        class285.field3557[3] = this.field4153;
        class667.field9312[2] = this.field4119;
        class96.field1003[3] = this.field4069;
        class285.field3557[4] = this.field4143;
        class667.field9312[3] = this.field4119;
        class96.field1003[4] = this.field4073;
        class667.field9312[4] = this.field4054;
        class285.field3557[5] = this.field4153;
        class96.field1003[5] = this.field4073;
        class285.field3557[6] = this.field4143;
        class667.field9312[5] = this.field4054;
        class96.field1003[6] = this.field4069;
        class667.field9312[6] = this.field4054;
        class285.field3557[7] = this.field4153;
        class96.field1003[7] = this.field4069;
        class667.field9312[7] = this.field4054;
        for (int var19 = 0; var19 < 8; var19++) {
            float var38 = (float) class285.field3557[var19];
            float var39 = (float) class667.field9312[var19];
            float var40 = (float) class96.field1003[var19];
            float var41 = class108.field1167 * var39 + class89.field888 * var38 + class571.field8108 * var40 + var10;
            float var42 = class384.field5190 * var39 + class260.field3259 * var38 + class170.field1899 * var40 + var11;
            float var43 = class435.field6142 * var39 + class669.field9326 * var40 + class250.field3134 * var38 + var9;
            if ((float) this.field4059.field4533 <= var42) {
                if (arg5 > 0) {
                    var42 = arg5;
                }
                float var44 = (float) var17 * var43 / var42 + (float) this.field4059.field4587;
                if (var44 < var13) {
                    var13 = var44;
                }
                if (var44 > var14) {
                    var14 = var44;
                }
                float var45 = (float) var18 * var41 / var42 + (float) this.field4059.field4600;
                if (var45 > var16) {
                    var16 = var45;
                }
                var12 = true;
                if (var45 < var15) {
                    var15 = var45;
                }
            }
        }
        if (var12 && (float) arg2 > var13 && (float) arg2 < var14 && (float) arg0 > var15 && (float) arg0 < var16) {
            if (arg4) {
                return true;
            }
            if (this.field4141 > class104.field1127.length) {
                class138.field1520 = new int[this.field4141];
                class104.field1127 = new int[this.field4141];
            }
            for (int var20 = 0; var20 < this.field4075; var20++) {
                float var22 = (float) this.field4097[var20];
                float var23 = (float) this.field4126[var20];
                float var24 = (float) this.field4139[var20];
                float var25 = class435.field6142 * var24 + class669.field9326 * var22 + class250.field3134 * var23 + var9;
                float var26 = class108.field1167 * var24 + class89.field888 * var23 + class571.field8108 * var22 + var10;
                float var27 = class384.field5190 * var24 + class260.field3259 * var23 + class170.field1899 * var22 + var11;
                if ((var27 >= (float) this.field4059.field4533)) {
                    if (arg5 > 0) {
                        var27 = arg5;
                    }
                    int var32 = (int) ((float) var17 * var25 / var27 + (float) this.field4059.field4587);
                    int var33 = (int) ((float) var18 * var26 / var27 + (float) this.field4059.field4600);
                    int var34 = this.field4079[var20];
                    int var35 = this.field4079[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field4121[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        class104.field1127[var37] = var32;
                        class138.field1520[var37] = var33;
                    }
                } else {
                    int var28 = this.field4079[var20];
                    int var29 = this.field4079[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field4121[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class104.field1127[this.field4121[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field4116; var21++) {
                if (class104.field1127[this.field4082[var21]] != -999999 && class104.field1127[this.field4152[var21]] != -999999 && class104.field1127[this.field4064[var21]] != -999999 && this.method1873(class138.field1520[this.field4064[var21]], class138.field1520[this.field4152[var21]], class104.field1127[this.field4064[var21]], class138.field1520[this.field4082[var21]], arg2, -2064443250, arg0, class104.field1127[this.field4152[var21]], class104.field1127[this.field4082[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!d", name = "PA", descriptor = "()I")
    public final int method1861() {
        field4061++;
        return this.field4162;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method1862(byte arg0) {
        field4047 = null;
        if (arg0 > 58) {
            field4150 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    private final void method1863(byte arg0) {
        field4094++;
        if (arg0 <= 113) {
            this.field4111 = null;
        }
        if (this.field4039 == null) {
            return;
        }
        this.field4059.method955(false);
        this.field4059.method1984(false, (byte) -122);
        this.field4059.method2012((byte) -79, 1, class107.field1154);
        this.field4059.method1979(1, class107.field1154, (byte) -24);
        for (int var2 = 0; var2 < this.field4145; var2++) {
            class139 var3 = this.field4039[var2];
            class106 var4 = this.field4040[var2];
            if (!var3.field1534 || !this.field4059.method1044()) {
                float var5 = (float) (this.field4126[var3.field1537] + this.field4126[var3.field1528] + this.field4126[var3.field1532]) * 0.3333333F;
                float var6 = (float) (this.field4097[var3.field1537] + this.field4097[var3.field1532] + this.field4097[var3.field1528]) * 0.3333333F;
                float var7 = (float) (this.field4139[var3.field1537] + this.field4139[var3.field1528] + this.field4139[var3.field1532]) * 0.3333333F;
                float var8 = class435.field6142 * var7 + class669.field9326 * var6 + class250.field3134 * var5 + class566.field8073;
                float var9 = class108.field1167 * var7 + class89.field888 * var5 + class571.field8108 * var6 + class227.field2815;
                float var10 = class384.field5190 * var7 + class260.field3259 * var5 + class170.field1899 * var6 + class408.field5442;
                class537 var11 = this.field4059.method2014(390);
                var11.method3023(var4.field1142, var3.field1526 * var4.field1140 >> 7, -15463, var10 - (float) var3.field1535, var3.field1531 * var4.field1147 >> 7, (float) var4.field1150 + var9, (float) var4.field1137 + var8);
                var11.method3029(this.field4059.field4512, 8);
                this.field4059.method2033((byte) 101);
                int var12 = var4.field1148;
                this.field4059.method2008(false, 125, var3.field1533, false);
                this.field4059.method2051(var3.field1530, (byte) -48);
                this.field4059.method1988(var12, 4);
                this.field4059.method1981(-113);
            }
        }
        this.field4059.method1979(1, class692.field9717, (byte) -97);
        this.field4059.method2012((byte) -108, 1, class692.field9717);
        this.field4059.method955(true);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)Z")
    private final boolean method1864(byte arg0) {
        field4132++;
        if (this.field4077.field7308) {
            return true;
        }
        int var2 = -128 / ((73 - arg0) / 48);
        if (this.field4077.field7313 == null) {
            this.field4077.field7313 = this.field4059.method1326(-101, this.field4045);
        }
        class17 var3 = this.field4077.field7313;
        var3.method73(this.field4091 * 6, (byte) -55);
        Buffer var4 = var3.method75(true, 21281);
        if (var4 != null) {
            Stream var5 = this.field4059.method1980((byte) -74, var4);
            if (Stream.method3480()) {
                for (int var6 = 0; var6 < this.field4091; var6++) {
                    var5.method3468(this.field4082[var6]);
                    var5.method3468(this.field4152[var6]);
                    var5.method3468(this.field4064[var6]);
                }
            } else {
                for (int var7 = 0; var7 < this.field4091; var7++) {
                    var5.method3478(this.field4082[var7]);
                    var5.method3478(this.field4152[var7]);
                    var5.method3478(this.field4064[var7]);
                }
            }
            var5.method3472();
            if (var3.method71(-26305)) {
                this.field4077.field7308 = true;
                this.field4077.field7311 = var3;
                this.field4110 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!d", name = "OA", descriptor = "()I")
    public final int method1865() {
        field4046++;
        if (!this.field4105) {
            this.method1890(0);
        }
        return this.field4119;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lmj;Lef;IIII)V")
    public class330(class344 arg0, class581 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class524 var7 = arg0.field8050;
        int[] var8 = new int[arg1.field8251];
        this.field4079 = new int[arg1.field8250 + 1];
        for (int var9 = 0; var9 < arg1.field8251; var9++) {
            if ((arg1.field8217 == null || arg1.field8217[var9] != 2) && (arg1.field8221 == null || arg1.field8221[var9] == -1 || !var7.method140(arg1.field8221[var9] & 0xFFFF, 862).field3670)) {
                var8[this.field4116++] = var9;
                this.field4079[arg1.field8224[var9]]++;
                this.field4079[arg1.field8225[var9]]++;
                this.field4079[arg1.field8259[var9]]++;
            }
        }
        this.field4091 = this.field4116;
        long[] var10 = new long[this.field4116];
        boolean var11 = (this.field4162 & 0x100) != 0;
        label507: for (int var12 = 0; var12 < this.field4116; var12++) {
            int var185 = var8[var12];
            class295 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field8223 != null) {
                for (int var191 = 0; var191 < arg1.field8223.length; var191++) {
                    class636 var192 = arg1.field8223[var191];
                    if (var192.field8951 == var185) {
                        class247 var193 = class260.method1539(var192.field8954, (byte) 121);
                        if (var193.field3055) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field4091--;
                            continue label507;
                        }
                    }
                }
            }
            short var194 = -1;
            if (arg1.field8221 != null) {
                var194 = arg1.field8221[var185];
                if (var194 != -1) {
                    var186 = var7.method140(var194 & 0xFFFF, 862);
                    var190 = var186.field3676;
                    var189 = var186.field3669;
                }
            }
            boolean var195 = arg1.field8244 != null && arg1.field8244[var185] != 0 || var186 != null && var186.field3666 | !var186.field3665;
            if ((var11 || var195) && arg1.field8228 != null) {
                var187 += arg1.field8228[var185] << 17;
            }
            if (var195) {
                var187 += 65536;
            }
            int var196 = (var189 & 0xFF << 8) + var187;
            int var197 = (var190 & 0xFF) + var196;
            int var198 = ((var194 & 0xFFFF) << 16) + var188;
            int var199 = (var12 & 0xFFFF) + var198;
            var10[var12] = ((long) var197 << 32) + (long) var199;
            this.field4049 |= var195;
        }
        class201.method1204(false, var10, var8);
        this.field4139 = arg1.field8253;
        this.field4075 = arg1.field8250;
        this.field4089 = arg1.field8268;
        this.field4097 = arg1.field8237;
        this.field4114 = arg1.field8248;
        this.field4126 = arg1.field8219;
        this.field4158 = arg1.field8252;
        this.field4078 = arg1.field8255;
        class423[] var13 = new class423[this.field4075];
        if (arg1.field8223 != null) {
            this.field4145 = arg1.field8223.length;
            this.field4039 = new class139[this.field4145];
            this.field4040 = new class106[this.field4145];
            for (int var14 = 0; var14 < this.field4145; var14++) {
                class636 var15 = arg1.field8223[var14];
                class247 var16 = class260.method1539(var15.field8954, (byte) 103);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field4116; var18++) {
                    if (var8[var18] == var15.field8951) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class194.field2239[arg1.field8231[var15.field8951] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field8244 == null ? 0 : arg1.field8244[var15.field8951]) << 24;
                this.field4039[var14] = new class139(var17, arg1.field8224[var15.field8951], arg1.field8225[var15.field8951], arg1.field8259[var15.field8951], var16.field3063, var16.field3056, var16.field3064, var16.field3048, var16.field3050, var16.field3055, var16.field3057, var15.field8957);
                this.field4040[var14] = new class106(var20);
            }
        }
        int var21 = this.field4116 * 3;
        this.field4146 = new byte[var21];
        this.field4128 = new float[var21];
        this.field4064 = new short[this.field4116];
        this.field4080 = new short[this.field4116];
        if (arg1.field8238 != null) {
            this.field4112 = new short[this.field4116];
        }
        this.field4152 = new short[this.field4116];
        this.field4130 = new short[var21];
        this.field4055 = (short) arg4;
        class475.field6848 = new long[var21];
        this.field4111 = new short[var21];
        this.field4129 = new short[var21];
        this.field4038 = (short) arg3;
        this.field4121 = new short[var21];
        this.field4095 = new short[this.field4116];
        this.field4161 = new byte[this.field4116];
        this.field4076 = new float[var21];
        this.field4082 = new short[this.field4116];
        this.field4120 = new short[var21];
        this.field4063 = new short[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field8250; var23++) {
            int var184 = this.field4079[var23];
            this.field4079[var23] = var22;
            var22 += var184;
            var13[var23] = new class423();
        }
        this.field4079[arg1.field8250] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field8235 != null) {
            int var28 = arg1.field8245;
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
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field4116; var36++) {
                int var43 = var8[var36];
                if (arg1.field8235[var43] != -1) {
                    int var44 = arg1.field8235[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field8224[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field8225[var43];
                        } else {
                            var46 = arg1.field8259[var43];
                        }
                        int var47 = arg1.field8219[var46];
                        int var48 = arg1.field8237[var46];
                        int var49 = arg1.field8253[var46];
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
            var27 = new float[var28][];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field8269[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field8262[var37];
                        if (var42 == 0) {
                            var39 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 <= 0) {
                            var39 = (float) (-var42) / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var41 = (float) var42 / 1024.0F;
                            var39 = 1.0F;
                        }
                        var40 = 64.0F / (float) arg1.field8256[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field8262[var37];
                        var40 = 64.0F / (float) arg1.field8256[var37];
                        var41 = 64.0F / (float) arg1.field8254[var37];
                    } else {
                        var39 = (float) arg1.field8262[var37] / 1024.0F;
                        var41 = (float) arg1.field8254[var37] / 1024.0F;
                        var40 = (float) arg1.field8256[var37] / 1024.0F;
                    }
                    var27[var37] = class60.method322(var39, arg1.field8270[var37], var40, var41, arg1.field8229[var37], 1, class105.method572(255, arg1.field8243[var37]), arg1.field8267[var37]);
                }
            }
        }
        class518[] var50 = new class518[arg1.field8251];
        for (int var51 = 0; var51 < arg1.field8251; var51++) {
            short var163 = arg1.field8224[var51];
            short var164 = arg1.field8225[var51];
            short var165 = arg1.field8259[var51];
            int var166 = this.field4126[var164] - this.field4126[var163];
            int var167 = this.field4097[var164] - this.field4097[var163];
            int var168 = this.field4139[var164] - this.field4139[var163];
            int var169 = this.field4126[var165] - this.field4126[var163];
            int var170 = this.field4097[var165] - this.field4097[var163];
            int var171 = this.field4139[var165] - this.field4139[var163];
            int var172 = var167 * var171 - (var168 * var170);
            int var173 = var168 * var169 - (var166 * var171);
            int var174 = var166 * var170 - var167 * var169;
            while (var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192) {
                var173 >>= 0x1;
                var174 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var172 * var172 + var173 * var173 + var174 * var174));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var173 * 256 / var175;
            int var177 = var172 * 256 / var175;
            int var178 = var174 * 256 / var175;
            byte var179 = arg1.field8217 == null ? 0 : arg1.field8217[var51];
            if (var179 == 0) {
                class423 var180 = var13[var163];
                var180.field5978 += var178;
                var180.field5979++;
                var180.field5977 += var176;
                var180.field5976 += var177;
                class423 var181 = var13[var164];
                var181.field5979++;
                var181.field5976 += var177;
                var181.field5978 += var178;
                var181.field5977 += var176;
                class423 var182 = var13[var165];
                var182.field5977 += var176;
                var182.field5976 += var177;
                var182.field5978 += var178;
                var182.field5979++;
            } else if (var179 == 1) {
                class518 var183 = var50[var51] = new class518();
                var183.field7379 = var178;
                var183.field7370 = var177;
                var183.field7373 = var176;
            }
        }
        for (int var52 = 0; var52 < this.field4116; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field8231[var73] & 0xFFFF;
            short var75;
            if (arg1.field8221 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field8221[var73];
            }
            int var76;
            if (arg1.field8235 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field8235[var73];
            }
            int var77;
            if (arg1.field8244 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field8244[var73] & 0xFF;
            }
            float var78 = 0.0F;
            float var79 = 0.0F;
            float var80 = 0.0F;
            float var81 = 0.0F;
            float var82 = 0.0F;
            float var83 = 0.0F;
            byte var84 = 0;
            byte var85 = 0;
            int var86 = 0;
            if (var75 != -1) {
                if (var76 == -1) {
                    var81 = 1.0F;
                    var80 = 1.0F;
                    var79 = 1.0F;
                    var85 = 2;
                    var84 = 1;
                    var83 = 0.0F;
                    var82 = 0.0F;
                    var78 = 0.0F;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field8269[var76];
                    if (var87 == 0) {
                        short var116 = arg1.field8224[var73];
                        short var117 = arg1.field8225[var73];
                        short var118 = arg1.field8259[var73];
                        short var119 = arg1.field8270[var76];
                        short var120 = arg1.field8229[var76];
                        short var121 = arg1.field8267[var76];
                        float var122 = (float) arg1.field8219[var119];
                        float var123 = (float) arg1.field8237[var119];
                        float var124 = (float) arg1.field8253[var119];
                        float var125 = (float) arg1.field8219[var120] - var122;
                        float var126 = (float) arg1.field8237[var120] - var123;
                        float var127 = (float) arg1.field8253[var120] - var124;
                        float var128 = (float) arg1.field8219[var121] - var122;
                        float var129 = (float) arg1.field8237[var121] - var123;
                        float var130 = (float) arg1.field8253[var121] - var124;
                        float var131 = (float) arg1.field8219[var116] - var122;
                        float var132 = (float) arg1.field8237[var116] - var123;
                        float var133 = (float) arg1.field8253[var116] - var124;
                        float var134 = (float) arg1.field8219[var117] - var122;
                        float var135 = (float) arg1.field8237[var117] - var123;
                        float var136 = (float) arg1.field8253[var117] - var124;
                        float var137 = (float) arg1.field8219[var118] - var122;
                        float var138 = (float) arg1.field8237[var118] - var123;
                        float var139 = (float) arg1.field8253[var118] - var124;
                        float var140 = var126 * var130 - (var127 * var129);
                        float var141 = var127 * var128 - var125 * var130;
                        float var142 = var125 * var129 - (var126 * var128);
                        float var143 = var129 * var142 - var130 * var141;
                        float var144 = var130 * var140 - var128 * var142;
                        float var145 = var128 * var141 - var129 * var140;
                        float var146 = 1.0F / (var127 * var145 + var125 * var143 + var126 * var144);
                        var78 = (var133 * var145 + var131 * var143 + var132 * var144) * var146;
                        var80 = (var136 * var145 + var134 * var143 + var135 * var144) * var146;
                        var82 = (var139 * var145 + var137 * var143 + var138 * var144) * var146;
                        float var147 = var127 * var140 - (var125 * var142);
                        float var148 = var125 * var141 - var126 * var140;
                        float var149 = var126 * var142 - (var127 * var141);
                        float var150 = 1.0F / (var130 * var148 + var128 * var149 + var129 * var147);
                        var83 = (var139 * var148 + var137 * var149 + var138 * var147) * var150;
                        var79 = (var133 * var148 + var131 * var149 + var132 * var147) * var150;
                        var81 = (var136 * var148 + var134 * var149 + var135 * var147) * var150;
                    } else {
                        short var88 = arg1.field8224[var73];
                        short var89 = arg1.field8225[var73];
                        short var90 = arg1.field8259[var73];
                        int var91 = var24[var76];
                        int var92 = var25[var76];
                        int var93 = var26[var76];
                        float[] var94 = var27[var76];
                        byte var95 = arg1.field8246[var76];
                        float var96 = (float) arg1.field8258[var76] / 256.0F;
                        if (var87 == 1) {
                            float var114 = (float) arg1.field8254[var76] / 1024.0F;
                            class462.method2653(var91, arg1.field8219[var88], var114, arg1.field8253[var88], var94, var96, var95, arg1.field8237[var88], var92, var93, -103);
                            var79 = class314.field3904;
                            var78 = class137.field1504;
                            class462.method2653(var91, arg1.field8219[var89], var114, arg1.field8253[var89], var94, var96, var95, arg1.field8237[var89], var92, var93, -127);
                            var80 = class137.field1504;
                            var81 = class314.field3904;
                            class462.method2653(var91, arg1.field8219[var90], var114, arg1.field8253[var90], var94, var96, var95, arg1.field8237[var90], var92, var93, -117);
                            var82 = class137.field1504;
                            var83 = class314.field3904;
                            float var115 = var114 / 2.0F;
                            if ((var95 & 0x1) == 0) {
                                if ((var115 < var82 - var78)) {
                                    var82 -= var114;
                                    var85 = 1;
                                } else if (var115 < var78 - var82) {
                                    var85 = 2;
                                    var82 += var114;
                                }
                                if ((var115 < var80 - var78)) {
                                    var80 -= var114;
                                    var84 = 1;
                                } else if (var115 < var78 - var80) {
                                    var84 = 2;
                                    var80 += var114;
                                }
                            } else {
                                if (var115 < var81 - var79) {
                                    var81 -= var114;
                                    var84 = 1;
                                } else if (var79 - var81 > var115) {
                                    var81 += var114;
                                    var84 = 2;
                                }
                                if ((var83 - var79 > var115)) {
                                    var83 -= var114;
                                    var85 = 1;
                                } else if (var79 - var83 > var115) {
                                    var85 = 2;
                                    var83 += var114;
                                }
                            }
                        } else if (var87 == 2) {
                            float var97 = (float) arg1.field8227[var76] / 256.0F;
                            float var98 = (float) arg1.field8242[var76] / 256.0F;
                            int var99 = arg1.field8219[var89] - arg1.field8219[var88];
                            int var100 = arg1.field8237[var89] - arg1.field8237[var88];
                            int var101 = arg1.field8253[var89] - arg1.field8253[var88];
                            int var102 = arg1.field8219[var90] - arg1.field8219[var88];
                            int var103 = arg1.field8237[var90] - arg1.field8237[var88];
                            int var104 = arg1.field8253[var90] - arg1.field8253[var88];
                            int var105 = var100 * var104 - (var101 * var103);
                            int var106 = var101 * var102 - (var99 * var104);
                            int var107 = var99 * var103 - (var100 * var102);
                            float var108 = 64.0F / (float) arg1.field8262[var76];
                            float var109 = 64.0F / (float) arg1.field8256[var76];
                            float var110 = 64.0F / (float) arg1.field8254[var76];
                            float var111 = (var94[2] * (float) var107 + var94[0] * (float) var105 + var94[1] * (float) var106) / var108;
                            float var112 = (var94[5] * (float) var107 + var94[3] * (float) var105 + var94[4] * (float) var106) / var109;
                            float var113 = (var94[8] * (float) var107 + var94[7] * (float) var106 + var94[6] * (float) var105) / var110;
                            var86 = class430.method2475(var113, (byte) -74, var111, var112);
                            class240.method1431(var93, var96, var86, 1, arg1.field8237[var88], var91, var97, var95, var98, arg1.field8253[var88], var92, arg1.field8219[var88], var94);
                            var79 = class558.field7958;
                            var78 = class329.field4035;
                            class240.method1431(var93, var96, var86, 1, arg1.field8237[var89], var91, var97, var95, var98, arg1.field8253[var89], var92, arg1.field8219[var89], var94);
                            var80 = class329.field4035;
                            var81 = class558.field7958;
                            class240.method1431(var93, var96, var86, 1, arg1.field8237[var90], var91, var97, var95, var98, arg1.field8253[var90], var92, arg1.field8219[var90], var94);
                            var83 = class558.field7958;
                            var82 = class329.field4035;
                        } else if (var87 == 3) {
                            class91.method463(118, var91, arg1.field8253[var88], arg1.field8237[var88], var92, arg1.field8219[var88], var96, var95, var94, var93);
                            var78 = class27.field283;
                            var79 = class584.field8291;
                            class91.method463(123, var91, arg1.field8253[var89], arg1.field8237[var89], var92, arg1.field8219[var89], var96, var95, var94, var93);
                            var80 = class27.field283;
                            var81 = class584.field8291;
                            class91.method463(125, var91, arg1.field8253[var90], arg1.field8237[var90], var92, arg1.field8219[var90], var96, var95, var94, var93);
                            var83 = class584.field8291;
                            var82 = class27.field283;
                            if ((var95 & 0x1) == 0) {
                                if (var80 - var78 > 0.5F) {
                                    var84 = 1;
                                    var80--;
                                } else if (var78 - var80 > 0.5F) {
                                    var84 = 2;
                                    var80++;
                                }
                                if (var82 - var78 > 0.5F) {
                                    var82--;
                                    var85 = 1;
                                } else if (var78 - var82 > 0.5F) {
                                    var85 = 2;
                                    var82++;
                                }
                            } else {
                                if (var83 - var79 > 0.5F) {
                                    var85 = 1;
                                    var83--;
                                } else if (var79 - var83 > 0.5F) {
                                    var83++;
                                    var85 = 2;
                                }
                                if ((var81 - var79 > 0.5F)) {
                                    var81--;
                                    var84 = 1;
                                } else if (var79 - var81 > 0.5F) {
                                    var84 = 2;
                                    var81++;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field8217 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field8217[var73];
            }
            if (var151 == 0) {
                long var155 = (long) (var76 << 2) + ((long) (var74 << 8) + (long) (var86 << 24) + (long) var77 << 32);
                short var157 = arg1.field8224[var73];
                short var158 = arg1.field8225[var73];
                short var159 = arg1.field8259[var73];
                class423 var160 = var13[var157];
                this.field4082[var52] = this.method1909((byte) 121, var160.field5978, var52, var160.field5976, arg1, var160.field5979, var160.field5977, var155, var79, var157, var78);
                class423 var161 = var13[var158];
                this.field4152[var52] = this.method1909((byte) 121, var161.field5978, var52, var161.field5976, arg1, var161.field5979, var161.field5977, (long) var84 + var155, var81, var158, var80);
                class423 var162 = var13[var159];
                this.field4064[var52] = this.method1909((byte) 123, var162.field5978, var52, var162.field5976, arg1, var162.field5979, var162.field5977, (long) var85 + var155, var83, var159, var82);
            } else if (var151 == 1) {
                class518 var152 = var50[var73];
                long var153 = (long) ((var152.field7379 + 256 << 22) + (var152.field7373 + 256 << 12) + (var76 << 2) + (var152.field7370 <= 0 ? 2048 : 1024)) + ((long) (var74 << 8) + (long) (var86 << 24) + (long) var77 << 32);
                this.field4082[var52] = this.method1909((byte) 118, var152.field7379, var52, var152.field7370, arg1, 0, var152.field7373, var153, var79, arg1.field8224[var73], var78);
                this.field4152[var52] = this.method1909((byte) 113, var152.field7379, var52, var152.field7370, arg1, 0, var152.field7373, (long) var84 + var153, var81, arg1.field8225[var73], var80);
                this.field4064[var52] = this.method1909((byte) 121, var152.field7379, var52, var152.field7370, arg1, 0, var152.field7373, (long) var85 + var153, var83, arg1.field8259[var73], var82);
            }
            if (arg1.field8221 == null) {
                this.field4095[var52] = -1;
            } else {
                this.field4095[var52] = arg1.field8221[var73];
            }
            if (arg1.field8244 != null) {
                this.field4161[var52] = arg1.field8244[var73];
            }
            if (arg1.field8238 != null) {
                this.field4112[var52] = arg1.field8238[var73];
            }
            this.field4080[var52] = arg1.field8231[var73];
        }
        if (this.field4091 > 0) {
            int var53 = 1;
            short var54 = this.field4095[0];
            for (int var55 = 0; var55 < this.field4091; var55++) {
                short var65 = this.field4095[var55];
                if (var54 != var65) {
                    var53++;
                    var54 = var65;
                }
            }
            this.field4056 = new int[var53];
            this.field4058 = new int[var53 + 1];
            this.field4131 = new int[var53];
            this.field4058[0] = 0;
            int var56 = this.field4141;
            int var57 = 0;
            short var58 = 0;
            short var59 = this.field4095[0];
            for (int var60 = 0; var60 < this.field4091; var60++) {
                short var61 = this.field4095[var60];
                if (var59 != var61) {
                    this.field4056[var57] = var56;
                    this.field4131[var57] = var58 + 1 - var56;
                    var57++;
                    this.field4058[var57] = var60;
                    var56 = this.field4141;
                    var58 = 0;
                    var59 = var61;
                }
                short var62 = this.field4082[var60];
                if (var56 > var62) {
                    var56 = var62;
                }
                if (var62 > var58) {
                    var58 = var62;
                }
                short var63 = this.field4152[var60];
                if (var63 > var58) {
                    var58 = var63;
                }
                if (var63 < var56) {
                    var56 = var63;
                }
                short var64 = this.field4064[var60];
                if (var56 > var64) {
                    var56 = var64;
                }
                if (var64 > var58) {
                    var58 = var64;
                }
            }
            this.field4056[var57] = var56;
            this.field4131[var57] = var58 + 1 - var56;
            var57++;
            this.field4058[var57] = this.field4091;
        }
        class475.field6848 = null;
        this.field4120 = class422.method2404(this.field4120, this.field4141, (byte) -91);
        this.field4129 = class422.method2404(this.field4129, this.field4141, (byte) 41);
        this.field4063 = class422.method2404(this.field4063, this.field4141, (byte) 64);
        this.field4111 = class422.method2404(this.field4111, this.field4141, (byte) -120);
        this.field4130 = class422.method2404(this.field4130, this.field4141, (byte) 99);
        this.field4146 = class273.method1602(this.field4146, -27934, this.field4141);
        this.field4128 = class457.method2626((byte) -103, this.field4141, this.field4128);
        this.field4076 = class457.method2626((byte) 59, this.field4141, this.field4076);
        if (arg1.field8216 != null && class275.method1613(arg2, this.field4051, 0)) {
            this.field4085 = arg1.method3300((byte) -123, false);
        }
        if (arg1.field8223 != null && class106.method577(0, this.field4051, arg2)) {
            this.field4151 = arg1.method3293(101);
        }
        if (arg1.field8218 != null && class616.method3436(this.field4051, arg2, 3962)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field4116; var68++) {
                int var72 = arg1.field8218[var8[var68]];
                if (var72 >= 0) {
                    int var10002 = var67[var72]++;
                    if (var72 > var66) {
                        var66 = var72;
                    }
                }
            }
            this.field4140 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field4140[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field4116; var70++) {
                int var71 = arg1.field8218[var8[var70]];
                if (var71 >= 0) {
                    this.field4140[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "fa", descriptor = "(I)V")
    public final void method1866(int arg0) {
        field4138++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4075; var4++) {
            int var7 = this.field4139[var4] * var2 + this.field4126[var4] * var3 >> 14;
            this.field4139[var4] = this.field4139[var4] * var3 - (this.field4126[var4] * var2) >> 14;
            this.field4126[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field4141; var5++) {
            int var6 = this.field4130[var5] * var2 + this.field4063[var5] * var3 >> 14;
            this.field4130[var5] = (short) (this.field4130[var5] * var3 - (this.field4063[var5] * var2) >> 14);
            this.field4063[var5] = (short) var6;
        }
        this.method1889(-106);
        this.method1894(55);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method1867(int arg0, int arg1, class490 arg2, boolean arg3) {
        field4037++;
        return this.method1860(arg1, arg2, arg0, -1, arg3, -1);
    }

    @OriginalMember(owner = "client!d", name = "RA", descriptor = "()I")
    public final int method1868() {
        if (!this.field4105) {
            this.method1890(0);
        }
        field4071++;
        return this.field4155;
    }

    @OriginalMember(owner = "client!d", name = "J", descriptor = "()I")
    public final int method1869() {
        field4136++;
        if (!this.field4105) {
            this.method1890(0);
        }
        return this.field4073;
    }

    @OriginalMember(owner = "client!d", name = "l", descriptor = "()I")
    public final int method1870() {
        if (!this.field4105) {
            this.method1890(0);
        }
        field4090++;
        return this.field4153;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method1871(int arg0) {
        class185.field2107.method937(class645.field9106, class639.field9075.field6781 ? class465.field6639 + 256 << 2 : -1, 0);
        if (arg0 > -62) {
            field4047 = null;
        }
        field4157++;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
    public final void method1872() {
        field4099++;
        if (this.field4141 > 0 && this.field4091 > 0) {
            this.method1895((byte) 101);
            this.method1864((byte) 125);
            this.method1881((byte) -128);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4066++;
        if (arg3 > arg6 && arg6 < arg1 && arg6 < arg0) {
            return false;
        } else if (arg6 > arg3 && arg1 < arg6 && arg6 > arg0) {
            return false;
        } else if (arg5 != -2064443250) {
            return false;
        } else if (arg4 < arg8 && arg7 > arg4 && arg4 < arg2) {
            return false;
        } else {
            return arg8 >= arg4 || arg4 <= arg7 || arg4 <= arg2;
        }
    }

    @OriginalMember(owner = "client!d", name = "S", descriptor = "(Lha;)Lha;")
    public final class120 method1874(class120 arg0) {
        field4160++;
        if (this.field4141 == 0) {
            return null;
        }
        if (!this.field4105) {
            this.method1890(0);
        }
        int var2;
        int var3;
        if (this.field4059.field4568 <= 0) {
            var2 = this.field4143 - (this.field4059.field4568 * this.field4073 >> 8) >> this.field4059.field4594;
            var3 = this.field4153 - (this.field4059.field4568 * this.field4069 >> 8) >> this.field4059.field4594;
        } else {
            var2 = this.field4143 - (this.field4059.field4568 * this.field4069 >> 8) >> this.field4059.field4594;
            var3 = this.field4153 - (this.field4059.field4568 * this.field4073 >> 8) >> this.field4059.field4594;
        }
        int var4;
        int var5;
        if (this.field4059.field4609 <= 0) {
            var4 = this.field4119 - (this.field4059.field4609 * this.field4073 >> 8) >> this.field4059.field4594;
            var5 = this.field4054 - (this.field4059.field4609 * this.field4069 >> 8) >> this.field4059.field4594;
        } else {
            var4 = this.field4119 - (this.field4059.field4609 * this.field4069 >> 8) >> this.field4059.field4594;
            var5 = this.field4054 - (this.field4059.field4609 * this.field4073 >> 8) >> this.field4059.field4594;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class634 var8 = (class634) arg0;
        class634 var9;
        if (var8 != null && var8.method3562(var6, (byte) -33, var7)) {
            var9 = var8;
            var8.method3565((byte) -97);
        } else {
            var9 = new class634(this.field4059, var6, var7);
        }
        var9.method3567(var3, var4, var2, 92, var5);
        this.method1859(var9, -1);
        return var9;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lq;Lufa;II)V")
    public final void method1875(class490 arg0, class374 arg1, int arg2, int arg3) {
        field4070++;
        if (this.field4141 == 0) {
            return;
        }
        class537 var5 = this.field4059.field4511;
        class537 var6 = (class537) arg0;
        if (!this.field4105) {
            this.method1890(0);
        }
        class408.field5442 = var5.field7533 * var6.field7514 + var5.field7557 * var6.field7553 + var5.field7532 * var6.field7545 + var5.field7514;
        class170.field1899 = var5.field7533 * var6.field7557 + var5.field7557 * var6.field7529 + var5.field7532 * var6.field7527;
        float var7 = (float) this.field4073 * class170.field1899 + class408.field5442;
        float var8 = (float) this.field4069 * class170.field1899 + class408.field5442;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = (float) this.field4154 + var7;
            var10 = (float) (-this.field4154) + var8;
        } else {
            var9 = (float) this.field4154 + var8;
            var10 = var7 - (float) this.field4154;
        }
        if ((var10 >= this.field4059.field4580) || (var9 <= (float) this.field4059.field4533)) {
            return;
        }
        class566.field8073 = var5.field7541 * var6.field7514 + var5.field7527 * var6.field7553 + var5.field7520 * var6.field7545 + var5.field7545;
        class669.field9326 = var5.field7541 * var6.field7557 + var5.field7527 * var6.field7529 + var5.field7520 * var6.field7527;
        float var11 = (float) this.field4073 * class669.field9326 + class566.field8073;
        float var12 = (float) this.field4069 * class669.field9326 + class566.field8073;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = (var12 - (float) this.field4154) * (float) this.field4059.field4567;
            var14 = ((float) this.field4154 + var11) * (float) this.field4059.field4567;
        } else {
            var13 = ((float) (-this.field4154) + var11) * (float) this.field4059.field4567;
            var14 = ((float) this.field4154 + var12) * (float) this.field4059.field4567;
        }
        if ((this.field4059.field4534 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field4059.field4528)) {
            return;
        }
        class227.field2815 = var5.field7546 * var6.field7514 + var5.field7537 * var6.field7545 + var5.field7529 * var6.field7553 + var5.field7553;
        class571.field8108 = var5.field7546 * var6.field7557 + var5.field7537 * var6.field7527 + var5.field7529 * var6.field7529;
        float var15 = (float) this.field4073 * class571.field8108 + class227.field2815;
        float var16 = (float) this.field4069 * class571.field8108 + class227.field2815;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) this.field4154 + var15) * (float) this.field4059.field4614;
            var18 = ((float) (-this.field4154) + var16) * (float) this.field4059.field4614;
        } else {
            var18 = ((float) (-this.field4154) + var15) * (float) this.field4059.field4614;
            var17 = ((float) this.field4154 + var16) * (float) this.field4059.field4614;
        }
        if ((var18 / (float) arg2 >= this.field4059.field4540) || (var17 / (float) arg2 <= this.field4059.field4523)) {
            return;
        }
        if (arg1 != null || this.field4039 != null) {
            class260.field3259 = var5.field7533 * var6.field7532 + var5.field7557 * var6.field7537 + var5.field7532 * var6.field7520;
            class250.field3134 = var5.field7541 * var6.field7532 + var5.field7527 * var6.field7537 + var5.field7520 * var6.field7520;
            class108.field1167 = var5.field7546 * var6.field7533 + var5.field7537 * var6.field7541 + var5.field7529 * var6.field7546;
            class89.field888 = var5.field7546 * var6.field7532 + var5.field7537 * var6.field7520 + var5.field7529 * var6.field7537;
            class384.field5190 = var5.field7533 * var6.field7533 + var5.field7557 * var6.field7546 + var5.field7532 * var6.field7541;
            class435.field6142 = var5.field7541 * var6.field7533 + var5.field7527 * var6.field7546 + var5.field7520 * var6.field7541;
        }
        if (arg1 != null) {
            int var19 = this.field4153 + this.field4143 >> 1;
            int var20 = this.field4119 + this.field4054 >> 1;
            int var21 = (int) ((float) var20 * class435.field6142 + (float) this.field4073 * class669.field9326 + (float) var19 * class250.field3134 + class566.field8073);
            int var22 = (int) ((float) var20 * class108.field1167 + (float) this.field4073 * class571.field8108 + (float) var19 * class89.field888 + class227.field2815);
            int var23 = (int) ((float) var20 * class384.field5190 + (float) this.field4073 * class170.field1899 + (float) var19 * class260.field3259 + class408.field5442);
            int var24 = (int) ((float) var20 * class435.field6142 + (float) this.field4069 * class669.field9326 + (float) var19 * class250.field3134 + class566.field8073);
            int var25 = (int) ((float) var20 * class108.field1167 + (float) this.field4069 * class571.field8108 + (float) var19 * class89.field888 + class227.field2815);
            arg1.field5090 = this.field4059.field4614 * var25 / arg2 + this.field4059.field4600;
            arg1.field5088 = this.field4059.field4567 * var24 / arg2 + this.field4059.field4587;
            arg1.field5092 = this.field4059.field4614 * var22 / arg2 + this.field4059.field4600;
            int var26 = (int) ((float) var20 * class384.field5190 + (float) this.field4069 * class170.field1899 + (float) var19 * class260.field3259 + class408.field5442);
            arg1.field5089 = this.field4059.field4567 * var21 / arg2 + this.field4059.field4587;
            if (this.field4059.field4533 <= var23 || this.field4059.field4533 <= var26) {
                arg1.field5087 = true;
                arg1.field5091 = (this.field4154 + var21) * this.field4059.field4567 / arg2 + this.field4059.field4587 - arg1.field5089;
            }
        }
        this.field4059.method2016(9, (float) arg2);
        this.field4059.method2003(16);
        this.field4059.method2018(true, var6);
        this.method1892(false);
        this.method1863((byte) 119);
    }

    @OriginalMember(owner = "client!d", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method1876(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field4093++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class332.field4172 = 0;
            int var13 = 0;
            class421.field5607 = 0;
            class495.field7169 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field4085.length) {
                    int[] var16 = this.field4085[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field4114 == null || (arg6 & this.field4114[var18]) != 0) {
                            class495.field7169 += this.field4126[var18];
                            class421.field5607 += this.field4097[var18];
                            var13++;
                            class332.field4172 += this.field4139[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class618.field8748 = true;
                class421.field5607 = class421.field5607 / var13 + var10;
                class495.field7169 = class495.field7169 / var13 + var11;
                class332.field4172 = class332.field4172 / var13 + var12;
            } else {
                class495.field7169 = var11;
                class332.field4172 = var12;
                class421.field5607 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 8192 >> 14;
                int var20 = arg7[3] * arg2 + 8192 - (-(arg7[4] * arg3) - (arg7[5] * arg4)) >> 14;
                int var21 = arg7[6] * arg2 - (-(arg7[7] * arg3) - arg7[8] * arg4 - 8192) >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field4085.length) {
                    int[] var27 = this.field4085[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field4114 == null || (this.field4114[var29] & arg6) != 0) {
                            this.field4126[var29] += var24;
                            this.field4097[var29] += var23;
                            this.field4139[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field4085.length) {
                        int[] var50 = this.field4085[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field4114 == null || (arg6 & this.field4114[var52]) != 0) {
                                this.field4126[var52] -= class495.field7169;
                                this.field4097[var52] -= class421.field5607;
                                this.field4139[var52] -= class332.field4172;
                                if (arg4 != 0) {
                                    int var53 = class435.field6134[arg4];
                                    int var54 = class435.field6135[arg4];
                                    int var55 = this.field4097[var52] * var53 + (this.field4126[var52] * var54) + 16383 >> 14;
                                    this.field4097[var52] = this.field4097[var52] * var54 + 16383 - (this.field4126[var52] * var53) >> 14;
                                    this.field4126[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class435.field6134[arg2];
                                    int var57 = class435.field6135[arg2];
                                    int var58 = this.field4097[var52] * var57 + 16383 - (this.field4139[var52] * var56) >> 14;
                                    this.field4139[var52] = this.field4097[var52] * var56 + (this.field4139[var52] * var57) + 16383 >> 14;
                                    this.field4097[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class435.field6134[arg3];
                                    int var60 = class435.field6135[arg3];
                                    int var61 = this.field4139[var52] * var59 + this.field4126[var52] * var60 + 16383 >> 14;
                                    this.field4139[var52] = this.field4139[var52] * var60 + 16383 - (this.field4126[var52] * var59) >> 14;
                                    this.field4126[var52] = var61;
                                }
                                this.field4126[var52] += class495.field7169;
                                this.field4097[var52] += class421.field5607;
                                this.field4139[var52] += class332.field4172;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (var32 < this.field4085.length) {
                            int[] var33 = this.field4085[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field4114 == null || (arg6 & this.field4114[var35]) != 0) {
                                    int var36 = this.field4079[var35];
                                    int var37 = this.field4079[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field4121[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class435.field6134[arg4];
                                            int var41 = class435.field6135[arg4];
                                            int var42 = this.field4111[var39] * var40 + this.field4063[var39] * var41 + 16383 >> 14;
                                            this.field4111[var39] = (short) (this.field4111[var39] * var41 + 16383 - (this.field4063[var39] * var40) >> 14);
                                            this.field4063[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class435.field6134[arg2];
                                            int var44 = class435.field6135[arg2];
                                            int var45 = this.field4111[var39] * var44 + 16383 - (this.field4130[var39] * var43) >> 14;
                                            this.field4130[var39] = (short) (this.field4130[var39] * var44 + this.field4111[var39] * var43 + 16383 >> 14);
                                            this.field4111[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class435.field6134[arg3];
                                            int var47 = class435.field6135[arg3];
                                            int var48 = this.field4130[var39] * var46 + this.field4063[var39] * var47 + 16383 >> 14;
                                            this.field4130[var39] = (short) (this.field4130[var39] * var47 + 16383 - (this.field4063[var39] * var46) >> 14);
                                            this.field4063[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method1894(55);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class618.field8748) {
                    int var68 = arg7[0] * class495.field7169 - (-(arg7[3] * class421.field5607) - arg7[6] * class332.field4172 - 8192) >> 14;
                    int var69 = arg7[7] * class332.field4172 + (arg7[4] * class421.field5607 + arg7[1] * class495.field7169 + 8192) >> 14;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[8] * class332.field4172 + (arg7[2] * class495.field7169 + (arg7[5] * class421.field5607)) + 8192 >> 14;
                    int var73 = var67 + var72;
                    class421.field5607 = var70;
                    class495.field7169 = var71;
                    class618.field8748 = false;
                    class332.field4172 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class435.field6135[arg2];
                int var76 = class435.field6134[arg2];
                int var77 = class435.field6135[arg3];
                int var78 = class435.field6134[arg3];
                int var79 = class435.field6135[arg4];
                int var80 = class435.field6134[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[0] = var78 * var82 + (var77 * var79 + 8192) >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[5] = -var76;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[6] = var77 * var82 + (-var78 * var79 + 8192) >> 14;
                int var83 = var74[0] * -class495.field7169 + (var74[2] * -class332.field4172) + var74[1] * -class421.field5607 + 8192 >> 14;
                int var84 = var74[4] * -class421.field5607 + var74[3] * -class495.field7169 + (var74[5] * -class332.field4172) + 8192 >> 14;
                int var85 = var74[6] * -class495.field7169 + var74[8] * -class332.field4172 + var74[7] * -class421.field5607 + 8192 >> 14;
                int var86 = class495.field7169 + var83;
                int var87 = var84 + class421.field5607;
                int var88 = class332.field4172 + var85;
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
                int var91 = var74[1] * var66 + var74[2] * var67 + var74[0] * var65 + 8192 >> 14;
                int var92 = var74[4] * var66 + (var74[5] * var67) + var74[3] * var65 + 8192 >> 14;
                int var93 = var74[8] * var67 + var74[6] * var65 + (var74[7] * var66) + 8192 >> 14;
                int var94 = var86 + var91;
                int var95 = var87 + var92;
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
                int var99 = arg7[2] * var96 + arg7[0] * var94 + arg7[1] * var95 + 8192 >> 14;
                int var100 = arg7[3] * var94 + arg7[4] * var95 + arg7[5] * var96 + 8192 >> 14;
                int var101 = var63 + var100;
                int var102 = arg7[6] * var94 + (arg7[7] * var95 + (arg7[8] * var96)) + 8192 >> 14;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field4085.length > var106) {
                        int[] var107 = this.field4085[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field4114 == null || (this.field4114[var109] & arg6) != 0) {
                                int var110 = this.field4139[var109] * var97[2] + this.field4126[var109] * var97[0] + this.field4097[var109] * var97[1] + 8192 >> 14;
                                int var111 = this.field4139[var109] * var97[5] + this.field4126[var109] * var97[3] + this.field4097[var109] * var97[4] + 8192 >> 14;
                                int var112 = var101 + var111;
                                int var113 = this.field4097[var109] * var97[7] + this.field4139[var109] * var97[8] + this.field4126[var109] * var97[6] + 8192 >> 14;
                                int var114 = var103 + var110;
                                int var115 = var104 + var113;
                                this.field4126[var109] = var114;
                                this.field4097[var109] = var112;
                                this.field4139[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field4085.length > var173) {
                        int[] var174 = this.field4085[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field4114 == null || (this.field4114[var176] & arg6) != 0) {
                                this.field4126[var176] -= class495.field7169;
                                this.field4097[var176] -= class421.field5607;
                                this.field4139[var176] -= class332.field4172;
                                this.field4126[var176] = this.field4126[var176] * arg2 >> 7;
                                this.field4097[var176] = this.field4097[var176] * arg3 >> 7;
                                this.field4139[var176] = this.field4139[var176] * arg4 >> 7;
                                this.field4126[var176] += class495.field7169;
                                this.field4097[var176] += class421.field5607;
                                this.field4139[var176] += class332.field4172;
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
                if (class618.field8748) {
                    int var128 = arg7[0] * class495.field7169 + (arg7[3] * class421.field5607) + arg7[6] * class332.field4172 + 8192 >> 14;
                    int var129 = arg7[7] * class332.field4172 + arg7[1] * class495.field7169 + (arg7[4] * class421.field5607) + 8192 >> 14;
                    int var130 = var126 + var129;
                    int var131 = arg7[8] * class332.field4172 + arg7[5] * class421.field5607 + arg7[2] * class495.field7169 + 8192 >> 14;
                    int var132 = var125 + var128;
                    int var133 = var127 + var131;
                    class495.field7169 = var132;
                    class421.field5607 = var130;
                    class618.field8748 = false;
                    class332.field4172 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class495.field7169 * var134 + 8192 >> 14;
                int var138 = -class421.field5607 * var135 + 8192 >> 14;
                int var139 = -class332.field4172 * var136 + 8192 >> 14;
                int var140 = var137 + class495.field7169;
                int var141 = class421.field5607 + var138;
                int var142 = class332.field4172 + var139;
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
                int var152 = arg7[0] * var146 + arg7[1] * var148 + arg7[2] * var149 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[3] * var146 + arg7[4] * var148 + 8192 >> 14;
                int var154 = var123 + var153;
                int var155 = arg7[6] * var146 + (arg7[7] * var148 + arg7[8] * var149 + 8192) >> 14;
                int var156 = var122 + var152;
                int var157 = var124 + var155;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field4085.length) {
                        int[] var160 = this.field4085[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field4114 == null || (this.field4114[var162] & arg6) != 0) {
                                int var163 = this.field4126[var162] * var150[0] + (this.field4139[var162] * var150[2]) + this.field4097[var162] * var150[1] + 8192 >> 14;
                                int var164 = this.field4139[var162] * var150[5] + (this.field4126[var162] * var150[3] + this.field4097[var162] * var150[4] + 8192) >> 14;
                                int var165 = var156 + var163;
                                int var166 = this.field4139[var162] * var150[8] + (this.field4126[var162] * var150[6] + (this.field4097[var162] * var150[7])) + 8192 >> 14;
                                int var167 = var154 + var164;
                                this.field4126[var162] = var165;
                                int var168 = var157 + var166;
                                this.field4097[var162] = var167;
                                this.field4139[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4140 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field4140.length) {
                        int[] var183 = this.field4140[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field4112 == null || (arg6 & this.field4112[var185]) != 0) {
                                int var186 = (this.field4161[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field4161[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field4039 != null) {
                        for (int var179 = 0; var179 < this.field4145; var179++) {
                            class139 var180 = this.field4039[var179];
                            class106 var181 = this.field4040[var179];
                            var181.field1148 = var181.field1148 & 0xFFFFFF | 255 - (this.field4161[var180.field1536] & 0xFF) << 24;
                        }
                    }
                    this.method1905(true);
                }
            }
        } else if (arg0 == 7) {
            if (this.field4140 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field4140.length > var192) {
                        int[] var193 = this.field4140[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field4112 == null || (arg6 & this.field4112[var195]) != 0) {
                                int var196 = this.field4080[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = (var196 & 0x385) >> 7;
                                int var199 = var196 & 0x7F;
                                int var200 = arg3 / 4 + var198;
                                int var201 = var197 + arg2 & 0x3F;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 7) {
                                    var200 = 7;
                                }
                                int var202 = arg4 + var199;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field4080[var195] = (short) class422.method2436(var202, class422.method2436(var201 << 10, var200 << 7));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field4039 != null) {
                        for (int var189 = 0; var189 < this.field4145; var189++) {
                            class139 var190 = this.field4039[var189];
                            class106 var191 = this.field4040[var189];
                            var191.field1148 = var191.field1148 & 0xFF000000 | class194.field2239[this.field4080[var190.field1536] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method1905(true);
                }
            }
        } else if (arg0 == 8) {
            if (this.field4151 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (this.field4151.length > var204) {
                        int[] var205 = this.field4151[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class106 var207 = this.field4040[var205[var206]];
                            var207.field1150 += arg3;
                            var207.field1137 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4151 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (this.field4151.length > var209) {
                        int[] var210 = this.field4151[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class106 var212 = this.field4040[var210[var211]];
                            var212.field1140 = var212.field1140 * arg3 >> 7;
                            var212.field1147 = var212.field1147 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4151 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field4151.length > var214) {
                    int[] var215 = this.field4151[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class106 var217 = this.field4040[var215[var216]];
                        var217.field1142 = var217.field1142 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIZ)Lda;")
    public final class473 method1877(byte arg0, int arg1, boolean arg2) {
        field4050++;
        class330 var4;
        class330 var5;
        if (arg0 == 1) {
            var4 = this.field4059.field4632;
            var5 = this.field4059.field4631;
        } else if (arg0 == 2) {
            var4 = this.field4059.field4629;
            var5 = this.field4059.field4621;
        } else if (arg0 == 3) {
            var4 = this.field4059.field4623;
            var5 = this.field4059.field4624;
        } else if (arg0 == 4) {
            var4 = this.field4059.field4617;
            var5 = this.field4059.field4618;
        } else if (arg0 == 5) {
            var5 = this.field4059.field4619;
            var4 = this.field4059.field4630;
        } else {
            var5 = var4 = new class330(this.field4059, 0, 0, true, false);
        }
        return this.method1901(30, arg1, var5, arg2, arg0 != 0, var4);
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    private final void method1878(byte arg0) {
        if (this.field4077 != null) {
            this.field4077.field7308 = false;
        }
        field4081++;
        if (arg0 != -68) {
            this.field4127 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "M", descriptor = "(I)V")
    public final void method1879(int arg0) {
        field4098++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4075; var4++) {
            int var5 = this.field4139[var4] * var2 + this.field4126[var4] * var3 >> 14;
            this.field4139[var4] = this.field4139[var4] * var3 - (this.field4126[var4] * var2) >> 14;
            this.field4126[var4] = var5;
        }
        this.method1889(-79);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1880(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field4041++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class421.field5607 = 0;
            int var12 = 0;
            class332.field4172 = 0;
            class495.field7169 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field4085.length > var14) {
                    int[] var15 = this.field4085[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class495.field7169 += this.field4126[var17];
                        class421.field5607 += this.field4097[var17];
                        var12++;
                        class332.field4172 += this.field4139[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class495.field7169 = var9;
                class421.field5607 = var11;
                class332.field4172 = var10;
            } else {
                class332.field4172 = class332.field4172 / var12 + var10;
                class495.field7169 = class495.field7169 / var12 + var9;
                class421.field5607 = class421.field5607 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field4085.length) {
                    int[] var23 = this.field4085[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field4126[var25] += var19;
                        this.field4097[var25] += var20;
                        this.field4139[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field4085.length > var45) {
                    int[] var46 = this.field4085[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field4126[var48] -= class495.field7169;
                            this.field4097[var48] -= class421.field5607;
                            this.field4139[var48] -= class332.field4172;
                            if (arg4 != 0) {
                                int var49 = class435.field6134[arg4];
                                int var50 = class435.field6135[arg4];
                                int var51 = this.field4097[var48] * var49 + (this.field4126[var48] * var50) + 16383 >> 14;
                                this.field4097[var48] = this.field4097[var48] * var50 + 16383 - (this.field4126[var48] * var49) >> 14;
                                this.field4126[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class435.field6134[arg2];
                                int var53 = class435.field6135[arg2];
                                int var54 = this.field4097[var48] * var53 + 16383 - this.field4139[var48] * var52 >> 14;
                                this.field4139[var48] = this.field4139[var48] * var53 + (this.field4097[var48] * var52 + 16383) >> 14;
                                this.field4097[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class435.field6134[arg3];
                                int var56 = class435.field6135[arg3];
                                int var57 = this.field4139[var48] * var55 + this.field4126[var48] * var56 + 16383 >> 14;
                                this.field4139[var48] = this.field4139[var48] * var56 + 16383 - (this.field4126[var48] * var55) >> 14;
                                this.field4126[var48] = var57;
                            }
                            this.field4126[var48] += class495.field7169;
                            this.field4097[var48] += class421.field5607;
                            this.field4139[var48] += class332.field4172;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field4126[var59] -= class495.field7169;
                            this.field4097[var59] -= class421.field5607;
                            this.field4139[var59] -= class332.field4172;
                            if (arg2 != 0) {
                                int var60 = class435.field6134[arg2];
                                int var61 = class435.field6135[arg2];
                                int var62 = this.field4097[var59] * var61 + 16383 - (this.field4139[var59] * var60) >> 14;
                                this.field4139[var59] = this.field4139[var59] * var61 + this.field4097[var59] * var60 + 16383 >> 14;
                                this.field4097[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class435.field6134[arg4];
                                int var64 = class435.field6135[arg4];
                                int var65 = this.field4097[var59] * var63 + (this.field4126[var59] * var64) + 16383 >> 14;
                                this.field4097[var59] = this.field4097[var59] * var64 + 16383 - (this.field4126[var59] * var63) >> 14;
                                this.field4126[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class435.field6134[arg3];
                                int var67 = class435.field6135[arg3];
                                int var68 = this.field4139[var59] * var66 + this.field4126[var59] * var67 + 16383 >> 14;
                                this.field4139[var59] = this.field4139[var59] * var67 + 16383 - (this.field4126[var59] * var66) >> 14;
                                this.field4126[var59] = var68;
                            }
                            this.field4126[var59] += class495.field7169;
                            this.field4097[var59] += class421.field5607;
                            this.field4139[var59] += class332.field4172;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field4085.length) {
                        int[] var29 = this.field4085[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field4079[var31];
                            int var33 = this.field4079[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field4121[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class435.field6134[arg4];
                                    int var37 = class435.field6135[arg4];
                                    int var38 = this.field4111[var35] * var36 - (-(this.field4063[var35] * var37) - 16383) >> 14;
                                    this.field4111[var35] = (short) (this.field4111[var35] * var37 + 16383 - (this.field4063[var35] * var36) >> 14);
                                    this.field4063[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class435.field6134[arg2];
                                    int var40 = class435.field6135[arg2];
                                    int var41 = this.field4111[var35] * var40 + 16383 - (this.field4130[var35] * var39) >> 14;
                                    this.field4130[var35] = (short) (this.field4130[var35] * var40 + this.field4111[var35] * var39 + 16383 >> 14);
                                    this.field4111[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class435.field6134[arg3];
                                    int var43 = class435.field6135[arg3];
                                    int var44 = this.field4063[var35] * var43 + (this.field4130[var35] * var42 + 16383) >> 14;
                                    this.field4130[var35] = (short) (this.field4130[var35] * var43 + 16383 - (this.field4063[var35] * var42) >> 14);
                                    this.field4063[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method1894(55);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field4085.length > var70) {
                    int[] var71 = this.field4085[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field4126[var73] -= class495.field7169;
                        this.field4097[var73] -= class421.field5607;
                        this.field4139[var73] -= class332.field4172;
                        this.field4126[var73] = this.field4126[var73] * arg2 >> 7;
                        this.field4097[var73] = this.field4097[var73] * arg3 >> 7;
                        this.field4139[var73] = this.field4139[var73] * arg4 >> 7;
                        this.field4126[var73] += class495.field7169;
                        this.field4097[var73] += class421.field5607;
                        this.field4139[var73] += class332.field4172;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field4140 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field4140.length) {
                        int[] var80 = this.field4140[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field4161[var82] & 0xFF) + arg2 * 8;
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field4161[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field4039 != null) {
                        for (int var76 = 0; var76 < this.field4145; var76++) {
                            class139 var77 = this.field4039[var76];
                            class106 var78 = this.field4040[var76];
                            var78.field1148 = var78.field1148 & 0xFFFFFF | 255 - (this.field4161[var77.field1536] & 0xFF) << 24;
                        }
                    }
                    this.method1905(true);
                }
            }
        } else if (arg0 == 7) {
            if (this.field4140 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field4140.length) {
                        int[] var90 = this.field4140[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field4080[var92] & 0xFFFF;
                            int var94 = (var93 & 0xFDF7) >> 10;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = var93 & 0x7F;
                            int var98 = arg2 + var94 & 0x3F;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var99 = arg4 + var97;
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field4080[var92] = (short) class422.method2436(class422.method2436(var96 << 7, var98 << 10), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field4039 != null) {
                        for (int var86 = 0; var86 < this.field4145; var86++) {
                            class139 var87 = this.field4039[var86];
                            class106 var88 = this.field4040[var86];
                            var88.field1148 = var88.field1148 & 0xFF000000 | class194.field2239[this.field4080[var87.field1536] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method1905(true);
                }
            }
        } else if (arg0 == 8) {
            if (this.field4151 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field4151.length) {
                        int[] var102 = this.field4151[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class106 var104 = this.field4040[var102[var103]];
                            var104.field1150 += arg3;
                            var104.field1137 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field4151 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field4151.length) {
                        int[] var107 = this.field4151[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class106 var109 = this.field4040[var107[var108]];
                            var109.field1140 = var109.field1140 * arg3 >> 7;
                            var109.field1147 = var109.field1147 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field4151 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field4151.length) {
                    int[] var112 = this.field4151[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class106 var114 = this.field4040[var112[var113]];
                        var114.field1142 = var114.field1142 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    private final void method1881(byte arg0) {
        field4104++;
        if (!this.field4110) {
            return;
        }
        this.field4110 = false;
        if (this.field4158 == null && this.field4078 == null && this.field4039 == null) {
            if (this.field4126 != null && !class659.method3653(this.field4051, (byte) -104, this.field4162)) {
                if (this.field4100 == null || this.field4100.method721((byte) -45)) {
                    if (!this.field4105) {
                        this.method1890(0);
                    }
                    this.field4126 = null;
                } else {
                    this.field4110 = true;
                }
            }
            if (this.field4097 != null && !class394.method2233(25149, this.field4162, this.field4051)) {
                if (this.field4100 == null || this.field4100.method721((byte) -45)) {
                    if (!this.field4105) {
                        this.method1890(0);
                    }
                    this.field4097 = null;
                } else {
                    this.field4110 = true;
                }
            }
            if (this.field4139 != null && !class166.method909((byte) -73, this.field4162, this.field4051)) {
                if (this.field4100 == null || this.field4100.method721((byte) -45)) {
                    if (!this.field4105) {
                        this.method1890(0);
                    }
                    this.field4139 = null;
                } else {
                    this.field4110 = true;
                }
            }
        }
        if (this.field4121 != null && this.field4126 == null && this.field4097 == null && this.field4139 == null) {
            this.field4121 = null;
            this.field4079 = null;
        }
        if (this.field4146 != null && !class432.method2481(this.field4051, -10041, this.field4162)) {
            label198: {
                label197: {
                    boolean var10000;
                    if ((this.field4051 & 0x37) == 0) {
                        if (this.field4086 == null || this.field4086.method721((byte) -45)) {
                            break label197;
                        }
                        var10000 = false;
                    } else {
                        if (this.field4044 == null || this.field4044.method721((byte) -45)) {
                            break label197;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field4110 = true;
                        break label198;
                    }
                }
                this.field4146 = null;
                this.field4063 = this.field4111 = this.field4130 = null;
            }
        }
        if (this.field4080 != null && !class221.method1325(this.field4162, (byte) -106, this.field4051)) {
            if (this.field4086 == null || this.field4086.method721((byte) -45)) {
                this.field4080 = null;
            } else {
                this.field4110 = true;
            }
        }
        if (this.field4161 != null && !class31.method163(this.field4162, 0, this.field4051)) {
            if (this.field4086 == null || this.field4086.method721((byte) -45)) {
                this.field4161 = null;
            } else {
                this.field4110 = true;
            }
        }
        int var2 = 11 / ((arg0 + 61) / 55);
        if (this.field4128 != null && !class360.method2113(this.field4162, this.field4051, (byte) -60)) {
            if (this.field4083 == null || this.field4083.method721((byte) -45)) {
                this.field4128 = this.field4076 = null;
            } else {
                this.field4110 = true;
            }
        }
        if (this.field4095 != null && !class409.method2292(this.field4051, this.field4162, (byte) -98)) {
            if (this.field4086 == null || this.field4086.method721((byte) -45)) {
                this.field4095 = null;
            } else {
                this.field4110 = true;
            }
        }
        if (this.field4082 != null && !class600.method3363(this.field4051, 27241, this.field4162)) {
            if ((this.field4077 == null || this.field4077.method2911(0)) && (this.field4086 == null || this.field4086.method721((byte) -45))) {
                this.field4082 = this.field4152 = this.field4064 = null;
            } else {
                this.field4110 = true;
            }
        }
        if (this.field4120 != null) {
            if (this.field4100 == null || this.field4100.method721((byte) -45)) {
                this.field4120 = null;
            } else {
                this.field4110 = true;
            }
        }
        if (this.field4129 != null) {
            if (this.field4086 == null || this.field4086.method721((byte) -45)) {
                this.field4129 = null;
            } else {
                this.field4110 = true;
            }
        }
        if (this.field4140 != null && !class616.method3436(this.field4051, this.field4162, 3962)) {
            this.field4112 = null;
            this.field4140 = null;
        }
        if (this.field4085 != null && !class275.method1613(this.field4162, this.field4051, 0)) {
            this.field4085 = null;
            this.field4114 = null;
        }
        if (this.field4151 != null && !class106.method577(0, this.field4051, this.field4162)) {
            this.field4151 = null;
        }
        if (this.field4058 != null && (this.field4162 & 0x800) == 0 && (this.field4162 & 0x40000) == 0) {
            this.field4058 = null;
            this.field4131 = null;
            this.field4056 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(SS)V")
    public final void method1882(short arg0, short arg1) {
        field4125++;
        for (int var3 = 0; var3 < this.field4116; var3++) {
            if (this.field4080[var3] == arg0) {
                this.field4080[var3] = arg1;
            }
        }
        if (this.field4039 != null) {
            for (int var4 = 0; var4 < this.field4145; var4++) {
                class139 var5 = this.field4039[var4];
                class106 var6 = this.field4040[var4];
                var6.field1148 = class194.field2239[this.field4080[var5.field1536] & 0xFFFF] & 0xFFFFFF | var6.field1148 & 0xFF000000;
            }
        }
        this.method1905(true);
    }

    @OriginalMember(owner = "client!d", name = "ga", descriptor = "(I)V")
    public final void method1883(int arg0) {
        field4122++;
        this.field4055 = (short) arg0;
        this.method1889(-86);
        this.method1894(55);
    }

    @OriginalMember(owner = "client!d", name = "MA", descriptor = "(I)V")
    public final void method1884(int arg0) {
        field4156++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4075; var4++) {
            int var5 = this.field4097[var4] * var3 - (this.field4139[var4] * var2) >> 14;
            this.field4139[var4] = this.field4139[var4] * var3 + this.field4097[var4] * var2 >> 14;
            this.field4097[var4] = var5;
        }
        this.method1889(-123);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "R", descriptor = "(III)V")
    public final void method1885(int arg0, int arg1, int arg2) {
        field4074++;
        for (int var4 = 0; var4 < this.field4075; var4++) {
            if (arg0 != 128) {
                this.field4126[var4] = this.field4126[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field4097[var4] = this.field4097[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field4139[var4] = this.field4139[var4] * arg2 >> 7;
            }
        }
        this.method1889(-127);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "K", descriptor = "()I")
    public final int method1886() {
        field4117++;
        if (!this.field4105) {
            this.method1890(0);
        }
        return this.field4154;
    }

    @OriginalMember(owner = "client!d", name = "na", descriptor = "()I")
    public final int method1887() {
        field4084++;
        return this.field4055;
    }

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "()V")
    public final void method1888() {
        for (int var1 = 0; var1 < this.field4075; var1++) {
            this.field4139[var1] = -this.field4139[var1];
        }
        field4102++;
        for (int var2 = 0; var2 < this.field4141; var2++) {
            this.field4130[var2] = (short) (-this.field4130[var2]);
        }
        for (int var3 = 0; var3 < this.field4116; var3++) {
            short var4 = this.field4082[var3];
            this.field4082[var3] = this.field4064[var3];
            this.field4064[var3] = var4;
        }
        this.method1889(-61);
        this.method1894(55);
        this.method1878((byte) -68);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    private final void method1889(int arg0) {
        if (arg0 > -35) {
            this.method1894(-32);
        }
        field4106++;
        if (this.field4100 != null) {
            this.field4100.field1424 = false;
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    private final void method1890(int arg0) {
        field4096++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = arg0; var10 < this.field4075; var10++) {
            int var11 = this.field4126[var10];
            int var12 = this.field4097[var10];
            if (var12 > var6) {
                var6 = var12;
            }
            if (var5 < var11) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            int var13 = this.field4139[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field4143 = var2;
        this.field4054 = var7;
        this.field4073 = var3;
        this.field4119 = var4;
        this.field4069 = var6;
        this.field4153 = var5;
        this.field4154 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field4155 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field4105 = true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lq;)V")
    public final void method1891(class490 arg0) {
        field4067++;
        class537 var2 = (class537) arg0;
        if (this.field4158 != null) {
            for (int var3 = 0; var3 < this.field4158.length; var3++) {
                class93 var4 = this.field4158[var3];
                class93 var5 = var4;
                if (var4.field955 != null) {
                    var5 = var4.field955;
                }
                var5.field948 = (int) ((float) this.field4139[var4.field936] * var2.field7541 + (float) this.field4126[var4.field936] * var2.field7520 + (float) this.field4097[var4.field936] * var2.field7527 + var2.field7545);
                var5.field938 = (int) ((float) this.field4139[var4.field936] * var2.field7546 + (float) this.field4126[var4.field936] * var2.field7537 + (float) this.field4097[var4.field936] * var2.field7529 + var2.field7553);
                var5.field942 = (int) ((float) this.field4139[var4.field936] * var2.field7533 + (float) this.field4126[var4.field936] * var2.field7532 + (float) this.field4097[var4.field936] * var2.field7557 + var2.field7514);
                var5.field951 = (int) ((float) this.field4139[var4.field945] * var2.field7541 + (float) this.field4126[var4.field945] * var2.field7520 + (float) this.field4097[var4.field945] * var2.field7527 + var2.field7545);
                var5.field947 = (int) ((float) this.field4139[var4.field945] * var2.field7546 + (float) this.field4126[var4.field945] * var2.field7537 + (float) this.field4097[var4.field945] * var2.field7529 + var2.field7553);
                var5.field956 = (int) ((float) this.field4139[var4.field945] * var2.field7533 + (float) this.field4126[var4.field945] * var2.field7532 + (float) this.field4097[var4.field945] * var2.field7557 + var2.field7514);
                var5.field935 = (int) ((float) this.field4139[var4.field952] * var2.field7541 + (float) this.field4126[var4.field952] * var2.field7520 + (float) this.field4097[var4.field952] * var2.field7527 + var2.field7545);
                var5.field954 = (int) ((float) this.field4139[var4.field952] * var2.field7546 + (float) this.field4126[var4.field952] * var2.field7537 + (float) this.field4097[var4.field952] * var2.field7529 + var2.field7553);
                var5.field957 = (int) ((float) this.field4139[var4.field952] * var2.field7533 + (float) this.field4126[var4.field952] * var2.field7532 + (float) this.field4097[var4.field952] * var2.field7557 + var2.field7514);
            }
        }
        if (this.field4078 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4078.length; var6++) {
            class667 var7 = this.field4078[var6];
            class667 var8 = var7;
            if (var7.field9315 != null) {
                var8 = var7.field9315;
            }
            if (var7.field9313 == null) {
                var7.field9313 = var2.method27();
            } else {
                var7.field9313.method15(var2);
            }
            var8.field9316 = (int) ((float) this.field4139[var7.field9310] * var2.field7541 + (float) this.field4126[var7.field9310] * var2.field7520 + (float) this.field4097[var7.field9310] * var2.field7527 + var2.field7545);
            var8.field9307 = (int) ((float) this.field4139[var7.field9310] * var2.field7546 + (float) this.field4126[var7.field9310] * var2.field7537 + (float) this.field4097[var7.field9310] * var2.field7529 + var2.field7553);
            var8.field9308 = (int) ((float) this.field4139[var7.field9310] * var2.field7533 + (float) this.field4126[var7.field9310] * var2.field7532 + (float) this.field4097[var7.field9310] * var2.field7557 + var2.field7514);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    private final void method1892(boolean arg0) {
        if (arg0) {
            this.method1909((byte) 73, 103, 92, -16, null, 80, 81, 46L, -1.1891139F, -87, -0.39450914F);
        }
        field4053++;
        if (this.field4091 == 0) {
            return;
        }
        if (this.method1895((byte) 103) && this.method1864((byte) -28)) {
            this.field4059.method1281(this.field4100.field1430, 0, 121);
            this.field4059.method1281(this.field4086.field1430, 1, 100);
            this.field4059.method1281(this.field4083.field1430, 2, 112);
            boolean var2;
            if ((this.field4051 & 0x37) == 0) {
                var2 = false;
                this.field4059.method1984(false, (byte) -102);
                this.field4059.method1285(true, this.field4059.field4633);
            } else {
                var2 = true;
                this.field4059.method1984(true, (byte) -23);
                this.field4059.method1281(this.field4044.field1430, 3, 112);
                this.field4059.method1285(!arg0, this.field4059.field4625);
            }
            for (int var3 = 0; var3 < this.field4056.length; var3++) {
                int var4 = this.field4058[var3];
                int var5 = this.field4058[var3 + 1];
                int var6 = this.field4095[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field4059.method2008(true, 70, var6, var2);
                this.field4059.method1276(var4 * 3, var5 - var4, this.field4131[var3], false, class538.field7582, this.field4077.field7311, this.field4056[var3]);
            }
        }
        this.method1881((byte) 18);
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)V")
    public final void method1893(byte arg0) {
        field4147++;
        if (arg0 > -54) {
            return;
        }
        if (this.field4100 != null) {
            this.field4100.method719((byte) -87);
        }
        if (this.field4083 != null) {
            this.field4083.method719((byte) -93);
        }
        if (this.field4086 != null) {
            this.field4086.method719((byte) -115);
        }
        if (this.field4044 != null) {
            this.field4044.method719((byte) -111);
        }
        if (this.field4077 != null) {
            this.field4077.method2909(true);
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    private final void method1894(int arg0) {
        if ((arg0 & this.field4051) == 0) {
            if (this.field4086 != null) {
                this.field4086.field1424 = false;
            }
        } else if (this.field4044 != null) {
            this.field4044.field1424 = false;
        }
        field4137++;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(B)Z")
    private final boolean method1895(byte arg0) {
        field4062++;
        boolean var2 = !this.field4086.field1424;
        boolean var3 = (this.field4051 & 0x37) != 0 && !this.field4044.field1424;
        boolean var4 = !this.field4100.field1424;
        boolean var5 = !this.field4083.field1424;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        } else if (arg0 <= 96) {
            return true;
        } else {
            boolean var6 = true;
            if (var4) {
                if (this.field4100.field1425 == null) {
                    this.field4100.field1425 = this.field4059.method1283(this.field4045, -1);
                }
                class155 var7 = this.field4100.field1425;
                var7.method353(this.field4141 * 12, 12, (byte) 104);
                Buffer var8 = var7.method354(true, true);
                if (var8 == null) {
                    var6 = false;
                } else {
                    this.field4059.field4468.copyPositions(this.field4126, this.field4097, this.field4139, this.field4120, 0, 12, this.field4141, var8.getAddress());
                    if (var7.method357(-28830)) {
                        this.field4100.field1430 = var7;
                        this.field4100.field1424 = true;
                    } else {
                        var6 = false;
                    }
                }
            }
            if (var2) {
                if (this.field4086.field1425 == null) {
                    this.field4086.field1425 = this.field4059.method1283(this.field4045, -1);
                }
                class155 var9 = this.field4086.field1425;
                var9.method353(this.field4141 * 4, 4, (byte) 114);
                Buffer var10 = var9.method354(true, true);
                if (var10 == null) {
                    var6 = false;
                } else {
                    if ((this.field4051 & 0x37) == 0) {
                        short[] var11;
                        byte[] var12;
                        short[] var13;
                        short[] var14;
                        if (this.field4127 == null) {
                            var13 = this.field4111;
                            var12 = this.field4146;
                            var14 = this.field4063;
                            var11 = this.field4130;
                        } else {
                            var11 = this.field4127.field1485;
                            var12 = this.field4127.field1487;
                            var13 = this.field4127.field1490;
                            var14 = this.field4127.field1486;
                        }
                        this.field4059.field4468.copyLighting(this.field4080, this.field4161, this.field4095, var14, var13, var11, var12, this.field4038, this.field4055, this.field4129, 0, 4, this.field4141, var10.getAddress());
                    } else {
                        this.field4059.field4468.copyColours(this.field4080, this.field4161, this.field4095, this.field4038, this.field4129, 0, 4, this.field4141, var10.getAddress());
                    }
                    if (var9.method357(-28830)) {
                        this.field4086.field1430 = var9;
                        this.field4086.field1424 = true;
                    } else {
                        var6 = false;
                    }
                }
            }
            if (var3) {
                if (this.field4044.field1425 == null) {
                    this.field4044.field1425 = this.field4059.method1283(this.field4045, -1);
                }
                class155 var15 = this.field4044.field1425;
                var15.method353(this.field4141 * 12, 12, (byte) -101);
                Buffer var16 = var15.method354(true, true);
                if (var16 == null) {
                    var6 = false;
                } else {
                    short[] var17;
                    short[] var18;
                    byte[] var19;
                    short[] var20;
                    if (this.field4127 == null) {
                        var19 = this.field4146;
                        var20 = this.field4130;
                        var17 = this.field4111;
                        var18 = this.field4063;
                    } else {
                        var17 = this.field4127.field1490;
                        var18 = this.field4127.field1486;
                        var19 = this.field4127.field1487;
                        var20 = this.field4127.field1485;
                    }
                    this.field4059.field4468.copyNormals(var18, var17, var20, var19, 3.0F / (float) this.field4055, 3.0F / (float) (this.field4055 / 2 + this.field4055), 0, 12, this.field4141, var16.getAddress());
                    if (var15.method357(-28830)) {
                        this.field4044.field1424 = true;
                        this.field4044.field1430 = var15;
                    } else {
                        var6 = false;
                    }
                }
            }
            if (var5) {
                if (this.field4083.field1425 == null) {
                    this.field4083.field1425 = this.field4059.method1283(this.field4045, -1);
                }
                class155 var21 = this.field4083.field1425;
                var21.method353(this.field4141 * 8, 8, (byte) 117);
                Buffer var22 = var21.method354(true, true);
                if (var22 == null) {
                    var6 = false;
                } else {
                    this.field4059.field4468.copyTexCoords(this.field4128, this.field4076, 0, 8, this.field4141, var22.getAddress());
                    if (var21.method357(-28830)) {
                        this.field4083.field1424 = true;
                        this.field4083.field1430 = var21;
                    } else {
                        var6 = false;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method1896(int arg0, int arg1, class490 arg2, boolean arg3, int arg4) {
        field4103++;
        return this.method1860(arg1, arg2, arg0, -1, arg3, arg4);
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "()[Lqr;")
    public final class667[] method1897() {
        field4109++;
        return this.field4078;
    }

    @OriginalMember(owner = "client!d", name = "L", descriptor = "()V")
    public final void method1898() {
        for (int var1 = 0; var1 < this.field4089; var1++) {
            this.field4126[var1] = this.field4126[var1] + 7 >> 4;
            this.field4097[var1] = this.field4097[var1] + 7 >> 4;
            this.field4139[var1] = this.field4139[var1] + 7 >> 4;
        }
        field4043++;
        this.method1889(-74);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "za", descriptor = "()I")
    public final int method1899() {
        field4123++;
        if (!this.field4105) {
            this.method1890(0);
        }
        return this.field4054;
    }

    @OriginalMember(owner = "client!d", name = "WA", descriptor = "(IIII)V")
    public final void method1900(int arg0, int arg1, int arg2, int arg3) {
        field4159++;
        if (arg0 == 0) {
            class332.field4172 = 0;
            int var5 = 0;
            class421.field5607 = 0;
            class495.field7169 = 0;
            for (int var6 = 0; var6 < this.field4075; var6++) {
                class495.field7169 += this.field4126[var6];
                class421.field5607 += this.field4097[var6];
                var5++;
                class332.field4172 += this.field4139[var6];
            }
            if (var5 > 0) {
                class495.field7169 = class495.field7169 / var5 + arg1;
                class332.field4172 = class332.field4172 / var5 + arg3;
                class421.field5607 = class421.field5607 / var5 + arg2;
            } else {
                class421.field5607 = arg2;
                class495.field7169 = arg1;
                class332.field4172 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field4075; var7++) {
                this.field4126[var7] += arg1;
                this.field4097[var7] += arg2;
                this.field4139[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field4075; var8++) {
                this.field4126[var8] -= class495.field7169;
                this.field4097[var8] -= class421.field5607;
                this.field4139[var8] -= class332.field4172;
                if (arg3 != 0) {
                    int var9 = class435.field6134[arg3];
                    int var10 = class435.field6135[arg3];
                    int var11 = this.field4126[var8] * var10 + this.field4097[var8] * var9 + 16383 >> 14;
                    this.field4097[var8] = this.field4097[var8] * var10 + 16383 - (this.field4126[var8] * var9) >> 14;
                    this.field4126[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class435.field6134[arg1];
                    int var13 = class435.field6135[arg1];
                    int var14 = this.field4097[var8] * var13 + 16383 - (this.field4139[var8] * var12) >> 14;
                    this.field4139[var8] = this.field4139[var8] * var13 + this.field4097[var8] * var12 + 16383 >> 14;
                    this.field4097[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class435.field6134[arg2];
                    int var16 = class435.field6135[arg2];
                    int var17 = this.field4139[var8] * var15 + this.field4126[var8] * var16 + 16383 >> 14;
                    this.field4139[var8] = this.field4139[var8] * var16 - (this.field4126[var8] * var15 - 16383) >> 14;
                    this.field4126[var8] = var17;
                }
                this.field4126[var8] += class495.field7169;
                this.field4097[var8] += class421.field5607;
                this.field4139[var8] += class332.field4172;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field4075; var18++) {
                this.field4126[var18] -= class495.field7169;
                this.field4097[var18] -= class421.field5607;
                this.field4139[var18] -= class332.field4172;
                this.field4126[var18] = this.field4126[var18] * arg1 / 128;
                this.field4097[var18] = this.field4097[var18] * arg2 / 128;
                this.field4139[var18] = this.field4139[var18] * arg3 / 128;
                this.field4126[var18] += class495.field7169;
                this.field4097[var18] += class421.field5607;
                this.field4139[var18] += class332.field4172;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field4116; var19++) {
                int var23 = (this.field4161[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field4161[var19] = (byte) var23;
            }
            if (this.field4039 != null) {
                for (int var20 = 0; var20 < this.field4145; var20++) {
                    class139 var21 = this.field4039[var20];
                    class106 var22 = this.field4040[var20];
                    var22.field1148 = 255 - (this.field4161[var21.field1536] & 0xFF) << 24 | var22.field1148 & 0xFFFFFF;
                }
            }
            this.method1905(true);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field4116; var24++) {
                int var28 = this.field4080[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
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
                this.field4080[var24] = (short) class422.method2436(class422.method2436(var31 << 10, var33 << 7), var34);
            }
            if (this.field4039 != null) {
                for (int var25 = 0; var25 < this.field4145; var25++) {
                    class139 var26 = this.field4039[var25];
                    class106 var27 = this.field4040[var25];
                    var27.field1148 = class194.field2239[this.field4080[var26.field1536] & 0xFFFF] & 0xFFFFFF | var27.field1148 & 0xFF000000;
                }
            }
            this.method1905(true);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field4145; var35++) {
                class106 var36 = this.field4040[var35];
                var36.field1137 += arg1;
                var36.field1150 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field4145; var37++) {
                class106 var38 = this.field4040[var37];
                var38.field1140 = var38.field1140 * arg2 >> 7;
                var38.field1147 = var38.field1147 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field4145; var39++) {
                class106 var40 = this.field4040[var39];
                var40.field1142 = var40.field1142 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILd;ZZLd;)Lda;")
    private final class473 method1901(int arg0, int arg1, class330 arg2, boolean arg3, boolean arg4, class330 arg5) {
        arg2.field4055 = this.field4055;
        arg2.field4051 = this.field4051;
        arg2.field4091 = this.field4091;
        arg2.field4116 = this.field4116;
        field4072++;
        if (arg0 < 21) {
            return null;
        }
        arg2.field4145 = this.field4145;
        arg2.field4162 = arg1;
        arg2.field4075 = this.field4075;
        arg2.field4089 = this.field4089;
        arg2.field4141 = this.field4141;
        arg2.field4038 = this.field4038;
        if ((arg1 & 0x100) == 0) {
            arg2.field4049 = this.field4049;
        } else {
            arg2.field4049 = true;
        }
        boolean var7 = class372.method2164(arg1, this.field4051, 0);
        boolean var8 = class39.method200(arg1, (byte) -74, this.field4051);
        boolean var9 = class390.method2221(arg1, (byte) 101, this.field4051);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg2.field4126 = this.field4126;
            } else if (arg5.field4126 == null || arg5.field4126.length < this.field4089) {
                arg2.field4126 = arg5.field4126 = new int[this.field4089];
            } else {
                arg2.field4126 = arg5.field4126;
            }
            if (!var8) {
                arg2.field4097 = this.field4097;
            } else if (arg5.field4097 == null || this.field4089 > arg5.field4097.length) {
                arg2.field4097 = arg5.field4097 = new int[this.field4089];
            } else {
                arg2.field4097 = arg5.field4097;
            }
            if (!var9) {
                arg2.field4139 = this.field4139;
            } else if (arg5.field4139 == null || arg5.field4139.length < this.field4089) {
                arg2.field4139 = arg5.field4139 = new int[this.field4089];
            } else {
                arg2.field4139 = arg5.field4139;
            }
            for (int var11 = 0; var11 < this.field4089; var11++) {
                if (var7) {
                    arg2.field4126[var11] = this.field4126[var11];
                }
                if (var8) {
                    arg2.field4097[var11] = this.field4097[var11];
                }
                if (var9) {
                    arg2.field4139[var11] = this.field4139[var11];
                }
            }
        } else {
            arg2.field4126 = this.field4126;
            arg2.field4139 = this.field4139;
            arg2.field4097 = this.field4097;
        }
        if (class424.method2442(this.field4051, (byte) 111, arg1)) {
            arg2.field4100 = arg5.field4100;
            arg2.field4100.field1430 = this.field4100.field1430;
            arg2.field4100.field1424 = this.field4100.field1424;
            arg2.field4100.field1421 = true;
        } else if (class85.method442(arg1, this.field4051, (byte) 15)) {
            arg2.field4100 = this.field4100;
        } else {
            arg2.field4100 = null;
        }
        if (class329.method1850(this.field4051, true, arg1)) {
            if (arg5.field4080 == null || this.field4116 > arg5.field4080.length) {
                arg2.field4080 = arg5.field4080 = new short[this.field4116];
            } else {
                arg2.field4080 = arg5.field4080;
            }
            for (int var12 = 0; var12 < this.field4116; var12++) {
                arg2.field4080[var12] = this.field4080[var12];
            }
        } else {
            arg2.field4080 = this.field4080;
        }
        if (class595.method3345(true, this.field4051, arg1)) {
            if (arg5.field4161 == null || arg5.field4161.length < this.field4116) {
                arg2.field4161 = arg5.field4161 = new byte[this.field4116];
            } else {
                arg2.field4161 = arg5.field4161;
            }
            for (int var13 = 0; var13 < this.field4116; var13++) {
                arg2.field4161[var13] = this.field4161[var13];
            }
        } else {
            arg2.field4161 = this.field4161;
        }
        if (class154.method835(arg1, this.field4051, 55)) {
            arg2.field4086 = arg5.field4086;
            arg2.field4086.field1424 = this.field4086.field1424;
            arg2.field4086.field1421 = true;
            arg2.field4086.field1430 = this.field4086.field1430;
        } else if (class210.method1252(arg1, 0, this.field4051)) {
            arg2.field4086 = this.field4086;
        } else {
            arg2.field4086 = null;
        }
        if (class575.method3253(arg1, this.field4051, (byte) -110)) {
            if (arg5.field4063 == null || this.field4141 > arg5.field4063.length) {
                int var14 = this.field4141;
                arg2.field4063 = arg5.field4063 = new short[var14];
                arg2.field4130 = arg5.field4130 = new short[var14];
                arg2.field4111 = arg5.field4111 = new short[var14];
            } else {
                arg2.field4130 = arg5.field4130;
                arg2.field4063 = arg5.field4063;
                arg2.field4111 = arg5.field4111;
            }
            if (this.field4127 == null) {
                arg2.field4127 = null;
                for (int var18 = 0; var18 < this.field4141; var18++) {
                    arg2.field4063[var18] = this.field4063[var18];
                    arg2.field4111[var18] = this.field4111[var18];
                    arg2.field4130[var18] = this.field4130[var18];
                }
            } else {
                if (arg5.field4127 == null) {
                    arg5.field4127 = new class133();
                }
                class133 var15 = arg2.field4127 = arg5.field4127;
                if (var15.field1486 == null || var15.field1486.length < this.field4141) {
                    int var16 = this.field4141;
                    var15.field1490 = new short[var16];
                    var15.field1486 = new short[var16];
                    var15.field1485 = new short[var16];
                    var15.field1487 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field4141; var17++) {
                    arg2.field4063[var17] = this.field4063[var17];
                    arg2.field4111[var17] = this.field4111[var17];
                    arg2.field4130[var17] = this.field4130[var17];
                    var15.field1486[var17] = this.field4127.field1486[var17];
                    var15.field1490[var17] = this.field4127.field1490[var17];
                    var15.field1485[var17] = this.field4127.field1485[var17];
                    var15.field1487[var17] = this.field4127.field1487[var17];
                }
            }
            arg2.field4146 = this.field4146;
        } else {
            arg2.field4127 = this.field4127;
            arg2.field4146 = this.field4146;
            arg2.field4130 = this.field4130;
            arg2.field4111 = this.field4111;
            arg2.field4063 = this.field4063;
        }
        if (class674.method3721(1457751848, this.field4051, arg1)) {
            arg2.field4044 = arg5.field4044;
            arg2.field4044.field1421 = true;
            arg2.field4044.field1430 = this.field4044.field1430;
            arg2.field4044.field1424 = this.field4044.field1424;
        } else if (class490.method2841(this.field4051, arg1, 105)) {
            arg2.field4044 = this.field4044;
        } else {
            arg2.field4044 = null;
        }
        if (class458.method2628(true, this.field4051, arg1)) {
            if (arg5.field4128 == null || arg5.field4128.length < this.field4116) {
                int var19 = this.field4141;
                arg2.field4076 = arg5.field4076 = new float[var19];
                arg2.field4128 = arg5.field4128 = new float[var19];
            } else {
                arg2.field4076 = arg5.field4076;
                arg2.field4128 = arg5.field4128;
            }
            for (int var20 = 0; var20 < this.field4141; var20++) {
                arg2.field4128[var20] = this.field4128[var20];
                arg2.field4076[var20] = this.field4076[var20];
            }
        } else {
            arg2.field4128 = this.field4128;
            arg2.field4076 = this.field4076;
        }
        if (class615.method3420(this.field4051, arg1, 5225)) {
            arg2.field4083 = arg5.field4083;
            arg2.field4083.field1430 = this.field4083.field1430;
            arg2.field4083.field1424 = this.field4083.field1424;
            arg2.field4083.field1421 = true;
        } else if (class63.method340(this.field4051, arg1, -25221)) {
            arg2.field4083 = this.field4083;
        } else {
            arg2.field4083 = null;
        }
        if (class186.method1131((byte) 34, arg1, this.field4051)) {
            if (arg5.field4082 == null || arg5.field4082.length < this.field4116) {
                int var21 = this.field4116;
                arg2.field4064 = arg5.field4064 = new short[var21];
                arg2.field4082 = arg5.field4082 = new short[var21];
                arg2.field4152 = arg5.field4152 = new short[var21];
            } else {
                arg2.field4152 = arg5.field4152;
                arg2.field4064 = arg5.field4064;
                arg2.field4082 = arg5.field4082;
            }
            for (int var22 = 0; var22 < this.field4116; var22++) {
                arg2.field4082[var22] = this.field4082[var22];
                arg2.field4152[var22] = this.field4152[var22];
                arg2.field4064[var22] = this.field4064[var22];
            }
        } else {
            arg2.field4082 = this.field4082;
            arg2.field4152 = this.field4152;
            arg2.field4064 = this.field4064;
        }
        if (class148.method814(arg1, (byte) 111, this.field4051)) {
            arg2.field4077 = arg5.field4077;
            arg2.field4077.field7306 = true;
            arg2.field4077.field7308 = this.field4077.field7308;
            arg2.field4077.field7311 = this.field4077.field7311;
        } else if (class48.method256(2048, this.field4051, arg1)) {
            arg2.field4077 = this.field4077;
        } else {
            arg2.field4077 = null;
        }
        if (class691.method3813(arg1, 123, this.field4051)) {
            if (arg5.field4095 == null || this.field4116 > arg5.field4095.length) {
                int var23 = this.field4116;
                arg2.field4095 = arg5.field4095 = new short[var23];
            } else {
                arg2.field4095 = arg5.field4095;
            }
            for (int var24 = 0; var24 < this.field4116; var24++) {
                arg2.field4095[var24] = this.field4095[var24];
            }
        } else {
            arg2.field4095 = this.field4095;
        }
        if (!class178.method1085(-1252, this.field4051, arg1)) {
            arg2.field4040 = this.field4040;
        } else if (arg5.field4040 == null || this.field4145 > arg5.field4040.length) {
            int var26 = this.field4145;
            arg2.field4040 = arg5.field4040 = new class106[var26];
            for (int var27 = 0; var27 < this.field4145; var27++) {
                arg2.field4040[var27] = this.field4040[var27].method574(128);
            }
        } else {
            arg2.field4040 = arg5.field4040;
            for (int var25 = 0; var25 < this.field4145; var25++) {
                arg2.field4040[var25].method578(this.field4040[var25], -5);
            }
        }
        arg2.field4078 = this.field4078;
        arg2.field4129 = this.field4129;
        arg2.field4056 = this.field4056;
        arg2.field4058 = this.field4058;
        arg2.field4114 = this.field4114;
        arg2.field4151 = this.field4151;
        arg2.field4121 = this.field4121;
        arg2.field4085 = this.field4085;
        arg2.field4158 = this.field4158;
        arg2.field4112 = this.field4112;
        if (this.field4105) {
            arg2.field4069 = this.field4069;
            arg2.field4073 = this.field4073;
            arg2.field4154 = this.field4154;
            arg2.field4155 = this.field4155;
            arg2.field4153 = this.field4153;
            arg2.field4105 = true;
            arg2.field4054 = this.field4054;
            arg2.field4143 = this.field4143;
            arg2.field4119 = this.field4119;
        } else {
            arg2.field4105 = false;
        }
        arg2.field4131 = this.field4131;
        arg2.field4140 = this.field4140;
        arg2.field4079 = this.field4079;
        arg2.field4120 = this.field4120;
        arg2.field4039 = this.field4039;
        return arg2;
    }

    @OriginalMember(owner = "client!d", name = "W", descriptor = "(I)V")
    public final void method1902(int arg0) {
        field4087++;
        int var2 = class435.field6134[arg0];
        int var3 = class435.field6135[arg0];
        for (int var4 = 0; var4 < this.field4075; var4++) {
            int var5 = this.field4097[var4] * var2 + (this.field4126[var4] * var3) >> 14;
            this.field4097[var4] = this.field4097[var4] * var3 - (this.field4126[var4] * var2) >> 14;
            this.field4126[var4] = var5;
        }
        this.method1889(-121);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "F", descriptor = "()Z")
    public final boolean method1903() {
        field4092++;
        if (this.field4085 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field4089; var1++) {
            this.field4126[var1] <<= 0x4;
            this.field4097[var1] <<= 0x4;
            this.field4139[var1] <<= 0x4;
        }
        class421.field5607 = 0;
        class495.field7169 = 0;
        class332.field4172 = 0;
        return true;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
    public final void method1904() {
        field4115++;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
    private final void method1905(boolean arg0) {
        if (!arg0) {
            this.field4059 = null;
        }
        field4068++;
        if (this.field4086 != null) {
            this.field4086.field1424 = false;
        }
    }

    @OriginalMember(owner = "client!d", name = "DA", descriptor = "(SS)V")
    public final void method1906(short arg0, short arg1) {
        field4148++;
        class524 var3 = this.field4059.field8050;
        for (int var4 = 0; var4 < this.field4116; var4++) {
            if (this.field4095[var4] == arg0) {
                this.field4095[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class295 var7 = var3.method140(arg0 & 0xFFFF, 862);
            var5 = var7.field3671;
            var6 = var7.field3667;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class295 var10 = var3.method140(arg1 & 0xFFFF, 862);
            var9 = var10.field3667;
            var8 = var10.field3671;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field4039 != null) {
            for (int var11 = 0; var11 < this.field4145; var11++) {
                class139 var12 = this.field4039[var11];
                class106 var13 = this.field4040[var11];
                var13.field1148 = var13.field1148 & 0xFF000000 | class194.field2239[this.field4080[var12.field1536] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method1905(true);
    }

    @OriginalMember(owner = "client!d", name = "SA", descriptor = "(I)V")
    public final void method1907(int arg0) {
        field4133++;
        if (this.field4100 != null) {
            this.field4100.field1421 = class424.method2442(this.field4051, (byte) 111, arg0);
        }
        if (this.field4083 != null) {
            this.field4083.field1421 = class615.method3420(this.field4051, arg0, 5225);
        }
        if (this.field4086 != null) {
            this.field4086.field1421 = class154.method835(arg0, this.field4051, 55);
        }
        if (this.field4044 != null) {
            this.field4044.field1421 = class674.method3721(1457751848, this.field4051, arg0);
        }
        this.field4162 = arg0;
        this.field4110 = true;
        if (this.field4127 != null && (this.field4162 & 0x10000) == 0) {
            this.field4063 = this.field4127.field1486;
            this.field4146 = this.field4127.field1487;
            this.field4130 = this.field4127.field1485;
            this.field4111 = this.field4127.field1490;
            this.field4127 = null;
        }
        this.method1881((byte) -128);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(CI)Z")
    public static final boolean method1908(char arg0, int arg1) {
        field4048++;
        if (arg1 != 255) {
            field4163 = 97;
        }
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIILef;IIJFIF)S")
    private final short method1909(byte arg0, int arg1, int arg2, int arg3, class581 arg4, int arg5, int arg6, long arg7, float arg8, int arg9, float arg10) {
        if (arg0 < 110) {
            return 5;
        }
        field4149++;
        int var13 = this.field4079[arg9];
        int var14 = this.field4079[arg9 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field4121[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class475.field6848[var16] == arg7) {
                return (short) (var17 - 1);
            }
        }
        this.field4121[var15] = (short) (this.field4141 + 1);
        class475.field6848[var15] = arg7;
        this.field4129[this.field4141] = (short) arg2;
        this.field4120[this.field4141] = (short) arg9;
        this.field4063[this.field4141] = (short) arg3;
        this.field4111[this.field4141] = (short) arg6;
        this.field4130[this.field4141] = (short) arg1;
        this.field4146[this.field4141] = (byte) arg5;
        this.field4128[this.field4141] = arg10;
        this.field4076[this.field4141] = arg8;
        return (short) (this.field4141++);
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()[Low;")
    public final class93[] method1910() {
        field4135++;
        return this.field4158;
    }

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method1911(int arg0, int arg1, class274 arg2, class274 arg3, int arg4, int arg5, int arg6) {
        if (!this.field4105) {
            this.method1890(0);
        }
        field4060++;
        int var8 = this.field4143 + arg4;
        int var9 = this.field4153 + arg4;
        int var10 = this.field4119 + arg6;
        int var11 = this.field4054 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field3424 + var9 >> arg2.field3430 >= arg2.field3428 || var10 < 0 || arg2.field3424 + var11 >> arg2.field3430 >= arg2.field3426) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field3428 <= var9 + arg3.field3424 >> arg3.field3430 || var10 < 0 || (arg3.field3424 + var11 >> arg3.field3430) >= arg3.field3426) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3430;
            int var13 = arg2.field3424 + var9 - 1 >> arg2.field3430;
            int var14 = var10 >> arg2.field3430;
            int var15 = arg2.field3424 + var11 - 1 >> arg2.field3430;
            if (arg2.method1608(var14, 840, var12) == arg5 && arg5 == arg2.method1608(var14, 840, var13) && arg2.method1608(var15, 840, var12) == arg5 && arg2.method1608(var15, 840, var13) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field4075; var16++) {
                this.field4097[var16] = this.field4097[var16] + arg2.method1610(this.field4126[var16] + arg4, 110, this.field4139[var16] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            int var17 = this.field4073;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field4075; var18++) {
                int var19 = (this.field4097[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field4097[var18] += (arg2.method1610(this.field4126[var18] + arg4, 116, this.field4139[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF6B) >> 8) * 4;
            int var22 = (arg1 >> 16 & 0xFF) << 6;
            int var23 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var20 >> 1) < 0 || ((var20 >> 1) + arg4 + arg2.field3424) >= (arg2.field3428 << arg2.field3430) || arg6 - (var21 >> 1) < 0 || (arg2.field3426 << arg2.field3430) <= (arg6 + (var21 >> 1) + arg2.field3424)) {
                return;
            }
            this.method2724(var22, var20, 86, arg4, var21, var23, arg5, arg2, arg6);
        } else if (arg0 == 4) {
            int var24 = this.field4069 - this.field4073;
            for (int var25 = 0; var25 < this.field4075; var25++) {
                this.field4097[var25] = this.field4097[var25] + var24 + arg3.method1610(this.field4126[var25] + arg4, 88, this.field4139[var25] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var26 = this.field4069 - this.field4073;
            for (int var27 = 0; var27 < this.field4075; var27++) {
                int var28 = this.field4126[var27] + arg4;
                int var29 = this.field4139[var27] + arg6;
                int var30 = arg2.method1610(var28, 118, var29);
                int var31 = arg3.method1610(var28, 120, var29);
                int var32 = var30 - arg1 - var31;
                this.field4097[var27] = ((this.field4097[var27] << 8) / var26 * var32 >> 8) + var30 - arg5;
            }
        }
        this.method1889(-56);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "KA", descriptor = "()I")
    public final int method1912() {
        field4144++;
        if (!this.field4105) {
            this.method1890(0);
        }
        return this.field4143;
    }

    @OriginalMember(owner = "client!d", name = "LA", descriptor = "()Z")
    public final boolean method1913() {
        field4065++;
        return this.field4049;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lq;Lufa;I)V")
    public final void method1914(class490 arg0, class374 arg1, int arg2) {
        field4052++;
        if (this.field4141 == 0) {
            return;
        }
        class537 var4 = this.field4059.field4511;
        class537 var5 = (class537) arg0;
        if (!this.field4105) {
            this.method1890(0);
        }
        class170.field1899 = var4.field7533 * var5.field7557 + var4.field7557 * var5.field7529 + var4.field7532 * var5.field7527;
        class408.field5442 = var4.field7533 * var5.field7514 + var4.field7557 * var5.field7553 + var4.field7532 * var5.field7545 + var4.field7514;
        float var6 = (float) this.field4073 * class170.field1899 + class408.field5442;
        float var7 = (float) this.field4069 * class170.field1899 + class408.field5442;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field4154 + var6;
            var9 = (float) (-this.field4154) + var7;
        } else {
            var9 = var6 - (float) this.field4154;
            var8 = (float) this.field4154 + var7;
        }
        if ((this.field4059.field4590 <= var9) || ((float) this.field4059.field4533 >= var8)) {
            return;
        }
        class566.field8073 = var4.field7541 * var5.field7514 + var4.field7527 * var5.field7553 + var4.field7520 * var5.field7545 + var4.field7545;
        class669.field9326 = var4.field7541 * var5.field7557 + var4.field7527 * var5.field7529 + var4.field7520 * var5.field7527;
        float var10 = (float) this.field4073 * class669.field9326 + class566.field8073;
        float var11 = (float) this.field4069 * class669.field9326 + class566.field8073;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field4154 + var10) * (float) this.field4059.field4567;
            var13 = (var11 - (float) this.field4154) * (float) this.field4059.field4567;
        } else {
            var13 = (var10 - (float) this.field4154) * (float) this.field4059.field4567;
            var12 = ((float) this.field4154 + var11) * (float) this.field4059.field4567;
        }
        if ((this.field4059.field4534 <= var13 / var8) || (this.field4059.field4528 >= var12 / var8)) {
            return;
        }
        class227.field2815 = var4.field7546 * var5.field7514 + var4.field7537 * var5.field7545 + var4.field7529 * var5.field7553 + var4.field7553;
        class571.field8108 = var4.field7546 * var5.field7557 + var4.field7537 * var5.field7527 + var4.field7529 * var5.field7529;
        float var14 = (float) this.field4073 * class571.field8108 + class227.field2815;
        float var15 = (float) this.field4069 * class571.field8108 + class227.field2815;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field4154 + var14) * (float) this.field4059.field4614;
            var16 = (var15 - (float) this.field4154) * (float) this.field4059.field4614;
        } else {
            var16 = ((float) (-this.field4154) + var14) * (float) this.field4059.field4614;
            var17 = ((float) this.field4154 + var15) * (float) this.field4059.field4614;
        }
        if ((this.field4059.field4540 <= var16 / var8) || (var17 / var8 <= this.field4059.field4523)) {
            return;
        }
        if (arg1 != null || this.field4039 != null) {
            class260.field3259 = var4.field7533 * var5.field7532 + var4.field7557 * var5.field7537 + var4.field7532 * var5.field7520;
            class384.field5190 = var4.field7533 * var5.field7533 + var4.field7557 * var5.field7546 + var4.field7532 * var5.field7541;
            class108.field1167 = var4.field7546 * var5.field7533 + var4.field7537 * var5.field7541 + var4.field7529 * var5.field7546;
            class89.field888 = var4.field7546 * var5.field7532 + var4.field7537 * var5.field7520 + var4.field7529 * var5.field7537;
            class250.field3134 = var4.field7541 * var5.field7532 + var4.field7527 * var5.field7537 + var4.field7520 * var5.field7520;
            class435.field6142 = var4.field7541 * var5.field7533 + var4.field7527 * var5.field7546 + var4.field7520 * var5.field7541;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field4153 + this.field4143 >> 1;
            int var21 = this.field4119 + this.field4054 >> 1;
            int var22 = (int) ((float) var21 * class435.field6142 + (float) this.field4073 * class669.field9326 + (float) var20 * class250.field3134 + class566.field8073);
            int var23 = (int) ((float) var21 * class108.field1167 + (float) this.field4073 * class571.field8108 + (float) var20 * class89.field888 + class227.field2815);
            int var24 = (int) ((float) var21 * class384.field5190 + (float) this.field4073 * class170.field1899 + (float) var20 * class260.field3259 + class408.field5442);
            if (var24 >= this.field4059.field4533) {
                arg1.field5089 = this.field4059.field4567 * var22 / var24 + this.field4059.field4587;
                arg1.field5092 = this.field4059.field4614 * var23 / var24 + this.field4059.field4600;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class435.field6142 + (float) this.field4069 * class669.field9326 + (float) var20 * class250.field3134 + class566.field8073);
            int var26 = (int) ((float) var21 * class108.field1167 + (float) this.field4069 * class571.field8108 + (float) var20 * class89.field888 + class227.field2815);
            int var27 = (int) ((float) var21 * class384.field5190 + (float) this.field4069 * class170.field1899 + (float) var20 * class260.field3259 + class408.field5442);
            if (var27 < this.field4059.field4533) {
                var18 = true;
            } else {
                arg1.field5088 = this.field4059.field4587 + (this.field4059.field4567 * var25 / var27);
                arg1.field5090 = this.field4059.field4614 * var26 / var27 + this.field4059.field4600;
            }
            if (var18) {
                if (this.field4059.field4533 > var24 && var27 < this.field4059.field4533) {
                    var19 = false;
                } else if (var24 < this.field4059.field4533) {
                    int var28 = (var27 - this.field4059.field4533 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field5089 = this.field4059.field4567 * var29 / this.field4059.field4533 + this.field4059.field4587;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field5092 = this.field4059.field4600 + (this.field4059.field4614 * var30 / this.field4059.field4533);
                } else if (var27 < this.field4059.field4533) {
                    int var31 = (var24 - this.field4059.field4533 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field5089 = this.field4059.field4567 * var32 / this.field4059.field4533 + this.field4059.field4587;
                    arg1.field5092 = this.field4059.field4614 * var33 / this.field4059.field4533 + this.field4059.field4600;
                }
            }
            if (var19) {
                arg1.field5087 = true;
                if (var27 >= var24) {
                    arg1.field5091 = (this.field4154 + var25) * this.field4059.field4567 / var27 + this.field4059.field4587 - arg1.field5088;
                } else {
                    arg1.field5091 = (var22 + this.field4154) * this.field4059.field4567 / var24 + this.field4059.field4587 - arg1.field5089;
                }
            }
        }
        this.field4059.method2021(0);
        this.field4059.method2018(true, var5);
        this.method1892(false);
        this.method1863((byte) 115);
    }

    @OriginalMember(owner = "client!d", name = "oa", descriptor = "(III)V")
    public final void method1915(int arg0, int arg1, int arg2) {
        field4107++;
        for (int var4 = 0; var4 < this.field4075; var4++) {
            if (arg0 != 0) {
                this.field4126[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field4097[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field4139[var4] += arg2;
            }
        }
        this.method1889(-74);
        this.field4105 = false;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method1916(class473 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4118++;
        class330 var6 = (class330) arg0;
        if (this.field4116 == 0 || var6.field4116 == 0) {
            return;
        }
        int var7 = var6.field4075;
        int[] var8 = var6.field4126;
        int[] var9 = var6.field4097;
        int[] var10 = var6.field4139;
        short[] var11 = var6.field4063;
        short[] var12 = var6.field4111;
        short[] var13 = var6.field4130;
        byte[] var14 = var6.field4146;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field4127 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field4127.field1485;
            var16 = this.field4127.field1486;
            var17 = this.field4127.field1487;
            var18 = this.field4127.field1490;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field4127 == null) {
            var21 = null;
            var20 = null;
            var19 = null;
            var22 = null;
        } else {
            var19 = var6.field4127.field1487;
            var20 = var6.field4127.field1485;
            var21 = var6.field4127.field1490;
            var22 = var6.field4127.field1486;
        }
        int[] var23 = var6.field4079;
        short[] var24 = var6.field4121;
        if (!var6.field4105) {
            var6.method1890(0);
        }
        int var25 = var6.field4073;
        int var26 = var6.field4069;
        int var27 = var6.field4143;
        int var28 = var6.field4153;
        int var29 = var6.field4119;
        int var30 = var6.field4054;
        for (int var31 = 0; var31 < this.field4075; var31++) {
            int var32 = this.field4097[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field4126[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field4139[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field4079[var31];
                        int var37 = this.field4079[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field4121[var38] - 1;
                            if (var35 == -1 || this.field4146[var35] != 0) {
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
                                        if (var16 == null) {
                                            this.field4127 = new class133();
                                            var16 = this.field4127.field1486 = class510.method2915(this.field4063, 924);
                                            var18 = this.field4127.field1490 = class510.method2915(this.field4111, 924);
                                            var15 = this.field4127.field1485 = class510.method2915(this.field4130, 924);
                                            var17 = this.field4127.field1487 = class194.method1180((byte) -68, this.field4146);
                                        }
                                        if (var22 == null) {
                                            class133 var44 = var6.field4127 = new class133();
                                            var22 = var44.field1486 = class510.method2915(var11, 924);
                                            var21 = var44.field1490 = class510.method2915(var12, 924);
                                            var20 = var44.field1485 = class510.method2915(var13, 924);
                                            var19 = var44.field1487 = class194.method1180((byte) -116, var14);
                                        }
                                        short var45 = this.field4063[var35];
                                        short var46 = this.field4111[var35];
                                        short var47 = this.field4130[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field4146[var35];
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
                                        short var53 = var11[var42];
                                        int var54 = this.field4079[var31];
                                        int var55 = this.field4079[var31 + 1];
                                        short var56 = var12[var42];
                                        byte var57 = var14[var42];
                                        short var58 = var13[var42];
                                        for (int var59 = var54; var59 < var55; var59++) {
                                            int var60 = this.field4121[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var53;
                                                var18[var60] += var56;
                                                var15[var60] += var58;
                                                var17[var60] += var57;
                                            }
                                        }
                                        var6.method1894(55);
                                        this.method1894(55);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lmj;IIZZ)V")
    public class330(class344 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4075 = 0;
        this.field4110 = true;
        this.field4049 = false;
        this.field4105 = false;
        this.field4116 = 0;
        this.field4045 = false;
        this.field4141 = 0;
        this.field4089 = 0;
        this.field4091 = 0;
        this.field4051 = arg2;
        this.field4045 = arg4;
        this.field4162 = arg1;
        this.field4059 = arg0;
        if (arg3 || class85.method442(this.field4162, this.field4051, (byte) 15)) {
            this.field4100 = new class126(class424.method2442(this.field4051, (byte) 111, this.field4162));
        }
        if (arg3 || class63.method340(this.field4051, this.field4162, -25221)) {
            this.field4083 = new class126(class615.method3420(this.field4051, this.field4162, 5225));
        }
        if (arg3 || class210.method1252(this.field4162, 0, this.field4051)) {
            this.field4086 = new class126(class154.method835(this.field4162, this.field4051, 55));
        }
        if (arg3 || class490.method2841(this.field4051, this.field4162, 82)) {
            this.field4044 = new class126(class674.method3721(1457751848, this.field4051, this.field4162));
        }
        if (arg3 || class48.method256(2048, this.field4051, this.field4162)) {
            this.field4077 = new class509(class148.method814(this.field4162, (byte) 101, this.field4051));
        }
    }
}
