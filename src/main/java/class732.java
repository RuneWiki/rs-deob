import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class732 extends class585 {

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    private int field10132 = 6;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
    public static int[] field10133 = new int[25];

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field10134;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "J")
    public static long field10137;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method58(boolean arg0, int arg1) {
        ++field10135;
        if (arg0) {
            this.method58(true, 23);
        }
        int[][] var3 = super.field8265.method1576((byte) 121, arg1);
        if (super.field8265.field3546) {
            int[][] var4 = this.method3417(0, arg1, (byte) 113);
            int[][] var5 = this.method3417(1, arg1, (byte) 113);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field10132;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~class293.field4278 < ~var16; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var9[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var18 + var19 + -(var18 * var19 >> 11);
                                                                var7[var16] = var20 - (-var21 - -(var20 * var21 >> 11));
                                                                var8[var16] = -(var17 * var22 >> 11) + var17 - -var22;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class293.field4278 < ~var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var14[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var12[var23];
                                                            var6[var23] = ~var29 > ~var28 ? -var29 + var28 : -var28 + var29;
                                                            var7[var23] = ~var25 < ~var26 ? -var26 + var25 : var26 - var25;
                                                            var8[var23] = var24 > var27 ? -var27 + var24 : var27 - var24;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class293.field4278 > var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var10[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = var32 < var34 ? var34 : var32;
                                                        var7[var30] = ~var33 < ~var36 ? var33 : var36;
                                                        var8[var30] = var31 <= var35 ? var35 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class293.field4278 < ~var37; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var10[var37];
                                                    int var40 = var13[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var14[var37];
                                                    int var43 = var12[var37];
                                                    var6[var37] = ~var41 <= ~var43 ? var43 : var41;
                                                    var7[var37] = var40 > var39 ? var39 : var40;
                                                    var8[var37] = ~var38 <= ~var42 ? var42 : var38;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~class293.field4278 < ~var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = var47 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var47) + 4096;
                                                var7[var44] = ~var46 == -1 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var46;
                                                var8[var44] = var45 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var45;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; var48 < class293.field4278; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var50 != -4097 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = ~var49 != -4097 ? (var14[var48] << 12) / (-var49 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class293.field4278; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : -((4096 - var9[var52]) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = ~var53 <= -2049 ? 4096 - ((4096 - var10[var52]) * (4096 - var53) >> 11) : var10[var52] * var53 >> 11;
                                        var8[var52] = var54 >= 2048 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class293.field4278 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = 4096 - ((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class293.field4278; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 == -1 ? 4096 : (var9[var57] << 12) / var59;
                                var7[var57] = var58 != 0 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class293.field4278 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class293.field4278 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class293.field4278; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class732() {
        super(2, false);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public static void method4093(byte arg0) {
        if (arg0 <= 95) {
            method4094((class65) null, -111);
        }
        field10133 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field8266 = arg0.method2964((byte) 44) == 1;
            }
        } else {
            this.field10132 = arg0.method2964((byte) 123);
        }
        if (arg1 != 1) {
            this.method55(55, 115);
        }
        ++field10136;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field10134;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int[] var4 = this.method3415(-127, 0, arg0);
            int[] var5 = this.method3415(-128, 1, arg0);
            int var6 = this.field10132;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (var6 != 3) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (~var6 != -12) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class293.field4278; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = var9 - ((var8 * var9 >> 11) + -var8);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class293.field4278 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var11 <= ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class293.field4278; ++var13) {
                                                        int var14 = var5[var13];
                                                        int var15 = var4[var13];
                                                        var3[var13] = var15 <= var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; ~var16 > ~class293.field4278; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 < var18 ? var17 : var18;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class293.field4278; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 == 0 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class293.field4278 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 == 4096 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class293.field4278 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 > -2049 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class293.field4278 < ~var25; ++var25) {
                                    var3[var25] = 4096 - ((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12);
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class293.field4278 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~var28 > ~class293.field4278; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class293.field4278 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class293.field4278; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return arg1 <= 123 ? null : var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lha;I)V")
    public static final void method4094(class65 arg0, int arg1) {
        ++field10138;
        int var2 = 127 / ((-5 - arg1) / 55);
        if ((~class618.field8644 <= -3 || class691.field9660) && class265.field3871 == null) {
            String var3;
            if (class691.field9660 && class618.field8644 < 2) {
                var3 = class572.field8070 + class620.field8693.method3580(class140.field2081, 12) + class714.field9904 + " ->";
            } else if (class548.field7872 && class629.field8820.method2138(81, -6759) && ~class618.field8644 < -3) {
                var3 = class287.method1854(class694.field9692, (byte) -44);
            } else {
                class746 var4 = class694.field9692;
                if (var4 == null) {
                    return;
                }
                var3 = class287.method1854(var4, (byte) 108);
                int[] var5 = null;
                if (!class776.method4271(var4.field10340, 1951)) {
                    if (var4.field10343 != -1) {
                        var5 = class313.field4456.method1681(var4.field10343, 114).field9642;
                    } else if (class460.method2740(false, var4.field10340)) {
                        class205 var6 = (class205) class645.field9014.method2242((long) ((int) var4.field10333), -1);
                        if (var6 != null) {
                            class665 var7 = var6.field3181;
                            class110 var8 = var7.field9240;
                            if (var8.field1657 != null) {
                                var8 = var8.method840(class537.field7727, 107);
                            }
                            if (var8 != null) {
                                var5 = var8.field1669;
                            }
                        }
                    } else if (class457.method2724(var4.field10340, (byte) 89)) {
                        Object var9 = null;
                        class282 var10;
                        if (var4.field10340 != 1010) {
                            var10 = class277.field4038.method3919(true, (int) (var4.field10333 >>> 32 & 2147483647L));
                        } else {
                            var10 = class277.field4038.method3919(true, (int) var4.field10333);
                        }
                        if (var10.field4117 != null) {
                            var10 = var10.method1826(class537.field7727, 108);
                        }
                        if (var10 != null) {
                            var5 = var10.field4169;
                        }
                    }
                } else {
                    var5 = class313.field4456.method1681((int) var4.field10333, 112).field9642;
                }
                if (var5 != null) {
                    var3 = var3 + class354.method2255(-1, var5);
                }
            }
            if (~class618.field8644 < -3) {
                var3 = var3 + "<col=ffffff> / " + (class618.field8644 + -2) + class620.field8686.method3580(class140.field2081, 12);
            }
            if (class549.field7893 == null) {
                if (class425.field5801 != null && class60.field734 == class422.field5780) {
                    int var11 = class269.field3907.method559(0, class70.field833, class132.field1980, class569.field8030, true, class377.field5199 - -4, var3, class277.field4035, class298.field4321 + 16, 16777215);
                    class110.method835(0, 16, class298.field4321, var11 + class395.field5431.method41(var3, -106), class377.field5199 - -4);
                    return;
                }
            } else {
                class66 var12 = class549.field7893.method2681(arg0, (byte) 48);
                if (var12 == null) {
                    var12 = class269.field3907;
                }
                var12.method561(class277.field4035, class312.field4448, var3, class198.field3020, class132.field1980, 1, class569.field8030, class70.field833, class549.field7893.field6237, class549.field7893.field6304, class549.field7893.field6225, class549.field7893.field6290, class549.field7893.field6288, class351.field4909, class549.field7893.field6282);
                class110.method835(0, class351.field4909[3], class351.field4909[1], class351.field4909[2], class351.field4909[0]);
            }
        }
    }
}
