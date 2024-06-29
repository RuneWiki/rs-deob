import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class321 extends class34 {

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    private int field4720;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    private int field4713;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    private int field4711;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    private int field4728;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    private int field4714;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "Lar;")
    public static class47 field4726 = new class47();

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "[I")
    public static int[] field4729 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4732 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "Lrh;")
    public static class70 field4733;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
    public static final void method2160(int arg0, byte arg1) {
        ++field4717;
        class26.field362.method1142((byte) -123, arg0);
        if (arg1 <= 68) {
            method2162((byte) 107);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIII)Lep;")
    public static final class145 method2161(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 37) {
            return null;
        } else {
            ++field4727;
            int var4 = arg3 | arg2 << 8;
            class145 var5 = (class145) class84.field1204.method2674((long) var4 << 16, arg0 ^ 22329);
            if (var5 != null) {
                return var5;
            } else {
                byte[] var6 = class21.field280.method2266((byte) 77, class21.field280.method2267((byte) 107, var4));
                if (var6 != null) {
                    if (var6.length <= 1) {
                        return null;
                    } else {
                        class145 var7 = class185.method1124(0, var6);
                        var7.field1985 = arg3;
                        class84.field1204.method2673((long) var4 << 16, var7, 11465);
                        return var7;
                    }
                } else {
                    int var8 = arg1 - -65536 << 8 | arg3;
                    class145 var9 = (class145) class84.field1204.method2674((long) var8 << 16, 22300);
                    if (var9 != null) {
                        return var9;
                    } else {
                        byte[] var10 = class21.field280.method2266((byte) 89, class21.field280.method2267((byte) -67, var8));
                        if (var10 != null) {
                            if (~var10.length >= -2) {
                                return null;
                            } else {
                                class145 var11 = class185.method1124(0, var10);
                                var11.field1985 = arg3;
                                class84.field1204.method2673((long) var8 << 16, var11, 11465);
                                return var11;
                            }
                        } else {
                            int var12 = arg3 | 16776960;
                            class145 var13 = (class145) class84.field1204.method2674((long) var12 << 16, 22300);
                            if (var13 != null) {
                                return var13;
                            } else {
                                byte[] var14 = class21.field280.method2266((byte) 115, class21.field280.method2267((byte) -110, var12));
                                if (var14 != null) {
                                    if (var14.length <= 1) {
                                        return null;
                                    } else {
                                        class145 var15 = class185.method1124(0, var14);
                                        var15.field1985 = arg3;
                                        class84.field1204.method2673((long) var12 << 16, var15, 11465);
                                        return var15;
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
    public static void method2162(byte arg0) {
        field4733 = null;
        field4732 = null;
        field4729 = null;
        field4726 = null;
        int var1 = -97 / ((arg0 - 22) / 43);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)V")
    public final void method227(int arg0, int arg1, int arg2) {
        ++field4721;
        if (arg0 < 26) {
            field4733 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4720 = arg0;
        this.field4719 = arg2;
        this.field4731 = arg6;
        this.field4713 = arg5;
        this.field4711 = arg1;
        this.field4728 = arg7;
        this.field4714 = arg4;
        this.field4716 = arg3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILlm;)V")
    public static final void method2163(int arg0, class347 arg1) {
        class253.field3498 = arg1;
        ++field4722;
        class448.field6565 = class253.field3498.method2272(64, arg0);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    public static final void method2164(int arg0) {
        class140.method900(false, 133);
        ++field4725;
        class181.field2397 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~var2 > ~class379.field5503.length; ++var2) {
            if (class117.field1641[var2] != -1 && class379.field5503[var2] == null) {
                class379.field5503[var2] = class153.field2066.method2261(0, class117.field1641[var2], 60);
                if (class379.field5503[var2] == null) {
                    var1 = false;
                    ++class181.field2397;
                }
            }
            if (~class35.field497[var2] != 0 && class146.field2006[var2] == null) {
                class146.field2006[var2] = class153.field2066.method2278(-115, 0, class73.field1051[var2], class35.field497[var2]);
                if (class146.field2006[var2] == null) {
                    var1 = false;
                    ++class181.field2397;
                }
            }
            if (~class27.field384[var2] != 0 && class12.field198[var2] == null) {
                class12.field198[var2] = class153.field2066.method2261(0, class27.field384[var2], 67);
                if (class12.field198[var2] == null) {
                    ++class181.field2397;
                    var1 = false;
                }
            }
            if (~class88.field1238[var2] != 0 && class94.field1346[var2] == null) {
                class94.field1346[var2] = class153.field2066.method2261(0, class88.field1238[var2], 74);
                if (class94.field1346[var2] == null) {
                    var1 = false;
                    ++class181.field2397;
                }
            }
            if (class177.field2340 != null && class395.field5833[var2] == null && ~class177.field2340[var2] != 0) {
                class395.field5833[var2] = class153.field2066.method2278(113, 0, class73.field1051[var2], class177.field2340[var2]);
                if (class395.field5833[var2] == null) {
                    ++class181.field2397;
                    var1 = false;
                }
            }
        }
        if (class181.field2398 == null) {
            if (class62.field815 != null && class28.field417.method2259(22300, class62.field815.field3460 + "_staticelements")) {
                if (!class28.field417.method2282(class62.field815.field3460 + "_staticelements", (byte) 90)) {
                    ++class181.field2397;
                    var1 = false;
                } else {
                    class181.field2398 = class12.method89(class390.field5614, class62.field815.field3460 + "_staticelements", -5320, class28.field417);
                }
            } else {
                class181.field2398 = new class65(0);
            }
        }
        if (!var1) {
            class351.field5088 = 1;
        } else {
            boolean var3 = true;
            class267.field3851 = 0;
            for (int var4 = 0; var4 < class379.field5503.length; ++var4) {
                byte[] var20 = class146.field2006[var4];
                if (var20 != null) {
                    int var21 = (class147.field2015[var4] >> 8) * 64 + -class7.field138;
                    int var22 = (255 & class147.field2015[var4]) * 64 + -class200.field2660;
                    if (class394.field5702) {
                        var21 = 10;
                        var22 = 10;
                    }
                    var3 &= class390.method2510(var21, 1836, var22, var20);
                }
                byte[] var23 = class94.field1346[var4];
                if (var23 != null) {
                    int var24 = (class147.field2015[var4] >> 8) * 64 - class7.field138;
                    int var25 = (class147.field2015[var4] & 255) * 64 - class200.field2660;
                    if (class394.field5702) {
                        var24 = 10;
                        var25 = 10;
                    }
                    var3 &= class390.method2510(var24, 1836, var25, var23);
                }
            }
            if (!var3) {
                class351.field5088 = 2;
            } else {
                if (class351.field5088 != 0) {
                    class89.method629(0, true, class372.field5413 + "<br>(100%)", class393.field5626);
                }
                class281.method1935(76);
                class376.method2444(arg0 + -1056982301);
                boolean var5 = false;
                if (class61.field807.method1734() && class213.field2853) {
                    for (int var6 = 0; ~var6 > ~class379.field5503.length; ++var6) {
                        if (class94.field1346[var6] != null || class12.field198[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class339.field4891) {
                    var7 = class163.field2185[class78.field1096];
                } else {
                    var7 = class96.field1357[class78.field1096];
                }
                if (class61.field807.method1728()) {
                    ++var7;
                }
                class92.method641(4, class192.field2574, class364.field5262, var7, var5, ~class61.field807.method1709() < -1);
                for (int var8 = 0; ~var8 > -5; ++var8) {
                    class365.field5294[var8].method1852(-5);
                }
                class149.method943(100);
                if (arg0 != 1057001181) {
                    method2163(-46, (class347) null);
                }
                class438.method2757(-1, false);
                class244.method1465(arg0 + -1057001259);
                class281.method1935(99);
                System.gc();
                class140.method900(true, 133);
                class79.method570(false, (byte) 127, 4);
                int[][] var9 = null;
                if (!class394.field5702) {
                    class272.method1870(false, false);
                    class324.method2177(class227.field2988.field4360[0] >> 3, false, class227.field2988.field4362[0] >> 3);
                    method2166(-1);
                    class215.method1265(4, (int[][]) null, false, arg0 ^ 1057001143, class61.field807);
                    var9 = class331.field4817[0];
                    class140.method900(true, 133);
                    class161.method994(true, false);
                    if (class395.field5833 != null) {
                        class23.method154(2034913891);
                    }
                }
                if (class394.field5702) {
                    class174.method1072(false, -73);
                    class324.method2177(class227.field2988.field4360[0] >> 3, false, class227.field2988.field4362[0] >> 3);
                    method2166(-1);
                    class215.method1265(4, (int[][]) null, false, arg0 ^ 1057001134, class61.field807);
                    var9 = class331.field4817[0];
                    class140.method900(true, arg0 + -1057001048);
                    class83.method594(false, 8);
                }
                class376.method2444(arg0 + -1056982301);
                class140.method900(true, 133);
                class152.method953(false, class365.field5294, 29649, (class351) null, class61.field807, 4);
                class148.method941(1, 4, class61.field807);
                class140.method900(true, arg0 ^ 1057001048);
                int var10 = class143.field1953;
                if (~class227.field2981 > ~var10) {
                    var10 = class227.field2981;
                }
                if (~var10 > ~(class227.field2981 + -1)) {
                    var10 = class227.field2981 + -1;
                }
                if (class11.method79((byte) 94)) {
                    class157.method971(0);
                } else {
                    class157.method971(var10);
                }
                class328.method2182(-13476);
                if (var5) {
                    class78.method566(true);
                    class79.method570(true, (byte) 127, 1);
                    if (!class394.field5702) {
                        class272.method1870(true, false);
                        class215.method1265(1, var9, true, 127, class61.field807);
                        class140.method900(true, 133);
                        class161.method994(true, true);
                        class148.method941(1, 1, class61.field807);
                    }
                    if (class394.field5702) {
                        class174.method1072(true, arg0 + -1057001288);
                        class215.method1265(1, var9, true, 127, class61.field807);
                        class140.method900(true, 133);
                        class83.method594(true, arg0 ^ 1057001173);
                    }
                    class376.method2444(18880);
                    class140.method900(true, 133);
                    class152.method953(true, class365.field5294, arg0 ^ 1057029388, class265.field3846[0], class61.field807, 1);
                    class148.method941(1, 1, class61.field807);
                    class140.method900(true, 133);
                    class328.method2182(arg0 + -1057014657);
                    class78.method566(false);
                }
                for (int var11 = 0; ~var11 > -5; ++var11) {
                    for (int var18 = 0; ~var18 > ~class192.field2574; ++var18) {
                        for (int var19 = 0; class364.field5262 > var19; ++var19) {
                            class73.method538(var19, var18, (byte) -36, var11);
                        }
                    }
                }
                class43.method313(119);
                class281.method1935(115);
                class151.method949(88);
                class376.method2444(18880);
                class62.field820 = false;
                class268.method1830(127);
                if (class374.field5447 != null && class191.field2558 != null && ~class70.field932 == -26) {
                    ++class419.field6207;
                    class185.field2507.method5(arg0 ^ -1057003506, 138);
                    class185.field2507.method1330(1057001181, -117);
                }
                if (!class394.field5702) {
                    int var12 = (-(class192.field2574 >> 4) + class179.field2373) / 8;
                    int var13 = (class179.field2373 - -(class192.field2574 >> 4)) / 8;
                    int var14 = (-(class364.field5262 >> 4) + class220.field2905) / 8;
                    int var15 = (class220.field2905 - -(class364.field5262 >> 4)) / 8;
                    for (int var16 = var12 + -1; var13 + 1 >= var16; ++var16) {
                        for (int var17 = var14 + -1; var15 + 1 >= var17; ++var17) {
                            if (var12 > var16 || ~var13 > ~var16 || ~var14 < ~var17 || var17 > var15) {
                                class153.field2066.method2276(arg0 ^ 1057001181, "m" + var16 + "_" + var17);
                                class153.field2066.method2276(0, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (~class70.field932 == -29) {
                    class232.method1391(-26, 10);
                } else {
                    class232.method1391(-26, 30);
                    if (class191.field2558 != null) {
                        class185.field2507.method5(arg0 ^ -1057003506, 230);
                    }
                }
                class352.method2318(arg0 + -1057001069);
                class281.method1935(81);
                class390.method2508(arg0 ^ -1057001182);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)V")
    public final void method228(int arg0, int arg1, int arg2) {
        ++field4715;
        if (arg0 != 0) {
            field4730 = 15;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(IIII)I")
    public static final int method2165(int arg0, int arg1, int arg2, int arg3) {
        ++field4723;
        if (~arg0 == ~arg3) {
            return arg0;
        } else {
            int var4 = -arg2 + 128;
            int var5 = (arg0 & 127) * var4 + (arg3 & 127) * arg2 >> 7;
            int var6 = (896 & arg0) * var4 + (896 & arg3) * arg2 >> 7;
            if (arg1 != 5000) {
                method2164(5);
            }
            int var7 = (arg0 & 64512) * var4 + (arg3 & 64512) * arg2 >> 7;
            return var5 & 127 | 896 & var6 | var7 & 64512;
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    public static final void method2166(int arg0) {
        ++field4718;
        if (~class70.field932 != -11 && ~class70.field932 != -29) {
            class43.method307(98, class227.field2988.field4360[0] >> 3, class227.field2988.field4362[0] >> 3, 5000);
        } else {
            class43.method307(arg0 + 118, class400.field5971 >> 10, class179.field2371 >> 10, 5000);
        }
        class232.method1392((byte) -92);
        class304.method2076(54);
        class68.method455((byte) -113);
        class268.method1830(-30);
        if (arg0 != -1) {
            field4730 = 81;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
    public final void method224(int arg0, int arg1, int arg2) {
        if (arg1 != 512) {
            this.field4716 = 126;
        }
        ++field4724;
        int var4 = this.field4720 * arg2 >> 12;
        int var5 = this.field4711 * arg0 >> 12;
        int var6 = this.field4719 * arg2 >> 12;
        int var7 = this.field4716 * arg0 >> 12;
        int var8 = this.field4714 * arg2 >> 12;
        int var9 = this.field4713 * arg0 >> 12;
        int var10 = this.field4731 * arg2 >> 12;
        int var11 = this.field4728 * arg0 >> 12;
        class374.method2419(var7, var5, super.field479, var6, var11, (byte) -9, var9, var4, var8, var10);
    }
}
