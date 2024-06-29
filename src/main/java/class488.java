import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class488 extends class180 {

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Ltm;")
    public static class112 field6884 = new class112("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "[I")
    public static int[] field6888 = new int[2];

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lfn;")
    public static class52 field6887 = new class52(98, -1);

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "Z")
    public static boolean field6889 = false;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "F")
    public float field6880;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field6878;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field6879;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public int field6883;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field6886;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[Lgb;")
    public static class270[] field6890;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static final void method2868(int arg0) {
        field6885++;
        class127.method770(arg0 + 25305, false);
        class455.field6292 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class123.field1709.length; var2++) {
            if (class22.field372[var2] != -1 && class123.field1709[var2] == null) {
                class123.field1709[var2] = class336.field4611.method2029(class22.field372[var2], 0, 0);
                if (class123.field1709[var2] == null) {
                    class455.field6292++;
                    var1 = false;
                }
            }
            if (class8.field173[var2] != -1 && class50.field847[var2] == null) {
                class50.field847[var2] = class336.field4611.method2043(class8.field173[var2], 0, class439.field6014[var2], 57);
                if (class50.field847[var2] == null) {
                    var1 = false;
                    class455.field6292++;
                }
            }
            if (class312.field4254[var2] != -1 && class139.field1985[var2] == null) {
                class139.field1985[var2] = class336.field4611.method2029(class312.field4254[var2], 0, 0);
                if (class139.field1985[var2] == null) {
                    var1 = false;
                    class455.field6292++;
                }
            }
            if (class15.field264[var2] != -1 && class314.field4263[var2] == null) {
                class314.field4263[var2] = class336.field4611.method2029(class15.field264[var2], 0, class382.method2292(arg0, -27897));
                if (class314.field4263[var2] == null) {
                    var1 = false;
                    class455.field6292++;
                }
            }
            if (class338.field4633 != null && class59.field930[var2] == null && class338.field4633[var2] != -1) {
                class59.field930[var2] = class336.field4611.method2043(class338.field4633[var2], 0, class439.field6014[var2], 120);
                if (class59.field930[var2] == null) {
                    var1 = false;
                    class455.field6292++;
                }
            }
        }
        if (class387.field5456 == null) {
            if (class325.field4468 == null || !class183.field2667.method2056(class325.field4468.field2876 + "_staticelements", true)) {
                class387.field5456 = new class107(0);
            } else if (class183.field2667.method2052(class325.field4468.field2876 + "_staticelements", -117)) {
                class387.field5456 = class314.method1895(-94, class183.field2667, class319.field4371, class325.field4468.field2876 + "_staticelements");
            } else {
                class455.field6292++;
                var1 = false;
            }
        }
        if (!var1) {
            class181.field2626 = 1;
            return;
        }
        class198.field2842 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class123.field1709.length; var4++) {
            byte[] var19 = class50.field847[var4];
            if (var19 != null) {
                int var20 = (class490.field6908[var4] >> 8) * 64 - class153.field2204;
                int var21 = (class490.field6908[var4] & 0xFF) * 64 - class325.field4472;
                if (class287.field3914) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class27.method230(var20, class422.field5811, class200.field2875, var21, 768, var19);
            }
            byte[] var22 = class314.field4263[var4];
            if (var22 != null) {
                int var23 = (class490.field6908[var4] >> 8) * 64 - class153.field2204;
                int var24 = (class490.field6908[var4] & 0xFF) * 64 - class325.field4472;
                if (class287.field3914) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class27.method230(var23, class422.field5811, class200.field2875, var24, 768, var22);
            }
        }
        if (!var3) {
            class181.field2626 = 2;
            return;
        }
        if (class181.field2626 != 0) {
            class442.method2568(class262.field3662, arg0 + 27897, class480.field6789.method695(-113, class487.field6867) + "<br>(100%)", true);
        }
        class172.method1155(15547);
        class441.method2559(true);
        boolean var5 = false;
        if (class338.field4636.method1098() && class327.field4526) {
            for (int var6 = 0; var6 < class123.field1709.length; var6++) {
                if (class314.field4263[var6] != null || class139.field1985[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class301.field4127) {
            var7 = class306.field4193[class430.field5927];
        } else {
            var7 = class160.field2307[class430.field5927];
        }
        if (class338.field4636.method1078()) {
            var7++;
        }
        class163.method992(7, 4, class200.field2875, class422.field5811, var7, var5, class338.field4636.method1051() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class308.field4209[var8].method1704(true);
        }
        class490.method2875(0);
        class284.method1760(false, (byte) 59);
        class183.method1199(1744);
        class172.method1155(15547);
        System.gc();
        if (arg0 != -27897) {
            method2868(16);
        }
        class127.method770(-2592, true);
        class257.method1599(-6548);
        class232.field3276 = class312.field4249;
        class375.field5313 = !class164.field2424;
        class121.field1697 = class327.field4526;
        class221.field3117 = class154.field2227 >= 96;
        class131.field1848 = class47.field761;
        class257.field3600 = class410.method2404(-1) ? -1 : class480.field6794;
        class272.field3774 = class221.field3118 == 1 || class255.field3580;
        class154.field2208 = new class115(4, class200.field2875, class422.field5811, false);
        if (!class287.field3914) {
            class73.method502(class123.field1709, class154.field2208, (byte) 111);
        }
        if (class287.field3914) {
            class396.method2367(class154.field2208, (byte) 28, class123.field1709);
        }
        class199.method1266(class200.field2875 >> 4, class422.field5811 >> 4, 0);
        class373.method2235(arg0 + 27907);
        if (var5) {
            class251.method1562(true);
            class344.field4707 = new class115(1, class200.field2875, class422.field5811, true);
            if (!class287.field3914) {
                class73.method502(class139.field1985, class344.field4707, (byte) 79);
                class127.method770(-2592, true);
            }
            if (class287.field3914) {
                class396.method2367(class344.field4707, (byte) -123, class139.field1985);
                class127.method770(-2592, true);
            }
            class344.field4707.method172(class154.field2208.field348[0], 3, 0);
            class344.field4707.method170(false, class338.field4636, (class272[]) null, (int[][][]) null);
            class251.method1562(false);
        }
        class154.field2208.method170(false, class338.field4636, class308.field4209, var5 ? class344.field4707.field348 : null);
        if (!class287.field3914) {
            class127.method770(-2592, true);
            class175.method1162(class50.field847, class154.field2208, (byte) -111);
            if (class59.field930 != null) {
                class334.method1989(-1);
            }
        }
        if (class287.field3914) {
            class127.method770(-2592, true);
            class309.method1866(-51, class154.field2208, class50.field847);
        }
        class441.method2559(true);
        class127.method770(arg0 ^ 0x66E7, true);
        class154.field2208.method180(class338.field4636, 0, (class269) null, var5 ? class8.field166[0] : null);
        class154.field2208.method731(class338.field4636, arg0 ^ 0xFFFF9303);
        class127.method770(-2592, true);
        if (var5) {
            class251.method1562(true);
            class127.method770(-2592, true);
            if (!class287.field3914) {
                class175.method1162(class314.field4263, class344.field4707, (byte) 121);
            }
            if (class287.field3914) {
                class309.method1866(-94, class344.field4707, class314.field4263);
            }
            class441.method2559(true);
            class127.method770(arg0 + 25305, true);
            class344.field4707.method180(class338.field4636, 0, class366.field5215[0], (class269) null);
            class344.field4707.method731(class338.field4636, 4);
            class127.method770(arg0 + 25305, true);
            class251.method1562(false);
        }
        class77.method533((byte) -101);
        int var9 = class154.field2208.field1619;
        if (class76.field1161 < var9) {
            var9 = class76.field1161;
        }
        if (var9 < class76.field1161 - 1) {
            var9 = class76.field1161 - 1;
        }
        if (class410.method2404(-1)) {
            class6.method79(0);
        } else {
            class6.method79(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class200.field2875; var17++) {
                for (int var18 = 0; var18 < class422.field5811; var18++) {
                    class421.method2447(-527387929, var18, var10, var17);
                }
            }
        }
        class375.method2240(78);
        class172.method1155(15547);
        class161.method981(arg0 + 27897);
        class441.method2559(true);
        class148.field2091 = false;
        class115.method725(1);
        if (class240.field3384 != null && class237.field3339 != null && class478.field6764 == 25) {
            class131.method793(class465.field6529, -56);
            class430.field5922++;
            class366.field5214.method2481(1057001181, true);
        }
        if (!class287.field3914) {
            int var11 = (class182.field2643 - (class200.field2875 >> 4)) / 8;
            int var12 = ((class200.field2875 >> 4) + class182.field2643) / 8;
            int var13 = (class275.field3810 - (class422.field5811 >> 4)) / 8;
            int var14 = ((class422.field5811 >> 4) + class275.field3810) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var16 < var13 || var16 > var14) {
                        class336.field4611.method2048("m" + var15 + "_" + var16, -1);
                        class336.field4611.method2048("l" + var15 + "_" + var16, -1);
                    }
                }
            }
        }
        if (class478.field6764 == 28) {
            class8.method94(10, 113);
        } else {
            class8.method94(30, arg0 + 28004);
            if (class237.field3339 != null) {
                class131.method793(class61.field943, 95);
            }
        }
        class135.method815(-1);
        class172.method1155(arg0 ^ 0xFFFFAFBC);
        class334.method1986(8776);
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
    public static final void method2869(int arg0) {
        field6876++;
        if (arg0 != 10) {
            field6888 = null;
        }
        class265 var1 = class440.method2554(0, 2, 15);
        var1.method1677(arg0 ^ 0x54FE);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[Lms;I)V")
    public static final void method2870(int arg0, class363[] arg1, int arg2) {
        field6881++;
        int var3 = 0;
        if (arg2 <= 46) {
            return;
        }
        while (arg1.length > var3) {
            class363 var4 = arg1[var3];
            if (var4 != null && var4.field5062 == arg0 && !client.method2331(var4)) {
                if (var4.field5093 == 0) {
                    method2870(var4.field5096, arg1, 105);
                    if (var4.field5113 != null) {
                        method2870(var4.field5096, var4.field5113, 73);
                    }
                    class465 var5 = (class465) class231.field3258.method2614((long) var4.field5096, -84);
                    if (var5 != null) {
                        class82.method565(-1, var5.field6527);
                    }
                }
                if (var4.field5093 == 6 && var4.field5121 != -1) {
                    class372 var6 = class31.field505.method950(true, var4.field5121);
                    if (var6 != null) {
                        var4.field5045 += class42.field717;
                        while (var6.field5283[var4.field5172] < var4.field5045) {
                            var4.field5045 -= var6.field5283[var4.field5172];
                            var4.field5172++;
                            if (var4.field5172 >= var6.field5278.length) {
                                var4.field5172 -= var6.field5251;
                                if (var4.field5172 < 0 || var6.field5278.length <= var4.field5172) {
                                    var4.field5172 = 0;
                                }
                            }
                            var4.field5152 = var4.field5172 + 1;
                            if (var6.field5278.length <= var4.field5152) {
                                var4.field5152 -= var6.field5251;
                                if (var4.field5152 < 0 || var6.field5278.length <= var4.field5152) {
                                    var4.field5152 = -1;
                                }
                            }
                            class356.method2141(-111, var4);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
    public static void method2871(byte arg0) {
        field6888 = null;
        if (arg0 < 64) {
            method2869(-36);
        }
        field6884 = null;
        field6887 = null;
        field6890 = null;
    }
}
