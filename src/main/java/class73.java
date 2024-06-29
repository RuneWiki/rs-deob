import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class73 extends class151 {

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Z")
    public boolean field1220 = false;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lmb;")
    public static class132 field1218 = class166.method1092("und die Schaltfl-=che (WSpielkonto erstellen(W am", 114);

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Lmb;")
    private static class132 field1217 = class166.method1092("Loaded wordpack", 118);

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lmb;")
    public static class132 field1219 = field1217;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Lnb;")
    public static class143 field1221;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public static void method442(int arg0) {
        int var1 = 117 % ((arg0 - 64) / 35);
        field1219 = null;
        field1217 = null;
        field1218 = null;
        field1221 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lpf;Z)V")
    public static final void method443(class169 arg0, boolean arg1) {
        class112.field2156.method120(0, arg0);
        while (true) {
            class169 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class169[][] var7;
            class169 var65;
            do {
                class169 var64;
                do {
                    class169 var63;
                    do {
                        class169 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class169) class112.field2156.method117((byte) 6);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field3113);
                                            var3 = var2.field3117;
                                            var4 = var2.field3097;
                                            var5 = var2.field3109;
                                            var6 = var2.field3091;
                                            var7 = class101.field1900[var5];
                                            if (!var2.field3101) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class169 var8 = class101.field1900[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field3113) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class155.field2841 && var3 > class191.field3557) {
                                                    class169 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field3113 && (var9.field3101 || (var2.field3110 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class155.field2841 && var3 < class54.field918 - 1) {
                                                    class169 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field3113 && (var10.field3101 || (var2.field3110 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class2.field29 && var4 > class243.field4421) {
                                                    class169 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field3113 && (var11.field3101 || (var2.field3110 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class2.field29 && var4 < class111.field2106 - 1) {
                                                    class169 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field3113 && (var12.field3101 || (var2.field3110 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field3101 = false;
                                            if (var2.field3111 != null) {
                                                class169 var13 = var2.field3111;
                                                if (var13.field3145 == null) {
                                                    if (var13.field3127 != null && !class145.method973(0, var3, var4)) {
                                                        class82.method503(var13.field3127, class203.field3723, class40.field655, class100.field1885, class33.field524, var3, var4);
                                                    }
                                                } else if (!class145.method973(0, var3, var4)) {
                                                    class125.method820(var13.field3145, 0, class203.field3723, class40.field655, class100.field1885, class33.field524, var3, var4);
                                                }
                                                class186 var14 = var13.field3098;
                                                if (var14 != null) {
                                                    var14.field3440.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var14.field3453 - class213.field3897, var14.field3455 - class58.field975, var14.field3456 - class191.field3537, var14.field3439);
                                                }
                                                for (int var15 = 0; var15 < var13.field3096; var15++) {
                                                    class78 var16 = var13.field3103[var15];
                                                    if (var16 != null) {
                                                        var16.field1363.method52(var16.field1341, class203.field3723, class40.field655, class100.field1885, class33.field524, var16.field1338 - class213.field3897, var16.field1352 - class58.field975, var16.field1350 - class191.field3537, var16.field1355);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field3145 == null) {
                                                if (var2.field3127 != null && !class145.method973(var6, var3, var4)) {
                                                    var17 = true;
                                                    class82.method503(var2.field3127, class203.field3723, class40.field655, class100.field1885, class33.field524, var3, var4);
                                                }
                                            } else if (!class145.method973(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field3145.field1616 != 12345678 || class154.field2818 && var5 <= class205.field3758) {
                                                    class125.method820(var2.field3145, var6, class203.field3723, class40.field655, class100.field1885, class33.field524, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class186 var20 = var2.field3098;
                                            class220 var21 = var2.field3099;
                                            if (var20 != null || var21 != null) {
                                                if (class155.field2841 == var3) {
                                                    var18++;
                                                } else if (class155.field2841 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class2.field29 == var4) {
                                                    var18 += 3;
                                                } else if (class2.field29 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class92.field1631[var18];
                                                var2.field3106 = class138.field2590[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field3454 & class194.field3607[var18]) == 0) {
                                                    var2.field3114 = 0;
                                                } else if (var20.field3454 == 16) {
                                                    var2.field3114 = 3;
                                                    var2.field3107 = class186.field3443[var18];
                                                    var2.field3089 = 3 - var2.field3107;
                                                } else if (var20.field3454 == 32) {
                                                    var2.field3114 = 6;
                                                    var2.field3107 = class92.field1632[var18];
                                                    var2.field3089 = 6 - var2.field3107;
                                                } else if (var20.field3454 == 64) {
                                                    var2.field3114 = 12;
                                                    var2.field3107 = class67.field1113[var18];
                                                    var2.field3089 = 12 - var2.field3107;
                                                } else {
                                                    var2.field3114 = 9;
                                                    var2.field3107 = class166.field3022[var18];
                                                    var2.field3089 = 9 - var2.field3107;
                                                }
                                                if ((var20.field3454 & var19) != 0 && !class66.method413(var6, var3, var4, var20.field3454)) {
                                                    var20.field3440.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var20.field3453 - class213.field3897, var20.field3455 - class58.field975, var20.field3456 - class191.field3537, var20.field3439);
                                                }
                                                if ((var20.field3444 & var19) != 0 && !class66.method413(var6, var3, var4, var20.field3444)) {
                                                    var20.field3449.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var20.field3453 - class213.field3897, var20.field3455 - class58.field975, var20.field3456 - class191.field3537, var20.field3439);
                                                }
                                            }
                                            if (var21 != null && !class235.method1491(var6, var3, var4, var21.field4023.method55())) {
                                                if ((var21.field4017 & var19) != 0) {
                                                    var21.field4023.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var21.field4009 + var21.field4010 - class213.field3897, var21.field4006 - class58.field975, var21.field4011 + var21.field4018 - class191.field3537, var21.field4022);
                                                } else if (var21.field4017 == 256) {
                                                    int var22 = var21.field4009 - class213.field3897;
                                                    int var23 = var21.field4006 - class58.field975;
                                                    int var24 = var21.field4011 - class191.field3537;
                                                    int var25 = var21.field4004;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field4023.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var21.field4010 + var22, var23, var21.field4018 + var24, var21.field4022);
                                                    } else if (var21.field4019 != null) {
                                                        var21.field4019.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var22, var23, var24, var21.field4022);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class15 var28 = var2.field3100;
                                                if (var28 != null) {
                                                    var28.field227.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var28.field215 - class213.field3897, var28.field219 - class58.field975, var28.field226 - class191.field3537, var28.field210);
                                                }
                                                class26 var29 = var2.field3105;
                                                if (var29 != null && var29.field426 == 0) {
                                                    if (var29.field412 != null) {
                                                        var29.field412.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var29.field416 - class213.field3897, var29.field429 - class58.field975, var29.field421 - class191.field3537, var29.field414);
                                                    }
                                                    if (var29.field423 != null) {
                                                        var29.field423.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var29.field416 - class213.field3897, var29.field429 - class58.field975, var29.field421 - class191.field3537, var29.field414);
                                                    }
                                                    if (var29.field411 != null) {
                                                        var29.field411.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var29.field416 - class213.field3897, var29.field429 - class58.field975, var29.field421 - class191.field3537, var29.field414);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field3110;
                                            if (var30 != 0) {
                                                if (var3 < class155.field2841 && (var30 & 0x4) != 0) {
                                                    class169 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field3113) {
                                                        class112.field2156.method120(0, var31);
                                                    }
                                                }
                                                if (var4 < class2.field29 && (var30 & 0x2) != 0) {
                                                    class169 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field3113) {
                                                        class112.field2156.method120(0, var32);
                                                    }
                                                }
                                                if (var3 > class155.field2841 && (var30 & 0x1) != 0) {
                                                    class169 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field3113) {
                                                        class112.field2156.method120(0, var33);
                                                    }
                                                }
                                                if (var4 > class2.field29 && (var30 & 0x8) != 0) {
                                                    class169 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field3113) {
                                                        class112.field2156.method120(0, var34);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field3114 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field3096; var36++) {
                                                if (class33.field520 != var2.field3103[var36].field1342 && (var2.field3092[var36] & var2.field3114) == var2.field3107) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class186 var37 = var2.field3098;
                                                if (!class66.method413(var6, var3, var4, var37.field3454)) {
                                                    var37.field3440.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var37.field3453 - class213.field3897, var37.field3455 - class58.field975, var37.field3456 - class191.field3537, var37.field3439);
                                                }
                                                var2.field3114 = 0;
                                            }
                                        }
                                        if (!var2.field3090) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field3096;
                                            var2.field3090 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class78 var41 = var2.field3103[var40];
                                                if (class33.field520 != var41.field1342) {
                                                    for (int var42 = var41.field1353; var42 <= var41.field1358; var42++) {
                                                        for (int var43 = var41.field1362; var43 <= var41.field1360; var43++) {
                                                            class169 var44 = var7[var42][var43];
                                                            if (var44.field3101) {
                                                                var2.field3090 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field3114 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field1353) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field1358) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field1362) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field1360) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field3114) == var2.field3089) {
                                                                    var2.field3090 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class70.field1165[var39++] = var41;
                                                    int var46 = class155.field2841 - var41.field1353;
                                                    int var47 = var41.field1358 - class155.field2841;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class2.field29 - var41.field1362;
                                                    int var49 = var41.field1360 - class2.field29;
                                                    if (var49 > var48) {
                                                        var41.field1349 = var46 + var49;
                                                    } else {
                                                        var41.field1349 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class78 var53 = class70.field1165[var52];
                                                    if (class33.field520 != var53.field1342) {
                                                        if (var53.field1349 > var50) {
                                                            var50 = var53.field1349;
                                                            var51 = var52;
                                                        } else if (var53.field1349 == var50) {
                                                            int var54 = var53.field1338 - class213.field3897;
                                                            int var55 = var53.field1350 - class191.field3537;
                                                            int var56 = class70.field1165[var51].field1338 - class213.field3897;
                                                            int var57 = class70.field1165[var51].field1350 - class191.field3537;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class78 var58 = class70.field1165[var51];
                                                var58.field1342 = class33.field520;
                                                if (!class60.method394(var6, var58.field1353, var58.field1358, var58.field1362, var58.field1360, var58.field1363.method55())) {
                                                    var58.field1363.method52(var58.field1341, class203.field3723, class40.field655, class100.field1885, class33.field524, var58.field1338 - class213.field3897, var58.field1352 - class58.field975, var58.field1350 - class191.field3537, var58.field1355);
                                                }
                                                for (int var59 = var58.field1353; var59 <= var58.field1358; var59++) {
                                                    for (int var60 = var58.field1362; var60 <= var58.field1360; var60++) {
                                                        class169 var61 = var7[var59][var60];
                                                        if (var61.field3114 != 0) {
                                                            class112.field2156.method120(0, var61);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field3113) {
                                                            class112.field2156.method120(0, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field3090) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field3090 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field3113);
                            } while (var2.field3114 != 0);
                            if (var3 > class155.field2841 || var3 <= class191.field3557) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field3113);
                        if (var3 < class155.field2841 || var3 >= class54.field918 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field3113);
                    if (var4 > class2.field29 || var4 <= class243.field4421) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field3113);
                if (var4 < class2.field29 || var4 >= class111.field2106 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field3113);
            var2.field3113 = false;
            class161.field2925--;
            class26 var66 = var2.field3105;
            if (var66 != null && var66.field426 != 0) {
                if (var66.field412 != null) {
                    var66.field412.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var66.field416 - class213.field3897, var66.field429 - class58.field975 - var66.field426, var66.field421 - class191.field3537, var66.field414);
                }
                if (var66.field423 != null) {
                    var66.field423.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var66.field416 - class213.field3897, var66.field429 - class58.field975 - var66.field426, var66.field421 - class191.field3537, var66.field414);
                }
                if (var66.field411 != null) {
                    var66.field411.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var66.field416 - class213.field3897, var66.field429 - class58.field975 - var66.field426, var66.field421 - class191.field3537, var66.field414);
                }
            }
            if (var2.field3106 != 0) {
                class220 var67 = var2.field3099;
                if (var67 != null && !class235.method1491(var6, var3, var4, var67.field4023.method55())) {
                    if ((var67.field4017 & var2.field3106) != 0) {
                        var67.field4023.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var67.field4009 + var67.field4010 - class213.field3897, var67.field4006 - class58.field975, var67.field4011 + var67.field4018 - class191.field3537, var67.field4022);
                    } else if (var67.field4017 == 256) {
                        int var68 = var67.field4009 - class213.field3897;
                        int var69 = var67.field4006 - class58.field975;
                        int var70 = var67.field4011 - class191.field3537;
                        int var71 = var67.field4004;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field4023.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var67.field4010 + var68, var69, var67.field4018 + var70, var67.field4022);
                        } else if (var67.field4019 != null) {
                            var67.field4019.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var68, var69, var70, var67.field4022);
                        }
                    }
                }
                class186 var74 = var2.field3098;
                if (var74 != null) {
                    if ((var74.field3444 & var2.field3106) != 0 && !class66.method413(var6, var3, var4, var74.field3444)) {
                        var74.field3449.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var74.field3453 - class213.field3897, var74.field3455 - class58.field975, var74.field3456 - class191.field3537, var74.field3439);
                    }
                    if ((var74.field3454 & var2.field3106) != 0 && !class66.method413(var6, var3, var4, var74.field3454)) {
                        var74.field3440.method52(0, class203.field3723, class40.field655, class100.field1885, class33.field524, var74.field3453 - class213.field3897, var74.field3455 - class58.field975, var74.field3456 - class191.field3537, var74.field3439);
                    }
                }
            }
            if (var5 < class231.field4167 - 1) {
                class169 var75 = class101.field1900[var5 + 1][var3][var4];
                if (var75 != null && var75.field3113) {
                    class112.field2156.method120(0, var75);
                }
            }
            if (var3 < class155.field2841) {
                class169 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field3113) {
                    class112.field2156.method120(0, var76);
                }
            }
            if (var4 < class2.field29) {
                class169 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field3113) {
                    class112.field2156.method120(0, var77);
                }
            }
            if (var3 > class155.field2841) {
                class169 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field3113) {
                    class112.field2156.method120(0, var78);
                }
            }
            if (var4 > class2.field29) {
                class169 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field3113) {
                    class112.field2156.method120(0, var79);
                }
            }
        }
    }
}
