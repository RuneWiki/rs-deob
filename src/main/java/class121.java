import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class121 extends class481 {

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field1880 = 0;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public static int field1883 = 0;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Lka;")
    public static class473 field1882 = new class473(20);

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "Lkb;")
    public static class139 field1889;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Llb;")
    public class186 field1881;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[Lrr;")
    public class305[] field1878;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 4)
    public static final String method885(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 82) {
            return null;
        }
        field1888++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        int var6 = arg1 + arg3;
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 < 224) {
                if (var7 + 1 >= var6) {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg0[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class219.method1367(class375.method2245(var9, -129), class375.method2245(var8, -193) << 6);
            } else if (var8 < 240) {
                if (var7 + 2 >= var6) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var10 = arg0[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var11 = arg0[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class219.method1367(class219.method1367(class375.method2245(var10 << 6, -8256), class375.method2245(var8 << 12, -921600)), class375.method2245(var11, -129));
            } else if (var8 < 244) {
                throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
            } else {
                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 79)
    public static void method886(int arg0) {
        field1882 = null;
        field1889 = null;
        if (arg0 <= 110) {
            method885(null, 10, -49, 23);
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V", line = 106)
    public static final void method887(int arg0) {
        field1886++;
        if (class492.field7133 > 0) {
            class492.field7133--;
        }
        if (class104.field1705 > 1) {
            class492.field7132 = class365.field5245;
            class104.field1705--;
        }
        if (class66.field954) {
            class66.field954 = false;
            class279.method1615((byte) 114);
            return;
        }
        if (!class526.field7677) {
            class283.method1630(true);
        }
        for (int var1 = 0; var1 < 100 && class42.method287((byte) 27); var1++) {
        }
        if (class494.field7155 != 9) {
            return;
        }
        class291.method1683(-14, class41.field612.method303(arg0 + 1920), class17.field275);
        if (class214.field3050 == null) {
            if (class254.method1522((byte) -51) >= class292.field3954) {
                class214.field3050 = class42.field624.method2472(class184.field2737.field603, false);
            }
        } else if (class214.field3050.field4983 != -1) {
            class274.method1602(arg0 - 114, class288.field3897);
            class17.field275.method1857(561746448, class214.field3050.field4983);
            class214.field3050 = null;
            class292.field3954 = class254.method1522((byte) -51) + 30000L;
        }
        class97 var2 = (class97) class14.field148.method3137(0);
        if (var2 != null || (class254.method1522((byte) -51) - 2000L) > class486.field6995) {
            boolean var3 = false;
            int var4 = class17.field275.field4360;
            for (class97 var5 = (class97) class417.field6050.method3137(arg0 ^ 0x80); var5 != null && (class17.field275.field4360 - var4) < 240; var5 = (class97) class417.field6050.method3132(arg0 - 128)) {
                var5.method2791((byte) 112);
                int var6 = var5.method779((byte) 124);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method778(-7747);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method779((byte) 101) == -1 && var5.method778(-7747) == -1) {
                    var6 = -1;
                    var7 = -1;
                    var8 = true;
                }
                if (class115.field1833 != var7 || class338.field4906 != var6) {
                    if (!var3) {
                        class528.field7698++;
                        class274.method1602(arg0 - 114, class88.field1424);
                        class17.field275.method1891(false, 0);
                        var3 = true;
                        var4 = class17.field275.field4360;
                    }
                    int var9 = var7 - class115.field1833;
                    class115.field1833 = var7;
                    int var10 = var6 - class338.field4906;
                    class338.field4906 = var6;
                    int var11 = (int) ((var5.method780(-5) - class486.field6995) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class17.field275.method1857(arg0 + 561746320, (var11 << 12) - (-(var9 << 6) - var10));
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var9 += 128;
                        var10 += 128;
                        class17.field275.method1891(false, var11 + 128);
                        class17.field275.method1857(arg0 ^ 0x217B9290, (var9 << 8) + var10);
                    } else if (var11 < 32) {
                        class17.field275.method1891(false, var11 + 192);
                        if (var8) {
                            class17.field275.method1858(Integer.MIN_VALUE, (byte) -30);
                        } else {
                            class17.field275.method1858(var6 << 16 | var7, (byte) -10);
                        }
                    } else {
                        class17.field275.method1857(arg0 ^ 0x217B9290, var11 + 57344);
                        if (var8) {
                            class17.field275.method1858(Integer.MIN_VALUE, (byte) -121);
                        } else {
                            class17.field275.method1858(var7 | var6 << 16, (byte) -14);
                        }
                    }
                    class486.field6995 = var5.method780(-5);
                }
            }
            if (var3) {
                class17.field275.method1851(class17.field275.field4360 - var4, 0);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method780(-5) - class462.field6681) / 50L;
            class462.field6681 = var2.method780(-5);
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = var2.method779((byte) -102);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method778(-7747);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method777(-120) == 2) {
                var16 = 1;
            }
            class274.method1602(14, class306.field4147);
            int var17 = (int) var12;
            class299.field4094++;
            class17.field275.method1850(var14 << 16 | var15, -1822326824);
            class17.field275.method1866(var16 << 15 | var17, true);
        }
        if (class329.field4472 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class329.field4472; var19++) {
                if (client.field7560[var19].method1441(arg0 - 80)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                class40.field592++;
                class274.method1602(14, class438.field6317);
                if (var18 > 75) {
                    var18 = 75;
                }
                class17.field275.method1891(false, var18 * 3);
                for (int var20 = 0; var20 < class329.field4472; var20++) {
                    class235 var21 = client.field7560[var20];
                    if (var21.method1441(15)) {
                        long var22 = (var21.method1433(arg0 ^ 0xFFFFD561) - class36.field550) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class36.field550 = var21.method1433(-10783);
                        class17.field275.method1891(false, var21.method1437(-24469));
                        class17.field275.method1857(561746448, (int) var22);
                    }
                }
            }
        }
        if (class465.field6711 > 0) {
            class465.field6711--;
        }
        if (class163.field2483 && class465.field6711 <= 0) {
            class465.field6711 = 20;
            class276.field3743++;
            class163.field2483 = false;
            class274.method1602(14, class147.field2228);
            class17.field275.method1857(561746448, (int) class191.field2797 >> 3);
            class17.field275.method1884((int) class496.field7236 >> 3, (byte) -118);
        }
        if (class508.field7419 && !class125.field1954) {
            class108.field1756++;
            class125.field1954 = true;
            class274.method1602(14, class220.field3104);
            class17.field275.method1891(false, 1);
        }
        if (!class508.field7419 && class125.field1954) {
            class108.field1756++;
            class125.field1954 = false;
            class274.method1602(14, class220.field3104);
            class17.field275.method1891(false, 0);
        }
        if (!class425.field6186) {
            class291.field3937++;
            class274.method1602(14, class505.field7390);
            class17.field275.method1891(false, 0);
            int var24 = class17.field275.field4360;
            class319 var25 = class76.field1075.method1101(17);
            class17.field275.method1885(var25.field4360, 0, false, var25.field4336);
            class17.field275.method1851(class17.field275.field4360 - var24, arg0 + -128);
            class425.field6186 = true;
        }
        if (class103.field1632 != null) {
            if (class247.field3363 == 2) {
                class95.method773(-52);
            } else if (class247.field3363 == 3) {
                class186.method1247(false);
            }
        }
        if (class33.field516) {
            class33.field516 = false;
        } else {
            class514.field7533 /= 2.0F;
        }
        if (class182.field2717) {
            class182.field2717 = false;
        } else {
            class526.field7686 /= 2.0F;
        }
        class188.method1256(-15736);
        if (arg0 != 128) {
            method886(-77);
        }
        if (class494.field7155 != 9) {
            return;
        }
        class480.method2857(-377250077);
        class451.method2648(true);
        class277.method1610(true);
        class513.method3039(arg0 ^ 0xFB);
        class104.field1710++;
        if (class104.field1710 > 750) {
            class279.method1615((byte) 127);
            return;
        }
        class379.method2263(-107);
        class56.method367(true);
        class163.method1142(0);
        for (int var26 = class309.field4200.method3071(true, arg0 ^ 0xFFFFFF7F); var26 != -1; var26 = class309.field4200.method3071(false, arg0 ^ 0xFFFFFF7F)) {
            class105.method817((byte) 123, var26);
            class278.field3775[class375.method2245(31, class342.field4940++)] = var26;
        }
        for (class314 var27 = class408.method2393(18982); var27 != null; var27 = class408.method2393(18982)) {
            int var28 = var27.method1809(arg0 ^ 0xFFFFEAE4);
            int var29 = var27.method1806(0);
            if (var28 == 1) {
                class451.field6614[var29] = var27.field4253;
                class267.field3590 |= class308.field4189[var29];
                class434.field6291[class375.method2245(field1883++, 31)] = var29;
            } else if (var28 == 2) {
                class1.field25[var29] = var27.field4244;
                class77.field1082[class375.method2245(class119.field1857++, 31)] = var29;
            } else if (var28 == 3) {
                class444 var30 = class22.method138(-92, var29);
                if (!var27.field4244.equals(var30.field6527)) {
                    var30.field6527 = var27.field4244;
                    class151.method1093(var30, arg0 - 20);
                }
            } else if (var28 == 4) {
                class444 var31 = class22.method138(-70, var29);
                int var32 = var27.field4253;
                int var33 = var27.field4259;
                int var34 = var27.field4246;
                if (var31.field6493 != var32 || var31.field6486 != var33 || var31.field6414 != var34) {
                    var31.field6414 = var34;
                    var31.field6493 = var32;
                    var31.field6486 = var33;
                    class151.method1093(var31, 110);
                }
            } else if (var28 == 5) {
                class444 var51 = class22.method138(76, var29);
                if (var27.field4253 != var51.field6442 || var27.field4253 == -1) {
                    var51.field6479 = 1;
                    var51.field6484 = 0;
                    var51.field6442 = var27.field4253;
                    var51.field6492 = 0;
                    class151.method1093(var51, 120);
                }
            } else if (var28 == 6) {
                int var45 = var27.field4253;
                int var46 = (var45 & 0x7F2F) >> 10;
                int var47 = (var45 & 0x3EF) >> 5;
                int var48 = var45 & 0x1F;
                int var49 = (var47 << 11) + ((var46 << 19) + (var48 << 3));
                class444 var50 = class22.method138(arg0 - 55, var29);
                if (var50.field6480 != var49) {
                    var50.field6480 = var49;
                    class151.method1093(var50, 126);
                }
            } else if (var28 == 7) {
                class444 var35 = class22.method138(-53, var29);
                boolean var36 = var27.field4253 == 1;
                if (var36 != var35.field6439) {
                    var35.field6439 = var36;
                    class151.method1093(var35, arg0 ^ 0xFA);
                }
            } else if (var28 == 8) {
                class444 var44 = class22.method138(53, var29);
                if (var27.field4253 != var44.field6538 || var27.field4259 != var44.field6490 || var27.field4246 != var44.field6526) {
                    var44.field6526 = var27.field4246;
                    var44.field6538 = var27.field4253;
                    var44.field6490 = var27.field4259;
                    if (var44.field6481 != -1) {
                        if (var44.field6411 > 0) {
                            var44.field6526 = var44.field6526 * 32 / var44.field6411;
                        } else if (var44.field6426 > 0) {
                            var44.field6526 = var44.field6526 * 32 / var44.field6426;
                        }
                    }
                    class151.method1093(var44, 115);
                }
            } else if (var28 == 9) {
                class444 var43 = class22.method138(-127, var29);
                if (var27.field4253 != var43.field6481 || var27.field4259 != var43.field6475) {
                    var43.field6481 = var27.field4253;
                    var43.field6475 = var27.field4259;
                    class151.method1093(var43, arg0 - 9);
                }
            } else if (var28 == 10) {
                class444 var37 = class22.method138(114, var29);
                if (var27.field4253 != var37.field6447 || var27.field4259 != var37.field6420 || var27.field4246 != var37.field6472) {
                    var37.field6420 = var27.field4259;
                    var37.field6472 = var27.field4246;
                    var37.field6447 = var27.field4253;
                    class151.method1093(var37, 110);
                }
            } else if (var28 == 11) {
                class444 var42 = class22.method138(-106, var29);
                var42.field6418 = var42.field6391 = var27.field4259;
                var42.field6500 = var42.field6548 = var27.field4253;
                var42.field6518 = 0;
                var42.field6464 = 0;
                class151.method1093(var42, 119);
            } else if (var28 == 12) {
                class444 var38 = class22.method138(-91, var29);
                int var39 = var27.field4253;
                if (var38 != null && var38.field6477 == 0) {
                    if (var39 > var38.field6506 - var38.field6453) {
                        var39 = var38.field6506 - var38.field6453;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var38.field6451 != var39) {
                        var38.field6451 = var39;
                        class151.method1093(var38, arg0 - 9);
                    }
                }
            } else if (var28 == 14) {
                class444 var40 = class22.method138(110, var29);
                var40.field6461 = var27.field4253;
            } else if (var28 == 15) {
                class71.field1023 = var27.field4253;
                class192.field2807 = true;
                class506.field7400 = var27.field4259;
            } else if (var28 == 16) {
                class444 var41 = class22.method138(arg0 - 189, var29);
                var41.field6413 = var27.field4253;
            }
        }
        class71.field1026++;
        if (class41.field616 != 0) {
            class273.field3699 += 20;
            if (class273.field3699 >= 400) {
                class41.field616 = 0;
            }
        }
        if (class23.field321 != null) {
            class341.field4938++;
            if (class341.field4938 >= 15) {
                class151.method1093(class23.field321, 122);
                class23.field321 = null;
            }
        }
        class360.field5176 = false;
        class387.field5556 = null;
        class141.field2101 = false;
        class151.field2332 = null;
        class183.method1240(-1, null, (byte) 5, -1);
        class340.method2063(-1, (byte) -127, -1, null);
        if (!class375.field5390) {
            class358.field5165 = -1;
        }
        class206.method1321((byte) 51);
        class365.field5245++;
        if (class291.field3935) {
            class203.field2937++;
            class274.method1602(arg0 - 114, class258.field3508);
            class17.field275.method1858(class13.field143 << 28 | class300.field4104 << 14 | class485.field6981, (byte) -111);
            class291.field3935 = false;
        }
        while (true) {
            class414 var52;
            class444 var53;
            class444 var54;
            do {
                var52 = (class414) class50.field708.method3134((byte) -76);
                if (var52 == null) {
                    while (true) {
                        class414 var55;
                        class444 var56;
                        class444 var57;
                        do {
                            var55 = (class414) class269.field3623.method3134((byte) -91);
                            if (var55 == null) {
                                while (true) {
                                    class414 var58;
                                    class444 var59;
                                    class444 var60;
                                    do {
                                        var58 = (class414) class63.field922.method3134((byte) 119);
                                        if (var58 == null) {
                                            if (class387.field5556 == null) {
                                                class123.field1909 = 0;
                                            }
                                            if (class294.field3967 != null) {
                                                class412.method2422(-71);
                                            }
                                            if (class136.field2064 > 0 && class78.field1106.method2585(82, (byte) 117) && class78.field1106.method2585(81, (byte) 55) && class181.field2695 != 0) {
                                                int var61 = class81.field1158.field6279 - class181.field2695;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class378.method2256(class81.field1158.field263[0] + class110.field1775, 0, var61, class81.field1158.field257[0] + class399.field5727);
                                            }
                                            class373.method2237(-10946);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class314.field4260[var62]++;
                                            }
                                            if (class267.field3590 && class420.field6080 < class254.method1522((byte) -51) - 60000L) {
                                                class294.method1701((byte) 68);
                                            }
                                            for (class102 var63 = (class102) class416.field6029.method2600((byte) 110); var63 != null; var63 = (class102) class416.field6029.method2601(111)) {
                                                if (class254.method1522((byte) -51) / 1000L - 5L > (long) var63.field1604) {
                                                    if (var63.field1601 > 0) {
                                                        class9.method68("", 0, 5, -1, var63.field1600 + class219.field3096.method1126(class486.field6998, (byte) -19), "");
                                                    }
                                                    if (var63.field1601 == 0) {
                                                        class9.method68("", 0, 5, -1, var63.field1600 + class68.field980.method1126(class486.field6998, (byte) -19), "");
                                                    }
                                                    var63.method2861((byte) 47);
                                                }
                                            }
                                            class79.field1116++;
                                            if (class79.field1116 > 500) {
                                                class79.field1116 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x4) == 4) {
                                                    class93.field1525 += class267.field3588;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class40.field593 += class325.field4449;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class373.field5358 += class355.field5138;
                                                }
                                            }
                                            if (class40.field593 < -50) {
                                                class325.field4449 = 2;
                                            }
                                            if (class40.field593 > 50) {
                                                class325.field4449 = -2;
                                            }
                                            if (class373.field5358 < -55) {
                                                class355.field5138 = 2;
                                            }
                                            if (class373.field5358 > 55) {
                                                class355.field5138 = -2;
                                            }
                                            if (class93.field1525 < -40) {
                                                class267.field3588 = 1;
                                            }
                                            if (class93.field1525 > 40) {
                                                class267.field3588 = -1;
                                            }
                                            class241.field3330++;
                                            if (class241.field3330 > 500) {
                                                class241.field3330 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class457.field6666 += class377.field5411;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class532.field7816 += class278.field3783;
                                                }
                                            }
                                            if (class457.field6666 < -60) {
                                                class377.field5411 = 2;
                                            }
                                            if (class457.field6666 > 60) {
                                                class377.field5411 = -2;
                                            }
                                            if (class532.field7816 < -20) {
                                                class278.field3783 = 1;
                                            }
                                            if (class532.field7816 > 10) {
                                                class278.field3783 = -1;
                                            }
                                            class291.field3948++;
                                            if (class291.field3948 > 50) {
                                                class346.field4981++;
                                                class274.method1602(arg0 - 114, class332.field4516);
                                            }
                                            if (class535.field7877) {
                                                class247.method1480(-126);
                                                class535.field7877 = false;
                                            }
                                            try {
                                                if (class104.field1702 != null && class17.field275.field4360 > 0) {
                                                    class411.field5846 += class17.field275.field4360;
                                                    class104.field1702.method180(0, class17.field275.field4360, 18170, class17.field275.field4336);
                                                    class17.field275.field4360 = 0;
                                                    class291.field3948 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class279.method1615((byte) 94);
                                                return;
                                            }
                                        }
                                        var59 = var58.field5896;
                                        if (var59.field6510 < 0) {
                                            break;
                                        }
                                        var60 = class22.method138(95, var59.field6515);
                                    } while (var60 == null || var60.field6491 == null || var60.field6491.length <= var59.field6510 || var60.field6491[var59.field6510] != var59);
                                    class47.method313(var58);
                                }
                            }
                            var56 = var55.field5896;
                            if (var56.field6510 < 0) {
                                break;
                            }
                            var57 = class22.method138(-88, var56.field6515);
                        } while (var57 == null || var57.field6491 == null || var56.field6510 >= var57.field6491.length || var57.field6491[var56.field6510] != var56);
                        class47.method313(var55);
                    }
                }
                var53 = var52.field5896;
                if (var53.field6510 < 0) {
                    break;
                }
                var54 = class22.method138(arg0 - 237, var53.field6515);
            } while (var54 == null || var54.field6491 == null || var54.field6491.length <= var53.field6510 || var54.field6491[var53.field6510] != var53);
            class47.method313(var52);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILza;)Z", line = 990)
    public final boolean method888(int arg0, int arg1, int arg2, class295 arg3) {
        if (arg1 != 31) {
            method886(19);
        }
        field1884++;
        if (this.field1878 != null) {
            for (int var5 = 0; var5 < this.field1878.length; var5++) {
                if (this.field1878[var5].method1757(arg2, arg0) && this.field1881.method158(arg0, (byte) 94, arg2, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
