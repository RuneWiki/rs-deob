import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 extends class110 {

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public int field170 = 0;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lmb;")
    public static class84 field166 = class79.method672(true, "backhmid2");

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "Lmb;")
    private static class84 field162 = class79.method672(true, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lmb;")
    public static class84 field158 = field162;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lmb;")
    private static class84 field165 = class79.method672(true, "::fpson");

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lmb;")
    public static class84 field173 = class79.method672(true, "Cabbage");

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Lna;")
    public static class89 field171 = new class89(5000);

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lmb;")
    private static class84 field176 = class79.method672(true, "Examine");

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lmb;")
    public static class84 field175 = field176;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lmb;")
    public static class84 field174 = class79.method672(true, "blinken2:");

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lge;")
    public static class47 field177;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static void method52(byte arg0) {
        field175 = null;
        field177 = null;
        field162 = null;
        field166 = null;
        field173 = null;
        field176 = null;
        field165 = null;
        field174 = null;
        field171 = null;
        field158 = null;
        if (arg0 != -52) {
            field162 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)V")
    public static final void method53(boolean arg0) {
        if (!arg0) {
            method53(true);
        }
        field169++;
        if (class95.field2363 > 0) {
            class115.method943(!arg0);
        } else {
            class51.method387(89, 40);
            class131.field3146 = class125.field3030;
            class125.field3030 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static final void method54(int arg0) {
        field172++;
        if (arg0 != -28584) {
            method53(true);
        }
        while (true) {
            label317: do {
                while (class141.method1148(arg0 + 28548)) {
                    if (class79.field1958 != -1 && class84.field2105 == class79.field1958) {
                        if (class60.field1492 == 85 && class95.field2345.method718(88) > 0) {
                            class95.field2345 = class95.field2345.method723(false, class95.field2345.method718(92) - 1, 0);
                        }
                        continue label317;
                    }
                    if (class111.field2683) {
                        if (class60.field1492 == 85 && class95.field2367.method718(arg0 + 28698) > 0) {
                            class95.field2367 = class95.field2367.method723(false, class95.field2367.method718(arg0 + 28498) - 1, 0);
                            class65.field1615 = true;
                        }
                        if (class74.method642(class33.field735, arg0 + 904582510) && class95.field2367.method718(-86) < 80) {
                            class95.field2367 = class95.field2367.method727(class33.field735, -74);
                            class65.field1615 = true;
                        }
                        if (class60.field1492 == 84) {
                            class111.field2683 = false;
                            class65.field1615 = true;
                            if (class11.field179 == 1) {
                                long var1 = class95.field2367.method700((byte) 25);
                                class97.method803(arg0 + 29096, var1);
                            }
                            if (class11.field179 == 2 && class125.field3024 > 0) {
                                long var3 = class95.field2367.method700((byte) 25);
                                class33.method243(var3, (byte) -121);
                            }
                            if (class11.field179 == 3 && class95.field2367.method718(121) > 0) {
                                class87.field2171++;
                                class80.field1978.method769((byte) -113, 59);
                                class80.field1978.method393(0, -17343);
                                int var5 = class80.field1978.field1128;
                                class80.field1978.method419(false, class69.field1695);
                                class5.method30(class80.field1978, arg0 ^ 0xFFFF9058, class95.field2367);
                                class80.field1978.method405(class80.field1978.field1128 - var5, (byte) 59);
                                if (class47.field1028 == 2) {
                                    class47.field1028 = 1;
                                    class115.field2762 = true;
                                    class80.field1978.method769((byte) -96, 198);
                                    class52.field1156++;
                                    class80.field1978.method393(class88.field2214, arg0 ^ 0x2C19);
                                    class80.field1978.method393(class47.field1028, -17343);
                                    class80.field1978.method393(class87.field2176, -17343);
                                }
                            }
                            if (class11.field179 == 4 && class86.field2133 < 100) {
                                long var6 = class95.field2367.method700((byte) 25);
                                class120.method977(var6, 4419);
                            }
                            if (class11.field179 == 5 && class86.field2133 > 0) {
                                long var8 = class95.field2367.method700((byte) 25);
                                class88.method755((byte) -87, var8);
                            }
                        }
                    } else if (class92.field2289 == 1) {
                        if (class60.field1492 == 85 && class95.field2346.method718(-125) > 0) {
                            class95.field2346 = class95.field2346.method723(false, class95.field2346.method718(68) - 1, 0);
                            class65.field1615 = true;
                        }
                        if (class122.method1013(class33.field735, true) && class95.field2346.method718(-123) < 10) {
                            class95.field2346 = class95.field2346.method727(class33.field735, -82);
                            class65.field1615 = true;
                        }
                        if (class60.field1492 == 84) {
                            if (class95.field2346.method718(-111) > 0) {
                                class65.field1596++;
                                int var18 = 0;
                                if (class95.field2346.method719(false)) {
                                    var18 = class95.field2346.method705((byte) 5);
                                }
                                class80.field1978.method769((byte) -111, 171);
                                class80.field1978.method378(2, var18);
                            }
                            class65.field1615 = true;
                            class92.field2289 = 0;
                        }
                    } else if (class92.field2289 == 2) {
                        if (class60.field1492 == 85 && class95.field2346.method718(arg0 ^ 0xFFFF9073) > 0) {
                            class95.field2346 = class95.field2346.method723(false, class95.field2346.method718(86) - 1, 0);
                            class65.field1615 = true;
                        }
                        if ((class1.method8(true, class33.field735) || class33.field735 == 32) && class95.field2346.method718(-126) < 12) {
                            class95.field2346 = class95.field2346.method727(class33.field735, -62);
                            class65.field1615 = true;
                        }
                        if (class60.field1492 == 84) {
                            if (class95.field2346.method718(-114) > 0) {
                                class80.field1978.method769((byte) 89, 46);
                                class80.field1978.method419(false, class95.field2346.method700((byte) 25));
                                class51.field1096++;
                            }
                            class92.field2289 = 0;
                            class65.field1615 = true;
                        }
                    } else if (class92.field2289 == 3) {
                        if (class60.field1492 == 85 && class95.field2346.method718(47) > 0) {
                            class95.field2346 = class95.field2346.method723(false, class95.field2346.method718(53) - 1, 0);
                            class65.field1615 = true;
                        }
                        if (class74.method642(class33.field735, 904553926) && class95.field2346.method718(58) < 40) {
                            class95.field2346 = class95.field2346.method727(class33.field735, -89);
                            class65.field1615 = true;
                        }
                    } else if (class92.field2289 == 4) {
                        if (class60.field1492 == 85 && class95.field2346.method718(116) > 0) {
                            class95.field2346 = class95.field2346.method723(false, class95.field2346.method718(96) - 1, 0);
                            class65.field1615 = true;
                        }
                        if ((class74.method642(class33.field735, 904553926) || class33.field735 == 32) && class95.field2346.method718(-86) < 80) {
                            class95.field2346 = class95.field2346.method727(class33.field735, arg0 + 28518);
                            class65.field1615 = true;
                        }
                        if (class60.field1492 == 84) {
                            if (class95.field2346.method718(85) > 0) {
                                class129.field3115++;
                                class80.field1978.method769((byte) 17, 8);
                                class80.field1978.method393(class95.field2346.method718(arg0 ^ 0xFFFF907E) + 1, -17343);
                                class80.field1978.method367(arg0 + 28456, class95.field2346);
                            }
                            class65.field1615 = true;
                            class92.field2289 = 0;
                        }
                    } else if (class83.field2038 == -1 && class122.field2948 == -1) {
                        if (class60.field1492 == 85 && class95.field2351.method718(88) > 0) {
                            class95.field2351 = class95.field2351.method723(false, class95.field2351.method718(arg0 ^ 0x6FC6) - 1, 0);
                            class65.field1615 = true;
                        }
                        if (class74.method642(class33.field735, arg0 ^ 0xCA15F59E) && class95.field2351.method718(106) < 80) {
                            class95.field2351 = class95.field2351.method727(class33.field735, -94);
                            class65.field1615 = true;
                        }
                        if (class60.field1492 == 84 && class95.field2351.method718(arg0 + 28471) > 0) {
                            if (class102.field2478 == 2) {
                                if (class95.field2351.method720(-1, class109.field2636)) {
                                    System.gc();
                                }
                                if (class95.field2351.method720(-1, class66.field1642)) {
                                    method53(true);
                                }
                                if (class95.field2351.method720(-1, field165)) {
                                    class63.field1569 = true;
                                }
                                if (class95.field2351.method720(-1, class44.field980)) {
                                    class63.field1569 = false;
                                }
                                if (class95.field2351.method720(arg0 + 28583, class19.field396)) {
                                    for (int var10 = 0; var10 < 4; var10++) {
                                        for (int var11 = 1; var11 < 103; var11++) {
                                            for (int var12 = 1; var12 < 103; var12++) {
                                                class65.field1603[var10].field1591[var11][var12] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class95.field2351.method720(arg0 ^ 0x6FA7, class68.field1652) && class53.field1216 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class95.field2351.method720(-1, class33.field730)) {
                                    class133.field3164 = true;
                                }
                            }
                            if (class95.field2351.method703(class43.field950, 0)) {
                                class80.field1978.method769((byte) 82, 253);
                                class80.field1978.method393(class95.field2351.method718(-87) - 1, arg0 + 11241);
                                class70.field1727++;
                                class80.field1978.method367(-128, class95.field2351.method697(arg0 + 28614, 2));
                            } else {
                                class38.field835++;
                                byte var13 = 0;
                                class84 var14 = class95.field2351.method728((byte) 75);
                                if (var14.method703(class120.field2884, 0)) {
                                    class95.field2351 = class95.field2351.method697(arg0 ^ 0xFFFF9046, class120.field2884.method718(32));
                                    var13 = 0;
                                } else if (var14.method703(class52.field1183, 0)) {
                                    var13 = 1;
                                    class95.field2351 = class95.field2351.method697(arg0 ^ 0xFFFF9019, class52.field1183.method718(51));
                                } else if (var14.method703(class2.field60, 0)) {
                                    class95.field2351 = class95.field2351.method697(arg0 ^ 0xFFFF901C, class2.field60.method718(arg0 + 28505));
                                    var13 = 2;
                                } else if (var14.method703(class24.field554, 0)) {
                                    class95.field2351 = class95.field2351.method697(66, class24.field554.method718(-122));
                                    var13 = 3;
                                } else if (var14.method703(class119.field2843, 0)) {
                                    var13 = 4;
                                    class95.field2351 = class95.field2351.method697(62, class119.field2843.method718(arg0 + 28471));
                                } else if (var14.method703(class125.field3023, 0)) {
                                    class95.field2351 = class95.field2351.method697(124, class125.field3023.method718(69));
                                    var13 = 5;
                                } else if (var14.method703(class41.field938, arg0 + 28584)) {
                                    var13 = 6;
                                    class95.field2351 = class95.field2351.method697(40, class41.field938.method718(-88));
                                } else if (var14.method703(class109.field2639, 0)) {
                                    var13 = 7;
                                    class95.field2351 = class95.field2351.method697(109, class109.field2639.method718(-115));
                                } else if (var14.method703(class92.field2294, arg0 ^ 0xFFFF9058)) {
                                    class95.field2351 = class95.field2351.method697(27, class92.field2294.method718(-94));
                                    var13 = 8;
                                } else if (var14.method703(class79.field1968, 0)) {
                                    class95.field2351 = class95.field2351.method697(arg0 + 28704, class79.field1968.method718(-96));
                                    var13 = 9;
                                } else if (var14.method703(class103.field2507, 0)) {
                                    var13 = 10;
                                    class95.field2351 = class95.field2351.method697(38, class103.field2507.method718(125));
                                } else if (var14.method703(class64.field1582, 0)) {
                                    class95.field2351 = class95.field2351.method697(arg0 ^ 0xFFFF9023, class64.field1582.method718(-126));
                                    var13 = 11;
                                }
                                byte var15 = 0;
                                class84 var16 = class95.field2351.method728((byte) 95);
                                if (var16.method703(client.field498, 0)) {
                                    var15 = 1;
                                    class95.field2351 = class95.field2351.method697(105, client.field498.method718(arg0 + 28648));
                                } else if (var16.method703(class133.field3192, 0)) {
                                    var15 = 2;
                                    class95.field2351 = class95.field2351.method697(33, class133.field3192.method718(-110));
                                } else if (var16.method703(class138.field3333, 0)) {
                                    class95.field2351 = class95.field2351.method697(29, class138.field3333.method718(116));
                                    var15 = 3;
                                } else if (var16.method703(class122.field2933, 0)) {
                                    class95.field2351 = class95.field2351.method697(arg0 + 28698, class122.field2933.method718(arg0 ^ 0xFFFF9039));
                                    var15 = 4;
                                } else if (var16.method703(class75.field1839, arg0 + 28584)) {
                                    var15 = 5;
                                    class95.field2351 = class95.field2351.method697(arg0 ^ 0xFFFF9078, class75.field1839.method718(arg0 ^ 0x6FFA));
                                }
                                class80.field1978.method769((byte) 87, 206);
                                class80.field1978.method393(0, -17343);
                                int var17 = class80.field1978.field1128;
                                class80.field1978.method393(var13, -17343);
                                class80.field1978.method393(var15, -17343);
                                class5.method30(class80.field1978, arg0 ^ 0xFFFF9058, class95.field2351);
                                class80.field1978.method405(class80.field1978.field1128 - var17, (byte) 59);
                                if (class88.field2214 == 2) {
                                    class88.field2214 = 3;
                                    class52.field1156++;
                                    class115.field2762 = true;
                                    class80.field1978.method769((byte) -6, 198);
                                    class80.field1978.method393(class88.field2214, -17343);
                                    class80.field1978.method393(class47.field1028, -17343);
                                    class80.field1978.method393(class87.field2176, -17343);
                                }
                            }
                            class65.field1615 = true;
                            class95.field2351 = class95.field2361;
                        }
                    }
                }
                return;
            } while (!class1.method8(true, class33.field735) && class33.field735 != 32);
            if (class95.field2345.method718(arg0 + 28656) < 12) {
                class95.field2345 = class95.field2345.method727(class33.field735, -63);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLhb;I)V")
    private final void method55(boolean arg0, class51 arg1, int arg2) {
        field168++;
        if (arg2 == 5) {
            this.field170 = arg1.method383(-2056200760);
        }
        if (arg0) {
            method57(-71, -62, 24, -12, 14, 81, 108);
        }
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Z")
    public static final boolean method56(int arg0) {
        field163++;
        return class58.field1453 == arg0 ? class69.field1689.method1105(arg0 ^ 0xDF16F570) : true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        field161++;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg5;
        }
        if (arg4 < 66) {
            method56(-37);
        }
        if (var7 == 1) {
            return 1 + 7 - arg2 - arg3;
        } else if (var7 == 2) {
            return 8 - arg5 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lhb;I)V")
    public final void method58(class51 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method373(25094);
            if (var3 == 0) {
                if (arg1 != 16258) {
                    method54(29);
                }
                field160++;
                return;
            }
            this.method55(false, arg0, var3);
        }
    }
}
