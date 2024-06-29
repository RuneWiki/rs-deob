import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class119 extends class232 {

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    private int field1725 = 6;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field1728 = new String[] { method1174(method1173("qu\"Qn")), method1174(method1173("qu\"Xn")), method1174(method1173("mi`q")), method1174(method1173("x2\"3;")), method1174(method1173("qu\"\\n")), method1174(method1173("qu\"Yn")), method1174(method1173("qu\"_n")) };

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "Lega;")
    public static class742 field1723 = new class742();

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "[I")
    public static int[] field1727 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 3)
    public static void method1171(byte arg0) {
        try {
            field1723 = null;
            field1727 = null;
            if (arg0 < 111) {
                field1727 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1728[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[I", line = 18)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field1722;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (arg1 != 123) {
                this.field1725 = -25;
            }
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(arg0, 0, arg1 + -123);
                int[] var5 = this.method2022(arg0, 1, 0);
                int var6 = this.field1725;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (~var6 != -6) {
                                    if (var6 != 6) {
                                        if (~var6 != -8) {
                                            if (var6 != 8) {
                                                if (var6 != 9) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var28 = 0; class449.field6969 > var28; ++var28) {
                                                                    int var29 = var4[var28];
                                                                    int var30 = var5[var28];
                                                                    var3[var28] = var29 - -var30 + -(var29 * var30 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var25 = 0; ~var25 > ~class449.field6969; ++var25) {
                                                                int var26 = var5[var25];
                                                                int var27 = var4[var25];
                                                                var3[var25] = var27 <= var26 ? -var27 + var26 : var27 - var26;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var22 = 0; ~var22 > ~class449.field6969; ++var22) {
                                                            int var23 = var5[var22];
                                                            int var24 = var4[var22];
                                                            var3[var22] = var23 < var24 ? var24 : var23;
                                                        }
                                                    }
                                                } else {
                                                    for (int var19 = 0; class449.field6969 > var19; ++var19) {
                                                        int var20 = var4[var19];
                                                        int var21 = var5[var19];
                                                        var3[var19] = ~var21 >= ~var20 ? var21 : var20;
                                                    }
                                                }
                                            } else {
                                                for (int var17 = 0; ~var17 > ~class449.field6969; ++var17) {
                                                    int var18 = var4[var17];
                                                    var3[var17] = var18 == 0 ? 0 : -((-var5[var17] + 4096 << 12) / var18) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var15 = 0; class449.field6969 > var15; ++var15) {
                                                int var16 = var4[var15];
                                                var3[var15] = var16 == 4096 ? 4096 : (var5[var15] << 12) / (-var16 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var13 = 0; var13 < class449.field6969; ++var13) {
                                            int var14 = var5[var13];
                                            var3[var13] = ~var14 <= -2049 ? 4096 - ((-var4[var13] + 4096) * (-var14 + 4096) >> 11) : var4[var13] * var14 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var12 = 0; class449.field6969 > var12; ++var12) {
                                        var3[var12] = -((-var4[var12] + 4096) * (-var5[var12] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var10 = 0; ~var10 > ~class449.field6969; ++var10) {
                                    int var11 = var5[var10];
                                    var3[var10] = var11 == 0 ? 4096 : (var4[var10] << 12) / var11;
                                }
                            }
                        } else {
                            for (int var9 = 0; ~class449.field6969 < ~var9; ++var9) {
                                var3[var9] = var4[var9] * var5[var9] >> 12;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < class449.field6969; ++var8) {
                            var3[var8] = var4[var8] + -var5[var8];
                        }
                    }
                } else {
                    for (int var7 = 0; class449.field6969 > var7; ++var7) {
                        var3[var7] = var4[var7] + var5[var7];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var32) {
            throw class590.method4333(var32, field1728[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILwq;I)V", line = 262)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    super.field3605 = ~arg1.method1645((byte) -115) == -2;
                }
            } else {
                this.field1725 = arg1.method1645((byte) -77);
            }
            ++field1721;
            if (arg0 <= 96) {
                field1727 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1728[1] + arg0 + ',' + (arg1 != null ? field1728[3] : field1728[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 627)
    public class119() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)[[I", line = 304)
    public final int[][] method122(int arg0, int arg1) {
        try {
            ++field1724;
            if (arg0 != -3093) {
                this.method63(119, (class176) null, -64);
            }
            int[][] var3 = super.field3599.method1580(arg1, (byte) -107);
            if (super.field3599.field2743) {
                int[][] var4 = this.method2023((byte) 95, arg1, 0);
                int[][] var5 = this.method2023((byte) 117, arg1, 1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                int[] var9 = var4[0];
                int[] var10 = var4[1];
                int[] var11 = var4[2];
                int[] var12 = var5[0];
                int[] var13 = var5[1];
                int[] var14 = var5[2];
                int var15 = this.field1725;
                if (var15 != 1) {
                    if (var15 != 2) {
                        if (var15 != 3) {
                            if (var15 != 4) {
                                if (var15 != 5) {
                                    if (var15 != 6) {
                                        if (~var15 != -8) {
                                            if (~var15 != -9) {
                                                if (var15 != 9) {
                                                    if (var15 != 10) {
                                                        if (~var15 != -12) {
                                                            if (var15 == 12) {
                                                                for (int var57 = 0; ~class449.field6969 < ~var57; ++var57) {
                                                                    int var58 = var12[var57];
                                                                    int var59 = var11[var57];
                                                                    int var60 = var9[var57];
                                                                    int var61 = var10[var57];
                                                                    int var62 = var13[var57];
                                                                    int var63 = var14[var57];
                                                                    var6[var57] = var58 + var60 - (var58 * var60 >> 11);
                                                                    var7[var57] = var61 + var62 - (var61 * var62 >> 11);
                                                                    var8[var57] = -(var59 * var63 >> 11) + var59 + var63;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var50 = 0; class449.field6969 > var50; ++var50) {
                                                                int var51 = var10[var50];
                                                                int var52 = var12[var50];
                                                                int var53 = var13[var50];
                                                                int var54 = var14[var50];
                                                                int var55 = var11[var50];
                                                                int var56 = var9[var50];
                                                                var6[var50] = var56 <= var52 ? var52 - var56 : -var52 + var56;
                                                                var7[var50] = var51 > var53 ? var51 - var53 : -var51 + var53;
                                                                var8[var50] = ~var54 <= ~var55 ? -var55 + var54 : -var54 + var55;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var43 = 0; var43 < class449.field6969; ++var43) {
                                                            int var44 = var11[var43];
                                                            int var45 = var9[var43];
                                                            int var46 = var13[var43];
                                                            int var47 = var12[var43];
                                                            int var48 = var10[var43];
                                                            int var49 = var14[var43];
                                                            var6[var43] = var47 < var45 ? var45 : var47;
                                                            var7[var43] = var46 >= var48 ? var46 : var48;
                                                            var8[var43] = ~var49 > ~var44 ? var44 : var49;
                                                        }
                                                    }
                                                } else {
                                                    for (int var36 = 0; ~var36 > ~class449.field6969; ++var36) {
                                                        int var37 = var11[var36];
                                                        int var38 = var14[var36];
                                                        int var39 = var9[var36];
                                                        int var40 = var12[var36];
                                                        int var41 = var13[var36];
                                                        int var42 = var10[var36];
                                                        var6[var36] = var40 > var39 ? var39 : var40;
                                                        var7[var36] = ~var41 < ~var42 ? var42 : var41;
                                                        var8[var36] = var38 > var37 ? var37 : var38;
                                                    }
                                                }
                                            } else {
                                                for (int var32 = 0; ~var32 > ~class449.field6969; ++var32) {
                                                    int var33 = var11[var32];
                                                    int var34 = var9[var32];
                                                    int var35 = var10[var32];
                                                    var6[var32] = ~var34 == -1 ? 0 : -((-var12[var32] + 4096 << 12) / var34) + 4096;
                                                    var7[var32] = ~var35 == -1 ? 0 : -((-var13[var32] + 4096 << 12) / var35) + 4096;
                                                    var8[var32] = var33 == 0 ? 0 : -((4096 - var14[var32] << 12) / var33) + 4096;
                                                }
                                            }
                                        } else {
                                            for (int var28 = 0; class449.field6969 > var28; ++var28) {
                                                int var29 = var10[var28];
                                                int var30 = var11[var28];
                                                int var31 = var9[var28];
                                                var6[var28] = ~var31 == -4097 ? 4096 : (var12[var28] << 12) / (4096 - var31);
                                                var7[var28] = ~var29 != -4097 ? (var13[var28] << 12) / (-var29 + 4096) : 4096;
                                                var8[var28] = ~var30 != -4097 ? (var14[var28] << 12) / (-var30 + 4096) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var24 = 0; ~class449.field6969 < ~var24; ++var24) {
                                            int var25 = var14[var24];
                                            int var26 = var13[var24];
                                            int var27 = var12[var24];
                                            var6[var24] = var27 >= 2048 ? 4096 - ((-var9[var24] + 4096) * (-var27 + 4096) >> 11) : var9[var24] * var27 >> 11;
                                            var7[var24] = ~var26 <= -2049 ? -((4096 - var26) * (-var10[var24] + 4096) >> 11) + 4096 : var10[var24] * var26 >> 11;
                                            var8[var24] = var25 >= 2048 ? -((4096 - var11[var24]) * (-var25 + 4096) >> 11) + 4096 : var11[var24] * var25 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~var23 > ~class449.field6969; ++var23) {
                                        var6[var23] = 4096 - ((-var9[var23] + 4096) * (-var12[var23] + 4096) >> 12);
                                        var7[var23] = -((4096 - var10[var23]) * (-var13[var23] + 4096) >> 12) + 4096;
                                        var8[var23] = -((4096 - var14[var23]) * (-var11[var23] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var19 = 0; ~var19 > ~class449.field6969; ++var19) {
                                    int var20 = var14[var19];
                                    int var21 = var13[var19];
                                    int var22 = var12[var19];
                                    var6[var19] = ~var22 == -1 ? 4096 : (var9[var19] << 12) / var22;
                                    var7[var19] = ~var21 == -1 ? 4096 : (var10[var19] << 12) / var21;
                                    var8[var19] = var20 == 0 ? 4096 : (var11[var19] << 12) / var20;
                                }
                            }
                        } else {
                            for (int var18 = 0; var18 < class449.field6969; ++var18) {
                                var6[var18] = var9[var18] * var12[var18] >> 12;
                                var7[var18] = var10[var18] * var13[var18] >> 12;
                                var8[var18] = var11[var18] * var14[var18] >> 12;
                            }
                        }
                    } else {
                        for (int var17 = 0; ~class449.field6969 < ~var17; ++var17) {
                            var6[var17] = var9[var17] - var12[var17];
                            var7[var17] = var10[var17] + -var13[var17];
                            var8[var17] = var11[var17] + -var14[var17];
                        }
                    }
                } else {
                    for (int var16 = 0; class449.field6969 > var16; ++var16) {
                        var6[var16] = var9[var16] + var12[var16];
                        var7[var16] = var10[var16] + var13[var16];
                        var8[var16] = var11[var16] + var14[var16];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var65) {
            throw class590.method4333(var65, field1728[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIII)V", line = 630)
    public static final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field1726;
            if (class504.method3798(127, arg6)) {
                int var10 = 0;
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (arg2 < -12) {
                    if (class316.field5141) {
                        var14 = class131.field1868;
                        var12 = class548.field8054;
                        var11 = class214.field3373;
                        var13 = class651.field9330;
                        var10 = class96.field1403;
                        class131.field1868 = 1;
                    }
                    if (class97.field1434[arg6] == null) {
                        class75.method787(45, arg3, arg7, -1, class309.field5028[arg6], ~arg1 > -1, arg5, arg0, arg8, arg1, arg4);
                    } else {
                        class75.method787(13, arg3, arg7, -1, class97.field1434[arg6], arg1 < 0, arg5, arg0, arg8, arg1, arg4);
                    }
                    if (class316.field5141) {
                        if (arg1 >= 0 && class131.field1868 == 2) {
                            class458.method3552(class214.field3373, class548.field8054, class651.field9330, class96.field1403, -107);
                        }
                        class96.field1403 = var10;
                        class131.field1868 = var14;
                        class214.field3373 = var11;
                        class548.field8054 = var12;
                        class651.field9330 = var13;
                    }
                }
            } else if (~arg1 != 0) {
                class178.field2871[arg1] = true;
            } else {
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class178.field2871[var9] = true;
                }
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field1728[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1173(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1174(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
