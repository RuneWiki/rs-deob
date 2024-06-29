import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class122 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lrd;")
    public static class173 field2287 = class133.method843("Willkommen auf RuneScape", -103);

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lrd;")
    private static class173 field2290 = class133.method843("Unexpected loginserver response)3", 83);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lrd;")
    public static class173 field2296 = field2290;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2288 = -1;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lrd;")
    public static class173 field2292 = class133.method843("gleiten:", 37);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lrd;")
    private static class173 field2295 = class133.method843("Loaded input handler", 40);

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lrd;")
    public static class173 field2298 = field2295;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lrd;")
    public static class173 field2294 = class133.method843("sch-Utteln:", -75);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[Lrd;")
    public static class173[] field2299;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILqf;)V")
    public static final void method787(int arg0, int arg1, int arg2, class165 arg3) {
        field2289++;
        if (arg3.field3059 == 1) {
            class74.field1449++;
            class19.method172((byte) 124, (short) 47, 0L, arg3.field3071, 0, class208.field4049, arg3.field3132);
        }
        if (arg3.field3059 == 2 && !class182.field3582) {
            class173 var4 = class5.method40(127, arg3);
            if (var4 != null) {
                class19.method172((byte) 110, (short) 6, 0L, var4, -1, class173.method1158(arg1 - 42, new class173[] { class144.field2693, arg3.field3056 }), arg3.field3132);
                class29.field592++;
            }
        }
        if (arg3.field3059 == 3) {
            class19.method172((byte) -90, (short) 16, 0L, class46.field984, 0, class208.field4049, arg3.field3132);
            class195.field3799++;
        }
        if (arg1 != 39) {
            return;
        }
        if (arg3.field3059 == 4) {
            class76.field1491++;
            class19.method172((byte) -106, (short) 32, 0L, arg3.field3071, 0, class208.field4049, arg3.field3132);
        }
        if (arg3.field3059 == 5) {
            class19.method172((byte) 122, (short) 3, 0L, arg3.field3071, 0, class208.field4049, arg3.field3132);
            class108.field2019++;
        }
        if (arg3.field3059 == 6 && class93.field1749 == null) {
            class36.field774++;
            class19.method172((byte) -46, (short) 10, 0L, arg3.field3071, -1, class208.field4049, arg3.field3132);
        }
        if (arg3.field3077 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field3105; var6++) {
                for (int var7 = 0; var7 < arg3.field3156; var7++) {
                    int var8 = (arg3.field3179 + 32) * var7;
                    int var9 = (arg3.field3180 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field3121[var5];
                        var8 += arg3.field3122[var5];
                    }
                    if (arg0 >= var8 && var9 <= arg2 && var8 + 32 > arg0 && var9 + 32 > arg2) {
                        class30.field614 = var5;
                        class105.field1974 = arg3;
                        if (arg3.field3111[var5] > 0) {
                            class19 var10 = class195.method1298(1639, arg3.field3111[var5] - 1);
                            if (class9.field166 == 1 && class34.method267(class78.method474(arg3, arg1 ^ 0x4B), -14712)) {
                                if (class144.field2692 != arg3.field3132 || class21.field468 != var5) {
                                    class19.method172((byte) -62, (short) 31, (long) var10.field391, class20.field444, var5, class173.method1158(-3, new class173[] { class150.field2849, class106.field1985, var10.field399 }), arg3.field3132);
                                    class37.field793++;
                                }
                            } else if (!class182.field3582 || !class34.method267(class78.method474(arg3, 125), -14712)) {
                                class173[] var11 = var10.field395;
                                if (class176.field3461) {
                                    var11 = class118.method716(0, var11);
                                }
                                if (class34.method267(class78.method474(arg3, 125), -14712)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 44;
                                            } else {
                                                var13 = 40;
                                            }
                                            class19.method172((byte) -20, var13, (long) var10.field391, var11[var12], var5, class173.method1158(arg1 - 42, new class173[] { class214.field4151, var10.field399 }), arg3.field3132);
                                            class109.field2035++;
                                        } else if (var12 == 4) {
                                            class111.field2064++;
                                            class19.method172((byte) -69, (short) 40, (long) var10.field391, class212.field4105, var5, class173.method1158(-3, new class173[] { class214.field4151, var10.field399 }), arg3.field3132);
                                        }
                                    }
                                }
                                if (class152.method998(class78.method474(arg3, 94), (byte) 3)) {
                                    class116.field2144++;
                                    class19.method172((byte) -121, (short) 13, (long) var10.field391, class20.field444, var5, class173.method1158(arg1 - 42, new class173[] { class214.field4151, var10.field399 }), arg3.field3132);
                                }
                                class18.field372++;
                                if (class34.method267(class78.method474(arg3, 114), -14712) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class175.field3437++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 23;
                                            }
                                            if (var14 == 1) {
                                                var15 = 51;
                                            }
                                            if (var14 == 2) {
                                                var15 = 39;
                                            }
                                            class19.method172((byte) -86, var15, (long) var10.field391, var11[var14], var5, class173.method1158(-3, new class173[] { class214.field4151, var10.field399 }), arg3.field3132);
                                        }
                                    }
                                }
                                class173[] var16 = arg3.field3149;
                                if (class176.field3461) {
                                    var16 = class118.method716(0, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class195.field3796++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 49;
                                            }
                                            if (var17 == 1) {
                                                var18 = 22;
                                            }
                                            if (var17 == 2) {
                                                var18 = 24;
                                            }
                                            if (var17 == 3) {
                                                var18 = 41;
                                            }
                                            if (var17 == 4) {
                                                var18 = 7;
                                            }
                                            class19.method172((byte) 126, var18, (long) var10.field391, var16[var17], var5, class173.method1158(arg1 ^ 0xFFFFFFDA, new class173[] { class214.field4151, var10.field399 }), arg3.field3132);
                                        }
                                    }
                                }
                                class19.method172((byte) -123, (short) 1007, (long) var10.field391, class167.field3233, var5, class173.method1158(-3, new class173[] { class214.field4151, var10.field399 }), arg3.field3132);
                            } else if ((class36.field780 & 0x10) == 16) {
                                class119.field2193++;
                                class19.method172((byte) 122, (short) 5, (long) var10.field391, class48.field1023, var5, class173.method1158(-3, new class173[] { class42.field868, class106.field1985, var10.field399 }), arg3.field3132);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field3108) {
            return;
        }
        if (!class182.field3582) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class173 var23 = class80.method499(var19, arg3, 255);
                if (var23 != null) {
                    class19.method172((byte) -112, (short) 1001, (long) (var19 + 1), var23, arg3.field3173, arg3.field3109, arg3.field3132);
                    class57.field1140++;
                }
            }
            class173 var20 = class5.method40(127, arg3);
            if (var20 != null) {
                class29.field592++;
                class19.method172((byte) 108, (short) 6, 0L, var20, arg3.field3173, arg3.field3109, arg3.field3132);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class173 var22 = class80.method499(var21, arg3, 255);
                if (var22 != null) {
                    class19.method172((byte) -93, (short) 18, (long) (var21 + 1), var22, arg3.field3173, arg3.field3109, arg3.field3132);
                    class57.field1140++;
                }
            }
            if (!class129.method826(1, class78.method474(arg3, arg1 ^ 0x7A))) {
                return;
            }
            class36.field774++;
            class19.method172((byte) -112, (short) 10, 0L, class133.field2528, arg3.field3173, class208.field4049, arg3.field3132);
        } else if (class219.method1432((byte) 90, class78.method474(arg3, 127)) && (class36.field780 & 0x20) == 32) {
            class189.field3680++;
            class19.method172((byte) 123, (short) 33, 0L, class48.field1023, arg3.field3173, class173.method1158(-3, new class173[] { class42.field868, class182.field3562, arg3.field3109 }), arg3.field3132);
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
    public static void method788(boolean arg0) {
        field2298 = null;
        field2295 = null;
        field2287 = null;
        field2296 = null;
        field2294 = null;
        field2299 = null;
        field2292 = null;
        field2290 = null;
        if (arg0) {
            field2299 = null;
        }
    }
}
