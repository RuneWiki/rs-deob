import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "[B")
    public static byte[] field1164 = new byte[32896];

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lvh;")
    public static class240 field1165;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "[[Lbs;")
    public static class483[][] field1168;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method592(int arg0) {
        field1165 = null;
        field1164 = null;
        field1168 = null;
        if (arg0 != -1) {
            method593(-28, -36, -125);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public static final void method593(int arg0, int arg1, int arg2) {
        field1166++;
        class163 var3 = class271.method1546(arg1, arg0, true);
        var3.method1017(0);
        var3.field2328 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLir;)V")
    public static final void method594(boolean arg0, class22 arg1) {
        field1170++;
        arg1.field316 = false;
        if (arg1.field328 != -1) {
            class467 var2 = class275.field3740.method1484(0, arg1.field328);
            if (var2 == null || var2.field6806 == null) {
                arg1.field317 = false;
                arg1.field328 = -1;
            } else {
                label402: {
                    arg1.field270++;
                    if (arg1.field280 < var2.field6806.length && arg1.field270 > var2.field6829[arg1.field280]) {
                        arg1.field326++;
                        arg1.field270 = 1;
                        arg1.field280++;
                        class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var2, arg1.field280, -81, arg1.field464);
                    }
                    if (arg1.field280 >= var2.field6806.length) {
                        arg1.field270 = 0;
                        arg1.field280 = 0;
                        if (arg1.field317) {
                            arg1.field328 = arg1.method165((byte) -76).method150(119);
                            if (arg1.field328 == -1) {
                                arg1.field317 = false;
                                break label402;
                            }
                            var2 = class275.field3740.method1484(0, arg1.field328);
                        }
                        class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var2, arg1.field280, -65, arg1.field464);
                    }
                    arg1.field326 = arg1.field280 + 1;
                    if (var2.field6806.length <= arg1.field326) {
                        arg1.field326 = 0;
                    }
                }
            }
        }
        if (arg1.field324 != -1 && class393.field5484 >= arg1.field340) {
            class119 var3 = class492.field7279.method2231(arg1.field324, 64);
            int var4 = var3.field1616;
            if (var4 == -1) {
                arg1.field324 = -1;
            } else {
                label404: {
                    class467 var5 = class275.field3740.method1484(0, var4);
                    if (var3.field1603) {
                        if (var5.field6824 == 3) {
                            if (arg1.field363 > 0 && class393.field5484 >= arg1.field287 && class393.field5484 > arg1.field304) {
                                arg1.field324 = -1;
                                break label404;
                            }
                        } else if (var5.field6824 == 1 && arg1.field363 > 0 && arg1.field287 <= class393.field5484 && arg1.field304 < class393.field5484) {
                            arg1.field340 = class393.field5484 + 1;
                            break label404;
                        }
                    }
                    if (var5 == null || var5.field6806 == null) {
                        arg1.field324 = -1;
                    } else {
                        if (arg1.field308 < 0) {
                            arg1.field308 = 0;
                            class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var5, 0, 117, arg1.field464);
                        }
                        arg1.field274++;
                        if (arg1.field308 < var5.field6806.length && arg1.field274 > var5.field6829[arg1.field308]) {
                            arg1.field274 = 1;
                            arg1.field308++;
                            class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var5, arg1.field308, -27, arg1.field464);
                        }
                        if (var5.field6806.length <= arg1.field308) {
                            if (var3.field1603) {
                                arg1.field286++;
                                arg1.field308 -= var5.field6821;
                                if (var5.field6827 <= arg1.field286) {
                                    arg1.field324 = -1;
                                } else if (arg1.field308 >= 0 && var5.field6806.length > arg1.field308) {
                                    class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var5, arg1.field308, 124, arg1.field464);
                                } else {
                                    arg1.field324 = -1;
                                }
                            } else {
                                arg1.field324 = -1;
                            }
                        }
                        arg1.field336 = arg1.field308 + 1;
                        if (var5.field6806.length <= arg1.field336) {
                            if (var3.field1603) {
                                arg1.field336 -= var5.field6821;
                                if ((arg1.field286 + 1) >= var5.field6827) {
                                    arg1.field336 = -1;
                                } else if (arg1.field336 < 0 || var5.field6806.length <= arg1.field336) {
                                    arg1.field336 = -1;
                                }
                            } else {
                                arg1.field336 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field303 != -1 && arg1.field283 <= class393.field5484) {
            class119 var6 = class492.field7279.method2231(arg1.field303, 64);
            int var7 = var6.field1616;
            if (var7 == -1) {
                arg1.field303 = -1;
            } else {
                label407: {
                    class467 var8 = class275.field3740.method1484(0, var7);
                    if (var6.field1603) {
                        if (var8.field6824 == 3) {
                            if (arg1.field363 > 0 && arg1.field287 <= class393.field5484 && arg1.field304 < class393.field5484) {
                                arg1.field303 = -1;
                                break label407;
                            }
                        } else if (var8.field6824 == 1 && arg1.field363 > 0 && arg1.field287 <= class393.field5484 && arg1.field304 < class393.field5484) {
                            arg1.field283 = class393.field5484 + 1;
                            break label407;
                        }
                    }
                    if (var8 == null || var8.field6806 == null) {
                        arg1.field303 = -1;
                    } else {
                        if (arg1.field300 < 0) {
                            arg1.field300 = 0;
                            class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var8, 0, 124, arg1.field464);
                        }
                        arg1.field277++;
                        if (arg1.field300 < var8.field6806.length && var8.field6829[arg1.field300] < arg1.field277) {
                            arg1.field277 = 1;
                            arg1.field300++;
                            class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var8, arg1.field300, -111, arg1.field464);
                        }
                        if (var8.field6806.length <= arg1.field300) {
                            if (var6.field1603) {
                                arg1.field300 -= var8.field6821;
                                arg1.field332++;
                                if (arg1.field332 >= var8.field6827) {
                                    arg1.field303 = -1;
                                } else if (arg1.field300 >= 0 && arg1.field300 < var8.field6806.length) {
                                    class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var8, arg1.field300, 14, arg1.field464);
                                } else {
                                    arg1.field303 = -1;
                                }
                            } else {
                                arg1.field303 = -1;
                            }
                        }
                        arg1.field310 = arg1.field300 + 1;
                        if (arg1.field310 >= var8.field6806.length) {
                            if (var6.field1603) {
                                arg1.field310 -= var8.field6821;
                                if (var8.field6827 <= arg1.field332 + 1) {
                                    arg1.field310 = -1;
                                } else if (arg1.field310 < 0 || var8.field6806.length <= arg1.field310) {
                                    arg1.field310 = -1;
                                }
                            } else {
                                arg1.field310 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field271 != -1 && arg1.field325 <= 1) {
            class467 var9 = class275.field3740.method1484(0, arg1.field271);
            if (var9.field6824 == 3) {
                if (arg1.field363 > 0 && arg1.field287 <= class393.field5484 && arg1.field304 < class393.field5484) {
                    arg1.field271 = -1;
                }
            } else if (var9.field6824 == 1 && arg1.field363 > 0 && class393.field5484 >= arg1.field287 && arg1.field304 < class393.field5484) {
                arg1.field325 = 2;
            }
        }
        if (!arg0) {
            method595(-26L, null, -71, false, -96, -82, false, null, 106, false, 50);
        }
        if (arg1.field271 != -1 && arg1.field325 == 0) {
            class467 var10 = class275.field3740.method1484(0, arg1.field271);
            if (var10 == null || var10.field6806 == null) {
                arg1.field271 = -1;
            } else {
                arg1.field335++;
                if (arg1.field273 < var10.field6806.length && arg1.field335 > var10.field6829[arg1.field273]) {
                    arg1.field273++;
                    arg1.field335 = 1;
                    class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var10, arg1.field273, 120, arg1.field464);
                }
                if (var10.field6806.length <= arg1.field273) {
                    arg1.field345++;
                    arg1.field273 -= var10.field6821;
                    if (var10.field6827 <= arg1.field345) {
                        arg1.field271 = -1;
                    } else if (arg1.field273 >= 0 && var10.field6806.length > arg1.field273) {
                        class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var10, arg1.field273, 14, arg1.field464);
                    } else {
                        arg1.field271 = -1;
                    }
                }
                arg1.field342 = arg1.field273 + 1;
                if (arg1.field342 >= var10.field6806.length) {
                    arg1.field342 -= var10.field6821;
                    if ((arg1.field345 + 1) >= var10.field6827) {
                        arg1.field342 = -1;
                    } else if (arg1.field342 < 0 || var10.field6806.length <= arg1.field342) {
                        arg1.field342 = -1;
                    }
                }
                arg1.field316 = var10.field6814;
            }
        }
        if (arg1.field325 > 0) {
            arg1.field325--;
        }
        for (int var11 = 0; var11 < arg1.field330.length; var11++) {
            class13 var12 = arg1.field330[var11];
            if (var12 != null) {
                if (var12.field150 > 0) {
                    var12.field150--;
                } else {
                    class467 var13 = class275.field3740.method1484(0, var12.field149);
                    if (var13 == null || var13.field6806 == null) {
                        arg1.field330[var11] = null;
                    } else {
                        var12.field160++;
                        if (var13.field6806.length > var12.field155 && var12.field160 > var13.field6829[var12.field155]) {
                            var12.field160 = 1;
                            var12.field155++;
                            class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var13, var12.field155, 24, arg1.field464);
                        }
                        if (var13.field6806.length <= var12.field155) {
                            var12.field156++;
                            var12.field155 -= var13.field6821;
                            if (var13.field6827 <= var12.field156) {
                                arg1.field330[var11] = null;
                            } else if (var12.field155 >= 0 && var12.field155 < var13.field6806.length) {
                                class284.method1624(arg1.field461, class75.field1089 == arg1, arg1.field466, var13, var12.field155, 126, arg1.field464);
                            } else {
                                arg1.field330[var11] = null;
                            }
                        }
                        var12.field157 = var12.field155 + 1;
                        if (var13.field6806.length <= var12.field157) {
                            var12.field157 -= var13.field6821;
                            if (var13.field6827 <= (var12.field156 + 1)) {
                                var12.field157 = -1;
                            } else if (var12.field157 < 0 || var12.field157 >= var13.field6806.length) {
                                var12.field157 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JLjava/lang/String;IZIIZLjava/lang/String;IZI)V")
    public static final void method595(long arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, String arg7, int arg8, boolean arg9, int arg10) {
        field1167++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class365 var14 = new class365(128);
        var14.method2084(10, false);
        var14.method2070(81954016, (arg9 ? 4 : 0) | (arg6 ? 2 : 0) | (arg3 ? 1 : 0));
        var14.method2076(arg0, (byte) -112);
        var14.method2074(false, var12[0]);
        var14.method2073(-127, arg1);
        var14.method2074(false, var12[1]);
        var14.method2070(81954016, class246.field3426);
        var14.method2084(arg4, false);
        var14.method2084(arg8, false);
        var14.method2074(false, var12[2]);
        var14.method2070(81954016, arg2);
        var14.method2070(81954016, arg10);
        var14.method2074(false, var12[3]);
        var14.method2110(false, class433.field6307, class54.field748);
        class365 var15 = new class365(350);
        var15.method2073(42, arg7);
        int var16 = 8 - (class121.method780(arg7, (byte) 23) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2084((int) (Math.random() * 255.0D), false);
        }
        var15.method2112(true, var12);
        class244.field3395.field5069 = 0;
        if (arg5 <= 36) {
            method592(-114);
        }
        class244.field3395.method2084(class255.field3546.field3043, false);
        class244.field3395.method2070(81954016, var14.field5069 + var15.field5069 + 2);
        class244.field3395.method2070(81954016, 586);
        class244.field3395.method2079(var14.field5069, var14.field5073, 88, 0);
        class244.field3395.method2079(var15.field5069, var15.field5073, 72, 0);
        class310.field4243 = 1;
        class270.field3692 = 0;
        client.field2804 = 0;
        class376.field5289 = -3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1164[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field1169 = -1;
    }
}
