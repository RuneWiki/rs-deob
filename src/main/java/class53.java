import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class53 extends class97 {

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "Lea;")
    private static class38 field1344 = class9.method46((byte) 111, "slide:");

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lea;")
    public static class38 field1346 = field1344;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Lea;")
    private static class38 field1347 = class9.method46((byte) 105, "Service unavailable)3");

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Lea;")
    private static class38 field1351 = class9.method46((byte) 123, "Could not complete login)3");

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "Lea;")
    private static class38 field1359 = class9.method46((byte) 121, "Loading sprites )2 ");

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "Lea;")
    public static class38 field1357 = field1351;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "Lea;")
    public static class38 field1361 = field1359;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "Lea;")
    public static class38 field1363 = field1347;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "Lea;")
    public static class38 field1362 = field1344;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lea;")
    private static class38 field1345 = class9.method46((byte) 109, "Prepared sound engine");

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "Lea;")
    public static class38 field1360 = field1345;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method383(byte arg0) {
        field1346 = null;
        field1361 = null;
        field1359 = null;
        field1345 = null;
        int var1 = 5 % ((arg0 + 62) / 48);
        field1362 = null;
        field1363 = null;
        field1357 = null;
        field1360 = null;
        field1347 = null;
        field1344 = null;
        field1351 = null;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(Z)V")
    public static final void method384(boolean arg0) {
        if (!arg0) {
            method383((byte) 66);
        }
        Object var1 = class83.field1970;
        synchronized (class83.field1970) {
            if (class139.field2892 == 0) {
                class186.field3708.method953(new class21(), 5, (byte) 65);
            }
            class139.field2892 = 600;
        }
        field1356++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z")
    public static final boolean method385(int arg0, int arg1) {
        field1358++;
        if (class127.field2728[arg0]) {
            return true;
        } else if (class149.field3086.method209((byte) -92, arg0)) {
            int var2 = class149.field3086.method213(arg1 ^ 0x4DAB, arg0);
            if (var2 == 0) {
                class127.field2728[arg0] = true;
                return true;
            }
            if (class168.field3461[arg0] == null) {
                class168.field3461[arg0] = new class43[var2];
            }
            if (arg1 != 27323) {
                field1361 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class168.field3461[arg0][var3] == null) {
                    byte[] var4 = class149.field3086.method215(var3, arg0, arg1 ^ 0x6ABA);
                    if (var4 != null) {
                        class168.field3461[arg0][var3] = new class43();
                        class168.field3461[arg0][var3].field1013 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class168.field3461[arg0][var3].method323(false, new class66(var4));
                        } else {
                            class168.field3461[arg0][var3].method318((byte) 0, new class66(var4));
                        }
                    }
                }
            }
            class127.field2728[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
    public static final void method386(byte arg0, int arg1) {
        field1354++;
        if (!method385(arg1, 27323)) {
            return;
        }
        class43[] var2 = class168.field3461[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class43 var4 = var2[var3];
            if (var4 != null) {
                var4.field934 = 0;
                var4.field1054 = 0;
            }
        }
        if (arg0 != 27) {
            field1351 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    public static final void method387(byte arg0) {
        if (class109.field2456 == 205) {
            int var1 = class192.field3794.method509(117);
            int var2 = (var1 >> 4 & 0x7) + class128.field2755;
            int var3 = class155.field3223 + (var1 & 0x7);
            int var4 = class192.field3794.method511(-119);
            int var5 = class192.field3794.method509(arg0 ^ 0xFFFFFF9D);
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = class192.field3794.method509(125);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var9 = var6 + 1;
                if (class195.field3842.field391[0] >= var2 - var9 && class195.field3842.field391[0] <= var2 + var9 && var3 - var9 <= class195.field3842.field409[0] && var3 + var9 >= class195.field3842.field409[0] && class113.field2522 != 0 && var7 > 0 && class37.field784 < 50) {
                    class117.field2562[class37.field784] = var4;
                    class83.field1965[class37.field784] = var7;
                    class192.field3801[class37.field784] = var8;
                    class181.field3649[class37.field784] = null;
                    class143.field2987[class37.field784] = (var3 << 8) + (var2 << 16) + var6;
                    class37.field784++;
                }
            }
        }
        field1355++;
        if (class109.field2456 == 28) {
            int var10 = class192.field3794.method515(-1739943584);
            int var11 = class192.field3794.method483((byte) -118);
            int var12 = (var11 >> 4 & 0x7) + class128.field2755;
            int var13 = class155.field3223 + (var11 & 0x7);
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class141 var14 = class122.field2615[class10.field224][var12][var13];
                if (var14 != null) {
                    for (class46 var15 = (class46) var14.method1020(arg0 + 28); var15 != null; var15 = (class46) var14.method1027((byte) 88)) {
                        if ((var10 & 0x7FFF) == var15.field1136) {
                            var15.method805(false);
                            break;
                        }
                    }
                    if (var14.method1020(0) == null) {
                        class122.field2615[class10.field224][var12][var13] = null;
                    }
                    class9.method49(var13, var12, 19938);
                }
            }
        } else if (class109.field2456 == 55) {
            int var16 = class192.field3794.method483((byte) 92);
            int var17 = var16 & 0x3;
            int var18 = var16 >> 2;
            int var19 = class75.field1823[var18];
            int var20 = class192.field3794.method509(123);
            int var21 = (var20 >> 4 & 0x7) + class128.field2755;
            int var22 = (var20 & 0x7) + class155.field3223;
            int var23 = class192.field3794.method511(-123);
            if (var21 >= 0 && var22 >= 0 && var21 < 103 && var22 < 103) {
                if (var19 == 0) {
                    class175 var24 = class101.field2268.method1129(class10.field224, var21, var22);
                    if (var24 != null) {
                        int var25 = var24.field3547 >> 14 & 0x7FFF;
                        if (var18 == 2) {
                            var24.field3540 = new class112(var25, 2, var17 + 4, class10.field224, var21, var22, var23, false, var24.field3540);
                            var24.field3543 = new class112(var25, 2, var17 + 1 & 0x3, class10.field224, var21, var22, var23, false, var24.field3543);
                        } else {
                            var24.field3540 = new class112(var25, var18, var17, class10.field224, var21, var22, var23, false, var24.field3540);
                        }
                    }
                }
                if (var19 == 1) {
                    class108 var26 = class101.field2268.method1111(class10.field224, var21, var22);
                    if (var26 != null) {
                        int var27 = var26.field2439 >> 14 & 0x7FFF;
                        if (var18 == 4 || var18 == 5) {
                            var26.field2420 = new class112(var27, 4, var17, class10.field224, var21, var22, var23, false, var26.field2420);
                        } else if (var18 == 6) {
                            var26.field2420 = new class112(var27, 4, var17 + 4, class10.field224, var21, var22, var23, false, var26.field2420);
                        } else if (var18 == 7) {
                            var26.field2420 = new class112(var27, 4, (var17 + 2 & 0x3) + 4, class10.field224, var21, var22, var23, false, var26.field2420);
                        } else if (var18 == 8) {
                            var26.field2420 = new class112(var27, 4, var17 + 4, class10.field224, var21, var22, var23, false, var26.field2420);
                            var26.field2415 = new class112(var27, 4, (var17 + 2 & 0x3) + 4, class10.field224, var21, var22, var23, false, var26.field2415);
                        }
                    }
                }
                if (var19 == 2) {
                    if (var18 == 11) {
                        var18 = 10;
                    }
                    class68 var28 = class101.field2268.method1104(class10.field224, var21, var22);
                    if (var28 != null) {
                        var28.field1713 = new class112(var28.field1716 >> 14 & 0x7FFF, var18, var17, class10.field224, var21, var22, var23, false, var28.field1713);
                    }
                }
                if (var19 == 3) {
                    class103 var29 = class101.field2268.method1120(class10.field224, var21, var22);
                    if (var29 != null) {
                        var29.field2307 = new class112(var29.field2318 >> 14 & 0x7FFF, 22, var17, class10.field224, var21, var22, var23, false, var29.field2307);
                    }
                }
            }
        } else if (class109.field2456 == 38) {
            int var30 = class192.field3794.method509(arg0 ^ 0xFFFFFF9A);
            int var31 = class155.field3223 + (var30 & 0x7);
            int var32 = (var30 >> 4 & 0x7) + class128.field2755;
            int var33 = var32 + class192.field3794.method513((byte) 116);
            int var34 = class192.field3794.method513((byte) 116) + var31;
            int var35 = class192.field3794.method462((byte) 116);
            int var36 = class192.field3794.method511(-13);
            int var37 = class192.field3794.method509(125) * 4;
            int var38 = class192.field3794.method509(124) * 4;
            int var39 = class192.field3794.method511(-121);
            int var40 = class192.field3794.method511(105);
            int var41 = class192.field3794.method509(arg0 + 146);
            int var42 = class192.field3794.method509(arg0 ^ 0xFFFFFF98);
            if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var34 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var31 * 128 + 64;
                class33 var46 = new class33(var36, class10.field224, var44, var45, class38.method257(class10.field224, -169496123, var45, var44) - var37, class45.field1098 + var39, class45.field1098 + var40, var41, var42, var35, var38);
                int var47 = var33 * 128 + 64;
                var46.method222(var47, class45.field1098 + var39, true, var43, class38.method257(class10.field224, -169496123, var43, var47) - var38);
                class44.field1080.method1014((byte) -111, var46);
            }
        } else if (class109.field2456 == 49) {
            int var48 = class192.field3794.method509(127);
            int var49 = class128.field2755 + (var48 >> 4 & 0x7);
            int var50 = (var48 & 0x7) + class155.field3223;
            int var51 = class192.field3794.method511(-127);
            int var52 = class192.field3794.method509(118);
            int var53 = class192.field3794.method511(arg0 + 129);
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                int var54 = var50 * 128 + 64;
                int var55 = var49 * 128 + 64;
                class176 var56 = new class176(var51, class10.field224, var55, var54, class38.method257(class10.field224, -169496123, var54, var55) - var52, var53, class45.field1098);
                class50.field1241.method1014((byte) -105, var56);
            }
        } else {
            if (arg0 != -28) {
                field1347 = null;
            }
            if (class109.field2456 == 188) {
                int var57 = class192.field3794.method509(126);
                int var58 = var57 >> 2;
                int var59 = var57 & 0x3;
                int var60 = class75.field1823[var58];
                int var61 = class192.field3794.method515(-1739943584);
                int var62 = class192.field3794.method498(255);
                int var63 = (var62 >> 4 & 0x7) + class128.field2755;
                int var64 = (var62 & 0x7) + class155.field3223;
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    class10.method54(var59, var61, var58, var60, class10.field224, arg0 + 154, var64, -1, var63, 0);
                }
            } else if (class109.field2456 == 191) {
                int var65 = class192.field3794.method509(120);
                int var66 = class128.field2755 + (var65 >> 4 & 0x7);
                int var67 = (var65 & 0x7) + class155.field3223;
                int var68 = class192.field3794.method511(arg0 ^ 0xFFFFFFAC);
                int var69 = class192.field3794.method511(arg0 ^ 0x5);
                int var70 = class192.field3794.method515(-1739943584);
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && class44.field1084 != var69) {
                    class46 var71 = new class46();
                    var71.field1121 = var70;
                    var71.field1136 = var68;
                    if (class122.field2615[class10.field224][var66][var67] == null) {
                        class122.field2615[class10.field224][var66][var67] = new class141();
                    }
                    class122.field2615[class10.field224][var66][var67].method1014((byte) -112, var71);
                    class9.method49(var67, var66, arg0 + 19966);
                }
            } else if (class109.field2456 == 220) {
                int var72 = class192.field3794.method509(127);
                int var73 = (var72 & 0x7) + class155.field3223;
                int var74 = (var72 >> 4 & 0x7) + class128.field2755;
                int var75 = class192.field3794.method511(-120);
                int var76 = class192.field3794.method511(117);
                int var77 = class192.field3794.method511(arg0 ^ 0x66);
                if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104) {
                    class141 var78 = class122.field2615[class10.field224][var74][var73];
                    if (var78 != null) {
                        for (class46 var79 = (class46) var78.method1020(0); var79 != null; var79 = (class46) var78.method1027((byte) 91)) {
                            if ((var75 & 0x7FFF) == var79.field1136 && var79.field1121 == var76) {
                                var79.field1121 = var77;
                                break;
                            }
                        }
                        class9.method49(var73, var74, arg0 + 19966);
                    }
                }
            } else if (class109.field2456 == 86) {
                int var80 = class192.field3794.method463((byte) 77);
                int var81 = var80 >> 2;
                int var82 = var80 & 0x3;
                int var83 = class75.field1823[var81];
                int var84 = class192.field3794.method463((byte) 112);
                int var85 = (var84 & 0x7) + class155.field3223;
                int var86 = (var84 >> 4 & 0x7) + class128.field2755;
                if (var86 >= 0 && var85 >= 0 && var86 < 104 && var85 < 104) {
                    class10.method54(var82, -1, var81, var83, class10.field224, 92, var85, -1, var86, 0);
                }
            } else if (class109.field2456 == 7) {
                int var87 = class192.field3794.method509(127);
                int var88 = (var87 & 0x7) + class155.field3223;
                int var89 = (var87 >> 4 & 0x7) + class128.field2755;
                int var90 = class192.field3794.method511(arg0 ^ 0x6C);
                int var91 = class192.field3794.method487(arg0 ^ 0xFFFFFFE6);
                if (var89 >= 0 && var88 >= 0 && var89 < 104 && var88 < 104) {
                    class46 var92 = new class46();
                    var92.field1121 = var91;
                    var92.field1136 = var90;
                    if (class122.field2615[class10.field224][var89][var88] == null) {
                        class122.field2615[class10.field224][var89][var88] = new class141();
                    }
                    class122.field2615[class10.field224][var89][var88].method1014((byte) -109, var92);
                    class9.method49(var88, var89, arg0 + 19966);
                }
            } else if (class109.field2456 == 18) {
                int var93 = class192.field3794.method509(118);
                int var94 = var93 & 0x3;
                int var95 = var93 >> 2;
                int var96 = class75.field1823[var95];
                byte var97 = class192.field3794.method471(true);
                byte var98 = class192.field3794.method513((byte) 116);
                int var99 = class192.field3794.method483((byte) 105);
                int var100 = (var99 >> 4 & 0x7) + class128.field2755;
                int var101 = (var99 & 0x7) + class155.field3223;
                int var102 = class192.field3794.method515(arg0 - 1739943556);
                int var103 = class192.field3794.method511(-119);
                int var104 = class192.field3794.method515(-1739943584);
                int var105 = class192.field3794.method506(arg0 + 30);
                byte var106 = class192.field3794.method472((byte) 101);
                byte var107 = class192.field3794.method469(112);
                class144 var108;
                if (class44.field1084 == var104) {
                    var108 = class195.field3842;
                } else {
                    var108 = class175.field3550[var104];
                }
                if (var108 != null) {
                    class106 var109 = class70.method553(var103, 28067);
                    int var110;
                    int var111;
                    if (var94 == 1 || var94 == 3) {
                        var111 = var109.field2393;
                        var110 = var109.field2405;
                    } else {
                        var110 = var109.field2393;
                        var111 = var109.field2405;
                    }
                    int var112 = (var110 >> 1) + var100;
                    int var113 = (var111 >> 1) + var101;
                    int var114 = (var111 + 1 >> 1) + var101;
                    int[][] var115 = class154.field3209[class10.field224];
                    int var116 = (var110 + 1 >> 1) + var100;
                    int var117 = (var100 << 7) + (var110 << 6);
                    int var118 = var115[var112][var113] + var115[var116][var113] + var115[var112][var114] + var115[var116][var114] >> 2;
                    int var119 = (var101 << 7) + (var111 << 6);
                    class159 var120 = var109.method858(var94, var115, var117, var118, var119, true, var95);
                    if (var120 != null) {
                        if (var98 < var106) {
                            byte var121 = var106;
                            var106 = var98;
                            var98 = var121;
                        }
                        if (var107 > var97) {
                            byte var122 = var107;
                            var107 = var97;
                            var97 = var122;
                        }
                        class10.method54(0, -1, 0, var96, class10.field224, 104, var101, var102 + 1, var100, var105 + 1);
                        var108.field2996 = var120;
                        var108.field3011 = class45.field1098 + var105;
                        var108.field3023 = var98 + var100;
                        var108.field3010 = var101 + var107;
                        var108.field2995 = class45.field1098 + var102;
                        var108.field3024 = var101 * 128 + var111 * 64;
                        var108.field3016 = var100 * 128 + var110 * 64;
                        var108.field3004 = var97 + var101;
                        var108.field2993 = var118;
                        var108.field2991 = var100 + var106;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class53() {
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
    public class53(int arg0) {
        this.field1353 = arg0;
    }
}
