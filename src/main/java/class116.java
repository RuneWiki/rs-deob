import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class116 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Ldf;")
    public static class51 field1964 = class46.method233("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 100);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Ldf;")
    private static class51 field1965 = class46.method233("Please wait)3)3)3", 100);

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Ldf;")
    public static class51 field1966 = field1965;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1962 = -1;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Ldf;")
    public static class51 field1970 = class46.method233("m-Ochte mit Ihnen handeln)3", 100);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[Ltg;")
    public static class171[] field1968;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static final void method848(int arg0) {
        field1967++;
        if (class85.method655(-18901) != 2) {
            return;
        }
        byte var1 = (byte) (class182.field2994 - 4 & 0xFF);
        int var2 = -123 % ((47 - arg0) / 39);
        int var3 = class182.field2994 % 104;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class92.field1522[var4][var3][var17] = var1;
            }
        }
        if (class257.field4496 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class69.field1119[var5] = -1000000;
            class109.field1855[var5] = 1000000;
            class79.field1262[var5] = 0;
            class75.field1215[var5] = 1000000;
            class8.field83[var5] = 0;
        }
        if (class201.field3361 != 1) {
            int var6 = class207.method1424(class257.field4496, class209.field3488, (byte) 22, class144.field2408);
            if ((var6 - class120.field2001) < 800 && (class160.field2626[class257.field4496][class209.field3488 >> 7][class144.field2408 >> 7] & 0x4) != 0) {
                class184.method1300(1, class27.field395, (byte) 101, class209.field3488 >> 7, false, class144.field2408 >> 7);
                return;
            }
            return;
        }
        if ((class160.field2626[class257.field4496][class44.field706.field4319 >> 7][class44.field706.field4348 >> 7] & 0x4) != 0) {
            class184.method1300(0, class27.field395, (byte) 101, class44.field706.field4319 >> 7, false, class44.field706.field4348 >> 7);
        }
        if (class107.field1763 >= 310) {
            return;
        }
        int var7 = class209.field3488 >> 7;
        int var8 = class44.field706.field4348 >> 7;
        int var9 = class44.field706.field4319 >> 7;
        int var10 = class144.field2408 >> 7;
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        int var12;
        if (var10 < var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        if (var11 > var12) {
            int var13 = var12 * 65536 / var11;
            int var14 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class160.field2626[class257.field4496][var7][var10] & 0x4) != 0) {
                    class184.method1300(1, class27.field395, (byte) 101, var7, false, var10);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    if (var10 < var8) {
                        var10++;
                    } else if (var10 > var8) {
                        var10--;
                    }
                    var14 -= 65536;
                    if ((class160.field2626[class257.field4496][var7][var10] & 0x4) != 0) {
                        class184.method1300(1, class27.field395, (byte) 101, var7, false, var10);
                        return;
                    }
                }
            }
            return;
        }
        int var15 = var11 * 65536 / var12;
        int var16 = 32768;
        while (var8 != var10) {
            if (var10 < var8) {
                var10++;
            } else if (var10 > var8) {
                var10--;
            }
            if ((class160.field2626[class257.field4496][var7][var10] & 0x4) != 0) {
                class184.method1300(1, class27.field395, (byte) 101, var7, false, var10);
                return;
            }
            var16 += var15;
            if (var16 >= 65536) {
                var16 -= 65536;
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class160.field2626[class257.field4496][var7][var10] & 0x4) != 0) {
                    class184.method1300(1, class27.field395, (byte) 101, var7, false, var10);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static void method849(int arg0) {
        field1968 = null;
        field1966 = null;
        field1965 = null;
        int var1 = -12 % ((-arg0 - 45) / 63);
        field1964 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIBIIIIII)V")
    public static final void method850(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1963++;
        int var11 = arg5 - arg1;
        if (arg5 < class5.field38) {
            var11++;
        }
        int var12 = arg2 - arg9;
        if (class85.field1433 > arg2) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var33 = arg10 * var13 + arg7 >> 16;
            int var34 = arg7 + ((var13 + 1) * arg10) >> 16;
            int var35 = var34 - var33;
            if (var35 > 0) {
                int var36 = arg1 + var13 >> 6;
                if (var36 >= 0 && (class45.field716.length - 1) >= var36) {
                    int var37 = arg3 + var34;
                    int var38 = arg3 + var33;
                    int[][] var39 = class45.field716[var36];
                    byte[][] var40 = class111.field1877[var36];
                    byte[][] var41 = class222.field3873[var36];
                    byte[][] var42 = class172.field2817[var36];
                    byte[][] var43 = class202.field3379[var36];
                    byte[][] var44 = class214.field3709[var36];
                    for (int var45 = 0; var45 < var12; var45++) {
                        int var46 = arg0 * var45 + arg8 >> 16;
                        int var47 = (var45 + 1) * arg0 + arg8 >> 16;
                        int var48 = var47 - var46;
                        if (var48 > 0) {
                            int var49 = arg6 + var46;
                            int var50 = arg6 + var47;
                            int var51 = arg9 + var45 & 0x3F;
                            int var52 = arg9 + var45 >> 6;
                            int var53 = arg1 + var13 & 0x3F;
                            int var54 = (var51 << 6) + var53;
                            int var55;
                            if (var52 < 0 || var52 > var39.length - 1 || var39[var52] == null) {
                                if (class93.field1546.field45 != -1) {
                                    var55 = class93.field1546.field45;
                                } else if ((arg1 + var13 & 0x4) == (arg9 + var45 & 0x4)) {
                                    var55 = class172.field2808[class140.field2350 + 1];
                                } else {
                                    var55 = 4936552;
                                }
                                if (var52 < 0 || var39.length - 1 < var52) {
                                    if (var55 == 0) {
                                        var55 = 1;
                                    }
                                    class59.method393(var38, var49, var35, var48, var55);
                                    continue;
                                }
                            } else {
                                var55 = var39[var52][var54];
                            }
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            int var56 = var42[var52] == null ? 0 : class172.field2808[var42[var52][var54] & 0xFF];
                            int var57 = var40[var52] == null ? 0 : class172.field2808[var40[var52][var54] & 0xFF];
                            if (var57 == 0 && var56 == 0) {
                                class59.method393(var38, var49, var35, var48, var55);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var58 = var41[var52] == null ? 0 : var41[var52][var54];
                                    int var59 = var58 & 0xFC;
                                    if (var59 == 0 || var35 <= 1 || var48 <= 1) {
                                        class59.method393(var38, var49, var35, var48, var57);
                                    } else {
                                        class184.method1303(var48, var38, var35, var57, var59 >> 2, var58 & 0x3, true, var49, class59.field957, -126, var55);
                                    }
                                }
                                if (var56 != 0) {
                                    byte var60 = var43[var52][var54];
                                    if (var56 == -1) {
                                        var56 = var55;
                                    }
                                    int var61 = var60 & 0xFC;
                                    if (var61 == 0 || var35 <= 1 || var48 <= 1) {
                                        class59.method393(var38, var49, var35, var48, var56);
                                    }
                                    class184.method1303(var48, var38, var35, var56, var61 >> 2, var60 & 0x3, var57 == 0, var49, class59.field957, -115, 0);
                                }
                            }
                            if (var44[var52] != null) {
                                int var62 = var44[var52][var54] & 0xFF;
                                if (var62 != 0) {
                                    int var63;
                                    if (var35 == 1) {
                                        var63 = var38;
                                    } else {
                                        var63 = var37 - 1;
                                    }
                                    int var64;
                                    if (var48 == 1) {
                                        var64 = var49;
                                    } else {
                                        var64 = var50 - 1;
                                    }
                                    int var65 = 13421772;
                                    if (var62 >= 5 && var62 <= 8 || var62 >= 13 && var62 <= 16 || var62 >= 21 && var62 <= 24 || var62 == 27 || var62 == 28) {
                                        var65 = 13369344;
                                        var62 -= 4;
                                    }
                                    if (var62 == 1) {
                                        class59.method376(var38, var49, var48, var65);
                                    } else if (var62 == 2) {
                                        class59.method386(var38, var49, var35, var65);
                                    } else if (var62 == 3) {
                                        class59.method376(var63, var49, var48, var65);
                                    } else if (var62 == 4) {
                                        class59.method386(var38, var64, var35, var65);
                                    } else if (var62 == 9) {
                                        class59.method376(var38, var49, var48, 16777215);
                                        class59.method386(var38, var49, var35, var65);
                                    } else if (var62 == 10) {
                                        class59.method376(var63, var49, var48, 16777215);
                                        class59.method386(var38, var49, var35, var65);
                                    } else if (var62 == 11) {
                                        class59.method376(var63, var49, var48, 16777215);
                                        class59.method386(var38, var64, var35, var65);
                                    } else if (var62 == 12) {
                                        class59.method376(var38, var49, var48, 16777215);
                                        class59.method386(var38, var64, var35, var65);
                                    } else if (var62 == 17) {
                                        class59.method386(var38, var49, 1, var65);
                                    } else if (var62 == 18) {
                                        class59.method386(var63, var49, 1, var65);
                                    } else if (var62 == 19) {
                                        class59.method386(var63, var64, 1, var65);
                                    } else if (var62 == 20) {
                                        class59.method386(var38, var64, 1, var65);
                                    } else if (var62 == 25) {
                                        for (int var67 = 0; var67 < var48; var67++) {
                                            class59.method386(var38 + var67, var64 - var67, 1, var65);
                                        }
                                    } else if (var62 == 26) {
                                        for (int var66 = 0; var66 < var48; var66++) {
                                            class59.method386(var38 + var66, var49 + var66, 1, var65);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var68 = arg3 + var33;
                    var10000 = arg3 + var34;
                    for (int var70 = 0; var70 < var12; var70++) {
                        int var71;
                        if (class93.field1546.field45 != -1) {
                            var71 = class93.field1546.field45;
                        } else if ((var70 + arg9 & 0x4) == (arg1 + var13 & 0x4)) {
                            var71 = class172.field2808[class140.field2350 + 1];
                        } else {
                            var71 = 4936552;
                        }
                        int var72 = ((var70 + 1) * arg0 + arg8 >> 16) + arg6;
                        if (var71 == 0) {
                            var71 = 1;
                        }
                        int var73 = (arg0 * var70 + arg8 >> 16) + arg6;
                        int var74 = var72 - var73;
                        class59.method393(var68, var73, var35, var74, var71);
                    }
                }
            }
        }
        int var14 = 126 / ((4 - arg4) / 61);
        for (int var15 = -2; var15 < (var11 + 2); var15++) {
            int var16 = arg10 * var15 + arg7 >> 16;
            int var17 = (var15 + 1) * arg10 + arg7 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                int var19 = arg3 + var16;
                var10000 = arg3 + var17;
                int var21 = arg1 + var15 >> 6;
                if (var21 >= 0 && (class262.field4574.length - 1) >= var21) {
                    short[][] var22 = class262.field4574[var21];
                    for (int var23 = -2; var23 < (var12 + 2); var23++) {
                        int var24 = arg0 * var23 + arg8 >> 16;
                        int var25 = (var23 + 1) * arg0 + arg8 >> 16;
                        int var26 = var25 - var24;
                        if (var26 > 0) {
                            int var27 = arg6 + var24;
                            int var28 = arg9 + var23 >> 6;
                            var10000 = arg6 + var25;
                            if (var28 >= 0 && var22.length - 1 >= var28) {
                                int var30 = ((arg9 + var23 & 0x3F) << 6) + (arg1 + var15 & 0x3F);
                                if (var22[var28] != null) {
                                    int var31 = var22[var28][var30] & 0x3FFF;
                                    int var32 = var22[var28][var30] >> 14 & 0x3;
                                    if (var31 != 0) {
                                        if (var32 == 0) {
                                            class146.field2441[var31 - 1].method1128(var19, var27, var18 * 2, var26 * 2);
                                        } else if (var32 == 1) {
                                            class34.field514[var31 - 1].method1128(var19, var27, var18 * 2, var26 * 2);
                                        } else if (var32 == 2) {
                                            class138.field2322[var31 - 1].method1128(var19, var27, var18 * 2, var26 * 2);
                                        } else if (var32 == 3) {
                                            class264.field4620[var31 - 1].method1128(var19, var27, var18 * 2, var26 * 2);
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
