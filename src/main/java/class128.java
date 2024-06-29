import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class128 {

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1755 = null;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lti;")
    public static class211 field1760;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 5)
    public static void method921(int arg0) {
        int var1 = 41 / ((arg0 - 22) / 61);
        field1760 = null;
        field1755 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIBIIIIIIII)V", line = 17)
    public static final void method922(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1756++;
        int var11 = arg0 - arg6;
        if (arg0 < class56.field765) {
            var11++;
        }
        int var12 = arg3 - arg5;
        if (arg3 < class20.field258) {
            var12++;
        }
        if (arg2 < 96) {
            return;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg4 * var13 + arg7 >> 16;
            int var15 = arg7 + ((var13 + 1) * arg4) >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg5 + var13 >> 6;
                if (var17 >= 0 && (class172.field2347.length - 1) >= var17) {
                    int var18 = arg9 + var14;
                    int var19 = arg9 + var15;
                    int[][] var20 = class172.field2347[var17];
                    byte[][] var21 = class194.field2704[var17];
                    byte[][] var22 = class256.field3703[var17];
                    byte[][] var23 = class271.field4053[var17];
                    byte[][] var24 = class249.field3583[var17];
                    byte[][] var25 = class294.field4370[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = (var26 + 1) * arg8 + arg10 >> 16;
                        int var28 = arg8 * var26 + arg10 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg1 + var27;
                            int var31 = var26 + arg6 >> 6;
                            int var32 = arg1 + var28;
                            int var33 = arg6 + var26 & 0x3F;
                            int var34 = var13 + arg5 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var31 < 0 || (var20.length - 1) < var31 || var20[var31] == null) {
                                if (class135.field1864.field4410 != -1) {
                                    var36 = class135.field1864.field4410;
                                } else if ((arg5 + var13 & 0x4) == (arg6 + var26 & 0x4)) {
                                    var36 = class301.field4447[class151.field2092 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var31 < 0 || (var20.length - 1) < var31) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class38.method224(var18, var32, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var31][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var22[var31] == null ? 0 : class301.field4447[var22[var31][var35] & 0xFF];
                            int var38 = var25[var31] == null ? 0 : class301.field4447[var25[var31][var35] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class38.method224(var18, var32, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    byte var39 = var21[var31] == null ? 0 : var21[var31][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class38.method224(var18, var32, var16, var29, var37);
                                    } else {
                                        class103.method759(var18, var29, true, -12702, var16, class38.field429, var32, var36, var39 & 0x3, var40 >> 2, var37);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var31][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class38.method224(var18, var32, var16, var29, var38);
                                    }
                                    class103.method759(var18, var29, var37 == 0, -12702, var16, class38.field429, var32, 0, var41 & 0x3, var42 >> 2, var38);
                                }
                            }
                            if (var23[var31] != null) {
                                int var43 = var23[var31][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var29 == 1) {
                                        var44 = var32;
                                    } else {
                                        var44 = var30 - 1;
                                    }
                                    int var45 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var45 = 13369344;
                                    }
                                    int var46;
                                    if (var16 == 1) {
                                        var46 = var18;
                                    } else {
                                        var46 = var19 - 1;
                                    }
                                    if (var43 == 1) {
                                        class38.method223(var18, var32, var29, var45);
                                    } else if (var43 == 2) {
                                        class38.method213(var18, var32, var16, var45);
                                    } else if (var43 == 3) {
                                        class38.method223(var46, var32, var29, var45);
                                    } else if (var43 == 4) {
                                        class38.method213(var18, var44, var16, var45);
                                    } else if (var43 == 9) {
                                        class38.method223(var18, var32, var29, 16777215);
                                        class38.method213(var18, var32, var16, var45);
                                    } else if (var43 == 10) {
                                        class38.method223(var46, var32, var29, 16777215);
                                        class38.method213(var18, var32, var16, var45);
                                    } else if (var43 == 11) {
                                        class38.method223(var46, var32, var29, 16777215);
                                        class38.method213(var18, var44, var16, var45);
                                    } else if (var43 == 12) {
                                        class38.method223(var18, var32, var29, 16777215);
                                        class38.method213(var18, var44, var16, var45);
                                    } else if (var43 == 17) {
                                        class38.method213(var18, var32, 1, var45);
                                    } else if (var43 == 18) {
                                        class38.method213(var46, var32, 1, var45);
                                    } else if (var43 == 19) {
                                        class38.method213(var46, var44, 1, var45);
                                    } else if (var43 == 20) {
                                        class38.method213(var18, var44, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class38.method213(var18 + var48, -var48 + var44, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class38.method213(var18 + var47, var32 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var49 = arg9 + var14;
                    for (int var50 = 0; var50 < var11; var50++) {
                        int var51;
                        if (class135.field1864.field4410 != -1) {
                            var51 = class135.field1864.field4410;
                        } else if ((arg5 + var13 & 0x4) == (arg6 + var50 & 0x4)) {
                            var51 = class301.field4447[class151.field2092 + 1];
                        } else {
                            var51 = 4936552;
                        }
                        if (var51 == 0) {
                            var51 = 1;
                        }
                        int var52 = (arg8 * var50 + arg10 >> 16) + arg1;
                        int var53 = (arg10 + ((var50 + 1) * arg8) >> 16) + arg1;
                        int var54 = var53 - var52;
                        class38.method224(var49, var52, var16, var54, var51);
                    }
                    var10000 = arg9 + var15;
                }
            }
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg7 + (arg4 * var56) >> 16;
            int var58 = (var56 + 1) * arg4 + arg7 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg5 + var56 >> 6;
                int var61 = arg9 + var57;
                var10000 = arg9 + var58;
                if (var60 >= 0 && var60 <= class21.field279.length - 1) {
                    int[][] var63 = class21.field279[var60];
                    for (int var64 = -2; var64 < (var11 + 2); var64++) {
                        int var65 = arg8 * var64 + arg10 >> 16;
                        int var66 = arg10 + ((var64 + 1) * arg8) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg1 + var65;
                            var10000 = arg1 + var66;
                            int var70 = var64 + arg6 >> 6;
                            if (var70 >= 0 && var70 <= (var63.length - 1)) {
                                int var71 = (var64 + arg6 & 0x3F << 6) + (arg5 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class187 var74 = class344.method2375((byte) -40, var73 - 1);
                                        int var75 = var72 >> 13 & 0x3;
                                        boolean var76 = (var72 >> 15 & 0x1) == 1;
                                        class258 var77 = var74.method1315(948979152, var76, var75);
                                        if (var77 != null) {
                                            int var78 = var77.field38 * var67 / 4;
                                            int var79 = var77.field28 * var59 / 4;
                                            if (var74.field2584) {
                                                int var80 = (var72 & 0xF4DF0E) >> 20;
                                                int var81 = var72 >> 16 & 0xF;
                                                if ((var75 & 0x1) == 1) {
                                                    int var82 = var81;
                                                    var81 = var80;
                                                    var80 = var82;
                                                }
                                                var78 = var67 * var80;
                                                var79 = var59 * var81;
                                            }
                                            if (var79 != 0 && var78 != 0) {
                                                if (var74.field2582 == 0) {
                                                    var77.method1781(var61, var67 + var68 - var78, var79, var78);
                                                } else {
                                                    var77.method1773(var61, var67 + var68 - var78, var79, var78, var74.field2582);
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

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBI)V", line = 436)
    public static final void method923(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1758++;
        if (arg3 == 107 && arg0 >= class206.field2952 && class259.field3813 >= arg0) {
            int var5 = class185.method1299(arg2, (byte) 117, class44.field536, class101.field1397);
            int var6 = class185.method1299(arg4, (byte) 121, class44.field536, class101.field1397);
            class56.method384(var5, false, arg1, arg0, var6);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V", line = 457)
    public static final void method924(int arg0, int arg1) {
        class162.field2229 = arg1;
        field1757++;
        class61.field813 = arg0;
        class129.field1776 = 3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(FIIZIIBI)[I", line = 471)
    public static final int[] method925(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1759++;
        int[] var8 = new int[arg1];
        class116 var9 = new class116();
        var9.field1584 = arg4;
        var9.field1570 = arg3;
        var9.field1582 = (int) (arg0 * 4096.0F);
        var9.field1579 = arg2;
        var9.field1571 = arg5;
        var9.field1575 = arg7;
        var9.method546(arg6 ^ 0x5477);
        if (arg6 == -103) {
            class111.method810(arg1, 1, -1);
            var9.method861((byte) 83, var8, 0);
            return var8;
        } else {
            return (int[]) null;
        }
    }
}
