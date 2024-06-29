import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class738 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field10198;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Ldm;", line = 11)
    public static final class57 method4085(int arg0) {
        field10198++;
        if (class375.field5423 == null || class458.field6349 == null) {
            return null;
        }
        class458.field6349.method2256(class375.field5423, 113);
        int var1 = 124 % ((arg0 - 31) / 60);
        class57 var2 = (class57) class458.field6349.method2253(3530);
        if (var2 == null) {
            return null;
        } else {
            class680 var3 = class375.field5418.method2232(var2.field793, -115);
            return var3 != null && var3.field9528 && var3.method3759((byte) -113, class375.field5419) ? var2 : class97.method763(-10100);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBIII)V", line = 37)
    public static final void method4086(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field10195++;
        if (arg2 != -22) {
            return;
        }
        int var6 = class573.method3204(arg1, class523.field7178, arg2 + 124915098, class495.field6845);
        int var7 = class573.method3204(arg0, class523.field7178, arg2 ^ 0xF88DF26E, class495.field6845);
        int var8 = class573.method3204(arg4, class174.field2335, 124915076, class751.field10402);
        int var9 = class573.method3204(arg3, class174.field2335, 124915076, class751.field10402);
        for (int var10 = var6; var10 <= var7; var10++) {
            class138.method1069(class785.field10808[var10], (byte) 94, var8, var9, arg5);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 64)
    public static final void method4087(byte arg0) {
        field10200++;
        if (arg0 >= -44) {
            method4087((byte) 34);
        }
        class253.method1689((byte) -74, false);
        class418.field5996 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class476.field6617.length; var2++) {
            if (class618.field8334[var2] != -1 && class476.field6617[var2] == null) {
                class476.field6617[var2] = class587.field7828.method2095(0, class618.field8334[var2], 1);
                if (class476.field6617[var2] == null) {
                    class418.field5996++;
                    var1 = false;
                }
            }
            if (class366.field5331[var2] != -1 && class73.field1070[var2] == null) {
                class73.field1070[var2] = class587.field7828.method2109(0, class30.field450[var2], class366.field5331[var2], -2);
                if (class73.field1070[var2] == null) {
                    var1 = false;
                    class418.field5996++;
                }
            }
            if (class503.field6969[var2] != -1 && class560.field7531[var2] == null) {
                class560.field7531[var2] = class587.field7828.method2095(0, class503.field6969[var2], 1);
                if (class560.field7531[var2] == null) {
                    class418.field5996++;
                    var1 = false;
                }
            }
            if (class286.field4212[var2] != -1 && class255.field3811[var2] == null) {
                class255.field3811[var2] = class587.field7828.method2095(0, class286.field4212[var2], 1);
                if (class255.field3811[var2] == null) {
                    var1 = false;
                    class418.field5996++;
                }
            }
            if (class103.field1426 != null && class381.field5565[var2] == null && class103.field1426[var2] != -1) {
                class381.field5565[var2] = class587.field7828.method2109(0, class30.field450[var2], class103.field1426[var2], -2);
                if (class381.field5565[var2] == null) {
                    class418.field5996++;
                    var1 = false;
                }
            }
        }
        if (class217.field2906 == null) {
            if (class177.field2370 == null || !class466.field6466.method2098((byte) 73, class177.field2370.field6699 + "_staticelements")) {
                class217.field2906 = new class517(0);
            } else if (class466.field6466.method2110(true, class177.field2370.field6699 + "_staticelements")) {
                class217.field2906 = class244.method1572(class177.field2370.field6699 + "_staticelements", class466.field6466, -109, class196.field2619);
            } else {
                class418.field5996++;
                var1 = false;
            }
        }
        if (!var1) {
            class256.field3835 = 1;
            return;
        }
        class136.field2003 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class476.field6617.length; var4++) {
            byte[] var21 = class73.field1070[var4];
            if (var21 != null) {
                int var22 = (class186.field2487[var4] >> 8) * 64 - class121.field1765;
                int var23 = (class186.field2487[var4] & 0xFF) * 64 - class230.field3147;
                if (class184.field2474 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class400.method2499(var21, var22, class597.field8132, class628.field8800, var23, 0);
            }
            byte[] var24 = class255.field3811[var4];
            if (var24 != null) {
                int var25 = (class186.field2487[var4] >> 8) * 64 - class121.field1765;
                int var26 = (class186.field2487[var4] & 0xFF) * 64 - class230.field3147;
                if (class184.field2474 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class400.method2499(var24, var25, class597.field8132, class628.field8800, var26, 0);
            }
        }
        if (!var3) {
            class256.field3835 = 2;
            return;
        }
        if (class256.field3835 != 0) {
            class660.method3653(class105.field1452, class379.field5542, class7.field76, true, -99, class474.field6551.method2780(100, class38.field589) + "<br>(100%)");
        }
        class230.method1508((byte) -40);
        class772.method4279((byte) -99);
        class733.method4072((byte) 9);
        boolean var5 = false;
        if (class379.field5542.method534() && class712.field9959.field1322.method1363(29) == 2) {
            for (int var6 = 0; var6 < class476.field6617.length; var6++) {
                if (class255.field3811[var6] != null || class560.field7531[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class712.field9959.field1316.method1192(88) == 1) {
            var7 = class183.field2447[class713.field9969];
        } else {
            var7 = class665.field9196[class713.field9969];
        }
        if (class379.field5542.method542()) {
            var7++;
        }
        class54.method395(class379.field5542, class389.field5670, 9, 4, class597.field8132, class628.field8800, var7, var5, class379.field5542.method451() > 0);
        class467.method2761(class731.field10143);
        if (class731.field10143 == 0) {
            class346.method2191(null);
        } else {
            class346.method2191(class541.field7353);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class514.field7038[var8].method2913(2097152);
        }
        class407.method2527(6812);
        class200.method1361(false, -41);
        class642.method3565((byte) 126);
        class296.field4302 = null;
        class93.field1333 = false;
        class230.method1508((byte) -73);
        System.gc();
        class253.method1689((byte) -113, true);
        class774.method4288(-1);
        class34.field557 = class712.field9959.field1319.method2854(49);
        class624.field8385 = class396.field5817 >= 96;
        class669.field9410 = class712.field9959.field1322.method1363(122) == 2;
        class229.field3117 = class712.field9959.field1288.method3327(35) == 1;
        class365.field5314 = class712.field9959.field1320.method4251(95) == 1 ? -1 : class387.field5634;
        class54.field772 = class712.field9959.field1301.method2583(37) == 1;
        class195.field2610 = class712.field9959.field1307.method1209(12) == 1;
        class556.field7502 = new class219(4, class597.field8132, class628.field8800, false);
        if (class184.field2474 == 0) {
            class613.method3383(class476.field6617, class556.field7502, 4128);
        } else {
            class626.method3496(class476.field6617, class556.field7502, (byte) -91);
        }
        class277.method1791(class628.field8800 >> 4, class597.field8132 >> 4, -126);
        class122.method999(1204339692);
        if (var5) {
            class302.method1911(true);
            class467.field6472 = new class219(1, class597.field8132, class628.field8800, true);
            if (class184.field2474 == 0) {
                class613.method3383(class560.field7531, class467.field6472, 4128);
                class253.method1689((byte) -46, true);
            } else {
                class626.method3496(class560.field7531, class467.field6472, (byte) -91);
                class253.method1689((byte) -99, true);
            }
            class467.field6472.method1432(0, class556.field7502.field2897[0], -121);
            class467.field6472.method1427(null, null, -14360, class379.field5542);
            class302.method1911(false);
        }
        class556.field7502.method1427(class514.field7038, var5 ? class467.field6472.field2897 : null, -14360, class379.field5542);
        if (class184.field2474 == 0) {
            class253.method1689((byte) -69, true);
            class737.method4081(class556.field7502, 64, class73.field1070);
            if (class381.field5565 != null) {
                class293.method1854(1);
            }
        } else {
            class253.method1689((byte) -54, true);
            class271.method1762(class556.field7502, -49, class73.field1070);
        }
        class772.method4279((byte) -111);
        if (class396.field5817 < 96) {
            class658.method3647(-70);
        }
        class253.method1689((byte) -119, true);
        class556.field7502.method1426(var5 ? class538.field7317[0] : null, null, 121, class379.field5542);
        class556.field7502.method1438(false, class379.field5542, (byte) 112);
        class253.method1689((byte) -95, true);
        if (var5) {
            class302.method1911(true);
            class253.method1689((byte) -113, true);
            if (class184.field2474 == 0) {
                class737.method4081(class467.field6472, 64, class255.field3811);
            } else {
                class271.method1762(class467.field6472, -88, class255.field3811);
            }
            class772.method4279((byte) -118);
            class253.method1689((byte) -20, true);
            class467.field6472.method1426(null, class412.field5933[0], 119, class379.field5542);
            class467.field6472.method1438(true, class379.field5542, (byte) 106);
            class253.method1689((byte) -102, true);
            class302.method1911(false);
        }
        class777.method4300(-201);
        int var9 = class556.field7502.field2910;
        if (var9 > class610.field8296) {
            var9 = class610.field8296;
        }
        if (class610.field8296 - 1 > var9) {
            var9 = class610.field8296 - 1;
        }
        if (class712.field9959.field1320.method4251(28) == 0) {
            class167.method1202(var9);
        } else {
            class167.method1202(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class597.field8132; var19++) {
                for (int var20 = 0; var20 < class628.field8800; var20++) {
                    class27.method201(124, var20, var10, var19);
                }
            }
        }
        class652.method3627(-4);
        class230.method1508((byte) -98);
        class8.method65(-116);
        class772.method4279((byte) 53);
        class88.method720(-34);
        if (class388.field5642 != null && class457.field6340 != null && class458.field6355 == 11) {
            class754.field10459++;
            class267 var11 = class545.method3099((byte) 87, class269.field3966, class488.field6752);
            var11.field3938.method2354(1057001181, (byte) 116);
            class617.method3392(var11, true);
        }
        if (class184.field2474 == 0) {
            int var12 = (class474.field6604 - (class597.field8132 >> 4)) / 8;
            int var13 = ((class597.field8132 >> 4) + class474.field6604) / 8;
            int var14 = (class351.field5157 - (class628.field8800 >> 4)) / 8;
            int var15 = ((class628.field8800 >> 4) + class351.field5157) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var15 < var17) {
                        class587.field7828.method2102(0, "m" + var16 + "_" + var17);
                        class587.field7828.method2102(0, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class458.field6355 == 4) {
            class300.method1901(3, 2);
        } else if (class458.field6355 == 8) {
            class300.method1901(7, 2);
        } else {
            class300.method1901(10, 2);
            if (class457.field6340 != null) {
                class267 var18 = class545.method3099((byte) 36, class269.field3966, class140.field2044);
                class617.method3392(var18, true);
            }
        }
        class319.method2029(-80);
        class230.method1508((byte) -69);
        class596.method3321(-33);
        class768.field10591 = true;
        if (class650.field9017) {
            class164.method1188((byte) -109, "Took: " + (class302.method1910(0) - class499.field6884) + "ms");
            class650.field9017 = false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;ZB)V", line = 549)
    public static final void method4088(String arg0, boolean arg1, byte arg2) {
        field10196++;
        if (arg0 == null) {
            return;
        }
        if (class5.field54 >= 100) {
            class780.method4307((byte) 63, class474.field6578.method2780(126, class38.field589), 4);
            return;
        }
        String var3 = class194.method1339(18123, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class5.field54; var4++) {
            String var9 = class194.method1339(18123, class255.field3798[var4]);
            if (var9 != null && var9.equals(var3)) {
                class780.method4307((byte) 105, arg0 + class474.field6579.method2780(105, class38.field589), 4);
                return;
            }
            if (class424.field6053[var4] != null) {
                String var10 = class194.method1339(18123, class424.field6053[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class780.method4307((byte) 102, arg0 + class474.field6579.method2780(102, class38.field589), 4);
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg2 < 64) {
            method4089(false, -97);
        }
        while (var5 < class671.field9452) {
            String var7 = class194.method1339(18123, class42.field653[var5]);
            if (var7 != null && var7.equals(var3)) {
                class780.method4307((byte) 111, class474.field6584.method2780(95, class38.field589) + arg0 + class474.field6585.method2780(114, class38.field589), 4);
                return;
            }
            if (class246.field3374[var5] != null) {
                String var8 = class194.method1339(18123, class246.field3374[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class780.method4307((byte) 125, class474.field6584.method2780(87, class38.field589) + arg0 + class474.field6585.method2780(114, class38.field589), 4);
                    return;
                }
            }
            var5++;
        }
        if (class194.method1339(18123, class551.field7456.field1020).equals(var3)) {
            class780.method4307((byte) 50, class474.field6581.method2780(118, class38.field589), 4);
            return;
        }
        class605.field8220++;
        class267 var6 = class545.method3099((byte) 81, class269.field3966, class604.field8205);
        var6.field3938.method2380(65280, class469.method2769(arg0, (byte) 85) + 1);
        var6.field3938.method2349(85, arg0);
        var6.field3938.method2380(65280, arg1 ? 1 : 0);
        class617.method3392(var6, true);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)Lmt;", line = 648)
    public static final class419 method4089(boolean arg0, int arg1) {
        field10197++;
        class419[] var2 = class630.method3537(1807868904);
        if (!arg0) {
            method4088(null, true, (byte) 122);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field6015 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }
}
