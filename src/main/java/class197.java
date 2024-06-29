import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class197 extends class154 {

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public int field3013 = -1;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field3015 = 0;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Ltd;")
    public static class225 field3011 = new class225(64);

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field3019 = 500;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field3018 = 0;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[C")
    public static char[] field3022 = new char[128];

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "Z")
    public static volatile boolean field3020 = false;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public int field3007;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "[I")
    public static int[] field3023;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Lfh;")
    public static final class114 method1241(int arg0, byte arg1) {
        field3017++;
        if (arg0 == 0) {
            return new class11();
        } else if (arg0 == 1) {
            return new class111();
        } else if (arg0 == 2) {
            return new class5();
        } else if (arg0 == 3) {
            return new class249();
        } else if (arg0 == 4) {
            return new class229();
        } else if (arg0 == 5) {
            return new class37();
        } else if (arg0 == 6) {
            return new class32();
        } else if (arg0 == 7) {
            return new class102();
        } else if (arg0 == 8) {
            return new class183();
        } else if (arg0 == 9) {
            return new class279();
        } else if (arg0 == 10) {
            return new class209();
        } else if (arg0 == 11) {
            return new class174();
        } else if (arg0 == 12) {
            return new class8();
        } else if (arg0 == 13) {
            return new class262();
        } else if (arg0 == 14) {
            return new class44();
        } else if (arg0 == 15) {
            return new class110();
        } else if (arg0 == 16) {
            return new class137();
        } else if (arg0 == 17) {
            return new class278();
        } else if (arg0 == 18) {
            return new class84();
        } else if (arg0 == 19) {
            return new class265();
        } else if (arg0 == 20) {
            return new class260();
        } else if (arg0 == 21) {
            return new class42();
        } else if (arg0 == 22) {
            return new class190();
        } else if (arg0 == 23) {
            return new class12();
        } else if (arg0 == 24) {
            return new class254();
        } else if (arg0 == 25) {
            return new class182();
        } else if (arg0 == 26) {
            return new class169();
        } else if (arg0 == 27) {
            return new class300();
        } else if (arg0 == 28) {
            return new class192();
        } else if (arg0 == 29) {
            return new class101();
        } else if (arg0 == 30) {
            return new class275();
        } else if (arg0 == 31) {
            return new class312();
        } else if (arg0 == 32) {
            return new class298();
        } else if (arg0 == 33) {
            return new class184();
        } else if (arg0 == 34) {
            return new class89();
        } else if (arg0 == 35) {
            return new class261();
        } else if (arg0 == 36) {
            return new class257();
        } else if (arg0 == 37) {
            return new class96();
        } else if (arg0 == 38) {
            return new class3();
        } else if (arg0 == 39) {
            return new class288();
        } else {
            if (arg1 > -58) {
                field3011 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lrl;[I[II[I)V")
    public static final void method1242(class310 arg0, int[] arg1, int[] arg2, int arg3, int[] arg4) {
        field3024++;
        if (arg3 < 79) {
            field3011 = null;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && var9 < arg0.field4110.length; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg0.field4110[var9] = null;
                    } else {
                        class195 var10 = class280.method1815(var7, -102);
                        class113 var11 = arg0.field4110[var9];
                        int var12 = var10.field2967;
                        if (var11 != null) {
                            if (var11.field1619 == var7) {
                                if (var12 == 0) {
                                    var11 = arg0.field4110[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field1626 = 0;
                                    var11.field1620 = 1;
                                    var11.field1624 = var8;
                                    var11.field1622 = 0;
                                    var11.field1623 = 0;
                                    class181.method1152(false, arg0.field4081, 0, arg0.field4140, false, var10);
                                } else if (var12 == 2) {
                                    var11.field1622 = 0;
                                }
                            } else if (var10.field2992 >= class280.method1815(var11.field1619, -15).field2992) {
                                var11 = arg0.field4110[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class113 var13 = arg0.field4110[var9] = new class113();
                            var13.field1620 = 1;
                            var13.field1626 = 0;
                            var13.field1624 = var8;
                            var13.field1619 = var7;
                            var13.field1622 = 0;
                            var13.field1623 = 0;
                            class181.method1152(false, arg0.field4081, 0, arg0.field4140, false, var10);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lnh;I)V")
    public static final void method1243(class305 arg0, int arg1) {
        class115.field1667 = class263.method1709(true, class195.field2993, arg0);
        class72.field1041 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var5 = (float) (class226.field3536[var2] >> 16 & 0xFF);
            float var6 = (float) (class226.field3536[var2] >> 8 & 0xFF);
            int var7 = (class226.field3536[var2 + 1] & 0xFF0000) >> 16;
            float var8 = ((float) var7 - var5) / 64.0F;
            int var9 = class226.field3536[var2 + 1] >> 8 & 0xFF;
            float var10 = (float) (class226.field3536[var2] & 0xFF);
            int var11 = class226.field3536[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            float var13 = ((float) var9 - var6) / 64.0F;
            for (int var14 = 0; var14 < 64; var14++) {
                class72.field1041[var2 * 64 + var14] = class161.method1003(class161.method1003((int) var5 << 16, (int) var6 << 8), (int) var10);
                var6 += var13;
                var5 += var8;
                var10 += var12;
            }
        }
        field3005++;
        for (int var3 = 192; var3 < 255; var3++) {
            class72.field1041[var3] = class226.field3536[3];
        }
        class228.field3575 = new int[32768];
        class261.field4207 = new int[32768];
        class191.method1205(126, (class74) null);
        class112.field1605 = new int[32768];
        class129.field1795 = new int[32768];
        class187.field2837 = new class203(128, 254);
        int var4 = 75 / (-arg1 / 50);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[Lim;IIIIIZ)V")
    public static final void method1244(int arg0, int arg1, int arg2, class178[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field3012++;
        class266.method1747(arg0, arg4, arg8, arg7);
        class118.method765();
        if (arg9) {
            field3019 = 61;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class178 var11 = arg3[var10];
            if (var11 != null && (var11.field2675 == arg6 || arg6 == -1412584499 && class8.field92 == var11)) {
                int var12;
                if (arg1 == -1) {
                    class78.field1092[class261.field4206] = var11.field2667 + arg5;
                    class82.field1135[class261.field4206] = var11.field2554 + arg2;
                    class112.field1611[class261.field4206] = var11.field2529;
                    class282.field4496[class261.field4206] = var11.field2571;
                    var12 = class261.field4206++;
                } else {
                    var12 = arg1;
                }
                var11.field2704 = class35.field533;
                var11.field2540 = var12;
                if (!var11.field2611 || !client.method2032(var11)) {
                    if (var11.field2694 > 0) {
                        class232.method1522((byte) -26, var11);
                    }
                    int var13 = var11.field2554 + arg2;
                    int var14 = var11.field2667 + arg5;
                    int var15 = var11.field2695;
                    if (class16.field288 && (client.method2028(var11).field4739 != 0 || var11.field2608 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class8.field92 == var11) {
                        if (arg6 != -1412584499 && !var11.field2658) {
                            class129.field1800 = arg3;
                            class218.field3385 = arg2;
                            class57.field792 = arg5;
                            continue;
                        }
                        if (class275.field4372 && class225.field3529) {
                            int var16 = class249.field3891;
                            int var17 = var16 - class252.field3944;
                            int var18 = class17.field304;
                            int var19 = var18 - class38.field579;
                            if (class98.field1429 > var19) {
                                var19 = class98.field1429;
                            }
                            if (class138.field1892 > var17) {
                                var17 = class138.field1892;
                            }
                            if ((class138.field1892 + class276.field4384.field2571) < (var11.field2571 + var17)) {
                                var17 = class276.field4384.field2571 + class138.field1892 - var11.field2571;
                            }
                            var13 = var17;
                            if ((var19 + var11.field2529) > (class98.field1429 + class276.field4384.field2529)) {
                                var19 = class98.field1429 + class276.field4384.field2529 - var11.field2529;
                            }
                            var14 = var19;
                        }
                        if (!var11.field2658) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field2608 == 2) {
                        var22 = arg4;
                        var24 = arg7;
                        var25 = arg8;
                        var20 = arg0;
                    } else {
                        var20 = var14 > arg0 ? var14 : arg0;
                        int var21 = var11.field2571 + var13;
                        var22 = var13 > arg4 ? var13 : arg4;
                        int var23 = var11.field2529 + var14;
                        if (var11.field2608 == 9) {
                            var23++;
                            var21++;
                        }
                        var24 = var21 >= arg7 ? arg7 : var21;
                        var25 = var23 < arg8 ? var23 : arg8;
                    }
                    if (!var11.field2611 || var25 > var20 && var24 > var22) {
                        if (var11.field2694 != 0) {
                            if (var11.field2694 == 1337 || var11.field2694 == 1403) {
                                class215.field3250 = var11;
                                class164.field2334 = var14;
                                class255.field4034 = var13;
                                class186.method1180(256, var11.field2571, var11.field2529, var11.field2694 == 1403, var14, var13);
                                class274.field4355[var12] = true;
                                class266.method1747(arg0, arg4, arg8, arg7);
                                continue;
                            }
                            if (var11.field2694 == 1338) {
                                if (!var11.method1131(-25766)) {
                                    continue;
                                }
                                class158.method985(!arg9, var11, var12, var13, var14);
                                class266.method1747(arg0, arg4, arg8, arg7);
                                if (class249.field3897 != 0 && class249.field3897 != 3 || class171.field2447 || var20 > class302.field4804 || class179.field2717 < var22 || class302.field4804 >= var25 || class179.field2717 >= var24) {
                                    continue;
                                }
                                int var26 = class302.field4804 - var14;
                                int var27 = class179.field2717 - var13;
                                int var28 = var11.field2528[var27];
                                if (var28 > var26 || var11.field2631[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var27 - var11.field2571 / 2;
                                int var30 = var26 - var11.field2529 / 2;
                                int var31;
                                if (class12.field203 == 4) {
                                    var31 = (int) class123.field1743 & 0x7FF;
                                } else {
                                    var31 = (int) class123.field1743 + class179.field2712 & 0x7FF;
                                }
                                int var32 = class118.field1697[var31];
                                int var33 = class118.field1690[var31];
                                if (class12.field203 != 4) {
                                    var33 = (class42.field627 + 256) * var33 >> 8;
                                    var32 = (class42.field627 + 256) * var32 >> 8;
                                }
                                int var34 = var29 * var32 + (var30 * var33) >> 11;
                                int var35 = var29 * var33 - (var30 * var32) >> 11;
                                int var36;
                                int var37;
                                if (class12.field203 == 4) {
                                    var36 = class50.field711 - var35 >> 7;
                                    var37 = class249.field3894 + var34 >> 7;
                                } else {
                                    var37 = class250.field3905.field4081 + var34 - (class250.field3905.method1683(-116) + -1) * 64 >> 7;
                                    var36 = class250.field3905.field4140 - var35 - ((class250.field3905.method1683(-110) + -1) * 64) >> 7;
                                }
                                if (class193.field2950 && (class202.field3052 & 0x40) != 0) {
                                    class178 var38 = class14.method96(-1, class142.field1952, class195.field2994);
                                    if (var38 == null) {
                                        class21.method140(-8252);
                                    } else {
                                        class82.method518(class121.field1729, (short) 46, class225.field3526, " ->", var36, var37, 1L, (byte) 109);
                                    }
                                    continue;
                                }
                                if (class188.field2856 == 1) {
                                    class82.method518(-1, (short) 31, class288.field4601, "", var36, var37, 1L, (byte) 99);
                                }
                                class82.method518(-1, (short) 48, class199.field3034, "", var36, var37, 1L, (byte) 79);
                                continue;
                            }
                            if (var11.field2694 == 1339) {
                                if (var11.method1131(-25766)) {
                                    class31.method194(var12, var13, var11, var14, false);
                                    class266.method1747(arg0, arg4, arg8, arg7);
                                }
                                continue;
                            }
                            if (var11.field2694 == 1400) {
                                class243.method1599(var14, var11.field2571, 109, var13, var11.field2529);
                                class274.field4355[var12] = true;
                                class30.field459[var12] = true;
                                class266.method1747(arg0, arg4, arg8, arg7);
                                continue;
                            }
                            if (var11.field2694 == 1401) {
                                class303.method2022(var11.field2529, var13, var11.field2571, -44, var14);
                                class274.field4355[var12] = true;
                                class30.field459[var12] = true;
                                class266.method1747(arg0, arg4, arg8, arg7);
                                continue;
                            }
                            if (var11.field2694 == 1402) {
                                class165.method1053(65280, var14, var13);
                                class274.field4355[var12] = true;
                                class30.field459[var12] = true;
                                continue;
                            }
                            if (var11.field2694 == 1405) {
                                if (!class223.field3481) {
                                    continue;
                                }
                                int var39 = var14 + var11.field2529;
                                int var40 = var13 + 15;
                                int var41 = 16776960;
                                class17.field293.method229("Fps:" + class15.field266, var39, var40, 16776960, -1);
                                Runtime var42 = Runtime.getRuntime();
                                int var129 = var40 + 15;
                                int var43 = 0;
                                int var44 = (int) ((var42.totalMemory() - var42.freeMemory()) / 1024L);
                                if (var44 > 65536) {
                                    var41 = 16711680;
                                }
                                int var45 = 0;
                                int var46 = 0;
                                class17.field293.method229("Mem:" + var44 + "k", var39, var129, var41, -1);
                                for (int var47 = 0; var47 < 29; var47++) {
                                    var43 += class150.field2090[var47].method539(-103);
                                    var45 += class150.field2090[var47].method535(75);
                                    var46 += class150.field2090[var47].method543(-124);
                                }
                                var40 = var129 + 15;
                                int var48 = var46 * 100 / var43;
                                int var49 = var45 * 10000 / var43;
                                int var50 = 16776960;
                                String var51 = "Cache:" + class190.method1200(44, (long) var49, 2, 0, true) + "% (" + var48 + "%)";
                                class301.field4788.method229(var51, var39, var40, var50, -1);
                                var40 += 12;
                                if (class220.field3412 > 0) {
                                    class301.field4788.method229("Particles: " + class220.field3399 + " / " + class220.field3412, var39, var40, var50, -1);
                                }
                                var40 += 12;
                                class274.field4355[var12] = true;
                                class30.field459[var12] = true;
                                continue;
                            }
                            if (var11.field2694 == 1406) {
                                class43.field646 = var13;
                                class236.field3674 = var14;
                                class175.field2477 = var11;
                                continue;
                            }
                        }
                        if (!class171.field2447) {
                            if (var11.field2608 == 0 && var11.field2689 && var20 <= class302.field4804 && class179.field2717 >= var22 && var25 > class302.field4804 && class179.field2717 < var24 && !class16.field288) {
                                class205.field3062[0] = class229.field3595;
                                class137.field1877[0] = "";
                                class84.field1186[0] = class43.field645;
                                class151.field2101[0] = 1008;
                                class179.field2721 = 1;
                            }
                            if (var20 <= class302.field4804 && var22 <= class179.field2717 && var25 > class302.field4804 && class179.field2717 < var24) {
                                class281.method1824(class179.field2717 - var13, var11, class302.field4804 - var14, (byte) -111);
                            }
                        }
                        if (var11.field2608 == 0) {
                            if (!var11.field2611 && client.method2032(var11) && class271.field4315 != var11) {
                                continue;
                            }
                            if (!var11.field2611) {
                                if (var11.field2701 > (var11.field2579 - var11.field2571)) {
                                    var11.field2701 = var11.field2579 - var11.field2571;
                                }
                                if (var11.field2701 < 0) {
                                    var11.field2701 = 0;
                                }
                            }
                            method1244(var20, var12, var13 - var11.field2701, arg3, var22, var14 - var11.field2644, var11.field2545, var24, var25, false);
                            if (var11.field2642 != null) {
                                method1244(var20, var12, var13 - var11.field2701, var11.field2642, var22, var14 - var11.field2644, var11.field2545, var24, var25, false);
                            }
                            class60 var52 = (class60) class186.field2821.method1453(true, (long) var11.field2545);
                            if (var52 != null) {
                                if (var52.field834 == 0 && !class171.field2447 && class302.field4804 >= var20 && class179.field2717 >= var22 && var25 > class302.field4804 && class179.field2717 < var24 && !class16.field288) {
                                    class179.field2721 = 1;
                                    class151.field2101[0] = 1008;
                                    class205.field3062[0] = class229.field3595;
                                    class84.field1186[0] = class43.field645;
                                    class137.field1877[0] = "";
                                }
                                class276.method1795(var25, var24, var14, var13, -1, var20, var12, var52.field831, var22);
                            }
                            class266.method1747(arg0, arg4, arg8, arg7);
                            class118.method765();
                        }
                        if (class291.field4640[var12] || class83.field1143 > 1) {
                            if (var11.field2608 == 0 && !var11.field2611 && var11.field2571 < var11.field2579) {
                                class209.method1302(var13, var11.field2529 + var14, var11.field2701, var11.field2579, 17, var11.field2571);
                            }
                            if (var11.field2608 != 1) {
                                if (var11.field2608 == 2) {
                                    int var53 = 0;
                                    for (int var54 = 0; var54 < var11.field2660; var54++) {
                                        for (int var55 = 0; var55 < var11.field2530; var55++) {
                                            int var56 = (var11.field2587 + 32) * var54 + var13;
                                            int var57 = var14 + ((var11.field2624 + 32) * var55);
                                            if (var53 < 20) {
                                                var56 += var11.field2680[var53];
                                                var57 += var11.field2679[var53];
                                            }
                                            if (var11.field2618[var53] > 0) {
                                                boolean var59 = false;
                                                int var60 = var11.field2618[var53] - 1;
                                                boolean var61 = false;
                                                if ((var57 + 32) > arg0 && arg8 > var57 && arg4 < (var56 + 32) && arg7 > var56 || class307.field4933 == var11 && class90.field1315 == var53) {
                                                    class108 var62;
                                                    if (class265.field4266 == 1 && class83.field1142 == var53 && class288.field4593 == var11.field2545) {
                                                        var62 = class243.method1596((class69) null, 0, var11.field2691[var53], var60, var11.field2563, (byte) 70, 2);
                                                    } else {
                                                        var62 = class243.method1596((class69) null, 3153952, var11.field2691[var53], var60, var11.field2563, (byte) 42, 1);
                                                    }
                                                    if (class118.field1691) {
                                                        class274.field4355[var12] = true;
                                                    }
                                                    if (var62 == null) {
                                                        class312.method2108(false, var11);
                                                    } else if (class307.field4933 == var11 && class90.field1315 == var53) {
                                                        int var63 = class17.field304 - class151.field2100;
                                                        int var64 = class249.field3891 - class310.field4997;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (var63 < 5 && var63 > -5) {
                                                            var63 = 0;
                                                        }
                                                        if (class232.field3633 < 5) {
                                                            var63 = 0;
                                                            var64 = 0;
                                                        }
                                                        var62.method683(var57 + var63, var56 + var64, 128);
                                                        if (arg6 != -1) {
                                                            class178 var65 = arg3[arg6 & 0xFFFF];
                                                            int var66 = class266.field4281;
                                                            int var67 = class266.field4280;
                                                            if ((var56 + var64) < var66 && var65.field2701 > 0) {
                                                                int var68 = (var66 - var56 - var64) * class208.field3094 / 3;
                                                                if (var68 > (class208.field3094 * 10)) {
                                                                    var68 = class208.field3094 * 10;
                                                                }
                                                                if (var65.field2701 < var68) {
                                                                    var68 = var65.field2701;
                                                                }
                                                                class310.field4997 += var68;
                                                                var65.field2701 -= var68;
                                                                class312.method2108(false, var65);
                                                            }
                                                            if (var67 < var56 + var64 + 32 && var65.field2701 < (var65.field2579 - var65.field2571)) {
                                                                int var69 = (var56 + var64 + 32 - var67) * class208.field3094 / 3;
                                                                if (var69 > class208.field3094 * 10) {
                                                                    var69 = class208.field3094 * 10;
                                                                }
                                                                if (var69 > var65.field2579 - var65.field2701 - var65.field2571) {
                                                                    var69 = var65.field2579 - var65.field2701 - var65.field2571;
                                                                }
                                                                var65.field2701 += var69;
                                                                class310.field4997 -= var69;
                                                                class312.method2108(false, var65);
                                                            }
                                                        }
                                                    } else if (class229.field3590 == var11 && class275.field4366 == var53) {
                                                        var62.method683(var57, var56, 128);
                                                    } else {
                                                        var62.method694(var57, var56);
                                                    }
                                                }
                                            } else if (var11.field2597 != null && var53 < 20) {
                                                class108 var58 = var11.method1137((byte) -109, var53);
                                                if (var58 != null) {
                                                    var58.method694(var57, var56);
                                                } else if (class231.field3611) {
                                                    class312.method2108(false, var11);
                                                }
                                            }
                                            var53++;
                                        }
                                    }
                                } else if (var11.field2608 == 3) {
                                    int var70;
                                    if (class250.method1628(-33, var11)) {
                                        var70 = var11.field2632;
                                        if (class271.field4315 == var11 && var11.field2583 != 0) {
                                            var70 = var11.field2583;
                                        }
                                    } else {
                                        var70 = var11.field2544;
                                        if (class271.field4315 == var11 && var11.field2699 != 0) {
                                            var70 = var11.field2699;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2676) {
                                            class266.method1730(var14, var13, var11.field2529, var11.field2571, var70);
                                        } else {
                                            class266.method1743(var14, var13, var11.field2529, var11.field2571, var70);
                                        }
                                    } else if (var11.field2676) {
                                        class266.method1748(var14, var13, var11.field2529, var11.field2571, var70, 256 - (var15 & 0xFF));
                                    } else {
                                        class266.method1723(var14, var13, var11.field2529, var11.field2571, var70, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2608 == 4) {
                                    class33 var71 = var11.method1138((byte) 93, class260.field4196);
                                    if (var71 != null) {
                                        String var72 = var11.field2630;
                                        int var73;
                                        if (class250.method1628(-33, var11)) {
                                            var73 = var11.field2632;
                                            if (class271.field4315 == var11 && var11.field2583 != 0) {
                                                var73 = var11.field2583;
                                            }
                                            if (var11.field2609.length() > 0) {
                                                var72 = var11.field2609;
                                            }
                                        } else {
                                            var73 = var11.field2544;
                                            if (class271.field4315 == var11 && var11.field2699 != 0) {
                                                var73 = var11.field2699;
                                            }
                                        }
                                        if (var11.field2611 && var11.field2560 != -1) {
                                            class10 var74 = class281.method1822((byte) -98, var11.field2560);
                                            var72 = var74.field147;
                                            if (var72 == null) {
                                                var72 = "null";
                                            }
                                            if ((var74.field150 == 1 || var11.field2629 != 1) && var11.field2629 != -1) {
                                                var72 = "<col=ff9040>" + var72 + "</col> x" + class265.method1720((byte) 123, var11.field2629);
                                            }
                                        }
                                        if (class76.field1074 == var11) {
                                            var72 = class93.field1361;
                                            var73 = var11.field2544;
                                        }
                                        if (!var11.field2611) {
                                            var72 = class158.method981(var72, var11, (byte) 93);
                                        }
                                        var71.method210(var72, var14, var13, var11.field2529, var11.field2571, var73, var11.field2645 ? 0 : -1, var11.field2595, var11.field2536, var11.field2575);
                                    } else if (class231.field3611) {
                                        class312.method2108(false, var11);
                                    }
                                } else if (var11.field2608 == 5) {
                                    if (!var11.field2611) {
                                        class108 var75 = var11.method1133(class250.method1628(-33, var11), -2030044762);
                                        if (var75 != null) {
                                            var75.method694(var14, var13);
                                        } else if (class231.field3611) {
                                            class312.method2108(false, var11);
                                        }
                                    } else if (var11.field2663 >= 0) {
                                        class214 var76 = var11.method1136(-70);
                                        var76.method1344(0, var14, var13, var11.field2529, var11.field2571, var11.field2703, var11.field2600, 0);
                                    } else {
                                        class108 var77;
                                        if (var11.field2560 == -1) {
                                            var77 = var11.method1133(false, -2030044762);
                                        } else if (var11.field2639 && class250.field3905.field5066 != null) {
                                            var77 = class243.method1596(class250.field3905.field5066, var11.field2640, var11.field2629, var11.field2560, var11.field2563, (byte) 35, var11.field2650);
                                        } else {
                                            var77 = class243.method1596((class69) null, var11.field2640, var11.field2629, var11.field2560, var11.field2563, (byte) 92, var11.field2650);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field1538;
                                            int var79 = var77.field1534;
                                            if (var11.field2551) {
                                                int var80 = (var11.field2529 + var78 - 1) / var78;
                                                int var81 = (var79 + var11.field2571 - 1) / var79;
                                                class266.method1724(var14, var13, var11.field2529 + var14, var11.field2571 + var13);
                                                for (int var82 = 0; var82 < var80; var82++) {
                                                    for (int var83 = 0; var83 < var81; var83++) {
                                                        if (var11.field2584 != 0) {
                                                            var77.method692((byte) 121, 4096, var79 / 2 + var79 * var83 + var13, var78 / 2 + var78 * var82 + var14, var11.field2584);
                                                        } else if (var15 == 0) {
                                                            var77.method694(var78 * var82 + var14, var79 * var83 + var13);
                                                        } else {
                                                            var77.method683(var78 * var82 + var14, var79 * var83 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class266.method1747(arg0, arg4, arg8, arg7);
                                            } else {
                                                int var84 = var11.field2529 * 4096 / var78;
                                                if (var11.field2584 != 0) {
                                                    var77.method692((byte) 124, var84, var13 + (var11.field2571 / 2), var14 - -(var11.field2529 / 2), var11.field2584);
                                                } else if (var15 != 0) {
                                                    var77.method691(var14, var13, var11.field2529, var11.field2571, 256 - (var15 & 0xFF));
                                                } else if (var11.field2529 == var78 && var11.field2571 == var79) {
                                                    var77.method694(var14, var13);
                                                } else {
                                                    var77.method685(var14, var13, var11.field2529, var11.field2571);
                                                }
                                            }
                                        } else if (class231.field3611) {
                                            class312.method2108(false, var11);
                                        }
                                    }
                                } else if (var11.field2608 == 6) {
                                    boolean var85 = class250.method1628(-33, var11);
                                    class94 var86 = null;
                                    int var87;
                                    if (var85) {
                                        var87 = var11.field2678;
                                    } else {
                                        var87 = var11.field2558;
                                    }
                                    int var88 = 0;
                                    if (var11.field2560 != -1) {
                                        class10 var93 = class281.method1822((byte) -109, var11.field2560);
                                        if (var93 != null) {
                                            class10 var94 = var93.method60(var11.field2629, -1);
                                            class195 var95 = var87 == -1 ? null : class280.method1815(var87, -37);
                                            if (var11.field2639 && class250.field3905.field5066 != null) {
                                                var86 = var94.method65(var11.field2681, var11.field2562, class250.field3905.field5066, 1, var11.field2566, (byte) -120, var95);
                                            } else {
                                                var86 = var94.method65(var11.field2681, var11.field2562, (class69) null, 1, var11.field2566, (byte) -120, var95);
                                            }
                                            if (var86 == null) {
                                                class312.method2108(arg9, var11);
                                            } else {
                                                var88 = -var86.method9() / 2;
                                            }
                                        }
                                    } else if (var11.field2581 == 5) {
                                        if (var11.field2693 == -1) {
                                            var86 = class190.field2881.method452(-1, 65535, 0, true, (class195) null, -1, 0, -1, (class195) null, -1, false, (class113[]) null);
                                        } else {
                                            int var90 = var11.field2693;
                                            class314 var91;
                                            if (class305.field4917 == var90) {
                                                var91 = class250.field3905;
                                            } else {
                                                var91 = class48.field689[var90];
                                            }
                                            class195 var92 = var87 == -1 ? null : class280.method1815(var87, -11);
                                            if (var91 != null && (var90 == 2047 || class36.method248(var91.field5053, 94) == var11.field2635)) {
                                                var86 = var91.field5066.method452(var11.field2562, 65535, 0, true, (class195) null, -1, 0, -1, var92, 0, false, (class113[]) null);
                                            }
                                        }
                                    } else if (var87 == -1) {
                                        var86 = var11.method1126(class250.field3905.field5066, -1, -1, true, var85, (class195) null, 0);
                                        if (var86 == null && class231.field3611) {
                                            class312.method2108(false, var11);
                                        }
                                    } else {
                                        class195 var89 = class280.method1815(var87, -37);
                                        var86 = var11.method1126(class250.field3905.field5066, var11.field2562, var11.field2681, true, var85, var89, var11.field2566);
                                        if (var86 == null && class231.field3611) {
                                            class312.method2108(arg9, var11);
                                        }
                                    }
                                    if (var86 != null) {
                                        int var96;
                                        if (var11.field2589 > 0) {
                                            var96 = (var11.field2529 << 8) / var11.field2589;
                                        } else {
                                            var96 = 256;
                                        }
                                        int var97;
                                        if (var11.field2646 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field2571 << 8) / var11.field2646;
                                        }
                                        int var98 = (var11.field2592 * var96 >> 8) + var11.field2529 / 2 + var14;
                                        int var99 = var11.field2571 / 2 + (var11.field2673 * var97 >> 8) + var13;
                                        class118.method769(var98, var99);
                                        int var100 = class118.field1697[var11.field2627] * var11.field2682 >> 16;
                                        int var101 = class118.field1690[var11.field2627] * var11.field2682 >> 16;
                                        if (!var11.field2611) {
                                            var86.method428(0, var11.field2569, 0, var11.field2627, 0, var100, var101, -1L);
                                        } else if (var11.field2628) {
                                            ((class66) var86).method408(0, var11.field2569, var11.field2625, var11.field2627, var11.field2577, var100 - (-var88 - var11.field2613), var11.field2613 + var101, var11.field2682);
                                        } else {
                                            var86.method428(0, var11.field2569, var11.field2625, var11.field2627, var11.field2577, var11.field2613 + var88 + var100, var11.field2613 + var101, -1L);
                                        }
                                        class118.method761();
                                    }
                                } else {
                                    if (var11.field2608 == 7) {
                                        class33 var102 = var11.method1138((byte) 93, class260.field4196);
                                        if (var102 == null) {
                                            if (class231.field3611) {
                                                class312.method2108(arg9, var11);
                                            }
                                            continue;
                                        }
                                        int var103 = 0;
                                        for (int var104 = 0; var104 < var11.field2660; var104++) {
                                            for (int var105 = 0; var105 < var11.field2530; var105++) {
                                                if (var11.field2618[var103] > 0) {
                                                    class10 var106 = class281.method1822((byte) -99, var11.field2618[var103] - 1);
                                                    String var107;
                                                    if (var106.field150 != 1 && var11.field2691[var103] == 1) {
                                                        var107 = "<col=ff9040>" + var106.field147 + "</col>";
                                                    } else {
                                                        var107 = "<col=ff9040>" + var106.field147 + "</col> x" + class265.method1720((byte) 49, var11.field2691[var103]);
                                                    }
                                                    int var108 = (var11.field2624 + 115) * var105 + var14;
                                                    int var109 = (var11.field2587 + 12) * var104 + var13;
                                                    if (var11.field2595 == 0) {
                                                        var102.method206(var107, var108, var109, var11.field2544, var11.field2645 ? 0 : -1);
                                                    } else if (var11.field2595 == 1) {
                                                        var102.method211(var107, var108 + 57, var109, var11.field2544, var11.field2645 ? 0 : -1);
                                                    } else {
                                                        var102.method229(var107, var108 + 114, var109, var11.field2544, var11.field2645 ? 0 : -1);
                                                    }
                                                }
                                                var103++;
                                            }
                                        }
                                    }
                                    if (var11.field2608 == 8 && class36.field549 == var11 && class7.field79 == class272.field4344) {
                                        int var110 = 0;
                                        int var111 = 0;
                                        class33 var112 = class17.field293;
                                        String var113 = var11.field2630;
                                        String var114 = class158.method981(var113, var11, (byte) 85);
                                        while (var114.length() > 0) {
                                            int var122 = var114.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var114;
                                                var114 = "";
                                            } else {
                                                var123 = var114.substring(0, var122);
                                                var114 = var114.substring(var122 + 4);
                                            }
                                            int var124 = var112.method230(var123);
                                            var111 += var112.field484 + 1;
                                            if (var124 > var110) {
                                                var110 = var124;
                                            }
                                        }
                                        var110 += 6;
                                        var111 += 7;
                                        int var115 = var11.field2571 + var13 + 5;
                                        int var116 = var11.field2529 + var14 - var110 - 5;
                                        if (var116 < var14 + 5) {
                                            var116 = var14 + 5;
                                        }
                                        if (var110 + var116 > arg8) {
                                            var116 = arg8 - var110;
                                        }
                                        if (var115 + var111 > arg7) {
                                            var115 = arg7 - var111;
                                        }
                                        class266.method1730(var116, var115, var110, var111, 16777120);
                                        class266.method1743(var116, var115, var110, var111, 0);
                                        String var117 = var11.field2630;
                                        int var118 = var115 + var112.field484 + 2;
                                        String var119 = class158.method981(var117, var11, (byte) 97);
                                        while (var119.length() > 0) {
                                            int var120 = var119.indexOf("<br>");
                                            String var121;
                                            if (var120 == -1) {
                                                var121 = var119;
                                                var119 = "";
                                            } else {
                                                var121 = var119.substring(0, var120);
                                                var119 = var119.substring(var120 + 4);
                                            }
                                            var112.method206(var121, var116 + 3, var118, 0, -1);
                                            var118 += var112.field484 + 1;
                                        }
                                    }
                                    if (var11.field2608 == 9) {
                                        int var125;
                                        int var126;
                                        int var127;
                                        int var128;
                                        if (var11.field2622) {
                                            var125 = var11.field2529 + var14;
                                            var126 = var13;
                                            var127 = var11.field2571 + var13;
                                            var128 = var14;
                                        } else {
                                            var128 = var14;
                                            var125 = var11.field2529 + var14;
                                            var127 = var13;
                                            var126 = var11.field2571 + var13;
                                        }
                                        if (var11.field2668 == 1) {
                                            class266.method1728(var128, var127, var125, var126, var11.field2544);
                                        } else {
                                            class266.method1736(var128, var127, var125, var126, var11.field2544, var11.field2668);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field3011 = null;
        field3023 = null;
        field3022 = null;
        if (arg0 != 64) {
            field3023 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
    public static final int method1246(byte arg0, int arg1) {
        field3004++;
        if (arg0 <= 88) {
            field3022 = null;
        }
        return arg1 >>> 8;
    }
}
