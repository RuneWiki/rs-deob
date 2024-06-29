import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class394 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field5731 = 0;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field5732 = 1;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lir;")
    public static class185 field5733;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lm;")
    public static class242 field5730;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
    public static int method2529(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method2530(int arg0) {
        field5733 = null;
        field5730 = null;
        int var1 = -58 / ((arg0 + 35) / 45);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILvr;)Lvr;")
    public abstract class43 method780(int arg0, class43 arg1);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lnb;Ldh;)V")
    public static final void method2531(class340 arg0, class77 arg1) {
        if (!arg1.field1068) {
            return;
        }
        short var2 = arg1.field1083;
        short var3 = arg1.field1081;
        byte var4 = arg1.field1065;
        byte var5 = arg1.field1073;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class77[][] var8 = class106.field1405[var4];
        float var10;
        if (class370.field5469 == class266.field3950) {
            int var9 = class50.field777[var2][var3];
            class185.field2528.method450(class142.field1804[0].method725(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 201.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class185.field2528.method481(3000.0F, var10 * 1.5F);
        if (arg1.field1062) {
            if (class69.field1008) {
                if (var4 > 0) {
                    class77 var11 = class106.field1405[var4 - 1][var2][var3];
                    if (var11 != null && var11.field1068) {
                        return;
                    }
                }
                if (var2 <= class167.field2261 && var2 > class396.field5788) {
                    class77 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field1068 && (var12.field1062 || (arg1.field1075 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class167.field2261 && var2 < class74.field1043 - 1) {
                    class77 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field1068 && (var13.field1062 || (arg1.field1075 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class437.field6352 && var3 > class427.field6217) {
                    class77 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field1068 && (var14.field1062 || (arg1.field1075 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class437.field6352 && var3 < class154.field1957 - 1) {
                    class77 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field1068 && (var15.field1062 || (arg1.field1075 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class69.field1008 = true;
            }
            arg1.field1062 = false;
            if (arg1.field1061 != null) {
                class77 var16 = arg1.field1061;
                class185.field2528.method481(3000.0F, (201.5F - (float) (var16.field1073 + 1) * 50.0F) * 1.5F);
                if (!class28.method234(var16.field1073, var2, var3)) {
                    class266.field3950[var16.field1073].method724(var2, var3);
                }
                class400 var17 = var16.field1067;
                if (var17 != null) {
                    if (class46.field697) {
                        if ((var17.field5858 & arg1.field1086) == 0) {
                            class322.method2121(arg0, var4, var2, var3);
                        } else {
                            class145.method1008(arg0, var17.field5858, var5, var2, var3);
                        }
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    var17.method118(class185.field2528, 18630);
                }
                for (class356 var18 = var16.field1064; var18 != null; var18 = var18.field5275) {
                    class407 var19 = var18.field5274;
                    if (var19 != null) {
                        if (class46.field697) {
                            class322.method2121(arg0, var4, var2, var3);
                            class185.field2528.method505(arg0.field5014, arg0.field5015);
                        }
                        var19.method118(class185.field2528, 18630);
                    }
                }
                class185.field2528.method481(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class28.method234(var5, var2, var3);
            if (var20) {
                class266.field3950[var5].method724(var2, var3);
                class441 var21 = arg1.field1079;
                if (var21 != null && var21.field6389) {
                    if (var21.field6385) {
                        class185.field2528.method481(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var22 = var21.method118(class185.field2528, 18630);
                    if (var22 != null) {
                        var22.field5490 = var21;
                        var22.field5494 = var4;
                        var22.field5488 = var2;
                        var22.field5493 = var3;
                        class308.field4573.method50(var22, (byte) -57);
                    }
                    if (var21.field6385) {
                        class185.field2528.method481(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class400 var25 = arg1.field1067;
            class236 var26 = arg1.field1063;
            if (var25 != null || var26 != null) {
                if (class167.field2261 == var2) {
                    var23++;
                } else if (class167.field2261 < var2) {
                    var23 += 2;
                }
                if (class437.field6352 == var3) {
                    var23 += 3;
                } else if (class437.field6352 > var3) {
                    var23 += 6;
                }
                var24 = class321.field4775[var23];
                arg1.field1086 = class354.field5252[var23];
            }
            if (var25 != null) {
                if ((var25.field5858 & class144.field1841[var23]) == 0) {
                    arg1.field1077 = 0;
                } else if (var25.field5858 == 16) {
                    arg1.field1077 = 3;
                    arg1.field1084 = class117.field1527[var23];
                    arg1.field1070 = (byte) (3 - arg1.field1084);
                } else if (var25.field5858 == 32) {
                    arg1.field1077 = 6;
                    arg1.field1084 = class112.field1454[var23];
                    arg1.field1070 = (byte) (6 - arg1.field1084);
                } else if (var25.field5858 == 64) {
                    arg1.field1077 = 12;
                    arg1.field1084 = class178.field2387[var23];
                    arg1.field1070 = (byte) (12 - arg1.field1084);
                } else {
                    arg1.field1077 = 9;
                    arg1.field1084 = class373.field5497[var23];
                    arg1.field1070 = (byte) (9 - arg1.field1084);
                }
                if ((var25.field5858 & var24) != 0 && !class69.method582(var5, var2, var3, var25.field5858)) {
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var27 = var25.method118(class185.field2528, 18630);
                    if (var27 != null) {
                        var27.field5490 = var25;
                        var27.field5494 = var4;
                        var27.field5488 = var2;
                        var27.field5493 = var3;
                        class308.field4573.method50(var27, (byte) 75);
                    }
                }
                class400 var28 = arg1.field1087;
                if (var28 != null && (var28.field5858 & var24) != 0 && !class69.method582(var5, var2, var3, var28.field5858)) {
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var29 = var28.method118(class185.field2528, 18630);
                    if (var29 != null) {
                        var29.field5490 = var28;
                        var29.field5494 = var4;
                        var29.field5488 = var2;
                        var29.field5493 = var3;
                        class308.field4573.method50(var29, (byte) -101);
                    }
                }
            }
            if (var26 != null && !class115.method848(var5, var2, var3, var26.method1529(1))) {
                class236 var30 = arg1.field1076;
                class185.field2528.method481(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field3296 & var24) != 0) {
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var31 = var26.method118(class185.field2528, 18630);
                    if (var31 != null) {
                        var31.field5490 = var26;
                        var31.field5494 = var4;
                        var31.field5488 = var2;
                        var31.field5493 = var3;
                        class308.field4573.method50(var31, (byte) -70);
                    }
                } else if (var26.field3296 == 256) {
                    int var32 = var26.field3287 - class193.field2684;
                    int var33 = var26.field3302 - class447.field6430;
                    int var34 = var26.field3290;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    if (var36 < var35) {
                        class372 var37 = var26.method118(class185.field2528, 18630);
                        if (var37 != null) {
                            var37.field5490 = var26;
                            var37.field5494 = var4;
                            var37.field5488 = var2;
                            var37.field5493 = var3;
                            class308.field4573.method50(var37, (byte) -62);
                        }
                    } else if (var30 != null) {
                        class372 var38 = var30.method118(class185.field2528, 18630);
                        if (var38 != null) {
                            var38.field5490 = var30;
                            var38.field5494 = var4;
                            var38.field5488 = var2;
                            var38.field5493 = var3;
                            class308.field4573.method50(var38, (byte) -112);
                        }
                    }
                }
                class185.field2528.method481(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class441 var39 = arg1.field1079;
                if (var39 != null && !var39.field6389) {
                    if (var39.field6385) {
                        class185.field2528.method481(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var40 = var39.method118(class185.field2528, 18630);
                    if (var40 != null) {
                        var40.field5490 = var39;
                        var40.field5494 = var4;
                        var40.field5488 = var2;
                        var40.field5493 = var3;
                        class308.field4573.method50(var40, (byte) -58);
                    }
                    if (var39.field6385) {
                        class185.field2528.method481(3000.0F, var10 * 1.5F);
                    }
                }
                class127 var41 = arg1.field1078;
                if (var41 != null && !var41.field1661) {
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var42 = var41.method118(class185.field2528, 18630);
                    if (var42 != null) {
                        var42.field5490 = var41;
                        var42.field5494 = var4;
                        var42.field5488 = var2;
                        var42.field5493 = var3;
                        class308.field4573.method50(var42, (byte) -108);
                    }
                }
            }
            byte var43 = arg1.field1075;
            if (var43 != 0) {
                if (var2 < class167.field2261 && (var43 & 0x4) != 0) {
                    class77 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field1068) {
                        class395.field5742.method1276(false, var44);
                    }
                }
                if (var3 < class437.field6352 && (var43 & 0x2) != 0) {
                    class77 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field1068) {
                        class395.field5742.method1276(false, var45);
                    }
                }
                if (var2 > class167.field2261 && (var43 & 0x1) != 0) {
                    class77 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field1068) {
                        class395.field5742.method1276(false, var46);
                    }
                }
                if (var3 > class437.field6352 && (var43 & 0x8) != 0) {
                    class77 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field1068) {
                        class395.field5742.method1276(false, var47);
                    }
                }
            }
        }
        if (arg1.field1077 != 0) {
            boolean var48 = true;
            for (class356 var49 = arg1.field1064; var49 != null; var49 = var49.field5275) {
                if (class13.field207 != var49.field5274.field5927 && (var49.field5267 & arg1.field1077) == arg1.field1084) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class400 var50 = arg1.field1067;
                if (!class69.method582(var5, var2, var3, var50.field5858)) {
                    if (class46.field697) {
                        label687: {
                            if (var50.field5858 >= 16) {
                                int var51 = var2 - class167.field2261;
                                int var52 = var3 - class437.field6352;
                                if (var50.field5858 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class186.field2554) {
                                        class322.method2121(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5858 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class108.field1421 && var3 < class186.field2554) {
                                        class322.method2121(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5858 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class108.field1421 && var3 > 0) {
                                        class322.method2121(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field5858 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class322.method2121(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class322.method2121(arg0, var4, var2, var3);
                        }
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var53 = var50.method118(class185.field2528, 18630);
                    if (var53 != null) {
                        var53.field5490 = var50;
                        var53.field5494 = var4;
                        var53.field5488 = var2;
                        var53.field5493 = var3;
                        class308.field4573.method50(var53, (byte) 117);
                    }
                }
                arg1.field1077 = 0;
            }
        }
        if (arg1.field1082) {
            try {
                arg1.field1082 = false;
                int var54 = 0;
                label630: for (class356 var55 = arg1.field1064; var55 != null; var55 = var55.field5275) {
                    class407 var56 = var55.field5274;
                    if (class13.field207 != var56.field5927) {
                        for (int var57 = var56.field5917; var57 <= var56.field5924; var57++) {
                            for (int var58 = var56.field5918; var58 <= var56.field5920; var58++) {
                                class77 var59 = var8[var57][var58];
                                if (var59.field1062) {
                                    arg1.field1082 = true;
                                    continue label630;
                                }
                                if (var59.field1077 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field5917) {
                                        var60++;
                                    }
                                    if (var57 < var56.field5924) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field5918) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field5920) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field1077) == arg1.field1070) {
                                        arg1.field1082 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class167.field2261 - var56.field5917;
                        int var62 = var56.field5924 - class167.field2261;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class437.field6352 - var56.field5918;
                        int var64 = var56.field5920 - class437.field6352;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field5020[var54] = var56;
                        arg0.field5017[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class407 var68 = arg0.field5020[var67];
                        if (class13.field207 != var68.field5927) {
                            int var69 = arg0.field5017[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field5921 - class193.field2684;
                                int var71 = var68.field5930 - class447.field6430;
                                int var72 = arg0.field5020[var66].field5921 - class193.field2684;
                                int var73 = arg0.field5020[var66].field5930 - class447.field6430;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class407 var74 = arg0.field5020[var66];
                    var74.field5927 = class13.field207;
                    if (!class116.method851(var5, var74.field5917, var74.field5924, var74.field5918, var74.field5920, var74.method345(70))) {
                        if (class46.field697) {
                            if (var74.field5919 == 0) {
                                class45.method329(arg0, var4, var74.field5917, var74.field5918, var74.field5924, var74.field5920);
                            } else {
                                class322.method2121(arg0, var4, var2, var3);
                                int var75 = var2 - class167.field2261;
                                int var76 = var3 - class437.field6352;
                                if (var74.field5919 == 2) {
                                    if (var76 > -var75) {
                                        class94.method754(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class94.method754(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class94.method754(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class94.method754(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class185.field2528.method505(arg0.field5014, arg0.field5015);
                        }
                        class372 var77 = var74.method118(class185.field2528, 18630);
                        if (var77 != null) {
                            var77.field5490 = var74;
                            var77.field5494 = var4;
                            var77.field5488 = var74.field5917;
                            var77.field5493 = var74.field5918;
                            class308.field4573.method50(var77, (byte) 77);
                        }
                    }
                    for (int var78 = var74.field5917; var78 <= var74.field5924; var78++) {
                        for (int var79 = var74.field5918; var79 <= var74.field5920; var79++) {
                            class77 var80 = var8[var78][var79];
                            if (var80.field1077 != 0) {
                                class395.field5742.method1276(false, var80);
                            } else if ((var2 != var78 || var3 != var79) && var80.field1068) {
                                class395.field5742.method1276(false, var80);
                            }
                        }
                    }
                }
                if (arg1.field1082) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field1082 = false;
            }
        }
        if (arg1.field1060 != null) {
            if ((byte) (class372.field5487 & 0xFF) == arg1.field1085) {
                class305 var81 = arg1.field1060;
                int var82 = class266.field3950[var4].method722(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class266.field3950[var4].method722(var2, var3) - class266.field3950[var4 + 1].method722(var2, var3);
                } else {
                    var83 = 1024;
                }
                class112.field1442.method278(var6, var82, var7, arg0.field5013);
                int var84 = arg0.field5013[2];
                class112.field1442.method278(var6, var82 - var83, var7, arg0.field5013);
                int var85 = arg0.field5013[2];
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
                var81.field4568 = var86;
                var81.field4562 = var87;
                var81.field4564 = true;
                class185.field2528.method509(var81);
            } else {
                arg1.field1060 = null;
            }
        }
        if (!arg1.field1068) {
            return;
        }
        if (arg1.field1077 != 0) {
            return;
        }
        if (var2 <= class167.field2261 && var2 > class396.field5788) {
            class77 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field1068) {
                return;
            }
        }
        if (var2 >= class167.field2261 && var2 < class74.field1043 - 1) {
            class77 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field1068) {
                return;
            }
        }
        if (var3 <= class437.field6352 && var3 > class427.field6217) {
            class77 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field1068) {
                return;
            }
        }
        if (var3 >= class437.field6352 && var3 < class154.field1957 - 1) {
            class77 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field1068) {
                return;
            }
        }
        arg1.field1068 = false;
        class132.field1728--;
        class127 var92 = arg1.field1078;
        if (var92 != null && var92.field1661) {
            if (class46.field697) {
                class322.method2121(arg0, var4, var2, var3);
                class185.field2528.method505(arg0.field5014, arg0.field5015);
            }
            class372 var93 = var92.method118(class185.field2528, 18630);
            if (var93 != null) {
                var93.field5490 = var92;
                var93.field5494 = var4;
                var93.field5488 = var2;
                var93.field5493 = var3;
                class308.field4573.method50(var93, (byte) 112);
            }
        }
        if (arg1.field1086 != 0) {
            class236 var94 = arg1.field1063;
            if (var94 != null && !class115.method848(var5, var2, var3, var94.method1529(1))) {
                if ((var94.field3296 & arg1.field1086) != 0) {
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class372 var95 = var94.method118(class185.field2528, 18630);
                    if (var95 != null) {
                        var95.field5490 = var94;
                        var95.field5494 = var4;
                        var95.field5488 = var2;
                        var95.field5493 = var3;
                        class308.field4573.method50(var95, (byte) 125);
                    }
                } else if (var94.field3296 == 256) {
                    int var96 = var94.field3287 - class193.field2684;
                    int var97 = var94.field3302 - class447.field6430;
                    int var98 = var94.field3290;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class46.field697) {
                        class322.method2121(arg0, var4, var2, var3);
                        class185.field2528.method505(arg0.field5014, arg0.field5015);
                    }
                    class236 var101 = arg1.field1076;
                    if (var100 > var99) {
                        class372 var102 = var94.method118(class185.field2528, 18630);
                        if (var102 != null) {
                            var102.field5490 = var94;
                            var102.field5494 = var4;
                            var102.field5488 = var2;
                            var102.field5493 = var3;
                            class308.field4573.method50(var102, (byte) 97);
                        }
                    } else if (var101 != null) {
                        class372 var103 = var101.method118(class185.field2528, 18630);
                        if (var103 != null) {
                            var103.field5490 = var101;
                            var103.field5494 = var4;
                            var103.field5488 = var2;
                            var103.field5493 = var3;
                            class308.field4573.method50(var103, (byte) -66);
                        }
                    }
                }
            }
            class400 var104 = arg1.field1067;
            class400 var105 = arg1.field1087;
            if (var105 != null && (var105.field5858 & arg1.field1086) != 0 && !class69.method582(var5, var2, var3, var105.field5858)) {
                if (class46.field697) {
                    class145.method1008(arg0, var105.field5858, var4, var2, var3);
                    class185.field2528.method505(arg0.field5014, arg0.field5015);
                }
                class372 var106 = var105.method118(class185.field2528, 18630);
                if (var106 != null) {
                    var106.field5490 = var105;
                    var106.field5494 = var4;
                    var106.field5488 = var2;
                    var106.field5493 = var3;
                    class308.field4573.method50(var106, (byte) -113);
                }
            }
            if (var104 != null && (var104.field5858 & arg1.field1086) != 0 && !class69.method582(var5, var2, var3, var104.field5858)) {
                if (class46.field697) {
                    class145.method1008(arg0, var104.field5858, var4, var2, var3);
                    class185.field2528.method505(arg0.field5014, arg0.field5015);
                }
                class372 var107 = var104.method118(class185.field2528, 18630);
                if (var107 != null) {
                    var107.field5490 = var104;
                    var107.field5494 = var4;
                    var107.field5488 = var2;
                    var107.field5493 = var3;
                    class308.field4573.method50(var107, (byte) 69);
                }
            }
        }
        if (var4 < class134.field1752 - 1) {
            class77 var108 = class106.field1405[var4 + 1][var2][var3];
            if (var108 != null && var108.field1068) {
                class395.field5742.method1277((byte) 40, var108);
            }
        }
        if (var2 < class167.field2261) {
            class77 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field1068) {
                class395.field5742.method1276(false, var109);
            }
        }
        if (var3 < class437.field6352) {
            class77 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field1068) {
                class395.field5742.method1276(false, var110);
            }
        }
        if (var2 > class167.field2261) {
            class77 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field1068) {
                class395.field5742.method1276(false, var111);
            }
        }
        if (var3 > class437.field6352) {
            class77 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field1068) {
                class395.field5742.method1276(false, var112);
            }
        }
    }
}
