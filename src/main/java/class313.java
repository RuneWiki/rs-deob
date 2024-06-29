import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class313 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field5033 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "S")
    public static short field5037 = 32767;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Z")
    public static boolean field5049 = false;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field5036 = -1;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field5043 = 0;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5054 = "flash1:";

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field5034;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public int field5052;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lqk;")
    public static class104 field5050;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Laj;")
    public static class151 field5047;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[Lmd;")
    public static class273[] field5032;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[[[I")
    public static int[][][] field5031;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
    public static final int method2115(int arg0, int arg1, int arg2) {
        field5056++;
        if (arg2 < 77) {
            field5043 = -122;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2116(int arg0, String arg1) {
        if (arg0 < 88) {
            field5032 = null;
        }
        field5035++;
        String var2 = class241.method1726(class180.method1309(arg1, -20696), 1901097514);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)Z")
    private static final boolean method2117(int arg0, int arg1, int arg2, int arg3) {
        if (class136.method1009(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class61.method422(var4 + 1, class245.field4123[arg0][arg1][arg2] + arg3, var5 + 1) && class61.method422(var4 + 128 - 1, class245.field4123[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class61.method422(var4 + 128 - 1, class245.field4123[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class61.method422(var4 + 1, class245.field4123[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laj;BI)Z")
    public static final boolean method2118(class151 arg0, byte arg1, int arg2) {
        if (arg1 > -65) {
            field5054 = null;
        }
        field5038++;
        byte[] var3 = arg0.method1119(-2, arg2);
        if (var3 == null) {
            return false;
        } else {
            class136.method1008(-121, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldl;IIIB)V")
    public static final void method2119(class123 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field5055++;
        if (class16.field314 == arg0 || class287.field4747 >= 400) {
            return;
        }
        String var5;
        if (arg0.field2058 == 0) {
            boolean var6 = true;
            if (class16.field314.field2086 != -1 && arg0.field2086 != -1) {
                int var7 = class16.field314.field2073 > arg0.field2073 ? class16.field314.field2073 : arg0.field2073;
                int var8 = class16.field314.field2073 - arg0.field2073;
                int var9 = class16.field314.field2086 >= arg0.field2086 ? arg0.field2086 : class16.field314.field2086;
                int var10 = (var7 * 10 / 100) + var9 + 5;
                if (var8 < 0) {
                    var8 = -var8;
                }
                if (var8 > var10) {
                    var6 = false;
                }
            }
            String var11 = class43.field659 == 1 ? class119.field2000 : class134.field2205;
            if (arg0.field2075 > arg0.field2073) {
                var5 = arg0.method918(26, true) + (var6 ? class25.method158(5, class16.field314.field2073, arg0.field2073) : "<col=ffffff>") + " (" + var11 + arg0.field2073 + "+" + (arg0.field2075 - arg0.field2073) + ")";
            } else {
                var5 = arg0.method918(116, true) + (var6 ? class25.method158(arg4 + 122, class16.field314.field2073, arg0.field2073) : "<col=ffffff>") + " (" + var11 + arg0.field2073 + ")";
            }
        } else {
            var5 = arg0.method918(arg4 + 132, true) + " (" + class5.field121 + arg0.field2058 + ")";
        }
        if (class272.field4554 == 1) {
            class289.method2009(arg2, class46.field813 + " -> <col=ffffff>" + var5, true, (long) arg3, arg1, class135.field2222, class245.field4116, (short) 3);
            class95.field1542++;
        } else if (!class302.field4918) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class66.field1107[var12] != null) {
                    class214.field3614++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class43.field659 == 0 && class66.field1107[var12].equalsIgnoreCase(class109.field1798)) {
                        if (class16.field314.field2073 < arg0.field2073) {
                            var14 = 2000;
                        }
                        if (class16.field314.field2079 != 0 && arg0.field2079 != 0) {
                            if (class16.field314.field2079 == arg0.field2079) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class246.field4124[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class13.field274[var12];
                    short var16 = (short) (var14 + var15);
                    class289.method2009(arg2, "<col=ffffff>" + var5, true, (long) arg3, arg1, class171.field2766[var12], class66.field1107[var12], var16);
                }
            }
        } else if ((class30.field497 & 0x8) != 0) {
            class249.field4180++;
            class289.method2009(arg2, class93.field1517 + " -> <col=ffffff>" + var5, true, (long) arg3, arg1, class169.field2741, class238.field4011, (short) 13);
        }
        if (arg4 != -117) {
            field5036 = -50;
        }
        for (int var17 = 0; var17 < class287.field4747; var17++) {
            if (class195.field3154[var17] == 48) {
                class184.field2932[var17] = "<col=ffffff>" + var5;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)I")
    public static final int method2120(byte arg0, int arg1) {
        field5048++;
        class222 var2 = class4.method33(arg1, -123);
        if (arg0 >= -110) {
            field5043 = 104;
        }
        int var3 = var2.field3726;
        int var4 = var2.field3732;
        int var5 = var2.field3730;
        int var6 = class270.field4489[var5 - var4];
        return var6 & class12.field230[var3] >> var4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)V")
    public static final void method2121(int arg0, int arg1, int arg2) {
        field5042++;
        class36 var3 = class136.method1013(arg1, arg0, (byte) -90);
        var3.method224(false);
        var3.field577 = arg2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmc;Z)V")
    public static final void method2122(class174 arg0, boolean arg1) {
        class187.field2989.method311(98, arg0);
        while (true) {
            class174 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class174[][] var7;
            class174 var83;
            do {
                class174 var82;
                do {
                    class174 var81;
                    do {
                        class174 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class174) class187.field2989.method316(-62);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2798);
                                            var3 = var2.field2806;
                                            var4 = var2.field2803;
                                            var5 = var2.field2807;
                                            var6 = var2.field2821;
                                            var7 = class90.field1498[var5];
                                            if (!var2.field2804) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class174 var8 = class90.field1498[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2798) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class286.field4742 && var3 > class146.field2413) {
                                                    class174 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2798 && (var9.field2804 || (var2.field2819 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class286.field4742 && var3 < class16.field316 - 1) {
                                                    class174 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2798 && (var10.field2804 || (var2.field2819 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class303.field4929 && var4 > class64.field1081) {
                                                    class174 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2798 && (var11.field2804 || (var2.field2819 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class303.field4929 && var4 < class26.field456 - 1) {
                                                    class174 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2798 && (var12.field2804 || (var2.field2819 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2804 = false;
                                            if (var2.field2810 != null) {
                                                class174 var13 = var2.field2810;
                                                if (var13.field2818 == null) {
                                                    if (var13.field2808 != null) {
                                                        if (class136.method1009(0, var3, var4)) {
                                                            class45.method277(var13.field2808, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, true);
                                                        } else {
                                                            class45.method277(var13.field2808, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class136.method1009(0, var3, var4)) {
                                                    class197.method1401(var13.field2818, 0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, true);
                                                } else {
                                                    class197.method1401(var13.field2818, 0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, false);
                                                }
                                                class184 var14 = var13.field2800;
                                                if (var14 != null) {
                                                    var14.field2935.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var14.field2934 - class118.field1987, var14.field2942 - class28.field481, var14.field2941 - class84.field1398, var14.field2945, var5, (class139) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field2814; var15++) {
                                                    class73 var16 = var13.field2812[var15];
                                                    if (var16 != null) {
                                                        var16.field1262.method852(var16.field1273, class310.field4992, class236.field3984, class273.field4570, class4.field118, var16.field1284 - class118.field1987, var16.field1272 - class28.field481, var16.field1268 - class84.field1398, var16.field1278, var5, (class139) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2818 == null) {
                                                if (var2.field2808 != null) {
                                                    if (class136.method1009(var6, var3, var4)) {
                                                        class45.method277(var2.field2808, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class45.method277(var2.field2808, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, false);
                                                    }
                                                }
                                            } else if (class136.method1009(var6, var3, var4)) {
                                                class197.method1401(var2.field2818, var6, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2818.field4324 != 12345678 || class80.field1345 && var5 <= class111.field1830) {
                                                    class197.method1401(var2.field2818, var6, class310.field4992, class236.field3984, class273.field4570, class4.field118, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class23 var18 = var2.field2805;
                                                if (var18 != null && (var18.field428 & 0x80000000L) != 0L) {
                                                    var18.field425.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var18.field421 - class118.field1987, var18.field417 - class28.field481, var18.field429 - class84.field1398, var18.field428, var5, (class139) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class184 var21 = var2.field2800;
                                            class251 var22 = var2.field2817;
                                            if (var21 != null || var22 != null) {
                                                if (class286.field4742 == var3) {
                                                    var19++;
                                                } else if (class286.field4742 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class303.field4929 == var4) {
                                                    var19 += 3;
                                                } else if (class303.field4929 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class261.field4382[var19];
                                                var2.field2809 = class306.field4955[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2933 & class36.field563[var19]) == 0) {
                                                    var2.field2815 = 0;
                                                } else if (var21.field2933 == 16) {
                                                    var2.field2815 = 3;
                                                    var2.field2811 = class135.field2230[var19];
                                                    var2.field2820 = 3 - var2.field2811;
                                                } else if (var21.field2933 == 32) {
                                                    var2.field2815 = 6;
                                                    var2.field2811 = class273.field4572[var19];
                                                    var2.field2820 = 6 - var2.field2811;
                                                } else if (var21.field2933 == 64) {
                                                    var2.field2815 = 12;
                                                    var2.field2811 = class260.field4372[var19];
                                                    var2.field2820 = 12 - var2.field2811;
                                                } else {
                                                    var2.field2815 = 9;
                                                    var2.field2811 = class293.field4821[var19];
                                                    var2.field2820 = 9 - var2.field2811;
                                                }
                                                if ((var21.field2933 & var20) != 0 && !class4.method37(var6, var3, var4, var21.field2933)) {
                                                    var21.field2935.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var21.field2934 - class118.field1987, var21.field2942 - class28.field481, var21.field2941 - class84.field1398, var21.field2945, var5, (class139) null);
                                                }
                                                if ((var21.field2944 & var20) != 0 && !class4.method37(var6, var3, var4, var21.field2944)) {
                                                    var21.field2937.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var21.field2934 - class118.field1987, var21.field2942 - class28.field481, var21.field2941 - class84.field1398, var21.field2945, var5, (class139) null);
                                                }
                                            }
                                            if (var22 != null && !method2117(var6, var3, var4, var22.field4255.method860())) {
                                                if ((var22.field4241 & var20) != 0) {
                                                    var22.field4255.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var22.field4248 + var22.field4249 - class118.field1987, var22.field4246 - class28.field481, var22.field4247 + var22.field4243 - class84.field1398, var22.field4256, var5, (class139) null);
                                                } else if (var22.field4241 == 256) {
                                                    int var23 = var22.field4248 - class118.field1987;
                                                    int var24 = var22.field4246 - class28.field481;
                                                    int var25 = var22.field4247 - class84.field1398;
                                                    int var26 = var22.field4240;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field4255.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var22.field4249 + var23, var24, var22.field4243 + var25, var22.field4256, var5, (class139) null);
                                                    } else if (var22.field4244 != null) {
                                                        var22.field4244.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var23, var24, var25, var22.field4256, var5, (class139) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class23 var29 = var2.field2805;
                                                if (var29 != null && (var29.field428 & 0x80000000L) == 0L) {
                                                    var29.field425.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var29.field421 - class118.field1987, var29.field417 - class28.field481, var29.field429 - class84.field1398, var29.field428, var5, (class139) null);
                                                }
                                                class170 var30 = var2.field2816;
                                                if (var30 != null && var30.field2744 == 0) {
                                                    if (var30.field2755 != null) {
                                                        var30.field2755.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var30.field2748 - class118.field1987, var30.field2753 - class28.field481, var30.field2757 - class84.field1398, var30.field2754, var5, (class139) null);
                                                    }
                                                    if (var30.field2749 != null) {
                                                        var30.field2749.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var30.field2748 - class118.field1987, var30.field2753 - class28.field481, var30.field2757 - class84.field1398, var30.field2754, var5, (class139) null);
                                                    }
                                                    if (var30.field2745 != null) {
                                                        var30.field2745.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var30.field2748 - class118.field1987, var30.field2753 - class28.field481, var30.field2757 - class84.field1398, var30.field2754, var5, (class139) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2819;
                                            if (var31 != 0) {
                                                if (var3 < class286.field4742 && (var31 & 0x4) != 0) {
                                                    class174 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2798) {
                                                        class187.field2989.method311(83, var32);
                                                    }
                                                }
                                                if (var4 < class303.field4929 && (var31 & 0x2) != 0) {
                                                    class174 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2798) {
                                                        class187.field2989.method311(93, var33);
                                                    }
                                                }
                                                if (var3 > class286.field4742 && (var31 & 0x1) != 0) {
                                                    class174 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2798) {
                                                        class187.field2989.method311(90, var34);
                                                    }
                                                }
                                                if (var4 > class303.field4929 && (var31 & 0x8) != 0) {
                                                    class174 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2798) {
                                                        class187.field2989.method311(83, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2815 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2814; var37++) {
                                                if (class265.field4430 != var2.field2812[var37].field1271 && (var2.field2801[var37] & var2.field2815) == var2.field2811) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class184 var38 = var2.field2800;
                                                if (!class4.method37(var6, var3, var4, var38.field2933)) {
                                                    var38.field2935.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var38.field2934 - class118.field1987, var38.field2942 - class28.field481, var38.field2941 - class84.field1398, var38.field2945, var5, (class139) null);
                                                }
                                                var2.field2815 = 0;
                                            }
                                        }
                                        if (!var2.field2799) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2814;
                                            var2.field2799 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; var41++) {
                                                class73 var42 = var2.field2812[var41];
                                                if (class265.field4430 != var42.field1271) {
                                                    for (int var43 = var42.field1270; var43 <= var42.field1269; var43++) {
                                                        for (int var44 = var42.field1266; var44 <= var42.field1276; var44++) {
                                                            class174 var45 = var7[var43][var44];
                                                            if (var45.field2804) {
                                                                var2.field2799 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field2815 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1270) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1269) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1266) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1276) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2815) == var2.field2820) {
                                                                    var2.field2799 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class125.field2103[var40++] = var42;
                                                    int var47 = class286.field4742 - var42.field1270;
                                                    int var48 = var42.field1269 - class286.field4742;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class303.field4929 - var42.field1266;
                                                    int var50 = var42.field1276 - class303.field4929;
                                                    if (var50 > var49) {
                                                        var42.field1287 = var47 + var50;
                                                    } else {
                                                        var42.field1287 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class73 var54 = class125.field2103[var53];
                                                    if (class265.field4430 != var54.field1271) {
                                                        if (var54.field1287 > var51) {
                                                            var51 = var54.field1287;
                                                            var52 = var53;
                                                        } else if (var54.field1287 == var51) {
                                                            int var55 = var54.field1284 - class118.field1987;
                                                            int var56 = var54.field1268 - class84.field1398;
                                                            int var57 = class125.field2103[var52].field1284 - class118.field1987;
                                                            int var58 = class125.field2103[var52].field1268 - class84.field1398;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class73 var59 = class125.field2103[var52];
                                                var59.field1271 = class265.field4430;
                                                if (!class149.method1109(var6, var59.field1270, var59.field1269, var59.field1266, var59.field1276, var59.field1262.method860())) {
                                                    var59.field1262.method852(var59.field1273, class310.field4992, class236.field3984, class273.field4570, class4.field118, var59.field1284 - class118.field1987, var59.field1272 - class28.field481, var59.field1268 - class84.field1398, var59.field1278, var5, (class139) null);
                                                }
                                                for (int var60 = var59.field1270; var60 <= var59.field1269; var60++) {
                                                    for (int var61 = var59.field1266; var61 <= var59.field1276; var61++) {
                                                        class174 var62 = var7[var60][var61];
                                                        if (var62.field2815 != 0) {
                                                            class187.field2989.method311(86, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2798) {
                                                            class187.field2989.method311(76, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2799) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field2799 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2813 != null) {
                                        int var63 = class139.field2281 + class128.field2132;
                                        int var64 = class139.field2271 + class128.field2137;
                                        class187 var65 = var2.field2813.field2697;
                                        for (class187 var66 = var65.field2985; var66 != var65; var66 = var66.field2985) {
                                            class38 var67 = (class38) var66;
                                            if (var67.field601 != null && !var67.field601.field3755.field2269) {
                                                if ((byte) ((int) (var67.field601.field3755.field2280 & 0xFFL)) != var2.field2802) {
                                                    var2.field2813 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field592 >> 12) - class118.field1987;
                                                int var69 = (var67.field595 >> 12) - class28.field481;
                                                int var70 = (var67.field602 >> 12) - class84.field1398;
                                                int var71 = class4.field118 * var68 + class273.field4570 * var70 >> 16;
                                                int var72 = class4.field118 * var70 - class273.field4570 * var68 >> 16;
                                                int var74 = class236.field3984 * var69 - class310.field4992 * var72 >> 16;
                                                int var75 = class310.field4992 * var69 + class236.field3984 * var72 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class211.method1482(var77, var78, (var67.field601.field3767.field214 << 16) / var79, var67.field604, var67.field604 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2798);
                            } while (var2.field2815 != 0);
                            if (var3 > class286.field4742 || var3 <= class146.field2413) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field2798);
                        if (var3 < class286.field4742 || var3 >= class16.field316 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field2798);
                    if (var4 > class303.field4929 || var4 <= class64.field1081) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field2798);
                if (var4 < class303.field4929 || var4 >= class26.field456 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field2798);
            var2.field2798 = false;
            class270.field4490--;
            class170 var84 = var2.field2816;
            if (var84 != null && var84.field2744 != 0) {
                if (var84.field2755 != null) {
                    var84.field2755.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var84.field2748 - class118.field1987, var84.field2753 - class28.field481 - var84.field2744, var84.field2757 - class84.field1398, var84.field2754, var5, (class139) null);
                }
                if (var84.field2749 != null) {
                    var84.field2749.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var84.field2748 - class118.field1987, var84.field2753 - class28.field481 - var84.field2744, var84.field2757 - class84.field1398, var84.field2754, var5, (class139) null);
                }
                if (var84.field2745 != null) {
                    var84.field2745.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var84.field2748 - class118.field1987, var84.field2753 - class28.field481 - var84.field2744, var84.field2757 - class84.field1398, var84.field2754, var5, (class139) null);
                }
            }
            if (var2.field2809 != 0) {
                class251 var85 = var2.field2817;
                if (var85 != null && !method2117(var6, var3, var4, var85.field4255.method860())) {
                    if ((var85.field4241 & var2.field2809) != 0) {
                        var85.field4255.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var85.field4248 + var85.field4249 - class118.field1987, var85.field4246 - class28.field481, var85.field4247 + var85.field4243 - class84.field1398, var85.field4256, var5, (class139) null);
                    } else if (var85.field4241 == 256) {
                        int var86 = var85.field4248 - class118.field1987;
                        int var87 = var85.field4246 - class28.field481;
                        int var88 = var85.field4247 - class84.field1398;
                        int var89 = var85.field4240;
                        int var90;
                        if (var89 == 1 || var89 == 2) {
                            var90 = -var86;
                        } else {
                            var90 = var86;
                        }
                        int var91;
                        if (var89 == 2 || var89 == 3) {
                            var91 = -var88;
                        } else {
                            var91 = var88;
                        }
                        if (var91 >= var90) {
                            var85.field4255.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var85.field4249 + var86, var87, var85.field4243 + var88, var85.field4256, var5, (class139) null);
                        } else if (var85.field4244 != null) {
                            var85.field4244.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var86, var87, var88, var85.field4256, var5, (class139) null);
                        }
                    }
                }
                class184 var92 = var2.field2800;
                if (var92 != null) {
                    if ((var92.field2944 & var2.field2809) != 0 && !class4.method37(var6, var3, var4, var92.field2944)) {
                        var92.field2937.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var92.field2934 - class118.field1987, var92.field2942 - class28.field481, var92.field2941 - class84.field1398, var92.field2945, var5, (class139) null);
                    }
                    if ((var92.field2933 & var2.field2809) != 0 && !class4.method37(var6, var3, var4, var92.field2933)) {
                        var92.field2935.method852(0, class310.field4992, class236.field3984, class273.field4570, class4.field118, var92.field2934 - class118.field1987, var92.field2942 - class28.field481, var92.field2941 - class84.field1398, var92.field2945, var5, (class139) null);
                    }
                }
            }
            if (var5 < class107.field1759 - 1) {
                class174 var93 = class90.field1498[var5 + 1][var3][var4];
                if (var93 != null && var93.field2798) {
                    class187.field2989.method311(125, var93);
                }
            }
            if (var3 < class286.field4742) {
                class174 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field2798) {
                    class187.field2989.method311(111, var94);
                }
            }
            if (var4 < class303.field4929) {
                class174 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field2798) {
                    class187.field2989.method311(92, var95);
                }
            }
            if (var3 > class286.field4742) {
                class174 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field2798) {
                    class187.field2989.method311(120, var96);
                }
            }
            if (var4 > class303.field4929) {
                class174 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field2798) {
                    class187.field2989.method311(111, var97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method2123(int arg0) {
        field5032 = null;
        field5050 = null;
        int var1 = -68 % ((-arg0 - 39) / 42);
        field5031 = null;
        field5054 = null;
        field5047 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method2124(int arg0, int arg1) {
        field5046++;
        class36 var2 = class136.method1013(arg0, arg1, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static final void method2125(boolean arg0) {
        field5039++;
        class196.field3156.method97(108);
        class162.field2633.method97(68);
        if (arg0) {
            method2125(true);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static final void method2126(int arg0) {
        class224.field3774++;
        if (arg0 != 8874) {
            field5049 = true;
        }
        field5041++;
    }
}
