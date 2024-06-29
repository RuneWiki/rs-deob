import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 extends class19 {

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
    public static int field2320 = 0;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
    public static int[] field2318 = new int[14];

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "F")
    public static float field2321;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Ldp;")
    public static class174 field2323;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[[[Lsk;ZIB)Z")
    public static final boolean method1168(int arg0, int arg1, class168[][][] arg2, boolean arg3, int arg4, byte arg5) {
        ++field2322;
        byte var6 = !arg3 ? (byte) (255 & class49.field794) : 1;
        if (~class141.field2232[class367.field5213][arg0][arg1] == ~var6) {
            return false;
        } else if (~(4 & class278.field4176[class367.field5213][arg0][arg1]) == -1) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class388.field5566[var7] = arg0;
            int var35 = var7 + 1;
            class140.field2226[var7] = arg1;
            class141.field2232[class367.field5213][arg0][arg1] = var6;
            while (var35 != var8) {
                int var9 = 65535 & class388.field5566[var8];
                int var10 = (class388.field5566[var8] & 16763550) >> 16;
                int var11 = 255 & class388.field5566[var8] >> 24;
                int var12 = 65535 & class140.field2226[var8];
                int var13 = (class140.field2226[var8] & 16741053) >> 16;
                var8 = 4095 & var8 + 1;
                boolean var14 = false;
                if ((class278.field4176[class367.field5213][var9][var12] & 4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class367.field5213 + 1; var16 <= 3; ++var16) {
                    if ((8 & class278.field4176[var16][var9][var12]) == 0) {
                        if (var14 && arg2[var16][var9][var12] != null) {
                            if (arg2[var16][var9][var12].field2505 != null) {
                                int var20 = class200.method1523(var10, (byte) -106);
                                if (arg2[var16][var9][var12].field2505.field2281 == var20 || arg2[var16][var9][var12].field2510 != null && ~arg2[var16][var9][var12].field2510.field2281 == ~var20) {
                                    continue;
                                }
                                if (~var11 != -1) {
                                    int var21 = class200.method1523(var11, (byte) -100);
                                    if (arg2[var16][var9][var12].field2505.field2281 == var21 || arg2[var16][var9][var12].field2510 != null && ~arg2[var16][var9][var12].field2510.field2281 == ~var21) {
                                        continue;
                                    }
                                }
                                if (~var13 != -1) {
                                    int var22 = class200.method1523(var13, (byte) -113);
                                    if (arg2[var16][var9][var12].field2505.field2281 == var22 || arg2[var16][var9][var12].field2510 != null && ~arg2[var16][var9][var12].field2510.field2281 == ~var22) {
                                        continue;
                                    }
                                }
                            }
                            class168 var23 = arg2[var16][var9][var12];
                            if (var23.field2488 != null) {
                                for (class36 var24 = var23.field2488; var24 != null; var24 = var24.field505) {
                                    class447 var25 = var24.field511;
                                    if (var25 instanceof class395) {
                                        class395 var26 = (class395) var25;
                                        int var27 = var26.method1024(20691);
                                        if (~var27 == -22) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method1020(arg5 ^ -15848);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || ~var11 != -1 && ~var11 == ~var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class168 var30 = arg2[var16][var9][var12];
                        if (var30 != null && var30.field2488 != null) {
                            for (class36 var31 = var30.field2488; var31 != null; var31 = var31.field505) {
                                class447 var32 = var31.field511;
                                if (var32.field6526 != var32.field6504 || ~var32.field6513 != ~var32.field6508) {
                                    for (int var33 = var32.field6526; ~var32.field6504 <= ~var33; ++var33) {
                                        for (int var34 = var32.field6513; var32.field6508 >= var34; ++var34) {
                                            class141.field2232[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class141.field2232[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class50.field816[class367.field5213 + 1].method794(var9, var12);
                    if (~var17 < ~class91.field1443[arg4]) {
                        class91.field1443[arg4] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (~var18 <= ~class372.field5286[arg4]) {
                        if (~class326.field4699[arg4] > ~var18) {
                            class326.field4699[arg4] = var18;
                        }
                    } else {
                        class372.field5286[arg4] = var18;
                    }
                    if (class202.field2940[arg4] > var19) {
                        class202.field2940[arg4] = var19;
                    } else if (class345.field4870[arg4] < var19) {
                        class345.field4870[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (~var9 <= -2 && ~class141.field2232[class367.field5213][var9 + -1][var12] != ~var6) {
                        class388.field5566[var35] = class439.method2744(class439.method2744(1179648, var9 + -1), -754974720);
                        class140.field2226[var35] = class439.method2744(1245184, var12);
                        var35 = var35 - -1 & 4095;
                        class141.field2232[class367.field5213][var9 + -1][var12] = var6;
                    }
                    int var10000 = ~class66.field1056;
                    ++var12;
                    if (var10000 < ~var12) {
                        if (var9 + -1 >= 0 && class141.field2232[class367.field5213][var9 - 1][var12] != var6 && (4 & class278.field4176[class367.field5213][var9][var12]) == 0 && (class278.field4176[class367.field5213][var9 + -1][var12 + -1] & 4) == 0) {
                            class388.field5566[var35] = class439.method2744(1375731712, class439.method2744(var9 + -1, 1179648));
                            class140.field2226[var35] = class439.method2744(1245184, var12);
                            class141.field2232[class367.field5213][var9 + -1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                        if (~class141.field2232[class367.field5213][var9][var12] != ~var6) {
                            class388.field5566[var35] = class439.method2744(class439.method2744(5373952, var9), 318767104);
                            class140.field2226[var35] = class439.method2744(var12, 5439488);
                            var35 = var35 - -1 & 4095;
                            class141.field2232[class367.field5213][var9][var12] = var6;
                        }
                        if (class183.field2703 > var9 + 1 && class141.field2232[class367.field5213][var9 + 1][var12] != var6 && ~(4 & class278.field4176[class367.field5213][var9][var12]) == -1 && ~(class278.field4176[class367.field5213][var9 - -1][var12 + -1] & 4) == -1) {
                            class388.field5566[var35] = class439.method2744(-1845493760, class439.method2744(var9 + 1, 5373952));
                            class140.field2226[var35] = class439.method2744(5439488, var12);
                            class141.field2232[class367.field5213][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 4095;
                        }
                    }
                    --var12;
                    if (var9 + 1 < class183.field2703 && class141.field2232[class367.field5213][var9 - -1][var12] != var6) {
                        class388.field5566[var35] = class439.method2744(1392508928, class439.method2744(9568256, var9 + 1));
                        class140.field2226[var35] = class439.method2744(var12, 9633792);
                        var35 = var35 - -1 & 4095;
                        class141.field2232[class367.field5213][var9 + 1][var12] = var6;
                    }
                    --var12;
                    if (~var12 <= -1) {
                        if (var9 - 1 >= 0 && ~class141.field2232[class367.field5213][var9 + -1][var12] != ~var6 && ~(4 & class278.field4176[class367.field5213][var9][var12]) == -1 && ~(4 & class278.field4176[class367.field5213][var9 + -1][var12 - -1]) == -1) {
                            class388.field5566[var35] = class439.method2744(class439.method2744(13762560, var9 + -1), 301989888);
                            class140.field2226[var35] = class439.method2744(var12, 13828096);
                            class141.field2232[class367.field5213][var9 + -1][var12] = var6;
                            var35 = 4095 & var35 + 1;
                        }
                        if (class141.field2232[class367.field5213][var9][var12] != var6) {
                            class388.field5566[var35] = class439.method2744(-1828716544, class439.method2744(var9, 13762560));
                            class140.field2226[var35] = class439.method2744(13828096, var12);
                            var35 = 4095 & var35 + 1;
                            class141.field2232[class367.field5213][var9][var12] = var6;
                        }
                        if (class183.field2703 > var9 + 1 && class141.field2232[class367.field5213][var9 + 1][var12] != var6 && (class278.field4176[class367.field5213][var9][var12] & 4) == 0 && ~(class278.field4176[class367.field5213][var9 + 1][var12 + 1] & 4) == -1) {
                            class388.field5566[var35] = class439.method2744(-771751936, class439.method2744(9568256, var9 + 1));
                            class140.field2226[var35] = class439.method2744(9633792, var12);
                            var35 = var35 - -1 & 4095;
                            class141.field2232[class367.field5213][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (arg5 != -51) {
                method1168(100, -81, (class168[][][]) null, false, 81, (byte) -66);
            }
            if (~class91.field1443[arg4] != 999999) {
                class91.field1443[arg4] += 10;
                class372.field5286[arg4] -= 50;
                class326.field4699[arg4] += 50;
                class345.field4870[arg4] += 50;
                class202.field2940[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method123(boolean arg0, int arg1) {
        ++field2316;
        if (!arg0) {
            method1168(-11, -82, (class168[][][]) null, false, -107, (byte) 22);
        }
        int[][] var3 = super.field4046.method244(arg1, 126);
        if (super.field4046.field488 && this.method125(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field273 * super.field273;
            for (int var8 = 0; var8 < class161.field2445; ++var8) {
                int var9 = super.field278[var8 % super.field276 + var7];
                var6[var8] = class35.method254(var9, 255) << 4;
                var5[var8] = class35.method254(65280, var9) >> 4;
                var4[var8] = class35.method254(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "(I)V")
    public static void method1169(int arg0) {
        if (arg0 < -125) {
            field2318 = null;
            field2323 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIIZ[Lmb;)V")
    public static final void method1170(int arg0, byte arg1, int arg2, int arg3, boolean arg4, class258[] arg5) {
        int var6 = 102 % ((arg1 - -23) / 44);
        for (int var7 = 0; ~var7 > ~arg5.length; ++var7) {
            class258 var8 = arg5[var7];
            if (var8 != null && var8.field3754 == arg3) {
                class60.method462(arg0, arg4, 111, arg2, var8);
                class121.method1015(var8, arg0, -121, arg2);
                if (var8.field3805 - var8.field3764 < var8.field3791) {
                    var8.field3791 = -var8.field3764 + var8.field3805;
                }
                if (~(-var8.field3758 + var8.field3882) > ~var8.field3900) {
                    var8.field3900 = -var8.field3758 + var8.field3882;
                }
                if (~var8.field3791 > -1) {
                    var8.field3791 = 0;
                }
                if (var8.field3900 < 0) {
                    var8.field3900 = 0;
                }
                if (var8.field3793 == 0) {
                    class360.method2307(var8, -1, arg4);
                }
            }
        }
        ++field2317;
    }
}
