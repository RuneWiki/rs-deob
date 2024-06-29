import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class461 extends class211 {

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    private int field6729 = 0;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    private int field6736 = 4096;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field6738 = new String[] { method3515(method3514(" uVXP")), method3515(method3514(" uV_P")), method3515(method3514("'o\u0014p")), method3515(method3514("24V2\u0005")), method3515(method3514("&j\u001dr\u000b'")), method3515(method3514("i7X")), method3515(method3514("us\u0015{Ey$")), method3515(method3514("us\u0015{Ex$")), method3515(method3514(" t\u000esB")), method3515(method3514(" uV]P")), method3515(method3514("is\b&")), method3515(method3514("\u001d+X1X")), method3515(method3514(" uVYP")), method3515(method3514(" uVZP")), method3515(method3514(" uV^P")), method3515(method3514(" uVUP")) };

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)Z", line = 6)
    public static final boolean method3510(boolean arg0) throws IOException {
        try {
            ++field6737;
            if (class629.field9198 == null) {
                return false;
            } else {
                if (class662.field9567 == null) {
                    if (class729.field10574) {
                        if (!class629.field9198.method2698(108, 1)) {
                            return false;
                        }
                        class629.field9198.method2697(0, 1, 2, class430.field6332.field2209);
                        ++class653.field9442;
                        class729.field10574 = false;
                        class180.field2497 = 0;
                    }
                    class430.field6332.field2201 = 0;
                    if (class430.field6332.method150(255)) {
                        if (!class629.field9198.method2698(-127, 1)) {
                            return false;
                        }
                        class629.field9198.method2697(1, 1, 2, class430.field6332.field2209);
                        ++class653.field9442;
                        class180.field2497 = 0;
                    }
                    class729.field10574 = true;
                    class573[] var1 = class156.method1307(0);
                    int var2 = class430.field6332.method151((byte) 77);
                    if (var2 < 0 || ~var1.length >= ~var2) {
                        throw new IOException(field6738[8] + var2 + field6738[10] + class430.field6332.field2201);
                    }
                    class662.field9567 = var1[var2];
                    class476.field6930 = class662.field9567.field8467;
                }
                if (class476.field6930 == -1) {
                    if (!class629.field9198.method2698(-9, 1)) {
                        return false;
                    }
                    class629.field9198.method2697(0, 1, 2, class430.field6332.field2209);
                    class476.field6930 = 255 & class430.field6332.field2209[0];
                    ++class653.field9442;
                    class180.field2497 = 0;
                }
                if (~class476.field6930 == 1) {
                    if (!class629.field9198.method2698(-39, 2)) {
                        return false;
                    }
                    class629.field9198.method2697(0, 2, 2, class430.field6332.field2209);
                    class430.field6332.field2201 = 0;
                    class476.field6930 = class430.field6332.method1445((byte) 126);
                    class180.field2497 = 0;
                    class653.field9442 += 2;
                }
                if (~class476.field6930 < -1) {
                    if (!class629.field9198.method2698(86, class476.field6930)) {
                        return false;
                    }
                    class430.field6332.field2201 = 0;
                    class629.field9198.method2697(0, class476.field6930, 2, class430.field6332.field2209);
                    class653.field9442 += class476.field6930;
                    class180.field2497 = 0;
                }
                class70.field750 = class6.field68;
                class6.field68 = class515.field7449;
                class515.field7449 = class662.field9567;
                if (class662.field9567 == class289.field4293) {
                    int var3 = class430.field6332.method1445((byte) 113);
                    int var4 = class430.field6332.method1431(-87);
                    int var5 = class430.field6332.method1441(123);
                    int var6 = class430.field6332.method1453((byte) 124);
                    int var7 = class430.field6332.method1455((byte) 62);
                    int var8 = class430.field6332.method1444(-113);
                    int var9 = var4 & 7;
                    int var10 = (var4 & 127) >> 3;
                    if (var10 == 15) {
                        var10 = -1;
                    }
                    if (var6 >> 30 == 0) {
                        if (var6 >> 29 == 0) {
                            if (~(var6 >> 28) != -1) {
                                int var11 = 65535 & var6;
                                class726 var12;
                                if (class722.field10458 == var11) {
                                    var12 = class225.field3446;
                                } else {
                                    var12 = class197.field2685[var11];
                                }
                                if (var12 != null) {
                                    class49 var13 = var12.field3775[var7];
                                    if (var5 == 65535) {
                                        var5 = -1;
                                    }
                                    boolean var14 = true;
                                    int var15 = var13.field563;
                                    if (var5 != -1 && var15 != -1) {
                                        if (~var5 != ~var15) {
                                            class217 var16 = class771.field11208.method2509(-118, var5);
                                            class217 var17 = class771.field11208.method2509(-116, var15);
                                            if (~var16.field3313 != 0 && var17.field3313 != -1) {
                                                class344 var18 = class272.field4122.method2242(var16.field3313, 100);
                                                class344 var19 = class272.field4122.method2242(var17.field3313, 100);
                                                if (~var19.field5348 < ~var18.field5348) {
                                                    var14 = false;
                                                }
                                            }
                                        } else {
                                            class217 var20 = class771.field11208.method2509(-116, var5);
                                            if (var20.field3306 && ~var20.field3313 != 0) {
                                                class344 var21 = class272.field4122.method2242(var20.field3313, 100);
                                                int var22 = var21.field5364;
                                                if (var22 != 0 && var22 != 2) {
                                                    if (~var22 == -2) {
                                                        var14 = true;
                                                    }
                                                } else {
                                                    var14 = false;
                                                }
                                            }
                                        }
                                    }
                                    if (var14) {
                                        var13.field562 = class375.field5711 + var3;
                                        var13.field557 = var9;
                                        var13.field553 = var10;
                                        var13.field561 = 1;
                                        var13.field563 = var5;
                                        var13.field555 = var8;
                                        var13.field558 = 0;
                                        var13.field554 = 0;
                                        if (~class375.field5711 > ~var13.field562) {
                                            var13.field558 = -1;
                                        }
                                        if (~var13.field563 == -65536) {
                                            var13.field563 = -1;
                                        }
                                        if (var13.field563 != -1 && class375.field5711 == var13.field562) {
                                            int var23 = class771.field11208.method2509(-120, var13.field563).field3313;
                                            if (var23 != -1) {
                                                class344 var24 = class272.field4122.method2242(var23, 100);
                                                if (var24 != null && var24.field5366 != null && !var12.field3800) {
                                                    class418.method3242(-256, var24, var12, 0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int var25 = 65535 & var6;
                            class383 var26 = (class383) class207.field3184.method977((long) var25, 1);
                            if (var26 != null) {
                                class612 var27 = var26.field5799;
                                if (var5 == 65535) {
                                    var5 = -1;
                                }
                                class49 var28 = var27.field3775[var7];
                                boolean var29 = true;
                                int var30 = var28.field563;
                                if (var5 != -1 && ~var30 != 0) {
                                    if (var5 == var30) {
                                        class217 var31 = class771.field11208.method2509(-95, var5);
                                        if (var31.field3306 && ~var31.field3313 != 0) {
                                            class344 var32 = class272.field4122.method2242(var31.field3313, 100);
                                            int var33 = var32.field5364;
                                            if (~var33 != -1 && ~var33 != -3) {
                                                if (~var33 == -2) {
                                                    var29 = true;
                                                }
                                            } else {
                                                var29 = false;
                                            }
                                        }
                                    } else {
                                        class217 var34 = class771.field11208.method2509(-121, var5);
                                        class217 var35 = class771.field11208.method2509(-122, var30);
                                        if (var34.field3313 != -1 && ~var35.field3313 != 0) {
                                            class344 var36 = class272.field4122.method2242(var34.field3313, 100);
                                            class344 var37 = class272.field4122.method2242(var35.field3313, 100);
                                            if (~var36.field5348 > ~var37.field5348) {
                                                var29 = false;
                                            }
                                        }
                                    }
                                }
                                if (var29) {
                                    var28.field562 = class375.field5711 - -var3;
                                    var28.field555 = var8;
                                    var28.field561 = 1;
                                    var28.field553 = var10;
                                    var28.field563 = var5;
                                    var28.field557 = var9;
                                    var28.field558 = 0;
                                    var28.field554 = 0;
                                    if (class375.field5711 < var28.field562) {
                                        var28.field558 = -1;
                                    }
                                    if (~var28.field563 == -65536) {
                                        var28.field563 = -1;
                                    }
                                    if (var28.field563 != -1 && ~class375.field5711 == ~var28.field562) {
                                        int var38 = class771.field11208.method2509(-116, var28.field563).field3313;
                                        if (~var38 != 0) {
                                            class344 var39 = class272.field4122.method2242(var38, 100);
                                            if (var39 != null && var39.field5366 != null && !var27.field3800) {
                                                class418.method3242(-256, var39, var27, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var40 = (var6 & 945850163) >> 28;
                        int var41 = ((268433896 & var6) >> 14) + -class494.field7101;
                        int var42 = (16383 & var6) - class281.field4219;
                        if (var41 >= 0 && var42 >= 0 && ~var41 > ~class648.field9378 && ~var42 > ~class659.field9506) {
                            int var43 = var41 * 512 + 256;
                            int var44 = var42 * 512 + 256;
                            int var45 = var40;
                            if (var40 < 3 && class231.method1980(1, var42, var41)) {
                                var45 = var40 + 1;
                            }
                            class464 var46 = new class464(var5, var3, class375.field5711, var40, var45, var43, -var8 + class316.method2656(var43, var40, var44, 0), var44, var41, var41, var42, var42, var9);
                            class112.field1301.method3868(-96, new class329(var46));
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class267.field4084) {
                    int var47 = class430.field6332.method1409(-123);
                    class61.method445(8321);
                    class662.field9567 = null;
                    class279.field4192 = var47;
                    return true;
                } else if (class662.field9567 == class518.field7491) {
                    int var48 = class430.field6332.method1444(-99);
                    int var49 = class430.field6332.method1409(-85);
                    boolean var50 = ~(var49 & 1) == -2;
                    class153.method1281(var48, var50, arg0);
                    class534.field7825[class291.method2359(31, class773.field11239++)] = var48;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class376.field5732) {
                    int var51 = class430.field6332.method1445((byte) 101);
                    int var52 = class430.field6332.method1400(65280);
                    int var53 = class430.field6332.method1432((byte) -62);
                    if (~var53 == -65536) {
                        var53 = -1;
                    }
                    int var54 = class430.field6332.method1444(23);
                    class61.method445(8321);
                    if (var54 == 65535) {
                        var54 = -1;
                    }
                    for (int var55 = var54; ~var53 <= ~var55; ++var55) {
                        long var56 = (long) var55 + ((long) var52 << 32);
                        class469 var58 = (class469) class704.field10226.method977(var56, 1);
                        class469 var59;
                        if (var58 == null) {
                            if (~var55 != 0) {
                                var59 = new class469(0, var51);
                            } else {
                                var59 = new class469(method3513(var52, 111).field8046.field6808, var51);
                            }
                        } else {
                            var59 = new class469(var58.field6808, var51);
                            var58.method1824(1);
                        }
                        class704.field10226.method968((byte) -111, var56, var59);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class269.field4099) {
                    String var60 = class430.field6332.method1423(79);
                    int var61 = class430.field6332.method1445((byte) 108);
                    String var62 = class690.field10023.method4954(var61, 114).method276(class430.field6332, -73);
                    class726.method5297(-126, var60, 0, (String) null, var61, var60, var60, var62, 19);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class182.field2512) {
                    class274.field4138 = class430.field6332.method1462(true);
                    class662.field9567 = null;
                    if (~class274.field4138 == -1 || class274.field4138 == 1) {
                        class493.field7069 = true;
                    }
                    return true;
                } else if (class662.field9567 == class409.field6061) {
                    boolean var63 = class430.field6332.method1455((byte) 62) == 1;
                    String var64 = class430.field6332.method1423(86);
                    long var65 = (long) class430.field6332.method1445((byte) 109);
                    long var67 = (long) class430.field6332.method1436((byte) 102);
                    int var69 = class430.field6332.method1455((byte) 62);
                    int var70 = class430.field6332.method1445((byte) 118);
                    long var71 = (var65 << 32) + var67;
                    boolean var73 = false;
                    Object var74 = null;
                    class705 var75 = var63 ? class638.field9268 : class66.field684;
                    if (var75 == null) {
                        var73 = true;
                    } else {
                        label2427: {
                            for (int var76 = 0; ~var76 > -101; ++var76) {
                                if (class689.field9983[var76] == var71) {
                                    var73 = true;
                                    break label2427;
                                }
                            }
                            if (var69 <= 1 && class777.method5623(-16476, var64)) {
                                var73 = true;
                            }
                        }
                    }
                    if (!var73 && class37.field425 == 0) {
                        class689.field9983[class23.field272] = var71;
                        class23.field272 = (class23.field272 + 1) % 100;
                        String var77 = class690.field10023.method4954(var70, 77).method276(class430.field6332, -66);
                        int var78 = var63 ? 42 : 45;
                        if (var69 != 2 && var69 != 3) {
                            if (var69 == 1) {
                                class726.method5297(-128, var64, 0, var75.field10238, var70, field6738[6] + var64, field6738[6] + var64, var77, var78);
                            } else {
                                class726.method5297(-128, var64, 0, var75.field10238, var70, var64, var64, var77, var78);
                            }
                        } else {
                            class726.method5297(-128, var64, 0, var75.field10238, var70, field6738[7] + var64, field6738[7] + var64, var77, var78);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class387.field5847) {
                    int var79 = class430.field6332.method1432((byte) -38);
                    int var80 = class430.field6332.method1429((byte) 73);
                    class276.field4168.method5132(var79, (byte) -62, var80);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class169.field2317) {
                    int var81 = class430.field6332.method1425(20);
                    int var82 = class430.field6332.method1453((byte) 80);
                    int var83 = class430.field6332.method1455((byte) 62);
                    String var84 = "";
                    String var85 = var84;
                    if ((var83 & 1) != 0) {
                        var84 = class430.field6332.method1423(-78);
                        if ((2 & var83) == 0) {
                            var85 = var84;
                        } else {
                            var85 = class430.field6332.method1423(-115);
                        }
                    }
                    String var86 = class430.field6332.method1423(62);
                    if (var81 == 99) {
                        class437.method3350(87, var86);
                    } else {
                        if (!var85.equals("") && class777.method5623(-16476, var85)) {
                            class662.field9567 = null;
                            return true;
                        }
                        class150.method1265(var84, var86, -1, var84, var82, var81, var85);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class282.field4226) {
                    class157.field1960 = class430.field6332.method1455((byte) 62);
                    for (int var87 = 0; ~var87 > ~class157.field1960; ++var87) {
                        class54.field598[var87] = class430.field6332.method1423(66);
                        class83.field927[var87] = class430.field6332.method1423(72);
                        if (class83.field927[var87].equals("")) {
                            class83.field927[var87] = class54.field598[var87];
                        }
                        class666.field9687[var87] = class430.field6332.method1423(-28);
                        class298.field4705[var87] = class430.field6332.method1423(112);
                        if (class298.field4705[var87].equals("")) {
                            class298.field4705[var87] = class666.field9687[var87];
                        }
                        class502.field7253[var87] = false;
                    }
                    class662.field9567 = null;
                    class117.field1392 = class28.field349;
                    return true;
                } else if (class662.field9567 == class603.field8845) {
                    class210.method1848(0);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class507.field7342) {
                    int var88 = class430.field6332.method1453((byte) 90);
                    class61.method445(8321);
                    class6.method39(class722.field10458, 5, var88, 0, 4);
                    class662.field9567 = null;
                    return true;
                } else if (class779.field11349 == class662.field9567) {
                    class711.method5184(true, class559.field8302);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class13.field156) {
                    int var89 = class430.field6332.method1445((byte) 107);
                    if (var89 == 65535) {
                        var89 = -1;
                    }
                    int var90 = class430.field6332.method1455((byte) 62);
                    int var91 = class430.field6332.method1445((byte) 121);
                    int var92 = class430.field6332.method1455((byte) 62);
                    int var93 = class430.field6332.method1445((byte) 102);
                    class655.method4802(var91, var93, var90, var92, var89, (byte) -95);
                    class662.field9567 = null;
                    return true;
                } else if (class716.field10348 == class662.field9567) {
                    int var94 = class430.field6332.method1400(65280);
                    class61.method445(8321);
                    class454 var95 = (class454) class661.field9563.method977((long) var94, 1);
                    if (var95 != null) {
                        class440.method3381(var95, 0, true, false);
                    }
                    if (class502.field7260 != null) {
                        class115.method1013(true, class502.field7260);
                        class502.field7260 = null;
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class154.field1897) {
                    boolean var96 = class430.field6332.method1455((byte) 62) == 1;
                    String var97 = class430.field6332.method1423(-14);
                    String var98 = var97;
                    if (var96) {
                        var98 = class430.field6332.method1423(-61);
                    }
                    long var99 = (long) class430.field6332.method1445((byte) 103);
                    long var101 = (long) class430.field6332.method1436((byte) 62);
                    int var103 = class430.field6332.method1455((byte) 62);
                    long var104 = (var99 << 32) + var101;
                    boolean var106 = false;
                    int var107 = 0;
                    while (true) {
                        if (~var107 <= -101) {
                            if (~var103 >= -2) {
                                if ((!class352.field5427 || class277.field4172) && !class428.field6294) {
                                    if (class777.method5623(-16476, var98)) {
                                        var106 = true;
                                    }
                                } else {
                                    var106 = true;
                                }
                            }
                            break;
                        }
                        if (~class689.field9983[var107] == ~var104) {
                            var106 = true;
                            break;
                        }
                        ++var107;
                    }
                    if (!var106 && class37.field425 == 0) {
                        class689.field9983[class23.field272] = var104;
                        class23.field272 = (class23.field272 - -1) % 100;
                        String var108 = class116.method1020(class685.method5023(class430.field6332, (byte) 124), 24347);
                        if (~var103 == -3) {
                            class726.method5297(-127, var97, 0, (String) null, -1, field6738[7] + var97, field6738[7] + var98, var108, 7);
                        } else if (var103 != 1) {
                            class726.method5297(-128, var97, 0, (String) null, -1, var97, var98, var108, 3);
                        } else {
                            class726.method5297(-127, var97, 0, (String) null, -1, field6738[6] + var97, field6738[6] + var98, var108, 7);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class217.field3314) {
                    int var109 = class430.field6332.method1445((byte) 108);
                    int var110 = class430.field6332.method1400(65280);
                    int var111 = class430.field6332.method1432((byte) -29);
                    int var112 = class430.field6332.method1455((byte) 62);
                    class61.method445(8321);
                    class58.method427(19, var111, var112, var110, var109);
                    class662.field9567 = null;
                    return true;
                } else if (class781.field11365 == class662.field9567) {
                    int var113 = class430.field6332.method1445((byte) 119);
                    int var114 = class430.field6332.method1441(118);
                    int var115 = class430.field6332.method1453((byte) 125);
                    int var116 = class430.field6332.method1431(-90);
                    class61.method445(8321);
                    class494.method3732(var116, var114, var113, var115, 796841760);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class657.field9492) {
                    while (class476.field6930 > class430.field6332.field2201) {
                        boolean var117 = class430.field6332.method1455((byte) 62) == 1;
                        String var118 = class430.field6332.method1423(101);
                        String var119 = class430.field6332.method1423(113);
                        int var120 = class430.field6332.method1445((byte) 101);
                        int var121 = class430.field6332.method1455((byte) 62);
                        String var122 = "";
                        boolean var123 = false;
                        if (~var120 < -1) {
                            var122 = class430.field6332.method1423(-24);
                            var123 = class430.field6332.method1455((byte) 62) == 1;
                        }
                        for (int var124 = 0; ~class588.field8654 < ~var124; ++var124) {
                            if (var117) {
                                if (var119.equals(class754.field10971[var124])) {
                                    class754.field10971[var124] = var118;
                                    var118 = null;
                                    class311.field4935[var124] = var119;
                                    break;
                                }
                            } else if (var118.equals(class754.field10971[var124])) {
                                if (class722.field10461[var124] != var120) {
                                    boolean var125 = true;
                                    for (class75 var126 = (class75) class254.field3944.method4538(!arg0); var126 != null; var126 = (class75) class254.field3944.method4543(0)) {
                                        if (var126.field868.equals(var118)) {
                                            if (var120 != 0 && ~var126.field866 == -1) {
                                                var125 = false;
                                                var126.method4696(74);
                                            } else if (~var120 == -1 && var126.field866 != 0) {
                                                var125 = false;
                                                var126.method4696(-97);
                                            }
                                        }
                                    }
                                    if (var125) {
                                        class254.field3944.method4541((byte) 67, new class75(var118, var120));
                                    }
                                    class722.field10461[var124] = var120;
                                }
                                class311.field4935[var124] = var119;
                                class341.field5301[var124] = var122;
                                class339.field5287[var124] = var121;
                                class751.field10932[var124] = var123;
                                var118 = null;
                                break;
                            }
                        }
                        if (var118 != null && class588.field8654 < 200) {
                            class754.field10971[class588.field8654] = var118;
                            class311.field4935[class588.field8654] = var119;
                            class722.field10461[class588.field8654] = var120;
                            class341.field5301[class588.field8654] = var122;
                            class339.field5287[class588.field8654] = var121;
                            class751.field10932[class588.field8654] = var123;
                            ++class588.field8654;
                        }
                    }
                    class117.field1392 = class28.field349;
                    class606.field8878 = 2;
                    boolean var127 = false;
                    int var128 = class588.field8654;
                    while (~var128 < -1) {
                        --var128;
                        boolean var129 = true;
                        for (int var130 = 0; var128 > var130; ++var130) {
                            if (~class722.field10461[var130] != ~class54.field592.field243 && class722.field10461[var130 + 1] == class54.field592.field243 || class722.field10461[var130] == 0 && ~class722.field10461[var130 + 1] != -1) {
                                int var131 = class722.field10461[var130];
                                class722.field10461[var130] = class722.field10461[var130 - -1];
                                class722.field10461[var130 + 1] = var131;
                                String var132 = class341.field5301[var130];
                                class341.field5301[var130] = class341.field5301[var130 - -1];
                                class341.field5301[var130 + 1] = var132;
                                String var133 = class754.field10971[var130];
                                class754.field10971[var130] = class754.field10971[var130 + 1];
                                class754.field10971[var130 - -1] = var133;
                                String var134 = class311.field4935[var130];
                                class311.field4935[var130] = class311.field4935[var130 + 1];
                                class311.field4935[var130 - -1] = var134;
                                int var135 = class339.field5287[var130];
                                class339.field5287[var130] = class339.field5287[var130 + 1];
                                class339.field5287[var130 + 1] = var135;
                                boolean var136 = class751.field10932[var130];
                                class751.field10932[var130] = class751.field10932[var130 - -1];
                                var129 = false;
                                class751.field10932[var130 + 1] = var136;
                            }
                        }
                        if (var129) {
                            break;
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class521.field7630) {
                    boolean var137 = class430.field6332.method1455((byte) 62) == 1;
                    String var138 = class430.field6332.method1423(-35);
                    String var139 = var138;
                    if (var137) {
                        var139 = class430.field6332.method1423(-114);
                    }
                    int var140 = class430.field6332.method1455((byte) 62);
                    int var141 = class430.field6332.method1445((byte) 108);
                    boolean var142 = false;
                    if (var140 <= 1 && class777.method5623(-16476, var139)) {
                        var142 = true;
                    }
                    if (!var142 && class37.field425 == 0) {
                        String var143 = class690.field10023.method4954(var141, 118).method276(class430.field6332, -114);
                        if (~var140 != -3) {
                            if (var140 != 1) {
                                class726.method5297(-128, var138, 0, (String) null, var141, var138, var139, var143, 25);
                            } else {
                                class726.method5297(-128, var138, 0, (String) null, var141, field6738[6] + var138, field6738[6] + var139, var143, 25);
                            }
                        } else {
                            class726.method5297(-127, var138, 0, (String) null, var141, field6738[7] + var138, field6738[7] + var139, var143, 25);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class414.field6096) {
                    int var144 = class430.field6332.method1432((byte) -84);
                    int var145 = class430.field6332.method1441(109);
                    int var146 = class430.field6332.method1444(-128);
                    int var147 = class430.field6332.method1429((byte) 48);
                    class61.method445(8321);
                    class6.method39(var146 << 16 | var145, 7, var147, var144, 4);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class384.field5808) {
                    if (class742.field10801 != -1) {
                        class781.method5644(class742.field10801, 70, 0);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class611.field8919) {
                    class582.field8619 = class430.field6332.method1455((byte) 62);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class625.field9143) {
                    int var148 = class430.field6332.method1444(89);
                    if (var148 == 65535) {
                        var148 = -1;
                    }
                    int var149 = class430.field6332.method1400(65280);
                    class61.method445(8321);
                    class745.method5432(var149, 16, var148);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class606.field8879) {
                    int var150 = class430.field6332.method1432((byte) -100);
                    String var151 = class430.field6332.method1423(109);
                    class61.method445(8321);
                    class182.method1589(var150, (byte) -68, var151);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class154.field1907) {
                    class593.method4416((byte) -79);
                    class662.field9567 = null;
                    return false;
                } else if (class662.field9567 == class276.field4167) {
                    int var152 = class430.field6332.method1429((byte) 104);
                    int var153 = class430.field6332.method1441(21);
                    class61.method445(8321);
                    class506.method3812(var152, -48, var153);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class186.field2561) {
                    int var154 = class430.field6332.method1445((byte) 110);
                    class726 var155;
                    if (class722.field10458 != var154) {
                        var155 = class197.field2685[var154];
                    } else {
                        var155 = class225.field3446;
                    }
                    if (var155 == null) {
                        class662.field9567 = null;
                        return true;
                    } else {
                        int var156 = class430.field6332.method1445((byte) 115);
                        int var157 = class430.field6332.method1455((byte) 62);
                        boolean var158 = ~(32768 & var156) != -1;
                        if (var155.field10506 != null && var155.field10513 != null) {
                            boolean var159 = false;
                            if (~var157 >= -2) {
                                if (!var158 && (class352.field5427 && !class277.field4172 || class428.field6294)) {
                                    var159 = true;
                                } else if (class777.method5623(-16476, var155.field10506)) {
                                    var159 = true;
                                }
                            }
                            if (!var159 && ~class37.field425 == -1) {
                                int var160 = -1;
                                String var161;
                                if (!var158) {
                                    var161 = class116.method1020(class685.method5023(class430.field6332, (byte) 124), 24347);
                                } else {
                                    var156 &= 32767;
                                    class263 var162 = class780.method5639(class430.field6332, -18246);
                                    var160 = var162.field4041;
                                    var161 = var162.field4040.method276(class430.field6332, -98);
                                }
                                var155.field3782 = var161.trim();
                                var155.field3812 = 150;
                                var155.field3805 = var156 >> 8;
                                var155.field3776 = 255 & var156;
                                int var163;
                                if (var157 != 1 && var157 != 2) {
                                    var163 = !var158 ? 2 : 17;
                                } else {
                                    var163 = !var158 ? 1 : 17;
                                }
                                if (var157 != 2) {
                                    if (~var157 == -2) {
                                        class726.method5297(-128, var155.field10491, 0, (String) null, var160, field6738[6] + var155.method5289(-2068, true), field6738[6] + var155.method5298(false, (byte) -3), var161, var163);
                                    } else {
                                        class726.method5297(-128, var155.field10491, 0, (String) null, var160, var155.method5289(-2068, true), var155.method5298(false, (byte) -3), var161, var163);
                                    }
                                } else {
                                    class726.method5297(-128, var155.field10491, 0, (String) null, var160, field6738[7] + var155.method5289(-2068, true), field6738[7] + var155.method5298(false, (byte) -3), var161, var163);
                                }
                            }
                        }
                        class662.field9567 = null;
                        return true;
                    }
                } else if (class662.field9567 == class235.field3548) {
                    boolean var164 = class430.field6332.method1455((byte) 62) == 1;
                    String var165 = class430.field6332.method1423(66);
                    String var166 = var165;
                    if (var164) {
                        var166 = class430.field6332.method1423(-9);
                    }
                    int var167 = class430.field6332.method1455((byte) 62);
                    boolean var168 = false;
                    if (var167 <= 1) {
                        if ((!class352.field5427 || class277.field4172) && !class428.field6294) {
                            if (var167 <= 1 && class777.method5623(-16476, var166)) {
                                var168 = true;
                            }
                        } else {
                            var168 = true;
                        }
                    }
                    if (!var168 && ~class37.field425 == -1) {
                        String var169 = class116.method1020(class685.method5023(class430.field6332, (byte) 124), 24347);
                        if (var167 != 2) {
                            if (var167 != 1) {
                                class726.method5297(-128, var165, 0, (String) null, -1, var165, var166, var169, 24);
                            } else {
                                class726.method5297(-127, var165, 0, (String) null, -1, field6738[6] + var165, field6738[6] + var166, var169, 24);
                            }
                        } else {
                            class726.method5297(-128, var165, 0, (String) null, -1, field6738[7] + var165, field6738[7] + var166, var169, 24);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class561.field8346) {
                    int var170 = class430.field6332.method1455((byte) 62);
                    if (class430.field6332.method1455((byte) 62) != 0) {
                        --class430.field6332.field2201;
                        class7.field74[var170] = new class244(class430.field6332);
                    } else {
                        class7.field74[var170] = new class244();
                    }
                    class662.field9567 = null;
                    class588.field8657 = class28.field349;
                    return true;
                } else if (class662.field9567 == class533.field7813) {
                    int var171 = class430.field6332.method1445((byte) 126);
                    int var172 = class430.field6332.method1455((byte) 62);
                    boolean var173 = ~(1 & var172) == -2;
                    while (~class476.field6930 < ~class430.field6332.field2201) {
                        int var174 = class430.field6332.method1425(127);
                        int var175 = class430.field6332.method1445((byte) 103);
                        int var176 = 0;
                        if (~var175 != -1) {
                            var176 = class430.field6332.method1455((byte) 62);
                            if (~var176 == -256) {
                                var176 = class430.field6332.method1453((byte) 84);
                            }
                        }
                        class43.method289(22804, var173, var175 - 1, var174, var176, var171);
                    }
                    class534.field7825[class291.method2359(31, class773.field11239++)] = var171;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class542.field8119) {
                    class212.field3246 = class476.field6930 <= 2 ? class309.field4873.method2616(false, class167.field2300) : class430.field6332.method1423(61);
                    class706.field10253 = class476.field6930 > 0 ? class430.field6332.method1445((byte) 111) : -1;
                    if (class706.field10253 == 65535) {
                        class706.field10253 = -1;
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class497.field7193) {
                    class757.field10993 = class430.field6332.method1426(-14788);
                    class561.field8347 = class430.field6332.method1426(-14788);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class592.field8691) {
                    int var177 = class430.field6332.method1444(-105);
                    String var178 = class430.field6332.method1423(-120);
                    class61.method445(8321);
                    class182.method1589(var177, (byte) -68, var178);
                    class662.field9567 = null;
                    return true;
                } else if (class678.field9842 == class662.field9567) {
                    class276.field4168.method5129(0);
                    class320.field5060 += 32;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class220.field3397) {
                    int var179 = class430.field6332.method1455((byte) 62);
                    int var180 = class430.field6332.method1400(65280);
                    class61.method445(8321);
                    class258.method2179(var179, var180, 7);
                    class662.field9567 = null;
                    return true;
                } else if (class777.field11281 == class662.field9567) {
                    class165.method1472(0, class430.field6332.method1423(-55));
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class165.field2278) {
                    int var181 = class430.field6332.method1453((byte) 97);
                    int var182 = class430.field6332.method1453((byte) 90);
                    class280 var183 = class610.method4508(class734.field10673, class279.field4190, (byte) 31);
                    var183.field4197.method1412(true, var182);
                    var183.field4197.method1412(true, var181);
                    class106.method934((byte) 53, var183);
                    class662.field9567 = null;
                    return true;
                } else if (class709.field10272 == class662.field9567) {
                    class430.field6332.field2201 += 28;
                    if (class430.field6332.method1438(-21917)) {
                        class67.method602(class430.field6332, class430.field6332.field2201 - 28, 88);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class76.field884 == class662.field9567) {
                    int var184 = class430.field6332.method1445((byte) 117);
                    int var185 = class430.field6332.method1429((byte) 54);
                    class61.method445(8321);
                    class324.method2742(var185, 5, var184);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class519.field7613) {
                    class255.method2158(class476.field6930, 0, class430.field6332);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class235.field3552) {
                    class383.field5797 = class430.field6332.method1434(-54) << 3;
                    class609.field8904 = class430.field6332.method1462(arg0) << 3;
                    class225.field3443 = class430.field6332.method1455((byte) 62);
                    for (class672 var186 = (class672) class29.field357.method971(347); var186 != null; var186 = (class672) class29.field357.method973(true)) {
                        int var187 = (int) (var186.field3177 >> 28 & 3L);
                        int var188 = (int) (16383L & var186.field3177);
                        int var189 = -class494.field7101 + var188;
                        int var190 = (int) (var186.field3177 >> 14 & 16383L);
                        int var191 = -class281.field4219 + var190;
                        if (class225.field3443 == var187 && ~class609.field8904 >= ~var189 && var189 < class609.field8904 + 8 && ~class383.field5797 >= ~var191 && class383.field5797 - -8 > var191) {
                            var186.method1824(1);
                            if (~var189 <= -1 && var191 >= 0 && var189 < class648.field9378 && var191 < class659.field9506) {
                                class437.method3346(var191, false, var189, class225.field3443);
                            }
                        }
                    }
                    for (class326 var192 = (class326) class115.field1368.method3863((byte) 64); var192 != null; var192 = (class326) class115.field1368.method3862(-353)) {
                        if (var192.field5136 >= class609.field8904 && class609.field8904 + 8 > var192.field5136 && class383.field5797 <= var192.field5148 && class383.field5797 + 8 > var192.field5148 && ~class225.field3443 == ~var192.field5140) {
                            var192.field5149 = true;
                        }
                    }
                    for (class326 var193 = (class326) class403.field6017.method3863((byte) 64); var193 != null; var193 = (class326) class403.field6017.method3862(-353)) {
                        if (~var193.field5136 <= ~class609.field8904 && var193.field5136 < class609.field8904 + 8 && var193.field5148 >= class383.field5797 && var193.field5148 < class383.field5797 - -8 && class225.field3443 == var193.field5140) {
                            var193.field5149 = true;
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class67.field720 == class662.field9567) {
                    class711.method5184(true, class535.field7834);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class474.field6878) {
                    if (!class212.method1866(4, class138.field1645)) {
                        class533.field7812 = class430.field6332.method1445((byte) 120) * 30;
                    } else {
                        class533.field7812 = (int) ((float) class430.field6332.method1445((byte) 105) * 2.5F);
                    }
                    class40.field473 = class28.field349;
                    class662.field9567 = null;
                    return true;
                } else if (class739.field10744 == class662.field9567) {
                    int var194 = class430.field6332.method1444(-127);
                    int var195 = class430.field6332.method1455((byte) 62);
                    class61.method445(8321);
                    class683.method5008(88, var194, true, var195);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class187.field2565) {
                    boolean var196 = ~class430.field6332.method1455((byte) 62) == -2;
                    String var197 = class430.field6332.method1423(61);
                    String var198 = var197;
                    if (var196) {
                        var198 = class430.field6332.method1423(112);
                    }
                    long var199 = class430.field6332.method1435(-126);
                    long var201 = (long) class430.field6332.method1445((byte) 125);
                    long var203 = (long) class430.field6332.method1436((byte) 81);
                    int var205 = class430.field6332.method1455((byte) 62);
                    long var206 = (var201 << 32) + var203;
                    boolean var208 = false;
                    int var209 = 0;
                    while (true) {
                        if (var209 >= 100) {
                            if (~var205 >= -2) {
                                if ((!class352.field5427 || class277.field4172) && !class428.field6294) {
                                    if (class777.method5623(-16476, var198)) {
                                        var208 = true;
                                    }
                                } else {
                                    var208 = true;
                                }
                            }
                            break;
                        }
                        if (~class689.field9983[var209] == ~var206) {
                            var208 = true;
                            break;
                        }
                        ++var209;
                    }
                    if (!var208 && class37.field425 == 0) {
                        class689.field9983[class23.field272] = var206;
                        class23.field272 = (class23.field272 + 1) % 100;
                        String var210 = class116.method1020(class685.method5023(class430.field6332, (byte) 124), 24347);
                        if (~var205 != -3 && var205 != 3) {
                            if (~var205 == -2) {
                                class726.method5297(-126, var197, 0, class779.method5632(var199, 37), -1, field6738[6] + var197, field6738[6] + var198, var210, 9);
                            } else {
                                class726.method5297(-127, var197, 0, class779.method5632(var199, 37), -1, var197, var198, var210, 9);
                            }
                        } else {
                            class726.method5297(-128, var197, 0, class779.method5632(var199, 37), -1, field6738[7] + var197, field6738[7] + var198, var210, 9);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class675.field9791 == class662.field9567) {
                    String var211 = class430.field6332.method1423(65);
                    String var212 = class116.method1020(class685.method5023(class430.field6332, (byte) 124), 24347);
                    class150.method1265(var211, var212, -1, var211, 0, 6, var211);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class440.field6485) {
                    int var213 = class430.field6332.method1444(-106);
                    int var214 = class430.field6332.method1453((byte) 119);
                    class61.method445(8321);
                    class154.method1287(var214, -9514, var213);
                    class662.field9567 = null;
                    return true;
                } else if (class690.field10018 == class662.field9567) {
                    int var215 = class430.field6332.method1449(103);
                    int var216 = class430.field6332.method1449(117);
                    class61.method445(8321);
                    class454 var217 = (class454) class661.field9563.method977((long) var216, 1);
                    class454 var218 = (class454) class661.field9563.method977((long) var215, 1);
                    if (var218 != null) {
                        class440.method3381(var218, 0, var217 == null || var217.field6640 != var218.field6640, false);
                    }
                    if (var217 != null) {
                        var217.method1824(1);
                        class661.field9563.method968((byte) -111, (long) var215, var217);
                    }
                    class541 var219 = method3513(var216, 115);
                    if (var219 != null) {
                        class115.method1013(true, var219);
                    }
                    class541 var220 = method3513(var215, 126);
                    if (var220 != null) {
                        class115.method1013(true, var220);
                        class656.method4813(var220, -35646576, true);
                    }
                    if (class742.field10801 != -1) {
                        class781.method5644(class742.field10801, 90, 1);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class506.field7326) {
                    String var221 = class430.field6332.method1423(-52);
                    int var222 = class430.field6332.method1429((byte) 56);
                    class61.method445(8321);
                    class492.method3719(var222, var221, 3);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class116.field1383) {
                    byte var223 = class430.field6332.method1447(!arg0);
                    int var224 = class430.field6332.method1426(-14788);
                    class61.method445(8321);
                    class790.method5704(13, var223, var224);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class370.field5642) {
                    class662.field9567 = null;
                    return false;
                } else if (class748.field10882 == class662.field9567) {
                    int var225 = class430.field6332.method1442(65280);
                    int var226 = class430.field6332.method1453((byte) 97);
                    int var227 = class430.field6332.method1451((byte) -123);
                    class61.method445(8321);
                    class582.method4352(var227, 102, var226, var225);
                    class662.field9567 = null;
                    return true;
                } else if (class682.field9877 == class662.field9567) {
                    byte var228 = class430.field6332.method1434(-110);
                    int var229 = class430.field6332.method1444(23);
                    class61.method445(8321);
                    class254.method2154(var228, var229, -6);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class473.field6866) {
                    int var230 = class430.field6332.method1429((byte) 34);
                    int var231 = class430.field6332.method1453((byte) 89);
                    int var232 = class430.field6332.method1444(126);
                    class61.method445(8321);
                    class6.method39(var232, 5, var230, var231, 4);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class580.field8600) {
                    int var233 = class430.field6332.method1429((byte) 52);
                    int var234 = class430.field6332.method1451((byte) 33);
                    class61.method445(8321);
                    class306.method2591(var233, var234, 5);
                    class662.field9567 = null;
                    return true;
                } else if (class712.field10318 == class662.field9567) {
                    int var235 = class430.field6332.method1455((byte) 62);
                    int var236 = var235 >> 5;
                    int var237 = 31 & var235;
                    if (~var237 == -1) {
                        class708.field10260[var236] = null;
                        class662.field9567 = null;
                        return true;
                    } else {
                        class352 var238 = new class352();
                        var238.field5432 = var237;
                        var238.field5438 = class430.field6332.method1455((byte) 62);
                        if (~var238.field5438 <= -1 && var238.field5438 < class715.field10345.length) {
                            if (var238.field5432 != 1 && ~var238.field5432 != -11) {
                                if (var238.field5432 >= 2 && var238.field5432 <= 6) {
                                    if (~var238.field5432 == -3) {
                                        var238.field5436 = 256;
                                        var238.field5430 = 256;
                                    }
                                    if (~var238.field5432 == -4) {
                                        var238.field5430 = 256;
                                        var238.field5436 = 0;
                                    }
                                    if (var238.field5432 == 4) {
                                        var238.field5436 = 512;
                                        var238.field5430 = 256;
                                    }
                                    if (~var238.field5432 == -6) {
                                        var238.field5436 = 256;
                                        var238.field5430 = 0;
                                    }
                                    if (var238.field5432 == 6) {
                                        var238.field5436 = 256;
                                        var238.field5430 = 512;
                                    }
                                    var238.field5432 = 2;
                                    var238.field5431 = class430.field6332.method1455((byte) 62);
                                    var238.field5436 += class430.field6332.method1445((byte) 109) - class494.field7101 << 9;
                                    var238.field5430 += class430.field6332.method1445((byte) 101) + -class281.field4219 << 9;
                                    var238.field5429 = class430.field6332.method1455((byte) 62) << 2;
                                    var238.field5437 = class430.field6332.method1445((byte) 101);
                                }
                            } else {
                                var238.field5435 = class430.field6332.method1445((byte) 124);
                                class430.field6332.field2201 += 6;
                            }
                            var238.field5434 = class430.field6332.method1445((byte) 127);
                            if (~var238.field5434 == -65536) {
                                var238.field5434 = -1;
                            }
                            class708.field10260[var236] = var238;
                        }
                        class662.field9567 = null;
                        return true;
                    }
                } else if (class662.field9567 == class288.field4279) {
                    class711.method5184(true, class349.field5393);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class562.field8350) {
                    class711.method5184(true, class530.field7770);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class415.field6103) {
                    class609.field8904 = class430.field6332.method1462(arg0) << 3;
                    class225.field3443 = class430.field6332.method1455((byte) 62);
                    class383.field5797 = class430.field6332.method1434(-55) << 3;
                    while (~class430.field6332.field2201 > ~class476.field6930) {
                        class713 var239 = class374.method3013(1)[class430.field6332.method1455((byte) 62)];
                        class711.method5184(true, var239);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class231.field3497) {
                    int var240 = class430.field6332.method1453((byte) 102);
                    int var241 = class430.field6332.method1432((byte) -86);
                    class276.field4168.method5127(var241, var240, false);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class405.field6040) {
                    int var242 = class430.field6332.method1455((byte) 62);
                    int var243 = class430.field6332.method1445((byte) 116);
                    class276.field4168.method5127(var243, var242, !arg0);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class146.field1800) {
                    class134.field1563 = class430.field6332.method1442(65280);
                    class40.field473 = class28.field349;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class176.field2456) {
                    class609.field8904 = class430.field6332.method1447(false) << 3;
                    class225.field3443 = class430.field6332.method1426(-14788);
                    class383.field5797 = class430.field6332.method1434(-67) << 3;
                    class662.field9567 = null;
                    return true;
                } else if (class727.field10542 == class662.field9567) {
                    class711.method5184(true, class494.field7098);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class198.field3053) {
                    class200.field3122 = class28.field349;
                    boolean var244 = class430.field6332.method1455((byte) 62) == 1;
                    if (class476.field6930 == 1) {
                        if (var244) {
                            class751.field10922 = null;
                        } else {
                            class89.field1009 = null;
                        }
                        class662.field9567 = null;
                        return true;
                    } else {
                        if (var244) {
                            class751.field10922 = new class514(class430.field6332);
                        } else {
                            class89.field1009 = new class514(class430.field6332);
                        }
                        class662.field9567 = null;
                        return true;
                    }
                } else if (class95.field1071 == class662.field9567) {
                    int var245 = class430.field6332.method1455((byte) 62);
                    boolean var246 = ~(1 & var245) == -2;
                    String var247 = class430.field6332.method1423(-20);
                    String var248 = class430.field6332.method1423(-111);
                    if (var248.equals("")) {
                        var248 = var247;
                    }
                    String var249 = class430.field6332.method1423(123);
                    String var250 = class430.field6332.method1423(92);
                    if (var250.equals("")) {
                        var250 = var249;
                    }
                    if (var246) {
                        for (int var251 = 0; ~class157.field1960 < ~var251; ++var251) {
                            if (class83.field927[var251].equals(var250)) {
                                class54.field598[var251] = var247;
                                class83.field927[var251] = var248;
                                class666.field9687[var251] = var249;
                                class298.field4705[var251] = var250;
                                break;
                            }
                        }
                    } else {
                        class54.field598[class157.field1960] = var247;
                        class83.field927[class157.field1960] = var248;
                        class666.field9687[class157.field1960] = var249;
                        class298.field4705[class157.field1960] = var250;
                        class502.field7253[class157.field1960] = ~class291.method2359(2, var245) == -3;
                        ++class157.field1960;
                    }
                    class117.field1392 = class28.field349;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class142.field1703) {
                    class220.method1920(0, class765.field11059);
                    class662.field9567 = null;
                    return false;
                } else if (class754.field10974 == class662.field9567) {
                    byte var252 = class430.field6332.method1414(1);
                    int var253 = class430.field6332.method1441(105);
                    class276.field4168.method5132(var253, (byte) -62, var252);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class279.field4191) {
                    class711.method5184(true, class104.field1208);
                    class662.field9567 = null;
                    return true;
                } else if (class94.field1058 == class662.field9567) {
                    class711.method5184(arg0, class661.field9560);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class45.field525) {
                    int var254 = class430.field6332.method1409(-118);
                    int var255 = class430.field6332.method1426(-14788);
                    int var256 = class430.field6332.method1441(32);
                    int var257 = class430.field6332.method1431(24);
                    int var258 = class430.field6332.method1431(-127);
                    class61.method445(8321);
                    class28.field345[var258] = true;
                    class646.field9356[var258] = var257;
                    class502.field7258[var258] = var255;
                    class140.field1661[var258] = var254;
                    class656.field9473[var258] = var256;
                    class662.field9567 = null;
                    return true;
                } else if (class717.field10377 == class662.field9567) {
                    class605.field8864 = class430.field6332.method1437((byte) 108);
                    class352.field5427 = class430.field6332.method1455((byte) 62) == 1;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class477.field6951) {
                    int var259 = class430.field6332.method1400(65280);
                    int var260 = var259 >> 28 & 3;
                    int var261 = var259 >> 14 & 16383;
                    int var262 = var259 & 16383;
                    int var263 = class430.field6332.method1409(-83);
                    int var264 = var263 >> 2;
                    int var265 = 3 & var263;
                    int var266 = class434.field6372[var264];
                    int var267 = class430.field6332.method1445((byte) 123);
                    int var268 = var262 - class281.field4219;
                    int var269 = var261 - class494.field7101;
                    if (var267 == 65535) {
                        var267 = -1;
                    }
                    class584.method4362(var266, var265, var260, var264, var269, (byte) 105, var268, var267);
                    class662.field9567 = null;
                    return true;
                } else if (class88.field996 == class662.field9567) {
                    boolean var270 = ~class430.field6332.method1455((byte) 62) == -2;
                    String var271 = class430.field6332.method1423(68);
                    String var272 = var271;
                    if (var270) {
                        var272 = class430.field6332.method1423(124);
                    }
                    long var273 = class430.field6332.method1435(-126);
                    long var275 = (long) class430.field6332.method1445((byte) 120);
                    long var277 = (long) class430.field6332.method1436((byte) 113);
                    int var279 = class430.field6332.method1455((byte) 62);
                    int var280 = class430.field6332.method1445((byte) 127);
                    long var281 = (var275 << 32) - -var277;
                    boolean var283 = false;
                    int var284 = 0;
                    while (true) {
                        if (var284 >= 100) {
                            if (var279 <= 1 && class777.method5623(-16476, var272)) {
                                var283 = true;
                            }
                            break;
                        }
                        if (~class689.field9983[var284] == ~var281) {
                            var283 = true;
                            break;
                        }
                        ++var284;
                    }
                    if (!var283 && class37.field425 == 0) {
                        class689.field9983[class23.field272] = var281;
                        class23.field272 = (class23.field272 + 1) % 100;
                        String var285 = class690.field10023.method4954(var280, 89).method276(class430.field6332, -106);
                        if (var279 != 2) {
                            if (~var279 == -2) {
                                class726.method5297(-128, var271, 0, class779.method5632(var273, 37), var280, field6738[6] + var271, field6738[6] + var272, var285, 20);
                            } else {
                                class726.method5297(-126, var271, 0, class779.method5632(var273, 37), var280, var271, var272, var285, 20);
                            }
                        } else {
                            class726.method5297(-127, var271, 0, class779.method5632(var273, 37), var280, field6738[7] + var271, field6738[7] + var272, var285, 20);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class740.field10749 == class662.field9567) {
                    int var286 = class430.field6332.method1429((byte) 118);
                    int var287 = class430.field6332.method1432((byte) -25);
                    if (~var287 == -65536) {
                        var287 = -1;
                    }
                    int var288 = class430.field6332.method1429((byte) 29);
                    class61.method445(8321);
                    class465.method3535(-20420, var287, var288, var286);
                    class530 var289 = class540.field7920.method5000(var287, (byte) 78);
                    class659.method4834(var288, var289.field7781, 8, var289.field7740, var289.field7774);
                    class645.method4749(var288, var289.field7721, var289.field7748, var289.field7738, 123);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class138.field1643) {
                    int var290 = class430.field6332.method1444(-110);
                    if (~var290 == -65536) {
                        var290 = -1;
                    }
                    int var291 = class430.field6332.method1400(65280);
                    class61.method445(8321);
                    class6.method39(var290, 2, var291, -1, 4);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class144.field1751) {
                    int var292 = class430.field6332.method1445((byte) 103);
                    int var293 = class430.field6332.method1445((byte) 121);
                    int var294 = class430.field6332.method1445((byte) 120);
                    class61.method445(8321);
                    if (class683.field9897[var292] != null) {
                        for (int var295 = var293; var294 > var295; ++var295) {
                            int var296 = class430.field6332.method1436((byte) 69);
                            if (~var295 > ~class683.field9897[var292].length && class683.field9897[var292][var295] != null) {
                                class683.field9897[var292][var295].field8009 = var296;
                            }
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class737.field10731 == class662.field9567) {
                    class647.field9363 = ~class430.field6332.method1431(-91) == -2;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class640.field9294) {
                    int var297 = class430.field6332.method1445((byte) 105);
                    if (~var297 == -65536) {
                        var297 = -1;
                    }
                    int var298 = class430.field6332.method1455((byte) 62);
                    int var299 = class430.field6332.method1445((byte) 117);
                    int var300 = class430.field6332.method1455((byte) 62);
                    int var301 = class430.field6332.method1445((byte) 119);
                    class603.method4474(var300, var299, var297, var301, (byte) -115, var298, false);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class565.field8389) {
                    class200.field3122 = class28.field349;
                    boolean var302 = ~class430.field6332.method1455((byte) 62) == -2;
                    class295 var303 = new class295(class430.field6332);
                    class514 var304;
                    if (!var302) {
                        var304 = class89.field1009;
                    } else {
                        var304 = class751.field10922;
                    }
                    var303.method2412(var304, 123);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class391.field5885) {
                    int var305 = class430.field6332.method1445((byte) 103);
                    class61.method445(8321);
                    class744.method5423(63, var305);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class104.field1211) {
                    class66.method565(8);
                    class662.field9567 = null;
                    return false;
                } else if (class672.field9754 == class662.field9567) {
                    int var306 = class430.field6332.method1426(-14788);
                    int var307 = class430.field6332.method1441(67);
                    if (var307 == 65535) {
                        var307 = -1;
                    }
                    String var308 = class430.field6332.method1423(-65);
                    int var309 = class430.field6332.method1426(-14788);
                    if (var309 >= 1 && ~var309 >= -9) {
                        if (var308.equalsIgnoreCase(field6738[2])) {
                            var308 = null;
                        }
                        class172.field2384[var309 + -1] = var308;
                        class151.field1869[var309 + -1] = var307;
                        class196.field2631[var309 + -1] = var306 == 0;
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class311.field4934) {
                    class10.field114 = class773.method5601(class430.field6332.method1455((byte) 62), 65);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class239.field3621) {
                    class220.method1920(0, false);
                    class662.field9567 = null;
                    return false;
                } else if (class662.field9567 == class560.field8340) {
                    class788.method5701(class476.field6930, class430.field6332, -9, class580.field8601);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class131.field1530) {
                    int var310 = class430.field6332.method1426(-14788);
                    int var311 = class430.field6332.method1426(-14788);
                    if (~var311 == -256) {
                        var310 = -1;
                        var311 = -1;
                    }
                    class342.method2841(var310, 97, var311);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class478.field6956) {
                    class711.method5184(true, class757.field10991);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class555.field8286) {
                    class61.method445(8321);
                    class324.method2745((byte) 78);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class199.field3117) {
                    class711.method5184(arg0, class387.field5840);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class324.field5116) {
                    class711.method5184(true, class47.field540);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class369.field5633) {
                    boolean var312 = ~class430.field6332.method1455((byte) 62) == -2;
                    byte[] var313 = new byte[class476.field6930 + -1];
                    class430.field6332.method1413(var313, -16385, class476.field6930 + -1, 0);
                    client.method2668(114, var313, var312);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class516.field7458) {
                    String var314 = class430.field6332.method1423(-98);
                    Object[] var315 = new Object[1 + var314.length()];
                    for (int var316 = var314.length() - 1; var316 >= 0; --var316) {
                        if (~var314.charAt(var316) == -116) {
                            var315[var316 - -1] = class430.field6332.method1423(-126);
                        } else {
                            var315[var316 + 1] = new Integer(class430.field6332.method1453((byte) 80));
                        }
                    }
                    var315[0] = new Integer(class430.field6332.method1453((byte) 91));
                    class61.method445(8321);
                    class86 var317 = new class86();
                    var317.field957 = var315;
                    class782.method5663(var317);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class593.field8710) {
                    int var318 = class430.field6332.method1429((byte) 127);
                    int var319 = class430.field6332.method1444(-126);
                    class61.method445(8321);
                    class324.method2741(var318, var319, -112);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class166.field2287) {
                    String var320 = class430.field6332.method1423(-36);
                    boolean var321 = class430.field6332.method1455((byte) 62) == 1;
                    String var322;
                    if (!var321) {
                        var322 = var320;
                    } else {
                        var322 = class430.field6332.method1423(78);
                    }
                    int var323 = class430.field6332.method1445((byte) 112);
                    byte var324 = class430.field6332.method1414(1);
                    boolean var325 = false;
                    if (var324 == -128) {
                        var325 = true;
                    }
                    if (!var325) {
                        String var326 = class430.field6332.method1423(-65);
                        class241 var327 = new class241();
                        var327.field3639 = var322;
                        var327.field3641 = var320;
                        var327.field3644 = class727.method5306((byte) -116, var327.field3639);
                        var327.field3643 = var326;
                        var327.field3640 = var323;
                        var327.field3645 = var324;
                        int var328;
                        for (var328 = class173.field2407 + -1; ~var328 <= -1; --var328) {
                            int var329 = class186.field2563[var328].field3644.compareTo(var327.field3644);
                            if (~var329 == -1) {
                                class186.field2563[var328].field3640 = var323;
                                class186.field2563[var328].field3645 = var324;
                                class186.field2563[var328].field3643 = var326;
                                if (var322.equals(class225.field3446.field10506)) {
                                    class391.field5890 = var324;
                                }
                                class662.field9567 = null;
                                class584.field8622 = class28.field349;
                                return true;
                            }
                            if (var329 < 0) {
                                break;
                            }
                        }
                        if (~class173.field2407 <= ~class186.field2563.length) {
                            class662.field9567 = null;
                            return true;
                        }
                        for (int var330 = class173.field2407 + -1; ~var330 < ~var328; --var330) {
                            class186.field2563[var330 + 1] = class186.field2563[var330];
                        }
                        if (class173.field2407 == 0) {
                            class186.field2563 = new class241[100];
                        }
                        class186.field2563[var328 - -1] = var327;
                        ++class173.field2407;
                        if (var322.equals(class225.field3446.field10506)) {
                            class391.field5890 = var324;
                        }
                    } else {
                        if (~class173.field2407 == -1) {
                            class662.field9567 = null;
                            return true;
                        }
                        boolean var331 = false;
                        int var332;
                        for (var332 = 0; ~class173.field2407 < ~var332 && (!class186.field2563[var332].field3639.equals(var322) || var323 != class186.field2563[var332].field3640); ++var332) {
                        }
                        if (class173.field2407 > var332) {
                            while (~(class173.field2407 + -1) < ~var332) {
                                class186.field2563[var332] = class186.field2563[var332 + 1];
                                ++var332;
                            }
                            --class173.field2407;
                            class186.field2563[class173.field2407] = null;
                        }
                    }
                    class584.field8622 = class28.field349;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class520.field7620) {
                    int var333 = class430.field6332.method1441(95);
                    int var334 = class430.field6332.method1429((byte) 38);
                    class61.method445(8321);
                    class254.method2154(var334, var333, -6);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class447.field6577) {
                    class681.field9869 = class28.field349;
                    boolean var335 = class430.field6332.method1455((byte) 62) == 1;
                    if (class476.field6930 == 1) {
                        class662.field9567 = null;
                        if (!var335) {
                            class66.field684 = null;
                        } else {
                            class638.field9268 = null;
                        }
                        return true;
                    } else {
                        if (!var335) {
                            class66.field684 = new class705(class430.field6332);
                        } else {
                            class638.field9268 = new class705(class430.field6332);
                        }
                        class662.field9567 = null;
                        return true;
                    }
                } else if (class662.field9567 == class129.field1520) {
                    class711.method5184(arg0, class108.field1258);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class655.field9458) {
                    class61.method445(8321);
                    class199.method1782(0);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class168.field2308) {
                    class711.method5184(true, class458.field6663);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class65.field674) {
                    if (class2.field14 != null) {
                        class178.method1563(false, -113, -1, -1, class289.field4305.field829.method5551(false));
                    }
                    byte[] var336 = new byte[class476.field6930];
                    class430.field6332.method159(class476.field6930, 0, var336, 29235);
                    String var337 = class209.method1842((byte) -74, var336, 0, class476.field6930);
                    String var338 = field6738[4];
                    if (!class296.field4464 || ~class38.method253(var337, class580.field8601, 1, 1, var338).field503 == -3) {
                        class140.method1200(var337, true, var338, !arg0, class580.field8601, class289.field4305.field812.method1610(false) == 1);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class627.field9184) {
                    class585.method4367((byte) -28);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class134.field1564) {
                    for (int var339 = 0; ~class197.field2685.length < ~var339; ++var339) {
                        if (class197.field2685[var339] != null) {
                            class197.field2685[var339].field3841 = null;
                            class197.field2685[var339].field3814 = -1;
                        }
                    }
                    for (int var340 = 0; ~class750.field10912 < ~var340; ++var340) {
                        class753.field10966[var340].field5799.field3841 = null;
                        class753.field10966[var340].field5799.field3814 = -1;
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class516.field7460) {
                    int var341 = class430.field6332.method1455((byte) 62);
                    int var342 = class430.field6332.method1409(-87);
                    int var343 = class430.field6332.method1409(-115);
                    int var344 = class430.field6332.method1441(42) << 2;
                    int var345 = class430.field6332.method1431(-122);
                    class61.method445(8321);
                    class158.method1324((byte) 89, var342, var344, var343, var341, var345);
                    class662.field9567 = null;
                    return true;
                } else if (class90.field1035 == class662.field9567) {
                    int var346 = class430.field6332.method1444(-115);
                    if (var346 == 65535) {
                        var346 = -1;
                    }
                    int var347 = class430.field6332.method1444(-100);
                    if (~var347 == -65536) {
                        var347 = -1;
                    }
                    int var348 = class430.field6332.method1400(65280);
                    int var349 = class430.field6332.method1429((byte) 101);
                    class61.method445(8321);
                    for (int var350 = var347; var350 <= var346; ++var350) {
                        long var351 = (long) var350 + ((long) var348 << 32);
                        class469 var353 = (class469) class704.field10226.method977(var351, 1);
                        class469 var354;
                        if (var353 == null) {
                            if (var350 != -1) {
                                var354 = new class469(var349, -1);
                            } else {
                                var354 = new class469(var349, method3513(var348, 117).field8046.field6817);
                            }
                        } else {
                            var354 = new class469(var349, var353.field6817);
                            var353.method1824(1);
                        }
                        class704.field10226.method968((byte) -111, var351, var354);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class16.field189) {
                    int var355 = class430.field6332.method1426(-14788);
                    int var356 = class430.field6332.method1441(56);
                    if (var356 == 65535) {
                        var356 = -1;
                    }
                    int var357 = class430.field6332.method1409(-125);
                    class139.method1189(var356, var355, 5992, var357);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class36.field408) {
                    int var358 = class430.field6332.method1426(-14788);
                    int var359 = class430.field6332.method1458((byte) -121);
                    int var360 = class430.field6332.method1445((byte) 114);
                    if (~var360 == -65536) {
                        var360 = -1;
                    }
                    class50.method382((byte) 51, var360, var359, var358);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class225.field3445) {
                    int var361 = class430.field6332.method1444(-109);
                    class61.method445(8321);
                    class570.method4260(var361, -28942);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class212.field3245) {
                    boolean var362 = class430.field6332.method1455((byte) 62) == 1;
                    String var363 = class430.field6332.method1423(102);
                    long var364 = (long) class430.field6332.method1445((byte) 104);
                    long var366 = (long) class430.field6332.method1436((byte) 98);
                    int var368 = class430.field6332.method1455((byte) 62);
                    long var369 = (var364 << 32) + var366;
                    boolean var371 = false;
                    Object var372 = null;
                    class705 var373 = var362 ? class638.field9268 : class66.field684;
                    if (var373 == null) {
                        var371 = true;
                    } else {
                        label2487: {
                            for (int var374 = 0; ~var374 > -101; ++var374) {
                                if (~class689.field9983[var374] == ~var369) {
                                    var371 = true;
                                    break label2487;
                                }
                            }
                            if (var368 <= 1) {
                                if ((!class352.field5427 || class277.field4172) && !class428.field6294) {
                                    if (class777.method5623(-16476, var363)) {
                                        var371 = true;
                                    }
                                } else {
                                    var371 = true;
                                }
                            }
                        }
                    }
                    if (!var371 && ~class37.field425 == -1) {
                        class689.field9983[class23.field272] = var369;
                        class23.field272 = (class23.field272 - -1) % 100;
                        String var375 = class116.method1020(class685.method5023(class430.field6332, (byte) 124), 24347);
                        int var376 = var362 ? 41 : 44;
                        if (~var368 != -3 && var368 != 3) {
                            if (~var368 != -2) {
                                class726.method5297(-127, var363, 0, var373.field10238, -1, var363, var363, var375, var376);
                            } else {
                                class726.method5297(-128, var363, 0, var373.field10238, -1, field6738[6] + var363, field6738[6] + var363, var375, var376);
                            }
                        } else {
                            class726.method5297(-128, var363, 0, var373.field10238, -1, field6738[7] + var363, field6738[7] + var363, var375, var376);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class265.field4053) {
                    int var377 = class430.field6332.method1429((byte) 54);
                    class61.method445(8321);
                    class662.field9567 = null;
                    if (var377 != -1) {
                        int var378 = (268432427 & var377) >> 14;
                        int var379 = var378 - class494.field7101;
                        int var380 = var377 & 16383;
                        int var381 = var380 - class281.field4219;
                        if (var379 < 0) {
                            var379 = 0;
                        } else if (~var379 <= ~class648.field9378) {
                            var379 = class648.field9378;
                        }
                        if (~var381 > -1) {
                            var381 = 0;
                        } else if (var381 >= class659.field9506) {
                            var381 = class659.field9506;
                        }
                        class730.field10605 = (var379 << 9) + 256;
                        class238.field3617 = (var381 << 9) + 256;
                    } else {
                        class238.field3617 = -1;
                        class730.field10605 = -1;
                    }
                    return true;
                } else if (class662.field9567 == class594.field8716) {
                    int var382 = class430.field6332.method1445((byte) 112);
                    int var383 = class430.field6332.method1455((byte) 62);
                    boolean var384 = (var383 & 1) == 1;
                    class659.method4831(var382, var384, 1);
                    int var385 = class430.field6332.method1445((byte) 101);
                    for (int var386 = 0; var385 > var386; ++var386) {
                        int var387 = class430.field6332.method1444(-107);
                        int var388 = class430.field6332.method1409(-119);
                        if (~var388 == -256) {
                            var388 = class430.field6332.method1400(65280);
                        }
                        class43.method289(22804, var384, var387 + -1, var386, var388, var382);
                    }
                    class534.field7825[class291.method2359(class773.field11239++, 31)] = var382;
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class627.field9187) {
                    class584.field8622 = class28.field349;
                    if (class476.field6930 == 0) {
                        class173.field2407 = 0;
                        class662.field9567 = null;
                        class16.field198 = null;
                        class186.field2563 = null;
                        client.field5013 = null;
                        return true;
                    } else {
                        client.field5013 = class430.field6332.method1423(79);
                        boolean var389 = class430.field6332.method1455((byte) 62) == 1;
                        if (var389) {
                            class430.field6332.method1423(-83);
                        }
                        long var390 = class430.field6332.method1435(14);
                        class16.field198 = class762.method5520(false, var390);
                        class68.field732 = class430.field6332.method1414(1);
                        int var392 = class430.field6332.method1455((byte) 62);
                        if (~var392 == -256) {
                            class662.field9567 = null;
                            return true;
                        } else {
                            class173.field2407 = var392;
                            class241[] var393 = new class241[100];
                            for (int var394 = 0; ~var394 > ~class173.field2407; ++var394) {
                                var393[var394] = new class241();
                                var393[var394].field3641 = class430.field6332.method1423(-81);
                                boolean var395 = ~class430.field6332.method1455((byte) 62) == -2;
                                if (var395) {
                                    var393[var394].field3639 = class430.field6332.method1423(-71);
                                } else {
                                    var393[var394].field3639 = var393[var394].field3641;
                                }
                                var393[var394].field3644 = class727.method5306((byte) -83, var393[var394].field3639);
                                var393[var394].field3640 = class430.field6332.method1445((byte) 109);
                                var393[var394].field3645 = class430.field6332.method1414(1);
                                var393[var394].field3643 = class430.field6332.method1423(72);
                                if (var393[var394].field3639.equals(class225.field3446.field10506)) {
                                    class391.field5890 = var393[var394].field3645;
                                }
                            }
                            boolean var396 = false;
                            int var397 = class173.field2407;
                            while (~var397 < -1) {
                                boolean var398 = true;
                                --var397;
                                for (int var399 = 0; ~var397 < ~var399; ++var399) {
                                    if (~var393[var399].field3644.compareTo(var393[var399 + 1].field3644) < -1) {
                                        class241 var400 = var393[var399];
                                        var393[var399] = var393[var399 + 1];
                                        var393[var399 - -1] = var400;
                                        var398 = false;
                                    }
                                }
                                if (var398) {
                                    break;
                                }
                            }
                            class186.field2563 = var393;
                            class662.field9567 = null;
                            return true;
                        }
                    }
                } else if (class741.field10762 == class662.field9567) {
                    int var401 = class430.field6332.method1432((byte) -35);
                    int var402 = class430.field6332.method1449(104);
                    int var403 = class430.field6332.method1431(87);
                    class61.method445(8321);
                    class454 var404 = (class454) class661.field9563.method977((long) var402, 1);
                    if (var404 != null) {
                        class440.method3381(var404, 0, var404.field6640 != var401, false);
                    }
                    class127.method1109(arg0, var403, var401, var402, false);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class278.field4179) {
                    boolean var405 = ~class430.field6332.method1455((byte) 62) == -2;
                    String var406 = class430.field6332.method1423(-27);
                    String var407 = var406;
                    if (var405) {
                        var407 = class430.field6332.method1423(-43);
                    }
                    long var408 = (long) class430.field6332.method1445((byte) 101);
                    long var410 = (long) class430.field6332.method1436((byte) 60);
                    int var412 = class430.field6332.method1455((byte) 62);
                    int var413 = class430.field6332.method1445((byte) 122);
                    long var414 = (var408 << 32) + var410;
                    boolean var416 = false;
                    int var417 = 0;
                    while (true) {
                        if (var417 >= 100) {
                            if (~var412 >= -2 && class777.method5623(-16476, var407)) {
                                var416 = true;
                            }
                            break;
                        }
                        if (class689.field9983[var417] == var414) {
                            var416 = true;
                            break;
                        }
                        ++var417;
                    }
                    if (!var416 && ~class37.field425 == -1) {
                        class689.field9983[class23.field272] = var414;
                        class23.field272 = (class23.field272 + 1) % 100;
                        String var418 = class690.field10023.method4954(var413, 95).method276(class430.field6332, -95);
                        if (var412 == 2) {
                            class726.method5297(-126, var406, 0, (String) null, var413, field6738[7] + var406, field6738[7] + var407, var418, 18);
                        } else if (var412 == 1) {
                            class726.method5297(-128, var406, 0, (String) null, var413, field6738[6] + var406, field6738[6] + var407, var418, 18);
                        } else {
                            class726.method5297(-126, var406, 0, (String) null, var413, var406, var407, var418, 18);
                        }
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class48.field544) {
                    class662.field9567 = null;
                    class117.field1392 = class28.field349;
                    class606.field8878 = 1;
                    return true;
                } else if (class662.field9567 == class65.field672) {
                    int[] var419 = new int[4];
                    for (int var420 = 0; ~var420 > -5; ++var420) {
                        var419[var420] = class430.field6332.method1432((byte) -113);
                    }
                    int var421 = class430.field6332.method1441(106);
                    int var422 = class430.field6332.method1455((byte) 62);
                    class383 var423 = (class383) class207.field3184.method977((long) var421, 1);
                    if (var423 != null) {
                        class606.method4489(var423.field5799, !arg0, var422, var419);
                    }
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class515.field7443) {
                    int var424 = class430.field6332.method1445((byte) 116);
                    if (~var424 == -65536) {
                        var424 = -1;
                    }
                    int var425 = class430.field6332.method1400(65280);
                    class61.method445(8321);
                    class6.method39(var424, 1, var425, -1, 4);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class653.field9427) {
                    class711.method5184(true, class244.field3746);
                    class662.field9567 = null;
                    return true;
                } else if (class662.field9567 == class447.field6564) {
                    class711.method5184(true, class417.field6156);
                    class662.field9567 = null;
                    return true;
                } else {
                    if (!arg0) {
                        field6733 = -6;
                    }
                    if (class662.field9567 != class251.field3889) {
                        if (class662.field9567 == class26.field310) {
                            boolean var429 = class430.field6332.method1409(-100) == 1;
                            class61.method445(8321);
                            class662.field9567 = null;
                            class365.field5588 = var429;
                            return true;
                        } else if (class662.field9567 == class586.field8629) {
                            int var430 = class430.field6332.method1432((byte) -40);
                            int var431 = class430.field6332.method1444(57);
                            int var432 = class430.field6332.method1453((byte) 84);
                            int var433 = class430.field6332.method1432((byte) -110);
                            class61.method445(8321);
                            class659.method4834(var432, var431, 8, var433, var430);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class304.field4755) {
                            int var434 = class430.field6332.method1409(-88);
                            int var435 = class430.field6332.method1432((byte) -126) << 2;
                            int var436 = class430.field6332.method1426(-14788);
                            int var437 = class430.field6332.method1409(-81);
                            int var438 = class430.field6332.method1455((byte) 62);
                            class61.method445(8321);
                            class506.method3815(true, var434, var436, var437, var435, 32252, var438);
                            class662.field9567 = null;
                            return true;
                        } else if (class732.field10626 == class662.field9567) {
                            class681.field9869 = class28.field349;
                            boolean var439 = class430.field6332.method1455((byte) 62) == 1;
                            class318 var440 = new class318(class430.field6332);
                            class705 var441;
                            if (var439) {
                                var441 = class638.field9268;
                            } else {
                                var441 = class66.field684;
                            }
                            var440.method2692(4, var441);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class440.field6487) {
                            int var442 = class430.field6332.method1429((byte) 35);
                            int var443 = class430.field6332.method1426(-14788);
                            int var444 = class430.field6332.method1426(-14788);
                            class245.field3751[var444] = var442;
                            class69.field746[var444] = var443;
                            class318.field5039[var444] = 1;
                            int var445 = class140.field1664[var444] - 1;
                            for (int var446 = 0; var446 < var445; ++var446) {
                                if (~var442 <= ~class104.field1206[var446]) {
                                    class318.field5039[var444] = var446 + 2;
                                }
                            }
                            class151.field1864[class291.method2359(31, class555.field8280++)] = var444;
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class426.field6283) {
                            int var447 = class430.field6332.method1441(108);
                            int var448 = class430.field6332.method1444(-124);
                            int var449 = class430.field6332.method1453((byte) 125);
                            class61.method445(8321);
                            class790.method5706(var449, 13, (var447 << 16) + var448);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class512.field7363) {
                            if (class2.field14 != null) {
                                class178.method1563(false, 45, -1, -1, class289.field4305.field829.method5551(false));
                            }
                            byte[] var450 = new byte[class476.field6930];
                            class430.field6332.method159(class476.field6930, 0, var450, 29235);
                            String var451 = class209.method1842((byte) -64, var450, 0, class476.field6930);
                            class771.method5584((byte) -114, var451, class580.field8601, class289.field4305.field812.method1610(false) == 1, true);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class216.field3298) {
                            int var452 = class430.field6332.method1445((byte) 127);
                            int var453 = class430.field6332.method1445((byte) 112);
                            class61.method445(8321);
                            class447.method3435(3, var452, var453, 0);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class414.field6093) {
                            int var454 = class430.field6332.method1445((byte) 125);
                            if (~var454 == -65536) {
                                var454 = -1;
                            }
                            int var455 = class430.field6332.method1455((byte) 62);
                            int var456 = class430.field6332.method1445((byte) 111);
                            int var457 = class430.field6332.method1455((byte) 62);
                            class603.method4474(var457, var456, var454, 256, (byte) -110, var455, true);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class411.field6068) {
                            class711.method5184(arg0, class745.field10834);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class490.field7032) {
                            int var458 = class430.field6332.method1449(-90);
                            class61.method445(8321);
                            class6.method39(-1, 3, var458, -1, 4);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class447.field6568) {
                            class246.field3756 = class430.field6332.method1455((byte) 62);
                            class662.field9567 = null;
                            class40.field473 = class28.field349;
                            return true;
                        } else if (class662.field9567 == class269.field4101) {
                            int var459 = class430.field6332.method1453((byte) 126);
                            class334.field5227 = class580.field8601.method211(var459, 104);
                            class662.field9567 = null;
                            return true;
                        } else if (class662.field9567 == class603.field8841) {
                            int var460 = class430.field6332.method1400(65280);
                            if (~class458.field6672 != ~var460) {
                                class458.field6672 = var460;
                                class782.method5652(class296.field4535, -1, -1);
                            }
                            class662.field9567 = null;
                            return true;
                        } else {
                            class618.method4603((byte) -115, field6738[11] + (class662.field9567 != null ? class662.field9567.method4278(-126) : -1) + "," + (class6.field68 != null ? class6.field68.method4278(-110) : -1) + "," + (class70.field750 != null ? class70.field750.method4278(-117) : -1) + field6738[5] + class476.field6930, (Throwable) null);
                            class220.method1920(0, false);
                            return true;
                        }
                    } else {
                        int var426 = class430.field6332.method1444(63);
                        int var427 = class430.field6332.method1409(-99);
                        class61.method445(8321);
                        if (var427 == 2) {
                            class781.method5645(116);
                        }
                        class742.field10801 = var426;
                        class737.method5379((byte) 117, var426);
                        class580.method4335((byte) -89, false);
                        class782.method5666(class742.field10801);
                        for (int var428 = 0; var428 < 100; ++var428) {
                            class26.field321[var428] = true;
                        }
                        class662.field9567 = null;
                        return true;
                    }
                }
            }
        } catch (RuntimeException var462) {
            throw class759.method5498(var462, field6738[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V", line = 3739)
    public class461() {
        super(1, false);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)[[I", line = 3538)
    public final int[][] method234(int arg0, int arg1) {
        try {
            ++field6735;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (arg1 >= -38) {
                field6733 = -99;
            }
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class343.field5332 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (var12 >= this.field6729) {
                        if (var12 <= this.field6736) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field6736;
                        }
                    } else {
                        var8[var11] = this.field6729;
                    }
                    if (~this.field6729 < ~var13) {
                        var9[var11] = this.field6729;
                    } else if (this.field6736 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field6736;
                    }
                    if (~this.field6729 < ~var14) {
                        var10[var11] = this.field6729;
                    } else if (var14 > this.field6736) {
                        var10[var11] = this.field6736;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field6738[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I[Ljava/lang/String;[I)V", line = 3617)
    public static final void method3511(int arg0, String[] arg1, int[] arg2) {
        try {
            if (arg0 != -17211) {
                method3513(-120, -37);
            }
            class657.method4822(arg1, arg1.length + -1, arg2, -23391, 0);
            ++field6730;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6738[12] + arg0 + ',' + (arg1 != null ? field6738[3] : field6738[2]) + ',' + (arg2 != null ? field6738[3] : field6738[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)Lgaa;", line = 3628)
    public static final class313 method3512(int arg0) {
        try {
            ++field6731;
            class313 var1 = (class313) class313.field4963.method4068(false);
            if (var1 != null) {
                var1.method1824(arg0 + 1);
                var1.method362((byte) 72);
                return var1;
            } else if (arg0 != 0) {
                return null;
            } else {
                class313 var2;
                do {
                    var2 = (class313) class251.field3894.method4068(false);
                    if (var2 == null) {
                        return null;
                    }
                    if (~var2.method2640((byte) -103) < ~class430.method3299(arg0 + 120)) {
                        return null;
                    }
                    var2.method1824(arg0 ^ 1);
                    var2.method362((byte) 72);
                } while (~(var2.field533 & Long.MIN_VALUE) == -1L);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6738[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)[I", line = 3669)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field6727;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int[] var4 = this.method1856(0, arg1, 114);
                for (int var5 = 0; ~var5 > ~class343.field5332; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field6729) {
                        var3[var5] = this.field6729;
                    } else if (var6 > this.field6736) {
                        var3[var5] = this.field6736;
                    } else {
                        var3[var5] = var6;
                    }
                }
            }
            if (arg0 != 8217) {
                this.method234(37, -14);
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6738[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(II)Lcn;", line = 3713)
    public static final class541 method3513(int arg0, int arg1) {
        try {
            ++field6734;
            if (arg1 < 108) {
                method3511(112, (String[]) null, (int[]) null);
            }
            int var2 = arg0 >> 16;
            int var3 = arg0 & 65535;
            if (class683.field9897[var2] == null || class683.field9897[var2][var3] == null) {
                boolean var4 = class334.method2801(var2, 0);
                if (!var4) {
                    return null;
                }
            }
            return class683.field9897[var2][var3];
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6738[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BILib;)V", line = 3746)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field6732;
            if (arg0 > 67) {
                if (~arg1 != -1) {
                    if (~arg1 != -2) {
                        if (~arg1 == -3) {
                            super.field3235 = arg2.method1455((byte) 62) == 1;
                        }
                    } else {
                        this.field6736 = arg2.method1445((byte) 121);
                    }
                } else {
                    this.field6729 = arg2.method1445((byte) 108);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6738[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6738[3] : field6738[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!io", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3514(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 120);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!io", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3515(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
