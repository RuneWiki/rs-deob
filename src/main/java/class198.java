import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class198 extends class183 {

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2647 = new String[200];

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "[I")
    public static int[] field2653 = new int[25];

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "Ljava/lang/String;")
    public String field2650;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIZI[[[Le;I)Z", line = 9)
    public static final boolean method1058(boolean arg0, int arg1, boolean arg2, int arg3, class96[][][] arg4, int arg5) {
        if (!arg2) {
            method1061(28, 30, (byte) -20, 120);
        }
        field2648++;
        byte var6 = arg0 ? 1 : (byte) (class127.field1642 & 0xFF);
        if (class452.field6580[class263.field3592][arg5][arg1] == var6) {
            return false;
        } else if ((class282.field3872[class263.field3592][arg5][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class149.field1893[var7] = arg5;
            int var35 = var7 + 1;
            class337.field4492[var7] = arg1;
            class452.field6580[class263.field3592][arg5][arg1] = var6;
            while (var35 != var8) {
                int var9 = class149.field1893[var8] & 0xFFFF;
                int var10 = (class149.field1893[var8] & 0xFFD46A) >> 16;
                int var11 = class149.field1893[var8] >> 24 & 0xFF;
                int var12 = class337.field4492[var8] & 0xFFFF;
                int var13 = (class337.field4492[var8] & 0xFFCB84) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class282.field3872[class263.field3592][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class263.field3592 + 1; var16 <= 3; var16++) {
                    if ((class282.field3872[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field1128 != null) {
                                int var20 = class269.method1495((byte) 111, var10);
                                if (arg4[var16][var9][var12].field1128.field6524 == var20 || arg4[var16][var9][var12].field1136 != null && arg4[var16][var9][var12].field1136.field6524 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class269.method1495((byte) 111, var11);
                                    if (arg4[var16][var9][var12].field1128.field6524 == var21 || arg4[var16][var9][var12].field1136 != null && arg4[var16][var9][var12].field1136.field6524 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class269.method1495((byte) 111, var13);
                                    if (arg4[var16][var9][var12].field1128.field6524 == var22 || arg4[var16][var9][var12].field1136 != null && arg4[var16][var9][var12].field1136.field6524 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class96 var23 = arg4[var16][var9][var12];
                            if (var23.field1130 != null) {
                                for (class122 var24 = var23.field1130; var24 != null; var24 = var24.field1511) {
                                    class17 var25 = var24.field1505;
                                    if (var25 instanceof class285) {
                                        class285 var26 = (class285) var25;
                                        int var27 = var26.method339(100);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method351((byte) 103);
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class96 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field1130 != null) {
                            for (class122 var31 = var30.field1130; var31 != null; var31 = var31.field1511) {
                                class17 var32 = var31.field1505;
                                if (var32.field168 != var32.field158 || var32.field159 != var32.field153) {
                                    for (int var33 = var32.field168; var33 <= var32.field158; var33++) {
                                        for (int var34 = var32.field159; var34 <= var32.field153; var34++) {
                                            class452.field6580[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class452.field6580[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class98.field1161[class263.field3592 + 1].method271(var9, var12);
                    if (class204.field2748[arg3] < var17) {
                        class204.field2748[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class434.field6346[arg3] > var18) {
                        class434.field6346[arg3] = var18;
                    } else if (var18 > class181.field2276[arg3]) {
                        class181.field2276[arg3] = var18;
                    }
                    if (class143.field1826[arg3] > var19) {
                        class143.field1826[arg3] = var19;
                    } else if (var19 > class448.field6515[arg3]) {
                        class448.field6515[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class452.field6580[class263.field3592][var9 - 1][var12] != var6) {
                        class149.field1893[var35] = class392.method2441(-754974720, class392.method2441(1179648, var9 - 1));
                        class337.field4492[var35] = class392.method2441(1245184, var12);
                        class452.field6580[class263.field3592][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class340.field4549 > var12) {
                        if (var9 - 1 >= 0 && class452.field6580[class263.field3592][var9 - 1][var12] != var6 && (class282.field3872[class263.field3592][var9][var12] & 0x4) == 0 && (class282.field3872[class263.field3592][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class149.field1893[var35] = class392.method2441(class392.method2441(1179648, var9 - 1), 1375731712);
                            class337.field4492[var35] = class392.method2441(1245184, var12);
                            class452.field6580[class263.field3592][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class452.field6580[class263.field3592][var9][var12] != var6) {
                            class149.field1893[var35] = class392.method2441(class392.method2441(var9, 5373952), 318767104);
                            class337.field4492[var35] = class392.method2441(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class452.field6580[class263.field3592][var9][var12] = var6;
                        }
                        if (var9 + 1 < class315.field4214 && class452.field6580[class263.field3592][var9 + 1][var12] != var6 && (class282.field3872[class263.field3592][var9][var12] & 0x4) == 0 && (class282.field3872[class263.field3592][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class149.field1893[var35] = class392.method2441(-1845493760, class392.method2441(var9 + 1, 5373952));
                            class337.field4492[var35] = class392.method2441(var12, 5439488);
                            class452.field6580[class263.field3592][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class315.field4214 > var9 + 1 && class452.field6580[class263.field3592][var9 + 1][var12] != var6) {
                        class149.field1893[var35] = class392.method2441(class392.method2441(9568256, var9 + 1), 1392508928);
                        class337.field4492[var35] = class392.method2441(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class452.field6580[class263.field3592][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class452.field6580[class263.field3592][var9 - 1][var12] != var6 && (class282.field3872[class263.field3592][var9][var12] & 0x4) == 0 && (class282.field3872[class263.field3592][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class149.field1893[var35] = class392.method2441(301989888, class392.method2441(var9 - 1, 13762560));
                            class337.field4492[var35] = class392.method2441(var12, 13828096);
                            class452.field6580[class263.field3592][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class452.field6580[class263.field3592][var9][var12] != var6) {
                            class149.field1893[var35] = class392.method2441(-1828716544, class392.method2441(13762560, var9));
                            class337.field4492[var35] = class392.method2441(13828096, var12);
                            class452.field6580[class263.field3592][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class315.field4214 && class452.field6580[class263.field3592][var9 + 1][var12] != var6 && (class282.field3872[class263.field3592][var9][var12] & 0x4) == 0 && (class282.field3872[class263.field3592][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class149.field1893[var35] = class392.method2441(class392.method2441(9568256, var9 + 1), -771751936);
                            class337.field4492[var35] = class392.method2441(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class452.field6580[class263.field3592][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class204.field2748[arg3] != -1000000) {
                class204.field2748[arg3] += 10;
                class434.field6346[arg3] -= 50;
                class181.field2276[arg3] += 50;
                class448.field6515[arg3] += 50;
                class143.field1826[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lfd;I)Lfd;", line = 327)
    public static final class194 method1059(class194 arg0, int arg1) {
        field2654++;
        if (arg1 != 128) {
            field2647 = null;
        }
        class194 var2 = client.method1408(arg0);
        if (var2 == null) {
            var2 = arg0.field2571;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Z", line = 347)
    public static final boolean method1060(int arg0, int arg1, int arg2) {
        int var3 = class220.field2959[arg0][arg1][arg2];
        if (-class14.field137 == var3) {
            return false;
        } else if (class14.field137 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class328.method1881(var4 + 1, class98.field1161[arg0].method271(arg1, arg2), var5 + 1) && class328.method1881(var4 + 128 - 1, class98.field1161[arg0].method271(arg1 + 1, arg2), var5 + 1) && class328.method1881(var4 + 128 - 1, class98.field1161[arg0].method271(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class328.method1881(var4 + 1, class98.field1161[arg0].method271(arg1, arg2 + 1), var5 + 128 - 1)) {
                class220.field2959[arg0][arg1][arg2] = class14.field137;
                return true;
            } else {
                class220.field2959[arg0][arg1][arg2] = -class14.field137;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIBI)V", line = 372)
    public static final void method1061(int arg0, int arg1, byte arg2, int arg3) {
        field2651++;
        String var4 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        class227.method1233(var4, 7272, true);
        if (arg2 != 39) {
            field2653 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZZ)Z", line = 394)
    public static boolean method1062(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V", line = 404)
    public static final void method1063(boolean arg0, int arg1) {
        field2646++;
        class256.field3504 = arg1;
        class114 var2 = class272.field3672;
        synchronized (class272.field3672) {
            class272.field3672.method613(true);
        }
        class114 var3 = class83.field912;
        synchronized (class83.field912) {
            if (arg0) {
                method1059((class194) null, 52);
            }
            class83.field912.method613(true);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 421)
    public static void method1064(int arg0) {
        field2647 = null;
        if (arg0 != 1) {
            field2653 = null;
        }
        field2653 = null;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 433)
    public static final void method1065(int arg0) {
        field2649++;
        class235.field3242.method1603(class44.field455, class264.field3609 ? class379.field5352 + 256 : -1);
        if (arg0 != 4095) {
            method1059((class194) null, -6);
        }
    }
}
