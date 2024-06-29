import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class29 extends class108 {

    @OriginalMember(owner = "client!ea", name = "nb", descriptor = "Z")
    private boolean field717 = false;

    @OriginalMember(owner = "client!ea", name = "ub", descriptor = "I")
    private int field724 = -1;

    @OriginalMember(owner = "client!ea", name = "sb", descriptor = "Z")
    private volatile boolean field722 = false;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "Lu;")
    private class141 field708;

    @OriginalMember(owner = "client!ea", name = "rb", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "client!ea", name = "Ab", descriptor = "Lu;")
    private class141 field730;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    public static volatile int field706 = 0;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lja;")
    public static class62 field705 = class30.method243(43, "<col=00ff80>");

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lja;")
    public static class62 field709 = class30.method243(43, "<col=00ff00>");

    @OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
    public static int field713 = 0;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "[Lea;")
    public static class29[] field707 = new class29[256];

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "Lja;")
    public static class62 field712 = class30.method243(43, " <col=ffffff>");

    @OriginalMember(owner = "client!ea", name = "Eb", descriptor = "Lja;")
    private static class62 field734 = class30.method243(43, "Too many connections from your address)3");

    @OriginalMember(owner = "client!ea", name = "Cb", descriptor = "Lja;")
    public static class62 field732 = field734;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ea", name = "kb", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ea", name = "lb", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ea", name = "pb", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ea", name = "tb", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!ea", name = "vb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!ea", name = "wb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ea", name = "yb", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!ea", name = "zb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!ea", name = "Bb", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!ea", name = "Db", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!ea", name = "Fb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ea", name = "xb", descriptor = "Lrf;")
    public static class124 field727;

    @OriginalMember(owner = "client!ea", name = "ob", descriptor = "[Z")
    private volatile boolean[] field718;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLu;[BII)V")
    public final void method229(boolean arg0, class141 arg1, byte[] arg2, int arg3, int arg4) {
        ++field735;
        if (this.field730 != arg1) {
            if (!arg0 && this.field724 == arg4) {
                this.field722 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field718[arg4] = false;
                if (this.field717 || arg0) {
                    class85.method661(super.field2459[arg4], this.field721, arg4, this, arg0, (byte) 2, arg3 ^ -24367);
                }
                return;
            }
            class82.field1974.reset();
            class82.field1974.update(arg2, 0, arg2.length - 2);
            int var6 = (int) class82.field1974.getValue();
            int var7 = ((arg2[arg2.length + -2] & 255) << 8) - -(255 & arg2[arg2.length - 1]);
            if (super.field2459[arg4] != var6 || super.field2495[arg4] != var7) {
                this.field718[arg4] = false;
                if (this.field717 || arg0) {
                    class85.method661(super.field2459[arg4], this.field721, arg4, this, arg0, (byte) 2, -15);
                }
                return;
            }
            this.field718[arg4] = true;
            if (arg0) {
                super.field2480[arg4] = class86.method671(arg2, -13771, false);
            }
        } else {
            if (this.field722) {
                throw new RuntimeException();
            }
            if (arg2 == null) {
                class85.method661(this.field731, 255, this.field721, this, true, (byte) 0, -15);
                return;
            }
            class82.field1974.reset();
            class82.field1974.update(arg2, 0, arg2.length);
            int var8 = (int) class82.field1974.getValue();
            if (this.field731 != var8 || this.field704 != super.field2478) {
                class85.method661(this.field731, 255, this.field721, this, true, (byte) 0, -15);
                return;
            }
            this.method880(arg2, true);
            this.method235(127);
        }
        if (arg3 != 24352) {
            method236(-74);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static final void method230(byte arg0) {
        ++field723;
        if (class122.field2800 == 48) {
            int var1 = class38.field879.method989(true);
            int var2 = (7 & var1) + class15.field354;
            int var3 = ((var1 & 123) >> 4) + class60.field1475;
            int var4 = class38.field879.method989(true);
            int var5 = var4 >> 2;
            int var6 = class71.field1804[var5];
            int var7 = class38.field879.method1022((byte) 100);
            int var8 = var4 & 3;
            if (~var3 <= -1 && ~var2 <= -1 && var3 < 104 && ~var2 > -105) {
                class115.method936(var3, var7, var2, var8, var5, -1, var6, 0, class155.field3598, (byte) -29);
            }
        } else if (~class122.field2800 == -93) {
            int var9 = class38.field879.method1025(255);
            int var10 = class60.field1475 - -((var9 & 115) >> 4);
            int var11 = class15.field354 - -(7 & var9);
            int var12 = var10 + class38.field879.method1028(-115487256);
            int var13 = var11 + class38.field879.method1028(-115487256);
            int var14 = class38.field879.method1027((byte) 90);
            int var15 = class38.field879.method1041(212464720);
            int var16 = 4 * class38.field879.method1025(255);
            int var17 = class38.field879.method1025(255) * 4;
            int var18 = class38.field879.method1041(212464720);
            int var19 = class38.field879.method1041(212464720);
            int var20 = class38.field879.method1025(255);
            int var21 = class38.field879.method1025(255);
            if (var10 >= 0 && ~var11 <= -1 && var10 < 104 && var11 < 104 && var12 >= 0 && ~var13 <= -1 && ~var12 > -105 && var13 < 104 && var15 != 65535) {
                int var22 = var11 * 128 - -64;
                int var23 = var13 * 128 + 64;
                int var24 = var10 * 128 + 64;
                int var25 = var12 * 128 + 64;
                class48 var26 = new class48(var15, class155.field3598, var24, var22, class111.method908(128, var24, var22, class155.field3598) - var16, class86.field2060 + var18, class86.field2060 + var19, var20, var21, var14, var17);
                var26.method340(class86.field2060 + var18, var25, -5203, class111.method908(128, var25, var23, class155.field3598) + -var17, var23);
                class136.field3132.method847(var26, (byte) 114);
            }
        } else if (class122.field2800 == 132) {
            int var27 = class38.field879.method1041(212464720);
            int var28 = class38.field879.method1023((byte) -81);
            int var29 = (var28 >> 4 & 7) + class60.field1475;
            int var30 = (7 & var28) + class15.field354;
            if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                class105 var31 = class32.field765[class155.field3598][var29][var30];
                if (var31 != null) {
                    for (class146 var32 = (class146) var31.method840(true); var32 != null; var32 = (class146) var31.method841((byte) 18)) {
                        if (~(32767 & var27) == ~var32.field3441) {
                            var32.method1176((byte) 117);
                            break;
                        }
                    }
                    if (var31.method840(true) == null) {
                        class32.field765[class155.field3598][var29][var30] = null;
                    }
                    class93.method714(var29, 1336339591, var30);
                }
            }
        } else if (~class122.field2800 == -253) {
            int var33 = class38.field879.method1025(255);
            int var34 = var33 >> 2;
            int var35 = var33 & 3;
            int var36 = class71.field1804[var34];
            int var37 = class38.field879.method995(-59);
            int var38 = (7 & var37) + class15.field354;
            int var39 = ((122 & var37) >> 4) + class60.field1475;
            int var40 = class38.field879.method1004(-101981656);
            if (var39 >= 0 && var38 >= 0 && var39 < 103 && var38 < 103) {
                int var41 = class7.field214[class155.field3598][var39][var38 + 1];
                int var42 = class7.field214[class155.field3598][var39 + 1][var38];
                int var43 = class7.field214[class155.field3598][var39][var38];
                int var44 = class7.field214[class155.field3598][var39 - -1][var38 + 1];
                if (~var36 == -1) {
                    class149 var45 = class119.field2703.method562(class155.field3598, var39, var38);
                    if (var45 != null) {
                        int var46 = var45.field3513 >> 14 & 32767;
                        if (var34 != 2) {
                            var45.field3505 = new class43(var46, var34, var35, var43, var42, var44, var41, var40, false, var45.field3505);
                        } else {
                            var45.field3505 = new class43(var46, 2, var35 + 4, var43, var42, var44, var41, var40, false, var45.field3505);
                            var45.field3510 = new class43(var46, 2, var35 + 1 & 3, var43, var42, var44, var41, var40, false, var45.field3510);
                        }
                    }
                }
                if (var36 == 1) {
                    class34 var47 = class119.field2703.method575(class155.field3598, var39, var38);
                    if (var47 != null) {
                        var47.field825 = new class43((var47.field813 & 536862047) >> 14, 4, 0, var43, var42, var44, var41, var40, false, var47.field825);
                    }
                }
                if (var36 == 2) {
                    if (~var34 == -12) {
                        var34 = 10;
                    }
                    class32 var48 = class119.field2703.method556(class155.field3598, var39, var38);
                    if (var48 != null) {
                        var48.field774 = new class43(var48.field783 >> 14 & 32767, var34, var35, var43, var42, var44, var41, var40, false, var48.field774);
                    }
                }
                if (~var36 == -4) {
                    class3 var49 = class119.field2703.method571(class155.field3598, var39, var38);
                    if (var49 != null) {
                        var49.field30 = new class43(var49.field21 >> 14 & 32767, 22, var35, var43, var42, var44, var41, var40, false, var49.field30);
                    }
                }
            }
        } else if (~class122.field2800 == -114) {
            int var50 = class38.field879.method1025(255);
            int var51 = (7 & var50 >> 4) + class60.field1475;
            int var52 = (var50 & 7) + class15.field354;
            int var53 = class38.field879.method1041(212464720);
            int var54 = class38.field879.method1041(212464720);
            int var55 = class38.field879.method1041(212464720);
            if (var51 >= 0 && ~var52 <= -1 && var51 < 104 && var52 < 104) {
                class105 var56 = class32.field765[class155.field3598][var51][var52];
                if (var56 != null) {
                    for (class146 var57 = (class146) var56.method840(true); var57 != null; var57 = (class146) var56.method841((byte) 18)) {
                        if (~(var53 & 32767) == ~var57.field3441 && ~var57.field3446 == ~var54) {
                            var57.field3446 = var55;
                            break;
                        }
                    }
                    class93.method714(var51, 1336339591, var52);
                }
            }
        } else {
            if (class122.field2800 == 22) {
                int var58 = class38.field879.method1025(255);
                int var59 = (7 & var58 >> 4) + class60.field1475;
                int var60 = (7 & var58) + class15.field354;
                int var61 = class38.field879.method1041(212464720);
                int var62 = class38.field879.method1025(255);
                int var63 = (240 & var62) >> 4;
                int var64 = class38.field879.method1025(255);
                int var65 = 7 & var62;
                if (~var59 <= -1 && var60 >= 0 && var59 < 104 && ~var60 > -105) {
                    int var66 = var63 + 1;
                    if (~class40.field936.field193[0] <= ~(-var66 + var59) && class40.field936.field193[0] <= var59 + var66 && class40.field936.field144[0] >= -var66 + var60 && class40.field936.field144[0] <= var60 + var66 && class83.field1993 != 0 && var65 > 0 && ~class146.field3436 > -51) {
                        class35.field834[class146.field3436] = var61;
                        class97.field2256[class146.field3436] = var65;
                        class80.field1947[class146.field3436] = var64;
                        class15.field367[class146.field3436] = null;
                        class34.field816[class146.field3436] = (var60 << 8) + ((var59 << 16) - -var63);
                        ++class146.field3436;
                    }
                }
            }
            if (arg0 <= 63) {
                method232(true);
            }
            if (class122.field2800 == 144) {
                int var67 = class38.field879.method1023((byte) -128);
                int var68 = ((114 & var67) >> 4) + class60.field1475;
                int var69 = (var67 & 7) + class15.field354;
                int var70 = class38.field879.method1022((byte) 102);
                int var71 = class38.field879.method1018((byte) 80);
                if (var68 >= 0 && ~var69 <= -1 && ~var68 > -105 && ~var69 > -105) {
                    class146 var72 = new class146();
                    var72.field3441 = var71;
                    var72.field3446 = var70;
                    if (class32.field765[class155.field3598][var68][var69] == null) {
                        class32.field765[class155.field3598][var68][var69] = new class105();
                    }
                    class32.field765[class155.field3598][var68][var69].method847(var72, (byte) 110);
                    class93.method714(var68, 1336339591, var69);
                }
            } else {
                if (~class122.field2800 == -9) {
                    byte var73 = class38.field879.method1028(-115487256);
                    byte var74 = class38.field879.method1028(-115487256);
                    int var75 = class38.field879.method1022((byte) 113);
                    int var76 = class38.field879.method1018((byte) 80);
                    int var77 = class38.field879.method995(-97);
                    int var78 = var77 >> 2;
                    int var79 = var77 & 3;
                    int var80 = class71.field1804[var78];
                    byte var81 = class38.field879.method1036(21);
                    byte var82 = class38.field879.method1000(-612);
                    int var83 = class38.field879.method1022((byte) 100);
                    int var84 = class38.field879.method1025(255);
                    int var85 = class15.field354 - -(7 & var84);
                    int var86 = ((126 & var84) >> 4) + class60.field1475;
                    int var87 = class38.field879.method1018((byte) 80);
                    class115 var88;
                    if (~class34.field812 != ~var83) {
                        var88 = class52.field1200[var83];
                    } else {
                        var88 = class40.field936;
                    }
                    if (var88 != null) {
                        class65 var89 = class84.method653(6, var75);
                        int var90 = class7.field214[class155.field3598][var86 + 1][var85];
                        int var91 = class7.field214[class155.field3598][var86][var85];
                        int var92 = class7.field214[class155.field3598][var86 + 1][var85 + 1];
                        int var93 = class7.field214[class155.field3598][var86][var85 - -1];
                        class145 var94 = var89.method506(var78, var90, var93, var92, 0, var79, var91);
                        if (var94 != null) {
                            if (~var73 < ~var81) {
                                byte var95 = var73;
                                var73 = var81;
                                var81 = var95;
                            }
                            if (~var82 < ~var74) {
                                byte var96 = var82;
                                var82 = var74;
                                var74 = var96;
                            }
                            class115.method936(var86, -1, var85, 0, 0, var87 - -1, var80, var76 - -1, class155.field3598, (byte) -29);
                            int var97 = var89.field1612;
                            var88.field2657 = var76 - -class86.field2060;
                            var88.field2635 = class86.field2060 + var87;
                            var88.field2658 = var94;
                            int var98 = var89.field1615;
                            if (~var79 == -2 || ~var79 == -4) {
                                var98 = var89.field1612;
                                var97 = var89.field1615;
                            }
                            var88.field2645 = var85 * 128 - -(var98 * 64);
                            var88.field2646 = var86 * 128 + var97 * 64;
                            var88.field2647 = class111.method908(128, var88.field2646, var88.field2645, class155.field3598);
                            var88.field2661 = var82 + var85;
                            var88.field2627 = var74 + var85;
                            var88.field2636 = var73 + var86;
                            var88.field2664 = var81 + var86;
                        }
                    }
                }
                if (class122.field2800 == 27) {
                    int var99 = class38.field879.method995(-117);
                    int var100 = class15.field354 - -(7 & var99);
                    int var101 = ((var99 & 115) >> 4) + class60.field1475;
                    int var102 = class38.field879.method995(-105);
                    int var103 = var102 >> 2;
                    int var104 = 3 & var102;
                    int var105 = class71.field1804[var103];
                    if (~var101 <= -1 && ~var100 <= -1 && ~var101 > -105 && var100 < 104) {
                        class115.method936(var101, -1, var100, var104, var103, -1, var105, 0, class155.field3598, (byte) -29);
                    }
                } else if (class122.field2800 == 148) {
                    int var106 = class38.field879.method989(true);
                    int var107 = (var106 >> 4 & 7) + class60.field1475;
                    int var108 = (7 & var106) + class15.field354;
                    int var109 = class38.field879.method1022((byte) 110);
                    int var110 = class38.field879.method1004(-101981656);
                    int var111 = class38.field879.method1041(212464720);
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && ~class34.field812 != ~var110) {
                        class146 var112 = new class146();
                        var112.field3441 = var109;
                        var112.field3446 = var111;
                        if (class32.field765[class155.field3598][var107][var108] == null) {
                            class32.field765[class155.field3598][var107][var108] = new class105();
                        }
                        class32.field765[class155.field3598][var107][var108].method847(var112, (byte) 114);
                        class93.method714(var107, 1336339591, var108);
                    }
                } else if (~class122.field2800 == -10) {
                    int var113 = class38.field879.method1025(255);
                    int var114 = (7 & var113 >> 4) + class60.field1475;
                    int var115 = (var113 & 7) + class15.field354;
                    int var116 = class38.field879.method1041(212464720);
                    int var117 = class38.field879.method1025(255);
                    int var118 = class38.field879.method1041(212464720);
                    if (~var114 <= -1 && ~var115 <= -1 && var114 < 104 && ~var115 > -105) {
                        int var119 = var114 * 128 + 64;
                        int var120 = var115 * 128 + 64;
                        class143 var121 = new class143(var116, class155.field3598, var119, var120, class111.method908(128, var119, var120, class155.field3598) + -var117, var118, class86.field2060);
                        class98.field2274.method847(var121, (byte) 110);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
    public final void method231(int arg0, byte arg1) {
        if (this.field708 != null && this.field718 != null && this.field718[arg0]) {
            method242(arg0, this, -16678, this.field708);
        } else {
            class85.method661(super.field2459[arg0], this.field721, arg0, this, true, (byte) 2, -15);
        }
        ++field710;
        if (arg1 != 2) {
            field734 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
    public static final void method232(boolean arg0) {
        if (!arg0) {
            field707 = null;
        }
        ++field714;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~(class128.field2889 + -1) < ~var2; ++var2) {
                if (class146.field3437[var2] < 1000 && ~class146.field3437[var2 + 1] < -1001) {
                    class62 var3 = class60.field1479[var2];
                    var1 = false;
                    class60.field1479[var2] = class60.field1479[var2 + 1];
                    class60.field1479[var2 + 1] = var3;
                    class62 var4 = class53.field1226[var2];
                    class53.field1226[var2] = class53.field1226[var2 + 1];
                    class53.field1226[var2 - -1] = var4;
                    int var5 = class146.field3437[var2];
                    class146.field3437[var2] = class146.field3437[var2 + 1];
                    class146.field3437[var2 - -1] = var5;
                    int var6 = class12.field288[var2];
                    class12.field288[var2] = class12.field288[var2 - -1];
                    class12.field288[var2 + 1] = var6;
                    int var7 = class59.field1440[var2];
                    class59.field1440[var2] = class59.field1440[var2 + 1];
                    class59.field1440[var2 + 1] = var7;
                    int var8 = class124.field2836[var2];
                    class124.field2836[var2] = class124.field2836[var2 + 1];
                    class124.field2836[var2 - -1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)I")
    public final int method233(int arg0) {
        ++field716;
        if (arg0 >= -32) {
            this.method239(24);
        }
        if (this.field722) {
            return 100;
        } else if (super.field2480 != null) {
            return 99;
        } else {
            int var2 = class67.method527((byte) 127, this.field721, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
    public final void method234(int arg0, int arg1) {
        if (arg1 <= 66) {
            field713 = -32;
        }
        class34.method263(arg0, true, this.field721);
        ++field733;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    private final void method235(int arg0) {
        ++field720;
        this.field718 = new boolean[super.field2480.length];
        for (int var2 = 0; ~var2 > ~this.field718.length; ++var2) {
            this.field718[var2] = false;
        }
        if (this.field708 == null) {
            this.field722 = true;
        } else {
            this.field724 = -1;
            for (int var3 = 0; this.field718.length > var3; ++var3) {
                if (~super.field2486[var3] < -1) {
                    class34.method267(this, var3, this.field708, -84);
                    this.field724 = var3;
                }
            }
            if (arg0 < 111) {
                field707 = null;
            }
            if (this.field724 == -1) {
                this.field722 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public static void method236(int arg0) {
        field707 = null;
        field712 = null;
        field732 = null;
        field705 = null;
        field727 = null;
        if (arg0 == 1) {
            field709 = null;
            field734 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BZ[BZI)V")
    public final void method237(byte arg0, boolean arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field728;
        if (!arg1) {
            arg2[arg2.length + -2] = (byte) (super.field2495[arg4] >> 8);
            arg2[arg2.length + -1] = (byte) super.field2495[arg4];
            if (this.field708 != null) {
                class31.method248(arg2, this.field708, -84, arg4);
                this.field718[arg4] = true;
            }
            if (arg3) {
                super.field2480[arg4] = class86.method671(arg2, class36.method277(arg0, 13701), false);
            }
        } else {
            if (this.field722) {
                throw new RuntimeException();
            }
            if (this.field730 != null) {
                class31.method248(arg2, this.field730, -80, this.field721);
            }
            this.method880(arg2, true);
            this.method235(115);
        }
        if (arg0 != -80) {
            this.method229(false, (class141) null, (byte[]) null, 4, -2);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)I")
    private final int method238(int arg0, byte arg1) {
        if (arg1 < 17) {
            return 124;
        } else {
            ++field729;
            if (super.field2480[arg0] != null) {
                return 100;
            } else {
                return this.field718[arg0] ? 100 : class67.method527((byte) 127, arg0, this.field721);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)I")
    public final int method239(int arg0) {
        ++field711;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~super.field2480.length < ~var4; ++var4) {
            if (super.field2486[var4] > 0) {
                var3 += this.method238(var4, (byte) 70);
                var2 += 100;
            }
        }
        if (arg0 != -28030) {
            this.field731 = 64;
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZII)V")
    public final void method240(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method231(-82, (byte) -80);
        }
        this.field731 = arg1;
        ++field715;
        this.field704 = arg2;
        if (this.field730 != null) {
            method242(this.field721, this, -16678, this.field730);
        } else {
            class85.method661(this.field731, 255, this.field721, this, true, (byte) 0, -15);
        }
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(II)Z")
    public static final boolean method241(int arg0, int arg1) {
        ++field719;
        if (class27.field670[arg0]) {
            return true;
        } else if (!class128.field2898.method865(arg0, 79)) {
            return false;
        } else {
            int var2 = class128.field2898.method864(0, arg0);
            if (var2 == 0) {
                class27.field670[arg0] = true;
                return true;
            } else {
                if (class131.field2990[arg0] == null) {
                    class131.field2990[arg0] = new class54[var2];
                }
                if (arg1 != -1) {
                    return true;
                } else {
                    for (int var3 = 0; ~var3 > ~var2; ++var3) {
                        if (class131.field2990[arg0][var3] == null) {
                            byte[] var4 = class128.field2898.method867(arg0, 15, var3);
                            if (var4 != null) {
                                class131.field2990[arg0][var3] = new class54();
                                class131.field2990[arg0][var3].field1291 = (arg0 << 16) + var3;
                                if (var4[0] == -1) {
                                    class131.field2990[arg0][var3].method369(new class128(var4), (byte) -69);
                                } else {
                                    class131.field2990[arg0][var3].method375(false, new class128(var4));
                                }
                            }
                        }
                    }
                    class27.field670[arg0] = true;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lu;Lu;IZZZ)V")
    public class29(class141 arg0, class141 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field708 = arg0;
        this.field717 = arg5;
        this.field721 = arg2;
        this.field730 = arg1;
        class38.method292(this, this.field721, (byte) -38);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILea;ILu;)V")
    private static final void method242(int arg0, class29 arg1, int arg2, class141 arg3) {
        ++field726;
        byte[] var4 = null;
        class105 var5 = class36.field863;
        synchronized (class36.field863) {
            for (class144 var6 = (class144) class36.field863.method840(true); var6 != null; var6 = (class144) class36.field863.method841((byte) 18)) {
                if ((long) arg0 == var6.field3493 && var6.field3369 == arg3 && var6.field3357 == 0) {
                    var4 = var6.field3367;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg1.method229(true, arg3, var4, 24352, arg0);
        } else {
            byte[] var7 = arg3.method1122(arg0, 7115);
            if (arg2 != -16678) {
                field713 = -108;
            }
            arg1.method229(true, arg3, var7, 24352, arg0);
        }
    }
}
