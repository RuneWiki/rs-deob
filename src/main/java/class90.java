import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 {

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lwb;")
    public static class130 field2180 = class26.method212("m-Ochte sich mit Ihnen duellieren)3", -32376);

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[I")
    public static int[] field2177 = new int[1000];

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "[I")
    public static int[] field2189 = new int[128];

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lwb;")
    public static class130 field2182 = class26.method212("Name eingeben:", -32376);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field2185 = 0;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lwb;")
    public static class130 field2188 = class26.method212("Maximale Anmelde)2Versuche -Uberschritten)3", -32376);

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Ls;")
    public static class108 field2187 = new class108();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "J")
    private static long field2184;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 9)
    public static final void method665(int arg0) {
        field2190++;
        class48.field1273.method401(26116);
        if (arg0 != 10052) {
            field2180 = null;
        }
        class58.field1451.method401(26116);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 25)
    public static void method666(int arg0) {
        field2188 = null;
        field2182 = null;
        field2189 = null;
        field2187 = null;
        field2177 = null;
        field2180 = null;
        if (arg0 != 2) {
            method668(true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIII)Z", line = 41)
    public static final boolean method667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2176++;
        if (!class52.method446(arg5, (byte) -108)) {
            return false;
        }
        class49.method432(arg1, arg6, arg7, arg8);
        boolean var9 = true;
        class3[] var10 = class105.field2549[arg5];
        if (arg2 != -36) {
            return true;
        }
        for (int var11 = 0; var11 < var10.length; var11++) {
            class3 var12 = var10[var11];
            if (var12 != null && var12.field74 == arg3) {
                if (var12.field111 > 0) {
                    class32.method253(var12, arg2 ^ 0xFFFFFFA2);
                }
                int var13 = var12.field90 + arg6 - arg0;
                int var14 = var12.field145 + arg1;
                if (var12.field110 == 0) {
                    if (var12.field75 && !class132.method1014(arg4, 1, var11)) {
                        continue;
                    }
                    if (var12.field130 > var12.field70 - var12.field94) {
                        var12.field130 = var12.field70 - var12.field94;
                    }
                    if (var12.field130 < 0) {
                        var12.field130 = 0;
                    }
                    var9 &= method667(var12.field130, var14, -36, var11, arg4, arg5, var13, var12.field81 + var14, var13 - -var12.field94);
                    class49.method432(arg1, arg6, arg7, arg8);
                    if (var12.field94 < var12.field70) {
                        class35.method321(var12.field81 + var14, var12.field70, var12.field94, (byte) -104, var13, var12.field130);
                    }
                }
                if (var12.field110 != 1) {
                    if (var12.field110 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field94; var16++) {
                            for (int var17 = 0; var17 < var12.field81; var17++) {
                                int var18 = (var12.field102 + 32) * var17 + var14;
                                int var19 = (var12.field95 + 32) * var16 + var13;
                                if (var15 < 20) {
                                    var18 += var12.field127[var15];
                                    var19 += var12.field104[var15];
                                }
                                if (var12.field72[var15] > 0) {
                                    int var21 = 0;
                                    int var22 = var12.field72[var15] - 1;
                                    int var23 = 0;
                                    if (var18 > class49.field1304 - 32 && var18 < class49.field1305 && var19 > class49.field1303 - 32 && class49.field1306 > var19 || class46.field1246 != 0 && class109.field2631 == var15) {
                                        int var24 = 0;
                                        if (class95.field2306 == 1 && field2191 == var15 && (arg5 << 16) + var11 == class94.field2285) {
                                            var24 = 16777215;
                                        }
                                        class28 var25 = class84.method638(var12.field140[var15], var22, (byte) -33, var24);
                                        if (var25 == null) {
                                            var9 = false;
                                        } else {
                                            if (class46.field1246 != 0 && class109.field2631 == var15 && (arg5 << 16) + var11 == class95.field2309) {
                                                var23 = class101.field2429 - class8.field276;
                                                var21 = class18.field483 - class19.field568;
                                                if (var23 < 5 && var23 > -5) {
                                                    var23 = 0;
                                                }
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                if (class15.field422 < 5) {
                                                    var21 = 0;
                                                    var23 = 0;
                                                }
                                                var25.method229(var18 + var21, var19 + var23, 128);
                                                if (arg3 != -1) {
                                                    class3 var26 = var10[arg3];
                                                    if (var19 + var23 < class49.field1303 && var26.field130 > 0) {
                                                        int var27 = (class49.field1303 - var19 - var23) * class31.field860 / 3;
                                                        if (class31.field860 * 10 < var27) {
                                                            var27 = class31.field860 * 10;
                                                        }
                                                        if (var27 > var26.field130) {
                                                            var27 = var26.field130;
                                                        }
                                                        var26.field130 -= var27;
                                                        class8.field276 += var27;
                                                    }
                                                    if (var19 + var23 + 32 > class49.field1306 && var26.field130 < var26.field70 - var26.field94) {
                                                        int var28 = (var19 + var23 + 32 - class49.field1306) * class31.field860 / 3;
                                                        if (class31.field860 * 10 < var28) {
                                                            var28 = class31.field860 * 10;
                                                        }
                                                        if (var28 > var26.field70 - var26.field94 - var26.field130) {
                                                            var28 = var26.field70 - var26.field94 - var26.field130;
                                                        }
                                                        class8.field276 -= var28;
                                                        var26.field130 += var28;
                                                    }
                                                }
                                            } else if (class1.field12 != 0 && class52.field1359 == var15 && (arg5 << 16) + var11 == class18.field514) {
                                                var25.method229(var18, var19, 128);
                                            } else {
                                                var25.method233(var18, var19);
                                            }
                                            if (var25.field792 == 33 || var12.field140[var15] != 1) {
                                                int var29 = var12.field140[var15];
                                                class68.field1766.method1002(class7.method54(1000000, var29), var18 + var21 + 1, var19 + 10 - -var23, 0);
                                                class68.field1766.method1002(class7.method54(1000000, var29), var18 + var21, var19 + var23 - -9, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field114 != null && var15 < 20) {
                                    class28 var20 = var12.method22(var15, 124);
                                    if (var20 != null) {
                                        var20.method233(var18, var19);
                                    } else if (class129.field3043) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field110 == 3) {
                        int var30;
                        if (class95.method712(256, var12)) {
                            var30 = var12.field117;
                            if (class132.method1014(arg4, 1, var11) && var12.field105 != 0) {
                                var30 = var12.field105;
                            }
                        } else {
                            var30 = var12.field148;
                            if (class132.method1014(arg4, 1, var11) && var12.field149 != 0) {
                                var30 = var12.field149;
                            }
                        }
                        if (var12.field124 == 0) {
                            if (var12.field88) {
                                class49.method440(var14, var13, var12.field81, var12.field94, var30);
                            } else {
                                class49.method431(var14, var13, var12.field81, var12.field94, var30);
                            }
                        } else if (var12.field88) {
                            class49.method435(var14, var13, var12.field81, var12.field94, var30, 256 - (var12.field124 & 0xFF));
                        } else {
                            class49.method443(var14, var13, var12.field81, var12.field94, var30, 256 - (var12.field124 & 0xFF));
                        }
                    } else if (var12.field110 == 4) {
                        class131 var31 = var12.method24(arg2 - 11817);
                        if (var31 != null) {
                            class130 var32 = var12.field147;
                            int var33;
                            if (class95.method712(arg2 ^ 0xFFFFFEDC, var12)) {
                                var33 = var12.field117;
                                if (class132.method1014(arg4, 1, var11) && var12.field105 != 0) {
                                    var33 = var12.field105;
                                }
                                if (var12.field123.method958((byte) -38) > 0) {
                                    var32 = var12.field123;
                                }
                            } else {
                                var33 = var12.field148;
                                if (class132.method1014(arg4, arg2 + 37, var11) && var12.field149 != 0) {
                                    var33 = var12.field149;
                                }
                            }
                            if (var12.field79 == 6 && (arg5 << 16) + var11 == class101.field2414) {
                                var32 = class7.field248;
                                var33 = var12.field148;
                            }
                            if (class49.field1302 == 479) {
                                if (var33 == 16776960) {
                                    var33 = 255;
                                }
                                if (var33 == 49152) {
                                    var33 = 16777215;
                                }
                            }
                            class130 var34 = class96.method720(127, var12, var32);
                            var31.method999(var34, var14, var13, var12.field81, var12.field94, var33, var12.field103, var12.field137, var12.field83, var12.field122);
                        } else if (class129.field3043) {
                            var9 = false;
                        }
                    } else if (var12.field110 == 5) {
                        class28 var35 = var12.method21(-1, class95.method712(256, var12));
                        if (var35 != null) {
                            var35.method233(var14, var13);
                        } else if (class129.field3043) {
                            var9 = false;
                        }
                    } else if (var12.field110 == 6) {
                        class12.method85(var12.field81 / 2 + var14, var12.field94 / 2 + var13);
                        int var36 = class12.field355[var12.field133] * var12.field112 >> 16;
                        int var37 = class12.field363[var12.field133] * var12.field112 >> 16;
                        boolean var38 = class95.method712(256, var12);
                        int var39;
                        if (var38) {
                            var39 = var12.field106;
                        } else {
                            var39 = var12.field71;
                        }
                        Object var40 = null;
                        class102 var41;
                        if (var12.field132 == 5) {
                            if (var12.field69 == 0) {
                                var41 = class79.field1905.method757(null, -1, false, -1, null);
                            } else {
                                var41 = class42.field1179.method10((byte) -38);
                            }
                        } else if (var39 == -1) {
                            var41 = var12.method19(var38, -1, null, class42.field1179.field1484, true);
                            if (var41 == null && class129.field3043) {
                                var9 = false;
                            }
                        } else {
                            class40 var42 = class85.method641(var39, 12);
                            var41 = var12.method19(var38, var12.field126, var42, class42.field1179.field1484, true);
                            if (var41 == null && class129.field3043) {
                                var9 = false;
                            }
                        }
                        if (var41 != null) {
                            var41.method778(0, var12.field85, 0, var12.field133, 0, var36, var37);
                        }
                        class12.method98();
                    } else {
                        if (var12.field110 == 7) {
                            class131 var43 = var12.method24(arg2 - 11817);
                            if (var43 == null) {
                                if (class129.field3043) {
                                    var9 = false;
                                }
                                continue;
                            }
                            int var44 = 0;
                            for (int var45 = 0; var45 < var12.field94; var45++) {
                                for (int var46 = 0; var46 < var12.field81; var46++) {
                                    if (var12.field72[var44] > 0) {
                                        class67 var47 = class84.method630((byte) 11, var12.field72[var44] - 1);
                                        class130 var48 = var47.field1688;
                                        if (var48 == null) {
                                            var48 = class72.field1825;
                                        }
                                        if (var47.field1714 == 1 || var12.field140[var44] != 1) {
                                            var48 = class15.method114(new class130[] { var48, class46.field1252, class7.method56(arg2 ^ 0xFFFFFFDC, var12.field140[var44]) }, -20349);
                                        }
                                        int var49 = (var12.field102 + 115) * var46 + var14;
                                        int var50 = (var12.field95 + 12) * var45 + var13;
                                        if (var12.field137 == 0) {
                                            var43.method1000(var48, var49, var50, var12.field148, var12.field103);
                                        } else if (var12.field137 == 1) {
                                            var43.method1006(var48, var12.field81 / 2 + var49, var50, var12.field148, var12.field103);
                                        } else {
                                            var43.method1007(var48, var49 + var12.field81 - 1, var50, var12.field148, var12.field103);
                                        }
                                    }
                                    var44++;
                                }
                            }
                        }
                        if (var12.field110 == 8 && class69.method563(var11, arg4, -2) && class37.field1087 == class19.field566) {
                            int var51 = 0;
                            int var52 = 0;
                            class130 var53 = var12.field147;
                            class131 var54 = class132.field3202;
                            class130 var55 = class96.method720(arg2 + 153, var12, var53);
                            while (var55.method958((byte) -38) > 0) {
                                int var63 = var55.method973(class22.field640, -31451);
                                class130 var64;
                                if (var63 == -1) {
                                    var64 = var55;
                                    var55 = class9.field295;
                                } else {
                                    var64 = var55.method970(true, var63, 0);
                                    var55 = var55.method977(var63 + 2, true);
                                }
                                int var65 = var54.method996(var64);
                                var52 += var54.field3165 + 1;
                                if (var51 < var65) {
                                    var51 = var65;
                                }
                            }
                            var52 += 7;
                            var51 += 6;
                            int var56 = var12.field94 + var13 + 5;
                            int var57 = var14 + var12.field81 - var51 - 5;
                            if (var14 + 5 > var57) {
                                var57 = var14 + 5;
                            }
                            if (var51 + var57 > arg7) {
                                var57 = arg7 - var51;
                            }
                            if (var56 + var52 > arg8) {
                                var56 = arg8 - var52;
                            }
                            class49.method440(var57, var56, var51, var52, 16777120);
                            class49.method431(var57, var56, var51, var52, 0);
                            class130 var58 = var12.field147;
                            int var59 = var56 + var54.field3165 + 2;
                            class130 var60 = class96.method720(86, var12, var58);
                            while (var60.method958((byte) -38) > 0) {
                                int var61 = var60.method973(class22.field640, -31451);
                                class130 var62;
                                if (var61 == -1) {
                                    var62 = var60;
                                    var60 = class9.field295;
                                } else {
                                    var62 = var60.method970(true, var61, 0);
                                    var60 = var60.method977(var61 + 2, true);
                                }
                                var54.method1000(var62, var57 + 3, var59, 0, false);
                                var59 += var54.field3165 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)J", line = 578)
    public static final synchronized long method668(boolean arg0) {
        field2178++;
        long var1 = System.currentTimeMillis();
        if (arg0) {
            method665(-3);
        }
        if (class2.field22 > var1) {
            field2184 += class2.field22 - var1;
        }
        class2.field22 = var1;
        return field2184 + var1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 631)
    public static final void method669(int arg0, int arg1) {
        field2175++;
        if (class40.field1109 == arg1) {
            return;
        }
        if (arg0 != 19013) {
            field2189 = null;
        }
        if (class40.field1109 == 0) {
            class109.method833(12455);
        }
        if (arg1 == 20 || arg1 == 40) {
            class95.field2295 = 0;
            class26.field760 = 0;
            class6.field211 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class10.field329 != null) {
            class10.field329.method148(arg0 ^ 0xFFFFB5BC);
            class10.field329 = null;
        }
        if (class40.field1109 == 25 || class40.field1109 == 40) {
            class84.method627(27800);
            class49.method433();
        }
        if (class40.field1109 == 25) {
            class119.field2906 = 1;
            class42.field1176 = 0;
            class96.field2317 = 1;
            class115.field2829 = 0;
            class54.field1403 = 0;
        }
        if (arg1 == 0 || arg1 == 35) {
            class105.method796(0);
            class33.method265(true);
            if (class52.field1365 == null) {
                class52.field1365 = class19.method173(503, 4, class84.field2003, 765);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class52.field1365 = null;
            class105.method796(0);
            class19.method174(class31.field864, 31029, class20.field587, class84.field2003);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class52.field1365 = null;
            class33.method265(true);
            class48.method427(-96, class84.field2003, class31.field864);
        }
        class43.field1191 = true;
        class40.field1109 = arg1;
    }
}
