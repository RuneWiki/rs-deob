import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class51 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    public static boolean field785 = false;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Lce;")
    public static class126 field786 = class206.method1445(-7923, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 19)
    public static final void method322(byte arg0) {
        field782++;
        if (class122.field2051 == 92) {
            int var130 = class227.field3834.method932(arg0 ^ 0x62);
            int var131 = class227.field3834.method942(true);
            int var132 = class227.field3834.method966(103);
            int var133 = class224.field3777 + (var132 & 0x7);
            int var134 = class124.field2102 + ((var132 & 0x75) >> 4);
            int var135 = class227.field3834.method982((byte) 102);
            if (var134 >= 0 && var133 >= 0 && var134 < 104 && var133 < 104 && class11.field145 != var135) {
                class227 var136 = new class227();
                var136.field3824 = var130;
                var136.field3826 = var131;
                if (class89.field1388[class131.field2250][var134][var133] == null) {
                    class89.field1388[class131.field2250][var134][var133] = new class129();
                }
                class89.field1388[class131.field2250][var134][var133].method899(new class81(var136), -28);
                class213.method1480(108, var134, var133);
            }
        } else if (class122.field2051 == 128) {
            int var121 = class227.field3834.method948(-122);
            int var122 = (var121 & 0x7) + class224.field3777;
            int var123 = (var121 >> 4 & 0x7) + class124.field2102;
            int var124 = class227.field3834.method942(true);
            int var125 = class227.field3834.method948(-127);
            int var126 = class227.field3834.method942(true);
            if (var123 >= 0 && var122 >= 0 && var123 < 104 && var122 < 104) {
                int var127 = var123 * 128 + 64;
                int var128 = var122 * 128 + 64;
                class238 var129 = new class238(var124, class131.field2250, var127, var128, class174.method1265(var128, 8100, class131.field2250, var127) - var125, var126, class249.field4174);
                class63.field1037.method899(new class288(var129), -28);
            }
        } else if (class122.field2051 == 139) {
            int var1 = class227.field3834.method948(arg0 ^ 0xFFFFFFBC);
            int var2 = class224.field3777 + (var1 & 0x7);
            int var3 = ((var1 & 0x70) >> 4) + class124.field2102;
            int var4 = class227.field3834.method942(true);
            int var5 = class227.field3834.method948(-125);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = class227.field3834.method948(-122);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var9 = var6 + 1;
                if (class286.field4744.field2460[0] >= (var3 - var9) && class286.field4744.field2460[0] <= var3 + var9 && class286.field4744.field2471[0] >= (var2 - var9) && class286.field4744.field2471[0] <= var2 + var9 && class205.field3523 != 0 && var7 > 0 && class282.field4683 < 50 && var4 != -1) {
                    class91.field1428[class282.field4683] = var4;
                    class280.field4658[class282.field4683] = var7;
                    class160.field2902[class282.field4683] = var8;
                    class291.field4826[class282.field4683] = null;
                    class318.field5445[class282.field4683] = (var3 << 16) + (var2 << 8) + var6;
                    class282.field4683++;
                }
            }
        } else if (class122.field2051 == 38) {
            int var10 = class227.field3834.method928((byte) -16);
            int var11 = (var10 & 0x7) + class224.field3777;
            int var12 = class124.field2102 + (var10 >> 4 & 0x7);
            int var13 = class227.field3834.method982((byte) 86);
            if (var12 >= 0 && var11 >= 0 && var12 < 104 && var11 < 104) {
                class129 var14 = class89.field1388[class131.field2250][var12][var11];
                if (var14 != null) {
                    for (class81 var15 = (class81) var14.method898((byte) -71); var15 != null; var15 = (class81) var14.method893((byte) -107)) {
                        if ((var13 & 0x7FFF) == var15.field1303.field3826) {
                            var15.method499((byte) 64);
                            break;
                        }
                    }
                    if (var14.method898((byte) -113) == null) {
                        class89.field1388[class131.field2250][var12][var11] = null;
                    }
                    class213.method1480(arg0 ^ 0x6B, var12, var11);
                }
            }
        } else if (class122.field2051 == 63) {
            int var16 = class227.field3834.method948(-122);
            int var17 = ((var16 & 0xF5) >> 4) + class124.field2102 * 2;
            int var18 = (var16 & 0xF) + class224.field3777 * 2;
            int var19 = class227.field3834.method977(19773) + var17;
            int var20 = var18 + class227.field3834.method977(19773);
            int var21 = class227.field3834.method931((byte) 57);
            int var22 = class227.field3834.method942(true);
            int var23 = class227.field3834.method948(-122) * 4;
            int var24 = class227.field3834.method948(-123) * 4;
            int var25 = class227.field3834.method942(true);
            int var26 = class227.field3834.method942(true);
            int var27 = class227.field3834.method948(arg0 - 189);
            int var28 = class227.field3834.method948(arg0 ^ 0xFFFFFFB8);
            if (var17 >= 0 && var18 >= 0 && var17 < 208 && var18 < 208 && var19 >= 0 && var20 >= 0 && var19 < 208 && var20 < 208 && var22 != 65535) {
                int var29 = var17 * 64;
                int var30 = var20 * 64;
                int var31 = var19 * 64;
                int var32 = var18 * 64;
                class59 var33 = new class59(var22, class131.field2250, var29, var32, class174.method1265(var32, 8100, class131.field2250, var29) - var23, var25 - -class249.field4174, var26 + class249.field4174, var27, var28, var21, var24);
                var33.method409(class249.field4174 + var25, -var24 + class174.method1265(var30, 8100, class131.field2250, var31), arg0 - 44, var30, var31);
                class203.field3483.method899(new class297(var33), -28);
            }
        } else if (class122.field2051 == 116) {
            int var112 = class227.field3834.method948(-125);
            int var113 = (var112 & 0x7) + class224.field3777;
            int var114 = ((var112 & 0x7F) >> 4) + class124.field2102;
            int var115 = class227.field3834.method942(true);
            int var116 = class227.field3834.method942(true);
            int var117 = class227.field3834.method942(true);
            if (var114 >= 0 && var113 >= 0 && var114 < 104 && var113 < 104) {
                class129 var118 = class89.field1388[class131.field2250][var114][var113];
                if (var118 != null) {
                    for (class81 var119 = (class81) var118.method898((byte) -118); var119 != null; var119 = (class81) var118.method893((byte) 71)) {
                        class227 var120 = var119.field1303;
                        if ((var115 & 0x7FFF) == var120.field3826 && var120.field3824 == var116) {
                            var120.field3824 = var117;
                            break;
                        }
                    }
                    class213.method1480(84, var114, var113);
                }
            }
        } else if (class122.field2051 == 79) {
            int var34 = class227.field3834.method971(-103);
            int var35 = class227.field3834.method951(-1);
            int var36 = class224.field3777 + (var35 & 0x7);
            int var37 = (var35 >> 4 & 0x7) + class124.field2102;
            int var38 = class227.field3834.method932(52);
            if (var37 >= 0 && var36 >= 0 && var37 < 104 && var36 < 104) {
                class227 var39 = new class227();
                var39.field3824 = var38;
                var39.field3826 = var34;
                if (class89.field1388[class131.field2250][var37][var36] == null) {
                    class89.field1388[class131.field2250][var37][var36] = new class129();
                }
                class89.field1388[class131.field2250][var37][var36].method899(new class81(var39), arg0 - 90);
                class213.method1480(121, var37, var36);
            }
        } else {
            if (class122.field2051 == 12) {
                int var40 = class227.field3834.method971(96);
                int var41 = class227.field3834.method942(true);
                byte var42 = class227.field3834.method969((byte) 45);
                int var43 = class227.field3834.method971(-18);
                byte var44 = class227.field3834.method965(false);
                byte var45 = class227.field3834.method963((byte) 67);
                byte var46 = class227.field3834.method963((byte) 51);
                int var47 = class227.field3834.method951(-1);
                int var48 = var47 >> 2;
                int var49 = class132.field2266[var48];
                int var50 = var47 & 0x3;
                int var51 = class227.field3834.method951(-1);
                int var52 = class124.field2102 + ((var51 & 0x74) >> 4);
                int var53 = (var51 & 0x7) + class224.field3777;
                int var54 = class227.field3834.method971(68);
                class301 var55;
                if (class11.field145 == var41) {
                    var55 = class286.field4744;
                } else {
                    var55 = class85.field1352[var41];
                }
                if (!class56.field846 && var55 != null) {
                    class265 var56 = class185.method1338(var54, -7153);
                    int var57;
                    int var58;
                    if (var50 == 1 || var50 == 3) {
                        var58 = var56.field4474;
                        var57 = var56.field4452;
                    } else {
                        var57 = var56.field4474;
                        var58 = var56.field4452;
                    }
                    int var59 = var53 + (var58 + 1 >> 1);
                    int var60 = (var57 >> 1) + var52;
                    int[][] var61 = class264.field4396[class131.field2250];
                    int var62 = (var58 >> 1) + var53;
                    int[][] var63 = (int[][]) null;
                    if (class131.field2250 < 3) {
                        var63 = class264.field4396[class131.field2250 + 1];
                    }
                    int var64 = var52 + (var57 + 1 >> 1);
                    int var65 = var61[var60][var62] + var61[var64][var62] + var61[var64][var59] + var61[var60][var59] >> 2;
                    int var66 = (var53 << 7) + (var58 << 6);
                    int var67 = (var52 << 7) + (var57 << 6);
                    class21 var68 = var56.method1785(var50, var65, false, var67, -114, var61, var48, var63, var66, var56.field4487, (class2) null);
                    if (var68 != null) {
                        class193.method1371(0, arg0 ^ 0x66, 0, -1, class131.field2250, var52, var53, var49, var40 + 1, var43 - -1);
                        var55.field5018 = var53 * 128 + var58 * 64;
                        if (var46 < var45) {
                            byte var69 = var45;
                            var45 = var46;
                            var46 = var69;
                        }
                        var55.field5012 = var52 + var45;
                        var55.field4998 = class249.field4174 + var40;
                        var55.field5017 = var52 * 128 + var57 * 64;
                        var55.field4994 = class249.field4174 + var43;
                        if (var44 < var42) {
                            byte var70 = var42;
                            var42 = var44;
                            var44 = var70;
                        }
                        var55.field4996 = var46 + var52;
                        var55.field5021 = var65;
                        var55.field4980 = (class196) var68.field283;
                        var55.field5011 = var53 + var44;
                        var55.field5014 = var53 + var42;
                    }
                }
            }
            if (class122.field2051 == 15) {
                int var105 = class227.field3834.method928((byte) -14);
                int var106 = (var105 & 0x7) + class224.field3777;
                int var107 = class124.field2102 + (var105 >> 4 & 0x7);
                int var108 = class227.field3834.method948(-126);
                int var109 = var108 & 0x3;
                int var110 = var108 >> 2;
                int var111 = class132.field2266[var110];
                if (var107 >= 0 && var106 >= 0 && var107 < 104 && var106 < 104) {
                    class193.method1371(var109, 102, var110, -1, class131.field2250, var107, var106, var111, 0, -1);
                }
            } else if (class122.field2051 == 42) {
                int var71 = class227.field3834.method948(-128);
                int var72 = (var71 >> 4 & 0x7) + class124.field2102;
                int var73 = (var71 & 0x7) + class224.field3777;
                int var74 = class227.field3834.method977(19773) + var72;
                int var75 = class227.field3834.method977(19773) + var73;
                int var76 = class227.field3834.method931((byte) 63);
                int var77 = class227.field3834.method942(true);
                int var78 = class227.field3834.method948(-125) * 4;
                int var79 = class227.field3834.method948(arg0 - 190) * 4;
                int var80 = class227.field3834.method942(true);
                int var81 = class227.field3834.method942(true);
                int var82 = class227.field3834.method948(-123);
                int var83 = class227.field3834.method948(-125);
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104 && var77 != 65535) {
                    int var84 = var74 * 128 + 64;
                    int var85 = var72 * 128 + 64;
                    int var86 = var73 * 128 + 64;
                    int var87 = var75 * 128 + 64;
                    class59 var88 = new class59(var77, class131.field2250, var85, var86, class174.method1265(var86, 8100, class131.field2250, var85) - var78, class249.field4174 + var80, class249.field4174 + var81, var82, var83, var76, var79);
                    var88.method409(class249.field4174 + var80, class174.method1265(var87, 8100, class131.field2250, var84) - var79, -91, var87, var84);
                    class203.field3483.method899(new class297(var88), -28);
                }
            } else {
                if (arg0 != 62) {
                    field786 = (class126) null;
                }
                if (class122.field2051 == 99) {
                    int var97 = class227.field3834.method928((byte) -60);
                    int var98 = (var97 & 0x7) + class224.field3777;
                    int var99 = ((var97 & 0x7D) >> 4) + class124.field2102;
                    int var100 = class227.field3834.method971(-105);
                    int var101 = class227.field3834.method951(-1);
                    int var102 = var101 & 0x3;
                    int var103 = var101 >> 2;
                    if (var100 == 65535) {
                        var100 = -1;
                    }
                    int var104 = class132.field2266[var103];
                    class84.method592(var100, var102, var98, -104, var99, var104, class131.field2250, var103);
                } else if (class122.field2051 == 156) {
                    int var89 = class227.field3834.method942(true);
                    int var90 = class227.field3834.method966(26);
                    int var91 = ((var90 & 0x7E) >> 4) + class124.field2102;
                    int var92 = (var90 & 0x7) + class224.field3777;
                    int var93 = class227.field3834.method966(110);
                    int var94 = var93 & 0x3;
                    int var95 = var93 >> 2;
                    int var96 = class132.field2266[var95];
                    if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                        class193.method1371(var94, 92, var95, var89, class131.field2250, var91, var92, var96, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lqk;", line = 583)
    public static final class8 method323(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class8 var4 = var3.field52;
            var3.field52 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 595)
    public static void method324(int arg0) {
        if (arg0 == -9196) {
            field786 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V", line = 607)
    public static final void method325(int arg0, int arg1, int arg2) {
        if (arg2 != 26604) {
            return;
        }
        if (arg0 == 4 && !class40.field640) {
            arg1 = 2;
            arg0 = 2;
        }
        field784++;
        if (class224.field3787 != arg0) {
            if (class182.field3165) {
                return;
            }
            if (class224.field3787 != 0) {
                class24.field351[class224.field3787].method23();
            }
            if (arg0 != 0) {
                class215 var3 = class24.field351[arg0];
                var3.method18();
                var3.method21(arg1);
            }
            class224.field3787 = arg0;
            class206.field3527 = arg1;
        } else if (arg0 != 0 && class206.field3527 != arg1) {
            class24.field351[arg0].method21(arg1);
            class206.field3527 = arg1;
        }
    }
}
