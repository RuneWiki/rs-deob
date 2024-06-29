import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class335 {

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[I")
    public static int[] field4954 = new int[32];

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
    public static int[] field4956 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[S")
    public static short[] field4953;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2222(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4952++;
        if (class343.field5032 == null) {
            class35.field574.method2766(arg5, arg3, arg2, arg0, -16777216, 61);
            return;
        }
        class269.field3930++;
        if (class100.field1350 != null && class100.field1350.field5284 - (class100.field1350.method130((byte) -60) - 1) * 64 >> 7 == class82.field1154 && class100.field1350.field5298 + 64 - (class100.field1350.method130((byte) -56) * 64) >> 7 == class70.field967) {
            class82.field1154 = -1;
            class70.field967 = -1;
            class203.method1281((byte) -117);
        }
        class391.method2553((byte) 80);
        if (!arg4) {
            class449.method2818(-5815);
        }
        class116.method815(-1);
        class30.method260(arg3, arg5, arg0, true, arg2, 3516);
        int var6 = class27.field485;
        int var7 = class367.field5460;
        int var8 = class322.field4597;
        int var9 = class451.field6581;
        if (class5.field48 == 1) {
            int var10 = (int) class155.field2027;
            if ((class38.field613 >> 8) > var10) {
                var10 = class38.field613 >> 8;
            }
            if (class408.field6122[4] && (class395.field5936[4] + 128) > var10) {
                var10 = class395.field5936[4] + 128;
            }
            int var11 = (int) class170.field2244 + class383.field5733 & 0x3FFF;
            class272.method1740(0, class139.method935(class100.field1350.field5298, -5, class100.field1350.field5284, class193.field2688) - 50, (var10 >> 3) * 3 + 600, var10, var11, var6, class370.field5511, class64.field902);
        } else if (class5.field48 == 4) {
            int var12 = (int) class155.field2027;
            if (var12 < (class38.field613 >> 8)) {
                var12 = class38.field613 >> 8;
            }
            if (class408.field6122[4] && var12 < (class395.field5936[4] + 128)) {
                var12 = class395.field5936[4] + 128;
            }
            int var13 = (int) class170.field2244 & 0x3FFF;
            class272.method1740(0, class139.method935(class146.field1915, 106, class309.field4409, class193.field2688) - 50, (var12 >> 3) * 3 + 600, var12, var13, var6, class370.field5511, class64.field902);
        } else if (class5.field48 == 5) {
            class64.method422((byte) -99, var6);
        }
        int var14 = class237.field3326;
        int var15 = class130.field1745;
        int var16 = class7.field71;
        int var17 = class265.field3878;
        int var18 = class179.field2364;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class408.field6122[var19]) {
                int var22 = (int) (Math.random() * (double) (class291.field4207[var19] * 2 + 1) + Math.sin((double) class387.field5780[var19] / 100.0D * (double) class417.field6218[var19]) * (double) class395.field5936[var19] - (double) class291.field4207[var19]);
                if (var19 == 4) {
                    class265.field3878 += var22;
                    if (class265.field3878 < 1024) {
                        class265.field3878 = 1024;
                    } else if (class265.field3878 > 3072) {
                        class265.field3878 = 3072;
                    }
                }
                if (var19 == 3) {
                    class179.field2364 = class179.field2364 + var22 & 0x3FFF;
                }
                if (var19 == 1) {
                    class130.field1745 += var22;
                }
                if (var19 == 0) {
                    class237.field3326 += var22;
                }
                if (var19 == 2) {
                    class7.field71 += var22;
                }
            }
        }
        if (class237.field3326 < 0) {
            class237.field3326 = 0;
        }
        if (class237.field3326 > (class308.field4403 << 7) - 1) {
            class237.field3326 = (class308.field4403 << 7) - 1;
        }
        if (class7.field71 < 0) {
            class7.field71 = 0;
        }
        if (((class413.field6175 << 7) - 1) < class7.field71) {
            class7.field71 = (class413.field6175 << 7) - 1;
        }
        class212.method1312(96);
        class285.method1810(-9941);
        class35.field574.method2155(var8, var9, var8 + var7, var6 + var9);
        if (arg1 > -64) {
            return;
        }
        class35.field574.method2033();
        int var20 = class336.field4960;
        if (class94.field1305 == null) {
            class35.field574.method2118(var20);
        } else {
            class94.field1305.method567(-26367, class35.field574, class265.field3878, class179.field2350 << 3, var9, class179.field2364, var20, var8, var7, var6);
        }
        class87.method540(115);
        class81.field1136.method816(class237.field3326, class130.field1745, class7.field71, -class265.field3878 & 0x3FFF, -class179.field2364 & 0x3FFF, -class277.field4070 & 0x3FFF);
        class35.field574.method2059(class81.field1136);
        class35.field574.method2074(var8 + (var7 / 2), var6 / 2 + var9, class115.field1560 << 1, class115.field1560 << 1);
        class420.method2702(var6 / 2 + var9, class115.field1560 << 1, class115.field1560 << 1, -14213, var7 / 2 + var8);
        class437.method2768(class7.field71, -class179.field2364 & 0x3FFF, -119, class237.field3326, -class277.field4070 & 0x3FFF, -class265.field3878 & 0x3FFF, class130.field1745);
        byte var21 = class72.method446(28804) == 2 ? (byte) class269.field3930 : 1;
        class271.method1735(class35.field574, class50.field698, class169.field2227, class81.field1136, class237.field3326, class130.field1745, class7.field71, class115.field1566, class45.field665, class86.field1192, class156.field2045, class224.field3166, class207.field2978, class193.field2688 + 1, var21, class100.field1350.field5284 >> 7, class100.field1350.field5298 >> 7, !class158.field2076);
        class87.method540(110);
        if (class137.field1815 == 30) {
            class402.method2609(256, 256, false, var8, var9, var7, var6);
            class405.method2641(var8, var6, 256, var9, 0, var7, 256);
            class256.method1612(var7, 256, var9, var6, (byte) 63, var8, 256);
            class278.method1775(var7, var9, var8, var6, 87);
        }
        class15.method98();
        class7.field71 = var16;
        class130.field1745 = var15;
        class179.field2364 = var18;
        class265.field3878 = var17;
        class237.field3326 = var14;
        if (class449.field6558 && class97.field1331.method2202(4) == 0) {
            class449.field6558 = false;
        }
        if (class449.field6558) {
            class35.field574.method2766(var7, var6, var8, var9, -16777216, 31);
            class132.method898(false, -29854, class284.field4157, class311.field4456);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method2223(int arg0) {
        field4953 = null;
        field4956 = null;
        field4954 = null;
        if (arg0 <= 114) {
            method2222(-103, -103, 101, 6, false, -107);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method2224(int arg0, int arg1) {
        field4949++;
        if (arg1 != 2) {
            field4948 = 41;
        }
        class449.field6559 = arg0;
        class24 var2 = class169.field2235;
        synchronized (class169.field2235) {
            class169.field2235.method212(-88);
        }
        class24 var3 = class277.field4065;
        synchronized (class277.field4065) {
            class277.field4065.method212(-88);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZ)I")
    public static final int method2225(int arg0, int arg1, boolean arg2) {
        field4951++;
        if (arg2) {
            return arg0 == 4 || arg0 == 5 ? class332.field4879[arg1 & 0x3] : 256;
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static final void method2226(int arg0) {
        field4955++;
        if (arg0 != 64 || class344.field5041 == null) {
            return;
        }
        while (true) {
            while (class234.field3291.length > class442.field6460) {
                class159 var1 = class234.field3291[class442.field6460];
                if (var1 != null && var1.field2081 == -1) {
                    if (class311.field4449 == null) {
                        class311.field4449 = class344.field5041.method684(var1.field2083, false);
                    }
                    int var2 = class311.field4449.field6138;
                    if (var2 == -1) {
                        return;
                    }
                    class311.field4449 = null;
                    class442.field6460++;
                    var1.field2081 = var2;
                } else {
                    class442.field6460++;
                }
            }
            return;
        }
    }
}
