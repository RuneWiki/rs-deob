import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class201 extends class134 {

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "Lbb;")
    public static class270 field2368 = new class270();

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[B")
    public static byte[] field2373 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    public static int field2374 = 0;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Lwo;")
    public static class285 field2370;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lpp;")
    public class334 field2365;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "[B")
    public byte[] field2369;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILwo;)Lfa;")
    public static final class347 method1235(byte arg0, int arg1, class285 arg2) {
        int var3 = -80 / ((arg0 - 15) / 49);
        ++field2372;
        byte[] var4 = arg2.method1805(arg1, true);
        return var4 == null ? null : new class347(var4);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1236(String arg0, boolean arg1, int arg2) {
        String var3 = arg0.toLowerCase();
        ++field2367;
        short[] var4 = new short[16];
        if (arg2 >= -29) {
            field2370 = null;
        }
        int var5 = 0;
        int var6 = !arg1 ? 0 : 32768;
        int var7 = (arg1 ? class272.field3507 : class314.field4238) + var6;
        for (int var8 = var6; ~var8 > ~var7; ++var8) {
            class90 var11 = class31.method207(var8, 1);
            if (var11.field1048 && var11.method562(false).toLowerCase().indexOf(var3) != -1) {
                if (~var5 <= -51) {
                    class401.field5534 = -1;
                    class118.field1355 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var5 > var13; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class118.field1355 = var4;
        class396.field5385 = 0;
        class401.field5534 = var5;
        String[] var9 = new String[class401.field5534];
        for (int var10 = 0; ~var10 > ~class401.field5534; ++var10) {
            var9[var10] = class31.method207(var4[var10], 1).method562(false);
        }
        class8.method35((byte) -64, class118.field1355, var9);
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public static void method1237(int arg0) {
        if (arg0 == 20846) {
            field2370 = null;
            field2368 = null;
            field2373 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILbe;)V")
    public static final void method1238(int arg0, class131 arg1) {
        if (arg0 != -1) {
            field2373 = null;
        }
        ++field2362;
        class237 var2 = (class237) class321.field4310.method2218(1, (long) arg1.field2445);
        if (var2 != null) {
            if (var2.field3116 != null) {
                class352.field4781.method1866(var2.field3116);
                var2.field3116 = null;
            }
            var2.method263(false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII[Laq;IIIII)V")
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, class453[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class267.field3454.method774(arg7, arg0, arg8, arg2);
        ++field2364;
        int var10 = 0;
        int var11 = -38 / ((-18 - arg5) / 55);
        while (arg4.length > var10) {
            class453 var12 = arg4[var10];
            if (var12 != null && (~var12.field6462 == ~arg1 || ~arg1 == 1412584498 && class264.field3404 == var12)) {
                int var13;
                if (arg3 != -1) {
                    var13 = arg3;
                } else {
                    class41.field487[class319.field4291].setBounds(var12.field6394 + arg9, var12.field6434 - -arg6, var12.field6377, var12.field6432);
                    var13 = class319.field4291++;
                }
                var12.field6393 = class106.field1273;
                var12.field6440 = var13;
                if (!client.method2686(var12)) {
                    label510: {
                        if (~var12.field6415 < -1) {
                            class433.method2642(var12, (byte) 122);
                        }
                        int var14 = var12.field6394 + arg9;
                        int var15 = var12.field6434 + arg6;
                        int var16 = var12.field6374;
                        if (class186.field2151 && (~client.method2696(var12).field4847 != -1 || var12.field6383 == 0) && ~var16 < -128) {
                            var16 = 127;
                        }
                        if (class264.field3404 == var12) {
                            if (arg1 != -1412584499 && !var12.field6467) {
                                class62.field764 = arg4;
                                class39.field456 = arg6;
                                class411.field5668 = arg9;
                                break label510;
                            }
                            if (class11.field131 && class143.field1683) {
                                int var17 = class358.field4866.method1860(16);
                                int var18 = class358.field4866.method1858(-18493);
                                int var19 = var17 - class356.field4829;
                                int var20 = var18 - class20.field214;
                                if (class325.field4340 > var19) {
                                    var19 = class325.field4340;
                                }
                                if (~(var12.field6377 + var19) < ~(class325.field4340 + class137.field1559.field6377)) {
                                    var19 = class325.field4340 + class137.field1559.field6377 + -var12.field6377;
                                }
                                if (class395.field5379 > var20) {
                                    var20 = class395.field5379;
                                }
                                var14 = var19;
                                if (~(var12.field6432 + var20) < ~(class395.field5379 - -class137.field1559.field6432)) {
                                    var20 = -var12.field6432 + class395.field5379 + class137.field1559.field6432;
                                }
                                var15 = var20;
                            }
                            if (!var12.field6467) {
                                var16 = 128;
                            }
                        }
                        int var21;
                        int var22;
                        int var23;
                        int var24;
                        if (~var12.field6383 == -3) {
                            var21 = arg7;
                            var22 = arg8;
                            var23 = arg2;
                            var24 = arg0;
                        } else {
                            int var25 = var12.field6377 + var14;
                            int var26 = var12.field6432 + var15;
                            var21 = ~arg7 > ~var14 ? var14 : arg7;
                            if (~var12.field6383 == -10) {
                                ++var26;
                                ++var25;
                            }
                            var24 = var15 <= arg0 ? arg0 : var15;
                            var23 = arg2 > var26 ? var26 : arg2;
                            var22 = arg8 > var25 ? var25 : arg8;
                        }
                        if (var22 > var21 && ~var24 > ~var23) {
                            label539: {
                                if (~var12.field6415 != -1) {
                                    if (var12.field6415 == 1337 || var12.field6415 == 1403) {
                                        class440.method2706(var12.field6377, var12.field6432, 4, var14, var15, ~var12.field6415 == -1404);
                                        class65.field786[var13] = true;
                                        class267.field3454.method774(arg7, arg0, arg8, arg2);
                                        break label539;
                                    }
                                    if (var12.field6415 == 1338) {
                                        if (var12.method2808(class267.field3454, false) != null) {
                                            class94.method589(-123);
                                            class438.method2679(var14, var15, var12, true, class267.field3454);
                                            class326.field4346[var13] = true;
                                            class267.field3454.method774(arg7, arg0, arg8, arg2);
                                        }
                                        break label539;
                                    }
                                    if (var12.field6415 == 1339) {
                                        if (var12.method2808(class267.field3454, false) != null) {
                                            class310.method1963(var14, var15, var12, (byte) 102);
                                            class326.field4346[var13] = true;
                                            class267.field3454.method774(arg7, arg0, arg8, arg2);
                                        }
                                        break label539;
                                    }
                                    if (~var12.field6415 == -1401) {
                                        class335.method2147(var12.field6432, var14, var15, 0, class267.field3454, class450.field6292, var12.field6377);
                                        class65.field786[var13] = true;
                                        class267.field3454.method774(arg7, arg0, arg8, arg2);
                                        break label539;
                                    }
                                    if (~var12.field6415 == -1402) {
                                        class421.method2578(var12.field6377, class267.field3454, var15, var14, (byte) -25, var12.field6432);
                                        class65.field786[var13] = true;
                                        class267.field3454.method774(arg7, arg0, arg8, arg2);
                                        break label539;
                                    }
                                    if (~var12.field6415 == -1406) {
                                        if (!class139.field1615 && !class226.field2869) {
                                            break label539;
                                        }
                                        int var27 = var12.field6377 + var14;
                                        int var28 = var15 + 15;
                                        if (class139.field1615) {
                                            class55.field636.method208(var27, (byte) 92, var28, "Fps:" + class335.field4570, -1, -256);
                                            var28 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() + -var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 65536) {
                                                var31 = -65536;
                                            }
                                            class55.field636.method208(var27, (byte) 71, var28, "Mem:" + var30 + "k", -1, var31);
                                            var28 += 15;
                                            int var32 = class267.field3454.method775() / 1024;
                                            class55.field636.method208(var27, (byte) 57, var28, "Offheap:" + var32 + "k", -1, var32 <= 65536 ? -256 : -65536);
                                            var28 += 15;
                                            int var33 = 0;
                                            int var34 = 0;
                                            int var35 = 0;
                                            for (int var36 = 0; ~var36 > -30; ++var36) {
                                                var33 += class330.field4506[var36].method915(-91);
                                                var34 += class330.field4506[var36].method913(-28947);
                                                var35 += class330.field4506[var36].method910(-2);
                                            }
                                            int var37 = var35 * 100 / var33;
                                            int var38 = var34 * 10000 / var33;
                                            String var39 = "Cache:" + class118.method734((long) var38, true, 0, 10, 2) + "% (" + var37 + "%)";
                                            class363.field4933.method208(var27, (byte) 78, var28, var39, -1, -256);
                                            var28 += 12;
                                        }
                                        if (class285.field3726 > 0) {
                                            class363.field4933.method208(var27, (byte) 60, var28, "Particles: " + class28.field318 + " / " + class285.field3726, -1, -256);
                                        }
                                        var28 += 12;
                                        if (class226.field2869) {
                                            class363.field4933.method208(var27, (byte) 123, var28, "Polys: " + class267.field3454.method778() + " Models: " + class267.field3454.method699(), -1, -256);
                                            var28 += 12;
                                            class363.field4933.method208(var27, (byte) 69, var28, "Ls: " + class242.field3233 + " La: " + class370.field5035 + " NPC: " + class134.field1531 + " Pl: " + class258.field3327, -1, -256);
                                            var28 += 12;
                                            class433.method2641(0);
                                        }
                                        class65.field786[var13] = true;
                                        break label539;
                                    }
                                }
                                if (~var12.field6383 == -1) {
                                    if (~var12.field6415 == -1408 && class267.field3454.method714()) {
                                        class267.field3454.method766(var14, var15, var12.field6377, var12.field6432);
                                    }
                                    method1239(var24, var12.field6475, var23, var13, arg4, 80, -var12.field6386 + var15, var21, var22, -var12.field6345 + var14);
                                    if (var12.field6350 != null) {
                                        method1239(var24, var12.field6475, var23, var13, var12.field6350, 127, -var12.field6386 + var15, var21, var22, -var12.field6345 + var14);
                                    }
                                    class244 var40 = (class244) class282.field3678.method2218(1, (long) var12.field6475);
                                    if (var40 != null) {
                                        class391.method2431((byte) 126, var15, var14, var13, var40.field3245, var21, var23, var22, var24);
                                    }
                                    if (var12.field6415 == 1407 && class267.field3454.method714()) {
                                        class267.field3454.method727();
                                        class374.field5061 = true;
                                    }
                                    class267.field3454.method774(arg7, arg0, arg8, arg2);
                                }
                                if (class287.field3778[var13] || ~class422.field5781 < -2) {
                                    if (var12.field6383 == 3) {
                                        if (var16 == 0) {
                                            if (!var12.field6327) {
                                                class267.field3454.method748(var14, var15, var12.field6377, var12.field6432, var12.field6357, 0);
                                            } else {
                                                class267.field3454.method789(var14, var15, var12.field6377, var12.field6432, var12.field6357, 0);
                                            }
                                        } else if (var12.field6327) {
                                            class267.field3454.method789(var14, var15, var12.field6377, var12.field6432, -(var16 & 255) + 255 << 24 | 16777215 & var12.field6357, 1);
                                        } else {
                                            class267.field3454.method748(var14, var15, var12.field6377, var12.field6432, 16777215 & var12.field6357 | -(var16 & 255) + 255 << 24, 1);
                                        }
                                    } else if (~var12.field6383 == -5) {
                                        class31 var41 = var12.method2803(class267.field3454, 31039);
                                        if (var41 == null) {
                                            if (class384.field5260) {
                                                class303.method1923(var12, 10240);
                                            }
                                        } else {
                                            int var42 = var12.field6357;
                                            String var43 = var12.field6406;
                                            if (var12.field6358 != -1) {
                                                class59 var44 = class131.method843((byte) 5, var12.field6358);
                                                var43 = var44.field736;
                                                if (var43 == null) {
                                                    var43 = "null";
                                                }
                                                if ((var44.field678 == 1 || var12.field6453 != 1) && var12.field6453 != -1) {
                                                    var43 = "<col=ff9040>" + var43 + "</col> x" + class286.method1826(var12.field6453, -10);
                                                }
                                            }
                                            if (class40.field485 == var12) {
                                                var43 = class252.field3297.method434(class373.field5057, -8192);
                                                var42 = var12.field6357;
                                            }
                                            if (class133.field1513) {
                                                class267.field3454.method768(var14, var15, var14 - -var12.field6377, var12.field6432 + var15);
                                            }
                                            var41.method200(var12.field6476, 23897, (int[]) null, var12.field6432, var15, var12.field6470, var12.field6368 ? -16777216 : -1, class333.field4546, var12.field6377, var12.field6385, var43, 0, var14, 0, var42 | -16777216, (class423) null);
                                            if (class133.field1513) {
                                                class267.field3454.method774(arg7, arg0, arg8, arg2);
                                            }
                                        }
                                    } else if (var12.field6383 == 5) {
                                        if (~var12.field6424 > -1) {
                                            class436 var45;
                                            if (var12.field6358 == -1) {
                                                var45 = var12.method2809(class267.field3454, 1);
                                            } else {
                                                class434 var46 = !var12.field6376 ? null : class143.field1684.field1466;
                                                var45 = class126.method816(var12.field6358, 8, var12.field6443, class267.field3454, var12.field6359, var46, var12.field6473 | -16777216, var12.field6453);
                                            }
                                            if (var45 != null) {
                                                int var47 = var45.method235();
                                                int var48 = var45.method236();
                                                if (!var12.field6436) {
                                                    if (~var16 == -1) {
                                                        if (~var12.field6430 == -1) {
                                                            if (~var12.field6377 == ~var47 && ~var12.field6432 == ~var48) {
                                                                var45.method2659(var14, var15);
                                                            } else {
                                                                var45.method2664(var14, var15, var12.field6377, var12.field6432);
                                                            }
                                                        } else {
                                                            var45.method2661((float) var12.field6377 / 2.0F + (float) var14, (float) var12.field6432 / 2.0F + (float) var15, var12.field6377 * 4096 / var47, var12.field6430);
                                                        }
                                                    } else {
                                                        int var53 = 16777215 | -(255 & var16) + 255 << 24;
                                                        if (~var12.field6430 != -1) {
                                                            var45.method2665((float) var12.field6377 / 2.0F + (float) var14, (float) var12.field6432 / 2.0F + (float) var15, var12.field6377 * 4096 / var47, var12.field6430, 1, var53, 1);
                                                        } else if (var12.field6377 == var47 && ~var12.field6432 == ~var48) {
                                                            var45.method167(var14, var15, 1, var53, 1);
                                                        } else {
                                                            var45.method163(var14, var15, var12.field6377, var12.field6432, 1, var53, 1);
                                                        }
                                                    }
                                                } else {
                                                    class267.field3454.method768(var14, var15, var12.field6377 + var14, var12.field6432 + var15);
                                                    if (~var12.field6430 == -1) {
                                                        if (var16 != 0) {
                                                            var45.method234(var14, var15, var12.field6377, var12.field6432, 1, -(var16 & 255) + 255 << 24 | 16777215, 1);
                                                        } else {
                                                            var45.method234(var14, var15, var12.field6377, var12.field6432, 0, 0, 1);
                                                        }
                                                    } else {
                                                        int var49 = (var47 + -1 + var12.field6377) / var47;
                                                        int var50 = (var48 + -1 + var12.field6432) / var48;
                                                        for (int var51 = 0; ~var51 > ~var49; ++var51) {
                                                            for (int var52 = 0; var52 < var50; ++var52) {
                                                                var45.method2661((float) var47 / 2.0F + (float) (var47 * var51 + var14), (float) var48 / 2.0F + (float) (var48 * var52 + var15), 4096, var12.field6430);
                                                            }
                                                        }
                                                    }
                                                    class267.field3454.method774(arg7, arg0, arg8, arg2);
                                                }
                                            } else if (class384.field5260) {
                                                class303.method1923(var12, 10240);
                                            }
                                        } else {
                                            var12.method2807(1419390864).method449(var14, var12.field6367 << 3, 0, var12.field6377, -10571, var12.field6432, class267.field3454, var12.field6479 << 3, var15, 0);
                                        }
                                    } else if (var12.field6383 != 6) {
                                        if (~var12.field6383 == -10) {
                                            int var73;
                                            int var74;
                                            int var75;
                                            int var76;
                                            if (var12.field6342) {
                                                var73 = var14 - -var12.field6377;
                                                var74 = var15;
                                                var75 = var12.field6432 + var15;
                                                var76 = var14;
                                            } else {
                                                var76 = var14;
                                                var73 = var12.field6377 + var14;
                                                var75 = var15;
                                                var74 = var12.field6432 + var15;
                                            }
                                            if (var12.field6382 != 1) {
                                                class267.field3454.method736(var76, var75, var73, var74, var12.field6357, var12.field6382, 0);
                                            } else {
                                                class267.field3454.method741(var76, var75, var73, var74, var12.field6357, 0);
                                            }
                                        }
                                    } else {
                                        class423.method2590(true);
                                        class386 var54 = null;
                                        int var55 = 0;
                                        if (var12.field6358 == -1) {
                                            if (~var12.field6411 == -6) {
                                                if (~var12.field6435 == 0) {
                                                    var54 = class398.field5401.method2646((byte) -15, 0, -1, 1024, class267.field3454, (class156) null, (class156) null, true, -1, 0, (class265[]) null, -1, -1);
                                                } else {
                                                    int var56 = var12.field6435;
                                                    class131 var57;
                                                    if (class429.field5865 == var56) {
                                                        var57 = class143.field1684;
                                                    } else {
                                                        var57 = class212.field2584[var56];
                                                    }
                                                    class156 var58 = ~var12.field6426 != 0 ? class430.method2621((byte) -83, var12.field6426) : null;
                                                    if (var57 != null && (var56 == 2047 || ~class223.method1358(var57.field1480, (byte) -127) == ~var12.field6330)) {
                                                        var54 = var57.field1466.method2646((byte) -72, var12.field6439, 0, 1024, class267.field3454, var58, (class156) null, true, -1, 0, (class265[]) null, var12.field6315, var12.field6331);
                                                    }
                                                }
                                            } else if (var12.field6411 != 8 && ~var12.field6411 != -10) {
                                                if (var12.field6426 == -1) {
                                                    var54 = var12.method2802(1024, -1, 0, (class156) null, class143.field1684.field1466, 1, -1, class267.field3454);
                                                    if (var54 == null && class384.field5260) {
                                                        class303.method1923(var12, 10240);
                                                    }
                                                } else {
                                                    class156 var59 = class430.method2621((byte) -82, var12.field6426);
                                                    var54 = var12.method2802(1024, var12.field6315, var12.field6439, var59, class143.field1684.field1466, 1, var12.field6331, class267.field3454);
                                                    if (var54 == null && class384.field5260) {
                                                        class303.method1923(var12, 10240);
                                                    }
                                                }
                                            } else {
                                                class391 var60 = class70.method415(Integer.MIN_VALUE, var12.field6435, false);
                                                class156 var61 = var12.field6426 == -1 ? null : class430.method2621((byte) -80, var12.field6426);
                                                if (var60 != null) {
                                                    class434 var62 = !var12.field6376 ? null : class143.field1684.field1466;
                                                    var54 = var60.method2432((byte) 91, var12.field6439, class267.field3454, var12.field6315, var12.field6411 == 9, var12.field6330, var12.field6331, var61, 1024, var62);
                                                }
                                            }
                                        } else {
                                            class59 var63 = class131.method843((byte) 5, var12.field6358);
                                            if (var63 != null) {
                                                class59 var64 = var63.method346(2162, var12.field6453);
                                                class156 var65 = var12.field6426 != -1 ? class430.method2621((byte) -61, var12.field6426) : null;
                                                class434 var66 = var12.field6376 ? class143.field1684.field1466 : null;
                                                var54 = var64.method339(var12.field6315, var65, var66, 1, var12.field6439, 1024, 78, var12.field6331, class267.field3454);
                                                if (var54 == null) {
                                                    class303.method1923(var12, 10240);
                                                } else {
                                                    var55 = -var54.method1458() / 2;
                                                }
                                            }
                                        }
                                        if (var54 != null) {
                                            int var67;
                                            if (~var12.field6398 < -1) {
                                                var67 = (var12.field6377 << 9) / var12.field6398;
                                            } else {
                                                var67 = 512;
                                            }
                                            int var68;
                                            if (~var12.field6340 < -1) {
                                                var68 = (var12.field6432 << 9) / var12.field6340;
                                            } else {
                                                var68 = 512;
                                            }
                                            int var69 = (var12.field6449 * var67 >> 9) + var14 - -(var12.field6377 / 2);
                                            int var70 = var12.field6432 / 2 + var15 - -(var12.field6409 * var68 >> 9);
                                            class179.field2092.method931();
                                            class267.field3454.method749(class179.field2092);
                                            int var71 = class363.field4927[var12.field6478 << 3] * var12.field6414 >> 15;
                                            int var72 = class363.field4917[var12.field6478 << 3] * var12.field6414 >> 15;
                                            class267.field3454.method790(var69, var70, var67, var68);
                                            class267.field3454.method773((float) var12.field6369, !var12.field6392 ? (float) var12.field6347 * 1.5F : (float) var12.field6347);
                                            if (class374.field5061) {
                                                class267.field3454.method732();
                                                class267.field3454.method725();
                                                class267.field3454.method774(arg7, arg0, arg8, arg2);
                                                class374.field5061 = false;
                                            }
                                            if (var12.field6420) {
                                                class267.field3454.method690(false);
                                            }
                                            class195.field2323.method937(-var12.field6477 << 3);
                                            class195.field2323.method934(var12.field6332 << 3);
                                            class195.field2323.method933(var12.field6457, var12.field6351 + var71 + var55, var12.field6351 + var72);
                                            class195.field2323.method938(var12.field6478 << 3);
                                            if (class133.field1513) {
                                                class267.field3454.method768(var14, var15, var12.field6377 + var14, var15 - -var12.field6432);
                                            }
                                            if (var12.field6392) {
                                                var54.method1436(class195.field2323, (class34) null, var12.field6414, 1);
                                            } else {
                                                var54.method1441(class195.field2323, (class34) null, 1);
                                            }
                                            if (class133.field1513) {
                                                class267.field3454.method774(arg7, arg0, arg8, arg2);
                                            }
                                            if (var12.field6420) {
                                                class267.field3454.method690(true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++var10;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public final int method871(int arg0) {
        if (arg0 != 255) {
            return -110;
        } else {
            ++field2366;
            return super.field1539 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)[B")
    public final byte[] method873(int arg0) {
        if (arg0 != -256) {
            method1239(-66, 122, 77, 108, (class453[]) null, 48, -88, -15, 37, 111);
        }
        ++field2371;
        if (super.field1539) {
            throw new RuntimeException();
        } else {
            return this.field2369;
        }
    }
}
