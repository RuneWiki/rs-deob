import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class274 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lvm;")
    public static class297 field4740 = new class297(32);

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field4744 = 1;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lke;")
    private static class256 field4742 = class316.method2202("Allocating memory", 27626);

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4743 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field4748 = 100;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lke;")
    public static class256 field4747 = field4742;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILke;Lke;)V", line = 15)
    public static final void method1895(int arg0, int arg1, class256 arg2, class256 arg3) {
        field4750++;
        if (arg1 != 22156) {
            field4744 = -42;
        }
        class28.method206(arg0, (class256) null, arg2, -1, (byte) -84, arg3);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLjava/lang/Object;Lff;)V", line = 30)
    public static final void method1896(byte arg0, Object arg1, class4 arg2) {
        field4746++;
        if (arg2.field55 == null) {
            return;
        }
        int var3 = 51 % ((-arg0 - 18) / 47);
        for (int var4 = 0; var4 < 50 && arg2.field55.peekEvent() != null; var4++) {
            class46.method381(1L, 41);
        }
        if (arg1 != null) {
            arg2.field55.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 52)
    public static void method1897(byte arg0) {
        field4742 = null;
        if (arg0 < 119) {
            field4747 = (class256) null;
        }
        field4740 = null;
        field4747 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)Z", line = 64)
    public static final boolean method1898(byte arg0, int arg1) {
        field4741++;
        int var2 = 101 % ((arg0 + 64) / 59);
        class168.field2991 = arg1 + 1 & 0xFFFF;
        class54.field990 = true;
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[F", line = 80)
    public static final float[] method1899(int arg0, int arg1) {
        field4749++;
        float var2 = class169.method1228() + class169.method1226();
        int var3 = class169.method1235();
        class15.field208[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFFA474) >> 16) / 255.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        if (arg0 != 13093) {
            return (float[]) null;
        }
        float var6 = 0.58823526F;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class15.field208[0] = var2 * var6 * (float) (class150.method1123(16753132, arg1) >> 16) / 255.0F * var4;
        class15.field208[1] = var2 * var6 * (float) class150.method1123(255, arg1 >> 8) / 255.0F * var5;
        class15.field208[2] = var2 * var7 * ((float) class150.method1123(arg1, 255) / 255.0F) * var6;
        return class15.field208;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 114)
    public static final void method1900(byte arg0) {
        if (class42.field809 > 0) {
            class42.field809--;
        }
        if (class15.field194 > 1) {
            class163.field2884 = class35.field549;
            class15.field194--;
        }
        field4739++;
        if (class242.field4111) {
            class242.field4111 = false;
            class84.method617((byte) -128);
            return;
        }
        for (int var1 = 0; var1 < 100 && class214.method1498(30138); var1++) {
        }
        if (class86.field1550 != 30) {
            return;
        }
        class52.method413(class308.field5322, -10, 152);
        Object var2 = class59.field1078.field4506;
        synchronized (class59.field1078.field4506) {
            if (!class32.field519) {
                class59.field1078.field4520 = 0;
            } else if (class83.field1503 != 0 || class59.field1078.field4520 >= 40) {
                class134.field2331++;
                class308.field5322.method1599(176, (byte) 89);
                int var3 = 0;
                class308.field5322.method308(0, -2);
                int var4 = class308.field5322.field738;
                for (int var5 = 0; class59.field1078.field4520 > var5 && (class308.field5322.field738 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class59.field1078.field4515[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class59.field1078.field4519[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class59.field1078.field4515[var5] == -1 && class59.field1078.field4519[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class238.field4057 != var7 || class11.field166 != var6) {
                        int var9 = var6 - class11.field166;
                        int var10 = var7 - class238.field4057;
                        class11.field166 = var6;
                        class238.field4057 = var7;
                        if (class205.field3718 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class308.field5322.method366((class205.field3718 << 12) + (var10 << 6) + var9, -102);
                            class205.field3718 = 0;
                        } else if (class205.field3718 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class308.field5322.method308(class205.field3718 + 128, -2);
                            var10 += 128;
                            var9 += 128;
                            class308.field5322.method366((var10 << 8) + var9, -123);
                            class205.field3718 = 0;
                        } else if (class205.field3718 < 32) {
                            class308.field5322.method308(class205.field3718 + 192, -2);
                            if (var8) {
                                class308.field5322.method365((byte) -32, Integer.MIN_VALUE);
                            } else {
                                class308.field5322.method365((byte) -32, var6 << 16 | var7);
                            }
                            class205.field3718 = 0;
                        } else {
                            class308.field5322.method366(class205.field3718 + 57344, -102);
                            if (var8) {
                                class308.field5322.method365((byte) -32, Integer.MIN_VALUE);
                            } else {
                                class308.field5322.method365((byte) -32, var6 << 16 | var7);
                            }
                            class205.field3718 = 0;
                        }
                    } else if (class205.field3718 < 2047) {
                        class205.field3718++;
                    }
                }
                class308.field5322.method345(class308.field5322.field738 - var4, 1);
                if (class59.field1078.field4520 <= var3) {
                    class59.field1078.field4520 = 0;
                } else {
                    class59.field1078.field4520 -= var3;
                    for (int var11 = 0; var11 < class59.field1078.field4520; var11++) {
                        class59.field1078.field4519[var11] = class59.field1078.field4519[var3 + var11];
                        class59.field1078.field4515[var11] = class59.field1078.field4515[var3 + var11];
                    }
                }
            }
        }
        if (class83.field1503 != 0) {
            long var13 = (class21.field282 - class13.field169) / 50L;
            class1.field17++;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class311.field5365;
            int var16 = class160.field2855;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class13.field169 = class21.field282;
            int var17 = (int) var13;
            byte var18 = 0;
            if (class83.field1503 == 2) {
                var18 = 1;
            }
            class308.field5322.method1599(140, (byte) -57);
            class308.field5322.method366(var17 | var18 << 15, -103);
            class308.field5322.method355(77, var15 | var16 << 16);
        }
        if (class187.field3287 > 0) {
            class187.field3287--;
        }
        if (class154.field2746) {
            for (int var19 = 0; var19 < class208.field3767; var19++) {
                int var20 = class50.field925[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class152.field2723 = true;
                    break;
                }
            }
        } else if (class140.field2468[96] || class140.field2468[97] || class140.field2468[98] || class140.field2468[99]) {
            class152.field2723 = true;
        }
        if (class152.field2723 && class187.field3287 <= 0) {
            class187.field3287 = 20;
            class152.field2723 = false;
            class9.field136++;
            class308.field5322.method1599(19, (byte) -111);
            class308.field5322.method322(false, class114.field2014);
            class308.field5322.method351(-128, class289.field5001);
        }
        if (class305.field5263 && !class107.field1915) {
            class107.field1915 = true;
            class308.field5316++;
            class308.field5322.method1599(63, (byte) 82);
            class308.field5322.method308(1, -2);
        }
        if (!class305.field5263 && class107.field1915) {
            class308.field5316++;
            class107.field1915 = false;
            class308.field5322.method1599(63, (byte) 78);
            class308.field5322.method308(0, -2);
        }
        if (!class17.field245) {
            class71.field1303++;
            class308.field5322.method1599(106, (byte) 110);
            class308.field5322.method355(106, class172.method1253(57));
            class17.field245 = true;
        }
        class34.method239(0);
        if (class86.field1550 != 30) {
            return;
        }
        class7.method49(59);
        class292.method2031(255);
        class64.field1135++;
        if (class64.field1135 > 750) {
            class84.method617((byte) -8);
            return;
        }
        class207.method1467((byte) 63);
        class180.method1323((byte) 117);
        class71.method544(true);
        if (class100.field1774 != null) {
            class302.method2110(-1);
        }
        for (int var21 = class146.method1065((byte) -46, true); var21 != -1; var21 = class146.method1065((byte) -46, false)) {
            class300.method2098(102, var21);
            class165.field2930[class150.method1123(31, class249.field4235++)] = var21;
        }
        for (class77 var22 = class238.method1603(15874); var22 != null; var22 = class238.method1603(15874)) {
            int var23 = var22.method581(false);
            int var24 = var22.method585(255);
            if (var23 == 1) {
                class17.field221[var24] = var22.field1455;
                class154.field2751[class150.method1123(31, class298.field5165++)] = var24;
            } else if (var23 == 2) {
                class255.field4361[var24] = var22.field1462;
                class229.field3930[class150.method1123(class114.field2013++, 31)] = var24;
            } else if (var23 == 3) {
                class188 var44 = class182.method1335((byte) 110, var24);
                if (!var22.field1462.method1806(false, var44.field3423)) {
                    var44.field3423 = var22.field1462;
                    class64.method500(var44, (byte) -117);
                }
            } else if (var23 == 4) {
                class188 var25 = class182.method1335((byte) 96, var24);
                int var26 = var22.field1455;
                int var27 = var22.field1459;
                if (var25.field3434 != var26 || var25.field3306 != var27) {
                    var25.field3434 = var26;
                    var25.field3306 = var27;
                    class64.method500(var25, (byte) -117);
                }
            } else if (var23 == 5) {
                class188 var28 = class182.method1335((byte) 91, var24);
                if (var22.field1455 != var28.field3318 || var22.field1455 == -1) {
                    var28.field3394 = 0;
                    var28.field3318 = var22.field1455;
                    var28.field3392 = 0;
                    class64.method500(var28, (byte) -117);
                }
            } else if (var23 == 6) {
                int var29 = var22.field1455;
                int var30 = (var29 & 0x7FE5) >> 10;
                int var31 = (var29 & 0x3ED) >> 5;
                int var32 = var29 & 0x1F;
                class188 var33 = class182.method1335((byte) 113, var24);
                int var34 = (var31 << 11) + (var30 << 19) + (var32 << 3);
                if (var33.field3332 != var34) {
                    var33.field3332 = var34;
                    class64.method500(var33, (byte) -117);
                }
            } else if (var23 == 7) {
                class188 var42 = class182.method1335((byte) 106, var24);
                boolean var43 = var22.field1455 == 1;
                if (var42.field3418 != var43) {
                    var42.field3418 = var43;
                    class64.method500(var42, (byte) -117);
                }
            } else if (var23 == 8) {
                class188 var35 = class182.method1335((byte) 96, var24);
                if (var22.field1455 != var35.field3353 || var22.field1459 != var35.field3313 || var22.field1453 != var35.field3450) {
                    var35.field3313 = var22.field1459;
                    var35.field3450 = var22.field1453;
                    var35.field3353 = var22.field1455;
                    if (var35.field3326 != -1) {
                        if (var35.field3335 > 0) {
                            var35.field3450 = var35.field3450 * 32 / var35.field3335;
                        } else if (var35.field3364 > 0) {
                            var35.field3450 = var35.field3450 * 32 / var35.field3364;
                        }
                    }
                    class64.method500(var35, (byte) -117);
                }
            } else if (var23 == 9) {
                class188 var36 = class182.method1335((byte) 94, var24);
                if (var22.field1455 != var36.field3326 || var22.field1459 != var36.field3430) {
                    var36.field3326 = var22.field1455;
                    var36.field3430 = var22.field1459;
                    class64.method500(var36, (byte) -117);
                }
            } else if (var23 == 10) {
                class188 var37 = class182.method1335((byte) 101, var24);
                if (var22.field1455 != var37.field3317 || var22.field1459 != var37.field3395 || var22.field1453 != var37.field3466) {
                    var37.field3317 = var22.field1455;
                    var37.field3395 = var22.field1459;
                    var37.field3466 = var22.field1453;
                    class64.method500(var37, (byte) -117);
                }
            } else if (var23 == 11) {
                class188 var38 = class182.method1335((byte) 125, var24);
                var38.field3437 = 0;
                var38.field3333 = var38.field3389 = var22.field1459;
                var38.field3400 = var38.field3403 = var22.field1455;
                var38.field3372 = 0;
                class64.method500(var38, (byte) -117);
            } else if (var23 == 12) {
                class188 var39 = class182.method1335((byte) 94, var24);
                int var40 = var22.field1455;
                if (var39 != null && var39.field3467 == 0) {
                    if (var40 > (var39.field3393 - var39.field3343)) {
                        var40 = var39.field3393 - var39.field3343;
                    }
                    if (var40 < 0) {
                        var40 = 0;
                    }
                    if (var39.field3463 != var40) {
                        var39.field3463 = var40;
                        class64.method500(var39, (byte) -117);
                    }
                }
            } else if (var23 == 13) {
                class188 var41 = class182.method1335((byte) 101, var24);
                var41.field3388 = var22.field1455;
            }
        }
        if (class71.field1313 != 0) {
            class143.field2511 += 20;
            if (class143.field2511 >= 400) {
                class71.field1313 = 0;
            }
        }
        class29.field398++;
        if (class316.field5451 != null) {
            class248.field4221++;
            if (class248.field4221 >= 15) {
                class64.method500(class316.field5451, (byte) -117);
                class316.field5451 = null;
            }
        }
        if (class242.field4123 != null) {
            class64.method500(class242.field4123, (byte) -117);
            if (class286.field4963 > class251.field4258 + 5 || class286.field4963 < (class251.field4258 - 5) || class216.field3844 + 5 < class208.field3762 || class208.field3762 < class216.field3844 - 5) {
                client.field2147 = true;
            }
            class71.field1300++;
            if (class287.field4978 == 0) {
                if (client.field2147 && class71.field1300 >= 5) {
                    if (class91.field1658 == class242.field4123 && class83.field1510 != class247.field4205) {
                        class188 var45 = class242.field4123;
                        byte var46 = 0;
                        if (class166.field2940 == 1 && var45.field3357 == 206) {
                            var46 = 1;
                        }
                        class36.field610++;
                        if (var45.field3347[class247.field4205] <= 0) {
                            var46 = 0;
                        }
                        if (class214.method1500(client.method828(var45), -32112)) {
                            int var49 = class83.field1510;
                            int var50 = class247.field4205;
                            var45.field3347[var50] = var45.field3347[var49];
                            var45.field3351[var50] = var45.field3351[var49];
                            var45.field3347[var49] = -1;
                            var45.field3351[var49] = 0;
                        } else if (var46 == 1) {
                            int var47 = class247.field4205;
                            int var48 = class83.field1510;
                            while (var47 != var48) {
                                if (var47 < var48) {
                                    var45.method1358(var48, var48 - 1, false);
                                    var48--;
                                } else if (var47 > var48) {
                                    var45.method1358(var48, var48 + 1, false);
                                    var48++;
                                }
                            }
                        } else {
                            var45.method1358(class83.field1510, class247.field4205, false);
                        }
                        class308.field5322.method1599(200, (byte) -52);
                        class308.field5322.method343(1349556632, class83.field1510);
                        class308.field5322.method326((byte) 110, class242.field4123.field3342);
                        class308.field5322.method351(-128, class247.field4205);
                        class308.field5322.method319(-1117072288, var46);
                    }
                } else if ((class154.field2747 == 1 || class208.method1472(-1, class17.field244 - 1)) && class17.field244 > 2) {
                    class193.method1397(true);
                } else if (class17.field244 > 0) {
                    class99.method713((byte) -27);
                }
                class248.field4221 = 10;
                class242.field4123 = null;
                class83.field1503 = 0;
            }
        }
        class138.field2420 = null;
        class320.field5491 = false;
        class164.field2914 = false;
        class188 var51 = class233.field3984;
        class233.field3984 = null;
        class188 var52 = class7.field112;
        class208.field3767 = 0;
        class7.field112 = null;
        while (class1.method3(127) && class208.field3767 < 128) {
            class50.field925[class208.field3767] = class7.field116;
            class119.field2105[class208.field3767] = class318.field5475;
            class208.field3767++;
        }
        class100.field1774 = null;
        if (class211.field3803 != -1) {
            class54.method433(0, 0, -1, class112.field1969, 0, class124.field2200, class211.field3803, 0);
        }
        class35.field549++;
        while (true) {
            class119 var53;
            class188 var54;
            class188 var55;
            do {
                var53 = (class119) class165.field2927.method1267(-45);
                if (var53 == null) {
                    while (true) {
                        class119 var56;
                        class188 var57;
                        class188 var58;
                        do {
                            var56 = (class119) class208.field3758.method1267(74);
                            if (var56 == null) {
                                while (true) {
                                    class119 var59;
                                    class188 var60;
                                    class188 var61;
                                    do {
                                        var59 = (class119) class116.field2031.method1267(-14);
                                        if (var59 == null) {
                                            if (class32.field523 && class100.field1774 == null) {
                                                class32.field523 = false;
                                            }
                                            if (class240.field4096 != null) {
                                                class204.method1449((byte) -91);
                                            }
                                            if (class106.field1896 > 0 && class140.field2468[82] && class140.field2468[81] && class157.field2795 != 0) {
                                                int var62 = class255.field4377 - class157.field2795;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class281.method1968(false, class121.field2124.field1215[0] + class134.field2336, class121.field2124.field1254[0] + class10.field147, var62);
                                            }
                                            if (class106.field1896 > 0 && class140.field2468[82] && class140.field2468[81]) {
                                                if (class91.field1666 != -1) {
                                                    class281.method1968(false, class134.field2336 + class91.field1666, class160.field2847 + class10.field147, class255.field4377);
                                                }
                                                class233.field3995 = 0;
                                                class157.field2805 = 0;
                                            } else if (class157.field2805 == 2) {
                                                if (class91.field1666 != -1) {
                                                    class308.field5322.method1599(205, (byte) 105);
                                                    class308.field5322.method351(-128, class96.field1710);
                                                    class35.field558++;
                                                    class308.field5322.method366(class160.field2847 + class10.field147, -103);
                                                    class308.field5322.method326((byte) 100, class170.field3024);
                                                    class308.field5322.method322(false, class91.field1666 + class134.field2336);
                                                    class114.field2012 = class311.field5365;
                                                    class9.field143 = class160.field2855;
                                                    class143.field2511 = 0;
                                                    class71.field1313 = 1;
                                                }
                                                class157.field2805 = 0;
                                            } else if (class233.field3995 == 2) {
                                                if (class91.field1666 != -1) {
                                                    class5.field76++;
                                                    class308.field5322.method1599(48, (byte) -34);
                                                    class308.field5322.method343(1349556632, class160.field2847 + class10.field147);
                                                    class308.field5322.method343(1349556632, class134.field2336 + class91.field1666);
                                                    class114.field2012 = class311.field5365;
                                                    class9.field143 = class160.field2855;
                                                    class143.field2511 = 0;
                                                    class71.field1313 = 1;
                                                }
                                                class233.field3995 = 0;
                                            } else if (class91.field1666 != -1 && class157.field2805 == 0 && class233.field3995 == 0) {
                                                boolean var63 = class238.method1598(0, class91.field1666, class160.field2847, 0, class121.field2124.field1215[0], 0, class121.field2124.field1254[0], 0, true, -3, 0, 0);
                                                if (var63) {
                                                    class143.field2511 = 0;
                                                    class71.field1313 = 1;
                                                    class114.field2012 = class311.field5365;
                                                    class9.field143 = class160.field2855;
                                                }
                                            }
                                            class91.field1666 = -1;
                                            class260.method1826((byte) -93);
                                            if (class7.field112 != var52) {
                                                if (var52 != null) {
                                                    class64.method500(var52, (byte) -117);
                                                }
                                                if (class7.field112 != null) {
                                                    class64.method500(class7.field112, (byte) -117);
                                                }
                                            }
                                            if (arg0 > -110) {
                                                method1902((byte[]) null, 45, 85);
                                            }
                                            if (class233.field3984 != var51 && class28.field384 == class200.field3656) {
                                                if (var51 != null) {
                                                    class64.method500(var51, (byte) -117);
                                                }
                                                if (class233.field3984 != null) {
                                                    class64.method500(class233.field3984, (byte) -117);
                                                }
                                            }
                                            if (class233.field3984 == null) {
                                                if (class28.field384 > 0) {
                                                    class28.field384--;
                                                }
                                            } else if (class28.field384 < class200.field3656) {
                                                class28.field384++;
                                                if (class28.field384 == class200.field3656) {
                                                    class64.method500(class233.field3984, (byte) -117);
                                                }
                                            }
                                            if (class192.field3510 == 1) {
                                                class137.method989(-47);
                                            } else if (class192.field3510 == 2) {
                                                class193.method1400(-1);
                                            } else {
                                                class96.method693((byte) -121);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class121.field2130[var64]++;
                                            }
                                            int var65 = class200.method1435((byte) 50);
                                            int var66 = class251.method1687((byte) 105);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class42.field809 = 250;
                                                class256.method1790(18026, 14500);
                                                class96.field1719++;
                                                class308.field5322.method1599(179, (byte) -75);
                                            }
                                            if (class24.field317 != null && class24.field317.field1500 == 1) {
                                                if (class24.field317.field1499 != null) {
                                                    class85.method624(class83.field1515, class31.field509, (byte) 39);
                                                }
                                                class83.field1515 = false;
                                                class31.field509 = null;
                                                class24.field317 = null;
                                            }
                                            class165.field2932++;
                                            class163.field2890++;
                                            class51.field935++;
                                            if (class51.field935 > 500) {
                                                class51.field935 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    client.field2149 += class206.field3732;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class175.field3108 += class236.field4031;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class86.field1558 += class144.field2550;
                                                }
                                            }
                                            if (class175.field3108 < -40) {
                                                class236.field4031 = 1;
                                            }
                                            if (client.field2149 < -50) {
                                                class206.field3732 = 2;
                                            }
                                            if (class163.field2890 > 500) {
                                                class163.field2890 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class215.field3839 += class107.field1898;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class162.field2880 += class209.field3782;
                                                }
                                            }
                                            if (class162.field2880 < -20) {
                                                class209.field3782 = 1;
                                            }
                                            if (class175.field3108 > 40) {
                                                class236.field4031 = -1;
                                            }
                                            if (class162.field2880 > 10) {
                                                class209.field3782 = -1;
                                            }
                                            if (class86.field1558 < -55) {
                                                class144.field2550 = 2;
                                            }
                                            if (class215.field3839 < -60) {
                                                class107.field1898 = 2;
                                            }
                                            if (client.field2149 > 50) {
                                                class206.field3732 = -2;
                                            }
                                            if (class215.field3839 > 60) {
                                                class107.field1898 = -2;
                                            }
                                            if (class86.field1558 > 55) {
                                                class144.field2550 = -2;
                                            }
                                            if (class165.field2932 > 50) {
                                                class117.field2049++;
                                                class308.field5322.method1599(252, (byte) 92);
                                            }
                                            if (class54.field990) {
                                                class207.method1462(-91);
                                                class54.field990 = false;
                                            }
                                            try {
                                                if (class196.field3586 != null && class308.field5322.field738 > 0) {
                                                    class196.field3586.method1636((byte) 20, 0, class308.field5322.field772, class308.field5322.field738);
                                                    class165.field2932 = 0;
                                                    class308.field5322.field738 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class84.method617((byte) -71);
                                            }
                                            return;
                                        }
                                        var60 = var59.field2116;
                                        if (var60.field3305 < 0) {
                                            break;
                                        }
                                        var61 = class182.method1335((byte) 106, var60.field3468);
                                    } while (var61 == null || var61.field3368 == null || var60.field3305 >= var61.field3368.length || var61.field3368[var60.field3305] != var60);
                                    class91.method678((byte) 69, var59);
                                }
                            }
                            var57 = var56.field2116;
                            if (var57.field3305 < 0) {
                                break;
                            }
                            var58 = class182.method1335((byte) 125, var57.field3468);
                        } while (var58 == null || var58.field3368 == null || var57.field3305 >= var58.field3368.length || var58.field3368[var57.field3305] != var57);
                        class91.method678((byte) -117, var56);
                    }
                }
                var54 = var53.field2116;
                if (var54.field3305 < 0) {
                    break;
                }
                var55 = class182.method1335((byte) 125, var54.field3468);
            } while (var55 == null || var55.field3368 == null || var54.field3305 >= var55.field3368.length || var55.field3368[var54.field3305] != var54);
            class91.method678((byte) -119, var53);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lmc;IIIII)V", line = 1135)
    public static final void method1901(class51 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class86.field1547 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class129.field2264) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class57.field1051 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class271 var14 = class41.field790[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class118.field2090[var11][var12 + 1][var13] + class118.field2090[var11][var12][var13] + class118.field2090[var11][var12][var13 + 1] + class118.field2090[var11][var12 + 1][var13 + 1]) / 4 - (class118.field2090[arg1][arg2 + 1][arg3] + class118.field2090[arg1][arg2][arg3] + class118.field2090[arg1][arg2][arg3 + 1] + class118.field2090[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class197 var16 = var14.field4639;
                                    if (var16 != null) {
                                        if (var16.field3597.method408()) {
                                            arg0.method410(var16.field3597, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3596 != null && var16.field3596.method408()) {
                                            arg0.method410(var16.field3596, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4641; var17++) {
                                        class269 var18 = var14.field4624[var17];
                                        if (var18 != null && var18.field4590.method408() && (var18.field4594 == var12 || var7 == var12) && (var18.field4587 == var13 || var9 == var13)) {
                                            int var19 = var18.field4597 + 1 - var18.field4594;
                                            int var20 = var18.field4599 + 1 - var18.field4587;
                                            arg0.method410(var18.field4590, (var18.field4594 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4587 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BII)I", line = 1245)
    public static final int method1902(byte[] arg0, int arg1, int arg2) {
        field4745++;
        if (arg2 >= -1) {
            field4742 = (class256) null;
        }
        return class66.method508(0, arg0, -1, arg1);
    }
}
