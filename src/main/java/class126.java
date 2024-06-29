import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class126 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lv;")
    public static class146 field2923 = class159.method1226((byte) -37, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field2925 = 0;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field2926 = 1;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lv;")
    public static class146 field2916 = class159.method1226((byte) -37, "scape main");

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "J")
    public static long field2921;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    public static int[] field2915;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[[S")
    public static short[][] field2918;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILlc;III)V")
    public static final void method938(int arg0, class79 arg1, int arg2, int arg3, int arg4) {
        field2924++;
        if (class13.field208 >= 400) {
            return;
        }
        if (arg1.field1935 != null) {
            arg1 = arg1.method603(false);
        }
        if (arg1 == null || !arg1.field1911) {
            return;
        }
        class146 var5 = arg1.field1923;
        if (arg1.field1906 != 0) {
            var5 = class71.method509(new class146[] { var5, class140.method1049(arg1.field1906, arg2 ^ 0x6B, class116.field2696.field1532), class30.field621, class18.field294, class75.method564(false, arg1.field1906), class116.field2718 }, (byte) 123);
        }
        if (class47.field1087 == 1) {
            class95.method742(arg2 + 245, 16, arg0, arg3, arg4, class88.field2091, class71.method509(new class146[] { class59.field1359, class105.field2521, var5 }, (byte) -112));
            class116.field2707++;
        } else if (!class22.field367) {
            class40.field887++;
            class146[] var6 = arg1.field1949;
            if (class67.field1528) {
                var6 = class75.method563((byte) -116, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method1111(class124.field2873, -41)) {
                        class52.field1179++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 40;
                        }
                        if (var7 == 1) {
                            var8 = 21;
                        }
                        if (var7 == 2) {
                            var8 = 37;
                        }
                        if (var7 == 3) {
                            var8 = 5;
                        }
                        if (var7 == 4) {
                            var8 = 35;
                        }
                        class95.method742(255, var8, arg0, arg3, arg4, var6[var7], class71.method509(new class146[] { class6.field144, var5 }, (byte) -81));
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1111(class124.field2873, -41)) {
                        class143.field3274++;
                        short var10 = 0;
                        if (class116.field2696.field1532 < arg1.field1906) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 40;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 21;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 37;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 5;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 35;
                        }
                        class95.method742(255, var11, arg0, arg3, arg4, var6[var9], class71.method509(new class146[] { class6.field144, var5 }, (byte) -113));
                    }
                }
            }
            class95.method742(255, 1003, arg0, arg3, arg4, class155.field3536, class71.method509(new class146[] { class6.field144, var5 }, (byte) 125));
        } else if ((class142.field3241 & 0x2) == 2) {
            class117.field2735++;
            class95.method742(255, 1, arg0, arg3, arg4, class122.field2850, class71.method509(new class146[] { class140.field3206, class105.field2521, var5 }, (byte) -103));
        }
        if (arg2 != 10) {
            method938(14, null, 28, -104, 7);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method939(int arg0) {
        field2915 = null;
        field2916 = null;
        if (arg0 > -45) {
            method940(true);
        }
        field2918 = null;
        field2923 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method940(boolean arg0) {
        field2919++;
        if (class58.field1301 == 70) {
            int var1 = class29.field597.method790((byte) 73);
            int var2 = (var1 >> 4 & 0x7) + class98.field2372;
            int var3 = (var1 & 0x7) + class49.field1133;
            int var4 = var2 + class29.field597.method770((byte) -124);
            int var5 = var3 + class29.field597.method770((byte) -113);
            int var6 = class29.field597.method765(65280);
            int var7 = class29.field597.method795(1);
            int var8 = class29.field597.method790((byte) 73) * 4;
            int var9 = class29.field597.method790((byte) 73) * 4;
            int var10 = class29.field597.method795(1);
            int var11 = class29.field597.method795(1);
            int var12 = class29.field597.method790((byte) 73);
            int var13 = class29.field597.method790((byte) 73);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var2 * 128 + 64;
                int var15 = var5 * 128 + 64;
                int var16 = var3 * 128 + 64;
                int var17 = var4 * 128 + 64;
                class44 var18 = new class44(var7, class148.field3428, var14, var16, class79.method612(class148.field3428, var14, var16, false) - var8, class94.field2229 + var10, var11 + class94.field2229, var12, var13, var6, var9);
                var18.method296(var15, class94.field2229 + var10, var17, (byte) 125, class79.method612(class148.field3428, var17, var15, false) - var9);
                class79.field1939.method1136(var18, false);
            }
        } else if (class58.field1301 == 234) {
            int var19 = class29.field597.method790((byte) 73);
            int var20 = (var19 & 0x7) + class49.field1133;
            int var21 = (var19 >> 4 & 0x7) + class98.field2372;
            int var22 = class29.field597.method795(1);
            int var23 = class29.field597.method795(1);
            int var24 = class29.field597.method795(1);
            if (var21 >= 0 && var20 >= 0 && var21 < 104 && var20 < 104) {
                class152 var25 = class148.field3434[class148.field3428][var21][var20];
                if (var25 != null) {
                    for (class54 var26 = (class54) var25.method1138(25852); var26 != null; var26 = (class54) var25.method1142(1)) {
                        if ((var22 & 0x7FFF) == var26.field1248 && var26.field1251 == var23) {
                            var26.field1251 = var24;
                            break;
                        }
                    }
                    class118.method900((byte) 73, var21, var20);
                }
            }
        } else if (class58.field1301 == 21) {
            int var27 = class29.field597.method790((byte) 73);
            int var28 = (var27 >> 4 & 0x7) + class98.field2372;
            int var29 = (var27 & 0x7) + class49.field1133;
            int var30 = class29.field597.method784(false);
            int var31 = class29.field597.method790((byte) 73);
            int var32 = var31 & 0x3;
            int var33 = var31 >> 2;
            int var34 = class70.field1629[var33];
            if (var28 >= 0 && var29 >= 0 && var28 < 103 && var29 < 103) {
                if (var34 == 0) {
                    class136 var35 = class66.field1496.method1214(class148.field3428, var28, var29);
                    if (var35 != null) {
                        int var36 = var35.field3095 >> 14 & 0x7FFF;
                        if (var33 == 2) {
                            var35.field3089 = new class138(var36, 2, var32 + 4, class148.field3428, var28, var29, var30, false, var35.field3089);
                            var35.field3091 = new class138(var36, 2, var32 + 1 & 0x3, class148.field3428, var28, var29, var30, false, var35.field3091);
                        } else {
                            var35.field3089 = new class138(var36, var33, var32, class148.field3428, var28, var29, var30, false, var35.field3089);
                        }
                    }
                }
                if (var34 == 1) {
                    class64 var37 = class66.field1496.method1174(class148.field3428, var28, var29);
                    if (var37 != null) {
                        int var38 = var37.field1435 >> 14 & 0x7FFF;
                        if (var33 == 4 || var33 == 5) {
                            var37.field1442 = new class138(var38, 4, var32, class148.field3428, var28, var29, var30, false, var37.field1442);
                        } else if (var33 == 6) {
                            var37.field1442 = new class138(var38, 4, var32 + 4, class148.field3428, var28, var29, var30, false, var37.field1442);
                        } else if (var33 == 7) {
                            var37.field1442 = new class138(var38, 4, (var32 + 2 & 0x3) + 4, class148.field3428, var28, var29, var30, false, var37.field1442);
                        } else if (var33 == 8) {
                            var37.field1442 = new class138(var38, 4, var32 + 4, class148.field3428, var28, var29, var30, false, var37.field1442);
                            var37.field1441 = new class138(var38, 4, (var32 + 2 & 0x3) + 4, class148.field3428, var28, var29, var30, false, var37.field1441);
                        }
                    }
                }
                if (var34 == 2) {
                    if (var33 == 11) {
                        var33 = 10;
                    }
                    class89 var39 = class66.field1496.method1186(class148.field3428, var28, var29);
                    if (var39 != null) {
                        var39.field2094 = new class138(var39.field2104 >> 14 & 0x7FFF, var33, var32, class148.field3428, var28, var29, var30, false, var39.field2094);
                    }
                }
                if (var34 == 3) {
                    class88 var40 = class66.field1496.method1206(class148.field3428, var28, var29);
                    if (var40 != null) {
                        var40.field2076 = new class138(var40.field2086 >> 14 & 0x7FFF, 22, var32, class148.field3428, var28, var29, var30, false, var40.field2076);
                    }
                }
            }
        } else if (class58.field1301 == 138) {
            int var41 = class29.field597.method795(1);
            int var42 = class29.field597.method790((byte) 73);
            int var43 = class98.field2372 + (var42 >> 4 & 0x7);
            int var44 = (var42 & 0x7) + class49.field1133;
            int var45 = class29.field597.method780(7335);
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                class54 var46 = new class54();
                var46.field1248 = var41;
                var46.field1251 = var45;
                if (class148.field3434[class148.field3428][var43][var44] == null) {
                    class148.field3434[class148.field3428][var43][var44] = new class152();
                }
                class148.field3434[class148.field3428][var43][var44].method1136(var46, false);
                class118.method900((byte) 73, var43, var44);
            }
        } else if (class58.field1301 == 46) {
            int var47 = class29.field597.method790((byte) 73);
            int var48 = class49.field1133 + (var47 & 0x7);
            int var49 = (var47 >> 4 & 0x7) + class98.field2372;
            int var50 = class29.field597.method787((byte) -71);
            int var51 = var50 & 0x3;
            int var52 = var50 >> 2;
            int var53 = class70.field1629[var52];
            if (var49 >= 0 && var48 >= 0 && var49 < 104 && var48 < 104) {
                class153.method1153(5, var51, class148.field3428, var53, var48, -1, 0, -1, var49, var52);
            }
        } else if (class58.field1301 == 107) {
            int var54 = class29.field597.method785((byte) 45);
            int var55 = (var54 & 0x7) + class49.field1133;
            int var56 = (var54 >> 4 & 0x7) + class98.field2372;
            int var57 = class29.field597.method780(7335);
            if (var56 >= 0 && var55 >= 0 && var56 < 104 && var55 < 104) {
                class152 var58 = class148.field3434[class148.field3428][var56][var55];
                if (var58 != null) {
                    for (class54 var59 = (class54) var58.method1138(25852); var59 != null; var59 = (class54) var58.method1142(1)) {
                        if ((var57 & 0x7FFF) == var59.field1248) {
                            var59.method217(-1264);
                            break;
                        }
                    }
                    if (var58.method1138(25852) == null) {
                        class148.field3434[class148.field3428][var56][var55] = null;
                    }
                    class118.method900((byte) 73, var56, var55);
                }
            }
        } else if (class58.field1301 == 114) {
            int var60 = class29.field597.method787((byte) -72);
            int var61 = var60 >> 2;
            int var62 = var60 & 0x3;
            int var63 = class70.field1629[var61];
            int var64 = class29.field597.method754((byte) -49);
            int var65 = class29.field597.method785((byte) 127);
            int var66 = (var65 >> 4 & 0x7) + class98.field2372;
            int var67 = (var65 & 0x7) + class49.field1133;
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                class153.method1153(5, var62, class148.field3428, var63, var67, var64, 0, -1, var66, var61);
            }
        } else {
            if (class58.field1301 == 92) {
                int var68 = class29.field597.method780(7335);
                byte var69 = class29.field597.method767(-1);
                int var70 = class29.field597.method780(7335);
                int var71 = class29.field597.method754((byte) -49);
                byte var72 = class29.field597.method744(-112);
                int var73 = class29.field597.method790((byte) 73);
                int var74 = var73 >> 2;
                int var75 = var73 & 0x3;
                int var76 = class70.field1629[var74];
                byte var77 = class29.field597.method744(-46);
                byte var78 = class29.field597.method767(-1);
                int var79 = class29.field597.method785((byte) 126);
                int var80 = (var79 & 0x7) + class49.field1133;
                int var81 = (var79 >> 4 & 0x7) + class98.field2372;
                int var82 = class29.field597.method754((byte) -49);
                class67 var83;
                if (class49.field1135 == var68) {
                    var83 = class116.field2696;
                } else {
                    var83 = class125.field2902[var68];
                }
                if (var83 != null) {
                    class69 var84 = class124.method928(-1, var71);
                    int var85;
                    int var86;
                    if (var75 == 1 || var75 == 3) {
                        var86 = var84.field1597;
                        var85 = var84.field1584;
                    } else {
                        var85 = var84.field1597;
                        var86 = var84.field1584;
                    }
                    int var87 = var80 + (var85 + 1 >> 1);
                    int var88 = var80 + (var85 >> 1);
                    int var89 = (var86 + 1 >> 1) + var81;
                    int[][] var90 = class78.field1891[class148.field3428];
                    int var91 = (var81 << 7) + (var86 << 6);
                    int var92 = (var86 >> 1) + var81;
                    int var93 = var90[var89][var88] + var90[var92][var88] + var90[var89][var87] + var90[var92][var87] >> 2;
                    int var94 = (var80 << 7) + (var85 << 6);
                    class139 var95 = var84.method499(var91, -50, var90, var75, var94, var74, var93);
                    if (var95 != null) {
                        if (var77 > var69) {
                            byte var96 = var77;
                            var77 = var69;
                            var69 = var96;
                        }
                        class153.method1153(5, 0, class148.field3428, var76, var80, -1, var82 + 1, var70 + 1, var81, 0);
                        var83.field1501 = var77 + var81;
                        var83.field1534 = class94.field2229 + var82;
                        if (var72 > var78) {
                            byte var97 = var72;
                            var72 = var78;
                            var78 = var97;
                        }
                        var83.field1508 = var93;
                        var83.field1502 = var69 + var81;
                        var83.field1511 = var81 * 128 + var86 * 64;
                        var83.field1510 = var95;
                        var83.field1520 = var80 * 128 + var85 * 64;
                        var83.field1509 = class94.field2229 + var70;
                        var83.field1499 = var72 + var80;
                        var83.field1540 = var78 + var80;
                    }
                }
            }
            if (class58.field1301 == 108) {
                int var98 = class29.field597.method790((byte) 73);
                int var99 = (var98 & 0x7) + class49.field1133;
                int var100 = (var98 >> 4 & 0x7) + class98.field2372;
                int var101 = class29.field597.method795(1);
                int var102 = class29.field597.method790((byte) 73);
                int var103 = var102 & 0x7;
                int var104 = var102 >> 4 & 0xF;
                int var105 = class29.field597.method790((byte) 73);
                if (var100 >= 0 && var99 >= 0 && var100 < 104 && var99 < 104) {
                    int var106 = var104 + 1;
                    if (class116.field2696.field788[0] >= var100 - var106 && var100 + var106 >= class116.field2696.field788[0] && class116.field2696.field738[0] >= var99 - var106 && var99 + var106 >= class116.field2696.field738[0] && class44.field1001 != 0 && var103 > 0 && class76.field1806 < 50) {
                        class81.field1964[class76.field1806] = var101;
                        class98.field2381[class76.field1806] = var103;
                        class77.field1859[class76.field1806] = var105;
                        class81.field1967[class76.field1806] = null;
                        class60.field1406[class76.field1806] = (var99 << 8) + (var100 << 16) + var104;
                        class76.field1806++;
                    }
                }
            }
            if (!arg0) {
                if (class58.field1301 == 109) {
                    int var107 = class29.field597.method790((byte) 73);
                    int var108 = class98.field2372 + (var107 >> 4 & 0x7);
                    int var109 = class49.field1133 + (var107 & 0x7);
                    int var110 = class29.field597.method795(1);
                    int var111 = class29.field597.method790((byte) 73);
                    int var112 = class29.field597.method795(1);
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        int var113 = var108 * 128 + 64;
                        int var114 = var109 * 128 + 64;
                        class82 var115 = new class82(var110, class148.field3428, var113, var114, class79.method612(class148.field3428, var113, var114, false) - var111, var112, class94.field2229);
                        class108.field2578.method1136(var115, arg0);
                    }
                } else if (class58.field1301 == 187) {
                    int var116 = class29.field597.method787((byte) -102);
                    int var117 = class98.field2372 + (var116 >> 4 & 0x7);
                    int var118 = class49.field1133 + (var116 & 0x7);
                    int var119 = class29.field597.method795(1);
                    int var120 = class29.field597.method780(7335);
                    int var121 = class29.field597.method795(1);
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && class49.field1135 != var119) {
                        class54 var122 = new class54();
                        var122.field1248 = var121;
                        var122.field1251 = var120;
                        if (class148.field3434[class148.field3428][var117][var118] == null) {
                            class148.field3434[class148.field3428][var117][var118] = new class152();
                        }
                        class148.field3434[class148.field3428][var117][var118].method1136(var122, arg0);
                        class118.method900((byte) 73, var117, var118);
                    }
                }
            }
        }
    }
}
