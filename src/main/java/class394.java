import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class394 extends class102 {

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Lmi;")
    public class408 field5918 = new class408();

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "Llg;")
    public class20 field5925 = new class20();

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lhb;")
    private class345 field5914;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Z")
    public static boolean field5907 = false;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field5913 = -2;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "Lwe;")
    public static class24 field5916 = new class24(16);

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field5921 = 0;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V", line = 4)
    public static void method2576(int arg0) {
        field5916 = null;
        if (arg0 != 7) {
            field5919 = 77;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[ILhs;III)V", line = 19)
    private final void method2577(int arg0, int[] arg1, class420 arg2, int arg3, int arg4, int arg5) {
        field5910++;
        if (arg3 != -8921) {
            field5921 = 53;
        }
        if ((this.field5914.field5058[arg2.field6254] & 0x4) != 0 && arg2.field6240 < 0) {
            int var7 = this.field5914.field5114[arg2.field6254] / class29.field505;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field6244) / var7;
                if (arg5 < var8) {
                    arg2.field6244 += arg5 * var7;
                    break;
                }
                arg2.field6242.method170(arg1, arg0, var8);
                arg5 -= var8;
                arg2.field6244 += var7 * var8 - 1048576;
                arg0 += var8;
                int var9 = class29.field505 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class290 var11 = arg2.field6242;
                if (this.field5914.field5083[arg2.field6254] == 0) {
                    arg2.field6242 = class290.method1847(arg2.field6260, var11.method1838(), var11.method1861(), var11.method1834());
                } else {
                    arg2.field6242 = class290.method1847(arg2.field6260, var11.method1838(), 0, var11.method1834());
                    this.field5914.method2296(true, arg2, arg2.field6247.field192[arg2.field6250] < 0);
                    arg2.field6242.method1844(var9, var11.method1861());
                }
                if (arg2.field6247.field192[arg2.field6250] < 0) {
                    arg2.field6242.method1859(-1);
                }
                var11.method1856(var9);
                var11.method170(arg1, arg0, arg4 - arg0);
                if (var11.method1828()) {
                    this.field5925.method174(var11);
                }
            }
        }
        arg2.field6242.method170(arg1, arg0, arg5);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V", line = 82)
    public static final void method2578(int arg0, int arg1, int arg2) {
        field5915++;
        if (!class95.field1307) {
            return;
        }
        class232.field3279.method756(0, 145);
        int var3 = 44 / ((-arg2 - 3) / 62);
        class189.field2573++;
        class232.field3279.method1704(arg0, (byte) 126);
        class232.field3279.method1670(arg1, (byte) -115);
        class232.field3279.method1716((byte) -32, class300.field4307);
        class232.field3279.method1670(class94.field1304, (byte) -115);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "([III)V", line = 102)
    public final void method170(int[] arg0, int arg1, int arg2) {
        field5917++;
        this.field5925.method170(arg0, arg1, arg2);
        for (class420 var4 = (class420) this.field5918.method2649(0); var4 != null; var4 = (class420) this.field5918.method2656(0)) {
            if (!this.field5914.method2293(var4, (byte) -102)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field6265 >= var5) {
                        this.method2577(var6, arg0, var4, -8921, var5 + var6, var5);
                        var4.field6265 -= var5;
                        break;
                    }
                    this.method2577(var6, arg0, var4, -8921, var5 + var6, var4.field6265);
                    var6 += var4.field6265;
                    var5 -= var4.field6265;
                } while (!this.field5914.method2275(var4, var6, var5, arg0, (byte) -30));
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILhs;)V", line = 148)
    private final void method2579(byte arg0, int arg1, class420 arg2) {
        if ((this.field5914.field5058[arg2.field6254] & 0x4) != 0 && arg2.field6240 < 0) {
            int var4 = this.field5914.field5114[arg2.field6254] / class29.field505;
            int var5 = (var4 + 1048575 - arg2.field6244) / var4;
            arg2.field6244 = arg1 * var4 + arg2.field6244 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field5914.field5083[arg2.field6254] == 0) {
                    arg2.field6242 = class290.method1847(arg2.field6260, arg2.field6242.method1838(), arg2.field6242.method1861(), arg2.field6242.method1834());
                } else {
                    arg2.field6242 = class290.method1847(arg2.field6260, arg2.field6242.method1838(), 0, arg2.field6242.method1834());
                    this.field5914.method2296(true, arg2, arg2.field6247.field192[arg2.field6250] < 0);
                }
                if (arg2.field6247.field192[arg2.field6250] < 0) {
                    arg2.field6242.method1859(-1);
                }
                arg1 = arg2.field6244 / var4;
            }
        }
        field5920++;
        if (arg0 != 13) {
            this.method172(-48);
        }
        arg2.field6242.method172(arg1);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V", line = 187)
    public static final void method2580(byte arg0) {
        field5924++;
        class77.field1055.method212(-107);
        class327.field4700.method212(-102);
        if (arg0 != 111) {
            field5919 = -2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V", line = 199)
    public static final void method2581(byte arg0) {
        field5908++;
        if (class188.field2551 == 15) {
            class114.field1556.method1697(-61);
            int var1 = class114.field1556.method1697(111);
            int var2 = (var1 >> 4 & 0x7) + class313.field4488;
            int var3 = (var1 & 0x7) + class185.field2522;
            int var4 = class114.field1556.method1685(8104);
            int var5 = class114.field1556.method1697(arg0 - 32);
            int var6 = class114.field1556.method1691(false);
            String var7 = class114.field1556.method1712(false);
            class404.method2637(var3, var4, 6, var5, var6, var2, var7);
        } else if (class188.field2551 == 115) {
            int var8 = class114.field1556.method1702(4095);
            int var9 = class313.field4488 + (var8 >> 4 & 0x7);
            int var10 = (var8 & 0x7) + class185.field2522;
            int var11 = class114.field1556.method1694(arg0 + 92);
            int var12 = class114.field1556.method1702(4095);
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = class18.field219[var13];
            if (var9 >= 0 && var10 >= 0 && var9 < class324.field4652 && var10 < class336.field4964) {
                class265.method1695(var13, var9, -1, var15, var10, -29403, var14, 0, class193.field2688, var11);
            }
        } else if (class188.field2551 == 22) {
            int var16 = class114.field1556.method1694(-1);
            int var17 = class114.field1556.method1685(arg0 ^ 0xFFFFE00B);
            int var18 = class114.field1556.method1702(4095);
            int var19 = (var18 >> 4 & 0x7) + class313.field4488;
            int var20 = class185.field2522 + (var18 & 0x7);
            if (var19 >= 0 && var20 >= 0 && class324.field4652 > var19 && class336.field4964 > var20) {
                class10.method76(class193.field2688, var20, var19, (byte) -55, new class6(var17, var16));
                class393.method2573(var20, -71, class193.field2688, var19);
            }
        } else if (class188.field2551 == 229) {
            int var21 = class114.field1556.method1697(-70);
            int var22 = class313.field4488 * 2 + (var21 >> 4 & 0xF);
            int var23 = class185.field2522 * 2 + (var21 & 0xF);
            int var24 = class114.field1556.method1708((byte) 127) + var22;
            int var25 = var23 + class114.field1556.method1708((byte) 127);
            int var26 = class114.field1556.method1698(1625554944);
            int var27 = class114.field1556.method1698(arg0 ^ 0x9F1BFFA3);
            int var28 = class114.field1556.method1685(arg0 ^ 0xFFFFE00B);
            int var29 = class114.field1556.method1708((byte) 127);
            int var30 = class114.field1556.method1697(109) * 4;
            int var31 = class114.field1556.method1685(arg0 ^ 0xFFFFE00B);
            int var32 = class114.field1556.method1685(8104);
            int var33 = class114.field1556.method1697(59);
            int var34 = class114.field1556.method1697(-19);
            if (var33 == 255) {
                var33 = -1;
            }
            if (var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var24 >= 0 && var25 >= 0 && var24 < 208 && var25 < 208 && var28 != 65535) {
                int var35 = var23 * 64;
                int var36 = var24 * 64;
                int var37 = var25 * 64;
                int var38 = var22 * 64;
                if (var26 != 0) {
                    int var41;
                    class18 var42;
                    if (var26 < 0) {
                        int var39 = -var26 - 1;
                        int var40 = var39 & 0x7FF;
                        var41 = (var39 & 0x7EAC) >> 11;
                        if (class452.field6590 == var40) {
                            var42 = class100.field1350;
                        } else {
                            var42 = class125.field1664[var40];
                        }
                    } else {
                        int var43 = var26 - 1;
                        var41 = var43 >> 11 & 0xF;
                        int var44 = var43 & 0x7FF;
                        var42 = class23.field408[var44];
                    }
                    if (var42 != null) {
                        class183 var45 = var42.method140(124);
                        if (var45.field2463 != null && var45.field2463[var41] != null) {
                            int var46 = var45.field2463[var41][0];
                            int var47 = var45.field2463[var41][2];
                            int var48 = var42.field272.method1650((byte) 127);
                            int var49 = class190.field2644[var48];
                            int var50 = class190.field2635[var48];
                            int var51 = var47 * var49 + (var46 * var50) >> 15;
                            int var52 = var47 * var50 - (var46 * var49) >> 15;
                            var35 += var52;
                            var29 -= var45.field2463[var41][1];
                            var38 += var51;
                        }
                    }
                }
                class23 var54 = new class23(var28, class193.field2688, var38, var35, class139.method935(var35, -46, var38, class193.field2688) - var29, var31 - -class50.field698, class50.field698 + var32, var33, var34, var27, var30);
                var54.method199(class50.field698 + var31, 7403, class139.method935(var37, -70, var36, class193.field2688) - var30, var36, var37);
                class45.field669.method2660((byte) -124, new class191(var54));
            }
        } else if (class188.field2551 == 212) {
            int var55 = class114.field1556.method1697(66);
            int var56 = ((var55 & 0xF3) >> 4) + class313.field4488 * 2;
            int var57 = (var55 & 0xF) + class185.field2522 * 2;
            int var58 = class114.field1556.method1708((byte) 127) + var56;
            int var59 = class114.field1556.method1708((byte) 127) + var57;
            int var60 = class114.field1556.method1698(arg0 + 1625555037);
            int var61 = class114.field1556.method1685(arg0 + 8197);
            int var62 = class114.field1556.method1697(65) * 4;
            int var63 = class114.field1556.method1697(-60) * 4;
            int var64 = class114.field1556.method1685(arg0 ^ 0xFFFFE00B);
            int var65 = class114.field1556.method1685(8104);
            int var66 = class114.field1556.method1697(-67);
            if (var66 == 255) {
                var66 = -1;
            }
            int var67 = class114.field1556.method1697(-33);
            if (var56 >= 0 && var57 >= 0 && var56 < 208 && var57 < 208 && var58 >= 0 && var59 >= 0 && var58 < 208 && var59 < 208 && var61 != 65535) {
                int var68 = var59 * 64;
                int var69 = var57 * 64;
                int var70 = var58 * 64;
                int var71 = var56 * 64;
                class23 var72 = new class23(var61, class193.field2688, var71, var69, class139.method935(var69, 93, var71, class193.field2688) - var62, class50.field698 + var64, class50.field698 + var65, var66, var67, var60, var63);
                var72.method199(class50.field698 + var64, 7403, class139.method935(var68, 107, var70, class193.field2688) - var63, var70, var68);
                class45.field669.method2660((byte) -123, new class191(var72));
            }
        } else {
            if (class188.field2551 == 6) {
                int var73 = class114.field1556.method1665(14684);
                int var74 = ((var73 & 0x73) >> 4) + class313.field4488;
                int var75 = (var73 & 0x7) + class185.field2522;
                byte var76 = class114.field1556.method1672((byte) -99);
                int var77 = class114.field1556.method1705(false);
                int var78 = class114.field1556.method1683(65536);
                byte var79 = class114.field1556.method1673(252);
                byte var80 = class114.field1556.method1672((byte) 75);
                byte var81 = class114.field1556.method1675(-6266);
                int var82 = class114.field1556.method1685(8104);
                int var83 = class114.field1556.method1705(false);
                int var84 = class114.field1556.method1665(14684);
                int var85 = var84 >> 2;
                int var86 = var84 & 0x3;
                if (!class35.field574.method2112()) {
                    class167.method1037(var74, var81, var76, var82, true, var78, var83, var75, var85, var86, var80, var79, var77);
                }
            }
            if (class188.field2551 == 221) {
                int var87 = class114.field1556.method1665(14684);
                int var88 = class313.field4488 + ((var87 & 0x76) >> 4);
                int var89 = (var87 & 0x7) + class185.field2522;
                int var90 = class114.field1556.method1685(arg0 ^ 0xFFFFE00B);
                if (var88 >= 0 && var89 >= 0 && class324.field4652 > var88 && var89 < class336.field4964) {
                    class281 var91 = (class281) class231.field3261.method954(-93, (long) (var88 | class193.field2688 << 28 | var89 << 14));
                    if (var91 != null) {
                        for (class6 var92 = (class6) var91.field4135.method2649(0); var92 != null; var92 = (class6) var91.field4135.method2656(arg0 ^ 0xFFFFFFA3)) {
                            if ((var90 & 0x7FFF) == var92.field57) {
                                var92.method2574((byte) 123);
                                break;
                            }
                        }
                        if (var91.field4135.method2657(-81)) {
                            var91.method2574((byte) 119);
                        }
                        class393.method2573(var89, -67, class193.field2688, var88);
                    }
                }
            } else if (class188.field2551 == 27) {
                int var93 = class114.field1556.method1674((byte) 111);
                int var94 = (var93 >> 4 & 0x7) + class313.field4488;
                int var95 = (var93 & 0x7) + class185.field2522;
                int var96 = class114.field1556.method1702(4095);
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = class18.field219[var97];
                if (var94 >= 0 && var95 >= 0 && class324.field4652 > var94 && var95 < class336.field4964) {
                    class265.method1695(var97, var94, -1, var99, var95, -29403, var98, 0, class193.field2688, -1);
                }
            } else if (class188.field2551 == 223) {
                int var100 = class114.field1556.method1697(arg0 ^ 0x31);
                int var101 = ((var100 & 0x7C) >> 4) + class313.field4488;
                int var102 = class185.field2522 + (var100 & 0x7);
                int var103 = class114.field1556.method1708((byte) 127) + var101;
                int var104 = var102 + class114.field1556.method1708((byte) 127);
                int var105 = class114.field1556.method1698(1625554944);
                int var106 = class114.field1556.method1685(8104);
                int var107 = class114.field1556.method1697(76) * 4;
                int var108 = class114.field1556.method1697(-28) * 4;
                int var109 = class114.field1556.method1685(8104);
                int var110 = class114.field1556.method1685(arg0 ^ 0xFFFFE00B);
                int var111 = class114.field1556.method1697(-97);
                if (var111 == 255) {
                    var111 = -1;
                }
                int var112 = class114.field1556.method1697(109);
                if (var101 >= 0 && var102 >= 0 && class324.field4652 > var101 && var102 < class336.field4964 && var103 >= 0 && var104 >= 0 && var103 < class324.field4652 && var104 < class336.field4964 && var106 != 65535) {
                    int var113 = var102 * 128 + 64;
                    int var114 = var103 * 128 + 64;
                    int var115 = var104 * 128 + 64;
                    int var116 = var101 * 128 + 64;
                    class23 var117 = new class23(var106, class193.field2688, var116, var113, class139.method935(var113, 97, var116, class193.field2688) - var107, class50.field698 + var109, class50.field698 + var110, var111, var112, var105, var108);
                    var117.method199(class50.field698 + var109, arg0 + 7496, class139.method935(var115, -35, var114, class193.field2688) - var108, var114, var115);
                    class45.field669.method2660((byte) -128, new class191(var117));
                }
            } else if (class188.field2551 == 155) {
                int var118 = class114.field1556.method1697(-78);
                int var119 = (var118 >> 4 & 0x7) + class313.field4488;
                int var120 = (var118 & 0x7) + class185.field2522;
                int var121 = class114.field1556.method1685(8104);
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = class114.field1556.method1697(arg0 ^ 0xFFFFFFF8);
                int var123 = var122 >> 4 & 0xF;
                int var124 = var122 & 0x7;
                int var125 = class114.field1556.method1697(-27);
                int var126 = class114.field1556.method1697(-11);
                if (var119 >= 0 && var120 >= 0 && var119 < class324.field4652 && class336.field4964 > var120) {
                    int var127 = var123 + 1;
                    if ((var119 - var127) <= class100.field1350.field303[0] && class100.field1350.field303[0] <= (var119 + var127) && var120 - var127 <= class100.field1350.field306[0] && class100.field1350.field306[0] <= var120 + var127 && class358.field5243 != 0 && var124 > 0 && class7.field64 < 50 && var121 != -1) {
                        class95.field1316[class7.field64] = var121;
                        class171.field2252[class7.field64] = var124;
                        class408.field6111[class7.field64] = var125;
                        class60.field865[class7.field64] = null;
                        class358.field5246[class7.field64] = (var119 << 16) + (var120 << 8) + var123;
                        class189.field2577[class7.field64] = var126;
                        class7.field64++;
                    }
                }
            } else if (class188.field2551 == 249) {
                int var128 = class114.field1556.method1697(102);
                int var129 = (var128 >> 4 & 0x7) + class313.field4488;
                int var130 = (var128 & 0x7) + class185.field2522;
                int var131 = class114.field1556.method1685(arg0 + 8197);
                int var132 = class114.field1556.method1697(arg0 ^ 0xFFFFFFFB);
                int var133 = class114.field1556.method1685(8104);
                if (var129 >= 0 && var130 >= 0 && class324.field4652 > var129 && var130 < class336.field4964) {
                    int var134 = var129 * 128 + 64;
                    int var135 = var130 * 128 + 64;
                    class392 var136 = new class392(var131, var133, class50.field698, class193.field2688, var134, class139.method935(var135, 119, var134, class193.field2688) - var132, var135, var129, var129, var130, var130);
                    class119.field1599.method2660((byte) -123, new class268(var136));
                }
            } else if (class188.field2551 == 112) {
                int var137 = class114.field1556.method1685(8104);
                int var138 = class114.field1556.method1702(4095);
                int var139 = class313.field4488 + (var138 >> 4 & 0x7);
                int var140 = (var138 & 0x7) + class185.field2522;
                int var141 = class114.field1556.method1684((byte) 79);
                int var142 = class114.field1556.method1705(false);
                if (var139 >= 0 && var140 >= 0 && var139 < class324.field4652 && var140 < class336.field4964 && class452.field6590 != var137) {
                    class10.method76(class193.field2688, var140, var139, (byte) -55, new class6(var141, var142));
                    class393.method2573(var140, 54, class193.field2688, var139);
                }
            } else if (class188.field2551 == 82) {
                int var143 = class114.field1556.method1697(54);
                int var144 = ((var143 & 0x71) >> 4) + class313.field4488;
                int var145 = (var143 & 0x7) + class185.field2522;
                int var146 = class114.field1556.method1685(8104);
                int var147 = class114.field1556.method1685(8104);
                int var148 = class114.field1556.method1685(arg0 + 8197);
                if (class231.field3261 != null && var144 >= 0 && var145 >= 0 && var144 < class324.field4652 && var145 < class336.field4964) {
                    class281 var149 = (class281) class231.field3261.method954(122, (long) (var145 << 14 | class193.field2688 << 28 | var144));
                    if (var149 != null) {
                        for (class6 var150 = (class6) var149.field4135.method2649(arg0 ^ 0xFFFFFFA3); var150 != null; var150 = (class6) var149.field4135.method2656(arg0 ^ 0xFFFFFFA3)) {
                            if ((var146 & 0x7FFF) == var150.field57 && var150.field52 == var147) {
                                var150.method2574((byte) 114);
                                var150.field52 = var148;
                                class10.method76(class193.field2688, var145, var144, (byte) -55, var150);
                                break;
                            }
                        }
                        class393.method2573(var145, 121, class193.field2688, var144);
                    }
                }
            } else {
                if (arg0 != -93) {
                    field5907 = true;
                }
                if (class188.field2551 == 254) {
                    int var151 = class114.field1556.method1685(8104);
                    if (var151 == 65535) {
                        var151 = -1;
                    }
                    int var152 = class114.field1556.method1697(arg0 ^ 0xFFFFFFEC);
                    int var153 = var152 >> 2;
                    int var154 = var152 & 0x3;
                    int var155 = class18.field219[var153];
                    int var156 = class114.field1556.method1674((byte) -102);
                    int var157 = class313.field4488 + (var156 >> 4 & 0x7);
                    int var158 = (var156 & 0x7) + class185.field2522;
                    class104.method710(8230, var151, var153, class193.field2688, var158, var154, var155, var157);
                } else if (class188.field2551 == 78) {
                    int var159 = class114.field1556.method1685(8104);
                    int var160 = class114.field1556.method1697(-81);
                    class165.method1020(var159, 124).method2619(var160, (byte) 40);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()Laf;", line = 805)
    public final class102 method165() {
        field5922++;
        class420 var1;
        do {
            var1 = (class420) this.field5918.method2656(0);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6242 == null);
        return var1.field6242;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V", line = 831)
    public final void method172(int arg0) {
        this.field5925.method172(arg0);
        field5911++;
        for (class420 var2 = (class420) this.field5918.method2649(0); var2 != null; var2 = (class420) this.field5918.method2656(0)) {
            if (!this.field5914.method2293(var2, (byte) 50)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6265) {
                        this.method2579((byte) 13, var3, var2);
                        var2.field6265 -= var3;
                        break;
                    }
                    this.method2579((byte) 13, var2.field6265, var2);
                    var3 -= var2.field6265;
                } while (!this.field5914.method2275(var2, 0, var3, (int[]) null, (byte) -30));
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()Laf;", line = 878)
    public final class102 method167() {
        field5923++;
        class420 var1 = (class420) this.field5918.method2649(0);
        if (var1 == null) {
            return null;
        } else if (var1.field6242 == null) {
            return this.method165();
        } else {
            return var1.field6242;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()I", line = 894)
    public final int method164() {
        field5909++;
        return 0;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lhb;)V", line = 909)
    public class394(class345 arg0) {
        this.field5914 = arg0;
    }
}
