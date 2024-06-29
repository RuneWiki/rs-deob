import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lad;")
    private static class5 field469 = class88.method674("Loaded interfaces", -108);

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lad;")
    public static class5 field472 = class88.method674("Bitte versuchen Sie es erneut)3", 100);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lad;")
    public static class5 field466 = class88.method674("Side panel redrawn", 52);

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lad;")
    public static class5 field477 = class88.method674("overlay_multiway", 70);

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lad;")
    public static class5 field475 = class88.method674(":0", -127);

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Lad;")
    public static class5 field473 = field469;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static volatile int field474 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lad;")
    public static class5 field463 = class88.method674("Sie haben gerade eine andere Welt verlassen)3", 73);

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lad;")
    private static class5 field479 = class88.method674("Prepared sound engine", 60);

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
    public static int[] field482 = new int[50];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field478 = 0;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lad;")
    public static class5 field476 = field479;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lrd;")
    public static class106 field465;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lsb;")
    public static class110 field467;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "[Lub;")
    public static class122[] field480;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 17)
    public static final void method140(int arg0) {
        class133 var1 = class5.field209;
        synchronized (class5.field209) {
            class27.field713 = class43.field1090;
            if (class19.field523 >= arg0) {
                while (class54.field1354 != class19.field523) {
                    int var2 = class23.field599[class54.field1354];
                    class54.field1354 = class54.field1354 + 1 & 0x7F;
                    if (var2 < 0) {
                        class43.field1109[~var2] = false;
                    } else {
                        class43.field1109[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class43.field1109[var3] = false;
                }
                class19.field523 = class54.field1354;
            }
            class43.field1090 = class120.field2972;
        }
        field464++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([Lrc;IIIIIIIIIII)V", line = 55)
    public static final void method141(class105[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field470++;
        if (arg2 > arg8 || arg1 < arg4 || arg7 <= arg8 || arg6 <= arg1 || arg5 != 1265840112) {
            return;
        }
        for (int var12 = 0; var12 < arg0.length; var12++) {
            class105 var13 = arg0[var12];
            if (var13 != null && var13.field2575 == arg11) {
                int var14 = var13.field2640 + arg2;
                int var15 = var13.field2537 + arg4 - arg9;
                if ((var13.field2573 >= 0 || var13.field2606 != 0) && var14 <= arg8 && arg1 >= var15 && arg8 < var13.field2636 + var14 && arg1 < var13.field2611 + var15) {
                    if (var13.field2573 < 0) {
                        class103.field2518 = var12;
                    } else {
                        class103.field2518 = var13.field2573;
                    }
                }
                if (var13.field2630 == 8 && var14 <= arg8 && arg1 >= var15 && arg8 < var13.field2636 + var14 && arg1 < var13.field2611 + var15) {
                    class78.field1843 = var12;
                }
                if (var13.field2630 != 0) {
                    if (var13.field2604 == 1 && var14 <= arg8 && var15 <= arg1 && var13.field2636 + var14 > arg8 && var13.field2611 + var15 > arg1) {
                        boolean var16 = false;
                        if (var13.field2558 != 0) {
                            var16 = class101.method807(var13, 16894);
                        }
                        if (!var16) {
                            class72.method580(class135.field3269, 50, var13.field2580, arg5 ^ 0xB48CD060, 0, 0, (arg3 << 16) + var12);
                            class112.field2808++;
                        }
                    }
                    if (var13.field2604 == 2 && class118.field2920 == 0 && arg8 >= var14 && var15 <= arg1 && arg8 < var13.field2636 + var14 && var15 + var13.field2611 > arg1) {
                        class49.field1264++;
                        class72.method580(class69.method546(true, new class5[] { class38.field946, var13.field2635 }), 22, var13.field2617, -114, 0, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field2604 == 3 && var14 <= arg8 && var15 <= arg1 && arg8 < var14 + var13.field2636 && var13.field2611 + var15 > arg1) {
                        class86.field1986++;
                        byte var17;
                        if (arg10 == 3) {
                            var17 = 65;
                        } else {
                            var17 = 49;
                        }
                        class72.method580(class135.field3269, var17, class32.field757, -118, 0, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field2604 == 4 && arg8 >= var14 && arg1 >= var15 && var13.field2636 + var14 > arg8 && var13.field2611 + var15 > arg1) {
                        class116.field2856++;
                        class72.method580(class135.field3269, 41, var13.field2580, -123, 0, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field2604 == 5 && var14 <= arg8 && var15 <= arg1 && arg8 < var13.field2636 + var14 && arg1 < var13.field2611 + var15) {
                        class118.field2911++;
                        class72.method580(class135.field3269, 43, var13.field2580, arg5 - 1265840239, 0, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field2604 == 6 && class80.field1885 == -1 && arg8 >= var14 && var15 <= arg1 && arg8 < var13.field2636 + var14 && var15 + var13.field2611 > arg1) {
                        class3.field90++;
                        class72.method580(class135.field3269, 30, var13.field2580, -121, 0, 0, (arg3 << 16) + var12);
                    }
                    if (var13.field2630 == 2) {
                        int var18 = 0;
                        for (int var19 = 0; var19 < var13.field2611; var19++) {
                            for (int var20 = 0; var20 < var13.field2636; var20++) {
                                int var21 = (var13.field2578 + 32) * var20 + var14;
                                int var22 = (var13.field2550 + 32) * var19 + var15;
                                if (var18 < 20) {
                                    var22 += var13.field2599[var18];
                                    var21 += var13.field2541[var18];
                                }
                                if (arg8 >= var21 && var22 <= arg1 && arg8 < var21 + 32 && var22 + 32 > arg1) {
                                    class34.field866 = var18;
                                    class69.field1600 = (arg3 << 16) + var12;
                                    if (var13.field2620[var18] > 0) {
                                        class27 var23 = class3.method21((byte) 69, var13.field2620[var18] - 1);
                                        if (class112.field2814 == 1 && var13.field2565) {
                                            if ((arg3 << 16) + var12 != class91.field2148 || class22.field567 != var18) {
                                                class72.method580(class69.method546(true, new class5[] { class53.field1337, class58.field1435, var23.field650 }), 21, class9.field318, -127, var23.field655, var18, (arg3 << 16) + var12);
                                                class49.field1260++;
                                            }
                                        } else if (class118.field2920 != 1 || !var13.field2565) {
                                            class3.field93++;
                                            class5[] var24 = var23.field652;
                                            if (class16.field438) {
                                                var24 = class95.method729(true, var24);
                                            }
                                            if (var13.field2565) {
                                                for (int var25 = 4; var25 >= 3; var25--) {
                                                    if (var24 != null && var24[var25] != null) {
                                                        class128.field3049++;
                                                        byte var26;
                                                        if (var25 == 3) {
                                                            var26 = 42;
                                                        } else {
                                                            var26 = 55;
                                                        }
                                                        class72.method580(class69.method546(true, new class5[] { class118.field2943, var23.field650 }), var26, var24[var25], -117, var23.field655, var18, (arg3 << 16) + var12);
                                                    } else if (var25 == 4) {
                                                        class35.field891++;
                                                        class72.method580(class69.method546(true, new class5[] { class118.field2943, var23.field650 }), 55, class43.field1107, arg5 ^ 0xB48CD076, var23.field655, var18, (arg3 << 16) + var12);
                                                    }
                                                }
                                            }
                                            if (var13.field2583) {
                                                class72.method580(class69.method546(true, new class5[] { class118.field2943, var23.field650 }), 14, class9.field318, arg5 - 1265840233, var23.field655, var18, (arg3 << 16) + var12);
                                                class105.field2569++;
                                            }
                                            if (var13.field2565 && var24 != null) {
                                                for (int var27 = 2; var27 >= 0; var27--) {
                                                    if (var24[var27] != null) {
                                                        byte var28 = 0;
                                                        class34.field829++;
                                                        if (var27 == 0) {
                                                            var28 = 27;
                                                        }
                                                        if (var27 == 1) {
                                                            var28 = 32;
                                                        }
                                                        if (var27 == 2) {
                                                            var28 = 7;
                                                        }
                                                        class72.method580(class69.method546(true, new class5[] { class118.field2943, var23.field650 }), var28, var24[var27], -111, var23.field655, var18, (arg3 << 16) + var12);
                                                    }
                                                }
                                            }
                                            class5[] var29 = var13.field2596;
                                            if (class16.field438) {
                                                var29 = class95.method729(true, var29);
                                            }
                                            if (var29 != null) {
                                                for (int var30 = 4; var30 >= 0; var30--) {
                                                    if (var29[var30] != null) {
                                                        class10.field329++;
                                                        byte var31 = 0;
                                                        if (var30 == 0) {
                                                            var31 = 60;
                                                        }
                                                        if (var30 == 1) {
                                                            var31 = 25;
                                                        }
                                                        if (var30 == 2) {
                                                            var31 = 40;
                                                        }
                                                        if (var30 == 3) {
                                                            var31 = 26;
                                                        }
                                                        if (var30 == 4) {
                                                            var31 = 3;
                                                        }
                                                        class72.method580(class69.method546(true, new class5[] { class118.field2943, var23.field650 }), var31, var29[var30], arg5 ^ 0xB48CD061, var23.field655, var18, (arg3 << 16) + var12);
                                                    }
                                                }
                                            }
                                            class72.method580(class69.method546(true, new class5[] { class118.field2943, var23.field650 }), 1003, class52.field1307, -126, var23.field655, var18, (arg3 << 16) + var12);
                                        } else if ((class73.field1752 & 0x10) == 16) {
                                            class72.method580(class69.method546(true, new class5[] { class38.field940, class58.field1435, var23.field650 }), 28, class105.field2631, -119, var23.field655, var18, (arg3 << 16) + var12);
                                            class47.field1223++;
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13.field2563 && var13.field2543 != null && var14 <= arg8 && var15 <= arg1 && arg8 < var14 + var13.field2636 && arg1 < var13.field2611 + var15) {
                        for (int var32 = var13.field2543.length - 1; var32 >= 0; var32--) {
                            byte var33 = 0;
                            if (var32 == 0) {
                                var33 = 33;
                            }
                            if (var32 == 1) {
                                var33 = 64;
                            }
                            if (var32 == 2) {
                                var33 = 39;
                            }
                            if (var32 == 3) {
                                var33 = 31;
                            }
                            if (var32 == 4) {
                                var33 = 15;
                            }
                            if (var32 == 5) {
                                var33 = 37;
                            }
                            if (var32 == 6) {
                                var33 = 16;
                            }
                            if (var32 == 7) {
                                var33 = 46;
                            }
                            if (var32 == 8) {
                                var33 = 66;
                            }
                            if (var32 == 9) {
                                var33 = 51;
                            }
                            if (var13.field2543[var32] != null) {
                                if (var13.field2568 < 0) {
                                    class72.method580(class135.field3269, var33, var13.field2543[var32], -108, 0, var13.field2568 & 0x7FFF, var13.field2575);
                                } else {
                                    class72.method580(class135.field3269, var33, var13.field2543[var32], -113, 0, 0, var13.field2568);
                                }
                            }
                        }
                    }
                } else if (!var13.field2552 || class4.method28((byte) -124, arg10, var12) || class14.field393) {
                    method141(arg0, arg1, var14, arg3, var15, 1265840112, var15 + var13.field2611, var14 - -var13.field2636, arg8, var13.field2547, arg10, var12);
                    if (var13.field2562 != null) {
                        method141(var13.field2562, arg1, var14, arg3, var15, 1265840112, var13.field2611 + var15, var13.field2636 + var14, arg8, var13.field2547, arg10, var13.field2568);
                    }
                    if (var13.field2538 > var13.field2611) {
                        class22.method174(arg10, var13.field2611, var13.field2636 + var14, arg1, var15, var13, arg8, var13.field2538, (byte) -88);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 484)
    public static void method142(boolean arg0) {
        field467 = null;
        field482 = null;
        field472 = null;
        field469 = null;
        if (arg0) {
            field473 = null;
        }
        field480 = null;
        field477 = null;
        field465 = null;
        field473 = null;
        field466 = null;
        field475 = null;
        field463 = null;
        field479 = null;
        field476 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 517)
    public static final void method143(int arg0) {
        if (class60.field1464 != null) {
            class60.field1464.method350(-5918);
        }
        if (arg0 >= -53) {
            field467 = null;
        }
        field468++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lab;I)V", line = 548)
    public static final void method144(class3 arg0, int arg1) {
        if (class69.field1636 == arg0.field65 || arg0.field85 == -1 || arg0.field82 != 0 || arg0.field57 + 1 > class78.method605(arg0.field85, (byte) 20).field1742[arg0.field109]) {
            int var2 = arg0.field65 - arg0.field102;
            int var3 = class69.field1636 - arg0.field102;
            int var4 = arg0.field84 * 64 + arg0.field67 * 128;
            int var5 = arg0.field84 * 64 + arg0.field106 * 128;
            int var6 = arg0.field84 * 64 + arg0.field62 * 128;
            int var7 = arg0.field84 * 64 + arg0.field74 * 128;
            arg0.field120 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field112 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg0.field107 = 0;
        field471++;
        if (arg1 != 12218) {
            field469 = null;
        }
        if (arg0.field79 == 0) {
            arg0.field47 = 1024;
        }
        if (arg0.field79 == 1) {
            arg0.field47 = 1536;
        }
        if (arg0.field79 == 2) {
            arg0.field47 = 0;
        }
        if (arg0.field79 == 3) {
            arg0.field47 = 512;
        }
        arg0.field51 = arg0.field47;
    }
}
