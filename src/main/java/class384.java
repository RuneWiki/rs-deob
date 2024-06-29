import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class384 extends class228 {

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    private int field5286 = -1;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    private int field5284 = -1;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "Lbn;")
    public static class378 field5285 = new class378(12, 4);

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "[S")
    public static short[] field5288;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "[I")
    public static int[] field5287;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lte;IIZ[[BI)V")
    public class384(class527 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5280 = arg2;
        super.field3325.method3152(-2, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(34069 - -var7, 0, super.field3319, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public static final void method2286(int arg0) {
        ++field5281;
        if (~class525.field7521 < -2) {
            class564.field8362 = class226.field3283;
            --class525.field7521;
        }
        if (class152.field2301) {
            class152.field2301 = false;
            class641.method3704(12);
        } else {
            if (!class446.field6245) {
                class589.method3497(false);
            }
            for (int var1 = 0; var1 < 100 && class24.method147(arg0 + -34051); ++var1) {
            }
            if (class472.field6670 == 9) {
                class300.method1837(-3, class112.field1589, class345.field4747.method3585(true));
                if (class589.field8745 != null) {
                    if (class589.field8745.field9292 != -1) {
                        class402.method2367(class457.field6460, (byte) 68);
                        class112.field1589.method1027(255, class589.field8745.field9292);
                        class589.field8745 = null;
                        class115.field1611 = class598.method3538(true) - -30000L;
                    }
                } else if (class598.method3538(true) >= class115.field1611) {
                    class589.field8745 = class97.field1413.method1705(arg0 ^ 34160, class286.field3993.field5719);
                }
                class68 var2 = (class68) class367.field5074.method124((byte) 42);
                if (var2 != null || ~class565.field8368 > ~(class598.method3538(true) - 2000L)) {
                    boolean var3 = false;
                    int var4 = class112.field1589.field2177;
                    for (class68 var5 = (class68) class158.field2358.method124((byte) 42); var5 != null && -var4 + class112.field1589.field2177 < 240; var5 = (class68) class158.field2358.method120(-96)) {
                        var5.method2457(-8422);
                        int var6 = var5.method532((byte) 108);
                        if (~var6 > 0) {
                            var6 = -1;
                        } else if (var6 > 65534) {
                            var6 = 65534;
                        }
                        int var7 = var5.method536(false);
                        if (~var7 > 0) {
                            var7 = -1;
                        } else if (~var7 < -65535) {
                            var7 = 65534;
                        }
                        if (~class437.field5832 != ~var7 || ~class450.field6326 != ~var6) {
                            if (!var3) {
                                class402.method2367(class366.field5041, (byte) 114);
                                ++class44.field525;
                                class112.field1589.method1049(-1, 0);
                                var4 = class112.field1589.field2177;
                                var3 = true;
                            }
                            int var8 = -class437.field5832 + var7;
                            class437.field5832 = var7;
                            int var9 = -class450.field6326 + var6;
                            class450.field6326 = var6;
                            int var10 = (int) ((var5.method537((byte) 95) - class565.field8368) / 20L);
                            if (var10 < 8 && var8 >= -32 && var8 <= 31 && ~var9 <= 31 && ~var9 >= -32) {
                                var9 += 32;
                                var8 += 32;
                                class112.field1589.method1027(arg0 ^ 34284, (var10 << 12) + (var8 << 6) + var9);
                            } else if (~var10 > -33 && var8 >= -128 && var8 <= 127 && ~var9 <= 127 && ~var9 >= -128) {
                                var9 += 128;
                                var8 += 128;
                                class112.field1589.method1049(arg0 + -34068, var10 + 128);
                                class112.field1589.method1027(arg0 + -33812, (var8 << 8) - -var9);
                            } else if (~var10 > -33) {
                                class112.field1589.method1049(-1, var10 + 192);
                                if (~var7 != -2 && var6 != -1) {
                                    class112.field1589.method1058(602643080, var6 << 16 | var7);
                                } else {
                                    class112.field1589.method1058(602643080, Integer.MIN_VALUE);
                                }
                            } else {
                                class112.field1589.method1027(arg0 + -33812, var10 + 57344);
                                if (var7 != 1 && ~var6 != 0) {
                                    class112.field1589.method1058(602643080, var6 << 16 | var7);
                                } else {
                                    class112.field1589.method1058(602643080, Integer.MIN_VALUE);
                                }
                            }
                            class565.field8368 = var5.method537((byte) 123);
                        }
                    }
                    if (var3) {
                        class112.field1589.method1066(-var4 + class112.field1589.field2177, -127);
                    }
                }
                if (var2 != null) {
                    long var11 = (var2.method537((byte) -69) - class546.field8153) / 50L;
                    if (~var11 < -32768L) {
                        var11 = 32767L;
                    }
                    class546.field8153 = var2.method537((byte) 125);
                    int var13 = var2.method532((byte) 108);
                    if (var13 >= 0) {
                        if (var13 > 65535) {
                            var13 = 65535;
                        }
                    } else {
                        var13 = 0;
                    }
                    int var14 = var2.method536(false);
                    if (~var14 <= -1) {
                        if (var14 > 65535) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    byte var15 = 0;
                    if (~var2.method541(30818) == -3) {
                        var15 = 1;
                    }
                    ++class106.field1518;
                    int var16 = (int) var11;
                    class402.method2367(class577.field8512, (byte) 105);
                    class112.field1589.method1069(var13 << 16 | var14, 1440784936);
                    class112.field1589.method1008(false, var15 << 15 | var16);
                }
                if (~class502.field7113 < -1) {
                    ++class25.field263;
                    class402.method2367(class539.field8022, (byte) 96);
                    class112.field1589.method1049(arg0 ^ -34068, class502.field7113 * 3);
                    for (int var17 = 0; var17 < class502.field7113; ++var17) {
                        class109 var18 = class106.field1519[var17];
                        long var19 = (var18.method800((byte) 60) - class135.field1846) / 50L;
                        if (var19 > 65535L) {
                            var19 = 65535L;
                        }
                        class135.field1846 = var18.method800((byte) -127);
                        class112.field1589.method1049(-1, var18.method802(-25));
                        class112.field1589.method1027(255, (int) var19);
                    }
                }
                if (~class116.field1632 < -1) {
                    --class116.field1632;
                }
                if (class24.field226 && ~class116.field1632 >= -1) {
                    ++class46.field553;
                    class24.field226 = false;
                    class116.field1632 = 20;
                    class402.method2367(class435.field5823, (byte) 115);
                    class112.field1589.method1012(976668456, (int) class278.field3902 >> 3);
                    class112.field1589.method1008(false, (int) class539.field8023 >> 3);
                }
                if (class105.field1516 && !class473.field6689) {
                    ++class442.field5898;
                    class473.field6689 = true;
                    class402.method2367(class188.field2796, (byte) 110);
                    class112.field1589.method1049(-1, 1);
                }
                if (!class105.field1516 && class473.field6689) {
                    class473.field6689 = false;
                    ++class442.field5898;
                    class402.method2367(class188.field2796, (byte) 121);
                    class112.field1589.method1049(-1, 0);
                }
                if (!class508.field7214) {
                    ++class125.field1757;
                    class402.method2367(class212.field3121, (byte) 115);
                    class112.field1589.method1049(arg0 ^ -34068, 0);
                    int var21 = class112.field1589.field2177;
                    class148 var22 = new class148(class604.method3563((byte) -31));
                    class56.field668.method2898((byte) 11, var22);
                    class112.field1589.method1030(var22.field2146, var22.field2177, (byte) -3, 0);
                    class112.field1589.method1066(class112.field1589.field2177 - var21, arg0 ^ -34157);
                    class508.field7214 = true;
                }
                if (class420.field5697 != null) {
                    if (~class531.field7929 == -3) {
                        class372.method2222(128);
                    } else if (~class531.field7929 == -4) {
                        class116.method832(arg0 ^ 34064);
                    }
                }
                if (class309.field4268) {
                    class309.field4268 = false;
                } else {
                    class308.field4258 /= 2.0F;
                }
                if (!class190.field2830) {
                    class92.field1389 /= 2.0F;
                } else {
                    class190.field2830 = false;
                }
                class451.method2735(arg0 ^ 34073);
                if (~class472.field6670 == -10) {
                    class80.method609(283268810);
                    class325.method1951((byte) 18);
                    class183.method1277(-31029);
                    class599.method3539(1);
                    ++class554.field8256;
                    if (arg0 == 34067) {
                        if (class554.field8256 > 750) {
                            class641.method3704(12);
                        } else {
                            class642.method3715((byte) -91);
                            class416.method2451((byte) 120);
                            class378.method2259(-1);
                            for (int var23 = class556.field8280.method2291(true, true); ~var23 != 0; var23 = class556.field8280.method2291(false, true)) {
                                class112.method819(80, var23);
                                class621.field9157[class37.method245(class103.field1481++, 31)] = var23;
                            }
                            for (class221 var24 = class121.method866((byte) 105); var24 != null; var24 = class121.method866((byte) 105)) {
                                int var25 = var24.method1431((byte) 122);
                                int var26 = var24.method1429((byte) 118);
                                if (var25 != 1) {
                                    if (~var25 != -3) {
                                        if (var25 != 3) {
                                            if (~var25 != -5) {
                                                if (var25 != 5) {
                                                    if (~var25 == -7) {
                                                        int var27 = var24.field3214;
                                                        int var28 = (32132 & var27) >> 10;
                                                        int var29 = (1023 & var27) >> 5;
                                                        int var30 = var27 & 31;
                                                        int var31 = (var30 << 3) + ((var28 << 19) - -(var29 << 11));
                                                        class162 var32 = class153.method1117(var26, -30170);
                                                        if (~var32.field2421 != ~var31) {
                                                            var32.field2421 = var31;
                                                            class403.method2371(var32, (byte) -62);
                                                        }
                                                    } else if (var25 != 7) {
                                                        if (var25 == 8) {
                                                            class162 var33 = class153.method1117(var26, -30170);
                                                            if (~var24.field3214 != ~var33.field2409 || ~var24.field3208 != ~var33.field2468 || ~var24.field3220 != ~var33.field2558) {
                                                                var33.field2409 = var24.field3214;
                                                                var33.field2558 = var24.field3220;
                                                                var33.field2468 = var24.field3208;
                                                                if (var33.field2434 != -1) {
                                                                    if (~var33.field2512 >= -1) {
                                                                        if (~var33.field2450 < -1) {
                                                                            var33.field2558 = var33.field2558 * 32 / var33.field2450;
                                                                        }
                                                                    } else {
                                                                        var33.field2558 = var33.field2558 * 32 / var33.field2512;
                                                                    }
                                                                }
                                                                class403.method2371(var33, (byte) -62);
                                                            }
                                                        } else if (var25 == 9) {
                                                            class162 var34 = class153.method1117(var26, arg0 ^ -61643);
                                                            if (~var24.field3214 != ~var34.field2434 || var24.field3208 != var34.field2444) {
                                                                var34.field2444 = var24.field3208;
                                                                var34.field2434 = var24.field3214;
                                                                class403.method2371(var34, (byte) -62);
                                                            }
                                                        } else if (var25 == 10) {
                                                            class162 var35 = class153.method1117(var26, -30170);
                                                            if (~var24.field3214 != ~var35.field2408 || ~var24.field3208 != ~var35.field2410 || ~var24.field3220 != ~var35.field2482) {
                                                                var35.field2482 = var24.field3220;
                                                                var35.field2408 = var24.field3214;
                                                                var35.field2410 = var24.field3208;
                                                                class403.method2371(var35, (byte) -62);
                                                            }
                                                        } else if (var25 == 11) {
                                                            class162 var36 = class153.method1117(var26, -30170);
                                                            var36.field2504 = 0;
                                                            var36.field2461 = 0;
                                                            var36.field2507 = var36.field2484 = var24.field3208;
                                                            var36.field2449 = var36.field2403 = var24.field3214;
                                                            class403.method2371(var36, (byte) -62);
                                                        } else if (var25 == 12) {
                                                            class162 var37 = class153.method1117(var26, -30170);
                                                            int var38 = var24.field3214;
                                                            if (var37 != null && var37.field2552 == 0) {
                                                                if (~var38 < ~(-var37.field2459 + var37.field2505)) {
                                                                    var38 = -var37.field2459 + var37.field2505;
                                                                }
                                                                if (var38 < 0) {
                                                                    var38 = 0;
                                                                }
                                                                if (~var37.field2404 != ~var38) {
                                                                    var37.field2404 = var38;
                                                                    class403.method2371(var37, (byte) -62);
                                                                }
                                                            }
                                                        } else if (var25 != 14) {
                                                            if (~var25 != -16) {
                                                                if (~var25 == -17) {
                                                                    class162 var39 = class153.method1117(var26, -30170);
                                                                    var39.field2544 = var24.field3214;
                                                                }
                                                            } else {
                                                                class618.field9137 = var24.field3214;
                                                                class5.field45 = true;
                                                                class349.field4776 = var24.field3208;
                                                            }
                                                        } else {
                                                            class162 var40 = class153.method1117(var26, -30170);
                                                            var40.field2490 = var24.field3214;
                                                        }
                                                    } else {
                                                        class162 var41 = class153.method1117(var26, -30170);
                                                        boolean var42 = ~var24.field3214 == -2;
                                                        if (!var42 != !var41.field2534) {
                                                            var41.field2534 = var42;
                                                            class403.method2371(var41, (byte) -62);
                                                        }
                                                    }
                                                } else {
                                                    class162 var43 = class153.method1117(var26, -30170);
                                                    if (~var24.field3214 != ~var43.field2489 || var24.field3214 == -1) {
                                                        var43.field2489 = var24.field3214;
                                                        var43.field2506 = 1;
                                                        var43.field2438 = 0;
                                                        var43.field2528 = 0;
                                                        class403.method2371(var43, (byte) -62);
                                                    }
                                                }
                                            } else {
                                                class162 var44 = class153.method1117(var26, arg0 + -64237);
                                                int var45 = var24.field3214;
                                                int var46 = var24.field3208;
                                                int var47 = var24.field3220;
                                                if (var44.field2529 != var45 || ~var44.field2532 != ~var46 || ~var44.field2509 != ~var47) {
                                                    var44.field2509 = var47;
                                                    var44.field2532 = var46;
                                                    var44.field2529 = var45;
                                                    class403.method2371(var44, (byte) -62);
                                                }
                                            }
                                        } else {
                                            class162 var48 = class153.method1117(var26, arg0 + -64237);
                                            if (!var24.field3218.equals(var48.field2470)) {
                                                var48.field2470 = var24.field3218;
                                                class403.method2371(var48, (byte) -62);
                                            }
                                        }
                                    } else {
                                        class569.field8398[var26] = var24.field3218;
                                        class415.field5634[class37.method245(class506.field7158++, 31)] = var26;
                                    }
                                } else {
                                    class624.field9201[var26] = var24.field3214;
                                    class348.field4774 |= class428.field5753[var26];
                                    class619.field9146[class37.method245(class483.field6885++, 31)] = var26;
                                }
                            }
                            if (~class50.field589 != -1) {
                                class588.field8730 += 20;
                                if (class588.field8730 >= 400) {
                                    class50.field589 = 0;
                                }
                            }
                            ++class647.field9402;
                            if (class366.field5044 != null) {
                                ++class452.field6387;
                                if (~class452.field6387 <= -16) {
                                    class403.method2371(class366.field5044, (byte) -62);
                                    class366.field5044 = null;
                                }
                            }
                            class200.field2951 = false;
                            class437.field5843 = null;
                            class569.field8395 = null;
                            class394.field5425 = false;
                            class586.method3487((class162) null, arg0 ^ -1556711824, -1, -1);
                            class149.method1072(-1, -1, (byte) -100, (class162) null);
                            if (!class606.field9002) {
                                class574.field8454 = -1;
                            }
                            class632.method3678(0);
                            ++class226.field3283;
                            if (class506.field7151) {
                                class402.method2367(class616.field9115, (byte) 104);
                                ++class197.field2911;
                                class112.field1589.method1069(class558.field8288 << 28 | class542.field8121 << 14 | class171.field2660, 1440784936);
                                class506.field7151 = false;
                            }
                            while (true) {
                                class518 var49;
                                class162 var50;
                                class162 var51;
                                do {
                                    var49 = (class518) class94.field1399.method128(936);
                                    if (var49 == null) {
                                        while (true) {
                                            class518 var52;
                                            class162 var53;
                                            class162 var54;
                                            do {
                                                var52 = (class518) class192.field2858.method128(arg0 + -33131);
                                                if (var52 == null) {
                                                    while (true) {
                                                        class518 var55;
                                                        class162 var56;
                                                        class162 var57;
                                                        do {
                                                            var55 = (class518) class272.field3848.method128(936);
                                                            if (var55 == null) {
                                                                if (class437.field5843 == null) {
                                                                    class171.field2665 = 0;
                                                                }
                                                                if (class307.field4210 != null) {
                                                                    class397.method2357((byte) 121);
                                                                }
                                                                if (~class163.field2578 < -1 && class24.field237.method1788(16, 82) && class24.field237.method1788(16, 81) && class185.field2777 != 0) {
                                                                    int var58 = class541.field8119.field8501 - class185.field2777;
                                                                    if (~var58 > -1) {
                                                                        var58 = 0;
                                                                    } else if (var58 > 3) {
                                                                        var58 = 3;
                                                                    }
                                                                    class351.method2123(-46, var58, class541.field8119.field1955[0] + class38.field463, class473.field6687 - -class541.field8119.field1957[0]);
                                                                }
                                                                class558.method3365(100);
                                                                for (int var59 = 0; ~var59 > -6; ++var59) {
                                                                    int var10002 = class365.field5031[var59]++;
                                                                }
                                                                if (class348.field4774 && class9.field99 < -60000L + class598.method3538(true)) {
                                                                    class76.method589(1);
                                                                }
                                                                for (class626 var60 = (class626) class200.field2941.method2233(true); var60 != null; var60 = (class626) class200.field2941.method2240(16772)) {
                                                                    if ((long) var60.field9225 < -5L + class598.method3538(true) / 1000L) {
                                                                        if (~var60.field9223 < -1) {
                                                                            class336.method2053("", "", 5, arg0 ^ 34095, 0, var60.field9218 + class192.field2856.method3408(79, class63.field795));
                                                                        }
                                                                        if (var60.field9223 == 0) {
                                                                            class336.method2053("", "", 5, arg0 + -34003, 0, var60.field9218 + class308.field4247.method3408(104, class63.field795));
                                                                        }
                                                                        var60.method1783((byte) 78);
                                                                    }
                                                                }
                                                                ++class169.field2632;
                                                                if (~class169.field2632 < -501) {
                                                                    class169.field2632 = 0;
                                                                    int var61 = (int) (8.0D * Math.random());
                                                                    if (~(1 & var61) == -2) {
                                                                        class131.field1807 += class344.field4744;
                                                                    }
                                                                    if (~(4 & var61) == -5) {
                                                                        class232.field3379 += class150.field2252;
                                                                    }
                                                                    if ((2 & var61) == 2) {
                                                                        class159.field2369 += class243.field3472;
                                                                    }
                                                                }
                                                                if (~class131.field1807 > 49) {
                                                                    class344.field4744 = 2;
                                                                }
                                                                if (~class131.field1807 < -51) {
                                                                    class344.field4744 = -2;
                                                                }
                                                                if (class159.field2369 < -55) {
                                                                    class243.field3472 = 2;
                                                                }
                                                                if (~class232.field3379 > 39) {
                                                                    class150.field2252 = 1;
                                                                }
                                                                if (class159.field2369 > 55) {
                                                                    class243.field3472 = -2;
                                                                }
                                                                if (class232.field3379 > 40) {
                                                                    class150.field2252 = -1;
                                                                }
                                                                ++class599.field8838;
                                                                if (class599.field8838 > 500) {
                                                                    class599.field8838 = 0;
                                                                    int var62 = (int) (Math.random() * 8.0D);
                                                                    if ((var62 & 2) == 2) {
                                                                        class449.field6301 += class527.field7729;
                                                                    }
                                                                    if ((var62 & 1) == 1) {
                                                                        class300.field4113 += class377.field5204;
                                                                    }
                                                                }
                                                                if (class300.field4113 < -60) {
                                                                    class377.field5204 = 2;
                                                                }
                                                                if (~class449.field6301 > 19) {
                                                                    class527.field7729 = 1;
                                                                }
                                                                if (~class300.field4113 < -61) {
                                                                    class377.field5204 = -2;
                                                                }
                                                                if (class449.field6301 > 10) {
                                                                    class527.field7729 = -1;
                                                                }
                                                                ++class379.field5228;
                                                                if (class379.field5228 > 50) {
                                                                    ++class297.field4085;
                                                                    class402.method2367(class480.field6822, (byte) 95);
                                                                }
                                                                if (class404.field5523) {
                                                                    class431.method2524(arg0 ^ 34148);
                                                                    class404.field5523 = false;
                                                                }
                                                                try {
                                                                    if (class296.field4075 != null && ~class112.field1589.field2177 < -1) {
                                                                        class312.field4304 += class112.field1589.field2177;
                                                                        class296.field4075.method1829(class112.field1589.field2177, arg0 ^ 34113, 0, class112.field1589.field2146);
                                                                        class379.field5228 = 0;
                                                                        class112.field1589.field2177 = 0;
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (IOException var63) {
                                                                    class641.method3704(arg0 ^ 34079);
                                                                    return;
                                                                }
                                                            }
                                                            var56 = var55.field7376;
                                                            if (var56.field2415 < 0) {
                                                                break;
                                                            }
                                                            var57 = class153.method1117(var56.field2483, arg0 ^ -61643);
                                                        } while (var57 == null || var57.field2462 == null || ~var56.field2415 <= ~var57.field2462.length || var57.field2462[var56.field2415] != var56);
                                                        class98.method757(var55);
                                                    }
                                                }
                                                var53 = var52.field7376;
                                                if (var53.field2415 < 0) {
                                                    break;
                                                }
                                                var54 = class153.method1117(var53.field2483, -30170);
                                            } while (var54 == null || var54.field2462 == null || ~var54.field2462.length >= ~var53.field2415 || var54.field2462[var53.field2415] != var53);
                                            class98.method757(var52);
                                        }
                                    }
                                    var50 = var49.field7376;
                                    if (var50.field2415 < 0) {
                                        break;
                                    }
                                    var51 = class153.method1117(var50.field2483, -30170);
                                } while (var51 == null || var51.field2462 == null || var50.field2415 >= var51.field2462.length || var51.field2462[var50.field2415] != var50);
                                class98.method757(var49);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)V")
    public static void method2287(byte arg0) {
        field5288 = null;
        if (arg0 != 102) {
            method2287((byte) -96);
        }
        field5287 = null;
        field5285 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method642(int arg0) {
        if (arg0 > -80) {
            this.method642(-39);
        }
        OpenGL.glFramebufferTexture2DEXT(this.field5284, this.field5286, 3553, 0, 0);
        ++field5283;
        this.field5286 = -1;
        this.field5284 = -1;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lte;II)V")
    public class384(class527 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5280 = arg2;
        super.field3325.method3152(-2, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field3319, arg2, arg2, 0, class372.method2220(118, super.field3319), 5121, (byte[]) null, 0);
        }
        this.method1460(true, -5286);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBI)V")
    public final void method2288(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field5279;
        OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.field3322, arg4);
        if (arg3 > -69) {
            method2286(-112);
        }
        this.field5284 = arg2;
        this.field5286 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lte;IIZ[[I)V")
    public class384(class527 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5280 = arg2;
        super.field3325.method3152(-2, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field3319, arg2, arg2, 0, 32993, super.field3325.field7869, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class195.method1317(arg2, super.field3325.field7869, -4090, super.field3319, arg2, arg4[var7], 32993, var7 + 34069);
            }
        }
        this.method1460(true, -5286);
    }

    static {
        new class572(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field5288 = new short[256];
        field5287 = new int[4];
    }
}
