import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class128 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lmc;")
    public static class75 field3117 = class30.method234(true, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lmc;")
    private static class75 field3115 = class30.method234(true, "Error loading your profile)3");

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lmc;")
    public static class75 field3121 = class30.method234(true, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lmc;")
    private static class75 field3119 = class30.method234(true, "glow1:");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lmc;")
    public static class75 field3120 = field3119;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lmc;")
    public static class75 field3128 = class30.method234(true, "lila:");

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lmc;")
    public static class75 field3126 = class30.method234(true, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field3129 = 0;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lmc;")
    public static class75 field3118 = field3115;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field3124 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lja;")
    public static class55 field3123;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BII[B)I", line = 9)
    public static final int method1004(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        field3130++;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class86.field2121[(arg3[var5] ^ var4) & 0xFF];
        }
        if (arg0 < 48) {
            field3117 = null;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIILj;I)V", line = 43)
    public static final void method1005(byte arg0, int arg1, int arg2, class54 arg3, int arg4) {
        class35.field848.method767(false);
        class88.field2159.method687(0, 0);
        field3116++;
        arg3.method424(class12.field234, 55, 28, 16777215, true);
        if (arg1 == 0) {
            arg3.method424(class74.field1850, 55, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg3.method424(class15.field273, 55, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg3.method424(class1.field20, 55, 41, 16711680, true);
        }
        if (arg1 == 3) {
            arg3.method424(class15.field282, 55, 41, 65535, true);
        }
        arg3.method424(class25.field499, 184, 28, 16777215, true);
        if (arg2 == 0) {
            arg3.method424(class74.field1850, 184, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg3.method424(class15.field273, 184, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg3.method424(class1.field20, 184, 41, 16711680, true);
        }
        arg3.method424(class70.field1792, 324, 28, 16777215, true);
        if (arg4 == 0) {
            arg3.method424(class74.field1850, 324, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg3.method424(class15.field273, 324, 41, 16776960, true);
        }
        int var5 = 19 / ((-arg0 - 48) / 42);
        if (arg4 == 2) {
            arg3.method424(class1.field20, 324, 41, 16711680, true);
        }
        arg3.method424(class50.field1262, 458, 33, 16777215, true);
        try {
            Graphics var6 = class108.field2738.getGraphics();
            class35.field848.method403(0, (byte) -88, var6, 453);
        } catch (Exception var7) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lja;I)V", line = 98)
    public static final void method1006(class55 arg0, int arg1) {
        class59.field1482 = arg0;
        field3127++;
        class23.field448 = class59.field1482.method430(24094, 16);
        if (arg1 >= -100) {
            method1007(33);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 110)
    public static void method1007(int arg0) {
        field3123 = null;
        field3115 = null;
        field3119 = null;
        field3126 = null;
        field3121 = null;
        field3128 = null;
        field3117 = null;
        if (arg0 < 62) {
            method1004((byte) -50, 78, 106, null);
        }
        field3120 = null;
        field3118 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIBIIIII)Z", line = 128)
    public static final boolean method1008(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3125++;
        if (!class129.method1013(arg1, -1)) {
            return false;
        }
        class66.method570(arg2, arg6, arg8, arg7);
        boolean var9 = true;
        class99[] var10 = class74.field1854[arg1];
        if (arg3 > -21) {
            return false;
        }
        for (int var11 = 0; var11 < var10.length; var11++) {
            class99 var12 = var10[var11];
            if (var12 != null && var12.field2556 == arg0) {
                if (var12.field2503 > 0) {
                    class122.method960(var12, -32128);
                }
                int var13 = arg6 + var12.field2504 - arg5;
                int var14 = var12.field2524 + arg2;
                if (var12.field2535 == 0) {
                    if (var12.field2540 && !class71.method602((byte) 58, arg4, var11)) {
                        continue;
                    }
                    if (var12.field2558 - var12.field2546 < var12.field2493) {
                        var12.field2493 = var12.field2558 - var12.field2546;
                    }
                    if (var12.field2493 < 0) {
                        var12.field2493 = 0;
                    }
                    var9 &= method1008(var11, arg1, var14, (byte) -98, arg4, var12.field2493, var13, var12.field2546 + var13, var14 - -var12.field2548);
                    class66.method570(arg2, arg6, arg8, arg7);
                    if (var12.field2558 > var12.field2546) {
                        class24.method168(var12.field2493, var12.field2558, 40, var14 + var12.field2548, var12.field2546, var13);
                    }
                }
                if (var12.field2535 != 1) {
                    if (var12.field2535 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field2546; var16++) {
                            for (int var17 = 0; var17 < var12.field2548; var17++) {
                                int var18 = var14 + (var12.field2494 + 32) * var17;
                                int var19 = (var12.field2530 + 32) * var16 + var13;
                                if (var15 < 20) {
                                    var18 += var12.field2542[var15];
                                    var19 += var12.field2517[var15];
                                }
                                if (var12.field2520[var15] > 0) {
                                    int var20 = 0;
                                    int var21 = 0;
                                    int var22 = var12.field2520[var15] - 1;
                                    if (class66.field1716 - 32 < var18 && class66.field1719 > var18 && class66.field1717 - 32 < var19 && var19 < class66.field1718 || class37.field885 != 0 && class131.field3180 == var15) {
                                        int var23 = 0;
                                        if (class42.field1013 == 1 && class98.field2478 == var15 && (arg1 << 16) + var11 == class119.field2940) {
                                            var23 = 16777215;
                                        }
                                        class2 var24 = class43.method329(var12.field2509[var15], var23, var22, -122);
                                        if (var24 == null) {
                                            var9 = false;
                                        } else {
                                            if (class37.field885 != 0 && class131.field3180 == var15 && (arg1 << 16) + var11 == class32.field719) {
                                                var20 = class45.field1104 - class7.field118;
                                                var21 = class90.field2200 - client.field378;
                                                if (var20 < 5 && var20 > -5) {
                                                    var20 = 0;
                                                }
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                if (class110.field2788 < 5) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                }
                                                var24.method15(var18 + var21, var19 + var20, 128);
                                                if (arg0 != -1) {
                                                    class99 var25 = var10[arg0];
                                                    if (var19 + var20 < class66.field1717 && var25.field2493 > 0) {
                                                        int var26 = (class66.field1717 - var19 - var20) * class71.field1802 / 3;
                                                        if (var26 > class71.field1802 * 10) {
                                                            var26 = class71.field1802 * 10;
                                                        }
                                                        if (var26 > var25.field2493) {
                                                            var26 = var25.field2493;
                                                        }
                                                        var25.field2493 -= var26;
                                                        class7.field118 += var26;
                                                    }
                                                    if (var19 + var20 + 32 > class66.field1718 && var25.field2493 < var25.field2558 - var25.field2546) {
                                                        int var27 = (var20 + var19 + 32 - class66.field1718) * class71.field1802 / 3;
                                                        if (var27 > class71.field1802 * 10) {
                                                            var27 = class71.field1802 * 10;
                                                        }
                                                        if (var27 > var25.field2558 - var25.field2493 - var25.field2546) {
                                                            var27 = var25.field2558 - var25.field2546 - var25.field2493;
                                                        }
                                                        var25.field2493 += var27;
                                                        class7.field118 -= var27;
                                                    }
                                                }
                                            } else if (class44.field1063 != 0 && class76.field1931 == var15 && (arg1 << 16) + var11 == class34.field793) {
                                                var24.method15(var18, var19, 128);
                                            } else {
                                                var24.method14(var18, var19);
                                            }
                                            if (var24.field36 == 33 || var12.field2509[var15] != 1) {
                                                int var28 = var12.field2509[var15];
                                                class44.field1046.method423(class108.method889((byte) 63, var28), var18 + var21 + 1, var19 + 10 + var20, 0);
                                                class44.field1046.method423(class108.method889((byte) 72, var28), var18 + var21, var19 - -9 - -var20, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field2492 != null && var15 < 20) {
                                    class2 var29 = var12.method827(var15, -4414);
                                    if (var29 != null) {
                                        var29.method14(var18, var19);
                                    } else if (class47.field1128) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field2535 == 3) {
                        int var30;
                        if (class30.method238(27389, var12)) {
                            var30 = var12.field2512;
                            if (class71.method602((byte) 48, arg4, var11) && var12.field2550 != 0) {
                                var30 = var12.field2550;
                            }
                        } else {
                            var30 = var12.field2488;
                            if (class71.method602((byte) -76, arg4, var11) && var12.field2543 != 0) {
                                var30 = var12.field2543;
                            }
                        }
                        if (var12.field2489 == 0) {
                            if (var12.field2562) {
                                class66.method569(var14, var13, var12.field2548, var12.field2546, var30);
                            } else {
                                class66.method578(var14, var13, var12.field2548, var12.field2546, var30);
                            }
                        } else if (var12.field2562) {
                            class66.method571(var14, var13, var12.field2548, var12.field2546, var30, 256 - (var12.field2489 & 0xFF));
                        } else {
                            class66.method577(var14, var13, var12.field2548, var12.field2546, var30, 256 - (var12.field2489 & 0xFF));
                        }
                    } else if (var12.field2535 == 4) {
                        class54 var31 = var12.method824(0);
                        if (var31 != null) {
                            class75 var32 = var12.field2529;
                            int var33;
                            if (class30.method238(27389, var12)) {
                                var33 = var12.field2512;
                                if (class71.method602((byte) 93, arg4, var11) && var12.field2550 != 0) {
                                    var33 = var12.field2550;
                                }
                                if (var12.field2536.method621(-19198) > 0) {
                                    var32 = var12.field2536;
                                }
                            } else {
                                var33 = var12.field2488;
                                if (class71.method602((byte) -70, arg4, var11) && var12.field2543 != 0) {
                                    var33 = var12.field2543;
                                }
                            }
                            if (var12.field2498 == 6 && class75.field1894) {
                                var32 = class94.field2363;
                                var33 = var12.field2488;
                            }
                            if (class66.field1721 == 479) {
                                if (var33 == 16776960) {
                                    var33 = 255;
                                }
                                if (var33 == 49152) {
                                    var33 = 16777215;
                                }
                            }
                            class75 var34 = class131.method1019((byte) 121, var12, var32);
                            var31.method408(var34, var14, var13, var12.field2548, var12.field2546, var33, var12.field2514, var12.field2511, var12.field2490, var12.field2538);
                        } else if (class47.field1128) {
                            var9 = false;
                        }
                    } else if (var12.field2535 == 5) {
                        class2 var35 = var12.method825((byte) -61, class30.method238(27389, var12));
                        if (var35 != null) {
                            var35.method14(var14, var13);
                        } else if (class47.field1128) {
                            var9 = false;
                        }
                    } else if (var12.field2535 == 6) {
                        class49.method380(var12.field2548 / 2 + var14, var12.field2546 / 2 + var13);
                        int var36 = class49.field1196[var12.field2505] * var12.field2555 >> 16;
                        int var37 = class49.field1194[var12.field2505] * var12.field2555 >> 16;
                        boolean var38 = class30.method238(27389, var12);
                        int var39;
                        if (var38) {
                            var39 = var12.field2545;
                        } else {
                            var39 = var12.field2495;
                        }
                        class93 var40;
                        if (var12.field2506 == 5) {
                            var40 = class118.field2920.method341(-1, -1, null, null, (byte) -119);
                        } else if (var39 == -1) {
                            var40 = var12.method830(-1, var38, class52.field1315.field2973, null, -1417194576);
                            if (var40 == null && class47.field1128) {
                                var9 = false;
                            }
                        } else {
                            class107 var41 = class37.method289(var39, (byte) -128);
                            var40 = var12.method830(var12.field2499, var38, class52.field1315.field2973, var41, -1417194576);
                            if (var40 == null && class47.field1128) {
                                var9 = false;
                            }
                        }
                        if (var40 != null) {
                            var40.method785(0, var12.field2549, 0, var12.field2505, 0, var36, var37);
                        }
                        class49.method374();
                    } else {
                        if (var12.field2535 == 7) {
                            class54 var42 = var12.method824(0);
                            if (var42 == null) {
                                if (class47.field1128) {
                                    var9 = false;
                                }
                                continue;
                            }
                            int var43 = 0;
                            for (int var44 = 0; var44 < var12.field2546; var44++) {
                                for (int var45 = 0; var45 < var12.field2548; var45++) {
                                    if (var12.field2520[var43] > 0) {
                                        class10 var46 = class43.method326(var12.field2520[var43] - 1, 0);
                                        class75 var47 = var46.field204;
                                        if (var47 == null) {
                                            var47 = class64.field1682;
                                        }
                                        if (var46.field186 || var12.field2509[var43] != 1) {
                                            var47 = class69.method586(new class75[] { var47, class58.field1467, client.method133(var12.field2509[var43], (byte) 53) }, (byte) 115);
                                        }
                                        int var48 = (var12.field2494 + 115) * var45 + var14;
                                        int var49 = (var12.field2530 + 12) * var44 + var13;
                                        if (var12.field2511 == 0) {
                                            var42.method412(var47, var48, var49, var12.field2488, var12.field2514);
                                        } else if (var12.field2511 == 1) {
                                            var42.method424(var47, var48 + var12.field2548 / 2, var49, var12.field2488, var12.field2514);
                                        } else {
                                            var42.method426(var47, var48 + var12.field2548 - 1, var49, var12.field2488, var12.field2514);
                                        }
                                    }
                                    var43++;
                                }
                            }
                        }
                        if (var12.field2535 == 8 && class122.method962(31707, arg4, var11) && class85.field2110 == class69.field1762) {
                            int var50 = 0;
                            int var51 = 0;
                            class54 var52 = class114.field2869;
                            class75 var53 = var12.field2529;
                            class75 var54 = class131.method1019((byte) 119, var12, var53);
                            while (var54.method621(-19198) > 0) {
                                int var62 = var54.method644(class82.field2051, 0);
                                class75 var63;
                                if (var62 == -1) {
                                    var63 = var54;
                                    var54 = class16.field309;
                                } else {
                                    var63 = var54.method647(0, 0, var62);
                                    var54 = var54.method645(var62 + 2, (byte) 110);
                                }
                                int var64 = var52.method421(var63);
                                if (var64 > var51) {
                                    var51 = var64;
                                }
                                var50 += var52.field1341 + 1;
                            }
                            var50 += 7;
                            var51 += 6;
                            int var55 = var14 + var12.field2548 - var51 - 5;
                            int var56 = var13 + var12.field2546 + 5;
                            if (var50 + var56 > arg7) {
                                var56 = arg7 - var50;
                            }
                            if (var55 < var14 + 5) {
                                var55 = var14 + 5;
                            }
                            if (var51 + var55 > arg8) {
                                var55 = arg8 - var51;
                            }
                            class66.method569(var55, var56, var51, var50, 16777120);
                            class66.method578(var55, var56, var51, var50, 0);
                            class75 var57 = var12.field2529;
                            int var58 = var56 + var52.field1341 + 2;
                            class75 var59 = class131.method1019((byte) 127, var12, var57);
                            while (var59.method621(-19198) > 0) {
                                int var60 = var59.method644(class82.field2051, 0);
                                class75 var61;
                                if (var60 == -1) {
                                    var61 = var59;
                                    var59 = class16.field309;
                                } else {
                                    var61 = var59.method647(0, 0, var60);
                                    var59 = var59.method645(var60 + 2, (byte) 110);
                                }
                                var52.method412(var61, var55 + 3, var58, 0, false);
                                var58 += var52.field1341 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lja;III)[Lnc;", line = 678)
    public static final class81[] method1009(class55 arg0, int arg1, int arg2, int arg3) {
        field3131++;
        if (arg3 != 5) {
            field3126 = null;
        }
        return class82.method693(2151, arg2, arg0, arg1) ? class127.method1003(false) : null;
    }
}
