import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class138 extends class54 {

    @OriginalMember(owner = "client!di", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field1649 = new String[] { method1188(method1187("mM\"2U")), method1188(method1187("mM\"<U")), method1188(method1187("mM\";U")), method1188(method1187("r\n\"T\u0000")), method1188(method1187("gQ`\u0016")), method1188(method1187("mM\"9U")), method1188(method1187("mM\"?U")), method1188(method1187("mM\"8U")), method1188(method1187("mM\"3U")), method1188(method1187("mM\"=U")), method1188(method1187("mM\"7U")), method1188(method1187("mM\">U")) };

    @OriginalMember(owner = "client!di", name = "w", descriptor = "Lel;")
    public static class573 field1643 = new class573(83, 6);

    @OriginalMember(owner = "client!di", name = "z", descriptor = "I")
    public static int field1645 = 0;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[[I")
    public static int[][] field1648 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1647;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[[[I")
    public static int[][][] field1642;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(Z)V", line = 6)
    public static final void method1181(boolean arg0) {
        try {
            ++field1635;
            if (class533.field7812 > 1) {
                --class533.field7812;
                class40.field473 = class28.field349;
            }
            if (class248.field3876) {
                class248.field3876 = false;
                class95.method805(7);
            } else {
                if (!class216.field3297) {
                    class258.method2180(true);
                }
                for (int var1 = 0; var1 < 100 && class372.method2999((byte) -51); ++var1) {
                }
                if (field1645 == 10) {
                    while (class318.method2688(true)) {
                        class280 var2 = class610.method4508(class90.field1029, class279.field4190, (byte) 106);
                        var2.field4197.method1428((byte) -24, 0);
                        int var3 = var2.field4197.field2201;
                        class528.method3989(0, var2.field4197);
                        var2.field4197.method1467(var2.field4197.field2201 - var3, (byte) 95);
                        class106.method934((byte) 53, var2);
                    }
                    if (class785.field11442 != null) {
                        if (~class785.field11442.field5069 != 0) {
                            class280 var4 = class610.method4508(class224.field3435, class279.field4190, (byte) -66);
                            var4.field4197.method1406(class785.field11442.field5069, 380332136);
                            class106.method934((byte) 53, var4);
                            class785.field11442 = null;
                            class778.field11310 = 30000L + class430.method3299(76);
                        }
                    } else if (~class778.field11310 >= ~class430.method3299(71)) {
                        class785.field11442 = class624.field9131.method3918(false, class54.field592.field250);
                    }
                    class394 var5 = (class394) class417.field6150.method3863((byte) 64);
                    if (var5 != null || class430.method3299(92) - 2000L > class568.field8407) {
                        class280 var6 = null;
                        int var7 = 0;
                        for (class394 var8 = (class394) class118.field1405.method3863((byte) 64); var8 != null && (var6 == null || -var7 + var6.field4197.field2201 < 240); var8 = (class394) class118.field1405.method3862(-353)) {
                            var8.method1824(1);
                            int var9 = var8.method2177((byte) 107);
                            if (~var9 <= 0) {
                                if (var9 > 65534) {
                                    var9 = 65534;
                                }
                            } else {
                                var9 = -1;
                            }
                            int var10 = var8.method2178(false);
                            if (~var10 <= 0) {
                                if (~var10 < -65535) {
                                    var10 = 65534;
                                }
                            } else {
                                var10 = -1;
                            }
                            if (~class217.field3327 != ~var10 || class60.field633 != var9) {
                                if (var6 == null) {
                                    ++class36.field409;
                                    var6 = class610.method4508(class196.field2626, class279.field4190, (byte) -116);
                                    var6.field4197.method1428((byte) -24, 0);
                                    var7 = var6.field4197.field2201;
                                }
                                int var11 = -class217.field3327 + var10;
                                class217.field3327 = var10;
                                int var12 = -class60.field633 + var9;
                                class60.field633 = var9;
                                int var13 = (int) ((var8.method2176(-96) - class568.field8407) / 20L);
                                if (~var13 > -9 && var11 >= -32 && var11 <= 31 && ~var12 <= 31 && var12 <= 31) {
                                    var12 += 32;
                                    var11 += 32;
                                    var6.field4197.method1406((var13 << 12) - -(var11 << 6) + var12, 380332136);
                                } else if (~var13 > -33 && ~var11 <= 127 && var11 <= 127 && ~var12 <= 127 && ~var12 >= -128) {
                                    var11 += 128;
                                    var6.field4197.method1428((byte) -24, var13 + 128);
                                    var12 += 128;
                                    var6.field4197.method1406((var11 << 8) + var12, 380332136);
                                } else if (var13 >= 32) {
                                    var6.field4197.method1406(57344 - -var13, 380332136);
                                    if (var10 != 1 && ~var9 != 0) {
                                        var6.field4197.method1412(true, var10 | var9 << 16);
                                    } else {
                                        var6.field4197.method1412(true, Integer.MIN_VALUE);
                                    }
                                } else {
                                    var6.field4197.method1428((byte) -24, var13 + 192);
                                    if (var10 != 1 && ~var9 != 0) {
                                        var6.field4197.method1412(true, var9 << 16 | var10);
                                    } else {
                                        var6.field4197.method1412(true, Integer.MIN_VALUE);
                                    }
                                }
                                class568.field8407 = var8.method2176(-115);
                            }
                        }
                        if (var6 != null) {
                            var6.field4197.method1467(-var7 + var6.field4197.field2201, (byte) -99);
                            class106.method934((byte) 53, var6);
                        }
                    }
                    if (var5 != null) {
                        long var14 = (var5.method2176(-79) - class711.field10314) / 50L;
                        if (var14 > 32767L) {
                            var14 = 32767L;
                        }
                        class711.field10314 = var5.method2176(-76);
                        int var16 = var5.method2177((byte) 107);
                        if (~var16 > -1) {
                            var16 = 0;
                        } else if (~var16 < -65536) {
                            var16 = 65535;
                        }
                        int var17 = var5.method2178(false);
                        if (var17 < 0) {
                            var17 = 0;
                        } else if (var17 > 65535) {
                            var17 = 65535;
                        }
                        byte var18 = 0;
                        if (~var5.method2182((byte) 117) == -3) {
                            var18 = 1;
                        }
                        ++class669.field9720;
                        int var19 = (int) var14;
                        class280 var20 = class610.method4508(class209.field3201, class279.field4190, (byte) 125);
                        var20.field4197.method1418((byte) -99, var18 << 15 | var19);
                        var20.field4197.method1416(-2804, var16 << 16 | var17);
                        class106.method934((byte) 53, var20);
                    }
                    if (class275.field4156 > 0) {
                        ++class598.field8802;
                        class280 var21 = class610.method4508(class58.field619, class279.field4190, (byte) 71);
                        var21.field4197.method1428((byte) -24, class275.field4156 * 3);
                        for (int var22 = 0; ~var22 > ~class275.field4156; ++var22) {
                            class462 var23 = class709.field10273[var22];
                            long var24 = (var23.method3519(-4881) + -class363.field5567) / 50L;
                            class363.field5567 = var23.method3519(-4881);
                            if (~var24 < -65536L) {
                                var24 = 65535L;
                            }
                            var21.field4197.method1428((byte) -24, var23.method3520((byte) 113));
                            var21.field4197.method1406((int) var24, 380332136);
                        }
                        class106.method934((byte) 53, var21);
                    }
                    if (~class629.field9200 < -1) {
                        --class629.field9200;
                    }
                    if (class597.field8773 && class629.field9200 <= 0) {
                        ++class291.field4320;
                        class629.field9200 = 20;
                        class597.field8773 = false;
                        class280 var26 = class610.method4508(class519.field7609, class279.field4190, (byte) -107);
                        var26.field4197.method1446((int) class377.field5748 >> 3, (byte) 98);
                        var26.field4197.method1440((int) class98.field1099 >> 3, (byte) -35);
                        class106.method934((byte) 53, var26);
                    }
                    if (!class377.field5750 == class168.field2309) {
                        ++class711.field10315;
                        class168.field2309 = class377.field5750;
                        class280 var27 = class610.method4508(class711.field10304, class279.field4190, (byte) -101);
                        var27.field4197.method1428((byte) -24, class377.field5750 ? 1 : 0);
                        class106.method934((byte) 53, var27);
                    }
                    if (!class28.field344) {
                        ++class737.field10727;
                        class280 var28 = class610.method4508(class365.field5584, class279.field4190, (byte) -82);
                        var28.field4197.method1428((byte) -24, 0);
                        int var29 = var28.field4197.field2201;
                        class163 var30 = class289.field4305.method658(12);
                        var28.field4197.method1454(var30.field2201, 0, var30.field2209, (byte) 84);
                        var28.field4197.method1467(-var29 + var28.field4197.field2201, (byte) 88);
                        class106.method934((byte) 53, var28);
                        class28.field344 = true;
                    }
                    if (class734.field10683 != null) {
                        if (~class185.field2559 != -3) {
                            if (~class185.field2559 == -4) {
                                class93.method794(76);
                            }
                        } else {
                            class283.method2316(true);
                        }
                    }
                    if (!class752.field10948) {
                        class459.field6688 /= 2.0F;
                    } else {
                        class752.field10948 = false;
                    }
                    if (class540.field7914) {
                        class540.field7914 = false;
                    } else {
                        class402.field5996 /= 2.0F;
                    }
                    class448.method3450(-1);
                    if (~field1645 == -11) {
                        class420.method3253(1776);
                        class371.method2993((byte) -52);
                        class200.method1792(!arg0);
                        ++class180.field2497;
                        if (class180.field2497 > 750) {
                            class95.method805(7);
                        } else {
                            class355.method2910(0);
                            class329.method2783((byte) 14);
                            class473.method3594(0);
                            for (int var31 = class276.field4168.method5133(true, 21279); ~var31 != 0; var31 = class276.field4168.method5133(false, 21279)) {
                                class202.method1802(var31, -111);
                                class209.field3206[class291.method2359(31, class320.field5060++)] = var31;
                            }
                            for (class313 var32 = class461.method3512(0); var32 != null; var32 = class461.method3512(0)) {
                                int var33 = var32.method2637(!arg0);
                                long var34 = var32.method2638(255);
                                if (var33 != 1) {
                                    if (~var33 == -3) {
                                        class8.field86[(int) var34] = var32.field4956;
                                        class279.field4186[class291.method2359(class708.field10262++, 31)] = (int) var34;
                                    } else if (var33 == 3) {
                                        class541 var36 = class461.method3513((int) var34, 122);
                                        if (!var32.field4956.equals(var36.field8069)) {
                                            var36.field8069 = var32.field4956;
                                            class115.method1013(true, var36);
                                        }
                                    } else if (~var33 != -5) {
                                        if (~var33 == -6) {
                                            class541 var37 = class461.method3513((int) var34, 109);
                                            if (var32.field4951 != var37.field8057 || var32.field4951 == -1) {
                                                var37.field8010 = 1;
                                                var37.field7951 = 0;
                                                var37.field8057 = var32.field4951;
                                                var37.field7944 = 0;
                                                class344 var38 = ~var37.field8057 != 0 ? class272.field4122.method2242(var37.field8057, 100) : null;
                                                if (var38 != null) {
                                                    class570.method4261(var37.field7944, (byte) 121, var38);
                                                }
                                                class115.method1013(true, var37);
                                            }
                                        } else if (var33 == 6) {
                                            int var39 = var32.field4951;
                                            int var40 = 31 & var39 >> 10;
                                            int var41 = var39 >> 5 & 31;
                                            int var42 = 31 & var39;
                                            int var43 = (var41 << 11) + ((var40 << 19) - -(var42 << 3));
                                            class541 var44 = class461.method3513((int) var34, 113);
                                            if (~var44.field8025 != ~var43) {
                                                var44.field8025 = var43;
                                                class115.method1013(true, var44);
                                            }
                                        } else if (var33 == 7) {
                                            class541 var45 = class461.method3513((int) var34, 116);
                                            boolean var46 = ~var32.field4951 == -2;
                                            if (var45.field8011 == !var46) {
                                                var45.field8011 = var46;
                                                class115.method1013(arg0, var45);
                                            }
                                        } else if (~var33 == -9) {
                                            class541 var47 = class461.method3513((int) var34, 125);
                                            if (~var32.field4951 != ~var47.field8076 || ~var32.field4958 != ~var47.field8043 || var32.field4952 != var47.field8007) {
                                                var47.field8076 = var32.field4951;
                                                var47.field8007 = var32.field4952;
                                                var47.field8043 = var32.field4958;
                                                if (var47.field8100 != -1) {
                                                    if (var47.field8039 <= 0) {
                                                        if (var47.field8097 > 0) {
                                                            var47.field8007 = var47.field8007 * 32 / var47.field8097;
                                                        }
                                                    } else {
                                                        var47.field8007 = var47.field8007 * 32 / var47.field8039;
                                                    }
                                                }
                                                class115.method1013(arg0, var47);
                                            }
                                        } else if (~var33 == -10) {
                                            class541 var48 = class461.method3513((int) var34, 121);
                                            if (~var32.field4951 != ~var48.field8100 || ~var32.field4958 != ~var48.field8004) {
                                                var48.field8100 = var32.field4951;
                                                var48.field8004 = var32.field4958;
                                                class115.method1013(true, var48);
                                            }
                                        } else if (~var33 != -11) {
                                            if (var33 != 11) {
                                                if (var33 != 12) {
                                                    if (~var33 == -15) {
                                                        class541 var49 = class461.method3513((int) var34, 123);
                                                        var49.field8063 = var32.field4951;
                                                    } else if (~var33 != -16) {
                                                        if (var33 != 16) {
                                                            if (~var33 != -18) {
                                                                if (var33 != 18) {
                                                                    if (~var33 == -20) {
                                                                        class541 var50 = class461.method3513((int) var34, 122);
                                                                        int var51 = (int) (var34 >> 32);
                                                                        var50.method4095((short) var32.field4951, var51, 0, (short) var32.field4958);
                                                                    }
                                                                } else {
                                                                    class541 var52 = class461.method3513((int) var34, 118);
                                                                    int var53 = (int) (var34 >> 32);
                                                                    var52.method4085(-21730, (short) var32.field4958, var53, (short) var32.field4951);
                                                                }
                                                            } else {
                                                                class541 var54 = class461.method3513((int) var34, 117);
                                                                var54.field7966 = var32.field4951;
                                                            }
                                                        } else {
                                                            class541 var55 = class461.method3513((int) var34, 117);
                                                            var55.field7992 = var32.field4951;
                                                        }
                                                    } else {
                                                        class492.field7065 = var32.field4951;
                                                        class649.field9397 = true;
                                                        class153.field1893 = var32.field4958;
                                                    }
                                                } else {
                                                    class541 var56 = class461.method3513((int) var34, 126);
                                                    int var57 = var32.field4951;
                                                    if (var56 != null && ~var56.field8042 == -1) {
                                                        if (~var57 < ~(-var56.field8045 + var56.field8090)) {
                                                            var57 = -var56.field8045 + var56.field8090;
                                                        }
                                                        if (var57 < 0) {
                                                            var57 = 0;
                                                        }
                                                        if (var56.field7957 != var57) {
                                                            var56.field7957 = var57;
                                                            class115.method1013(true, var56);
                                                        }
                                                    }
                                                }
                                            } else {
                                                class541 var58 = class461.method3513((int) var34, 119);
                                                var58.field7971 = 0;
                                                var58.field8013 = var58.field8056 = var32.field4958;
                                                var58.field8019 = var58.field8016 = var32.field4951;
                                                var58.field8051 = 0;
                                                class115.method1013(true, var58);
                                            }
                                        } else {
                                            class541 var59 = class461.method3513((int) var34, 110);
                                            if (var32.field4951 != var59.field7967 || var32.field4958 != var59.field7931 || ~var32.field4952 != ~var59.field7964) {
                                                var59.field7967 = var32.field4951;
                                                var59.field7964 = var32.field4952;
                                                var59.field7931 = var32.field4958;
                                                class115.method1013(true, var59);
                                            }
                                        }
                                    } else {
                                        class541 var60 = class461.method3513((int) var34, 122);
                                        int var61 = var32.field4951;
                                        int var62 = var32.field4958;
                                        int var63 = var32.field4952;
                                        if (~var60.field8012 != ~var61 || ~var60.field7979 != ~var62 || ~var60.field7981 != ~var63) {
                                            var60.field7979 = var62;
                                            var60.field8012 = var61;
                                            var60.field7981 = var63;
                                            class115.method1013(true, var60);
                                        }
                                    }
                                } else {
                                    class86.field960[(int) var34] = var32.field4951;
                                    class39.field457 |= class199.field3112[(int) var34];
                                    class541.field7990[class291.method2359(31, class433.field6365++)] = (int) var34;
                                }
                            }
                            ++class327.field5158;
                            if (~class245.field3753 != -1) {
                                class382.field5791 += 20;
                                if (~class382.field5791 <= -401) {
                                    class245.field3753 = 0;
                                }
                            }
                            if (class181.field2504 != null) {
                                ++class770.field11157;
                                if (~class770.field11157 <= -16) {
                                    class115.method1013(arg0, class181.field2504);
                                    class181.field2504 = null;
                                }
                            }
                            class677.field9834 = null;
                            class67.field705 = null;
                            class177.field2460 = false;
                            class199.field3115 = false;
                            class156.method1315(-1, -10213, (class541) null, -1);
                            class50.method385(-1, -1, (class541) null, (byte) 89);
                            if (!class728.field10555) {
                                class311.field4926 = -1;
                            }
                            class200.method1791(arg0);
                            ++class28.field349;
                            if (class22.field257) {
                                ++class211.field3234;
                                class280 var64 = class610.method4508(class783.field11410, class279.field4190, (byte) 122);
                                var64.field4197.method1416(-2804, class616.field9056 | class569.field8416 << 14 | class339.field5283 << 28);
                                class106.method934((byte) 53, var64);
                                class22.field257 = false;
                            }
                            while (true) {
                                class86 var65;
                                class541 var66;
                                class541 var67;
                                do {
                                    var65 = (class86) class295.field4349.method3875(75);
                                    if (var65 == null) {
                                        while (true) {
                                            class86 var68;
                                            class541 var69;
                                            class541 var70;
                                            do {
                                                var68 = (class86) class610.field8911.method3875(-122);
                                                if (var68 == null) {
                                                    while (true) {
                                                        class86 var71;
                                                        class541 var72;
                                                        class541 var73;
                                                        do {
                                                            var71 = (class86) class749.field10905.method3875(-62);
                                                            if (var71 == null) {
                                                                if (class67.field705 == null) {
                                                                    class537.field7852 = 0;
                                                                }
                                                                if (class69.field740 != null) {
                                                                    class708.method5164((byte) -94);
                                                                }
                                                                if (~class757.field10995 < -1 && class597.field8749.method89(!arg0, 82) && class597.field8749.method89(false, 81) && ~class166.field2291 != -1) {
                                                                    int var74 = class225.field3446.field6200 - class166.field2291;
                                                                    if (var74 >= 0) {
                                                                        if (~var74 < -4) {
                                                                            var74 = 3;
                                                                        }
                                                                    } else {
                                                                        var74 = 0;
                                                                    }
                                                                    class385.method3075(1, var74, class225.field3446.field3863[0] + class281.field4219, class225.field3446.field3859[0] + class494.field7101);
                                                                }
                                                                class415.method3224((byte) 119);
                                                                for (int var75 = 0; var75 < 5; ++var75) {
                                                                    int var10002 = class656.field9473[var75]++;
                                                                }
                                                                if (class39.field457 && ~class683.field9904 > ~(class430.method3299(92) + -60000L)) {
                                                                    class457.method3489(-28016);
                                                                }
                                                                for (class75 var76 = (class75) class254.field3944.method4538(false); var76 != null; var76 = (class75) class254.field3944.method4543(0)) {
                                                                    if ((long) var76.field869 < -5L + class430.method3299(88) / 1000L) {
                                                                        if (var76.field866 > 0) {
                                                                            class150.method1265("", var76.field868 + class309.field4866.method2616(false, class167.field2300), -1, "", 0, 5, "");
                                                                        }
                                                                        if (var76.field866 == 0) {
                                                                            class150.method1265("", var76.field868 + class309.field4867.method2616(false, class167.field2300), -1, "", 0, 5, "");
                                                                        }
                                                                        var76.method4696(-119);
                                                                    }
                                                                }
                                                                ++class540.field7917;
                                                                if (~class540.field7917 < -501) {
                                                                    class540.field7917 = 0;
                                                                    int var77 = (int) (Math.random() * 8.0D);
                                                                    if ((2 & var77) == 2) {
                                                                        class304.field4752 += class756.field10988;
                                                                    }
                                                                    if (~(var77 & 4) == -5) {
                                                                        class446.field6544 += class617.field9071;
                                                                    }
                                                                    if (~(1 & var77) == -2) {
                                                                        class227.field3469 += class324.field5124;
                                                                    }
                                                                }
                                                                if (class227.field3469 < -50) {
                                                                    class324.field5124 = 2;
                                                                }
                                                                if (class227.field3469 > 50) {
                                                                    class324.field5124 = -2;
                                                                }
                                                                if (~class304.field4752 > 54) {
                                                                    class756.field10988 = 2;
                                                                }
                                                                if (class304.field4752 > 55) {
                                                                    class756.field10988 = -2;
                                                                }
                                                                if (~class446.field6544 > 39) {
                                                                    class617.field9071 = 1;
                                                                }
                                                                if (~class446.field6544 < -41) {
                                                                    class617.field9071 = -1;
                                                                }
                                                                ++class287.field4267;
                                                                if (class287.field4267 > 500) {
                                                                    class287.field4267 = 0;
                                                                    int var78 = (int) (8.0D * Math.random());
                                                                    if ((var78 & 2) == 2) {
                                                                        class681.field9866 += class16.field199;
                                                                    }
                                                                    if ((1 & var78) == 1) {
                                                                        class550.field8201 += class639.field9288;
                                                                    }
                                                                }
                                                                if (class550.field8201 < -60) {
                                                                    class639.field9288 = 2;
                                                                }
                                                                if (~class681.field9866 > 19) {
                                                                    class16.field199 = 1;
                                                                }
                                                                if (class550.field8201 > 60) {
                                                                    class639.field9288 = -2;
                                                                }
                                                                if (~class681.field9866 < -11) {
                                                                    class16.field199 = -1;
                                                                }
                                                                ++class157.field1961;
                                                                if (~class157.field1961 < -51) {
                                                                    ++class375.field5713;
                                                                    class280 var79 = class610.method4508(class179.field2490, class279.field4190, (byte) 32);
                                                                    class106.method934((byte) 53, var79);
                                                                }
                                                                if (class534.field7820) {
                                                                    class596.method4435(1);
                                                                    class534.field7820 = false;
                                                                }
                                                                try {
                                                                    class443.method3401(-1);
                                                                    return;
                                                                } catch (IOException var81) {
                                                                    class95.method805(7);
                                                                    return;
                                                                }
                                                            }
                                                            var72 = var71.field959;
                                                            if (~var72.field7999 > -1) {
                                                                break;
                                                            }
                                                            var73 = class461.method3513(var72.field8079, 126);
                                                        } while (var73 == null || var73.field7945 == null || var73.field7945.length <= var72.field7999 || var73.field7945[var72.field7999] != var72);
                                                        class782.method5663(var71);
                                                    }
                                                }
                                                var69 = var68.field959;
                                                if (var69.field7999 < 0) {
                                                    break;
                                                }
                                                var70 = class461.method3513(var69.field8079, 122);
                                            } while (var70 == null || var70.field7945 == null || var70.field7945.length <= var69.field7999 || var70.field7945[var69.field7999] != var69);
                                            class782.method5663(var68);
                                        }
                                    }
                                    var66 = var65.field959;
                                    if (var66.field7999 < 0) {
                                        break;
                                    }
                                    var67 = class461.method3513(var66.field8079, 109);
                                } while (var67 == null || var67.field7945 == null || ~var67.field7945.length >= ~var66.field7999 || var67.field7945[var66.field7999] != var66);
                                class782.method5663(var65);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var82) {
            throw class759.method5498(var82, field1649[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)I", line = 903)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                field1647 = null;
            }
            ++field1638;
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1649[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V", line = 914)
    public final void method115(boolean arg0) {
        try {
            if (!arg0) {
                field1648 = null;
            }
            if (super.field589.method653(24915) != class243.field3725) {
                super.field593 = 1;
            } else if (super.field589.method656(true)) {
                super.field593 = 0;
            }
            ++field1637;
            if (~super.field593 != -1 && super.field593 != 1) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1649[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)Lnl;", line = 938)
    public static final class577 method1182(int arg0, int arg1) {
        try {
            ++field1641;
            class577 var2 = (class577) class113.field1335.method1558((byte) 96, (long) arg0);
            if (var2 != null) {
                return var2;
            } else if (arg1 >= -44) {
                return null;
            } else {
                byte[] var3 = class470.field6832.method3632(0, arg0, -119);
                class577 var4 = new class577();
                if (var3 != null) {
                    var4.method4310(arg0, new class163(var3), -6753);
                }
                class113.field1335.method1556((long) arg0, var4, 1);
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1649[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V", line = 962)
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 == 0) {
                ++field1644;
                super.field593 = arg1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1649[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(IB)I", line = 973)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                return -127;
            } else {
                ++field1639;
                if (super.field589.method653(24915) == class243.field3725) {
                    if (super.field589.method656(true)) {
                        return 3;
                    } else {
                        return ~arg0 != -1 && super.field589.field806.method5516(false) != 1 ? 2 : 1;
                    }
                } else {
                    return 3;
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1649[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(Z)V", line = 997)
    public static void method1183(boolean arg0) {
        try {
            field1647 = null;
            field1643 = null;
            field1642 = null;
            field1648 = null;
            if (!arg0) {
                method1181(true);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1649[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lhia;)V", line = 1011)
    public class138(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(ILhia;)V", line = 1014)
    public class138(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(Z)I", line = 1020)
    public final int method1184(boolean arg0) {
        try {
            ++field1640;
            if (arg0) {
                this.method111(true);
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1649[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)Z", line = 1037)
    public final boolean method1185(int arg0) {
        try {
            ++field1646;
            if (arg0 != -10243) {
                return true;
            } else if (super.field589.method653(24915) == class243.field3725) {
                return !super.field589.method656(true);
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1649[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ld;IILjava/awt/Canvas;I)Lha;", line = 1060)
    public static final class66 method1186(class160 arg0, int arg1, int arg2, Canvas arg3, int arg4) {
        try {
            ++field1636;
            if (arg2 != 6) {
                method1186((class160) null, 44, 98, (Canvas) null, -89);
            }
            return new class576(arg3, arg0, arg4, arg1);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1649[5] + (arg0 != null ? field1649[3] : field1649[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1649[3] : field1649[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1187(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 125);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!di", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1188(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
