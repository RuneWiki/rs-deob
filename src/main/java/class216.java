import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class216 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field3821 = 0;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lha;")
    public static class46 field3822 = class271.method1828("(U0a )2 non)2existant gosub script)2num: ", -46);

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lha;")
    public static class46 field3829 = class271.method1828(" (X", -46);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lwf;")
    public static class16 field3818 = new class16(64);

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lha;")
    public static class46 field3830 = class271.method1828("Wordpack geladen)3", -46);

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Lha;")
    public static class46 field3832 = class271.method1828(" )2>", -46);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lha;")
    public static class46 field3833 = class271.method1828(" <col=ffffff>", -46);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lpi;")
    public static class181 field3824;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lhi;")
    public static class24 field3831;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Z")
    public static boolean field3828;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static final void method1511(int arg0) {
        class98.field1814 = null;
        field3819++;
        class10.field171 = null;
        class120.field2249 = null;
        class92.field1719 = null;
        class46.field807 = null;
        class162.field2874 = null;
        if (arg0 != 16085) {
            method1513((class181) null, -128, 33);
        }
        class236.field4100 = null;
        class234.field4061 = null;
        class170.field3023 = null;
        class120.field2251 = null;
        class70.field1210 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ldj;IIII)V")
    public static final void method1512(class78 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3825++;
        if (class242.field4290 >= 400) {
            return;
        }
        if (arg0.field1448 != null) {
            arg0 = arg0.method620(-17713);
        }
        if (arg0 == null || !arg0.field1464 || arg4 != -1) {
            return;
        }
        class46 var5 = arg0.field1498;
        if (arg0.field1487 != 0) {
            var5 = class109.method855(0, new class46[] { var5, class12.method65(false, class277.field4824.field1550, arg0.field1487), field3829, class63.field1074, class115.method932(false, arg0.field1487), class221.field3885 });
        }
        if (class31.field585 == 1) {
            class39.method267((short) 48, class89.field1687, arg3, class109.method855(0, new class46[] { class32.field606, class6.field98, var5 }), arg1, (long) arg2, -1);
            class154.field2724++;
        } else if (!class187.field3339) {
            class99.field1835++;
            class46[] var6 = arg0.field1479;
            if (class156.field2795) {
                var6 = class141.method1070(104, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class32.field601 != 0 || !var6[var7].method315((byte) -38, class229.field3996))) {
                        class226.field3951++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 45;
                        }
                        if (var7 == 1) {
                            var8 = 21;
                        }
                        if (var7 == 2) {
                            var8 = 49;
                        }
                        if (var7 == 3) {
                            var8 = 33;
                        }
                        if (var7 == 4) {
                            var8 = 25;
                        }
                        class39.method267(var8, var6[var7], arg3, class109.method855(0, new class46[] { class220.field3875, var5 }), arg1, (long) arg2, arg4);
                    }
                }
            }
            if (class32.field601 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method315((byte) -38, class229.field3996)) {
                        short var10 = 0;
                        if (class277.field4824.field1550 < arg0.field1487) {
                            var10 = 2000;
                        }
                        class80.field1521++;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 45;
                        }
                        if (var9 == 1) {
                            var11 = 21;
                        }
                        if (var9 == 2) {
                            var11 = 49;
                        }
                        if (var9 == 3) {
                            var11 = 33;
                        }
                        if (var9 == 4) {
                            var11 = 25;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class39.method267(var11, var6[var9], arg3, class109.method855(0, new class46[] { class220.field3875, var5 }), arg1, (long) arg2, arg4);
                    }
                }
            }
            class39.method267((short) 1001, class202.field3622, arg3, class109.method855(0, new class46[] { class220.field3875, var5 }), arg1, (long) arg2, -1);
        } else if ((class248.field4382 & 0x2) == 2) {
            class269.field4649++;
            class39.method267((short) 7, class64.field1083, arg3, class109.method855(0, new class46[] { class16.field232, class6.field98, var5 }), arg1, (long) arg2, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lpi;II)[Lrk;")
    public static final class179[] method1513(class181 arg0, int arg1, int arg2) {
        if (arg1 != 1179648) {
            field3821 = 18;
        }
        field3823++;
        return class54.method386(arg2, arg0, -13377) ? class37.method253(arg1 ^ 0x12342D) : null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1514(byte arg0) {
        field3824 = null;
        field3829 = null;
        field3822 = null;
        field3832 = null;
        if (arg0 != -64) {
            method1512((class78) null, -81, -36, 58, -32);
        }
        field3830 = null;
        field3818 = null;
        field3831 = null;
        field3833 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BZI[[[Lmk;II)Z")
    public static final boolean method1515(byte arg0, boolean arg1, int arg2, class201[][][] arg3, int arg4, int arg5) {
        if (arg0 != -39) {
            field3818 = null;
        }
        byte var6 = arg1 ? 1 : (byte) (class252.field4443 & 0xFF);
        field3826++;
        if (class60.field1001[class135.field2450][arg2][arg4] == var6) {
            return false;
        } else if ((class111.field2081[class135.field2450][arg2][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class162.field2877[var7] = arg2;
            int var31 = var7 + 1;
            class96.field1794[var7] = arg4;
            int var8 = 0;
            class60.field1001[class135.field2450][arg2][arg4] = var6;
            while (var31 != var8) {
                int var9 = class162.field2877[var8] & 0xFFFF;
                int var10 = class162.field2877[var8] >> 16 & 0xFF;
                int var11 = class96.field1794[var8] & 0xFFFF;
                int var12 = (class96.field1794[var8] & 0xFFB641) >> 16;
                int var13 = class162.field2877[var8] >> 24 & 0xFF;
                boolean var14 = false;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class111.field2081[class135.field2450][var9][var11] & 0x4) == 0) {
                    var14 = true;
                }
                label229: for (int var16 = class135.field2450 + 1; var16 <= 3; var16++) {
                    if ((class111.field2081[var16][var9][var11] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var11] != null) {
                            if (arg3[var16][var9][var11].field3589 != null) {
                                int var19 = class197.method1405(var10, 0);
                                if (arg3[var16][var9][var11].field3589.field4468 == var19 || arg3[var16][var9][var11].field3589.field4473 == var19) {
                                    continue;
                                }
                                if (var13 != 0) {
                                    int var20 = class197.method1405(var13, arg0 ^ 0xFFFFFFD9);
                                    if (arg3[var16][var9][var11].field3589.field4468 == var20 || arg3[var16][var9][var11].field3589.field4473 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class197.method1405(var12, 0);
                                    if (arg3[var16][var9][var11].field3589.field4468 == var21 || arg3[var16][var9][var11].field3589.field4473 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var11].field3600 != null) {
                                for (int var22 = 0; var22 < arg3[var16][var9][var11].field3585; var22++) {
                                    int var23 = (int) (arg3[var16][var9][var11].field3600[var22].field3523 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg3[var16][var9][var11].field3600[var22].field3523 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var10 == var25 || var13 != 0 && var13 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class201 var26 = arg3[var16][var9][var11];
                        if (var26 != null && var26.field3585 > 0) {
                            for (int var27 = 0; var27 < var26.field3585; var27++) {
                                class197 var28 = var26.field3600[var27];
                                if (var28.field3541 != var28.field3540 || var28.field3533 != var28.field3530) {
                                    for (int var29 = var28.field3541; var29 <= var28.field3540; var29++) {
                                        for (int var30 = var28.field3533; var30 <= var28.field3530; var30++) {
                                            class60.field1001[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class60.field1001[var16][var9][var11] = var6;
                    }
                }
                if (var15) {
                    if (class119.field2228[class135.field2450 + 1][var9][var11] > class98.field1825[arg5]) {
                        class98.field1825[arg5] = class119.field2228[class135.field2450 + 1][var9][var11];
                    }
                    int var17 = var11 << 7;
                    int var18 = var9 << 7;
                    if (class84.field1606[arg5] > var18) {
                        class84.field1606[arg5] = var18;
                    } else if (var18 > class89.field1691[arg5]) {
                        class89.field1691[arg5] = var18;
                    }
                    if (var17 < class102.field1860[arg5]) {
                        class102.field1860[arg5] = var17;
                    } else if (class15.field228[arg5] < var17) {
                        class15.field228[arg5] = var17;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class60.field1001[class135.field2450][var9 - 1][var11] != var6) {
                        class162.field2877[var31] = class235.method1595(class235.method1595(1179648, var9 - 1), -754974720);
                        class96.field1794[var31] = class235.method1595(var11, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class60.field1001[class135.field2450][var9 - 1][var11] = var6;
                    }
                    var11++;
                    if (var11 < 104) {
                        if ((var9 - 1) >= 0 && class60.field1001[class135.field2450][var9 - 1][var11] != var6 && (class111.field2081[class135.field2450][var9][var11] & 0x4) == 0 && (class111.field2081[class135.field2450][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class162.field2877[var31] = class235.method1595(1375731712, class235.method1595(1179648, var9 - 1));
                            class96.field1794[var31] = class235.method1595(1245184, var11);
                            class60.field1001[class135.field2450][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class60.field1001[class135.field2450][var9][var11] != var6) {
                            class162.field2877[var31] = class235.method1595(class235.method1595(5373952, var9), 318767104);
                            class96.field1794[var31] = class235.method1595(var11, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class60.field1001[class135.field2450][var9][var11] = var6;
                        }
                        if (var9 + 1 < 104 && class60.field1001[class135.field2450][var9 + 1][var11] != var6 && (class111.field2081[class135.field2450][var9][var11] & 0x4) == 0 && (class111.field2081[class135.field2450][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class162.field2877[var31] = class235.method1595(-1845493760, class235.method1595(5373952, var9 + 1));
                            class96.field1794[var31] = class235.method1595(var11, 5439488);
                            class60.field1001[class135.field2450][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if ((var9 + 1) < 104 && class60.field1001[class135.field2450][var9 + 1][var11] != var6) {
                        class162.field2877[var31] = class235.method1595(1392508928, class235.method1595(9568256, var9 + 1));
                        class96.field1794[var31] = class235.method1595(var11, 9633792);
                        class60.field1001[class135.field2450][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class60.field1001[class135.field2450][var9 - 1][var11] != var6 && (class111.field2081[class135.field2450][var9][var11] & 0x4) == 0 && (class111.field2081[class135.field2450][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class162.field2877[var31] = class235.method1595(class235.method1595(var9 - 1, 13762560), 301989888);
                            class96.field1794[var31] = class235.method1595(13828096, var11);
                            class60.field1001[class135.field2450][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class60.field1001[class135.field2450][var9][var11] != var6) {
                            class162.field2877[var31] = class235.method1595(-1828716544, class235.method1595(13762560, var9));
                            class96.field1794[var31] = class235.method1595(var11, 13828096);
                            class60.field1001[class135.field2450][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class60.field1001[class135.field2450][var9 + 1][var11] != var6 && (class111.field2081[class135.field2450][var9][var11] & 0x4) == 0 && (class111.field2081[class135.field2450][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class162.field2877[var31] = class235.method1595(-771751936, class235.method1595(9568256, var9 + 1));
                            class96.field1794[var31] = class235.method1595(var11, 9633792);
                            class60.field1001[class135.field2450][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class98.field1825[arg5] != -1000000) {
                class98.field1825[arg5] += 10;
                class84.field1606[arg5] -= 50;
                class89.field1691[arg5] += 50;
                class15.field228[arg5] += 50;
                class102.field1860[arg5] -= 50;
            }
            return true;
        }
    }
}
