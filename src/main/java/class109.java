import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class109 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljf;")
    private static class229 field1926 = class212.method1457((byte) 69, "Loading fonts )2 ");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Ljf;")
    public static class229 field1924 = field1926;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Loj;")
    public static class327 field1930 = new class327(0, 0);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Lek;")
    public static class185 field1928;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Lkc;)V", line = 26)
    public static final void method773(int arg0, class37[] arg1) {
        class3.field20[arg0] = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 37)
    public static final void method774(int arg0) {
        if (class146.field2531 == 2) {
            if (class48.field875 == class217.field3732 && class25.field461 == class235.field4070) {
                class146.field2531 = 0;
                if (class144.field2507 && class84.field1613[81] && class124.field2176 > 2) {
                    class325.method2188(true, class124.field2176 - 2);
                } else {
                    class325.method2188(true, class124.field2176 - 1);
                }
            }
        } else if (class48.field875 == class222.field3791 && class60.field1033 == class25.field461) {
            class146.field2531 = 0;
            if (class144.field2507 && class84.field1613[81] && class124.field2176 > 2) {
                class325.method2188(true, class124.field2176 - 2);
            } else {
                class325.method2188(true, class124.field2176 - 1);
            }
        } else {
            class217.field3732 = class222.field3791;
            class235.field4070 = class60.field1033;
            class146.field2531 = 2;
        }
        if (arg0 == 8608) {
            field1925++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBILnf;)V", line = 94)
    public static final void method775(int arg0, int arg1, byte arg2, int arg3, class67 arg4) {
        class18.method179((byte) 101);
        field1929++;
        if (class108.field1900) {
            class163.method1095(arg1, arg0, arg4.field1258 + arg1, arg4.field1295 + arg0);
        } else {
            class114.method813(arg1, arg0, arg4.field1258 + arg1, arg0 - -arg4.field1295);
        }
        if (arg2 < 47) {
            return;
        }
        if (class171.field2974 != 2 && class171.field2974 != 5 && class123.field2173 != null) {
            int var5 = class229.field3939 + class213.field3653 & 0x7FF;
            int var6 = (class301.field5124.field1983 / 32) + 48;
            int var7 = 464 - (class301.field5124.field2028 / 32);
            if (class108.field1900) {
                ((class326) class123.field2173).method2192(arg1, arg0, arg4.field1258, arg4.field1295, var6, var7, var5, class102.field1778 + 256, (class326) arg4.method506(-27654, false));
            } else {
                ((class159) class123.field2173).method859(arg1, arg0, arg4.field1258, arg4.field1295, var6, var7, var5, class102.field1778 + 256, arg4.field1237, arg4.field1224);
            }
            if (class60.field1039 != null) {
                for (int var8 = 0; var8 < class60.field1039.field5616; var8++) {
                    if (class60.field1039.method2250(var8, false)) {
                        int var9 = (class60.field1039.field5622[var8] - class213.field3649) * 4 + 2 - (class301.field5124.field2028 / 32);
                        int var10 = (class60.field1039.field5625[var8] - class258.field4503) * 4 + 2 - class301.field5124.field1983 / 32;
                        int var11 = class227.field3896[var5];
                        int var12 = var11 * 256 / (class102.field1778 + 256);
                        int var13 = class227.field3911[var5];
                        class138 var14 = class211.field3636;
                        int var15 = var13 * 256 / (class102.field1778 + 256);
                        int var16 = var9 * var12 + var10 * var15 >> 16;
                        int var17 = var9 * var15 - (var10 * var12) >> 16;
                        if (class60.field1039.method2252(false, var8) == 1) {
                            var14 = class249.field4385;
                        }
                        if (class60.field1039.method2252(false, var8) == 2) {
                            var14 = class44.field796;
                        }
                        int var18 = var14.method942(class60.field1039.field5618[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= -arg4.field1258 && var19 <= arg4.field1258 && (-arg4.field1295) <= var17 && arg4.field1295 >= var17) {
                            int var20 = 16777215;
                            if (class60.field1039.field5621[var8] != -1) {
                                var20 = class60.field1039.field5621[var8];
                            }
                            if (class108.field1900) {
                                class163.method1099((class326) arg4.method506(-27654, false));
                            } else {
                                class114.method817(arg4.field1237, arg4.field1224);
                            }
                            var14.method943(class60.field1039.field5618[var8], arg4.field1258 / 2 + arg1 + var19, -var17 + arg0 - -(arg4.field1295 / 2), var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class108.field1900) {
                                class163.method1097();
                            } else {
                                class114.method824();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class301.field5128; var21++) {
                int var22 = class90.field1649[var21] * 4 + 2 - (class301.field5124.field2028 / 32);
                int var23 = class27.field476[var21] * 4 + 2 - (class301.field5124.field1983 / 32);
                class83 var24 = class271.method1909(126, class56.field995[var21]);
                if (var24.field1593 != null) {
                    var24 = var24.method598((byte) 93);
                    if (var24 == null || var24.field1578 == -1) {
                        continue;
                    }
                }
                class113.method800(class76.field1422[var24.field1578], -120, arg1, var23, var22, arg0, arg4);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class303 var27 = class105.field1822[class16.field254][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - class301.field5124.field1983 / 32;
                        int var29 = var26 * 4 + 2 - class301.field5124.field2028 / 32;
                        class113.method800(class323.field5450[0], -40, arg1, var28, var29, arg0, arg4);
                    }
                }
            }
            for (int var30 = 0; var30 < class126.field2238; var30++) {
                class331 var31 = class331.field5637[class283.field4858[var30]];
                if (var31 != null && var31.method302(0)) {
                    class169 var32 = var31.field5631;
                    if (var32 != null && var32.field2950 != null) {
                        var32 = var32.method1154((byte) -102);
                    }
                    if (var32 != null && var32.field2917 && var32.field2907) {
                        int var33 = var31.field2028 / 32 - (class301.field5124.field2028 / 32);
                        int var34 = var31.field1983 / 32 - class301.field5124.field1983 / 32;
                        if (var32.field2910 == -1) {
                            class113.method800(class323.field5450[1], -57, arg1, var34, var33, arg0, arg4);
                        } else {
                            class113.method800(class76.field1422[var32.field2910], 114, arg1, var34, var33, arg0, arg4);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class132.field2323; var35++) {
                class33 var36 = class192.field3334[class90.field1652[var35]];
                if (var36 != null && var36.method302(0)) {
                    int var37 = var36.field1983 / 32 - (class301.field5124.field1983 / 32);
                    int var38 = var36.field2028 / 32 - (class301.field5124.field2028 / 32);
                    boolean var39 = false;
                    long var40 = var36.field621.method1617(84);
                    for (int var42 = 0; var42 < class113.field2044; var42++) {
                        if (class31.field536[var42] == var40 && class12.field145[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class52.field923; var44++) {
                        if (class137.field2376[var44].field4265 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class301.field5124.field607 != 0 && var36.field607 != 0 && class301.field5124.field607 == var36.field607) {
                        var45 = true;
                    }
                    if (var39) {
                        class113.method800(class323.field5450[3], -53, arg1, var37, var38, arg0, arg4);
                    } else if (var43) {
                        class113.method800(class323.field5450[5], 126, arg1, var37, var38, arg0, arg4);
                    } else if (var45) {
                        class113.method800(class323.field5450[4], 121, arg1, var37, var38, arg0, arg4);
                    } else {
                        class113.method800(class323.field5450[2], -124, arg1, var37, var38, arg0, arg4);
                    }
                }
            }
            class191[] var46 = class279.field4777;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class191 var48 = var46[var47];
                if (var48 != null && var48.field3314 != 0 && class199.field3475 % 20 < 10) {
                    if (var48.field3314 == 1 && var48.field3311 >= 0 && var48.field3311 < class331.field5637.length) {
                        class331 var49 = class331.field5637[var48.field3311];
                        if (var49 != null) {
                            int var50 = var49.field2028 / 32 - (class301.field5124.field2028 / 32);
                            int var51 = var49.field1983 / 32 - (class301.field5124.field1983 / 32);
                            class275.method1932(var50, var51, -24198, arg4, arg1, arg0, var48.field3319);
                        }
                    }
                    if (var48.field3314 == 2) {
                        int var52 = (var48.field3306 - class258.field4503) * 4 + 2 - (class301.field5124.field1983 / 32);
                        int var53 = (var48.field3320 - class213.field3649) * 4 + 2 - (class301.field5124.field2028 / 32);
                        class275.method1932(var53, var52, -24198, arg4, arg1, arg0, var48.field3319);
                    }
                    if (var48.field3314 == 10 && var48.field3311 >= 0 && class192.field3334.length > var48.field3311) {
                        class33 var54 = class192.field3334[var48.field3311];
                        if (var54 != null) {
                            int var55 = var54.field1983 / 32 - (class301.field5124.field1983 / 32);
                            int var56 = var54.field2028 / 32 - (class301.field5124.field2028 / 32);
                            class275.method1932(var56, var55, -24198, arg4, arg1, arg0, var48.field3319);
                        }
                    }
                }
            }
            if (class23.field418 != 0) {
                int var57 = class73.field1395 * 4 + 2 - (class301.field5124.field2028 / 32);
                int var58 = class23.field418 * 4 + 2 - (class301.field5124.field1983 / 32);
                class113.method800(class124.field2182, 126, arg1, var58, var57, arg0, arg4);
            }
            if (class108.field1900) {
                class163.method1102(arg4.field1258 / 2 + arg1 - 1, arg4.field1295 / 2 + arg0 + -1, 3, 3, 16777215);
            } else {
                class114.method803(arg4.field1258 / 2 + arg1 - 1, arg4.field1295 / 2 + arg0 + -1, 3, 3, 16777215);
            }
        } else if (class108.field1900) {
            class35 var59 = arg4.method506(-27654, false);
            if (var59 != null) {
                var59.method314(arg1, arg0);
            }
        } else {
            class114.method811(arg1, arg0, 0, arg4.field1237, arg4.field1224);
        }
        class107.field1883[arg3] = true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLkh;)Lud;", line = 441)
    public static final class284 method776(byte arg0, class14 arg1) {
        field1931++;
        int var2 = 71 % ((arg0 - 22) / 42);
        return new class284(arg1.method113((byte) -96), arg1.method113((byte) 20), arg1.method113((byte) 69), arg1.method113((byte) 45), arg1.method113((byte) 34), arg1.method113((byte) 93), arg1.method113((byte) 48), arg1.method113((byte) -82), arg1.method114(0), arg1.method93(false));
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 451)
    public static void method777(boolean arg0) {
        field1928 = null;
        field1924 = null;
        field1926 = null;
        if (arg0) {
            method774(-20);
        }
        field1930 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILkh;)V", line = 465)
    public static final void method778(int arg0, class14 arg1) {
        field1932++;
        int var2 = class288.field4934 >> 2 << 10;
        int var3 = class189.field3302 >> 1;
        byte[][] var4 = new byte[class113.field2037][class254.field4432];
        if (arg0 != -1508223286) {
            method779((Component) null, (byte) 47);
        }
        while (arg1.field195 < arg1.field174.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method93(false) == 1) {
                var6 = arg1.method93(false);
                var7 = arg1.method93(false);
                var5 = true;
            }
            int var8 = arg1.method93(false);
            int var9 = arg1.method93(false);
            int var10 = class254.field4432 - (var9 * 64 + -class127.field2269) - 1;
            int var11 = var8 * 64 - class290.field4953;
            if (var11 >= 0 && (var10 - 63) >= 0 && (var11 + 63) < class113.field2037 && var10 < class254.field4432) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && var12 < (var6 * 8 + 8) && var7 * 8 <= var14 && (var7 * 8 + 8) > var14) {
                            var13[var10 - var14] = arg1.method98(true);
                        }
                    }
                }
            } else if (var5) {
                arg1.field195 += 64;
            } else {
                arg1.field195 += 4096;
            }
        }
        int var15 = class254.field4432;
        int var16 = class113.field2037;
        int[] var17 = new int[var15];
        int[] var18 = new int[var15];
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var16; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var16) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class173 var26 = class305.method2085(1, var25 - 1);
                        var17[var23] += var26.field3011;
                        var19[var23] += var26.field3008;
                        var18[var23] += var26.field3019;
                        var20[var23] += var26.field3020;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class173 var29 = class305.method2085(1, var28 - 1);
                        var17[var23] -= var29.field3011;
                        var19[var23] -= var29.field3008;
                        var18[var23] -= var29.field3019;
                        var20[var23] -= var29.field3020;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int var31 = 0;
                int var32 = 0;
                int[][] var33 = class185.field3228[var22 >> 6];
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    int var38 = var36 - 5;
                    if (var15 > var37) {
                        var34 += var21[var37];
                        var32 += var17[var37];
                        var35 += var18[var37];
                        var31 += var20[var37];
                        var30 += var19[var37];
                    }
                    if (var38 >= 0) {
                        var35 -= var18[var38];
                        var32 -= var17[var38];
                        var31 -= var20[var38];
                        var34 -= var21[var38];
                        var30 -= var19[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var33[var36 >> 6];
                        int var40 = var31 == 0 ? 0 : class243.method1754(false, var32 * 256 / var31, var30 / var34, var35 / var34);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var33[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 & 0x380) + ((var2 + var40 & 0xFC00) + var41);
                            var39[class305.method2086(var22, 63) + class305.method2086(var36 << 6, 4032)] = class227.field3907[class283.method1995(96, var42, class260.method1850(arg0, -1508223308))];
                        } else if (var39 != null) {
                            var39[(class305.method2086(var36, 63) << 6) + class305.method2086(63, var22)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 698)
    public static final void method779(Component arg0, byte arg1) {
        field1927++;
        arg0.removeMouseListener(class301.field5117);
        arg0.removeMouseMotionListener(class301.field5117);
        arg0.removeFocusListener(class301.field5117);
        class90.field1655 = 0;
        int var2 = 125 / ((36 - arg1) / 58);
    }
}
