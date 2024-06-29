import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class280 extends class17 {

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[S")
    private short[] field4136 = new short[257];

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    private int field4134 = 0;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Ltn;")
    public static class60 field4135 = new class60(53, 3);

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[I")
    private int[] field4131;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "[I")
    private int[] field4132;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
    public static int[] field4141;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "[[I")
    private int[][] field4137;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            this.field4131 = null;
        }
        ++field4144;
        if (arg1 == 0) {
            this.field4134 = arg0.method2357((byte) 118);
            this.field4137 = new int[arg0.method2357((byte) 104)][2];
            for (int var4 = 0; ~this.field4137.length < ~var4; ++var4) {
                this.field4137[var4][0] = arg0.method2338(0);
                this.field4137[var4][1] = arg0.method2338(0);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V")
    public class280() {
        super(1, true);
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(I)V")
    private final void method1746(int arg0) {
        ++field4145;
        if (arg0 != 1) {
            this.field4136 = null;
        }
        int var2 = this.field4134;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field4137.length + -1 && this.field4137[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field4137[var5 + -1];
                    int[] var7 = this.field4137[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class475.field6607[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4136[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field4137.length - 1) < ~var14 && ~var13 <= ~this.field4137[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field4137[var14 + -1];
                    int[] var16 = this.field4137[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field4136[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field4137.length + -1) < ~var22 && this.field4137[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field4137[var22 + -1];
                int[] var24 = this.field4137[var22];
                int var25 = this.method1752(var22 + -2, 86)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1752(var22 + 1, 41)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 + -var25 + var26;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 - -var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field4136[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field4143;
        if (arg1 <= 53) {
            method1749(53, -22);
        }
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            for (int var5 = 0; class530.field7763 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field4136[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljq;ILjq;)V")
    public static final void method1747(class361 arg0, int arg1, class361 arg2) {
        if (arg0.field5159 != null) {
            arg0.method2132(12);
        }
        ++field4139;
        arg0.field5158 = arg2.field5158;
        arg0.field5159 = arg2;
        arg0.field5159.field5158 = arg0;
        if (arg1 >= -115) {
            field4141 = null;
        }
        arg0.field5158.field5159 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
    public static void method1748(boolean arg0) {
        field4141 = null;
        field4135 = null;
        if (arg0) {
            method1750((class150[]) null, 41, true);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    public static final int method1749(int arg0, int arg1) {
        if (arg0 != -31679) {
            method1750((class150[]) null, -26, false);
        }
        int var7 = arg1 - 1;
        ++field4142;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 - -1;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
    public final void method31(int arg0) {
        if (arg0 == -9) {
            if (this.field4137 == null) {
                this.field4137 = new int[][] { new int[2], { 4096, 4096 } };
            }
            ++field4138;
            if (~this.field4137.length > -3) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field4134 == -3) {
                    this.method1751((byte) 68);
                }
                class341.method2034(true);
                this.method1746(1);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "([Lhm;IZ)V")
    public static final void method1750(class150[] arg0, int arg1, boolean arg2) {
        ++field4140;
        if (!arg2) {
            for (int var3 = 0; arg0.length > var3; ++var3) {
                class150 var4 = arg0[var3];
                if (var4 != null && var4.field2071 == arg1 && !client.method1288(var4)) {
                    if (var4.field2022 == 0) {
                        method1750(arg0, var4.field2134, false);
                        if (var4.field2110 != null) {
                            method1750(var4.field2110, var4.field2134, arg2);
                        }
                        class489 var5 = (class489) class255.field3763.method2405((long) var4.field2134, -96);
                        if (var5 != null) {
                            class211.method1334(var5.field6840, -1);
                        }
                    }
                    if (~var4.field2022 == -7 && ~var4.field2112 != 0) {
                        class449 var6 = class62.field784.method2566(var4.field2112, -19);
                        if (var6 != null) {
                            var4.field2060 += class288.field4213;
                            while (var4.field2060 > var6.field6258[var4.field2009]) {
                                var4.field2060 -= var6.field6258[var4.field2009];
                                ++var4.field2009;
                                if (var4.field2009 >= var6.field6276.length) {
                                    var4.field2009 -= var6.field6264;
                                    if (~var4.field2009 > -1 || ~var4.field2009 <= ~var6.field6276.length) {
                                        var4.field2009 = 0;
                                    }
                                }
                                var4.field2140 = var4.field2009 + 1;
                                if (var4.field2140 >= var6.field6276.length) {
                                    var4.field2140 -= var6.field6264;
                                    if (~var4.field2140 > -1 || var4.field2140 >= var6.field6276.length) {
                                        var4.field2140 = -1;
                                    }
                                }
                                class187.method1190(var4, 119);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    private final void method1751(byte arg0) {
        ++field4133;
        if (arg0 < 41) {
            field4135 = null;
        }
        int[] var2 = this.field4137[0];
        int[] var3 = this.field4137[1];
        int[] var4 = this.field4137[this.field4137.length + -2];
        int[] var5 = this.field4137[this.field4137.length - 1];
        this.field4131 = new int[] { -var5[0] - -var4[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
        this.field4132 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] - -var2[1] };
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)[I")
    private final int[] method1752(int arg0, int arg1) {
        ++field4130;
        if (arg1 < 32) {
            this.method1751((byte) -50);
        }
        if (~arg0 > -1) {
            return this.field4132;
        } else {
            return arg0 >= this.field4137.length ? this.field4131 : this.field4137[arg0];
        }
    }
}
