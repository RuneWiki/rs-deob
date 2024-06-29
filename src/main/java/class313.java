import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class313 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field5384;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field5385;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lke;")
    public static class256 field5389 = class316.method2202("classement ", 27626);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[I")
    public static int[] field5382 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lke;")
    public static class256 field5391 = class316.method2202(" )2> <col=ff9040>", 27626);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lke;")
    public static class256 field5395 = class316.method2202("cyan:", 27626);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
    public static int[] field5390;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "[I")
    public static int[] field5392;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[[[B")
    public static byte[][][] field5396;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 19)
    public static void method2167(int arg0) {
        field5396 = (byte[][][]) null;
        field5390 = null;
        field5391 = null;
        field5389 = null;
        int var1 = -56 / ((-arg0 - 6) / 60);
        field5382 = null;
        field5392 = null;
        field5395 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 58)
    public static final void method2168(int arg0) {
        field5394++;
        if (arg0 != 1444607457) {
            return;
        }
        if (class9.field141 == 131) {
            int var130 = class23.field302.method314(true);
            int var131 = class23.field302.method310((byte) 100);
            int var132 = class23.field302.method315(-81);
            int var133 = ((var132 & 0x73) >> 4) + class41.field797;
            int var134 = class305.field5278 + (var132 & 0x7);
            int var135 = class23.field302.method346(-16);
            if (var133 >= 0 && var134 >= 0 && var133 < 104 && var134 < 104 && class104.field1852 != var130) {
                class143 var136 = new class143();
                var136.field2508 = var131;
                var136.field2503 = var135;
                if (class230.field3934[class255.field4377][var133][var134] == null) {
                    class230.field3934[class255.field4377][var133][var134] = new class175();
                }
                class230.field3934[class255.field4377][var133][var134].method1269(false, new class248(var136));
                class236.method1587((byte) 120, var133, var134);
            }
        } else if (class9.field141 == 94) {
            int var1 = class23.field302.method357(false);
            int var2 = class41.field797 + ((var1 & 0x79) >> 4);
            int var3 = (var1 & 0x7) + class305.field5278;
            int var4 = var2 + class23.field302.method323(arg0 ^ 0x561AD665);
            int var5 = class23.field302.method323(9092) + var3;
            int var6 = class23.field302.method309(2);
            int var7 = class23.field302.method346(-16);
            int var8 = class23.field302.method357(false) * 4;
            int var9 = class23.field302.method357(false) * 4;
            int var10 = class23.field302.method346(-16);
            int var11 = class23.field302.method346(-16);
            int var12 = class23.field302.method357(false);
            int var13 = class23.field302.method357(false);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var4 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var5 * 128 + 64;
                int var17 = var2 * 128 + 64;
                class30 var18 = new class30(var7, class255.field4377, var17, var15, class297.method2080(var17, 118, class255.field4377, var15) - var8, class45.field840 + var10, class45.field840 + var11, var12, var13, var6, var9);
                var18.method216(var16, class45.field840 + var10, class297.method2080(var14, arg0 + -1444607330, class255.field4377, var16) + -var9, (byte) 122, var14);
                class36.field632.method1269(false, new class311(var18));
            }
        } else if (class9.field141 == 31) {
            int var112 = class23.field302.method357(false);
            int var113 = ((var112 & 0xF7) >> 4) + class41.field797 * 2;
            int var114 = (var112 & 0xF) + class305.field5278 * 2;
            int var115 = class23.field302.method323(arg0 ^ 0x561AD665) + var113;
            int var116 = class23.field302.method323(9092) + var114;
            int var117 = class23.field302.method309(2);
            int var118 = class23.field302.method346(-16);
            int var119 = class23.field302.method357(false) * 4;
            int var120 = class23.field302.method357(false) * 4;
            int var121 = class23.field302.method346(-16);
            int var122 = class23.field302.method346(-16);
            int var123 = class23.field302.method357(false);
            int var124 = class23.field302.method357(false);
            if (var113 >= 0 && var114 >= 0 && var113 < 208 && var114 < 208 && var115 >= 0 && var116 >= 0 && var115 < 208 && var116 < 208 && var118 != 65535) {
                int var125 = var116 * 64;
                int var126 = var115 * 64;
                int var127 = var114 * 64;
                int var128 = var113 * 64;
                class30 var129 = new class30(var118, class255.field4377, var128, var127, class297.method2080(var128, 113, class255.field4377, var127) - var119, class45.field840 + var121, var122 + class45.field840, var123, var124, var117, var120);
                var129.method216(var125, class45.field840 + var121, class297.method2080(var126, 125, class255.field4377, var125) + -var120, (byte) 122, var126);
                class36.field632.method1269(false, new class311(var129));
            }
        } else if (class9.field141 == 111) {
            int var105 = class23.field302.method336(255);
            int var106 = var105 & 0x3;
            int var107 = var105 >> 2;
            int var108 = class200.field3642[var107];
            int var109 = class23.field302.method357(false);
            int var110 = (var109 >> 4 & 0x7) + class41.field797;
            int var111 = class305.field5278 + (var109 & 0x7);
            if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                class239.method1608(var107, 3072, class255.field4377, -1, 0, var111, var108, var110, var106, -1);
            }
        } else if (class9.field141 == 97) {
            int var99 = class23.field302.method362((byte) 47);
            int var100 = class23.field302.method357(false);
            int var101 = (var100 >> 4 & 0x7) + class41.field797;
            int var102 = class305.field5278 + (var100 & 0x7);
            if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                class175 var103 = class230.field3934[class255.field4377][var101][var102];
                if (var103 != null) {
                    for (class248 var104 = (class248) var103.method1270((byte) -121); var104 != null; var104 = (class248) var103.method1277(arg0 - 1444607456)) {
                        if ((var99 & 0x7FFF) == var104.field4218.field2508) {
                            var104.method1199(21966);
                            break;
                        }
                    }
                    if (var103.method1270((byte) -121) == null) {
                        class230.field3934[class255.field4377][var101][var102] = null;
                    }
                    class236.method1587((byte) 124, var101, var102);
                }
            }
        } else if (class9.field141 == 136) {
            int var19 = class23.field302.method357(false);
            int var20 = ((var19 & 0x7B) >> 4) + class41.field797;
            int var21 = class305.field5278 + (var19 & 0x7);
            int var22 = class23.field302.method346(-16);
            int var23 = class23.field302.method346(arg0 - 1444607473);
            int var24 = class23.field302.method346(arg0 - 1444607473);
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class175 var25 = class230.field3934[class255.field4377][var20][var21];
                if (var25 != null) {
                    for (class248 var26 = (class248) var25.method1270((byte) -121); var26 != null; var26 = (class248) var25.method1277(1)) {
                        class143 var27 = var26.field4218;
                        if ((var22 & 0x7FFF) == var27.field2508 && var27.field2503 == var23) {
                            var27.field2503 = var24;
                            break;
                        }
                    }
                    class236.method1587((byte) 100, var20, var21);
                }
            }
        } else if (class9.field141 == 139) {
            int var91 = class23.field302.method336(255);
            int var92 = class305.field5278 + (var91 & 0x7);
            int var93 = (var91 >> 4 & 0x7) + class41.field797;
            int var94 = class23.field302.method314(true);
            if (var94 == 65535) {
                var94 = -1;
            }
            int var95 = class23.field302.method315(-78);
            int var96 = var95 & 0x3;
            int var97 = var95 >> 2;
            int var98 = class200.field3642[var97];
            class222.method1530(var98, var96, var94, 11738, var97, class255.field4377, var93, var92);
        } else if (class9.field141 == 145) {
            int var28 = class23.field302.method357(false);
            int var29 = (var28 & 0x7) + class305.field5278;
            int var30 = (var28 >> 4 & 0x7) + class41.field797;
            int var31 = class23.field302.method346(-16);
            int var32 = class23.field302.method357(false);
            int var33 = (var32 & 0xF0) >> 4;
            int var34 = class23.field302.method357(false);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var35 = var32 & 0x7;
            if (var30 >= 0 && var29 >= 0 && var30 < 104 && var29 < 104) {
                int var36 = var33 + 1;
                if ((var30 - var36) <= class121.field2124.field1215[0] && (var30 + var36) >= class121.field2124.field1215[0] && class121.field2124.field1254[0] >= var29 - var36 && (var29 + var36) >= class121.field2124.field1254[0] && class70.field1292 != 0 && var35 > 0 && class23.field312 < 50 && var31 != -1) {
                    class34.field530[class23.field312] = var31;
                    class105.field1875[class23.field312] = var35;
                    class78.field1467[class23.field312] = var34;
                    class54.field984[class23.field312] = null;
                    class135.field2345[class23.field312] = (var29 << 8) + (var30 << 16) + var33;
                    class23.field312++;
                }
            }
        } else if (class9.field141 == 59) {
            int var82 = class23.field302.method357(false);
            int var83 = (var82 >> 4 & 0x7) + class41.field797;
            int var84 = (var82 & 0x7) + class305.field5278;
            int var85 = class23.field302.method346(-16);
            int var86 = class23.field302.method357(false);
            int var87 = class23.field302.method346(-16);
            if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                int var88 = var83 * 128 + 64;
                int var89 = var84 * 128 + 64;
                class23 var90 = new class23(var85, class255.field4377, var88, var89, class297.method2080(var88, 112, class255.field4377, var89) - var86, var87, class45.field840);
                class57.field1038.method1269(false, new class166(var90));
            }
        } else if (class9.field141 == 76) {
            int var76 = class23.field302.method362((byte) 47);
            int var77 = class23.field302.method332(255);
            int var78 = ((var77 & 0x74) >> 4) + class41.field797;
            int var79 = (var77 & 0x7) + class305.field5278;
            int var80 = class23.field302.method362((byte) 47);
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                class143 var81 = new class143();
                var81.field2508 = var76;
                var81.field2503 = var80;
                if (class230.field3934[class255.field4377][var78][var79] == null) {
                    class230.field3934[class255.field4377][var78][var79] = new class175();
                }
                class230.field3934[class255.field4377][var78][var79].method1269(false, new class248(var81));
                class236.method1587((byte) 107, var78, var79);
            }
        } else if (class9.field141 == 253) {
            int var37 = class23.field302.method332(255);
            int var38 = ((var37 & 0x72) >> 4) + class41.field797;
            int var39 = (var37 & 0x7) + class305.field5278;
            int var40 = class23.field302.method315(-76);
            int var41 = var40 >> 2;
            int var42 = class200.field3642[var41];
            int var43 = var40 & 0x3;
            int var44 = class23.field302.method314(true);
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class239.method1608(var41, 3072, class255.field4377, var44, 0, var39, var42, var38, var43, -1);
            }
        } else if (class9.field141 == 84) {
            int var45 = class23.field302.method346(-16);
            int var46 = class23.field302.method357(false);
            int var47 = var46 & 0x3;
            int var48 = var46 >> 2;
            int var49 = class200.field3642[var48];
            byte var50 = class23.field302.method317(false);
            byte var51 = class23.field302.method340(13620);
            int var52 = class23.field302.method310((byte) 103);
            int var53 = class23.field302.method357(false);
            int var54 = ((var53 & 0x76) >> 4) + class41.field797;
            int var55 = (var53 & 0x7) + class305.field5278;
            byte var56 = class23.field302.method329(false);
            int var57 = class23.field302.method310((byte) -58);
            byte var58 = class23.field302.method340(13620);
            int var59 = class23.field302.method362((byte) 47);
            class144 var60;
            if (class104.field1852 == var45) {
                var60 = class121.field2124;
            } else {
                var60 = class300.field5172[var45];
            }
            if (!class253.field4323 && var60 != null) {
                class273 var61 = class271.method1871(122, var59);
                int var62;
                int var63;
                if (var47 == 1 || var47 == 3) {
                    var62 = var61.field4711;
                    var63 = var61.field4662;
                } else {
                    var62 = var61.field4662;
                    var63 = var61.field4711;
                }
                int var64 = (var62 >> 1) + var54;
                int var65 = var54 + (var62 + 1 >> 1);
                int var66 = (var63 >> 1) + var55;
                int var67 = (var63 + 1 >> 1) + var55;
                int[][] var68 = class118.field2090[class255.field4377];
                int[][] var69 = (int[][]) null;
                if (class255.field4377 < 3) {
                    var69 = class118.field2090[class255.field4377 + 1];
                }
                int var70 = var68[var64][var66] + var68[var65][var67] - (-var68[var64][var67] + -var68[var65][var66]) >> 2;
                int var71 = (var54 << 7) + (var62 << 6);
                int var72 = (var55 << 7) + (var63 << 6);
                class196 var73 = var61.method1882(false, var61.field4714, (class232) null, var69, var72, var71, false, var70, var48, var68, var47);
                if (var73 != null) {
                    class239.method1608(0, 3072, class255.field4377, -1, var52 + 1, var55, var49, var54, 0, var57 + 1);
                    var60.field2553 = class45.field840 + var57;
                    var60.field2516 = class45.field840 + var52;
                    var60.field2543 = var55 * 128 + var63 * 64;
                    var60.field2533 = (class26) var73.field3589;
                    var60.field2530 = var70;
                    if (var56 < var51) {
                        byte var74 = var51;
                        var51 = var56;
                        var56 = var74;
                    }
                    var60.field2522 = var54 * 128 + var62 * 64;
                    var60.field2517 = var54 + var56;
                    if (var58 < var50) {
                        byte var75 = var50;
                        var50 = var58;
                        var58 = var75;
                    }
                    var60.field2538 = var51 + var54;
                    var60.field2536 = var55 + var58;
                    var60.field2526 = var50 + var55;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 606)
    public static final void method2169(int arg0) {
        field5386++;
        class302.field5201 = class162.method1196(true, 2048, 4, 0, 8, 8, 0.4F, 35);
        if (arg0 != -64) {
            field5392 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 624)
    public class313() {
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lcc;)V", line = 628)
    public class313(class313 arg0) {
        this.field5387 = arg0.field5387;
        this.field5384 = arg0.field5384;
        this.field5385 = arg0.field5385;
        this.field5388 = arg0.field5388;
    }
}
