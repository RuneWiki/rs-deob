import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class450 extends class295 {

    @OriginalMember(owner = "client!sn", name = "N", descriptor = "[[Z")
    public static boolean[][] field6510 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public int field6498;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "Lfm;")
    public static class316 field6505;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "Ljava/lang/String;")
    public String field6504;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lqf;Ldg;)V", line = 4)
    public static final void method2797(class390 arg0, class224 arg1) {
        if (arg1.field3109) {
            short var2 = arg1.field3123;
            short var3 = arg1.field3118;
            byte var4 = arg1.field3112;
            byte var5 = arg1.field3107;
            int var6 = (var2 << 7) + 64;
            int var7 = (var3 << 7) + 64;
            class224[][] var8 = class118.field1653[var4];
            float var10;
            if (class91.field1351 == class244.field3367) {
                int var9 = class122.field1712[var2][var3];
                class91.field1347.method129(class265.field3566[0].method1515(var6, var7), var9 & 16777215, var9 >>> 21 & 2040);
                var10 = 201.5F;
            } else {
                var10 = 201.5F - (float) (var5 + 1) * 50.0F;
            }
            class91.field1347.method108(3000.0F, var10 * 1.5F);
            if (arg1.field3111) {
                if (class166.field2449) {
                    if (var4 > 0) {
                        class224 var11 = class118.field1653[var4 - 1][var2][var3];
                        if (var11 != null && var11.field3109) {
                            return;
                        }
                    }
                    if (var2 <= class134.field1914 && var2 > class283.field3780) {
                        class224 var12 = var8[var2 - 1][var3];
                        if (var12 != null && var12.field3109 && (var12.field3111 || (arg1.field3119 & 1) == 0)) {
                            return;
                        }
                    }
                    if (var2 >= class134.field1914 && var2 < class176.field2603 - 1) {
                        class224 var13 = var8[var2 + 1][var3];
                        if (var13 != null && var13.field3109 && (var13.field3111 || (arg1.field3119 & 4) == 0)) {
                            return;
                        }
                    }
                    if (var3 <= class31.field516 && var3 > class277.field3733) {
                        class224 var14 = var8[var2][var3 - 1];
                        if (var14 != null && var14.field3109 && (var14.field3111 || (arg1.field3119 & 8) == 0)) {
                            return;
                        }
                    }
                    if (var3 >= class31.field516 && var3 < class338.field4620 - 1) {
                        class224 var15 = var8[var2][var3 + 1];
                        if (var15 != null && var15.field3109 && (var15.field3111 || (arg1.field3119 & 2) == 0)) {
                            return;
                        }
                    }
                } else {
                    class166.field2449 = true;
                }
                arg1.field3111 = false;
                if (arg1.field3114 != null) {
                    class224 var16 = arg1.field3114;
                    class91.field1347.method108(3000.0F, (201.5F - (float) (var16.field3107 + 1) * 50.0F) * 1.5F);
                    if (!class176.method1318(var16.field3107, var2, var3)) {
                        class91.field1351[var16.field3107].method1503(var2, var3);
                    }
                    class339 var17 = var16.field3108;
                    if (var17 != null) {
                        if (class362.field4994) {
                            if ((var17.field4632 & arg1.field3128) != 0) {
                                class325.method2071(arg0, var17.field4632, var5, var2, var3);
                            } else {
                                class286.method1799(arg0, var4, var2, var3);
                            }
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        var17.method572(class91.field1347, (byte) -108);
                    }
                    for (class26 var18 = var16.field3129; var18 != null; var18 = var18.field463) {
                        class228 var19 = var18.field460;
                        if (var19 != null) {
                            if (class362.field4994) {
                                class286.method1799(arg0, var4, var2, var3);
                                class91.field1347.method141(arg0.field5473, arg0.field5477);
                            }
                            var19.method572(class91.field1347, (byte) -58);
                        }
                    }
                    class91.field1347.method108(3000.0F, var10 * 1.5F);
                }
                boolean var20 = !class176.method1318(var5, var2, var3);
                if (var20) {
                    class91.field1351[var5].method1503(var2, var3);
                    class44 var21 = arg1.field3124;
                    if (var21 != null && var21.field708) {
                        if (var21.field701) {
                            class91.field1347.method108(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var22 = var21.method572(class91.field1347, (byte) -80);
                        if (var22 != null) {
                            var22.field5807 = var21;
                            var22.field5804 = var4;
                            var22.field5800 = var2;
                            var22.field5805 = var3;
                            class440.field6321.method901(false, var22);
                        }
                        if (var21.field701) {
                            class91.field1347.method108(3000.0F, var10 * 1.5F);
                        }
                    }
                }
                int var23 = 0;
                int var24 = 0;
                class339 var25 = arg1.field3108;
                class57 var26 = arg1.field3121;
                if (var25 != null || var26 != null) {
                    if (class134.field1914 == var2) {
                        ++var23;
                    } else if (class134.field1914 < var2) {
                        var23 += 2;
                    }
                    if (class31.field516 == var3) {
                        var23 += 3;
                    } else if (class31.field516 > var3) {
                        var23 += 6;
                    }
                    var24 = class398.field5565[var23];
                    arg1.field3128 = class88.field1304[var23];
                }
                if (var25 != null) {
                    if ((var25.field4632 & class114.field1611[var23]) != 0) {
                        if (var25.field4632 == 16) {
                            arg1.field3127 = 3;
                            arg1.field3122 = class191.field2750[var23];
                            arg1.field3115 = (byte) (3 - arg1.field3122);
                        } else if (var25.field4632 == 32) {
                            arg1.field3127 = 6;
                            arg1.field3122 = class5.field32[var23];
                            arg1.field3115 = (byte) (6 - arg1.field3122);
                        } else if (var25.field4632 == 64) {
                            arg1.field3127 = 12;
                            arg1.field3122 = class8.field71[var23];
                            arg1.field3115 = (byte) (12 - arg1.field3122);
                        } else {
                            arg1.field3127 = 9;
                            arg1.field3122 = class301.field4044[var23];
                            arg1.field3115 = (byte) (9 - arg1.field3122);
                        }
                    } else {
                        arg1.field3127 = 0;
                    }
                    if ((var25.field4632 & var24) != 0 && !class175.method1303(var5, var2, var3, var25.field4632)) {
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var27 = var25.method572(class91.field1347, (byte) -103);
                        if (var27 != null) {
                            var27.field5807 = var25;
                            var27.field5804 = var4;
                            var27.field5800 = var2;
                            var27.field5805 = var3;
                            class440.field6321.method901(false, var27);
                        }
                    }
                    class339 var28 = arg1.field3125;
                    if (var28 != null && (var28.field4632 & var24) != 0 && !class175.method1303(var5, var2, var3, var28.field4632)) {
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var29 = var28.method572(class91.field1347, (byte) -122);
                        if (var29 != null) {
                            var29.field5807 = var28;
                            var29.field5804 = var4;
                            var29.field5800 = var2;
                            var29.field5805 = var3;
                            class440.field6321.method901(false, var29);
                        }
                    }
                }
                if (var26 != null && !class127.method994(var5, var2, var3, var26.method530(-127))) {
                    class57 var30 = arg1.field3116;
                    class91.field1347.method108(3000.0F, (var10 - 0.5F) * 1.5F);
                    if ((var26.field921 & var24) != 0) {
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var31 = var26.method572(class91.field1347, (byte) -103);
                        if (var31 != null) {
                            var31.field5807 = var26;
                            var31.field5804 = var4;
                            var31.field5800 = var2;
                            var31.field5805 = var3;
                            class440.field6321.method901(false, var31);
                        }
                    } else if (var26.field921 == 256) {
                        int var32 = var26.field919 - class128.field1814;
                        int var33 = var26.field910 - class81.field1200;
                        int var34 = var26.field917;
                        int var35;
                        if (var34 != 1 && var34 != 2) {
                            var35 = var32;
                        } else {
                            var35 = -var32;
                        }
                        int var36;
                        if (var34 != 2 && var34 != 3) {
                            var36 = var33;
                        } else {
                            var36 = -var33;
                        }
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        if (var36 < var35) {
                            class415 var37 = var26.method572(class91.field1347, (byte) -107);
                            if (var37 != null) {
                                var37.field5807 = var26;
                                var37.field5804 = var4;
                                var37.field5800 = var2;
                                var37.field5805 = var3;
                                class440.field6321.method901(false, var37);
                            }
                        } else if (var30 != null) {
                            class415 var38 = var30.method572(class91.field1347, (byte) -70);
                            if (var38 != null) {
                                var38.field5807 = var30;
                                var38.field5804 = var4;
                                var38.field5800 = var2;
                                var38.field5805 = var3;
                                class440.field6321.method901(false, var38);
                            }
                        }
                    }
                    class91.field1347.method108(3000.0F, var10 * 1.5F);
                }
                if (var20) {
                    class44 var39 = arg1.field3124;
                    if (var39 != null && !var39.field708) {
                        if (var39.field701) {
                            class91.field1347.method108(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                        }
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var40 = var39.method572(class91.field1347, (byte) -54);
                        if (var40 != null) {
                            var40.field5807 = var39;
                            var40.field5804 = var4;
                            var40.field5800 = var2;
                            var40.field5805 = var3;
                            class440.field6321.method901(false, var40);
                        }
                        if (var39.field701) {
                            class91.field1347.method108(3000.0F, var10 * 1.5F);
                        }
                    }
                    class241 var41 = arg1.field3110;
                    if (var41 != null && !var41.field3330) {
                        if (class362.field4994) {
                            class286.method1799(arg0, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var42 = var41.method572(class91.field1347, (byte) -102);
                        if (var42 != null) {
                            var42.field5807 = var41;
                            var42.field5804 = var4;
                            var42.field5800 = var2;
                            var42.field5805 = var3;
                            class440.field6321.method901(false, var42);
                        }
                    }
                }
                byte var43 = arg1.field3119;
                if (var43 != 0) {
                    if (var2 < class134.field1914 && (var43 & 4) != 0) {
                        class224 var44 = var8[var2 + 1][var3];
                        if (var44 != null && var44.field3109) {
                            class277.field3731.method1019(0, var44);
                        }
                    }
                    if (var3 < class31.field516 && (var43 & 2) != 0) {
                        class224 var45 = var8[var2][var3 + 1];
                        if (var45 != null && var45.field3109) {
                            class277.field3731.method1019(0, var45);
                        }
                    }
                    if (var2 > class134.field1914 && (var43 & 1) != 0) {
                        class224 var46 = var8[var2 - 1][var3];
                        if (var46 != null && var46.field3109) {
                            class277.field3731.method1019(0, var46);
                        }
                    }
                    if (var3 > class31.field516 && (var43 & 8) != 0) {
                        class224 var47 = var8[var2][var3 - 1];
                        if (var47 != null && var47.field3109) {
                            class277.field3731.method1019(0, var47);
                        }
                    }
                }
            }
            if (arg1.field3127 != 0) {
                boolean var48 = true;
                for (class26 var49 = arg1.field3129; var49 != null; var49 = var49.field463) {
                    if (class19.field378 != var49.field460.field3166 && (var49.field464 & arg1.field3127) == arg1.field3122) {
                        var48 = false;
                        break;
                    }
                }
                if (var48) {
                    class339 var50 = arg1.field3108;
                    if (!class175.method1303(var5, var2, var3, var50.field4632)) {
                        if (class362.field4994) {
                            label687: {
                                if (var50.field4632 >= 16) {
                                    int var51 = var2 - class134.field1914;
                                    int var52 = var3 - class31.field516;
                                    if (var50.field4632 == 16) {
                                        var51 -= 64;
                                        var52 += 64;
                                        if (var52 < var51 && var2 > 0 && var3 <= class16.field190) {
                                            class286.method1799(arg0, var4, var2 - 1, var3 + 1);
                                            break label687;
                                        }
                                    } else if (var50.field4632 == 32) {
                                        var51 += 64;
                                        var52 += 64;
                                        if (var52 < -var51 && var2 < class368.field5054 && var3 < class16.field190) {
                                            class286.method1799(arg0, var4, var2 + 1, var3 + 1);
                                            break label687;
                                        }
                                    } else if (var50.field4632 == 64) {
                                        var51 += 64;
                                        var52 -= 64;
                                        if (var52 > var51 && var2 < class368.field5054 && var3 > 0) {
                                            class286.method1799(arg0, var4, var2 + 1, var3 - 1);
                                            break label687;
                                        }
                                    } else if (var50.field4632 == 128) {
                                        var51 -= 64;
                                        var52 -= 64;
                                        if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                            class286.method1799(arg0, var4, var2 - 1, var3 - 1);
                                            break label687;
                                        }
                                    }
                                }
                                class286.method1799(arg0, var4, var2, var3);
                            }
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var53 = var50.method572(class91.field1347, (byte) -114);
                        if (var53 != null) {
                            var53.field5807 = var50;
                            var53.field5804 = var4;
                            var53.field5800 = var2;
                            var53.field5805 = var3;
                            class440.field6321.method901(false, var53);
                        }
                    }
                    arg1.field3127 = 0;
                }
            }
            if (arg1.field3120) {
                try {
                    arg1.field3120 = false;
                    int var54 = 0;
                    label630: for (class26 var55 = arg1.field3129; var55 != null; var55 = var55.field463) {
                        class228 var56 = var55.field460;
                        if (class19.field378 != var56.field3166) {
                            for (int var57 = var56.field3172; var57 <= var56.field3162; ++var57) {
                                for (int var58 = var56.field3161; var58 <= var56.field3178; ++var58) {
                                    class224 var59 = var8[var57][var58];
                                    if (var59.field3111) {
                                        arg1.field3120 = true;
                                        continue label630;
                                    }
                                    if (var59.field3127 != 0) {
                                        int var60 = 0;
                                        if (var57 > var56.field3172) {
                                            ++var60;
                                        }
                                        if (var57 < var56.field3162) {
                                            var60 += 4;
                                        }
                                        if (var58 > var56.field3161) {
                                            var60 += 8;
                                        }
                                        if (var58 < var56.field3178) {
                                            var60 += 2;
                                        }
                                        if ((var60 & var59.field3127) == arg1.field3115) {
                                            arg1.field3120 = true;
                                            continue label630;
                                        }
                                    }
                                }
                            }
                            int var61 = class134.field1914 - var56.field3172;
                            int var62 = var56.field3162 - class134.field1914;
                            if (var62 > var61) {
                                var61 = var62;
                            }
                            int var63 = class31.field516 - var56.field3161;
                            int var64 = var56.field3178 - class31.field516;
                            if (var64 > var63) {
                                var63 = var64;
                            }
                            arg0.field5474[var54] = var56;
                            arg0.field5471[var54++] = var61 + var63;
                        }
                    }
                    while (var54 > 0) {
                        int var65 = -50;
                        int var66 = -1;
                        for (int var67 = 0; var67 < var54; ++var67) {
                            class228 var68 = arg0.field5474[var67];
                            if (class19.field378 != var68.field3166) {
                                int var69 = arg0.field5471[var67];
                                if (var69 > var65) {
                                    var65 = var69;
                                    var66 = var67;
                                } else if (var65 == var69) {
                                    int var70 = var68.field3176 - class128.field1814;
                                    int var71 = var68.field3167 - class81.field1200;
                                    int var72 = arg0.field5474[var66].field3176 - class128.field1814;
                                    int var73 = arg0.field5474[var66].field3167 - class81.field1200;
                                    if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                        var66 = var67;
                                    }
                                }
                            }
                        }
                        if (var66 == -1) {
                            break;
                        }
                        class228 var74 = arg0.field5474[var66];
                        var74.field3166 = class19.field378;
                        if (!class37.method372(var5, var74.field3172, var74.field3162, var74.field3161, var74.field3178, var74.method579(0))) {
                            if (class362.field4994) {
                                if (var74.field3165 != 0) {
                                    class286.method1799(arg0, var4, var2, var3);
                                    int var75 = var2 - class134.field1914;
                                    int var76 = var3 - class31.field516;
                                    if (var74.field3165 == 2) {
                                        if (var76 > -var75) {
                                            class228.method1533(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                        } else {
                                            class228.method1533(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                        }
                                    } else if (var76 > var75) {
                                        class228.method1533(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                    } else {
                                        class228.method1533(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                    }
                                } else {
                                    class355.method2239(arg0, var4, var74.field3172, var74.field3161, var74.field3162, var74.field3178);
                                }
                                class91.field1347.method141(arg0.field5473, arg0.field5477);
                            }
                            class415 var77 = var74.method572(class91.field1347, (byte) -56);
                            if (var77 != null) {
                                var77.field5807 = var74;
                                var77.field5804 = var4;
                                var77.field5800 = var74.field3172;
                                var77.field5805 = var74.field3161;
                                class440.field6321.method901(false, var77);
                            }
                        }
                        for (int var78 = var74.field3172; var78 <= var74.field3162; ++var78) {
                            for (int var79 = var74.field3161; var79 <= var74.field3178; ++var79) {
                                class224 var80 = var8[var78][var79];
                                if (var80.field3127 != 0) {
                                    class277.field3731.method1019(0, var80);
                                } else if ((var2 != var78 || var3 != var79) && var80.field3109) {
                                    class277.field3731.method1019(0, var80);
                                }
                            }
                        }
                    }
                    if (arg1.field3120) {
                        return;
                    }
                } catch (Exception var113) {
                    arg1.field3120 = false;
                }
            }
            if (arg1.field3113 != null) {
                if ((byte) (class59.field936 & 255) == arg1.field3126) {
                    class374 var81 = arg1.field3113;
                    int var82 = class91.field1351[var4].method1509(var2, var3);
                    int var83;
                    if (var4 < 3) {
                        var83 = class91.field1351[var4].method1509(var2, var3) - class91.field1351[var4 + 1].method1509(var2, var3);
                    } else {
                        var83 = 1024;
                    }
                    class373.field5230.method315(var6, var82, var7, arg0.field5475);
                    int var84 = arg0.field5475[2];
                    class373.field5230.method315(var6, var82 - var83, var7, arg0.field5475);
                    int var85 = arg0.field5475[2];
                    int var86 = var84;
                    int var87 = var85;
                    if (var84 > var85) {
                        var86 = var85;
                        var87 = var84;
                    }
                    var86 -= 91;
                    var87 += 91;
                    if (var86 < var87 - 1597) {
                        var86 = var87 - 1597;
                    }
                    var81.field5263 = var86;
                    var81.field5259 = var87;
                    var81.field5265 = true;
                    class91.field1347.method182(var81);
                } else {
                    arg1.field3113 = null;
                }
            }
            if (arg1.field3109) {
                if (arg1.field3127 != 0) {
                    return;
                }
                if (var2 <= class134.field1914 && var2 > class283.field3780) {
                    class224 var88 = var8[var2 - 1][var3];
                    if (var88 != null && var88.field3109) {
                        return;
                    }
                }
                if (var2 >= class134.field1914 && var2 < class176.field2603 - 1) {
                    class224 var89 = var8[var2 + 1][var3];
                    if (var89 != null && var89.field3109) {
                        return;
                    }
                }
                if (var3 <= class31.field516 && var3 > class277.field3733) {
                    class224 var90 = var8[var2][var3 - 1];
                    if (var90 != null && var90.field3109) {
                        return;
                    }
                }
                if (var3 >= class31.field516 && var3 < class338.field4620 - 1) {
                    class224 var91 = var8[var2][var3 + 1];
                    if (var91 != null && var91.field3109) {
                        return;
                    }
                }
                arg1.field3109 = false;
                --class419.field5873;
                class241 var92 = arg1.field3110;
                if (var92 != null && var92.field3330) {
                    if (class362.field4994) {
                        class286.method1799(arg0, var4, var2, var3);
                        class91.field1347.method141(arg0.field5473, arg0.field5477);
                    }
                    class415 var93 = var92.method572(class91.field1347, (byte) -78);
                    if (var93 != null) {
                        var93.field5807 = var92;
                        var93.field5804 = var4;
                        var93.field5800 = var2;
                        var93.field5805 = var3;
                        class440.field6321.method901(false, var93);
                    }
                }
                if (arg1.field3128 != 0) {
                    class57 var94 = arg1.field3121;
                    if (var94 != null && !class127.method994(var5, var2, var3, var94.method530(-103))) {
                        if ((var94.field921 & arg1.field3128) != 0) {
                            if (class362.field4994) {
                                class286.method1799(arg0, var4, var2, var3);
                                class91.field1347.method141(arg0.field5473, arg0.field5477);
                            }
                            class415 var95 = var94.method572(class91.field1347, (byte) -77);
                            if (var95 != null) {
                                var95.field5807 = var94;
                                var95.field5804 = var4;
                                var95.field5800 = var2;
                                var95.field5805 = var3;
                                class440.field6321.method901(false, var95);
                            }
                        } else if (var94.field921 == 256) {
                            int var96 = var94.field919 - class128.field1814;
                            int var97 = var94.field910 - class81.field1200;
                            int var98 = var94.field917;
                            int var99;
                            if (var98 != 1 && var98 != 2) {
                                var99 = var96;
                            } else {
                                var99 = -var96;
                            }
                            int var100;
                            if (var98 != 2 && var98 != 3) {
                                var100 = var97;
                            } else {
                                var100 = -var97;
                            }
                            if (class362.field4994) {
                                class286.method1799(arg0, var4, var2, var3);
                                class91.field1347.method141(arg0.field5473, arg0.field5477);
                            }
                            class57 var101 = arg1.field3116;
                            if (var100 > var99) {
                                class415 var102 = var94.method572(class91.field1347, (byte) -119);
                                if (var102 != null) {
                                    var102.field5807 = var94;
                                    var102.field5804 = var4;
                                    var102.field5800 = var2;
                                    var102.field5805 = var3;
                                    class440.field6321.method901(false, var102);
                                }
                            } else if (var101 != null) {
                                class415 var103 = var101.method572(class91.field1347, (byte) -69);
                                if (var103 != null) {
                                    var103.field5807 = var101;
                                    var103.field5804 = var4;
                                    var103.field5800 = var2;
                                    var103.field5805 = var3;
                                    class440.field6321.method901(false, var103);
                                }
                            }
                        }
                    }
                    class339 var104 = arg1.field3108;
                    class339 var105 = arg1.field3125;
                    if (var105 != null && (var105.field4632 & arg1.field3128) != 0 && !class175.method1303(var5, var2, var3, var105.field4632)) {
                        if (class362.field4994) {
                            class325.method2071(arg0, var105.field4632, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var106 = var105.method572(class91.field1347, (byte) -58);
                        if (var106 != null) {
                            var106.field5807 = var105;
                            var106.field5804 = var4;
                            var106.field5800 = var2;
                            var106.field5805 = var3;
                            class440.field6321.method901(false, var106);
                        }
                    }
                    if (var104 != null && (var104.field4632 & arg1.field3128) != 0 && !class175.method1303(var5, var2, var3, var104.field4632)) {
                        if (class362.field4994) {
                            class325.method2071(arg0, var104.field4632, var4, var2, var3);
                            class91.field1347.method141(arg0.field5473, arg0.field5477);
                        }
                        class415 var107 = var104.method572(class91.field1347, (byte) -91);
                        if (var107 != null) {
                            var107.field5807 = var104;
                            var107.field5804 = var4;
                            var107.field5800 = var2;
                            var107.field5805 = var3;
                            class440.field6321.method901(false, var107);
                        }
                    }
                }
                if (var4 < class388.field5464 - 1) {
                    class224 var108 = class118.field1653[var4 + 1][var2][var3];
                    if (var108 != null && var108.field3109) {
                        class277.field3731.method1025(var108, -1);
                    }
                }
                if (var2 < class134.field1914) {
                    class224 var109 = var8[var2 + 1][var3];
                    if (var109 != null && var109.field3109) {
                        class277.field3731.method1019(0, var109);
                    }
                }
                if (var3 < class31.field516) {
                    class224 var110 = var8[var2][var3 + 1];
                    if (var110 != null && var110.field3109) {
                        class277.field3731.method1019(0, var110);
                    }
                }
                if (var2 > class134.field1914) {
                    class224 var111 = var8[var2 - 1][var3];
                    if (var111 != null && var111.field3109) {
                        class277.field3731.method1019(0, var111);
                    }
                }
                if (var3 > class31.field516) {
                    class224 var112 = var8[var2][var3 - 1];
                    if (var112 != null && var112.field3109) {
                        class277.field3731.method1019(0, var112);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V", line = 1134)
    public final void method2798(int arg0) {
        ++field6499;
        if (arg0 != -664528978) {
            method2804(-61);
        }
        super.field3984 = 500L + class108.method902((byte) -93) | super.field3984 & Long.MIN_VALUE;
        class5.field34.method2244(11310, this);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILbi;I)V", line = 1148)
    public static final void method2799(int arg0, int arg1, class139 arg2, int arg3) {
        if (~arg2.field2014 == -1) {
            arg2.field2065 = arg2.field2114;
        } else if (~arg2.field2014 == -2) {
            arg2.field2065 = (-arg2.field2027 + arg3) / 2 - -arg2.field2114;
        } else if (arg2.field2014 != 2) {
            if (arg2.field2014 != 3) {
                if (~arg2.field2014 == -5) {
                    arg2.field2065 = (arg2.field2114 * arg3 >> 14) + (arg3 - arg2.field2027) / 2;
                } else {
                    arg2.field2065 = -arg2.field2027 + arg3 + -(arg2.field2114 * arg3 >> 14);
                }
            } else {
                arg2.field2065 = arg2.field2114 * arg3 >> 14;
            }
        } else {
            arg2.field2065 = -arg2.field2114 + -arg2.field2027 + arg3;
        }
        if (~arg2.field2091 == -1) {
            arg2.field2022 = arg2.field2008;
        } else if (arg2.field2091 != 1) {
            if (arg2.field2091 == 2) {
                arg2.field2022 = -arg2.field2011 + arg1 + -arg2.field2008;
            } else if (~arg2.field2091 == -4) {
                arg2.field2022 = arg2.field2008 * arg1 >> 14;
            } else if (~arg2.field2091 == -5) {
                arg2.field2022 = (-arg2.field2011 + arg1) / 2 - -(arg2.field2008 * arg1 >> 14);
            } else {
                arg2.field2022 = -arg2.field2011 + arg1 + -(arg2.field2008 * arg1 >> 14);
            }
        } else {
            arg2.field2022 = (arg1 - arg2.field2011) / 2 + arg2.field2008;
        }
        ++field6506;
        if (class339.field4624 && (client.method1648(arg2).field1767 != 0 || arg2.field2023 == 0)) {
            if (arg2.field2022 < 0) {
                arg2.field2022 = 0;
            } else if (arg1 < arg2.field2022 + arg2.field2011) {
                arg2.field2022 = -arg2.field2011 + arg1;
            }
            if (~arg2.field2065 > -1) {
                arg2.field2065 = 0;
            } else if (~(arg2.field2065 + arg2.field2027) < ~arg3) {
                arg2.field2065 = arg3 - arg2.field2027;
            }
        }
        if (arg0 != -5) {
            field6505 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V", line = 1221)
    public final void method2800(int arg0) {
        ++field6507;
        super.field3984 |= Long.MIN_VALUE;
        if (arg0 != 256) {
            this.field6503 = 88;
        }
        if (~this.method2801(28057) == -1L) {
            class180.field2637.method2244(11310, this);
        }
    }

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)J", line = 1235)
    public final long method2801(int arg0) {
        if (arg0 != 28057) {
            return 69L;
        } else {
            ++field6501;
            return super.field3984 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)I", line = 1246)
    public final int method2802(byte arg0) {
        if (arg0 != 2) {
            return 113;
        } else {
            ++field6508;
            return (int) (super.field5349 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)I", line = 1261)
    public final int method2803(byte arg0) {
        if (arg0 != -22) {
            this.field6504 = null;
        }
        ++field6500;
        return (int) super.field5349;
    }

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "(I)V", line = 1273)
    public static void method2804(int arg0) {
        if (arg0 <= 20) {
            method2804(-59);
        }
        field6510 = null;
        field6505 = null;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V", line = 1283)
    public class450(int arg0, int arg1) {
        super.field5349 = (long) arg0 << 32 | (long) arg1;
    }
}
