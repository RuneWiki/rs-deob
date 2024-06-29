import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class54 extends class237 {

    @OriginalMember(owner = "client!d", name = "p", descriptor = "[I")
    public int[] field689 = new int[] { -1 };

    @OriginalMember(owner = "client!d", name = "u", descriptor = "[I")
    public int[] field694 = new int[1];

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Z")
    public static boolean field687 = false;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Ljava/lang/String;")
    public static String field688 = "flash2:";

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Ljava/lang/String;")
    public static String field691 = "yellow:";

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Z")
    public static boolean field692 = false;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
    public static void method305(byte arg0) {
        field688 = null;
        field691 = null;
        if (arg0 != 66) {
            field688 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
    public static final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class106.field1421 = 0;
        field690++;
        for (int var7 = -1; var7 < class77.field970 + class134.field2122; var7++) {
            class230 var23;
            if (var7 == -1) {
                var23 = class286.field4571;
            } else if (class77.field970 > var7) {
                var23 = class89.field1113[class27.field385[var7]];
            } else {
                var23 = class265.field4273[class11.field121[var7 - class77.field970]];
            }
            if (var23 != null && var23.method1400(124)) {
                if (var23 instanceof class200) {
                    class188 var24 = ((class200) var23).field3166;
                    if (var24.field3004 != null) {
                        var24 = var24.method1314(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class77.field970 <= var7) {
                    class188 var30 = ((class200) var23).field3166;
                    if (var30.field3004 != null) {
                        var30 = var30.method1314(-1);
                    }
                    if (var30.field3049 >= 0 && var30.field3049 < class245.field4026.length) {
                        int var31;
                        if (var30.field3007 == -1) {
                            var31 = var23.method1637(false) + 15;
                        } else {
                            var31 = var30.field3007 + 15;
                        }
                        class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var31, arg0 >> 1, arg4);
                        if (class134.field2128 > -1) {
                            class245.field4026[var30.field3049].method315(arg2 + class134.field2128 - 12, arg1 + -30 + class165.field2633);
                        }
                    }
                    class262[] var32 = class134.field2111;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class262 var48 = var32[var33];
                        if (var48 != null && var48.field4243 == 1 && class11.field121[var7 - class77.field970] == var48.field4237 && class73.field924 % 20 < 10) {
                            int var49;
                            if (var30.field3007 == -1) {
                                var49 = var23.method1637(false) + 15;
                            } else {
                                var49 = var30.field3007 + 15;
                            }
                            class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var49, arg0 >> 1, arg4);
                            if (class134.field2128 > -1) {
                                class126.field2026[var48.field4247].method315(arg2 + class134.field2128 - 12, class165.field2633 + arg1 + -28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class259 var26 = (class259) var23;
                    if (var26.field4196 != -1 || var26.field4213 != -1) {
                        class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var23.method1637(false) + 15, arg0 >> 1, arg4);
                        if (class134.field2128 > -1) {
                            if (var26.field4196 != -1) {
                                class213.field3422[var26.field4196].method315(class134.field2128 + arg2 - 12, class165.field2633 + arg1 - var25);
                                var25 += 25;
                            }
                            if (var26.field4213 != -1) {
                                class245.field4026[var26.field4213].method315(class134.field2128 + arg2 - 12, class165.field2633 + arg1 + -var25);
                                var25 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class262[] var27 = class134.field2111;
                        for (int var28 = 0; var28 < var27.length; var28++) {
                            class262 var29 = var27[var28];
                            if (var29 != null && var29.field4243 == 10 && class27.field385[var7] == var29.field4237) {
                                class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var23.method1637(false) + 15, arg0 >> 1, arg4);
                                if (class134.field2128 > -1) {
                                    class126.field2026[var29.field4247].method315(arg2 + class134.field2128 - 12, -var25 + arg1 - -class165.field2633);
                                }
                            }
                        }
                    }
                }
                if (var23.field3822 != null && (var7 >= class77.field970 || class156.field2508 == 0 || class156.field2508 == 3 || class156.field2508 == 1 && class73.method412(0, ((class259) var23).field4208))) {
                    class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var23.method1637(false), arg0 >> 1, arg4);
                    if (class134.field2128 > -1 && class61.field781 > class106.field1421) {
                        class61.field810[class106.field1421] = class280.field4439.method692(var23.field3822) / 2;
                        class61.field806[class106.field1421] = class280.field4439.field1535;
                        class61.field786[class106.field1421] = class134.field2128;
                        class61.field811[class106.field1421] = class165.field2633;
                        class61.field780[class106.field1421] = var23.field3837;
                        class61.field783[class106.field1421] = var23.field3798;
                        class61.field794[class106.field1421] = var23.field3773;
                        class61.field795[class106.field1421] = var23.field3822;
                        class106.field1421++;
                    }
                }
                if (var23.field3807 > class73.field924) {
                    class56 var34 = class159.field2541[1];
                    class56 var35 = class159.field2541[0];
                    int var36;
                    if ((var23 instanceof class200)) {
                        class200 var37 = (class200) var23;
                        class56[] var38 = (class56[]) class104.field1401.method1693((long) var37.field3166.field3042, 82);
                        if (var38 == null) {
                            var38 = class42.method232((byte) -97, var37.field3166.field3042, class147.field2302, 0);
                            if (var38 != null) {
                                class104.field1401.method1694(true, (long) var37.field3166.field3042, var38);
                            }
                        }
                        class188 var39 = var37.field3166;
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[0];
                            var34 = var38[1];
                        }
                        if (var39.field3007 == -1) {
                            var36 = var23.method1637(false);
                        } else {
                            var36 = var39.field3007;
                        }
                    } else {
                        var36 = var23.method1637(false);
                    }
                    class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var35.field719 + var36 + 10, arg0 >> 1, arg4);
                    if (class134.field2128 > -1) {
                        int var40 = class134.field2128 + arg2 - (var35.field720 >> 1);
                        int var41 = arg1 + class165.field2633 - 3;
                        var35.method315(var40, var41);
                        int var42 = var23.field3741 * var35.field720 / 255;
                        int var43 = var35.field719;
                        class217.method1525(var40, var41, var40 + var42, var41 + var43);
                        var34.method315(var40, var41);
                        class217.method1520(arg2, arg1, arg2 + arg3, arg0 + arg1);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field3752[var44] > class73.field924) {
                        int var47;
                        if (var23 instanceof class200) {
                            class200 var45 = (class200) var23;
                            class188 var46 = var45.field3166;
                            if (var46.field3007 == -1) {
                                var47 = var23.method1637(false) / 2;
                            } else {
                                var47 = var46.field3007 / 2;
                            }
                        } else {
                            var47 = var23.method1637(false) / 2;
                        }
                        class183.method1273(arg3 >> 1, var23, arg6, (byte) 123, var47, arg0 >> 1, arg4);
                        if (class134.field2128 > -1) {
                            if (var44 == 1) {
                                class165.field2633 -= 20;
                            }
                            if (var44 == 2) {
                                class134.field2128 -= 15;
                                class165.field2633 -= 10;
                            }
                            if (var44 == 3) {
                                class134.field2128 += 15;
                                class165.field2633 -= 10;
                            }
                            class129.field2066[var23.field3809[var44]].method315(arg2 + class134.field2128 - 12, arg1 - 12 + class165.field2633);
                            class5.field84.method685(Integer.toString(var23.field3795[var44]), class134.field2128 + arg2 - 1, arg1 - -class165.field2633 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class106.field1421; var8++) {
            int var9 = class61.field786[var8];
            int var10 = class61.field811[var8];
            int var11 = class61.field810[var8];
            int var12 = class61.field806[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var10 + 2) > (class61.field811[var22] - class61.field806[var22]) && class61.field811[var22] + 2 > -var12 + var10 && (var9 - var11) < (class61.field810[var22] + class61.field786[var22]) && (var9 + var11) > (class61.field786[var22] - class61.field810[var22]) && (class61.field811[var22] - class61.field806[var22]) < var10) {
                        var10 = class61.field811[var22] - class61.field806[var22];
                        var13 = true;
                    }
                }
            }
            class134.field2128 = class61.field786[var8];
            class165.field2633 = class61.field811[var8] = var10;
            String var14 = class61.field795[var8];
            if (class159.field2536 == 0) {
                int var15 = 16776960;
                if (class61.field780[var8] < 6) {
                    var15 = class275.field4395[class61.field780[var8]];
                }
                if (class61.field780[var8] == 6) {
                    var15 = (class130.field2085 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class61.field780[var8] == 7) {
                    var15 = class130.field2085 % 20 >= 10 ? 65535 : 255;
                }
                if (class61.field780[var8] == 8) {
                    var15 = (class130.field2085 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class61.field780[var8] == 9) {
                    int var16 = 150 - class61.field794[var8];
                    if (var16 < 50) {
                        var15 = (var16 * 1280) + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 + 16384000 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = 65280 - (500 - (var16 * 5));
                    }
                }
                if (class61.field780[var8] == 10) {
                    int var17 = 150 - class61.field794[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - ((var17 - 50) * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 500 - (var17 * 5) - 32767745;
                    }
                }
                if (class61.field780[var8] == 11) {
                    int var18 = 150 - class61.field794[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = (var18 - 50) * 327685 + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class61.field783[var8] == 0) {
                    class280.field4439.method685(var14, class134.field2128 + arg2, arg1 - -class165.field2633, var15, 0);
                }
                if (class61.field783[var8] == 1) {
                    class280.field4439.method678(var14, class134.field2128 + arg2, arg1 - -class165.field2633, var15, 0, class130.field2085);
                }
                if (class61.field783[var8] == 2) {
                    class280.field4439.method696(var14, class134.field2128 + arg2, arg1 - -class165.field2633, var15, 0, class130.field2085);
                }
                if (class61.field783[var8] == 3) {
                    class280.field4439.method676(var14, class134.field2128 + arg2, class165.field2633 + arg1, var15, 0, class130.field2085, 150 - class61.field794[var8]);
                }
                if (class61.field783[var8] == 4) {
                    int var19 = (150 - class61.field794[var8]) * (class280.field4439.method692(var14) + 100) / 150;
                    class217.method1525(class134.field2128 + arg2 - 50, arg1, class134.field2128 + arg2 + 50, arg0 + arg1);
                    class280.field4439.method687(var14, class134.field2128 + arg2 + 50 - var19, class165.field2633 + arg1, var15, 0);
                    class217.method1520(arg2, arg1, arg2 + arg3, arg0 + arg1);
                }
                if (class61.field783[var8] == 5) {
                    int var20 = 150 - class61.field794[var8];
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class217.method1525(arg2, class165.field2633 + arg1 - class280.field4439.field1535 - 1, arg2 + arg3, arg1 + class165.field2633 + 5);
                    class280.field4439.method685(var14, class134.field2128 + arg2, class165.field2633 + arg1 + var21, var15, 0);
                    class217.method1520(arg2, arg1, arg2 + arg3, arg0 + arg1);
                }
            } else {
                class280.field4439.method685(var14, arg2 + class134.field2128, class165.field2633 + arg1, 16776960, 0);
            }
        }
        if (arg5 >= -46) {
            field688 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Lma;")
    public static final class5 method307(int arg0, int arg1) {
        if (arg1 != 4728) {
            field687 = false;
        }
        class5 var2 = (class5) class3.field29.method1693((long) arg0, arg1 - 4611);
        field693++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class278.field4425.method928(1, (byte) 111, arg0);
        class5 var4 = new class5();
        if (var3 != null) {
            var4.method29(arg0, (byte) -114, new class96(var3));
        }
        class3.field29.method1694(true, (long) arg0, var4);
        return var4;
    }
}
