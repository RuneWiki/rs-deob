import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class101 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Z")
    public static boolean field1529 = true;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "F")
    public static float field1531 = 0.0F;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
    public static int[] field1526;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method877(int arg0, byte arg1) {
        field1521++;
        class36.field544 = -1;
        class36.field544 = -1;
        int var2 = -53 % ((-arg1 - 45) / 60);
        if (arg0 == 37) {
            class351.field5595 = 3.0F;
        } else if (arg0 == 50) {
            class351.field5595 = 4.0F;
        } else if (arg0 == 75) {
            class351.field5595 = 6.0F;
        } else if (arg0 == 100) {
            class351.field5595 = 8.0F;
        } else if (arg0 == 200) {
            class351.field5595 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BI[Lrk;IIIZI)[I", line = 47)
    public static final int[] method878(byte[] arg0, int arg1, class290[] arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1525++;
        byte var8;
        if (arg6) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg6) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg4 + var10 > 0 && arg4 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
                            arg2[var9].field4520[arg4 + var10][arg7 + var11] = class301.method2169(arg2[var9].field4520[arg4 + var10][arg7 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class25 var12 = new class25(arg0);
        int var13 = arg1 + arg4;
        int var14 = arg3 + arg7;
        for (int var15 = 0; var15 < var8; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class319.method2252((byte) -59, 0, false, var17 + arg7, 0, 0, arg4 + var16, var13 - -var16, var15, arg6, var12, var14 + var17);
                }
            }
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var12.field448.length > var12.field397) {
            int var20 = var12.method281(111);
            if (var20 == 128) {
                class93.field1406[0] = var12.method314((byte) 110);
                class93.field1406[1] = var12.method296(-88);
                class93.field1406[2] = var12.method296(-122);
                class93.field1406[3] = var12.method296(-116);
                var18 = true;
                class93.field1406[4] = var12.method314((byte) 109);
            } else {
                if (var20 != 129) {
                    var12.field397--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var12.method286((byte) 102);
                    if (var22 == 0) {
                        int var32 = arg4;
                        if (arg4 < 0) {
                            var32 = 0;
                        } else if (arg4 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg7 + 64;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg7;
                        if (arg7 < 0) {
                            var34 = 0;
                        } else if (arg7 >= 104) {
                            var34 = 104;
                        }
                        int var35 = arg4 + 64;
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var32 < var35) {
                            while (var33 > var34) {
                                class109.field1672[var21][var32][var34] = 0;
                                var34++;
                            }
                            var32++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var12.method286((byte) 127);
                                for (int var30 = arg4 + var27; var30 < arg4 + var27 + 4; var30++) {
                                    for (int var31 = arg7 + var28; var31 < arg7 + var28 + 4; var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class109.field1672[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var23 = arg4 + 64;
                        int var24 = arg7;
                        int var25 = arg4;
                        int var26 = arg7 + 64;
                        if (arg7 < 0) {
                            var24 = 0;
                        } else if (arg7 >= 104) {
                            var24 = 104;
                        }
                        if (arg4 < 0) {
                            var25 = 0;
                        } else if (arg4 >= 104) {
                            var25 = 104;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        while (var23 > var25) {
                            while (var26 > var24) {
                                class109.field1672[var21][var25][var24] = class109.field1672[var21 - 1][var25][var24];
                                var24++;
                            }
                            var25++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class240.field3737 && !arg6) {
            class110 var36 = null;
            label292: while (true) {
                int var38;
                label285: do {
                    while (true) {
                        while (var12.field397 < var12.field448.length) {
                            int var37 = var12.method281(2);
                            if (var37 == 0) {
                                var36 = new class110(var12);
                            } else {
                                if (var37 == 1) {
                                    var38 = var12.method281(15);
                                    continue label285;
                                }
                                if (var37 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var36 == null) {
                                    var36 = new class110();
                                }
                                var36.method956((byte) 106, var12);
                            }
                        }
                        if (var36 == null) {
                            var36 = new class110();
                        }
                        for (int var44 = 0; var44 < 8; var44++) {
                            for (int var45 = 0; var45 < 8; var45++) {
                                int var46 = (arg4 >> 3) + var44;
                                int var47 = (arg7 >> 3) + var45;
                                if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                                    class49.field774[var46][var47] = var36;
                                }
                            }
                        }
                        break label292;
                    }
                } while (var38 <= 0);
                for (int var39 = 0; var39 < var38; var39++) {
                    class186 var40 = new class186(var12);
                    if (var40.field2921 == 31) {
                        class173 var41 = class166.method1320(var12.method314((byte) 32), arg5 + 13);
                        var40.method1432(var41.field2747, var41.field2755, var41.field2759, -73, var41.field2748);
                    }
                    var40.field2924 += arg7 << 7;
                    var40.field2909 += arg4 << 7;
                    int var42 = var40.field2909 >> 7;
                    int var43 = var40.field2924 >> 7;
                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                        var40.field2911 = (class146.field2386[1][var42][var43] & 0x2) != 0;
                        var40.field2913 = class277.field4290[var40.field2922][var42][var43] - var40.field2913;
                        class299.method2147(var40);
                    }
                }
            }
        }
        if (arg5 != 104) {
            field1526 = (int[]) null;
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg4 >> 2) + var49;
                        int var52 = (arg7 >> 2) + var50;
                        if (var51 >= 0 && var51 < 26 && var52 >= 0 && var52 < 26) {
                            class109.field1672[var48][var51][var52] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class93.field1406 : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)Z", line = 469)
    public static final boolean method879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class195.field3066 * arg0 + class13.field161 * arg3 >> 16;
        int var6 = class195.field3066 * arg3 - class13.field161 * arg0 >> 16;
        int var7 = class356.field5671 * var6 + class270.field4175 * arg1 >> 16;
        int var8 = class356.field5671 * arg1 - class270.field4175 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class356.field5671 * var6 + class270.field4175 * arg2 >> 16;
        int var12 = class356.field5671 * arg2 - class270.field4175 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class66.field997 && var13 < class66.field997) {
            return false;
        } else if (var9 > class173.field2752 && var13 > class173.field2752) {
            return false;
        } else if (var10 < class79.field1162 && var14 < class79.field1162) {
            return false;
        } else {
            return var10 <= class171.field2695 || var14 <= class171.field2695;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 521)
    public static final void method880(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class227.field3540[var1] = true;
        }
        field1530++;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 533)
    public static void method881(int arg0) {
        if (arg0 != -2749) {
            method881(-114);
        }
        field1526 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)V", line = 544)
    public static final void method882(int arg0, String arg1) {
        class72.method683("", "", (byte) -113, arg1, 0, 0);
        field1527++;
        if (arg0 != -1) {
            field1526 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 555)
    public static final void method883(int arg0) {
        field1524++;
        if (arg0 != 2 || class290.field4509 == 0 || class290.field4509 == 5) {
            return;
        }
        try {
            if (++class226.field3520 > 2000) {
                if (class188.field2950 != null) {
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                }
                if (class15.field240 >= 1) {
                    class290.field4509 = 0;
                    class248.field3849 = -5;
                    return;
                }
                if (class301.field4681 == class207.field3188) {
                    class301.field4681 = class66.field1011;
                } else {
                    class301.field4681 = class207.field3188;
                }
                class290.field4509 = 1;
                class226.field3520 = 0;
                class15.field240++;
            }
            if (class290.field4509 == 1) {
                class207.field3180 = class340.field5234.method2288(class166.field2643, class301.field4681, -124);
                class290.field4509 = 2;
            }
            if (class290.field4509 == 2) {
                if (class207.field3180.field1447 == 2) {
                    throw new IOException();
                }
                if (class207.field3180.field1447 != 1) {
                    return;
                }
                class188.field2950 = new class344((Socket) class207.field3180.field1446, class340.field5234);
                class207.field3180 = null;
                long var1 = class38.field575 = client.method1025(768, class134.field2238);
                class99.field1491.field397 = 0;
                class99.field1491.method273(0, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class99.field1491.method273(arg0 ^ 0x2, var3);
                class188.field2950.method2426(0, -28332, class99.field1491.field448, 2);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(arg0 ^ 0x2);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(arg0 ^ 0x2);
                }
                int var4 = class188.field2950.method2423(false);
                if (class94.field1434 != null) {
                    class94.field1434.method1874(0);
                }
                if (class68.field1048 != null) {
                    class68.field1048.method1874(0);
                }
                if (var4 != 0) {
                    class248.field3849 = var4;
                    class290.field4509 = 0;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                }
                class290.field4509 = 3;
            }
            if (class290.field4509 == 3) {
                if (class188.field2950.method2424((byte) 21) < 8) {
                    return;
                }
                class188.field2950.method2428(8, class244.field3803.field448, (byte) 65, 0);
                class244.field3803.field397 = 0;
                class206.field3173 = class244.field3803.method266(62);
                class99.field1491.field397 = 0;
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class206.field3173 >> 32), (int) class206.field3173 };
                class99.field1491.method273(0, 10);
                class99.field1491.method310(103, var5[0]);
                class99.field1491.method310(67, var5[1]);
                class99.field1491.method310(60, var5[2]);
                class99.field1491.method310(50, var5[3]);
                class99.field1491.method279(12086, client.method1025(768, class134.field2238));
                class99.field1491.method280(-18345, class37.field571);
                class99.field1491.method268(-29, class165.field2616, class140.field2325);
                class280.field4331.field397 = 0;
                if (class295.field4578 == 40) {
                    class280.field4331.method273(0, 18);
                } else {
                    class280.field4331.method273(0, 16);
                }
                class280.field4331.method304(false, class99.field1491.field397 + class34.method354(class181.field2853, (byte) 51) + 163);
                class280.field4331.method310(104, 554);
                class280.field4331.method273(0, class74.field1101);
                class280.field4331.method273(0, class148.field2428 ? 1 : 0);
                class280.field4331.method273(0, 1);
                class280.field4331.method273(arg0 ^ 0x2, class113.method969(1));
                class280.field4331.method304(false, class126.field2113);
                class280.field4331.method304(false, class362.field5740);
                class280.field4331.method273(arg0 ^ 0x2, class271.field4194);
                class202.method1511(-127, class280.field4331);
                class280.field4331.method280(-18345, class181.field2853);
                class280.field4331.method310(arg0 ^ 0x3C, class350.field5549);
                class280.field4331.method310(72, class98.method865(1653211349));
                class258.field3951 = true;
                class280.field4331.method304(false, class296.field4597);
                class280.field4331.method310(arg0 ^ 0x49, class155.field2506.method205(true));
                class280.field4331.method310(62, class133.field2226.method205(true));
                class280.field4331.method310(62, class91.field1362.method205(true));
                class280.field4331.method310(54, class41.field659.method205(true));
                class280.field4331.method310(32, class239.field3701.method205(true));
                class280.field4331.method310(arg0 + 50, class181.field2856.method205(true));
                class280.field4331.method310(51, class155.field2504.method205(true));
                class280.field4331.method310(125, class81.field1188.method205(true));
                class280.field4331.method310(66, class303.field4725.method205(true));
                class280.field4331.method310(arg0 ^ 0x67, class171.field2713.method205(true));
                class280.field4331.method310(92, class226.field3521.method205(true));
                class280.field4331.method310(76, class160.field2548.method205(true));
                class280.field4331.method310(125, class163.field2599.method205(true));
                class280.field4331.method310(arg0 ^ 0x64, class271.field4184.method205(true));
                class280.field4331.method310(95, class206.field3170.method205(true));
                class280.field4331.method310(arg0 + 38, class36.field545.method205(true));
                class280.field4331.method310(73, class64.field986.method205(true));
                class280.field4331.method310(37, class178.field2816.method205(true));
                class280.field4331.method310(61, class109.field1661.method205(true));
                class280.field4331.method310(33, class66.field1017.method205(true));
                class280.field4331.method310(94, class326.field5016.method205(true));
                class280.field4331.method310(105, class162.field2575.method205(true));
                class280.field4331.method310(arg0 + 99, class185.field2897.method205(true));
                class280.field4331.method310(104, class266.field4129.method205(true));
                class280.field4331.method310(58, class345.field5498.method205(true));
                class280.field4331.method310(72, class303.field4727.method205(true));
                class280.field4331.method310(36, class90.field1274.method205(true));
                class280.field4331.method310(arg0 + 95, class42.field677.method205(true));
                class280.field4331.method310(arg0 ^ 0x2E, class178.field2815.method205(true));
                class280.field4331.method311(1, class99.field1491.field397, 0, class99.field1491.field448);
                class188.field2950.method2426(0, -28332, class280.field4331.field448, class280.field4331.field397);
                class99.field1491.method1620((byte) 75, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class244.field3803.method1620((byte) 75, var5);
                class290.field4509 = 4;
            }
            if (class290.field4509 == 4) {
                if (class188.field2950.method2424((byte) 21) < 1) {
                    return;
                }
                int var7 = class188.field2950.method2423(false);
                if (var7 == 21) {
                    class290.field4509 = 7;
                } else if (var7 == 29) {
                    class290.field4509 = 10;
                } else if (var7 == 1) {
                    class290.field4509 = 5;
                    class248.field3849 = var7;
                    return;
                } else if (var7 == 2) {
                    class290.field4509 = 8;
                } else if (var7 == 15) {
                    class290.field4509 = 0;
                    class248.field3849 = var7;
                    return;
                } else if (var7 == 23 && class15.field240 < 1) {
                    class15.field240++;
                    class226.field3520 = 0;
                    class290.field4509 = 1;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                } else {
                    class248.field3849 = var7;
                    class290.field4509 = 0;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                }
            }
            if (class290.field4509 == 6) {
                class99.field1491.field397 = 0;
                class99.field1491.method1628((byte) -87, 17);
                class188.field2950.method2426(0, -28332, class99.field1491.field448, class99.field1491.field397);
                class290.field4509 = 4;
                return;
            }
            if (class290.field4509 == 7) {
                if (class188.field2950.method2424((byte) 21) >= 1) {
                    class221.field3439 = class188.field2950.method2423(false) * 60 + 180;
                    class290.field4509 = 0;
                    class248.field3849 = 21;
                    class188.field2950.method2429(false);
                    class188.field2950 = null;
                    return;
                }
                return;
            }
            if (class290.field4509 == 10) {
                if (class188.field2950.method2424((byte) 21) < 1) {
                    return;
                }
                class222.field3447 = class188.field2950.method2423(false);
                class290.field4509 = 0;
                class248.field3849 = 29;
                class188.field2950.method2429(false);
                class188.field2950 = null;
                return;
            }
            if (class290.field4509 == 8) {
                if (class188.field2950.method2424((byte) 21) < 14) {
                    return;
                }
                class188.field2950.method2428(14, class244.field3803.field448, (byte) 99, 0);
                class244.field3803.field397 = 0;
                class270.field4168 = class244.field3803.method281(-125);
                class190.field2990 = class244.field3803.method281(113);
                class175.field2772 = class244.field3803.method281(-128) == 1;
                class285.field4421 = class244.field3803.method281(-127) == 1;
                class321.field4951 = class244.field3803.method281(35) == 1;
                class256.field3935 = class244.field3803.method281(-127) == 1;
                class321.field4949 = class244.field3803.method281(arg0 ^ 0x4C) == 1;
                class118.field1813 = class244.field3803.method314((byte) 105);
                class279.field4299 = class244.field3803.method281(arg0 ^ 0x36) == 1;
                class42.field668 = class244.field3803.method281(49) == 1;
                class34.method356(116, class42.field668);
                class245.method1848(class42.field668, 99);
                class311.method2211(arg0 - 2, class42.field668);
                if (!class148.field2428) {
                    if ((!class175.field2772 || class321.field4951) && !class279.field4299) {
                        try {
                            class141.method1176(class340.field5234.field4975, true, "unzap");
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class141.method1176(class340.field5234.field4975, true, "zap");
                        } catch (Throwable var14) {
                        }
                    }
                }
                try {
                    class141.method1176(class340.field5234.field4975, true, "loggedin");
                } catch (Throwable var12) {
                }
                class123.field1966 = class244.field3803.method1625((byte) 81);
                class122.field1945 = class244.field3803.method314((byte) 111);
                class290.field4509 = 9;
            }
            if (class290.field4509 == 9) {
                if (class188.field2950.method2424((byte) 21) >= class122.field1945) {
                    class244.field3803.field397 = 0;
                    class188.field2950.method2428(class122.field1945, class244.field3803.field448, (byte) 66, 0);
                    class248.field3849 = 2;
                    class290.field4509 = 0;
                    class320.method2263(0);
                    class311.field4843 = -1;
                    class42.method435(false, 1);
                    class123.field1966 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class188.field2950 != null) {
                class188.field2950.method2429(false);
                class188.field2950 = null;
            }
            if (class15.field240 < 1) {
                class226.field3520 = 0;
                if (class301.field4681 == class207.field3188) {
                    class301.field4681 = class66.field1011;
                } else {
                    class301.field4681 = class207.field3188;
                }
                class290.field4509 = 1;
                class15.field240++;
            } else {
                class290.field4509 = 0;
                class248.field3849 = -4;
            }
        }
    }
}
