import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class311 extends class153 {

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "Lvj;")
    public static class373 field3975 = new class373(103, -1);

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
    public static int field3978 = 0;

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
    public static int field3979 = 0;

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "S")
    public static short field3976 = 32767;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILqt;IIIIIIII)Z", line = 3)
    public static final boolean method1724(int arg0, int arg1, class542 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field3972;
        int var11 = arg3;
        int var12 = arg9;
        byte var13 = 64;
        if (arg1 <= 99) {
            method1732(-41, -62, -30, (class437) null, -101);
        }
        byte var14 = 64;
        int var15 = -var13 + arg3;
        int var16 = -var14 + arg9;
        class303.field3871[var13][var14] = 99;
        class585.field8491[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class104.field1271[var17] = arg3;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class468.field6544[var10001] = arg9;
        int[][] var19 = arg2.field7922;
        while (~var26 != ~var18) {
            var12 = class468.field6544[var18];
            var11 = class104.field1271[var18];
            int var20 = -var16 + var12;
            var18 = var18 + 1 & 4095;
            int var21 = var11 - var15;
            int var22 = -arg2.field7939 + var11;
            int var23 = -arg2.field7915 + var12;
            if (arg6 != -4) {
                if (~arg6 != 2) {
                    if (~arg6 != 1) {
                        if (arg6 != -1) {
                            if (arg6 != 0 && ~arg6 != -2 && arg6 != 2 && ~arg6 != -4 && ~arg6 != -10) {
                                if (arg2.method3156(arg0, arg10, var12, var11, arg6, (byte) 126, 2, arg7)) {
                                    class152.field1855 = var11;
                                    class348.field4484 = var12;
                                    return true;
                                }
                            } else if (arg2.method3154(arg0, arg7, arg6, arg10, var11, 2, (byte) -10, var12)) {
                                class152.field1855 = var11;
                                class348.field4484 = var12;
                                return true;
                            }
                        } else if (arg2.method3157(2, var11, arg7, arg4, arg10, arg8, -113, var12, arg5)) {
                            class152.field1855 = var11;
                            class348.field4484 = var12;
                            return true;
                        }
                    } else if (arg2.method3158(arg5, arg8, -69, arg7, arg10, var12, 2, 2, var11, arg4)) {
                        class152.field1855 = var11;
                        class348.field4484 = var12;
                        return true;
                    }
                } else if (class320.method1765(arg4, 2, -101, arg10, var11, arg7, var12, 2, arg8)) {
                    class152.field1855 = var11;
                    class348.field4484 = var12;
                    return true;
                }
            } else if (~arg10 == ~var11 && ~arg7 == ~var12) {
                class152.field1855 = var11;
                class348.field4484 = var12;
                return true;
            }
            int var25 = class585.field8491[var21][var20] - -1;
            if (var21 > 0 && ~class303.field3871[var21 + -1][var20] == -1 && (1134821376 & var19[var22 + -1][var23]) == 0 && ~(1310982144 & var19[var22 + -1][var23 + 1]) == -1) {
                class104.field1271[var26] = var11 + -1;
                class468.field6544[var26] = var12;
                var26 = 4095 & var26 + 1;
                class303.field3871[var21 + -1][var20] = 2;
                class585.field8491[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class303.field3871[var21 - -1][var20] == 0 && ~(var19[var22 + 2][var23] & 1625554944) == -1 && ~(var19[var22 + 2][var23 - -1] & 2015625216) == -1) {
                class104.field1271[var26] = var11 + 1;
                class468.field6544[var26] = var12;
                class303.field3871[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 4095;
                class585.field8491[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class303.field3871[var21][var20 + -1] == 0 && ~(var19[var22][var23 - 1] & 1134821376) == -1 && (1625554944 & var19[var22 - -1][var23 + -1]) == 0) {
                class104.field1271[var26] = var11;
                class468.field6544[var26] = var12 + -1;
                var26 = 4095 & var26 - -1;
                class303.field3871[var21][var20 + -1] = 1;
                class585.field8491[var21][var20 + -1] = var25;
            }
            if (var20 < 126 && class303.field3871[var21][var20 + 1] == 0 && ~(var19[var22][var23 - -2] & 1310982144) == -1 && ~(2015625216 & var19[var22 + 1][var23 + 2]) == -1) {
                class104.field1271[var26] = var11;
                class468.field6544[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class303.field3871[var21][var20 + 1] = 4;
                class585.field8491[var21][var20 - -1] = var25;
            }
            if (var21 > 0 && var20 > 0 && ~class303.field3871[var21 + -1][var20 + -1] == -1 && (1336147968 & var19[var22 + -1][var23]) == 0 && (1134821376 & var19[var22 + -1][var23 - 1]) == 0 && (var19[var22][var23 + -1] & 1675886592) == 0) {
                class104.field1271[var26] = var11 + -1;
                class468.field6544[var26] = var12 + -1;
                class303.field3871[var21 + -1][var20 + -1] = 3;
                var26 = 4095 & var26 + 1;
                class585.field8491[var21 - 1][var20 + -1] = var25;
            }
            if (var21 < 126 && var20 > 0 && ~class303.field3871[var21 + 1][var20 + -1] == -1 && ~(1675886592 & var19[var22 + 1][var23 + -1]) == -1 && (var19[var22 - -2][var23 + -1] & 1625554944) == 0 && (2028208128 & var19[var22 - -2][var23]) == 0) {
                class104.field1271[var26] = var11 + 1;
                class468.field6544[var26] = var12 + -1;
                var26 = 4095 & var26 + 1;
                class303.field3871[var21 + 1][var20 + -1] = 9;
                class585.field8491[var21 + 1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && class303.field3871[var21 + -1][var20 - -1] == 0 && ~(var19[var22 + -1][var23 + 1] & 1336147968) == -1 && (var19[var22 + -1][var23 + 2] & 1310982144) == 0 && ~(2116288512 & var19[var22][var23 - -2]) == -1) {
                class104.field1271[var26] = var11 + -1;
                class468.field6544[var26] = var12 - -1;
                var26 = var26 + 1 & 4095;
                class303.field3871[var21 + -1][var20 + 1] = 6;
                class585.field8491[var21 - 1][var20 + 1] = var25;
            }
            if (~var21 > -127 && ~var20 > -127 && class303.field3871[var21 + 1][var20 + 1] == 0 && (2116288512 & var19[var22 + 1][var23 + 2]) == 0 && (var19[var22 - -2][var23 + 2] & 2015625216) == 0 && ~(var19[var22 - -2][var23 + 1] & 2028208128) == -1) {
                class104.field1271[var26] = var11 + 1;
                class468.field6544[var26] = var12 + 1;
                class303.field3871[var21 - -1][var20 - -1] = 12;
                var26 = var26 + 1 & 4095;
                class585.field8491[var21 + 1][var20 + 1] = var25;
            }
        }
        class152.field1855 = var11;
        class348.field4484 = var12;
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 355)
    public static void method1725(byte arg0) {
        if (arg0 != 32) {
            method1732(-14, -109, -46, (class437) null, 20);
        }
        field3975 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([I[I[IILee;II)V", line = 365)
    private final void method1726(int[] arg0, int[] arg1, int[] arg2, int arg3, class579 arg4, int arg5, int arg6) {
        ++field3968;
        class120 var8 = super.field1886[arg5][arg3];
        if (arg6 >= -103) {
            this.method1731(33, (int[]) null, -121, 34, -46, (class579) null, -75, -6, (boolean[][]) null, -60, -77, (int[]) null);
        }
        if (var8 != null) {
            if ((var8.field1511 & 2) == 0) {
                int var9 = super.field2115 * arg5;
                int var10 = super.field2115 + var9;
                int var11 = super.field2115 * arg3;
                int var12 = super.field2115 + var11;
                int var17;
                int var18;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if ((1 & var8.field1511) == 0) {
                    int var13 = super.field1880[arg5][arg3];
                    int var14 = super.field1880[arg5 + 1][arg3];
                    int var15 = super.field1880[arg5 + 1][arg3 + 1];
                    int var16 = super.field1880[arg5][arg3 + 1];
                    int var19;
                    if (super.field1868 == -1) {
                        var17 = (super.field1876 * var11 + super.field1873 * var9 + super.field1871 * var13 >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var17) {
                            return;
                        }
                        var18 = (super.field1873 * var10 - -(super.field1871 * var14) - -(super.field1876 * var11) >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var18) {
                            return;
                        }
                        var19 = (super.field1873 * var10 + super.field1876 * var12 + super.field1871 * var15 >> 15) + super.field1877;
                        if (~var19 >= ~super.field1872.field6149) {
                            return;
                        }
                        var20 = super.field1877 - -(super.field1876 * var12 + (super.field1873 * var9 - -(super.field1871 * var16)) >> 15);
                        if (~super.field1872.field6149 <= ~var20) {
                            return;
                        }
                    } else {
                        var20 = super.field1868;
                        var19 = super.field1868;
                        var18 = super.field1868;
                        var17 = super.field1868;
                    }
                    var21 = (super.field1878 * var13 + super.field1885 * var11 + super.field1883 * var9 >> 15) + super.field1882;
                    var22 = arg4.field8448 - -(super.field1872.field6178 * var21 / var17);
                    var23 = (super.field1879 * var11 + super.field1881 * var13 + super.field1866 * var9 >> 15) + super.field1887;
                    var24 = super.field1872.field6189 * var23 / var17 + arg4.field8444;
                    var25 = super.field1882 - -(super.field1885 * var11 + (super.field1883 * var10 - -(super.field1878 * var14)) >> 15);
                    var26 = super.field1872.field6178 * var25 / var18 + arg4.field8448;
                    var27 = (super.field1879 * var11 + super.field1881 * var14 + super.field1866 * var10 >> 15) + super.field1887;
                    int var28 = (super.field1885 * var12 + (super.field1883 * var10 - -(super.field1878 * var15)) >> 15) + super.field1882;
                    var29 = super.field1872.field6189 * var27 / var18 + arg4.field8444;
                    int var30 = (super.field1866 * var10 + super.field1881 * var15 + super.field1879 * var12 >> 15) + super.field1887;
                    var31 = super.field1872.field6178 * var28 / var19 + arg4.field8448;
                    var32 = super.field1882 - -(super.field1883 * var9 + (super.field1878 * var16 - -(super.field1885 * var12)) >> 15);
                    var33 = super.field1872.field6189 * var30 / var19 + arg4.field8444;
                    var34 = (super.field1881 * var16 + super.field1866 * var9 - -(super.field1879 * var12) >> 15) + super.field1887;
                    var35 = super.field1872.field6178 * var32 / var20 + arg4.field8448;
                    var36 = super.field1872.field6189 * var34 / var20 + arg4.field8444;
                } else {
                    int var37 = super.field1880[arg5][arg3];
                    int var39;
                    if (~super.field1868 == 0) {
                        int var38 = super.field1871 * var37;
                        var17 = (super.field1873 * var9 - -(super.field1876 * var11) + var38 >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var17) {
                            return;
                        }
                        var18 = (super.field1876 * var11 + super.field1873 * var10 + var38 >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var18) {
                            return;
                        }
                        var39 = (super.field1873 * var10 + super.field1876 * var12 + var38 >> 15) + super.field1877;
                        if (var39 <= super.field1872.field6149) {
                            return;
                        }
                        var20 = (super.field1876 * var12 + (super.field1873 * var9 - -var38) >> 15) + super.field1877;
                        if (~var20 >= ~super.field1872.field6149) {
                            return;
                        }
                    } else {
                        var20 = super.field1868;
                        var39 = super.field1868;
                        var18 = super.field1868;
                        var17 = super.field1868;
                    }
                    int var40 = super.field1878 * var37;
                    var21 = (super.field1885 * var11 + super.field1883 * var9 + var40 >> 15) + super.field1882;
                    int var41 = super.field1881 * var37;
                    var22 = super.field1872.field6178 * var21 / var17 + arg4.field8448;
                    var23 = (super.field1866 * var9 + var41 - -(super.field1879 * var11) >> 15) + super.field1887;
                    var24 = super.field1872.field6189 * var23 / var17 + arg4.field8444;
                    var25 = (super.field1885 * var11 + super.field1883 * var10 + var40 >> 15) + super.field1882;
                    var26 = arg4.field8448 - -(super.field1872.field6178 * var25 / var18);
                    var27 = super.field1887 - -(super.field1866 * var10 + super.field1879 * var11 + var41 >> 15);
                    int var42 = super.field1882 - -(super.field1885 * var12 + (super.field1883 * var10 - -var40) >> 15);
                    var29 = arg4.field8444 - -(super.field1872.field6189 * var27 / var18);
                    int var43 = (super.field1866 * var10 + var41 - -(super.field1879 * var12) >> 15) + super.field1887;
                    var31 = super.field1872.field6178 * var42 / var39 + arg4.field8448;
                    var33 = super.field1872.field6189 * var43 / var39 + arg4.field8444;
                    var32 = (super.field1885 * var12 + super.field1883 * var9 + var40 >> 15) + super.field1882;
                    var35 = super.field1872.field6178 * var32 / var20 + arg4.field8448;
                    var34 = super.field1887 - -(super.field1866 * var9 + super.field1879 * var12 + var41 >> 15);
                    var36 = super.field1872.field6189 * var34 / var20 + arg4.field8444;
                }
                if ((-var35 + var31) * (-var36 + var29) - (-var35 + var26) * (-var36 + var33) > 0) {
                    arg4.field8453 = var31 < 0 || ~var35 > -1 || ~var26 > -1 || arg4.field8446 < var31 || arg4.field8446 < var35 || ~arg4.field8446 > ~var26;
                    if (var8.field1514 < 0) {
                        arg4.method3378(var33, var36, var29, var31, var35, var26, var8.field1510 & 65535, 65535 & var8.field1512, 65535 & var8.field1516);
                    } else {
                        if (this.method856(super.field1872.field2481.method119(-113, var8.field1514).field2657)) {
                            arg4.field8441 = 100;
                        }
                        arg4.method3374(var33, var36, var29, var31, var35, var26, var8.field1510 & 65535, 65535 & var8.field1512, var8.field1516 & 65535, var21, var25, var32, var23, var27, var34, var17, var18, var20, var8.field1514);
                        arg4.field8441 = 0;
                    }
                }
                if (~((-var26 + var22) * (-var29 + var36) + -((-var26 + var35) * (-var29 + var24))) < -1) {
                    arg4.field8453 = ~var22 > -1 || ~var26 > -1 || var35 < 0 || arg4.field8446 < var22 || var26 > arg4.field8446 || var35 > arg4.field8446;
                    if (var8.field1514 >= 0) {
                        if (this.method856(super.field1872.field2481.method119(-117, var8.field1514).field2657)) {
                            arg4.field8441 = 100;
                        }
                        arg4.method3374(var24, var29, var36, var22, var26, var35, 65535 & var8.field1515, var8.field1516 & 65535, var8.field1512 & 65535, var21, var25, var32, var23, var27, var34, var17, var18, var20, var8.field1514);
                        arg4.field8441 = 0;
                        return;
                    }
                    arg4.method3378(var24, var29, var36, var22, var26, var35, var8.field1515 & 65535, var8.field1516 & 65535, 65535 & var8.field1512);
                }
            }
        } else {
            class223 var44 = super.field1875[arg5][arg3];
            if (var44 != null) {
                if (~super.field1868 == 0) {
                    for (int var45 = 0; ~var45 > ~var44.field2746; ++var45) {
                        int var46 = (arg5 << super.field2111) + var44.field2743[var45];
                        short var47 = var44.field2748[var45];
                        int var48 = (arg3 << super.field2111) + var44.field2747[var45];
                        int var49 = (super.field1876 * var48 + (super.field1873 * var46 - -(super.field1871 * var47)) >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var49) {
                            return;
                        }
                        int var50 = super.field1882 - -(super.field1885 * var48 + super.field1883 * var46 - -(super.field1878 * var47) >> 15);
                        int var51 = (super.field1881 * var47 + super.field1866 * var46 - -(super.field1879 * var48) >> 15) + super.field1887;
                        arg1[var45] = super.field1872.field6178 * var50 / var49 + arg4.field8448;
                        arg2[var45] = super.field1872.field6189 * var51 / var49 + arg4.field8444;
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~var44.field2746; ++var52) {
                        int var92 = (arg5 << super.field2111) + var44.field2743[var52];
                        short var93 = var44.field2748[var52];
                        int var94 = (arg3 << super.field2111) + var44.field2747[var52];
                        int var95 = (super.field1881 * var93 + super.field1866 * var92 - -(super.field1879 * var94) >> 15) + super.field1887;
                        int var96 = (super.field1885 * var94 + super.field1883 * var92 + super.field1878 * var93 >> 15) + super.field1882;
                        arg1[var52] = super.field1872.field6178 * var96 / super.field1868 + arg4.field8448;
                        arg2[var52] = super.field1872.field6189 * var95 / super.field1868 + arg4.field8444;
                    }
                }
                if (var44.field2744 != null) {
                    int var53 = super.field1880[arg5][arg3];
                    int var54 = super.field1880[arg5 + 1][arg3];
                    int var55 = super.field1880[arg5][arg3 + 1];
                    int var56 = super.field2115 * arg5;
                    int var57 = var56 - -super.field2115;
                    int var58 = super.field2115 * arg3;
                    int var59 = var58 - -super.field2115;
                    int var60 = (super.field1885 * var58 + super.field1883 * var56 + super.field1878 * var53 >> 15) + super.field1882;
                    int var61 = (super.field1879 * var58 + (super.field1866 * var56 - -(super.field1881 * var53)) >> 15) + super.field1887;
                    int var62 = super.field1877 - -(super.field1871 * var53 + super.field1876 * var58 + super.field1873 * var56 >> 15);
                    int var63 = super.field1882 - -(super.field1885 * var58 + super.field1883 * var57 + super.field1878 * var54 >> 15);
                    int var64 = super.field1887 - -(super.field1879 * var58 + (super.field1866 * var57 - -(super.field1881 * var54)) >> 15);
                    int var65 = (super.field1876 * var58 + super.field1873 * var57 + super.field1871 * var54 >> 15) + super.field1877;
                    int var66 = (super.field1885 * var59 + (super.field1883 * var56 - -(super.field1878 * var55)) >> 15) + super.field1882;
                    int var67 = (super.field1879 * var59 + (super.field1866 * var56 - -(super.field1881 * var55)) >> 15) + super.field1887;
                    int var68 = (super.field1871 * var55 + super.field1876 * var59 + super.field1873 * var56 >> 15) + super.field1877;
                    for (int var69 = 0; ~var69 > ~var44.field2745; ++var69) {
                        short var70 = var44.field2751[var69];
                        short var71 = var44.field2742[var69];
                        short var72 = var44.field2752[var69];
                        int var73 = arg1[var70];
                        int var74 = arg1[var71];
                        int var75 = arg1[var72];
                        int var76 = arg2[var70];
                        int var77 = arg2[var71];
                        int var78 = arg2[var72];
                        if ((var78 - var77) * (-var74 + var73) + -((-var74 + var75) * (-var77 + var76)) > 0) {
                            arg4.field8453 = var73 < 0 || var74 < 0 || ~var75 > -1 || ~arg4.field8446 > ~var73 || var74 > arg4.field8446 || ~arg4.field8446 > ~var75;
                            short var79 = var44.field2744[var69];
                            if (var79 == -1) {
                                int var80 = var44.field2750[var69];
                                if (~var80 != 0) {
                                    arg4.method3378(var76, var77, var78, var73, var74, var75, class10.method52(31129, var44.field2741[var70], var80), class10.method52(31129, var44.field2741[var71], var80), class10.method52(31129, var44.field2741[var72], var80));
                                }
                            } else {
                                if (this.method856(super.field1872.field2481.method119(-121, var79).field2657)) {
                                    arg4.field8441 = 100;
                                }
                                arg4.method3374(var76, var77, var78, var73, var74, var75, var44.field2741[var70], var44.field2741[var71], var44.field2741[var72], var60, var63, var66, var61, var64, var67, var62, var65, var68, var79);
                                arg4.field8441 = 0;
                            }
                        }
                    }
                } else {
                    for (int var81 = 0; ~var81 > ~var44.field2745; ++var81) {
                        short var82 = var44.field2751[var81];
                        short var83 = var44.field2742[var81];
                        short var84 = var44.field2752[var81];
                        int var85 = arg1[var82];
                        int var86 = arg1[var83];
                        int var87 = arg1[var84];
                        int var88 = arg2[var82];
                        int var89 = arg2[var83];
                        int var90 = arg2[var84];
                        if ((-var86 + var85) * (-var89 + var90) + -((-var86 + var87) * (-var89 + var88)) > 0) {
                            int var91 = var44.field2750[var81];
                            if (~var91 != 0) {
                                arg4.field8453 = ~var85 > -1 || var86 < 0 || var87 < 0 || var85 > arg4.field8446 || ~arg4.field8446 > ~var86 || arg4.field8446 < var87;
                                arg4.method3378(var88, var89, var90, var85, var86, var87, class10.method52(31129, var44.field2741[var82], var91), class10.method52(31129, var44.field2741[var83], var91), class10.method52(31129, var44.field2741[var84], var91));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILet;IZI)V", line = 736)
    public static final void method1727(int arg0, class509 arg1, int arg2, boolean arg3, int arg4) {
        ++field3967;
        int var5 = arg1.field7094;
        if (arg0 <= 54) {
            field3975 = null;
        }
        int var6 = arg1.field7059;
        if (arg1.field7126 == 0) {
            arg1.field7094 = arg1.field7095;
        } else if (arg1.field7126 == 1) {
            arg1.field7094 = -arg1.field7095 + arg2;
        } else if (arg1.field7126 == 2) {
            arg1.field7094 = arg1.field7095 * arg2 >> 14;
        }
        if (arg1.field7096 == 0) {
            arg1.field7059 = arg1.field7090;
        } else if (arg1.field7096 != 1) {
            if (~arg1.field7096 == -3) {
                arg1.field7059 = arg1.field7090 * arg4 >> 14;
            }
        } else {
            arg1.field7059 = -arg1.field7090 + arg4;
        }
        if (~arg1.field7126 == -5) {
            arg1.field7094 = arg1.field7137 * arg1.field7059 / arg1.field7083;
        }
        if (arg1.field7096 == 4) {
            arg1.field7059 = arg1.field7094 * arg1.field7083 / arg1.field7137;
        }
        if (class2.field8 && (~client.method1412(arg1).field3493 != -1 || ~arg1.field7197 == -1)) {
            if (~arg1.field7059 > -6 && arg1.field7094 < 5) {
                arg1.field7094 = 5;
                arg1.field7059 = 5;
            } else {
                if (arg1.field7094 <= 0) {
                    arg1.field7094 = 5;
                }
                if (~arg1.field7059 >= -1) {
                    arg1.field7059 = 5;
                }
            }
        }
        if (class369.field4875 == arg1.field7154) {
            class124.field1530 = arg1;
        }
        if (arg3 && arg1.field7069 != null) {
            if (~arg1.field7094 != ~var5 || ~arg1.field7059 != ~var6) {
                class503 var7 = new class503();
                var7.field6975 = arg1.field7069;
                var7.field6973 = arg1;
                class119.field1503.method1040(var7, -102);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZI)Z", line = 816)
    public static final boolean method1728(int arg0, boolean arg1, int arg2) {
        ++field3970;
        if (arg1) {
            method1732(-88, 26, 92, (class437) null, 5);
        }
        return (32 & arg0) != 0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[IIIII[[ZILee;[II)V", line = 827)
    private final void method1729(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, int arg8, class579 arg9, int[] arg10, int arg11) {
        ++field3973;
        int var13 = (-arg11 + arg4) * arg0 / 256;
        if (arg5 < 123) {
            field3975 = null;
        }
        arg9.field8451 = false;
        int var14 = arg0 >> 8;
        arg9.field8445 = false;
        int var15 = arg6;
        int var16 = arg1 + var13;
        for (int var17 = arg8; ~var17 > ~arg3; ++var17) {
            for (int var18 = arg11; arg4 > var18; ++var18) {
                if (arg7[-arg8 + var17][var18 - arg11]) {
                    if (super.field1870[var17][var18] != null) {
                        class234 var33 = super.field1870[var17][var18];
                        if (var33.field2879 != -1 && ~(var33.field2876 & 2) == -1 && var33.field2874 == 0) {
                            int var34 = super.field1872.method2616(var33.field2879);
                            arg9.method3378(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, class10.method52(31129, var33.field2881, var34), class10.method52(31129, var33.field2882, var34), class10.method52(31129, var33.field2875, var34));
                            arg9.method3378(var16, var16, var16 - var14, var15, var14 + var15, var15, class10.method52(31129, var33.field2873, var34), class10.method52(31129, var33.field2875, var34), class10.method52(31129, var33.field2882, var34));
                        } else if (var33.field2874 != 0) {
                            int var35 = var33.field2874;
                            arg9.method3375(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class98.method598(var33.field2881 & -16777216, var35, 19099), class98.method598(-16777216 & var33.field2882, var35, 19099), class98.method598(var33.field2875 & -16777216, var35, 19099));
                            arg9.method3375(var16, var16, -var14 + var16, var15, var14 + var15, var15, class98.method598(var33.field2873 & -16777216, var35, 19099), class98.method598(var33.field2875 & -16777216, var35, 19099), class98.method598(var33.field2882 & -16777216, var35, 19099));
                        } else {
                            arg9.method3375(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, var33.field2881, var33.field2882, var33.field2875);
                            arg9.method3375(var16, var16, -var14 + var16, var15, var14 + var15, var15, var33.field2873, var33.field2875, var33.field2882);
                        }
                    } else if (super.field1867[var17][var18] != null) {
                        class100 var19 = super.field1867[var17][var18];
                        for (int var20 = 0; var20 < var19.field1246; ++var20) {
                            arg10[var20] = var15 - -(var19.field1247[var20] * var14 / super.field2115);
                            arg2[var20] = -(var19.field1243[var20] * var14 / super.field2115) + var16;
                        }
                        for (int var21 = 0; ~var21 > ~var19.field1245; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 - -1;
                            int var24 = var23 + 1;
                            int var25 = arg10[var22];
                            int var26 = arg10[var23];
                            int var27 = arg10[var24];
                            int var28 = arg2[var22];
                            int var29 = arg2[var23];
                            int var30 = arg2[var24];
                            if (var19.field1244 != null && ~var19.field1244[var21] != -1 && (var19.field1241 == null || var19.field1241 != null && var19.field1241[var21] == -1)) {
                                int var31 = var19.field1244[var21];
                                arg9.method3375(var28, var29, var30, var25, var26, var27, class98.method598(-(var19.field1242[var22] & -16777216) + -16777216, var31, 19099), class98.method598(-(-16777216 & var19.field1242[var23]) + -16777216, var31, 19099), class98.method598(-(var19.field1242[var24] & -16777216) + -16777216, var31, 19099));
                            } else if (var19.field1241 != null && ~var19.field1241[var21] != 0) {
                                int var32 = super.field1872.method2616(var19.field1241[var21]);
                                arg9.method3378(var28, var29, var30, var25, var26, var27, var32, var32, var32);
                            } else {
                                arg9.method3375(var28, var29, var30, var25, var26, var27, var19.field1242[var22], var19.field1242[var23], var19.field1242[var24]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg1 - -var13;
        }
        arg9.field8445 = true;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII[[Z)V", line = 965)
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3977;
        class351 var9 = (class351) super.field1872.method276(Thread.currentThread());
        class579 var10 = var9.field4535;
        var10.field8453 = false;
        var10.field8441 = 0;
        if (super.field1870 != null) {
            this.method1729(arg2, arg1, var9.field3416, arg5, arg6, 127, arg0, arg7, arg3, var10, var9.field3401, arg4);
        } else if (super.field1886 != null) {
            this.method1731(arg4, var9.field3401, arg6, arg2, arg1, var10, arg5, arg3, arg7, 1778993263, arg0, var9.field3416);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lhr;IIII[[I[[II)V", line = 986)
    public class311(class446 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lee;[IIIZI[I[I)V", line = 989)
    private final void method1730(class579 arg0, int[] arg1, int arg2, int arg3, boolean arg4, int arg5, int[] arg6, int[] arg7) {
        ++field3966;
        class234 var9 = super.field1870[arg3][arg2];
        if (var9 != null) {
            if ((2 & var9.field2876) == 0) {
                int var10 = super.field2115 * arg3;
                int var11 = var10 - -super.field2115;
                int var12 = super.field2115 * arg2;
                int var13 = var12 - -super.field2115;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                int var45;
                if (~(1 & var9.field2876) != -1 && !arg4) {
                    int var18 = super.field1880[arg3][arg2];
                    if (super.field1868 != -1) {
                        var19 = super.field1868;
                        var20 = super.field1868;
                        var21 = super.field1868;
                        var22 = super.field1868;
                    } else {
                        int var23 = super.field1871 * var18;
                        var22 = (super.field1876 * var12 + (super.field1873 * var10 - -var23) >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var22) {
                            return;
                        }
                        var21 = super.field1877 - -(super.field1876 * var12 + (super.field1873 * var11 - -var23) >> 15);
                        if (~super.field1872.field6149 <= ~var21) {
                            return;
                        }
                        var20 = (super.field1873 * var11 + super.field1876 * var13 + var23 >> 15) + super.field1877;
                        if (var20 <= super.field1872.field6149) {
                            return;
                        }
                        var19 = (super.field1876 * var13 + super.field1873 * var10 + var23 >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var19) {
                            return;
                        }
                    }
                    if (super.field1872.field6181) {
                        int var24 = -super.field1872.field6165 + var22;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field1872.field6165 + var21;
                        if (var25 > 0) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field1872.field6165 + var20;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field1872.field6165 + var19;
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field1878 * var18;
                    var29 = (super.field1885 * var12 + (super.field1883 * var10 - -var28) >> 15) + super.field1882;
                    int var30 = super.field1881 * var18;
                    var31 = (super.field1879 * var12 + super.field1866 * var10 + var30 >> 15) + super.field1887;
                    var32 = super.field1872.field6178 * var29 / var22 + arg0.field8448;
                    var33 = super.field1872.field6189 * var31 / var22 + arg0.field8444;
                    var34 = super.field1882 - -(super.field1883 * var11 + var28 - -(super.field1885 * var12) >> 15);
                    var35 = (super.field1866 * var11 + super.field1879 * var12 + var30 >> 15) + super.field1887;
                    var36 = super.field1872.field6178 * var34 / var21 + arg0.field8448;
                    var37 = (super.field1883 * var11 + (var28 - -(super.field1885 * var13)) >> 15) + super.field1882;
                    var38 = super.field1872.field6189 * var35 / var21 + arg0.field8444;
                    var39 = (super.field1879 * var13 + super.field1866 * var11 + var30 >> 15) + super.field1887;
                    var40 = super.field1872.field6178 * var37 / var20 + arg0.field8448;
                    var41 = super.field1872.field6189 * var39 / var20 + arg0.field8444;
                    var42 = (super.field1883 * var10 - -var28 - -(super.field1885 * var13) >> 15) + super.field1882;
                    var43 = super.field1872.field6178 * var42 / var19 + arg0.field8448;
                    var44 = (super.field1879 * var13 + (super.field1866 * var10 - -var30) >> 15) + super.field1887;
                    var45 = super.field1872.field6189 * var44 / var19 + arg0.field8444;
                } else {
                    int var46 = super.field1880[arg3][arg2];
                    int var47 = super.field1880[arg3 + 1][arg2];
                    int var48 = super.field1880[arg3 + 1][arg2 + 1];
                    int var49 = super.field1880[arg3][arg2 + 1];
                    if (~super.field1868 != 0) {
                        var19 = super.field1868;
                        var20 = super.field1868;
                        var21 = super.field1868;
                        var22 = super.field1868;
                    } else {
                        var22 = super.field1877 - -(super.field1873 * var10 + super.field1871 * var46 - -(super.field1876 * var12) >> 15);
                        if (super.field1872.field6149 >= var22) {
                            return;
                        }
                        var21 = (super.field1876 * var12 + (super.field1873 * var11 - -(super.field1871 * var47)) >> 15) + super.field1877;
                        if (var21 <= super.field1872.field6149) {
                            return;
                        }
                        var20 = (super.field1876 * var13 + super.field1873 * var11 + super.field1871 * var48 >> 15) + super.field1877;
                        if (~var20 >= ~super.field1872.field6149) {
                            return;
                        }
                        var19 = super.field1877 - -(super.field1873 * var10 + super.field1876 * var13 + super.field1871 * var49 >> 15);
                        if (var19 <= super.field1872.field6149) {
                            return;
                        }
                    }
                    if (!arg4) {
                        if (super.field1872.field6181) {
                            int var50 = -super.field1872.field6165 + var22;
                            if (~var50 < -1) {
                                var14 = var50;
                                if (~var50 < -256) {
                                    var14 = 255;
                                }
                            }
                            int var51 = -super.field1872.field6165 + var21;
                            if (~var51 < -1) {
                                var15 = var51;
                                if (~var51 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field1872.field6165 + var20;
                            if (var52 > 0) {
                                var16 = var52;
                                if (~var52 < -256) {
                                    var16 = 255;
                                }
                            }
                            int var53 = var19 - super.field1872.field6165;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (var53 > 255) {
                                    var17 = 255;
                                }
                            }
                        }
                    } else {
                        int var54 = -super.field1872.field6165 + var22;
                        if (~var54 < -256) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var14 = var54;
                            int var55 = var9.field2877 * var54 / 255;
                            if (~var55 < -1) {
                                var46 -= var55;
                            }
                        }
                        int var56 = -super.field1872.field6165 + var21;
                        if (~var56 < -256) {
                            var56 = 255;
                        }
                        if (~var56 < -1) {
                            var15 = var56;
                            int var57 = var9.field2880 * var56 / 255;
                            if (var57 > 0) {
                                var47 -= var57;
                            }
                        }
                        int var58 = -super.field1872.field6165 + var20;
                        if (~var58 < -256) {
                            var58 = 255;
                        }
                        if (~var58 < -1) {
                            var16 = var58;
                            int var59 = var9.field2878 * var58 / 255;
                            if (var59 > 0) {
                                var48 -= var59;
                            }
                        }
                        int var60 = -super.field1872.field6165 + var19;
                        if (~var60 < -256) {
                            var60 = 255;
                        }
                        if (~var60 < -1) {
                            var17 = var60;
                            int var61 = var9.field2883 * var60 / 255;
                            if (var61 > 0) {
                                var49 -= var61;
                            }
                        }
                    }
                    var29 = (super.field1885 * var12 + super.field1883 * var10 - -(super.field1878 * var46) >> 15) + super.field1882;
                    var32 = super.field1872.field6178 * var29 / var22 + arg0.field8448;
                    var31 = super.field1887 - -(super.field1866 * var10 + (super.field1881 * var46 - -(super.field1879 * var12)) >> 15);
                    var33 = super.field1872.field6189 * var31 / var22 + arg0.field8444;
                    var34 = (super.field1885 * var12 + super.field1883 * var11 + super.field1878 * var47 >> 15) + super.field1882;
                    var36 = super.field1872.field6178 * var34 / var21 + arg0.field8448;
                    var35 = (super.field1879 * var12 + super.field1866 * var11 - -(super.field1881 * var47) >> 15) + super.field1887;
                    var37 = (super.field1883 * var11 + super.field1885 * var13 + super.field1878 * var48 >> 15) + super.field1882;
                    var38 = super.field1872.field6189 * var35 / var21 + arg0.field8444;
                    var40 = arg0.field8448 - -(super.field1872.field6178 * var37 / var20);
                    var39 = super.field1887 - -(super.field1881 * var48 + (super.field1866 * var11 - -(super.field1879 * var13)) >> 15);
                    var41 = arg0.field8444 - -(super.field1872.field6189 * var39 / var20);
                    var42 = (super.field1883 * var10 + super.field1885 * var13 + super.field1878 * var49 >> 15) + super.field1882;
                    var43 = super.field1872.field6178 * var42 / var19 + arg0.field8448;
                    var44 = (super.field1879 * var13 + super.field1881 * var49 + super.field1866 * var10 >> 15) + super.field1887;
                    var45 = super.field1872.field6189 * var44 / var19 + arg0.field8444;
                }
                boolean var62 = ~var9.field2879 != 0 && this.method856(super.field1872.field2481.method119(-126, var9.field2879).field2657);
                int var63 = var15 - -var16 + var17;
                if (~((-var43 + var40) * (-var45 + var38) + -((-var43 + var36) * (-var45 + var41))) < -1) {
                    arg0.field8453 = ~var40 > -1 || ~var43 > -1 || ~var36 > -1 || ~arg0.field8446 > ~var40 || ~var43 < ~arg0.field8446 || ~arg0.field8446 > ~var36;
                    if (var63 >= 765) {
                        arg0.method3370(var41, var45, var38, var40, var43, var36, super.field1872.field6176);
                    } else {
                        if (var62) {
                            arg0.field8441 = 100;
                        }
                        if (~var63 < -1) {
                            if (~var9.field2879 > -1) {
                                arg0.method3375(var41, var45, var38, var40, var43, var36, class98.method598(super.field1872.field6176 | var16 << 24, var9.field2881, 19099), class98.method598(super.field1872.field6176 | var17 << 24, var9.field2882, 19099), class98.method598(var15 << 24 | super.field1872.field6176, var9.field2875, arg5 + -11082));
                            } else {
                                arg0.method3371(var41, var45, var38, var40, var43, var36, super.field1872.field6176, var16, var17, var15, var9.field2881, var9.field2882, var9.field2875, var37, var42, var34, var39, var44, var35, var20, var19, var21, var9.field2879);
                            }
                        } else if (var9.field2879 >= 0) {
                            arg0.method3374(var41, var45, var38, var40, var43, var36, var9.field2881, var9.field2882, var9.field2875, var37, var42, var34, var39, var44, var35, var20, var19, var21, var9.field2879);
                        } else {
                            arg0.method3375(var41, var45, var38, var40, var43, var36, var9.field2881, var9.field2882, var9.field2875);
                        }
                        arg0.field8441 = 0;
                    }
                }
                int var64 = var14 + var17 + var15;
                if (~((-var36 + var32) * (-var38 + var45) + -((-var36 + var43) * (-var38 + var33))) < -1) {
                    arg0.field8453 = var32 < 0 || ~var36 > -1 || ~var43 > -1 || var32 > arg0.field8446 || arg0.field8446 < var36 || ~arg0.field8446 > ~var43;
                    if (var64 < 765) {
                        if (var62) {
                            arg0.field8441 = 100;
                        }
                        if (var64 <= 0) {
                            if (var9.field2879 < 0) {
                                arg0.method3375(var33, var38, var45, var32, var36, var43, var9.field2873, var9.field2875, var9.field2882);
                            } else {
                                arg0.method3374(var33, var38, var45, var32, var36, var43, var9.field2873, var9.field2875, var9.field2882, var29, var34, var42, var31, var35, var44, var22, var21, var19, var9.field2879);
                            }
                        } else if (var9.field2879 >= 0) {
                            arg0.method3371(var33, var38, var45, var32, var36, var43, super.field1872.field6176, var14, var15, var17, var9.field2873, var9.field2875, var9.field2882, var29, var34, var42, var31, var35, var44, var22, var21, var19, var9.field2879);
                        } else {
                            arg0.method3375(var33, var38, var45, var32, var36, var43, class98.method598(var14 << 24 | super.field1872.field6176, var9.field2873, 19099), class98.method598(super.field1872.field6176 | var15 << 24, var9.field2875, 19099), class98.method598(var17 << 24 | super.field1872.field6176, var9.field2882, 19099));
                        }
                        arg0.field8441 = 0;
                        return;
                    }
                    arg0.method3370(var33, var38, var45, var32, var36, var43, super.field1872.field6176);
                }
            }
        } else {
            if (arg5 != 30181) {
                field3978 = -45;
            }
            class100 var65 = super.field1867[arg3][arg2];
            if (var65 != null) {
                if (super.field1868 == -1) {
                    for (int var66 = 0; ~var65.field1246 < ~var66; ++var66) {
                        int var67 = var65.field1247[var66] - -(arg3 << super.field2111);
                        int var68 = var65.field1239[var66];
                        int var69 = (arg2 << super.field2111) + var65.field1243[var66];
                        int var70 = (super.field1871 * var68 + super.field1876 * var69 + super.field1873 * var67 >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var70) {
                            return;
                        }
                        arg7[var66] = 0;
                        if (!arg4) {
                            if (super.field1872.field6181) {
                                int var71 = -super.field1872.field6165 + var70;
                                if (~var71 < -1) {
                                    arg7[var66] = var71;
                                    if (~arg7[var66] < -256) {
                                        arg7[var66] = 255;
                                    }
                                }
                            }
                        } else {
                            int var72 = -super.field1872.field6165 + var70;
                            if (var72 > 255) {
                                var72 = 255;
                            }
                            if (~var72 < -1) {
                                arg7[var66] = var72;
                                int var73 = var65.field1240[var66] * var72 / 255;
                                if (~var73 < -1) {
                                    var68 -= var73;
                                }
                            }
                        }
                        int var74 = (super.field1881 * var68 + super.field1866 * var67 - -(super.field1879 * var69) >> 15) + super.field1887;
                        int var75 = super.field1882 - -(super.field1883 * var67 + super.field1885 * var69 + super.field1878 * var68 >> 15);
                        arg6[var66] = arg0.field8448 - -(super.field1872.field6178 * var75 / var70);
                        arg1[var66] = super.field1872.field6189 * var74 / var70 + arg0.field8444;
                    }
                } else {
                    for (int var76 = 0; ~var76 > ~var65.field1246; ++var76) {
                        int var116 = (arg3 << super.field2111) + var65.field1247[var76];
                        int var117 = var65.field1239[var76];
                        int var118 = (arg2 << super.field2111) + var65.field1243[var76];
                        arg7[var76] = 0;
                        if (!arg4) {
                            if (super.field1872.field6181) {
                                int var119 = -super.field1872.field6165 + super.field1868;
                                if (~var119 < -1) {
                                    arg7[var76] = var119;
                                    if (~arg7[var76] < -256) {
                                        arg7[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var120 = -super.field1872.field6165 + super.field1868;
                            if (var120 > 255) {
                                var120 = 255;
                            }
                            if (~var120 < -1) {
                                arg7[var76] = var120;
                                int var121 = var65.field1240[var76] * var120 / 255;
                                if (~var121 < -1) {
                                    var117 -= var121;
                                }
                            }
                        }
                        int var122 = (super.field1883 * var116 + super.field1878 * var117 - -(super.field1885 * var118) >> 15) + super.field1882;
                        int var123 = (super.field1881 * var117 + (super.field1866 * var116 - -(super.field1879 * var118)) >> 15) + super.field1887;
                        arg6[var76] = super.field1872.field6178 * var122 / super.field1868 + arg0.field8448;
                        arg1[var76] = super.field1872.field6189 * var123 / super.field1868 + arg0.field8444;
                    }
                }
                if (var65.field1241 == null) {
                    for (int var77 = 0; ~var77 > ~var65.field1245; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 + 1;
                        int var80 = var79 + 1;
                        int var81 = arg6[var78];
                        int var82 = arg6[var79];
                        int var83 = arg6[var80];
                        int var84 = arg1[var78];
                        int var85 = arg1[var79];
                        int var86 = arg1[var80];
                        int var87 = arg7[var78] + arg7[var79] + arg7[var80];
                        if (~((-var82 + var81) * (-var85 + var86) - (var83 - var82) * (-var85 + var84)) < -1) {
                            arg0.field8453 = var81 < 0 || ~var82 > -1 || ~var83 > -1 || ~var81 < ~arg0.field8446 || var82 > arg0.field8446 || arg0.field8446 < var83;
                            if (var87 < 765) {
                                if (~var87 >= -1) {
                                    if ((16777215 & var65.field1242[var78]) != 0) {
                                        arg0.method3375(var84, var85, var86, var81, var82, var83, var65.field1242[var78], var65.field1242[var79], var65.field1242[var80]);
                                    }
                                } else if ((16777215 & var65.field1242[var78]) != 0) {
                                    arg0.method3375(var84, var85, var86, var81, var82, var83, class29.method163(var65.field1242[var78], -8552, arg7[var78], super.field1872.field6176), class29.method163(var65.field1242[var79], -8552, arg7[var79], super.field1872.field6176), class29.method163(var65.field1242[var80], -8552, arg7[var80], super.field1872.field6176));
                                }
                            } else {
                                arg0.method3370(var84, var85, var86, var81, var82, var83, super.field1872.field6176);
                            }
                        }
                    }
                } else {
                    int var88 = super.field1880[arg3][arg2];
                    int var89 = super.field1880[arg3 - -1][arg2];
                    int var90 = super.field1880[arg3][arg2 + 1];
                    int var91 = super.field2115 * arg3;
                    int var92 = super.field2115 + var91;
                    int var93 = super.field2115 * arg2;
                    int var94 = super.field2115 + var93;
                    int var95 = (super.field1885 * var93 + super.field1883 * var91 - -(super.field1878 * var88) >> 15) + super.field1882;
                    int var96 = super.field1887 - -(super.field1866 * var91 + super.field1881 * var88 + super.field1879 * var93 >> 15);
                    int var97 = super.field1877 - -(super.field1876 * var93 + (super.field1873 * var91 - -(super.field1871 * var88)) >> 15);
                    int var98 = (super.field1885 * var93 + super.field1883 * var92 - -(super.field1878 * var89) >> 15) + super.field1882;
                    int var99 = super.field1887 - -(super.field1866 * var92 - -(super.field1881 * var89) - -(super.field1879 * var93) >> 15);
                    int var100 = (super.field1876 * var93 + super.field1873 * var92 + super.field1871 * var89 >> 15) + super.field1877;
                    int var101 = (super.field1883 * var91 + super.field1878 * var90 - -(super.field1885 * var94) >> 15) + super.field1882;
                    int var102 = (super.field1866 * var91 - (-(super.field1881 * var90) - super.field1879 * var94) >> 15) + super.field1887;
                    int var103 = super.field1877 - -(super.field1871 * var90 + (super.field1873 * var91 - -(super.field1876 * var94)) >> 15);
                    for (int var104 = 0; var104 < var65.field1245; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg6[var105];
                        int var109 = arg6[var106];
                        int var110 = arg6[var107];
                        int var111 = arg1[var105];
                        int var112 = arg1[var106];
                        int var113 = arg1[var107];
                        int var114 = arg7[var105] + arg7[var106] - -arg7[var107];
                        if ((var113 - var112) * (-var109 + var108) + -((-var109 + var110) * (-var112 + var111)) > 0) {
                            arg0.field8453 = ~var108 > -1 || var109 < 0 || var110 < 0 || arg0.field8446 < var108 || ~var109 < ~arg0.field8446 || arg0.field8446 < var110;
                            short var115 = var65.field1241[var104];
                            if (var114 < 765) {
                                if (~var115 != 0 && this.method856(super.field1872.field2481.method119(-128, var115).field2657)) {
                                    arg0.field8441 = 100;
                                }
                                if (var114 > 0) {
                                    if (~var115 == 0) {
                                        if ((16777215 & var65.field1242[var105]) != 0) {
                                            arg0.method3375(var111, var112, var113, var108, var109, var110, class98.method598(arg7[var105] << 24 | super.field1872.field6176, var65.field1242[var105], 19099), class98.method598(super.field1872.field6176 | arg7[var106] << 24, var65.field1242[var106], 19099), class98.method598(arg7[var107] << 24 | super.field1872.field6176, var65.field1242[var107], 19099));
                                        }
                                    } else {
                                        arg0.method3371(var111, var112, var113, var108, var109, var110, super.field1872.field6176, arg7[var105], arg7[var106], arg7[var107], var65.field1242[var105], var65.field1242[var106], var65.field1242[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    }
                                } else if (var115 == -1) {
                                    if (~(16777215 & var65.field1242[var105]) != -1) {
                                        arg0.method3375(var111, var112, var113, var108, var109, var110, var65.field1242[var105], var65.field1242[var106], var65.field1242[var107]);
                                    }
                                } else {
                                    arg0.method3374(var111, var112, var113, var108, var109, var110, var65.field1242[var105], var65.field1242[var106], var65.field1242[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                }
                                arg0.field8441 = 0;
                            } else {
                                arg0.method3370(var111, var112, var113, var108, var109, var110, super.field1872.field6176);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V", line = 1679)
    public final void method844(int arg0, int arg1) {
        ++field3969;
        class351 var3 = (class351) super.field1872.method276(Thread.currentThread());
        var3.field4535.field8441 = 0;
        if (super.field1870 == null) {
            if (super.field1886 != null) {
                this.method1726(var3.field3438, var3.field3401, var3.field3416, arg1, var3.field4535, arg0, -118);
                return;
            }
        } else {
            this.method1730(var3.field4535, var3.field3416, arg1, arg0, super.field1872.field6177, 30181, var3.field3401, var3.field3438);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[IIIILee;II[[ZII[I)V", line = 1696)
    private final void method1731(int arg0, int[] arg1, int arg2, int arg3, int arg4, class579 arg5, int arg6, int arg7, boolean[][] arg8, int arg9, int arg10, int[] arg11) {
        ++field3974;
        int var13 = (arg2 - arg0) * arg3 / 256;
        int var14 = arg3 >> 8;
        arg5.field8445 = false;
        arg5.field8451 = false;
        int var15 = arg10;
        int var16 = arg4 + var13;
        if (arg9 != 1778993263) {
            field3975 = null;
        }
        for (int var17 = arg7; var17 < arg6; ++var17) {
            for (int var18 = arg0; ~arg2 < ~var18; ++var18) {
                if (arg8[-arg7 + var17][-arg0 + var18]) {
                    if (super.field1886[var17][var18] != null) {
                        class120 var19 = super.field1886[var17][var18];
                        if (~var19.field1514 != 0 && (var19.field1511 & 2) == 0 && ~var19.field1513 == 0) {
                            int var20 = super.field1872.method2616(var19.field1514);
                            arg5.method3378(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, class10.method52(31129, var19.field1510 & 65535, var20), class10.method52(31129, var19.field1512 & 65535, var20), class10.method52(31129, var19.field1516 & 65535, var20));
                            arg5.method3378(var16, var16, -var14 + var16, var15, var14 + var15, var15, class10.method52(31129, 65535 & var19.field1515, var20), class10.method52(31129, var19.field1516 & 65535, var20), class10.method52(arg9 + -1778962134, var19.field1512 & 65535, var20));
                        } else if (var19.field1513 == -1) {
                            arg5.method3378(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var19.field1510 & 65535, 65535 & var19.field1512, var19.field1516 & 65535);
                            arg5.method3378(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 65535 & var19.field1515, 65535 & var19.field1516, var19.field1512 & 65535);
                        } else {
                            int var21 = var19.field1513;
                            arg5.method3378(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var21, var21, var21);
                            arg5.method3378(var16, var16, -var14 + var16, var15, var15 - -var14, var15, var21, var21, var21);
                        }
                    } else if (super.field1875[var17][var18] != null) {
                        class223 var22 = super.field1875[var17][var18];
                        for (int var23 = 0; var23 < var22.field2746; ++var23) {
                            arg1[var23] = var22.field2743[var23] * var14 / super.field2115 + var15;
                            arg11[var23] = var16 - var22.field2747[var23] * var14 / super.field2115;
                        }
                        for (int var24 = 0; ~var22.field2745 < ~var24; ++var24) {
                            short var25 = var22.field2751[var24];
                            short var26 = var22.field2742[var24];
                            short var27 = var22.field2752[var24];
                            int var28 = arg1[var25];
                            int var29 = arg1[var26];
                            int var30 = arg1[var27];
                            int var31 = arg11[var25];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            if (var22.field2749 != null && var22.field2749[var24] != -1) {
                                int var34 = var22.field2749[var24];
                                arg5.method3378(var31, var32, var33, var28, var29, var30, class10.method52(31129, var22.field2741[var25], var34), class10.method52(arg9 + -1778962134, var22.field2741[var26], var34), class10.method52(31129, var22.field2741[var27], var34));
                            } else if (var22.field2744 != null && var22.field2744[var24] != -1) {
                                int var35 = super.field1872.method2616(var22.field2744[var24]);
                                arg5.method3378(var31, var32, var33, var28, var29, var30, class10.method52(31129, var22.field2741[var25], var35), class10.method52(31129, var22.field2741[var26], var35), class10.method52(31129, var22.field2741[var27], var35));
                            } else {
                                int var36 = var22.field2750[var24];
                                arg5.method3378(var31, var32, var33, var28, var29, var30, class10.method52(arg9 + -1778962134, var22.field2741[var25], var36), class10.method52(31129, var22.field2741[var26], var36), class10.method52(31129, var22.field2741[var27], var36));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg4 - -var13;
            var15 += var14;
        }
        arg5.field8445 = true;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILcn;I)V", line = 1837)
    public static final void method1732(int arg0, int arg1, int arg2, class437 arg3, int arg4) {
        ++field3971;
        if (arg2 == 576139591) {
            for (class416 var5 = (class416) class645.field9394.method1050((byte) 73); var5 != null; var5 = (class416) class645.field9394.method1047(-7962)) {
                if (~var5.field5402 == ~arg1 && ~(arg0 << 7) == ~var5.field5408 && ~(arg4 << 7) == ~var5.field5406 && var5.field5410.field5996 == arg3.field5996) {
                    if (var5.field5417 != null) {
                        class534.field7500.method803(var5.field5417);
                        var5.field5417 = null;
                    }
                    if (var5.field5404 != null) {
                        class534.field7500.method803(var5.field5404);
                        var5.field5404 = null;
                    }
                    var5.method3187(true);
                    return;
                }
            }
        }
    }
}
