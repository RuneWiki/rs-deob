import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class124 extends class503 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Z")
    private boolean field1600 = false;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lhu;")
    private class81 field1610;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lwt;")
    public static class194 field1602 = new class194("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Ldc;")
    public static class5 field1607 = new class5(5);

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "Z")
    public static boolean field1612 = true;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    private static int field1613 = 1405;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIB[Lts;IIIII)V")
    public static final void method699(int arg0, int arg1, int arg2, byte arg3, class356[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1601;
        class481.field6937.method810(arg6, arg9, arg2, arg0);
        if (arg3 == 39) {
            for (int var10 = 0; var10 < arg4.length; ++var10) {
                class356 var11 = arg4[var10];
                if (var11 != null && (~var11.field5160 == ~arg1 || ~arg1 == 1412584498 && class164.field2146 == var11)) {
                    int var12;
                    if (arg7 != -1) {
                        var12 = arg7;
                    } else {
                        class309.field4495[class55.field845].setBounds(var11.field5209 + arg8, var11.field5179 + arg5, var11.field5168, var11.field5169);
                        var12 = class55.field845++;
                    }
                    var11.field5157 = class263.field3748;
                    var11.field5295 = var12;
                    if (!client.method1191(var11)) {
                        if (~var11.field5192 != -1) {
                            class90.method558(var11, 2047);
                        }
                        int var13 = var11.field5209 - -arg8;
                        int var14 = var11.field5179 + arg5;
                        int var15 = var11.field5196;
                        if (class27.field438 && (client.method1188(var11).field7487 != 0 || var11.field5170 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class164.field2146 == var11) {
                            if (arg1 != -1412584499 && (class53.field795 == var11.field5260 || ~class431.field6330 == ~var11.field5260)) {
                                class188.field2684 = arg8;
                                class235.field3305 = arg4;
                                class139.field1821 = arg5;
                                continue;
                            }
                            if (class89.field1214 && class212.field3006) {
                                int var16 = class137.field1797.method2038(9);
                                int var17 = class137.field1797.method2044((byte) -100);
                                int var18 = var16 - class117.field1518;
                                int var19 = var17 - class389.field5776;
                                if (class295.field4284 > var18) {
                                    var18 = class295.field4284;
                                }
                                if (class65.field967 > var19) {
                                    var19 = class65.field967;
                                }
                                if (var11.field5168 + var18 > class295.field4284 + class65.field965.field5168) {
                                    var18 = class295.field4284 + class65.field965.field5168 + -var11.field5168;
                                }
                                if (var11.field5169 + var19 > class65.field967 - -class65.field965.field5169) {
                                    var19 = -var11.field5169 + class65.field967 + class65.field965.field5169;
                                }
                                var13 = var18;
                                var14 = var19;
                            }
                            if (class431.field6330 == var11.field5260) {
                                var15 = 128;
                            }
                        }
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (~var11.field5170 != -3) {
                            int var20 = var11.field5168 + var13;
                            int var21 = var11.field5169 + var14;
                            var22 = var14 <= arg9 ? arg9 : var14;
                            var23 = ~var13 < ~arg6 ? var13 : arg6;
                            if (var11.field5170 == 9) {
                                ++var21;
                                ++var20;
                            }
                            var24 = arg0 > var21 ? var21 : arg0;
                            var25 = ~arg2 >= ~var20 ? arg2 : var20;
                        } else {
                            var23 = arg6;
                            var25 = arg2;
                            var24 = arg0;
                            var22 = arg9;
                        }
                        if (var25 > var23 && var24 > var22) {
                            if (var11.field5192 != 0) {
                                if (class154.field1972 == var11.field5192 || ~class337.field4913 == ~var11.field5192) {
                                    class154.method933(var11.field5168, var11.field5169, var13, -1, var14, class337.field4913 == var11.field5192);
                                    class61.field909[var12] = true;
                                    class481.field6937.method810(arg6, arg9, arg2, arg0);
                                    continue;
                                }
                                if (class475.field6851 == var11.field5192) {
                                    if (var11.method2162(0, class481.field6937) != null) {
                                        class498.method2992(arg3 + -39);
                                        class473.method2767((byte) 107, var14, var11, var13, class481.field6937);
                                        class187.field2653[var12] = true;
                                        class481.field6937.method810(arg6, arg9, arg2, arg0);
                                    }
                                    continue;
                                }
                                if (~class75.field1069 == ~var11.field5192) {
                                    if (var11.method2162(0, class481.field6937) != null) {
                                        class348.method2100(var14, var11, 86, var13);
                                        class187.field2653[var12] = true;
                                        class481.field6937.method810(arg6, arg9, arg2, arg0);
                                    }
                                    continue;
                                }
                                if (class354.field5118 == var11.field5192) {
                                    class507.method3053(13555, var13, var14, var11.field5168, class147.field1916, var11.field5169, class481.field6937);
                                    class61.field909[var12] = true;
                                    class481.field6937.method810(arg6, arg9, arg2, arg0);
                                    continue;
                                }
                                if (~class381.field5679 == ~var11.field5192) {
                                    class16.method119(var13, var14, var11.field5169, 0, class481.field6937, var11.field5168);
                                    class61.field909[var12] = true;
                                    class481.field6937.method810(arg6, arg9, arg2, arg0);
                                    continue;
                                }
                                if (~field1613 == ~var11.field5192) {
                                    if (!class174.field2389 && !class152.field1956) {
                                        continue;
                                    }
                                    int var26 = var11.field5168 + var13;
                                    int var27 = var14 + 15;
                                    if (class174.field2389) {
                                        class181.field2587.method2103(var27, false, "Fps:" + class35.field556, var26, -256, -1);
                                        var27 += 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        int var30 = -256;
                                        if (~var29 < -65537) {
                                            var30 = -65536;
                                        }
                                        class181.field2587.method2103(var27, false, "Mem:" + var29 + "k", var26, var30, -1);
                                        var27 += 15;
                                        class181.field2587.method2103(var27, false, "In:" + class167.field2189 + "B/s Out:" + class363.field5457 + "B/s", var26, -256, -1);
                                        var27 += 15;
                                        int var31 = class481.field6937.method750() / 1024;
                                        class181.field2587.method2103(var27, false, "Offheap:" + var31 + "k", var26, var31 <= 65536 ? -256 : -65536, -1);
                                        var27 += 15;
                                        int var32 = 0;
                                        int var33 = 0;
                                        int var34 = 0;
                                        for (int var35 = 0; var35 < 30; ++var35) {
                                            var32 += class375.field5606[var35].method1420((byte) -77);
                                            var33 += class375.field5606[var35].method1421(-30995);
                                            var34 += class375.field5606[var35].method1409(22097);
                                        }
                                        int var36 = var34 * 100 / var32;
                                        int var37 = var33 * 10000 / var32;
                                        String var38 = "Cache:" + class452.method2631(0, 2, (long) var37, (byte) -81, true) + "% (" + var36 + "%)";
                                        class95.field1282.method2103(var27, false, var38, var26, -256, -1);
                                        var27 += 12;
                                    }
                                    if (~class409.field6001 < -1) {
                                        class95.field1282.method2103(var27, false, "Particles: " + class363.field5462 + " / " + class409.field6001, var26, -256, -1);
                                    }
                                    var27 += 12;
                                    if (class152.field1956) {
                                        class95.field1282.method2103(var27, false, "Polys: " + class481.field6937.method838() + " Models: " + class481.field6937.method788(), var26, -256, -1);
                                        var27 += 12;
                                        class95.field1282.method2103(var27, false, "Ls: " + class487.field7297 + " La: " + class16.field236 + " NPC: " + class455.field6630 + " Pl: " + class444.field6479, var26, -256, -1);
                                        var27 += 12;
                                        class20.method147((byte) -53);
                                    }
                                    class61.field909[var12] = true;
                                    continue;
                                }
                            }
                            if (~var11.field5170 == -1) {
                                if (~class407.field5970 == ~var11.field5192 && class481.field6937.method822()) {
                                    class481.field6937.method779(var13, var14, var11.field5168, var11.field5169);
                                }
                                method699(var24, var11.field5185, var25, (byte) 39, arg4, -var11.field5144 + var14, var23, var12, var13 - var11.field5219, var22);
                                if (var11.field5151 != null) {
                                    method699(var24, var11.field5185, var25, (byte) 39, var11.field5151, var14 - var11.field5144, var23, var12, -var11.field5219 + var13, var22);
                                }
                                class311 var39 = (class311) class213.field3010.method2310((byte) 66, (long) var11.field5185);
                                if (var39 != null) {
                                    class100.method605(var25, var22, var14, var12, -1, var13, var23, var24, var39.field4525);
                                }
                                if (class407.field5970 == var11.field5192 && class481.field6937.method822()) {
                                    class481.field6937.method776();
                                    class415.field6146 = true;
                                }
                                class481.field6937.method810(arg6, arg9, arg2, arg0);
                            }
                            if (class193.field2738[var12] || class78.field1099 > 1) {
                                if (~var11.field5170 == -4) {
                                    if (~var15 == -1) {
                                        if (!var11.field5255) {
                                            class481.field6937.method738(var13, var14, var11.field5168, var11.field5169, var11.field5193, 0);
                                        } else {
                                            class481.field6937.method770(var13, var14, var11.field5168, var11.field5169, var11.field5193, 0);
                                        }
                                    } else if (!var11.field5255) {
                                        class481.field6937.method738(var13, var14, var11.field5168, var11.field5169, -(var15 & 255) + 255 << 24 | var11.field5193 & 16777215, 1);
                                    } else {
                                        class481.field6937.method770(var13, var14, var11.field5168, var11.field5169, -(var15 & 255) + 255 << 24 | var11.field5193 & 16777215, 1);
                                    }
                                } else if (~var11.field5170 == -5) {
                                    class348 var40 = var11.method2153(-2, class481.field6937);
                                    if (var40 == null) {
                                        if (class388.field5760) {
                                            class170.method1068(-62, var11);
                                        }
                                    } else {
                                        int var41 = var11.field5193;
                                        String var42 = var11.field5246;
                                        if (~var11.field5174 != 0) {
                                            class361 var43 = class405.field5947.method1162(var11.field5174, arg3 + -39);
                                            var42 = var43.field5353;
                                            if (var42 == null) {
                                                var42 = "null";
                                            }
                                            if ((~var43.field5401 == -2 || var11.field5222 != 1) && ~var11.field5222 != 0) {
                                                var42 = "<col=ff9040>" + var42 + "</col> x" + class25.method221(var11.field5222, true);
                                            }
                                        }
                                        if (class319.field4688 == var11) {
                                            var42 = class71.field1049.method1220(2969, class81.field1122);
                                            var41 = var11.field5193;
                                        }
                                        if (class125.field1617) {
                                            class481.field6937.method789(var13, var14, var11.field5168 + var13, var14 - -var11.field5169);
                                        }
                                        var40.method2099(var11.field5168, var11.field5256, (class372) null, var11.field5268, 0, var11.field5134, class106.field1421, var11.field5180 ? -(var15 & 255) + 255 << 24 : -1, var41 | -(var15 & 255) + 255 << 24, var11.field5204, var11.field5169, 0, var42, (int[]) null, 12426, var13, var14);
                                        if (class125.field1617) {
                                            class481.field6937.method810(arg6, arg9, arg2, arg0);
                                        }
                                    }
                                } else if (var11.field5170 == 5) {
                                    if (~var11.field5231 > -1) {
                                        class307 var45;
                                        if (var11.field5174 != -1) {
                                            class206 var44 = var11.field5286 ? class415.field6145.field4599 : null;
                                            var45 = class405.field5947.method1152(var11.field5173, var11.field5222, 16131, var44, class481.field6937, var11.field5174, -16777216 | var11.field5132, var11.field5216);
                                        } else {
                                            var45 = var11.method2170(-1, class481.field6937);
                                        }
                                        if (var45 != null) {
                                            int var46 = var45.method87();
                                            int var47 = var45.method94();
                                            int var48 = -(255 & var15) + 255 << 24 | (~var11.field5193 != -1 ? 16777215 & var11.field5193 : 16777215);
                                            if (!var11.field5206) {
                                                if (~var11.field5193 == -1 && ~var15 == -1) {
                                                    if (~var11.field5137 != -1) {
                                                        var45.method1846((float) var11.field5168 / 2.0F + (float) var13, (float) var11.field5169 / 2.0F + (float) var14, var11.field5168 * 4096 / var46, var11.field5137);
                                                    } else if (var11.field5168 == var46 && ~var11.field5169 == ~var47) {
                                                        var45.method1845(var13, var14);
                                                    } else {
                                                        var45.method1844(var13, var14, var11.field5168, var11.field5169);
                                                    }
                                                } else if (var11.field5137 != 0) {
                                                    var45.method1842((float) var11.field5168 / 2.0F + (float) var13, (float) var11.field5169 / 2.0F + (float) var14, var11.field5168 * 4096 / var46, var11.field5137, 0, var48, 1);
                                                } else if (var11.field5168 == var46 && var11.field5169 == var47) {
                                                    var45.method90(var13, var14, 0, var48, 1);
                                                } else {
                                                    var45.method86(var13, var14, var11.field5168, var11.field5169, 0, var48, 1);
                                                }
                                            } else {
                                                class481.field6937.method789(var13, var14, var11.field5168 + var13, var14 - -var11.field5169);
                                                if (var11.field5137 != 0) {
                                                    int var49 = (var11.field5168 + var46 + -1) / var46;
                                                    int var50 = (var11.field5169 + var47 + -1) / var47;
                                                    for (int var51 = 0; ~var49 < ~var51; ++var51) {
                                                        for (int var52 = 0; ~var50 < ~var52; ++var52) {
                                                            if (var11.field5193 != 0) {
                                                                var45.method1842((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field5137, 0, var48, 1);
                                                            } else {
                                                                var45.method1846((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var47 * var52 + var14), 4096, var11.field5137);
                                                            }
                                                        }
                                                    }
                                                } else if (var11.field5193 == 0 && ~var15 == -1) {
                                                    var45.method1843(var13, var14, var11.field5168, var11.field5169);
                                                } else {
                                                    var45.method92(var13, var14, var11.field5168, var11.field5169, 0, var48, 1);
                                                }
                                                class481.field6937.method810(arg6, arg9, arg2, arg0);
                                            }
                                        } else if (class388.field5760) {
                                            class170.method1068(-122, var11);
                                        }
                                    } else {
                                        var11.method2160((byte) 60, class75.field1067, class66.field988).method590(var11.field5207 << 3, 0, var13, 0, var11.field5233 << 3, var11.field5168, class481.field6937, 124, var14, var11.field5169);
                                    }
                                } else if (var11.field5170 != 6) {
                                    if (var11.field5170 == 9) {
                                        int var72;
                                        int var73;
                                        int var74;
                                        int var75;
                                        if (!var11.field5265) {
                                            var72 = var11.field5169 + var14;
                                            var73 = var14;
                                            var74 = var11.field5168 + var13;
                                            var75 = var13;
                                        } else {
                                            var75 = var13;
                                            var74 = var11.field5168 + var13;
                                            var72 = var14;
                                            var73 = var11.field5169 + var14;
                                        }
                                        if (~var11.field5171 == -2) {
                                            class481.field6937.method803(var75, var73, var74, var72, var11.field5193, 0);
                                        } else {
                                            class481.field6937.method782(var75, var73, var74, var72, var11.field5193, var11.field5171, 0);
                                        }
                                    }
                                } else {
                                    class360.method2184(arg3 ^ 33);
                                    class327 var53 = null;
                                    int var54 = 0;
                                    if (~var11.field5174 == 0) {
                                        if (var11.field5141 != 5) {
                                            if (~var11.field5141 != -9 && var11.field5141 != 9) {
                                                if (var11.field5212 == -1) {
                                                    var53 = var11.method2154(class286.field4083, -1, class415.field6145.field4599, -1, class508.field7744, class481.field6937, (class168) null, class315.field4621, 0, 0, class453.field6591, 2048, class89.field1220, class405.field5947);
                                                    if (var53 == null && class388.field5760) {
                                                        class170.method1068(-45, var11);
                                                    }
                                                } else {
                                                    class168 var55 = class286.field4083.method2602(-24462, var11.field5212);
                                                    var53 = var11.method2154(class286.field4083, var11.field5217, class415.field6145.field4599, var11.field5221, class508.field7744, class481.field6937, var55, class315.field4621, 0, var11.field5224, class453.field6591, 2048, class89.field1220, class405.field5947);
                                                    if (var53 == null && class388.field5760) {
                                                        class170.method1068(arg3 + -115, var11);
                                                    }
                                                }
                                            } else {
                                                class220 var56 = class224.method1384(false, true, var11.field5191);
                                                class168 var57 = ~var11.field5212 != 0 ? class286.field4083.method2602(-24462, var11.field5212) : null;
                                                if (var56 != null) {
                                                    class206 var58 = !var11.field5286 ? null : class415.field6145.field4599;
                                                    var53 = var56.method1351(class481.field6937, (byte) -109, var11.field5217, var11.field5221, var11.field5224, ~var11.field5141 == -10, 2048, var58, var11.field5218, var57);
                                                }
                                            }
                                        } else {
                                            int var59 = var11.field5191;
                                            if (var59 >= 0 && ~var59 > -2049) {
                                                class313 var60 = class262.field3742[var59];
                                                class168 var61 = ~var11.field5212 != 0 ? class286.field4083.method2602(arg3 + -24501, var11.field5212) : null;
                                                if (var60 != null && (~class156.field2047 == ~var59 || ~class17.method123((byte) -54, var60.field4592) == ~var11.field5218)) {
                                                    var53 = var60.field4599.method1275(var11.field5217, 0, class405.field5947, var11.field5224, class481.field6937, class508.field7744, class286.field4083, -1, (class55[]) null, 0, class315.field4621, 2048, var61, (class168) null, class453.field6591, class89.field1220, -1, true, var11.field5221);
                                                }
                                            }
                                        }
                                    } else {
                                        class361 var62 = class405.field5947.method1162(var11.field5174, 0);
                                        if (var62 != null) {
                                            class361 var63 = var62.method2197(0, var11.field5222);
                                            class168 var64 = ~var11.field5212 != 0 ? class286.field4083.method2602(-24462, var11.field5212) : null;
                                            class206 var65 = var11.field5286 ? class415.field6145.field4599 : null;
                                            var53 = var63.method2204(2048, var11.field5217, var64, true, var11.field5224, 1, class481.field6937, var65, var11.field5221);
                                            if (var53 != null) {
                                                var54 = -var53.method195() >> 1;
                                            } else {
                                                class170.method1068(-100, var11);
                                            }
                                        }
                                    }
                                    if (var53 != null) {
                                        int var66;
                                        if (var11.field5211 <= 0) {
                                            var66 = 512;
                                        } else {
                                            var66 = (var11.field5168 << 9) / var11.field5211;
                                        }
                                        int var67;
                                        if (var11.field5213 <= 0) {
                                            var67 = 512;
                                        } else {
                                            var67 = (var11.field5169 << 9) / var11.field5213;
                                        }
                                        int var68 = var11.field5168 / 2 + var13 - -(var11.field5243 * var66 >> 9);
                                        int var69 = (var11.field5197 * var67 >> 9) + var11.field5169 / 2 + var14;
                                        class125.field1616.method274();
                                        class481.field6937.method837(class125.field1616);
                                        class481.field6937.method769(var68, var69, var66, var67);
                                        class481.field6937.method821((float) (var11.field5284 << 0), !var11.field5208 ? (float) (var11.field5187 << 0) * 1.5F : (float) (var11.field5187 << 0));
                                        if (arg1 == -1412584499 || class415.field6146) {
                                            class481.field6937.method836();
                                            class481.field6937.method756();
                                            class481.field6937.method810(arg6, arg9, arg2, arg0);
                                            class415.field6146 = false;
                                        }
                                        if (var11.field5262) {
                                            class481.field6937.method773(false);
                                        }
                                        int var70 = (var11.field5240 << 0) * class323.field4731[var11.field5139 << 3] >> 15;
                                        int var71 = (var11.field5240 << 0) * class323.field4733[var11.field5139 << 3] >> 15;
                                        class295.field4314.method268(-var11.field5146 << 3);
                                        class295.field4314.method279(var11.field5225 << 3);
                                        class295.field4314.method275(var11.field5285 << 0, (var11.field5273 << 0) + var70 + var54, (var11.field5273 << 0) + var71);
                                        class295.field4314.method270(var11.field5139 << 3);
                                        if (class125.field1617) {
                                            class481.field6937.method789(var13, var14, var11.field5168 + var13, var14 - -var11.field5169);
                                        }
                                        if (var11.field5208) {
                                            var53.method179(class295.field4314, (class299) null, var11.field5240 << 0, 1);
                                        } else {
                                            var53.method191(class295.field4314, (class299) null, 1);
                                        }
                                        if (class125.field1617) {
                                            class481.field6937.method810(arg6, arg9, arg2, arg0);
                                        }
                                        if (var11.field5262) {
                                            class481.field6937.method773(true);
                                        }
                                        class481.field6937.method821(0.0F, 0.0F);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
    public final void method625(boolean arg0, boolean arg1) {
        super.field7679.method2919(7681, 8448, arg0);
        ++field1609;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBLtu;)V")
    public final void method626(int arg0, byte arg1, class221 arg2) {
        if (arg1 >= -21) {
            this.field1610 = null;
        }
        super.field7679.method2883(arg2, 64);
        ++field1603;
        super.field7679.method2914(124, arg0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)V")
    public final void method627(boolean arg0, int arg1) {
        ++field1606;
        class368 var3 = super.field7679.method2885(-102);
        if (arg1 == -1805) {
            if (this.field1610 != null && var3 != null && arg0) {
                this.field1610.method523((byte) 110, '\u0000');
                super.field7679.method2849(1, (byte) -109);
                super.field7679.method2883(var3, 60);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field7679.field7452.method1576((byte) -42), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field7679.method2849(0, (byte) -109);
                this.field1600 = true;
            } else {
                super.field7679.method2876(-397556104, 0, 770, 34168);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
    public final boolean method623(byte arg0) {
        ++field1605;
        if (arg0 <= 45) {
            this.method623((byte) -121);
        }
        return true;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method700(boolean arg0) {
        field1607 = null;
        if (arg0) {
            method699(21, -104, 47, (byte) -128, (class356[]) null, 80, 20, 28, -102, -83);
        }
        field1602 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILjava/lang/Class;)Ljo;")
    public static final class210 method701(int arg0, int arg1, int arg2, Class arg3) {
        class468 var4 = class358.field5312[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class323 var5 = var4.field6769; var5 != null; var5 = var5.field4727) {
                class210 var6 = var5.field4726;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field2972 == arg1 && var6.field2975 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public final void method629(byte arg0) {
        if (this.field1600) {
            this.field1610.method523((byte) -36, '\u0001');
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2883((class221) null, 23);
            super.field7679.method2849(0, (byte) -109);
        } else {
            super.field7679.method2876(-397556104, 0, 770, 5890);
        }
        ++field1604;
        if (arg0 != -122) {
            this.method623((byte) -2);
        }
        super.field7679.method2919(8448, 8448, false);
        this.field1600 = false;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lrl;)V")
    public class124(class487 arg0) {
        super(arg0);
        if (arg0.field7453) {
            this.field1610 = new class81(arg0, 2);
            this.field1610.method520(112, 0);
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2919(7681, 34165, false);
            super.field7679.method2855(2, (byte) 50, 34168, 770);
            super.field7679.method2876(-397556104, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field7679.method2849(0, (byte) -109);
            this.field1610.method522(false);
            this.field1610.method520(111, 1);
            super.field7679.method2849(1, (byte) -109);
            super.field7679.method2919(8448, 8448, false);
            super.field7679.method2855(2, (byte) 50, 34166, 770);
            super.field7679.method2876(-397556104, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field7679.method2849(0, (byte) -109);
            this.field1610.method522(false);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
    public final void method624(int arg0, int arg1, int arg2) {
        ++field1608;
        int var4 = -79 % (arg0 / 59);
    }
}
