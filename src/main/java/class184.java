import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class184 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Lnh;")
    public class525 field2759;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "S")
    public short field2752;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "B")
    public byte field2751;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "B")
    public byte field2757;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lmq;IIIIIIIII)V")
    public static final void method1287(class350[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2755++;
        class4.field109.method298(arg9, arg3, arg4, arg8);
        for (int var10 = arg1; var10 < arg0.length; var10++) {
            class350 var11 = arg0[var10];
            if (var11 != null && (var11.field5297 == arg6 || arg6 == -1412584499 && class475.field7100 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class362.field5483[class100.field1650].setBounds(var11.field5225 + arg2, var11.field5234 - -arg5, var11.field5329, var11.field5269);
                    var12 = class100.field1650++;
                } else {
                    var12 = arg7;
                }
                var11.field5339 = var12;
                var11.field5277 = class531.field7821;
                if (!client.method1340(var11)) {
                    if (var11.field5219 != 0) {
                        class392.method2421(var11, 150);
                    }
                    int var13 = var11.field5225 + arg2;
                    int var14 = var11.field5234 + arg5;
                    int var15 = var11.field5359;
                    if (class210.field3027 && (client.method1349(var11).field3585 != 0 || var11.field5215 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class475.field7100 == var11) {
                        if (arg6 != -1412584499 && (class166.field2575 == var11.field5275 || class443.field6621 == var11.field5275)) {
                            class77.field1299 = arg0;
                            class206.field2976 = arg2;
                            class223.field3195 = arg5;
                            continue;
                        }
                        if (class95.field1608 && class449.field6730) {
                            int var16 = class166.field2579.method1024(true);
                            int var17 = class166.field2579.method1019((byte) 3);
                            int var18 = var17 - class438.field6545;
                            int var19 = var16 - class77.field1288;
                            if (class481.field7163 > var19) {
                                var19 = class481.field7163;
                            }
                            if (var18 < class280.field4017) {
                                var18 = class280.field4017;
                            }
                            if ((var11.field5329 + var19) > (class481.field7163 + class78.field1310.field5329)) {
                                var19 = class481.field7163 + class78.field1310.field5329 - var11.field5329;
                            }
                            var13 = var19;
                            if (class280.field4017 + class78.field1310.field5269 < var18 - -var11.field5269) {
                                var18 = class78.field1310.field5269 + class280.field4017 - var11.field5269;
                            }
                            var14 = var18;
                        }
                        if (class443.field6621 == var11.field5275) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field5215 == 2) {
                        var20 = arg8;
                        var21 = arg4;
                        var22 = arg3;
                        var23 = arg9;
                    } else {
                        int var24 = var11.field5329 + var13;
                        int var25 = var11.field5269 + var14;
                        var22 = var14 > arg3 ? var14 : arg3;
                        if (var11.field5215 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = arg9 < var13 ? var13 : arg9;
                        var21 = var24 >= arg4 ? arg4 : var24;
                        var20 = arg8 > var25 ? var25 : arg8;
                    }
                    if (var23 < var21 && var22 < var20) {
                        if (var11.field5219 != 0) {
                            if (class128.field2041 == var11.field5219 || class201.field2944 == var11.field5219) {
                                class219.method1458(var13, (byte) 118, var11.field5329, var11.field5269, var14, class201.field2944 == var11.field5219);
                                class355.field5424[var12] = true;
                                class4.field109.method298(arg9, arg3, arg4, arg8);
                                continue;
                            }
                            if (class419.field6274 == var11.field5219) {
                                if (var11.method2218((byte) 72, class4.field109) != null) {
                                    class386.method2389(15804);
                                    class141.method1049(18, var14, var11, class4.field109, var13);
                                    class467.field6966[var12] = true;
                                    class4.field109.method298(arg9, arg3, arg4, arg8);
                                }
                                continue;
                            }
                            if (class86.field1487 == var11.field5219) {
                                if (var11.method2218((byte) 72, class4.field109) != null) {
                                    class37.method386(true, var14, var13, var11);
                                    class467.field6966[var12] = true;
                                    class4.field109.method298(arg9, arg3, arg4, arg8);
                                }
                                continue;
                            }
                            if (class41.field742 == var11.field5219) {
                                class457.method2718(111, class455.field6791, var11.field5329, var13, class4.field109, var11.field5269, var14);
                                class355.field5424[var12] = true;
                                class4.field109.method298(arg9, arg3, arg4, arg8);
                                continue;
                            }
                            if (class30.field637 == var11.field5219) {
                                class185.method1291(var14, -128, var11.field5329, var13, class4.field109, var11.field5269);
                                class355.field5424[var12] = true;
                                class4.field109.method298(arg9, arg3, arg4, arg8);
                                continue;
                            }
                            if (class363.field5506 == var11.field5219) {
                                if (!class109.field1828 && !class158.field2468) {
                                    continue;
                                }
                                int var26 = var13 + var11.field5329;
                                int var27 = var14 + 15;
                                if (class109.field1828) {
                                    class464.field6944.method2906(13162, -1, var26, -256, var27, "Fps:" + class521.field7735);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class464.field6944.method2906(13162, -1, var26, var30, var27, "Mem:" + var29 + "k");
                                    var27 += 15;
                                    class464.field6944.method2906(13162, -1, var26, -256, var27, "In:" + class341.field5147 + "B/s Out:" + class124.field2007 + "B/s");
                                    var27 += 15;
                                    int var31 = class4.field109.method217() / 1024;
                                    class464.field6944.method2906(arg1 + 13162, -1, var26, var31 <= 65536 ? -256 : -65536, var27, "Offheap:" + var31 + "k");
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class197.field2914[var35].method1628(arg1);
                                        var33 += class197.field2914[var35].method1627(arg1 ^ 0xFF);
                                        var34 += class197.field2914[var35].method1631(1);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class338.method2164(0, (long) var37, (byte) -88, 2, true) + "% (" + var36 + "%)";
                                    class328.field4954.method2906(13162, -1, var26, -256, var27, var38);
                                    var27 += 12;
                                }
                                if (class123.field1994 > 0) {
                                    class328.field4954.method2906(arg1 + 13162, -1, var26, -256, var27, "Particles: " + class85.field1467 + " / " + class123.field1994);
                                }
                                var27 += 12;
                                if (class158.field2468) {
                                    class328.field4954.method2906(13162, -1, var26, -256, var27, "Polys: " + class4.field109.method228() + " Models: " + class4.field109.method252());
                                    var27 += 12;
                                    class328.field4954.method2906(arg1 ^ 0x336A, -1, var26, -256, var27, "Ls: " + class141.field2243 + " La: " + class275.field3982 + " NPC: " + class150.field2387 + " Pl: " + class335.field5060);
                                    var27 += 12;
                                    class69.method568((byte) 68);
                                }
                                class355.field5424[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field5215 == 0) {
                            if (class138.field2186 == var11.field5219 && class4.field109.method264()) {
                                class4.field109.method207(var13, var14, var11.field5329, var11.field5269);
                            }
                            method1287(arg0, arg1, var13 - var11.field5265, var22, var21, var14 - var11.field5226, var11.field5322, var12, var20, var23);
                            if (var11.field5291 != null) {
                                method1287(var11.field5291, 0, var13 - var11.field5265, var22, var21, var14 - var11.field5226, var11.field5322, var12, var20, var23);
                            }
                            class352 var39 = (class352) class162.field2507.method171((byte) 105, (long) var11.field5322);
                            if (var39 != null) {
                                class50.method462(var13, var14, var21, var39.field5391, var12, var23, 75, var20, var22);
                            }
                            if (class138.field2186 == var11.field5219 && class4.field109.method264()) {
                                class4.field109.method206();
                                class348.field5198 = true;
                            }
                            class4.field109.method298(arg9, arg3, arg4, arg8);
                        }
                        if (class115.field1908[var12] || class506.field7461 > 1) {
                            if (var11.field5215 == 3) {
                                if (var15 == 0) {
                                    if (var11.field5335) {
                                        class4.field109.method253(var13, var14, var11.field5329, var11.field5269, var11.field5312, 0);
                                    } else {
                                        class4.field109.method239(var13, var14, var11.field5329, var11.field5269, var11.field5312, 0);
                                    }
                                } else if (var11.field5335) {
                                    class4.field109.method253(var13, var14, var11.field5329, var11.field5269, 255 - (var15 & 0xFF) << 24 | var11.field5312 & 0xFFFFFF, 1);
                                } else {
                                    class4.field109.method239(var13, var14, var11.field5329, var11.field5269, var11.field5312 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field5215 == 4) {
                                class489 var40 = var11.method2215(class4.field109, (byte) -81);
                                if (var40 != null) {
                                    int var41 = var11.field5312;
                                    String var42 = var11.field5364;
                                    if (var11.field5273 != -1) {
                                        class134 var43 = class367.field5550.method1312((byte) 91, var11.field5273);
                                        var42 = var43.field2133;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field2107 == 1 || var11.field5296 != 1) && var11.field5296 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class40.method408(-30278, var11.field5296);
                                        }
                                    }
                                    if (class162.field2513 == var11) {
                                        var42 = class39.field721.method2180(client.field2870, arg1 ^ 0x7333);
                                        var41 = var11.field5312;
                                    }
                                    if (class96.field1612) {
                                        class4.field109.method198(var13, var14, var11.field5329 + var13, var11.field5269 + var14);
                                    }
                                    var40.method2911(var11.field5263, var14, 255 - (var15 & 0xFF) << 24 | var41, var13, 0, var11.field5360 ? 255 - (var15 & 0xFF) << 24 : -1, var42, 0, null, var11.field5299, var11.field5250, null, var11.field5329, var11.field5231, var11.field5269, arg1 + 126, class35.field675);
                                    if (class96.field1612) {
                                        class4.field109.method298(arg9, arg3, arg4, arg8);
                                    }
                                } else if (class412.field6162) {
                                    class302.method1902((byte) -91, var11);
                                }
                            } else if (var11.field5215 == 5) {
                                if (var11.field5233 >= 0) {
                                    var11.method2223(class2.field93, arg1 - 2, class519.field7721).method791(var14, 0, var11.field5311 << 3, var11.field5269, -20488, 0, var11.field5329, class4.field109, var11.field5224 << 3, var13);
                                } else {
                                    class529 var44;
                                    if (var11.field5273 == -1) {
                                        var44 = var11.method2216(class4.field109, false);
                                    } else {
                                        class19 var45 = var11.field5282 ? class139.field2224.field3717 : null;
                                        var44 = class367.field5550.method1311(var11.field5367 | 0xFF000000, var11.field5252, var11.field5213, var11.field5296, class4.field109, var11.field5273, -82, var45);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method100();
                                        int var47 = var44.method104();
                                        int var48 = (var11.field5312 == 0 ? 16777215 : var11.field5312 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field5315) {
                                            class4.field109.method198(var13, var14, var11.field5329 + var13, var11.field5269 + var14);
                                            if (var11.field5351 != 0) {
                                                int var49 = (var11.field5329 + var46 - 1) / var46;
                                                int var50 = (var11.field5269 + var47 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field5312 == 0) {
                                                            var44.method3139((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field5351);
                                                        } else {
                                                            var44.method3134((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field5351, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field5312 == 0 && var15 == 0) {
                                                var44.method3133(var13, var14, var11.field5329, var11.field5269);
                                            } else {
                                                var44.method110(var13, var14, var11.field5329, var11.field5269, 0, var48, 1);
                                            }
                                            class4.field109.method298(arg9, arg3, arg4, arg8);
                                        } else if (var11.field5312 == 0 && var15 == 0) {
                                            if (var11.field5351 != 0) {
                                                var44.method3139((float) var11.field5329 / 2.0F + (float) var13, (float) var11.field5269 / 2.0F + (float) var14, var11.field5329 * 4096 / var46, var11.field5351);
                                            } else if (var11.field5329 == var46 && var11.field5269 == var47) {
                                                var44.method3137(var13, var14);
                                            } else {
                                                var44.method3135(var13, var14, var11.field5329, var11.field5269);
                                            }
                                        } else if (var11.field5351 != 0) {
                                            var44.method3134((float) var11.field5329 / 2.0F + (float) var13, (float) var11.field5269 / 2.0F + (float) var14, var11.field5329 * 4096 / var46, var11.field5351, 0, var48, 1);
                                        } else if (var11.field5329 == var46 && var11.field5269 == var47) {
                                            var44.method102(var13, var14, 0, var48, 1);
                                        } else {
                                            var44.method105(var13, var14, var11.field5329, var11.field5269, 0, var48, 1);
                                        }
                                    } else if (class412.field6162) {
                                        class302.method1902((byte) -78, var11);
                                    }
                                }
                            } else if (var11.field5215 == 6) {
                                class185.method1294(0);
                                class121 var53 = null;
                                int var54 = 0;
                                if (var11.field5273 != -1) {
                                    class134 var62 = class367.field5550.method1312((byte) 91, var11.field5273);
                                    if (var62 != null) {
                                        class134 var63 = var62.method996(var11.field5296, -11);
                                        class165 var64 = var11.field5276 == -1 ? null : class431.field6419.method1137(-107, var11.field5276);
                                        class19 var65 = var11.field5282 ? class139.field2224.field3717 : null;
                                        var53 = var63.method998(var11.field5342, 1, var64, var65, var11.field5323, var11.field5220, (byte) 37, 2048, class4.field109);
                                        if (var53 == null) {
                                            class302.method1902((byte) -104, var11);
                                        } else {
                                            var54 = -var53.method930() >> 1;
                                        }
                                    }
                                } else if (var11.field5286 == 5) {
                                    int var55 = var11.field5260;
                                    if (var55 >= 0 && var55 < 2048) {
                                        class256 var56 = class183.field2747[var55];
                                        class165 var57 = var11.field5276 == -1 ? null : class431.field6419.method1137(28, var11.field5276);
                                        if (var56 != null && (class148.field2368 == var55 || class90.method701(123, var56.field3684) == var11.field5258)) {
                                            var53 = var56.field3717.method155(class367.field5550, -1, var11.field5342, false, class335.field5059, true, var57, null, var11.field5220, class217.field3125, var11.field5323, class203.field2969, class4.field109, class431.field6419, 2048, null, 0, 0, class61.field1070);
                                        }
                                    }
                                } else if (var11.field5286 == 8 || var11.field5286 == 9) {
                                    class328 var59 = class475.method2847(var11.field5260, false, (byte) 113);
                                    class165 var60 = var11.field5276 == -1 ? null : class431.field6419.method1137(-99, var11.field5276);
                                    if (var59 != null) {
                                        class19 var61 = var11.field5282 ? class139.field2224.field3717 : null;
                                        var53 = var59.method2105(2048, var11.field5323, var11.field5286 == 9, var11.field5342, var61, var60, var11.field5220, class4.field109, var11.field5258, arg1 ^ 0x5D);
                                    }
                                } else if (var11.field5276 == -1) {
                                    var53 = var11.method2228(class4.field109, class203.field2969, 2048, class335.field5059, class139.field2224.field3717, 0, class61.field1070, class431.field6419, class367.field5550, -1, -1, class217.field3125, -1, null);
                                    if (var53 == null && class412.field6162) {
                                        class302.method1902((byte) -121, var11);
                                    }
                                } else {
                                    class165 var58 = class431.field6419.method1137(60, var11.field5276);
                                    var53 = var11.method2228(class4.field109, class203.field2969, 2048, class335.field5059, class139.field2224.field3717, var11.field5220, class61.field1070, class431.field6419, class367.field5550, var11.field5323, -1, class217.field3125, var11.field5342, var58);
                                    if (var53 == null && class412.field6162) {
                                        class302.method1902((byte) 82, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field5356 > 0) {
                                        var66 = (var11.field5329 << 9) / var11.field5356;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field5229 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field5269 << 9) / var11.field5229;
                                    }
                                    int var68 = var13 - (-(var11.field5353 * var66 >> 9) - (var11.field5329 / 2));
                                    int var69 = var11.field5269 / 2 + var14 + (var11.field5344 * var67 >> 9);
                                    class513.field7546.method872();
                                    class4.field109.method302(class513.field7546);
                                    class4.field109.method230(var68, var69, var66, var67);
                                    class4.field109.method300((float) (var11.field5340 << 0), var11.field5317 ? (float) (var11.field5289 << 0) : (float) (var11.field5289 << 0) * 1.5F);
                                    if (arg6 == -1412584499 || class348.field5198) {
                                        class4.field109.method258();
                                        class4.field109.method291();
                                        class4.field109.method298(arg9, arg3, arg4, arg8);
                                        class348.field5198 = false;
                                    }
                                    if (var11.field5243) {
                                        class4.field109.method220(false);
                                    }
                                    int var70 = (var11.field5253 << 0) * class528.field7783[var11.field5261 << 3] >> 15;
                                    int var71 = (var11.field5253 << 0) * class528.field7786[var11.field5261 << 3] >> 15;
                                    class170.field2632.method869(-var11.field5321 << 3);
                                    class170.field2632.method865(var11.field5361 << 3);
                                    class170.field2632.method876(var11.field5308 << 0, (var11.field5288 << 0) + (var70 + var54), (var11.field5288 << 0) + var71);
                                    class170.field2632.method867(var11.field5261 << 3);
                                    if (class96.field1612) {
                                        class4.field109.method198(var13, var14, var13 + var11.field5329, var11.field5269 + var14);
                                    }
                                    if (var11.field5317) {
                                        var53.method899(class170.field2632, null, var11.field5253 << 0, 1);
                                    } else {
                                        var53.method927(class170.field2632, null, 1);
                                    }
                                    if (class96.field1612) {
                                        class4.field109.method298(arg9, arg3, arg4, arg8);
                                    }
                                    if (var11.field5243) {
                                        class4.field109.method220(true);
                                    }
                                    class4.field109.method300(0.0F, 0.0F);
                                }
                            } else if (var11.field5215 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field5336) {
                                    var72 = var11.field5329 + var13;
                                    var73 = var11.field5269 + var14;
                                    var74 = var13;
                                    var75 = var14;
                                } else {
                                    var73 = var14;
                                    var74 = var13;
                                    var72 = var11.field5329 + var13;
                                    var75 = var11.field5269 + var14;
                                }
                                if (var11.field5324 == 1) {
                                    class4.field109.method282(var74, var73, var72, var75, var11.field5312, 0);
                                } else {
                                    class4.field109.method201(var74, var73, var72, var75, var11.field5312, var11.field5324, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)I")
    public static final int method1288(byte arg0, int arg1, int arg2) {
        field2754++;
        if (arg0 != 13) {
            method1290(-107, null);
        }
        return arg2 == 4 || arg2 == 5 ? class40.field727[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)I")
    public static final int method1289(int arg0, int arg1, byte arg2) {
        int var3 = 111 % ((arg2 - 62) / 47);
        field2760++;
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILck;)V")
    public static final void method1290(int arg0, class452 arg1) {
        field2753++;
        int var2 = 0;
        arg1.method2701(19466);
        for (int var3 = 0; var3 < class409.field6135; var3++) {
            int var15 = class358.field5445[var3];
            if ((class386.field5822[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class386.field5822[var15] = (byte) class121.method909(class386.field5822[var15], 2);
                    var2--;
                } else {
                    int var16 = arg1.method2700((byte) 87, 1);
                    if (var16 == 0) {
                        var2 = class438.method2623(arg0 - 12, arg1);
                        class386.field5822[var15] = (byte) class121.method909(class386.field5822[var15], 2);
                    } else {
                        class96.method733(var15, false, arg1);
                    }
                }
            }
        }
        arg1.method2702(10492);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2701(arg0 + 19467);
        for (int var4 = 0; var4 < class409.field6135; var4++) {
            int var13 = class358.field5445[var4];
            if ((class386.field5822[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class386.field5822[var13] = (byte) class121.method909(class386.field5822[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method2700((byte) 87, 1);
                    if (var14 == 0) {
                        var2 = class438.method2623(arg0 - 11, arg1);
                        class386.field5822[var13] = (byte) class121.method909(class386.field5822[var13], 2);
                    } else {
                        class96.method733(var13, false, arg1);
                    }
                }
            }
        }
        arg1.method2702(arg0 + 10493);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2701(19466);
        for (int var5 = 0; var5 < class498.field7359; var5++) {
            int var11 = class447.field6709[var5];
            if ((class386.field5822[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class386.field5822[var11] = (byte) class121.method909(class386.field5822[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method2700((byte) 87, 1);
                    if (var12 == 0) {
                        var2 = class438.method2623(arg0 + 13, arg1);
                        class386.field5822[var11] = (byte) class121.method909(class386.field5822[var11], 2);
                    } else if (class134.method1001(arg0 + 1, arg1, var11)) {
                        class386.field5822[var11] = (byte) class121.method909(class386.field5822[var11], 2);
                    }
                }
            }
        }
        arg1.method2702(10492);
        if (~var2 != arg0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2701(arg0 ^ 0xFFFFB3F5);
        for (int var6 = 0; var6 < class498.field7359; var6++) {
            int var9 = class447.field6709[var6];
            if ((class386.field5822[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class386.field5822[var9] = (byte) class121.method909(class386.field5822[var9], 2);
                } else {
                    int var10 = arg1.method2700((byte) 87, 1);
                    if (var10 == 0) {
                        var2 = class438.method2623(108, arg1);
                        class386.field5822[var9] = (byte) class121.method909(class386.field5822[var9], 2);
                    } else if (class134.method1001(0, arg1, var9)) {
                        class386.field5822[var9] = (byte) class121.method909(class386.field5822[var9], 2);
                    }
                }
            }
        }
        arg1.method2702(arg0 ^ 0xFFFFD703);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class498.field7359 = 0;
        class409.field6135 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class386.field5822[var7] = (byte) (class386.field5822[var7] >> 1);
            class256 var8 = class183.field2747[var7];
            if (var8 == null) {
                class447.field6709[class498.field7359++] = var7;
            } else {
                class358.field5445[class409.field6135++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lnh;III)V")
    public class184(class525 arg0, int arg1, int arg2, int arg3) {
        this.field2759 = arg0;
        this.field2752 = (short) arg1;
        this.field2751 = (byte) arg2;
        this.field2757 = (byte) arg3;
    }
}
