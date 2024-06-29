import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class285 extends class185 {

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field4265 = 0;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "[S")
    private short[] field4269 = new short[257];

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "I")
    public static int field4274 = 0;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "[I")
    public static int[] field4275 = new int[200];

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "[I")
    private int[] field4266;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "[I")
    private int[] field4273;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "[La;")
    public static class49[] field4271;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[[I")
    private int[][] field4260;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILpf;)V")
    public static final void method1871(int arg0, class294 arg1) {
        ++field4277;
        class27.field336 = arg1.method1965("runes", -91);
        if (arg0 != 1) {
            field4271 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[I")
    private final int[] method1872(int arg0, byte arg1) {
        ++field4272;
        if (arg1 < 0) {
            this.method27(2, (class248) null, 84);
        }
        if (~arg0 > -1) {
            return this.field4266;
        } else {
            return this.field4260.length <= arg0 ? this.field4273 : this.field4260[arg0];
        }
    }

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "(I)V")
    private final void method1873(int arg0) {
        int[] var2 = this.field4260[0];
        if (arg0 != 17208) {
            this.field4269 = null;
        }
        int[] var3 = this.field4260[1];
        int[] var4 = this.field4260[this.field4260.length - 2];
        ++field4261;
        int[] var5 = this.field4260[this.field4260.length - 1];
        this.field4266 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        this.field4273 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - -var4[1] + var4[1] };
    }

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "(I)V")
    public static final void method1874(int arg0) {
        class83 var1 = (class83) class239.field3595.method983(7);
        ++field4263;
        while (var1 != null) {
            class106 var2 = var1.field1328;
            if (~class99.field1557 == ~var2.field1621 && !var2.field1620) {
                if (var2.field1639 <= class270.field4058) {
                    var2.method670(class180.field2741, false);
                    if (!var2.field1620) {
                        class101.method653(var2.field1621, var2.field1611, var2.field1640, var2.field1632, 60, var2, 0, -1L, false);
                    } else {
                        var1.method538(arg0 ^ 12355);
                    }
                }
            } else {
                var1.method538(94);
            }
            var1 = (class83) class239.field3595.method985((byte) -93);
        }
        if (arg0 != 12289) {
            field4274 = -96;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4265 = arg1.method1593((byte) 27);
            this.field4260 = new int[arg1.method1593((byte) 27)][2];
            for (int var4 = 0; ~this.field4260.length < ~var4; ++var4) {
                this.field4260[var4][0] = arg1.method1575(false);
                this.field4260[var4][1] = arg1.method1575(false);
            }
        }
        if (arg2 != -6357) {
            method1878(54, -32, 25, -47, 15, 41, -111);
        }
        ++field4259;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class285() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 124, arg0, 0);
            for (int var5 = 0; class174.field2648 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4269[var6];
            }
        }
        ++field4262;
        if (arg1 < 70) {
            this.method1873(-65);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "(I)V")
    private final void method1875(int arg0) {
        if (arg0 != 1) {
            method1878(66, -46, 4, -36, -102, 69, -3);
        }
        int var2 = this.field4265;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field4260.length + -1 > var5 && this.field4260[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field4260[var5 + -1];
                    int[] var7 = this.field4260[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = 4096 - class175.field2661[(8189 & var8) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field4269[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field4260.length + -1 && ~this.field4260[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field4260[var14];
                    int[] var16 = this.field4260[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] - var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4269[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field4260.length + -1) && ~this.field4260[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field4260[var22];
                int[] var24 = this.field4260[var22 - 1];
                int var25 = this.method1872(var22 - 2, (byte) 47)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1872(var22 + 1, (byte) 9)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] - var24[0]);
                int var30 = var29 * var29 >> 12;
                int var32 = -var25 + var27;
                int var33 = var29 * var32 >> 12;
                int var34 = -var25 + var28 - var27 + var26;
                int var35 = -var26 + -var34 + var25;
                int var36 = var30 * var35 >> 12;
                int var37 = (var29 * var34 >> 12) * var30 >> 12;
                int var38 = var26 + var37 - (-var36 - var33);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4269[var20] = (short) var38;
            }
        }
        ++field4268;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)Lak;")
    public static final class140 method1876(int arg0, int arg1) {
        ++field4276;
        class140 var2 = (class140) class97.field1526.method1777((long) arg1, (byte) 112);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class99.field1565.method1973(1, 34, arg1);
            class140 var4 = new class140();
            if (arg0 != -10076) {
                return null;
            } else {
                if (var3 != null) {
                    var4.method864(new class248(var3), arg0 ^ -4956, arg1);
                }
                class97.field1526.method1784((long) arg1, var4, arg0 + 10076);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLjj;)V")
    public static final void method1877(byte arg0, class107 arg1) {
        ++field4264;
        class151 var2 = (class151) class278.field4193.method1666(class94.method604((byte) -111, arg1.field1663), (byte) -110);
        int var3 = 79 / ((arg0 - -25) / 36);
        if (var2 != null) {
            var2.method915(true);
        } else {
            class89.method573(arg1.field2297[0], arg1, class99.field1557, 0, (class61) null, arg1.field2275[0], 124, (class288) null);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 1) == 1) {
            int var7 = arg1;
            arg1 = arg3;
            arg3 = var7;
        }
        int var8 = arg0 & 3;
        ++field4267;
        if (~var8 == arg6) {
            return arg4;
        } else if (var8 == 1) {
            return -arg1 - -1 + -arg2 + 7;
        } else {
            return ~var8 == -3 ? -arg3 - (-1 - (-arg4 + 7)) : arg2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (this.field4260 == null) {
            this.field4260 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field4270;
        if (this.field4260.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field4265 == 2) {
                this.method1873(17208);
            }
            if (arg0 != -9) {
                this.field4265 = -73;
            }
            class82.method546(-13376);
            this.method1875(1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "(I)V")
    public static void method1879(int arg0) {
        field4275 = null;
        field4271 = null;
        if (arg0 != 0) {
            field4274 = -65;
        }
    }
}
