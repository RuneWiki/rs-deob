import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class658 {

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lju;")
    public static class102 field9292 = new class102(25, 6);

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public static int field9294 = 0;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field9295 = -1;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field9298;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "Lon;")
    public static class504 field9296;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "[Lei;")
    public static class183[] field9293;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V", line = 13)
    public static final void method3793(byte arg0) {
        class72.method461(26985, false);
        field9298++;
        class711.field9925 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class682.field9590.length; var2++) {
            if (class53.field749[var2] != -1 && class682.field9590[var2] == null) {
                class682.field9590[var2] = class281.field3729.method3322(class53.field749[var2], 0, (byte) 87);
                if (class682.field9590[var2] == null) {
                    class711.field9925++;
                    var1 = false;
                }
            }
            if (class86.field1193[var2] != -1 && class175.field2387[var2] == null) {
                class175.field2387[var2] = class281.field3729.method3332(class86.field1193[var2], 0, class57.field801[var2], (byte) 107);
                if (class175.field2387[var2] == null) {
                    var1 = false;
                    class711.field9925++;
                }
            }
            if (class713.field10118[var2] != -1 && class556.field7846[var2] == null) {
                class556.field7846[var2] = class281.field3729.method3322(class713.field10118[var2], 0, (byte) 102);
                if (class556.field7846[var2] == null) {
                    class711.field9925++;
                    var1 = false;
                }
            }
            if (class378.field5269[var2] != -1 && class683.field9594[var2] == null) {
                class683.field9594[var2] = class281.field3729.method3322(class378.field5269[var2], 0, (byte) 107);
                if (class683.field9594[var2] == null) {
                    var1 = false;
                    class711.field9925++;
                }
            }
            if (class9.field85 != null && class594.field8557[var2] == null && class9.field85[var2] != -1) {
                class594.field8557[var2] = class281.field3729.method3332(class9.field85[var2], 0, class57.field801[var2], (byte) 110);
                if (class594.field8557[var2] == null) {
                    var1 = false;
                    class711.field9925++;
                }
            }
        }
        if (class669.field9413 == null) {
            if (class577.field8265 == null || !class378.field5267.method3310(0, class577.field8265.field7269 + "_staticelements")) {
                class669.field9413 = new class458(0);
            } else if (class378.field5267.method3343(-24230, class577.field8265.field7269 + "_staticelements")) {
                class669.field9413 = class259.method1609((byte) -116, class577.field8265.field7269 + "_staticelements", class378.field5267, class191.field2769);
            } else {
                var1 = false;
                class711.field9925++;
            }
        }
        if (!var1) {
            class133.field1795 = 1;
            return;
        }
        boolean var3 = true;
        class369.field4722 = 0;
        for (int var4 = 0; var4 < class682.field9590.length; var4++) {
            byte[] var21 = class175.field2387[var4];
            if (var21 != null) {
                int var22 = (class592.field8537[var4] >> 8) * 64 - class179.field2535;
                int var23 = (class592.field8537[var4] & 0xFF) * 64 - class510.field7109;
                if (class734.field10279 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class575.method3423(4, class456.field6281, var21, var23, var22, class514.field7179);
            }
            byte[] var24 = class683.field9594[var4];
            if (var24 != null) {
                int var25 = (class592.field8537[var4] >> 8) * 64 - class179.field2535;
                int var26 = (class592.field8537[var4] & 0xFF) * 64 - class510.field7109;
                if (class734.field10279 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class575.method3423(4, class456.field6281, var24, var26, var25, class514.field7179);
            }
        }
        if (!var3) {
            class133.field1795 = 2;
            return;
        }
        if (class133.field1795 != 0) {
            class665.method3817(class442.field6064, arg0 + 124, class138.field1848.method891(-2041650704, class369.field4721) + "<br>(100%)", class339.field4345, true, class96.field1401);
        }
        class350.method1993(26779);
        class294.method1723(true);
        class724.method4054(0);
        boolean var5 = false;
        if (class96.field1401.method2170() && class674.field9500.field5134.method2336(0) == 2) {
            for (int var6 = 0; var6 < class682.field9590.length; var6++) {
                if (class683.field9594[var6] != null || class556.field7846[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class674.field9500.field5143.method656(arg0 ^ 0xFFFFFF89) == 1) {
            var7 = class6.field49[class759.field10541];
        } else {
            var7 = class235.field3255[class759.field10541];
        }
        if (class96.field1401.method2079()) {
            var7++;
        }
        class355.method2010(class96.field1401, class231.field3215, 9, 4, class514.field7179, class456.field6281, var7, var5, class96.field1401.method2124() > 0);
        class474.method2816(class48.field713);
        if (class48.field713 == 0) {
            class380.method2334(null);
        } else {
            class380.method2334(class140.field1926);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class464.field6351[var8].method922(arg0 ^ 0x1);
        }
        class165.method1025(0);
        class732.method4071(arg0 ^ 0xFFFFFF89, false);
        method3794((byte) -107);
        class67.field932 = null;
        class274.field3686 = false;
        class350.method1993(arg0 + 26898);
        System.gc();
        class72.method461(26985, true);
        class229.method1479(-1814991167);
        class424.field5865 = class674.field9500.field5151.method2364(0);
        class317.field4077 = class674.field9497 >= 96;
        class252.field3489 = class674.field9500.field5134.method2336(0) == 2;
        class707.field9855 = class674.field9500.field5162.method1586(arg0 ^ 0xFFFFFF89) == 1;
        class126.field1744 = class674.field9500.field5113.method3798(0) == 1 ? -1 : class183.field2654;
        class611.field8698 = class674.field9500.field5163.method989(0) == 1;
        class229.field3189 = class674.field9500.field5130.method1257(0) == 1;
        class97.field1412 = new class295(4, class514.field7179, class456.field6281, false);
        if (class734.field10279 == 0) {
            class621.method3636((byte) -87, class682.field9590, class97.field1412);
        } else {
            class327.method1913(class682.field9590, class97.field1412, (byte) -111);
        }
        class186.method1249(-4755, class456.field6281 >> 4, class514.field7179 >> 4);
        class70.method443((byte) 11);
        if (var5) {
            class557.method3329(true);
            class660.field9313 = new class295(1, class514.field7179, class456.field6281, true);
            if (class734.field10279 == 0) {
                class621.method3636((byte) -87, class556.field7846, class660.field9313);
                class72.method461(arg0 ^ 0xFFFF96E0, true);
            } else {
                class327.method1913(class556.field7846, class660.field9313, (byte) -104);
                class72.method461(arg0 + 27104, true);
            }
            class660.field9313.method712((byte) 78, class97.field1412.field1527[0], 0);
            class660.field9313.method711(class96.field1401, null, arg0 + 200, null);
            class557.method3329(false);
        }
        if (arg0 != -119) {
            method3796(-81);
        }
        class97.field1412.method711(class96.field1401, class464.field6351, 81, var5 ? class660.field9313.field1527 : null);
        if (class734.field10279 == 0) {
            class72.method461(26985, true);
            class519.method3082(class175.field2387, class97.field1412, (byte) -76);
            if (class594.field8557 != null) {
                class416.method2530((byte) 77);
            }
        } else {
            class72.method461(26985, true);
            class58.method387(78, class97.field1412, class175.field2387);
        }
        class294.method1723(true);
        if (class674.field9497 < 96) {
            class319.method1856((byte) -108);
        }
        class72.method461(arg0 ^ 0xFFFF96E0, true);
        class97.field1412.method708(class96.field1401, null, var5 ? class435.field5969[0] : null, (byte) 97);
        class97.field1412.method1734(class96.field1401, false, true);
        class72.method461(26985, true);
        if (var5) {
            class557.method3329(true);
            class72.method461(26985, true);
            if (class734.field10279 == 0) {
                class519.method3082(class683.field9594, class660.field9313, (byte) -42);
            } else {
                class58.method387(99, class660.field9313, class683.field9594);
            }
            class294.method1723(true);
            class72.method461(26985, true);
            class660.field9313.method708(class96.field1401, class155.field2126[0], null, (byte) 104);
            class660.field9313.method1734(class96.field1401, true, true);
            class72.method461(26985, true);
            class557.method3329(false);
        }
        class121.method786((byte) -98);
        int var9 = class97.field1412.field3849;
        if (class392.field5459 < var9) {
            var9 = class392.field5459;
        }
        if (var9 < (class392.field5459 - 1)) {
            var9 = class392.field5459 - 1;
        }
        if (class674.field9500.field5113.method3798(0) == 0) {
            class63.method405(var9);
        } else {
            class63.method405(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class514.field7179; var19++) {
                for (int var20 = 0; var20 < class456.field6281; var20++) {
                    class123.method791(var20, -27930, var19, var10);
                }
            }
        }
        class78.method474(-3625);
        class350.method1993(26779);
        class236.method1504((byte) -22);
        class294.method1723(true);
        class498.method2986(-1);
        if (class244.field3384 != null && class275.field3699 != null && class213.field3004 == 11) {
            class264.field3591++;
            class120 var11 = class292.method1716(class608.field8668, true, class321.field4134);
            var11.field1653.method199(true, 1057001181);
            class471.method2805(110, var11);
        }
        if (class734.field10279 == 0) {
            int var12 = (class585.field8427 - (class514.field7179 >> 4)) / 8;
            int var13 = (class585.field8427 + (class514.field7179 >> 4)) / 8;
            int var14 = (class13.field192 - (class456.field6281 >> 4)) / 8;
            int var15 = ((class456.field6281 >> 4) + class13.field192) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var16 < var12 || var16 > var13 || var14 > var17 || var15 < var17) {
                        class281.field3729.method3307("m" + var16 + "_" + var17, 0);
                        class281.field3729.method3307("l" + var16 + "_" + var17, 0);
                    }
                }
            }
        }
        if (class213.field3004 == 4) {
            class647.method3754(3, true);
        } else if (class213.field3004 == 8) {
            class647.method3754(7, true);
        } else {
            class647.method3754(10, true);
            if (class275.field3699 != null) {
                class120 var18 = class292.method1716(class608.field8668, true, class374.field5116);
                class471.method2805(111, var18);
            }
        }
        class244.method1548(-95);
        class350.method1993(26779);
        class83.method497((byte) 123);
        class380.field5357 = true;
        if (class511.field7122) {
            class645.method3738("Took: " + (class224.method1457((byte) -62) - class558.field7940) + "ms", (byte) -49);
            class511.field7122 = false;
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V", line = 496)
    public static final void method3794(byte arg0) {
        if (arg0 != -107) {
            return;
        }
        for (int var1 = 0; var1 < class87.field1201.length; var1++) {
            for (int var2 = 0; var2 < class87.field1201[var1].length; var2++) {
                class87.field1201[var1][var2] = class449.field6177;
            }
        }
        field9297++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIB)I", line = 525)
    public static final int method3795(int arg0, int arg1, int arg2, byte arg3) {
        field9291++;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg1 / arg2;
        int var7 = arg1 & arg2 - 1;
        int var8 = class545.method3267(var4, arg3 ^ 0xFFFFFFEF, var6);
        int var9 = class545.method3267(var4 + 1, 8, var6);
        int var10 = class545.method3267(var4, arg3 ^ 0xFFFFFFEF, var6 + 1);
        int var11 = class545.method3267(var4 + 1, 8, var6 + 1);
        int var12 = class382.method2337(false, var5, arg2, var8, var9);
        int var13 = class382.method2337(false, var5, arg2, var10, var11);
        if (arg3 != -25) {
            field9295 = -83;
        }
        return class382.method2337(false, var7, arg2, var12, var13);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 566)
    public static void method3796(int arg0) {
        field9292 = null;
        field9293 = null;
        if (arg0 != 10922) {
            field9292 = null;
        }
        field9296 = null;
    }
}
