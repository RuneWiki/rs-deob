import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class477 extends class28 {

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field6444 = -1;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field6452 = 500;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "J")
    public long field6449;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Llj;")
    public class477 field6446;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Llj;")
    public class477 field6447;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6442;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "[I")
    public static int[] field6451;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public final void method2669(int arg0) {
        field6443++;
        if (this.field6446 == null) {
            return;
        }
        if (arg0 != -29226) {
            this.field6449 = -41L;
        }
        this.field6446.field6447 = this.field6447;
        this.field6447.field6446 = this.field6446;
        this.field6447 = null;
        this.field6446 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Z")
    public final boolean method2670(byte arg0) {
        field6450++;
        if (arg0 < 77) {
            return true;
        } else {
            return this.field6446 != null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static final void method2671(int arg0) {
        class483.field6542 = false;
        field6448++;
        class87.method490(class169.field2116, class326.field4744, class544.field7454, class353.field5151, -29041);
        if (arg0 != 7) {
            field6452 = 84;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2672(byte arg0, String arg1) {
        field6453++;
        if (arg1 == null) {
            return;
        }
        if (!(class110.field1323 < 200 || class575.field7963) || class110.field1323 >= 200) {
            class365.method2239(4, 19074, class243.field3174.method1491(class350.field5121, (byte) 126));
            String var2 = class243.field3175.method1491(class350.field5121, (byte) 127);
            if (var2 != null) {
                class365.method2239(4, 19074, var2);
            }
            return;
        }
        String var3 = class303.method1825(arg1, 1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class110.field1323; var4++) {
            String var8 = class303.method1825(class320.field4711[var4], 1);
            if (var8 != null && var8.equals(var3)) {
                class365.method2239(4, 19074, arg1 + class243.field3249.method1491(class350.field5121, (byte) 125));
                return;
            }
            if (class248.field3335[var4] != null) {
                String var9 = class303.method1825(class248.field3335[var4], 1);
                if (var9 != null && var9.equals(var3)) {
                    class365.method2239(4, 19074, arg1 + class243.field3249.method1491(class350.field5121, (byte) 127));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class641.field8818; var5++) {
            String var6 = class303.method1825(class353.field5147[var5], 1);
            if (var6 != null && var6.equals(var3)) {
                class365.method2239(4, 19074, class243.field3254.method1491(class350.field5121, (byte) 125) + arg1 + class243.field3255.method1491(class350.field5121, (byte) 125));
                return;
            }
            if (class291.field3892[var5] != null) {
                String var7 = class303.method1825(class291.field3892[var5], 1);
                if (var7 != null && var7.equals(var3)) {
                    class365.method2239(4, 19074, class243.field3254.method1491(class350.field5121, (byte) 127) + arg1 + class243.field3255.method1491(class350.field5121, (byte) 126));
                    return;
                }
            }
        }
        if (class303.method1825(class596.field8164.field7191, arg0 ^ 0xFFFFFFDE).equals(var3)) {
            class365.method2239(4, arg0 ^ 0xFFFFB55D, class243.field3252.method1491(class350.field5121, (byte) 126));
            return;
        }
        class45.field599++;
        class389.method2326((byte) 118, class557.field7601);
        class253.field3491.method951((byte) -82, class500.method2820(1, arg1));
        if (arg0 == -33) {
            class253.field3491.method905(arg1, -125);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lw;III[Z)V")
    public static final void method2673(class451 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class397.field5666 == class185.field2270) {
            return;
        }
        int var5 = class249.field3345[arg1].method159(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class176 var7 = class249.field3345[var6];
                if (var7 != null) {
                    var7.method158(arg0, arg2, var5 - var7.method159(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
    public static void method2674(int arg0) {
        field6442 = null;
        field6451 = null;
        int var1 = 48 / ((67 - arg0) / 35);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILnn;)V")
    public static final void method2675(int arg0, class446 arg1) {
        field6445++;
        if (class410.field5752 == arg1) {
            int var2 = class164.field2068.method957((byte) -79);
            int var3 = class28.field277 + (var2 & 0x7);
            int var4 = var3 + class186.field2280;
            int var5 = (var2 >> 4 & 0x7) + class301.field4019;
            int var6 = class253.field3490 + var5;
            int var7 = class164.field2068.method922((byte) -116);
            int var8 = class164.field2068.method922((byte) -119);
            int var9 = class164.field2068.method922((byte) -115);
            if (class645.field9141 != null) {
                class397 var10 = (class397) class645.field9141.method2506(25, (long) (class144.field1835 << 28 | var4 << 14 | var6));
                if (var10 != null) {
                    for (class172 var11 = (class172) var10.field5665.method374((byte) 67); var11 != null; var11 = (class172) var10.field5665.method372(-20740)) {
                        if ((var7 & 0x7FFF) == var11.field2150 && var11.field2157 == var8) {
                            var11.method175(30604);
                            var11.field2157 = var9;
                            class318.method2057(class144.field1835, (byte) -45, var4, var6, var11);
                            break;
                        }
                    }
                    if (var5 >= 0 && var3 >= 0 && class588.field8082 > var5 && var3 < class12.field113) {
                        class341.method2163(class144.field1835, var5, 0, var3);
                    }
                }
            }
        } else if (class516.field7080 == arg1) {
            int var12 = class164.field2068.method957((byte) -96);
            int var13 = (var12 & 0x7) + class28.field277;
            int var14 = class186.field2280 + var13;
            int var15 = ((var12 & 0x70) >> 4) + class301.field4019;
            int var16 = class253.field3490 + var15;
            int var17 = class164.field2068.method898((byte) 96);
            int var18 = class164.field2068.method922((byte) -121);
            boolean var19 = var15 >= 0 && var13 >= 0 && class588.field8082 > var15 && class12.field113 > var13;
            if (var19 || class629.method3438(class429.field5954, 69)) {
                class318.method2057(class144.field1835, (byte) -45, var14, var16, new class172(var18, var17));
                if (var19) {
                    class341.method2163(class144.field1835, var15, 0, var13);
                }
            }
        } else if (class49.field660 == arg1) {
            int var20 = class164.field2068.method957((byte) -101);
            int var21 = class301.field4019 + (var20 >> 4 & 0x7);
            int var22 = (var20 & 0x7) + class28.field277;
            int var23 = class164.field2068.method922((byte) -126);
            if (var23 == 65535) {
                var23 = -1;
            }
            int var24 = class164.field2068.method957((byte) -81);
            int var25 = (var24 & 0xF7) >> 4;
            int var26 = var24 & 0x7;
            int var27 = class164.field2068.method957((byte) -93);
            int var28 = class164.field2068.method957((byte) -117);
            if (var21 >= 0 && var22 >= 0 && class588.field8082 > var21 && var22 < class12.field113) {
                int var29 = var25 + 1;
                if ((var21 - var29) <= class596.field8164.field526[0] && class596.field8164.field526[0] <= var21 + var29 && var22 - var29 <= class596.field8164.field516[0] && (var22 + var29) >= class596.field8164.field516[0]) {
                    class667.method3702(var28, (var21 << 16) + ((class144.field1835 << 24) - (-(var22 << 8) - var25)), var26, -20, var23, false, var27);
                }
            }
        } else if (class433.field6007 == arg1) {
            int var30 = class164.field2068.method922((byte) -117);
            int var31 = class164.field2068.method957((byte) -106);
            class578.field7980.method1746(var30, (byte) 71).method1572(var31, (byte) 76);
        } else if (class299.field3996 == arg1) {
            int var32 = class164.field2068.method957((byte) -67);
            boolean var33 = (var32 & 0x80) != 0;
            int var34 = (var32 >> 3 & 0x7) + class301.field4019;
            int var35 = (var32 & 0x7) + class28.field277;
            int var36 = var34 + class164.field2068.method950(false);
            int var37 = var35 + class164.field2068.method950(false);
            int var38 = class164.field2068.method924(2);
            int var39 = class164.field2068.method922((byte) -124);
            int var40 = class164.field2068.method957((byte) -66) * 4;
            int var41 = class164.field2068.method957((byte) -68) * 4;
            int var42 = class164.field2068.method922((byte) -113);
            int var43 = class164.field2068.method922((byte) -114);
            int var44 = class164.field2068.method957((byte) -94);
            int var45 = class164.field2068.method922((byte) -127);
            if (var44 == 255) {
                var44 = -1;
            }
            if (var34 >= 0 && var35 >= 0 && class588.field8082 > var34 && var35 < class12.field113 && var36 >= 0 && var37 >= 0 && class588.field8082 > var36 && var37 < class12.field113 && var39 != 65535) {
                int var46 = var37 * 512 + 256;
                int var47 = var40 << 2;
                int var48 = var45 << 2;
                int var49 = var35 * 512 + 256;
                int var50 = var34 * 512 + 256;
                int var51 = var41 << 2;
                int var52 = var36 * 512 + 256;
                class665 var53 = new class665(var39, class144.field1835, var50, var49, var47, class430.field5984 + var42, class430.field5984 + var43, var44, var48, var38, var51, var33);
                var53.method3691(var46, class394.method2340(var52, -1, class144.field1835, var46) - var51, class430.field5984 + var42, -125, var52);
                class283.field3823.method378(new class119(var53), 31316);
            }
        } else if (class420.field5861 == arg1) {
            int var54 = class164.field2068.method928(-109);
            int var55 = (var54 >> 4 & 0x7) + class301.field4019;
            int var56 = class28.field277 + (var54 & 0x7);
            int var57 = class164.field2068.method928(-114);
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = class286.field3869[var58];
            if (class629.method3438(class429.field5954, arg0 ^ 0xFFFFFFAD) || var55 >= 0 && var56 >= 0 && class588.field8082 > var55 && var56 < class12.field113) {
                class253.method1584(var55, var59, var60, (byte) -58, var58, -1, -1, 0, var56, class144.field1835);
            }
        } else if (class170.field2118 == arg1) {
            int var61 = class164.field2068.method898((byte) 96);
            int var62 = class164.field2068.method928(-118);
            int var63 = class28.field277 + (var62 & 0x7);
            int var64 = class186.field2280 + var63;
            int var65 = (var62 >> 4 & 0x7) + class301.field4019;
            int var66 = class253.field3490 + var65;
            class397 var67 = (class397) class645.field9141.method2506(arg0 ^ 0xFFFFFFDC, (long) (class144.field1835 << 28 | var64 << 14 | var66));
            if (var67 != null) {
                for (class172 var68 = (class172) var67.field5665.method374((byte) 104); var68 != null; var68 = (class172) var67.field5665.method372(arg0 - 20739)) {
                    if ((var61 & 0x7FFF) == var68.field2150) {
                        var68.method175(30604);
                        break;
                    }
                }
                if (var67.field5665.method379(-1)) {
                    var67.method175(30604);
                }
                if (var65 >= 0 && var63 >= 0 && class588.field8082 > var65 && var63 < class12.field113) {
                    class341.method2163(class144.field1835, var65, arg0 + 1, var63);
                }
            }
        } else if (class341.field5006 == arg1) {
            class164.field2068.method957((byte) -63);
            int var69 = class164.field2068.method957((byte) -87);
            int var70 = (var69 >> 4 & 0x7) + class301.field4019;
            int var71 = (var69 & 0x7) + class28.field277;
            int var72 = class164.field2068.method922((byte) -120);
            int var73 = class164.field2068.method957((byte) -121);
            int var74 = class164.field2068.method904(arg0 ^ 0xFFFFFF86);
            String var75 = class164.field2068.method907(false);
            class516.method2934((byte) -111, var75, var72, var71, var74, var70, var73, class144.field1835);
        } else if (class440.field6063 == arg1) {
            int var76 = class164.field2068.method957((byte) -96);
            int var77 = class301.field4019 * 2 + ((var76 & 0xF4) >> 4);
            int var78 = (var76 & 0xF) + class28.field277 * 2;
            boolean var79 = class164.field2068.method957((byte) -123) != 0;
            int var80 = class164.field2068.method950(false) + var77;
            int var81 = class164.field2068.method950(false) + var78;
            int var82 = class164.field2068.method924(2);
            int var83 = class164.field2068.method922((byte) -120);
            int var84 = class164.field2068.method957((byte) -117) * 4;
            int var85 = class164.field2068.method957((byte) -67) * 4;
            int var86 = class164.field2068.method922((byte) -126);
            int var87 = class164.field2068.method922((byte) -120);
            int var88 = class164.field2068.method957((byte) -114);
            int var89 = class164.field2068.method922((byte) -115);
            if (var88 == 255) {
                var88 = -1;
            }
            if (var77 >= 0 && var78 >= 0 && (class588.field8082 * 2) > var77 && (class588.field8082 * 2) > var78 && var80 >= 0 && var81 >= 0 && class12.field113 * 2 > var80 && var81 < (class12.field113 * 2) && var83 != 65535) {
                int var90 = var89 << 2;
                int var91 = var81 * 256;
                int var92 = var84 << 2;
                int var93 = var78 * 256;
                int var94 = var80 * 256;
                int var95 = var85 << 2;
                int var96 = var77 * 256;
                class665 var97 = new class665(var83, class144.field1835, var96, var93, var92, var86 + class430.field5984, class430.field5984 + var87, var88, var90, var82, var95, var79);
                var97.method3691(var91, class394.method2340(var94, -1, class144.field1835, var91) - var95, class430.field5984 + var86, 90, var94);
                class283.field3823.method378(new class119(var97), 31316);
            }
        } else if (class679.field9658 == arg1) {
            byte var98 = class164.field2068.method899(11923);
            int var99 = class164.field2068.method936((byte) -31);
            int var100 = class301.field4019 + ((var99 & 0x7A) >> 4);
            int var101 = class28.field277 + (var99 & 0x7);
            int var102 = class164.field2068.method928(-126);
            int var103 = var102 >> 2;
            int var104 = var102 & 0x3;
            byte var105 = class164.field2068.method899(11923);
            int var106 = class164.field2068.method894(8);
            int var107 = class164.field2068.method912(0);
            byte var108 = class164.field2068.method899(11923);
            int var109 = class164.field2068.method912(arg0 + 1);
            byte var110 = class164.field2068.method950(false);
            int var111 = class164.field2068.method912(arg0 + 1);
            if (!class9.field103.method1791()) {
                class482.method2687(var111, var107, var108, var100, class144.field1835, var98, var105, var109, (byte) -116, var103, var110, var106, var104, var101);
            }
        } else if (class50.field666 == arg1) {
            int var112 = class164.field2068.method948(false);
            if (var112 == 65535) {
                var112 = -1;
            }
            int var113 = class164.field2068.method942(arg0 + 126);
            int var114 = class301.field4019 + ((var113 & 0x72) >> 4);
            int var115 = (var113 & 0x7) + class28.field277;
            int var116 = class164.field2068.method928(-116);
            int var117 = var116 >> 2;
            int var118 = var116 & 0x3;
            int var119 = class286.field3869[var117];
            class463.method2627(var112, var114, var118, var115, (byte) -98, class144.field1835, var119, var117);
        } else if (class107.field1296 == arg1) {
            int var120 = class164.field2068.method957((byte) -115);
            int var121 = ((var120 & 0x72) >> 4) + class301.field4019;
            int var122 = (var120 & 0x7) + class28.field277;
            int var123 = class164.field2068.method922((byte) -115);
            int var124 = class164.field2068.method957((byte) -69);
            int var125 = class164.field2068.method922((byte) -115);
            int var126 = class164.field2068.method957((byte) -102);
            if (var121 >= 0 && var122 >= 0 && class588.field8082 > var121 && class12.field113 > var122) {
                int var127 = var121 * 512 + 256;
                int var128 = var122 * 512 + 256;
                int var129 = class144.field1835;
                if (var129 < 3 && class313.method2026(var122, arg0 + 3551, var121)) {
                    var129++;
                }
                class542 var130 = new class542(var123, var125, class430.field5984, class144.field1835, var129, var127, class394.method2340(var127, -1, class144.field1835, var128) - var124, var128, var121, var121, var122, var122, var126);
                class28.field278.method378(new class121(var130), 31316);
            }
        } else if (class579.field7998 == arg1) {
            int var131 = class164.field2068.method957((byte) -108);
            int var132 = ((var131 & 0x7B) >> 4) + class301.field4019;
            int var133 = (var131 & 0x7) + class28.field277;
            int var134 = class164.field2068.method922((byte) -118);
            if (var134 == 65535) {
                var134 = -1;
            }
            int var135 = class164.field2068.method957((byte) -119);
            int var136 = (var135 & 0xFA) >> 4;
            int var137 = var135 & 0x7;
            int var138 = class164.field2068.method957((byte) -93);
            int var139 = class164.field2068.method957((byte) -87);
            if (var132 >= 0 && var133 >= 0 && var132 < class588.field8082 && class12.field113 > var133) {
                int var140 = var136 + 1;
                if (var132 - var140 <= class596.field8164.field526[0] && class596.field8164.field526[0] <= var132 + var140 && var133 - var140 <= class596.field8164.field516[0] && var133 + var140 >= class596.field8164.field516[0]) {
                    class351.method2193(var138, var134, var137, var139, -796, (var133 << 8) + (class144.field1835 << 24) + (var132 << 16) + var136);
                }
            }
        } else if (class100.field1220 == arg1) {
            int var141 = class164.field2068.method957((byte) -96);
            int var142 = (var141 >> 4 & 0xF) + class301.field4019 * 2;
            int var143 = (var141 & 0xF) + class28.field277 * 2;
            boolean var144 = class164.field2068.method957((byte) -96) != 0;
            int var145 = class164.field2068.method950(false) + var142;
            int var146 = class164.field2068.method950(false) + var143;
            int var147 = class164.field2068.method924(2);
            int var148 = class164.field2068.method924(2);
            int var149 = class164.field2068.method922((byte) -124);
            byte var150 = class164.field2068.method950(false);
            int var151 = class164.field2068.method957((byte) -103) * 4;
            int var152 = class164.field2068.method922((byte) -113);
            int var153 = class164.field2068.method922((byte) -117);
            int var154 = class164.field2068.method957((byte) -95);
            if (var154 == 255) {
                var154 = -1;
            }
            int var155 = class164.field2068.method922((byte) -113);
            if (var142 >= 0 && var143 >= 0 && class588.field8082 * 2 > var142 && class588.field8082 * 2 > var143 && var145 >= 0 && var146 >= 0 && var145 < (class12.field113 * 2) && var146 < class12.field113 * 2 && var149 != 65535) {
                int var156 = var142 * 256;
                int var157 = var146 * 256;
                int var158 = var145 * 256;
                int var159 = var151 << 2;
                int var160 = var150 << 2;
                int var161 = var155 << 2;
                int var162 = var143 * 256;
                if (var147 != 0) {
                    class39 var163 = null;
                    int var166;
                    if (var147 < 0) {
                        int var164 = -var147 - 1;
                        int var165 = var164 & 0x7FF;
                        var166 = var164 >> 11 & 0xF;
                        if (class224.field2907 == var165) {
                            var163 = class596.field8164;
                        } else {
                            var163 = class292.field3912[var165];
                        }
                    } else {
                        int var167 = var147 - 1;
                        int var168 = var167 & 0x7FF;
                        var166 = var167 >> 11 & 0xF;
                        class637 var169 = (class637) class77.field955.method2506(17, (long) var168);
                        if (var169 != null) {
                            var163 = var169.field8702;
                        }
                    }
                    if (var163 != null) {
                        class334 var170 = var163.method242(5832);
                        if (var170.field4907 != null && var170.field4907[var166] != null) {
                            int var171 = var170.field4907[var166][0];
                            int var172 = var170.field4907[var166][2];
                            int var173 = var163.field421.method1120(1);
                            int var174 = class654.field9259[var173];
                            int var175 = class654.field9260[var173];
                            int var176 = var172 * var174 + (var171 * var175) >> 14;
                            int var177 = var172 * var175 - (var171 * var174) >> 14;
                            var162 += var177;
                            var156 += var176;
                            var160 -= var170.field4907[var166][1];
                        }
                    }
                }
                class665 var179 = new class665(var149, class144.field1835, var156, var162, var160, class430.field5984 + var152, class430.field5984 + var153, var154, var161, var148, var159, var144);
                var179.method3691(var157, class394.method2340(var158, -1, class144.field1835, var157) - var159, class430.field5984 + var152, 68, var158);
                class283.field3823.method378(new class119(var179), 31316);
            }
        } else if (class528.field7313 == arg1) {
            int var180 = class164.field2068.method912(0);
            int var181 = class164.field2068.method912(0);
            int var182 = class164.field2068.method898((byte) 96);
            int var183 = class164.field2068.method957((byte) -69);
            int var184 = class28.field277 + (var183 & 0x7);
            int var185 = class186.field2280 + var184;
            int var186 = (var183 >> 4 & 0x7) + class301.field4019;
            int var187 = var186 + class253.field3490;
            if (class224.field2907 != var180) {
                boolean var188 = var186 >= 0 && var184 >= 0 && class588.field8082 > var186 && var184 < class12.field113;
                if (var188 || class629.method3438(class429.field5954, 106)) {
                    class318.method2057(class144.field1835, (byte) -45, var185, var187, new class172(var181, var182));
                    if (var188) {
                        class341.method2163(class144.field1835, var186, 0, var184);
                    }
                }
            }
        } else if (class165.field2075 == arg1) {
            int var189 = class164.field2068.method942(107);
            int var190 = (var189 >> 4 & 0x7) + class301.field4019;
            int var191 = (var189 & 0x7) + class28.field277;
            int var192 = class164.field2068.method942(arg0 ^ 0xFFFFFF8B);
            int var193 = var192 >> 2;
            int var194 = var192 & 0x3;
            int var195 = class286.field3869[var193];
            int var196 = class164.field2068.method922((byte) -113);
            if (class629.method3438(class429.field5954, 72) || var190 >= 0 && var191 >= 0 && class588.field8082 > var190 && var191 < class12.field113) {
                class253.method1584(var190, var194, var195, (byte) -58, var193, -1, var196, 0, var191, class144.field1835);
            }
        } else {
            class282.method1694("T3 - " + arg1, (byte) 47, null);
            if (arg0 != -1) {
                method2675(-22, null);
            }
            class511.method2893(1000000, false);
        }
    }
}
