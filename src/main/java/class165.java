import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class165 extends class212 {

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "Lqf;")
    public class13 field2812;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field2809 = 0;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "Lhe;")
    public static class47 field2811 = new class47();

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "[J")
    public static long[] field2815 = new long[32];

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "Lqe;")
    public static class168 field2813 = class66.method448("", -111);

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Lfb;")
    public static class234 field2816 = new class234();

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "Lqe;")
    public static class168 field2819 = class66.method448("Welt", -118);

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "Lqe;")
    public static class168 field2820 = class66.method448("::tele 0)1", -109);

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Lqe;")
    public static class168 field2818 = class66.method448(": ", -113);

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method1057(byte arg0) {
        int var1 = -52 % ((-arg0 - 10) / 54);
        class110.field1763.method1497((byte) 44);
        field2810++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)I")
    public static final int method1058(int arg0, boolean arg1) {
        field2806++;
        if (!arg1) {
            field2818 = null;
        }
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILmj;I)V")
    public static final void method1059(int arg0, int arg1, class129 arg2, int arg3) {
        if (arg2.field2142 == 1) {
            class94.method624(0, 0L, (short) 49, arg2.field2222, class222.field3816, arg2.field2238, (byte) 101);
            class84.field1286++;
        }
        if (arg2.field2142 == 2 && !class84.field1277) {
            class168 var4 = class221.method1453(arg2, -113);
            if (var4 != null) {
                class99.field1566++;
                class94.method624(-1, 0L, (short) 57, arg2.field2222, class50.method347(2, new class168[] { class167.field2850, arg2.field2292 }), var4, (byte) 125);
            }
        }
        if (arg2.field2142 == 3) {
            class29.field354++;
            class94.method624(0, 0L, (short) 17, arg2.field2222, class222.field3816, class109.field1753, (byte) 121);
        }
        if (arg2.field2142 == 4) {
            class168.field2916++;
            class94.method624(0, 0L, (short) 20, arg2.field2222, class222.field3816, arg2.field2238, (byte) 120);
        }
        if (arg2.field2142 == 5) {
            class256.field4450++;
            class94.method624(0, 0L, (short) 10, arg2.field2222, class222.field3816, arg2.field2238, (byte) 102);
        }
        if (arg2.field2142 == 6 && class211.field3644 == null) {
            class2.field23++;
            class94.method624(-1, 0L, (short) 11, arg2.field2222, class222.field3816, arg2.field2238, (byte) 109);
        }
        if (arg2.field2230 == arg1) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field2253; var6++) {
                for (int var7 = 0; var7 < arg2.field2166; var7++) {
                    int var8 = (arg2.field2199 + 32) * var6;
                    int var9 = (arg2.field2179 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg2.field2245[var5];
                        var9 += arg2.field2275[var5];
                    }
                    if (arg0 >= var9 && var8 <= arg3 && arg0 < var9 + 32 && arg3 < var8 + 32) {
                        class129.field2285 = var5;
                        class8.field90 = arg2;
                        if (arg2.field2156[var5] > 0) {
                            class242 var10 = class151.method1005(arg1 ^ 0x20A, arg2.field2156[var5] - 1);
                            if (class190.field3311 == 1 && class103.method688(false, client.method266(arg2))) {
                                if (class222.field3806 != arg2.field2222 || class104.field1676 != var5) {
                                    class129.field2151++;
                                    class94.method624(var5, (long) var10.field4183, (short) 8, arg2.field2222, class50.method347(arg1, new class168[] { class117.field1911, class242.field4134, var10.field4167 }), class90.field1398, (byte) 119);
                                }
                            } else if (!class84.field1277 || !class103.method688(false, client.method266(arg2))) {
                                class53.field734++;
                                class168[] var11 = var10.field4158;
                                if (class249.field4321) {
                                    var11 = class233.method1505((byte) -81, var11);
                                }
                                if (class103.method688(false, client.method266(arg2))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class133.field2333++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 39;
                                            } else {
                                                var13 = 19;
                                            }
                                            class94.method624(var5, (long) var10.field4183, var13, arg2.field2222, class50.method347(arg1, new class168[] { class85.field1328, var10.field4167 }), var11[var12], (byte) 107);
                                        } else if (var12 == 4) {
                                            class94.method624(var5, (long) var10.field4183, (short) 19, arg2.field2222, class50.method347(arg1, new class168[] { class85.field1328, var10.field4167 }), class95.field1504, (byte) 110);
                                            class27.field334++;
                                        }
                                    }
                                }
                                if (class63.method423(1, client.method266(arg2))) {
                                    class94.method624(var5, (long) var10.field4183, (short) 46, arg2.field2222, class50.method347(2, new class168[] { class85.field1328, var10.field4167 }), class90.field1398, (byte) 126);
                                    class222.field3808++;
                                }
                                if (class103.method688(false, client.method266(arg2)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 24;
                                            }
                                            class32.field398++;
                                            if (var14 == 1) {
                                                var15 = 28;
                                            }
                                            if (var14 == 2) {
                                                var15 = 1;
                                            }
                                            class94.method624(var5, (long) var10.field4183, var15, arg2.field2222, class50.method347(arg1, new class168[] { class85.field1328, var10.field4167 }), var11[var14], (byte) 110);
                                        }
                                    }
                                }
                                class168[] var16 = arg2.field2173;
                                if (class249.field4321) {
                                    var16 = class233.method1505((byte) -112, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class100.field1592++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 42;
                                            }
                                            if (var17 == 1) {
                                                var18 = 18;
                                            }
                                            if (var17 == 2) {
                                                var18 = 50;
                                            }
                                            if (var17 == 3) {
                                                var18 = 45;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            class94.method624(var5, (long) var10.field4183, var18, arg2.field2222, class50.method347(arg1, new class168[] { class85.field1328, var10.field4167 }), var16[var17], (byte) 122);
                                        }
                                    }
                                }
                                class94.method624(var5, (long) var10.field4183, (short) 1003, arg2.field2222, class50.method347(arg1, new class168[] { class85.field1328, var10.field4167 }), class147.field2554, (byte) 103);
                            } else if ((class172.field2985 & 0x10) == 16) {
                                class94.method624(var5, (long) var10.field4183, (short) 23, arg2.field2222, class50.method347(arg1, new class168[] { class128.field2118, class242.field4134, var10.field4167 }), class19.field236, (byte) 121);
                                class63.field872++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2.field2258) {
            if (!class84.field1277) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class168 var23 = class234.method1509(arg2, var19, false);
                    if (var23 != null) {
                        class94.method624(arg2.field2123, (long) (var19 + 1), (short) 1007, arg2.field2222, arg2.field2148, var23, (byte) 118);
                        class128.field2116++;
                    }
                }
                class168 var20 = class221.method1453(arg2, arg1 ^ 0xFFFFFF93);
                if (var20 != null) {
                    class94.method624(arg2.field2123, 0L, (short) 57, arg2.field2222, arg2.field2148, var20, (byte) 111);
                    class99.field1566++;
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class168 var22 = class234.method1509(arg2, var21, false);
                    if (var22 != null) {
                        class128.field2116++;
                        class94.method624(arg2.field2123, (long) (var21 + 1), (short) 7, arg2.field2222, arg2.field2148, var22, (byte) 111);
                    }
                }
                if (class177.method1169(client.method266(arg2), arg1 ^ 0xFFFFFFE4)) {
                    class94.method624(arg2.field2123, 0L, (short) 11, arg2.field2222, class222.field3816, class134.field2351, (byte) 104);
                    class2.field23++;
                }
            } else if (class13.method44(client.method266(arg2), (byte) -82) && (class172.field2985 & 0x20) == 32) {
                class94.method624(arg2.field2123, 0L, (short) 58, arg2.field2222, class50.method347(2, new class168[] { class128.field2118, class155.field2710, arg2.field2148 }), class19.field236, (byte) 109);
                class249.field4312++;
            }
        }
        field2808++;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        field2811 = null;
        field2819 = null;
        field2815 = null;
        field2818 = null;
        field2820 = null;
        if (arg0 != 127) {
            field2817 = 98;
        }
        field2816 = null;
        field2813 = null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lqf;)V")
    public class165(class13 arg0) {
        this.field2812 = arg0;
    }
}
