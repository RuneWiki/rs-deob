import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class248 {

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field3593 = 0;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lvj;B)[Lt;", line = 3)
    public static final class319[] method1788(class177 arg0, byte arg1) {
        field3592++;
        if (!arg0.method1389((byte) -78)) {
            return new class319[0];
        }
        class131 var2 = arg0.method1366((byte) 41);
        while (var2.field2121 == 0) {
            class134.method1106(10L, 10);
        }
        if (var2.field2121 == 2) {
            return new class319[0];
        }
        int[] var3 = (int[]) var2.field2125;
        class319[] var4 = new class319[var3.length >> 2];
        int var5 = 0;
        if (arg1 != 83) {
            return null;
        }
        while (var5 < var4.length) {
            class319 var6 = new class319();
            var4[var5] = var6;
            var6.field4608 = var3[var5 << 2];
            var6.field4611 = var3[(var5 << 2) + 1];
            var6.field4615 = var3[(var5 << 2) + 2];
            var6.field4605 = var3[(var5 << 2) + 3];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)Llo;", line = 48)
    public static final class419 method1789(byte arg0, int arg1) {
        field3591++;
        int var2 = -113 / ((arg0 + 17) / 62);
        class18 var3 = class297.field4395;
        class419 var4;
        synchronized (class297.field4395) {
            var4 = (class419) class297.field4395.method103(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = class231.field3375.method1355(arg1, -12607, 32);
        class419 var6 = new class419();
        if (var5 != null) {
            var6.method2629(new class37(var5), -72);
        }
        var6.method2630((byte) 127);
        class18 var7 = class297.field4395;
        synchronized (class297.field4395) {
            class297.field4395.method113(var6, 0, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BIILmb;)V", line = 80)
    public static final void method1790(byte arg0, int arg1, int arg2, class258 arg3) {
        field3594++;
        if (arg3.field3835 == 1) {
            class26.method217(0, arg3.field3801, 33, arg3.field3854, -1, 12154, "", 0L);
            class186.field2743++;
        }
        if (arg0 > -41) {
            field3593 = 34;
        }
        if (arg3.field3835 == 2 && !class291.field4332) {
            String var4 = class33.method240(16, arg3);
            if (var4 != null) {
                class26.method217(-1, var4, 29, arg3.field3854, -1, 12154, "<col=00ff00>" + arg3.field3800, 0L);
                class381.field5407++;
            }
        }
        if (arg3.field3835 == 3) {
            class26.method217(0, class447.field6518, 50, arg3.field3854, -1, 12154, "", 0L);
            class324.field4670++;
        }
        if (arg3.field3835 == 4) {
            class199.field2906++;
            class26.method217(0, arg3.field3801, 6, arg3.field3854, -1, 12154, "", 0L);
        }
        if (arg3.field3835 == 5) {
            class99.field1553++;
            class26.method217(0, arg3.field3801, 22, arg3.field3854, -1, 12154, "", 0L);
        }
        if (arg3.field3835 == 6 && class132.field2132 == null) {
            class26.method217(-1, arg3.field3801, 14, arg3.field3854, -1, 12154, "", 0L);
            class284.field4250++;
        }
        if (arg3.field3793 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field3814; var6++) {
                for (int var7 = 0; var7 < arg3.field3905; var7++) {
                    int var8 = (arg3.field3769 + 32) * var7;
                    int var9 = (arg3.field3755 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field3874[var5];
                        var8 += arg3.field3839[var5];
                    }
                    if (var8 <= arg2 && arg1 >= var9 && var8 + 32 > arg2 && var9 + 32 > arg1) {
                        class369.field5235 = arg3;
                        class326.field4700 = var5;
                        if (arg3.field3847[var5] > 0) {
                            class417 var10 = client.method1815(arg3);
                            class124 var11 = class206.method1561(114, arg3.field3847[var5] - 1);
                            if (class47.field765 == 1 && var10.method2613(84)) {
                                if (class22.field335 != arg3.field3854 || class372.field5285 != var5) {
                                    class26.method217(var5, class19.field267, 9, arg3.field3854, class119.field1867, 12154, class85.field1377 + " -> <col=ff9040>" + var11.field1999, (long) var11.field1974);
                                    class279.field4192++;
                                }
                            } else if (class291.field4332 && var10.method2613(39)) {
                                class413 var12 = class209.field3041 == -1 ? null : class392.method2497(class209.field3041, 0);
                                if ((class320.field4637 & 0x10) != 0 && (var12 == null || var11.method1049(class209.field3041, var12.field5993, false) != var12.field5993)) {
                                    class26.method217(var5, class171.field2549, 40, arg3.field3854, class72.field1207, 12154, class79.field1339 + " -> <col=ff9040>" + var11.field1999, (long) var11.field1974);
                                    class11.field157++;
                                }
                            } else {
                                String[] var13 = var11.field1996;
                                if (var10.method2613(87)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            int var15 = -1;
                                            byte var16;
                                            if (var14 == 3) {
                                                var16 = 24;
                                            } else {
                                                var16 = 34;
                                            }
                                            if (var11.field2029 == var14) {
                                                var15 = var11.field1975;
                                            }
                                            if (var11.field2012 == var14) {
                                                var15 = var11.field2005;
                                            }
                                            class26.method217(var5, var13[var14], var16, arg3.field3854, var15, 12154, "<col=ff9040>" + var11.field1999, (long) var11.field1974);
                                            class292.field4340++;
                                        }
                                    }
                                }
                                if (var10.method2606((byte) -107)) {
                                    class26.method217(var5, class19.field267, 11, arg3.field3854, class119.field1867, 12154, "<col=ff9040>" + var11.field1999, (long) var11.field1974);
                                    class415.field6006++;
                                }
                                if (var10.method2613(76) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            int var19 = -1;
                                            if (var17 == 0) {
                                                var18 = 28;
                                            }
                                            if (var17 == 1) {
                                                var18 = 42;
                                            }
                                            if (var11.field2029 == var17) {
                                                var19 = var11.field1975;
                                            }
                                            if (var17 == 2) {
                                                var18 = 23;
                                            }
                                            if (var11.field2012 == var17) {
                                                var19 = var11.field2005;
                                            }
                                            class144.field2249++;
                                            class26.method217(var5, var13[var17], var18, arg3.field3854, var19, 12154, "<col=ff9040>" + var11.field1999, (long) var11.field1974);
                                        }
                                    }
                                }
                                String[] var20 = arg3.field3779;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            int var23 = -1;
                                            if (var21 == 0) {
                                                var22 = 7;
                                            }
                                            if (var21 == 1) {
                                                var22 = 8;
                                            }
                                            if (var21 == 2) {
                                                var22 = 10;
                                            }
                                            if (var21 == 3) {
                                                var22 = 48;
                                            }
                                            if (var11.field2029 == var21) {
                                                var23 = var11.field1975;
                                            }
                                            if (var21 == 4) {
                                                var22 = 16;
                                            }
                                            if (var11.field2012 == var21) {
                                                var23 = var11.field2005;
                                            }
                                            class26.method217(var5, var20[var21], var22, arg3.field3854, var23, 12154, "<col=ff9040>" + var11.field1999, (long) var11.field1974);
                                            class288.field4298++;
                                        }
                                    }
                                }
                                class26.method217(var5, class183.field2696, 1005, arg3.field3854, class64.field1038, 12154, "<col=ff9040>" + var11.field1999, (long) var11.field1974);
                                class202.field2946++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field3825) {
            return;
        }
        if (!class291.field4332) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var28 = class388.method2454(var24, 8, arg3);
                if (var28 != null) {
                    class303.field4425++;
                    class26.method217(arg3.field3860, var28, 1010, arg3.field3854, class198.method1511(-1, arg3, var24), 12154, arg3.field3863, (long) (var24 + 1));
                }
            }
            String var25 = class33.method240(16, arg3);
            if (var25 != null) {
                class381.field5407++;
                class26.method217(arg3.field3860, var25, 29, arg3.field3854, -1, 12154, arg3.field3863, 0L);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = class388.method2454(var26, 8, arg3);
                if (var27 != null) {
                    class26.method217(arg3.field3860, var27, 37, arg3.field3854, class198.method1511(-1, arg3, var26), 12154, arg3.field3863, (long) (var26 + 1));
                    class303.field4425++;
                }
            }
            if (!client.method1815(arg3).method2619((byte) -126)) {
                return;
            }
            if (arg3.field3741 == null) {
                class26.method217(arg3.field3860, class143.field2238, 14, arg3.field3854, -1, 12154, "", 0L);
            } else {
                class26.method217(arg3.field3860, arg3.field3741, 14, arg3.field3854, -1, 12154, "", 0L);
            }
            class284.field4250++;
        } else if (client.method1815(arg3).method2607(true) && (class320.field4637 & 0x20) != 0) {
            class26.method217(arg3.field3860, class171.field2549, 5, arg3.field3854, class72.field1207, 12154, class79.field1339 + " -> " + arg3.field3863, 0L);
            class115.field1829++;
            return;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 420)
    public static final void method1791(int arg0) {
        if (arg0 != 40) {
            method1789((byte) -86, 91);
        }
        field3596++;
        class20.field306 = 0;
        class117.field1844 = 0;
        class273.field4113 = 0;
        class107.field1769 = 0;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V", line = 435)
    public static final void method1792(int arg0) {
        if (arg0 >= -93) {
            return;
        }
        if (class23.field350 != null) {
            class284 var1 = class23.field350;
            synchronized (class23.field350) {
                class23.field350 = null;
            }
        }
        field3595++;
    }
}
