import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class68 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lam;")
    public static class277 field1055 = new class277();

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lhn;")
    public static class317 field1056 = new class317(64);

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lhi;")
    private static class82 field1059 = class95.method664((byte) -82, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lhi;")
    public static class82 field1058 = field1059;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Loe;")
    public static class79 field1057 = new class79(512);

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lhi;")
    public static class82 field1063 = class95.method664((byte) -118, "(U1");

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "[Ljf;")
    public static class86[] field1061;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 4)
    public static final void method426(int arg0) {
        field1054++;
        if (arg0 >= -66) {
            method430(-98, 39, (byte) -125, -120, -33);
        }
        if ((class69.field1065 < class119.field2106)) {
            class69.field1065 = (float) ((double) class69.field1065 / 30.0D + (double) class69.field1065);
            if (class69.field1065 > class119.field2106) {
                class69.field1065 = class119.field2106;
            }
            class141.method963(0);
        } else if (class69.field1065 > class119.field2106) {
            class69.field1065 = (float) ((double) class69.field1065 - (double) class69.field1065 / 30.0D);
            if (class69.field1065 < class119.field2106) {
                class69.field1065 = class119.field2106;
            }
            class141.method963(0);
        }
        if (class130.field2268 == -1 || class78.field1330 == -1) {
            return;
        }
        int var1 = class130.field2268 - class82.field1445;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        int var2 = class78.field1330 - class315.field5426;
        class82.field1445 += var1;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class315.field5426 += var2;
        if (var1 == 0 && var2 == 0) {
            class78.field1330 = -1;
            class130.field2268 = -1;
        }
        class141.method963(0);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 61)
    public static final void method427(int arg0) {
        field1052++;
        class61.field957.method1504(103, -1);
        class177.field3044++;
        class61.field957.method1057((byte) 43, 0L);
        if (arg0 >= -115) {
            field1059 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 88)
    public static void method428(int arg0) {
        field1056 = null;
        field1055 = null;
        field1057 = null;
        field1063 = null;
        if (arg0 == -14986) {
            field1061 = null;
            field1059 = null;
            field1058 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIBIIII[Lme;)V", line = 116)
    public static final void method429(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class75[] arg9) {
        if (class147.field2485) {
            class116.method789(arg8, arg2, arg7, arg6);
        } else {
            class320.method2220(arg8, arg2, arg7, arg6);
            class102.method696();
        }
        if (arg4 != -106) {
            method428(74);
        }
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class75 var11 = arg9[var10];
            if (var11 != null && (var11.field1280 == arg3 || arg3 == -1412584499 && class194.field3290 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class290.field4880[class254.field4381] = var11.field1151 + arg1;
                    class25.field339[class254.field4381] = var11.field1294 + arg0;
                    class191.field3214[class254.field4381] = var11.field1216;
                    class117.field2058[class254.field4381] = var11.field1205;
                    var12 = class254.field4381++;
                } else {
                    var12 = arg5;
                }
                var11.field1212 = var12;
                var11.field1154 = class212.field3708;
                if (!var11.field1136 || !client.method874(var11)) {
                    if (var11.field1210 > 0) {
                        class69.method436(arg4 + 256, var11);
                    }
                    int var13 = var11.field1151 + arg1;
                    int var14 = var11.field1294 + arg0;
                    int var15 = var11.field1269;
                    if (class182.field3114 && (client.method871(var11) != 0 || var11.field1184 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class194.field3290 == var11) {
                        if (arg3 != -1412584499 && !var11.field1284) {
                            class215.field3752 = arg0;
                            class193.field3267 = arg1;
                            class198.field3385 = arg9;
                            continue;
                        }
                        if (class52.field845 && class325.field5575) {
                            int var16 = class202.field3471;
                            int var17 = var16 - class4.field35;
                            if (var17 < class164.field2877) {
                                var17 = class164.field2877;
                            }
                            if ((class164.field2877 + class237.field4109.field1205) < (var11.field1205 + var17)) {
                                var17 = class164.field2877 + class237.field4109.field1205 - var11.field1205;
                            }
                            int var18 = class211.field3702;
                            int var19 = var18 - class21.field289;
                            var14 = var17;
                            if (class316.field5433 > var19) {
                                var19 = class316.field5433;
                            }
                            if (var11.field1216 + var19 > class316.field5433 - -class237.field4109.field1216) {
                                var19 = class237.field4109.field1216 + class316.field5433 - var11.field1216;
                            }
                            var13 = var19;
                        }
                        if (!var11.field1284) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1184 == 2) {
                        var20 = arg7;
                        var21 = arg8;
                        var22 = arg6;
                        var23 = arg2;
                    } else {
                        var23 = arg2 < var14 ? var14 : arg2;
                        int var24 = var11.field1216 + var13;
                        int var25 = var11.field1205 + var14;
                        var21 = var13 > arg8 ? var13 : arg8;
                        if (var11.field1184 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = var24 < arg7 ? var24 : arg7;
                        var22 = var25 >= arg6 ? arg6 : var25;
                    }
                    if (!var11.field1136 || var21 < var20 && var23 < var22) {
                        if (var11.field1210 != 0) {
                            if (var11.field1210 == 1337 || var11.field1210 == 1403 && class147.field2485) {
                                class281.field4729 = var14;
                                class81.field1382 = var11;
                                class5.field45 = var13;
                                class141.method959(var13, var11.field1216, false, var14, var11.field1210 == 1403, var11.field1205);
                                if (class147.field2485) {
                                    class116.method789(arg8, arg2, arg7, arg6);
                                } else {
                                    class320.method2220(arg8, arg2, arg7, arg6);
                                }
                                continue;
                            }
                            if (var11.field1210 == 1338) {
                                if (!var11.method478(-102)) {
                                    continue;
                                }
                                class143.method973(var13, -1205, var12, var14, var11);
                                if (class147.field2485) {
                                    class116.method789(arg8, arg2, arg7, arg6);
                                } else {
                                    class320.method2220(arg8, arg2, arg7, arg6);
                                }
                                if (class92.field1647 != 0 && class92.field1647 != 3 || class187.field3153 || var21 > class45.field775 || class27.field360 < var23 || class45.field775 >= var20 || class27.field360 >= var22) {
                                    continue;
                                }
                                int var26 = class45.field775 - var13;
                                int var27 = class27.field360 - var14;
                                int var28 = var11.field1223[var27];
                                if (var26 < var28 || var26 > var11.field1292[var27] + var28) {
                                    continue;
                                }
                                int var29 = var26 - var11.field1216 / 2;
                                int var30 = var27 - var11.field1205 / 2;
                                int var31 = class62.field970 + class219.field3804 & 0x7FF;
                                int var32 = class102.field1813[var31];
                                int var33 = class102.field1819[var31];
                                int var34 = (class5.field41 + 256) * var32 >> 8;
                                int var35 = (class5.field41 + 256) * var33 >> 8;
                                int var36 = var30 * var35 - (var29 * var34) >> 11;
                                int var37 = var30 * var34 + (var29 * var35) >> 11;
                                int var38 = class168.field2932.field1685 + var37 >> 7;
                                int var39 = class168.field2932.field1689 - var36 >> 7;
                                if (class256.field4406 && (class193.field3272 & 0x40) != 0) {
                                    class75 var40 = class257.method1840(false, class65.field1016, class15.field133);
                                    if (var40 == null) {
                                        class293.method2019(98);
                                    } else {
                                        class47.method341(2300, 1L, (short) 47, var39, class192.field3218, var38, class119.field2105);
                                    }
                                    continue;
                                }
                                if (class22.field307 == 1) {
                                    class47.method341(2300, 1L, (short) 14, var39, class129.field2247, var38, class193.field3275);
                                }
                                class47.method341(2300, 1L, (short) 3, var39, class129.field2247, var38, class143.field2442);
                                continue;
                            }
                            if (var11.field1210 == 1339) {
                                if (var11.method478(-114)) {
                                    class126.method890(var12, var13, var14, (byte) 64, var11);
                                    if (class147.field2485) {
                                        class116.method789(arg8, arg2, arg7, arg6);
                                    } else {
                                        class320.method2220(arg8, arg2, arg7, arg6);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1210 == 1400) {
                                class316.method2165(var14, var11.field1205, var13, arg4 - 20130, var11.field1216);
                                class276.field4639[var12] = true;
                                class302.field5151[var12] = true;
                                if (class147.field2485) {
                                    class116.method789(arg8, arg2, arg7, arg6);
                                } else {
                                    class320.method2220(arg8, arg2, arg7, arg6);
                                }
                                continue;
                            }
                            if (var11.field1210 == 1401) {
                                class28.method174(var11.field1216, false, var13, var11.field1205, var14);
                                class276.field4639[var12] = true;
                                class302.field5151[var12] = true;
                                if (class147.field2485) {
                                    class116.method789(arg8, arg2, arg7, arg6);
                                } else {
                                    class320.method2220(arg8, arg2, arg7, arg6);
                                }
                                continue;
                            }
                            if (var11.field1210 == 1402) {
                                if (!class147.field2485) {
                                    class40.method314(var14, var13, -16428);
                                    class276.field4639[var12] = true;
                                    class302.field5151[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1210 == 1405) {
                                if (!class52.field841) {
                                    continue;
                                }
                                int var41 = var11.field1216 + var13;
                                int var42 = var14 + 15;
                                class138.field2364.method105(class29.method182(-6039, new class82[] { class198.field3386, class327.method2240((byte) -74, class219.field3796) }), var41, var42, 16776960, -1);
                                int var141 = var42 + 15;
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var45 = 16776960;
                                if (var44 > 65536) {
                                    var45 = 16711680;
                                }
                                class138.field2364.method105(class29.method182(-6039, new class82[] { class193.field3266, class327.method2240((byte) -74, var44), class300.field5119 }), var41, var141, var45, -1);
                                var42 = var141 + 15;
                                if (class147.field2485) {
                                    int var46 = (class6.field48 + class6.field46 + class6.field50) / 1024;
                                    int var47 = 16776960;
                                    if (var46 > 65536) {
                                        var47 = 16711680;
                                    }
                                    class138.field2364.method105(class29.method182(-6039, new class82[] { class149.field2531, class327.method2240((byte) -74, var46), class300.field5119 }), var41, var42, var47, -1);
                                    var42 += 15;
                                }
                                int var48 = 0;
                                int var49 = 0;
                                int var50 = 0;
                                int var51 = 16776960;
                                for (int var52 = 0; var52 < 28; var52++) {
                                    var48 += class98.field1764[var52].method1490(125);
                                    var49 += class98.field1764[var52].method1489(96);
                                    var50 += class98.field1764[var52].method1488(0);
                                }
                                int var53 = var50 * 100 / var48;
                                int var54 = var49 * 10000 / var48;
                                class82 var55 = class29.method182(arg4 - 5933, new class82[] { class157.field2667, class242.method1740(true, 104, 2, 0, (long) var54), class184.field3132, class327.method2240((byte) -74, var53), class13.field104 });
                                class21.field283.method105(var55, var41, var42, var51, -1);
                                var42 += 12;
                                if (class295.field4942 > 0) {
                                    class21.field283.method105(class29.method182(-6039, new class82[] { class244.field4243, class327.method2240((byte) -74, class295.field4947), class65.field1023, class327.method2240((byte) -74, class295.field4942) }), var41, var42, var51, -1);
                                }
                                var42 += 12;
                                class276.field4639[var12] = true;
                                class302.field5151[var12] = true;
                                continue;
                            }
                            if (var11.field1210 == 1406) {
                                class193.field3261 = var13;
                                class113.field2038 = var14;
                                class133.field2311 = var11;
                                continue;
                            }
                        }
                        if (!class187.field3153) {
                            if (var11.field1184 == 0 && var11.field1183 && var21 <= class45.field775 && var23 <= class27.field360 && class45.field775 < var20 && var22 > class27.field360 && !class182.field3114) {
                                class327.field5589[0] = class93.field1682;
                                class157.field2727[0] = class129.field2247;
                                class135.field2333[0] = 1007;
                                class309.field5262 = 1;
                            }
                            if (var21 <= class45.field775 && var23 <= class27.field360 && class45.field775 < var20 && var22 > class27.field360) {
                                class306.method2114(var11, class27.field360 - var14, -var13 + class45.field775, -32);
                            }
                        }
                        if (var11.field1184 == 0) {
                            if (!var11.field1136 && client.method874(var11) && class302.field5154 != var11) {
                                continue;
                            }
                            if (!var11.field1136) {
                                if (var11.field1188 > var11.field1224 - var11.field1205) {
                                    var11.field1188 = var11.field1224 - var11.field1205;
                                }
                                if (var11.field1188 < 0) {
                                    var11.field1188 = 0;
                                }
                            }
                            method429(var14 - var11.field1188, var13 - var11.field1146, var23, var11.field1172, (byte) -106, var12, var22, var20, var21, arg9);
                            if (var11.field1274 != null) {
                                method429(var14 - var11.field1188, -var11.field1146 + var13, var23, var11.field1172, (byte) -106, var12, var22, var20, var21, var11.field1274);
                            }
                            class146 var56 = (class146) class191.field3195.method507((long) var11.field1172, 602425312);
                            if (var56 != null) {
                                if (var56.field2469 == 0 && !class187.field3153 && var21 <= class45.field775 && class27.field360 >= var23 && var20 > class45.field775 && class27.field360 < var22 && !class182.field3114) {
                                    class135.field2333[0] = 1007;
                                    class309.field5262 = 1;
                                    class327.field5589[0] = class93.field1682;
                                    class157.field2727[0] = class129.field2247;
                                }
                                class163.method1172(var23, var56.field2474, var13, var12, var22, var20, var21, var14, (byte) -126);
                            }
                            if (class147.field2485) {
                                class116.method789(arg8, arg2, arg7, arg6);
                            } else {
                                class320.method2220(arg8, arg2, arg7, arg6);
                                class102.method696();
                            }
                        }
                        if (class198.field3389[var12] || class207.field3620 > 1) {
                            if (var11.field1184 == 0 && !var11.field1136 && var11.field1205 < var11.field1224) {
                                class314.method2157(var11.field1224, var14, var11.field1216 + var13, var11.field1188, var11.field1205, -1);
                            }
                            if (var11.field1184 != 1) {
                                if (var11.field1184 == 2) {
                                    int var124 = 0;
                                    for (int var125 = 0; var125 < var11.field1297; var125++) {
                                        for (int var126 = 0; var126 < var11.field1298; var126++) {
                                            int var127 = (var11.field1174 + 32) * var126 + var13;
                                            int var128 = (var11.field1158 + 32) * var125 + var14;
                                            if (var124 < 20) {
                                                var128 += var11.field1177[var124];
                                                var127 += var11.field1279[var124];
                                            }
                                            if (var11.field1170[var124] > 0) {
                                                boolean var130 = false;
                                                boolean var131 = false;
                                                int var132 = var11.field1170[var124] - 1;
                                                if (arg8 < (var127 + 32) && arg7 > var127 && var128 + 32 > arg2 && arg6 > var128 || class62.field977 == var11 && class34.field507 == var124) {
                                                    class86 var133;
                                                    if (class271.field4578 == 1 && class217.field3778 == var124 && class110.field1974 == var11.field1172) {
                                                        var133 = class257.method1843(1114, var11.field1264, var132, 2, 0, var11.field1144[var124]);
                                                    } else {
                                                        var133 = class257.method1843(1114, var11.field1264, var132, 1, 3153952, var11.field1144[var124]);
                                                    }
                                                    if (class102.field1812) {
                                                        class276.field4639[var12] = true;
                                                    }
                                                    if (var133 == null) {
                                                        class138.method937(var11, 16);
                                                    } else if (class62.field977 == var11 && class34.field507 == var124) {
                                                        int var134 = class202.field3471 - class161.field2809;
                                                        int var135 = class211.field3702 - class40.field695;
                                                        if (var135 < 5 && var135 > -5) {
                                                            var135 = 0;
                                                        }
                                                        if (var134 < 5 && var134 > -5) {
                                                            var134 = 0;
                                                        }
                                                        if (class130.field2263 < 5) {
                                                            var134 = 0;
                                                            var135 = 0;
                                                        }
                                                        var133.method602(var127 + var135, var128 - -var134, 128);
                                                        if (arg3 != -1) {
                                                            class75 var136 = arg9[arg3 & 0xFFFF];
                                                            int var137;
                                                            int var138;
                                                            if (class147.field2485) {
                                                                var138 = class116.field2051;
                                                                var137 = class116.field2054;
                                                            } else {
                                                                var137 = class320.field5526;
                                                                var138 = class320.field5530;
                                                            }
                                                            if ((var128 + var134) < var138 && var136.field1188 > 0) {
                                                                int var139 = (var138 - var128 - var134) * class243.field4229 / 3;
                                                                if (var139 > class243.field4229 * 10) {
                                                                    var139 = class243.field4229 * 10;
                                                                }
                                                                if (var136.field1188 < var139) {
                                                                    var139 = var136.field1188;
                                                                }
                                                                class161.field2809 += var139;
                                                                var136.field1188 -= var139;
                                                                class138.method937(var136, 16);
                                                            }
                                                            if (var128 + var134 + 32 > var137 && var136.field1188 < var136.field1224 - var136.field1205) {
                                                                int var140 = (var128 + var134 + 32 - var137) * class243.field4229 / 3;
                                                                if (var140 > (class243.field4229 * 10)) {
                                                                    var140 = class243.field4229 * 10;
                                                                }
                                                                if (var140 > var136.field1224 - var136.field1205 - var136.field1188) {
                                                                    var140 = var136.field1224 - var136.field1205 - var136.field1188;
                                                                }
                                                                var136.field1188 += var140;
                                                                class161.field2809 -= var140;
                                                                class138.method937(var136, 16);
                                                            }
                                                        }
                                                    } else if (class328.field5603 == var11 && class131.field2274 == var124) {
                                                        var133.method602(var127, var128, 128);
                                                    } else {
                                                        var133.method600(var127, var128);
                                                    }
                                                }
                                            } else if (var11.field1166 != null && var124 < 20) {
                                                class86 var129 = var11.method471(-102, var124);
                                                if (var129 != null) {
                                                    var129.method600(var127, var128);
                                                } else if (class272.field4585) {
                                                    class138.method937(var11, 16);
                                                }
                                            }
                                            var124++;
                                        }
                                    }
                                } else if (var11.field1184 == 3) {
                                    int var57;
                                    if (class135.method925(125, var11)) {
                                        var57 = var11.field1272;
                                        if (class302.field5154 == var11 && var11.field1255 != 0) {
                                            var57 = var11.field1255;
                                        }
                                    } else {
                                        var57 = var11.field1288;
                                        if (class302.field5154 == var11 && var11.field1226 != 0) {
                                            var57 = var11.field1226;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1304) {
                                            if (class147.field2485) {
                                                class116.method784(var13, var14, var11.field1216, var11.field1205, var57);
                                            } else {
                                                class320.method2217(var13, var14, var11.field1216, var11.field1205, var57);
                                            }
                                        } else if (class147.field2485) {
                                            class116.method786(var13, var14, var11.field1216, var11.field1205, var57);
                                        } else {
                                            class320.method2207(var13, var14, var11.field1216, var11.field1205, var57);
                                        }
                                    } else if (var11.field1304) {
                                        if (class147.field2485) {
                                            class116.method795(var13, var14, var11.field1216, var11.field1205, var57, 256 - (var15 & 0xFF));
                                        } else {
                                            class320.method2199(var13, var14, var11.field1216, var11.field1205, var57, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class147.field2485) {
                                        class116.method783(var13, var14, var11.field1216, var11.field1205, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class320.method2205(var13, var14, var11.field1216, var11.field1205, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1184 == 4) {
                                    class18 var120 = var11.method476(class193.field3278, -1);
                                    if (var120 != null) {
                                        class82 var121 = var11.field1276;
                                        int var122;
                                        if (class135.method925(94, var11)) {
                                            var122 = var11.field1272;
                                            if (class302.field5154 == var11 && var11.field1255 != 0) {
                                                var122 = var11.field1255;
                                            }
                                            if (var11.field1160.method535(true) > 0) {
                                                var121 = var11.field1160;
                                            }
                                        } else {
                                            var122 = var11.field1288;
                                            if (class302.field5154 == var11 && var11.field1226 != 0) {
                                                var122 = var11.field1226;
                                            }
                                        }
                                        if (var11.field1136 && var11.field1262 != -1) {
                                            class312 var123 = class273.method1912(var11.field1262, -117);
                                            var121 = var123.field5364;
                                            if (var121 == null) {
                                                var121 = class143.field2438;
                                            }
                                            if ((var123.field5357 == 1 || var11.field1244 != 1) && var11.field1244 != -1) {
                                                var121 = class29.method182(-6039, new class82[] { class31.field466, var121, class163.field2823, class9.method59((byte) 48, var11.field1244) });
                                            }
                                        }
                                        if (class99.field1789 == var11) {
                                            var122 = var11.field1288;
                                            var121 = class19.field249;
                                        }
                                        if (!var11.field1136) {
                                            var121 = class271.method1899(var11, var121, (byte) 123);
                                        }
                                        var120.method103(var121, var13, var14, var11.field1216, var11.field1205, var122, var11.field1233 ? 0 : -1, var11.field1203, var11.field1236, var11.field1232);
                                    } else if (class272.field4585) {
                                        class138.method937(var11, 16);
                                    }
                                } else if (var11.field1184 == 5) {
                                    if (var11.field1136) {
                                        class86 var58;
                                        if (var11.field1262 == -1) {
                                            var58 = var11.method469(false, arg4 ^ 0xFFFFFF94);
                                        } else {
                                            var58 = class257.method1843(1114, var11.field1264, var11.field1262, var11.field1201, var11.field1229, var11.field1244);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field1544;
                                            int var60 = var58.field1538;
                                            if (var11.field1259) {
                                                int var61 = (var11.field1216 + var59 - 1) / var59;
                                                int var62 = (var60 + var11.field1205 - 1) / var60;
                                                if (class147.field2485) {
                                                    class116.method787(var13, var14, var11.field1216 + var13, var14 - -var11.field1205);
                                                    boolean var63 = class231.method1639(2, var58.field1543);
                                                    boolean var64 = class231.method1639(2, var58.field1533);
                                                    class210 var65 = (class210) var58;
                                                    if (var63 && var64) {
                                                        if (var15 == 0) {
                                                            var65.method1515(var13, var14, var61, var62);
                                                        } else {
                                                            var65.method1511(var13, var14, 256 - (var15 & 0xFF), var61, var62);
                                                        }
                                                    } else if (var63) {
                                                        for (int var66 = 0; var66 < var62; var66++) {
                                                            if (var15 == 0) {
                                                                var65.method1515(var13, var60 * var66 + var14, var61, 1);
                                                            } else {
                                                                var65.method1511(var13, var60 * var66 + var14, -(var15 & 0xFF) + 256, var61, 1);
                                                            }
                                                        }
                                                    } else if (var64) {
                                                        for (int var67 = 0; var67 < var61; var67++) {
                                                            if (var15 == 0) {
                                                                var65.method1515(var13 + (var59 * var67), var14, 1, var62);
                                                            } else {
                                                                var65.method1511(var59 * var67 + var13, var14, 256 - (var15 & 0xFF), 1, var62);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var68 = 0; var68 < var61; var68++) {
                                                            for (int var69 = 0; var69 < var62; var69++) {
                                                                if (var15 == 0) {
                                                                    var58.method600(var59 * var68 + var13, var60 * var69 + var14);
                                                                } else {
                                                                    var58.method602(var13 + (var59 * var68), var14 - -(var60 * var69), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class116.method789(arg8, arg2, arg7, arg6);
                                                } else {
                                                    class320.method2216(var13, var14, var11.field1216 + var13, var14 - -var11.field1205);
                                                    for (int var70 = 0; var70 < var61; var70++) {
                                                        for (int var71 = 0; var71 < var62; var71++) {
                                                            if (var11.field1155 != 0) {
                                                                var58.method601(4096, var11.field1155, var60 * var71 + var14 + (var60 / 2), arg4 + -1383661523, var59 * var70 + var13 + (var59 / 2));
                                                            } else if (var15 == 0) {
                                                                var58.method600(var59 * var70 + var13, var60 * var71 + var14);
                                                            } else {
                                                                var58.method602(var59 * var70 + var13, var60 * var71 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class320.method2220(arg8, arg2, arg7, arg6);
                                                }
                                            } else {
                                                int var72 = var11.field1216 * 4096 / var59;
                                                if (var11.field1155 != 0) {
                                                    var58.method601(var72, var11.field1155, var11.field1205 / 2 + var14, arg4 ^ 0x52790055, var11.field1216 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var58.method605(var13, var14, var11.field1216, var11.field1205, 256 - (var15 & 0xFF));
                                                } else if (var11.field1216 == var59 && var11.field1205 == var60) {
                                                    var58.method600(var13, var14);
                                                } else {
                                                    var58.method604(var13, var14, var11.field1216, var11.field1205);
                                                }
                                            }
                                        } else if (class272.field4585) {
                                            class138.method937(var11, 16);
                                        }
                                    } else {
                                        class86 var73 = var11.method469(class135.method925(75, var11), 2);
                                        if (var73 != null) {
                                            var73.method600(var13, var14);
                                        } else if (class272.field4585) {
                                            class138.method937(var11, 16);
                                        }
                                    }
                                } else if (var11.field1184 == 6) {
                                    boolean var101 = class135.method925(96, var11);
                                    class155 var102 = null;
                                    int var103 = 0;
                                    int var104;
                                    if (var101) {
                                        var104 = var11.field1192;
                                    } else {
                                        var104 = var11.field1235;
                                    }
                                    if (var11.field1262 != -1) {
                                        class312 var105 = class273.method1912(var11.field1262, -106);
                                        if (var105 != null) {
                                            class312 var106 = var105.method2147((byte) -109, var11.field1244);
                                            class35 var107 = var104 == -1 ? null : class284.method1973(var104, false);
                                            var102 = var106.method2148(var11.field1202, 1, var107, arg4 + 106);
                                            if (var102 == null) {
                                                class138.method937(var11, 16);
                                            } else {
                                                var103 = -var102.method238() / 2;
                                            }
                                        }
                                    } else if (var11.field1180 == 5) {
                                        if (var11.field1164 == -1) {
                                            var102 = class34.field513.method1397(-1, (class35) null, -1, (class35) null, 25584);
                                        } else {
                                            int var109 = var11.field1164 & 0x7FF;
                                            if (class109.field1949 == var109) {
                                                var109 = 2047;
                                            }
                                            class81 var110 = class29.field405[var109];
                                            class35 var111 = var104 == -1 ? null : class284.method1973(var104, false);
                                            if (var110 != null && ((int) var110.field1409.method568(arg4 ^ 0xFFFFA85A) << 11) == (var11.field1164 & 0xFFFFF800)) {
                                                var102 = var110.field1404.method1397(0, (class35) null, var11.field1202, var111, 25584);
                                            }
                                        }
                                    } else if (var104 == -1) {
                                        var102 = var11.method470(var101, true, -1, (class35) null, class168.field2932.field1404);
                                        if (var102 == null && class272.field4585) {
                                            class138.method937(var11, 16);
                                        }
                                    } else {
                                        class35 var108 = class284.method1973(var104, false);
                                        var102 = var11.method470(var101, true, var11.field1202, var108, class168.field2932.field1404);
                                        if (var102 == null && class272.field4585) {
                                            class138.method937(var11, 16);
                                        }
                                    }
                                    if (var102 != null) {
                                        int var112;
                                        if (var11.field1206 > 0) {
                                            var112 = (var11.field1205 << 8) / var11.field1206;
                                        } else {
                                            var112 = 256;
                                        }
                                        int var113;
                                        if (var11.field1257 > 0) {
                                            var113 = (var11.field1216 << 8) / var11.field1257;
                                        } else {
                                            var113 = 256;
                                        }
                                        int var114 = (var11.field1169 * var112 >> 8) + var14 + (var11.field1205 / 2);
                                        int var115 = var13 + (var11.field1216 / 2) + (var11.field1211 * var113 >> 8);
                                        if (class147.field2485) {
                                            if (var11.field1251) {
                                                class147.method1014(var115, var114, var11.field1186, var11.field1283, var113, var112);
                                            } else {
                                                class147.method1023(var115, var114, var113, var112);
                                                class147.method1010((float) var11.field1239, (float) var11.field1283 * 1.5F);
                                            }
                                            class147.method1019();
                                            class147.method1016(true);
                                            class147.method1022(false);
                                            class275.method1914(class112.field2032, 125);
                                            if (class74.field1131) {
                                                class116.method790();
                                                class147.method990();
                                                class116.method789(arg8, arg2, arg7, arg6);
                                                class74.field1131 = false;
                                            }
                                            if (var11.field1176) {
                                                class147.method1001();
                                            }
                                            int var116 = class102.field1819[var11.field1299] * var11.field1186 >> 16;
                                            int var117 = class102.field1813[var11.field1299] * var11.field1186 >> 16;
                                            if (var11.field1136) {
                                                var102.method193(0, var11.field1167, var11.field1286, var11.field1299, var11.field1249, var103 + var117 + var11.field1171, var116 - -var11.field1171, -1L);
                                            } else {
                                                var102.method193(0, var11.field1167, 0, var11.field1299, 0, var117, var116, -1L);
                                            }
                                            if (var11.field1176) {
                                                class147.method1006();
                                            }
                                        } else {
                                            class102.method700(var115, var114);
                                            int var118 = class102.field1813[var11.field1299] * var11.field1186 >> 16;
                                            int var119 = class102.field1819[var11.field1299] * var11.field1186 >> 16;
                                            if (!var11.field1136) {
                                                var102.method193(0, var11.field1167, 0, var11.field1299, 0, var118, var119, -1L);
                                            } else if (var11.field1251) {
                                                ((class318) var102).method2188(0, var11.field1167, var11.field1286, var11.field1299, var11.field1249, var103 + var118 + var11.field1171, var11.field1171 + var119, var11.field1186);
                                            } else {
                                                var102.method193(0, var11.field1167, var11.field1286, var11.field1299, var11.field1249, var118 + var11.field1171 + var103, var11.field1171 + var119, -1L);
                                            }
                                            class102.method691();
                                        }
                                    }
                                } else {
                                    if (var11.field1184 == 7) {
                                        class18 var74 = var11.method476(class193.field3278, arg4 + 105);
                                        if (var74 == null) {
                                            if (class272.field4585) {
                                                class138.method937(var11, 16);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var11.field1297; var76++) {
                                            for (int var77 = 0; var77 < var11.field1298; var77++) {
                                                if (var11.field1170[var75] > 0) {
                                                    class312 var78 = class273.method1912(var11.field1170[var75] - 1, -93);
                                                    class82 var79;
                                                    if (var78.field5357 != 1 && var11.field1144[var75] == 1) {
                                                        var79 = class29.method182(-6039, new class82[] { class31.field466, var78.field5364, class302.field5149 });
                                                    } else {
                                                        var79 = class29.method182(-6039, new class82[] { class31.field466, var78.field5364, class163.field2823, class9.method59((byte) 46, var11.field1144[var75]) });
                                                    }
                                                    int var80 = var13 + ((var11.field1174 + 115) * var77);
                                                    int var81 = (var11.field1158 + 12) * var76 + var14;
                                                    if (var11.field1203 == 0) {
                                                        var74.method112(var79, var80, var81, var11.field1288, var11.field1233 ? 0 : -1);
                                                    } else if (var11.field1203 == 1) {
                                                        var74.method120(var79, var80 + 57, var81, var11.field1288, var11.field1233 ? 0 : -1);
                                                    } else {
                                                        var74.method105(var79, var80 + 115 - 1, var81, var11.field1288, var11.field1233 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var11.field1184 == 8 && class157.field2730 == var11 && class314.field5407 == class181.field3080) {
                                        int var82 = 0;
                                        int var83 = 0;
                                        class82 var84 = var11.field1276;
                                        class18 var85 = class138.field2364;
                                        class82 var86 = class271.method1899(var11, var84, (byte) 123);
                                        while (var86.method535(true) > 0) {
                                            int var87 = var86.method563(126, class235.field4095);
                                            class82 var88;
                                            if (var87 == -1) {
                                                var88 = var86;
                                                var86 = class129.field2247;
                                            } else {
                                                var88 = var86.method573(0, arg4 + 196, var87);
                                                var86 = var86.method558((byte) -66, var87 + 4);
                                            }
                                            int var89 = var85.method124(var88);
                                            if (var82 < var89) {
                                                var82 = var89;
                                            }
                                            var83 += var85.field192 + 1;
                                        }
                                        var82 += 6;
                                        int var90 = var11.field1216 + var13 - var82 - 5;
                                        if ((var13 + 5) > var90) {
                                            var90 = var13 + 5;
                                        }
                                        var83 += 7;
                                        int var91 = var11.field1205 + var14 + 5;
                                        if (var83 + var91 > arg6) {
                                            var91 = arg6 - var83;
                                        }
                                        if (arg7 < var82 + var90) {
                                            var90 = arg7 - var82;
                                        }
                                        if (class147.field2485) {
                                            class116.method784(var90, var91, var82, var83, 16777120);
                                            class116.method786(var90, var91, var82, var83, 0);
                                        } else {
                                            class320.method2217(var90, var91, var82, var83, 16777120);
                                            class320.method2207(var90, var91, var82, var83, 0);
                                        }
                                        class82 var92 = var11.field1276;
                                        int var93 = var85.field192 + var91 + 2;
                                        class82 var94 = class271.method1899(var11, var92, (byte) 123);
                                        while (var94.method535(true) > 0) {
                                            int var95 = var94.method563(78, class235.field4095);
                                            class82 var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = class129.field2247;
                                            } else {
                                                var96 = var94.method573(0, 56, var95);
                                                var94 = var94.method558((byte) -66, var95 + 4);
                                            }
                                            var85.method112(var96, var90 + 3, var93, 0, -1);
                                            var93 += var85.field192 + 1;
                                        }
                                    }
                                    if (var11.field1184 == 9) {
                                        int var97;
                                        int var98;
                                        int var99;
                                        int var100;
                                        if (var11.field1268) {
                                            var97 = var14 + var11.field1205;
                                            var98 = var13;
                                            var99 = var14;
                                            var100 = var13 + var11.field1216;
                                        } else {
                                            var99 = var11.field1205 + var14;
                                            var97 = var14;
                                            var98 = var13;
                                            var100 = var11.field1216 + var13;
                                        }
                                        if (var11.field1182 == 1) {
                                            if (class147.field2485) {
                                                class116.method791(var98, var97, var100, var99, var11.field1288);
                                            } else {
                                                class320.method2210(var98, var97, var100, var99, var11.field1288);
                                            }
                                        } else if (class147.field2485) {
                                            class116.method785(var98, var97, var100, var99, var11.field1288, var11.field1182);
                                        } else {
                                            class320.method2219(var98, var97, var100, var99, var11.field1288, var11.field1182);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field1049++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBII)I", line = 1398)
    public static final int method430(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 42) {
            return -107;
        } else {
            int var5 = 65536 - class102.field1819[arg3 * 1024 / arg1] >> 1;
            field1051++;
            return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 1410)
    public static final void method431(int arg0) {
        field1053++;
        try {
            int var1 = 66 / ((-arg0 - 7) / 51);
            if (class77.field1324 == 1) {
                int var2 = class86.field1537.method1447(15590);
                if (var2 > 0 && class86.field1537.method1437(16)) {
                    int var3 = var2 - class265.field4529;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class86.field1537.method1423(38, var3);
                    return;
                }
                class86.field1537.method1431(-2);
                class86.field1537.method1448((byte) 66);
                if (class315.field5422 == null) {
                    class77.field1324 = 0;
                } else {
                    class77.field1324 = 2;
                }
                class244.field4233 = null;
                class232.field4007 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class86.field1537.method1431(-2);
            class232.field4007 = null;
            class244.field4233 = null;
            class315.field5422 = null;
            class77.field1324 = 0;
        }
    }
}
