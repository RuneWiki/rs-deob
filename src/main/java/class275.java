import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class275 extends class4 {

    @OriginalMember(owner = "client!faa", name = "N", descriptor = "I")
    private int field3585 = 0;

    @OriginalMember(owner = "client!faa", name = "J", descriptor = "[S")
    private short[] field3581 = new short[257];

    @OriginalMember(owner = "client!faa", name = "S", descriptor = "F")
    public static float field3590;

    @OriginalMember(owner = "client!faa", name = "E", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!faa", name = "F", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!faa", name = "G", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!faa", name = "K", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!faa", name = "L", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!faa", name = "M", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!faa", name = "O", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!faa", name = "P", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!faa", name = "Q", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!faa", name = "T", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!faa", name = "H", descriptor = "[I")
    private int[] field3579;

    @OriginalMember(owner = "client!faa", name = "I", descriptor = "[I")
    private int[] field3580;

    @OriginalMember(owner = "client!faa", name = "R", descriptor = "[[I")
    private int[][] field3589;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field3587;
        if (arg0 != 10) {
            this.method15((byte) 26, 74);
        }
        int[] var3 = super.field31.method2252(arg1, arg0 + 1);
        if (super.field31.field5127) {
            int[] var4 = this.method20(0, -21986, arg1);
            for (int var5 = 0; class132.field1627 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field3581[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)[I")
    private final int[] method1699(int arg0, int arg1) {
        ++field3576;
        if (arg1 != 256) {
            this.method15((byte) 0, 91);
        }
        if (arg0 < 0) {
            return this.field3579;
        } else {
            return ~this.field3589.length >= ~arg0 ? this.field3580 : this.field3589[arg0];
        }
    }

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "(I)V")
    public static final void method1700(int arg0) {
        ++field3584;
        class403.field5520 = class342.field4758.method3064((byte) -122);
        int var1 = class342.field4758.method3037(true);
        int var2 = class342.field4758.method3064((byte) -66);
        boolean var3 = class342.field4758.method3035(-957401312) == 1;
        int var4 = class342.field4758.method3037(true);
        class391.method2361(5466);
        class588.method3397(28000, var2);
        class342.field4758.method373(92);
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var21 = 0; ~(class139.field1760 >> 3) < ~var21; ++var21) {
                for (int var22 = 0; ~(class369.field5135 >> 3) < ~var22; ++var22) {
                    int var23 = class342.field4758.method377(8, 1);
                    if (~var23 != -2) {
                        class270.field3439[var5][var21][var22] = -1;
                    } else {
                        class270.field3439[var5][var21][var22] = class342.field4758.method377(8, 26);
                    }
                }
            }
        }
        class342.field4758.method378(7);
        int var6 = (-class342.field4758.field7707 + class262.field3333) / 16;
        class431.field5865 = new int[var6][4];
        int var7 = -54 % ((-71 - arg0) / 53);
        for (int var8 = 0; ~var8 > ~var6; ++var8) {
            for (int var20 = 0; ~var20 > -5; ++var20) {
                class431.field5865[var8][var20] = class342.field4758.method3048(-4);
            }
        }
        class534.field7454 = new byte[var6][];
        class146.field1896 = new int[var6];
        class334.field4672 = new int[var6];
        class183.field2340 = new int[var6];
        class627.field9135 = null;
        class335.field4677 = null;
        class452.field6403 = new byte[var6][];
        class555.field7758 = new byte[var6][];
        class443.field6126 = new byte[var6][];
        class258.field3206 = new int[var6];
        class89.field1190 = new int[var6];
        int var9 = 0;
        for (int var10 = 0; ~var10 > -5; ++var10) {
            for (int var11 = 0; ~var11 > ~(class139.field1760 >> 3); ++var11) {
                for (int var12 = 0; ~(class369.field5135 >> 3) < ~var12; ++var12) {
                    int var13 = class270.field3439[var10][var11][var12];
                    if (~var13 != 0) {
                        int var14 = var13 >> 14 & 1023;
                        int var15 = (var13 & 16378) >> 3;
                        int var16 = (var14 / 8 << 8) - -(var15 / 8);
                        for (int var17 = 0; ~var9 < ~var17; ++var17) {
                            if (~class258.field3206[var17] == ~var16) {
                                var16 = -1;
                                break;
                            }
                        }
                        if (var16 != -1) {
                            class258.field3206[var9] = var16;
                            int var18 = 255 & var16 >> 8;
                            int var19 = var16 & 255;
                            class334.field4672[var9] = class277.field3612.method2053((byte) 40, "m" + var18 + "_" + var19);
                            class183.field2340[var9] = class277.field3612.method2053((byte) 40, "l" + var18 + "_" + var19);
                            class146.field1896[var9] = class277.field3612.method2053((byte) 40, "um" + var18 + "_" + var19);
                            class89.field1190[var9] = class277.field3612.method2053((byte) 40, "ul" + var18 + "_" + var19);
                            ++var9;
                        }
                    }
                }
            }
        }
        class598.method3446(512, var4, var1, 10, var3);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "([IILdg;[I[I)V")
    public static final void method1701(int[] arg0, int arg1, class20 arg2, int[] arg3, int[] arg4) {
        if (arg1 != 1) {
            method1700(11);
        }
        for (int var5 = 0; arg4.length > var5; ++var5) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg2.field325.length) {
                if (~(1 & var7) != -1) {
                    if (var6 == -1) {
                        arg2.field325[var9] = null;
                    } else {
                        class320 var10 = class609.field8754.method535(var6, true);
                        int var11 = var10.field4419;
                        class257 var12 = arg2.field325[var9];
                        if (var12 != null) {
                            if (~var12.field3194 != ~var6) {
                                if (~var10.field4430 <= ~class609.field8754.method535(var12.field3194, true).field4430) {
                                    var12 = arg2.field325[var9] = null;
                                }
                            } else if (var11 != 0) {
                                if (~var11 != -2) {
                                    if (var11 == 2) {
                                        var12.field3192 = 0;
                                    }
                                } else {
                                    var12.field3187 = 0;
                                    var12.field3188 = 1;
                                    var12.field3192 = 0;
                                    var12.field3196 = var8;
                                    var12.field3186 = 0;
                                    class627.method3629(arg2.field6368, class147.field1899 == arg2, var10, 0, arg2.field6358, (byte) -103, arg2.field6362);
                                }
                            } else {
                                var12 = arg2.field325[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class257 var13 = arg2.field325[var9] = new class257();
                            var13.field3196 = var8;
                            var13.field3192 = 0;
                            var13.field3186 = 0;
                            var13.field3188 = 1;
                            var13.field3194 = var6;
                            var13.field3187 = 0;
                            class627.method3629(arg2.field6368, class147.field1899 == arg2, var10, 0, arg2.field6358, (byte) -123, arg2.field6362);
                        }
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        ++field3582;
    }

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "(I)V")
    public static final void method1702(int arg0) {
        if (arg0 == -1132255864) {
            class425.method2495(0);
            ++field3591;
            class453.field6425 = null;
            class449.field6353 = null;
            class510.field7108 = null;
            class257.field3197 = null;
            class224.field2868 = null;
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
    private final void method1703(byte arg0) {
        int var2 = 16 / ((arg0 - 35) / 54);
        int var3 = this.field3585;
        if (var3 != 2) {
            if (var3 == 1) {
                for (int var4 = 0; var4 < 257; ++var4) {
                    int var5 = var4 << 4;
                    int var6;
                    for (var6 = 1; this.field3589.length + -1 > var6 && ~var5 <= ~this.field3589[var6][0]; ++var6) {
                    }
                    int[] var7 = this.field3589[var6 - 1];
                    int[] var8 = this.field3589[var6];
                    int var9 = (-var7[0] + var5 << 12) / (var8[0] + -var7[0]);
                    int var10 = 4096 - class125.field1560[var9 >> 5 & 255] >> 1;
                    int var11 = -var10 + 4096;
                    int var12 = var7[1] * var11 + var8[1] * var10 >> 12;
                    if (var12 <= -32768) {
                        var12 = -32767;
                    }
                    if (~var12 <= -32769) {
                        var12 = 32767;
                    }
                    this.field3581[var4] = (short) var12;
                }
            } else {
                for (int var13 = 0; ~var13 > -258; ++var13) {
                    int var14 = var13 << 4;
                    int var15;
                    for (var15 = 1; ~(this.field3589.length + -1) < ~var15 && this.field3589[var15][0] <= var14; ++var15) {
                    }
                    int[] var16 = this.field3589[var15 + -1];
                    int[] var17 = this.field3589[var15];
                    int var18 = (-var16[0] + var14 << 12) / (var17[0] + -var16[0]);
                    int var19 = 4096 - var18;
                    int var20 = var16[1] * var19 - -(var17[1] * var18) >> 12;
                    if (var20 <= -32768) {
                        var20 = -32767;
                    }
                    if (~var20 <= -32769) {
                        var20 = 32767;
                    }
                    this.field3581[var13] = (short) var20;
                }
            }
        } else {
            for (int var21 = 0; ~var21 > -258; ++var21) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; var23 < this.field3589.length + -1 && var22 >= this.field3589[var23][0]; ++var23) {
                }
                int[] var24 = this.field3589[var23 + -1];
                int[] var25 = this.field3589[var23];
                int var26 = this.method1699(var23 + -2, 256)[1];
                int var27 = var24[1];
                int var28 = var25[1];
                int var29 = this.method1699(var23 + 1, 256)[1];
                int var30 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = var29 - var28 + -var26 + var27;
                int var33 = -var27 + -var32 + var26;
                int var34 = -var26 + var28;
                int var36 = (var30 * var32 >> 12) * var31 >> 12;
                int var37 = var31 * var33 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var27 + var38 + var36 - -var37;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field3581[var21] = (short) var39;
            }
        }
        ++field3588;
    }

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (this.field3589 == null) {
            this.field3589 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3577;
        if (this.field3589.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3585 == -3) {
                this.method1704(-102);
            }
            class78.method446((byte) -86);
            if (arg0 != -9) {
                this.field3589 = null;
            }
            this.method1703((byte) -50);
        }
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, true);
    }

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "(I)V")
    private final void method1704(int arg0) {
        ++field3583;
        int[] var2 = this.field3589[0];
        int[] var3 = this.field3589[1];
        if (arg0 < -28) {
            int[] var4 = this.field3589[this.field3589.length + -2];
            int[] var5 = this.field3589[this.field3589.length + -1];
            this.field3579 = new int[] { var2[0] + var2[0] + -var3[0], -var3[1] - -var2[1] + var2[1] };
            this.field3580 = new int[] { -var5[0] - -var4[0] + var4[0], -var5[1] - (-var4[1] - var4[1]) };
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field3586;
        if (arg2 == 0) {
            this.field3585 = arg1.method3045(-126);
            this.field3589 = new int[arg1.method3045(-126)][2];
            for (int var4 = 0; this.field3589.length > var4; ++var4) {
                this.field3589[var4][0] = arg1.method3090(-103);
                this.field3589[var4][1] = arg1.method3090(-124);
            }
        }
        if (arg0 >= -89) {
            this.field3585 = -99;
        }
    }
}
