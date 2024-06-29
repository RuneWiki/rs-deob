import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class50 {

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1288 = 0;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lad;")
    private static class5 field1289 = class88.method674("flash2:", 82);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lad;")
    public static class5 field1282 = field1289;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Z")
    public static boolean field1280 = false;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lad;")
    private static class5 field1290 = class88.method674("Walk here", 111);

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "Lad;")
    public static class5 field1291 = class88.method674("@whi@", 109);

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lad;")
    public static class5 field1286 = field1290;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lad;")
    public static class5 field1292 = class88.method674(" (X", -105);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILrc;[Ljava/lang/Object;II)V", line = 21)
    public static final void method428(int arg0, int arg1, class105 arg2, Object[] arg3, int arg4, int arg5) {
        field1285++;
        int var6 = 0;
        class38 var7 = class78.method610((byte) -26, (Integer) arg3[0], 76);
        int var8 = 0;
        int var9 = -1;
        boolean var10 = true;
        int[] var11 = var7.field939;
        int[] var12 = var7.field937;
        try {
            class60.field1474 = new class5[var7.field933];
            class110.field2759 = new int[var7.field949];
            int var13 = 0;
            int var14 = 0;
            if (arg4 == -4073) {
                for (int var15 = 1; var15 < arg3.length; var15++) {
                    if (arg3[var15] instanceof Integer) {
                        int var16 = (Integer) arg3[var15];
                        if (var16 == -2147483647) {
                            var16 = arg1;
                        }
                        if (var16 == -2147483646) {
                            var16 = arg0;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg2.field2568;
                        }
                        if (var16 == -2147483644) {
                            var16 = arg5;
                        }
                        class110.field2759[var14++] = var16;
                    } else if (arg3[var15] instanceof class5) {
                        class60.field1474[var13++] = (class5) arg3[var15];
                    }
                }
                while (true) {
                    int var17;
                    while (true) {
                        var9++;
                        var17 = var12[var9];
                        if (var17 >= 100) {
                            break;
                        }
                        if (var17 == 0) {
                            class49.field1279[var6++] = var11[var9];
                        } else if (var17 == 1) {
                            int var18 = var11[var9];
                            class49.field1279[var6++] = class128.field3058[var18];
                        } else if (var17 == 2) {
                            int var19 = var11[var9];
                            var6--;
                            class128.field3058[var19] = class49.field1279[var6];
                        } else if (var17 == 3) {
                            class78.field1823[var8++] = var7.field947[var9];
                        } else if (var17 == 6) {
                            var9 += var11[var9];
                        } else if (var17 == 7) {
                            var6 -= 2;
                            if (class49.field1279[var6 + 1] != class49.field1279[var6]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 8) {
                            var6 -= 2;
                            if (class49.field1279[var6 + 1] == class49.field1279[var6]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 9) {
                            var6 -= 2;
                            if (class49.field1279[var6] < class49.field1279[var6 + 1]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 10) {
                            var6 -= 2;
                            if (class49.field1279[var6] > class49.field1279[var6 + 1]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 21) {
                            if (class118.field2907 == 0) {
                                return;
                            }
                            class77 var20 = class5.field214[--class118.field2907];
                            class60.field1474 = var20.field1809;
                            var7 = var20.field1814;
                            var12 = var7.field937;
                            var9 = var20.field1808;
                            class110.field2759 = var20.field1818;
                            var11 = var7.field939;
                        } else if (var17 == 25) {
                            int var21 = var11[var9];
                            class49.field1279[var6++] = class1.method3(-105, var21);
                        } else if (var17 == 27) {
                            int var22 = var11[var9];
                            var6--;
                            class73.method582(151, var22, class49.field1279[var6]);
                        } else if (var17 == 31) {
                            var6 -= 2;
                            if (class49.field1279[var6] <= class49.field1279[var6 + 1]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 32) {
                            var6 -= 2;
                            if (class49.field1279[var6 + 1] <= class49.field1279[var6]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 33) {
                            class49.field1279[var6++] = class110.field2759[var11[var9]];
                        } else {
                            int var10001;
                            if (var17 == 34) {
                                var10001 = var11[var9];
                                var6--;
                                class110.field2759[var10001] = class49.field1279[var6];
                            } else if (var17 == 35) {
                                class78.field1823[var8++] = class60.field1474[var11[var9]];
                            } else if (var17 == 36) {
                                var10001 = var11[var9];
                                var8--;
                                class60.field1474[var10001] = class78.field1823[var8];
                            } else if (var17 == 37) {
                                int var23 = var11[var9];
                                var8 -= var23;
                                class5 var24 = class92.method707(var8, class78.field1823, true, var23);
                                class78.field1823[var8++] = var24;
                            } else if (var17 == 38) {
                                var6--;
                            } else if (var17 == 39) {
                                var8--;
                            } else if (var17 == 40) {
                                int var25 = var11[var9];
                                class38 var26 = class78.method610((byte) -118, var25, 73);
                                class5[] var27 = new class5[var26.field933];
                                int[] var28 = new int[var26.field949];
                                for (int var29 = 0; var29 < var26.field945; var29++) {
                                    var28[var29] = class49.field1279[var29 + var6 - var26.field945];
                                }
                                for (int var30 = 0; var30 < var26.field950; var30++) {
                                    var27[var30] = class78.field1823[var8 + var30 - var26.field950];
                                }
                                var8 -= var26.field950;
                                var6 -= var26.field945;
                                class77 var31 = new class77();
                                var31.field1809 = class60.field1474;
                                var31.field1818 = class110.field2759;
                                var31.field1814 = var7;
                                var31.field1808 = var9;
                                class5.field214[class118.field2907++] = var31;
                                class60.field1474 = var27;
                                var7 = var26;
                                var9 = -1;
                                class110.field2759 = var28;
                                var12 = var26.field937;
                                var11 = var26.field939;
                            } else if (var17 == 42) {
                                class49.field1279[var6++] = class5.field205[var11[var9]];
                            } else {
                                if (var17 != 43) {
                                    break;
                                }
                                var10001 = var11[var9];
                                var6--;
                                class5.field205[var10001] = class49.field1279[var6];
                            }
                        }
                    }
                    boolean var32;
                    if (var11[var9] == 1) {
                        var32 = true;
                    } else {
                        var32 = false;
                    }
                    if (var17 >= 1000) {
                        if (var17 < 1100) {
                            class105 var33 = var32 ? class108.field2726 : class96.field2290;
                            if (var17 == 1000) {
                                var6 -= 2;
                                var33.field2640 = class49.field1279[var6];
                                var33.field2537 = class49.field1279[var6 + 1];
                            } else if (var17 == 1001) {
                                var6 -= 2;
                                var33.field2636 = class49.field1279[var6];
                                var33.field2611 = class49.field1279[var6 + 1];
                            } else if (var17 == 1003) {
                                var6--;
                                var33.field2552 = class49.field1279[var6] == 1;
                            } else {
                                if (var17 != 1004) {
                                    break;
                                }
                                var6--;
                                var33.field2563 = class49.field1279[var6] == 1;
                            }
                        } else if (var17 < 1200) {
                            class105 var100 = var32 ? class108.field2726 : class96.field2290;
                            if (var17 == 1100) {
                                var6 -= 2;
                                var100.field2605 = class49.field1279[var6];
                                var100.field2547 = class49.field1279[var6 + 1];
                            } else if (var17 == 1101) {
                                var6--;
                                int var101 = class49.field1279[var6];
                                int var102 = var101 >> 10 & 0x1F;
                                int var103 = var101 >> 5 & 0x1F;
                                int var104 = var101 & 0x1F;
                                var100.field2637 = (var104 << 3) + (var102 << 19) + (var103 << 11);
                            } else if (var17 == 1102) {
                                var6--;
                                var100.field2618 = class49.field1279[var6] == 1;
                            } else if (var17 == 1103) {
                                var6--;
                                var100.field2589 = class49.field1279[var6];
                            } else if (var17 == 1104) {
                                var6--;
                            } else if (var17 == 1105) {
                                var6--;
                                var100.field2542 = class49.field1279[var6];
                            } else if (var17 == 1106) {
                                var6--;
                            } else if (var17 == 1107) {
                                var6--;
                            } else if (var17 == 1108) {
                                var100.field2587 = 1;
                                var6--;
                                var100.field2602 = class49.field1279[var6];
                            } else if (var17 == 1109) {
                                var6 -= 5;
                                var100.field2622 = class49.field1279[var6 + 2];
                                var100.field2623 = class49.field1279[var6 + 3];
                                var100.field2598 = class49.field1279[var6 + 4];
                            } else if (var17 == 1110) {
                                var6--;
                                var100.field2627 = class49.field1279[var6];
                            } else if (var17 == 1111) {
                                var6--;
                            } else if (var17 == 1112) {
                                var8--;
                                var100.field2625 = class78.field1823[var8];
                            } else if (var17 == 1113) {
                                var6--;
                                var100.field2545 = class49.field1279[var6];
                            } else if (var17 == 1114) {
                                var6 -= 3;
                                var100.field2570 = class49.field1279[var6];
                                var100.field2601 = class49.field1279[var6 + 1];
                                var100.field2586 = class49.field1279[var6 + 2];
                            } else {
                                if (var17 != 1115) {
                                    break;
                                }
                                var6--;
                                var100.field2591 = class49.field1279[var6] == 1;
                            }
                        } else if (var17 < 1300) {
                            class105 var34 = var32 ? class108.field2726 : class96.field2290;
                            if (var17 == 1200) {
                                var6 -= 2;
                                int var35 = class49.field1279[var6 + 1];
                                int var36 = class49.field1279[var6];
                                if (var36 == -1) {
                                    var34.field2587 = 0;
                                } else {
                                    class27 var37 = class3.method21((byte) 16, var36);
                                    var34.field2623 = var37.field676;
                                    var34.field2622 = var37.field683;
                                    var34.field2587 = 4;
                                    var34.field2602 = var36;
                                    var34.field2598 = var37.field681 * 100 / var35;
                                }
                            } else if (var17 == 1201) {
                                var34.field2587 = 2;
                                var6--;
                                var34.field2602 = class49.field1279[var6];
                            } else if (var17 == 1202) {
                                var34.field2587 = 3;
                                var34.field2602 = class82.field1932.field2786.method495(124);
                            } else {
                                if (var17 != 1203) {
                                    break;
                                }
                                class105 var38 = var32 ? class96.field2290 : class108.field2726;
                                var34.field2581 = var38.field2568;
                            }
                        } else if (var17 < 1400) {
                            class105 var39 = var32 ? class108.field2726 : class96.field2290;
                            if (var17 >= 1300 && var17 <= 1309 || !(var17 < 1314 || var17 > 1317)) {
                                var8--;
                                class5 var40 = class78.field1823[var8];
                                Object[] var41 = new Object[var40.method33(78) + 1];
                                for (int var42 = var41.length - 1; var42 >= 1; var42--) {
                                    if (var40.method55(var42 - 1, arg4 + 4328) == 115) {
                                        var8--;
                                        var41[var42] = class78.field1823[var8];
                                    } else {
                                        var6--;
                                        var41[var42] = Integer.valueOf(class49.field1279[var6]);
                                    }
                                }
                                var6--;
                                var41[0] = Integer.valueOf(class49.field1279[var6]);
                                if (var17 == 1302) {
                                    var39.field2553 = var41;
                                }
                                if (var17 == 1309) {
                                    var39.field2572 = var41;
                                }
                                if (var17 == 1304) {
                                    var39.field2632 = var41;
                                }
                                if (var17 == 1315) {
                                    var39.field2576 = var41;
                                }
                                if (var17 == 1317) {
                                    var39.field2551 = var41;
                                }
                                if (var17 == 1301) {
                                    var39.field2610 = var41;
                                }
                                if (var17 == 1300) {
                                    var39.field2579 = var41;
                                }
                                if (var17 == 1308) {
                                    var39.field2593 = var41;
                                }
                                if (var17 == 1303) {
                                    var39.field2592 = var41;
                                }
                                if (var17 == 1306) {
                                    var39.field2544 = var41;
                                }
                                if (var17 == 1316) {
                                    var39.field2594 = var41;
                                }
                                if (var17 == 1305) {
                                    var39.field2600 = var41;
                                }
                            } else if (var17 == 1310) {
                                var6--;
                                int var43 = class49.field1279[var6];
                                if (var43 < 0 || var43 > 9) {
                                    var43 = 0;
                                }
                                if (var39.field2543 == null || var43 >= var39.field2543.length) {
                                    class5[] var44 = new class5[var43 + 1];
                                    if (var39.field2543 != null) {
                                        for (int var45 = 0; var45 < var39.field2543.length; var45++) {
                                            var44[var45] = var39.field2543[var45];
                                        }
                                    }
                                    var39.field2543 = var44;
                                }
                                var8--;
                                var39.field2543[var43] = class78.field1823[var8];
                            } else if (var17 == 1311) {
                                var6--;
                                var39.field2581 = class49.field1279[var6];
                            } else if (var17 == 1312) {
                                var6--;
                                var39.field2626 = class49.field1279[var6] == 1;
                            } else {
                                if (var17 != 1313) {
                                    break;
                                }
                                var6--;
                            }
                        } else if (var17 < 1500) {
                            if (var17 != 1400) {
                                break;
                            }
                            var6 -= 2;
                            int var97 = class49.field1279[var6];
                            int var98 = class49.field1279[var6 + 1];
                            class105 var99 = class52.method435(var97, false);
                            if (var99.field2562 == null || var98 >= var99.field2562.length || var99.field2562[var98] == null) {
                                class49.field1279[var6++] = 0;
                            } else {
                                class49.field1279[var6++] = 1;
                                if (var32) {
                                    class108.field2726 = var99.field2562[var98];
                                } else {
                                    class96.field2290 = var99.field2562[var98];
                                }
                            }
                        } else if (var17 >= 1600) {
                            if (var17 < 1700) {
                                break;
                            }
                            if (var17 >= 2100) {
                                if (var17 >= 2200) {
                                    if (var17 < 2300 || var17 < 2400 || var17 < 2500) {
                                        break;
                                    }
                                    if (var17 >= 2600) {
                                        if (var17 >= 2700) {
                                            if (var17 < 2800 || var17 < 3100) {
                                                break;
                                            }
                                            if (var17 >= 3200) {
                                                if (var17 < 3300) {
                                                    break;
                                                }
                                                if (var17 < 3400) {
                                                    if (var17 != 3300) {
                                                        break;
                                                    }
                                                    class49.field1279[var6++] = class69.field1636;
                                                } else if (var17 >= 4100) {
                                                    if (var17 >= 4200 || var17 != 4106) {
                                                        break;
                                                    }
                                                    var6--;
                                                    int var85 = class49.field1279[var6];
                                                    class78.field1823[var8++] = class106.method864(class40.method347(arg4, -18438), var85);
                                                } else if (var17 == 4000) {
                                                    var6 -= 2;
                                                    int var56 = class49.field1279[var6];
                                                    int var57 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = var56 + var57;
                                                } else if (var17 == 4001) {
                                                    var6 -= 2;
                                                    int var58 = class49.field1279[var6];
                                                    int var59 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = var58 - var59;
                                                } else if (var17 == 4002) {
                                                    var6 -= 2;
                                                    int var60 = class49.field1279[var6];
                                                    int var61 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = var60 * var61;
                                                } else if (var17 == 4003) {
                                                    var6 -= 2;
                                                    int var62 = class49.field1279[var6];
                                                    int var63 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = var62 / var63;
                                                } else if (var17 == 4004) {
                                                    var6--;
                                                    int var64 = class49.field1279[var6];
                                                    class49.field1279[var6++] = (int) (Math.random() * (double) var64);
                                                } else if (var17 == 4005) {
                                                    var6--;
                                                    int var65 = class49.field1279[var6];
                                                    class49.field1279[var6++] = (int) (Math.random() * (double) (var65 + 1));
                                                } else if (var17 == 4006) {
                                                    var6 -= 5;
                                                    int var66 = class49.field1279[var6 + 1];
                                                    int var67 = class49.field1279[var6 + 2];
                                                    int var68 = class49.field1279[var6 + 3];
                                                    int var69 = class49.field1279[var6];
                                                    int var70 = class49.field1279[var6 + 4];
                                                    class49.field1279[var6++] = (var66 - var69) * (-var67 + var70) / (var68 - var67) + var69;
                                                } else if (var17 == 4007) {
                                                    var6 -= 2;
                                                    int var71 = class49.field1279[var6 + 1];
                                                    int var72 = class49.field1279[var6];
                                                    class49.field1279[var6++] = var71 * var72 / 100 + var72;
                                                } else if (var17 == 4008) {
                                                    var6 -= 2;
                                                    int var73 = class49.field1279[var6];
                                                    int var74 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = class5.method54(var73, 0x1 << var74);
                                                } else if (var17 == 4009) {
                                                    var6 -= 2;
                                                    int var75 = class49.field1279[var6];
                                                    int var76 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = class104.method832(-(0x1 << var76) - 1, var75);
                                                } else if (var17 == 4010) {
                                                    var6 -= 2;
                                                    int var77 = class49.field1279[var6];
                                                    int var78 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = class104.method832(0x1 << var78, var77) == 0 ? 0 : 1;
                                                } else if (var17 == 4011) {
                                                    var6 -= 2;
                                                    int var79 = class49.field1279[var6];
                                                    int var80 = class49.field1279[var6 + 1];
                                                    class49.field1279[var6++] = var79 % var80;
                                                } else if (var17 == 4012) {
                                                    var6 -= 2;
                                                    int var81 = class49.field1279[var6 + 1];
                                                    int var82 = class49.field1279[var6];
                                                    if (var82 == 0) {
                                                        class49.field1279[var6++] = 0;
                                                    } else {
                                                        class49.field1279[var6++] = (int) Math.pow((double) var82, (double) var81);
                                                    }
                                                } else {
                                                    if (var17 != 4013) {
                                                        break;
                                                    }
                                                    var6 -= 2;
                                                    int var83 = class49.field1279[var6 + 1];
                                                    int var84 = class49.field1279[var6];
                                                    if (var84 == 0) {
                                                        class49.field1279[var6++] = 0;
                                                    } else if (var83 == 0) {
                                                        class49.field1279[var6++] = Integer.MAX_VALUE;
                                                    } else {
                                                        class49.field1279[var6++] = (int) Math.pow((double) var84, 1.0D / (double) var83);
                                                    }
                                                }
                                            } else {
                                                if (var17 != 3100) {
                                                    break;
                                                }
                                                var8--;
                                                class5 var86 = class78.field1823[var8];
                                                class21.method168(var86, class104.field2525, false, 0);
                                            }
                                        } else if (var17 == 2600) {
                                            var6--;
                                            class105 var54 = class52.method435(class49.field1279[var6], false);
                                            class49.field1279[var6++] = var54.field2605;
                                        } else {
                                            if (var17 != 2601) {
                                                break;
                                            }
                                            var6--;
                                            class105 var55 = class52.method435(class49.field1279[var6], false);
                                            class49.field1279[var6++] = var55.field2547;
                                        }
                                    } else if (var17 == 2500) {
                                        var6--;
                                        class105 var87 = class52.method435(class49.field1279[var6], false);
                                        class49.field1279[var6++] = var87.field2640;
                                    } else if (var17 == 2501) {
                                        var6--;
                                        class105 var88 = class52.method435(class49.field1279[var6], false);
                                        class49.field1279[var6++] = var88.field2537;
                                    } else if (var17 == 2502) {
                                        var6--;
                                        class105 var89 = class52.method435(class49.field1279[var6], false);
                                        class49.field1279[var6++] = var89.field2636;
                                    } else if (var17 == 2503) {
                                        var6--;
                                        class105 var90 = class52.method435(class49.field1279[var6], false);
                                        class49.field1279[var6++] = var90.field2611;
                                    } else {
                                        if (var17 != 2504) {
                                            break;
                                        }
                                        var6--;
                                        class105 var91 = class52.method435(class49.field1279[var6], false);
                                        class49.field1279[var6++] = var91.field2552 ? 1 : 0;
                                    }
                                } else if (var17 == 2100) {
                                    var6 -= 3;
                                    class105 var46 = class52.method435(class49.field1279[var6], false);
                                    var46.field2605 = class49.field1279[var6 + 1];
                                    var46.field2547 = class49.field1279[var6 + 2];
                                } else if (var17 == 2101) {
                                    var6 -= 2;
                                    class105 var47 = class52.method435(class49.field1279[var6], false);
                                    int var48 = class49.field1279[var6 + 1];
                                    int var49 = var48 >> 5 & 0x1F;
                                    int var50 = var48 >> 10 & 0x1F;
                                    int var51 = var48 & 0x1F;
                                    var47.field2637 = (var51 << 3) + (var49 << 11) + (var50 << 19);
                                } else if (var17 == 2102) {
                                    var6 -= 2;
                                    class105 var52 = class52.method435(class49.field1279[var6], false);
                                    var52.field2618 = class49.field1279[var6 + 1] == 1;
                                } else {
                                    if (var17 != 2103) {
                                        break;
                                    }
                                    var6 -= 2;
                                    class105 var53 = class52.method435(class49.field1279[var6], false);
                                    var53.field2589 = class49.field1279[var6 + 1];
                                }
                            } else if (var17 == 2000) {
                                var6 -= 3;
                                class105 var92 = class52.method435(class49.field1279[var6], false);
                                var92.field2640 = class49.field1279[var6 + 1];
                                var92.field2537 = class49.field1279[var6 + 2];
                            } else if (var17 == 2001) {
                                var6 -= 3;
                                class105 var93 = class52.method435(class49.field1279[var6], false);
                                var93.field2636 = class49.field1279[var6 + 1];
                                var93.field2611 = class49.field1279[var6 + 2];
                            } else if (var17 == 2003) {
                                var6 -= 2;
                                class105 var94 = class52.method435(class49.field1279[var6], false);
                                var94.field2552 = class49.field1279[var6 + 1] == 1;
                            } else {
                                if (var17 != 2004) {
                                    break;
                                }
                                var6 -= 2;
                                class105 var95 = class52.method435(class49.field1279[var6], false);
                                var95.field2563 = class49.field1279[var6 + 1] == 1;
                            }
                        } else {
                            class105 var96 = var32 ? class108.field2726 : class96.field2290;
                            if (var17 == 1500) {
                                class49.field1279[var6++] = var96.field2640;
                            } else if (var17 == 1501) {
                                class49.field1279[var6++] = var96.field2537;
                            } else if (var17 == 1502) {
                                class49.field1279[var6++] = var96.field2636;
                            } else {
                                if (var17 != 1503) {
                                    break;
                                }
                                class49.field1279[var6++] = var96.field2611;
                            }
                        }
                    } else if (var17 == 100) {
                        var6 -= 3;
                        int var105 = class49.field1279[var6];
                        int var106 = class49.field1279[var6 + 1];
                        int var107 = class49.field1279[var6 + 2];
                        class105 var108 = class52.method435(var105, false);
                        if (var108.field2562 == null) {
                            var108.field2562 = new class105[var107 + 1];
                        }
                        if (var107 >= var108.field2562.length) {
                            class105[] var109 = new class105[var107 + 1];
                            for (int var110 = 0; var110 < var108.field2562.length; var110++) {
                                var109[var110] = var108.field2562[var110];
                            }
                            var108.field2562 = var109;
                        }
                        class105 var111 = new class105();
                        var111.field2630 = var106;
                        var111.field2575 = var108.field2568;
                        var111.field2568 = ((var108.field2568 & 0xFFFF) << 15) + Integer.MIN_VALUE + var107;
                        var108.field2562[var107] = var111;
                        if (var32) {
                            class108.field2726 = var111;
                        } else {
                            class96.field2290 = var111;
                        }
                    } else if (var17 == 101) {
                        class105 var112 = var32 ? class108.field2726 : class96.field2290;
                        class105 var113 = class52.method435(var112.field2575, false);
                        var113.field2562[class104.method832(var113.field2568, 32767)] = null;
                    } else {
                        if (var17 != 102) {
                            break;
                        }
                        var6--;
                        class105 var114 = class52.method435(class49.field1279[var6], false);
                        var114.field2562 = null;
                    }
                }
            }
        } catch (Exception var115) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lrd;ZLjava/awt/Component;Lrd;)V", line = 1282)
    public static final void method429(class106 arg0, boolean arg1, Component arg2, class106 arg3) {
        field1281++;
        if (class94.field2219) {
            return;
        }
        class12.field361 = class12.method112((byte) -50, arg2, 128, 265);
        class55.method445();
        class47.field1225 = class12.method112((byte) -50, arg2, 128, 265);
        class55.method445();
        class14.field404 = class12.method112((byte) -50, arg2, 509, 171);
        class55.method445();
        class38.field941 = class12.method112((byte) -50, arg2, 360, 132);
        class55.method445();
        class109.field2751 = class12.method112((byte) -50, arg2, 360, 200);
        class55.method445();
        class102.field2487 = class12.method112((byte) -50, arg2, 202, 238);
        class55.method445();
        class21.field546 = class12.method112((byte) -50, arg2, 203, 238);
        class55.method445();
        client.field496 = class12.method112((byte) -50, arg2, 74, 94);
        class55.method445();
        class8.field289 = class12.method112((byte) -50, arg2, 75, 94);
        class55.method445();
        byte[] var4 = arg3.method854(class23.field578, class109.field2747, 116);
        class122 var5 = new class122(var4, arg2);
        class12.field361.method885(-63);
        var5.method971(0, 0);
        class47.field1225.method885(-33);
        var5.method971(-637, 0);
        class14.field404.method885(-108);
        var5.method971(-128, 0);
        class38.field941.method885(-69);
        var5.method971(-202, -371);
        class109.field2751.method885(-104);
        var5.method971(-202, -171);
        class102.field2487.method885(-40);
        var5.method971(0, -265);
        class21.field546.method885(-102);
        var5.method971(-562, -265);
        client.field496.method885(-34);
        var5.method971(-128, -171);
        class8.field289.method885(-38);
        var5.method971(-562, -171);
        int[] var6 = new int[var5.field3015];
        for (int var7 = 0; var7 < var5.field3020; var7++) {
            for (int var23 = 0; var23 < var5.field3015; var23++) {
                var6[var23] = var5.field3014[var5.field3015 * var7 + var5.field3015 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field3015; var24++) {
                var5.field3014[var24 + var5.field3015 * var7] = var6[var24];
            }
        }
        class12.field361.method885(-121);
        if (arg1) {
            method431(null, -21, 9, null);
        }
        var5.method971(382, 0);
        class47.field1225.method885(-43);
        var5.method971(-255, 0);
        class14.field404.method885(-49);
        var5.method971(254, 0);
        class38.field941.method885(-102);
        var5.method971(180, -371);
        class109.field2751.method885(-123);
        var5.method971(180, -171);
        class102.field2487.method885(-127);
        var5.method971(382, -265);
        class21.field546.method885(-49);
        var5.method971(-180, -265);
        client.field496.method885(-102);
        var5.method971(254, -171);
        class8.field289.method885(-100);
        var5.method971(-180, -171);
        class122 var8 = class80.method622(false, class129.field3135, class109.field2747, arg0);
        class14.field404.method885(-92);
        var8.method964(382 - var8.field3015 / 2 - 128, 18);
        class134.field3243 = client.method156(2, class109.field2747, class99.field2405, arg0);
        class54.field1358 = client.method156(2, class109.field2747, class63.field1530, arg0);
        class30.field739 = class80.method623(class53.field1336, class109.field2747, arg0, (byte) -67);
        class99.field2386 = new class122(128, 265);
        class95.field2250 = new class122(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class99.field2386.field3014[var9] = class12.field361.field2757[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class95.field2250.field3014[var10] = class47.field1225.field2757[var10];
        }
        class116.field2871 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class116.field2871[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class116.field2871[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class116.field2871[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class116.field2871[var14 + 192] = 16777215;
        }
        class17.field447 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class17.field447[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class17.field447[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class17.field447[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class17.field447[var18 + 192] = 16777215;
        }
        class32.field779 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class32.field779[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class32.field779[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class32.field779[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class32.field779[var22 + 192] = 16777215;
        }
        class98.field2366 = new int[32768];
        class99.field2403 = new int[256];
        class118.field2933 = new int[32768];
        class106.method849(0, null);
        class21.field548 = new int[32768];
        class86.field1989 = 0;
        class56.field1395 = new int[32768];
        class109.field2736 = class109.field2747;
        class109.field2753 = class109.field2747;
        if (class103.field2517 == 0 || class40.field1048) {
            class78.method609(10, (byte) -56);
        } else {
            class78.method601(0, class1.field1, false, class108.field2713, class109.field2747, 10, 4504, class103.field2517);
        }
        class81.method632(3, false);
        class94.field2219 = true;
        class120.field2979 = true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 1508)
    public static void method430(byte arg0) {
        if (arg0 != 116) {
            method431(null, 68, -18, null);
        }
        field1282 = null;
        field1292 = null;
        field1286 = null;
        field1291 = null;
        field1289 = null;
        field1290 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lr;IILtb;)V", line = 1528)
    public static final void method431(class102 arg0, int arg1, int arg2, class116 arg3) {
        field1284++;
        byte[] var4 = null;
        class23 var5 = class101.field2460;
        synchronized (class101.field2460) {
            class53 var6 = (class53) class101.field2460.method180(0);
            while (true) {
                if (var6 != null) {
                    if ((long) arg2 != var6.field363 || var6.field1326 != arg0 || var6.field1323 != 0) {
                        var6 = (class53) class101.field2460.method181(0);
                        continue;
                    }
                    var4 = var6.field1340;
                }
                int var7 = -16 / ((arg1 - 10) / 39);
                break;
            }
        }
        if (var4 == null) {
            byte[] var8 = arg0.method821((byte) 111, arg2);
            arg3.method926(arg2, (byte) -112, true, arg0, var8);
        } else {
            arg3.method926(arg2, (byte) -112, true, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 1566)
    public static final void method432(int arg0) {
        field1283++;
        if (class134.field3239 == 0 || arg0 != -3582) {
            return;
        }
        int var1 = 0;
        if (class12.field373 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class96.field2282[var2] != null) {
                int var3 = class46.field1215[var2];
                class5 var4 = class116.field2879[var2];
                if (var4 != null && var4.method47(117, class106.field2660)) {
                    var4 = var4.method52(5, (byte) -103);
                }
                if (var4 != null && var4.method47(117, class88.field2071)) {
                    var4 = var4.method52(5, (byte) -92);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class61.field1509 == 0 || class61.field1509 == 1 && class133.method1028(var4, 0))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class22.field564 > 4 && class91.field2131 - 4 > var5 - 10 && var5 + 3 >= class91.field2131 + -4) {
                        int var6 = class82.field1924.method1007(class69.method546(true, new class5[] { class49.field1270, class14.field401, var4, class96.field2282[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class22.field564 < var6 + 4) {
                            if (class78.field1848 >= 1) {
                                class72.method580(class69.method546(true, new class5[] { field1291, var4 }), 2011, class105.field2536, -113, 0, 0, 0);
                                class3.field97++;
                            }
                            class92.field2203++;
                            class72.method580(class69.method546(true, new class5[] { field1291, var4 }), 2001, class39.field1013, -113, 0, 0, 0);
                            class7.field246++;
                            class72.method580(class69.method546(true, new class5[] { field1291, var4 }), 2059, class96.field2281, -117, 0, 0, 0);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class61.field1509 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
    public abstract void method291(int arg0, int arg1);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIBZ)V")
    public abstract void method290(byte[] arg0, int arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
    public abstract void method283(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public abstract void method282(byte arg0);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public abstract void method288(int arg0);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public abstract void method284(int arg0);
}
