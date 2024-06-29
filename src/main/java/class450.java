import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class450 extends class337 {

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "I")
    private int field6571 = 0;

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "I")
    private int field6576 = 4096;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "Z")
    public static boolean field6572 = false;

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "[I")
    public static int[] field6577 = new int[2048];

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field6578 = 2;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "Lob;")
    public static class521 field6581 = new class521(49, -1);

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "(I)V")
    public static void method2746(int arg0) {
        if (arg0 != 64) {
            field6572 = false;
        }
        field6577 = null;
        field6581 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ltr;I)V")
    public static final void method2747(class195 arg0, int arg1) {
        ++field6575;
        if (arg1 == 2) {
            if (class379.field5715 == arg0) {
                int var2 = class238.field3819.method1560(-128);
                int var3 = (7 & var2 >> 4) + class73.field1033;
                int var4 = (7 & var2) + class375.field5628;
                int var5 = class238.field3819.method1512((byte) 104);
                int var6 = class238.field3819.method1547(true);
                int var7 = class238.field3819.method1547(true);
                if (var3 >= 0 && ~var4 <= -1 && ~var3 > ~class69.field976 && ~class285.field4328 < ~var4 && class261.field4008 != var6) {
                    class294.method1912(class531.field7751, new class495(var7, var5), var4, arg1 ^ 103, var3);
                    class68.method580((byte) -98, var4, class531.field7751, var3);
                }
            } else if (class475.field6848 == arg0) {
                int var8 = class238.field3819.method1515((byte) 121);
                int var9 = ((var8 & 125) >> 4) + class73.field1033;
                int var10 = (var8 & 7) + class375.field5628;
                int var11 = class238.field3819.method1532((byte) -126);
                int var12 = var11 >> 2;
                int var13 = var11 & 3;
                int var14 = class514.field7472[var12];
                if (class425.method2655((byte) 80, class265.field4073) || var9 >= 0 && var10 >= 0 && class69.field976 > var9 && class285.field4328 > var10) {
                    class326.method2078(0, -1, var10, var9, var13, class531.field7751, (byte) 107, -1, var14, var12);
                }
            } else if (class421.field6273 == arg0) {
                int var15 = class238.field3819.method1515((byte) 121);
                int var16 = (var15 >> 4 & 7) + class73.field1033;
                int var17 = (7 & var15) + class375.field5628;
                int var18 = class238.field3819.method1511(-84);
                int var19 = class238.field3819.method1515((byte) 124);
                int var20 = class238.field3819.method1511(88);
                int var21 = class238.field3819.method1515((byte) 127);
                if (var16 >= 0 && ~var17 <= -1 && ~class69.field976 < ~var16 && ~var17 > ~class285.field4328) {
                    int var22 = var16 * 128 - -64;
                    int var23 = var17 * 128 + 64;
                    int var24 = class531.field7751;
                    if (var24 < 3 && class385.method2406(-17064, var16, var17)) {
                        ++var24;
                    }
                    class5 var25 = new class5(var18, var20, class475.field6854, class531.field7751, var24, var22, class172.method1153(class531.field7751, -4, var22, var23) - var19, var23, var16, var16, var17, var17, var21);
                    class100.field1431.method994(new class453(var25), -3610);
                }
            } else if (class74.field1064 == arg0) {
                int var26 = class238.field3819.method1515((byte) 123);
                int var27 = class73.field1033 * 2 - -((var26 & 244) >> 4);
                int var28 = (var26 & 15) + class375.field5628 * 2;
                boolean var29 = class238.field3819.method1515((byte) 123) != 0;
                int var30 = var27 + class238.field3819.method1565(true);
                int var31 = var28 - -class238.field3819.method1565(true);
                int var32 = class238.field3819.method1529((byte) -90);
                int var33 = class238.field3819.method1511(arg1 ^ -63);
                int var34 = class238.field3819.method1515((byte) 121) * 4;
                int var35 = 4 * class238.field3819.method1515((byte) 127);
                int var36 = class238.field3819.method1511(88);
                int var37 = class238.field3819.method1511(118);
                int var38 = class238.field3819.method1515((byte) 122);
                int var39 = class238.field3819.method1515((byte) 124);
                if (~var38 == -256) {
                    var38 = -1;
                }
                if (~var27 <= -1 && ~var28 <= -1 && ~var27 > ~(class69.field976 * 2) && class69.field976 * 2 > var28 && ~var30 <= -1 && var31 >= 0 && ~(class285.field4328 * 2) < ~var30 && var31 < class285.field4328 * 2 && var33 != 65535) {
                    int var40 = var27 * 64;
                    int var41 = var35 << 0;
                    int var42 = var28 * 64;
                    int var43 = var30 * 64;
                    int var44 = var31 * 64;
                    int var45 = var34 << 0;
                    class411 var46 = new class411(var33, class531.field7751, var40, var42, var45, class475.field6854 + var36, var37 - -class475.field6854, var38, var39, var32, var41, var29);
                    var46.method2575(class475.field6854 + var36, var44, true, class172.method1153(class531.field7751, -4, var43, var44) + -var41, var43);
                    class409.field6101.method994(new class62(var46), -3610);
                }
            } else if (class383.field5770 == arg0) {
                int var47 = class238.field3819.method1532((byte) 91);
                int var48 = (7 & var47 >> 4) + class73.field1033;
                int var49 = (var47 & 7) + class375.field5628;
                byte var50 = class238.field3819.method1565(true);
                int var51 = class238.field3819.method1512((byte) 116);
                byte var52 = class238.field3819.method1563((byte) -48);
                byte var53 = class238.field3819.method1503(122);
                int var54 = class238.field3819.method1560(-128);
                int var55 = var54 >> 2;
                int var56 = 3 & var54;
                int var57 = class238.field3819.method1547(true);
                byte var58 = class238.field3819.method1565(true);
                int var59 = class238.field3819.method1538((byte) -108);
                int var60 = class238.field3819.method1512((byte) 118);
                if (!class377.field5692.method347()) {
                    class155.method1065(var48, var56, var49, var55, var50, class531.field7751, var58, var52, var57, var53, -120, var59, var51, var60);
                }
            } else if (class231.field3745 == arg0) {
                int var61 = class238.field3819.method1515((byte) 123);
                int var62 = (var61 >> 4 & 15) + class73.field1033 * 2;
                int var63 = (var61 & 15) + class375.field5628 * 2;
                boolean var64 = ~class238.field3819.method1515((byte) 123) != -1;
                int var65 = var62 + class238.field3819.method1565(true);
                int var66 = class238.field3819.method1565(true) + var63;
                int var67 = class238.field3819.method1529((byte) -115);
                int var68 = class238.field3819.method1529((byte) 107);
                int var69 = class238.field3819.method1511(-104);
                byte var70 = class238.field3819.method1565(true);
                int var71 = class238.field3819.method1515((byte) 126) * 4;
                int var72 = class238.field3819.method1511(-58);
                int var73 = class238.field3819.method1511(arg1 + 72);
                int var74 = class238.field3819.method1515((byte) 124);
                int var75 = class238.field3819.method1515((byte) 125);
                if (~var74 == -256) {
                    var74 = -1;
                }
                if (~var62 <= -1 && var63 >= 0 && var62 < class69.field976 * 2 && ~var63 > ~(class69.field976 * 2) && ~var65 <= -1 && var66 >= 0 && ~(class285.field4328 * 2) < ~var65 && var66 < class285.field4328 * 2 && var69 != 65535) {
                    int var76 = var65 * 64;
                    int var77 = var66 * 64;
                    int var78 = var70 << 0;
                    int var79 = var62 * 64;
                    int var80 = var63 * 64;
                    int var81 = var71 << 0;
                    if (var67 != 0) {
                        int var83;
                        class129 var85;
                        if (var67 >= 0) {
                            int var82 = var67 + -1;
                            var83 = var82 >> 11 & 15;
                            int var84 = var82 & 2047;
                            var85 = class153.field2265[var84];
                        } else {
                            int var86 = -var67 + -1;
                            int var87 = 2047 & var86;
                            var83 = var86 >> 11 & 15;
                            if (~class261.field4008 != ~var87) {
                                var85 = class26.field319[var87];
                            } else {
                                var85 = class398.field5947;
                            }
                        }
                        if (var85 != null) {
                            class376 var88 = var85.method948(false);
                            if (var88.field5667 != null && var88.field5667[var83] != null) {
                                int var89 = var88.field5667[var83][0];
                                int var90 = var88.field5667[var83][2];
                                int var91 = var85.field1949.method889(16383);
                                int var92 = class281.field4278[var91];
                                int var93 = class281.field4279[var91];
                                int var94 = var89 * var93 + var90 * var92 >> 15;
                                int var95 = var90 * var93 + -(var89 * var92) >> 15;
                                var80 += var95;
                                var79 += var94;
                                var78 -= var88.field5667[var83][1];
                            }
                        }
                    }
                    class411 var97 = new class411(var69, class531.field7751, var79, var80, var78, class475.field6854 + var72, class475.field6854 + var73, var74, var75, var68, var81, var64);
                    var97.method2575(class475.field6854 + var72, var77, true, class172.method1153(class531.field7751, -4, var76, var77) - var81, var76);
                    class409.field6101.method994(new class62(var97), -3610);
                }
            } else if (class456.field6642 == arg0) {
                int var98 = class238.field3819.method1511(121);
                int var99 = class238.field3819.method1515((byte) 124);
                class510.field7458.method2973(arg1 + -123, var98).method591(var99, (byte) 101);
            } else if (class135.field2058 == arg0) {
                class238.field3819.method1515((byte) 127);
                int var100 = class238.field3819.method1515((byte) 124);
                int var101 = ((var100 & 112) >> 4) + class73.field1033;
                int var102 = class375.field5628 - -(var100 & 7);
                int var103 = class238.field3819.method1511(arg1 + 92);
                int var104 = class238.field3819.method1515((byte) 122);
                int var105 = class238.field3819.method1548(31529);
                String var106 = class238.field3819.method1550((byte) 28);
                class495.method2943(var106, var101, var105, (byte) 86, class531.field7751, var102, var103, var104);
            } else if (class156.field2336 == arg0) {
                int var107 = class238.field3819.method1515((byte) 122);
                int var108 = (var107 >> 4 & 7) + class73.field1033;
                int var109 = (7 & var107) + class375.field5628;
                int var110 = class238.field3819.method1511(101);
                int var111 = class238.field3819.method1511(99);
                int var112 = class238.field3819.method1511(-69);
                if (class334.field4985 != null && ~var108 <= -1 && ~var109 <= -1 && var108 < class69.field976 && ~var109 > ~class285.field4328) {
                    class433 var113 = (class433) class334.field4985.method2585((byte) 114, (long) (var109 << 14 | class531.field7751 << 28 | var108));
                    if (var113 != null) {
                        for (class495 var114 = (class495) var113.field6407.method1004((byte) -59); var114 != null; var114 = (class495) var113.field6407.method996(1)) {
                            if ((var110 & 32767) == var114.field7134 && ~var114.field7137 == ~var111) {
                                var114.method2677(-22491);
                                var114.field7137 = var112;
                                class294.method1912(class531.field7751, var114, var109, 99, var108);
                                break;
                            }
                        }
                        class68.method580((byte) -51, var109, class531.field7751, var108);
                    }
                }
            } else if (class285.field4327 == arg0) {
                int var115 = class238.field3819.method1523(arg1 ^ 3641);
                int var116 = var115 >> 2;
                int var117 = 3 & var115;
                int var118 = class514.field7472[var116];
                int var119 = class238.field3819.method1532((byte) 103);
                int var120 = (7 & var119 >> 4) + class73.field1033;
                int var121 = (7 & var119) + class375.field5628;
                int var122 = class238.field3819.method1549(-2);
                if (class425.method2655((byte) 119, class265.field4073) || var120 >= 0 && var121 >= 0 && var120 < class69.field976 && var121 < class285.field4328) {
                    class326.method2078(0, -1, var121, var120, var117, class531.field7751, (byte) 111, var122, var118, var116);
                }
            } else if (class1.field5 == arg0) {
                int var123 = class238.field3819.method1515((byte) 124);
                int var124 = class73.field1033 - -((var123 & 116) >> 4);
                int var125 = class375.field5628 - -(var123 & 7);
                int var126 = class238.field3819.method1549(-2);
                int var127 = class238.field3819.method1547(true);
                if (~var124 <= -1 && ~var125 <= -1 && var124 < class69.field976 && ~class285.field4328 < ~var125) {
                    class294.method1912(class531.field7751, new class495(var126, var127), var125, 116, var124);
                    class68.method580((byte) -125, var125, class531.field7751, var124);
                }
            } else if (class32.field366 == arg0) {
                int var128 = class238.field3819.method1515((byte) 127);
                boolean var129 = (var128 & 128) != 0;
                int var130 = (7 & var128 >> 3) + class73.field1033;
                int var131 = (var128 & 7) + class375.field5628;
                int var132 = class238.field3819.method1565(true) + var130;
                int var133 = var131 - -class238.field3819.method1565(true);
                int var134 = class238.field3819.method1529((byte) 117);
                int var135 = class238.field3819.method1511(arg1 + 110);
                int var136 = 4 * class238.field3819.method1515((byte) 121);
                int var137 = class238.field3819.method1515((byte) 123) * 4;
                int var138 = class238.field3819.method1511(arg1 + 108);
                int var139 = class238.field3819.method1511(115);
                int var140 = class238.field3819.method1515((byte) 126);
                int var141 = class238.field3819.method1515((byte) 127);
                if (~var140 == -256) {
                    var140 = -1;
                }
                if (var130 >= 0 && ~var131 <= -1 && class69.field976 > var130 && var131 < class285.field4328 && ~var132 <= -1 && var133 >= 0 && var132 < class69.field976 && ~class285.field4328 < ~var133 && var135 != 65535) {
                    int var142 = var130 * 128 + 64;
                    int var143 = var137 << 0;
                    int var144 = var132 * 128 + 64;
                    int var145 = var136 << 0;
                    int var146 = var133 * 128 + 64;
                    int var147 = var131 * 128 + 64;
                    class411 var148 = new class411(var135, class531.field7751, var142, var147, var145, var138 - -class475.field6854, class475.field6854 + var139, var140, var141, var134, var143, var129);
                    var148.method2575(class475.field6854 + var138, var146, true, class172.method1153(class531.field7751, -4, var144, var146) - var143, var144);
                    class409.field6101.method994(new class62(var148), -3610);
                }
            } else if (class320.field4813 == arg0) {
                int var149 = class238.field3819.method1560(-128);
                int var150 = var149 >> 2;
                int var151 = var149 & 3;
                int var152 = class514.field7472[var150];
                int var153 = class238.field3819.method1515((byte) 124);
                int var154 = class73.field1033 - -((120 & var153) >> 4);
                int var155 = class375.field5628 - -(var153 & 7);
                int var156 = class238.field3819.method1547(true);
                if (~var156 == -65536) {
                    var156 = -1;
                }
                class133.method972(class531.field7751, var156, var151, var150, 11742, var152, var154, var155);
            } else if (class263.field4049 != arg0) {
                if (class378.field5704 == arg0) {
                    int var163 = class238.field3819.method1515((byte) 125);
                    int var164 = (var163 >> 4 & 7) + class73.field1033;
                    int var165 = (7 & var163) + class375.field5628;
                    int var166 = class238.field3819.method1511(109);
                    if (var166 == 65535) {
                        var166 = -1;
                    }
                    int var167 = class238.field3819.method1515((byte) 125);
                    int var168 = var167 >> 4 & 15;
                    int var169 = var167 & 7;
                    int var170 = class238.field3819.method1515((byte) 122);
                    int var171 = class238.field3819.method1515((byte) 125);
                    if (var164 >= 0 && var165 >= 0 && class69.field976 > var164 && class285.field4328 > var165) {
                        int var172 = var168 + 1;
                        if (class398.field5947.field1978[0] >= -var172 + var164 && class398.field5947.field1978[0] <= var164 + var172 && class398.field5947.field1976[0] >= -var172 + var165 && class398.field5947.field1976[0] <= var165 + var172) {
                            class180.method1204(var171, var169, var166, true, (var164 << 16) + (class531.field7751 << 24) + (var165 << 8) + var168, var170);
                        }
                    }
                } else {
                    class88.method727((Throwable) null, arg1 + -96, "T3 - " + arg0);
                    class417.method2613(false, -87);
                }
            } else {
                int var157 = class238.field3819.method1511(-36);
                int var158 = class238.field3819.method1523(3643);
                int var159 = (7 & var158 >> 4) + class73.field1033;
                int var160 = class375.field5628 - -(var158 & 7);
                if (var159 >= 0 && ~var160 <= -1 && var159 < class69.field976 && ~var160 > ~class285.field4328) {
                    class433 var161 = (class433) class334.field4985.method2585((byte) 114, (long) (var160 << 14 | class531.field7751 << 28 | var159));
                    if (var161 != null) {
                        for (class495 var162 = (class495) var161.field6407.method1004((byte) -66); var162 != null; var162 = (class495) var161.field6407.method996(1)) {
                            if (~(var157 & 32767) == ~var162.field7134) {
                                var162.method2677(arg1 ^ -22489);
                                break;
                            }
                        }
                        if (var161.field6407.method1005((byte) -98)) {
                            var161.method2677(-22491);
                        }
                        class68.method580((byte) -87, var160, class531.field7751, var159);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class450() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "(I)V")
    public static final void method2748(int arg0) {
        ++field6580;
        int var1 = -75 % ((arg0 - -30) / 35);
        for (class62 var2 = (class62) class409.field6101.method1004((byte) -111); var2 != null; var2 = (class62) class409.field6101.method996(1)) {
            class411 var3 = var2.field759;
            if (~class154.field2286 == ~var3.field5826 && class475.field6854 <= var3.field6112) {
                if (~var3.field6115 >= ~class475.field6854) {
                    if (var3.field6154 > 0) {
                        class116 var4 = class153.field2265[var3.field6154 + -1];
                        if (var4 != null && ~var4.field5837 <= -1 && var4.field5837 < class69.field976 * 128 && var4.field5833 >= 0 && var4.field5833 < class285.field4328 * 128) {
                            var3.method2575(class475.field6854, var4.field5833, true, class172.method1153(var3.field5826, -4, var4.field5837, var4.field5833) + -var3.field6116, var4.field5837);
                        }
                    }
                    if (var3.field6154 < 0) {
                        int var5 = -var3.field6154 + -1;
                        class177 var6;
                        if (class261.field4008 == var5) {
                            var6 = class398.field5947;
                        } else {
                            var6 = class26.field319[var5];
                        }
                        if (var6 != null && ~var6.field5837 <= -1 && ~(class69.field976 * 128) < ~var6.field5837 && var6.field5833 >= 0 && ~var6.field5833 > ~(class285.field4328 * 128)) {
                            var3.method2575(class475.field6854, var6.field5833, true, class172.method1153(var3.field5826, -4, var6.field5837, var6.field5833) - var3.field6116, var6.field5837);
                        }
                    }
                    var3.method2578(class295.field4496, 122);
                    class495.method2940(var3, true);
                }
            } else {
                var2.method2677(-22491);
                var3.method2577((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILhp;)V")
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field6579;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field6576 = arg2.method1511(-70);
            }
        } else {
            this.field6571 = arg2.method1511(82);
        }
        int var5 = 48 % ((82 - arg0) / 40);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[I")
    public final int[] method179(int arg0, byte arg1) {
        ++field6573;
        if (arg1 != -11) {
            field6572 = true;
        }
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[] var4 = this.method2124(arg0, 0, -77);
            for (int var5 = 0; var5 < class402.field5977; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field6571 >= ~var6 && var6 <= this.field6576 ? 4096 : 0;
            }
        }
        return var3;
    }
}
