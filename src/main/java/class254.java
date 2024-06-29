import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class254 extends class149 {

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    private int field3511 = 6;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V", line = 4)
    public class254() {
        super(2, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)Z", line = 8)
    public static final boolean method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3515;
        if (arg0 != 16102) {
            method1654(-11, -58, 116, 16, 31, 4);
        }
        for (int var6 = arg4; ~arg3 <= ~var6; ++var6) {
            for (int var7 = arg5; ~var7 >= ~arg2; ++var7) {
                if (class504.field7531[var6][var7] == arg1 && ~class35.field541[var6][var7] >= -2) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)Lps;", line = 43)
    public static final class5 method1655(int arg0) {
        ++field3519;
        if (class135.field1967 != null && class266.field3711 != null) {
            if (arg0 <= 19) {
                method1657(-95);
            }
            for (class5 var1 = (class5) class266.field3711.method74(100); var1 != null; var1 = (class5) class266.field3711.method74(-58)) {
                class24 var2 = class135.field1953.method356(-1, var1.field65);
                if (var2 != null && var2.field374 && var2.method194((byte) 83, class135.field1954)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method92(int arg0, int arg1) {
        ++field3517;
        int[] var3 = super.field2152.method2891(arg1, (byte) 116);
        if (arg0 != -10835) {
            this.field3511 = -37;
        }
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, arg1);
            int[] var5 = this.method983(1, 24824, arg1);
            int var6 = this.field3511;
            if (~var6 != -2) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (var6 != 10) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; ~var7 > ~class316.field4838; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var8 - (var8 * var9 >> 11) + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; var10 < class316.field4838; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = var11 >= var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class316.field4838; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var14 <= var15 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class316.field4838 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 >= var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; var19 < class316.field4838; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 != -1 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~class316.field4838 < ~var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; class316.field4838 > var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~class316.field4838 < ~var25; ++var25) {
                                    var3[var25] = -((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~class316.field4838 < ~var26; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class316.field4838 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class316.field4838 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~var30 > ~class316.field4838; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B[[I)V", line = 315)
    public static final void method1656(byte arg0, int[][] arg1) {
        ++field3512;
        class23.field356 = arg1;
        if (arg0 < 123) {
            field3513 = -18;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[[I", line = 327)
    public final int[][] method139(byte arg0, int arg1) {
        ++field3521;
        if (arg0 >= -45) {
            field3513 = -111;
        }
        int[][] var3 = super.field2147.method2726(arg1, 0);
        if (super.field2147.field6664) {
            int[][] var4 = this.method984((byte) 127, 0, arg1);
            int[][] var5 = this.method984((byte) 117, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3511;
            if (~var15 != -2) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; ~var16 > ~class316.field4838; ++var16) {
                                                                int var17 = var14[var16];
                                                                int var18 = var13[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var19 * var21 >> 11) + var21 + var19;
                                                                var7[var16] = var20 - -var18 + -(var18 * var20 >> 11);
                                                                var8[var16] = -(var17 * var22 >> 11) + var22 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class316.field4838 < ~var23; ++var23) {
                                                            int var24 = var14[var23];
                                                            int var25 = var12[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var10[var23];
                                                            int var29 = var9[var23];
                                                            var6[var23] = ~var29 >= ~var25 ? -var29 + var25 : -var25 + var29;
                                                            var7[var23] = ~var26 > ~var28 ? -var26 + var28 : var26 - var28;
                                                            var8[var23] = ~var27 >= ~var24 ? var24 - var27 : -var24 + var27;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class316.field4838 > var30; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var9[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var10[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = var32 <= var34 ? var34 : var32;
                                                        var7[var30] = var35 <= var31 ? var31 : var35;
                                                        var8[var30] = var36 > var33 ? var36 : var33;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~var37 > ~class316.field4838; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var13[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var41 > var43 ? var43 : var41;
                                                    var7[var37] = var42 > var38 ? var38 : var42;
                                                    var8[var37] = ~var39 > ~var40 ? var39 : var40;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class316.field4838; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((4096 - var12[var44] << 12) / var45) + 4096;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = var46 != 0 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class316.field4838 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var10[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = ~var49 != -4097 ? (var12[var48] << 12) / (4096 - var49) : 4096;
                                            var7[var48] = ~var50 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var50);
                                            var8[var48] = ~var51 == -4097 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class316.field4838; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = var53 < 2048 ? var9[var52] * var53 >> 11 : 4096 - ((4096 - var9[var52]) * (-var53 + 4096) >> 11);
                                        var7[var52] = var55 >= 2048 ? -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096 : var10[var52] * var55 >> 11;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class316.field4838; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var10[var56]) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class316.field4838 < ~var57; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 != 0 ? (var9[var57] << 12) / var58 : 4096;
                                var7[var57] = ~var59 != -1 ? (var10[var57] << 12) / var59 : 4096;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class316.field4838 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class316.field4838; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] - var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~class316.field4838 < ~var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)V", line = 645)
    public static final void method1657(int arg0) {
        ++field3520;
        for (class434 var1 = (class434) class494.field7232.method1970(arg0 + 14243); var1 != null; var1 = (class434) class494.field7232.method1960(24)) {
            class223 var2 = var1.field6449;
            if (~class195.field2770 == ~var2.field2210 && ~var2.field3125 <= ~class405.field6116) {
                if (~class405.field6116 <= ~var2.field3147) {
                    if (var2.field3155 > 0) {
                        class194 var3 = class151.field2174[var2.field3155 + -1];
                        if (var3 != null && ~var3.field2217 <= -1 && var3.field2217 < class96.field1403 * 128 && ~var3.field2215 <= -1 && ~var3.field2215 > ~(class485.field7122 * 128)) {
                            var2.method1508(arg0 ^ 26912, class500.method2985(var3.field2217, 5293, var2.field2210, var3.field2215) + -var2.field3139, class405.field6116, var3.field2217, var3.field2215);
                        }
                    }
                    if (var2.field3155 < 0) {
                        int var4 = -var2.field3155 - 1;
                        class322 var5;
                        if (class452.field6641 == var4) {
                            var5 = class339.field5365;
                        } else {
                            var5 = class439.field6539[var4];
                        }
                        if (var5 != null && var5.field2217 >= 0 && ~(class96.field1403 * 128) < ~var5.field2217 && var5.field2215 >= 0 && class485.field7122 * 128 > var5.field2215) {
                            var2.method1508(-24131, class500.method2985(var5.field2217, 5293, var2.field2210, var5.field2215) + -var2.field3139, class405.field6116, var5.field2217, var5.field2215);
                        }
                    }
                    var2.method1507(class501.field7485, arg0 + 14285);
                    class223.method1511(var2, true);
                }
            } else {
                var1.method2785((byte) -120);
                var2.method1505(-31594);
            }
        }
        if (arg0 != -14179) {
            field3513 = -124;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I", line = 705)
    public static final int method1658(int arg0, int arg1, boolean arg2) {
        ++field3518;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        if (!arg2) {
            field3513 = 22;
        }
        return (133769347 & var5) >> 19;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBLtl;)V", line = 722)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field3514;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field2148 = ~arg2.method618((byte) 100) == -2;
            }
        } else {
            this.field3511 = arg2.method618((byte) 100);
        }
        if (arg1 != 35) {
            this.field3511 = 34;
        }
    }
}
