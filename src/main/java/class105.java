import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class105 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "[I")
    public static int[] field1541 = new int[50];

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1542 = 0;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field1546 = -1;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "[J")
    public static long[] field1550 = new long[200];

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public int field1540;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 9)
    public static void method714(byte arg0) {
        field1550 = null;
        if (arg0 == 77) {
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIILbo;)V", line = 22)
    public static final void method715(int arg0, int arg1, int arg2, int arg3, class256 arg4) {
        field1549++;
        if (class185.field3070 >= 400) {
            return;
        }
        if (arg4.field4080 != null) {
            arg4 = arg4.method1843(-1);
        }
        if (arg4 == null || !arg4.field4073) {
            return;
        }
        if (arg2 <= 36) {
            method714((byte) -24);
        }
        String var5 = arg4.field4070;
        if (arg4.field4093 != 0) {
            String var6 = class15.field169 == 1 ? class97.field1383 : class109.field1613;
            var5 = var5 + class178.method1335(arg4.field4093, 0, class191.field3129.field5205) + " (" + var6 + arg4.field4093 + ")";
        }
        if (class8.field119 == 1) {
            class20.method111(class64.field925, arg0, arg1, class229.field3644 + " -> <col=ffff00>" + var5, (short) 20, class223.field3562, 1, (long) arg3);
            class225.field3607++;
        } else if (class142.field2216) {
            class168 var14 = class301.field4728 == -1 ? null : class36.method194(class301.field4728, -19375);
            if ((class158.field2615 & 0x2) != 0 && (var14 == null || arg4.method1828(true, var14.field2773, class301.field4728) != var14.field2773)) {
                class20.method111(class141.field2204, arg0, arg1, class200.field3247 + " -> <col=ffff00>" + var5, (short) 44, class331.field5165, 1, (long) arg3);
                class281.field4527++;
            }
        } else {
            class224.field3575++;
            String[] var7 = arg4.field4086;
            if (class60.field840) {
                var7 = class153.method1107(var7, -55);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class15.field169 != 0 || !var7[var8].equalsIgnoreCase(class261.field4172))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 21;
                        }
                        class155.field2378++;
                        if (var8 == 1) {
                            var9 = 51;
                        }
                        int var10 = -1;
                        if (arg4.field4094 == var8) {
                            var10 = arg4.field4083;
                        }
                        if (arg4.field4104 == var8) {
                            var10 = arg4.field4099;
                        }
                        if (var8 == 2) {
                            var9 = 41;
                        }
                        if (var8 == 3) {
                            var9 = 11;
                        }
                        if (var8 == 4) {
                            var9 = 12;
                        }
                        class20.method111(var7[var8], arg0, arg1, "<col=ffff00>" + var5, var9, var10, 1, (long) arg3);
                    }
                }
            }
            if (class15.field169 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class261.field4172)) {
                        class316.field4895++;
                        short var12 = 0;
                        if (arg4.field4093 > class191.field3129.field5205) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 21;
                        }
                        if (var11 == 1) {
                            var13 = 51;
                        }
                        if (var11 == 2) {
                            var13 = 41;
                        }
                        if (var11 == 3) {
                            var13 = 11;
                        }
                        if (var11 == 4) {
                            var13 = 12;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class20.method111(var7[var11], arg0, arg1, "<col=ffff00>" + var5, var13, arg4.field4118, 1, (long) arg3);
                    }
                }
            }
            class20.method111(class63.field918, arg0, arg1, "<col=ffff00>" + var5, (short) 1005, class227.field3622, 1, (long) arg3);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Z", line = 182)
    public static final boolean method716(byte arg0, int arg1) {
        field1536++;
        byte var2 = 0;
        if (arg0 >= -18) {
            field1550 = (long[]) null;
        }
        byte var3 = 0;
        if (class54.field764 == null) {
            if (class232.field3690 || class327.field5064 == null) {
                class54.field764 = new class220(512, 512);
            } else {
                class54.field764 = (class220) class327.field5064;
            }
            int[] var4 = class54.field764.field3545;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = ((var3 + 103 - var7) * 512 * 4) + 24628;
                for (int var9 = var2 + 1; var9 < 103 - var2; var9++) {
                    if ((class129.field2025[arg1][var9][var7] & 0x18) == 0) {
                        class64.method431(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class129.field2025[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class64.method431(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class18.field249 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class297.method2117(class49.field698, var10 + var2, var11 - -var3);
                    if (var12 != 0L) {
                        class97 var14 = class69.method454(false, Integer.MAX_VALUE & (int) (var12 >>> 32));
                        int var15 = var14.field1319;
                        if (var14.field1387 != null) {
                            for (int var16 = 0; var16 < var14.field1387.length; var16++) {
                                if (var14.field1387[var16] != -1) {
                                    class97 var17 = class69.method454(false, var14.field1387[var16]);
                                    if (var17.field1319 >= 0) {
                                        var15 = var17.field1319;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var11 + var3;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class126.field1964[class49.field698].field1592;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > (var10 - 3) && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var10 + 3 > var18 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > (var11 - 3) && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class235.field3763[class18.field249] = var14.field1345;
                            class169.field2800[class18.field249] = var18 - var2;
                            class285.field4576[class18.field249] = var19 - var3;
                            class18.field249++;
                        }
                    }
                }
            }
        }
        class54.field764.method1565();
        int var23 = ((int) (Math.random() * 20.0D)) + 228 << 16;
        int var24 = (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + (((int) (Math.random() * 20.0D)) + 228 << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class129.field2025[arg1][var2 + var26][var3 + var25] & 0x18) == 0 && !class252.method1818(var2, arg1, var25, -1536, var26, var23, var24, var3)) {
                    if (class232.field3690) {
                        class59.field833 = null;
                    } else {
                        class8.field120.method2345((byte) -115);
                    }
                    return false;
                }
                if (arg1 < 3 && (class129.field2025[arg1 + 1][var26 + var2][var25 + var3] & 0x8) != 0 && !class252.method1818(var2, arg1 + 1, var25, -1536, var26, var23, var24, var3)) {
                    if (class232.field3690) {
                        class59.field833 = null;
                    } else {
                        class8.field120.method2345((byte) -128);
                    }
                    return false;
                }
            }
        }
        if (class232.field3690) {
            int[] var27 = class54.field764.field3545;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class327.field5064 = new class314(class54.field764);
        } else {
            class327.field5064 = class54.field764;
        }
        if (class232.field3690) {
            class59.field833 = null;
        } else {
            class8.field120.method2345((byte) -115);
        }
        class54.field764 = null;
        return true;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 420)
    public static final void method717(byte arg0) {
        field1539++;
        class320.method2252(class307.field4783, 0);
        class333.field5189++;
        if (class210.field3446 && class31.field424) {
            int var1 = class70.field995;
            int var2 = var1 - class76.field1067;
            if (var2 < class158.field2608) {
                var2 = class158.field2608;
            }
            if (class158.field2608 + class194.field3181.field2468 < class307.field4783.field2468 + var2) {
                var2 = class158.field2608 - (class307.field4783.field2468 - class194.field3181.field2468);
            }
            int var3 = var2 - class252.field4024;
            int var4 = class233.field3738;
            int var5 = class307.field4783.field2554;
            int var6 = class194.field3181.field2499 + var2 - class158.field2608;
            int var7 = var4 - class307.field4792;
            if (arg0 > -92) {
                method716((byte) 32, 124);
            }
            if (class276.field4459 > var7) {
                var7 = class276.field4459;
            }
            if ((class307.field4783.field2520 + var7) > (class276.field4459 + class194.field3181.field2520)) {
                var7 = class194.field3181.field2520 + class276.field4459 - class307.field4783.field2520;
            }
            int var8 = var7 - class117.field1780;
            if (class333.field5189 > class307.field4783.field2523 && (var5 < var3 || (-var5) > var3 || var5 < var8 || (-var5) > var8)) {
                class344.field5355 = true;
            }
            int var9 = var7 + class194.field3181.field2591 - class276.field4459;
            if (class307.field4783.field2549 != null && class344.field5355) {
                class39 var10 = new class39();
                var10.field500 = class307.field4783;
                var10.field516 = var6;
                var10.field498 = var9;
                var10.field501 = class307.field4783.field2549;
                class144.method1065(var10, (byte) 67);
            }
            if (class99.field1446 == 0) {
                if (class344.field5355) {
                    if (class307.field4783.field2501 != null) {
                        class39 var11 = new class39();
                        var11.field500 = class307.field4783;
                        var11.field499 = class240.field3805;
                        var11.field516 = var6;
                        var11.field501 = class307.field4783.field2501;
                        var11.field498 = var9;
                        class144.method1065(var11, (byte) 67);
                    }
                    if (class240.field3805 != null && client.method769(class307.field4783) != null) {
                        class289.field4641++;
                        class194.field3175.method2375(80, 0);
                        class194.field3175.method264(class240.field3805.field2482, true);
                        class194.field3175.method283((byte) -51, class307.field4783.field2486);
                        class194.field3175.method266(class307.field4783.field2482, false);
                        class194.field3175.method270(8, class240.field3805.field2486);
                    }
                } else if ((class113.field1731 == 1 || class207.method1501(-1, class185.field3070 - 1)) && class185.field3070 > 2) {
                    class116.method797(15);
                } else if (class185.field3070 > 0) {
                    class198.method1457(0);
                }
                class307.field4783 = null;
            }
        } else if (class333.field5189 > 1) {
            class307.field4783 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V", line = 548)
    public static final void method718(byte arg0) {
        field1545++;
        if (class70.field996 == 5 && arg0 == 41) {
            class70.field996 = 6;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lt;", line = 582)
    public static final class339 method719(int arg0, int arg1) {
        if (arg0 <= 71) {
            method717((byte) -82);
        }
        field1548++;
        return class103.field1507 && arg1 >= class108.field1604 && class145.field2262 >= arg1 ? class280.field4515[arg1 - class108.field1604] : null;
    }
}
