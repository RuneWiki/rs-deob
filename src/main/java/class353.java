import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class353 {

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "Lfba;")
    private class348 field5225 = new class348(64);

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Lla;")
    public class423 field5223;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "Lla;")
    private class423 field5220;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Llc;")
    public static class435 field5219 = new class435(35, 7);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)V")
    public final void method2244(int arg0, byte arg1) {
        class348 var3 = this.field5225;
        synchronized (this.field5225) {
            this.field5225.method2207(arg0, 1);
            if (arg1 <= 41) {
                this.method2244(3, (byte) -42);
            }
        }
        field5226++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public final void method2245(byte arg0) {
        if (arg0 != -100) {
            this.field5225 = null;
        }
        field5215++;
        class348 var2 = this.field5225;
        synchronized (this.field5225) {
            this.field5225.method2219(arg0 ^ 0x14D0);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
    public static final void method2246(boolean arg0) {
        field5222++;
        class243.field3580.method3301(1, 24, class243.field3580.field7964);
        class243.field3580.method3301(1, 24, class243.field3580.field8002);
        class243.field3580.method3301(2, 24, class243.field3580.field7998);
        class243.field3580.method3301(2, 24, class243.field3580.field7986);
        class243.field3580.method3301(1, 24, class243.field3580.field7996);
        class243.field3580.method3301(1, 24, class243.field3580.field7972);
        class243.field3580.method3301(1, 24, class243.field3580.field7966);
        class243.field3580.method3301(1, 24, class243.field3580.field8006);
        class243.field3580.method3301(1, 24, class243.field3580.field7994);
        class243.field3580.method3301(1, 24, class243.field3580.field8007);
        class243.field3580.method3301(1, 24, class243.field3580.field8008);
        class243.field3580.method3301(1, 24, class243.field3580.field7991);
        class243.field3580.method3301(0, 24, class243.field3580.field8001);
        class243.field3580.method3301(1, 24, class243.field3580.field8005);
        class243.field3580.method3301(0, 24, class243.field3580.field8015);
        class243.field3580.method3301(0, 24, class243.field3580.field8017);
        class243.field3580.method3301(1, 24, class243.field3580.field7973);
        class243.field3580.method3301(0, 24, class243.field3580.field7974);
        class243.field3580.method3301(0, 24, class243.field3580.field8011);
        class551.method3320(arg0);
        class243.field3580.method3301(1, 24, class243.field3580.field7983);
        class243.field3580.method3301(3, 24, class243.field3580.field7990);
        class181.method1284(-98);
        class728.method4065(-1386);
        class567.field8205 = arg0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public final void method2247(int arg0) {
        class348 var2 = this.field5225;
        synchronized (this.field5225) {
            this.field5225.method2220(false);
        }
        field5217++;
        if (arg0 != 30158) {
            method2249(-3);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
    public static final boolean method2248(int arg0, int arg1, int arg2) {
        field5218++;
        if (arg2 == -12647) {
            return (arg1 & 0x100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
    public static final void method2249(int arg0) {
        field5216++;
        if (class326.field4421 > 1) {
            class590.field8390 = class152.field2225;
            class326.field4421--;
        }
        if (class298.field4067) {
            class298.field4067 = false;
            class125.method878(true);
            return;
        }
        if (!class147.field2154) {
            class423.method2601(-29372);
        }
        for (int var1 = 0; var1 < 100 && class708.method3963(0); var1++) {
        }
        if (class369.field5392 != 10) {
            return;
        }
        while (class91.method709(57)) {
            class88 var2 = class448.method2741((byte) 78, class236.field3526, class583.field8319);
            var2.field1260.method2881(0, (byte) 123);
            int var3 = var2.field1260.field6864;
            class165.method1181(var2.field1260, (byte) 108);
            var2.field1260.method2879(var2.field1260.field6864 - var3, -1);
            class523.method3183(var2, (byte) 31);
        }
        if (class269.field3820 == null) {
            if (class191.field2695 <= class465.method2818(255)) {
                class269.field3820 = class601.field8528.method4030((byte) -112, class214.field3215.field7468);
            }
        } else if (class269.field3820.field9520 != -1) {
            class88 var4 = class448.method2741((byte) 61, class582.field8312, class583.field8319);
            var4.field1260.method2862(class269.field3820.field9520, -1166933656);
            class523.method3183(var4, (byte) 31);
            class269.field3820 = null;
            class191.field2695 = class465.method2818(255) + 30000L;
        }
        class553 var5 = (class553) class466.field6643.method3565(113);
        if (var5 != null || class465.method2818(255) - 2000L > class721.field10149) {
            class88 var6 = null;
            int var7 = 0;
            for (class553 var8 = (class553) class119.field1634.method3565(118); var8 != null && (var6 == null || var6.field1260.field6864 - var7 < 240); var8 = (class553) class119.field1634.method3561((byte) 110)) {
                var8.method2656((byte) 118);
                int var9 = var8.method761(false);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method760(124);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class177.field2472 != var10 || class26.field241 != var9) {
                    if (var6 == null) {
                        class67.field1034++;
                        var6 = class448.method2741((byte) 35, class619.field8815, class583.field8319);
                        var6.field1260.method2881(0, (byte) 121);
                        var7 = var6.field1260.field6864;
                    }
                    int var11 = var10 - class177.field2472;
                    class177.field2472 = var10;
                    int var12 = var9 - class26.field241;
                    class26.field241 = var9;
                    int var13 = (int) ((var8.method763(-25909) - class721.field10149) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field1260.method2862((var13 << 12) + (var11 << 6) + var12, -1166933656);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field1260.method2881(var13 + 128, (byte) 111);
                        var12 += 128;
                        var6.field1260.method2862((var11 << 8) + var12, -1166933656);
                    } else if (var13 >= 32) {
                        var6.field1260.method2862(var13 + 57344, -1166933656);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1260.method2926((byte) -123, Integer.MIN_VALUE);
                        } else {
                            var6.field1260.method2926((byte) -119, var10 | var9 << 16);
                        }
                    } else {
                        var6.field1260.method2881(var13 + 192, (byte) 121);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1260.method2926((byte) -125, Integer.MIN_VALUE);
                        } else {
                            var6.field1260.method2926((byte) -118, var10 | var9 << 16);
                        }
                    }
                    class721.field10149 = var8.method763(-25909);
                }
            }
            if (var6 != null) {
                var6.field1260.method2879(var6.field1260.field6864 - var7, -1);
                class523.method3183(var6, (byte) 31);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method763(-25909) - class135.field1854) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class135.field1854 = var5.method763(-25909);
            int var16 = var5.method761(false);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method760(123);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method762(-4) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class560.field8126++;
            class88 var20 = class448.method2741((byte) 54, class558.field8105, class583.field8319);
            var20.field1260.method2905(var17 | var16 << 16, 1859553720);
            var20.field1260.method2863(var19 | var18 << 15, (byte) 31);
            class523.method3183(var20, (byte) 31);
        }
        if (class147.field2140 > 0) {
            class346.field4894++;
            class88 var21 = class448.method2741((byte) 75, class194.field2848, class583.field8319);
            var21.field1260.method2881(class147.field2140 * 3, (byte) 109);
            for (int var22 = 0; var22 < class147.field2140; var22++) {
                class462 var23 = class4.field31[var22];
                long var24 = (var23.method2801(8458) - class517.field7453) / 50L;
                class517.field7453 = var23.method2801(8458);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field1260.method2881(var23.method2800((byte) -110), (byte) 113);
                var21.field1260.method2862((int) var24, -1166933656);
            }
            class523.method3183(var21, (byte) 31);
        }
        if (class541.field7856 > 0) {
            class541.field7856--;
        }
        if (class275.field3877 && class541.field7856 <= 0) {
            class541.field7856 = 20;
            class411.field5864++;
            class275.field3877 = false;
            class88 var26 = class448.method2741((byte) 111, class194.field2844, class583.field8319);
            var26.field1260.method2887((int) class680.field9668 >> 3, (byte) -76);
            var26.field1260.method2863((int) class112.field1584 >> 3, (byte) 57);
            class523.method3183(var26, (byte) 31);
        }
        if (class240.field3557 != class146.field2108) {
            class53.field835++;
            class146.field2108 = class240.field3557;
            class88 var27 = class448.method2741((byte) 103, class596.field8475, class583.field8319);
            var27.field1260.method2881(class240.field3557 ? 1 : 0, (byte) 112);
            class523.method3183(var27, (byte) 31);
        }
        if (!class713.field10057) {
            class120.field1643++;
            class88 var28 = class448.method2741((byte) 37, class732.field10253, class583.field8319);
            var28.field1260.method2881(0, (byte) 122);
            int var29 = var28.field1260.field6864;
            class479 var30 = class243.field3580.method3305((byte) -113);
            var28.field1260.method2898(0, var30.field6800, (byte) -118, var30.field6864);
            var28.field1260.method2879(var28.field1260.field6864 - var29, -1);
            class523.method3183(var28, (byte) 31);
            class713.field10057 = true;
        }
        if (class565.field8185 != null) {
            if (class165.field2351 == 2) {
                class426.method2649(-856408925);
            } else if (class165.field2351 == 3) {
                class215.method1522((byte) 93);
            }
        }
        if (class675.field9608) {
            class675.field9608 = false;
        } else {
            class201.field2980 /= 2.0F;
        }
        if (class509.field7380) {
            class509.field7380 = false;
        } else {
            class112.field1579 /= 2.0F;
        }
        class593.method3481(-29149);
        if (class369.field5392 != 10) {
            return;
        }
        class32.method168(-4897);
        class507.method3095((byte) 1);
        class669.method3818(-128);
        class671.field9570++;
        if (class671.field9570 > 750) {
            class125.method878(true);
            return;
        }
        class176.method1269(26017);
        class376.method2332(0);
        class469.method2833(true);
        for (int var31 = class226.field3372.method8((byte) 4, true); var31 != -1; var31 = class226.field3372.method8((byte) 4, false)) {
            class475.method2848((byte) -60, var31);
            class192.field2700[class368.method2314(class513.field7436++, 31)] = var31;
        }
        for (class503 var32 = class611.method3554((byte) 124); var32 != null; var32 = class611.method3554((byte) 53)) {
            int var33 = var32.method3077((byte) -55);
            int var34 = var32.method3079(false);
            if (var33 == 1) {
                class541.field7855[var34] = var32.field7310;
                class577.field8287 |= class525.field7633[var34];
                class490.field7056[class368.method2314(31, class634.field8947++)] = var34;
            } else if (var33 == 2) {
                class556.field8082[var34] = var32.field7314;
                class259.field3704[class368.method2314(class311.field4206++, 31)] = var34;
            } else if (var33 == 3) {
                class146 var58 = class250.method1689(var34, false);
                if (!var32.field7314.equals(var58.field2090)) {
                    var58.field2090 = var32.field7314;
                    class401.method2439(1723, var58);
                }
            } else if (var33 == 4) {
                class146 var54 = class250.method1689(var34, false);
                int var55 = var32.field7310;
                int var56 = var32.field7312;
                int var57 = var32.field7313;
                if (var54.field2015 != var55 || var54.field2125 != var56 || var54.field2000 != var57) {
                    var54.field2000 = var57;
                    var54.field2125 = var56;
                    var54.field2015 = var55;
                    class401.method2439(1723, var54);
                }
            } else if (var33 == 5) {
                class146 var35 = class250.method1689(var34, false);
                if (var32.field7310 != var35.field2062 || var32.field7310 == -1) {
                    var35.field2070 = 1;
                    var35.field2007 = 0;
                    var35.field1986 = 0;
                    var35.field2062 = var32.field7310;
                    class131 var36 = var35.field2062 == -1 ? null : class610.field8698.method2999(var35.field2062, false);
                    if (var36 != null) {
                        class348.method2217(256, var36, var35.field1986);
                    }
                    class401.method2439(1723, var35);
                }
            } else if (var33 == 6) {
                int var48 = var32.field7310;
                int var49 = (var48 & 0x7F59) >> 10;
                int var50 = (var48 & 0x3E3) >> 5;
                int var51 = var48 & 0x1F;
                int var52 = (var50 << 11) + (var49 << 19) + (var51 << 3);
                class146 var53 = class250.method1689(var34, false);
                if (var53.field2013 != var52) {
                    var53.field2013 = var52;
                    class401.method2439(1723, var53);
                }
            } else if (var33 == 7) {
                class146 var37 = class250.method1689(var34, false);
                boolean var38 = var32.field7310 == 1;
                if (var37.field2116 != var38) {
                    var37.field2116 = var38;
                    class401.method2439(1723, var37);
                }
            } else if (var33 == 8) {
                class146 var39 = class250.method1689(var34, false);
                if (var32.field7310 != var39.field2132 || var32.field7312 != var39.field2083 || var32.field7313 != var39.field2105) {
                    var39.field2105 = var32.field7313;
                    var39.field2083 = var32.field7312;
                    var39.field2132 = var32.field7310;
                    if (var39.field2131 != -1) {
                        if (var39.field2012 > 0) {
                            var39.field2105 = var39.field2105 * 32 / var39.field2012;
                        } else if (var39.field2091 > 0) {
                            var39.field2105 = var39.field2105 * 32 / var39.field2091;
                        }
                    }
                    class401.method2439(1723, var39);
                }
            } else if (var33 == 9) {
                class146 var47 = class250.method1689(var34, false);
                if (var32.field7310 != var47.field2131 || var32.field7312 != var47.field2020) {
                    var47.field2131 = var32.field7310;
                    var47.field2020 = var32.field7312;
                    class401.method2439(1723, var47);
                }
            } else if (var33 == 10) {
                class146 var40 = class250.method1689(var34, false);
                if (var32.field7310 != var40.field1995 || var32.field7312 != var40.field2066 || var32.field7313 != var40.field2038) {
                    var40.field1995 = var32.field7310;
                    var40.field2038 = var32.field7313;
                    var40.field2066 = var32.field7312;
                    class401.method2439(1723, var40);
                }
            } else if (var33 == 11) {
                class146 var41 = class250.method1689(var34, false);
                var41.field1992 = var41.field2014 = var32.field7312;
                var41.field2129 = 0;
                var41.field2103 = var41.field2026 = var32.field7310;
                var41.field2092 = 0;
                class401.method2439(1723, var41);
            } else if (var33 == 12) {
                class146 var45 = class250.method1689(var34, false);
                int var46 = var32.field7310;
                if (var45 != null && var45.field2112 == 0) {
                    if (var46 > var45.field1973 - var45.field1997) {
                        var46 = var45.field1973 - var45.field1997;
                    }
                    if (var46 < 0) {
                        var46 = 0;
                    }
                    if (var45.field1970 != var46) {
                        var45.field1970 = var46;
                        class401.method2439(1723, var45);
                    }
                }
            } else if (var33 == 14) {
                class146 var42 = class250.method1689(var34, false);
                var42.field2117 = var32.field7310;
            } else if (var33 == 15) {
                class545.field7931 = var32.field7310;
                class126.field1745 = true;
                class455.field6488 = var32.field7312;
            } else if (var33 == 16) {
                class146 var44 = class250.method1689(var34, false);
                var44.field2002 = var32.field7310;
            } else if (var33 == 17) {
                class146 var43 = class250.method1689(var34, false);
                var43.field2124 = var32.field7310;
            }
        }
        class731.field10244++;
        if (class133.field1842 != 0) {
            class568.field8210 += 20;
            if (class568.field8210 >= 400) {
                class133.field1842 = 0;
            }
        }
        if (class560.field8128 != null) {
            class499.field7169++;
            if (class499.field7169 >= 15) {
                class401.method2439(1723, class560.field8128);
                class560.field8128 = null;
            }
        }
        class344.field4731 = null;
        class601.field8527 = false;
        class753.field10505 = false;
        class66.field1022 = null;
        class512.method3115(-1, null, -1, false);
        class303.method1893(0, null, -1, -1);
        if (!class549.field7997) {
            class548.field7953 = -1;
        }
        class202.method1434(-1);
        class152.field2225++;
        if (class252.field3647) {
            class348.field5152++;
            class88 var59 = class448.method2741((byte) 66, class243.field3579, class583.field8319);
            var59.field1260.method2927((byte) -54, class517.field7447 << 14 | class695.field9832 << 28 | class556.field8084);
            class523.method3183(var59, (byte) 31);
            class252.field3647 = false;
        }
        while (true) {
            class362 var60;
            class146 var61;
            class146 var62;
            do {
                var60 = (class362) class99.field1438.method3563(0);
                if (var60 == null) {
                    while (true) {
                        class362 var63;
                        class146 var64;
                        class146 var65;
                        do {
                            var63 = (class362) class535.field7779.method3563(0);
                            if (var63 == null) {
                                while (true) {
                                    class362 var66;
                                    class146 var67;
                                    class146 var68;
                                    do {
                                        var66 = (class362) class441.field6290.method3563(0);
                                        if (var66 == null) {
                                            if (class344.field4731 == null) {
                                                class520.field7494 = 0;
                                            }
                                            if (class131.field1810 != null) {
                                                class752.method4187(0);
                                            }
                                            if (class598.field8507 > 0 && class253.field3661.method2780(82, 116) && class253.field3661.method2780(81, 89) && class428.field6170 != 0) {
                                                int var69 = class108.field1536.field3920 - class428.field6170;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class619.method3592(class108.field1536.field4645[0] + class71.field1085, var69, class108.field1536.field4646[0] + class41.field693, -41);
                                            }
                                            class750.method4182((byte) 106);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class408.field5805[var70]++;
                                            }
                                            if (class577.field8287 && (class465.method2818(255) - 60000L) > class549.field8013) {
                                                class424.method2627(false);
                                            }
                                            for (class161 var71 = (class161) class286.field3978.method1527(103); var71 != null; var71 = (class161) class286.field3978.method1523(true)) {
                                                if ((class465.method2818(255) / 1000L - 5L) > ((long) var71.field2312)) {
                                                    if (var71.field2310 > 0) {
                                                        class145.method1013(var71.field2309 + class608.field8639.method3543(-24350, class45.field748), (byte) 105, "", 5, 0, "", "");
                                                    }
                                                    if (var71.field2310 == 0) {
                                                        class145.method1013(var71.field2309 + class608.field8640.method3543(-24350, class45.field748), (byte) -47, "", 5, 0, "", "");
                                                    }
                                                    var71.method814(71);
                                                }
                                            }
                                            class233.field3503++;
                                            if (class233.field3503 > 500) {
                                                class233.field3503 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x4) == 4) {
                                                    class157.field2255 += class362.field5301;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class504.field7332 += class288.field3996;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class261.field3711 += class385.field5576;
                                                }
                                            }
                                            if (class504.field7332 < -50) {
                                                class288.field3996 = 2;
                                            }
                                            if (class261.field3711 < -55) {
                                                class385.field5576 = 2;
                                            }
                                            if (class504.field7332 > 50) {
                                                class288.field3996 = -2;
                                            }
                                            if (class157.field2255 < -40) {
                                                class362.field5301 = 1;
                                            }
                                            if (class261.field3711 > 55) {
                                                class385.field5576 = -2;
                                            }
                                            class388.field5605++;
                                            if (class157.field2255 > 40) {
                                                class362.field5301 = -1;
                                            }
                                            if (class388.field5605 > 500) {
                                                class388.field5605 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x1) == 1) {
                                                    class225.field3350 += class250.field3636;
                                                }
                                                if ((var73 & 0x2) == 2) {
                                                    class17.field162 += class77.field1111;
                                                }
                                            }
                                            if (class225.field3350 < -60) {
                                                class250.field3636 = 2;
                                            }
                                            if (class17.field162 < -20) {
                                                class77.field1111 = 1;
                                            }
                                            if (class225.field3350 > 60) {
                                                class250.field3636 = -2;
                                            }
                                            if (class17.field162 > 10) {
                                                class77.field1111 = -1;
                                            }
                                            class512.field7418++;
                                            if (class512.field7418 > 50) {
                                                class342.field4691++;
                                                class88 var74 = class448.method2741((byte) 104, class148.field2161, class583.field8319);
                                                class523.method3183(var74, (byte) 31);
                                            }
                                            if (class348.field5154) {
                                                class259.method1722(19581);
                                                class348.field5154 = false;
                                            }
                                            int var75 = 39 / ((-arg0 - 22) / 44);
                                            try {
                                                class521.method3165((byte) 93);
                                                return;
                                            } catch (IOException var76) {
                                                class125.method878(true);
                                                return;
                                            }
                                        }
                                        var67 = var66.field5304;
                                        if (var67.field2010 < 0) {
                                            break;
                                        }
                                        var68 = class250.method1689(var67.field2109, false);
                                    } while (var68 == null || var68.field2019 == null || var67.field2010 >= var68.field2019.length || var68.field2019[var67.field2010] != var67);
                                    class529.method3207(var66);
                                }
                            }
                            var64 = var63.field5304;
                            if (var64.field2010 < 0) {
                                break;
                            }
                            var65 = class250.method1689(var64.field2109, false);
                        } while (var65 == null || var65.field2019 == null || var64.field2010 >= var65.field2019.length || var65.field2019[var64.field2010] != var64);
                        class529.method3207(var63);
                    }
                }
                var61 = var60.field5304;
                if (var61.field2010 < 0) {
                    break;
                }
                var62 = class250.method1689(var61.field2109, false);
            } while (var62 == null || var62.field2019 == null || var62.field2019.length <= var61.field2010 || var62.field2019[var61.field2010] != var61);
            class529.method3207(var60);
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(Z)V")
    public static void method2250(boolean arg0) {
        if (arg0) {
            method2248(26, 57, -79);
        }
        field5219 = null;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)V")
    public static final void method2251(byte arg0) {
        field5224++;
        if (class519.field7479 != null) {
            return;
        }
        class519.field7479 = new int[65536];
        if (arg0 <= 97) {
            return;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3DD) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - var6 * var8;
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + ((var33 << 8) + var34);
            class519.field7479[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)Lor;")
    public final class325 method2252(int arg0, int arg1) {
        field5214++;
        class348 var3 = this.field5225;
        class325 var4;
        synchronized (this.field5225) {
            var4 = (class325) this.field5225.method2216(arg0 ^ arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field5220;
        byte[] var6;
        synchronized (this.field5220) {
            var6 = this.field5220.method2600(arg0 + Integer.MIN_VALUE, 3, arg1);
        }
        class325 var7 = new class325();
        var7.field4414 = this;
        if (var6 != null) {
            var7.method2005(false, new class479(var6));
        }
        class348 var8 = this.field5225;
        synchronized (this.field5225) {
            this.field5225.method2213((byte) -16, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lip;I)Ljava/lang/String;")
    public static final String method2253(class304 arg0, int arg1) {
        if (arg1 < 111) {
            field5219 = null;
        }
        field5221++;
        if (arg0.field4160 == null || arg0.field4160.length() == 0) {
            return arg0.field4158 == null || arg0.field4158.length() <= 0 ? arg0.field4151 : arg0.field4151 + class608.field8652.method3543(-24350, class45.field748) + arg0.field4158;
        } else if (arg0.field4158 == null || arg0.field4158.length() <= 0) {
            return arg0.field4151 + class608.field8652.method3543(-24350, class45.field748) + arg0.field4160;
        } else {
            return arg0.field4151 + class608.field8652.method3543(-24350, class45.field748) + arg0.field4158 + class608.field8652.method3543(-24350, class45.field748) + arg0.field4160;
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lmp;ILla;Lla;)V")
    public class353(class315 arg0, int arg1, class423 arg2, class423 arg3) {
        this.field5223 = arg3;
        this.field5220 = arg2;
        this.field5220.method2616(3, 0);
    }
}
