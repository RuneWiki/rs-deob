import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class347 extends class234 implements class467 {

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FIIIIIII[FFI)V")
    public static final void method2174(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float[] arg8, float arg9, int arg10) {
        field5084++;
        int var11 = arg1 - arg5;
        int var12 = arg7 - arg3;
        int var13 = arg6 - arg2;
        float var14 = arg8[2] * (float) var13 + arg8[1] * (float) var12 + arg8[0] * (float) var11;
        float var15 = arg8[5] * (float) var13 + arg8[4] * (float) var12 + arg8[3] * (float) var11;
        if (arg4 != 4825) {
            return;
        }
        float var16 = arg8[8] * (float) var13 + arg8[6] * (float) var11 + arg8[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg0 != 1.0F) {
            var17 = arg0 * var17;
        }
        float var18 = var15 + arg9 + 0.5F;
        if (arg10 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg10 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg10 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class353.field5157 = var18;
        class680.field9670 = var17;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Z")
    public final boolean method1021(boolean arg0) {
        field5078++;
        return arg0 ? super.method1021(arg0) : true;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public final void method1022(byte arg0) {
        field5085++;
        super.method1022(arg0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method1025(boolean arg0, byte arg1) {
        if (arg1 == 67) {
            field5086++;
            return super.method1025(arg0, (byte) 67);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
    public static final void method2175(int arg0) {
        field5081++;
        if (class412.field5780 > 1) {
            class451.field6151 = class141.field1800;
            class412.field5780--;
        }
        if (class367.field5274) {
            class367.field5274 = false;
            class537.method3032((byte) 99);
            return;
        }
        if (!class483.field6542) {
            class142.method975((byte) -110);
        }
        for (int var1 = 0; var1 < 100 && class110.method589(-32543); var1++) {
        }
        if (class476.field6436 != 10) {
            return;
        }
        class52.method297(39, class618.field8402.method2356(96), class253.field3491);
        if (class335.field4940 == null) {
            if (class46.field626 <= class669.method3713(0)) {
                class335.field4940 = class237.field3082.method1840(class79.field1002.field9560, (byte) -124);
            }
        } else if (class335.field4940.field1204 != -1) {
            class389.method2326((byte) 118, class440.field6060);
            class253.field3491.method915(class335.field4940.field1204, arg0 + 1502220314);
            class335.field4940 = null;
            class46.field626 = class669.method3713(arg0 ^ 0x56AE) + 30000L;
        }
        class8 var2 = (class8) class690.field9744.method374((byte) 51);
        if (var2 != null || class525.field7267 < class669.method3713(0) - 2000L) {
            boolean var3 = false;
            int var4 = class253.field3491.field1745;
            for (class8 var5 = (class8) class443.field6114.method374((byte) 55); var5 != null && class253.field3491.field1745 - var4 < 240; var5 = (class8) class443.field6114.method372(-20740)) {
                var5.method175(30604);
                int var6 = var5.method49((byte) -31);
                if (var6 < -1) {
                    var6 = -1;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method51(arg0 ^ 0x56AF);
                if (var7 < -1) {
                    var7 = -1;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                if (class529.field7326 != var7 || class426.field5923 != var6) {
                    if (!var3) {
                        class145.field1840++;
                        class389.method2326((byte) 118, class278.field3754);
                        class253.field3491.method951((byte) -82, 0);
                        var4 = class253.field3491.field1745;
                        var3 = true;
                    }
                    int var8 = var7 - class529.field7326;
                    class529.field7326 = var7;
                    int var9 = var6 - class426.field5923;
                    class426.field5923 = var6;
                    int var10 = (int) ((var5.method50(arg0 ^ 0x56D1) - class525.field7267) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class253.field3491.method915((var8 << 6) + (var10 << 12) + var9, 1502242504);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var8 += 128;
                        var9 += 128;
                        class253.field3491.method951((byte) -82, var10 + 128);
                        class253.field3491.method915((var8 << 8) + var9, 1502242504);
                    } else if (var10 < 32) {
                        class253.field3491.method951((byte) -82, var10 + 192);
                        if (var7 == 1 || var6 == -1) {
                            class253.field3491.method906(-1, Integer.MIN_VALUE);
                        } else {
                            class253.field3491.method906(-1, var7 | var6 << 16);
                        }
                    } else {
                        class253.field3491.method915(var10 + 57344, 1502242504);
                        if (var7 == 1 || var6 == -1) {
                            class253.field3491.method906(-1, Integer.MIN_VALUE);
                        } else {
                            class253.field3491.method906(arg0 - 22191, var6 << 16 | var7);
                        }
                    }
                    class525.field7267 = var5.method50(arg0 ^ 0x56DB);
                }
            }
            if (var3) {
                class253.field3491.method901(-12951, class253.field3491.field1745 - var4);
            }
        }
        if (var2 != null) {
            long var11 = (var2.method50(100) - class18.field163) / 50L;
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            class18.field163 = var2.method50(125);
            int var13 = var2.method49((byte) -31);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = var2.method51(1);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var2.method57((byte) -44) == 2) {
                var15 = 1;
            }
            class144.field1825++;
            int var16 = (int) var11;
            class389.method2326((byte) 118, class22.field213);
            class253.field3491.method896(1464076016, var16 | var15 << 15);
            class253.field3491.method917((byte) -44, var13 << 16 | var14);
        }
        if (class410.field5757 > 0) {
            class389.method2326((byte) 118, class7.field62);
            class149.field1876++;
            class253.field3491.method951((byte) -82, class410.field5757 * 3);
            for (int var17 = 0; var17 < class410.field5757; var17++) {
                class136 var18 = class223.field2879[var17];
                long var19 = (var18.method102((byte) 123) - class65.field863) / 50L;
                class65.field863 = var18.method102((byte) 106);
                if (var19 > 65535L) {
                    var19 = 65535L;
                }
                class253.field3491.method951((byte) -82, var18.method97(false));
                class253.field3491.method915((int) var19, 1502242504);
            }
        }
        if (class227.field2973 > 0) {
            class227.field2973--;
        }
        if (class308.field4137 && class227.field2973 <= 0) {
            class308.field4137 = false;
            class227.field2973 = 20;
            class176.field2211++;
            class389.method2326((byte) 118, class452.field6175);
            class253.field3491.method915((int) class283.field3826 >> 3, 1502242504);
            class253.field3491.method927((int) class620.field8432 >> 3, 255);
        }
        if (class594.field8144 && !class100.field1215) {
            class100.field1215 = true;
            class422.field5879++;
            class389.method2326((byte) 118, class227.field2977);
            class253.field3491.method951((byte) -82, 1);
        }
        if (!class594.field8144 && class100.field1215) {
            class100.field1215 = false;
            class422.field5879++;
            class389.method2326((byte) 118, class227.field2977);
            class253.field3491.method951((byte) -82, 0);
        }
        if (!class665.field9426) {
            class389.method2326((byte) 118, class109.field1310);
            class640.field8728++;
            class253.field3491.method951((byte) -82, 0);
            int var21 = class253.field3491.field1745;
            class138 var22 = new class138(class635.method3464(arg0 - 37385));
            class72.field935.method2690(var22, (byte) 56);
            class253.field3491.method955(var22.field1745, 0, 29986, var22.field1712);
            class253.field3491.method901(-12951, class253.field3491.field1745 - var21);
            class665.field9426 = true;
        }
        if (class145.field1841 != null) {
            if (class42.field546 == 2) {
                class257.method1618((byte) -122);
            } else if (class42.field546 == 3) {
                class284.method1705(2);
            }
        }
        if (class373.field5382) {
            class373.field5382 = false;
        } else {
            class74.field945 /= 2.0F;
        }
        if (class548.field7497) {
            class548.field7497 = false;
        } else {
            class690.field9748 /= 2.0F;
        }
        class160.method1091(25);
        if (class476.field6436 != 10) {
            return;
        }
        class194.method1238((byte) 79);
        class173.method1150((byte) 110);
        class214.method1329(false);
        class454.method2577(-25605);
        class365.field5243++;
        if (class365.field5243 > 750) {
            class537.method3032((byte) 108);
            return;
        }
        class533.method3022((byte) -94);
        class335.method2142(arg0 ^ 0x56DA);
        class394.method2342((byte) -119);
        for (int var23 = class327.field4771.method2157(false, true); var23 != -1; var23 = class327.field4771.method2157(false, false)) {
            class297.method1773(var23, 107);
            class223.field2903[class230.method1424(class341.field5016++, 31)] = var23;
        }
        for (class19 var24 = class460.method2604(65280); var24 != null; var24 = class460.method2604(65280)) {
            int var25 = var24.method107(false);
            int var26 = var24.method108((byte) 31);
            if (var25 == 1) {
                class85.field1042[var26] = var24.field171;
                class674.field9548 |= class521.field7223[var26];
                class77.field961[class230.method1424(class290.field3885++, 31)] = var26;
            } else if (var25 == 2) {
                class24.field229[var26] = var24.field170;
                class390.field5613[class230.method1424(31, class379.field5444++)] = var26;
            } else if (var25 == 3) {
                class188 var27 = class557.method3117(var26, (byte) 71);
                if (!var24.field170.equals(var27.field2399)) {
                    var27.field2399 = var24.field170;
                    class553.method3100(var27, 0);
                }
            } else if (var25 == 4) {
                class188 var28 = class557.method3117(var26, (byte) 71);
                int var29 = var24.field171;
                int var30 = var24.field173;
                int var31 = var24.field180;
                if (var28.field2301 != var29 || var28.field2302 != var30 || var28.field2317 != var31) {
                    var28.field2302 = var30;
                    var28.field2317 = var31;
                    var28.field2301 = var29;
                    class553.method3100(var28, 0);
                }
            } else if (var25 == 5) {
                class188 var48 = class557.method3117(var26, (byte) 71);
                if (var24.field171 != var48.field2386 || var24.field171 == -1) {
                    var48.field2368 = 0;
                    var48.field2343 = 1;
                    var48.field2386 = var24.field171;
                    var48.field2316 = 0;
                    class553.method3100(var48, 0);
                }
            } else if (var25 == 6) {
                int var32 = var24.field171;
                int var33 = (var32 & 0x7F07) >> 10;
                int var34 = (var32 & 0x3FC) >> 5;
                int var35 = var32 & 0x1F;
                int var36 = (var35 << 3) + (var33 << 19) + (var34 << 11);
                class188 var37 = class557.method3117(var26, (byte) 71);
                if (var37.field2464 != var36) {
                    var37.field2464 = var36;
                    class553.method3100(var37, 0);
                }
            } else if (var25 == 7) {
                class188 var38 = class557.method3117(var26, (byte) 71);
                boolean var39 = var24.field171 == 1;
                if (var38.field2351 != var39) {
                    var38.field2351 = var39;
                    class553.method3100(var38, 0);
                }
            } else if (var25 == 8) {
                class188 var40 = class557.method3117(var26, (byte) 71);
                if (var24.field171 != var40.field2408 || var24.field173 != var40.field2329 || var24.field180 != var40.field2389) {
                    var40.field2389 = var24.field180;
                    var40.field2408 = var24.field171;
                    var40.field2329 = var24.field173;
                    if (var40.field2324 != -1) {
                        if (var40.field2401 > 0) {
                            var40.field2389 = var40.field2389 * 32 / var40.field2401;
                        } else if (var40.field2323 > 0) {
                            var40.field2389 = var40.field2389 * 32 / var40.field2323;
                        }
                    }
                    class553.method3100(var40, arg0 - 22190);
                }
            } else if (var25 == 9) {
                class188 var41 = class557.method3117(var26, (byte) 71);
                if (var24.field171 != var41.field2324 || var24.field173 != var41.field2424) {
                    var41.field2324 = var24.field171;
                    var41.field2424 = var24.field173;
                    class553.method3100(var41, 0);
                }
            } else if (var25 == 10) {
                class188 var47 = class557.method3117(var26, (byte) 71);
                if (var24.field171 != var47.field2309 || var24.field173 != var47.field2429 || var24.field180 != var47.field2463) {
                    var47.field2429 = var24.field173;
                    var47.field2463 = var24.field180;
                    var47.field2309 = var24.field171;
                    class553.method3100(var47, 0);
                }
            } else if (var25 == 11) {
                class188 var46 = class557.method3117(var26, (byte) 71);
                var46.field2305 = var46.field2404 = var24.field171;
                var46.field2418 = 0;
                var46.field2428 = var46.field2299 = var24.field173;
                var46.field2373 = 0;
                class553.method3100(var46, 0);
            } else if (var25 == 12) {
                class188 var42 = class557.method3117(var26, (byte) 71);
                int var43 = var24.field171;
                if (var42 != null && var42.field2304 == 0) {
                    if (var42.field2406 - var42.field2371 < var43) {
                        var43 = var42.field2406 - var42.field2371;
                    }
                    if (var43 < 0) {
                        var43 = 0;
                    }
                    if (var42.field2431 != var43) {
                        var42.field2431 = var43;
                        class553.method3100(var42, 0);
                    }
                }
            } else if (var25 == 14) {
                class188 var45 = class557.method3117(var26, (byte) 71);
                var45.field2447 = var24.field171;
            } else if (var25 == 15) {
                class436.field6025 = var24.field171;
                class251.field3388 = var24.field173;
                class329.field4819 = true;
            } else if (var25 == 16) {
                class188 var44 = class557.method3117(var26, (byte) 71);
                var44.field2454 = var24.field171;
            }
        }
        if (class273.field3702 != 0) {
            class669.field9514 += 20;
            if (class669.field9514 >= 400) {
                class273.field3702 = 0;
            }
        }
        class323.field4732++;
        if (class652.field9249 != null) {
            class139.field1785++;
            if (class139.field1785 >= 15) {
                class553.method3100(class652.field9249, arg0 - 22190);
                class652.field9249 = null;
            }
        }
        class29.field285 = null;
        class570.field7894 = null;
        class648.field9191 = false;
        class172.field2156 = false;
        class519.method2951(20, null, -1, -1);
        class497.method2803(-1, null, -1, true);
        if (!class613.field8378) {
            class664.field9413 = -1;
        }
        class669.method3714(-29745);
        class141.field1800++;
        if (class200.field2629) {
            class145.field1843++;
            class389.method2326((byte) 118, class542.field7421);
            class253.field3491.method917((byte) 119, class629.field8559 | class193.field2507 << 14 | class593.field8129 << 28);
            class200.field2629 = false;
        }
        while (true) {
            class425 var49;
            class188 var50;
            class188 var51;
            do {
                var49 = (class425) class149.field1878.method368(arg0 - 22070);
                if (var49 == null) {
                    while (true) {
                        class425 var52;
                        class188 var53;
                        class188 var54;
                        do {
                            var52 = (class425) class560.field7634.method368(46);
                            if (var52 == null) {
                                while (true) {
                                    class425 var55;
                                    class188 var56;
                                    class188 var57;
                                    do {
                                        var55 = (class425) class380.field5450.method368(55);
                                        if (var55 == null) {
                                            if (class29.field285 == null) {
                                                class614.field8380 = 0;
                                            }
                                            if (class377.field5414 != null) {
                                                class691.method3825((byte) 5);
                                            }
                                            if (class485.field6560 > 0 && class348.field5096.method32(82, -123) && class348.field5096.method32(81, -122) && class627.field8530 != 0) {
                                                int var58 = class596.field8164.field3925 - class627.field8530;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class282.method1695(var58, class186.field2280 + class596.field8164.field516[0], class596.field8164.field526[0] + class253.field3490, (byte) 48);
                                            }
                                            class401.method2365(arg0 - 22168);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class503.field6815[var59]++;
                                            }
                                            if (class674.field9548 && (class669.method3713(0) - 60000L) > class125.field1607) {
                                                class72.method426(87);
                                            }
                                            for (class394 var60 = (class394) class245.field3296.method2224((byte) -112); var60 != null; var60 = (class394) class245.field3296.method2222((byte) -51)) {
                                                if ((class669.method3713(0) / 1000L - 5L) > ((long) var60.field5651)) {
                                                    if (var60.field5652 > 0) {
                                                        class334.method2133("", 5, "", var60.field5647 + class243.field3230.method1491(class350.field5121, (byte) 127), 0, -117, "");
                                                    }
                                                    if (var60.field5652 == 0) {
                                                        class334.method2133("", 5, "", var60.field5647 + class243.field3231.method1491(class350.field5121, (byte) 126), 0, arg0 - 22285, "");
                                                    }
                                                    var60.method2357(3553);
                                                }
                                            }
                                            class314.field4512++;
                                            if (class314.field4512 > 500) {
                                                class314.field4512 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x1) == 1) {
                                                    class225.field2923 += class43.field555;
                                                }
                                                if ((var61 & 0x2) == 2) {
                                                    class603.field8245 += class42.field548;
                                                }
                                                if ((var61 & 0x4) == 4) {
                                                    class265.field3636 += class223.field2881;
                                                }
                                            }
                                            if (class225.field2923 < -50) {
                                                class43.field555 = 2;
                                            }
                                            if (arg0 != 22190) {
                                                method2175(19);
                                            }
                                            if (class603.field8245 < -55) {
                                                class42.field548 = 2;
                                            }
                                            if (class225.field2923 > 50) {
                                                class43.field555 = -2;
                                            }
                                            if (class603.field8245 > 55) {
                                                class42.field548 = -2;
                                            }
                                            if (class265.field3636 < -40) {
                                                class223.field2881 = 1;
                                            }
                                            if (class265.field3636 > 40) {
                                                class223.field2881 = -1;
                                            }
                                            class367.field5273++;
                                            if (class367.field5273 > 500) {
                                                class367.field5273 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x2) == 2) {
                                                    class461.field6281 += class668.field9503;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class254.field3506 += class264.field3628;
                                                }
                                            }
                                            if (class254.field3506 < -60) {
                                                class264.field3628 = 2;
                                            }
                                            if (class254.field3506 > 60) {
                                                class264.field3628 = -2;
                                            }
                                            if (class461.field6281 < -20) {
                                                class668.field9503 = 1;
                                            }
                                            if (class461.field6281 > 10) {
                                                class668.field9503 = -1;
                                            }
                                            class462.field6305++;
                                            if (class462.field6305 > 50) {
                                                class389.method2326((byte) 118, class270.field3681);
                                                class460.field6265++;
                                            }
                                            if (class389.field5604) {
                                                class637.method3471(1);
                                                class389.field5604 = false;
                                            }
                                            try {
                                                if (class80.field1014 != null && class253.field3491.field1745 > 0) {
                                                    class201.field2637 += class253.field3491.field1745;
                                                    class80.field1014.method969(class253.field3491.field1712, 0, -11679, class253.field3491.field1745);
                                                    class253.field3491.field1745 = 0;
                                                    class462.field6305 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var63) {
                                                class537.method3032((byte) 102);
                                                return;
                                            }
                                        }
                                        var56 = var55.field5911;
                                        if (var56.field2361 < 0) {
                                            break;
                                        }
                                        var57 = class557.method3117(var56.field2414, (byte) 71);
                                    } while (var57 == null || var57.field2352 == null || var57.field2352.length <= var56.field2361 || var57.field2352[var56.field2361] != var56);
                                    class317.method2051(var55);
                                }
                            }
                            var53 = var52.field5911;
                            if (var53.field2361 < 0) {
                                break;
                            }
                            var54 = class557.method3117(var53.field2414, (byte) 71);
                        } while (var54 == null || var54.field2352 == null || var53.field2361 >= var54.field2352.length || var54.field2352[var53.field2361] != var53);
                        class317.method2051(var52);
                    }
                }
                var50 = var49.field5911;
                if (var50.field2361 < 0) {
                    break;
                }
                var51 = class557.method3117(var50.field2414, (byte) 71);
            } while (var51 == null || var51.field2352 == null || var51.field2352.length <= var50.field2361 || var51.field2352[var50.field2361] != var50);
            class317.method2051(var49);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z")
    public final boolean method1023(Source arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 7) {
            this.method1025(true, (byte) 106);
        }
        super.method1448(arg2, arg0, (byte) -117);
        field5079++;
        return true;
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)V")
    public static final void method2176(int arg0) {
        field5077++;
        if (arg0 > -98 || !class494.field6686) {
            return;
        }
        while (true) {
            while (class375.field5394.length > class277.field3749) {
                class40 var1 = class375.field5394[class277.field3749];
                if (var1 != null && var1.field532 == -1) {
                    if (class258.field3583 == null) {
                        class258.field3583 = class237.field3082.method1840(var1.field533, (byte) -127);
                    }
                    int var2 = class258.field3583.field1204;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field532 = var2;
                    class258.field3583 = null;
                    class277.field3749++;
                } else {
                    class277.field3749++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Z")
    public final boolean method1019(int arg0, int arg1, int arg2) {
        field5083++;
        super.method1446(arg1, 30419);
        return arg2 == -26802;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lmc;Z)V")
    public class347(class381 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)I")
    public final int method1024(byte arg0) {
        if (arg0 == 54) {
            field5080++;
            return super.method1024((byte) 54);
        } else {
            return 30;
        }
    }
}
