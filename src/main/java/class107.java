import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class107 extends class390 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Laq;")
    public class90 field1478 = new class90();

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1480 = 0;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lbj;")
    public static class131 field1482 = new class131(64);

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static final void method757(int arg0) {
        field1484++;
        if (class135.field1970 > 1) {
            class274.field3822 = class367.field5186;
            class135.field1970--;
        }
        if (class74.field1061 > 0) {
            class74.field1061--;
        }
        if (class399.field5700) {
            class399.field5700 = false;
            class311.method2003(-1266);
            return;
        }
        if (!class271.field3762) {
            class318.method2059((byte) -108);
        }
        if (arg0 >= -111) {
            return;
        }
        for (int var1 = 0; var1 < 100 && class396.method2504((byte) 27); var1++) {
        }
        if (class446.field6250 != 30) {
            return;
        }
        class389.method2464(3, (byte) 72, class46.field648);
        if (class212.field2958 != null || class450.field6302 < (class385.method2442(-6631) - 2000L)) {
            boolean var2 = false;
            int var3 = class46.field648.field191;
            for (class307 var4 = (class307) class261.field3657.method646(48); var4 != null && class46.field648.field191 - var3 < 240; var4 = (class307) class261.field3657.method641(false)) {
                var4.method2467((byte) -65);
                int var5 = var4.method383(6);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method384(3);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method383(6) == -1 && var4.method384(3) == -1) {
                    var7 = true;
                    var5 = -1;
                    var6 = -1;
                }
                if (class268.field3725 != var6 || class305.field4207 != var5) {
                    if (!var2) {
                        class417.field5929++;
                        class46.field648.method1178(63, 224);
                        class46.field648.method173(0, 255);
                        var3 = class46.field648.field191;
                        var2 = true;
                    }
                    int var8 = var6 - class268.field3725;
                    class268.field3725 = var6;
                    int var9 = var5 - class305.field4207;
                    class305.field4207 = var5;
                    int var10 = (int) ((var4.method385((byte) 124) - class450.field6302) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class46.field648.method191((var8 << 6) + (var10 << 12) + var9, -126);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var8 += 128;
                        class46.field648.method173(var10 + 128, 255);
                        var9 += 128;
                        class46.field648.method191((var8 << 8) + var9, -112);
                    } else if (var10 >= 32) {
                        class46.field648.method191(var10 + 57344, -97);
                        if (var7) {
                            class46.field648.method155(15489, Integer.MIN_VALUE);
                        } else {
                            class46.field648.method155(15489, var5 << 16 | var6);
                        }
                    } else {
                        class46.field648.method173(var10 + 192, 255);
                        if (var7) {
                            class46.field648.method155(15489, Integer.MIN_VALUE);
                        } else {
                            class46.field648.method155(15489, var5 << 16 | var6);
                        }
                    }
                    class450.field6302 = var4.method385((byte) 106);
                }
            }
            if (var2) {
                class46.field648.method170((byte) -9, class46.field648.field191 - var3);
            }
        }
        if (class212.field2958 != null) {
            long var11 = (class212.field2958.method385((byte) 110) - class158.field2223) / 50L;
            class158.field2223 = class212.field2958.method385((byte) 116);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = class212.field2958.method383(6);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class212.field2958.method384(3);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class212.field2958.method388(122) == 2) {
                var15 = 1;
            }
            class46.field648.method1178(63, 124);
            class428.field6069++;
            int var16 = (int) var11;
            class46.field648.method198(var14 | var13 << 16, -84);
            class46.field648.method157(120, var16 | var15 << 15);
        }
        if (class240.field3416 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class240.field3416; var18++) {
                if (class17.field303[var18].method542(false)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                if (var17 > 75) {
                    var17 = 75;
                }
                class46.field648.method1178(63, 120);
                class163.field2256++;
                class46.field648.method173(var17 * 3, 255);
                for (int var19 = 0; var19 < class240.field3416; var19++) {
                    class73 var20 = class17.field303[var19];
                    if (var20.method542(false)) {
                        long var21 = (var20.method545(200) - class314.field4299) / 50L;
                        class314.field4299 = var20.method545(200);
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class46.field648.method173(var20.method548((byte) 105), 255);
                        class46.field648.method191((int) var21, -87);
                    }
                }
            }
        }
        if (class105.field1438 > 0) {
            class105.field1438--;
        }
        if (class128.field1806 && class105.field1438 <= 0) {
            class105.field1438 = 20;
            class128.field1806 = false;
            class362.field5022++;
            class46.field648.method1178(63, 148);
            class46.field648.method178((int) class333.field4599 >> 3, -68);
            class46.field648.method178((int) class24.field416 >> 3, -116);
        }
        if (class295.field4130 && !class450.field6303) {
            class450.field6303 = true;
            class198.field2744++;
            class46.field648.method1178(63, 10);
            class46.field648.method173(1, 255);
        }
        if (!class295.field4130 && class450.field6303) {
            class450.field6303 = false;
            class198.field2744++;
            class46.field648.method1178(63, 10);
            class46.field648.method173(0, 255);
        }
        if (!class328.field4537) {
            class87.field1223++;
            class46.field648.method1178(63, 44);
            class46.field648.method169(-67, class211.method1389(false));
            class328.field4537 = true;
        }
        if (class328.field4549 != null) {
            if (class128.field1807 == 2) {
                class293.method1895(66);
            } else if (class128.field1807 == 3) {
                class288.method1874((byte) -44);
            }
        }
        if (class123.field1707) {
            class123.field1707 = false;
        } else {
            class305.field4209 /= 2.0F;
        }
        if (class41.field603) {
            class41.field603 = false;
        } else {
            class51.field721 /= 2.0F;
        }
        class117.method812((byte) -38);
        if (class446.field6250 != 30) {
            return;
        }
        class415.method2599((byte) 120);
        class184.method1204(74);
        class325.method2088(-3925);
        class263.field3677++;
        if (class263.field3677 > 750) {
            class311.method2003(-1266);
            return;
        }
        class39.method363(126);
        class121.method825((byte) -110);
        class211.method1387(-117);
        for (int var23 = class306.method1972(true, -24767); var23 != -1; var23 = class306.method1972(false, -24767)) {
            class280.method1831(var23, 25212);
            class133.field1917[class387.method2454(31, class156.field2206++)] = var23;
        }
        for (class239 var24 = class396.method2506(false); var24 != null; var24 = class396.method2506(false)) {
            int var25 = var24.method1629(255);
            int var26 = var24.method1626((byte) -111);
            if (var25 == 1) {
                class389.field5580[var26] = var24.field3399;
                class290.field4075 |= class15.field291[var26];
                class178.field2449[class387.method2454(class296.field4151++, 31)] = var26;
            } else if (var25 == 2) {
                class35.field545[var26] = var24.field3404;
                class386.field5537[class387.method2454(class56.field767++, 31)] = var26;
            } else if (var25 == 3) {
                class453 var48 = class442.method2767(var26, -1229996208);
                if (!var24.field3404.equals(var48.field6397)) {
                    var48.field6397 = var24.field3404;
                    class404.method2531(26878, var48);
                }
            } else if (var25 == 4) {
                class453 var44 = class442.method2767(var26, -1229996208);
                int var45 = var24.field3399;
                int var46 = var24.field3397;
                int var47 = var24.field3408;
                if (var44.field6445 != var45 || var44.field6323 != var46 || var44.field6332 != var47) {
                    var44.field6332 = var47;
                    var44.field6323 = var46;
                    var44.field6445 = var45;
                    class404.method2531(26878, var44);
                }
            } else if (var25 == 5) {
                class453 var43 = class442.method2767(var26, -1229996208);
                if (var24.field3399 != var43.field6371 || var24.field3399 == -1) {
                    var43.field6371 = var24.field3399;
                    var43.field6427 = 1;
                    var43.field6421 = 0;
                    var43.field6399 = 0;
                    class404.method2531(26878, var43);
                }
            } else if (var25 == 6) {
                int var37 = var24.field3399;
                int var38 = var37 >> 10 & 0x1F;
                int var39 = (var37 & 0x3E5) >> 5;
                int var40 = var37 & 0x1F;
                int var41 = (var38 << 19) + (var40 << 3) + (var39 << 11);
                class453 var42 = class442.method2767(var26, -1229996208);
                if (var42.field6320 != var41) {
                    var42.field6320 = var41;
                    class404.method2531(26878, var42);
                }
            } else if (var25 == 7) {
                class453 var35 = class442.method2767(var26, -1229996208);
                boolean var36 = var24.field3399 == 1;
                if (var35.field6409 != var36) {
                    var35.field6409 = var36;
                    class404.method2531(26878, var35);
                }
            } else if (var25 == 8) {
                class453 var27 = class442.method2767(var26, -1229996208);
                if (var24.field3399 != var27.field6465 || var24.field3397 != var27.field6456 || var24.field3408 != var27.field6375) {
                    var27.field6465 = var24.field3399;
                    var27.field6375 = var24.field3408;
                    var27.field6456 = var24.field3397;
                    if (var27.field6452 != -1) {
                        if (var27.field6405 > 0) {
                            var27.field6375 = var27.field6375 * 32 / var27.field6405;
                        } else if (var27.field6350 > 0) {
                            var27.field6375 = var27.field6375 * 32 / var27.field6350;
                        }
                    }
                    class404.method2531(26878, var27);
                }
            } else if (var25 == 9) {
                class453 var28 = class442.method2767(var26, -1229996208);
                if (var24.field3399 != var28.field6452 || var24.field3397 != var28.field6396) {
                    var28.field6396 = var24.field3397;
                    var28.field6452 = var24.field3399;
                    class404.method2531(26878, var28);
                }
            } else if (var25 == 10) {
                class453 var29 = class442.method2767(var26, -1229996208);
                if (var24.field3399 != var29.field6380 || var24.field3397 != var29.field6469 || var24.field3408 != var29.field6354) {
                    var29.field6380 = var24.field3399;
                    var29.field6469 = var24.field3397;
                    var29.field6354 = var24.field3408;
                    class404.method2531(26878, var29);
                }
            } else if (var25 == 11) {
                class453 var30 = class442.method2767(var26, -1229996208);
                var30.field6418 = var30.field6457 = var24.field3397;
                var30.field6413 = 0;
                var30.field6363 = var30.field6393 = var24.field3399;
                var30.field6358 = 0;
                class404.method2531(26878, var30);
            } else if (var25 == 12) {
                class453 var33 = class442.method2767(var26, -1229996208);
                int var34 = var24.field3399;
                if (var33 != null && var33.field6356 == 0) {
                    if (var34 > (var33.field6377 - var33.field6447)) {
                        var34 = var33.field6377 - var33.field6447;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field6344 != var34) {
                        var33.field6344 = var34;
                        class404.method2531(26878, var33);
                    }
                }
            } else if (var25 == 14) {
                class453 var32 = class442.method2767(var26, -1229996208);
                var32.field6348 = var24.field3399;
            } else if (var25 == 15) {
                class251.field3547 = var24.field3397;
                class376.field5371 = true;
                class50.field697 = var24.field3399;
            } else if (var25 == 16) {
                class453 var31 = class442.method2767(var26, -1229996208);
                var31.field6460 = var24.field3399;
            }
        }
        if (class418.field5940 != 0) {
            class393.field5633 += 20;
            if (class393.field5633 >= 400) {
                class418.field5940 = 0;
            }
        }
        class349.field4797++;
        if (class386.field5538 != null) {
            class414.field5882++;
            if (class414.field5882 >= 15) {
                class404.method2531(26878, class386.field5538);
                class386.field5538 = null;
            }
        }
        class280.field3921 = false;
        class437.field6152 = null;
        class292.field4095 = false;
        class1.field9 = null;
        class316.method2049(-1, false, (class453) null, -1);
        class396.method2505(true, -1, -1, (class453) null);
        class207.method1347(-25449);
        class367.field5186++;
        if (class425.field5995) {
            class233.field3352++;
            class46.field648.method1178(63, 227);
            class46.field648.method195(2, class24.field410 | class312.field4263 << 14 | class403.field5722 << 28);
            class425.field5995 = false;
        }
        while (true) {
            class7 var49;
            class453 var50;
            class453 var51;
            do {
                var49 = (class7) class98.field1354.method633(-106);
                if (var49 == null) {
                    while (true) {
                        class7 var52;
                        class453 var53;
                        class453 var54;
                        do {
                            var52 = (class7) class427.field6016.method633(-128);
                            if (var52 == null) {
                                while (true) {
                                    class7 var55;
                                    class453 var56;
                                    class453 var57;
                                    do {
                                        var55 = (class7) class139.field1981.method633(-78);
                                        if (var55 == null) {
                                            if (class437.field6152 == null) {
                                                class395.field5654 = 0;
                                            }
                                            if (class432.field6109 != null) {
                                                class362.method2328(-119);
                                            }
                                            if (class105.field1435 > 0 && class203.field2790.method1872(82, 4463) && class203.field2790.method1872(81, 4463) && class204.field2796 != 0) {
                                                int var58 = class142.field2034 - class204.field2796;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class54.method447(class412.field5841.field5326[0] + class212.field2968, (byte) 48, var58, class412.field5841.field5332[0] + class447.field6269);
                                            }
                                            class417.method2619(82);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class66.field987[var59]++;
                                            }
                                            if (class290.field4075 && class92.field1288 < (class385.method2442(-6631) - 60000L)) {
                                                class2.method9(-25817);
                                            }
                                            class54.field749++;
                                            if (class54.field749 > 500) {
                                                class54.field749 = 0;
                                                int var60 = (int) (Math.random() * 8.0D);
                                                if ((var60 & 0x2) == 2) {
                                                    class28.field477 += class50.field700;
                                                }
                                                if ((var60 & 0x1) == 1) {
                                                    class310.field4253 += class381.field5448;
                                                }
                                                if ((var60 & 0x4) == 4) {
                                                    class310.field4252 += class376.field5372;
                                                }
                                            }
                                            if (class310.field4253 < -50) {
                                                class381.field5448 = 2;
                                            }
                                            if (class310.field4253 > 50) {
                                                class381.field5448 = -2;
                                            }
                                            if (class28.field477 < -55) {
                                                class50.field700 = 2;
                                            }
                                            if (class28.field477 > 55) {
                                                class50.field700 = -2;
                                            }
                                            if (class310.field4252 < -40) {
                                                class376.field5372 = 1;
                                            }
                                            if (class310.field4252 > 40) {
                                                class376.field5372 = -1;
                                            }
                                            class446.field6247++;
                                            if (class446.field6247 > 500) {
                                                class446.field6247 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x2) == 2) {
                                                    class374.field5308 += class282.field3986;
                                                }
                                                if ((var61 & 0x1) == 1) {
                                                    class126.field1778 += class241.field3429;
                                                }
                                            }
                                            if (class126.field1778 < -60) {
                                                class241.field3429 = 2;
                                            }
                                            if (class126.field1778 > 60) {
                                                class241.field3429 = -2;
                                            }
                                            if (class374.field5308 < -20) {
                                                class282.field3986 = 1;
                                            }
                                            if (class374.field5308 > 10) {
                                                class282.field3986 = -1;
                                            }
                                            class263.field3664++;
                                            if (class263.field3664 > 50) {
                                                class264.field3684++;
                                                class46.field648.method1178(63, 61);
                                            }
                                            if (class423.field5981) {
                                                class285.method1863((byte) -110);
                                                class423.field5981 = false;
                                            }
                                            try {
                                                if (class156.field2207 != null && class46.field648.field191 > 0) {
                                                    class156.field2207.method2203(class46.field648.field230, 0, class46.field648.field191, -48);
                                                    class263.field3664 = 0;
                                                    class46.field648.field191 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var62) {
                                                class311.method2003(-1266);
                                                return;
                                            }
                                        }
                                        var56 = var55.field95;
                                        if (var56.field6406 < 0) {
                                            break;
                                        }
                                        var57 = class442.method2767(var56.field6470, -1229996208);
                                    } while (var57 == null || var57.field6382 == null || var56.field6406 >= var57.field6382.length || var57.field6382[var56.field6406] != var56);
                                    class177.method1168(var55);
                                }
                            }
                            var53 = var52.field95;
                            if (var53.field6406 < 0) {
                                break;
                            }
                            var54 = class442.method2767(var53.field6470, -1229996208);
                        } while (var54 == null || var54.field6382 == null || var53.field6406 >= var54.field6382.length || var54.field6382[var53.field6406] != var53);
                        class177.method1168(var52);
                    }
                }
                var50 = var49.field95;
                if (var50.field6406 < 0) {
                    break;
                }
                var51 = class442.method2767(var50.field6470, -1229996208);
            } while (var51 == null || var51.field6382 == null || var50.field6406 >= var51.field6382.length || var51.field6382[var50.field6406] != var50);
            class177.method1168(var49);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILoo;III)V")
    public static final void method758(int arg0, class374 arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            return;
        }
        field1483++;
        class428 var5 = arg1.method2388(58);
        int var6 = arg1.field5301 - arg1.field5269.field1207 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg1.field5298 > 25) {
                if (arg3 < 0 && var5.field6067 != -1) {
                    arg1.field5297 = var5.field6067;
                } else if (arg3 <= 0 || var5.field6049 == -1) {
                    arg1.field5297 = var5.field6066;
                } else {
                    arg1.field5297 = var5.field6049;
                }
                arg1.field5280 = false;
            } else if (!arg1.field5280 || !var5.method2707(arg1.field5297, (byte) 109)) {
                arg1.field5297 = var5.method2698(-84);
                arg1.field5280 = arg1.field5297 != -1;
            }
        } else if (arg1.field5275 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class367.field5188[arg0] - arg1.field5269.field1207 & 0x3FFF;
            arg1.field5280 = false;
            if (arg2 == 2 && var5.field6061 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6031 != -1) {
                    arg1.field5297 = var5.field6031;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6047 != -1) {
                    arg1.field5297 = var5.field6047;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6046 == -1) {
                    arg1.field5297 = var5.field6061;
                } else {
                    arg1.field5297 = var5.field6046;
                }
            } else if (arg2 == 0 && var5.field6065 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6070 != -1) {
                    arg1.field5297 = var5.field6070;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6040 != -1) {
                    arg1.field5297 = var5.field6040;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6025 == -1) {
                    arg1.field5297 = var5.field6065;
                } else {
                    arg1.field5297 = var5.field6025;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6054 != -1) {
                arg1.field5297 = var5.field6054;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6024 != -1) {
                arg1.field5297 = var5.field6024;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6064 == -1) {
                arg1.field5297 = var5.field6066;
            } else {
                arg1.field5297 = var5.field6064;
            }
        } else if (var6 == 0 && arg1.field5298 <= 25) {
            if (arg2 == 2 && var5.field6061 != -1) {
                arg1.field5297 = var5.field6061;
            } else if (arg2 == 0 && var5.field6065 != -1) {
                arg1.field5297 = var5.field6065;
            } else {
                arg1.field5297 = var5.field6066;
            }
            arg1.field5280 = false;
        } else {
            if (arg2 == 2 && var5.field6061 != -1) {
                if (arg3 < 0 && var5.field6026 != -1) {
                    arg1.field5297 = var5.field6026;
                } else if (arg3 <= 0 || var5.field6033 == -1) {
                    arg1.field5297 = var5.field6061;
                } else {
                    arg1.field5297 = var5.field6033;
                }
            } else if (arg2 == 0 && var5.field6065 != -1) {
                if (arg3 < 0 && var5.field6053 != -1) {
                    arg1.field5297 = var5.field6053;
                } else if (arg3 <= 0 || var5.field6039 == -1) {
                    arg1.field5297 = var5.field6065;
                } else {
                    arg1.field5297 = var5.field6039;
                }
            } else if (arg3 < 0 && var5.field6021 != -1) {
                arg1.field5297 = var5.field6021;
            } else if (arg3 <= 0 || var5.field6018 == -1) {
                arg1.field5297 = var5.field6066;
            } else {
                arg1.field5297 = var5.field6018;
            }
            arg1.field5280 = false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Laj;B)V")
    public static final void method759(class170 arg0, byte arg1) {
        arg0.field2332 = null;
        field1479++;
        if (arg1 != 80) {
            method758(-64, (class374) null, -53, 59, 94);
        }
        int var2 = arg0.field2333.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field2333[var3].field1193 = false;
        }
        class149[] var4 = class432.field6100;
        synchronized (class432.field6100) {
            if (var2 < class432.field6100.length && class16.field297[var2] < 200) {
                class432.field6100[var2].method1009(arg0, false);
                int var10002 = class16.field297[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static void method760(int arg0) {
        field1482 = null;
        if (arg0 != 1) {
            method760(119);
        }
    }

    static {
        new class442("Select", "Auswählen", "Sélectionner", "Selecionar");
    }
}
