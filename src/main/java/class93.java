import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class93 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lae;")
    public static class6 field2210 = class64.method474(121, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[Z")
    public static boolean[] field2220 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lae;")
    public static class6 field2222 = class64.method474(110, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Lgd;")
    public class42 field2218;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method774(boolean arg0) {
        field2216++;
        if (!arg0) {
            return;
        }
        for (class41 var1 = (class41) class37.field851.method798(false); var1 != null; var1 = (class41) class37.field851.method792((byte) -87)) {
            if (class15.field305 != var1.field923 || var1.field941 < class5.field61) {
                var1.method498(116);
            } else if (var1.field938 <= class5.field61) {
                if (var1.field929 > 0) {
                    class2 var2 = class49.field1097[var1.field929 - 1];
                    if (var2 != null && var2.field1783 >= 0 && var2.field1783 < 13312 && var2.field1752 >= 0 && var2.field1752 < 13312) {
                        var1.method348(class20.method193(var2.field1752, 9990, var1.field923, var2.field1783) - var1.field931, 118, var2.field1752, class5.field61, var2.field1783);
                    }
                }
                if (var1.field929 < 0) {
                    int var3 = -var1.field929 - 1;
                    class66 var4;
                    if (class136.field3308 == var3) {
                        var4 = class12.field229;
                    } else {
                        var4 = class20.field387[var3];
                    }
                    if (var4 != null && var4.field1783 >= 0 && var4.field1783 < 13312 && var4.field1752 >= 0 && var4.field1752 < 13312) {
                        var1.method348(class20.method193(var4.field1752, 9990, var1.field923, var4.field1783) - var1.field931, 49, var4.field1752, class5.field61, var4.field1783);
                    }
                }
                var1.method349(1024, class82.field2005);
                class81.field1967.method540(class15.field305, (int) var1.field909, (int) var1.field919, (int) var1.field922, 60, var1, var1.field943, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)V", line = 55)
    public static final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2215++;
        int var6 = class81.field1967.method544(arg0, arg3, arg4);
        if (var6 != 0) {
            int var7 = class81.field1967.method524(arg0, arg3, arg4, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int[] var10 = class46.field1026.field2378;
            int var11 = arg3 * 4 + (-(arg4 * 512) + 52736) * 4 + 24624;
            int var12 = arg2;
            int var13 = var6 >> 14 & 0x7FFF;
            if (var6 > 0) {
                var12 = arg5;
            }
            class107 var14 = class80.method687(var13, (byte) 54);
            if (var14.field2572 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var10[var11] = var12;
                        var10[var11 + 512] = var12;
                        var10[var11 + 1024] = var12;
                        var10[var11 + 1536] = var12;
                    } else if (var9 == 1) {
                        var10[var11] = var12;
                        var10[var11 + 1] = var12;
                        var10[var11 + 2] = var12;
                        var10[var11 + 3] = var12;
                    } else if (var9 == 2) {
                        var10[var11 + 3] = var12;
                        var10[var11 + 515] = var12;
                        var10[var11 + 1024 + 3] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    } else if (var9 == 3) {
                        var10[var11 + 1536] = var12;
                        var10[var11 + 1536 + 1] = var12;
                        var10[var11 + 2 + 1536] = var12;
                        var10[var11 + 1539] = var12;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var10[var11] = var12;
                    } else if (var9 == 1) {
                        var10[var11 + 3] = var12;
                    } else if (var9 == 2) {
                        var10[var11 + 1539] = var12;
                    } else if (var9 == 3) {
                        var10[var11 + 1536] = var12;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var10[var11] = var12;
                        var10[var11 + 512] = var12;
                        var10[var11 + 1024] = var12;
                        var10[var11 + 1536] = var12;
                    } else if (var9 == 0) {
                        var10[var11] = var12;
                        var10[var11 + 1] = var12;
                        var10[var11 + 2] = var12;
                        var10[var11 + 3] = var12;
                    } else if (var9 == 1) {
                        var10[var11 + 3] = var12;
                        var10[var11 + 3 + 512] = var12;
                        var10[var11 + 3 + 1024] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    } else if (var9 == 2) {
                        var10[var11 + 1536] = var12;
                        var10[var11 + 1 + 1536] = var12;
                        var10[var11 + 1536 + 2] = var12;
                        var10[var11 + 1536 + 3] = var12;
                    }
                }
            } else {
                class128 var15 = class129.field3130[var14.field2572];
                if (var15 != null) {
                    int var16 = (var14.field2516 * 4 - var15.field3103) / 2;
                    int var17 = (var14.field2546 * 4 - var15.field3104) / 2;
                    var15.method1036(arg3 * 4 + var16 + 48, 48 - -((104 - arg4 + -var14.field2546) * 4) - -var17);
                }
            }
        }
        int var18 = class81.field1967.method549(arg0, arg3, arg4);
        if (var18 != 0) {
            int var19 = class81.field1967.method524(arg0, arg3, arg4, var18);
            int var20 = var18 >> 14 & 0x7FFF;
            int var21 = var19 & 0x1F;
            int var22 = var19 >> 6 & 0x3;
            class107 var23 = class80.method687(var20, (byte) 65);
            if (var23.field2572 != -1) {
                class128 var27 = class129.field3130[var23.field2572];
                if (var27 != null) {
                    int var28 = (var23.field2516 * 4 - var27.field3103) / 2;
                    int var29 = (var23.field2546 * 4 - var27.field3104) / 2;
                    var27.method1036(arg3 * 4 + var28 + 48, var29 + 48 - -((-var23.field2546 + -arg4 + 104) * 4));
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                int[] var25 = class46.field1026.field2378;
                int var26 = (52736 - arg4 * 512) * 4 + arg3 * 4 + 24624;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                if (var22 == 0 || var22 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1025] = var24;
                    var25[var26 + 514] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 513] = var24;
                    var25[var26 + 2 + 1024] = var24;
                    var25[var26 + 1539] = var24;
                }
            }
        }
        int var30 = class81.field1967.method569(arg0, arg3, arg4);
        if (arg1 != 1536 || var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class107 var32 = class80.method687(var31, (byte) 127);
        if (var32.field2572 == -1) {
            return;
        }
        class128 var33 = class129.field3130[var32.field2572];
        if (var33 != null) {
            int var34 = (var32.field2516 * 4 - var33.field3103) / 2;
            int var35 = (var32.field2546 * 4 - var33.field3104) / 2;
            var33.method1036(arg3 * 4 + var34 + 48, (-var32.field2546 + -arg4 + 104) * 4 + (48 - -var35));
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lte;ILae;)Lae;", line = 299)
    public static final class6 method776(class121 arg0, int arg1, class6 arg2) {
        field2217++;
        if (~arg2.method51(22938, class134.field3283) == arg1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method51(22938, class38.field862);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method51(22938, class27.field674);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method51(22938, class121.field2998);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method51(22938, class117.field2764);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method51(arg1 + 22938, class2.field14);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method51(22938, class7.field159);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class6 var9 = class133.field3262;
                                                    if (class66.field1466 != null) {
                                                        var9 = method779(class66.field1466.field2688, -79427592);
                                                        try {
                                                            if (class66.field1466.field2687 != null) {
                                                                byte[] var10 = ((String) class66.field1466.field2687).getBytes("ISO-8859-1");
                                                                var9 = class30.method271((byte) -128, var10, 0, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg2 = class85.method731(new class6[] { arg2.method30(0, ~arg1, var8), var9, arg2.method56(-58, var8 + 4) }, 14569);
                                                }
                                            }
                                            arg2 = class85.method731(new class6[] { arg2.method30(0, -1, var7), class2.method6(class135.method1105(4, arg1 + 2, arg0), arg1 ^ 0x3B9AC9FF), arg2.method56(-58, var7 + 2) }, 14569);
                                        }
                                    }
                                    arg2 = class85.method731(new class6[] { arg2.method30(0, -1, var6), class2.method6(class135.method1105(3, arg1 + 2, arg0), arg1 ^ 0x3B9AC9FF), arg2.method56(-58, var6 + 2) }, 14569);
                                }
                            }
                            arg2 = class85.method731(new class6[] { arg2.method30(0, -1, var5), class2.method6(class135.method1105(2, 2, arg0), arg1 + 999999999), arg2.method56(-58, var5 + 2) }, 14569);
                        }
                    }
                    arg2 = class85.method731(new class6[] { arg2.method30(0, -1, var4), class2.method6(class135.method1105(1, arg1 ^ 0x2, arg0), 999999999), arg2.method56(-58, var4 + 2) }, 14569);
                }
            }
            arg2 = class85.method731(new class6[] { arg2.method30(0, -1, var3), class2.method6(class135.method1105(0, arg1 ^ 0x2, arg0), 999999999), arg2.method56(-58, var3 + 2) }, 14569);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 397)
    public static void method777(int arg0) {
        field2222 = null;
        field2210 = null;
        if (arg0 == 2) {
            field2220 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(JB)V", line = 413)
    public static final void method778(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
            if (arg1 != -44) {
                method779(19, -19);
            }
        } catch (InterruptedException var3) {
        }
        field2224++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lae;", line = 451)
    private static final class6 method779(int arg0, int arg1) {
        field2219++;
        if (arg1 != -79427592) {
            field2210 = null;
        }
        return class85.method731(new class6[] { class114.method942((byte) 71, arg0 >> 24 & 0xFF), class52.field1184, class114.method942((byte) 71, arg0 >> 16 & 0xFF), class52.field1184, class114.method942((byte) 71, arg0 >> 8 & 0xFF), class52.field1184, class114.method942((byte) 71, arg0 & 0xFF) }, 14569);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I", line = 465)
    public static final int method780(int arg0, int arg1, byte arg2) {
        if (arg2 != 118) {
            return -21;
        }
        int var3 = arg0 * 57 + arg1;
        field2225++;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }
}
