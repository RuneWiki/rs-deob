import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class202 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lvf;")
    public static class265 field3612 = class87.method582(-46, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lvf;")
    public static class265 field3618 = class87.method582(-46, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public static boolean field3624 = false;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lvf;")
    private static class265 field3625 = class87.method582(-46, "Loading fonts )2 ");

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lvf;")
    public static class265 field3617 = field3625;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lvf;")
    public static class265 field3616 = class87.method582(-46, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
    public static int[] field3621 = new int[4];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Z")
    public static boolean field3626 = false;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Lfl;")
    public static class192 field3627;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3622++;
        int var6 = arg1 - arg0;
        if (arg2 != 45443148) {
            field3624 = false;
        }
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class25.method229(-100, arg5, arg0, arg3, arg4);
            }
        } else if (var7 == 0) {
            class260.method1733(arg4, arg3, -1, arg0, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (class107.field1890 > arg0) {
                var10 = var9 + (class107.field1890 * var8 >> 12);
                var11 = class107.field1890;
            } else if (class79.field1510 >= arg0) {
                var10 = arg4;
                var11 = arg0;
            } else {
                var10 = (class79.field1510 * var8 >> 12) + var9;
                var11 = class79.field1510;
            }
            int var12;
            int var13;
            if (class107.field1890 > arg1) {
                var12 = class107.field1890;
                var13 = (class107.field1890 * var8 >> 12) + var9;
            } else if (class79.field1510 < arg1) {
                var13 = var9 + (class79.field1510 * var8 >> 12);
                var12 = class79.field1510;
            } else {
                var12 = arg1;
                var13 = arg5;
            }
            if (class81.field1521 > var13) {
                var13 = class81.field1521;
                var12 = (class81.field1521 - var9 << 12) / var8;
            } else if (var13 > class205.field3681) {
                var13 = class205.field3681;
                var12 = (class205.field3681 - var9 << 12) / var8;
            }
            if (class81.field1521 > var10) {
                var10 = class81.field1521;
                var11 = (class81.field1521 - var9 << 12) / var8;
            } else if (var10 > class205.field3681) {
                var10 = class205.field3681;
                var11 = (class205.field3681 - var9 << 12) / var8;
            }
            class283.method1919(var11, arg3, (byte) -84, var13, var12, var10);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static void method1385(byte arg0) {
        field3621 = null;
        field3627 = null;
        field3625 = null;
        field3618 = null;
        field3612 = null;
        if (arg0 != 0) {
            field3627 = null;
        }
        field3616 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != -77) {
            method1386(51, 19, 98, -16, 105, 64, -31, (byte) 103, 43);
        }
        for (int var9 = 0; var9 < class126.field2260.field2713; var9++) {
            if (class126.field2260.method1005(false, var9)) {
                int var10 = class126.field2260.field2705[var9] - class269.field4796;
                int var11 = class176.field3141 + class155.field2871 - class126.field2260.field2709[var9] - 1;
                int var12 = (arg4 - arg1) * (var11 - arg6) / (arg8 - arg6) + arg1;
                int var13 = (var10 - arg0) * (arg5 - arg2) / (arg3 - arg0) + arg2;
                int var14 = class126.field2260.method997((byte) -128, var9);
                int var15 = 16777215;
                class92 var16 = null;
                if (var14 == 0) {
                    if ((double) class101.field1793 == 3.0D) {
                        var16 = class246.field4277;
                    }
                    if ((double) class101.field1793 == 4.0D) {
                        var16 = class208.field3755;
                    }
                    if ((double) class101.field1793 == 6.0D) {
                        var16 = class214.field3837;
                    }
                    if ((double) class101.field1793 >= 8.0D) {
                        var16 = class100.field1781;
                    }
                }
                if (var14 == 1) {
                    if ((double) class101.field1793 == 3.0D) {
                        var16 = class214.field3837;
                    }
                    if ((double) class101.field1793 == 4.0D) {
                        var16 = class100.field1781;
                    }
                    if ((double) class101.field1793 == 6.0D) {
                        var16 = class121.field2135;
                    }
                    if ((double) class101.field1793 >= 8.0D) {
                        var16 = class257.field4396;
                    }
                }
                if (var14 == 2) {
                    if ((double) class101.field1793 == 3.0D) {
                        var16 = class121.field2135;
                    }
                    var15 = 16755200;
                    if ((double) class101.field1793 == 4.0D) {
                        var16 = class257.field4396;
                    }
                    if ((double) class101.field1793 == 6.0D) {
                        var16 = class95.field1680;
                    }
                    if ((double) class101.field1793 >= 8.0D) {
                        var16 = class201.field3603;
                    }
                }
                if (class126.field2260.field2699[var9] != -1) {
                    var15 = class126.field2260.field2699[var9];
                }
                if (var16 != null) {
                    int var17 = class263.field4592.method774(class126.field2260.field2702[var9], (int[]) null, class163.field2971);
                    int var18 = var12 - (var17 - 1) * var16.method629() / 2;
                    int var19 = var18 + var16.method628() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class265 var21 = class163.field2971[var20];
                        if (var20 < (var17 - 1)) {
                            var21.method1798(var21.method1808((byte) -15) - 4, (byte) 126);
                        }
                        var16.method633(var21, var13, var19, var15, true);
                        var19 += var16.method629();
                    }
                }
            }
        }
        field3619++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILdk;JLdk;Ldk;)V")
    public static final void method1387(int arg0, int arg1, int arg2, int arg3, class179 arg4, long arg5, class179 arg6, class179 arg7) {
        class212 var9 = new class212();
        var9.field3805 = arg4;
        var9.field3811 = arg1 * 128 + 64;
        var9.field3815 = arg2 * 128 + 64;
        var9.field3808 = arg3;
        var9.field3802 = arg5;
        var9.field3809 = arg6;
        var9.field3814 = arg7;
        int var10 = 0;
        class137 var11 = class200.field3577[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2502; var12++) {
                class146 var13 = var11.field2506[var12];
                if ((var13.field2720 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2737.method141();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3807 = -var10;
        if (class200.field3577[arg0][arg1][arg2] == null) {
            class200.field3577[arg0][arg1][arg2] = new class137(arg0, arg1, arg2);
        }
        class200.field3577[arg0][arg1][arg2].field2511 = var9;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3614++;
        class142 var10 = null;
        if (arg6 != 255) {
            method1386(77, 82, -37, -98, -22, -60, -53, (byte) 18, 87);
        }
        for (class142 var11 = (class142) class53.field1105.method789((byte) -121); var11 != null; var11 = (class142) class53.field1105.method787((byte) -76)) {
            if (var11.field2641 == arg9 && var11.field2638 == arg8 && var11.field2637 == arg1 && var11.field2642 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class142();
            var10.field2642 = arg0;
            var10.field2638 = arg8;
            var10.field2641 = arg9;
            var10.field2637 = arg1;
            class225.method1523(-5366, var10);
            class53.field1105.method785(var10, -29);
        }
        var10.field2639 = arg2;
        var10.field2634 = arg3;
        var10.field2640 = arg4;
        var10.field2645 = arg7;
        var10.field2627 = arg5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIZI[[[Lac;I)Z")
    public static final boolean method1389(int arg0, int arg1, boolean arg2, int arg3, class137[][][] arg4, int arg5) {
        if (arg1 != 3) {
            return true;
        }
        field3628++;
        byte var6 = arg2 ? 1 : (byte) (class257.field4401 & 0xFF);
        if (class261.field4570[class216.field3902][arg3][arg0] == var6) {
            return false;
        } else if ((class230.field4064[class216.field3902][arg3][arg0] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class8.field268[var8] = arg3;
            int var31 = var8 + 1;
            class80.field1513[var8] = arg0;
            class261.field4570[class216.field3902][arg3][arg0] = var6;
            while (var7 != var31) {
                int var9 = (class8.field268[var7] & 0xFFB552) >> 16;
                int var10 = class8.field268[var7] & 0xFFFF;
                int var11 = class8.field268[var7] >> 24 & 0xFF;
                int var12 = class80.field1513[var7] & 0xFFFF;
                int var13 = class80.field1513[var7] >> 16 & 0xFF;
                var7 = var7 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class230.field4064[class216.field3902][var10][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label229: for (int var16 = class216.field3902 + 1; var16 <= 3; var16++) {
                    if ((class230.field4064[var16][var10][var12] & 0x8) == 0) {
                        if (var15 && arg4[var16][var10][var12] != null) {
                            if (arg4[var16][var10][var12].field2518 != null) {
                                int var19 = class214.method1461(-49, var9);
                                if (arg4[var16][var10][var12].field2518.field2681 == var19 || arg4[var16][var10][var12].field2518.field2684 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class214.method1461(-72, var11);
                                    if (arg4[var16][var10][var12].field2518.field2681 == var20 || arg4[var16][var10][var12].field2518.field2684 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class214.method1461(arg1 ^ 0xFFFFFF9B, var13);
                                    if (arg4[var16][var10][var12].field2518.field2681 == var21 || arg4[var16][var10][var12].field2518.field2684 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var10][var12].field2506 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var10][var12].field2502; var22++) {
                                    int var23 = (int) (arg4[var16][var10][var12].field2506[var22].field2720 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg4[var16][var10][var12].field2506[var22].field2720 >> 20 & 0x3L);
                                    int var25 = var23 | var24 << 6;
                                    if (var9 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        class137 var26 = arg4[var16][var10][var12];
                        var14 = true;
                        if (var26 != null && var26.field2502 > 0) {
                            for (int var27 = 0; var27 < var26.field2502; var27++) {
                                class146 var28 = var26.field2506[var27];
                                if (var28.field2733 != var28.field2728 || var28.field2721 != var28.field2719) {
                                    for (int var29 = var28.field2728; var29 <= var28.field2733; var29++) {
                                        for (int var30 = var28.field2719; var30 <= var28.field2721; var30++) {
                                            class261.field4570[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class261.field4570[var16][var10][var12] = var6;
                    }
                }
                if (var14) {
                    if (class39.field897[arg5] < class279.field4936[class216.field3902 + 1][var10][var12]) {
                        class39.field897[arg5] = class279.field4936[class216.field3902 + 1][var10][var12];
                    }
                    int var17 = var10 << 7;
                    if (class25.field698[arg5] > var17) {
                        class25.field698[arg5] = var17;
                    } else if (var17 > client.field3859[arg5]) {
                        client.field3859[arg5] = var17;
                    }
                    int var18 = var12 << 7;
                    if (var18 < class16.field465[arg5]) {
                        class16.field465[arg5] = var18;
                    } else if (class249.field4324[arg5] < var18) {
                        class249.field4324[arg5] = var18;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class261.field4570[class216.field3902][var10 - 1][var12] != var6) {
                        class8.field268[var31] = class144.method992(class144.method992(1179648, var10 - 1), -754974720);
                        class80.field1513[var31] = class144.method992(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class261.field4570[class216.field3902][var10 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var10 - 1) >= 0 && class261.field4570[class216.field3902][var10 - 1][var12] != var6 && (class230.field4064[class216.field3902][var10][var12] & 0x4) == 0 && (class230.field4064[class216.field3902][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class8.field268[var31] = class144.method992(class144.method992(1179648, var10 - 1), 1375731712);
                            class80.field1513[var31] = class144.method992(var12, 1245184);
                            class261.field4570[class216.field3902][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class261.field4570[class216.field3902][var10][var12] != var6) {
                            class8.field268[var31] = class144.method992(318767104, class144.method992(5373952, var10));
                            class80.field1513[var31] = class144.method992(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class261.field4570[class216.field3902][var10][var12] = var6;
                        }
                        if (var10 + 1 < 104 && class261.field4570[class216.field3902][var10 + 1][var12] != var6 && (class230.field4064[class216.field3902][var10][var12] & 0x4) == 0 && (class230.field4064[class216.field3902][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class8.field268[var31] = class144.method992(class144.method992(var10 + 1, 5373952), -1845493760);
                            class80.field1513[var31] = class144.method992(5439488, var12);
                            class261.field4570[class216.field3902][var10 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class261.field4570[class216.field3902][var10 + 1][var12] != var6) {
                        class8.field268[var31] = class144.method992(class144.method992(9568256, var10 + 1), 1392508928);
                        class80.field1513[var31] = class144.method992(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class261.field4570[class216.field3902][var10 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class261.field4570[class216.field3902][var10 - 1][var12] != var6 && (class230.field4064[class216.field3902][var10][var12] & 0x4) == 0 && (class230.field4064[class216.field3902][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class8.field268[var31] = class144.method992(class144.method992(var10 - 1, 13762560), 301989888);
                            class80.field1513[var31] = class144.method992(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class261.field4570[class216.field3902][var10 - 1][var12] = var6;
                        }
                        if (class261.field4570[class216.field3902][var10][var12] != var6) {
                            class8.field268[var31] = class144.method992(-1828716544, class144.method992(var10, 13762560));
                            class80.field1513[var31] = class144.method992(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class261.field4570[class216.field3902][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class261.field4570[class216.field3902][var10 + 1][var12] != var6 && (class230.field4064[class216.field3902][var10][var12] & 0x4) == 0 && (class230.field4064[class216.field3902][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class8.field268[var31] = class144.method992(class144.method992(9568256, var10 + 1), -771751936);
                            class80.field1513[var31] = class144.method992(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class261.field4570[class216.field3902][var10 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class39.field897[arg5] != -1000000) {
                class39.field897[arg5] += 10;
                class25.field698[arg5] -= 50;
                client.field3859[arg5] += 50;
                class249.field4324[arg5] += 50;
                class16.field465[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
    public static final boolean method1390(int arg0, int arg1) {
        field3615++;
        if (class263.field4594[arg1]) {
            return true;
        }
        if (arg0 != 2) {
            field3617 = null;
        }
        if (!class245.field4276.method1307(arg1, (byte) -120)) {
            return false;
        }
        int var2 = class245.field4276.method1331(arg1, (byte) 122);
        if (var2 == 0) {
            class263.field4594[arg1] = true;
            return true;
        }
        if (class178.field3174[arg1] == null) {
            class178.field3174[arg1] = new class6[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class178.field3174[arg1][var3] == null) {
                byte[] var4 = class245.field4276.method1332(true, var3, arg1);
                if (var4 != null) {
                    class6 var5 = class178.field3174[arg1][var3] = new class6();
                    var5.field219 = (arg1 << 16) + var3;
                    if (var4[0] == -1) {
                        var5.method33(new class135(var4), (byte) -85);
                    } else {
                        var5.method39(new class135(var4), (byte) -63);
                    }
                }
            }
        }
        class263.field4594[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Lhg;")
    public static final class146 method1391(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2502; var4++) {
            class146 var5 = var3.field2506[var4];
            if ((var5.field2720 >> 29 & 0x3L) == 2L && var5.field2728 == arg1 && var5.field2719 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
