import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class65 extends class417 {

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field803 = 0;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Llu;")
    public static class610 field806 = new class610(60, 7);

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Liaa;")
    public static class423 field802;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)Lmb;", line = 4)
    public static final class221 method413(int arg0, int arg1, byte arg2) {
        field804++;
        int var3 = -76 % ((32 - arg2) / 61);
        class221 var4 = (class221) class517.field7365.method2799((long) arg0 << 32 | (long) arg1, true);
        if (var4 == null) {
            var4 = new class221(arg0, arg1);
            class517.field7365.method2797(-4234, var4, var4.field5651);
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/lang/String;)I", line = 24)
    public static final int method414(int arg0, String arg1) {
        field800++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + ((var3 << 5) - var3);
        }
        return arg0 > -121 ? 18 : var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 48)
    public static final void method415(byte arg0) {
        field801++;
        if (class313.field4317 == 0 || class313.field4317 == 6) {
            return;
        }
        if (arg0 != -18) {
            method414(0, null);
        }
        try {
            if ((++class625.field9209) > 2000) {
                if (class296.field4075 != null) {
                    class296.field4075.method1830(arg0 ^ 0xFFFFFFB0);
                    class296.field4075 = null;
                }
                if (class631.field9272 >= 1) {
                    class313.field4317 = 0;
                    class469.method2832(-58, -5);
                    return;
                }
                class625.field9209 = 0;
                class313.field4317 = 1;
                if (class378.field5211 == 2 || class378.field5211 == 3) {
                    class286.field3993.field5712 = !class286.field3993.field5712;
                } else {
                    class471.field6659.field5712 = !class471.field6659.field5712;
                }
                class631.field9272++;
            }
            if (class313.field4317 == 1) {
                if (class378.field5211 == 2 || class378.field5211 == 3) {
                    class641.field9339 = class442.field5896.method2023(class286.field3993.field5719, class286.field3993.method2483(-97), 0);
                } else {
                    class641.field9339 = class442.field5896.method2023(class471.field6659.field5719, class471.field6659.method2483(arg0 ^ 0x57), 0);
                }
                class313.field4317 = 2;
            }
            if (class313.field4317 == 2) {
                if (class641.field9339.field202 == 2) {
                    throw new IOException();
                }
                if (class641.field9339.field202 != 1) {
                    return;
                }
                class296.field4075 = class15.method106(5000, (Socket) class641.field9339.field201, (byte) -51);
                class641.field9339 = null;
                long var1 = class515.field7350 = class42.method270(class569.field8400, arg0 + 96);
                class112.field1589.field2177 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class112.field1589.method1049(-1, class204.field3008.field6526);
                class112.field1589.method1049(arg0 ^ 0x11, var3);
                class296.field4075.method1829(2, 82, 0, class112.field1589.field2146);
                class313.field4317 = 3;
            }
            if (class313.field4317 == 3) {
                if (!class296.field4075.method1831(false, 1)) {
                    return;
                }
                class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                int var4 = class632.field9278.field2146[0] & 0xFF;
                if (var4 != 0) {
                    class313.field4317 = 0;
                    class469.method2832(-80, var4);
                    class296.field4075.method1830(arg0 + 20);
                    class296.field4075 = null;
                    class185.method1285(-9);
                    return;
                }
                class313.field4317 = 4;
            }
            if (class313.field4317 == 4) {
                if (!class296.field4075.method1831(false, 8)) {
                    return;
                }
                class296.field4075.method1833(8, (byte) 3, class632.field9278.field2146, 0);
                class632.field9278.field2177 = 0;
                class14.field141 = class632.field9278.method1004((byte) 42);
                class148 var5 = new class148(518);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class14.field141 >> 32), (int) class14.field141 };
                var5.method1049(-1, 10);
                var5.method1058(602643080, var6[0]);
                var5.method1058(602643080, var6[1]);
                var5.method1058(602643080, var6[2]);
                var5.method1058(602643080, var6[3]);
                var5.method1025(-496560248, class42.method270(class569.field8400, 104));
                var5.method1050((byte) 32, class537.field8006);
                var5.method1025(arg0 - 496560230, class18.field162);
                var5.method1025(-496560248, class622.field9161);
                var5.method1020(class289.field4019, class389.field5349, false);
                class574 var7 = class112.field1589;
                var7.field2177 = 0;
                if (class378.field5211 == 2 || class378.field5211 == 3) {
                    if (class472.field6670 == 12) {
                        var7.method1049(-1, class204.field3013.field6526);
                    } else {
                        var7.method1049(-1, class204.field3011.field6526);
                    }
                    var7.method1027(255, 0);
                    int var8 = var7.field2177;
                    var7.method1058(602643080, 609);
                    var7.method1049(arg0 + 17, class84.field1208);
                    var7.method1049(-1, class609.method3580(true));
                    var7.method1027(arg0 ^ 0xFFFFFF11, class165.field2605);
                    var7.method1027(arg0 ^ 0xFFFFFF11, class47.field562);
                    var7.method1049(-1, class56.field668.field6831);
                    class507.method3014(var7, 96);
                    var7.method1050((byte) 32, class595.field8788);
                    var7.method1058(602643080, class476.field6747);
                    class148 var9 = new class148(class604.method3563((byte) -31));
                    class56.field668.method2898((byte) 11, var9);
                    var7.method1049(-1, var9.field2177);
                    var7.method1030(var9.field2146, var9.field2177, (byte) -3, 0);
                    class508.field7214 = true;
                    class148 var10 = new class148(class283.method1764(false));
                    (new class76(true, class442.field5896)).method591((byte) 121, var10);
                    var7.method1030(var10.field2146, var10.field2146.length, (byte) -3, 0);
                    var7.method1027(255, class404.field5531);
                    class182.method1267(21653);
                    var7.method1030(var5.field2146, var5.field2177, (byte) -3, 0);
                    var7.method1009((byte) 120, var7.field2177 - var8);
                } else {
                    var7.method1049(-1, class204.field3014.field6526);
                    var7.method1027(255, 0);
                    int var11 = var7.field2177;
                    var7.method1058(arg0 + 602643098, 609);
                    var7.method1049(-1, class348.field4768.field470);
                    var7.method1049(-1, class63.field795);
                    class507.method3014(var7, 79);
                    var7.method1050((byte) 32, class595.field8788);
                    var7.method1058(602643080, class476.field6747);
                    class182.method1267(21653);
                    var7.method1030(var5.field2146, var5.field2177, (byte) -3, 0);
                    var7.method1009((byte) 120, var7.field2177 - var11);
                }
                class296.field4075.method1829(var7.field2177, arg0 ^ 0xFFFFFFBC, 0, var7.field2146);
                var7.method3419((byte) 85, var6);
                for (int var12 = 0; var12 < 4; var12++) {
                    var6[var12] += 50;
                }
                class632.field9278.method3419((byte) 54, var6);
                class313.field4317 = 5;
            }
            if (class313.field4317 == 5) {
                if (!class296.field4075.method1831(false, 1)) {
                    return;
                }
                class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                int var13 = class632.field9278.field2146[0] & 0xFF;
                if (var13 == 21) {
                    class313.field4317 = 8;
                } else if (var13 == 29) {
                    class313.field4317 = 14;
                } else if (var13 == 1) {
                    class313.field4317 = 6;
                    class469.method2832(arg0 - 89, var13);
                    return;
                } else if (var13 == 2) {
                    class313.field4317 = 9;
                } else if (var13 == 15) {
                    class313.field4317 = 15;
                    class333.field4615 = -2;
                } else if (var13 == 23 && class631.field9272 < 1) {
                    class625.field9209 = 0;
                    class313.field4317 = 1;
                    class631.field9272++;
                    class296.field4075.method1830(-122);
                    class296.field4075 = null;
                    return;
                } else {
                    class313.field4317 = 0;
                    class469.method2832(arg0 ^ 0x53, var13);
                    class296.field4075.method1830(42);
                    class296.field4075 = null;
                    class185.method1285(-9);
                    return;
                }
            }
            if (class313.field4317 == 7) {
                class112.field1589.field2177 = 0;
                class112.field1589.method3413(true, class204.field3021.field6526);
                class296.field4075.method1829(class112.field1589.field2177, 82, 0, class112.field1589.field2146);
                class313.field4317 = 5;
            } else if (class313.field4317 == 8) {
                if (class296.field4075.method1831(false, 1)) {
                    class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                    int var14 = class632.field9278.field2146[0] & 0xFF;
                    class313.field4317 = 0;
                    class161.field2375 = (var14 + 3) * 60;
                    class469.method2832(arg0 - 23, 21);
                    class296.field4075.method1830(68);
                    class296.field4075 = null;
                    class185.method1285(-9);
                }
            } else if (class313.field4317 == 14) {
                if (class296.field4075.method1831(false, 1)) {
                    class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                    class114.field1602 = class632.field9278.field2146[0] & 0xFF;
                    class313.field4317 = 0;
                    class469.method2832(-102, 29);
                    class296.field4075.method1830(32);
                    class296.field4075 = null;
                    class185.method1285(arg0 + 9);
                }
            } else if (class313.field4317 != 9) {
                if (class313.field4317 == 10) {
                    if (class378.field5211 == 3) {
                        class644.field9381 = true;
                    } else {
                        class644.field9381 = false;
                    }
                    class574 var15 = class632.field9278;
                    if (class378.field5211 == 2 || class378.field5211 == 3) {
                        if (!class296.field4075.method1831(false, class565.field8369)) {
                            return;
                        }
                        class296.field4075.method1833(class565.field8369, (byte) 3, var15.field2146, 0);
                        var15.field2177 = 0;
                        class163.field2578 = var15.method1032((byte) -33);
                        class584.field8574 = var15.method1032((byte) -33);
                        class266.field3763 = var15.method1032((byte) -33) == 1;
                        class510.field7259 = var15.method1032((byte) -33) == 1;
                        class389.field5375 = var15.method1032((byte) -33) == 1;
                        class228.field3340 = var15.method1032((byte) -33) == 1;
                        class183.field2758 = var15.method1045(true);
                        class100.field1459 = var15.method1032((byte) -33) == 1;
                        class49.field574 = var15.method1029(-64);
                        class106.field1534 = var15.method1032((byte) -33) == 1;
                        if (class378.field5211 == 3) {
                            boolean var16 = var15.method1032((byte) -33) == 1;
                            if (var16) {
                                long var17 = var15.method1004((byte) 27);
                                String var19 = class217.method1415(var17, -90);
                                int var20 = var15.method1032((byte) -33);
                                byte[] var21 = new byte[var20];
                                var15.method3418(0, var21, var20, -77);
                                String var22 = class54.method350(var21, 1);
                                class633 var23 = null;
                                try {
                                    class21 var24 = class442.field5896.method2019("3", true, false);
                                    while (var24.field202 == 0) {
                                        class236.method1513(true, 1L);
                                    }
                                    if (var24.field202 == 1) {
                                        var23 = (class633) var24.field201;
                                        int var25 = var19.length() + (2 - -var22.length() - -2) + 4 + 3;
                                        if (var25 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class148 var26 = new class148(var25 + 1);
                                        var26.method1049(-1, var25);
                                        var26.method1049(-1, 1);
                                        var26.method1019(var19, (byte) 123);
                                        var26.method1019(var22, (byte) -95);
                                        var26.method1027(255, class476.field6747);
                                        var26.method1070((byte) -111);
                                        var23.method3682((byte) -13, var26.field2146, var26.field2177, 0);
                                    }
                                } catch (Exception var36) {
                                }
                                try {
                                    if (var23 != null) {
                                        var23.method3685(arg0 - 5930);
                                    }
                                } catch (Exception var34) {
                                }
                                try {
                                    class640.method3702(class442.field5896.field4568, (byte) -120, "demoaccountcreated");
                                } catch (Throwable var33) {
                                }
                            }
                        }
                        class216.field3172.method1495((byte) 15, class106.field1534);
                        class150.field2242.method3599(class106.field1534, -111);
                        class64.field797.method1176(class106.field1534, 9719);
                    } else if (class296.field4075.method1831(false, class565.field8369)) {
                        class296.field4075.method1833(class565.field8369, (byte) 3, var15.field2146, 0);
                        var15.field2177 = 0;
                        class163.field2578 = var15.method1032((byte) -33);
                        class584.field8574 = var15.method1032((byte) -33);
                        class266.field3763 = var15.method1032((byte) -33) == 1;
                        class510.field7259 = var15.method1032((byte) -33) == 1;
                        class389.field5375 = var15.method1032((byte) -33) == 1;
                        class556.field8281 = var15.method1045(true);
                        class100.field1459 = class556.field8281 > 0;
                        class539.field8025 = var15.method1045(true);
                        class117.field1643 = var15.method1045(true);
                        class120.field1691 = var15.method1045(true);
                        class144.field2011 = var15.method1026(arg0 - 917302102);
                        class283.field3960 = class442.field5896.method2024(-106, class144.field2011);
                        class452.field6386 = var15.method1032((byte) -33);
                        class596.field8822 = var15.method1045(true);
                        class24.field234 = var15.method1045(true);
                        class223.field3233 = var15.method1032((byte) -33) == 1;
                        class541.field8119.field5138 = class541.field8119.field5141 = var15.method1039(arg0 ^ 0xFFFFFF99);
                        class410.field5611 = new class423();
                        class410.field5611.field5709 = var15.method1045(true);
                        if (class410.field5611.field5709 == 65535) {
                            class410.field5611.field5709 = -1;
                        }
                        class410.field5611.field5719 = var15.method1039(-104);
                        if (class577.field8514 != class186.field2781) {
                            class410.field5611.field5711 = class410.field5611.field5709 + 50000;
                            class410.field5611.field5710 = class410.field5611.field5709 + 40000;
                        }
                        if (class577.field8514 != class301.field4131 && (class286.field3993.method2486(0, field802) || class286.field3993.method2486(0, class560.field8329))) {
                            class278.method1743(30);
                        }
                    } else {
                        return;
                    }
                    if ((!class266.field3763 || class389.field5375) && !class100.field1459) {
                        try {
                            class640.method3702(class442.field5896.field4568, (byte) -51, "unzap");
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class640.method3702(class442.field5896.field4568, (byte) -97, "zap");
                        } catch (Throwable var35) {
                            if (class165.field2608) {
                                try {
                                    class442.field5896.field4568.getAppletContext().showDocument(new URL(class442.field5896.field4568.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var32) {
                                }
                            }
                        }
                    }
                    if (class577.field8514 == class186.field2781) {
                        try {
                            class640.method3702(class442.field5896.field4568, (byte) 96, "loggedin");
                        } catch (Throwable var30) {
                        }
                    }
                    if (class378.field5211 != 2 && class378.field5211 != 3) {
                        class313.field4317 = 0;
                        class469.method2832(-39, 2);
                        class188.method1293(-25147);
                        class18.method117((byte) -85, 6);
                        class234.field3399 = null;
                        return;
                    }
                    class313.field4317 = 12;
                }
                if (class313.field4317 == 12) {
                    if (!class296.field4075.method1831(false, 3)) {
                        return;
                    }
                    class296.field4075.method1833(3, (byte) 3, class632.field9278.field2146, 0);
                    class313.field4317 = 13;
                }
                if (class313.field4317 == 13) {
                    class574 var27 = class632.field9278;
                    var27.field2177 = 0;
                    if (var27.method3415(72)) {
                        if (!class296.field4075.method1831(false, 1)) {
                            return;
                        }
                        class296.field4075.method1833(1, (byte) 3, var27.field2146, 3);
                    }
                    class234.field3399 = class459.method2784(-74)[var27.method3422(811664354)];
                    class333.field4615 = var27.method1045(true);
                    class313.field4317 = 11;
                }
                if (class313.field4317 == 11) {
                    if (class296.field4075.method1831(false, class333.field4615)) {
                        class296.field4075.method1833(class333.field4615, (byte) 3, class632.field9278.field2146, 0);
                        class632.field9278.field2177 = 0;
                        class313.field4317 = 0;
                        int var28 = class333.field4615;
                        class469.method2832(arg0 - 44, 2);
                        class345.method2105((byte) -128);
                        class568.method3392(class632.field9278, arg0 ^ 0xFFFFFF87);
                        class188.field2802 = -1;
                        class580.method3468((byte) 38);
                        if (class632.field9278.field2177 != var28) {
                            throw new RuntimeException("lswp pos:" + class632.field9278.field2177 + " psize:" + var28);
                        }
                        class234.field3399 = null;
                    }
                } else if (class313.field4317 == 15) {
                    if (class333.field4615 == -2) {
                        if (!class296.field4075.method1831(false, 2)) {
                            return;
                        }
                        class296.field4075.method1833(2, (byte) 3, class632.field9278.field2146, 0);
                        class632.field9278.field2177 = 0;
                        class333.field4615 = class632.field9278.method1045(true);
                    }
                    if (class296.field4075.method1831(false, class333.field4615)) {
                        class296.field4075.method1833(class333.field4615, (byte) 3, class632.field9278.field2146, 0);
                        class632.field9278.field2177 = 0;
                        int var29 = class333.field4615;
                        class313.field4317 = 0;
                        class469.method2832(-88, 15);
                        class379.method2262(0);
                        class568.method3392(class632.field9278, 121);
                        if (class632.field9278.field2177 != var29) {
                            throw new RuntimeException("lswpr pos:" + class632.field9278.field2177 + " psize:" + var29);
                        }
                        class234.field3399 = null;
                    }
                }
            } else if (class296.field4075.method1831(false, 1)) {
                class296.field4075.method1833(1, (byte) 3, class632.field9278.field2146, 0);
                class313.field4317 = 10;
                class565.field8369 = class632.field9278.field2146[0] & 0xFF;
            }
        } catch (IOException var37) {
            if (class296.field4075 != null) {
                class296.field4075.method1830(-123);
                class296.field4075 = null;
            }
            if (class631.field9272 >= 1) {
                class313.field4317 = 0;
                class469.method2832(arg0 - 87, -4);
                class185.method1285(-9);
            } else {
                class625.field9209 = 0;
                if (class378.field5211 == 2 || class378.field5211 == 3) {
                    class286.field3993.field5712 = !class286.field3993.field5712;
                } else {
                    class471.field6659.field5712 = !class471.field6659.field5712;
                }
                class313.field4317 = 1;
                class631.field9272++;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 690)
    public static void method416(int arg0) {
        field802 = null;
        if (arg0 != -2239) {
            method414(-35, null);
        }
        field806 = null;
    }
}
