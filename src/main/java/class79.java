import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class79 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[Lnl;")
    public static class216[] field989 = new class216[0];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)Luk;")
    public static final class98 method440(int arg0, byte arg1) {
        field986++;
        class98 var2 = (class98) class57.field730.method1693((long) arg0, 111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class121.field1728.method928(class183.method1269(arg0, (byte) 107), (byte) 125, class294.method1974(arg0, (byte) -23));
        class98 var4 = new class98();
        var4.field1310 = arg0;
        if (var3 != null) {
            var4.method603(new class96(var3), -1);
        }
        if (arg1 == 14) {
            class57.field730.method1694(true, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method441(byte arg0) {
        field989 = null;
        if (arg0 != 112) {
            method445(70, -28, -51, -91, -123, 0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lpf;IIIIIIZ)V")
    public static final void method442(class229 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3719.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field3719[var9] - class230.field3789;
            int var23 = arg0.field3733[var9] - class57.field735;
            int var24 = arg0.field3732[var9] - class236.field3909;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3734 != null) {
                class229.field3735[var9] = var25;
                class229.field3720[var9] = var28;
                class229.field3727[var9] = var29;
            }
            class229.field3730[var9] = (var25 << 9) / var29 + class174.field2763;
            class229.field3717[var9] = (var28 << 9) / var29 + class174.field2766;
        }
        class174.field2755 = 0;
        int var10 = arg0.field3721.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field3721[var11];
            int var13 = arg0.field3731[var11];
            int var14 = arg0.field3715[var11];
            int var15 = class229.field3730[var12];
            int var16 = class229.field3730[var13];
            int var17 = class229.field3730[var14];
            int var18 = class229.field3717[var12];
            int var19 = class229.field3717[var13];
            int var20 = class229.field3717[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class101.field1367 && class198.method1384(class71.field903 + class174.field2763, class174.field2766 + class155.field2428, var18, var19, var20, var15, var16, var17)) {
                    class155.field2458 = arg5;
                    class115.field1640 = arg6;
                }
                if (!arg7) {
                    class174.field2762 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class174.field2750 || var16 > class174.field2750 || var17 > class174.field2750) {
                        class174.field2762 = true;
                    }
                    if (arg0.field3734 == null || arg0.field3734[var11] == -1) {
                        if (arg0.field3729[var11] != 12345678) {
                            class174.method1201(var18, var19, var20, var15, var16, var17, arg0.field3729[var11], arg0.field3728[var11], arg0.field3716[var11]);
                        }
                    } else if (!class196.field3131) {
                        int var21 = class174.field2756.method779(-7078, arg0.field3734[var11]);
                        class174.method1201(var18, var19, var20, var15, var16, var17, class239.method1683(var21, arg0.field3729[var11]), class239.method1683(var21, arg0.field3728[var11]), class239.method1683(var21, arg0.field3716[var11]));
                    } else if (arg0.field3726) {
                        class174.method1206(var18, var19, var20, var15, var16, var17, arg0.field3729[var11], arg0.field3728[var11], arg0.field3716[var11], class229.field3735[0], class229.field3735[1], class229.field3735[3], class229.field3720[0], class229.field3720[1], class229.field3720[3], class229.field3727[0], class229.field3727[1], class229.field3727[3], arg0.field3734[var11]);
                    } else {
                        class174.method1206(var18, var19, var20, var15, var16, var17, arg0.field3729[var11], arg0.field3728[var11], arg0.field3716[var11], class229.field3735[var12], class229.field3735[var13], class229.field3735[var14], class229.field3720[var12], class229.field3720[var13], class229.field3720[var14], class229.field3727[var12], class229.field3727[var13], class229.field3727[var14], arg0.field3734[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method443(int arg0) {
        for (int var1 = arg0; var1 < class134.field2122; var1++) {
            int var2 = class11.field121[var1];
            class200 var3 = class265.field4273[var2];
            if (var3 != null) {
                class127.method859(-119, var3.field3166.field3034, var3);
            }
        }
        field990++;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lwb;BI)I")
    public static final int method444(class123 arg0, byte arg1, int arg2) {
        field985++;
        if (arg0.field1858 == null || arg2 >= arg0.field1858.length) {
            return -2;
        }
        try {
            if (arg1 != -4) {
                field989 = null;
            }
            int[] var3 = arg0.field1858[arg2];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var8 = class187.field2984[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class102.field1382[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class208.field3327[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class123 var12 = class61.method358(var11, -118);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class256.method1753(arg1 + 2, var13).field1476 || class181.field2890)) {
                        for (int var14 = 0; var14 < var12.field1757.length; var14++) {
                            if (var13 + 1 == var12.field1757[var14]) {
                                var8 += var12.field1905[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class135.field2141[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class297.field4694[class102.field1382[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class135.field2141[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 8) {
                    var8 = class286.field4571.field4200;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class22.field288[var15]) {
                            var8 += class102.field1382[var15];
                        }
                    }
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class123 var18 = class61.method358(var17, -122);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class256.method1753(-2, var19).field1476 || class181.field2890)) {
                        for (int var20 = 0; var20 < var18.field1757.length; var20++) {
                            if (var19 + 1 == var18.field1757[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class124.field1930;
                }
                if (var7 == 12) {
                    var8 = class106.field1422;
                }
                if (var7 == 13) {
                    int var21 = class135.field2141[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class153.method1044(-63, var23);
                }
                if (var7 == 18) {
                    var8 = (class286.field4571.field3818 >> 7) + class167.field2683;
                }
                if (var7 == 19) {
                    var8 = (class286.field4571.field3820 >> 7) + class181.field2883;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIII)V")
    public static final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 16) {
            method445(-80, 109, 93, 99, 89, -92);
        }
        field988++;
        if (arg0 == arg1) {
            class280.method1866(-18693, arg4, arg1, arg2, arg3);
        } else if (class116.field1653 <= (arg2 - arg1) && (arg2 + arg1) <= class114.field1634 && class117.field1656 <= (arg3 - arg0) && arg3 + arg0 <= class132.field2105) {
            class124.method813(arg0, arg3, arg4, arg5 - 16, arg2, arg1);
        } else {
            class215.method1507(arg2, arg4, arg1, arg0, (byte) 109, arg3);
        }
    }
}
