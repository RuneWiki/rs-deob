import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class111 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Llj;")
    private class25 field1890 = new class25(256);

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Llj;")
    private class25 field1901 = new class25(256);

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lhg;")
    private class177 field1893;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lhg;")
    private class177 field1899;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1888 = 0;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lcf;")
    public static class93 field1889 = class147.method1066("scrollen:", -48);

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lcf;")
    private static class93 field1887 = class147.method1066(" has logged out)3", -48);

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lcf;")
    public static class93 field1896 = class147.method1066("Votre liste noire est pleine (X100 noms maximum(Y)3", -48);

    @OriginalMember(owner = "client!th", name = "h", descriptor = "D")
    public static double field1894 = -1.0D;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Lcf;")
    public static class93 field1895 = field1887;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method790(int arg0) {
        field1896 = null;
        field1889 = null;
        if (arg0 != 1136421227) {
            field1888 = -72;
        }
        field1895 = null;
        field1887 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Lge;")
    public static final class70 method791(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class70 var4 = var3.field643;
            var3.field643 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BI[I)Lcl;")
    public final class194 method792(byte arg0, int arg1, int[] arg2) {
        field1898++;
        if (this.field1899.method1279(-1) == 1) {
            return this.method794(arg1, 0, arg2, 536875007);
        }
        if (arg0 > -64) {
            this.field1890 = null;
        }
        if (this.field1899.method1283(arg1, -5357) != 1) {
            throw new RuntimeException();
        }
        return this.method794(0, arg1, arg2, 536875007);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([IIB)Lcl;")
    public final class194 method793(int[] arg0, int arg1, byte arg2) {
        if (arg2 < 20) {
            return null;
        }
        field1900++;
        if (this.field1893.method1279(-1) == 1) {
            return this.method795(arg0, (byte) -96, arg1, 0);
        } else if (this.field1893.method1283(arg1, -5357) == 1) {
            return this.method795(arg0, (byte) -96, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II[II)Lcl;")
    private final class194 method794(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = ((arg1 & arg3) << 4 | arg1 >>> 12) ^ arg0;
        field1892++;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class194 var9 = (class194) this.field1901.method135(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class114 var10 = (class114) this.field1890.method135(var7, true);
            if (var10 == null) {
                var10 = class114.method813(this.field1899, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field1890.method137(var7, var10, arg3 ^ 0xDFFFF000);
            }
            class194 var11 = var10.method816(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1544((byte) -61);
                this.field1901.method137(var7, var11, arg3 ^ 0xDFFFF000);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([IBII)Lcl;")
    private final class194 method795(int[] arg0, byte arg1, int arg2, int arg3) {
        field1891++;
        int var5 = (arg3 >>> 12 | arg3 & 0xFFF << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        if (arg1 != -96) {
            method791(6, -98, -84);
        }
        long var7 = (long) var6;
        class194 var9 = (class194) this.field1901.method135(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class215 var10 = class215.method1515(this.field1893, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class194 var11 = var10.method1517();
            this.field1901.method137(var7, var11, -1);
            if (arg0 != null) {
                arg0[0] -= var11.field3547.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Ltg;IIIIIIII)V")
    public static final void method796(int arg0, class181[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1897++;
        class75.method507(arg2, arg0, arg6, arg5);
        class179.method1318();
        if (arg7 != 21175) {
            method790(-40);
        }
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class181 var11 = arg1[var10];
            if (var11 != null && (var11.field3321 == arg4 || arg4 == -1412584499 && class148.field2611 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class170.field2985[class161.field2845] = var11.field3214 + arg8;
                    class40.field616[class161.field2845] = var11.field3189 + arg3;
                    class25.field311[class161.field2845] = var11.field3270;
                    class110.field1877[class161.field2845] = var11.field3252;
                    var12 = class161.field2845++;
                } else {
                    var12 = arg9;
                }
                var11.field3238 = var12;
                var11.field3194 = class275.field4921;
                if (!var11.field3307 || !client.method1115(var11)) {
                    if (var11.field3218 > 0) {
                        class24.method128((byte) -108, var11);
                    }
                    int var13 = var11.field3306;
                    int var14 = var11.field3214 + arg8;
                    int var15 = var11.field3189 + arg3;
                    if (class252.field4546 && (client.method1109(var11).field3646 != 0 || var11.field3289 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class148.field2611 == var11) {
                        if (arg4 != -1412584499 && !var11.field3267) {
                            class55.field909 = arg3;
                            class268.field4786 = arg1;
                            class29.field402 = arg8;
                            continue;
                        }
                        if (class56.field932 && class54.field894) {
                            int var16 = class227.field4056;
                            int var17 = var16 - class31.field493;
                            if (var17 < class220.field3993) {
                                var17 = class220.field3993;
                            }
                            if ((var11.field3270 + var17) > (class220.field3993 + class1.field8.field3270)) {
                                var17 = class220.field3993 + class1.field8.field3270 - var11.field3270;
                            }
                            var14 = var17;
                            int var18 = class157.field2793;
                            int var19 = var18 - class74.field1353;
                            if (var19 < class233.field4153) {
                                var19 = class233.field4153;
                            }
                            if (class233.field4153 + class1.field8.field3252 < var11.field3252 + var19) {
                                var19 = class1.field8.field3252 + class233.field4153 - var11.field3252;
                            }
                            var15 = var19;
                        }
                        if (!var11.field3267) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3289 == 2) {
                        var20 = arg6;
                        var21 = arg0;
                        var22 = arg5;
                        var23 = arg2;
                    } else {
                        int var24 = var11.field3270 + var14;
                        var21 = arg0 >= var15 ? arg0 : var15;
                        var23 = var14 > arg2 ? var14 : arg2;
                        int var25 = var11.field3252 + var15;
                        if (var11.field3289 == 9) {
                            var24++;
                            var25++;
                        }
                        var22 = var25 >= arg5 ? arg5 : var25;
                        var20 = var24 >= arg6 ? arg6 : var24;
                    }
                    if (!var11.field3307 || var23 < var20 && var21 < var22) {
                        if (var11.field3218 != 0) {
                            if (var11.field3218 == 1337) {
                                class130.field2287 = var15;
                                class174.field3029 = var14;
                                class34.field538 = var11;
                                class254.method1725(-82, ~var11.field3218 == -1404, var15, var14, var11.field3252, var11.field3270);
                                class75.method507(arg2, arg0, arg6, arg5);
                                continue;
                            }
                            if (var11.field3218 == 1338) {
                                if (!var11.method1336(0)) {
                                    continue;
                                }
                                class39.method223(var14, var15, var12, var11, 32);
                                class75.method507(arg2, arg0, arg6, arg5);
                                if (class14.field170 != 0 && class14.field170 != 3 || class58.field991 || var23 > class32.field508 || class178.field3145 < var21 || var20 <= class32.field508 || var22 <= class178.field3145) {
                                    continue;
                                }
                                int var26 = class178.field3145 - var15;
                                int var27 = class32.field508 - var14;
                                int var28 = var11.field3261[var26];
                                if (var27 < var28 || (var11.field3257[var26] + var28) < var27) {
                                    continue;
                                }
                                int var29 = var26 - var11.field3252 / 2;
                                int var30 = var27 - var11.field3270 / 2;
                                int var31 = class50.field825 + class95.field1719 & 0x7FF;
                                int var32 = class179.field3158[var31];
                                int var33 = (class248.field4458 + 256) * var32 >> 8;
                                int var34 = class179.field3155[var31];
                                int var35 = (class248.field4458 + 256) * var34 >> 8;
                                int var36 = var29 * var35 + (var30 * var33) >> 11;
                                int var37 = class166.field2927.field3868 + var36 >> 7;
                                int var38 = var29 * var33 - (var30 * var35) >> 11;
                                int var39 = class166.field2927.field3784 - var38 >> 7;
                                if (class263.field4695 && (class210.field3799 & 0x40) != 0) {
                                    class181 var40 = class5.method21(class16.field229, class255.field4611, (byte) 40);
                                    if (var40 == null) {
                                        class117.method869(64);
                                    } else {
                                        class144.method1042((short) 48, 1L, class54.field888, class153.field2683, true, var39, class19.field260, var37);
                                    }
                                    continue;
                                }
                                if (class78.field1460 == 1) {
                                    class144.method1042((short) 26, 1L, -1, class8.field109, true, var39, class178.field3144, var37);
                                }
                                class144.method1042((short) 42, 1L, -1, class61.field1032, true, var39, class178.field3144, var37);
                                continue;
                            }
                            if (var11.field3218 == 1339) {
                                if (var11.method1336(0)) {
                                    class118.method882((byte) -124, var12, var14, var11, var15);
                                    class75.method507(arg2, arg0, arg6, arg5);
                                }
                                continue;
                            }
                            if (var11.field3218 == 1400) {
                                class250.method1696(var14, var11.field3252, 95, var15, var11.field3270);
                                class25.field314[var12] = true;
                                class252.field4541[var12] = true;
                                class75.method507(arg2, arg0, arg6, arg5);
                                continue;
                            }
                            if (var11.field3218 == 1401) {
                                class110.method785(var15, var11.field3270, (byte) -29, var11.field3252, var14);
                                class25.field314[var12] = true;
                                class252.field4541[var12] = true;
                                class75.method507(arg2, arg0, arg6, arg5);
                                continue;
                            }
                            if (var11.field3218 == 1402) {
                                class29.method158(var14, var15, (byte) -128);
                                class25.field314[var12] = true;
                                class252.field4541[var12] = true;
                                continue;
                            }
                            if (var11.field3218 == 1405) {
                                if (!class43.field673) {
                                    continue;
                                }
                                int var41 = var11.field3270 + var14;
                                int var42 = var15 + 15;
                                class140.field2436.method1833(class130.method949((byte) -77, new class93[] { class162.field2871, class148.method1067(-7015, class156.field2765) }), var41, var42, 16776960, -1);
                                int var130 = var42 + 15;
                                int var43 = 0;
                                int var44 = 0;
                                int var45 = 16776960;
                                Runtime var46 = Runtime.getRuntime();
                                int var47 = (int) ((var46.totalMemory() - var46.freeMemory()) / 1024L);
                                int var48 = 0;
                                if (var47 > 65536) {
                                    var45 = 16711680;
                                }
                                class140.field2436.method1833(class130.method949((byte) -77, new class93[] { class160.field2821, class148.method1067(-7015, var47), class230.field4123 }), var41, var130, var45, -1);
                                int var49 = 16776960;
                                var42 = var130 + 15;
                                for (int var50 = 0; var50 < 28; var50++) {
                                    var44 += class266.field4741[var50].method326(arg7 ^ 0xFFFFC584);
                                    var43 += class266.field4741[var50].method327(arg7 ^ 0x3039);
                                    var48 += class266.field4741[var50].method317(-118);
                                }
                                int var51 = var43 * 10000 / var44;
                                int var52 = var48 * 100 / var44;
                                class93 var53 = class130.method949((byte) -77, new class93[] { class203.field3667, class112.method800((long) var51, (byte) 120, true, 0, 2), class168.field2965, class148.method1067(-7015, var52), class172.field3012 });
                                class63.field1149.method1833(var53, var41, var42, var49, -1);
                                class25.field314[var12] = true;
                                var42 += 12;
                                class252.field4541[var12] = true;
                                continue;
                            }
                            if (var11.field3218 == 1406) {
                                class235.field4198 = var15;
                                class284.field5096 = var11;
                                class238.field4264 = var14;
                                continue;
                            }
                        }
                        if (!class58.field991) {
                            if (var11.field3289 == 0 && var11.field3268 && var23 <= class32.field508 && class178.field3145 >= var21 && var20 > class32.field508 && class178.field3145 < var22 && !class252.field4546) {
                                class214.field3911[0] = class273.field4859;
                                class216.field3942[0] = 1001;
                                class228.field4089[0] = class32.field509;
                                class253.field4549 = 1;
                                class86.field1553[0] = class178.field3144;
                            }
                            if (var23 <= class32.field508 && class178.field3145 >= var21 && class32.field508 < var20 && class178.field3145 < var22) {
                                class275.method1839(class32.field508 - var14, var11, arg7 ^ 0x3B95, class178.field3145 - var15);
                            }
                        }
                        if (var11.field3289 == 0) {
                            if (!var11.field3307 && client.method1115(var11) && class232.field4146 != var11) {
                                continue;
                            }
                            if (!var11.field3307) {
                                if (var11.field3282 > (var11.field3334 - var11.field3252)) {
                                    var11.field3282 = var11.field3334 - var11.field3252;
                                }
                                if (var11.field3282 < 0) {
                                    var11.field3282 = 0;
                                }
                            }
                            method796(var21, arg1, var23, var15 - var11.field3282, var11.field3219, var22, var20, 21175, var14 - var11.field3310, var12);
                            if (var11.field3336 != null) {
                                method796(var21, var11.field3336, var23, var15 - var11.field3282, var11.field3219, var22, var20, 21175, var14 - var11.field3310, var12);
                            }
                            class214 var54 = (class214) class255.field4610.method135((long) var11.field3219, true);
                            if (var54 != null) {
                                if (var54.field3914 == 0 && !class58.field991 && var23 <= class32.field508 && var21 <= class178.field3145 && class32.field508 < var20 && class178.field3145 < var22 && !class252.field4546) {
                                    class228.field4089[0] = class32.field509;
                                    class253.field4549 = 1;
                                    class216.field3942[0] = 1001;
                                    class86.field1553[0] = class178.field3144;
                                    class214.field3911[0] = class273.field4859;
                                }
                                class266.method1775(var14, var54.field3912, var20, var15, -1, var23, var21, var22, var12);
                            }
                            class75.method507(arg2, arg0, arg6, arg5);
                            class179.method1318();
                        }
                        if (class108.field1856[var12] || class26.field348 > 1) {
                            if (var11.field3289 == 0 && !var11.field3307 && var11.field3334 > var11.field3252) {
                                class117.method872(var11.field3334, var11.field3252, var15, var11.field3282, var11.field3270 + var14, -560742846);
                            }
                            if (var11.field3289 != 1) {
                                if (var11.field3289 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field3210; var56++) {
                                        for (int var57 = 0; var57 < var11.field3277; var57++) {
                                            int var58 = (var11.field3303 + 32) * var57 + var14;
                                            int var59 = var15 + ((var11.field3331 + 32) * var56);
                                            if (var55 < 20) {
                                                var58 += var11.field3266[var55];
                                                var59 += var11.field3233[var55];
                                            }
                                            if (var11.field3301[var55] > 0) {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field3301[var55] - 1;
                                                if ((var58 + 32) > arg2 && arg6 > var58 && arg0 < (var59 + 32) && arg5 > var59 || class228.field4080 == var11 && class41.field625 == var55) {
                                                    class120 var64;
                                                    if (class268.field4769 == 1 && class76.field1413 == var55 && class217.field3946 == var11.field3219) {
                                                        var64 = class78.method540(65536, var63, var11.field3228, 0, 2, var11.field3304[var55]);
                                                    } else {
                                                        var64 = class78.method540(65536, var63, var11.field3228, 3153952, 1, var11.field3304[var55]);
                                                    }
                                                    if (class179.field3163) {
                                                        class25.field314[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class254.method1731(var11, (byte) -96);
                                                    } else if (class228.field4080 == var11 && class41.field625 == var55) {
                                                        int var65 = class157.field2793 - class245.field4419;
                                                        int var66 = class227.field4056 - class104.field1801;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class245.field4398 < 5) {
                                                            var66 = 0;
                                                            var65 = 0;
                                                        }
                                                        var64.method559(var58 + var66, var59 + var65, 128);
                                                        if (arg4 != -1) {
                                                            int var67 = class75.field1396;
                                                            int var68 = class75.field1394;
                                                            class181 var69 = arg1[arg4 & 0xFFFF];
                                                            if (var67 > (var59 + var65) && var69.field3282 > 0) {
                                                                int var70 = (var67 - var59 - var65) * class203.field3670 / 3;
                                                                if ((class203.field3670 * 10) < var70) {
                                                                    var70 = class203.field3670 * 10;
                                                                }
                                                                if (var70 > var69.field3282) {
                                                                    var70 = var69.field3282;
                                                                }
                                                                var69.field3282 -= var70;
                                                                class245.field4419 += var70;
                                                                class254.method1731(var69, (byte) 38);
                                                            }
                                                            if (var59 + var65 + 32 > var68 && var69.field3334 - var69.field3252 > var69.field3282) {
                                                                int var71 = (var59 + var65 + 32 - var68) * class203.field3670 / 3;
                                                                if (var71 > (class203.field3670 * 10)) {
                                                                    var71 = class203.field3670 * 10;
                                                                }
                                                                if (var71 > (var69.field3334 - var69.field3252 - var69.field3282)) {
                                                                    var71 = var69.field3334 - var69.field3282 - var69.field3252;
                                                                }
                                                                class245.field4419 -= var71;
                                                                var69.field3282 += var71;
                                                                class254.method1731(var69, (byte) 86);
                                                            }
                                                        }
                                                    } else if (class218.field3980 == var11 && class5.field76 == var55) {
                                                        var64.method559(var58, var59, 128);
                                                    } else {
                                                        var64.method560(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field3360 != null && var55 < 20) {
                                                class120 var60 = var11.method1331(65535, var55);
                                                if (var60 != null) {
                                                    var60.method560(var58, var59);
                                                } else if (class188.field3453) {
                                                    class254.method1731(var11, (byte) -106);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field3289 == 3) {
                                    int var72;
                                    if (class260.method1750(false, var11)) {
                                        var72 = var11.field3231;
                                        if (class232.field4146 == var11 && var11.field3199 != 0) {
                                            var72 = var11.field3199;
                                        }
                                    } else {
                                        var72 = var11.field3180;
                                        if (class232.field4146 == var11 && var11.field3187 != 0) {
                                            var72 = var11.field3187;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field3240) {
                                            class75.method517(var14, var15, var11.field3270, var11.field3252, var72);
                                        } else {
                                            class75.method513(var14, var15, var11.field3270, var11.field3252, var72);
                                        }
                                    } else if (var11.field3240) {
                                        class75.method510(var14, var15, var11.field3270, var11.field3252, var72, 256 - (var13 & 0xFF));
                                    } else {
                                        class75.method518(var14, var15, var11.field3270, var11.field3252, var72, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field3289 == 4) {
                                    class274 var73 = var11.method1330((byte) -119, class140.field2434);
                                    if (var73 != null) {
                                        class93 var74 = var11.field3258;
                                        int var75;
                                        if (class260.method1750(false, var11)) {
                                            var75 = var11.field3231;
                                            if (class232.field4146 == var11 && var11.field3199 != 0) {
                                                var75 = var11.field3199;
                                            }
                                            if (var11.field3213.method666(false) > 0) {
                                                var74 = var11.field3213;
                                            }
                                        } else {
                                            var75 = var11.field3180;
                                            if (class232.field4146 == var11 && var11.field3187 != 0) {
                                                var75 = var11.field3187;
                                            }
                                        }
                                        if (var11.field3307 && var11.field3357 != -1) {
                                            class29 var76 = class89.method617(var11.field3357, 0);
                                            var74 = var76.field357;
                                            if (var74 == null) {
                                                var74 = class167.field2937;
                                            }
                                            if ((var76.field414 == 1 || var11.field3250 != 1) && var11.field3250 != -1) {
                                                var74 = class130.method949((byte) -77, new class93[] { class139.field2414, var74, class83.field1523, class241.method1645((byte) 72, var11.field3250) });
                                            }
                                        }
                                        if (class139.field2410 == var11) {
                                            var75 = var11.field3180;
                                            var74 = class200.field3624;
                                        }
                                        if (!var11.field3307) {
                                            var74 = class149.method1076(var74, true, var11);
                                        }
                                        var73.method1821(var74, var14, var15, var11.field3270, var11.field3252, var75, var11.field3256 ? 0 : -1, var11.field3183, var11.field3288, var11.field3272);
                                    } else if (class188.field3453) {
                                        class254.method1731(var11, (byte) 116);
                                    }
                                } else if (var11.field3289 == 5) {
                                    if (var11.field3307) {
                                        class120 var78;
                                        if (var11.field3357 == -1) {
                                            var78 = var11.method1337(-65536, false);
                                        } else {
                                            var78 = class78.method540(65536, var11.field3357, var11.field3228, var11.field3232, var11.field3195, var11.field3250);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field2130;
                                            int var80 = var78.field2129;
                                            if (var11.field3198) {
                                                int var82 = (var11.field3252 + var80 - 1) / var80;
                                                int var83 = (var79 + var11.field3270 - 1) / var79;
                                                class75.method520(var14, var15, var11.field3270 + var14, var11.field3252 + var15);
                                                for (int var84 = 0; var84 < var83; var84++) {
                                                    for (int var85 = 0; var85 < var82; var85++) {
                                                        if (var11.field3273 != 0) {
                                                            var78.method889(4096, var11.field3273, (byte) 74, var80 * var85 + var80 / 2 + var15, var79 / 2 + var79 * var84 + var14);
                                                        } else if (var13 == 0) {
                                                            var78.method560(var79 * var84 + var14, var80 * var85 + var15);
                                                        } else {
                                                            var78.method559(var79 * var84 + var14, var80 * var85 + var15, 256 - (var13 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class75.method507(arg2, arg0, arg6, arg5);
                                            } else {
                                                int var81 = var11.field3270 * 4096 / var79;
                                                if (var11.field3273 != 0) {
                                                    var78.method889(var81, var11.field3273, (byte) 71, var15 + (var11.field3252 / 2), var11.field3270 / 2 + var14);
                                                } else if (var13 != 0) {
                                                    var78.method562(var14, var15, var11.field3270, var11.field3252, 256 - (var13 & 0xFF));
                                                } else if (var11.field3270 == var79 && var11.field3252 == var80) {
                                                    var78.method560(var14, var15);
                                                } else {
                                                    var78.method563(var14, var15, var11.field3270, var11.field3252);
                                                }
                                            }
                                        } else if (class188.field3453) {
                                            class254.method1731(var11, (byte) -85);
                                        }
                                    } else {
                                        class120 var77 = var11.method1337(-65536, class260.method1750(false, var11));
                                        if (var77 != null) {
                                            var77.method560(var14, var15);
                                        } else if (class188.field3453) {
                                            class254.method1731(var11, (byte) 114);
                                        }
                                    }
                                } else if (var11.field3289 == 6) {
                                    boolean var86 = class260.method1750(false, var11);
                                    int var87;
                                    if (var86) {
                                        var87 = var11.field3305;
                                    } else {
                                        var87 = var11.field3203;
                                    }
                                    class20 var88 = null;
                                    int var89 = 0;
                                    if (var11.field3357 != -1) {
                                        class29 var90 = class89.method617(var11.field3357, 0);
                                        if (var90 != null) {
                                            class29 var91 = var90.method172(-123, var11.field3250);
                                            class31 var92 = var87 == -1 ? null : class131.method964(var87, true);
                                            var88 = var91.method166(var11.field3204, -1, var11.field3328, var11.field3337, 1, var92);
                                            if (var88 == null) {
                                                class254.method1731(var11, (byte) 122);
                                            } else {
                                                var89 = -var88.method93() / 2;
                                            }
                                        }
                                    } else if (var11.field3287 == 5) {
                                        if (var11.field3326 == -1) {
                                            var88 = class46.field737.method1167((class31) null, arg7 - 21175, (class31) null, 0, 0, -1, -1, true, -1, -1, (class208[]) null);
                                        } else {
                                            int var93 = var11.field3326 & 0x7FF;
                                            if (class141.field2446 == var93) {
                                                var93 = 2047;
                                            }
                                            class237 var94 = class224.field4031[var93];
                                            class31 var95 = var87 == -1 ? null : class131.method964(var87, true);
                                            if (var94 != null && (int) var94.field4247.method679((byte) 72) << 11 == (var11.field3326 & 0xFFFFF800)) {
                                                var88 = var94.field4249.method1167(var95, 0, (class31) null, 0, 0, -1, -1, true, 0, var11.field3328, (class208[]) null);
                                            }
                                        }
                                    } else if (var87 == -1) {
                                        var88 = var11.method1329(var86, 0, -1, class166.field2927.field4249, (class31) null, -1, 0);
                                        if (var88 == null && class188.field3453) {
                                            class254.method1731(var11, (byte) 68);
                                        }
                                    } else {
                                        class31 var96 = class131.method964(var87, true);
                                        var88 = var11.method1329(var86, var11.field3337, var11.field3328, class166.field2927.field4249, var96, var11.field3204, arg7 - 21175);
                                        if (var88 == null && class188.field3453) {
                                            class254.method1731(var11, (byte) -92);
                                        }
                                    }
                                    if (var88 != null) {
                                        int var97;
                                        if (var11.field3292 > 0) {
                                            var97 = (var11.field3270 << 8) / var11.field3292;
                                        } else {
                                            var97 = 256;
                                        }
                                        int var98;
                                        if (var11.field3200 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var11.field3252 << 8) / var11.field3200;
                                        }
                                        int var99 = (var11.field3315 * var97 >> 8) + var11.field3270 / 2 + var14;
                                        int var100 = var11.field3252 / 2 + var15 + (var11.field3193 * var98 >> 8);
                                        class179.method1307(var99, var100);
                                        int var101 = class179.field3155[var11.field3254] * var11.field3260 >> 16;
                                        int var102 = class179.field3158[var11.field3254] * var11.field3260 >> 16;
                                        if (!var11.field3307) {
                                            var88.method112(0, var11.field3243, 0, var11.field3254, 0, var101, var102, -1L);
                                        } else if (var11.field3216) {
                                            ((class62) var88).method396(0, var11.field3243, var11.field3355, var11.field3254, var11.field3325, var11.field3249 + var101 + var89, var11.field3249 + var102, var11.field3260);
                                        } else {
                                            var88.method112(0, var11.field3243, var11.field3355, var11.field3254, var11.field3325, var11.field3249 + var89 + var101, var102 - -var11.field3249, -1L);
                                        }
                                        class179.method1310();
                                    }
                                } else {
                                    if (var11.field3289 == 7) {
                                        class274 var103 = var11.method1330((byte) -122, class140.field2434);
                                        if (var103 == null) {
                                            if (class188.field3453) {
                                                class254.method1731(var11, (byte) -120);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field3210; var105++) {
                                            for (int var106 = 0; var106 < var11.field3277; var106++) {
                                                if (var11.field3301[var104] > 0) {
                                                    class29 var107 = class89.method617(var11.field3301[var104] - 1, 0);
                                                    class93 var108;
                                                    if (var107.field414 != 1 && var11.field3304[var104] == 1) {
                                                        var108 = class130.method949((byte) -77, new class93[] { class139.field2414, var107.field357, class109.field1861 });
                                                    } else {
                                                        var108 = class130.method949((byte) -77, new class93[] { class139.field2414, var107.field357, class83.field1523, class241.method1645((byte) 72, var11.field3304[var104]) });
                                                    }
                                                    int var109 = (var11.field3331 + 12) * var105 + var15;
                                                    int var110 = (var11.field3303 + 115) * var106 + var14;
                                                    if (var11.field3183 == 0) {
                                                        var103.method1832(var108, var110, var109, var11.field3180, var11.field3256 ? 0 : -1);
                                                    } else if (var11.field3183 == 1) {
                                                        var103.method1836(var108, var110 + 57, var109, var11.field3180, var11.field3256 ? 0 : -1);
                                                    } else {
                                                        var103.method1833(var108, var110 + 115 - 1, var109, var11.field3180, var11.field3256 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var11.field3289 == 8 && class78.field1463 == var11 && class61.field1037 == class214.field3921) {
                                        int var111 = 0;
                                        int var112 = 0;
                                        class274 var113 = class140.field2436;
                                        class93 var114 = var11.field3258;
                                        class93 var115 = class149.method1076(var114, true, var11);
                                        while (var115.method666(false) > 0) {
                                            int var123 = var115.method652(class101.field1754, 9);
                                            class93 var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = class178.field3144;
                                            } else {
                                                var124 = var115.method674(arg7 - 21092, 0, var123);
                                                var115 = var115.method637(arg7 - 21061, var123 + 4);
                                            }
                                            int var125 = var113.method1820(var124);
                                            if (var125 > var111) {
                                                var111 = var125;
                                            }
                                            var112 += var113.field4888 + 1;
                                        }
                                        var111 += 6;
                                        var112 += 7;
                                        int var116 = var14 + var11.field3270 - var111 - 5;
                                        int var117 = var11.field3252 + var15 + 5;
                                        if (arg5 < var112 + var117) {
                                            var117 = arg5 - var112;
                                        }
                                        if (var116 < var14 + 5) {
                                            var116 = var14 + 5;
                                        }
                                        if (arg6 < (var111 + var116)) {
                                            var116 = arg6 - var111;
                                        }
                                        class75.method517(var116, var117, var111, var112, 16777120);
                                        class75.method513(var116, var117, var111, var112, 0);
                                        class93 var118 = var11.field3258;
                                        int var119 = var113.field4888 + var117 + 2;
                                        class93 var120 = class149.method1076(var118, true, var11);
                                        while (var120.method666(false) > 0) {
                                            int var121 = var120.method652(class101.field1754, 9);
                                            class93 var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = class178.field3144;
                                            } else {
                                                var122 = var120.method674(-81, 0, var121);
                                                var120 = var120.method637(arg7 ^ 0x528B, var121 + 4);
                                            }
                                            var113.method1832(var122, var116 + 3, var119, 0, -1);
                                            var119 += var113.field4888 + 1;
                                        }
                                    }
                                    if (var11.field3289 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field3283) {
                                            var128 = var15 + var11.field3252;
                                            var129 = var14;
                                            var126 = var14 + var11.field3270;
                                            var127 = var15;
                                        } else {
                                            var126 = var11.field3270 + var14;
                                            var127 = var11.field3252 + var15;
                                            var128 = var15;
                                            var129 = var14;
                                        }
                                        if (var11.field3312 == 1) {
                                            class75.method509(var129, var128, var126, var127, var11.field3180);
                                        } else {
                                            class75.method512(var129, var128, var126, var127, var11.field3180, var11.field3312);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lhg;Lhg;)V")
    public class111(class177 arg0, class177 arg1) {
        this.field1893 = arg0;
        this.field1899 = arg1;
    }
}
