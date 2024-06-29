import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class234 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field3219 = -9017772;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3224 = 0;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static volatile int field3221 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "[[[Le;")
    public static class96[][][] field3225;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method1267(byte arg0) {
        if (arg0 > -61) {
            field3225 = null;
        }
        field3225 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Z")
    public static final boolean method1268(byte arg0, int arg1) {
        field3223++;
        if (arg0 > -113) {
            field3221 = -120;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method1269(int arg0) {
        field3220++;
        class109.method577(false, 116);
        class319.field4257 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class295.field4011.length; var2++) {
            if (class452.field6576[var2] != -1 && class295.field4011[var2] == null) {
                class295.field4011[var2] = class371.field5195.method1687(0, class452.field6576[var2], 255);
                if (class295.field4011[var2] == null) {
                    class319.field4257++;
                    var1 = false;
                }
            }
            if (class248.field3340[var2] != -1 && class105.field1293[var2] == null) {
                class105.field1293[var2] = class371.field5195.method1678(0, (byte) 113, class248.field3340[var2], class432.field6336[var2]);
                if (class105.field1293[var2] == null) {
                    class319.field4257++;
                    var1 = false;
                }
            }
            if (class110.field1363[var2] != -1 && class65.field681[var2] == null) {
                class65.field681[var2] = class371.field5195.method1687(0, class110.field1363[var2], 255);
                if (class65.field681[var2] == null) {
                    var1 = false;
                    class319.field4257++;
                }
            }
            if (class405.field5893[var2] != -1 && class297.field4042[var2] == null) {
                class297.field4042[var2] = class371.field5195.method1687(0, class405.field5893[var2], 255);
                if (class297.field4042[var2] == null) {
                    var1 = false;
                    class319.field4257++;
                }
            }
            if (class296.field4037 != null && class140.field1796[var2] == null && class296.field4037[var2] != -1) {
                class140.field1796[var2] = class371.field5195.method1678(0, (byte) 123, class296.field4037[var2], class432.field6336[var2]);
                if (class140.field1796[var2] == null) {
                    var1 = false;
                    class319.field4257++;
                }
            }
        }
        if (class448.field6516 == null) {
            if (class441.field6439 == null || !class183.field2329.method1681(101, class441.field6439.field2258 + "_staticelements")) {
                class448.field6516 = new class10(0);
            } else if (class183.field2329.method1690(class441.field6439.field2258 + "_staticelements", (byte) -112)) {
                class448.field6516 = class122.method651(class441.field6439.field2258 + "_staticelements", class183.field2329, -111, class21.field210);
            } else {
                var1 = false;
                class319.field4257++;
            }
        }
        if (!var1) {
            class270.field3661 = 1;
        } else if (arg0 < -87) {
            boolean var3 = true;
            class424.field6223 = 0;
            for (int var4 = 0; var4 < class295.field4011.length; var4++) {
                byte[] var20 = class105.field1293[var4];
                if (var20 != null) {
                    int var21 = (class138.field1777[var4] >> 8) * 64 - class70.field767;
                    int var22 = (class138.field1777[var4] & 0xFF) * 64 - class291.field3961;
                    if (class398.field5748) {
                        var22 = 10;
                        var21 = 10;
                    }
                    var3 &= class74.method418(var21, 26482, var20, var22);
                }
                byte[] var23 = class297.field4042[var4];
                if (var23 != null) {
                    int var24 = (class138.field1777[var4] >> 8) * 64 - class70.field767;
                    int var25 = (class138.field1777[var4] & 0xFF) * 64 - class291.field3961;
                    if (class398.field5748) {
                        var25 = 10;
                        var24 = 10;
                    }
                    var3 &= class74.method418(var24, 26482, var23, var25);
                }
            }
            if (var3) {
                if (class270.field3661 != 0) {
                    class88.method484(class105.field1296, 0, class337.field4499 + "<br>(100%)", true);
                }
                class449.method2771(-32);
                class80.method443(23574);
                boolean var5 = false;
                if (class88.field1003.method1632() && class29.field278) {
                    for (int var6 = 0; var6 < class295.field4011.length; var6++) {
                        if (class297.field4042[var6] != null || class65.field681[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class264.field3609) {
                    var7 = class130.field1672[class374.field5263];
                } else {
                    var7 = class374.field5267[class374.field5263];
                }
                if (class88.field1003.method1563()) {
                    var7++;
                }
                class2.method8(4, class315.field4214, class340.field4549, var7, var5, class88.field1003.method1590() > 0);
                for (int var8 = 0; var8 < 4; var8++) {
                    class36.field352[var8].method2704(0);
                }
                class87.method476(-31154);
                class291.method1717(-116, false);
                class106.method563(-123);
                class449.method2771(-32);
                System.gc();
                class109.method577(true, 109);
                class296.method1738((byte) 110, 4);
                int[][] var9 = null;
                if (!class398.field5748) {
                    class385.method2391(-128, false);
                    class243.method1301(class427.field6264.field6119[0] >> 3, class427.field6264.field6109[0] >> 3, 0);
                    class419.method2604((byte) 41);
                    class199.method1067(class88.field1003, false, (int[][]) null, true, 4);
                    var9 = class432.field6340[0];
                    class109.method577(true, 66);
                    class177.method932((byte) -95, false);
                    if (class140.field1796 != null) {
                        class53.method264((byte) 8);
                    }
                }
                if (class398.field5748) {
                    class65.method372(false, false);
                    class243.method1301(class427.field6264.field6119[0] >> 3, class427.field6264.field6109[0] >> 3, 0);
                    class419.method2604((byte) 41);
                    class199.method1067(class88.field1003, false, (int[][]) null, true, 4);
                    var9 = class432.field6340[0];
                    class109.method577(true, 120);
                    class231.method1255(false, false);
                }
                class80.method443(23574);
                class109.method577(true, 93);
                class368.method2230(false, -105, class88.field1003, (class54) null, class36.field352, 4);
                class327.method1876(4, class88.field1003, 25418);
                class109.method577(true, 120);
                int var10 = class297.field4045;
                if (class263.field3592 < var10) {
                    var10 = class263.field3592;
                }
                if (var10 < class263.field3592 - 1) {
                    var10 = class263.field3592 - 1;
                }
                if (class138.method758(-10762)) {
                    class51.method245(0);
                } else {
                    class51.method245(var10);
                }
                class199.method1070(32452);
                if (var5) {
                    class335.method1918(true);
                    class296.method1738((byte) 110, 1);
                    if (!class398.field5748) {
                        class385.method2391(-70, true);
                        class199.method1067(class88.field1003, true, var9, true, 1);
                        class109.method577(true, 77);
                        class177.method932((byte) -95, true);
                        class327.method1876(1, class88.field1003, 25418);
                    }
                    if (class398.field5748) {
                        class65.method372(true, false);
                        class199.method1067(class88.field1003, true, var9, true, 1);
                        class109.method577(true, 65);
                        class231.method1255(false, true);
                    }
                    class80.method443(23574);
                    class109.method577(true, 87);
                    class368.method2230(true, 123, class88.field1003, class272.field3682[0], class36.field352, 1);
                    class327.method1876(1, class88.field1003, 25418);
                    class109.method577(true, 102);
                    class199.method1070(32452);
                    class335.method1918(false);
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    for (int var18 = 0; var18 < class315.field4214; var18++) {
                        for (int var19 = 0; var19 < class340.field4549; var19++) {
                            class292.method1721(var18, var19, var11, 72);
                        }
                    }
                }
                class352.method2158((byte) -42);
                class449.method2771(-32);
                class345.method2014(-80);
                class80.method443(23574);
                class115.field1434 = false;
                class198.method1065(4095);
                if (class213.field2888 != null && class264.field3605 != null && class129.field1664 == 25) {
                    class318.field4236++;
                    class281.field3857.method295(20579, 128);
                    class281.field3857.method1357(1057001181, 1826838072);
                }
                if (!class398.field5748) {
                    int var12 = (class296.field4016 - (class315.field4214 >> 4)) / 8;
                    int var13 = ((class315.field4214 >> 4) + class296.field4016) / 8;
                    int var14 = (class242.field3289 - (class340.field4549 >> 4)) / 8;
                    int var15 = ((class340.field4549 >> 4) + class242.field3289) / 8;
                    for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                        for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                            if (var12 > var16 || var16 > var13 || var17 < var14 || var15 < var17) {
                                class371.field5195.method1683((byte) 62, "m" + var16 + "_" + var17);
                                class371.field5195.method1683((byte) 62, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (class129.field1664 == 28) {
                    class352.method2159(10, (byte) 65);
                } else {
                    class352.method2159(30, (byte) 65);
                    if (class264.field3605 != null) {
                        class281.field3857.method295(20579, 47);
                    }
                }
                class34.method162((byte) -60);
                class449.method2771(-32);
                class167.method890(-26008);
            } else {
                class270.field3661 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public static final void method1270(byte arg0) {
        class114 var1 = class414.field5971;
        synchronized (class414.field5971) {
            class414.field5971.method613(true);
        }
        int var2 = 58 / ((arg0 + 34) / 46);
        field3222++;
    }
}
