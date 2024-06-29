import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class240 extends class119 {

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Z")
    private boolean field4150 = false;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "B")
    public byte field4151 = 0;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public int field4140 = 0;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public int field4136 = 0;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "[I")
    public int[] field4163;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "[I")
    public int[] field4149;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "[I")
    public int[] field4144;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "[I")
    private int[] field4164;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "[I")
    public int[] field4139;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "[I")
    public int[] field4162;

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "[I")
    public int[] field4168;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[B")
    public byte[] field4132;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "[B")
    public byte[] field4161;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "[B")
    public byte[] field4143;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "[S")
    public short[] field4135;

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "[S")
    public short[] field4160;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "[B")
    public byte[] field4157;

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "[I")
    private int[] field4169;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "[B")
    public byte[] field4159;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "[S")
    public short[] field4125;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[S")
    public short[] field4131;

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "[S")
    public short[] field4172;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "[S")
    private short[] field4133;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "[S")
    private short[] field4158;

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "[S")
    private short[] field4171;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "[B")
    private byte[] field4167;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "[B")
    private byte[] field4153;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "[B")
    private byte[] field4152;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[B")
    private byte[] field4148;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "[B")
    private byte[] field4165;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "[[I")
    public int[][] field4128;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[[I")
    public int[][] field4134;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "[Loj;")
    public class129[] field4142;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "[Lad;")
    public class146[] field4146;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[Loj;")
    public class129[] field4129;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "S")
    public short field4126;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "S")
    public short field4141;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "[I")
    private static int[] field4137 = new int[10000];

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "[I")
    private static int[] field4127 = class160.field2893;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "[I")
    private static int[] field4166 = new int[10000];

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    private static int field4154 = 0;

    @OriginalMember(owner = "client!ab", name = "ob", descriptor = "[I")
    private static int[] field4173 = class160.field2890;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "S")
    private short field4130;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "S")
    private short field4145;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "S")
    private short field4147;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "S")
    private short field4155;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "S")
    private short field4156;

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "S")
    private short field4170;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(SS)V")
    public final void method1636(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field4140; var3++) {
            if (this.field4135[var3] == arg0) {
                this.field4135[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[[I[[IIIIZZ)Lab;")
    public final class240 method1637(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1651();
        int var10 = this.field4155 + arg4;
        int var11 = this.field4170 + arg4;
        int var12 = this.field4145 + arg6;
        int var13 = this.field4147 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class240 var18;
        if (arg7) {
            var18 = new class240();
            var18.field4136 = this.field4136;
            var18.field4140 = this.field4140;
            var18.field4138 = this.field4138;
            var18.field4139 = this.field4139;
            var18.field4162 = this.field4162;
            var18.field4168 = this.field4168;
            var18.field4132 = this.field4132;
            var18.field4161 = this.field4161;
            var18.field4143 = this.field4143;
            var18.field4157 = this.field4157;
            var18.field4135 = this.field4135;
            var18.field4160 = this.field4160;
            var18.field4151 = this.field4151;
            var18.field4159 = this.field4159;
            var18.field4125 = this.field4125;
            var18.field4131 = this.field4131;
            var18.field4172 = this.field4172;
            var18.field4133 = this.field4133;
            var18.field4158 = this.field4158;
            var18.field4171 = this.field4171;
            var18.field4167 = this.field4167;
            var18.field4153 = this.field4153;
            var18.field4152 = this.field4152;
            var18.field4148 = this.field4148;
            var18.field4165 = this.field4165;
            var18.field4164 = this.field4164;
            var18.field4169 = this.field4169;
            var18.field4128 = this.field4128;
            var18.field4134 = this.field4134;
            var18.field4126 = this.field4126;
            var18.field4141 = this.field4141;
            var18.field4142 = this.field4142;
            var18.field4146 = this.field4146;
            var18.field4129 = this.field4129;
            if (arg0 == 3) {
                var18.field4163 = class239.method1635(-16152, this.field4163);
                var18.field4149 = class239.method1635(-16152, this.field4149);
                var18.field4144 = class239.method1635(-16152, this.field4144);
            } else {
                var18.field4163 = this.field4163;
                var18.field4149 = new int[var18.field4136];
                var18.field4144 = this.field4144;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field4136; var19++) {
                int var20 = this.field4163[var19] + arg4;
                int var21 = this.field4144[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field4149[var19] = this.field4149[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field4136; var29++) {
                int var30 = (this.field4149[var29] << 16) / this.field4156;
                if (var30 < arg1) {
                    int var31 = this.field4163[var29] + arg4;
                    int var32 = this.field4144[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field4149[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field4149[var29];
                } else {
                    var18.field4149[var29] = this.field4149[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1657(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field4130 - this.field4156;
            for (int var43 = 0; var43 < this.field4136; var43++) {
                int var44 = this.field4163[var43] + arg4;
                int var45 = this.field4144[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field4149[var43] = var52 + this.field4149[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field4130 - this.field4156;
            for (int var54 = 0; var54 < this.field4136; var54++) {
                int var55 = this.field4163[var54] + arg4;
                int var56 = this.field4144[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field4149[var54] = ((this.field4149[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1641();
        } else {
            this.field4150 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([B)V")
    private final void method1638(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class216 var4 = new class216(arg0);
        class216 var5 = new class216(arg0);
        class216 var6 = new class216(arg0);
        class216 var7 = new class216(arg0);
        class216 var8 = new class216(arg0);
        var4.field3728 = arg0.length - 18;
        int var9 = var4.method1487(99);
        int var10 = var4.method1487(84);
        int var11 = var4.method1446(5350);
        int var12 = var4.method1446(5350);
        int var13 = var4.method1446(5350);
        int var14 = var4.method1446(5350);
        int var15 = var4.method1446(5350);
        int var16 = var4.method1446(5350);
        int var17 = var4.method1487(73);
        int var18 = var4.method1487(10);
        int var19 = var4.method1487(60);
        int var20 = var4.method1487(4);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field4136 = var9;
        this.field4140 = var10;
        this.field4138 = var11;
        this.field4163 = new int[var9];
        this.field4149 = new int[var9];
        this.field4144 = new int[var9];
        this.field4139 = new int[var10];
        this.field4162 = new int[var10];
        this.field4168 = new int[var10];
        if (var11 > 0) {
            this.field4159 = new byte[var11];
            this.field4125 = new short[var11];
            this.field4131 = new short[var11];
            this.field4172 = new short[var11];
        }
        if (var16 == 1) {
            this.field4164 = new int[var9];
        }
        if (var12 == 1) {
            this.field4132 = new byte[var10];
            this.field4157 = new byte[var10];
            this.field4160 = new short[var10];
        }
        if (var13 == 255) {
            this.field4161 = new byte[var10];
        } else {
            this.field4151 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4143 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4169 = new int[var10];
        }
        this.field4135 = new short[var10];
        var4.field3728 = var21;
        var5.field3728 = var36;
        var6.field3728 = var38;
        var7.field3728 = var40;
        var8.field3728 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1446(5350);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1473(126);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1473(44);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1473(29);
            }
            this.field4163[var46] = var43 + var63;
            this.field4149[var46] = var44 + var64;
            this.field4144[var46] = var45 + var65;
            var43 = this.field4163[var46];
            var44 = this.field4149[var46];
            var45 = this.field4144[var46];
            if (var16 == 1) {
                this.field4164[var46] = var8.method1446(5350);
            }
        }
        var4.field3728 = var32;
        var5.field3728 = var28;
        var6.field3728 = var26;
        var7.field3728 = var30;
        var8.field3728 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field4135[var47] = (short) var4.method1487(11);
            if (var12 == 1) {
                int var61 = var5.method1446(5350);
                if ((var61 & 0x1) == 1) {
                    this.field4132[var47] = 1;
                    var2 = true;
                } else {
                    this.field4132[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field4157[var47] = (byte) (var61 >> 2);
                    this.field4160[var47] = this.field4135[var47];
                    this.field4135[var47] = 127;
                    if (this.field4160[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field4157[var47] = -1;
                    this.field4160[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field4161[var47] = var6.method1472(97);
            }
            if (var14 == 1) {
                this.field4143[var47] = var7.method1472(61);
            }
            if (var15 == 1) {
                this.field4169[var47] = var8.method1446(5350);
            }
        }
        var4.field3728 = var25;
        var5.field3728 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1446(5350);
            if (var57 == 1) {
                var48 = var4.method1473(64) + var51;
                var49 = var4.method1473(25) + var48;
                var50 = var4.method1473(38) + var49;
                var51 = var50;
                this.field4139[var52] = var48;
                this.field4162[var52] = var49;
                this.field4168[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1473(114) + var51;
                var51 = var50;
                this.field4139[var52] = var48;
                this.field4162[var52] = var49;
                this.field4168[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1473(61) + var51;
                var51 = var50;
                this.field4139[var52] = var48;
                this.field4162[var52] = var49;
                this.field4168[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1473(50) + var51;
                var51 = var50;
                this.field4139[var52] = var48;
                this.field4162[var52] = var60;
                this.field4168[var52] = var50;
            }
        }
        var4.field3728 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field4159[var53] = 0;
            this.field4125[var53] = (short) var4.method1487(60);
            this.field4131[var53] = (short) var4.method1487(91);
            this.field4172[var53] = (short) var4.method1487(110);
        }
        if (this.field4157 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field4157[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field4125[var56] & 0xFFFF) == this.field4139[var55] && (this.field4131[var56] & 0xFFFF) == this.field4162[var55] && (this.field4172[var56] & 0xFFFF) == this.field4168[var55]) {
                        this.field4157[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field4157 = null;
            }
        }
        if (!var3) {
            this.field4160 = null;
        }
        if (!var2) {
            this.field4132 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    private final void method1639(int arg0) {
        int var2 = field4127[arg0];
        int var3 = field4173[arg0];
        for (int var4 = 0; var4 < this.field4136; var4++) {
            int var5 = this.field4163[var4] * var3 + this.field4149[var4] * var2 >> 16;
            this.field4149[var4] = this.field4149[var4] * var3 - this.field4163[var4] * var2 >> 16;
            this.field4163[var4] = var5;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
    public final void method1640() {
        for (int var1 = 0; var1 < this.field4136; var1++) {
            this.field4163[var1] = -this.field4163[var1];
            this.field4144[var1] = -this.field4144[var1];
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
    private final void method1641() {
        this.field4142 = null;
        this.field4129 = null;
        this.field4146 = null;
        this.field4150 = false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIII)Lkk;")
    public final class58 method1642(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class58(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lab;I)I")
    private final int method1643(class240 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field4163[arg1];
        int var5 = arg0.field4149[arg1];
        int var6 = arg0.field4144[arg1];
        for (int var7 = 0; var7 < this.field4136; var7++) {
            if (this.field4163[var7] == var4 && this.field4149[var7] == var5 && this.field4144[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field4163[this.field4136] = var4;
            this.field4149[this.field4136] = var5;
            this.field4144[this.field4136] = var6;
            if (arg0.field4164 != null) {
                this.field4164[this.field4136] = arg0.field4164[arg1];
            }
            var3 = this.field4136++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V")
    public final void method1644() {
        int var10002;
        if (this.field4164 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field4136; var3++) {
                int var7 = this.field4164[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field4128 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field4128[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field4136) {
                int var6 = this.field4164[var5];
                this.field4128[var6][var1[var6]++] = var5++;
            }
            this.field4164 = null;
        }
        if (this.field4169 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field4140; var10++) {
            int var14 = this.field4169[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field4134 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field4134[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field4140) {
            int var13 = this.field4169[var12];
            this.field4134[var13][var8[var13]++] = var12++;
        }
        this.field4169 = null;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V")
    public final void method1645(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4136; var4++) {
            this.field4163[var4] += arg0;
            this.field4149[var4] += arg1;
            this.field4144[var4] += arg2;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "([B)V")
    private final void method1646(byte[] arg0) {
        class216 var2 = new class216(arg0);
        class216 var3 = new class216(arg0);
        class216 var4 = new class216(arg0);
        class216 var5 = new class216(arg0);
        class216 var6 = new class216(arg0);
        class216 var7 = new class216(arg0);
        class216 var8 = new class216(arg0);
        var2.field3728 = arg0.length - 23;
        int var9 = var2.method1487(87);
        int var10 = var2.method1487(113);
        int var11 = var2.method1446(5350);
        int var12 = var2.method1446(5350);
        int var13 = var2.method1446(5350);
        int var14 = var2.method1446(5350);
        int var15 = var2.method1446(5350);
        int var16 = var2.method1446(5350);
        int var17 = var2.method1446(5350);
        int var18 = var2.method1487(49);
        int var19 = var2.method1487(104);
        int var20 = var2.method1487(56);
        int var21 = var2.method1487(115);
        int var22 = var2.method1487(43);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field4159 = new byte[var11];
            var2.field3728 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field4159[var26] = var2.method1472(111);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field4136 = var9;
        this.field4140 = var10;
        this.field4138 = var11;
        this.field4163 = new int[var9];
        this.field4149 = new int[var9];
        this.field4144 = new int[var9];
        this.field4139 = new int[var10];
        this.field4162 = new int[var10];
        this.field4168 = new int[var10];
        if (var17 == 1) {
            this.field4164 = new int[var9];
        }
        if (var12 == 1) {
            this.field4132 = new byte[var10];
        }
        if (var13 == 255) {
            this.field4161 = new byte[var10];
        } else {
            this.field4151 = (byte) var13;
        }
        if (var14 == 1) {
            this.field4143 = new byte[var10];
        }
        if (var15 == 1) {
            this.field4169 = new int[var10];
        }
        if (var16 == 1) {
            this.field4160 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field4157 = new byte[var10];
        }
        this.field4135 = new short[var10];
        if (var11 > 0) {
            this.field4125 = new short[var11];
            this.field4131 = new short[var11];
            this.field4172 = new short[var11];
            if (var24 > 0) {
                this.field4133 = new short[var24];
                this.field4158 = new short[var24];
                this.field4171 = new short[var24];
                this.field4167 = new byte[var24];
                this.field4153 = new byte[var24];
                this.field4152 = new byte[var24];
            }
            if (var25 > 0) {
                this.field4148 = new byte[var25];
                this.field4165 = new byte[var25];
            }
        }
        var2.field3728 = var11;
        var3.field3728 = var44;
        var4.field3728 = var46;
        var5.field3728 = var48;
        var6.field3728 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1446(5350);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1473(58);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1473(31);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1473(109);
            }
            this.field4163[var66] = var63 + var80;
            this.field4149[var66] = var64 + var81;
            this.field4144[var66] = var65 + var82;
            var63 = this.field4163[var66];
            var64 = this.field4149[var66];
            var65 = this.field4144[var66];
            if (var17 == 1) {
                this.field4164[var66] = var6.method1446(5350);
            }
        }
        var2.field3728 = var42;
        var3.field3728 = var31;
        var4.field3728 = var34;
        var5.field3728 = var37;
        var6.field3728 = var35;
        var7.field3728 = var40;
        var8.field3728 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field4135[var67] = (short) var2.method1487(68);
            if (var12 == 1) {
                this.field4132[var67] = var3.method1472(86);
            }
            if (var13 == 255) {
                this.field4161[var67] = var4.method1472(63);
            }
            if (var14 == 1) {
                this.field4143[var67] = var5.method1472(62);
            }
            if (var15 == 1) {
                this.field4169[var67] = var6.method1446(5350);
            }
            if (var16 == 1) {
                this.field4160[var67] = (short) (var7.method1487(21) - 1);
            }
            if (this.field4157 != null) {
                if (this.field4160[var67] == -1) {
                    this.field4157[var67] = -1;
                } else {
                    this.field4157[var67] = (byte) (var8.method1446(5350) - 1);
                }
            }
        }
        var2.field3728 = var33;
        var3.field3728 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1446(5350);
            if (var75 == 1) {
                var68 = var2.method1473(33) + var71;
                var69 = var2.method1473(40) + var68;
                var70 = var2.method1473(111) + var69;
                var71 = var70;
                this.field4139[var72] = var68;
                this.field4162[var72] = var69;
                this.field4168[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1473(109) + var71;
                var71 = var70;
                this.field4139[var72] = var68;
                this.field4162[var72] = var69;
                this.field4168[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1473(54) + var71;
                var71 = var70;
                this.field4139[var72] = var68;
                this.field4162[var72] = var69;
                this.field4168[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1473(38) + var71;
                var71 = var70;
                this.field4139[var72] = var68;
                this.field4162[var72] = var78;
                this.field4168[var72] = var70;
            }
        }
        var2.field3728 = var50;
        var3.field3728 = var52;
        var4.field3728 = var54;
        var5.field3728 = var56;
        var6.field3728 = var58;
        var7.field3728 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field4159[var73] & 0xFF;
            if (var74 == 0) {
                this.field4125[var73] = (short) var2.method1487(14);
                this.field4131[var73] = (short) var2.method1487(100);
                this.field4172[var73] = (short) var2.method1487(109);
            }
            if (var74 == 1) {
                this.field4125[var73] = (short) var3.method1487(6);
                this.field4131[var73] = (short) var3.method1487(50);
                this.field4172[var73] = (short) var3.method1487(3);
                this.field4133[var73] = (short) var4.method1487(43);
                this.field4158[var73] = (short) var4.method1487(115);
                this.field4171[var73] = (short) var4.method1487(80);
                this.field4167[var73] = var5.method1472(123);
                this.field4153[var73] = var6.method1472(127);
                this.field4152[var73] = var7.method1472(105);
            }
            if (var74 == 2) {
                this.field4125[var73] = (short) var3.method1487(107);
                this.field4131[var73] = (short) var3.method1487(58);
                this.field4172[var73] = (short) var3.method1487(89);
                this.field4133[var73] = (short) var4.method1487(4);
                this.field4158[var73] = (short) var4.method1487(15);
                this.field4171[var73] = (short) var4.method1487(4);
                this.field4167[var73] = var5.method1472(68);
                this.field4153[var73] = var6.method1472(109);
                this.field4152[var73] = var7.method1472(84);
                this.field4148[var73] = var7.method1472(90);
                this.field4165[var73] = var7.method1472(92);
            }
            if (var74 == 3) {
                this.field4125[var73] = (short) var3.method1487(32);
                this.field4131[var73] = (short) var3.method1487(65);
                this.field4172[var73] = (short) var3.method1487(36);
                this.field4133[var73] = (short) var4.method1487(111);
                this.field4158[var73] = (short) var4.method1487(90);
                this.field4171[var73] = (short) var4.method1487(74);
                this.field4167[var73] = var5.method1472(70);
                this.field4153[var73] = var6.method1472(108);
                this.field4152[var73] = var7.method1472(78);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()Lab;")
    public final class240 method1647() {
        class240 var1 = new class240();
        if (this.field4132 != null) {
            var1.field4132 = new byte[this.field4140];
            for (int var2 = 0; var2 < this.field4140; var2++) {
                var1.field4132[var2] = this.field4132[var2];
            }
        }
        var1.field4136 = this.field4136;
        var1.field4140 = this.field4140;
        var1.field4138 = this.field4138;
        var1.field4163 = this.field4163;
        var1.field4149 = this.field4149;
        var1.field4144 = this.field4144;
        var1.field4139 = this.field4139;
        var1.field4162 = this.field4162;
        var1.field4168 = this.field4168;
        var1.field4161 = this.field4161;
        var1.field4143 = this.field4143;
        var1.field4157 = this.field4157;
        var1.field4135 = this.field4135;
        var1.field4160 = this.field4160;
        var1.field4151 = this.field4151;
        var1.field4159 = this.field4159;
        var1.field4125 = this.field4125;
        var1.field4131 = this.field4131;
        var1.field4172 = this.field4172;
        var1.field4133 = this.field4133;
        var1.field4158 = this.field4158;
        var1.field4171 = this.field4171;
        var1.field4167 = this.field4167;
        var1.field4153 = this.field4153;
        var1.field4152 = this.field4152;
        var1.field4148 = this.field4148;
        var1.field4165 = this.field4165;
        var1.field4164 = this.field4164;
        var1.field4169 = this.field4169;
        var1.field4128 = this.field4128;
        var1.field4134 = this.field4134;
        var1.field4142 = this.field4142;
        var1.field4146 = this.field4146;
        var1.field4126 = this.field4126;
        var1.field4141 = this.field4141;
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public final int method90() {
        if (!this.field4150) {
            this.method1651();
        }
        return this.field4156;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ltg;II)Lab;")
    public static final class240 method1648(class75 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method571(arg1, arg2, -64);
        return var3 == null ? null : new class240(var3);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(IIIII)Lna;")
    public final class17 method1649(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class58(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()V")
    public static void method1650() {
        field4166 = null;
        field4137 = null;
        field4127 = null;
        field4173 = null;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()V")
    private final void method1651() {
        if (this.field4150) {
            return;
        }
        this.field4150 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field4136; var7++) {
            int var8 = this.field4163[var7];
            int var9 = this.field4149[var7];
            int var10 = this.field4144[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field4155 = (short) var1;
        this.field4170 = (short) var4;
        this.field4156 = (short) var2;
        this.field4130 = (short) var5;
        this.field4145 = (short) var3;
        this.field4147 = (short) var6;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    private final void method1652(int arg0) {
        int var2 = field4127[arg0];
        int var3 = field4173[arg0];
        for (int var4 = 0; var4 < this.field4136; var4++) {
            int var5 = this.field4149[var4] * var3 - this.field4144[var4] * var2 >> 16;
            this.field4144[var4] = this.field4149[var4] * var2 + this.field4144[var4] * var3 >> 16;
            this.field4149[var4] = var5;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([[III)I")
    private static final int method1653(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "()V")
    public final void method1654() {
        for (int var1 = 0; var1 < this.field4136; var1++) {
            this.field4144[var1] = -this.field4144[var1];
        }
        for (int var2 = 0; var2 < this.field4140; var2++) {
            int var3 = this.field4139[var2];
            this.field4139[var2] = this.field4168[var2];
            this.field4168[var2] = var3;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "()V")
    public final void method1655() {
        this.field4164 = null;
        this.field4169 = null;
        this.field4128 = null;
        this.field4134 = null;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(III)V")
    public final void method1656(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4136; var4++) {
            this.field4163[var4] = this.field4163[var4] * arg0 / 128;
            this.field4149[var4] = this.field4149[var4] * arg1 / 128;
            this.field4144[var4] = this.field4144[var4] * arg2 / 128;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()Z")
    public final boolean method881() {
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([[IIIIII)V")
    private final void method1657(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1653(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1653(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1653(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1653(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1652(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1639(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1645(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public final void method1658(int arg0) {
        int var2 = field4127[arg0];
        int var3 = field4173[arg0];
        for (int var4 = 0; var4 < this.field4136; var4++) {
            int var5 = this.field4163[var4] * var3 + this.field4144[var4] * var2 >> 16;
            this.field4144[var4] = this.field4144[var4] * var3 - this.field4163[var4] * var2 >> 16;
            this.field4163[var4] = var5;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lsc;IIIZ)V")
    public final void method880(class119 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class240 var6 = (class240) arg0;
        var6.method1651();
        var6.method1664();
        field4154++;
        int var7 = 0;
        int[] var8 = var6.field4163;
        int var9 = var6.field4136;
        for (int var10 = 0; var10 < this.field4136; var10++) {
            class129 var13 = this.field4142[var10];
            if (var13.field2300 != 0) {
                int var14 = this.field4149[var10] - arg2;
                if (var14 >= var6.field4156 && var14 <= var6.field4130) {
                    int var15 = this.field4163[var10] - arg1;
                    if (var15 >= var6.field4155 && var15 <= var6.field4170) {
                        int var16 = this.field4144[var10] - arg3;
                        if (var16 >= var6.field4145 && var16 <= var6.field4147) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class129 var18 = var6.field4142[var17];
                                if (var8[var17] == var15 && var6.field4144[var17] == var16 && var6.field4149[var17] == var14 && var18.field2300 != 0) {
                                    if (this.field4129 == null) {
                                        this.field4129 = new class129[this.field4136];
                                    }
                                    if (var6.field4129 == null) {
                                        var6.field4129 = new class129[var9];
                                    }
                                    class129 var19 = this.field4129[var10];
                                    if (var19 == null) {
                                        var19 = this.field4129[var10] = new class129(var13);
                                    }
                                    class129 var20 = var6.field4129[var17];
                                    if (var20 == null) {
                                        var20 = var6.field4129[var17] = new class129(var18);
                                    }
                                    var19.field2299 += var18.field2299;
                                    var19.field2301 += var18.field2301;
                                    var19.field2295 += var18.field2295;
                                    var19.field2300 += var18.field2300;
                                    var20.field2299 += var13.field2299;
                                    var20.field2301 += var13.field2301;
                                    var20.field2295 += var13.field2295;
                                    var20.field2300 += var13.field2300;
                                    var7++;
                                    field4166[var10] = field4154;
                                    field4137[var17] = field4154;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field4140; var11++) {
            if (field4166[this.field4139[var11]] == field4154 && field4166[this.field4162[var11]] == field4154 && field4166[this.field4168[var11]] == field4154) {
                if (this.field4132 == null) {
                    this.field4132 = new byte[this.field4140];
                }
                this.field4132[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field4140; var12++) {
            if (field4137[var6.field4139[var12]] == field4154 && field4137[var6.field4162[var12]] == field4154 && field4137[var6.field4168[var12]] == field4154) {
                if (var6.field4132 == null) {
                    var6.field4132 = new byte[var6.field4140];
                }
                var6.field4132[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(III)V")
    public final void method1659(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field4127[arg2];
            int var5 = field4173[arg2];
            for (int var6 = 0; var6 < this.field4136; var6++) {
                int var7 = this.field4163[var6] * var5 + this.field4149[var6] * var4 >> 16;
                this.field4149[var6] = this.field4149[var6] * var5 - this.field4163[var6] * var4 >> 16;
                this.field4163[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field4127[arg0];
            int var9 = field4173[arg0];
            for (int var10 = 0; var10 < this.field4136; var10++) {
                int var11 = this.field4149[var10] * var9 - this.field4144[var10] * var8 >> 16;
                this.field4144[var10] = this.field4149[var10] * var8 + this.field4144[var10] * var9 >> 16;
                this.field4149[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field4127[arg1];
        int var13 = field4173[arg1];
        for (int var14 = 0; var14 < this.field4136; var14++) {
            int var15 = this.field4163[var14] * var13 + this.field4144[var14] * var12 >> 16;
            this.field4144[var14] = this.field4144[var14] * var13 - this.field4163[var14] * var12 >> 16;
            this.field4163[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(III)I")
    public final int method1660(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4136; var4++) {
            if (this.field4163[var4] == arg0 && this.field4149[var4] == arg1 && this.field4144[var4] == arg2) {
                return var4;
            }
        }
        this.field4163[this.field4136] = arg0;
        this.field4149[this.field4136] = arg1;
        this.field4144[this.field4136] = arg2;
        return this.field4136++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)Lsc;")
    public final class119 method885(int arg0, int arg1, int arg2) {
        return this.method1649(this.field4126, this.field4141, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "()V")
    public final void method1661() {
        for (int var1 = 0; var1 < this.field4136; var1++) {
            int var2 = this.field4144[var1];
            this.field4144[var1] = this.field4163[var1];
            this.field4163[var1] = -var2;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIBSB)I")
    public final int method1662(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field4139[this.field4140] = arg0;
        this.field4162[this.field4140] = arg1;
        this.field4168[this.field4140] = arg2;
        this.field4132[this.field4140] = arg3;
        this.field4157[this.field4140] = -1;
        this.field4135[this.field4140] = arg4;
        this.field4160[this.field4140] = -1;
        this.field4143[this.field4140] = arg5;
        return this.field4140++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(SS)V")
    public final void method1663(short arg0, short arg1) {
        if (this.field4160 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field4140; var3++) {
            if (this.field4160[var3] == arg0) {
                this.field4160[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "()V")
    public final void method1664() {
        if (this.field4142 != null) {
            return;
        }
        this.field4142 = new class129[this.field4136];
        for (int var1 = 0; var1 < this.field4136; var1++) {
            this.field4142[var1] = new class129();
        }
        for (int var2 = 0; var2 < this.field4140; var2++) {
            int var3 = this.field4139[var2];
            int var4 = this.field4162[var2];
            int var5 = this.field4168[var2];
            int var6 = this.field4163[var4] - this.field4163[var3];
            int var7 = this.field4149[var4] - this.field4149[var3];
            int var8 = this.field4144[var4] - this.field4144[var3];
            int var9 = this.field4163[var5] - this.field4163[var3];
            int var10 = this.field4149[var5] - this.field4149[var3];
            int var11 = this.field4144[var5] - this.field4144[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field4132 == null) {
                var19 = 0;
            } else {
                var19 = this.field4132[var2];
            }
            if (var19 == 0) {
                class129 var20 = this.field4142[var3];
                var20.field2299 += var16;
                var20.field2301 += var17;
                var20.field2295 += var18;
                var20.field2300++;
                class129 var21 = this.field4142[var4];
                var21.field2299 += var16;
                var21.field2301 += var17;
                var21.field2295 += var18;
                var21.field2300++;
                class129 var22 = this.field4142[var5];
                var22.field2299 += var16;
                var22.field2301 += var17;
                var22.field2295 += var18;
                var22.field2300++;
            } else if (var19 == 1) {
                if (this.field4146 == null) {
                    this.field4146 = new class146[this.field4140];
                }
                class146 var23 = this.field4146[var2] = new class146();
                var23.field2552 = var16;
                var23.field2554 = var17;
                var23.field2566 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    private class240() {
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([B)V")
    private class240(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1646(arg0);
        } else {
            this.method1638(arg0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "()V")
    public final void method1665() {
        for (int var1 = 0; var1 < this.field4136; var1++) {
            int var2 = this.field4163[var1];
            this.field4163[var1] = this.field4144[var1];
            this.field4144[var1] = -var2;
        }
        this.method1641();
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
    public class240(int arg0, int arg1, int arg2) {
        this.field4163 = new int[arg0];
        this.field4149 = new int[arg0];
        this.field4144 = new int[arg0];
        this.field4164 = new int[arg0];
        this.field4139 = new int[arg1];
        this.field4162 = new int[arg1];
        this.field4168 = new int[arg1];
        this.field4132 = new byte[arg1];
        this.field4161 = new byte[arg1];
        this.field4143 = new byte[arg1];
        this.field4135 = new short[arg1];
        this.field4160 = new short[arg1];
        this.field4157 = new byte[arg1];
        this.field4169 = new int[arg1];
        if (arg2 > 0) {
            this.field4159 = new byte[arg2];
            this.field4125 = new short[arg2];
            this.field4131 = new short[arg2];
            this.field4172 = new short[arg2];
            this.field4133 = new short[arg2];
            this.field4158 = new short[arg2];
            this.field4171 = new short[arg2];
            this.field4167 = new byte[arg2];
            this.field4153 = new byte[arg2];
            this.field4152 = new byte[arg2];
            this.field4148 = new byte[arg2];
            this.field4165 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "([Lab;I)V")
    public class240(class240[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field4136 = 0;
        this.field4140 = 0;
        this.field4138 = 0;
        this.field4151 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class240 var15 = arg0[var9];
            if (var15 != null) {
                this.field4136 += var15.field4136;
                this.field4140 += var15.field4140;
                this.field4138 += var15.field4138;
                if (var15.field4161 == null) {
                    if (this.field4151 == -1) {
                        this.field4151 = var15.field4151;
                    }
                    if (this.field4151 != var15.field4151) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field4132 != null;
                var5 |= var15.field4143 != null;
                var6 |= var15.field4169 != null;
                var7 |= var15.field4160 != null;
                var8 |= var15.field4157 != null;
            }
        }
        this.field4163 = new int[this.field4136];
        this.field4149 = new int[this.field4136];
        this.field4144 = new int[this.field4136];
        this.field4164 = new int[this.field4136];
        this.field4139 = new int[this.field4140];
        this.field4162 = new int[this.field4140];
        this.field4168 = new int[this.field4140];
        if (var3) {
            this.field4132 = new byte[this.field4140];
        }
        if (var4) {
            this.field4161 = new byte[this.field4140];
        }
        if (var5) {
            this.field4143 = new byte[this.field4140];
        }
        if (var6) {
            this.field4169 = new int[this.field4140];
        }
        if (var7) {
            this.field4160 = new short[this.field4140];
        }
        if (var8) {
            this.field4157 = new byte[this.field4140];
        }
        this.field4135 = new short[this.field4140];
        if (this.field4138 > 0) {
            this.field4159 = new byte[this.field4138];
            this.field4125 = new short[this.field4138];
            this.field4131 = new short[this.field4138];
            this.field4172 = new short[this.field4138];
            this.field4133 = new short[this.field4138];
            this.field4158 = new short[this.field4138];
            this.field4171 = new short[this.field4138];
            this.field4167 = new byte[this.field4138];
            this.field4153 = new byte[this.field4138];
            this.field4152 = new byte[this.field4138];
            this.field4148 = new byte[this.field4138];
            this.field4165 = new byte[this.field4138];
        }
        this.field4136 = 0;
        this.field4140 = 0;
        this.field4138 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class240 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field4140; var12++) {
                    if (var3 && var11.field4132 != null) {
                        this.field4132[this.field4140] = var11.field4132[var12];
                    }
                    if (var4) {
                        if (var11.field4161 == null) {
                            this.field4161[this.field4140] = var11.field4151;
                        } else {
                            this.field4161[this.field4140] = var11.field4161[var12];
                        }
                    }
                    if (var5 && var11.field4143 != null) {
                        this.field4143[this.field4140] = var11.field4143[var12];
                    }
                    if (var6 && var11.field4169 != null) {
                        this.field4169[this.field4140] = var11.field4169[var12];
                    }
                    if (var7) {
                        if (var11.field4160 == null) {
                            this.field4160[this.field4140] = -1;
                        } else {
                            this.field4160[this.field4140] = var11.field4160[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field4157 == null || var11.field4157[var12] == -1) {
                            this.field4157[this.field4140] = -1;
                        } else {
                            this.field4157[this.field4140] = (byte) (var11.field4157[var12] + this.field4138);
                        }
                    }
                    this.field4135[this.field4140] = var11.field4135[var12];
                    this.field4139[this.field4140] = this.method1643(var11, var11.field4139[var12]);
                    this.field4162[this.field4140] = this.method1643(var11, var11.field4162[var12]);
                    this.field4168[this.field4140] = this.method1643(var11, var11.field4168[var12]);
                    this.field4140++;
                }
                for (int var13 = 0; var13 < var11.field4138; var13++) {
                    byte var14 = this.field4159[this.field4138] = var11.field4159[var13];
                    if (var14 == 0) {
                        this.field4125[this.field4138] = (short) this.method1643(var11, var11.field4125[var13]);
                        this.field4131[this.field4138] = (short) this.method1643(var11, var11.field4131[var13]);
                        this.field4172[this.field4138] = (short) this.method1643(var11, var11.field4172[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field4125[this.field4138] = var11.field4125[var13];
                        this.field4131[this.field4138] = var11.field4131[var13];
                        this.field4172[this.field4138] = var11.field4172[var13];
                        this.field4133[this.field4138] = var11.field4133[var13];
                        this.field4158[this.field4138] = var11.field4158[var13];
                        this.field4171[this.field4138] = var11.field4171[var13];
                        this.field4167[this.field4138] = var11.field4167[var13];
                        this.field4153[this.field4138] = var11.field4153[var13];
                        this.field4152[this.field4138] = var11.field4152[var13];
                    }
                    if (var14 == 2) {
                        this.field4148[this.field4138] = var11.field4148[var13];
                        this.field4165[this.field4138] = var11.field4165[var13];
                    }
                    this.field4138++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lab;ZZZZ)V")
    public class240(class240 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field4136 = arg0.field4136;
        this.field4140 = arg0.field4140;
        this.field4138 = arg0.field4138;
        if (arg1) {
            this.field4163 = arg0.field4163;
            this.field4149 = arg0.field4149;
            this.field4144 = arg0.field4144;
        } else {
            this.field4163 = new int[this.field4136];
            this.field4149 = new int[this.field4136];
            this.field4144 = new int[this.field4136];
            for (int var6 = 0; var6 < this.field4136; var6++) {
                this.field4163[var6] = arg0.field4163[var6];
                this.field4149[var6] = arg0.field4149[var6];
                this.field4144[var6] = arg0.field4144[var6];
            }
        }
        if (arg2) {
            this.field4135 = arg0.field4135;
        } else {
            this.field4135 = new short[this.field4140];
            for (int var7 = 0; var7 < this.field4140; var7++) {
                this.field4135[var7] = arg0.field4135[var7];
            }
        }
        if (arg3 || arg0.field4160 == null) {
            this.field4160 = arg0.field4160;
        } else {
            this.field4160 = new short[this.field4140];
            for (int var8 = 0; var8 < this.field4140; var8++) {
                this.field4160[var8] = arg0.field4160[var8];
            }
        }
        if (arg4) {
            this.field4143 = arg0.field4143;
        } else {
            this.field4143 = new byte[this.field4140];
            if (arg0.field4143 == null) {
                for (int var9 = 0; var9 < this.field4140; var9++) {
                    this.field4143[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field4140; var10++) {
                    this.field4143[var10] = arg0.field4143[var10];
                }
            }
        }
        this.field4139 = arg0.field4139;
        this.field4162 = arg0.field4162;
        this.field4168 = arg0.field4168;
        this.field4132 = arg0.field4132;
        this.field4161 = arg0.field4161;
        this.field4157 = arg0.field4157;
        this.field4151 = arg0.field4151;
        this.field4159 = arg0.field4159;
        this.field4125 = arg0.field4125;
        this.field4131 = arg0.field4131;
        this.field4172 = arg0.field4172;
        this.field4133 = arg0.field4133;
        this.field4158 = arg0.field4158;
        this.field4171 = arg0.field4171;
        this.field4167 = arg0.field4167;
        this.field4153 = arg0.field4153;
        this.field4152 = arg0.field4152;
        this.field4148 = arg0.field4148;
        this.field4165 = arg0.field4165;
        this.field4164 = arg0.field4164;
        this.field4169 = arg0.field4169;
        this.field4128 = arg0.field4128;
        this.field4134 = arg0.field4134;
        this.field4142 = arg0.field4142;
        this.field4146 = arg0.field4146;
        this.field4129 = arg0.field4129;
        this.field4126 = arg0.field4126;
        this.field4141 = arg0.field4141;
    }
}
