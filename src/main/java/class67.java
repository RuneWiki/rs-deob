import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class67 extends class108 {

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lgd;")
    public static class40 field1640 = class14.method90(false, "backvmid2");

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field1637 = 0;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Lgd;")
    public static class40 field1642 = class14.method90(false, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Lgd;")
    private static class40 field1646 = class14.method90(false, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lgd;")
    public static class40 field1636 = field1646;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Lgd;")
    public static class40 field1645 = class14.method90(false, "(U3");

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "Lgd;")
    private static class40 field1643 = class14.method90(false, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "Lgd;")
    public static class40 field1648 = field1643;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "Lgd;")
    private static class40 field1654 = class14.method90(false, "Service unavailable)3");

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "Lgd;")
    public static class40 field1653 = field1654;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lba;")
    public static class7 field1650 = new class7(50);

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "[J")
    public static long[] field1657 = new long[100];

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Lgd;")
    private static class40 field1655 = class14.method90(false, "World");

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "Lgd;")
    public static class40 field1656 = field1655;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Llb;")
    public class67 field1638;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "Llb;")
    public class67 field1649;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
    public static int[] field1639;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V", line = 21)
    public static final void method480(boolean arg0) {
        field1641++;
        if (class113.field2736 == 228) {
            int var1 = class100.field2376.method795(694);
            int var2 = class42.field1040 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class52.field1312;
            int var4 = class100.field2376.method798((byte) -119);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class136.field3329[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class103.method744((byte) -113, var5, -1, class99.field2361, 0, var7, var6, var2, var3, -1);
            }
        } else if (class113.field2736 == 37) {
            int var8 = class100.field2376.method795(694);
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = class136.field3329[var9];
            int var12 = class100.field2376.method798((byte) -81);
            int var13 = (var12 >> 4 & 0x7) + class42.field1040;
            int var14 = (var12 & 0x7) + class52.field1312;
            int var15 = class100.field2376.method797(-7916);
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                class103.method744((byte) 126, var9, var15, class99.field2361, 0, var11, var10, var13, var14, -1);
            }
        } else if (class113.field2736 == 62) {
            int var16 = class100.field2376.method798((byte) -54);
            int var17 = (var16 >> 4 & 0x7) + class42.field1040;
            int var18 = (var16 & 0x7) + class52.field1312;
            int var19 = class100.field2376.method797(-7916);
            int var20 = class100.field2376.method797(-7916);
            int var21 = class100.field2376.method797(-7916);
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class89 var22 = class59.field1494[class99.field2361][var17][var18];
                if (var22 != null) {
                    for (class41 var23 = (class41) var22.method593(0); var23 != null; var23 = (class41) var22.method582(false)) {
                        if ((var19 & 0x7FFF) == var23.field1005 && var23.field1012 == var20) {
                            var23.field1012 = var21;
                            break;
                        }
                    }
                    class125.method992(var18, -104, var17);
                }
            }
        } else {
            if (class113.field2736 == 151) {
                int var24 = class100.field2376.method810((byte) -72);
                int var25 = class100.field2376.method800((byte) -13);
                int var26 = var25 & 0x3;
                int var27 = var25 >> 2;
                int var28 = class136.field3329[var27];
                byte var29 = class100.field2376.method775(0);
                byte var30 = class100.field2376.method809(-128);
                int var31 = class100.field2376.method797(-7916);
                int var32 = class100.field2376.method800((byte) -13);
                int var33 = (var32 >> 4 & 0x7) + class42.field1040;
                int var34 = (var32 & 0x7) + class52.field1312;
                int var35 = class100.field2376.method797(-7916);
                int var36 = class100.field2376.method810((byte) -125);
                byte var37 = class100.field2376.method775(0);
                byte var38 = class100.field2376.method775(0);
                class96 var39;
                if (class101.field2414 == var24) {
                    var39 = class13.field332;
                } else {
                    var39 = class90.field2044[var24];
                }
                if (var39 != null) {
                    class14 var40 = class114.method884(var35, (byte) -56);
                    int var41 = class89.field2021[class99.field2361][var33 + 1][var34];
                    int var42 = class89.field2021[class99.field2361][var33 + 1][var34 + 1];
                    int var43 = class89.field2021[class99.field2361][var33][var34];
                    int var44 = class89.field2021[class99.field2361][var33][var34 + 1];
                    class97 var45 = var40.method85(var42, var27, var43, var41, var44, var26, -1);
                    if (var45 != null) {
                        class103.method744((byte) -43, 0, -1, class99.field2361, var31 + 1, var28, 0, var33, var34, var36 + 1);
                        var39.field2235 = var45;
                        var39.field2216 = class10.field242 + var36;
                        int var46 = var40.field363;
                        var39.field2220 = class10.field242 + var31;
                        int var47 = var40.field370;
                        if (var26 == 1 || var26 == 3) {
                            var47 = var40.field363;
                            var46 = var40.field370;
                        }
                        var39.field2219 = var33 * 128 + var46 * 64;
                        if (var29 < var30) {
                            byte var48 = var30;
                            var30 = var29;
                            var29 = var48;
                        }
                        if (var37 > var38) {
                            byte var49 = var37;
                            var37 = var38;
                            var38 = var49;
                        }
                        var39.field2222 = var34 * 128 + var47 * 64;
                        var39.field2212 = class58.method439(var39.field2222, var39.field2219, false, class99.field2361);
                        var39.field2215 = var34 + var37;
                        var39.field2237 = var29 + var33;
                        var39.field2208 = var30 + var33;
                        var39.field2234 = var34 + var38;
                    }
                }
            }
            if (class113.field2736 == 67) {
                int var50 = class100.field2376.method798((byte) -107);
                int var51 = class42.field1040 + (var50 >> 4 & 0x7);
                int var52 = (var50 & 0x7) + class52.field1312;
                int var53 = class100.field2376.method797(-7916);
                int var54 = class100.field2376.method798((byte) -49);
                int var55 = var54 & 0x7;
                int var56 = var54 >> 4 & 0xF;
                int var57 = class100.field2376.method798((byte) -64);
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    int var58 = var56 + 1;
                    if (class13.field332.field803[0] >= var51 - var58 && class13.field332.field803[0] <= var51 + var58 && var52 - var58 <= class13.field332.field819[0] && var52 + var58 >= class13.field332.field819[0] && class125.field2954 != 0 && var55 > 0 && class132.field3210 < 50) {
                        class87.field1954[class132.field3210] = var53;
                        class52.field1329[class132.field3210] = var55;
                        class10.field258[class132.field3210] = var57;
                        class65.field1576[class132.field3210] = null;
                        class131.field3177[class132.field3210] = (var52 << 8) + (var51 << 16) + var56;
                        class132.field3210++;
                    }
                }
            }
            if (class113.field2736 == 63) {
                int var59 = class100.field2376.method798((byte) -94);
                int var60 = (var59 & 0x7) + class52.field1312;
                int var61 = (var59 >> 4 & 0x7) + class42.field1040;
                int var62 = class100.field2376.method795(694);
                int var63 = var62 & 0x3;
                int var64 = var62 >> 2;
                int var65 = class136.field3329[var64];
                int var66 = class100.field2376.method797(-7916);
                if (var61 >= 0 && var60 >= 0 && var61 < 103 && var60 < 103) {
                    int var67 = class89.field2021[class99.field2361][var61][var60];
                    int var68 = class89.field2021[class99.field2361][var61 + 1][var60];
                    int var69 = class89.field2021[class99.field2361][var61][var60 + 1];
                    int var70 = class89.field2021[class99.field2361][var61 + 1][var60 + 1];
                    if (var65 == 0) {
                        class2 var71 = class21.field490.method943(class99.field2361, var61, var60);
                        if (var71 != null) {
                            int var72 = var71.field48 >> 14 & 0x7FFF;
                            if (var64 == 2) {
                                var71.field34 = new class38(var72, 2, var63 + 4, var67, var68, var70, var69, var66, false, var71.field34);
                                var71.field44 = new class38(var72, 2, var63 + 1 & 0x3, var67, var68, var70, var69, var66, false, var71.field44);
                            } else {
                                var71.field34 = new class38(var72, var64, var63, var67, var68, var70, var69, var66, false, var71.field34);
                            }
                        }
                    }
                    if (var65 == 1) {
                        class44 var73 = class21.field490.method988(class99.field2361, var61, var60);
                        if (var73 != null) {
                            var73.field1121 = new class38(var73.field1100 >> 14 & 0x7FFF, 4, 0, var67, var68, var70, var69, var66, false, var73.field1121);
                        }
                    }
                    if (var65 == 2) {
                        if (var64 == 11) {
                            var64 = 10;
                        }
                        class120 var74 = class21.field490.method967(class99.field2361, var61, var60);
                        if (var74 != null) {
                            var74.field2831 = new class38(var74.field2825 >> 14 & 0x7FFF, var64, var63, var67, var68, var70, var69, var66, false, var74.field2831);
                        }
                    }
                    if (var65 == 3) {
                        class61 var75 = class21.field490.method985(class99.field2361, var61, var60);
                        if (var75 != null) {
                            var75.field1520 = new class38(var75.field1523 >> 14 & 0x7FFF, 22, var63, var67, var68, var70, var69, var66, false, var75.field1520);
                        }
                    }
                }
            } else if (class113.field2736 == 232) {
                int var76 = class100.field2376.method760((byte) 103);
                int var77 = class100.field2376.method800((byte) -13);
                int var78 = class42.field1040 + (var77 >> 4 & 0x7);
                int var79 = (var77 & 0x7) + class52.field1312;
                int var80 = class100.field2376.method760((byte) 125);
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class41 var81 = new class41();
                    var81.field1012 = var80;
                    var81.field1005 = var76;
                    if (class59.field1494[class99.field2361][var78][var79] == null) {
                        class59.field1494[class99.field2361][var78][var79] = new class89();
                    }
                    class59.field1494[class99.field2361][var78][var79].method589(var81, 95);
                    class125.method992(var79, -104, var78);
                }
            } else if (class113.field2736 == 213) {
                int var82 = class100.field2376.method798((byte) -67);
                int var83 = class42.field1040 + (var82 >> 4 & 0x7);
                int var84 = (var82 & 0x7) + class52.field1312;
                int var85 = class100.field2376.method797(-7916);
                int var86 = class100.field2376.method798((byte) -125);
                int var87 = class100.field2376.method797(-7916);
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var88 = var83 * 128 + 64;
                    int var89 = var84 * 128 + 64;
                    class66 var90 = new class66(var85, class99.field2361, var88, var89, class58.method439(var89, var88, false, class99.field2361) - var86, var87, class10.field242);
                    class88.field1991.method589(var90, 70);
                }
            } else if (class113.field2736 == 244) {
                int var91 = class100.field2376.method795(694);
                int var92 = (var91 & 0x7) + class52.field1312;
                int var93 = (var91 >> 4 & 0x7) + class42.field1040;
                int var94 = class100.field2376.method757((byte) 103);
                if (var93 >= 0 && var92 >= 0 && var93 < 104 && var92 < 104) {
                    class89 var95 = class59.field1494[class99.field2361][var93][var92];
                    if (var95 != null) {
                        for (class41 var96 = (class41) var95.method593(0); var96 != null; var96 = (class41) var95.method582(false)) {
                            if ((var94 & 0x7FFF) == var96.field1005) {
                                var96.method833(4);
                                break;
                            }
                        }
                        if (var95.method593(0) == null) {
                            class59.field1494[class99.field2361][var93][var92] = null;
                        }
                        class125.method992(var92, -104, var93);
                    }
                }
            } else {
                if (arg0) {
                    method481(-122);
                }
                if (class113.field2736 == 77) {
                    int var97 = class100.field2376.method798((byte) -105);
                    int var98 = class42.field1040 + (var97 >> 4 & 0x7);
                    int var99 = (var97 & 0x7) + class52.field1312;
                    int var100 = class100.field2376.method781(255) + var98;
                    int var101 = class100.field2376.method781(255) + var99;
                    int var102 = class100.field2376.method773((byte) 66);
                    int var103 = class100.field2376.method797(-7916);
                    int var104 = class100.field2376.method798((byte) -93) * 4;
                    int var105 = class100.field2376.method798((byte) -70) * 4;
                    int var106 = class100.field2376.method797(-7916);
                    int var107 = class100.field2376.method797(-7916);
                    int var108 = class100.field2376.method798((byte) -82);
                    int var109 = class100.field2376.method798((byte) -108);
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                        int var110 = var98 * 128 + 64;
                        int var111 = var101 * 128 + 64;
                        int var112 = var100 * 128 + 64;
                        int var113 = var99 * 128 + 64;
                        class55 var114 = new class55(var103, class99.field2361, var110, var113, class58.method439(var113, var110, arg0, class99.field2361) - var104, class10.field242 + var106, class10.field242 + var107, var108, var109, var102, var105);
                        var114.method416(var111, var112, class10.field242 + var106, (byte) 99, class58.method439(var111, var112, false, class99.field2361) - var105);
                        class23.field540.method589(var114, -116);
                    }
                } else if (class113.field2736 == 159) {
                    int var115 = class100.field2376.method760((byte) 94);
                    int var116 = class100.field2376.method757((byte) 124);
                    int var117 = class100.field2376.method760((byte) 83);
                    int var118 = class100.field2376.method758(15);
                    int var119 = (var118 >> 4 & 0x7) + class42.field1040;
                    int var120 = (var118 & 0x7) + class52.field1312;
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104 && class101.field2414 != var116) {
                        class41 var121 = new class41();
                        var121.field1012 = var117;
                        var121.field1005 = var115;
                        if (class59.field1494[class99.field2361][var119][var120] == null) {
                            class59.field1494[class99.field2361][var119][var120] = new class89();
                        }
                        class59.field1494[class99.field2361][var119][var120].method589(var121, -109);
                        class125.method992(var120, -104, var119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 565)
    public static final void method481(int arg0) {
        field1644++;
        for (class101 var1 = (class101) class136.field3314.method593(0); var1 != null; var1 = (class101) class136.field3314.method582(false)) {
            if (var1.field2391 != null) {
                class14.field362.method174(var1.field2391);
                var1.field2391 = null;
            }
            if (var1.field2388 != null) {
                class14.field362.method174(var1.field2388);
                var1.field2388 = null;
            }
        }
        if (arg0 != 7) {
            method480(true);
        }
        class136.field3314.method585((byte) 110);
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 611)
    public final void method482(int arg0) {
        field1651++;
        if (this.field1649 == null) {
            return;
        }
        int var2 = -2 % ((78 - arg0) / 43);
        this.field1649.field1638 = this.field1638;
        this.field1638.field1649 = this.field1649;
        this.field1649 = null;
        this.field1638 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 649)
    public static void method483(byte arg0) {
        field1656 = null;
        field1639 = null;
        field1650 = null;
        field1640 = null;
        field1648 = null;
        field1636 = null;
        field1654 = null;
        field1645 = null;
        field1646 = null;
        field1642 = null;
        field1657 = null;
        field1655 = null;
        int var1 = 99 / ((arg0 - 7) / 57);
        field1643 = null;
        field1653 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZI)I", line = 677)
    public static final int method484(int arg0, int arg1, boolean arg2, int arg3) {
        field1652++;
        int var4 = arg3 & 0x3;
        if (!arg2) {
            field1647 = 18;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }
}
