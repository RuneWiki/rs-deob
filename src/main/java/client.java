import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class64 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "La;")
    public static class1 field579 = class113.method934(-11538, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "La;")
    public static class1 field584 = class113.method934(-11538, "logo");

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "La;")
    private static class1 field589 = class113.method934(-11538, "Use");

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field586 = 0;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "La;")
    private static class1 field597 = class113.method934(-11538, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "La;")
    public static class1 field599 = class113.method934(-11538, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "La;")
    public static class1 field603 = field597;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field591 = -1;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field588 = 1;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "La;")
    private static class1 field605 = class113.method934(-11538, "Welcome to RuneScape");

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "La;")
    public static class1 field583 = field605;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "[La;")
    public static class1[] field600 = new class1[5];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "La;")
    public static class1 field585 = field589;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "La;")
    public static class1 field610 = class113.method934(-11538, "backtop1");

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
    public static boolean field612;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
    public static boolean field613;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 3)
    private final void method278(int arg0, int arg1) {
        field611++;
        if (class34.field916 == class17.field546) {
            class17.field546 = class5.field224;
        } else {
            class17.field546 = class34.field916;
        }
        class66.field1654 = null;
        class134.field3302 = null;
        class14.field467++;
        if (arg0 != 30) {
            main(null);
        }
        class14.field465 = 0;
        if (class14.field467 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class103.field2602 > 5) {
                class39.field1060 = 3000;
            } else {
                this.method623((byte) 122, "js5connect_full");
                class103.field2602 = 1000;
            }
        } else if (class14.field467 >= 2 && arg1 == 6) {
            this.method623((byte) 86, "js5connect_outofdate");
            class103.field2602 = 1000;
        } else if (class14.field467 >= 4) {
            if (class103.field2602 <= 5) {
                this.method623((byte) 104, "js5connect");
                class103.field2602 = 1000;
            } else {
                class39.field1060 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII[Lqd;Z)Z", line = 72)
    public static final boolean method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class100[] arg8, boolean arg9) {
        class111.method915(arg2, arg1, arg6, arg5);
        boolean var10 = arg9;
        for (int var11 = 0; var11 < arg8.length; var11++) {
            class100 var12 = arg8[var11];
            if (var12 != null && var12.field2457 == arg4) {
                if (var12.field2448 > 0) {
                    class113.method932((byte) 70, var12);
                }
                int var13 = var12.field2465 + arg2;
                if (!var12.field2503) {
                    var13 -= arg3;
                }
                int var14 = var12.field2505 + arg1;
                if (!var12.field2503) {
                    var14 -= arg7;
                }
                int var15 = var12.field2554;
                if (class17.field549 == var12) {
                    var15 = 128;
                    class100 var16 = class127.method1012(-1598852880, var12);
                    int[] var17 = class24.method326(var16, (byte) 117);
                    int[] var18 = class24.method326(var12, (byte) 97);
                    int var19 = var18[1] + class102.field2571 - var17[1] - class97.field2395;
                    if (var19 < 0) {
                        var19 = 0;
                    }
                    if (var19 + var12.field2452 > var16.field2452) {
                        var19 = var16.field2452 - var12.field2452;
                    }
                    var14 = var17[1] + var19;
                    int var20 = class24.field742 + var18[0] - var17[0] - class12.field420;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    if (var20 + var12.field2501 > var16.field2501) {
                        var20 = var16.field2501 - var12.field2501;
                    }
                    var13 = var17[0] + var20;
                }
                if (!var12.field2445 || class111.field2756 >= var13 && class111.field2754 >= var14 && class111.field2755 <= var12.field2501 + var13 && var14 + var12.field2452 >= class111.field2751) {
                    if (var12.field2492 == 0) {
                        if (var12.field2559 && !class66.method634(8247, arg0, var11)) {
                            continue;
                        }
                        if (!var12.field2445) {
                            if (var12.field2529 - var12.field2452 < var12.field2540) {
                                var12.field2540 = var12.field2529 - var12.field2452;
                            }
                            if (var12.field2540 < 0) {
                                var12.field2540 = 0;
                            }
                        }
                        var10 &= method279(arg0, var14, var13, var12.field2555, var11, var12.field2452 + var14, var12.field2501 + var13, var12.field2540, arg8, arg9);
                        if (var12.field2522 != null) {
                            var10 &= method279(arg0, var14, var13, var12.field2555, var12.field2498, var14 + var12.field2452, var12.field2501 + var13, var12.field2540, var12.field2522, true);
                        }
                        class111.method915(arg2, arg1, arg6, arg5);
                        if (var12.field2452 < var12.field2529) {
                            class63.method604(0, var12.field2540, var12.field2529, var12.field2501 + var13, var12.field2452, var14);
                        }
                    }
                    if (var12.field2492 != 1) {
                        if (var12.field2492 == 2) {
                            int var21 = 0;
                            for (int var22 = 0; var22 < var12.field2452; var22++) {
                                for (int var23 = 0; var23 < var12.field2501; var23++) {
                                    int var24 = (var12.field2558 + 32) * var23 + var13;
                                    int var25 = (var12.field2476 + 32) * var22 + var14;
                                    if (var21 < 20) {
                                        var24 += var12.field2508[var21];
                                        var25 += var12.field2517[var21];
                                    }
                                    if (var12.field2494[var21] > 0) {
                                        int var27 = 0;
                                        int var28 = var12.field2494[var21] - 1;
                                        int var29 = 0;
                                        if (class111.field2755 - 32 < var24 && var24 < class111.field2756 && class111.field2751 - 32 < var25 && class111.field2754 > var25 || class32.field858 != 0 && class113.field2779 == var21) {
                                            int var30 = 0;
                                            if (class14.field476 == 1 && class92.field2284 == var21 && class39.field1076 == var12.field2498) {
                                                var30 = 16777215;
                                            }
                                            class58 var31 = class127.method1010(117, var12.field2519[var21], var28, var30);
                                            if (var31 == null) {
                                                var10 = false;
                                            } else {
                                                if (class32.field858 != 0 && class113.field2779 == var21 && class98.field2413 == var12.field2498) {
                                                    var29 = class102.field2571 - class115.field2832;
                                                    var27 = class24.field742 - class128.field3146;
                                                    if (var27 < 5 && var27 > -5) {
                                                        var27 = 0;
                                                    }
                                                    if (var29 < 5 && var29 > -5) {
                                                        var29 = 0;
                                                    }
                                                    if (class8.field299 < 5) {
                                                        var29 = 0;
                                                        var27 = 0;
                                                    }
                                                    var31.method561(var24 + var27, var25 + var29, 128);
                                                    if (arg4 != -1) {
                                                        class100 var32 = arg8[arg4];
                                                        if (var25 + var29 < class111.field2751 && var32.field2540 > 0) {
                                                            int var33 = (class111.field2751 - var25 - var29) * class9.field322 / 3;
                                                            if (class9.field322 * 10 < var33) {
                                                                var33 = class9.field322 * 10;
                                                            }
                                                            if (var33 > var32.field2540) {
                                                                var33 = var32.field2540;
                                                            }
                                                            var32.field2540 -= var33;
                                                            class115.field2832 += var33;
                                                        }
                                                        if (class111.field2754 < var25 + var29 + 32 && var32.field2540 < var32.field2529 - var32.field2452) {
                                                            int var34 = (var25 + var29 + 32 - class111.field2754) * class9.field322 / 3;
                                                            if (class9.field322 * 10 < var34) {
                                                                var34 = class9.field322 * 10;
                                                            }
                                                            if (var32.field2529 - var32.field2540 - var32.field2452 < var34) {
                                                                var34 = var32.field2529 - var32.field2452 - var32.field2540;
                                                            }
                                                            class115.field2832 -= var34;
                                                            var32.field2540 += var34;
                                                        }
                                                    }
                                                } else if (class19.field657 != 0 && class105.field2652 == var21 && class67.field1682 == var12.field2498) {
                                                    var31.method561(var24, var25, 128);
                                                } else {
                                                    var31.method554(var24, var25);
                                                }
                                                if (var31.field1482 == 33 || var12.field2519[var21] != 1) {
                                                    int var35 = var12.field2519[var21];
                                                    class116.field2895.method214(class100.method865(var35, (byte) -100), var24 + var27 + 1, var25 + 10 - -var29, 0);
                                                    class116.field2895.method214(class100.method865(var35, (byte) -100), var24 + var27, var25 - -9 + var29, 16776960);
                                                }
                                            }
                                        }
                                    } else if (var12.field2513 != null && var21 < 20) {
                                        class58 var26 = var12.method855((byte) 78, var21);
                                        if (var26 != null) {
                                            var26.method554(var24, var25);
                                        } else if (class127.field3119) {
                                            var10 = false;
                                        }
                                    }
                                    var21++;
                                }
                            }
                        } else if (var12.field2492 == 3) {
                            int var36;
                            if (class115.method950(false, var12)) {
                                var36 = var12.field2535;
                                if (class66.method634(8247, arg0, var11) && var12.field2472 != 0) {
                                    var36 = var12.field2472;
                                }
                            } else {
                                var36 = var12.field2456;
                                if (class66.method634(8247, arg0, var11) && var12.field2528 != 0) {
                                    var36 = var12.field2528;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field2454) {
                                    class111.method916(var13, var14, var12.field2501, var12.field2452, var36);
                                } else {
                                    class111.method925(var13, var14, var12.field2501, var12.field2452, var36);
                                }
                            } else if (var12.field2454) {
                                class111.method924(var13, var14, var12.field2501, var12.field2452, var36, 256 - (var15 & 0xFF));
                            } else {
                                class111.method914(var13, var14, var12.field2501, var12.field2452, var36, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field2492 == 4) {
                            class10 var37 = var12.method864((byte) 34);
                            if (var37 != null) {
                                class1 var38 = var12.field2477;
                                int var39;
                                if (class115.method950(false, var12)) {
                                    var39 = var12.field2535;
                                    if (class66.method634(8247, arg0, var11) && var12.field2472 != 0) {
                                        var39 = var12.field2472;
                                    }
                                    if (var12.field2449.method10(-3136) > 0) {
                                        var38 = var12.field2449;
                                    }
                                } else {
                                    var39 = var12.field2456;
                                    if (class66.method634(8247, arg0, var11) && var12.field2528 != 0) {
                                        var39 = var12.field2528;
                                    }
                                }
                                if (var12.field2445 && var12.field2527 != -1) {
                                    class115 var40 = class89.method763(var12.field2527, 10);
                                    var38 = var40.field2830;
                                    if (var38 == null) {
                                        var38 = class64.field1634;
                                    }
                                    if (var40.field2829 == 1 || var12.field2543 != 1) {
                                        var38 = class116.method959(-40, new class1[] { var38, class66.field1652, class92.method806(var12.field2543, (byte) -109) });
                                    }
                                }
                                if (var12.field2523 == 6 && class120.field3001 == var12.field2498) {
                                    var39 = var12.field2456;
                                    var38 = class36.field958;
                                }
                                if (class111.field2752 == 479) {
                                    if (var39 == 16776960) {
                                        var39 = 255;
                                    }
                                    if (var39 == 49152) {
                                        var39 = 16777215;
                                    }
                                }
                                class1 var41 = class32.method387((byte) 20, var12, var38);
                                var37.method196(var41, var13, var14, var12.field2501, var12.field2452, var39, var12.field2474, var12.field2542, var12.field2524, var12.field2541);
                            } else if (class127.field3119) {
                                var10 = false;
                            }
                        } else if (var12.field2492 == 5) {
                            if (var12.field2445) {
                                int var43 = 0;
                                int var44 = 0;
                                class58 var45;
                                if (var12.field2527 == -1) {
                                    var45 = var12.method860(127, false);
                                } else {
                                    var45 = class127.method1010(99, var12.field2543, var12.field2527, 0);
                                    var43 = var45.field1482;
                                    var44 = var45.field1480;
                                    var45.field1480 = 32;
                                    var45.field1482 = 32;
                                }
                                if (var45 != null) {
                                    int var46 = var45.field1478;
                                    int var47 = var45.field1479;
                                    if (var12.field2450) {
                                        int[] var49 = new int[4];
                                        class111.method921(var49);
                                        int var50 = var13;
                                        if (var49[0] > var13) {
                                            var50 = var49[0];
                                        }
                                        int var51 = var14;
                                        if (var49[1] > var14) {
                                            var51 = var49[1];
                                        }
                                        int var52 = var12.field2501 + var13;
                                        if (var49[2] < var52) {
                                            var52 = var49[2];
                                        }
                                        int var53 = var12.field2452 + var14;
                                        if (var53 > var49[3]) {
                                            var53 = var49[3];
                                        }
                                        class111.method915(var50, var51, var52, var53);
                                        int var54 = (var12.field2501 + var47 - 1) / var47;
                                        int var55 = (var12.field2452 + var46 - 1) / var46;
                                        for (int var56 = 0; var56 < var54; var56++) {
                                            for (int var57 = 0; var57 < var55; var57++) {
                                                if (var12.field2560 != 0) {
                                                    var45.method553(var47 / 2 + var47 * var56 + var13, var46 / 2 + (var14 - -(var46 * var57)), var12.field2560, 4096);
                                                } else if (var15 == 0) {
                                                    var45.method554(var47 * var56 + var13, var46 * var57 + var14);
                                                } else {
                                                    var45.method561(var13 + var47 * var56, var14 - -(var46 * var57), 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class111.method917(var49);
                                    } else {
                                        int var48 = var12.field2501 * 4096 / var47;
                                        if (var12.field2560 != 0) {
                                            var45.method553(var12.field2501 / 2 + var13, var12.field2452 / 2 + var14, var12.field2560, var48);
                                        } else if (var15 != 0) {
                                            var45.method549(var13, var14, var12.field2501, var12.field2452, 256 - (var15 & 0xFF));
                                        } else if (var12.field2501 == var47 && var12.field2452 == var46) {
                                            var45.method554(var13, var14);
                                        } else {
                                            var45.method565(var13, var14, var12.field2501, var12.field2452);
                                        }
                                    }
                                } else if (class127.field3119) {
                                    var10 = false;
                                }
                                if (var12.field2527 != -1) {
                                    if (var12.field2543 != 1 || var43 == 33) {
                                        class116.field2895.method214(class48.method504(var12.field2543, -1), var13 + 1, var14 + 10, 0);
                                        class116.field2895.method214(class48.method504(var12.field2543, -1), var13, var14 + 9, 16776960);
                                    }
                                    var45.field1482 = var43;
                                    var45.field1480 = var44;
                                }
                            } else {
                                class58 var42 = var12.method860(127, class115.method950(false, var12));
                                if (var42 != null) {
                                    var42.method554(var13, var14);
                                } else if (class127.field3119) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field2492 == 6) {
                            boolean var58 = class115.method950(false, var12);
                            Object var59 = null;
                            int var60;
                            if (var58) {
                                var60 = var12.field2462;
                            } else {
                                var60 = var12.field2468;
                            }
                            class91 var61;
                            if (var12.field2496 == 5) {
                                if (var12.field2482 == 0) {
                                    var61 = class92.field2305.method640(null, null, -1, -1, (byte) -88);
                                } else {
                                    var61 = class104.field2624.method42(92);
                                }
                            } else if (var60 == -1) {
                                var61 = var12.method863((byte) 46, null, -1, var58, class104.field2624.field91);
                                if (var61 == null && class127.field3119) {
                                    var10 = false;
                                }
                            } else {
                                class47 var62 = class4.method104(var60, 2);
                                var61 = var12.method863((byte) 76, var62, var12.field2463, var58, class104.field2624.field91);
                                if (var61 == null && class127.field3119) {
                                    var10 = false;
                                }
                            }
                            int var63 = var12.field2499;
                            int var64 = var12.field2534;
                            int var65 = var12.field2488;
                            int var66 = var12.field2466;
                            int var67 = var12.field2546;
                            int var68 = var12.field2537;
                            if (var12.field2527 != -1) {
                                class115 var69 = class89.method763(var12.field2527, 10);
                                if (var69 != null) {
                                    class115 var70 = var69.method947((byte) -37, var12.field2543);
                                    var61 = var70.method957(true, 1, 26910);
                                    var64 = var70.field2861;
                                    var65 = var70.field2844;
                                    var67 = var70.field2840;
                                    var63 = var70.field2878;
                                    var68 = var70.field2851;
                                    var66 = var70.field2864;
                                    if (var12.field2501 > 0) {
                                        var68 = var68 * 32 / var12.field2501;
                                    }
                                }
                            }
                            class27.method365(var12.field2501 / 2 + var13, var12.field2452 / 2 + var14);
                            int var71 = class27.field776[var63] * var68 >> 16;
                            int var72 = class27.field779[var63] * var68 >> 16;
                            if (var61 != null) {
                                if (var12.field2445) {
                                    var61.method769();
                                    if (var12.field2510) {
                                        var61.method772(0, var66, var64, var63, var67, var61.field3138 / 2 + var65 + var71, var72 - -var65, var68);
                                    } else {
                                        var61.method783(0, var66, var64, var63, var67, var61.field3138 / 2 + var71 + var65, var65 + var72);
                                    }
                                } else {
                                    var61.method783(0, var66, 0, var63, 0, var71, var72);
                                }
                            }
                            class27.method357();
                        } else {
                            if (var12.field2492 == 7) {
                                class10 var73 = var12.method864((byte) 34);
                                if (var73 == null) {
                                    if (class127.field3119) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var74 = 0;
                                for (int var75 = 0; var75 < var12.field2452; var75++) {
                                    for (int var76 = 0; var76 < var12.field2501; var76++) {
                                        if (var12.field2494[var74] > 0) {
                                            class115 var77 = class89.method763(var12.field2494[var74] - 1, 10);
                                            class1 var78 = var77.field2830;
                                            if (var78 == null) {
                                                var78 = class64.field1634;
                                            }
                                            if (var77.field2829 == 1 || var12.field2519[var74] != 1) {
                                                var78 = class116.method959(101, new class1[] { var78, class66.field1652, class92.method806(var12.field2519[var74], (byte) -105) });
                                            }
                                            int var79 = (var12.field2558 + 115) * var76 + var13;
                                            int var80 = (var12.field2476 + 12) * var75 + var14;
                                            if (var12.field2542 == 0) {
                                                var73.method207(var78, var79, var80, var12.field2456, var12.field2474);
                                            } else if (var12.field2542 == 1) {
                                                var73.method212(var78, var12.field2501 / 2 + var79, var80, var12.field2456, var12.field2474);
                                            } else {
                                                var73.method201(var78, var12.field2501 + var79 - 1, var80, var12.field2456, var12.field2474);
                                            }
                                        }
                                        var74++;
                                    }
                                }
                            }
                            if (var12.field2492 == 8 && class78.method723(arg0, var11, (byte) 52) && class106.field2676 == class1.field57) {
                                int var81 = 0;
                                int var82 = 0;
                                class10 var83 = class106.field2687;
                                class1 var84 = var12.field2477;
                                class1 var85 = class32.method387((byte) 20, var12, var84);
                                while (var85.method10(-3136) > 0) {
                                    int var93 = var85.method11(class67.field1664, 32);
                                    class1 var94;
                                    if (var93 == -1) {
                                        var94 = var85;
                                        var85 = class132.field3237;
                                    } else {
                                        var94 = var85.method19(0, 0, var93);
                                        var85 = var85.method1((byte) 95, var93 + 2);
                                    }
                                    int var95 = var83.method205(var94);
                                    var82 += var83.field351 + 1;
                                    if (var81 < var95) {
                                        var81 = var95;
                                    }
                                }
                                var82 += 7;
                                int var86 = var12.field2452 + var14 + 5;
                                if (var82 + var86 > arg5) {
                                    var86 = arg5 - var82;
                                }
                                var81 += 6;
                                int var87 = var12.field2501 + var13 - var81 - 5;
                                if (var87 < var13 + 5) {
                                    var87 = var13 + 5;
                                }
                                if (var81 + var87 > arg6) {
                                    var87 = arg6 - var81;
                                }
                                class111.method916(var87, var86, var81, var82, 16777120);
                                class111.method925(var87, var86, var81, var82, 0);
                                class1 var88 = var12.field2477;
                                int var89 = var86 + var83.field351 + 2;
                                class1 var90 = class32.method387((byte) 20, var12, var88);
                                while (var90.method10(-3136) > 0) {
                                    int var91 = var90.method11(class67.field1664, 32);
                                    class1 var92;
                                    if (var91 == -1) {
                                        var92 = var90;
                                        var90 = class132.field3237;
                                    } else {
                                        var92 = var90.method19(0, 0, var91);
                                        var90 = var90.method1((byte) 95, var91 + 2);
                                    }
                                    var83.method207(var92, var87 + 3, var89, 0, false);
                                    var89 += var83.field351 + 1;
                                }
                            }
                            if (var12.field2492 == 9) {
                                class111.method926(var13, var14, var12.field2501 + var13, var12.field2452 + var14, var12.field2456);
                            }
                        }
                    }
                }
            }
        }
        field598++;
        return var10;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 852)
    public final void method280(int arg0) {
        field608++;
        class82.field2066++;
        this.method283(arg0 + 23636);
        class24.method321((byte) -91);
        if (arg0 != -22636) {
            method290(null, false);
        }
        class72.method683((byte) -116);
        class43.method464((byte) 125);
        class100.method856(122);
        class129.method1024(-656);
        if (class103.field2602 == 0) {
            class22.method317(arg0 + 22736);
            class118.method973(75);
        } else if (class103.field2602 == 5) {
            class22.method317(100);
            class118.method973(75);
        } else if (class103.field2602 == 10) {
            class118.method974(-104);
        } else if (class103.field2602 == 20) {
            class118.method974(-103);
            class28.method375(true);
        } else if (class103.field2602 == 25) {
            class102.method868(-95);
        }
        if (class103.field2602 == 30) {
            class130.method1027((byte) 77);
        } else if (class103.field2602 == 35) {
            class130.method1027((byte) 98);
        } else if (class103.field2602 == 40) {
            class28.method375(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lu;BI)V", line = 919)
    public static final void method281(class120 arg0, byte arg1, int arg2) {
        field576++;
        if (arg1 != 98) {
            field599 = null;
        }
        if (class98.field2418 == null) {
            class48.method497(true, null, 255, 255, (byte) 0, 0, (byte) 90);
            class50.field1352[arg2] = arg0;
        } else {
            class98.field2418.field268 = arg2 * 4 + 5;
            int var3 = class98.field2418.method168(-4750);
            arg0.method983(var3, 99);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 968)
    public static final void method282(int arg0) {
        field607++;
        if (class46.field1211 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class46.field1211 > 768) {
                    class85.field2154[var3] = class76.method703((byte) 81, class103.field2603[var3], class128.field3142[var3], 1024 - class46.field1211);
                } else if (class46.field1211 > 256) {
                    class85.field2154[var3] = class128.field3142[var3];
                } else {
                    class85.field2154[var3] = class76.method703((byte) 93, class128.field3142[var3], class103.field2603[var3], 256 - class46.field1211);
                }
            }
        } else if (class95.field2383 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class95.field2383 > 768) {
                    class85.field2154[var1] = class76.method703((byte) -112, class103.field2603[var1], class116.field2907[var1], 1024 - class95.field2383);
                } else if (class95.field2383 > 256) {
                    class85.field2154[var1] = class116.field2907[var1];
                } else {
                    class85.field2154[var1] = class76.method703((byte) -124, class116.field2907[var1], class103.field2603[var1], 256 - class95.field2383);
                }
            }
        } else {
            for (int var2 = 0; var2 < 256; var2++) {
                class85.field2154[var2] = class103.field2603[var2];
            }
        }
        short var4 = 256;
        for (int var5 = 0; var5 < 33920; var5++) {
            class14.field473.field3291[var5] = class81.field2058.field1483[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var22 = (var4 - var8) * class31.field848[var8] / var4;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class6.field230[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var26 = 256 - var25;
                    int var28 = class85.field2154[var25];
                    int var29 = class14.field473.field3291[var7];
                    class14.field473.field3291[var7++] = class132.method1034(-16711936, class132.method1034(var28, 16711935) * var25 + var26 * class132.method1034(var29, 16711935)) + class132.method1034(class132.method1034(65280, var29) * var26 + var25 * class132.method1034(65280, var28), 16711680) >> 8;
                }
            }
            var7 += var23;
        }
        int var9 = 1176;
        int var10 = arg0;
        for (int var11 = 0; var11 < 33920; var11++) {
            class54.field1438.field3291[var11] = class32.field852.field1483[var11];
        }
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class31.field848[var12] / var4;
            int var14 = 103 - var13;
            int var15 = var9 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class6.field230[var10++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var19 = class54.field1438.field3291[var15];
                    int var20 = 256 - var17;
                    int var21 = class85.field2154[var17];
                    class54.field1438.field3291[var15++] = class132.method1034(var17 * class132.method1034(65280, var21) + var20 * class132.method1034(65280, var19), 16711680) + class132.method1034(var20 * class132.method1034(16711935, var19) + class132.method1034(16711935, var21) * var17, -16711936) >> 8;
                }
            }
            var9 = var15 + 128 - var14 - var13;
            var10 += 128 - var14;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 1145)
    private final void method283(int arg0) {
        field602++;
        if (class103.field2602 != arg0) {
            boolean var2 = class52.method530((byte) 48);
            if (!var2) {
                this.method285(arg0 ^ 0x3ED);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1168)
    public final void method284(int arg0) {
        field609++;
        if (class133.field3245) {
            class38.method423((byte) -80, class122.field3052);
            class108.method905(32, class122.field3052);
            this.method631((byte) 86);
            class100.method859(class122.field3052, -10);
            class43.method466(class122.field3052, (byte) 33);
        }
        if (class103.field2602 == 0) {
            class54.method539(class133.field3277, null, class123.field3082, -86);
        } else if (class103.field2602 == 5) {
            class106.method891(-19010, class116.field2905, class116.field2895);
        } else if (class103.field2602 == 10) {
            class106.method891(-19010, class116.field2905, class116.field2895);
        } else if (class103.field2602 == 20) {
            class106.method891(-19010, class116.field2905, class116.field2895);
        } else if (class103.field2602 == 25) {
            if (class134.field3304 == 1) {
                if (class78.field1925 > class36.field949) {
                    class36.field949 = class78.field1925;
                }
                int var2 = (class36.field949 - class78.field1925) * 50 / class36.field949;
                class103.method875(0, class133.field3255, true, class116.method959(110, new class1[] { class5.field222, class48.method504(var2, -1), class67.field1676 }));
            } else if (class134.field3304 == 2) {
                if (class95.field2361 > class54.field1444) {
                    class54.field1444 = class95.field2361;
                }
                int var3 = (class54.field1444 - class95.field2361) * 50 / class54.field1444 + 50;
                class103.method875(0, class133.field3255, true, class116.method959(-98, new class1[] { class5.field222, class48.method504(var3, -1), class67.field1676 }));
            } else {
                class103.method875(0, class133.field3255, false, null);
            }
        } else if (class103.field2602 == 30) {
            class63.method614(-20197);
        } else if (class103.field2602 == 35) {
            class9.method189(0);
        } else if (class103.field2602 == 40) {
            class103.method875(0, class130.field3190, false, class80.field2036);
        }
        class130.field3179 = 0;
        int var4 = -22 / ((arg0 - 6) / 50);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1249)
    public static final void main(String[] arg0) {
        field590++;
        try {
            if (arg0.length != 6) {
                class78.method717((byte) 37);
            }
            class24.field724 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class89.field2185 = 0;
            } else if (arg0[1].equals("office")) {
                class89.field2185 = 1;
            } else if (arg0[1].equals("local")) {
                class89.field2185 = 2;
            } else {
                class78.method717((byte) 118);
            }
            if (arg0[2].equals("live")) {
                class89.field2178 = 0;
            } else if (arg0[2].equals("rc")) {
                class89.field2178 = 1;
            } else if (arg0[2].equals("wip")) {
                class89.field2178 = 2;
            } else {
                class78.method717((byte) 34);
            }
            if (arg0[3].equals("lowmem")) {
                class117.method964(120);
            } else if (arg0[3].equals("highmem")) {
                class14.method254(0);
            } else {
                class78.method717((byte) 121);
            }
            if (arg0[4].equals("free")) {
                class45.field1185 = false;
            } else if (arg0[4].equals("members")) {
                class45.field1185 = true;
            } else {
                class78.method717((byte) 93);
            }
            if (arg0[5].equals("english")) {
                class74.field1841 = 0;
            } else if (arg0[5].equals("german")) {
                class108.method902(18782);
                class74.field1841 = 1;
            } else {
                class78.method717((byte) 106);
            }
            client var1 = new client();
            var1.method629("runescape", 102, 13, 503, class89.field2178 + 32, InetAddress.getLocalHost(), 435, 765);
        } catch (Exception var3) {
            class11.method215(null, (byte) -128, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1332)
    private final void method285(int arg0) {
        if (arg0 != 5) {
            field603 = null;
        }
        field596++;
        if (class74.field1806 >= 4) {
            this.method623((byte) 120, "js5crc");
            class103.field2602 = 1000;
            return;
        }
        if (class16.field526 >= 4) {
            if (class103.field2602 <= 5) {
                this.method623((byte) 58, "js5io");
                class103.field2602 = 1000;
                return;
            }
            class16.field526 = 3;
            class39.field1060 = 3000;
        }
        if (class39.field1060-- > 0) {
            return;
        }
        try {
            if (class14.field465 == 0) {
                class134.field3302 = class39.field1072.method660(arg0 ^ 0x6, class17.field546);
                class14.field465++;
            }
            if (class14.field465 == 1) {
                if (class134.field3302.field816 == 2) {
                    this.method278(30, -1);
                    return;
                }
                if (class134.field3302.field816 == 1) {
                    class14.field465++;
                }
            }
            if (class14.field465 == 2) {
                class66.field1654 = new class129((Socket) class134.field3302.field819, class39.field1072);
                class8 var2 = new class8(5);
                var2.method142(15, (byte) -128);
                var2.method183(56, 435);
                class66.field1654.method1019(5, (byte) -19, 0, var2.field285);
                class14.field465++;
                class38.field1015 = class103.method872(1);
            }
            if (class14.field465 == 3) {
                if (class103.field2602 <= 5 || class66.field1654.method1023(arg0 - 131) > 0) {
                    int var3 = class66.field1654.method1025(112);
                    if (var3 != 0) {
                        this.method278(30, var3);
                        return;
                    }
                    class14.field465++;
                } else if (class103.method872(1) - class38.field1015 > 30000L) {
                    this.method278(30, -2);
                    return;
                }
            }
            if (class14.field465 == 4) {
                class31.method382(class66.field1654, 105, class103.field2602 > 20);
                class134.field3302 = null;
                class14.field465 = 0;
                class66.field1654 = null;
                class14.field467 = 0;
            }
        } catch (IOException var4) {
            this.method278(30, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1480)
    public static void method286(boolean arg0) {
        field584 = null;
        field603 = null;
        field600 = null;
        field585 = null;
        field597 = null;
        field605 = null;
        field599 = null;
        field610 = null;
        field589 = null;
        if (arg0) {
            method279(-124, 5, -72, 123, 30, -52, 55, 27, null, false);
        }
        field583 = null;
        field579 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1502)
    public final void method287(int arg0) {
        if (class23.field709 != null) {
            class23.field709.field2053 = false;
        }
        field593++;
        class23.field709 = null;
        if (class57.field1453 != null) {
            class57.field1453.method1018(-100);
            class57.field1453 = null;
        }
        class115.method948((byte) -80);
        class24.method328(true);
        class72.method677(false);
        class118.method970(true);
        class42.method448(arg0 ^ 0x1);
        class105.method887(-1);
        try {
            if (class28.field798 != null) {
                class28.field798.method1049(841617512);
            }
            if (arg0 != 0) {
                this.method291(false);
            }
            if (class46.field1195 != null) {
                for (int var2 = 0; var2 < class46.field1195.length; var2++) {
                    if (class46.field1195[var2] != null) {
                        class46.field1195[var2].method1049(arg0 ^ 0x322A1068);
                    }
                }
            }
            if (class67.field1671 != null) {
                class67.field1671.method1049(841617512);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1557)
    public final void init() {
        field587++;
        if (!this.method622(31)) {
            return;
        }
        class24.field724 = Integer.parseInt(this.getParameter("worldid"));
        class89.field2178 = Integer.parseInt(this.getParameter("modewhat"));
        class89.field2185 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class117.method964(-111);
        } else {
            class14.method254(0);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class45.field1185 = true;
        } else {
            class45.field1185 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class108.method902(18782);
            class74.field1841 = 1;
        }
        this.method624((byte) 120, 435, 503, 765, class89.field2178 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)I", line = 1601)
    public static final int method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        field601++;
        if ((arg0 & arg1) == 1) {
            int var8 = arg2;
            arg2 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg3 - arg2;
        } else {
            return 1 + 7 - arg6 - arg4;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1665)
    public final void method289(int arg0) {
        field592++;
        method286(false);
        class1.method34((byte) 121);
        class64.method619(false);
        class79.method724((byte) 123);
        class134.method1054(arg0 - 28063);
        class81.method738((byte) -74);
        class8.method176(true);
        class129.method1020(true);
        class120.method986(arg0 ^ 0x6DC2);
        class133.method1050(false);
        class109.method907(78);
        class130.method1028(arg0 - 27855);
        class36.method412(1);
        class10.method200();
        class3.method71();
        class5.method117(-19156);
        class2.method47(false);
        class92.method803(29690);
        class100.method858(-92);
        class98.method846((byte) 111);
        class67.method639(arg0 - 14636);
        class80.method733(87);
        class22.method316(-10);
        class42.method462(-96);
        class48.method498(false);
        class82.method743((byte) 127);
        class39.method427(true);
        class99.method852(94);
        class15.method267(arg0 ^ 0x6DEF);
        class47.method486(arg0 ^ 0x6DE9);
        class91.method771();
        class78.method718(-29013);
        class43.method463(-124);
        class53.method534(0);
        class32.method389(-95);
        class37.method421(true);
        class70.method666(94);
        class128.method1016((byte) -117);
        class17.method275(arg0 ^ 0x6DF9);
        class106.method892(0);
        class52.method532(arg0 - 34645);
        class105.method886(false);
        class18.method277();
        class107.method893((byte) -38);
        class122.method994(true);
        class103.method874(-108);
        class44.method472(117);
        class11.method226(arg0 ^ arg0);
        class89.method762(arg0 ^ 0xFFFF925E);
        class72.method678(arg0 - 6046);
        class14.method258(arg0 ^ 0xFFFF9215);
        class108.method901(1);
        class118.method975(false);
        class131.method1030((byte) -25);
        class63.method605(arg0 ^ 0xFFFF9312);
        class104.method882(-1);
        class102.method870(10582);
        class27.method359();
        class111.method927();
        class85.method753((byte) -108);
        class50.method522((byte) -41);
        class31.method386((byte) 83);
        class34.method395((byte) 122);
        class76.method710(arg0 ^ 0x6DA1);
        class95.method826(0);
        class49.method511(true);
        class115.method949(64);
        class114.method938(76);
        class28.method371(-3254);
        class35.method406(-124);
        class97.method839(-1);
        class75.method697((byte) -81);
        class90.method768();
        class132.method1035(-125);
        class117.method966((byte) -127);
        class9.method188((byte) -94);
        class12.method244(-9019);
        class16.method270(-27934);
        class6.method124((byte) 76);
        class125.method1007();
        class93.method817(arg0 - 28113);
        class19.method296((byte) 113);
        class116.method962((byte) 98);
        class23.method319((byte) -76);
        class86.method759((byte) 127);
        class121.method991(-128);
        class54.method537((byte) -95);
        class59.method572(24399);
        class73.method685(arg0 ^ 0x6D9E);
        class24.method327(arg0 ^ 0x925E);
        class62.method599((byte) -46);
        class60.method580(arg0 - 50848);
        class4.method100(0);
        class113.method937((byte) -120);
        class30.method377();
        class112.method930(arg0 - 28128);
        class84.method747();
        class127.method1011(0);
        class41.method439();
        class74.method690(7679);
        class57.method546((byte) 59);
        class45.method473(120);
        class46.method479(true);
        class94.method819();
        class40.method438();
        class66.method633(8);
        class119.method978((byte) 101);
        class123.method1002(39);
        class26.method352();
        class38.method422(77);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lbd;Z)V", line = 1800)
    public static final void method290(class11 arg0, boolean arg1) {
        if (arg1) {
            field577++;
            class129.field3170 = arg0;
            class117.field2918 = class129.field3170.method236(16, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 1830)
    public final void method291(boolean arg0) {
        class5.field224 = class89.field2185 == 0 ? 443 : class24.field724 + 50000;
        class34.field916 = class89.field2185 == 0 ? 43594 : class24.field724 + 40000;
        field604++;
        if (!arg0) {
            field612 = true;
        }
        class17.field546 = class34.field916;
        class121.method990(47);
        class100.method859(class122.field3052, -10);
        class43.method466(class122.field3052, (byte) 70);
        class62.field1554 = class69.field1719;
        try {
            if (class39.field1072.field1718 != null) {
                class28.field798 = new class133(class39.field1072.field1718, 5200, 0);
                for (int var2 = 0; var2 < 13; var2++) {
                    class46.field1195[var2] = new class133(class39.field1072.field1705[var2], 6000, 0);
                }
                class67.field1671 = new class133(class39.field1072.field1710, 6000, 0);
                class35.field932 = new class109(255, class28.field798, class67.field1671, 500000);
                class39.field1072.field1705 = null;
                class39.field1072.field1710 = null;
                class39.field1072.field1718 = null;
            }
        } catch (IOException var3) {
            class35.field932 = null;
            class28.field798 = null;
            class67.field1671 = null;
        }
        if (class89.field2185 != 0) {
            class37.field1008 = true;
        }
        class23.field705 = new class100();
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1877)
    public static final void method292(int arg0) {
        class103.field2608 = 0L;
        class23.field709.field2061 = 0;
        class123.field3072 = 0;
        field582++;
        class1.field40 = 0;
        class93.field2314 = 0;
        class28.field782 = 0;
        class17.field531 = 0;
        class5.field194 = 0;
        class85.field2135 = 0;
        class44.field1166 = 0;
        class105.field2630 = 0;
        class47.field1245 = 0;
        class16.field512 = 0;
        class63.field1591 = 0;
        class35.field939 = 0;
        class127.field3126 = 0;
        class63.field1578 = 0;
        class118.field2953 = 0;
        class100.field2509 = 0;
        class64.field1618 = 0;
        class8.field256 = 0;
        class11.field395 = 0;
        class115.field2843 = 0;
        class130.field3198 = 0;
        class8.field279 = 0;
        class34.field924 = 0;
        class6.field236 = 0;
        class121.field3007 = 0;
        class85.field2133 = 0;
        class5.field191 = 0;
        class24.field735 = 0;
        class1.field9 = 0;
        class9.field332 = 0;
        class11.field404 = 0;
        class67.field1684 = 0;
        class62.field1555 = 0;
        class122.field3032 = 0;
        class118.field2947 = 0;
        class129.field3174 = 0;
        class60.field1509 = 0;
        class9.field324 = 0;
        class11.field369 = 0;
        class117.field2916 = 0;
        class31.field835 = 0;
        class128.field3145 = 0;
        class31.field836 = 0;
        class36.field971 = 0;
        class48.field1263 = 0;
        class15.field483 = 0;
        class86.field2159 = 0;
        class8.field307 = 0;
        class64.field1633 = 0;
        class92.field2290 = 0;
        class24.field722 = 0;
        class92.field2293 = 0;
        class103.field2593 = 0;
        class11.field364 = 0;
        class134.field3286 = 0;
        class14.field460 = 0;
        class48.field1259 = 0;
        class76.field1902 = 0;
        field598 = 0;
        class54.field1419 = 0;
        class14.field457 = 0;
        class78.field1917 = 0;
        class47.field1251 = 0;
        class130.field3191 = 0;
        class22.field696 = 0;
        class132.field3231 = 0;
        class49.field1339 = 0;
        class109.field2738 = 0;
        class42.field1089 = 0;
        class34.field917 = 0;
        class34.field907 = 0;
        class35.field941 = 0;
        class75.field1853 = 0;
        class5.field196 = 0;
        class95.field2378 = 0;
        class100.field2471 = 0;
        class127.field3111 = 0;
        class54.field1424 = 0;
        class4.field170 = 0;
        class64.field1641 = 0;
        class11.field379 = 0;
        class44.field1163 = 0;
        class46.field1209 = 0;
        class79.field1942 = 0;
        class43.field1149 = 0;
        class17.field535 = 0;
        class98.field2420 = 0;
        class70.field1747 = 0;
        class8.field277 = 0;
        class122.field3031 = 0;
        class1.field7 = 0;
        class32.field850 = 0;
        class105.field2646 = 0;
        class43.field1147 = 0;
        class1.field29 = 0;
        class8.field247 = 0;
        class43.field1154 = 0;
        class133.field3254 = 0;
        class133.field3276 = 0;
        class120.field2975 = 0;
        class59.field1496 = 0;
        class112.field2757 = 0;
        class52.field1375 = 0;
        field604 = 0;
        class16.field529 = 0;
        field582 = 0;
        class8.field248 = 0;
        class1.field17 = 0;
        class66.field1655 = 0;
        class122.field3037 = 0;
        class100.field2444 = 0;
        class57.field1470 = 0;
        class64.field1636 = 0;
        class63.field1582 = 0;
        class8.field250 = 0;
        class9.field328 = 0;
        class52.field1372 = 0;
        class1.field39 = 0;
        class72.field1770 = 0;
        class8.field264 = 0;
        class119.field2959 = 0;
        class78.field1910 = 0;
        class80.field2005 = 0;
        class129.field3171 = 0;
        class36.field967 = 0;
        class74.field1808 = 0;
        class100.field2514 = 0;
        class59.field1488 = 0;
        class76.field1897 = 0;
        class36.field951 = 0;
        class72.field1772 = 0;
        class73.field1786 = 0;
        class42.field1133 = 0;
        class95.field2371 = 0;
        class64.field1615 = 0;
        class92.field2297 = 0;
        class64.field1640 = 0;
        class46.field1203 = 0;
        class129.field3163 = 0;
        class42.field1084 = 0;
        class1.field47 = 0;
        class16.field513 = 0;
        class54.field1427 = 0;
        class1.field50 = 0;
        class92.field2276 = 0;
        class117.field2919 = 0;
        class11.field397 = 0;
        class63.field1577 = 0;
        class19.field644 = 0;
        class8.field253 = 0;
        class106.field2667 = 0;
        class5.field211 = 0;
        class133.field3269 = 0;
        class97.field2406 = 0;
        class119.field2958 = 0;
        class64.field1607 = 0;
        class106.field2669 = 0;
        class93.field2330 = 0;
        class57.field1455 = 0;
        class46.field1212 = 0;
        class128.field3140 = 0;
        class34.field915 = 0;
        class11.field382 = 0;
        class64.field1622 = 0;
        class38.field1013 = 0;
        class11.field402 = 0;
        class67.field1669 = 0;
        class131.field3202 = 0;
        class120.field2990 = 0;
        class8.field281 = 0;
        class36.field969 = 0;
        field596 = 0;
        class119.field2957 = 0;
        class19.field637 = 0;
        class75.field1852 = 0;
        class52.field1374 = 0;
        class34.field902 = 0;
        class98.field2422 = 0;
        class132.field3217 = 0;
        class64.field1617 = 0;
        class123.field3078 = 0;
        class115.field2869 = 0;
        field601 = 0;
        class118.field2940 = 0;
        class38.field1014 = 0;
        class1.field53 = 0;
        class76.field1900 = 0;
        class97.field2393 = 0;
        class63.field1595 = 0;
        class1.field19 = 0;
        class67.field1689 = 0;
        class1.field55 = 0;
        class78.field1915 = 0;
        class53.field1404 = 0;
        class98.field2425 = 0;
        class35.field938 = 0;
        class119.field2955 = 0;
        class4.field181 = 0;
        class49.field1336 = 0;
        class1.field43 = 0;
        class38.field1036 = 0;
        class67.field1685 = 0;
        class86.field2158 = 0;
        class116.field2891 = 0;
        class122.field3043 = 0;
        class1.field3 = 0;
        class38.field1033 = 0;
        class14.field458 = 0;
        class64.field1644 = 0;
        class22.field691 = 0;
        class127.field3112 = 0;
        class1.field27 = 0;
        class38.field1017 = 0;
        class105.field2655 = 0;
        class48.field1260 = 0;
        class24.field732 = 0;
        class122.field3045 = 0;
        class108.field2706 = 0;
        class80.field1983 = 0;
        class36.field961 = 0;
        class1.field2 = 0;
        class67.field1672 = 0;
        class8.field262 = 0;
        class5.field199 = 0;
        class82.field2067 = 0;
        class63.field1588 = 0;
        class50.field1351 = 0;
        class115.field2872 = 0;
        class63.field1574 = 0;
        class133.field3264 = 0;
        class67.field1668 = 0;
        class8.field276 = 0;
        class80.field1985 = 0;
        class5.field190 = 0;
        class34.field892 = 0;
        class122.field3044 = 0;
        class31.field829 = 0;
        class2.field70 = 0;
        class120.field2997 = 0;
        class108.field2721 = 0;
        class59.field1499 = 0;
        class48.field1264 = 0;
        class60.field1512 = 0;
        class67.field1681 = 0;
        class89.field2188 = 0;
        field608 = 0;
        class12.field430 = 0;
        class72.field1764 = 0;
        class108.field2712 = 0;
        class67.field1683 = 0;
        class70.field1726 = 0;
        class117.field2917 = 0;
        class113.field2794 = 0;
        class14.field450 = 0;
        class122.field3036 = 0;
        class133.field3257 = 0;
        class100.field2548 = 0;
        class134.field3292 = 0;
        class19.field661 = 0;
        class122.field3042 = 0;
        class49.field1314 = 0;
        class64.field1632 = 0;
        class54.field1416 = 0;
        field577 = 0;
        class8.field283 = 0;
        class131.field3204 = 0;
        class17.field541 = 0;
        class63.field1572 = 0;
        class123.field3064 = 0;
        class8.field272 = 0;
        class8.field251 = 0;
        class113.field2795 = 0;
        class60.field1510 = 0;
        class52.field1368 = 0;
        class11.field392 = 0;
        class64.field1629 = 0;
        class11.field389 = 0;
        class64.field1603 = 0;
        class54.field1429 = 0;
        class39.field1065 = 0;
        class107.field2693 = 0;
        class100.field2484 = 0;
        field602 = 0;
        class50.field1358 = 0;
        class1.field6 = 0;
        class28.field788 = 0;
        class22.field684 = 0;
        class85.field2140 = 0;
        class1.field1 = 0;
        class11.field401 = 0;
        class107.field2698 = 0;
        class42.field1125 = 0;
        class72.field1762 = 0;
        class95.field2373 = 0;
        class15.field490 = 0;
        class95.field2355 = 0;
        class100.field2461 = 0;
        class95.field2377 = 0;
        class134.field3297 = 0;
        class82.field2111 = 0;
        class105.field2656 = 0;
        class92.field2275 = 0;
        class113.field2787 = 0;
        class133.field3246 = 0;
        class89.field2193 = 0;
        class42.field1130 = 0;
        class85.field2148 = 0;
        class42.field1090 = 0;
        class42.field1131 = 0;
        class11.field377 = 0;
        class8.field295 = 0;
        class4.field178 = 0;
        class115.field2877 = 0;
        class8.field296 = 0;
        class54.field1413 = 0;
        class8.field269 = 0;
        class47.field1237 = 0;
        class60.field1516 = 0;
        class11.field398 = 0;
        class80.field2023 = 0;
        class130.field3181 = 0;
        class86.field2164 = 0;
        class109.field2729 = 0;
        class24.field737 = 0;
        class133.field3251 = 0;
        class64.field1605 = 0;
        class50.field1357 = 0;
        class5.field195 = 0;
        class57.field1463 = 0;
        class9.field330 = 0;
        class120.field2999 = 0;
        class102.field2582 = 0;
        class11.field374 = 0;
        class45.field1180 = 0;
        class1.field12 = 0;
        class1.field31 = 0;
        class5.field198 = 0;
        class113.field2783 = 0;
        class127.field3122 = 0;
        class8.field290 = 0;
        class100.field2443 = 0;
        class70.field1736 = 0;
        class8.field310 = 0;
        class80.field2024 = 0;
        class80.field1953 = 0;
        class108.field2726 = 0;
        class38.field1028 = 0;
        class105.field2658 = 0;
        class130.field3188 = 0;
        class62.field1553 = 0;
        class8.field273 = 0;
        class99.field2428 = 0;
        class121.field3025 = 0;
        class78.field1913 = 0;
        class107.field2696 = 0;
        class11.field399 = 0;
        class47.field1226 = 0;
        class117.field2915 = 0;
        class103.field2597 = 0;
        class1.field24 = 0;
        class28.field784 = 0;
        class62.field1549 = 0;
        class49.field1316 = 0;
        class127.field3124 = 0;
        class28.field789 = 0;
        class108.field2722 = 0;
        class128.field3144 = 0;
        class123.field3081 = 0;
        class8.field278 = 0;
        class39.field1071 = 0;
        class49.field1324 = 0;
        class19.field652 = 0;
        class12.field423 = 0;
        class19.field665 = 0;
        class113.field2778 = 0;
        class46.field1213 = 0;
        class92.field2286 = 0;
        class36.field952 = 0;
        class80.field2010 = 0;
        class93.field2326 = 0;
        class72.field1775 = 0;
        class36.field960 = 0;
        class76.field1895 = 0;
        class5.field208 = 0;
        class48.field1269 = 0;
        class95.field2382 = 0;
        class8.field252 = 0;
        class122.field3030 = 0;
        class8.field301 = 0;
        class132.field3243 = 0;
        class100.field2544 = 0;
        class122.field3035 = 0;
        class67.field1680 = 0;
        class11.field383 = 0;
        class115.field2860 = 0;
        class35.field945 = 0;
        class47.field1252 = 0;
        class11.field365 = 0;
        class39.field1054 = 0;
        class74.field1799 = 0;
        class53.field1392 = 0;
        class113.field2796 = 0;
        class133.field3267 = 0;
        class2.field101 = 0;
        class121.field3026 = 0;
        class81.field2056 = 0;
        class5.field209 = 0;
        class119.field2956 = 0;
        class74.field1831 = 0;
        class100.field2526 = 0;
        class132.field3236 = 0;
        class104.field2620 = 0;
        class98.field2421 = 0;
        class38.field1027 = 0;
        class92.field2277 = 0;
        class2.field86 = 0;
        class82.field2075 = 0;
        field587 = 0;
        class48.field1278 = 0;
        class115.field2855 = 0;
        class1.field44 = 0;
        class78.field1919 = 0;
        class72.field1763 = 0;
        class75.field1854 = 0;
        class89.field2189 = 0;
        class118.field2949 = 0;
        class109.field2745 = 0;
        field592 = 0;
        class35.field947 = 0;
        class115.field2873 = 0;
        class122.field3034 = 0;
        class76.field1906 = 0;
        class89.field2179 = 0;
        class107.field2694 = 0;
        class8.field258 = 0;
        class63.field1571 = 0;
        class8.field298 = 0;
        class89.field2187 = 0;
        class8.field261 = 0;
        class86.field2157 = 0;
        class19.field617 = 0;
        class46.field1214 = 0;
        class48.field1265 = 0;
        class8.field257 = 0;
        class64.field1619 = 0;
        class42.field1140 = 0;
        class19.field614 = 0;
        class123.field3076 = 0;
        class48.field1268 = 0;
        class9.field315 = 0;
        class81.field2042 = 0;
        class128.field3136 = 0;
        class109.field2741 = 0;
        class1.field13 = 0;
        class6.field239 = 0;
        class45.field1175 = 0;
        class8.field255 = 0;
        class11.field362 = 0;
        class92.field2289 = 0;
        class1.field8 = 0;
        class11.field414 = 0;
        class36.field955 = 0;
        class36.field953 = 0;
        class78.field1921 = 0;
        class100.field2533 = 0;
        class118.field2935 = 0;
        class92.field2295 = 0;
        class54.field1428 = 0;
        class64.field1623 = 0;
        class4.field177 = 0;
        class14.field462 = 0;
        class92.field2281 = 0;
        class8.field302 = 0;
        class48.field1267 = 0;
        class12.field416 = 0;
        class78.field1914 = 0;
        class133.field3244 = 0;
        class36.field950 = 0;
        class52.field1373 = 0;
        class128.field3132 = 0;
        class4.field165 = 0;
        class73.field1782 = 0;
        field590 = 0;
        class14.field452 = 0;
        class80.field1980 = 0;
        class9.field313 = 0;
        class118.field2945 = 0;
        class49.field1317 = 0;
        class127.field3115 = 0;
        class49.field1320 = 0;
        class134.field3296 = 0;
        class64.field1616 = 0;
        class108.field2727 = 0;
        class63.field1568 = 0;
        class8.field289 = 0;
        class67.field1667 = 0;
        class64.field1630 = 0;
        class4.field175 = 0;
        class1.field10 = 0;
        class99.field2430 = 0;
        class100.field2506 = 0;
        class1.field5 = 0;
        class47.field1223 = 0;
        class103.field2596 = 0;
        class1.field60 = 0;
        class59.field1487 = 0;
        class115.field2876 = 0;
        class85.field2132 = 0;
        class1.field16 = 0;
        class129.field3176 = 0;
        field576 = 0;
        field581 = 0;
        class92.field2285 = 0;
        class102.field2587 = 0;
        class15.field486 = 0;
        class114.field2817 = 0;
        class107.field2692 = 0;
        class24.field731 = 0;
        class64.field1611 = 0;
        class46.field1207 = 0;
        class66.field1647 = 0;
        class107.field2700 = 0;
        class45.field1187 = 0;
        class1.field22 = 0;
        class24.field723 = 0;
        class81.field2043 = 0;
        class1.field41 = 0;
        field606 = 0;
        class45.field1183 = 0;
        class72.field1757 = 0;
        class4.field183 = 0;
        class74.field1814 = 0;
        class8.field249 = 0;
        class42.field1114 = 0;
        class15.field482 = 0;
        class92.field2292 = 0;
        class76.field1891 = 0;
        class64.field1626 = 0;
        class8.field267 = 0;
        class104.field2623 = 0;
        class45.field1184 = 0;
        class11.field385 = 0;
        class67.field1678 = 0;
        class120.field2986 = 0;
        class100.field2455 = 0;
        class120.field2974 = 0;
        class75.field1871 = 0;
        class5.field206 = 0;
        class82.field2101 = 0;
        class132.field3241 = 0;
        class53.field1401 = 0;
        class133.field3278 = 0;
        class72.field1758 = 0;
        class64.field1613 = 0;
        class63.field1573 = 0;
        class8.field265 = 0;
        class24.field730 = 0;
        class31.field828 = 0;
        class80.field1961 = 0;
        class38.field1016 = 0;
        field609 = 0;
        class64.field1609 = 0;
        class82.field2102 = 0;
        class105.field2643 = 0;
        class1.field54 = 0;
        class130.field3184 = 0;
        class4.field166 = 0;
        class47.field1227 = 0;
        class46.field1204 = 0;
        class63.field1576 = 0;
        class105.field2659 = 0;
        class132.field3232 = 0;
        class1.field56 = 0;
        class107.field2695 = 0;
        class102.field2584 = 0;
        class42.field1123 = 0;
        class19.field628 = 0;
        class31.field840 = 0;
        class44.field1167 = 0;
        class8.field288 = 0;
        class66.field1653 = 0;
        class5.field207 = 0;
        class36.field970 = 0;
        class1.field46 = 0;
        class118.field2939 = 0;
        class80.field2019 = 0;
        class109.field2746 = 0;
        class1.field15 = 0;
        class102.field2564 = 0;
        class80.field1998 = 0;
        class72.field1767 = 0;
        class60.field1521 = 0;
        class1.field4 = 0;
        class50.field1356 = 0;
        class39.field1051 = 0;
        class19.field666 = 0;
        class35.field931 = 0;
        class75.field1881 = 0;
        class122.field3041 = 0;
        class123.field3068 = 0;
        class130.field3195 = 0;
        class89.field2180 = 0;
        class44.field1172 = 0;
        class72.field1771 = 0;
        class8.field275 = 0;
        class49.field1299 = 0;
        class14.field455 = 0;
        class108.field2709 = 0;
        class105.field2631 = 0;
        class63.field1589 = 0;
        class8.field291 = 0;
        class19.field663 = 0;
        class64.field1642 = 0;
        class32.field849 = 0;
        class1.field34 = 0;
        class120.field3000 = 0;
        class63.field1583 = 0;
        class47.field1230 = 0;
        class38.field1024 = 0;
        class15.field481 = 0;
        class113.field2777 = 0;
        class11.field396 = 0;
        class63.field1599 = 0;
        class11.field391 = 0;
        class1.field20 = 0;
        class89.field2172 = 0;
        class28.field804 = 0;
        class64.field1639 = 0;
        class104.field2625 = 0;
        class8.field294 = 0;
        class118.field2941 = 0;
        class38.field1011 = 0;
        class11.field373 = 0;
        class5.field200 = 0;
        class8.field270 = 0;
        class129.field3167 = 0;
        class50.field1354 = 0;
        class129.field3168 = 0;
        class102.field2570 = 0;
        class32.field861 = 0;
        class8.field274 = 0;
        class4.field171 = 0;
        class72.field1774 = 0;
        class47.field1228 = 0;
        class64.field1620 = 0;
        class8.field260 = 0;
        class36.field948 = 0;
        class116.field2893 = 0;
        class59.field1505 = 0;
        class74.field1829 = 0;
        class121.field3014 = 0;
        class95.field2366 = 0;
        class5.field212 = 0;
        class12.field428 = 0;
        class4.field180 = 0;
        class131.field3209 = 0;
        class75.field1869 = 0;
        class2.field72 = 0;
        class8.field287 = 0;
        class106.field2664 = 0;
        class4.field176 = 0;
        class11.field388 = 0;
        class46.field1208 = 0;
        class5.field213 = 0;
        class129.field3156 = 0;
        class5.field210 = 0;
        class97.field2398 = 0;
        class98.field2426 = 0;
        class4.field167 = 0;
        class93.field2324 = 0;
        class129.field3150 = 0;
        class16.field517 = 0;
        class72.field1776 = 0;
        class129.field3165 = 0;
        class115.field2835 = 0;
        class64.field1624 = 0;
        class64.field1637 = 0;
        class8.field300 = 0;
        class121.field3017 = 0;
        class8.field286 = 0;
        class52.field1380 = 0;
        class19.field636 = 0;
        class102.field2569 = 0;
        class1.field18 = 0;
        class108.field2724 = 0;
        class74.field1793 = 0;
        class79.field1948 = 0;
        class86.field2156 = 0;
        class120.field2987 = 0;
        class8.field266 = 0;
        class5.field189 = 0;
        class1.field33 = 0;
        class132.field3240 = 0;
        class34.field923 = 0;
        class109.field2744 = 0;
        class35.field929 = 0;
        class98.field2427 = 0;
        class115.field2866 = 0;
        class8.field263 = 0;
        class80.field1962 = 0;
        class100.field2475 = 0;
        class104.field2619 = 0;
        class12.field422 = 0;
        class46.field1215 = 0;
        class60.field1507 = 0;
        class116.field2900 = 0;
        class48.field1276 = 0;
        class115.field2836 = 0;
        class92.field2283 = 0;
        class92.field2278 = 0;
        class47.field1224 = 0;
        class42.field1142 = 0;
        class120.field2977 = 0;
        class1.field58 = 0;
        class38.field1043 = 0;
        class75.field1851 = 0;
        class11.field386 = 0;
        class62.field1547 = 0;
        class103.field2594 = 0;
        class63.field1587 = 0;
        class114.field2823 = 0;
        class32.field865 = 0;
        class115.field2871 = 0;
        class116.field2911 = 0;
        class53.field1402 = 0;
        class74.field1800 = 0;
        class8.field284 = 0;
        class78.field1912 = 0;
        class54.field1418 = 0;
        class74.field1796 = 0;
        class132.field3238 = 0;
        class113.field2784 = 0;
        class132.field3223 = 0;
        class108.field2716 = 0;
        class129.field3155 = 0;
        class44.field1174 = 0;
        class100.field2447 = 0;
        class42.field1109 = 0;
        class1.field28 = 0;
        class107.field2699 = 0;
        class109.field2736 = 0;
        class115.field2842 = 0;
        class114.field2819 = 0;
        class92.field2288 = 0;
        class49.field1340 = 0;
        class78.field1916 = 0;
        class8.field271 = 0;
        class2.field89 = 0;
        class8.field292 = 0;
        field594 = 0;
        class85.field2150 = 0;
        class59.field1492 = 0;
        field593 = 0;
        class1.field35 = 0;
        class49.field1294 = 0;
        class1.field32 = 0;
        class49.field1335 = 0;
        class70.field1735 = 0;
        class16.field509 = 0;
        class37.field979 = 0;
        class109.field2747 = 0;
        class6.field238 = 0;
        class44.field1170 = 0;
        class14.field451 = 0;
        class64.field1612 = 0;
        class120.field2976 = 0;
        class123.field3066 = 0;
        class82.field2068 = 0;
        class46.field1194 = 0;
        class24.field738 = 0;
        class64.field1610 = 0;
        class11.field393 = 0;
        class60.field1519 = 0;
        class93.field2329 = 0;
        class64.field1606 = 0;
        class109.field2731 = 0;
        class39.field1050 = 0;
        class116.field2910 = 0;
        class97.field2392 = 0;
        class4.field168 = 0;
        class34.field905 = 0;
        class82.field2110 = 0;
        class98.field2416 = 0;
        class108.field2725 = 0;
        class60.field1515 = 0;
        class120.field2991 = 0;
        class50.field1348 = 0;
        class34.field919 = 0;
        class93.field2319 = 0;
        class31.field841 = 0;
        class95.field2359 = 0;
        class64.field1627 = 0;
        class106.field2675 = 0;
        class115.field2881 = 0;
        class107.field2691 = 0;
        class49.field1337 = 0;
        class11.field381 = 0;
        class134.field3290 = 0;
        class35.field936 = 0;
        class36.field964 = 0;
        class49.field1283 = 0;
        class85.field2145 = 0;
        class1.field25 = 0;
        class75.field1872 = 0;
        class63.field1580 = 0;
        class75.field1859 = 0;
        class121.field3019 = 0;
        class43.field1150 = 0;
        class76.field1894 = 0;
        class54.field1421 = 0;
        class2.field88 = 0;
        class8.field282 = 0;
        class120.field2985 = 0;
        class103.field2595 = 0;
        class9.field320 = 0;
        class66.field1657 = 0;
        class5.field201 = 0;
        class109.field2730 = 0;
        class39.field1052 = 0;
        class8.field259 = 0;
        class47.field1250 = 0;
        class115.field2845 = 0;
        class32.field854 = 0;
        class15.field485 = 0;
        class66.field1650 = 0;
        class118.field2938 = 0;
        class75.field1849 = 0;
        class34.field893 = 0;
        class42.field1135 = 0;
        class103.field2598 = 0;
        class39.field1058 = 0;
        class106.field2677 = 0;
        class5.field204 = 0;
        class64.field1638 = 0;
        class12.field433 = 0;
        class24.field729 = 0;
        class59.field1498 = 0;
        class89.field2174 = arg0;
        class42.field1101 = 0;
        class42.field1111 = 0;
        class72.field1769 = 0;
        field607 = 0;
        field611 = 0;
        class134.field3294 = 0;
        class39.field1055 = 0;
        class75.field1865 = true;
        class48.field1279 = true;
        class44.method471(arg0 + 23721);
        class15.field499 = -1;
        class6.field225 = false;
        class1.field36 = -1;
        class112.field2764 = -1;
        class114.field2816 = 0;
        class75.field1858 = 0;
        class2.field97 = 0;
        class70.field1729.field268 = 0;
        class70.field1753 = 0;
        class99.field2437 = -1;
        class15.field489.field268 = 0;
        class42.field1105 = 0;
        class104.method879(true, 0);
        for (int var1 = 0; var1 < 100; var1++) {
            class80.field2037[var1] = null;
        }
        class14.field476 = 0;
        class112.field2769 = (int) (Math.random() * 80.0D) - 40;
        class98.field2412 = (int) (Math.random() * 110.0D) - 55;
        class35.field942 = 0;
        class86.field2161 = (int) (Math.random() * 120.0D) - 60;
        class8.field306 = -1;
        class49.field1343 = 0;
        class36.field966 = 0;
        field595 = 0;
        class113.field2800 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        class103.field2592 = (int) (Math.random() * 30.0D) - 20;
        class63.field1590 = 0;
        class8.field297 = (int) (Math.random() * 100.0D) - 50;
        class118.field2942 = 0;
        class108.field2723 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class80.field2033[var2] = null;
            class45.field1178[var2] = null;
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class120.field2995[var3] = null;
        }
        class104.field2624 = class80.field2033[2047] = new class2();
        class86.field2163.method809(0);
        class112.field2759.method809(0);
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class17.field553[var4][var6][var7] = null;
                }
            }
        }
        class92.field2287 = new class92();
        class59.field1495 = 0;
        class23.field702 = 0;
        class108.method898(class98.field2424, arg0 ^ 0xFFFFC872);
        class98.field2424 = -1;
        class108.method898(class86.field2169, -14222);
        class86.field2169 = -1;
        class108.method898(class132.field3230, -14222);
        class132.field3230 = -1;
        class108.method898(class42.field1144, arg0 - 14222);
        class42.field1144 = -1;
        class108.method898(class76.field1884, -14222);
        class76.field1884 = -1;
        class108.method898(class66.field1651, arg0 ^ 0xFFFFC872);
        class66.field1651 = -1;
        class108.method898(class113.field2803, -14222);
        class114.field2814 = 0;
        class37.field1002 = false;
        class6.field225 = false;
        class113.field2803 = -1;
        class64.field1608 = null;
        class120.field3001 = -1;
        class103.field2610 = -1;
        class57.field1473 = 0;
        class9.field331 = 3;
        class92.field2305.method643(null, false, 7, new int[5], -1);
        for (int var5 = 0; var5 < 5; var5++) {
            field600[var5] = null;
            class24.field736[var5] = false;
        }
        class39.field1070 = true;
    }
}
