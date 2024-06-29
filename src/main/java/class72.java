import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class72 extends class12 {

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "[I")
    public static int[] field1385 = new int[32];

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Lai;")
    public static class10 field1380;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "Lkh;")
    public class117 field1388;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "[Lkh;")
    public class117[] field1386;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
    public static void method509(byte arg0) {
        field1380 = null;
        if (arg0 <= 110) {
            method510(null, 25, null);
        }
        field1385 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lai;ILai;)I")
    public static final int method510(class10 arg0, int arg1, class10 arg2) {
        field1379++;
        int var3 = 0;
        if (arg0.method101(class191.field3403, -2)) {
            var3++;
        }
        if (arg2.method101(class178.field3220, -2)) {
            var3++;
        }
        if (arg2.method101(class111.field2096, -2)) {
            var3++;
        }
        if (arg2.method101(class44.field956, -2)) {
            var3++;
        }
        if (arg2.method101(class96.field1756, -2)) {
            var3++;
        }
        if (arg2.method101(class97.field1783, -2)) {
            var3++;
        }
        arg2.method101(class81.field1538, -2);
        arg2.method101(class60.field1211, -2);
        if (arg1 < 6) {
            return -50;
        } else {
            arg2.method101(class246.field4538, -2);
            arg2.method101(class101.field1843, -2);
            arg2.method101(class101.field1846, -2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method511(int arg0, int arg1) {
        field1382++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class227.field4094[arg0];
        int var3 = class40.field907[arg0];
        int var4 = class194.field3462[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = (int) class84.field1568[arg0];
        long var6 = class84.field1568[arg0];
        if (var4 == 38) {
            class105.field1911.method400(112, 8);
            class105.field1911.method993(false, var2);
            class105.field1911.method1014(var3, -1);
            class105.field1911.method1005(27318, var5);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 120, var3);
            class5.field71++;
            class166.field2999 = var2;
        }
        if (var4 == 45) {
            class181.field3276++;
            class79.method548(var2, var3, var6, (byte) 93);
            class105.field1911.method400(13, 8);
            class105.field1911.method1005(27318, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class105.field1911.method1017(class143.field2591 + var2, false);
            class105.field1911.method1017(class184.field3319 + var3, false);
        }
        if (var4 == 50) {
            class207 var8 = class1.field18[var5];
            if (var8 != null) {
                class169.method1190(var8.field4266[0], 2, 0, false, 0, (byte) 125, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var8.field4259[0], 1, 0);
                class234.field4228++;
                class174.field3131 = 0;
                class145.field2641 = class187.field3353;
                class166.field2997 = 2;
                class137.field2472 = class41.field929;
                class105.field1911.method400(30, 8);
                class105.field1911.method1017(class184.field3309, false);
                class105.field1911.method1014(class60.field1206, -1);
                class105.field1911.method1017(var5, false);
                class105.field1911.method1005(27318, class244.field4497);
            }
        }
        if (var4 == 17) {
            class207 var9 = class1.field18[var5];
            if (var9 != null) {
                class190.field3364++;
                class169.method1190(var9.field4266[0], 2, 0, false, 0, (byte) 108, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var9.field4259[0], 1, 0);
                class174.field3131 = 0;
                class166.field2997 = 2;
                class137.field2472 = class41.field929;
                class145.field2641 = class187.field3353;
                class105.field1911.method400(71, 8);
                class105.field1911.method993(false, var5);
            }
        }
        if (var4 == 1005) {
            class137.field2472 = class41.field929;
            class145.field2641 = class187.field3353;
            class166.field2997 = 2;
            class174.field3131 = 0;
            class105.field1911.method400(191, 8);
            class105.field1911.method993(false, var5);
            class149.field2710++;
        }
        if (var4 == 10) {
            class79.method548(var2, var3, var6, (byte) -107);
            class105.field1911.method400(94, 8);
            class105.field1911.method1046(118, class143.field2591 + var2);
            class147.field2695++;
            class105.field1911.method993(false, var3 + class184.field3319);
            class105.field1911.method1005(27318, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var4 == 57) {
            class156.field2844++;
            boolean var10 = class169.method1190(var3, 2, 0, false, 0, (byte) 115, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var10) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 108, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class145.field2641 = class187.field3353;
            class174.field3131 = 0;
            class137.field2472 = class41.field929;
            class166.field2997 = 2;
            class105.field1911.method400(77, 8);
            class105.field1911.method1005(27318, var5);
            class105.field1911.method1005(27318, var3 + class184.field3319);
            class105.field1911.method993(false, var2 + class143.field2591);
        }
        if (var4 == 7) {
            class105.field1911.method400(4, 8);
            class105.field1911.method993(false, class244.field4497);
            class98.field1803++;
            class105.field1911.method1046(114, var5);
            class105.field1911.method1046(124, class184.field3309);
            class105.field1911.method1014(var3, -1);
            class105.field1911.method1046(113, var2);
            class105.field1911.method1024(-74, class60.field1206);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 119, var3);
            class166.field2999 = var2;
        }
        if (var4 == 3) {
            class9 var12 = class119.method837((byte) 96, var3);
            boolean var13 = true;
            if (var12.field244 > 0) {
                var13 = class5.method39(var12, (byte) -104);
            }
            if (var13) {
                class74.field1400++;
                class105.field1911.method400(109, 8);
                class105.field1911.method1024(-25, var3);
            }
        }
        if (var4 == 2) {
            class105.field1911.method400(160, 8);
            class105.field1911.method1005(27318, var2);
            class159.field2895++;
            class105.field1911.method1040((byte) 105, var3);
            class105.field1911.method1046(112, var5);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 107, var3);
            class166.field2999 = var2;
        }
        if (var4 == 35) {
            class147.field2697++;
            class105.field1911.method400(205, 8);
            class105.field1911.method1017(var5, false);
            class105.field1911.method1046(125, var2);
            class105.field1911.method1013(var3, (byte) -66);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 127, var3);
            class166.field2999 = var2;
        }
        if (var4 == 14) {
            class221.field3982++;
            class79.method548(var2, var3, var6, (byte) 96);
            class105.field1911.method400(53, 8);
            class105.field1911.method993(false, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class105.field1911.method1005(27318, var3 + class184.field3319);
            class105.field1911.method1005(27318, var2 + class143.field2591);
        }
        if (var4 == 41) {
            class207 var14 = class1.field18[var5];
            if (var14 != null) {
                class52.field1072++;
                class169.method1190(var14.field4266[0], 2, 0, false, 0, (byte) 116, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var14.field4259[0], 1, 0);
                class174.field3131 = 0;
                class166.field2997 = 2;
                class145.field2641 = class187.field3353;
                class137.field2472 = class41.field929;
                class105.field1911.method400(145, 8);
                class105.field1911.method1040((byte) 105, class30.field717);
                class105.field1911.method1017(var5, false);
                class105.field1911.method993(false, class105.field1913);
            }
        }
        if (var4 == 1007) {
            class174.field3131 = 0;
            class166.field2997 = 2;
            class122.field2297++;
            class137.field2472 = class41.field929;
            class145.field2641 = class187.field3353;
            class105.field1911.method400(166, 8);
            class105.field1911.method1046(124, var5);
        }
        if (var4 == 42) {
            boolean var15 = class169.method1190(var3, 2, 0, false, 0, (byte) 103, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var15) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 108, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class165.field2990++;
            class145.field2641 = class187.field3353;
            class166.field2997 = 2;
            class137.field2472 = class41.field929;
            class174.field3131 = 0;
            class105.field1911.method400(39, 8);
            class105.field1911.method1017(class143.field2591 + var2, false);
            class105.field1911.method1046(112, var5);
            class105.field1911.method1005(27318, var3 + class184.field3319);
        }
        if (var4 == 15) {
            boolean var17 = class169.method1190(var3, 2, 0, false, 0, (byte) 108, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var17) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 100, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class137.field2472 = class41.field929;
            class208.field3735++;
            class166.field2997 = 2;
            class174.field3131 = 0;
            class145.field2641 = class187.field3353;
            class105.field1911.method400(138, 8);
            class105.field1911.method1046(111, class184.field3319 + var3);
            class105.field1911.method993(false, var5);
            class105.field1911.method1046(119, var2 + class143.field2591);
        }
        if (var4 == 30 && class79.method548(var2, var3, var6, (byte) 94)) {
            class105.field1911.method400(234, 8);
            class12.field387++;
            class105.field1911.method1017((int) (var6 >>> 32) & Integer.MAX_VALUE, false);
            class105.field1911.method1017(class105.field1913, false);
            class105.field1911.method1013(class30.field717, (byte) -118);
            class105.field1911.method1017(var2 + class143.field2591, false);
            class105.field1911.method993(false, class184.field3319 + var3);
        }
        if (var4 == 43) {
            class207 var19 = class1.field18[var5];
            if (var19 != null) {
                class17.field503++;
                class169.method1190(var19.field4266[0], 2, 0, false, 0, (byte) 122, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var19.field4259[0], 1, 0);
                class174.field3131 = 0;
                class137.field2472 = class41.field929;
                class145.field2641 = class187.field3353;
                class166.field2997 = 2;
                class105.field1911.method400(195, 8);
                class105.field1911.method993(false, var5);
            }
        }
        if (var4 == 1) {
            class105.field1911.method400(154, 8);
            class105.field1911.method1024(-97, var3);
            class105.field1911.method1005(27318, var5);
            class177.field3196++;
            class105.field1911.method1005(27318, var2);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 87, var3);
            class166.field2999 = var2;
        }
        if (var4 == 16) {
            class56 var20 = class43.field950[var5];
            if (var20 != null) {
                class169.method1190(var20.field4266[0], 2, 0, false, 0, (byte) 95, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var20.field4259[0], 1, 0);
                class166.field2997 = 2;
                class145.field2641 = class187.field3353;
                class45.field975++;
                class174.field3131 = 0;
                class137.field2472 = class41.field929;
                class105.field1911.method400(204, 8);
                class105.field1911.method1005(27318, var5);
            }
        }
        if (var4 == 39) {
            class207 var21 = class1.field18[var5];
            if (var21 != null) {
                class169.method1190(var21.field4266[0], 2, 0, false, 0, (byte) 100, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var21.field4259[0], 1, 0);
                class207.field3721++;
                class137.field2472 = class41.field929;
                class166.field2997 = 2;
                class174.field3131 = 0;
                class145.field2641 = class187.field3353;
                class105.field1911.method400(78, 8);
                class105.field1911.method1046(109, var5);
            }
        }
        if (var4 == 36) {
            class102.field1862++;
            class79.method548(var2, var3, var6, (byte) -73);
            class105.field1911.method400(169, 8);
            class105.field1911.method993(false, class184.field3319 + var3);
            class105.field1911.method1017(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
            class105.field1911.method1005(27318, class143.field2591 + var2);
        }
        if (var4 == 20) {
            class9 var22 = class101.method686(124, var3, var2);
            if (var22 != null) {
                class75.method527((byte) 65);
                class161.method1147(var3, class181.method1253(class187.method1269(var22, (byte) 16), -76), var2, 122);
                class86.field1623 = 0;
                class38.field878 = class169.method1191((byte) 101, var22);
                if (class38.field878 == null) {
                    class38.field878 = class141.field2567;
                }
                if (var22.field249) {
                    class80.field1509 = class36.method316((byte) -34, new class117[] { var22.field252, class210.field3762 });
                    return;
                }
                class80.field1509 = class36.method316((byte) -34, new class117[] { class217.field3947, var22.field262, class210.field3762 });
            }
            return;
        }
        if (var4 == 33) {
            class105.field1911.method400(196, 8);
            class143.field2592++;
            class105.field1911.method1005(27318, class105.field1913);
            class105.field1911.method1024(-39, class30.field717);
            class105.field1911.method1014(var3, -1);
            class105.field1911.method1046(107, var2);
        }
        if (var4 == 5) {
            class114.field2127++;
            class105.field1911.method400(150, 8);
            class105.field1911.method1013(var3, (byte) -101);
            class105.field1911.method1005(27318, var2);
            class105.field1911.method993(false, var5);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 119, var3);
            class166.field2999 = var2;
        }
        if (var4 == 9) {
            class56 var23 = class43.field950[var5];
            if (var23 != null) {
                class169.method1190(var23.field4266[0], 2, 0, false, 0, (byte) 120, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var23.field4259[0], 1, 0);
                class145.field2641 = class187.field3353;
                class166.field2997 = 2;
                class137.field2472 = class41.field929;
                class26.field657++;
                class174.field3131 = 0;
                class105.field1911.method400(6, 8);
                class105.field1911.method1005(27318, var5);
                class105.field1911.method1046(119, class105.field1913);
                class105.field1911.method1014(class30.field717, -1);
            }
        }
        if (var4 == 58) {
            class105.field1911.method400(55, 8);
            class25.field620++;
            class105.field1911.method1017(var2, false);
            class105.field1911.method1040((byte) 105, var3);
            class105.field1911.method1046(118, var5);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 116, var3);
            class166.field2999 = var2;
        }
        if (var4 == 19) {
            class207 var24 = class1.field18[var5];
            if (var24 != null) {
                class8.field128++;
                class169.method1190(var24.field4266[0], 2, 0, false, 0, (byte) 126, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var24.field4259[0], 1, 0);
                class174.field3131 = 0;
                class145.field2641 = class187.field3353;
                class137.field2472 = class41.field929;
                class166.field2997 = 2;
                class105.field1911.method400(33, 8);
                class105.field1911.method1017(var5, false);
            }
        }
        if (var4 == 44) {
            boolean var25 = class169.method1190(var3, 2, 0, false, 0, (byte) 107, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var25) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 107, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class246.field4522++;
            class137.field2472 = class41.field929;
            class166.field2997 = 2;
            class174.field3131 = 0;
            class145.field2641 = class187.field3353;
            class105.field1911.method400(211, 8);
            class105.field1911.method1005(27318, class143.field2591 + var2);
            class105.field1911.method1017(class184.field3319 + var3, false);
            class105.field1911.method1005(27318, var5);
        }
        if (var4 == 6) {
            class56 var27 = class43.field950[var5];
            if (var27 != null) {
                class43.field953++;
                class169.method1190(var27.field4266[0], 2, 0, false, 0, (byte) 115, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var27.field4259[0], 1, 0);
                class166.field2997 = 2;
                class145.field2641 = class187.field3353;
                class137.field2472 = class41.field929;
                class174.field3131 = 0;
                class105.field1911.method400(214, 8);
                class105.field1911.method1046(116, var5);
            }
        }
        if (var4 == 31) {
            class105.field1911.method400(109, 8);
            class105.field1911.method1024(-45, var3);
            class74.field1400++;
            class9 var28 = class119.method837((byte) 84, var3);
            if (var28.field271 != null && var28.field271[0][0] == 5) {
                int var29 = var28.field271[0][1];
                class141.field2561[var29] = 1 - class141.field2561[var29];
                class216.method1421(var29, 96);
            }
        }
        if (var4 == 29) {
            class56 var30 = class43.field950[var5];
            if (var30 != null) {
                class96.field1768++;
                class169.method1190(var30.field4266[0], 2, 0, false, 0, (byte) 124, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var30.field4259[0], 1, 0);
                class137.field2472 = class41.field929;
                class166.field2997 = 2;
                class174.field3131 = 0;
                class145.field2641 = class187.field3353;
                class105.field1911.method400(118, 8);
                class105.field1911.method1046(107, var5);
            }
        }
        if (var4 == 8) {
            class56 var31 = class43.field950[var5];
            if (var31 != null) {
                class169.method1190(var31.field4266[0], 2, 0, false, 0, (byte) 99, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var31.field4259[0], 1, 0);
                class145.field2641 = class187.field3353;
                class166.field2997 = 2;
                class68.field1305++;
                class174.field3131 = 0;
                class137.field2472 = class41.field929;
                class105.field1911.method400(192, 8);
                class105.field1911.method1046(114, class244.field4497);
                class105.field1911.method1040((byte) 105, class60.field1206);
                class105.field1911.method993(false, class184.field3309);
                class105.field1911.method993(false, var5);
            }
        }
        if (var4 == 24) {
            class194.field3468++;
            class105.field1911.method400(32, 8);
            class105.field1911.method1005(27318, var5);
            class105.field1911.method1024(-121, var3);
            class105.field1911.method1005(27318, var2);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 124, var3);
            class166.field2999 = var2;
        }
        if (var4 == 28) {
            class105.field1911.method400(35, 8);
            class105.field1911.method1005(27318, var5);
            class49.field1018++;
            class105.field1911.method993(false, class105.field1913);
            class105.field1911.method1013(class30.field717, (byte) -124);
            class105.field1911.method1046(123, var2);
            class105.field1911.method1013(var3, (byte) -96);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 115, var3);
            class166.field2999 = var2;
        }
        if (var4 == 32) {
            class56 var32 = class43.field950[var5];
            if (var32 != null) {
                class100.field1824++;
                class169.method1190(var32.field4266[0], 2, 0, false, 0, (byte) 104, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var32.field4259[0], 1, 0);
                class174.field3131 = 0;
                class166.field2997 = 2;
                class137.field2472 = class41.field929;
                class145.field2641 = class187.field3353;
                class105.field1911.method400(151, 8);
                class105.field1911.method993(false, var5);
            }
        }
        if (var4 == 25) {
            class147.field2691++;
            class105.field1911.method400(26, 8);
            class105.field1911.method993(false, var2);
            class105.field1911.method993(false, var5);
            class105.field1911.method1024(-29, var3);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 91, var3);
            class166.field2999 = var2;
        }
        if (var4 == 51) {
            class217.field3943++;
            class105.field1911.method400(251, 8);
            class105.field1911.method993(false, var2);
            class105.field1911.method1046(125, var5);
            class105.field1911.method1024(-94, var3);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 116, var3);
            class166.field2999 = var2;
        }
        if (var4 == 1006) {
            class174.field3131 = 0;
            class145.field2641 = class187.field3353;
            class137.field2472 = class41.field929;
            class166.field2997 = 2;
            class207 var33 = class1.field18[var5];
            if (var33 != null) {
                class109 var34 = var33.field3718;
                if (var34.field2034 != null) {
                    var34 = var34.method733(false);
                }
                if (var34 != null) {
                    class105.field1911.method400(127, 8);
                    class105.field1911.method1017(var34.field2012, false);
                    class161.field2943++;
                }
            }
        }
        if (var4 == 26 && class191.field3407 == null) {
            class4.method30(var3, true, var2);
            class191.field3407 = class101.method686(127, var3, var2);
            class62.method457(class191.field3407, 0);
        }
        if (var4 == 34) {
            class207 var35 = class1.field18[var5];
            if (var35 != null) {
                class169.method1190(var35.field4266[0], 2, 0, false, 0, (byte) 113, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var35.field4259[0], 1, 0);
                class145.field2641 = class187.field3353;
                class166.field2997 = 2;
                class98.field1811++;
                class174.field3131 = 0;
                class137.field2472 = class41.field929;
                class105.field1911.method400(164, 8);
                class105.field1911.method993(false, var5);
            }
        }
        if (var4 == 18) {
            class75.method527((byte) 65);
            class9 var36 = class119.method837((byte) 85, var3);
            class60.field1206 = var3;
            class86.field1623 = 1;
            class184.field3309 = var2;
            class244.field4497 = var5;
            class62.method457(var36, 0);
            class120.field2264 = class36.method316((byte) -34, new class117[] { class237.field4287, class214.method1408((byte) 102, var5).field2812, class210.field3762 });
            if (class120.field2264 == null) {
                class120.field2264 = class179.field3248;
            }
            return;
        }
        if (var4 == 40) {
            class214.field3891++;
            boolean var37 = class169.method1190(var3, 2, 0, false, 0, (byte) 122, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var37) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 99, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class137.field2472 = class41.field929;
            class166.field2997 = 2;
            class174.field3131 = 0;
            class145.field2641 = class187.field3353;
            class105.field1911.method400(84, 8);
            class105.field1911.method993(false, class143.field2591 + var2);
            class105.field1911.method993(false, var5);
            class105.field1911.method1017(class184.field3319 + var3, false);
            class105.field1911.method1040((byte) 105, class30.field717);
            class105.field1911.method1017(class105.field1913, false);
        }
        if (var4 == 4) {
            class56 var39 = class43.field950[var5];
            if (var39 != null) {
                class110.field2071++;
                class169.method1190(var39.field4266[0], 2, 0, false, 0, (byte) 101, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var39.field4259[0], 1, 0);
                class166.field2997 = 2;
                class145.field2641 = class187.field3353;
                class137.field2472 = class41.field929;
                class174.field3131 = 0;
                class105.field1911.method400(47, 8);
                class105.field1911.method1005(27318, var5);
            }
        }
        if (var4 == 23) {
            class218.field3962++;
            boolean var40 = class169.method1190(var3, 2, 0, false, 0, (byte) 107, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var40) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 96, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class137.field2472 = class41.field929;
            class166.field2997 = 2;
            class174.field3131 = 0;
            class145.field2641 = class187.field3353;
            class105.field1911.method400(107, 8);
            class105.field1911.method1017(class184.field3319 + var3, false);
            class105.field1911.method1017(var5, false);
            class105.field1911.method1005(27318, class143.field2591 + var2);
        }
        if (var4 == 1002) {
            class79.method548(var2, var3, var6, (byte) 78);
            class105.field1911.method400(97, 8);
            class218.field3964++;
            class105.field1911.method1005(27318, var3 + class184.field3319);
            class105.field1911.method1005(27318, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class105.field1911.method1017(var2 + class143.field2591, false);
        }
        if (var4 == 48) {
            class56 var42 = class43.field950[var5];
            if (var42 != null) {
                class218.field3967++;
                class169.method1190(var42.field4266[0], 2, 0, false, 0, (byte) 108, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var42.field4259[0], 1, 0);
                class137.field2472 = class41.field929;
                class145.field2641 = class187.field3353;
                class166.field2997 = 2;
                class174.field3131 = 0;
                class105.field1911.method400(161, 8);
                class105.field1911.method1046(116, var5);
            }
        }
        if (var4 == 49 || var4 == 1001) {
            class156.method1109(var3, var2, 120, class56.field1160[arg0], var5);
        }
        int var43 = 65 / ((-arg1 - 60) / 38);
        if (var4 == 1003) {
            class9 var44 = class119.method837((byte) 97, var3);
            if (var44 == null || var44.field189[var2] < 100000) {
                class105.field1911.method400(191, 8);
                class105.field1911.method993(false, var5);
                class149.field2710++;
            } else {
                class14.method129(class169.field3042, class36.method316((byte) -34, new class117[] { class42.method358(var44.field189[var2], (byte) 34), class104.field1907, class214.method1408((byte) 102, var5).field2812 }), 0, 0);
            }
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 98, var3);
            class166.field2999 = var2;
        }
        if (var4 == 37 && class79.method548(var2, var3, var6, (byte) 74)) {
            class105.field1911.method400(170, 8);
            class4.field53++;
            class105.field1911.method1046(107, class184.field3319 + var3);
            class105.field1911.method1024(-124, class60.field1206);
            class105.field1911.method1005(27318, class143.field2591 + var2);
            class105.field1911.method1017(class184.field3309, false);
            class105.field1911.method1046(112, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class105.field1911.method1005(27318, class244.field4497);
        }
        if (var4 == 22) {
            class105.field1911.method400(216, 8);
            class243.field4434++;
            class105.field1911.method1013(var3, (byte) -63);
            class105.field1911.method1017(var2, false);
            class105.field1911.method1005(27318, var5);
            class175.field3169 = 0;
            class115.field2141 = class119.method837((byte) 126, var3);
            class166.field2999 = var2;
        }
        if (var4 == 12) {
            class90.method631(-1);
        }
        if (var4 == 13) {
            class56 var45 = class43.field950[var5];
            if (var45 != null) {
                class14.field438++;
                class169.method1190(var45.field4266[0], 2, 0, false, 0, (byte) 113, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var45.field4259[0], 1, 0);
                class166.field2997 = 2;
                class137.field2472 = class41.field929;
                class145.field2641 = class187.field3353;
                class174.field3131 = 0;
                class105.field1911.method400(114, 8);
                class105.field1911.method993(false, var5);
            }
        }
        if (var4 == 47) {
            class56 var46 = class43.field950[var5];
            if (var46 != null) {
                class169.method1190(var46.field4266[0], 2, 0, false, 0, (byte) 109, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var46.field4259[0], 1, 0);
                class137.field2472 = class41.field929;
                class166.field2997 = 2;
                class145.field2641 = class187.field3353;
                class74.field1408++;
                class174.field3131 = 0;
                class105.field1911.method400(65, 8);
                class105.field1911.method1017(var5, false);
            }
        }
        if (var4 == 11) {
            class3.method25(class203.field3675, var2, var3);
        }
        if (var4 == 21) {
            class74.field1400++;
            class105.field1911.method400(109, 8);
            class105.field1911.method1024(-70, var3);
            class9 var47 = class119.method837((byte) 104, var3);
            if (var47.field271 != null && var47.field271[0][0] == 5) {
                int var48 = var47.field271[0][1];
                if (class141.field2561[var48] != var47.field213[0]) {
                    class141.field2561[var48] = var47.field213[0];
                    class216.method1421(var48, 96);
                }
            }
        }
        if (var4 == 46) {
            class145.field2652++;
            boolean var49 = class169.method1190(var3, 2, 0, false, 0, (byte) 122, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var2, 0, 0);
            if (!var49) {
                class169.method1190(var3, 2, 0, false, 0, (byte) 99, class93.field1712.field4266[0], class93.field1712.field4259[0], 1, var2, 1, 0);
            }
            class145.field2641 = class187.field3353;
            class166.field2997 = 2;
            class137.field2472 = class41.field929;
            class174.field3131 = 0;
            class105.field1911.method400(176, 8);
            class105.field1911.method1017(class184.field3319 + var3, false);
            class105.field1911.method1013(class60.field1206, (byte) -66);
            class105.field1911.method1017(class184.field3309, false);
            class105.field1911.method1005(27318, class143.field2591 + var2);
            class105.field1911.method1005(27318, class244.field4497);
            class105.field1911.method1017(var5, false);
        }
        if (class86.field1623 != 0) {
            class86.field1623 = 0;
            class62.method457(class119.method837((byte) 85, class60.field1206), 0);
        }
        if (class82.field1543) {
            class75.method527((byte) 65);
        }
        if (class115.field2141 != null && class175.field3169 == 0) {
            class62.method457(class115.field2141, 0);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1385[var1] = var0 - 1;
            var0 += var0;
        }
        field1387 = -1;
    }
}
