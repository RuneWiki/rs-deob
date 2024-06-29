import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class508 {

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    private int field6964 = -1;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Z")
    public boolean field6965 = true;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    private int field6954;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Len;")
    private class289 field6951;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    private int field6953;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lmg;")
    private class134 field6967;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    private int field6962;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lqa;")
    private class224 field6960;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lho;")
    private class135 field6956;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lwaa;")
    private class646 field6959;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Lmaa;")
    public static class433 field6963 = new class433("", 12);

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field6968 = 0;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 3)
    public final void method2825(byte arg0) {
        field6955++;
        this.method2830(this.field6960, this.field6962, -97);
        if (arg0 != -126) {
            method2827(-54);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([BZII)V", line = 28)
    public final void method2826(byte[] arg0, boolean arg1, int arg2, int arg3) {
        this.field6956.method968(this.field6951.method1758(arg2, arg1) * arg3, arg0, -1842, arg2);
        field6957++;
        this.method2830(this.field6956, arg3, -112);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 38)
    public static void method2827(int arg0) {
        field6963 = null;
        if (arg0 != -29473) {
            method2828(-121);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 49)
    public static final void method2828(int arg0) {
        field6961++;
        if (class77.field1062 > 1) {
            class77.field1062--;
            class656.field9242 = class93.field1231;
        }
        if (class421.field5950) {
            class421.field5950 = false;
            class196.method1321(true);
            return;
        }
        if (!class229.field3278) {
            class72.method580(true);
        }
        for (int var1 = 0; var1 < 100 && class650.method3619(arg0 - 9671); var1++) {
        }
        if (class340.field4947 != 10) {
            return;
        }
        class435.method2498(class288.field4014, class548.field7421.method127(15633), (byte) 103);
        if (class622.field8659 == null) {
            if (class161.field2404 <= class680.method3756(arg0 ^ 0xFFFFDA5A)) {
                class622.field8659 = class486.field6740.method1226(class195.field2887.field5516, (byte) 49);
            }
        } else if (class622.field8659.field5096 != -1) {
            class1.method5(1, class290.field4381);
            class288.field4014.method731(-2045573048, class622.field8659.field5096);
            class622.field8659 = null;
            class161.field2404 = class680.method3756(-25) + 30000L;
        }
        class113 var2 = (class113) class441.field6211.method1270((byte) -25);
        if (var2 != null || (class680.method3756(arg0 - 9648) - 2000L) > class524.field7156) {
            boolean var3 = false;
            int var4 = class288.field4014.field1301;
            for (class113 var5 = (class113) class679.field9570.method1270((byte) -25); var5 != null && (class288.field4014.field1301 - var4) < 240; var5 = (class113) class679.field9570.method1282(arg0 ^ 0x2594)) {
                var5.method2971(arg0 ^ 0x2595);
                int var6 = var5.method840(116);
                if (var6 < -1) {
                    var6 = -1;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method847(-1);
                if (var7 < -1) {
                    var7 = -1;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                if (class138.field1935 != var7 || class302.field4472 != var6) {
                    if (!var3) {
                        class662.field9335++;
                        class1.method5(1, class506.field6919);
                        class288.field4014.method746((byte) -116, 0);
                        var3 = true;
                        var4 = class288.field4014.field1301;
                    }
                    int var8 = var7 - class138.field1935;
                    class138.field1935 = var7;
                    int var9 = var6 - class302.field4472;
                    class302.field4472 = var6;
                    int var10 = (int) ((var5.method843((byte) -120) - class524.field7156) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var8 += 32;
                        var9 += 32;
                        class288.field4014.method731(arg0 ^ 0x86132DDC, (var8 << 6) + (var10 << 12) + var9);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        var8 += 128;
                        class288.field4014.method746((byte) -98, var10 + 128);
                        class288.field4014.method731(-2045573048, (var8 << 8) + var9);
                    } else if (var10 < 32) {
                        class288.field4014.method746((byte) -93, var10 + 192);
                        if (var7 == 1 || var6 == -1) {
                            class288.field4014.method741(Integer.MIN_VALUE, (byte) 27);
                        } else {
                            class288.field4014.method741(var7 | var6 << 16, (byte) 27);
                        }
                    } else {
                        class288.field4014.method731(-2045573048, var10 + 57344);
                        if (var7 == 1 || var6 == -1) {
                            class288.field4014.method741(Integer.MIN_VALUE, (byte) 27);
                        } else {
                            class288.field4014.method741(var6 << 16 | var7, (byte) 27);
                        }
                    }
                    class524.field7156 = var5.method843((byte) -122);
                }
            }
            if (var3) {
                class288.field4014.method755(arg0 - 9505, -var4 + class288.field4014.field1301);
            }
        }
        if (var2 != null) {
            long var11 = (var2.method843((byte) -124) - class564.field7620) / 50L;
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            class564.field7620 = var2.method843((byte) -113);
            int var13 = var2.method840(127);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = var2.method847(arg0 - 9621);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (var2.method844(81) == 2) {
                var15 = 1;
            }
            class622.field8663++;
            class1.method5(1, class629.field8785);
            int var16 = (int) var11;
            class288.field4014.method705(true, var13 << 16 | var14);
            class288.field4014.method757(true, var15 << 15 | var16);
        }
        if (class438.field6178 > 0) {
            class177.field2628++;
            class1.method5(1, class331.field4867);
            class288.field4014.method746((byte) -118, class438.field6178 * 3);
            for (int var17 = 0; var17 < class438.field6178; var17++) {
                class109 var18 = class451.field6299[var17];
                long var19 = (var18.method819((byte) 116) - class511.field6993) / 50L;
                if (var19 > 65535L) {
                    var19 = 65535L;
                }
                class511.field6993 = var18.method819((byte) 114);
                class288.field4014.method746((byte) -118, var18.method816(12377));
                class288.field4014.method731(-2045573048, (int) var19);
            }
        }
        if (class38.field506 > 0) {
            class38.field506--;
        }
        if (arg0 != 9620) {
            return;
        }
        if (class586.field8200 && class38.field506 <= 0) {
            class38.field506 = 20;
            class586.field8200 = false;
            class199.field2938++;
            class1.method5(1, class7.field69);
            class288.field4014.method731(-2045573048, (int) class646.field9167 >> 3);
            class288.field4014.method752(81, (int) class249.field3516 >> 3);
        }
        if (class368.field5268 && !class152.field2268) {
            class645.field9154++;
            class152.field2268 = true;
            class1.method5(arg0 ^ 0x2595, class628.field8760);
            class288.field4014.method746((byte) -127, 1);
        }
        if (!class368.field5268 && class152.field2268) {
            class152.field2268 = false;
            class645.field9154++;
            class1.method5(1, class628.field8760);
            class288.field4014.method746((byte) -102, 0);
        }
        if (!class471.field6573) {
            class1.method5(1, class87.field1189);
            class385.field5396++;
            class288.field4014.method746((byte) -110, 0);
            int var21 = class288.field4014.field1301;
            class96 var22 = new class96(class207.method1369((byte) -119));
            class274.field3872.method547(arg0 ^ 0x25CD, var22);
            class288.field4014.method724(var22.field1301, -16054, var22.field1316, 0);
            class288.field4014.method755(93, class288.field4014.field1301 - var21);
            class471.field6573 = true;
        }
        if (class658.field9266 != null) {
            if (class670.field9445 == 2) {
                class309.method1906(true);
            } else if (class670.field9445 == 3) {
                class455.method2610(arg0 ^ 0xFFFFDA43);
            }
        }
        if (class417.field5880) {
            class417.field5880 = false;
        } else {
            class149.field2221 /= 2.0F;
        }
        if (class124.field1719) {
            class124.field1719 = false;
        } else {
            class509.field6981 /= 2.0F;
        }
        class386.method2223((byte) -117);
        if (class340.field4947 != 10) {
            return;
        }
        class172.method1174((byte) -120);
        class651.method3623((byte) -123);
        class451.method2586((byte) -41);
        class63.method516((byte) -109);
        class220.field3192++;
        if (class220.field3192 > 750) {
            class196.method1321(true);
            return;
        }
        class232.method1468(-19685);
        class210.method1382(9056);
        class288.method1731(-27271);
        for (int var23 = class195.field2888.method871(-23330, true); var23 != -1; var23 = class195.field2888.method871(-23330, false)) {
            class313.method1925(arg0 - 9497, var23);
            class53.field760[class249.method1537(31, class170.field2557++)] = var23;
        }
        for (class679 var24 = class196.method1322((byte) 39); var24 != null; var24 = class196.method1322((byte) 39)) {
            int var25 = var24.method3747(210);
            int var26 = var24.method3751((byte) 42);
            if (var25 == 1) {
                class614.field8514[var26] = var24.field9574;
                class417.field5879 |= class385.field5394[var26];
                class439.field6181[class249.method1537(31, class587.field8202++)] = var26;
            } else if (var25 == 2) {
                class244.field3474[var26] = var24.field9565;
                class516.field7047[class249.method1537(class495.field6819++, 31)] = var26;
            } else if (var25 == 3) {
                class140 var48 = class266.method1626(var26, 112);
                if (!var24.field9565.equals(var48.field1972)) {
                    var48.field1972 = var24.field9565;
                    class432.method2481(var48, arg0 - 9494);
                }
            } else if (var25 == 4) {
                class140 var27 = class266.method1626(var26, 117);
                int var28 = var24.field9574;
                int var29 = var24.field9573;
                int var30 = var24.field9566;
                if (var27.field2103 != var28 || var27.field2021 != var29 || var27.field2104 != var30) {
                    var27.field2021 = var29;
                    var27.field2103 = var28;
                    var27.field2104 = var30;
                    class432.method2481(var27, arg0 ^ 0x25E9);
                }
            } else if (var25 == 5) {
                class140 var47 = class266.method1626(var26, 126);
                if (var24.field9574 != var47.field1992 || var24.field9574 == -1) {
                    var47.field1955 = 0;
                    var47.field2001 = 1;
                    var47.field2110 = 0;
                    var47.field1992 = var24.field9574;
                    class432.method2481(var47, 80);
                }
            } else if (var25 == 6) {
                int var41 = var24.field9574;
                int var42 = (var41 & 0x7F22) >> 10;
                int var43 = var41 >> 5 & 0x1F;
                int var44 = var41 & 0x1F;
                int var45 = (var44 << 3) + ((var42 << 19) + (var43 << 11));
                class140 var46 = class266.method1626(var26, 118);
                if (var46.field1967 != var45) {
                    var46.field1967 = var45;
                    class432.method2481(var46, arg0 - 9680);
                }
            } else if (var25 == 7) {
                class140 var39 = class266.method1626(var26, arg0 ^ 0x25E5);
                boolean var40 = var24.field9574 == 1;
                if (var39.field2051 != var40) {
                    var39.field2051 = var40;
                    class432.method2481(var39, 95);
                }
            } else if (var25 == 8) {
                class140 var38 = class266.method1626(var26, 104);
                if (var24.field9574 != var38.field2113 || var24.field9573 != var38.field2025 || var24.field9566 != var38.field2105) {
                    var38.field2105 = var24.field9566;
                    var38.field2025 = var24.field9573;
                    var38.field2113 = var24.field9574;
                    if (var38.field1969 != -1) {
                        if (var38.field2012 > 0) {
                            var38.field2105 = var38.field2105 * 32 / var38.field2012;
                        } else if (var38.field1981 > 0) {
                            var38.field2105 = var38.field2105 * 32 / var38.field1981;
                        }
                    }
                    class432.method2481(var38, -67);
                }
            } else if (var25 == 9) {
                class140 var37 = class266.method1626(var26, 113);
                if (var24.field9574 != var37.field1969 || var24.field9573 != var37.field2065) {
                    var37.field1969 = var24.field9574;
                    var37.field2065 = var24.field9573;
                    class432.method2481(var37, 118);
                }
            } else if (var25 == 10) {
                class140 var31 = class266.method1626(var26, arg0 ^ 0x25F8);
                if (var24.field9574 != var31.field2007 || var24.field9573 != var31.field1979 || var24.field9566 != var31.field2067) {
                    var31.field2007 = var24.field9574;
                    var31.field2067 = var24.field9566;
                    var31.field1979 = var24.field9573;
                    class432.method2481(var31, -80);
                }
            } else if (var25 == 11) {
                class140 var36 = class266.method1626(var26, arg0 ^ 0x25EF);
                var36.field2086 = 0;
                var36.field2029 = var36.field2042 = var24.field9574;
                var36.field2066 = 0;
                var36.field2027 = var36.field1985 = var24.field9573;
                class432.method2481(var36, arg0 - 9711);
            } else if (var25 == 12) {
                class140 var34 = class266.method1626(var26, 112);
                int var35 = var24.field9574;
                if (var34 != null && var34.field2023 == 0) {
                    if ((var34.field1961 - var34.field2082) < var35) {
                        var35 = var34.field1961 - var34.field2082;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field2073 != var35) {
                        var34.field2073 = var35;
                        class432.method2481(var34, 80);
                    }
                }
            } else if (var25 == 14) {
                class140 var32 = class266.method1626(var26, 113);
                var32.field2010 = var24.field9574;
            } else if (var25 == 15) {
                class247.field3508 = var24.field9574;
                class178.field2636 = var24.field9573;
                class414.field5857 = true;
            } else if (var25 == 16) {
                class140 var33 = class266.method1626(var26, 121);
                var33.field2045 = var24.field9574;
            }
        }
        if (class131.field1795 != 0) {
            class31.field372 += 20;
            if (class31.field372 >= 400) {
                class131.field1795 = 0;
            }
        }
        class371.field5290++;
        if (class442.field6233 != null) {
            class235.field3394++;
            if (class235.field3394 >= 15) {
                class432.method2481(class442.field6233, 93);
                class442.field6233 = null;
            }
        }
        class363.field5178 = false;
        class31.field375 = null;
        class605.field8434 = false;
        class159.field2384 = null;
        class359.method2116(-1, null, 8191, -1);
        class212.method1389(-1, -1, null, (byte) 36);
        if (!class457.field6455) {
            class130.field1787 = -1;
        }
        class396.method2252(-121);
        class93.field1231++;
        if (class537.field7299) {
            class1.method5(arg0 ^ 0x2595, class380.field5351);
            class561.field7573++;
            class288.field4014.method741(class333.field4875 << 28 | class131.field1803 << 14 | class92.field1222, (byte) 27);
            class537.field7299 = false;
        }
        while (true) {
            class388 var49;
            class140 var50;
            class140 var51;
            do {
                var49 = (class388) class52.field744.method1272(0);
                if (var49 == null) {
                    while (true) {
                        class388 var52;
                        class140 var53;
                        class140 var54;
                        do {
                            var52 = (class388) class479.field6689.method1272(arg0 ^ 0x2594);
                            if (var52 == null) {
                                while (true) {
                                    class388 var55;
                                    class140 var56;
                                    class140 var57;
                                    do {
                                        var55 = (class388) class1.field3.method1272(0);
                                        if (var55 == null) {
                                            if (class31.field375 == null) {
                                                class556.field7519 = 0;
                                            }
                                            if (class612.field8489 != null) {
                                                class689.method3793((byte) 37);
                                            }
                                            if (class658.field9267 > 0 && class531.field7246.method666(50, 82) && class531.field7246.method666(50, 81) && class355.field5089 != 0) {
                                                int var58 = class253.field3576.field520 - class355.field5089;
                                                if (var58 < 0) {
                                                    var58 = 0;
                                                } else if (var58 > 3) {
                                                    var58 = 3;
                                                }
                                                class57.method502(var58, class253.field3576.field6477[0] + class124.field1726, (byte) -18, class253.field3576.field6483[0] + class511.field6989);
                                            }
                                            class663.method3672(-15925);
                                            for (int var59 = 0; var59 < 5; var59++) {
                                                int var10002 = class628.field8770[var59]++;
                                            }
                                            if (class417.field5879 && (class680.method3756(-113) - 60000L) > class51.field741) {
                                                class603.method3342(503);
                                            }
                                            for (class261 var60 = (class261) class174.field2600.method3676((byte) 95); var60 != null; var60 = (class261) class174.field2600.method3682(-18176)) {
                                                if ((class680.method3756(-92) / 1000L - 5L) > ((long) var60.field3708)) {
                                                    if (var60.field3709 > 0) {
                                                        class250.method1549("", "", -1, "", 5, var60.field3710 + class9.field153.method42(class666.field9377, 19572), 0);
                                                    }
                                                    if (var60.field3709 == 0) {
                                                        class250.method1549("", "", arg0 - 9621, "", 5, var60.field3710 + class9.field154.method42(class666.field9377, 19572), 0);
                                                    }
                                                    var60.method118(-30545);
                                                }
                                            }
                                            class394.field5493++;
                                            if (class394.field5493 > 500) {
                                                class394.field5493 = 0;
                                                int var61 = (int) (Math.random() * 8.0D);
                                                if ((var61 & 0x2) == 2) {
                                                    class154.field2331 += class379.field5341;
                                                }
                                                if ((var61 & 0x4) == 4) {
                                                    class520.field7077 += class352.field5054;
                                                }
                                                if ((var61 & 0x1) == 1) {
                                                    class184.field2710 += class68.field934;
                                                }
                                            }
                                            if (class184.field2710 < -50) {
                                                class68.field934 = 2;
                                            }
                                            if (class184.field2710 > 50) {
                                                class68.field934 = -2;
                                            }
                                            if (class154.field2331 < -55) {
                                                class379.field5341 = 2;
                                            }
                                            if (class154.field2331 > 55) {
                                                class379.field5341 = -2;
                                            }
                                            if (class520.field7077 < -40) {
                                                class352.field5054 = 1;
                                            }
                                            if (class520.field7077 > 40) {
                                                class352.field5054 = -1;
                                            }
                                            class533.field7260++;
                                            if (class533.field7260 > 500) {
                                                class533.field7260 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x2) == 2) {
                                                    class455.field6362 += class628.field8772;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class156.field2356 += class448.field6271;
                                                }
                                            }
                                            if (class156.field2356 < -60) {
                                                class448.field6271 = 2;
                                            }
                                            if (class156.field2356 > 60) {
                                                class448.field6271 = -2;
                                            }
                                            if (class455.field6362 < -20) {
                                                class628.field8772 = 1;
                                            }
                                            class668.field9401++;
                                            if (class455.field6362 > 10) {
                                                class628.field8772 = -1;
                                            }
                                            if (class668.field9401 > 50) {
                                                class1.method5(arg0 - 9619, class200.field2951);
                                                class222.field3203++;
                                            }
                                            if (class542.field7372) {
                                                class46.method263((byte) -80);
                                                class542.field7372 = false;
                                            }
                                            try {
                                                if (class53.field758 != null && class288.field4014.field1301 > 0) {
                                                    class321.field4747 += class288.field4014.field1301;
                                                    class53.field758.method3126(class288.field4014.field1316, false, class288.field4014.field1301, 0);
                                                    class668.field9401 = 0;
                                                    class288.field4014.field1301 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var63) {
                                                class196.method1321(true);
                                                return;
                                            }
                                        }
                                        var56 = var55.field5443;
                                        if (var56.field2092 < 0) {
                                            break;
                                        }
                                        var57 = class266.method1626(var56.field2054, arg0 - 9494);
                                    } while (var57 == null || var57.field2043 == null || var57.field2043.length <= var56.field2092 || var57.field2043[var56.field2092] != var56);
                                    class523.method2890(var55);
                                }
                            }
                            var53 = var52.field5443;
                            if (var53.field2092 < 0) {
                                break;
                            }
                            var54 = class266.method1626(var53.field2054, 119);
                        } while (var54 == null || var54.field2043 == null || var54.field2043.length <= var53.field2092 || var54.field2043[var53.field2092] != var53);
                        class523.method2890(var52);
                    }
                }
                var50 = var49.field5443;
                if (var50.field2092 < 0) {
                    break;
                }
                var51 = class266.method1626(var50.field2054, 119);
            } while (var51 == null || var51.field2043 == null || var50.field2092 >= var51.field2043.length || var51.field2043[var50.field2092] != var50);
            class523.method2890(var49);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Len;Lmg;Lot;IIIII)V", line = 1010)
    public class508(class289 arg0, class134 arg1, class540 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6954 = arg6;
        this.field6951 = arg0;
        this.field6953 = arg7;
        this.field6967 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1918 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field7347[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field6962 = var10;
        if (var10 <= 0) {
            this.field6959 = null;
        } else {
            class96 var14 = new class96(var10 * 2);
            if (this.field6951.field4362) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1918 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field7347[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method731(-2045573048, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1918 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field7347[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method720(4, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field6960 = this.field6951.method1743(var14.field1316, -103, var14.field1301, false, 5123);
            this.field6956 = new class135(this.field6951, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V", line = 903)
    private final void method2829(byte arg0) {
        field6952++;
        if (!this.field6965) {
            return;
        }
        this.field6965 = false;
        byte[] var2 = this.field6967.field1893;
        byte[] var3 = this.field6951.field4364;
        int var4 = 0;
        int var5 = this.field6967.field1882;
        int var6 = this.field6967.field1882 * this.field6953 + this.field6954;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field6959 != null && this.field6964 == var4) {
            this.field6965 = false;
            return;
        }
        this.field6964 = var4;
        int var8 = 0;
        int var9 = this.field6953 * var5 + this.field6954;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var13++;
                    }
                    if (var2[var5 + var9] != 0) {
                        var13++;
                    }
                    var3[var8++] = (byte) (var13 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field6967.field1882 - 128;
        }
        if (this.field6959 == null) {
            this.field6959 = new class646(this.field6951, 3553, 6406, 128, 128, false, this.field6951.field4364, 6406, false);
            this.field6959.method3601(false, false, -128);
            this.field6959.method3288(0, true);
        } else {
            this.field6959.method3597(128, this.field6951.field4364, false, 0, 128, 0, 0, 0, 6406, 4);
        }
        int var11 = 65 / ((23 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lqa;II)V", line = 1134)
    private final void method2830(class224 arg0, int arg1, int arg2) {
        field6958++;
        if (arg1 == 0) {
            return;
        }
        this.method2829((byte) 108);
        this.field6951.method1804(false, this.field6959);
        if (arg2 > -55) {
            this.field6962 = -115;
        }
        this.field6951.method1822(arg1, arg0, 0, (byte) 63, 4);
    }
}
