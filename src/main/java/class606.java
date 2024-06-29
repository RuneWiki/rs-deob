import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class606 extends class694 {

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
    private int field8442 = 6;

    @OriginalMember(owner = "client!bca", name = "L", descriptor = "D")
    public static double field8446 = -1.0D;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!bca", name = "K", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method39(int arg0, int arg1) {
        ++field8444;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 <= 112) {
            return null;
        } else {
            if (super.field9751.field6674) {
                int[] var4 = this.method3809(0, arg1, (byte) 35);
                int[] var5 = this.method3809(1, arg1, (byte) 35);
                int var6 = this.field8442;
                if (var6 != 1) {
                    if (var6 != 2) {
                        if (var6 != 3) {
                            if (~var6 != -5) {
                                if (var6 != 5) {
                                    if (~var6 != -7) {
                                        if (var6 != 7) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (var6 != 11) {
                                                            if (var6 == 12) {
                                                                for (int var7 = 0; class465.field6544 > var7; ++var7) {
                                                                    int var8 = var4[var7];
                                                                    int var9 = var5[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class465.field6544 < ~var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = ~var11 > ~var12 ? -var11 + var12 : -var12 + var11;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class465.field6544; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var15 <= var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~var16 > ~class465.field6544; ++var16) {
                                                        int var17 = var5[var16];
                                                        int var18 = var4[var16];
                                                        var3[var16] = ~var17 < ~var18 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class465.field6544; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = ~var20 != -1 ? -((4096 - var5[var19] << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class465.field6544 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; class465.field6544 > var23; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 >= 2048 ? -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~var25 > ~class465.field6544; ++var25) {
                                        var3[var25] = -((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12) + 4096;
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~class465.field6544 < ~var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 == 0 ? 4096 : (var4[var26] << 12) / var27;
                                }
                            }
                        } else {
                            for (int var28 = 0; var28 < class465.field6544; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class465.field6544 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~class465.field6544 < ~var30; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILql;BLuea;)V", line = 250)
    public static final void method3354(int arg0, int arg1, class674 arg2, byte arg3, class286 arg4) {
        ++field8445;
        byte var5 = -1;
        if (~(64 & arg1) != -1) {
            int var6 = arg2.method713((byte) -104);
            byte[] var7 = new byte[var6];
            class96 var8 = new class96(var7);
            arg2.method730(0, (byte) 1, var7, var6);
            class474.field6627[arg0] = var8;
            arg4.method1727((byte) 55, var8);
        }
        if ((arg1 & 2) != 0) {
            int var9 = arg2.method743((byte) -76);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var10 = arg2.method707(18523);
            int var11 = arg2.method710(118);
            arg4.method2641(false, var10, (byte) -85, var11, var9);
        }
        if (~(4 & arg1) != -1) {
            int var12 = arg2.method733((byte) 103);
            int var13 = arg2.method713((byte) -104);
            arg4.method2632(class239.field3440, (byte) 117, var13, var12);
            arg4.field6466 = class239.field3440 - -300;
            arg4.field6407 = arg2.method713((byte) -104);
        }
        if ((1024 & arg1) != 0) {
            var5 = arg2.method712(true);
        }
        if ((8 & arg1) != 0) {
            int var14 = arg2.method743((byte) -83);
            if (~var14 == -65536) {
                var14 = -1;
            }
            int var15 = arg2.method710(arg3 + 107);
            class418.method2385(var15, var14, arg4, 93);
        }
        if ((arg1 & 16384) != 0) {
            arg4.field6405 = arg2.method739(-121);
            if (~arg4.field6405.charAt(0) != -127) {
                if (class253.field3576 == arg4) {
                    class250.method1549(arg4.method1717(true, (byte) 123), arg4.method1720(false, false), -1, arg4.field3986, 2, arg4.field6405, 0);
                }
            } else {
                arg4.field6405 = arg4.field6405.substring(1);
                class250.method1549(arg4.method1717(true, (byte) 123), arg4.method1720(false, false), arg3 ^ 16, arg4.field3986, 2, arg4.field6405, 0);
            }
            arg4.field6473 = 150;
            arg4.field6425 = 0;
            arg4.field6433 = 0;
        }
        if (~(arg1 & 256) != -1) {
            int var16 = arg2.method747(82);
            if (~var16 == -65536) {
                var16 = -1;
            }
            int var17 = arg2.method703((byte) 126);
            int var18 = arg2.method718(86);
            arg4.method2641(true, var17, (byte) -85, var18, var16);
        }
        if (arg3 != -17) {
            method3354(83, 116, (class674) null, (byte) -62, (class286) null);
        }
        if ((4096 & arg1) != 0) {
            int var19 = arg2.method747(117);
            arg4.field6384 = arg2.method726((byte) 127);
            arg4.field6406 = arg2.method713((byte) -104);
            arg4.field6420 = 32767 & var19;
            arg4.field6414 = ~(var19 & 32768) != -1;
            arg4.field6436 = class239.field3440 + arg4.field6420 + arg4.field6384;
        }
        if ((arg1 & 2048) != 0) {
            arg4.field6422 = arg2.method748(-813976688);
            arg4.field6411 = arg2.method748(-813976688);
            arg4.field6408 = arg2.method706((byte) 95);
            arg4.field6452 = arg2.method712(true);
            arg4.field6470 = arg2.method756((byte) 101) - -class239.field3440;
            arg4.field6434 = arg2.method756((byte) 101) - -class239.field3440;
            arg4.field6465 = arg2.method710(arg3 + 105);
            arg4.field6484 = 0;
            if (arg4.field3961) {
                arg4.field6408 += arg4.field3971;
                arg4.field6411 += arg4.field3969;
                arg4.field6422 += arg4.field3971;
                arg4.field6452 += arg4.field3969;
                arg4.field6485 = 0;
            } else {
                arg4.field6422 += arg4.field6483[0];
                arg4.field6408 += arg4.field6483[0];
                arg4.field6485 = 1;
                arg4.field6452 += arg4.field6477[0];
                arg4.field6411 += arg4.field6477[0];
            }
        }
        if (~(512 & arg1) != -1) {
            int var20 = arg2.method726((byte) 126);
            int[] var21 = new int[var20];
            int[] var22 = new int[var20];
            int[] var23 = new int[var20];
            for (int var24 = 0; var24 < var20; ++var24) {
                int var25 = arg2.method756((byte) 101);
                if (var25 == 65535) {
                    var25 = -1;
                }
                var21[var24] = var25;
                var22[var24] = arg2.method710(-88);
                var23[var24] = arg2.method743((byte) -17);
            }
            class418.method2388(-121, var22, var21, var23, arg4);
        }
        if ((128 & arg1) != 0) {
            int var26 = arg2.method747(83);
            if (var26 == 65535) {
                var26 = -1;
            }
            arg4.field6391 = var26;
        }
        if ((16 & arg1) != 0) {
            arg4.field3994 = arg2.method756((byte) 101);
            if (~arg4.field6485 == -1) {
                arg4.method2630(false, arg4.field3994);
                arg4.field3994 = -1;
            }
        }
        if (~(131072 & arg1) != -1) {
            int var27 = class239.field3440;
            int var28 = arg2.method733((byte) 88);
            int var29 = arg2.method713((byte) -104);
            arg4.method2632(var27, (byte) 99, var29, var28);
        }
        if (~(8192 & arg1) != -1) {
            arg4.field3983 = ~arg2.method718(-82) == -2;
        }
        if (~(arg1 & 65536) != -1) {
            arg4.field6399 = arg2.method750(arg3 + 13281);
            arg4.field6457 = arg2.method748(-813976688);
            arg4.field6454 = arg2.method748(-813976688);
            arg4.field6435 = (byte) arg2.method710(-43);
            arg4.field6437 = class239.field3440 + arg2.method754(0);
            arg4.field6467 = class239.field3440 - -arg2.method754(0);
        }
        if (~(arg1 & 1) != -1) {
            class491.field6782[arg0] = arg2.method748(class602.method3336(arg3, 813976703));
        }
        if (arg4.field3961) {
            if (var5 == 127) {
                arg4.method1718(arg4.field3971, arg4.field3969, (byte) -61);
            } else {
                byte var30;
                if (~var5 != 0) {
                    var30 = var5;
                } else {
                    var30 = class491.field6782[arg0];
                }
                arg4.method1724(arg4.field3971, var30, (byte) 89, arg4.field3969);
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V", line = 511)
    public class606() {
        super(2, false);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILjr;B)V", line = 518)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field9744 = ~arg1.method718(108) == -2;
            }
        } else {
            this.field8442 = arg1.method718(-53);
        }
        int var5 = -16 % ((arg2 - 58) / 63);
        ++field8441;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(II)[[I", line = 557)
    public final int[][] method15(int arg0, int arg1) {
        ++field8443;
        if (arg0 != -22151) {
            method3355((byte[]) null, 98);
        }
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int[][] var4 = this.method3812(arg1, 0, -14032);
            int[][] var5 = this.method3812(arg1, 1, -14032);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field8442;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (~var15 != -5) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (var15 != 9) {
                                                if (var15 != 10) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; class465.field6544 > var16; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var12[var16];
                                                                int var19 = var10[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var14[var16];
                                                                int var22 = var13[var16];
                                                                var6[var16] = var18 + var20 + -(var18 * var20 >> 11);
                                                                var7[var16] = -(var19 * var22 >> 11) + var22 + var19;
                                                                var8[var16] = -(var17 * var21 >> 11) + var17 - -var21;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~class465.field6544 < ~var23; ++var23) {
                                                            int var24 = var11[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var13[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var27 < var26 ? -var27 + var26 : -var26 + var27;
                                                            var7[var23] = ~var28 <= ~var25 ? var28 - var25 : -var28 + var25;
                                                            var8[var23] = ~var24 < ~var29 ? -var29 + var24 : -var24 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~class465.field6544 < ~var30; ++var30) {
                                                        int var31 = var11[var30];
                                                        int var32 = var10[var30];
                                                        int var33 = var14[var30];
                                                        int var34 = var12[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = ~var35 >= ~var34 ? var34 : var35;
                                                        var7[var30] = ~var36 > ~var32 ? var32 : var36;
                                                        var8[var30] = ~var31 >= ~var33 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class465.field6544; ++var37) {
                                                    int var38 = var11[var37];
                                                    int var39 = var9[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var14[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var13[var37];
                                                    var6[var37] = ~var40 < ~var39 ? var39 : var40;
                                                    var7[var37] = ~var43 >= ~var42 ? var43 : var42;
                                                    var8[var37] = ~var38 > ~var41 ? var38 : var41;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; ~var44 > ~class465.field6544; ++var44) {
                                                int var45 = var10[var44];
                                                int var46 = var9[var44];
                                                int var47 = var11[var44];
                                                var6[var44] = var46 == 0 ? 0 : -((-var12[var44] + 4096 << 12) / var46) + 4096;
                                                var7[var44] = ~var45 == -1 ? 0 : 4096 - (-var13[var44] + 4096 << 12) / var45;
                                                var8[var44] = ~var47 == -1 ? 0 : -((4096 - var14[var44] << 12) / var47) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class465.field6544 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = ~var49 == -4097 ? 4096 : (var12[var48] << 12) / (-var49 + 4096);
                                            var7[var48] = var51 == 4096 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = ~var50 == -4097 ? 4096 : (var14[var48] << 12) / (4096 - var50);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~class465.field6544 < ~var52; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 > -2049 ? var9[var52] * var55 >> 11 : -((-var9[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 >= 2048 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class465.field6544 > var56; ++var56) {
                                    var6[var56] = -((4096 - var9[var56]) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class465.field6544; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var12[var57];
                                int var60 = var14[var57];
                                var6[var57] = ~var59 != -1 ? (var9[var57] << 12) / var59 : 4096;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var60 == 0 ? 4096 : (var11[var57] << 12) / var60;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~class465.field6544 < ~var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class465.field6544 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class465.field6544; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] - -var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "([BI)[B", line = 882)
    public static final byte[] method3355(byte[] arg0, int arg1) {
        ++field8440;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class282.method1706(arg0, arg1, var3, 0, var2);
        return var3;
    }
}
