import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class66 implements Runnable {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lo;")
    public volatile class208[] field1196 = new class208[2];

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Z")
    public volatile boolean field1200 = false;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
    public volatile boolean field1202 = false;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Lub;")
    public static class227 field1197 = class257.method1749("www", 17263);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lub;")
    public static class227 field1201 = class257.method1749(":assistreq:", 17263);

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lth;")
    public class239 field1198;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method413(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class87.field1508++;
        if (!arg5) {
            class115.method729(false, true);
            class64.method404(true, (byte) 6);
            class115.method729(false, false);
        }
        if (arg2 != 1327286247) {
            return;
        }
        field1195++;
        class64.method404(false, (byte) 6);
        if (!arg5) {
            class223.method1410(72);
        }
        class92.method543(-78);
        if (client.field1447 == 1) {
            int var6 = class24.field409;
            if (class59.field1093 / 256 > var6) {
                var6 = class59.field1093 / 256;
            }
            int var7 = class47.field852 + class29.field476 & 0x7FF;
            if (class11.field222[4] && class120.field2190[4] + 128 > var6) {
                var6 = class120.field2190[4] + 128;
            }
            class125.method776(class251.field4349, class193.method1227(class216.field3639.field50, true, class64.field1171, class216.field3639.field99) - 50, var6, var7, arg3, class54.field936, 120, (var6 * 3) + 600);
        }
        int var8 = class184.field3135;
        int var9 = class25.field422;
        int var10 = class103.field1812;
        int var11 = class161.field2724;
        int var12 = class88.field1527;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class11.field222[var13]) {
                int var38 = (int) ((double) (class197.field3380[var13] * 2 + 1) * Math.random() + Math.sin((double) class258.field4512[var13] / 100.0D * (double) class89.field1544[var13]) * (double) class120.field2190[var13] - (double) class197.field3380[var13]);
                if (var13 == 2) {
                    class88.field1527 += var38;
                }
                if (var13 == 0) {
                    class184.field3135 += var38;
                }
                if (var13 == 1) {
                    class25.field422 += var38;
                }
                if (var13 == 3) {
                    class161.field2724 = class161.field2724 + var38 & 0x7FF;
                }
                if (var13 == 4) {
                    class103.field1812 += var38;
                    if (class103.field1812 < 128) {
                        class103.field1812 = 128;
                    }
                    if (class103.field1812 > 383) {
                        class103.field1812 = 383;
                    }
                }
            }
        }
        int var14 = 3;
        if (!class95.field1645 && !class151.field2635) {
            var14 = class64.field1171;
        }
        if (class34.method178(true) && class95.field1645 && !class151.field2635) {
            if (class130.field2280 == null) {
                class130.field2280 = new byte[4][104][104];
            }
            byte var15 = (byte) (class87.field1508 - 4 & 0xFF);
            int var16 = class87.field1508 % 104;
            for (int var17 = 0; var17 < 4; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class130.field2280[var17][var16][var18] = var15;
                }
            }
        }
        boolean var19 = false;
        if (class34.method178(true) && class95.field1645 && !class151.field2635 && class64.field1171 != 3) {
            for (int var20 = 0; var20 < 2; var20++) {
                class190.field3227[var20] = -1000000;
                class87.field1511[var20] = 1000000;
                class211.field3571[var20] = 0;
                class33.field534[var20] = 1000000;
                class144.field2485[var20] = 0;
            }
            if (client.field1447 == 1) {
                if ((class40.field654[class64.field1171][class216.field3639.field50 >> 7][class216.field3639.field99 >> 7] & 0x4) != 0) {
                    var19 = true;
                    class34.method181(false, class216.field3639.field99 >> 7, class261.field4539, 0, class216.field3639.field50 >> 7);
                }
                if (class103.field1812 < 310) {
                    int var22 = class184.field3135 >> 7;
                    int var23 = class88.field1527 >> 7;
                    int var24 = class216.field3639.field50 >> 7;
                    int var25 = class216.field3639.field99 >> 7;
                    int var26;
                    if (var24 <= var22) {
                        var26 = var22 - var24;
                    } else {
                        var26 = var24 - var22;
                    }
                    int var27;
                    if (var23 >= var25) {
                        var27 = var23 - var25;
                    } else {
                        var27 = var25 - var23;
                    }
                    if (var27 < var26) {
                        int var28 = 32768;
                        int var29 = var27 * 65536 / var26;
                        while (var22 != var24) {
                            if (var22 < var24) {
                                var22++;
                            } else if (var24 < var22) {
                                var22--;
                            }
                            if ((class40.field654[class64.field1171][var22][var23] & 0x4) != 0) {
                                var19 = true;
                                class34.method181(false, var23, class261.field4539, 1, var22);
                                break;
                            }
                            var28 += var29;
                            if (var28 >= 65536) {
                                if (var23 < var25) {
                                    var23++;
                                } else if (var23 > var25) {
                                    var23--;
                                }
                                var28 -= 65536;
                                if ((class40.field654[class64.field1171][var22][var23] & 0x4) != 0) {
                                    var19 = true;
                                    class34.method181(false, var23, class261.field4539, 1, var22);
                                    break;
                                }
                            }
                        }
                    } else {
                        int var30 = 32768;
                        int var31 = var26 * 65536 / var27;
                        while (var23 != var25) {
                            if (var23 < var25) {
                                var23++;
                            } else if (var23 > var25) {
                                var23--;
                            }
                            if ((class40.field654[class64.field1171][var22][var23] & 0x4) != 0) {
                                var19 = true;
                                class34.method181(false, var23, class261.field4539, 1, var22);
                                break;
                            }
                            var30 += var31;
                            if (var30 >= 65536) {
                                if (var24 > var22) {
                                    var22++;
                                } else if (var24 < var22) {
                                    var22--;
                                }
                                var30 -= 65536;
                                if ((class40.field654[class64.field1171][var22][var23] & 0x4) != 0) {
                                    class34.method181(false, var23, class261.field4539, 1, var22);
                                    var19 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                int var21 = class193.method1227(class184.field3135, true, class64.field1171, class88.field1527);
                if (var21 - class25.field422 < 800 && (class40.field654[class64.field1171][class184.field3135 >> 7][class88.field1527 >> 7] & 0x4) != 0) {
                    var19 = true;
                    class34.method181(false, class88.field1527 >> 7, class261.field4539, 1, class184.field3135 >> 7);
                }
            }
        }
        class111.method704(arg1, arg4, arg0 + arg1, arg3 + arg4);
        class62.method394();
        int var32 = client.field1451;
        int var33 = class100.field1752;
        if (arg1 <= var33 && (arg0 + arg1) > var33 && var32 >= arg4 && arg4 + arg3 > var32) {
            class161.field2713 = true;
            int var34 = class225.field3838;
            class10.field184 = 0;
            int var35 = class205.field3495;
            int var36 = class145.field2506;
            class12.field234 = (client.field1451 - arg4) * (var36 - var35) / arg3 + var35;
            int var37 = class75.field1312;
            class97.field1703 = (class100.field1752 - arg1) * (var34 - var37) / arg0 + var37;
        } else {
            class10.field184 = 0;
            class161.field2713 = false;
        }
        class114.method725((byte) -61);
        class111.method694(arg1, arg4, arg0, arg3, 0);
        if (var19) {
            class178.method1131(class184.field3135, class25.field422, class88.field1527, class103.field1812, class161.field2724, var14, class130.field2280, class190.field3227, class87.field1511, class211.field3571, class144.field2485, class33.field534, class64.field1171 + 1, (byte) class87.field1508, class216.field3639.field50 >> 7, class216.field3639.field99 >> 7);
        } else {
            class178.method1131(class184.field3135, class25.field422, class88.field1527, class103.field1812, class161.field2724, var14, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 0, (byte) 0, class216.field3639.field50 >> 7, class216.field3639.field99 >> 7);
        }
        class114.method725((byte) -89);
        class22.method107();
        class95.method585(256, 256, arg4, 5, arg1, arg0, arg3);
        class30.method155((byte) 107, arg4, arg1, arg3, 256, arg0, 256);
        ((class10) class62.field1129).method49(class85.field1481, -7710);
        class29.method149(arg3, arg1, arg4, arg0, arg2 - 1327286152);
        class88.field1527 = var12;
        class184.field3135 = var8;
        class25.field422 = var9;
        class103.field1812 = var10;
        class161.field2724 = var11;
        if (class76.field1317 && class219.method1384(true, false, -5132) == 0) {
            class76.field1317 = false;
        }
        if (class76.field1317) {
            class111.method694(arg1, arg4, arg0, arg3, 0);
            class215.method1367(false, class245.field4271, (byte) -116);
        }
        if (!arg5 && !class76.field1317 && !class81.field1409 && var33 >= arg1 && arg1 + arg0 > var33 && arg4 <= var32 && var32 < (arg4 + arg3)) {
            class52.method304(arg0, var32, arg3, 28676, arg1, arg4, var33);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method414(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class38.field627++;
        class16.field289 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class109.field2047; var12 < class156.field2677; var12++) {
            class108[][] var38 = class261.field4539[var12];
            for (int var39 = class108.field2008; var39 < class12.field236; var39++) {
                for (int var40 = class9.field170; var40 < class4.field53; var40++) {
                    class108 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field2010 <= class220.field3726 && class123.field2210[var39 + class229.field3990 - class72.field1265][var40 + class229.field3990 - class37.field619] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2030 = true;
                            var41.field2036 = true;
                            if (var41.field2012 > 0) {
                                var41.field2029 = true;
                            } else {
                                var41.field2029 = false;
                            }
                            class16.field289++;
                        } else {
                            var41.field2030 = false;
                            var41.field2036 = false;
                            var41.field2009 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2024 != null) {
                                    class50 var42 = var41.field2024;
                                    var42.field886.method264(var42.field875, false, var42.field877, var42.field877, var42.field875);
                                    if (var42.field880 != null) {
                                        var42.field880.method264(var42.field875, false, var42.field877, var42.field877, var42.field875);
                                    }
                                }
                                if (var41.field2037 != null) {
                                    class78 var43 = var41.field2037;
                                    var43.field1362.method264(var43.field1366, false, var43.field1375, var43.field1375, var43.field1366);
                                    if (var43.field1373 != null) {
                                        var43.field1373.method264(var43.field1366, false, var43.field1375, var43.field1375, var43.field1366);
                                    }
                                }
                                if (var41.field2039 != null) {
                                    class133 var44 = var41.field2039;
                                    var44.field2304.method264(var44.field2307, false, var44.field2311, var44.field2311, var44.field2307);
                                }
                                if (var41.field2021 != null) {
                                    for (int var45 = 0; var45 < var41.field2012; var45++) {
                                        class230 var46 = var41.field2021[var45];
                                        var46.field4021.method264(var46.field4025, false, var46.field4032, var46.field4020, var46.field4015);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class98.field1717 == class20.field356;
        for (int var14 = class109.field2047; var14 < class156.field2677; var14++) {
            class108[][] var27 = class261.field4539[var14];
            for (int var28 = -class229.field3990; var28 <= 0; var28++) {
                int var29 = class72.field1265 + var28;
                int var30 = class72.field1265 - var28;
                if (var29 >= class108.field2008 || var30 < class12.field236) {
                    for (int var31 = -class229.field3990; var31 <= 0; var31++) {
                        int var32 = class37.field619 + var31;
                        int var33 = class37.field619 - var31;
                        if (var29 >= class108.field2008) {
                            if (var32 >= class9.field170) {
                                class108 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2030) {
                                    class143.method904(var34, true);
                                }
                            }
                            if (var33 < class4.field53) {
                                class108 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2030) {
                                    class143.method904(var35, true);
                                }
                            }
                        }
                        if (var30 < class12.field236) {
                            if (var32 >= class9.field170) {
                                class108 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2030) {
                                    class143.method904(var36, true);
                                }
                            }
                            if (var33 < class4.field53) {
                                class108 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2030) {
                                    class143.method904(var37, true);
                                }
                            }
                        }
                        if (class16.field289 == 0) {
                            if (!var13) {
                                class215.field3630 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class109.field2047; var15 < class156.field2677; var15++) {
            class108[][] var16 = class261.field4539[var15];
            for (int var17 = -class229.field3990; var17 <= 0; var17++) {
                int var18 = class72.field1265 + var17;
                int var19 = class72.field1265 - var17;
                if (var18 >= class108.field2008 || var19 < class12.field236) {
                    for (int var20 = -class229.field3990; var20 <= 0; var20++) {
                        int var21 = class37.field619 + var20;
                        int var22 = class37.field619 - var20;
                        if (var18 >= class108.field2008) {
                            if (var21 >= class9.field170) {
                                class108 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2030) {
                                    class143.method904(var23, false);
                                }
                            }
                            if (var22 < class4.field53) {
                                class108 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2030) {
                                    class143.method904(var24, false);
                                }
                            }
                        }
                        if (var19 < class12.field236) {
                            if (var21 >= class9.field170) {
                                class108 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2030) {
                                    class143.method904(var25, false);
                                }
                            }
                            if (var22 < class4.field53) {
                                class108 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2030) {
                                    class143.method904(var26, false);
                                }
                            }
                        }
                        if (class16.field289 == 0) {
                            if (!var13) {
                                class215.field3630 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class215.field3630 = false;
    }

    @OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
    public final void run() {
        this.field1202 = true;
        try {
            while (!this.field1200) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class208 var2 = this.field1196[var1];
                    if (var2 != null) {
                        var2.method1321(true);
                    }
                }
                class171.method1088(95, 10L);
                class148.method937((Object) null, (byte) 119, this.field1198);
            }
        } catch (Exception var9) {
            class149.method949((String) null, var9, -102);
        } finally {
            Object var6 = null;
            this.field1202 = false;
        }
        field1203++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field1201 = null;
        if (arg0 > 99) {
            field1197 = null;
        }
    }
}
