import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class441 extends class30 {

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    private int field6458 = 6;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "[I")
    public static int[] field6453 = new int[32];

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field6455 = 0;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "[I")
    public static int[] field6461 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field6459 = 0;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Ljava/lang/String;")
    public static String field6462 = "Loaded title screen";

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Lbp;")
    public static class216 field6457;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lmo;")
    public static class447 field6454;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 == 6456) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    super.field376 = arg0.method1322(false) == 1;
                }
            } else {
                this.field6458 = arg0.method1322(false);
            }
            ++field6463;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2712(String arg0, int arg1) {
        ++field6464;
        if (arg1 != -324293588) {
            field6461 = null;
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class441() {
        super(2, false);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field6452;
        int[] var3 = super.field371.method2367((byte) 108, arg0);
        if (arg1 < 49) {
            return null;
        } else {
            if (super.field371.field5586) {
                int[] var4 = this.method210((byte) 36, 0, arg0);
                int[] var5 = this.method210((byte) 124, 1, arg0);
                int var6 = this.field6458;
                if (~var6 != -2) {
                    if (~var6 != -3) {
                        if (var6 != 3) {
                            if (var6 != 4) {
                                if (var6 != 5) {
                                    if (var6 != 6) {
                                        if (var6 != 7) {
                                            if (~var6 != -9) {
                                                if (~var6 != -10) {
                                                    if (~var6 != -11) {
                                                        if (~var6 != -12) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; class369.field5610 > var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = var8 + var9 + -(var8 * var9 >> 11);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; ~class369.field5610 < ~var10; ++var10) {
                                                                int var11 = var4[var10];
                                                                int var12 = var5[var10];
                                                                var3[var10] = ~var12 <= ~var11 ? -var11 + var12 : var11 - var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; var13 < class369.field5610; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = ~var15 < ~var14 ? var15 : var14;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; ~class369.field5610 < ~var16; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = ~var17 > ~var18 ? var17 : var18;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; var19 < class369.field5610; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? 4096 - (4096 - var5[var19] << 12) / var20 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; ~class369.field5610 < ~var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; ~var23 > ~class369.field5610; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : -((4096 - var4[var23]) * (-var24 + 4096) >> 11) + 4096;
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; ~class369.field5610 < ~var25; ++var25) {
                                        var3[var25] = 4096 - ((4096 - var4[var25]) * (-var5[var25] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~var26 > ~class369.field5610; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~var28 > ~class369.field5610; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; ~class369.field5610 < ~var29; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; var30 < class369.field5610; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)[Lwa;")
    public static final class364[] method2713(int arg0) {
        if (arg0 != -25) {
            return null;
        } else {
            ++field6456;
            if (class11.field163 == null) {
                class364[] var1 = class353.method2300(class63.field822, (byte) 120);
                class364[] var2 = new class364[var1.length];
                int var3 = 0;
                label66: for (int var4 = 0; var1.length > var4; ++var4) {
                    class364 var8 = var1[var4];
                    if ((var8.field5545 <= 0 || ~var8.field5545 <= -25) && var8.field5540 >= 800 && var8.field5544 >= 600 && (~class27.field314 <= -97 || class128.field2035 != 0 || var8.field5540 <= 1024 && var8.field5544 <= 768)) {
                        for (int var9 = 0; var3 > var9; ++var9) {
                            class364 var10 = var2[var9];
                            if (var8.field5540 == var10.field5540 && var8.field5544 == var10.field5544) {
                                if (var10.field5545 < var8.field5545) {
                                    var2[var9] = var8;
                                }
                                continue label66;
                            }
                        }
                        var2[var3] = var8;
                        ++var3;
                    }
                }
                class11.field163 = new class364[var3];
                class408.method2557(var2, 0, class11.field163, 0, var3);
                int[] var5 = new int[class11.field163.length];
                for (int var6 = 0; ~class11.field163.length < ~var6; ++var6) {
                    class364 var7 = class11.field163[var6];
                    var5[var6] = var7.field5544 * var7.field5540;
                }
                class284.method1933(0, class11.field163, var5);
            }
            return class11.field163;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method2714(int arg0, int arg1) {
        if (arg1 != 1465) {
            method2712((String) null, 60);
        }
        ++field6465;
        class211 var2 = class281.method1921(12, arg0, (byte) -109);
        var2.method1489((byte) -100);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)[[I")
    public final int[][] method203(byte arg0, int arg1) {
        ++field6460;
        int[][] var3 = super.field360.method2803(arg1, true);
        if (arg0 != -93) {
            field6462 = null;
        }
        if (super.field360.field6566) {
            int[][] var4 = this.method206(arg1, 2, 0);
            int[][] var5 = this.method206(arg1, arg0 ^ -95, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field6458;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class369.field5610; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var13[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var12[var16];
                                                                var6[var16] = -(var21 * var22 >> 11) + var22 + var21;
                                                                var7[var16] = -(var18 * var19 >> 11) + var19 + var18;
                                                                var8[var16] = -(var17 * var20 >> 11) + var20 + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; ~var23 > ~class369.field5610; ++var23) {
                                                            int var24 = var12[var23];
                                                            int var25 = var11[var23];
                                                            int var26 = var13[var23];
                                                            int var27 = var10[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var28 > var24 ? -var24 + var28 : -var28 + var24;
                                                            var7[var23] = ~var26 > ~var27 ? -var26 + var27 : var26 - var27;
                                                            var8[var23] = var29 < var25 ? -var29 + var25 : -var25 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class369.field5610 > var30; ++var30) {
                                                        int var31 = var10[var30];
                                                        int var32 = var11[var30];
                                                        int var33 = var13[var30];
                                                        int var34 = var9[var30];
                                                        int var35 = var14[var30];
                                                        int var36 = var12[var30];
                                                        var6[var30] = ~var34 >= ~var36 ? var36 : var34;
                                                        var7[var30] = ~var31 >= ~var33 ? var33 : var31;
                                                        var8[var30] = ~var32 < ~var35 ? var32 : var35;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; class369.field5610 > var37; ++var37) {
                                                    int var38 = var10[var37];
                                                    int var39 = var13[var37];
                                                    int var40 = var12[var37];
                                                    int var41 = var9[var37];
                                                    int var42 = var11[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var40 <= var41 ? var40 : var41;
                                                    var7[var37] = ~var39 < ~var38 ? var38 : var39;
                                                    var8[var37] = ~var43 >= ~var42 ? var43 : var42;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; class369.field5610 > var44; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var9[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var46 == 0 ? 0 : -((4096 - var12[var44] << 12) / var46) + 4096;
                                                var7[var44] = var47 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var45 != 0 ? -((-var14[var44] + 4096 << 12) / var45) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class369.field5610; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (-var49 + 4096);
                                            var8[var48] = var51 == 4096 ? 4096 : (var14[var48] << 12) / (-var51 + 4096);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class369.field5610; ++var52) {
                                        int var53 = var14[var52];
                                        int var54 = var13[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = var55 < 2048 ? var9[var52] * var55 >> 11 : 4096 - ((-var9[var52] + 4096) * (-var55 + 4096) >> 11);
                                        var7[var52] = ~var54 > -2049 ? var10[var52] * var54 >> 11 : -((-var10[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var53 <= -2049 ? -((4096 - var11[var52]) * (-var53 + 4096) >> 11) + 4096 : var11[var52] * var53 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; var56 < class369.field5610; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((4096 - var11[var56]) * (4096 - var14[var56]) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class369.field5610; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = ~var58 != -1 ? (var10[var57] << 12) / var58 : 4096;
                                var8[var57] = var59 == 0 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class369.field5610; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class369.field5610 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class369.field5610 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
    public static void method2715(int arg0) {
        field6461 = null;
        field6462 = null;
        if (arg0 >= 76) {
            field6453 = null;
            field6454 = null;
            field6457 = null;
        }
    }
}
