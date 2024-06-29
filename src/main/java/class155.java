import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class155 extends class273 {

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field2517 = 0;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field2518 = 0;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    private int field2519 = 1024;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    private int field2521 = 1024;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    private int field2528 = 1024;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    private int field2530 = 819;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    private int field2529 = 2048;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    private int field2527 = 1024;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    private int field2531 = 409;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field2534 = -1;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field2520;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "Lsb;")
    public static class124 field2532;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        int var1 = -25 % ((-12 - arg0) / 51);
        if (class116.field1957 == null || class223.field3561 == null) {
            class223.field3561 = new int[256];
            class116.field1957 = new int[256];
            for (int var2 = 0; var2 < 256; ++var2) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class116.field1957[var2] = (int) (4096.0D * Math.sin(var3));
                class223.field3561[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        ++field2526;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II[[IILjava/util/Random;II)V")
    private final void method1118(int arg0, int arg1, int[][] arg2, int arg3, Random arg4, int arg5, int arg6) {
        int var8 = this.field2528 <= 0 ? 4096 : -class111.method824(arg5 + 1, arg4, this.field2528) + 4096;
        ++field2522;
        int var9 = this.field2527 * this.field2520 >> 12;
        int var10 = this.field2520 + -(var9 > 0 ? class111.method824(0, arg4, var9) : 0);
        if (~arg0 <= ~class26.field458) {
            arg0 -= class26.field458;
        }
        if (arg5 > ~var10) {
            if (~arg6 < -1 && arg1 > 0) {
                int var11 = arg1 / 2;
                int var12 = ~var11 <= ~var10 ? var10 : var11;
                int var13 = -(var12 * 2) + arg1;
                int var14 = arg0 + var12;
                int var15 = arg6 / 2;
                int var16 = ~var15 <= ~var10 ? var10 : var15;
                for (int var17 = 0; ~var17 > ~arg6; ++var17) {
                    int[] var18 = arg2[arg3 + var17];
                    if (~var17 > ~var16) {
                        int var19 = var8 * var17 / var16;
                        if (~this.field2517 == -1) {
                            for (int var20 = 0; ~var12 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var12;
                                var18[class64.method498(arg0 + var20, client.field4573)] = var18[class64.method498(arg0 + arg1 + -var20 + -1, client.field4573)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var12 > var22; ++var22) {
                                int var24 = var8 * var22 / var12;
                                var18[class64.method498(client.field4573, arg0 - -var22)] = var18[class64.method498(arg0 + -1 + arg1 + -var22, client.field4573)] = var24 >= var19 ? var19 : var24;
                            }
                        }
                        if (var13 + var14 <= class26.field458) {
                            class68.method532(var18, var14, var13, var19);
                        } else {
                            int var23 = -var14 + class26.field458;
                            class68.method532(var18, var14, var23, var19);
                            class68.method532(var18, 0, -var23 + var13, var19);
                        }
                    } else {
                        int var25 = -var17 + arg6 + -1;
                        if (~var16 < ~var25) {
                            int var26 = var8 * var25 / var16;
                            if (~this.field2517 == -1) {
                                for (int var27 = 0; var12 > var27; ++var27) {
                                    int var28 = var8 * var27 / var12;
                                    var18[class64.method498(arg0 + var27, client.field4573)] = var18[class64.method498(-var27 + -1 + arg0 + arg1, client.field4573)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var12 > var29; ++var29) {
                                    int var31 = var8 * var29 / var12;
                                    var18[class64.method498(client.field4573, arg0 + var29)] = var18[class64.method498(arg0 + arg1 + -var29 + -1, client.field4573)] = var26 <= var31 ? var26 : var31;
                                }
                            }
                            if (~(var14 - -var13) < ~class26.field458) {
                                int var30 = -var14 + class26.field458;
                                class68.method532(var18, var14, var30, var26);
                                class68.method532(var18, 0, -var30 + var13, var26);
                            } else {
                                class68.method532(var18, var14, var13, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var12; ++var32) {
                                var18[class64.method498(client.field4573, arg0 + var32)] = var18[class64.method498(client.field4573, -var32 + arg1 + arg0 + -1)] = var8 * var32 / var12;
                            }
                            if (~class26.field458 <= ~(var14 - -var13)) {
                                class68.method532(var18, var14, var13, var8);
                            } else {
                                int var33 = -var14 + class26.field458;
                                class68.method532(var18, var14, var33, var8);
                                class68.method532(var18, 0, var13 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (class26.field458 < arg0 - -arg1) {
            int var34 = -arg0 + class26.field458;
            for (int var35 = 0; ~var35 > ~arg6; ++var35) {
                int[] var36 = arg2[arg3 + var35];
                class68.method532(var36, arg0, var34, var8);
                class68.method532(var36, 0, -var34 + arg1, var8);
            }
        } else {
            for (int var37 = 0; ~var37 > ~arg6; ++var37) {
                class68.method532(arg2[arg3 + var37], arg0, arg1, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field2535;
        if (arg0 >= -94) {
            method1120(-89, -19, -63, -116, 98, 96, 95, 36, (class60) null, 43, true, -29L);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
    public static final void method1119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class87.field1405.field2231 = 0;
        class87.field1405.method966((byte) 87, 20);
        class87.field1405.method966((byte) 62, arg2);
        class87.field1405.method966((byte) 113, arg1);
        class87.field1405.method971(3792, arg0);
        class87.field1405.method971(3792, arg3);
        class130.field2157 = 0;
        class97.field1504 = 0;
        ++field2536;
        int var5 = 36 / ((arg4 - 53) / 45);
        class69.field1167 = 1;
        class285.field4532 = -3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIIILci;IZJ)Z")
    public static final boolean method1120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class60 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class266.field4251 == class21.field327;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class129.field2127 || var24 >= class130.field2161) {
                    return false;
                }
                class129 var25 = class26.field455[arg0][var15][var24];
                if (var25 != null && var25.field2142 >= 5) {
                    return false;
                }
            }
        }
        class190 var16 = new class190();
        var16.field3118 = arg11;
        var16.field3116 = arg0;
        var16.field3107 = arg5;
        var16.field3109 = arg6;
        var16.field3120 = arg7;
        var16.field3119 = arg8;
        var16.field3105 = arg9;
        var16.field3115 = arg1;
        var16.field3110 = arg2;
        var16.field3114 = arg1 + arg3 - 1;
        var16.field3108 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class26.field455[var22][var17][var20] == null) {
                        class26.field455[var22][var17][var20] = new class129(var22, var17, var20);
                    }
                }
                class129 var23 = class26.field455[arg0][var17][var20];
                var23.field2131[var23.field2142] = var16;
                var23.field2125[var23.field2142] = var21;
                var23.field2130 |= var21;
                ++var23.field2142;
                if (var13 && class14.field209[var17][var20] != 0) {
                    var14 = class14.field209[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class14.field209[var18][var19] == 0) {
                        class14.field209[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class195.field3194[class150.field2462++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
    public static void method1121(byte arg0) {
        if (arg0 > -114) {
            method1123(-116, -42, -93, -109, 106, false, -92, 85, -33, -6, -9);
        }
        field2532 = null;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)Lth;")
    public static final class119 method1122(int arg0, int arg1, int arg2) {
        ++field2524;
        if (arg2 <= 99) {
            field2532 = null;
        }
        for (class119 var3 = (class119) class81.field1337.method1062(104); var3 != null; var3 = (class119) class81.field1337.method1059(-14608)) {
            if (var3.field2010 && var3.method876(arg0, (byte) 6, arg1)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIZIIIII)V")
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2533;
        int var11 = -arg10 + arg6;
        int var12 = arg3 - arg8;
        if (arg6 < class31.field524) {
            ++var11;
        }
        if (class159.field2574 > arg3) {
            ++var12;
        }
        int var10000;
        for (int var13 = 0; ~var12 < ~var13; ++var13) {
            int var41 = arg1 - -(arg4 * var13) >> 16;
            int var42 = (var13 + 1) * arg4 + arg1 >> 16;
            int var43 = -var41 + var42;
            if (~var43 < -1) {
                int var44 = arg8 + var13 >> 6;
                if (var44 >= 0 && class35.field597.length + -1 >= var44) {
                    int var45 = arg9 + var42;
                    int var46 = arg9 + var41;
                    int[][] var47 = class35.field597[var44];
                    byte[][] var48 = class137.field2299[var44];
                    byte[][] var49 = class213.field3419[var44];
                    byte[][] var50 = class246.field3876[var44];
                    byte[][] var51 = class81.field1333[var44];
                    byte[][] var52 = class106.field1623[var44];
                    for (int var53 = 0; ~var53 > ~var11; ++var53) {
                        int var54 = (var53 + 1) * arg0 + arg2 >> 16;
                        int var55 = arg0 * var53 + arg2 >> 16;
                        int var56 = -var55 + var54;
                        if (~var56 < -1) {
                            int var57 = arg7 + var54;
                            int var58 = var53 - -arg10 >> 6;
                            int var59 = arg10 + var53 & 63;
                            int var60 = arg7 + var55;
                            int var61 = arg8 + var13 & 63;
                            int var62 = (var59 << 6) + var61;
                            int var63;
                            if (~var58 <= -1 && ~var58 >= ~(var47.length + -1) && var47[var58] != null) {
                                var63 = var47[var58][var62];
                            } else {
                                if (class152.field2484.field2008 == -1) {
                                    if ((4 & var53 - -arg10) == (4 & arg8 + var13)) {
                                        var63 = class292.field4635[class288.field4605 + 1];
                                    } else {
                                        var63 = 4936552;
                                    }
                                } else {
                                    var63 = class152.field2484.field2008;
                                }
                                if (var58 < 0 || ~(var47.length + -1) > ~var58) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class63.method493(var46, var60, var43, var56, var63);
                                    continue;
                                }
                            }
                            if (~var63 == -1) {
                                var63 = 1;
                            }
                            int var64 = var48[var58] == null ? 0 : class292.field4635[var48[var58][var62] & 255];
                            int var65 = var52[var58] == null ? 0 : class292.field4635[255 & var52[var58][var62]];
                            if (~var64 == -1 && var65 == 0) {
                                class63.method493(var46, var60, var43, var56, var63);
                            } else {
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = 1;
                                    }
                                    byte var66 = var49[var58] != null ? var49[var58][var62] : 0;
                                    int var67 = 252 & var66;
                                    if (var67 != 0 && ~var43 < -2 && ~var56 < -2) {
                                        class246.method1637(var56, var60, var64, var67 >> 2, class63.field1048, true, 3 & var66, 35, var46, var43, var63);
                                    } else {
                                        class63.method493(var46, var60, var43, var56, var64);
                                    }
                                }
                                if (~var65 != -1) {
                                    if (var65 == -1) {
                                        var65 = var63;
                                    }
                                    byte var68 = var50[var58][var62];
                                    int var69 = 252 & var68;
                                    if (var69 == 0 || var43 <= 1 || ~var56 >= -2) {
                                        class63.method493(var46, var60, var43, var56, var65);
                                    }
                                    class246.method1637(var56, var60, var65, var69 >> 2, class63.field1048, var64 == 0, 3 & var68, 47, var46, var43, 0);
                                }
                            }
                            if (var51[var58] != null) {
                                int var70 = 255 & var51[var58][var62];
                                if (var70 != 0) {
                                    int var71 = 13421772;
                                    int var72;
                                    if (~var56 != -2) {
                                        var72 = var57 + -1;
                                    } else {
                                        var72 = var60;
                                    }
                                    int var73;
                                    if (~var43 == -2) {
                                        var73 = var46;
                                    } else {
                                        var73 = var45 - 1;
                                    }
                                    if (~var70 <= -6 && ~var70 >= -9 || ~var70 <= -14 && ~var70 >= -17 || ~var70 <= -22 && var70 <= 24 || ~var70 == -28 || ~var70 == -29) {
                                        var71 = 13369344;
                                        var70 -= 4;
                                    }
                                    if (~var70 != -2) {
                                        if (var70 != 2) {
                                            if (var70 == 3) {
                                                class63.method481(var73, var60, var56, var71);
                                            } else if (~var70 == -5) {
                                                class63.method485(var46, var72, var43, var71);
                                            } else if (var70 != 9) {
                                                if (~var70 == -11) {
                                                    class63.method481(var73, var60, var56, 16777215);
                                                    class63.method485(var46, var60, var43, var71);
                                                } else if (~var70 == -12) {
                                                    class63.method481(var73, var60, var56, 16777215);
                                                    class63.method485(var46, var72, var43, var71);
                                                } else if (var70 != 12) {
                                                    if (~var70 == -18) {
                                                        class63.method485(var46, var60, 1, var71);
                                                    } else if (var70 == 18) {
                                                        class63.method485(var73, var60, 1, var71);
                                                    } else if (var70 == 19) {
                                                        class63.method485(var73, var72, 1, var71);
                                                    } else if (var70 != 20) {
                                                        if (var70 != 25) {
                                                            if (var70 == 26) {
                                                                for (int var74 = 0; var74 < var56; ++var74) {
                                                                    class63.method485(var46 - -var74, var60 + var74, 1, var71);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var75 = 0; var75 < var56; ++var75) {
                                                                class63.method485(var46 + var75, var72 - var75, 1, var71);
                                                            }
                                                        }
                                                    } else {
                                                        class63.method485(var46, var72, 1, var71);
                                                    }
                                                } else {
                                                    class63.method481(var46, var60, var56, 16777215);
                                                    class63.method485(var46, var72, var43, var71);
                                                }
                                            } else {
                                                class63.method481(var46, var60, var56, 16777215);
                                                class63.method485(var46, var60, var43, var71);
                                            }
                                        } else {
                                            class63.method485(var46, var60, var43, var71);
                                        }
                                    } else {
                                        class63.method481(var46, var60, var56, var71);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var76 = arg9 + var41;
                    for (int var77 = 0; ~var11 < ~var77; ++var77) {
                        int var79 = (arg0 * var77 + arg2 >> 16) + arg7;
                        int var80;
                        if (class152.field2484.field2008 != -1) {
                            var80 = class152.field2484.field2008;
                        } else if (~(var77 - -arg10 & 4) != ~(4 & arg8 + var13)) {
                            var80 = 4936552;
                        } else {
                            var80 = class292.field4635[class288.field4605 + 1];
                        }
                        int var81 = ((var77 + 1) * arg0 + arg2 >> 16) + arg7;
                        if (var80 == 0) {
                            var80 = 1;
                        }
                        int var82 = -var79 + var81;
                        class63.method493(var76, var79, var43, var82, var80);
                    }
                    var10000 = arg9 + var42;
                }
            }
        }
        if (!arg5) {
            field2532 = null;
        }
        for (int var14 = -2; var14 < var12 + 2; ++var14) {
            int var15 = arg4 * var14 + arg1 >> 16;
            int var16 = arg1 - -((var14 + 1) * arg4) >> 16;
            int var17 = -var15 + var16;
            if (var17 > 0) {
                int var18 = arg9 + var15;
                var10000 = arg9 + var16;
                int var20 = arg8 + var14 >> 6;
                if (var20 >= 0 && var20 <= class172.field2911.length + -1) {
                    int[][] var21 = class172.field2911[var20];
                    for (int var22 = -2; ~var22 > ~(var11 + 2); ++var22) {
                        int var23 = (var22 + 1) * arg0 + arg2 >> 16;
                        int var24 = arg0 * var22 + arg2 >> 16;
                        int var25 = -var24 + var23;
                        if (~var25 < -1) {
                            var10000 = arg7 + var23;
                            int var27 = arg7 + var24;
                            int var28 = arg10 + var22 >> 6;
                            if (var28 >= 0 && var28 <= var21.length + -1) {
                                int var29 = ((63 & arg10 + var22) << 6) + (63 & var14 - -arg8);
                                if (var21[var28] != null) {
                                    int var30 = var21[var28][var29];
                                    int var31 = 8191 & var30;
                                    if (var31 != 0) {
                                        class6 var32 = class33.method284(34, var31 + -1);
                                        boolean var33 = (40678 & var30) >> 15 == 1;
                                        int var34 = (30982 & var30) >> 13;
                                        class74 var35 = var32.method29(var34, var33, (byte) -71);
                                        if (var35 != null) {
                                            int var36 = var35.field2440 * var17 / 4;
                                            int var37 = var35.field2447 * var25 / 4;
                                            if (var32.field78) {
                                                int var38 = (1045227 & var30) >> 16;
                                                int var39 = var30 >> 20 & 15;
                                                if ((1 & var34) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var25 * var39;
                                                var36 = var17 * var38;
                                            }
                                            if (var36 != 0 && ~var37 != -1) {
                                                if (~var32.field76 != -1) {
                                                    var35.method593(var18, var27 - var37 - -var25, var36, var37, var32.field76);
                                                } else {
                                                    var35.method592(var18, -var37 + var25 + var27, var36, var37);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field4359.method387((byte) -128, arg1);
            ++field2525;
            if (super.field4359.field833) {
                int var4 = 0;
                int[][] var5 = super.field4359.method385((byte) -112);
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                boolean var9 = true;
                int var10 = 0;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class26.field458 * this.field2521 >> 12;
                int var15 = class26.field458 * this.field2529 >> 12;
                int var16 = class67.field1129 * this.field2530 >> 12;
                int var17 = class67.field1129 * this.field2531 >> 12;
                if (var16 <= 1) {
                    return var5[arg1];
                } else {
                    int var18 = class26.field458 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    this.field2520 = class26.field458 / 8 * this.field2519 >> 12;
                    Random var21 = new Random((long) this.field2518);
                    while (true) {
                        while (true) {
                            int var22 = class111.method824(0, var21, -var14 + var15) + var14;
                            int var23 = var17 + class111.method824(0, var21, var16 - var17);
                            int var24 = var10 - -var22;
                            if (class26.field458 < var24) {
                                var24 = class26.field458;
                                var22 = class26.field458 - var10;
                            }
                            int var29;
                            if (var11) {
                                var29 = 0;
                            } else {
                                int var25 = var8;
                                int[] var26 = var20[var8];
                                int var27 = var24 - -var4;
                                int var28 = 0;
                                var29 = var26[2];
                                if (~var27 > -1) {
                                    var27 += class26.field458;
                                }
                                if (var27 > class26.field458) {
                                    var27 -= class26.field458;
                                }
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (~var27 <= ~var30[0] && ~var30[1] <= ~var27) {
                                        if (var8 != var25) {
                                            int var31 = var4 + var10;
                                            if (~var31 > -1) {
                                                var31 += class26.field458;
                                            }
                                            if (~class26.field458 > ~var31) {
                                                var31 -= class26.field458;
                                            }
                                            for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                                int[] var40 = var20[(var8 + var32) % var12];
                                                var29 = Math.max(var29, var40[2]);
                                            }
                                            for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                                int[] var34 = var20[(var8 + var33) % var12];
                                                int var35 = var34[2];
                                                if (~var29 != ~var35) {
                                                    int var36 = var34[1];
                                                    int var37 = var34[0];
                                                    int var38;
                                                    int var39;
                                                    if (var31 < var27) {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = Math.min(var27, var36);
                                                    } else if (~var37 != -1) {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = class26.field458;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var27, var36);
                                                    }
                                                    this.method1118(var7 + var38, -var38 + var39, var5, var35, var21, -1, -var35 + var29);
                                                }
                                            }
                                        }
                                        var8 = var25;
                                        break;
                                    }
                                    ++var28;
                                    ++var25;
                                    if (var25 >= var12) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (~class67.field1129 > ~(var23 + var29)) {
                                var23 = -var29 + class67.field1129;
                            } else {
                                var9 = false;
                            }
                            if (class26.field458 == var24) {
                                this.method1118(var6 + var10, var22, var5, var29, var21, -1, var23);
                                if (var9) {
                                    return var3;
                                }
                                var11 = false;
                                var7 = var6;
                                var9 = true;
                                var8 = 0;
                                int[] var41 = var19[var13++];
                                var41[0] = var10;
                                var41[1] = var24;
                                var10 = 0;
                                var12 = var13;
                                var13 = 0;
                                int[][] var42 = var20;
                                var20 = var19;
                                var41[2] = var23 + var29;
                                var6 = class111.method824(0, var21, class26.field458);
                                var4 = -var7 + var6;
                                int var43 = var4;
                                if (var4 < 0) {
                                    var43 = class26.field458 + var4;
                                }
                                var19 = var42;
                                if (var43 > class26.field458) {
                                    var43 -= class26.field458;
                                }
                                while (true) {
                                    int[] var44 = var20[var8];
                                    if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                        break;
                                    }
                                    ++var8;
                                    if (var12 <= var8) {
                                        var8 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[1] = var24;
                                var45[2] = var23 + var29;
                                var45[0] = var10;
                                this.method1118(var6 + var10, var22, var5, var29, var21, -1, var23);
                                var10 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            method1120(100, -49, 50, -90, 90, 82, -52, 20, (class60) null, -47, true, 112L);
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field2528 = arg0.method996(65280);
                                        }
                                    } else {
                                        this.field2527 = arg0.method996(65280);
                                    }
                                } else {
                                    this.field2517 = arg0.method1012(4);
                                }
                            } else {
                                this.field2519 = arg0.method996(65280);
                            }
                        } else {
                            this.field2530 = arg0.method996(arg2 ^ 65285);
                        }
                    } else {
                        this.field2531 = arg0.method996(65280);
                    }
                } else {
                    this.field2529 = arg0.method996(arg2 + 65275);
                }
            } else {
                this.field2521 = arg0.method996(65280);
            }
        } else {
            this.field2518 = arg0.method1012(arg2 + -1);
        }
        ++field2523;
    }
}
