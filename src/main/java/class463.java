import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class463 implements class389 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public int field6827;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    public static int[] field6824 = new int[32];

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field6825 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lwl;")
    public static class452 field6831;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIZI)V")
    public static final void method2853(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class268.field4081 == 1) {
            class184.field2767[class330.field4940 / 100].method1408(class172.field2643 - 8, class155.field2159 + -8);
        }
        field6822++;
        if (class268.field4081 == 2) {
            class184.field2767[class330.field4940 / 100 + 4].method1408(class172.field2643 - 8, class155.field2159 + -8);
        }
        class282.method1738(128);
        if (!arg3) {
            field6825 = 48;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method2854(int arg0) {
        if (arg0 != -10693000) {
            method2856(-47, (class55) null);
        }
        field6831 = null;
        field6824 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Liq;Liq;I)V")
    public static final void method2855(class134 arg0, class134 arg1, int arg2) {
        field6828++;
        if (arg2 < -37) {
            class387.field5728 = arg1;
            class413.field6133 = arg0;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class463(String arg0, int arg1) {
        this.field6827 = arg1;
    }

    @OriginalMember(owner = "client!ik", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6823++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILns;)V")
    public static final void method2856(int arg0, class55 arg1) {
        field6826++;
        if (arg0 <= 69) {
            return;
        }
        if (class429.field6306 == arg1) {
            int var2 = class424.field6232.method2343(255);
            int var3 = class386.field5689 + ((var2 & 0x7A) >> 4);
            int var4 = class105.field1412 + (var2 & 0x7);
            int var5 = class424.field6232.method2323(-109);
            int var6 = class424.field6232.method2323(-11);
            int var7 = class424.field6232.method2323(-120);
            if (class45.field557 != null && var3 >= 0 && var4 >= 0 && class115.field1522 > var3 && var4 < class198.field3004) {
                class429 var8 = (class429) class45.field557.method2302((long) (var3 | class220.field3358 << 28 | var4 << 14), 23576);
                if (var8 != null) {
                    for (class146 var9 = (class146) var8.field6304.method2514((byte) 61); var9 != null; var9 = (class146) var8.field6304.method2511(123)) {
                        if ((var5 & 0x7FFF) == var9.field2025 && var9.field2022 == var6) {
                            var9.method625((byte) -50);
                            var9.field2022 = var7;
                            class118.method705(false, var3, var9, class220.field3358, var4);
                            break;
                        }
                    }
                    class292.method1808(58, var3, var4, class220.field3358);
                }
            }
        } else if (class380.field5547 == arg1) {
            int var10 = class424.field6232.method2322((byte) -1);
            int var11 = class424.field6232.method2318(-78);
            int var12 = class424.field6232.method2335(-118);
            byte var13 = class424.field6232.method2376(128);
            int var14 = class424.field6232.method2365(0);
            int var15 = ((var14 & 0x74) >> 4) + class386.field5689;
            int var16 = (var14 & 0x7) + class105.field1412;
            byte var17 = class424.field6232.method2364(-126);
            int var18 = class424.field6232.method2359((byte) -21);
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            byte var21 = class424.field6232.method2376(128);
            int var22 = class424.field6232.method2328(-98);
            byte var23 = class424.field6232.method2376(128);
            if (!class196.field2965.method398()) {
                class20.method130(var23, var10, 123, var21, var17, class220.field3358, var22, var11, var13, var12, var19, var16, var15, var20);
            }
        } else if (class327.field4922 == arg1) {
            int var24 = class424.field6232.method2343(255);
            int var25 = ((var24 & 0x7F) >> 4) + class386.field5689;
            int var26 = (var24 & 0x7) + class105.field1412;
            int var27 = class424.field6232.method2323(-88);
            int var28 = class424.field6232.method2343(255);
            int var29 = class424.field6232.method2323(-48);
            if (var25 >= 0 && var26 >= 0 && var25 < class115.field1522 && var26 < class198.field3004) {
                int var30 = var25 * 128 + 64;
                int var31 = var26 * 128 + 64;
                class320 var32 = new class320(var27, var29, class26.field332, class220.field3358, var30, class437.method2686(class220.field3358, 0, var31, var30) - var28, var31, var25, var25, var26, var26);
                class88.field1245.method2504(42, new class80(var32));
            }
        } else if (class219.field3337 == arg1) {
            int var33 = class424.field6232.method2343(255);
            int var34 = (var33 >> 4 & 0xF) + class386.field5689 * 2;
            int var35 = (var33 & 0xF) + class105.field1412 * 2;
            int var36 = var34 + class424.field6232.method2341((byte) 54);
            int var37 = class424.field6232.method2341((byte) 54) + var35;
            int var38 = class424.field6232.method2327((byte) -116);
            int var39 = class424.field6232.method2323(-53);
            int var40 = class424.field6232.method2343(255) * 4;
            int var41 = class424.field6232.method2343(255) * 4;
            int var42 = class424.field6232.method2323(-2);
            int var43 = class424.field6232.method2323(-61);
            int var44 = class424.field6232.method2343(255);
            if (var44 == 255) {
                var44 = -1;
            }
            int var45 = class424.field6232.method2343(255);
            if (var34 >= 0 && var35 >= 0 && var34 < (class115.field1522 * 2) && class115.field1522 * 2 > var35 && var36 >= 0 && var37 >= 0 && class198.field3004 * 2 > var36 && class198.field3004 * 2 > var37 && var39 != 65535) {
                int var46 = var34 * 64;
                int var47 = var36 * 64;
                int var48 = var35 * 64;
                int var49 = var37 * 64;
                class74 var50 = new class74(var39, class220.field3358, var46, var48, class437.method2686(class220.field3358, 0, var48, var46) - var40, class26.field332 + var42, class26.field332 + var43, var44, var45, var38, var41);
                var50.method485(var49, class437.method2686(class220.field3358, 0, var49, var47) - var41, var47, (byte) 84, class26.field332 + var42);
                class301.field4541.method2504(42, new class275(var50));
            }
        } else if (class47.field580 == arg1) {
            int var51 = class424.field6232.method2335(118);
            if (var51 == 65535) {
                var51 = -1;
            }
            int var52 = class424.field6232.method2351((byte) 64);
            int var53 = ((var52 & 0x73) >> 4) + class386.field5689;
            int var54 = (var52 & 0x7) + class105.field1412;
            int var55 = class424.field6232.method2365(0);
            int var56 = var55 >> 2;
            int var57 = var55 & 0x3;
            int var58 = class423.field6228[var56];
            class168.method1019(var57, var51, var58, var54, class220.field3358, var53, 8, var56);
        } else if (class378.field5508 == arg1) {
            int var59 = class424.field6232.method2359((byte) -21);
            int var60 = var59 >> 2;
            int var61 = var59 & 0x3;
            int var62 = class423.field6228[var60];
            int var63 = class424.field6232.method2343(255);
            int var64 = (var63 >> 4 & 0x7) + class386.field5689;
            int var65 = (var63 & 0x7) + class105.field1412;
            if (var64 >= 0 && var65 >= 0 && class115.field1522 > var64 && var65 < class198.field3004) {
                class379.method2284(0, var64, var60, var65, var61, 0, class220.field3358, var62, -1, -1);
            }
        } else if (class189.field2830 == arg1) {
            int var66 = class424.field6232.method2359((byte) -21);
            int var67 = var66 >> 2;
            int var68 = var66 & 0x3;
            int var69 = class423.field6228[var67];
            int var70 = class424.field6232.method2323(-43);
            int var71 = class424.field6232.method2359((byte) -21);
            int var72 = (var71 >> 4 & 0x7) + class386.field5689;
            int var73 = class105.field1412 + (var71 & 0x7);
            if (var72 >= 0 && var73 >= 0 && var72 < class115.field1522 && var73 < class198.field3004) {
                class379.method2284(0, var72, var67, var73, var68, 0, class220.field3358, var69, var70, -1);
            }
        } else if (class180.field2712 == arg1) {
            int var74 = class424.field6232.method2343(255);
            int var75 = (var74 >> 4 & 0xF) + class386.field5689 * 2;
            int var76 = class105.field1412 * 2 + (var74 & 0xF);
            int var77 = var75 + class424.field6232.method2341((byte) 54);
            int var78 = class424.field6232.method2341((byte) 54) + var76;
            int var79 = class424.field6232.method2327((byte) -116);
            int var80 = class424.field6232.method2327((byte) -116);
            int var81 = class424.field6232.method2323(-104);
            int var82 = class424.field6232.method2341((byte) 54);
            int var83 = class424.field6232.method2343(255) * 4;
            int var84 = class424.field6232.method2323(-17);
            int var85 = class424.field6232.method2323(-124);
            int var86 = class424.field6232.method2343(255);
            int var87 = class424.field6232.method2343(255);
            if (var86 == 255) {
                var86 = -1;
            }
            if (var75 >= 0 && var76 >= 0 && var75 < (class115.field1522 * 2) && var76 < class115.field1522 * 2 && var77 >= 0 && var78 >= 0 && (class198.field3004 * 2) > var77 && var78 < class198.field3004 * 2 && var81 != 65535) {
                int var88 = var78 * 64;
                int var89 = var77 * 64;
                int var90 = var75 * 64;
                int var91 = var76 * 64;
                if (var79 != 0) {
                    int var93;
                    class145 var95;
                    if (var79 >= 0) {
                        int var92 = var79 - 1;
                        var93 = var92 >> 11 & 0xF;
                        int var94 = var92 & 0x7FF;
                        var95 = class170.field2626[var94];
                    } else {
                        int var96 = -var79 - 1;
                        var93 = var96 >> 11 & 0xF;
                        int var97 = var96 & 0x7FF;
                        if (class386.field5703 == var97) {
                            var95 = class113.field1500;
                        } else {
                            var95 = class140.field1883[var97];
                        }
                    }
                    if (var95 != null) {
                        class433 var98 = var95.method902(26647);
                        if (var98.field6370 != null && var98.field6370[var93] != null) {
                            int var99 = var98.field6370[var93][0];
                            int var100 = var98.field6370[var93][2];
                            int var101 = var95.field1971.method2178(-14579);
                            int var102 = class110.field1450[var101];
                            int var103 = class110.field1452[var101];
                            int var104 = var99 * var103 + var100 * var102 >> 15;
                            int var105 = var100 * var103 - var99 * var102 >> 15;
                            var90 += var104;
                            var82 -= var98.field6370[var93][1];
                            var91 += var105;
                        }
                    }
                }
                class74 var107 = new class74(var81, class220.field3358, var90, var91, class437.method2686(class220.field3358, 0, var91, var90) - var82, class26.field332 + var84, class26.field332 + var85, var86, var87, var80, var83);
                var107.method485(var88, class437.method2686(class220.field3358, 0, var88, var89) - var83, var89, (byte) 84, class26.field332 + var84);
                class301.field4541.method2504(42, new class275(var107));
            }
        } else if (class466.field6863 == arg1) {
            class424.field6232.method2343(255);
            int var108 = class424.field6232.method2343(255);
            int var109 = ((var108 & 0x77) >> 4) + class386.field5689;
            int var110 = (var108 & 0x7) + class105.field1412;
            int var111 = class424.field6232.method2323(-4);
            int var112 = class424.field6232.method2343(255);
            int var113 = class424.field6232.method2382((byte) -109);
            String var114 = class424.field6232.method2332(79);
            class402.method2528(var112, var109, (byte) -37, var110, class220.field3358, var114, var113, var111);
        } else if (class333.field4970 == arg1) {
            int var115 = class424.field6232.method2343(255);
            int var116 = ((var115 & 0x73) >> 4) + class386.field5689;
            int var117 = (var115 & 0x7) + class105.field1412;
            int var118 = class424.field6232.method2323(-73);
            if (var118 == 65535) {
                var118 = -1;
            }
            int var119 = class424.field6232.method2343(255);
            int var120 = var119 >> 4 & 0xF;
            int var121 = var119 & 0x7;
            int var122 = class424.field6232.method2343(255);
            int var123 = class424.field6232.method2343(255);
            if (var116 >= 0 && var117 >= 0 && class115.field1522 > var116 && var117 < class198.field3004) {
                int var124 = var120 + 1;
                if (class113.field1500.field2019[0] >= (var116 - var124) && class113.field1500.field2019[0] <= var116 + var124 && class113.field1500.field2018[0] >= (var117 - var124) && (var117 + var124) >= class113.field1500.field2018[0] && client.field6666 != 0 && var121 > 0 && class5.field64 < 50 && var118 != -1) {
                    class177.field2688[class5.field64] = var118;
                    class174.field2664[class5.field64] = var121;
                    class38.field469[class5.field64] = var122;
                    class278.field4230[class5.field64] = null;
                    class20.field272[class5.field64] = (var117 << 8) + (class220.field3358 << 24) + (var116 << 16) + var120;
                    class438.field6445[class5.field64] = var123;
                    class5.field64++;
                }
            }
        } else if (class380.field5553 == arg1) {
            int var125 = class424.field6232.method2328(-74);
            int var126 = class424.field6232.method2335(-96);
            int var127 = class424.field6232.method2323(-82);
            int var128 = class424.field6232.method2351((byte) 118);
            int var129 = ((var128 & 0x7B) >> 4) + class386.field5689;
            int var130 = class105.field1412 + (var128 & 0x7);
            if (var129 >= 0 && var130 >= 0 && var129 < class115.field1522 && class198.field3004 > var130 && class386.field5703 != var127) {
                class118.method705(false, var129, new class146(var125, var126), class220.field3358, var130);
                class292.method1808(-71, var129, var130, class220.field3358);
            }
        } else if (class283.field4316 == arg1) {
            int var131 = class424.field6232.method2318(104);
            int var132 = class424.field6232.method2318(118);
            int var133 = class424.field6232.method2359((byte) -21);
            int var134 = class386.field5689 + (var133 >> 4 & 0x7);
            int var135 = (var133 & 0x7) + class105.field1412;
            if (var134 >= 0 && var135 >= 0 && class115.field1522 > var134 && class198.field3004 > var135) {
                class118.method705(false, var134, new class146(var131, var132), class220.field3358, var135);
                class292.method1808(-85, var134, var135, class220.field3358);
            }
        } else if (class140.field1880 == arg1) {
            int var136 = class424.field6232.method2323(-58);
            int var137 = class424.field6232.method2343(255);
            class411.method2575(0, var136).method550(var137, -1);
        } else if (class137.field1859 == arg1) {
            int var138 = class424.field6232.method2343(255);
            int var139 = class386.field5689 + ((var138 & 0x74) >> 4);
            int var140 = (var138 & 0x7) + class105.field1412;
            int var141 = class424.field6232.method2341((byte) 54) + var139;
            int var142 = class424.field6232.method2341((byte) 54) + var140;
            int var143 = class424.field6232.method2327((byte) -116);
            int var144 = class424.field6232.method2323(-127);
            int var145 = class424.field6232.method2343(255) * 4;
            int var146 = class424.field6232.method2343(255) * 4;
            int var147 = class424.field6232.method2323(-77);
            int var148 = class424.field6232.method2323(-49);
            int var149 = class424.field6232.method2343(255);
            int var150 = class424.field6232.method2343(255);
            if (var149 == 255) {
                var149 = -1;
            }
            if (var139 >= 0 && var140 >= 0 && var139 < class115.field1522 && var140 < class198.field3004 && var141 >= 0 && var142 >= 0 && class115.field1522 > var141 && var142 < class198.field3004 && var144 != 65535) {
                int var151 = var142 * 128 + 64;
                int var152 = var139 * 128 + 64;
                int var153 = var140 * 128 + 64;
                int var154 = var141 * 128 + 64;
                class74 var155 = new class74(var144, class220.field3358, var152, var153, class437.method2686(class220.field3358, 0, var153, var152) - var145, class26.field332 + var147, class26.field332 + var148, var149, var150, var143, var146);
                var155.method485(var151, class437.method2686(class220.field3358, 0, var151, var154) - var146, var154, (byte) 84, class26.field332 + var147);
                class301.field4541.method2504(42, new class275(var155));
            }
        } else if (class282.field4312 == arg1) {
            int var156 = class424.field6232.method2365(0);
            int var157 = (var156 >> 4 & 0x7) + class386.field5689;
            int var158 = class105.field1412 + (var156 & 0x7);
            int var159 = class424.field6232.method2335(115);
            if (var157 >= 0 && var158 >= 0 && var157 < class115.field1522 && class198.field3004 > var158) {
                class429 var160 = (class429) class45.field557.method2302((long) (var157 | var158 << 14 | class220.field3358 << 28), 23576);
                if (var160 != null) {
                    for (class146 var161 = (class146) var160.field6304.method2514((byte) 61); var161 != null; var161 = (class146) var160.field6304.method2511(78)) {
                        if ((var159 & 0x7FFF) == var161.field2025) {
                            var161.method625((byte) -50);
                            break;
                        }
                    }
                    if (var160.field6304.method2506(false)) {
                        var160.method625((byte) -50);
                    }
                    class292.method1808(-99, var157, var158, class220.field3358);
                }
            }
        } else {
            class288.method1783("T3 - " + arg1, (Throwable) null, 125);
            class77.method504((byte) 58);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2857(String[] arg0, int arg1) {
        field6829++;
        if (arg1 <= 93) {
            method2858(-112, -82, -23);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
    public static final boolean method2858(int arg0, int arg1, int arg2) {
        field6830++;
        class85 var3 = class411.method2575(0, arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg2 >= ~arg0 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method550(arg0, -1);
    }
}
