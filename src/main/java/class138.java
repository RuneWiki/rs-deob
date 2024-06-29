import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class138 {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Leb;")
    private static class230 field2467 = class68.method589(0, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "Leb;")
    public static class230 field2471 = field2467;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Laj;")
    public static class46 field2464 = new class46(16);

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lka;")
    public static class245 field2473 = null;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[Lqb;")
    public static class57[] field2474 = new class57[27];

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[I")
    public static int[] field2476 = new int[1000];

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lkk;")
    public static class223 field2468;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method1060(int arg0) {
        field2469++;
        for (int var1 = 0; var1 < class18.field393; var1++) {
            int var3 = class167.field2956[var1];
            class109 var4 = class168.field2963[var3];
            if (var4 != null) {
                class140.method1075(var4, var4.field1956.field1769, (byte) -77);
            }
        }
        int var2 = -41 / ((arg0 + 12) / 33);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)I")
    public static final int method1061(byte arg0, int arg1, int arg2) {
        if (arg0 != -97) {
            method1064(false, -2, -14, 39, (class233[][][]) null, 36);
        }
        field2465++;
        int var3 = class52.method416(arg1 - 1, arg2 - 1, (byte) 125) + class52.method416(arg1 + 1, arg2 + -1, (byte) 123) - (-class52.method416(arg1 - 1, arg2 + 1, (byte) 127) - class52.method416(arg1 + 1, arg2 + 1, (byte) 124));
        int var4 = class52.method416(arg1 - 1, arg2, (byte) 126) + class52.method416(arg1 + 1, arg2, (byte) 121) - (-class52.method416(arg1, arg2 + -1, (byte) 121) - class52.method416(arg1, arg2 - -1, (byte) 126));
        int var5 = class52.method416(arg1, arg2, (byte) 121);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method1062(boolean arg0) {
        field2473 = null;
        field2471 = null;
        field2468 = null;
        field2464 = null;
        field2467 = null;
        field2474 = null;
        field2476 = null;
        if (!arg0) {
            method1064(false, -61, -105, -16, (class233[][][]) null, 93);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZI)V")
    public static final void method1063(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2472++;
        if (class202.method1422(arg4, true)) {
            class49.method407(arg0, arg2, 7087, arg3, class99.field1839[arg4], arg1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIII[[[Lqf;I)Z")
    public static final boolean method1064(boolean arg0, int arg1, int arg2, int arg3, class233[][][] arg4, int arg5) {
        byte var6 = arg0 ? 1 : (byte) (class150.field2676 & 0xFF);
        field2470++;
        if (class12.field176[class124.field2174][arg2][arg1] == var6) {
            return false;
        } else if ((class79.field1435[class124.field2174][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class41.field757[var7] = arg2;
            int var8 = 0;
            int var31 = var7 + 1;
            class117.field2105[var7] = arg1;
            class12.field176[class124.field2174][arg2][arg1] = var6;
            if (arg5 != -105) {
                return true;
            }
            while (var31 != var8) {
                int var9 = class41.field757[var8] & 0xFFFF;
                int var10 = class41.field757[var8] >> 24 & 0xFF;
                int var11 = class117.field2105[var8] & 0xFFFF;
                int var12 = (class117.field2105[var8] & 0xFFCD10) >> 16;
                int var13 = class41.field757[var8] >> 16 & 0xFF;
                boolean var14 = false;
                if ((class79.field1435[class124.field2174][var9][var11] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                var8 = var8 + 1 & 0xFFF;
                label227: for (int var16 = class124.field2174 + 1; var16 <= 3; var16++) {
                    if ((class79.field1435[var16][var9][var11] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var11] != null) {
                            if (arg4[var16][var9][var11].field4056 != null) {
                                int var19 = class196.method1393(var13, -24015);
                                if (arg4[var16][var9][var11].field4056.field1941 == var19 || arg4[var16][var9][var11].field4056.field1940 == var19) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var20 = class196.method1393(var10, -24015);
                                    if (arg4[var16][var9][var11].field4056.field1941 == var20 || arg4[var16][var9][var11].field4056.field1940 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class196.method1393(var12, -24015);
                                    if (arg4[var16][var9][var11].field4056.field1941 == var21 || arg4[var16][var9][var11].field4056.field1940 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var11].field4050 != null) {
                                for (int var22 = 0; var22 < arg4[var16][var9][var11].field4058; var22++) {
                                    int var23 = (int) (arg4[var16][var9][var11].field4050[var22].field2001 >> 14 & 0x3FL);
                                    int var24 = (int) (arg4[var16][var9][var11].field4050[var22].field2001 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var24 << 6 | var23;
                                    if (var13 == var25 || var10 != 0 && var10 == var25 || var12 != 0 && var12 == var25) {
                                        continue label227;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class233 var26 = arg4[var16][var9][var11];
                        if (var26 != null && var26.field4058 > 0) {
                            for (int var27 = 0; var27 < var26.field4058; var27++) {
                                class111 var28 = var26.field4050[var27];
                                if (var28.field1989 != var28.field1988 || var28.field2002 != var28.field1994) {
                                    for (int var29 = var28.field1988; var29 <= var28.field1989; var29++) {
                                        for (int var30 = var28.field1994; var30 <= var28.field2002; var30++) {
                                            class12.field176[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class12.field176[var16][var9][var11] = var6;
                    }
                }
                if (var15) {
                    if (class106.field1912[class124.field2174 + 1][var9][var11] > class190.field3356[arg3]) {
                        class190.field3356[arg3] = class106.field1912[class124.field2174 + 1][var9][var11];
                    }
                    int var17 = var9 << 7;
                    int var18 = var11 << 7;
                    if (class9.field162[arg3] > var17) {
                        class9.field162[arg3] = var17;
                    } else if (var17 > class68.field1279[arg3]) {
                        class68.field1279[arg3] = var17;
                    }
                    if (var18 < class177.field3112[arg3]) {
                        class177.field3112[arg3] = var18;
                    } else if (var18 > class232.field4037[arg3]) {
                        class232.field4037[arg3] = var18;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class12.field176[class124.field2174][var9 - 1][var11] != var6) {
                        class41.field757[var31] = class177.method1290(-754974720, class177.method1290(var9 - 1, 1179648));
                        class117.field2105[var31] = class177.method1290(var11, 1245184);
                        class12.field176[class124.field2174][var9 - 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class12.field176[class124.field2174][var9 - 1][var11] != var6 && (class79.field1435[class124.field2174][var9][var11] & 0x4) == 0 && (class79.field1435[class124.field2174][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class41.field757[var31] = class177.method1290(class177.method1290(1179648, var9 - 1), 1375731712);
                            class117.field2105[var31] = class177.method1290(1245184, var11);
                            class12.field176[class124.field2174][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class12.field176[class124.field2174][var9][var11] != var6) {
                            class41.field757[var31] = class177.method1290(318767104, class177.method1290(5373952, var9));
                            class117.field2105[var31] = class177.method1290(5439488, var11);
                            class12.field176[class124.field2174][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class12.field176[class124.field2174][var9 + 1][var11] != var6 && (class79.field1435[class124.field2174][var9][var11] & 0x4) == 0 && (class79.field1435[class124.field2174][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class41.field757[var31] = class177.method1290(class177.method1290(5373952, var9 + 1), -1845493760);
                            class117.field2105[var31] = class177.method1290(var11, 5439488);
                            class12.field176[class124.field2174][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var11--;
                    if ((var9 + 1) < 104 && class12.field176[class124.field2174][var9 + 1][var11] != var6) {
                        class41.field757[var31] = class177.method1290(class177.method1290(var9 + 1, 9568256), 1392508928);
                        class117.field2105[var31] = class177.method1290(9633792, var11);
                        class12.field176[class124.field2174][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if ((var9 - 1) >= 0 && class12.field176[class124.field2174][var9 - 1][var11] != var6 && (class79.field1435[class124.field2174][var9][var11] & 0x4) == 0 && (class79.field1435[class124.field2174][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class41.field757[var31] = class177.method1290(class177.method1290(13762560, var9 - 1), 301989888);
                            class117.field2105[var31] = class177.method1290(var11, 13828096);
                            class12.field176[class124.field2174][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class12.field176[class124.field2174][var9][var11] != var6) {
                            class41.field757[var31] = class177.method1290(-1828716544, class177.method1290(var9, 13762560));
                            class117.field2105[var31] = class177.method1290(13828096, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class12.field176[class124.field2174][var9][var11] = var6;
                        }
                        if (var9 + 1 < 104 && class12.field176[class124.field2174][var9 + 1][var11] != var6 && (class79.field1435[class124.field2174][var9][var11] & 0x4) == 0 && (class79.field1435[class124.field2174][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class41.field757[var31] = class177.method1290(class177.method1290(var9 + 1, 9568256), -771751936);
                            class117.field2105[var31] = class177.method1290(var11, 9633792);
                            class12.field176[class124.field2174][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class190.field3356[arg3] != -1000000) {
                class190.field3356[arg3] += 10;
                class9.field162[arg3] -= 50;
                class68.field1279[arg3] += 50;
                class232.field4037[arg3] += 50;
                class177.field3112[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1065(int arg0, int arg1, int arg2, long arg3) {
        class233 var5 = class53.field916[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4056 != null && var5.field4056.field1942 == arg3) {
            return true;
        } else if (var5.field4065 != null && var5.field4065.field4720 == arg3) {
            return true;
        } else if (var5.field4052 != null && var5.field4052.field1031 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4058; var6++) {
                if (var5.field4050[var6].field2001 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method1066(int arg0) {
        if (arg0 != -1) {
            field2475 = 72;
        }
        class142.field2560.method1124(0);
        field2466++;
    }
}
