import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class279 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Lrc;")
    public static class108 field4004 = new class108(58, 8);

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lmo;")
    public static class336 field4010 = new class336(32);

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field4012;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field4015;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1868(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
        field4013 = 0;
        field4014 = 0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 5)
    public static void method1863(int arg0) {
        field4004 = null;
        if (arg0 == -2) {
            field4010 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIII)V", line = 18)
    public static final void method1864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4009++;
        if (arg3 <= 16) {
            return;
        }
        if (class295.field4153 <= arg7 && arg1 <= class103.field1457 && arg5 >= class444.field6338 && class151.field2091 >= arg4) {
            class136.method1003(arg6, arg2, arg4, arg1, arg5, arg0, -307531412, arg7);
        } else {
            class169.method1222(arg7, arg5, arg0, arg1, arg2, -21895, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBI)V", line = 36)
    public static final void method1865(int arg0, byte arg1, int arg2) {
        class336.method2111(class52.field753, arg1 + 53);
        if (arg1 == 70) {
            field4008++;
            class181.field2746++;
            class311.field4403.method1187(arg2, (byte) -18);
            class311.field4403.method1177(arg0, arg1 ^ 0xFFFFFF9B);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 53)
    public static final void method1866(int arg0) {
        for (class436 var1 = (class436) class484.field6848.method775(1); var1 != null; var1 = (class436) class484.field6848.method763(arg0 + 16777216)) {
            if (class385.field5285 == null) {
                var1.method2714(125);
            } else if (class364.field5010 >= var1.field6196) {
                int var2 = class161.field2334[var1.field6197];
                if (var2 == 0) {
                    class421 var3 = class133.method991(var1.field6198, var1.field6199, var1.field6184);
                    if (var3 instanceof class281) {
                        class133.method989(var1.field6198, var1.field6199, var1.field6184);
                        class281 var4 = (class281) var3;
                        if (var4.field4037 != null) {
                            class398.method2393(var1.field6198, var1.field6199, var1.field6184, var4.field4037, (class421) null);
                        }
                    }
                } else if (var2 == 1) {
                    class371 var9 = class418.method2504(var1.field6198, var1.field6199, var1.field6184);
                    if (var9 instanceof class366) {
                        class387.method2353(var1.field6198, var1.field6199, var1.field6184);
                        class366 var10 = (class366) var9;
                        if (var10.field5032 != null) {
                            class266.method1794(var1.field6198, var1.field6199, var1.field6184, var10.field5032, (class371) null);
                        }
                    }
                } else if (var2 == 2) {
                    class325 var7 = class106.method847(var1.field6198, var1.field6199, var1.field6184, field4015 == null ? (field4015 = method1868("dc")) : field4015);
                    if (var7 instanceof class158) {
                        class409.method2450(var1.field6198, var1.field6199, var1.field6184, field4015 == null ? (field4015 = method1868("dc")) : field4015);
                        class158 var8 = (class158) var7;
                        if (var8.field2253 != null) {
                            class363.method2230(var8.field2253, false);
                        }
                    }
                } else if (var2 == 3) {
                    class390 var5 = class86.method730(var1.field6198, var1.field6199, var1.field6184);
                    if (var5 instanceof class469) {
                        class104.method835(var1.field6198, var1.field6199, var1.field6184);
                        class469 var6 = (class469) var5;
                        if (var6.field6616 != null) {
                            class18.method120(var1.field6198, var1.field6199, var1.field6184, var6.field6616);
                        }
                    }
                }
                var1.method2714(-122);
            } else if (class364.field5010 == var1.field6194) {
                int var11 = class161.field2334[var1.field6197];
                if (var11 == 0) {
                    class421 var12 = class133.method991(var1.field6198, var1.field6199, var1.field6184);
                    if (var12 instanceof class281) {
                        var1.method2714(arg0 + 16777158);
                    } else if (class389.method2359(var1.field6198, var1.field6199, var1.field6184) == null) {
                        class281 var13 = new class281(var1.field6197, var1.field6187, var1.field6186, var1.field6203, var1.field6201, var12);
                        class398.method2393(var1.field6198, var1.field6199, var1.field6184, var13, (class421) null);
                    } else {
                        var1.method2714(115);
                    }
                } else if (var11 == 1) {
                    class371 var14 = class418.method2504(var1.field6198, var1.field6199, var1.field6184);
                    if (var14 instanceof class366) {
                        var1.method2714(-96);
                    } else if (class341.method2128(var1.field6198, var1.field6199, var1.field6184) == null) {
                        class366 var15 = new class366(var1.field6197, var1.field6187, var1.field6186, var1.field6203, var1.field6201, var14);
                        class266.method1794(var1.field6198, var1.field6199, var1.field6184, var15, (class371) null);
                    } else {
                        var1.method2714(80);
                    }
                } else if (var11 == 2) {
                    class325 var18 = class106.method847(var1.field6198, var1.field6199, var1.field6184, field4015 == null ? (field4015 = method1868("dc")) : field4015);
                    if (var18 instanceof class158) {
                        var1.method2714(108);
                    } else {
                        class409.method2450(var1.field6198, var1.field6199, var1.field6184, field4015 == null ? (field4015 = method1868("dc")) : field4015);
                        class267 var19 = class468.field6599.method506(arg0 ^ 0xFFFF83, var1.field6185);
                        int var20;
                        int var21;
                        if (var1.field6187 == 1 || var1.field6187 == 3) {
                            var21 = var19.field3843;
                            var20 = var19.field3856;
                        } else {
                            var20 = var19.field3843;
                            var21 = var19.field3856;
                        }
                        class158 var22 = new class158(var1.field6197, var1.field6187, var1.field6198, var1.field6186, var1.field6203, var1.field6201, var1.field6199, var1.field6199 + var20 - 1, var1.field6184, var21 + var1.field6184 - 1, var18);
                        class363.method2230(var22, false);
                    }
                } else if (var11 == 3) {
                    class390 var16 = class86.method730(var1.field6198, var1.field6199, var1.field6184);
                    if (var16 instanceof class469) {
                        var1.method2714(114);
                    } else {
                        class469 var17 = new class469(var1.field6186, var1.field6203, var1.field6201, var16);
                        class18.method120(var1.field6198, var1.field6199, var1.field6184, var17);
                    }
                }
            }
        }
        if (arg0 != -16777216) {
            method1867(2, 71, false, 50, 23, (byte) -7);
        }
        field4007++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIZIIB)V", line = 257)
    public static final void method1867(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field4003++;
        if (class385.field5285 == null) {
            class374.field5152.method742(11, arg4, arg1, arg0, -16777216, arg3);
        } else if (class262.field3781.field4537 >= 0 && (class36.field388 * 128) > class262.field3781.field4537 && class262.field3781.field4530 >= 0 && (class68.field998 * 128) > class262.field3781.field4530) {
            class392.field5407++;
            if (class262.field3781 != null && (class262.field3781.field4537 - (class262.field3781.method245(4452) - 1) * 64 >> 7) == class437.field6218 && (class262.field3781.field4530 - ((class262.field3781.method245(4452) - 1) * 64) >> 7) == class89.field1266) {
                class89.field1266 = -1;
                class437.field6218 = -1;
                class15.method93(-60);
            }
            class422.method2516(0);
            if (!arg2) {
                class75.method664((byte) 127);
            }
            class190.method1338((byte) -101);
            class380.method2319(arg4, -2, arg1, arg3, arg0, true);
            int var6 = class262.field3776;
            int var7 = class26.field279;
            int var8 = class295.field4160;
            int var9 = class12.field79;
            if (class390.field5393 == 1) {
                int var10 = (int) class421.field5826;
                if (var10 < class334.field4649 >> 8) {
                    var10 = class334.field4649 >> 8;
                }
                if (class394.field5441[4] && class138.field1915[4] + 128 > var10) {
                    var10 = class138.field1915[4] + 128;
                }
                int var11 = (int) class91.field1281 + class270.field3935 & 0x3FFF;
                class329.method2059((var10 >> 3) * 3 + 600, class108.field1520, var10, var11, 255, class407.method2440(class262.field3781.field4537, -16490, class262.field3781.field4530, class387.field5306) - 50, var6, field4006);
            } else if (class390.field5393 == 4) {
                int var12 = (int) class421.field5826;
                if (class334.field4649 >> 8 > var12) {
                    var12 = class334.field4649 >> 8;
                }
                if (class394.field5441[4] && (class138.field1915[4] + 128) > var12) {
                    var12 = class138.field1915[4] + 128;
                }
                int var13 = (int) class91.field1281 & 0x3FFF;
                class329.method2059((var12 >> 3) * 3 + 600, class108.field1520, var12, var13, 255, class407.method2440(class318.field4496, -16490, class285.field4075, class387.field5306) - 50, var6, field4006);
            } else if (class390.field5393 == 5) {
                class344.method2140(var6, -126);
            }
            int var14 = class135.field1884;
            int var15 = class303.field4302;
            int var16 = class184.field2784;
            int var17 = class366.field5028;
            int var18 = class103.field1455;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class394.field5441[var19]) {
                    int var22 = (int) ((double) (-class434.field6140[var19]) + Math.random() * (double) (class434.field6140[var19] * 2 + 1) + Math.sin((double) class196.field2913[var19] / 100.0D * (double) class406.field5543[var19]) * (double) class138.field1915[var19]);
                    if (var19 == 4) {
                        class366.field5028 += var22;
                        if (class366.field5028 < 1024) {
                            class366.field5028 = 1024;
                        } else if (class366.field5028 > 3072) {
                            class366.field5028 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class135.field1884 += var22;
                    }
                    if (var19 == 1) {
                        class303.field4302 += var22;
                    }
                    if (var19 == 3) {
                        class103.field1455 = class103.field1455 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class184.field2784 += var22;
                    }
                }
            }
            if (class135.field1884 < 0) {
                class135.field1884 = 0;
            }
            if (class135.field1884 > (class310.field4401 << 7) - 1) {
                class135.field1884 = (class310.field4401 << 7) - 1;
            }
            if (class184.field2784 < 0) {
                class184.field2784 = 0;
            }
            if (arg5 < 14) {
                field4012 = 9;
            }
            if ((class97.field1374 << 7) - 1 < class184.field2784) {
                class184.field2784 = (class97.field1374 << 7) - 1;
            }
            class219.method1514(-7186);
            class436.method2668(-31638);
            class374.field5152.method453(var9, var7, var8 + var9, var6 + var7);
            class374.field5152.method417();
            int var20 = class227.field3266;
            if (class323.field4519 == null) {
                class374.field5152.method373(var20);
            } else {
                class323.field4519.method2685(class366.field5028, class374.field5152, var6, var20, var7, class96.field1355 << 3, 0, class103.field1455, var9, var8);
            }
            class208.method1423((byte) -85);
            class119.field1654.method111(class135.field1884, class303.field4302, class184.field2784, -class366.field5028 & 0x3FFF, -class103.field1455 & 0x3FFF, -class158.field2258 & 0x3FFF);
            class374.field5152.method454(class119.field1654);
            class374.field5152.method448(var8 / 2 + var9, var7 - -(var6 / 2), class340.field4705 << 1, class340.field4705 << 1);
            class249.method1707(class340.field4705 << 1, var8 / 2 + var9, 0, var6 / 2 + var7, class340.field4705 << 1);
            class316.method2007(class303.field4302, class135.field1884, -class103.field1455 & 0x3FFF, class184.field2784, -class366.field5028 & 0x3FFF, -class158.field2258 & 0x3FFF, 0);
            byte var21 = class164.method1210(false) == 2 ? (byte) class392.field5407 : 1;
            class52.method493(class374.field5152, class364.field5010, class285.field4081, class119.field1654, class135.field1884, class303.field4302, class184.field2784, class486.field6878, class114.field1601, class363.field4999, class176.field2670, class239.field3504, class173.field2641, class262.field3781.field4531 + 1, var21, class262.field3781.field4537 >> 7, class262.field3781.field4530 >> 7, !class199.field2951);
            class208.method1423((byte) -76);
            if (class347.field4787 == 30) {
                class39.method244(var6, var9, var7, -101, var8, 256, 256);
                class386.method2349(var8, (byte) -128, var7, 256, var9, 256, var6);
                class380.method2317(true, var8, var7, var9, 256, var6, 256);
                class94.method786(var8, var7, 33, var6, var9);
            }
            class62.method566();
            class184.field2784 = var16;
            class303.field4302 = var15;
            class103.field1455 = var18;
            class135.field1884 = var14;
            class366.field5028 = var17;
            if (class261.field3754 && class380.field5220.method2469(-90) == 0) {
                class261.field3754 = false;
            }
            if (class261.field3754) {
                class374.field5152.method742(11, var7, var6, var8, -16777216, var9);
                class315.method2004((byte) 100, class189.field2830, false, class225.field3247.method1078(class66.field967, 100));
            }
        } else {
            class374.field5152.method742(11, arg4, arg1, arg0, -16777216, arg3);
        }
    }
}
