import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class117 implements class31 {

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private int field2247 = 50;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    private int field2258 = 128;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Lc;")
    private class21 field2257;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Lc;")
    private class21 field2262;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Ldd;")
    private class34 field2246;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "[I")
    public static int[] field2249 = new int[99];

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "Lai;")
    private static class10 field2261 = class44.method278("white:", -104);

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Lai;")
    public static class10 field2254 = field2261;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lai;")
    public static class10 field2241 = field2261;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Lai;")
    public static class10 field2268;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "Lai;")
    public static class10 field2270;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "Lai;")
    private static class10 field2271;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "Lai;")
    public static class10 field2269;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Lme;")
    public static class114 field2266;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(FII)[I")
    public final int[] method202(float arg0, int arg1, int arg2) {
        field2252++;
        class151 var4 = this.method837(arg1, (byte) 121);
        var4.field2902 = true;
        if (arg2 != 24701) {
            this.method203(102, (byte) -66);
        }
        return var4.method1030(arg0, false, this.field2257, this.field2258, this);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)I")
    public final int method205(int arg0, byte arg1) {
        if (arg1 != -6) {
            this.method206(false, 101);
        }
        field2255++;
        return this.method837(arg0, (byte) 121).field2906;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(ZI)Z")
    public final boolean method206(boolean arg0, int arg1) {
        field2267++;
        if (arg0) {
            this.method834(true, 87);
        }
        return this.field2258 == 64 || this.method837(arg1, (byte) 121).field2914 == 64;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lwa;IIIIIII)V")
    public static final void method833(class200 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 21 % ((4 - arg3) / 55);
        if (class123.field2354) {
            class121.field2324 = 32;
        } else {
            class121.field2324 = 0;
        }
        class123.field2354 = false;
        field2244++;
        if (class58.field1014 != 0) {
            if (arg6 <= arg2 && arg2 < arg6 + 16 && arg1 <= arg7 && arg1 + 16 > arg7) {
                arg0.field3907 -= 4;
                class168.method1116(arg0, -85);
            } else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg1 + arg5 - 16 <= arg7 && arg1 + arg5 > arg7) {
                arg0.field3907 += 4;
                class168.method1116(arg0, -122);
            } else if (arg6 - class121.field2324 <= arg2 && arg6 + class121.field2324 + 16 > arg2 && arg1 + 16 <= arg7 && arg5 + arg1 - 16 > arg7) {
                int var9 = (arg5 - 32) * arg5 / arg4;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg7 - var9 / 2 - arg1 - 16;
                int var11 = arg5 - var9 - 32;
                arg0.field3907 = (arg4 - arg5) * var10 / var11;
                class168.method1116(arg0, -94);
                class123.field2354 = true;
            }
        }
        if (class169.field3264 == 0) {
            return;
        }
        int var12 = arg0.field3845;
        if (arg2 >= arg6 - var12 && arg7 >= arg1 && arg6 + 16 > arg2 && arg1 + arg5 >= arg7) {
            arg0.field3907 += class169.field3264 * 45;
            class168.method1116(arg0, -87);
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(ZI)V")
    public final void method834(boolean arg0, int arg1) {
        for (class151 var3 = (class151) this.field2246.method228((byte) -99); var3 != null; var3 = (class151) this.field2246.method232(13)) {
            if (var3.field2902) {
                var3.method1029(!arg0, arg1);
                var3.field2902 = false;
            }
        }
        field2253++;
        if (!arg0) {
            this.field2258 = -83;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)Z")
    public final boolean method204(boolean arg0, int arg1) {
        if (arg0) {
            method841(null, 64);
        }
        field2242++;
        return this.method837(arg1, (byte) 121).field2896;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLc;II)[Lbf;")
    public static final class17[] method835(byte arg0, class21 arg1, int arg2, int arg3) {
        field2256++;
        int var4 = 5 / ((arg0 + 38) / 60);
        return class169.method1123(arg3, (byte) 107, arg2, arg1) ? class27.method177(-1) : null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static void method836(int arg0) {
        field2268 = null;
        field2241 = null;
        field2249 = null;
        field2266 = null;
        if (arg0 != -1) {
            method835((byte) 46, null, -33, -7);
        }
        field2254 = null;
        field2270 = null;
        field2261 = null;
        field2269 = null;
        field2271 = null;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IB)Lqf;")
    private final class151 method837(int arg0, byte arg1) {
        if (arg1 != 121) {
            method835((byte) 109, null, 89, -28);
        }
        field2245++;
        class151 var3 = (class151) this.field2246.method222(121, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2262.method159((byte) 106, arg0, 0);
        if (var4 == null) {
            return class70.method450((byte) -128);
        } else {
            class114 var5 = new class114(var4);
            class151 var6 = new class151(var5);
            this.field2246.method225(-21284, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
    public final void method838(int arg0) {
        if (arg0 >= -61) {
            field2265 = 102;
        }
        this.field2246 = new class34(this.field2247);
        field2259++;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
    public static final void method839(int arg0, int arg1) {
        if (arg1 == -3) {
            class151.method1032(class85.field1505, class168.field3247, (byte) 106, class151.field2892);
        } else if (arg1 == -2) {
            class151.method1032(class85.field1499, class85.field1521, (byte) 75, class64.field1070);
        } else if (arg1 == -1) {
            class151.method1032(class85.field1502, class55.field982, (byte) -105, class151.field2905);
        } else if (arg1 == 3) {
            class151.method1032(class85.field1485, class85.field1489, (byte) -85, class121.field2328);
        } else if (arg1 == 4) {
            class151.method1032(class85.field1491, class151.field2898, (byte) 100, class151.field2887);
        } else if (arg1 == 5) {
            class151.method1032(class85.field1514, class115.field2198, (byte) 58, class46.field753);
        } else if (arg1 == 6) {
            class151.method1032(class85.field1488, class9.field105, (byte) 89, class4.field31);
        } else if (arg1 == 7) {
            class151.method1032(class85.field1486, class169.field3273, (byte) 93, class200.field3786);
        } else if (arg1 == 8) {
            class151.method1032(class85.field1520, class43.field712, (byte) 50, class67.field1179);
        } else if (arg1 == 9) {
            class151.method1032(class85.field1472, class160.field3082, (byte) 0, class70.field1206);
        } else if (arg1 == 10) {
            class151.method1032(class85.field1523, class43.field710, (byte) -91, class9.field104);
        } else if (arg1 == 11) {
            class151.method1032(class85.field1522, class73.field1260, (byte) 88, class4.field45);
        } else if (arg1 == 12) {
            class151.method1032(class85.field1528, class123.field2362, (byte) 121, class200.field3898);
        } else if (arg1 == 13) {
            class151.method1032(class85.field1490, class11.field189, (byte) -97, class151.field2909);
        } else if (arg1 == 14) {
            class151.method1032(class85.field1492, class137.field2580, (byte) -92, class168.field3237);
        } else if (arg1 == 16) {
            class151.method1032(class85.field1473, class192.field3657, (byte) -110, class147.field2814);
        } else if (arg1 == 17) {
            class151.method1032(class85.field1481, class55.field977, (byte) -96, class32.field483);
        } else if (arg1 == 18) {
            class151.method1032(class85.field1527, class89.field1575, (byte) 81, class160.field3085);
        } else if (arg1 == 19) {
            class151.method1032(class200.field3831, class124.field2379, (byte) 40, class97.field1785);
        } else if (arg1 == 20) {
            class151.method1032(class85.field1506, class61.field1042, (byte) 2, class151.field2884);
        } else if (arg1 == 22) {
            class151.method1032(class85.field1519, class50.field892, (byte) -104, class78.field1372);
        } else if (arg1 == 23) {
            class151.method1032(class85.field1508, class37.field587, (byte) 4, class168.field3246);
        } else if (arg1 == 24) {
            class151.method1032(class85.field1494, class1.field4, (byte) -123, class83.field1450);
        } else if (arg1 == 25) {
            class151.method1032(class85.field1510, class78.field1384, (byte) -117, class151.field2900);
        } else if (arg1 == 26) {
            class151.method1032(class85.field1504, class53.field947, (byte) -93, class114.field2143);
        } else if (arg1 == 27) {
            class151.method1032(class85.field1507, class85.field1475, (byte) -108, class54.field969);
        } else {
            class151.method1032(class85.field1470, class96.field1758, (byte) 68, class151.field2883);
        }
        class111.method710(51, 10);
        if (arg0 < -22) {
            field2264++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I")
    public final int[] method203(int arg0, byte arg1) {
        class114 var3 = new class114(this.field2262.method159((byte) 124, arg0, 0));
        if (arg1 >= -69) {
            field2270 = null;
        }
        field2251++;
        class151 var4 = new class151(var3);
        return var4.method1027(this, this.field2258, (byte) -100, this.field2257);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
    public final boolean method201(int arg0, int arg1) {
        if (arg1 != -16318) {
            method840(32, 92, (byte) -30, -3, false, -105);
        }
        field2250++;
        return this.method837(arg0, (byte) 121).field2891;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Z")
    public final boolean method207(int arg0, int arg1) {
        field2260++;
        if (arg1 != -16262) {
            this.field2262 = null;
        }
        return this.method837(arg0, (byte) 121).method1028(this, this.field2257, true);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBIZI)Lbf;")
    public static final class17 method840(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        field2243++;
        long var6 = ((long) arg0 << 38) + ((long) arg3 << 40) + (long) arg5 + ((long) arg1 << 16);
        if (!arg4) {
            class17 var8 = (class17) class134.field2518.method222(-21, var6);
            if (var8 != null) {
                return var8;
            }
        }
        class94 var9 = class104.method678(500, arg5);
        if (arg1 > 1 && var9.field1745 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field1728[var11] <= arg1 && var9.field1728[var11] != 0) {
                    var10 = var9.field1745[var11];
                }
            }
            if (var10 != -1) {
                var9 = class104.method678(500, var10);
            }
        }
        class167 var12 = var9.method617((byte) 38);
        if (var12 == null) {
            return null;
        }
        class17 var13 = null;
        if (var9.field1741 != -1) {
            var13 = method840(1, 10, (byte) -93, 0, true, var9.field1733);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class62.field1052;
        int var15 = class62.field1050;
        int var16 = class62.field1046;
        int[] var17 = new int[4];
        class62.method410(var17);
        class17 var18 = new class17(36, 32);
        class62.method408(var18.field258, 36, 32);
        class62.method399();
        class113.method745();
        class113.method752(16, 16);
        int var19 = var9.field1703;
        class113.field2130 = false;
        if (arg4) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class113.field2120[var9.field1735] * var19 >> 16;
        int var21 = class113.field2124[var9.field1735] * var19 >> 16;
        var12.method1093();
        var12.method1095(0, var9.field1722, var9.field1731, var9.field1735, var9.field1700, var21 + var9.field1697 - var12.field2341 / 2, var9.field1697 + var20);
        if (arg0 >= 1) {
            var18.method109(1);
        }
        if (arg0 >= 2) {
            var18.method109(16777215);
        }
        if (arg3 != 0) {
            var18.method107(arg3);
        }
        if (arg2 > -77) {
            method841(null, 84);
        }
        class62.method408(var18.field258, 36, 32);
        if (var9.field1741 != -1) {
            var13.method105(0, 0);
        }
        if (!arg4 && (var9.field1693 == 1 || arg1 != 1) && arg1 != -1) {
            class14.field230.method1266(class80.method493(true, arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            class134.field2518.method225(-21284, var6, var18);
        }
        class62.method408(var14, var15, var16);
        class62.method403(var17);
        class113.method745();
        class113.field2130 = true;
        return var18;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lwa;I)Lwa;")
    public static final class200 method841(class200 arg0, int arg1) {
        class200 var2 = class42.method265((byte) -80, arg0);
        if (var2 == null) {
            var2 = arg0.field3870;
        }
        if (arg1 < 66) {
            field2249 = null;
        }
        field2248++;
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lc;Lc;II)V")
    public class117(class21 arg0, class21 arg1, int arg2, int arg3) {
        this.field2257 = arg1;
        this.field2262 = arg0;
        this.field2258 = arg3;
        this.field2247 = arg2;
        this.field2246 = new class34(this.field2247);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2249[var1] = var0 / 4;
        }
        field2268 = class44.method278("(Y", -91);
        field2270 = class44.method278("Ung-Ultiger Benutzername", -103);
        field2271 = class44.method278("You can(Wt add yourself to your own ignore list)3", -75);
        field2269 = field2271;
    }
}
