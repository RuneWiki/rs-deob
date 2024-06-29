import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class258 extends class32 {

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field3955 = " from your friend list first.";

    @OriginalMember(owner = "client!vg", name = "lb", descriptor = "I")
    public static int field3958 = 0;

    @OriginalMember(owner = "client!vg", name = "rb", descriptor = "I")
    public static int field3964 = -1;

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!vg", name = "mb", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!vg", name = "nb", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!vg", name = "pb", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!vg", name = "qb", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!vg", name = "ob", descriptor = "Lpc;")
    public static class111 field3961;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V")
    public static final void method1737(byte arg0) {
        ++field3962;
        class148.field2151.method1434(-2080769);
        class287.field4391 = 1;
        class11.field162 = null;
        if (arg0 < 100) {
            method1737((byte) 45);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(II)V")
    public static final void method1738(int arg0, int arg1) {
        ++field3956;
        class9 var2 = class42.field738;
        synchronized (class42.field738) {
            class169.field2485 = arg0;
            int var3 = -14 / ((arg1 - -52) / 44);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        int var3 = 7 % ((-54 - arg0) / 44);
        ++field3960;
        int[][] var4 = super.field618.method91(-128, arg1);
        if (super.field618.field211 && this.method215(false)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg1 % super.field569 * super.field569;
            for (int var9 = 0; var9 < class226.field3527; ++var9) {
                int var10 = super.field580[var9 % super.field579 + var8];
                var7[var9] = class131.method904(var10 << 4, 4080);
                var6[var9] = class131.method904(var10, 65280) >> 4;
                var5[var9] = class131.method904(var10, 16711680) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)V")
    public static void method1739(byte arg0) {
        field3961 = null;
        field3955 = null;
        int var1 = 29 / ((69 - arg0) / 48);
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "(I)V")
    public static final void method1740(int arg0) {
        for (class184 var1 = (class184) class269.field4183.method1894((byte) -90); var1 != null; var1 = (class184) class269.field4183.method1886(-6)) {
            if (var1.field2670 == -1) {
                var1.field2666 = 0;
                class27.method195((byte) 34, var1);
            } else {
                var1.method1193(127);
            }
        }
        if (arg0 == 0) {
            ++field3963;
        }
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
    public static final void method1741(int arg0) {
        ++field3954;
        if (~class8.field101 < -2) {
            class12.field173 = class169.field2494;
            --class8.field101;
        }
        if (class206.field3091 > 0) {
            --class206.field3091;
        }
        if (class125.field1846) {
            class125.field1846 = false;
            class210.method1383(7928);
        } else {
            for (int var1 = 0; ~var1 > -101 && class191.method1277(-121); ++var1) {
            }
            if (~class42.field742 == -31) {
                class10.method77(class59.field964, 107, (byte) 116);
                Object var2 = class264.field4132.field2965;
                synchronized (class264.field4132.field2965) {
                    if (!class34.field620) {
                        class264.field4132.field2970 = 0;
                    } else if (class295.field4482 != 0 || ~class264.field4132.field2970 <= -41) {
                        class59.field964.method1540(93, (byte) -2);
                        class59.field964.method437(true, 0);
                        ++class5.field71;
                        int var3 = class59.field964.field887;
                        int var4 = 0;
                        for (int var5 = 0; ~class264.field4132.field2970 < ~var5 && -var3 + class59.field964.field887 < 240; ++var5) {
                            ++var4;
                            int var6 = class264.field4132.field2969[var5];
                            if (~var6 <= -1) {
                                if (var6 > 65534) {
                                    var6 = 65534;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class264.field4132.field2968[var5];
                            boolean var8 = false;
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (~var7 < -65535) {
                                var7 = 65534;
                            }
                            if (class264.field4132.field2968[var5] == -1 && ~class264.field4132.field2969[var5] == 0) {
                                var8 = true;
                                var6 = -1;
                                var7 = -1;
                            }
                            if (~class113.field1729 == ~var6 && ~class124.field1838 == ~var7) {
                                if (~class25.field476 > -2048) {
                                    ++class25.field476;
                                }
                            } else {
                                int var9 = var6 - class113.field1729;
                                class113.field1729 = var6;
                                int var10 = var7 - class124.field1838;
                                class124.field1838 = var7;
                                if (~class25.field476 > -9 && ~var9 <= 31 && ~var9 >= -32 && var10 >= -32 && var10 <= 31) {
                                    var10 += 32;
                                    var9 += 32;
                                    class59.field964.method428((class25.field476 << 12) + (var9 << 6) + var10, (byte) 46);
                                    class25.field476 = 0;
                                } else if (~class25.field476 > -33 && ~var9 <= 127 && ~var9 >= -128 && ~var10 <= 127 && var10 <= 127) {
                                    class59.field964.method437(true, class25.field476 + 128);
                                    var9 += 128;
                                    var10 += 128;
                                    class59.field964.method428((var9 << 8) + var10, (byte) 46);
                                    class25.field476 = 0;
                                } else if (class25.field476 < 32) {
                                    class59.field964.method437(true, class25.field476 + 192);
                                    if (var8) {
                                        class59.field964.method453((byte) 115, Integer.MIN_VALUE);
                                    } else {
                                        class59.field964.method453((byte) 92, var7 << 16 | var6);
                                    }
                                    class25.field476 = 0;
                                } else {
                                    class59.field964.method428(57344 - -class25.field476, (byte) 46);
                                    if (!var8) {
                                        class59.field964.method453((byte) 124, var7 << 16 | var6);
                                    } else {
                                        class59.field964.method453((byte) 93, Integer.MIN_VALUE);
                                    }
                                    class25.field476 = 0;
                                }
                            }
                        }
                        class59.field964.method413(-var3 + class59.field964.field887, arg0 + 16661);
                        if (class264.field4132.field2970 > var4) {
                            class264.field4132.field2970 -= var4;
                            for (int var11 = 0; ~var11 > ~class264.field4132.field2970; ++var11) {
                                class264.field4132.field2969[var11] = class264.field4132.field2969[var11 - -var4];
                                class264.field4132.field2968[var11] = class264.field4132.field2968[var4 + var11];
                            }
                        } else {
                            class264.field4132.field2970 = 0;
                        }
                    }
                }
                if (~class295.field4482 != -1) {
                    ++class106.field1563;
                    int var12 = class87.field1317;
                    long var13 = (-class15.field277 + class296.field4499) / 50L;
                    if (~var13 < -32768L) {
                        var13 = 32767L;
                    }
                    if (var12 >= 0) {
                        if (var12 > 65535) {
                            var12 = 65535;
                        }
                    } else {
                        var12 = 0;
                    }
                    byte var15 = 0;
                    int var16 = class157.field2303;
                    if (class295.field4482 == 2) {
                        var15 = 1;
                    }
                    if (~var16 <= -1) {
                        if (~var16 < -65536) {
                            var16 = 65535;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = (int) var13;
                    class15.field277 = class296.field4499;
                    class59.field964.method1540(167, (byte) -2);
                    class59.field964.method399(-46, var16 | var12 << 16);
                    class59.field964.method400(var15 << 15 | var17, -98);
                }
                if (class165.field2421 > 0) {
                    --class165.field2421;
                }
                if (class36.field641 && ~class165.field2421 >= -1) {
                    ++class34.field600;
                    class165.field2421 = 20;
                    class36.field641 = false;
                    class59.field964.method1540(119, (byte) -2);
                    class59.field964.method400((int) class89.field1349, -100);
                    class59.field964.method445((byte) -89, (int) class281.field4313);
                }
                if (class103.field1512 && !class140.field2026) {
                    class140.field2026 = true;
                    class59.field964.method1540(39, (byte) -2);
                    class59.field964.method437(true, 1);
                    ++class293.field4447;
                }
                if (!class103.field1512 && class140.field2026) {
                    class140.field2026 = false;
                    class59.field964.method1540(39, (byte) -2);
                    ++class293.field4447;
                    class59.field964.method437(true, 0);
                }
                if (!class107.field1574) {
                    ++class194.field2933;
                    class59.field964.method1540(208, (byte) -2);
                    class59.field964.method399(-105, class194.method1307(2222));
                    class107.field1574 = true;
                }
                if (class275.field4244) {
                    class275.field4244 = false;
                } else {
                    class101.field1482 /= 2.0F;
                }
                if (class284.field4364) {
                    class284.field4364 = false;
                } else {
                    class215.field3310 /= 2.0F;
                }
                class261.method1763((byte) -92);
                if (class42.field742 == 30) {
                    class207.method1367(false);
                    class169.method1138(17693);
                    class104.method760(false);
                    ++class125.field1847;
                    if (~class125.field1847 < -751) {
                        class210.method1383(arg0 ^ -7929);
                    } else {
                        class117.method829(arg0 ^ 99);
                        class200.method1336(true);
                        class246.method1687(-1);
                        if (class244.field3773 != null) {
                            class61.method498(0);
                        }
                        for (int var18 = class280.method1863(true, true); var18 != -1; var18 = class280.method1863(true, false)) {
                            class139.method939(17, var18);
                            class37.field647[class131.method904(class213.field3278++, 31)] = var18;
                        }
                        for (class105 var19 = class33.method222((byte) -126); var19 != null; var19 = class33.method222((byte) -126)) {
                            int var20 = var19.method762((byte) -31);
                            int var21 = var19.method769(0);
                            if (~var20 != -2) {
                                if (~var20 != -3) {
                                    if (~var20 == -4) {
                                        class297 var22 = class151.method1023(-30464, var21);
                                        if (!var19.field1550.equals(var22.field4581)) {
                                            var22.field4581 = var19.field1550;
                                            class297.method1979((byte) -52, var22);
                                        }
                                    } else if (~var20 != -5) {
                                        if (var20 != 5) {
                                            if (~var20 == -7) {
                                                int var23 = var19.field1553;
                                                int var24 = var23 >> 10 & 31;
                                                int var25 = 31 & var23 >> 5;
                                                class297 var26 = class151.method1023(-30464, var21);
                                                int var27 = var23 & 31;
                                                int var28 = (var24 << 19) + (var25 << 11) + (var27 << 3);
                                                if (~var26.field4522 != ~var28) {
                                                    var26.field4522 = var28;
                                                    class297.method1979((byte) -87, var26);
                                                }
                                            } else if (~var20 == -8) {
                                                class297 var29 = class151.method1023(-30464, var21);
                                                boolean var30 = ~var19.field1553 == -2;
                                                if (!var30 != !var29.field4662) {
                                                    var29.field4662 = var30;
                                                    class297.method1979((byte) -104, var29);
                                                }
                                            } else if (var20 != 8) {
                                                if (var20 != 9) {
                                                    if (var20 != 10) {
                                                        if (~var20 == -12) {
                                                            class297 var31 = class151.method1023(arg0 ^ 30463, var21);
                                                            var31.field4579 = 0;
                                                            var31.field4700 = var31.field4551 = var19.field1553;
                                                            var31.field4606 = 0;
                                                            var31.field4578 = var31.field4564 = var19.field1545;
                                                            class297.method1979((byte) -117, var31);
                                                        } else if (var20 != 12) {
                                                            if (var20 == 13) {
                                                                class297 var32 = class151.method1023(-30464, var21);
                                                                var32.field4640 = var19.field1553;
                                                            }
                                                        } else {
                                                            class297 var33 = class151.method1023(-30464, var21);
                                                            int var34 = var19.field1553;
                                                            if (var33 != null && ~var33.field4553 == -1) {
                                                                if (~(-var33.field4531 + var33.field4675) > ~var34) {
                                                                    var34 = -var33.field4531 + var33.field4675;
                                                                }
                                                                if (~var34 > -1) {
                                                                    var34 = 0;
                                                                }
                                                                if (~var33.field4594 != ~var34) {
                                                                    var33.field4594 = var34;
                                                                    class297.method1979((byte) -65, var33);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        class297 var35 = class151.method1023(-30464, var21);
                                                        if (~var19.field1553 != ~var35.field4601 || var19.field1545 != var35.field4668 || ~var19.field1540 != ~var35.field4597) {
                                                            var35.field4597 = var19.field1540;
                                                            var35.field4668 = var19.field1545;
                                                            var35.field4601 = var19.field1553;
                                                            class297.method1979((byte) -55, var35);
                                                        }
                                                    }
                                                } else {
                                                    class297 var36 = class151.method1023(-30464, var21);
                                                    if (var19.field1553 != var36.field4608 || ~var19.field1545 != ~var36.field4614) {
                                                        var36.field4608 = var19.field1553;
                                                        var36.field4614 = var19.field1545;
                                                        class297.method1979((byte) -124, var36);
                                                    }
                                                }
                                            } else {
                                                class297 var37 = class151.method1023(-30464, var21);
                                                if (~var19.field1553 != ~var37.field4622 || ~var19.field1545 != ~var37.field4691 || var19.field1540 != var37.field4624) {
                                                    var37.field4691 = var19.field1545;
                                                    var37.field4624 = var19.field1540;
                                                    if (var37.field4608 != -1) {
                                                        if (var37.field4560 <= 0) {
                                                            if (~var37.field4686 < -1) {
                                                                var37.field4624 = var37.field4624 * 32 / var37.field4686;
                                                            }
                                                        } else {
                                                            var37.field4624 = var37.field4624 * 32 / var37.field4560;
                                                        }
                                                    }
                                                    var37.field4622 = var19.field1553;
                                                    class297.method1979((byte) -76, var37);
                                                }
                                            }
                                        } else {
                                            class297 var38 = class151.method1023(-30464, var21);
                                            if (var19.field1553 != var38.field4613 || var19.field1553 == -1) {
                                                var38.field4613 = var19.field1553;
                                                var38.field4701 = 0;
                                                var38.field4527 = 1;
                                                var38.field4546 = 0;
                                                class297.method1979((byte) -105, var38);
                                            }
                                        }
                                    } else {
                                        class297 var39 = class151.method1023(arg0 ^ 30463, var21);
                                        int var40 = var19.field1553;
                                        int var41 = var19.field1540;
                                        int var42 = var19.field1545;
                                        if (~var39.field4584 != ~var40 || ~var39.field4604 != ~var42 || ~var39.field4590 != ~var41) {
                                            var39.field4590 = var41;
                                            var39.field4604 = var42;
                                            var39.field4584 = var40;
                                            class297.method1979((byte) -65, var39);
                                        }
                                    }
                                } else {
                                    class130.field1922[var21] = var19.field1550;
                                    class231.field3585[class131.method904(class3.field44++, 31)] = var21;
                                }
                            } else {
                                class117.field1759[var21] = var19.field1553;
                                class50.field814[class131.method904(class37.field645++, 31)] = var21;
                            }
                        }
                        if (class102.field1501 != 0) {
                            class55.field925 += 20;
                            if (~class55.field925 <= -401) {
                                class102.field1501 = 0;
                            }
                        }
                        ++class177.field2599;
                        if (class111.field1695 != null) {
                            ++class293.field4442;
                            if (class293.field4442 >= 15) {
                                class297.method1979((byte) -96, class111.field1695);
                                class111.field1695 = null;
                            }
                        }
                        if (class211.field3177 != null) {
                            class297.method1979((byte) -99, class211.field3177);
                            ++class248.field3849;
                            if (~class12.field172 < ~(class253.field3902 + 5) || class12.field172 < class253.field3902 - 5 || class105.field1542 > class259.field3970 - -5 || ~(class259.field3970 + -5) < ~class105.field1542) {
                                class11.field166 = true;
                            }
                            if (~class215.field3304 == -1) {
                                if (class11.field166 && ~class248.field3849 <= -6) {
                                    if (class211.field3177 == class154.field2252 && ~class172.field2525 != ~class17.field314) {
                                        ++class14.field194;
                                        class297 var43 = class211.field3177;
                                        byte var44 = 0;
                                        if (class275.field4237 == 1 && var43.field4600 == 206) {
                                            var44 = 1;
                                        }
                                        if (var43.field4529[class17.field314] <= 0) {
                                            var44 = 0;
                                        }
                                        if (client.method333(var43).method1955(-84)) {
                                            int var45 = class172.field2525;
                                            int var46 = class17.field314;
                                            var43.field4529[var46] = var43.field4529[var45];
                                            var43.field4654[var46] = var43.field4654[var45];
                                            var43.field4529[var45] = -1;
                                            var43.field4654[var45] = 0;
                                        } else if (var44 == 1) {
                                            int var47 = class172.field2525;
                                            int var48 = class17.field314;
                                            while (~var47 != ~var48) {
                                                if (~var48 > ~var47) {
                                                    var43.method1984(var47 + -1, var47, (byte) -93);
                                                    --var47;
                                                } else if (~var48 < ~var47) {
                                                    var43.method1984(var47 - -1, var47, (byte) -101);
                                                    ++var47;
                                                }
                                            }
                                        } else {
                                            var43.method1984(class17.field314, class172.field2525, (byte) -96);
                                        }
                                        class59.field964.method1540(203, (byte) -2);
                                        class59.field964.method403(var44, (byte) -104);
                                        class59.field964.method400(class17.field314, -102);
                                        class59.field964.method445((byte) -118, class172.field2525);
                                        class59.field964.method454(class211.field3177.field4683, (byte) 81);
                                    }
                                } else if ((~class205.field3078 == -2 || class181.method1188(class51.field826 + -1, 126)) && ~class51.field826 < -3) {
                                    class296.method1966(62);
                                } else if (class51.field826 > 0) {
                                    class287.method1905(~arg0);
                                }
                                class295.field4482 = 0;
                                class211.field3177 = null;
                                class293.field4442 = 10;
                            }
                        }
                        class34.field619 = null;
                        class108.field1582 = false;
                        class4.field56 = 0;
                        class297 var49 = class148.field2144;
                        class68.field1119 = false;
                        class297 var50 = class245.field3820;
                        class245.field3820 = null;
                        class148.field2144 = null;
                        while (class68.method538((byte) 66) && class4.field56 < 128) {
                            class5.field61[class4.field56] = class22.field365;
                            class295.field4478[class4.field56] = class249.field3867;
                            ++class4.field56;
                        }
                        class244.field3773 = null;
                        if (~class184.field2677 != 0) {
                            class179.method1178(0, 0, 0, arg0 + -10561, class184.field2677, 0, class126.field1854, class85.field1311);
                        }
                        ++class169.field2494;
                        while (true) {
                            class43 var51;
                            class297 var52;
                            class297 var53;
                            do {
                                var51 = (class43) class236.field3632.method1888(true);
                                if (var51 == null) {
                                    while (true) {
                                        class43 var54;
                                        class297 var55;
                                        class297 var56;
                                        do {
                                            var54 = (class43) class43.field764.method1888(true);
                                            if (var54 == null) {
                                                while (true) {
                                                    class43 var57;
                                                    class297 var58;
                                                    class297 var59;
                                                    do {
                                                        var57 = (class43) class122.field1813.method1888(true);
                                                        if (var57 == null) {
                                                            if (class244.field3773 == null) {
                                                                class97.field1438 = 0;
                                                            }
                                                            if (class223.field3464 != null) {
                                                                class181.method1192(29975);
                                                            }
                                                            if (class149.field2165 > 0 && class293.field4451[82] && class293.field4451[81] && ~class136.field1984 != -1) {
                                                                int var60 = -class136.field1984 + class260.field3986;
                                                                if (var60 >= 0) {
                                                                    if (~var60 < -4) {
                                                                        var60 = 3;
                                                                    }
                                                                } else {
                                                                    var60 = 0;
                                                                }
                                                                class245.method1671(-92, class185.field2687.field493[0] + class188.field2774, var60, class90.field1367 - -class185.field2687.field449[0]);
                                                            }
                                                            if (class149.field2165 > 0 && class293.field4451[82] && class293.field4451[81]) {
                                                                if (class44.field775 != -1) {
                                                                    class245.method1671(-72, class188.field2774 - -class173.field2540, class260.field3986, class90.field1367 + class44.field775);
                                                                }
                                                                class42.field746 = 0;
                                                                class16.field290 = 0;
                                                            } else if (class16.field290 == 2) {
                                                                if (class44.field775 != -1) {
                                                                    class59.field964.method1540(135, (byte) -2);
                                                                    class59.field964.method431(true, class90.field1367 + class44.field775);
                                                                    class59.field964.method445((byte) -128, class54.field858);
                                                                    ++class115.field1751;
                                                                    class59.field964.method453((byte) 103, class111.field1688);
                                                                    class59.field964.method445((byte) -119, class188.field2774 + class173.field2540);
                                                                    class102.field1501 = 1;
                                                                    class14.field209 = class157.field2303;
                                                                    class54.field901 = class87.field1317;
                                                                    class55.field925 = 0;
                                                                }
                                                                class16.field290 = 0;
                                                            } else if (class42.field746 != 2) {
                                                                if (class44.field775 != -1 && ~class16.field290 == -1 && ~class42.field746 == -1) {
                                                                    class212.method1400((class173.field2540 << 1) + -class185.field2687.method168(-128) + 1 >> 1, (class44.field775 << 1) + 1 + -class185.field2687.method168(-128) >> 1, 0, arg0 + 6);
                                                                    class102.field1501 = 1;
                                                                    class14.field209 = class157.field2303;
                                                                    class54.field901 = class87.field1317;
                                                                    class55.field925 = 0;
                                                                }
                                                            } else {
                                                                if (class44.field775 != -1) {
                                                                    class59.field964.method1540(166, (byte) -2);
                                                                    class59.field964.method445((byte) -115, class188.field2774 + class173.field2540);
                                                                    class59.field964.method431(true, class90.field1367 - -class44.field775);
                                                                    class102.field1501 = 1;
                                                                    ++class239.field3687;
                                                                    class14.field209 = class157.field2303;
                                                                    class55.field925 = 0;
                                                                    class54.field901 = class87.field1317;
                                                                }
                                                                class42.field746 = 0;
                                                            }
                                                            class44.field775 = arg0;
                                                            class73.method581(117);
                                                            if (class148.field2144 != var49) {
                                                                if (var49 != null) {
                                                                    class297.method1979((byte) -123, var49);
                                                                }
                                                                if (class148.field2144 != null) {
                                                                    class297.method1979((byte) -107, class148.field2144);
                                                                }
                                                            }
                                                            if (class245.field3820 != var50 && ~class84.field1282 == ~class216.field3332) {
                                                                if (var50 != null) {
                                                                    class297.method1979((byte) -99, var50);
                                                                }
                                                                if (class245.field3820 != null) {
                                                                    class297.method1979((byte) -57, class245.field3820);
                                                                }
                                                            }
                                                            if (class245.field3820 != null) {
                                                                if (~class84.field1282 < ~class216.field3332) {
                                                                    ++class216.field3332;
                                                                    if (~class84.field1282 == ~class216.field3332) {
                                                                        class297.method1979((byte) -61, class245.field3820);
                                                                    }
                                                                }
                                                            } else if (~class216.field3332 < -1) {
                                                                --class216.field3332;
                                                            }
                                                            for (int var61 = 0; ~var61 > -6; ++var61) {
                                                                int var10002 = class160.field2323[var61]++;
                                                            }
                                                            int var62 = class207.method1369((byte) -99);
                                                            int var63 = class75.method601(true);
                                                            if (~var62 < -15001 && ~var63 < -15001) {
                                                                class206.field3091 = 250;
                                                                ++class152.field2227;
                                                                method1738(14500, -109);
                                                                class59.field964.method1540(60, (byte) -2);
                                                            }
                                                            if (class42.field743 != null && ~class42.field743.field713 == -2) {
                                                                if (class42.field743.field709 != null) {
                                                                    class262.method1777(true, class153.field2239, class165.field2419);
                                                                }
                                                                class42.field743 = null;
                                                                class153.field2239 = false;
                                                                class165.field2419 = null;
                                                            }
                                                            ++class39.field691;
                                                            ++class78.field1230;
                                                            if (~class78.field1230 < -501) {
                                                                class78.field1230 = 0;
                                                                int var64 = (int) (8.0D * Math.random());
                                                                if (~(1 & var64) == -2) {
                                                                    class109.field1605 += class164.field2405;
                                                                }
                                                                if (~(var64 & 4) == -5) {
                                                                    class208.field3116 += class69.field1138;
                                                                }
                                                                if (~(var64 & 2) == -3) {
                                                                    class69.field1139 += class176.field2581;
                                                                }
                                                            }
                                                            if (class208.field3116 < -40) {
                                                                class69.field1138 = 1;
                                                            }
                                                            if (~class208.field3116 < -41) {
                                                                class69.field1138 = -1;
                                                            }
                                                            if (class109.field1605 < -50) {
                                                                class164.field2405 = 2;
                                                            }
                                                            ++class250.field3879;
                                                            if (class69.field1139 < -55) {
                                                                class176.field2581 = 2;
                                                            }
                                                            if (class69.field1139 > 55) {
                                                                class176.field2581 = -2;
                                                            }
                                                            if (class109.field1605 > 50) {
                                                                class164.field2405 = -2;
                                                            }
                                                            if (class250.field3879 > 500) {
                                                                class250.field3879 = 0;
                                                                int var65 = (int) (8.0D * Math.random());
                                                                if (~(var65 & 1) == -2) {
                                                                    class96.field1420 += class208.field3113;
                                                                }
                                                                if ((var65 & 2) == 2) {
                                                                    field3958 += class145.field2095;
                                                                }
                                                            }
                                                            if (class96.field1420 < -60) {
                                                                class208.field3113 = 2;
                                                            }
                                                            if (~class96.field1420 < -61) {
                                                                class208.field3113 = -2;
                                                            }
                                                            if (~field3958 > 19) {
                                                                class145.field2095 = 1;
                                                            }
                                                            if (~field3958 < -11) {
                                                                class145.field2095 = -1;
                                                            }
                                                            if (~class39.field691 < -51) {
                                                                class59.field964.method1540(183, (byte) -2);
                                                                ++class121.field1803;
                                                            }
                                                            if (class182.field2649) {
                                                                class23.method159(112);
                                                                class182.field2649 = false;
                                                            }
                                                            try {
                                                                if (class22.field369 != null && ~class59.field964.field887 < -1) {
                                                                    class22.field369.method1715(class59.field964.field848, 110, 0, class59.field964.field887);
                                                                    class39.field691 = 0;
                                                                    class59.field964.field887 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var66) {
                                                                class210.method1383(7928);
                                                                return;
                                                            }
                                                        }
                                                        var58 = var57.field750;
                                                        if (var58.field4528 < 0) {
                                                            break;
                                                        }
                                                        var59 = class151.method1023(-30464, var58.field4542);
                                                    } while (var59 == null || var59.field4646 == null || ~var58.field4528 <= ~var59.field4646.length || var59.field4646[var58.field4528] != var58);
                                                    class137.method934(200000, var57);
                                                }
                                            }
                                            var55 = var54.field750;
                                            if (~var55.field4528 > -1) {
                                                break;
                                            }
                                            var56 = class151.method1023(-30464, var55.field4542);
                                        } while (var56 == null || var56.field4646 == null || var55.field4528 >= var56.field4646.length || var56.field4646[var55.field4528] != var55);
                                        class137.method934(200000, var54);
                                    }
                                }
                                var52 = var51.field750;
                                if (~var52.field4528 > -1) {
                                    break;
                                }
                                var53 = class151.method1023(-30464, var52.field4542);
                            } while (var53 == null || var53.field4646 == null || var53.field4646.length <= var52.field4528 || var53.field4646[var52.field4528] != var52);
                            class137.method934(arg0 ^ -200001, var51);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
    public static final String method1742(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field3953;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; arg0 > var6; ++var6) {
            int var7 = arg2[arg3 + var6] & 255;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class268.field4176[var7 + -128];
                    if (~var8 == -1) {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg1 <= 5) {
            field3964 = -9;
        }
        return new String(var4, 0, var5);
    }
}
