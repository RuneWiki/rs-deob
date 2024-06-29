import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class151 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lda;")
    private static class275 field2623 = class255.method1672(122, "Allocated memory");

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lda;")
    public static class275 field2640 = field2623;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lma;")
    public static class105 field2636;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "Lma;")
    public static class105 field2648;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lma;BLma;)I")
    public static final int method1067(class105 arg0, byte arg1, class105 arg2) {
        field2638++;
        int var3 = 0;
        if (arg1 != -56) {
            method1071(true, false);
        }
        if (arg2.method784(class262.field4553, -2)) {
            var3++;
        }
        if (arg2.method784(class87.field1470, arg1 ^ 0x36)) {
            var3++;
        }
        if (arg2.method784(class227.field3838, -2)) {
            var3++;
        }
        if (arg0.method784(class262.field4553, -2)) {
            var3++;
        }
        if (arg0.method784(class87.field1470, -2)) {
            var3++;
        }
        if (arg0.method784(class227.field3838, -2)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lda;IIIJII)V")
    public static final void method1068(class275 arg0, int arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        field2634++;
        class85 var8 = new class85(128);
        var8.method575((byte) 126, 10);
        var8.method600((int) (Math.random() * 99999.0D), (byte) 92);
        var8.method600(517, (byte) 121);
        var8.method560(arg4, -126);
        var8.method586(-95, (int) (Math.random() * 9.9999999E7D));
        var8.method584((byte) 85, arg0);
        var8.method586(-107, (int) (Math.random() * 9.9999999E7D));
        var8.method600(class160.field2813, (byte) 18);
        var8.method575((byte) 124, arg5);
        var8.method575((byte) 127, arg3);
        var8.method586(arg2 - 6108, (int) (Math.random() * 9.9999999E7D));
        var8.method600(arg1, (byte) 76);
        var8.method600(arg6, (byte) 32);
        var8.method586(31, (int) (Math.random() * 9.9999999E7D));
        var8.method612(class106.field1836, -43, class185.field3168);
        class149.field2597.field1392 = 0;
        class149.field2597.method575((byte) 126, 183);
        class149.field2597.method575((byte) 125, var8.field1392);
        class149.field2597.method563(var8.field1392, (byte) 125, var8.field1381, 0);
        class52.field872 = 0;
        if (arg2 != 6214) {
            field2626 = -100;
        }
        class79.field1300 = 1;
        class179.field3082 = 0;
        class175.field3030 = -3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([[[Lhb;IIZII)Z")
    public static final boolean method1069(class3[][][] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2629++;
        if (arg4 >= -38) {
            method1070((byte) -127);
        }
        byte var6 = arg3 ? 1 : (byte) (class168.field2925 & 0xFF);
        if (class241.field4225[class159.field2790][arg5][arg2] == var6) {
            return false;
        } else if ((class72.field1168[class159.field2790][arg5][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class150.field2617[var7] = arg5;
            int var31 = var7 + 1;
            class8.field123[var7] = arg2;
            class241.field4225[class159.field2790][arg5][arg2] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class150.field2617[var8] & 0xFFFF;
                int var10 = (class150.field2617[var8] & 0xFFD43B) >> 16;
                int var11 = class150.field2617[var8] >> 24 & 0xFF;
                int var12 = class8.field123[var8] & 0xFFFF;
                int var13 = (class8.field123[var8] & 0xFFCE20) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class72.field1168[class159.field2790][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label229: for (int var16 = class159.field2790 + 1; var16 <= 3; var16++) {
                    if ((class72.field1168[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field50 != null) {
                                int var19 = class90.method654(-19, var10);
                                if (arg0[var16][var9][var12].field50.field2439 == var19 || arg0[var16][var9][var12].field50.field2441 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class90.method654(-19, var11);
                                    if (arg0[var16][var9][var12].field50.field2439 == var20 || arg0[var16][var9][var12].field50.field2441 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class90.method654(-19, var13);
                                    if (arg0[var16][var9][var12].field50.field2439 == var21 || arg0[var16][var9][var12].field50.field2441 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg0[var16][var9][var12].field48 != null) {
                                for (int var22 = 0; var22 < arg0[var16][var9][var12].field29; var22++) {
                                    int var23 = (int) (arg0[var16][var9][var12].field48[var22].field608 >> 20 & 0x3L);
                                    int var24 = (int) (arg0[var16][var9][var12].field48[var22].field608 >> 14 & 0x3FL);
                                    if (var24 == 21) {
                                        var24 = 19;
                                    }
                                    int var25 = var24 | var23 << 6;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class3 var26 = arg0[var16][var9][var12];
                        if (var26 != null && var26.field29 > 0) {
                            for (int var27 = 0; var27 < var26.field29; var27++) {
                                class37 var28 = var26.field48[var27];
                                if (var28.field616 != var28.field610 || var28.field617 != var28.field604) {
                                    for (int var29 = var28.field616; var29 <= var28.field610; var29++) {
                                        for (int var30 = var28.field617; var30 <= var28.field604; var30++) {
                                            class241.field4225[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class241.field4225[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = var9 << 7;
                    if (class205.field3478[arg1] < class92.field1575[class159.field2790 + 1][var9][var12]) {
                        class205.field3478[arg1] = class92.field1575[class159.field2790 + 1][var9][var12];
                    }
                    int var18 = var12 << 7;
                    if (var17 < class256.field4508[arg1]) {
                        class256.field4508[arg1] = var17;
                    } else if (var17 > class209.field3527[arg1]) {
                        class209.field3527[arg1] = var17;
                    }
                    if (class32.field482[arg1] > var18) {
                        class32.field482[arg1] = var18;
                    } else if (var18 > class23.field350[arg1]) {
                        class23.field350[arg1] = var18;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class241.field4225[class159.field2790][var9 - 1][var12] != var6) {
                        class150.field2617[var31] = class246.method1612(class246.method1612(var9 - 1, 1179648), -754974720);
                        class8.field123[var31] = class246.method1612(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class241.field4225[class159.field2790][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var9 - 1 >= 0 && class241.field4225[class159.field2790][var9 - 1][var12] != var6 && (class72.field1168[class159.field2790][var9][var12] & 0x4) == 0 && (class72.field1168[class159.field2790][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class150.field2617[var31] = class246.method1612(class246.method1612(var9 - 1, 1179648), 1375731712);
                            class8.field123[var31] = class246.method1612(var12, 1245184);
                            class241.field4225[class159.field2790][var9 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class241.field4225[class159.field2790][var9][var12] != var6) {
                            class150.field2617[var31] = class246.method1612(class246.method1612(var9, 5373952), 318767104);
                            class8.field123[var31] = class246.method1612(var12, 5439488);
                            class241.field4225[class159.field2790][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class241.field4225[class159.field2790][var9 + 1][var12] != var6 && (class72.field1168[class159.field2790][var9][var12] & 0x4) == 0 && (class72.field1168[class159.field2790][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class150.field2617[var31] = class246.method1612(-1845493760, class246.method1612(5373952, var9 + 1));
                            class8.field123[var31] = class246.method1612(var12, 5439488);
                            class241.field4225[class159.field2790][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class241.field4225[class159.field2790][var9 + 1][var12] != var6) {
                        class150.field2617[var31] = class246.method1612(class246.method1612(9568256, var9 + 1), 1392508928);
                        class8.field123[var31] = class246.method1612(9633792, var12);
                        class241.field4225[class159.field2790][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class241.field4225[class159.field2790][var9 - 1][var12] != var6 && (class72.field1168[class159.field2790][var9][var12] & 0x4) == 0 && (class72.field1168[class159.field2790][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class150.field2617[var31] = class246.method1612(301989888, class246.method1612(13762560, var9 - 1));
                            class8.field123[var31] = class246.method1612(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class241.field4225[class159.field2790][var9 - 1][var12] = var6;
                        }
                        if (class241.field4225[class159.field2790][var9][var12] != var6) {
                            class150.field2617[var31] = class246.method1612(-1828716544, class246.method1612(13762560, var9));
                            class8.field123[var31] = class246.method1612(13828096, var12);
                            class241.field4225[class159.field2790][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class241.field4225[class159.field2790][var9 + 1][var12] != var6 && (class72.field1168[class159.field2790][var9][var12] & 0x4) == 0 && (class72.field1168[class159.field2790][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class150.field2617[var31] = class246.method1612(class246.method1612(9568256, var9 + 1), -771751936);
                            class8.field123[var31] = class246.method1612(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class241.field4225[class159.field2790][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class205.field3478[arg1] != -1000000) {
                class205.field3478[arg1] += 10;
                class256.field4508[arg1] -= 50;
                class209.field3527[arg1] += 50;
                class23.field350[arg1] += 50;
                class32.field482[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method1070(byte arg0) {
        field2648 = null;
        if (arg0 < 116) {
            method1069((class3[][][]) null, -115, -86, false, -64, 38);
        }
        field2640 = null;
        field2636 = null;
        field2623 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)V")
    public static final void method1071(boolean arg0, boolean arg1) {
        field2631++;
        byte var2 = 4;
        byte[][] var3 = class248.field4369;
        if (arg1) {
            field2633 = 97;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class160.method1116(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class90.field1536[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3FC99AE) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFD19D) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class61.field1031.length; var14++) {
                                if (class61.field1031[var14] == var13 && var3[var14] != null) {
                                    class138.method998(var3[var14], (var11 & 0x7) * 8, var5 * 8, arg0, var4, class173.field3003, (byte) -99, var9, var10, var6 * 8, (var12 & 0x7) * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class67.method452(8, 10688, var5 * 8, 8, var4, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBI)I")
    public static final int method1072(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 < 49) {
            field2636 = null;
        }
        field2628++;
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        return (arg0 >> 5 << 7) + (arg1 >> 2 << 10) + (arg3 >> 1);
    }
}
