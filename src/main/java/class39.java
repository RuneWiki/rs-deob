import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class39 {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lob;")
    public static class141 field784 = class175.method1195(40, " ");

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Lob;")
    private static class141 field787 = class175.method1195(40, "white:");

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lob;")
    public static class141 field779 = field787;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Lob;")
    public static class141 field789 = class175.method1195(40, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lob;")
    public static class141 field780 = class175.method1195(40, "<col=ffffff>");

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field786 = 0;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Lob;")
    public static class141 field791 = field787;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "[S")
    public static short[] field793 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lob;")
    public static class141 field783 = class175.method1195(40, "rect_debug=");

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Lui;")
    public static class208 field788;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method255(int arg0) {
        field792++;
        if (class66.field1286 == 232) {
            int var1 = class156.field3014.method974(arg0 ^ 0xD598398A);
            int var2 = (var1 >> 4 & 0x7) + class114.field2184;
            int var3 = (var1 & 0x7) + class150.field2892;
            int var4 = class156.field3014.method1002(-8544);
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = class104.field2004[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class196.method1322(var5, var2, -1, var6, var7, 117, 0, var3, class66.field1287, -1);
            }
        } else if (class66.field1286 == 247) {
            int var8 = class156.field3014.method967((byte) -127);
            int var9 = class150.field2892 + (var8 & 0x7);
            int var10 = (var8 >> 4 & 0x7) + class114.field2184;
            int var11 = class156.field3014.method1015((byte) 110);
            int var12 = class156.field3014.method1002(arg0 - 8546);
            int var13 = var12 & 0x3;
            int var14 = var12 >> 2;
            int var15 = class104.field2004[var14];
            if (var10 >= 0 && var9 >= 0 && var10 < 104 && var9 < 104) {
                class196.method1322(var14, var10, -1, var13, var15, 25, 0, var9, class66.field1287, var11);
            }
        } else if (class66.field1286 == 149) {
            int var16 = class156.field3014.method991(arg0 ^ 0xFD);
            int var17 = (var16 & 0x7) + class150.field2892;
            int var18 = class114.field2184 + (var16 >> 4 & 0x7);
            int var19 = class156.field3014.method1000(arg0 + 1064893126) + var18;
            int var20 = class156.field3014.method1000(1064893128) + var17;
            int var21 = class156.field3014.method992((byte) -67);
            int var22 = class156.field3014.method1007(120);
            int var23 = class156.field3014.method991(255) * 4;
            int var24 = class156.field3014.method991(arg0 ^ 0xFD) * 4;
            int var25 = class156.field3014.method1007(45);
            int var26 = class156.field3014.method1007(43);
            int var27 = class156.field3014.method991(255);
            int var28 = class156.field3014.method991(255);
            if (var18 >= 0 && var17 >= 0 && var18 < 104 && var17 < 104 && var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var22 != 65535) {
                int var29 = var18 * 128 + 64;
                int var30 = var19 * 128 + 64;
                int var31 = var17 * 128 + 64;
                int var32 = var20 * 128 + 64;
                class32 var33 = new class32(var22, class66.field1287, var29, var31, class206.method1360(class66.field1287, var29, (byte) 40, var31) - var23, class20.field344 + var25, var26 + class20.field344, var27, var28, var21, var24);
                var33.method232(class20.field344 + var25, var32, class206.method1360(class66.field1287, var30, (byte) 40, var32) - var24, arg0 ^ 0xFFFFFF88, var30);
                class30.field575.method1098(arg0 - 2, var33);
            }
        } else {
            if (class66.field1286 == 142) {
                int var34 = class156.field3014.method1015((byte) 110);
                int var35 = class156.field3014.method965((byte) -127);
                byte var36 = class156.field3014.method1000(1064893128);
                int var37 = class156.field3014.method1015((byte) 110);
                int var38 = class156.field3014.method991(255);
                int var39 = (var38 >> 4 & 0x7) + class114.field2184;
                int var40 = (var38 & 0x7) + class150.field2892;
                byte var41 = class156.field3014.method1000(1064893128);
                byte var42 = class156.field3014.method1014(-91);
                byte var43 = class156.field3014.method971(1844990088);
                int var44 = class156.field3014.method1002(-8544);
                int var45 = var44 & 0x3;
                int var46 = var44 >> 2;
                int var47 = class104.field2004[var46];
                int var48 = class156.field3014.method1007(67);
                class38 var49;
                if (class97.field1916 == var48) {
                    var49 = class114.field2176;
                } else {
                    var49 = class116.field2231[var48];
                }
                if (var49 != null) {
                    class54 var50 = class175.method1198(-14098, var35);
                    int var51;
                    int var52;
                    if (var45 == 1 || var45 == 3) {
                        var51 = var50.field1073;
                        var52 = var50.field1079;
                    } else {
                        var51 = var50.field1079;
                        var52 = var50.field1073;
                    }
                    int var53 = (var51 >> 1) + var39;
                    int var54 = var40 + (var52 >> 1);
                    int var55 = (var51 + 1 >> 1) + var39;
                    int var56 = (var52 + 1 >> 1) + var40;
                    int[][] var57 = class31.field617[class66.field1287];
                    int var58 = (var39 << 7) + (var51 << 6);
                    int var59 = var57[var53][var56] + var57[var55][var56] + var57[var55][var54] + var57[var53][var54] >> 2;
                    int var60 = (var40 << 7) + (var52 << 6);
                    class161 var61 = var50.method371(var58, var46, false, var45, var59, -107, var60, var57);
                    if (var61 != null) {
                        class196.method1322(0, var39, var37 + 1, 0, var47, 76, var34 + 1, var40, class66.field1287, -1);
                        var49.field751 = var59;
                        var49.field753 = var34 + class20.field344;
                        var49.field756 = (class56) var61.field3121;
                        var49.field764 = var39 * 128 + var51 * 64;
                        var49.field766 = var40 * 128 + var52 * 64;
                        if (var43 < var36) {
                            byte var62 = var36;
                            var36 = var43;
                            var43 = var62;
                        }
                        if (var41 > var42) {
                            byte var63 = var41;
                            var41 = var42;
                            var42 = var63;
                        }
                        var49.field771 = var40 + var41;
                        var49.field746 = var37 + class20.field344;
                        var49.field774 = var36 + var39;
                        var49.field757 = var39 + var43;
                        var49.field763 = var40 + var42;
                    }
                }
            }
            if (class66.field1286 == 221) {
                int var64 = class156.field3014.method991(255);
                int var65 = (var64 & 0x7) + class150.field2892;
                int var66 = class114.field2184 + (var64 >> 4 & 0x7);
                int var67 = class156.field3014.method1007(105);
                if (var67 == 65535) {
                    var67 = -1;
                }
                int var68 = class156.field3014.method991(255);
                int var69 = class156.field3014.method991(arg0 + 253);
                int var70 = var68 >> 4 & 0xF;
                int var71 = var68 & 0x7;
                if (var66 >= 0 && var65 >= 0 && var66 < 104 && var65 < 104) {
                    int var72 = var70 + 1;
                    if (var66 - var72 <= class114.field2176.field3870[0] && var66 + var72 >= class114.field2176.field3870[0] && class114.field2176.field3892[0] >= var65 - var72 && class114.field2176.field3892[0] <= var65 + var72 && class165.field3202 != 0 && var71 > 0 && field786 < 50 && var67 != -1) {
                        class178.field3517[field786] = var67;
                        class88.field1767[field786] = var71;
                        class49.field921[field786] = var69;
                        class104.field2012[field786] = null;
                        class106.field2043[field786] = (var66 << 16) + (var65 << 8) + var70;
                        field786++;
                    }
                }
            }
            if (class66.field1286 == 52) {
                int var73 = class156.field3014.method982((byte) 92);
                int var74 = class156.field3014.method1015((byte) 110);
                int var75 = class156.field3014.method967((byte) -127);
                int var76 = (var75 >> 4 & 0x7) + class114.field2184;
                int var77 = class150.field2892 + (var75 & 0x7);
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class190 var78 = new class190();
                    var78.field3678 = var73;
                    var78.field3669 = var74;
                    if (class76.field1559[class66.field1287][var76][var77] == null) {
                        class76.field1559[class66.field1287][var76][var77] = new class158();
                    }
                    class76.field1559[class66.field1287][var76][var77].method1098(0, var78);
                    class190.method1261(0, var77, var76);
                }
            } else if (class66.field1286 == 85) {
                int var79 = class156.field3014.method982((byte) 82);
                int var80 = class156.field3014.method965((byte) -119);
                int var81 = class156.field3014.method991(255);
                int var82 = (var81 >> 4 & 0x7) + class114.field2184;
                int var83 = (var81 & 0x7) + class150.field2892;
                int var84 = class156.field3014.method965((byte) -115);
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && class97.field1916 != var80) {
                    class190 var85 = new class190();
                    var85.field3669 = var79;
                    var85.field3678 = var84;
                    if (class76.field1559[class66.field1287][var82][var83] == null) {
                        class76.field1559[class66.field1287][var82][var83] = new class158();
                    }
                    class76.field1559[class66.field1287][var82][var83].method1098(0, var85);
                    class190.method1261(0, var83, var82);
                }
            } else if (class66.field1286 == 172) {
                int var86 = class156.field3014.method982((byte) 76);
                int var87 = class156.field3014.method974(-711444088);
                int var88 = class114.field2184 + (var87 >> 4 & 0x7);
                int var89 = (var87 & 0x7) + class150.field2892;
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    class158 var90 = class76.field1559[class66.field1287][var88][var89];
                    if (var90 != null) {
                        for (class190 var91 = (class190) var90.method1103((byte) -9); var91 != null; var91 = (class190) var90.method1106((byte) 96)) {
                            if ((var86 & 0x7FFF) == var91.field3669) {
                                var91.method1392(128);
                                break;
                            }
                        }
                        if (var90.method1103((byte) -9) == null) {
                            class76.field1559[class66.field1287][var88][var89] = null;
                        }
                        class190.method1261(0, var89, var88);
                    }
                }
            } else if (class66.field1286 == 183) {
                int var92 = class156.field3014.method991(255);
                int var93 = (var92 & 0x7) + class150.field2892;
                int var94 = (var92 >> 4 & 0x7) + class114.field2184;
                int var95 = class156.field3014.method1007(36);
                int var96 = class156.field3014.method991(255);
                int var97 = class156.field3014.method1007(49);
                if (var94 >= 0 && var93 >= 0 && var94 < 104 && var93 < 104) {
                    int var98 = var94 * 128 + 64;
                    int var99 = var93 * 128 + 64;
                    class68 var100 = new class68(var95, class66.field1287, var98, var99, class206.method1360(class66.field1287, var98, (byte) 40, var99) - var96, var97, class20.field344);
                    class135.field2576.method1098(arg0 - 2, var100);
                }
            } else {
                if (arg0 != 2) {
                    field788 = null;
                }
                if (class66.field1286 == 48) {
                    int var101 = class156.field3014.method1002(arg0 - 8546);
                    int var102 = var101 & 0x3;
                    int var103 = var101 >> 2;
                    int var104 = class104.field2004[var103];
                    int var105 = class156.field3014.method991(255);
                    int var106 = (var105 >> 4 & 0x7) + class114.field2184;
                    int var107 = (var105 & 0x7) + class150.field2892;
                    int var108 = class156.field3014.method982((byte) -44);
                    if (var108 == 65535) {
                        var108 = -1;
                    }
                    if (var106 >= 0 && var107 >= 0 && var106 < 103 && var107 < 103) {
                        if (var104 == 0) {
                            class172 var109 = class209.method1368(class66.field1287, var106, var107);
                            if (var109 != null) {
                                int var110 = (int) (var109.field3417 >>> 32) & Integer.MAX_VALUE;
                                if (var103 == 2) {
                                    var109.field3418 = new class57(var110, 2, var102 + 4, class66.field1287, var106, var107, var108, false, var109.field3418);
                                    var109.field3409 = new class57(var110, 2, var102 + 1 & 0x3, class66.field1287, var106, var107, var108, false, var109.field3409);
                                } else {
                                    var109.field3418 = new class57(var110, var103, var102, class66.field1287, var106, var107, var108, false, var109.field3418);
                                }
                            }
                        }
                        if (var104 == 1) {
                            class58 var111 = class185.method1238(class66.field1287, var106, var107);
                            if (var111 != null) {
                                int var112 = Integer.MAX_VALUE & (int) (var111.field1133 >>> 32);
                                if (var103 == 4 || var103 == 5) {
                                    var111.field1135 = new class57(var112, 4, var102, class66.field1287, var106, var107, var108, false, var111.field1135);
                                } else if (var103 == 6) {
                                    var111.field1135 = new class57(var112, 4, var102 + 4, class66.field1287, var106, var107, var108, false, var111.field1135);
                                } else if (var103 == 7) {
                                    var111.field1135 = new class57(var112, 4, (var102 + 2 & 0x3) + 4, class66.field1287, var106, var107, var108, false, var111.field1135);
                                } else if (var103 == 8) {
                                    var111.field1135 = new class57(var112, 4, var102 + 4, class66.field1287, var106, var107, var108, false, var111.field1135);
                                    var111.field1139 = new class57(var112, 4, (var102 + 2 & 0x3) + 4, class66.field1287, var106, var107, var108, false, var111.field1139);
                                }
                            }
                        }
                        if (var104 == 2) {
                            class9 var113 = class138.method888(class66.field1287, var106, var107);
                            if (var103 == 11) {
                                var103 = 10;
                            }
                            if (var113 != null) {
                                var113.field147 = new class57((int) (var113.field141 >>> 32) & Integer.MAX_VALUE, var103, var102, class66.field1287, var106, var107, var108, false, var113.field147);
                            }
                        }
                        if (var104 == 3) {
                            class124 var114 = class213.method1391(class66.field1287, var106, var107);
                            if (var114 != null) {
                                var114.field2379 = new class57(Integer.MAX_VALUE & (int) (var114.field2391 >>> 32), 22, var102, class66.field1287, var106, var107, var108, false, var114.field2379);
                            }
                        }
                    }
                } else if (class66.field1286 == 240) {
                    int var115 = class156.field3014.method991(255);
                    int var116 = (var115 >> 4 & 0x7) + class114.field2184;
                    int var117 = (var115 & 0x7) + class150.field2892;
                    int var118 = class156.field3014.method1007(67);
                    int var119 = class156.field3014.method1007(arg0 ^ 0x3A);
                    int var120 = class156.field3014.method1007(100);
                    if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                        class158 var121 = class76.field1559[class66.field1287][var116][var117];
                        if (var121 != null) {
                            for (class190 var122 = (class190) var121.method1103((byte) -9); var122 != null; var122 = (class190) var121.method1106((byte) -16)) {
                                if ((var118 & 0x7FFF) == var122.field3669 && var122.field3678 == var119) {
                                    var122.field3678 = var120;
                                    break;
                                }
                            }
                            class190.method1261(arg0 ^ 0x2, var117, var116);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method256(int arg0) {
        if (arg0 != 7) {
            return;
        }
        field779 = null;
        field787 = null;
        field788 = null;
        field793 = null;
        field784 = null;
        field791 = null;
        field783 = null;
        field780 = null;
        field789 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Z")
    public static final boolean method257(int arg0, int arg1) {
        field785++;
        if (arg0 <= 125) {
            method261(-67, null, null, false);
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static final void method258(byte arg0) {
        field777++;
        int var1 = -89 / ((arg0 + 1) / 57);
        Object var2 = class123.field2355;
        synchronized (class123.field2355) {
            if (class158.field3062 != 0) {
                class158.field3062 = 1;
                try {
                    class123.field2355.wait();
                } catch (InterruptedException var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIIIIILra;)V")
    public static final void method259(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class170 arg6) {
        field782++;
        if (arg0) {
            return;
        }
        int var7 = Math.min(arg6.field3299 / 2, arg6.field3284 / 2);
        int var8 = arg3 * arg3 + arg5 * arg5;
        if (var7 * var7 >= var8 || var8 >= 90000) {
            class4.method21(class211.field4004[arg2], -113, arg1, arg5, arg6, arg4, arg3);
            return;
        }
        var7 -= 10;
        int var9 = class96.field1901 + class214.field4084 & 0x7FF;
        int var10 = class44.field843[var9];
        int var11 = class44.field854[var9];
        int var12 = var10 * 256 / (class116.field2225 + 256);
        int var13 = var11 * 256 / (class116.field2225 + 256);
        int var14 = arg5 * var13 + arg3 * var12 >> 16;
        int var15 = arg5 * var12 - arg3 * var13 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var7);
        int var19 = (int) (Math.cos(var16) * (double) var7);
        class206.field3925[arg2].method667(arg1 + arg6.field3299 / 2 + var18 - 10, arg4 - (var19 - -10 + -(arg6.field3284 / 2)), 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
    public static final int method260(int arg0, int arg1) {
        if (arg0 != 28905) {
            method256(-39);
        }
        field776++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILca;Lqe;Z)V")
    public static final void method261(int arg0, class22 arg1, class164 arg2, boolean arg3) {
        byte[] var4 = null;
        class158 var5 = class109.field2097;
        synchronized (class109.field2097) {
            if (arg3) {
                method261(10, null, null, true);
            }
            for (class162 var6 = (class162) class109.field2097.method1103((byte) -9); var6 != null; var6 = (class162) class109.field2097.method1106((byte) -100)) {
                if ((long) arg0 == var6.field4067 && var6.field3133 == arg2 && var6.field3138 == 0) {
                    var4 = var6.field3136;
                    break;
                }
            }
        }
        field778++;
        if (var4 == null) {
            byte[] var7 = arg2.method1136(80, arg0);
            arg1.method131((byte) -14, arg0, var7, true, arg2);
        } else {
            arg1.method131((byte) -14, arg0, var4, true, arg2);
        }
    }
}
