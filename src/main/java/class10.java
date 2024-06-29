import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class10 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ltl;")
    public static class59 field128 = class85.method639("Angreifen", 9588);

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Llj;")
    public static class5 field132 = null;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Ltl;")
    public static class59 field130 = class85.method639(")2", 9588);

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Ltl;")
    public static class59 field134 = class85.method639("scrollbar", 9588);

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 17)
    public static void method74(int arg0) {
        field132 = null;
        field130 = null;
        field128 = null;
        if (arg0 == 1) {
            field134 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZB)Loj;", line = 37)
    public static final class260 method75(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        field135++;
        int var7 = (arg0 << 17) + (arg4 ? 65536 : 0) + arg1 + (arg3 << 19);
        if (arg5 != -2) {
            return (class260) null;
        }
        long var8 = (long) arg2 * 3147483667L + (long) var7 * 3849834839L;
        class260 var10 = (class260) class138.field2280.method1483((byte) -74, var8);
        if (var10 != null) {
            return var10;
        }
        class298.field5097 = false;
        class260 var11 = class223.method1544(arg2, arg3, false, arg0, arg4, false, arg1, 77);
        if (var11 != null && !class298.field5097) {
            class138.field2280.method1488(var8, var11, arg5 ^ 0xFFFF9B10);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 80)
    public static final void method76(int arg0) {
        field129++;
        if (class200.field3313 == -1 || class170.field2753 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = ((class116.field1898 - class60.field936) * class268.field4659 >> 16) + class60.field936;
        int var3 = class262.field4361 * 2;
        class268.field4659 += var2;
        if (class268.field4659 >= 65535) {
            if (class260.field4339) {
                class9.field125 = false;
            } else {
                class9.field125 = true;
            }
            class268.field4659 = 65535;
            class260.field4339 = true;
        } else {
            class9.field125 = false;
            class260.field4339 = false;
        }
        float var4 = (float) class268.field4659 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class263.field4440[class200.field3313][var3][var5] * 3;
            int var7 = class263.field4440[class200.field3313][var3 + 1][var5] * 3;
            int var8 = (class263.field4440[class200.field3313][var3 + 2][var5] + class263.field4440[class200.field3313][var3 + 2][var5] - class263.field4440[class200.field3313][var3 + 3][var5]) * 3;
            int var9 = var7 - var6;
            int var10 = class263.field4440[class200.field3313][var3][var5];
            int var11 = class263.field4440[class200.field3313][var3 + 2][var5] + var7 - (var10 - -var8);
            int var12 = var8 + var6 - (var7 * 2);
            var1[var5] = (((float) var11 * var4 + (float) var12) * var4 + (float) var9) * var4 + (float) var10;
        }
        class226.field3640 = (int) var1[0] - (class197.field3249 * 128);
        class185.field3109 = (int) var1[1] * arg0;
        class216.field3528 = (int) var1[2] - (class187.field3135 * 128);
        float[] var13 = new float[3];
        int var14 = class255.field4233 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class263.field4440[class170.field2753][var14 + 1][var15] * 3;
            int var17 = class263.field4440[class170.field2753][var14][var15] * 3;
            int var18 = (class263.field4440[class170.field2753][var14 + 2][var15] + class263.field4440[class170.field2753][var14 + 2][var15] - class263.field4440[class170.field2753][var14 + 3][var15]) * 3;
            int var19 = var16 - var17;
            int var20 = class263.field4440[class170.field2753][var14][var15];
            int var21 = var17 + var18 - (var16 * 2);
            int var22 = class263.field4440[class170.field2753][var14 + 2][var15] + var16 - var20 - var18;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var19) * var4 + (float) var20;
        }
        float var23 = var13[0] - var1[0];
        float var24 = (var13[1] - var1[1]) * -1.0F;
        float var25 = var13[2] - var1[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class1.field1 = (float) Math.atan2((double) var24, var26);
        class100.field1629 = -((float) Math.atan2((double) var23, (double) var25));
        class58.field853 = (int) ((double) class100.field1629 * 325.949D) & 0x7FF;
        class100.field1627 = (int) ((double) class1.field1 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 182)
    public static final void method77(int arg0) {
        field131++;
        if (class151.field2485 == 183) {
            int var1 = class18.field236.method1221(114);
            int var2 = ((var1 & 0x74) >> 4) + class92.field1433;
            int var3 = class150.field2456 + (var1 & 0x7);
            int var4 = class18.field236.method1214(-18254);
            int var5 = class18.field236.method1221(118);
            int var6 = class18.field236.method1214(-18254);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var7 = var3 * 128 + 64;
                int var8 = var2 * 128 + 64;
                class116 var9 = new class116(var4, class247.field4119, var8, var7, class73.method589(class247.field4119, true, var8, var7) - var5, var6, class30.field420);
                class108.field1802.method532(74, new class255(var9));
            }
        } else if (class151.field2485 == 74) {
            int var10 = class18.field236.method1254(83);
            int var11 = class18.field236.method1246(-8);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var12 = var11 >> 2;
            int var13 = class202.field3341[var12];
            int var14 = class18.field236.method1246(-8);
            int var15 = (var14 & 0x7) + class150.field2456;
            int var16 = (var14 >> 4 & 0x7) + class92.field1433;
            int var17 = var11 & 0x3;
            class303.method2108(class247.field4119, var13, var15, var10, var12, var16, var17, -3547);
        } else if (class151.field2485 == 85) {
            int var130 = class18.field236.method1221(98);
            int var131 = var130 >> 2;
            int var132 = class202.field3341[var131];
            int var133 = var130 & 0x3;
            int var134 = class18.field236.method1223((byte) -119);
            int var135 = (var134 >> 4 & 0x7) + class92.field1433;
            int var136 = class150.field2456 + (var134 & 0x7);
            if (var135 >= 0 && var136 >= 0 && var135 < 104 && var136 < 104) {
                class305.method2112(var136, -1, class247.field4119, 0, var135, (byte) 95, var132, -1, var131, var133);
            }
        } else if (class151.field2485 == 39) {
            int var124 = class18.field236.method1254(127);
            int var125 = class18.field236.method1254(-123);
            int var126 = class18.field236.method1248(112);
            int var127 = (var126 >> 4 & 0x7) + class92.field1433;
            int var128 = class150.field2456 + (var126 & 0x7);
            if (var127 >= 0 && var128 >= 0 && var127 < 104 && var128 < 104) {
                class281 var129 = new class281();
                var129.field4845 = var124;
                var129.field4848 = var125;
                if (class159.field2604[class247.field4119][var127][var128] == null) {
                    class159.field2604[class247.field4119][var127][var128] = new class64();
                }
                class159.field2604[class247.field4119][var127][var128].method532(62, new class294(var129));
                class81.method620(var127, -7221, var128);
            }
        } else if (class151.field2485 == 18) {
            int var18 = class18.field236.method1221(126);
            int var19 = class92.field1433 + ((var18 & 0x7F) >> 4);
            int var20 = (var18 & 0x7) + class150.field2456;
            int var21 = class18.field236.method1214(-18254);
            int var22 = class18.field236.method1214(-18254);
            int var23 = class18.field236.method1214(-18254);
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class64 var24 = class159.field2604[class247.field4119][var19][var20];
                if (var24 != null) {
                    for (class294 var25 = (class294) var24.method536(2); var25 != null; var25 = (class294) var24.method533(24)) {
                        class281 var26 = var25.field5013;
                        if ((var21 & 0x7FFF) == var26.field4845 && var26.field4848 == var22) {
                            var26.field4848 = var23;
                            break;
                        }
                    }
                    class81.method620(var19, -7221, var20);
                }
            }
        } else {
            if (class151.field2485 == 50) {
                int var27 = class18.field236.method1214(-18254);
                int var28 = class18.field236.method1214(-18254);
                int var29 = class18.field236.method1254(91);
                byte var30 = class18.field236.method1251((byte) -12);
                byte var31 = class18.field236.method1205(-1);
                int var32 = class18.field236.method1226(23760);
                byte var33 = class18.field236.method1251((byte) -12);
                int var34 = class18.field236.method1223((byte) -114);
                int var35 = var34 >> 2;
                int var36 = var34 & 0x3;
                int var37 = class202.field3341[var35];
                int var38 = class18.field236.method1246(-8);
                int var39 = class150.field2456 + (var38 & 0x7);
                int var40 = class92.field1433 + ((var38 & 0x74) >> 4);
                byte var41 = class18.field236.method1205(-1);
                class102 var42;
                if (class155.field2537 == var27) {
                    var42 = class286.field4920;
                } else {
                    var42 = class211.field3438[var27];
                }
                if (!class55.field815 && var42 != null) {
                    class180 var43 = class188.method1390(var28, false);
                    int var44;
                    int var45;
                    if (var36 == 1 || var36 == 3) {
                        var45 = var43.field2976;
                        var44 = var43.field3006;
                    } else {
                        var44 = var43.field2976;
                        var45 = var43.field3006;
                    }
                    int var46 = (var45 >> 1) + var40;
                    int var47 = var39 + (var44 >> 1);
                    int var48 = (var45 + 1 >> 1) + var40;
                    int var49 = (var44 + 1 >> 1) + var39;
                    int[][] var50 = class97.field1558[class247.field4119];
                    int[][] var51 = (int[][]) null;
                    if (class247.field4119 < 3) {
                        var51 = class97.field1558[class247.field4119 + 1];
                    }
                    int var52 = var50[var46][var47] - (-var50[var46][var49] - var50[var48][var47] - var50[var48][var49]) >> 2;
                    int var53 = (var40 << 7) + (var45 << 6);
                    int var54 = (var39 << 7) + (var44 << 6);
                    class78 var55 = var43.method1326(var51, var43.field2953, (class5) null, var54, var35, false, var36, var53, 2978, var50, var52);
                    if (var55 != null) {
                        if (var41 > var31) {
                            byte var56 = var41;
                            var41 = var31;
                            var31 = var56;
                        }
                        class305.method2112(var39, -1, class247.field4119, var29 + 1, var40, (byte) 106, var37, var32 + 1, 0, 0);
                        var42.field1684 = var29 + class30.field420;
                        var42.field1694 = var52;
                        var42.field1668 = var40 * 128 + (var45 * 64);
                        var42.field1665 = var40 + var31;
                        var42.field1696 = var40 + var41;
                        var42.field1691 = var39 * 128 + var44 * 64;
                        var42.field1661 = class30.field420 + var32;
                        if (var30 < var33) {
                            byte var57 = var33;
                            var33 = var30;
                            var30 = var57;
                        }
                        var42.field1680 = var30 + var39;
                        var42.field1682 = var33 + var39;
                        var42.field1662 = (class57) var55.field1243;
                    }
                }
            }
            if (class151.field2485 == 107) {
                int var106 = class18.field236.method1221(82);
                int var107 = (var106 >> 4 & 0xF) + class92.field1433 * 2;
                int var108 = (var106 & 0xF) + class150.field2456 * 2;
                int var109 = class18.field236.method1205(-1) + var107;
                int var110 = var108 + class18.field236.method1205(-1);
                int var111 = class18.field236.method1210(-124);
                int var112 = class18.field236.method1214(-18254);
                int var113 = class18.field236.method1221(116) * 4;
                int var114 = class18.field236.method1221(96) * 4;
                int var115 = class18.field236.method1214(-18254);
                int var116 = class18.field236.method1214(-18254);
                int var117 = class18.field236.method1221(115);
                int var118 = class18.field236.method1221(101);
                if (var107 >= 0 && var108 >= 0 && var107 < 208 && var108 < 208 && var109 >= 0 && var110 >= 0 && var109 < 208 && var110 < 208 && var112 != 65535) {
                    int var119 = var108 * 64;
                    int var120 = var110 * 64;
                    int var121 = var109 * 64;
                    int var122 = var107 * 64;
                    class75 var123 = new class75(var112, class247.field4119, var122, var119, class73.method589(class247.field4119, true, var122, var119) - var113, var115 - -class30.field420, var116 + class30.field420, var117, var118, var111, var114);
                    var123.method596(-17427, class30.field420 + var115, -var114 + class73.method589(class247.field4119, true, var121, var120), var121, var120);
                    class178.field2913.method532(75, new class121(var123));
                }
            } else if (class151.field2485 == 214) {
                int var58 = class18.field236.method1221(114);
                int var59 = class92.field1433 + (var58 >> 4 & 0x7);
                int var60 = (var58 & 0x7) + class150.field2456;
                int var61 = var59 + class18.field236.method1205(-1);
                int var62 = var60 + class18.field236.method1205(-1);
                int var63 = class18.field236.method1210(-124);
                int var64 = class18.field236.method1214(-18254);
                int var65 = class18.field236.method1221(97) * 4;
                int var66 = class18.field236.method1221(121) * 4;
                int var67 = class18.field236.method1214(-18254);
                int var68 = class18.field236.method1214(-18254);
                int var69 = class18.field236.method1221(89);
                int var70 = class18.field236.method1221(81);
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && var64 != 65535) {
                    int var71 = var62 * 128 + 64;
                    int var72 = var59 * 128 + 64;
                    int var73 = var60 * 128 + 64;
                    int var74 = var61 * 128 + 64;
                    class75 var75 = new class75(var64, class247.field4119, var72, var73, class73.method589(class247.field4119, true, var72, var73) - var65, class30.field420 + var67, var68 + class30.field420, var69, var70, var63, var66);
                    var75.method596(-17427, class30.field420 + var67, -var66 + class73.method589(class247.field4119, true, var74, var71), var74, var71);
                    class178.field2913.method532(93, new class121(var75));
                }
            } else if (class151.field2485 == 153) {
                int var99 = class18.field236.method1226(23760);
                int var100 = class18.field236.method1226(23760);
                int var101 = class18.field236.method1221(117);
                int var102 = (var101 >> 4 & 0x7) + class92.field1433;
                int var103 = (var101 & 0x7) + class150.field2456;
                int var104 = class18.field236.method1214(-18254);
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104 && class155.field2537 != var100) {
                    class281 var105 = new class281();
                    var105.field4845 = var104;
                    var105.field4848 = var99;
                    if (class159.field2604[class247.field4119][var102][var103] == null) {
                        class159.field2604[class247.field4119][var102][var103] = new class64();
                    }
                    class159.field2604[class247.field4119][var102][var103].method532(109, new class294(var105));
                    class81.method620(var102, -7221, var103);
                }
            } else if (class151.field2485 == 81) {
                int var76 = class18.field236.method1223((byte) -128);
                int var77 = var76 & 0x3;
                int var78 = var76 >> 2;
                int var79 = class202.field3341[var78];
                int var80 = class18.field236.method1234(-128);
                int var81 = class18.field236.method1248(74);
                int var82 = (var81 >> 4 & 0x7) + class92.field1433;
                int var83 = class150.field2456 + (var81 & 0x7);
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                    class305.method2112(var83, var80, class247.field4119, 0, var82, (byte) 100, var79, -1, var78, var77);
                }
            } else if (class151.field2485 == 241) {
                int var90 = class18.field236.method1221(102);
                int var91 = ((var90 & 0x78) >> 4) + class92.field1433;
                int var92 = (var90 & 0x7) + class150.field2456;
                int var93 = class18.field236.method1214(-18254);
                if (var93 == 65535) {
                    var93 = -1;
                }
                int var94 = class18.field236.method1221(89);
                int var95 = var94 & 0x7;
                int var96 = class18.field236.method1221(126);
                int var97 = var94 >> 4 & 0xF;
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    int var98 = var97 + 1;
                    if ((var91 - var98) <= class286.field4920.field1729[0] && class286.field4920.field1729[0] <= (var91 + var98) && var92 - var98 <= class286.field4920.field1773[0] && (var92 + var98) >= class286.field4920.field1773[0] && class191.field3198 != 0 && var95 > 0 && class140.field2310 < 50 && var93 != -1) {
                        class216.field3530[class140.field2310] = var93;
                        class219.field3568[class140.field2310] = var95;
                        class232.field3817[class140.field2310] = var96;
                        class239.field3992[class140.field2310] = null;
                        class34.field503[class140.field2310] = (var91 << 16) + (var92 << 8) + var97;
                        class140.field2310++;
                    }
                }
            } else if (arg0 > 99 && class151.field2485 == 134) {
                int var84 = class18.field236.method1214(-18254);
                int var85 = class18.field236.method1223((byte) -122);
                int var86 = (var85 >> 4 & 0x7) + class92.field1433;
                int var87 = class150.field2456 + (var85 & 0x7);
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                    class64 var88 = class159.field2604[class247.field4119][var86][var87];
                    if (var88 != null) {
                        for (class294 var89 = (class294) var88.method536(2); var89 != null; var89 = (class294) var88.method533(24)) {
                            if ((var84 & 0x7FFF) == var89.field5013.field4845) {
                                var89.method2000(125);
                                break;
                            }
                        }
                        if (var88.method536(2) == null) {
                            class159.field2604[class247.field4119][var86][var87] = null;
                        }
                        class81.method620(var86, -7221, var87);
                    }
                }
            }
        }
    }
}
