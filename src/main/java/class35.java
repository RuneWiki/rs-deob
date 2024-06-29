import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class35 extends class44 {

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field407 = "flash3:";

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Z")
    public static boolean field412 = false;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "F")
    public static float field414;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field410;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLnh;Lnh;)V")
    public static final void method215(boolean arg0, class288 arg1, class288 arg2) {
        field408++;
        if (arg2.field4482 != null) {
            arg2.method1935(117);
        }
        arg2.field4482 = arg1.field4482;
        arg2.field4487 = arg1;
        arg2.field4482.field4487 = arg2;
        arg2.field4487.field4482 = arg2;
        if (arg0) {
            method219((byte) -27, false);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)Z")
    public static final boolean method216(int arg0) {
        field406++;
        return class296.field4676 == arg0 ? class296.field4684.method964(-1) : true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLlc;)V")
    public static final void method217(byte arg0, class290 arg1) {
        field411++;
        if (arg1.field4505 == 0 || arg0 != 17) {
            return;
        }
        class285 var2 = arg1.method1949(-1);
        if (arg1.field4575 != -1 && arg1.field4575 < 32768) {
            class54 var3 = class20.field244[arg1.field4575];
            if (var3 != null) {
                int var4 = arg1.field4563 - var3.field4563;
                int var5 = arg1.field4553 - var3.field4553;
                if (var4 != 0 || var5 != 0) {
                    arg1.field4534 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field4575 >= 32768) {
            int var6 = arg1.field4575 - 32768;
            if (class33.field385 == var6) {
                var6 = 2047;
            }
            class240 var7 = class253.field3656[var6];
            if (var7 != null) {
                int var8 = arg1.field4563 - var7.field4563;
                int var9 = arg1.field4553 - var7.field4553;
                if (var8 != 0 || var9 != 0) {
                    arg1.field4534 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field4510 != 0 || arg1.field4558 != 0) && (arg1.field4603 == 0 || arg1.field4523 > 0)) {
            int var10 = arg1.field4553 - ((arg1.field4558 - class166.field2383 - class166.field2383) * 64);
            int var11 = arg1.field4563 - ((arg1.field4510 - class110.field1473 - class110.field1473) * 64);
            if (var11 != 0 || var10 != 0) {
                arg1.field4534 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field4558 = 0;
            arg1.field4510 = 0;
        }
        int var12 = arg1.field4534 - arg1.field4512 & 0x7FF;
        if (var12 == 0) {
            arg1.field4586 = 0;
            arg1.field4513 = 0;
        } else if (var2.field4379 == 0) {
            arg1.field4513++;
            if (var12 > 1024) {
                boolean var13 = true;
                arg1.field4512 -= arg1.field4505;
                if (var12 < arg1.field4505 || var12 > 2048 - arg1.field4505) {
                    var13 = false;
                    arg1.field4512 = arg1.field4534;
                }
                if (arg1.field4513 > 25 || var13) {
                    arg1.field4579 = var2.field4402;
                    if (arg1.field4603 > 0) {
                        if (arg1.field4547[arg1.field4603 - 1] == 2) {
                            if (var2.field4368 != -1) {
                                arg1.field4579 = var2.field4368;
                            } else if (var2.field4403 != -1) {
                                arg1.field4579 = var2.field4403;
                            }
                        } else if (arg1.field4547[arg1.field4603 - 1] == 0) {
                            if (var2.field4372 != -1) {
                                arg1.field4579 = var2.field4372;
                            } else if (var2.field4385 != -1) {
                                arg1.field4579 = var2.field4385;
                            }
                        } else if (var2.field4367 != -1) {
                            arg1.field4579 = var2.field4367;
                        }
                    } else if (var2.field4398 != -1) {
                        arg1.field4579 = var2.field4398;
                    }
                }
            } else {
                arg1.field4512 += arg1.field4505;
                boolean var14 = true;
                if (arg1.field4505 > var12 || var12 > (2048 - arg1.field4505)) {
                    var14 = false;
                    arg1.field4512 = arg1.field4534;
                }
                if (arg1.field4513 > 25 || var14) {
                    arg1.field4579 = var2.field4402;
                    if (arg1.field4603 > 0) {
                        if (arg1.field4547[arg1.field4603 - 1] == 2) {
                            if (var2.field4391 != -1) {
                                arg1.field4579 = var2.field4391;
                            } else if (var2.field4403 != -1) {
                                arg1.field4579 = var2.field4403;
                            }
                        } else if (arg1.field4547[arg1.field4603 - 1] == 0) {
                            if (var2.field4401 != -1) {
                                arg1.field4579 = var2.field4401;
                            } else if (var2.field4385 != -1) {
                                arg1.field4579 = var2.field4385;
                            }
                        } else if (var2.field4380 != -1) {
                            arg1.field4579 = var2.field4380;
                        }
                    } else if (var2.field4408 != -1) {
                        arg1.field4579 = var2.field4408;
                    }
                }
            }
            arg1.field4512 &= 0x7FF;
            return;
        } else {
            arg1.field4579 = -1;
            int var15 = arg1.field4534 << 5;
            if (arg1.field4544 != var15) {
                arg1.field4544 = var15;
                arg1.field4576 = 0;
                int var16 = arg1.field4586 * arg1.field4586 / (var2.field4379 * 2);
                int var17 = var15 - arg1.field4550 & 0xFFFF;
                if (arg1.field4586 > 0 && var17 >= var16 && var17 - var16 < 32768) {
                    arg1.field4545 = var17 / 2;
                    int var18 = var2.field4389 * var2.field4389 / (var2.field4379 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    arg1.field4509 = true;
                    if (arg1.field4545 > var18) {
                        arg1.field4545 = var17 - var18;
                    }
                } else if (arg1.field4586 < 0 && 65536 - var17 >= var16 && (65536 - var16 - var17) < 32768) {
                    arg1.field4509 = true;
                    arg1.field4545 = (65536 - var17) / 2;
                    int var19 = var2.field4389 * var2.field4389 / (var2.field4379 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field4545) {
                        arg1.field4545 = 65536 - var17 - var19;
                    }
                } else {
                    arg1.field4509 = false;
                }
            }
            if (arg1.field4586 == 0) {
                int var20 = arg1.field4544 - arg1.field4550 & 0xFFFF;
                if (var20 < var2.field4379) {
                    arg1.field4550 = arg1.field4544;
                } else {
                    arg1.field4576 = 0;
                    arg1.field4509 = true;
                    int var21 = var2.field4389 * var2.field4389 / (var2.field4379 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg1.field4545 = var20 / 2;
                        arg1.field4586 = var2.field4379;
                        if (arg1.field4545 > var21) {
                            arg1.field4545 = var20 - var21;
                        }
                    } else {
                        arg1.field4545 = (65536 - var20) / 2;
                        if (var21 < arg1.field4545) {
                            arg1.field4545 = 65536 - var20 - var21;
                        }
                        arg1.field4586 = -var2.field4379;
                    }
                }
            } else if (arg1.field4586 <= 0) {
                if (arg1.field4545 <= arg1.field4576) {
                    arg1.field4509 = false;
                }
                if (!arg1.field4509) {
                    arg1.field4586 += var2.field4379;
                    if (arg1.field4586 > 0) {
                        arg1.field4586 = 0;
                    }
                } else if ((-var2.field4389) < arg1.field4586) {
                    arg1.field4586 -= var2.field4379;
                }
            } else {
                if (arg1.field4545 <= arg1.field4576) {
                    arg1.field4509 = false;
                }
                if (!arg1.field4509) {
                    arg1.field4586 -= var2.field4379;
                    if (arg1.field4586 < 0) {
                        arg1.field4586 = 0;
                    }
                } else if (arg1.field4586 < var2.field4389) {
                    arg1.field4586 += var2.field4379;
                }
            }
            if (arg1.field4586 <= 0) {
                arg1.field4576 -= arg1.field4586;
            } else {
                arg1.field4576 += arg1.field4586;
            }
            arg1.field4550 += arg1.field4586;
            arg1.field4550 &= 0xFFFF;
            arg1.field4512 = arg1.field4550 >> 5;
            if (arg1.field4586 >= 0) {
                if (arg1.field4603 > 0) {
                    if (arg1.field4547[arg1.field4603 - 1] == 2) {
                        if (var2.field4391 != -1) {
                            arg1.field4579 = var2.field4391;
                        } else if (var2.field4403 != -1) {
                            arg1.field4579 = var2.field4403;
                        }
                    } else if (arg1.field4547[arg1.field4603 - 1] == 0) {
                        if (var2.field4401 != -1) {
                            arg1.field4579 = var2.field4401;
                        } else if (var2.field4385 != -1) {
                            arg1.field4579 = var2.field4385;
                        }
                    }
                }
                if (arg1.field4579 == -1) {
                    if (var2.field4380 != -1) {
                        arg1.field4579 = var2.field4380;
                    } else if (var2.field4408 != -1) {
                        arg1.field4579 = var2.field4408;
                    }
                }
            } else {
                if (arg1.field4603 > 0) {
                    if (arg1.field4547[arg1.field4603 - 1] == 2) {
                        if (var2.field4368 != -1) {
                            arg1.field4579 = var2.field4368;
                        } else if (var2.field4403 != -1) {
                            arg1.field4579 = var2.field4403;
                        }
                    } else if (arg1.field4547[arg1.field4603 - 1] == 0) {
                        if (var2.field4372 != -1) {
                            arg1.field4579 = var2.field4372;
                        } else if (var2.field4385 != -1) {
                            arg1.field4579 = var2.field4385;
                        }
                    }
                }
                if (arg1.field4579 == -1) {
                    if (var2.field4367 != -1) {
                        arg1.field4579 = var2.field4367;
                    } else if (var2.field4398 != -1) {
                        arg1.field4579 = var2.field4398;
                    }
                }
            }
            if (arg1.field4579 == -1) {
                arg1.field4579 = var2.field4402;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III[Lwe;IIIIII)V")
    public static final void method218(int arg0, int arg1, int arg2, class82[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class155.method1022(arg0, arg7, arg8, arg5);
        class297.method1985();
        if (arg6 <= 104) {
            method217((byte) -103, (class290) null);
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class82 var11 = arg3[var10];
            if (var11 != null && (var11.field1101 == arg4 || arg4 == -1412584499 && class131.field1886 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class182.field2618[class216.field3044] = var11.field1000 + arg1;
                    class247.field3595[class216.field3044] = var11.field1096 + arg2;
                    class124.field1788[class216.field3044] = var11.field1131;
                    class21.field259[class216.field3044] = var11.field1048;
                    var12 = class216.field3044++;
                } else {
                    var12 = arg9;
                }
                var11.field1072 = var12;
                var11.field1009 = class198.field2819;
                if (!var11.field1126 || !client.method1918(var11)) {
                    if (var11.field1136 > 0) {
                        class100.method612(var11, (byte) -94);
                    }
                    int var13 = var11.field1000 + arg1;
                    int var14 = var11.field1096 + arg2;
                    int var15 = var11.field1044;
                    if (class296.field4679 && (client.method1920(var11).field2525 != 0 || var11.field1026 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class131.field1886 == var11) {
                        if (arg4 != -1412584499 && !var11.field1056) {
                            class255.field3684 = arg3;
                            class100.field1369 = arg2;
                            class4.field58 = arg1;
                            continue;
                        }
                        if (class152.field2205 && class87.field1181) {
                            int var16 = class104.field1417;
                            int var17 = class37.field431;
                            int var18 = var17 - class129.field1859;
                            if (var18 < class249.field3618) {
                                var18 = class249.field3618;
                            }
                            if (var18 + var11.field1048 > class249.field3618 - -class219.field3093.field1048) {
                                var18 = class219.field3093.field1048 + class249.field3618 - var11.field1048;
                            }
                            int var19 = var16 - class213.field2984;
                            var14 = var18;
                            if (class247.field3602 > var19) {
                                var19 = class247.field3602;
                            }
                            if ((var11.field1131 + var19) > (class247.field3602 + class219.field3093.field1131)) {
                                var19 = class247.field3602 + class219.field3093.field1131 - var11.field1131;
                            }
                            var13 = var19;
                        }
                        if (!var11.field1056) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field1026 == 2) {
                        var24 = arg5;
                        var21 = arg7;
                        var20 = arg0;
                        var25 = arg8;
                    } else {
                        var20 = var13 > arg0 ? var13 : arg0;
                        var21 = var14 <= arg7 ? arg7 : var14;
                        int var22 = var13 + var11.field1131;
                        int var23 = var14 + var11.field1048;
                        if (var11.field1026 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = var23 < arg5 ? var23 : arg5;
                        var25 = var22 >= arg8 ? arg8 : var22;
                    }
                    if (!var11.field1126 || var20 < var25 && var24 > var21) {
                        if (var11.field1136 != 0) {
                            if (var11.field1136 == 1337 || var11.field1136 == 1403) {
                                class173.field2476 = var11;
                                class161.field2319 = var14;
                                class211.field2962 = var13;
                                class121.method789(var13, var11.field1131, var14, var11.field1048, var11.field1136 == 1403, (byte) 97);
                                class129.field1862[var12] = true;
                                class155.method1022(arg0, arg7, arg8, arg5);
                                continue;
                            }
                            if (var11.field1136 == 1338) {
                                if (!var11.method496(0)) {
                                    continue;
                                }
                                class122.method800(var12, var11, var14, var13, (byte) -105);
                                class155.method1022(arg0, arg7, arg8, arg5);
                                if (class230.field3306 != 0 && class230.field3306 != 3 || class177.field2518 || class17.field215 < var20 || class72.field866 < var21 || var25 <= class17.field215 || var24 <= class72.field866) {
                                    continue;
                                }
                                int var26 = class72.field866 - var14;
                                int var27 = var11.field977[var26];
                                int var28 = class17.field215 - var13;
                                if (var27 > var28 || (var11.field1017[var26] + var27) < var28) {
                                    continue;
                                }
                                int var29 = var28 - var11.field1131 / 2;
                                int var30 = var26 - var11.field1048 / 2;
                                int var31 = (int) class274.field4085 + class139.field2016 & 0x7FF;
                                int var32 = class297.field4698[var31];
                                int var33 = class297.field4697[var31];
                                int var34 = (class15.field187 + 256) * var32 >> 8;
                                int var35 = (class15.field187 + 256) * var33 >> 8;
                                int var36 = var30 * var34 - var29 * var35 >> 11;
                                int var37 = var29 * var34 + var30 * var35 >> 11;
                                int var38 = class177.field2507.field4563 + var37 - ((class177.field2507.method1556(3888) + -1) * 64) >> 7;
                                int var39 = class177.field2507.field4553 - var36 - (class177.field2507.method1556(3888) + -1) * 64 >> 7;
                                if (class267.field3857 && (class282.field4263 & 0x40) != 0) {
                                    class82 var40 = class112.method694(class276.field4192, false, class287.field4469);
                                    if (var40 == null) {
                                        class54.method328(false);
                                    } else {
                                        class176.method1143(4, var38, (short) 10, var39, class268.field3916, " ->", class133.field1945, 1L);
                                    }
                                    continue;
                                }
                                if (class5.field67 == 1) {
                                    class176.method1143(4, var38, (short) 19, var39, -1, "", class241.field3504, 1L);
                                }
                                class176.method1143(4, var38, (short) 24, var39, -1, "", class230.field3305, 1L);
                                continue;
                            }
                            if (var11.field1136 == 1339) {
                                if (var11.method496(0)) {
                                    class40.method248(var13, var11, var12, var14, 56);
                                    class155.method1022(arg0, arg7, arg8, arg5);
                                }
                                continue;
                            }
                            if (var11.field1136 == 1400) {
                                class161.method1067(var11.field1048, var11.field1131, var14, var13, (byte) -86);
                                class129.field1862[var12] = true;
                                class163.field2341[var12] = true;
                                class155.method1022(arg0, arg7, arg8, arg5);
                                continue;
                            }
                            if (var11.field1136 == 1401) {
                                class51.method307(var14, var11.field1131, (byte) -78, var13, var11.field1048);
                                class129.field1862[var12] = true;
                                class163.field2341[var12] = true;
                                class155.method1022(arg0, arg7, arg8, arg5);
                                continue;
                            }
                            if (var11.field1136 == 1402) {
                                class255.method1633(var13, 55, var14);
                                class129.field1862[var12] = true;
                                class163.field2341[var12] = true;
                                continue;
                            }
                            if (var11.field1136 == 1405) {
                                if (!class156.field2254) {
                                    continue;
                                }
                                int var41 = var11.field1131 + var13;
                                int var42 = var14 + 15;
                                class204.field2904.method536("Fps:" + class266.field3833, var41, var42, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var131 = var42 + 15;
                                int var44 = 16776960;
                                int var45 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var46 = 0;
                                int var47 = 0;
                                if (var45 > 65536) {
                                    var44 = 16711680;
                                }
                                int var48 = 0;
                                class204.field2904.method536("Mem:" + var45 + "k", var41, var131, var44, -1);
                                int var49 = 16776960;
                                for (int var50 = 0; var50 < 29; var50++) {
                                    var46 += class33.field386[var50].method1877((byte) 108);
                                    var47 += class33.field386[var50].method1883(51);
                                    var48 += class33.field386[var50].method1879((byte) 70);
                                }
                                var42 = var131 + 15;
                                int var51 = var47 * 10000 / var46;
                                int var52 = var48 * 100 / var46;
                                String var53 = "Cache:" + class188.method1239(true, 2, (long) var51, -3570, 0) + "% (" + var52 + "%)";
                                class11.field141.method536(var53, var41, var42, var49, -1);
                                var42 += 12;
                                class129.field1862[var12] = true;
                                class163.field2341[var12] = true;
                                continue;
                            }
                            if (var11.field1136 == 1406) {
                                class167.field2408 = var13;
                                class223.field3151 = var11;
                                class97.field1296 = var14;
                                continue;
                            }
                        }
                        if (!class177.field2518) {
                            if (var11.field1026 == 0 && var11.field1121 && var20 <= class17.field215 && class72.field866 >= var21 && class17.field215 < var25 && class72.field866 < var24 && !class296.field4679) {
                                class112.field1496 = 1;
                                class153.field2217[0] = class247.field3597;
                                class240.field3482[0] = "";
                                class190.field2749[0] = 1002;
                                class209.field2944[0] = class241.field3500;
                            }
                            if (class17.field215 >= var20 && var21 <= class72.field866 && var25 > class17.field215 && var24 > class72.field866) {
                                class142.method919(class72.field866 - var14, 5681, var11, class17.field215 - var13);
                            }
                        }
                        if (var11.field1026 == 0) {
                            if (!var11.field1126 && client.method1918(var11) && class246.field3580 != var11) {
                                continue;
                            }
                            if (!var11.field1126) {
                                if (var11.field1018 > (var11.field1079 - var11.field1048)) {
                                    var11.field1018 = var11.field1079 - var11.field1048;
                                }
                                if (var11.field1018 < 0) {
                                    var11.field1018 = 0;
                                }
                            }
                            method218(var20, var13 - var11.field1125, -var11.field1018 + var14, arg3, var11.field1025, var24, 109, var21, var25, var12);
                            if (var11.field1034 != null) {
                                method218(var20, var13 - var11.field1125, var14 - var11.field1018, var11.field1034, var11.field1025, var24, 123, var21, var25, var12);
                            }
                            class166 var54 = (class166) class189.field2705.method1895((long) var11.field1025, -121);
                            if (var54 != null) {
                                if (var54.field2381 == 0 && !class177.field2518 && class17.field215 >= var20 && var21 <= class72.field866 && var25 > class17.field215 && class72.field866 < var24 && !class296.field4679) {
                                    class209.field2944[0] = class241.field3500;
                                    class112.field1496 = 1;
                                    class190.field2749[0] = 1002;
                                    class153.field2217[0] = class247.field3597;
                                    class240.field3482[0] = "";
                                }
                                class39.method246(var21, var14, var24, -116, var13, var12, var54.field2395, var20, var25);
                            }
                            class155.method1022(arg0, arg7, arg8, arg5);
                            class297.method1985();
                        }
                        if (class59.field705[var12] || class21.field253 > 1) {
                            if (var11.field1026 == 0 && !var11.field1126 && var11.field1079 > var11.field1048) {
                                class149.method981(var11.field1018, var11.field1048, var11.field1131 + var13, (byte) -57, var11.field1079, var14);
                            }
                            if (var11.field1026 != 1) {
                                if (var11.field1026 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field1060; var56++) {
                                        for (int var57 = 0; var57 < var11.field997; var57++) {
                                            int var58 = (var11.field1035 + 32) * var57 + var13;
                                            int var59 = (var11.field1011 + 32) * var56 + var14;
                                            if (var55 < 20) {
                                                var58 += var11.field993[var55];
                                                var59 += var11.field991[var55];
                                            }
                                            if (var11.field1080[var55] > 0) {
                                                boolean var60 = false;
                                                int var61 = var11.field1080[var55] - 1;
                                                boolean var62 = false;
                                                if (arg0 < var58 + 32 && arg8 > var58 && arg7 < var59 + 32 && arg5 > var59 || class209.field2948 == var11 && class287.field4474 == var55) {
                                                    class130 var63;
                                                    if (class196.field2790 == 1 && class270.field3947 == var55 && class130.field1885 == var11.field1025) {
                                                        var63 = class97.method583(var61, (byte) -113, 0, var11.field1054, var11.field1066[var55], (class134) null, 2);
                                                    } else {
                                                        var63 = class97.method583(var61, (byte) -126, 3153952, var11.field1054, var11.field1066[var55], (class134) null, 1);
                                                    }
                                                    if (class297.field4702) {
                                                        class129.field1862[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class255.method1632(16711680, var11);
                                                    } else if (class209.field2948 == var11 && class287.field4474 == var55) {
                                                        int var64 = class37.field431 - class40.field476;
                                                        int var65 = class104.field1417 - class173.field2482;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (class205.field2910 < 5) {
                                                            var64 = 0;
                                                            var65 = 0;
                                                        }
                                                        var63.method852(var58 + var65, var59 + var64, 128);
                                                        if (arg4 != -1) {
                                                            class82 var66 = arg3[arg4 & 0xFFFF];
                                                            int var67 = class155.field2240;
                                                            int var68 = class155.field2241;
                                                            if (var67 > (var59 + var64) && var66.field1018 > 0) {
                                                                int var69 = (var67 - var64 - var59) * class123.field1771 / 3;
                                                                if (var69 > (class123.field1771 * 10)) {
                                                                    var69 = class123.field1771 * 10;
                                                                }
                                                                if (var66.field1018 < var69) {
                                                                    var69 = var66.field1018;
                                                                }
                                                                class40.field476 += var69;
                                                                var66.field1018 -= var69;
                                                                class255.method1632(16711680, var66);
                                                            }
                                                            if (var68 < (var59 + var64 + 32) && var66.field1079 - var66.field1048 > var66.field1018) {
                                                                int var70 = (var59 + var64 + 32 - var68) * class123.field1771 / 3;
                                                                if ((class123.field1771 * 10) < var70) {
                                                                    var70 = class123.field1771 * 10;
                                                                }
                                                                if (var66.field1079 - var66.field1018 - var66.field1048 < var70) {
                                                                    var70 = var66.field1079 - var66.field1018 - var66.field1048;
                                                                }
                                                                class40.field476 -= var70;
                                                                var66.field1018 += var70;
                                                                class255.method1632(16711680, var66);
                                                            }
                                                        }
                                                    } else if (class202.field2863 == var11 && class4.field60 == var55) {
                                                        var63.method852(var58, var59, 128);
                                                    } else {
                                                        var63.method848(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field984 != null && var55 < 20) {
                                                class130 var71 = var11.method483(var55, (byte) -5);
                                                if (var71 != null) {
                                                    var71.method848(var58, var59);
                                                } else if (class156.field2253) {
                                                    class255.method1632(16711680, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field1026 == 3) {
                                    int var72;
                                    if (class61.method377(var11, 32767)) {
                                        var72 = var11.field967;
                                        if (class246.field3580 == var11 && var11.field980 != 0) {
                                            var72 = var11.field980;
                                        }
                                    } else {
                                        var72 = var11.field1134;
                                        if (class246.field3580 == var11 && var11.field1138 != 0) {
                                            var72 = var11.field1138;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1108) {
                                            class155.method1018(var13, var14, var11.field1131, var11.field1048, var72);
                                        } else {
                                            class155.method1020(var13, var14, var11.field1131, var11.field1048, var72);
                                        }
                                    } else if (var11.field1108) {
                                        class155.method1030(var13, var14, var11.field1131, var11.field1048, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class155.method1037(var13, var14, var11.field1131, var11.field1048, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1026 == 4) {
                                    class89 var73 = var11.method488((byte) 106, class36.field420);
                                    if (var73 != null) {
                                        String var74 = var11.field1123;
                                        int var75;
                                        if (class61.method377(var11, 32767)) {
                                            var75 = var11.field967;
                                            if (class246.field3580 == var11 && var11.field980 != 0) {
                                                var75 = var11.field980;
                                            }
                                            if (var11.field1103.length() > 0) {
                                                var74 = var11.field1103;
                                            }
                                        } else {
                                            var75 = var11.field1134;
                                            if (class246.field3580 == var11 && var11.field1138 != 0) {
                                                var75 = var11.field1138;
                                            }
                                        }
                                        if (var11.field1126 && var11.field1024 != -1) {
                                            class229 var76 = class36.method224(var11.field1024, 110);
                                            var74 = var76.field3235;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field3263 == 1 || var11.field987 != 1) && var11.field987 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class134.method875(true, var11.field987);
                                            }
                                        }
                                        if (class165.field2365 == var11) {
                                            var74 = class206.field2929;
                                            var75 = var11.field1134;
                                        }
                                        if (!var11.field1126) {
                                            var74 = class51.method310(var74, var11, 23500);
                                        }
                                        var73.method526(var74, var13, var14, var11.field1131, var11.field1048, var75, var11.field1001 ? 0 : -1, var11.field1091, var11.field1065, var11.field1093);
                                    } else if (class156.field2253) {
                                        class255.method1632(16711680, var11);
                                    }
                                } else if (var11.field1026 == 5) {
                                    if (!var11.field1126) {
                                        class130 var86 = var11.method485(-1, class61.method377(var11, 32767));
                                        if (var86 != null) {
                                            var86.method848(var13, var14);
                                        } else if (class156.field2253) {
                                            class255.method1632(16711680, var11);
                                        }
                                    } else if (var11.field1071 >= 0) {
                                        class13 var85 = var11.method492((byte) 126);
                                        var85.method81(0, var13, var14, var11.field1131, var11.field1048, var11.field1023, var11.field1028, 0);
                                    } else {
                                        class130 var77;
                                        if (var11.field1024 == -1) {
                                            var77 = var11.method485(-1, false);
                                        } else if (var11.field1055 && class177.field2507.field3468 != null) {
                                            var77 = class97.method583(var11.field1024, (byte) -119, var11.field1012, var11.field1054, var11.field987, class177.field2507.field3468, var11.field1047);
                                        } else {
                                            var77 = class97.method583(var11.field1024, (byte) -73, var11.field1012, var11.field1054, var11.field987, (class134) null, var11.field1047);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field1881;
                                            int var79 = var77.field1870;
                                            if (var11.field1106) {
                                                int var80 = (-(-var78 - var11.field1131) - 1) / var78;
                                                int var81 = (var79 - (1 - var11.field1048)) / var79;
                                                class155.method1019(var13, var14, var11.field1131 + var13, var11.field1048 + var14);
                                                for (int var82 = 0; var82 < var80; var82++) {
                                                    for (int var83 = 0; var83 < var81; var83++) {
                                                        if (var11.field1014 != 0) {
                                                            var77.method849(4096, var78 / 2 + var78 * var82 + var13, var79 * var83 + var14 - -(var79 / 2), 8645, var11.field1014);
                                                        } else if (var15 == 0) {
                                                            var77.method848(var78 * var82 + var13, var14 - -(var79 * var83));
                                                        } else {
                                                            var77.method852(var78 * var82 + var13, var79 * var83 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class155.method1022(arg0, arg7, arg8, arg5);
                                            } else {
                                                int var84 = var11.field1131 * 4096 / var78;
                                                if (var11.field1014 != 0) {
                                                    var77.method849(var84, var11.field1131 / 2 + var13, var11.field1048 / 2 + var14, 8645, var11.field1014);
                                                } else if (var15 != 0) {
                                                    var77.method850(var13, var14, var11.field1131, var11.field1048, 256 - (var15 & 0xFF));
                                                } else if (var11.field1131 == var78 && var11.field1048 == var79) {
                                                    var77.method848(var13, var14);
                                                } else {
                                                    var77.method853(var13, var14, var11.field1131, var11.field1048);
                                                }
                                            }
                                        } else if (class156.field2253) {
                                            class255.method1632(16711680, var11);
                                        }
                                    }
                                } else if (var11.field1026 == 6) {
                                    boolean var87 = class61.method377(var11, 32767);
                                    int var88;
                                    if (var87) {
                                        var88 = var11.field966;
                                    } else {
                                        var88 = var11.field969;
                                    }
                                    int var89 = 0;
                                    class106 var90 = null;
                                    if (var11.field1024 != -1) {
                                        class229 var91 = class36.method224(var11.field1024, 70);
                                        if (var91 != null) {
                                            class229 var92 = var91.method1500((byte) -125, var11.field987);
                                            class274 var93 = var88 == -1 ? null : class27.method165(var88, (byte) -117);
                                            if (var11.field1055 && class177.field2507.field3468 != null) {
                                                var90 = var92.method1489(var11.field1092, class177.field2507.field3468, 1, var93, var11.field1043, var11.field1088, -2);
                                            } else {
                                                var90 = var92.method1489(var11.field1092, (class134) null, 1, var93, var11.field1043, var11.field1088, -2);
                                            }
                                            if (var90 == null) {
                                                class255.method1632(16711680, var11);
                                            } else {
                                                var89 = -var90.method227() / 2;
                                            }
                                        }
                                    } else if (var11.field1098 == 5) {
                                        if (var11.field974 == -1) {
                                            var90 = class181.field2567.method877(0, -1, -1, -1, (byte) 88, (class214[]) null, -1, 0, (class274) null, true, (class274) null);
                                        } else {
                                            int var94 = var11.field974 & 0x7FF;
                                            if (class33.field385 == var94) {
                                                var94 = 2047;
                                            }
                                            class240 var95 = class253.field3656[var94];
                                            class274 var96 = var88 == -1 ? null : class27.method165(var88, (byte) -123);
                                            if (var95 != null && ((int) class60.method370((byte) -8, var95.field3466) << 11) == (var11.field974 & 0xFFFFF800)) {
                                                var90 = var95.field3468.method877(0, -1, 0, var11.field1088, (byte) 85, (class214[]) null, -1, 0, var96, true, (class274) null);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var90 = var11.method494(var87, -1, class177.field2507.field3468, (class274) null, 0, 20, -1);
                                        if (var90 == null && class156.field2253) {
                                            class255.method1632(16711680, var11);
                                        }
                                    } else {
                                        class274 var97 = class27.method165(var88, (byte) -109);
                                        var90 = var11.method494(var87, var11.field1092, class177.field2507.field3468, var97, var11.field1043, 6, var11.field1088);
                                        if (var90 == null && class156.field2253) {
                                            class255.method1632(16711680, var11);
                                        }
                                    }
                                    if (var90 != null) {
                                        int var98;
                                        if (var11.field983 > 0) {
                                            var98 = (var11.field1131 << 8) / var11.field983;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99 = (var11.field999 * var98 >> 8) + var11.field1131 / 2 + var13;
                                        int var100;
                                        if (var11.field1094 <= 0) {
                                            var100 = 256;
                                        } else {
                                            var100 = (var11.field1048 << 8) / var11.field1094;
                                        }
                                        int var101 = (var11.field1032 * var100 >> 8) + var14 + (var11.field1048 / 2);
                                        class297.method1980(var99, var101);
                                        int var102 = class297.field4698[var11.field964] * var11.field1133 >> 16;
                                        int var103 = class297.field4697[var11.field964] * var11.field1133 >> 16;
                                        if (!var11.field1126) {
                                            var90.method650(0, var11.field1141, 0, var11.field964, 0, var103, var102, -1L);
                                        } else if (var11.field1083) {
                                            ((class275) var90).method1768(0, var11.field1141, var11.field1085, var11.field964, var11.field1086, var11.field1046 + var103 + var89, var11.field1046 + var102, var11.field1133);
                                        } else {
                                            var90.method650(0, var11.field1141, var11.field1085, var11.field964, var11.field1086, var89 + var103 + var11.field1046, var11.field1046 + var102, -1L);
                                        }
                                        class297.method1994();
                                    }
                                } else {
                                    if (var11.field1026 == 7) {
                                        class89 var104 = var11.method488((byte) 106, class36.field420);
                                        if (var104 == null) {
                                            if (class156.field2253) {
                                                class255.method1632(16711680, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field1060; var106++) {
                                            for (int var107 = 0; var107 < var11.field997; var107++) {
                                                if (var11.field1080[var105] > 0) {
                                                    class229 var108 = class36.method224(var11.field1080[var105] - 1, 31);
                                                    String var109;
                                                    if (var108.field3263 != 1 && var11.field1066[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field3235 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field3235 + "</col> x" + class134.method875(true, var11.field1066[var105]);
                                                    }
                                                    int var110 = (var11.field1011 + 12) * var106 + var14;
                                                    int var111 = (var11.field1035 + 115) * var107 + var13;
                                                    if (var11.field1091 == 0) {
                                                        var104.method537(var109, var111, var110, var11.field1134, var11.field1001 ? 0 : -1);
                                                    } else if (var11.field1091 == 1) {
                                                        var104.method528(var109, var111 + 57, var110, var11.field1134, var11.field1001 ? 0 : -1);
                                                    } else {
                                                        var104.method536(var109, var111 + 115 - 1, var110, var11.field1134, var11.field1001 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field1026 == 8 && class26.field311 == var11 && class280.field4252 == class154.field2233) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class89 var114 = class204.field2904;
                                        String var115 = var11.field1123;
                                        String var116 = class51.method310(var115, var11, 23500);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var114.method539(var125);
                                            var113 += var114.field1221 + 1;
                                            if (var112 < var126) {
                                                var112 = var126;
                                            }
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var117 = var14 - (-var11.field1048 - 5);
                                        if ((var113 + var117) > arg5) {
                                            var117 = arg5 - var113;
                                        }
                                        int var118 = var11.field1131 + var13 - var112 - 5;
                                        if ((var13 + 5) > var118) {
                                            var118 = var13 + 5;
                                        }
                                        if ((var112 + var118) > arg8) {
                                            var118 = arg8 - var112;
                                        }
                                        class155.method1018(var118, var117, var112, var113, 16777120);
                                        class155.method1020(var118, var117, var112, var113, 0);
                                        int var119 = var114.field1221 + var117 + 2;
                                        String var120 = var11.field1123;
                                        String var121 = class51.method310(var120, var11, 23500);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var114.method537(var123, var118 + 3, var119, 0, -1);
                                            var119 += var114.field1221 + 1;
                                        }
                                    }
                                    if (var11.field1026 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field1004) {
                                            var127 = var14 + var11.field1048;
                                            var128 = var11.field1131 + var13;
                                            var129 = var13;
                                            var130 = var14;
                                        } else {
                                            var127 = var14;
                                            var130 = var11.field1048 + var14;
                                            var129 = var13;
                                            var128 = var11.field1131 + var13;
                                        }
                                        if (var11.field1067 == 1) {
                                            class155.method1032(var129, var127, var128, var130, var11.field1134);
                                        } else {
                                            class155.method1023(var129, var127, var128, var130, var11.field1134, var11.field1067);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field405++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BZ)V")
    public static final void method219(byte arg0, boolean arg1) {
        int var2 = -19 % ((arg0 + 4) / 49);
        if (arg1) {
            if (class123.field1776 != -1) {
                class188.method1235(-9708, class123.field1776);
            }
            for (class166 var3 = (class166) class189.field2705.method1890((byte) 94); var3 != null; var3 = (class166) class189.field2705.method1889(false)) {
                class252.method1619(true, -108, var3);
            }
            class123.field1776 = -1;
            class189.field2705 = new class284(8);
            class251.method1613((byte) 117);
            class123.field1776 = class22.field275;
            class268.method1717((byte) 8, false);
            class116.method746(0);
            class71.method436((byte) -108, class123.field1776);
        }
        class241.field3500 = -1;
        field402++;
        class51.method306((byte) 101, class41.field504);
        class177.field2507 = new class240();
        class177.field2507.field4553 = 3000;
        class177.field2507.field4563 = 3000;
        if (class5.field67 == 0) {
            class168.method1101((byte) 97, class120.field1705);
            class17.method105(10, (byte) -119);
            return;
        }
        if (class4.field61 == 2) {
            class204.field2902 = class293.field4637 << 7;
            class245.field3560 = class133.field1929 << 7;
        } else {
            class246.method1589(-2);
        }
        class130.method857(8);
        class17.method105(28, (byte) 98);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
    public static void method220(int arg0) {
        if (arg0 != 2047) {
            field407 = null;
        }
        field407 = null;
        field410 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIZI)V")
    public static final void method221(boolean arg0, int arg1, boolean arg2, int arg3) {
        field403++;
        int var10002;
        for (int var4 = arg3; var4 < class294.field4642; var4++) {
            class54 var21 = class20.field244[class14.field176[var4]];
            if (var21 != null && var21.method325(124) && var21.field636.method1712((byte) -94)) {
                int var22 = var21.method1556(arg3 + 3888);
                if (arg2) {
                    if (!var21.field636.field3874) {
                        continue;
                    }
                } else if (var21.field636.field3894 != arg0 || arg1 != 0 && arg1 != var22) {
                    continue;
                }
                if (var22 == 1) {
                    if ((var21.field4563 & 0x7F) == 64 && (var21.field4553 & 0x7F) == 64) {
                        int var23 = var21.field4563 >> 7;
                        int var24 = var21.field4553 >> 7;
                        if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                            var10002 = class134.field1946[var23][var24]++;
                        }
                    }
                } else if (((var22 & 0x1) != 0 || (var21.field4563 & 0x7F) == 0 && (var21.field4553 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field4563 & 0x7F) == 64 && (var21.field4553 & 0x7F) == 64)) {
                    int var25 = var21.field4563 - (var22 * 64) >> 7;
                    int var26 = var21.field4553 - var22 * 64 >> 7;
                    int var27 = var21.method1556(3888) + var25;
                    if (var27 > 104) {
                        var27 = 104;
                    }
                    int var28 = var21.method1556(3888) + var26;
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                    if (var28 > 104) {
                        var28 = 104;
                    }
                    for (int var29 = var25; var29 < var27; var29++) {
                        for (int var30 = var26; var30 < var28; var30++) {
                            var10002 = class134.field1946[var29][var30]++;
                        }
                    }
                }
            }
        }
        label206: for (int var5 = 0; var5 < class294.field4642; var5++) {
            long var6 = (long) class14.field176[var5] << 32 | 0x20000000L;
            class54 var8 = class20.field244[class14.field176[var5]];
            if (var8 != null && var8.method325(115) && var8.field636.method1712((byte) -94)) {
                int var9 = var8.method1556(3888);
                if (arg2) {
                    if (!var8.field636.field3874) {
                        continue;
                    }
                } else if (arg0 != var8.field636.field3894 || arg1 != 0 && arg1 != var9) {
                    continue;
                }
                var8.field4524 = true;
                if (var9 == 1) {
                    if ((var8.field4563 & 0x7F) == 64 && (var8.field4553 & 0x7F) == 64) {
                        int var19 = var8.field4563 >> 7;
                        int var20 = var8.field4553 >> 7;
                        if (var19 < 0 || var19 >= 104 || var20 < 0 || var20 >= 104) {
                            continue;
                        }
                        if (class134.field1946[var19][var20] > 1) {
                            var10002 = class134.field1946[var19][var20]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var8.field4563 & 0x7F) == 0 && (var8.field4553 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var8.field4563 & 0x7F) == 64 && (var8.field4553 & 0x7F) == 64) {
                    int var10 = var8.field4563 - var9 * 64 >> 7;
                    int var11 = var9 + var10;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var12 = var8.field4553 - (var9 * 64) >> 7;
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    int var13 = var12 + var9;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    boolean var14 = true;
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    for (int var15 = var10; var15 < var11; var15++) {
                        for (int var18 = var12; var18 < var13; var18++) {
                            if (class134.field1946[var15][var18] <= 1) {
                                var14 = false;
                                break;
                            }
                        }
                    }
                    if (var14) {
                        int var16 = var10;
                        while (true) {
                            if (var11 <= var16) {
                                continue label206;
                            }
                            for (int var17 = var12; var17 < var13; var17++) {
                                var10002 = class134.field1946[var16][var17]--;
                            }
                            var16++;
                        }
                    }
                }
                if (!var8.field636.field3846) {
                    var6 |= Long.MIN_VALUE;
                }
                var8.field4524 = false;
                var8.field4527 = class4.method21(var8.field4553, class199.field2833, var8.field4563, (byte) 26);
                class274.method1763(class199.field2833, var8.field4563, var8.field4553, var8.field4527, (var9 - 1) * 64 + 60, var8, var8.field4512, var6, var8.field4593);
            }
        }
    }
}
